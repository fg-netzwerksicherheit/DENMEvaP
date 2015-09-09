/*  
 *  Copyright (C) 2015, Frankfurt University of Applied Sciences
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
 *  or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with this program;
 *  if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 *
 *  Linking this library statically or dynamically with other modules is making a combined work based on this library.
 *  Thus, the terms and conditions of the GNU General Public License cover the whole combination.
 *
 *  As a special exception, the copyright holders of this library give you permission to link this library with
 *  independent modules to produce an executable, regardless of the license terms of these independent modules,
 *  and to copy and distribute the resulting executable under terms of your choice, provided that you also meet,
 *  for each linked independent module, the terms and conditions of the license of that module. An independent module
 *  is a module which is not derived from or based on this library. If you modify this library, you may extend
 *  this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so,
 *  delete this exception statement from your version.
 * 
 *
 *
 *  In addition, this software is also licensed under the terms of the Eclipse Public License 
 *  (EPL) 1.0. You can find a copy of the EPL at: 
 *  http://opensource.org/licenses/eclipse-1.0.php
 */

package jEsperToolkit.test.fixed_rate.flat.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import jEsperToolkit.EsperRuntimeFacade;
import jEsperToolkit.test.api.TestEventSender;
import jEsperToolkit.test.api.TestWithFixedEventSendRate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import clj_net_pcap.CljNetPcapJavaAdapter;
import clj_net_pcap.PacketHeaderDataBean;

/**
 * 
 * @author Ruediger Gad
 * 
 */
public class DnsFilterFixedRateTests extends TestWithFixedEventSendRate {

	private int currentIndex;
	private long sentEventsCount;

	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		super.setup();
		
		currentIndex = 0;
		
		long start = System.currentTimeMillis();
		List<PacketHeaderDataBean> data = CljNetPcapJavaAdapter.extractBeansFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/200604101400_split2_00001_20060410070145");
//		List<PacketHeaderDataBean> data = CljNetPcapJavaAdapter.extractBeansFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/combined_office_22-04-2013.pcap");
		long stop = System.currentTimeMillis();
		System.out.println(((stop - start)/1000.0) + " " + data.size());
		
        for (int i = 0; i < 1; i++) {
            events.addAll(data);
        }
        
        erf.addEventType("sniffer.header.parsed.flat", PacketHeaderDataBean.class);
        
        erf.createStatement("INSERT INTO cep.dns SELECT * FROM sniffer.header.parsed.flat WHERE udpSrc = 53 or udpDst = 53");
        
        setCountedEventTypes("sniffer.header.parsed.flat", "cep.dns");

		setEventSender(new TestEventSender() {
			@Override
			public void sendEvents(EsperRuntimeFacade erf) {
				synchronized (this) {
					erf.send(events.get(currentIndex));
					sentEventsCount++;
					currentIndex++;
					if (currentIndex >= events.size()) {
						currentIndex = 0;
					}
				}
			}
		});
	}

	@Test
	public void testFixedRateRun() throws InterruptedException {
		assertEquals(0, getSuccessfullyProcessedEventsCount("sniffer.header.parsed.flat"));
		sendEventsWithRate(1000);
		Thread.sleep(250);
		stopSendingEvents();

		assertTrue(getSuccessfullyProcessedEventsCount("sniffer.header.parsed.flat") > 10);
	}

	/*
	 * Ugly hack to get some preliminary benchmark running.
	 */
	public static void main(String args[]) throws UnsupportedEncodingException,
			FileNotFoundException {
		if (args.length != 2) {
			System.out
					.println("You need to provide a rate in events per second and a duration in milliseconds.");
			return;
		}

		int rate = Integer.parseInt(args[0]);
		int duration = Integer.parseInt(args[1]);

		DnsFilterFixedRateTests test = new DnsFilterFixedRateTests();

		printFifo("Setting things up...");
		test.setup();

		printFifo("send_start");
		test.sendEventsWithRate(rate);

		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		test.stopSendingEvents();
		printEventStats(test);
	}

	private static void printFifo(String str) throws FileNotFoundException {
		PrintStream fifo = new PrintStream("notify.fifo");
		fifo.println(str);
		fifo.flush();
		fifo.close();
	}
	
	private static void printEventStats(DnsFilterFixedRateTests test) throws FileNotFoundException {
		PrintStream fifo = new PrintStream("event_statistics");
		fifo.printf("%d %d %d %d %.2f %d %.2f %.2f\n", 
				test.getTargetRate(),
				test.sentEventsCount,
				test.getSuccessfullyProcessedEventsCount("sniffer.header.parsed.flat"),
				test.getSuccessfullyProcessedEventsOverallCount(),
				(100. * test.getSuccessfullyProcessedEventsOverallCount() / test.sentEventsCount),
				test.getScheduledEventsCount(),
				(100. * test.sentEventsCount / test.getScheduledEventsCount()),
				(100. * test.getSuccessfullyProcessedEventsCount("sniffer.header.parsed.flat") / test.getScheduledEventsCount()));
		
		fifo.flush();
		fifo.close();
	}
}
