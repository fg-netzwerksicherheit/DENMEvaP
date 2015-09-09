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

package jEsperToolkit.test.fixed_rate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import jEsperToolkit.EsperRuntimeFacade;
import jEsperToolkit.test.api.TestEventSender;
import jEsperToolkit.test.api.TestWithFixedEventSendRate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import clj_net_pcap.CljNetPcapJavaAdapter;

/**
 * 
 * @author Ruediger Gad
 * 
 */
public class IcmpPingTimeFixedRateTests2 extends TestWithFixedEventSendRate {

	private int currentIndex;
	private long sentEventsCount;

	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		super.setup();

		currentIndex = 0;
		List<Map<?, ?>> data = CljNetPcapJavaAdapter.extractNestedMapsFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/combined_office_22-04-2013.pcap");
//		List<Map<?, ?>> data = CljNetPcapJavaAdapter.extractNestedMapsFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/icmp_ping_office_17-04-2013.pcap");
		for (int i = 0; i < 15; i++) {
			events.addAll(data);
		}

		erf.addEventType("sniffer.header.parsed", (Map<String, Object>) events.get(887));
//		erf.addEventType("sniffer.header.parsed", (Map<String, Object>) events.get(7));
		
        erf.createStatement(
        		"INSERT INTO " +
        		  "feature.icmp.ping.reply.time " +
        		  "(requestTimestamp, replyTimestamp, time, source, destination, requestTtl, replyTtl) " +
        		"SELECT " +
        		  "a.PcapHeader.timestampInNanos, b.PcapHeader.timestampInNanos, " +
        		  "b.PcapHeader.timestampInNanos - a.PcapHeader.timestampInNanos, " +
        		  "a.NetworkLayer.source, a.NetworkLayer.destination, " +
        		  "a.NetworkLayer.ttl, b.NetworkLayer.ttl " +
        		"FROM PATTERN [ " +
        		  "EVERY " +
        		    "a = sniffer.header.parsed( " +
        		          "Icmp.typeDescription = \"echo request\" " +
        		        ") " +
        		  "-> " +
        		    "b = sniffer.header.parsed( " +
        		          "Icmp.typeDescription = \"echo reply\" AND " +
        		          "NetworkLayer.source = a.NetworkLayer.destination AND " + 
        		          "NetworkLayer.destination = a.NetworkLayer.source " +
        		        ") " +
        		"] "
        		);
		
		setCountedEventTypes("sniffer.header.parsed", "feature.icmp.ping.reply.time");

		setEventSender(new TestEventSender() {
			@Override
			public void sendEvents(EsperRuntimeFacade erf) {
				synchronized (this) {
					erf.send("sniffer.header.parsed",
							(Map<?, ?>) events.get(currentIndex));
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
		assertEquals(0, getSuccessfullyProcessedEventsCount("sniffer.header.parsed"));
		sendEventsWithRate(1000);
		Thread.sleep(125);
		stopSendingEvents();

		assertTrue(getSuccessfullyProcessedEventsCount("sniffer.header.parsed") > 100);
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

		IcmpPingTimeFixedRateTests2 test = new IcmpPingTimeFixedRateTests2();

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
	
	private static void printEventStats(IcmpPingTimeFixedRateTests2 test) throws FileNotFoundException {
		PrintStream fifo = new PrintStream("event_statistics");
		fifo.printf("%d %d %d %d %.2f %d %.2f %.2f\n", 
				test.getTargetRate(),
				test.sentEventsCount,
				test.getSuccessfullyProcessedEventsCount("sniffer.header.parsed"),
				test.getSuccessfullyProcessedEventsOverallCount(),
				(100. * test.getSuccessfullyProcessedEventsOverallCount() / test.sentEventsCount),
				test.getScheduledEventsCount(),
				(100. * test.sentEventsCount / test.getScheduledEventsCount()),
				(100. * test.getSuccessfullyProcessedEventsCount("sniffer.header.parsed") / test.getScheduledEventsCount()));
		
		fifo.flush();
		fifo.close();
	}
}