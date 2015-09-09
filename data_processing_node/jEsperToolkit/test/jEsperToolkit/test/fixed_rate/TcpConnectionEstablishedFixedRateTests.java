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
import clj_net_pcap.PacketHeaderDataBean;
import cljSnifferEventGenerator.JavaTools;

/**
 * 
 * @author Ruediger Gad
 * 
 */
public class TcpConnectionEstablishedFixedRateTests extends TestWithFixedEventSendRate {

	private int currentIndex;
	private long sentEventsCount;

	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		super.setup();
		
		currentIndex = 0;
		List<PacketHeaderDataBean> data = CljNetPcapJavaAdapter.extractNestedMapsFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/200604101400_split2_00001_20060410070145");
//		List<Map<?, ?>> data = CljNetPcapJavaAdapter.extractNestedMapsFromPcapFile("test/jEsperToolkit/test/benchmark/test_data/combined_office_22-04-2013.pcap");
        System.out.println(data.size() + " " + data.get(1255));
        for (int i = 0; i < 1; i++) {
            events.addAll(data);
        }
        System.out.println(events.size());
        
        System.out.println("Sample event: " + JavaTools.getNestedMapSample());
        erf.addEventType("sniffer.header.parsed", JavaTools.getNestedMapSample());
        
        erf.createStatement(
        		"INSERT INTO " +
  "feature.tcp.three.way.handshake.time " +
  "(timestamp, source, destination, sourcePort, destinationPort) " +
"SELECT " +
  "c.PcapHeader.timestampInNanos, " +
  "a.NetworkLayer.source, a.NetworkLayer.destination, " +
  "a.Tcp.source, a.Tcp.destination " +
"FROM PATTERN [ " +
  "EVERY " +
    "a = sniffer.header.parsed( " +
      "Tcp.flags.contains(\"SYN\") AND " +
      "Tcp.flags.size() = 1) " +
  "-> " +
    "b = sniffer.header.parsed( " +
      "Tcp.flags.contains(\"ACK\") AND Tcp.flags.contains(\"SYN\") AND " +
      "Tcp.flags.size() = 2 AND " +
      "NetworkLayer.source = a.NetworkLayer.destination AND " + 
      "NetworkLayer.destination = a.NetworkLayer.source AND " + 
      "Tcp.source = a.Tcp.destination AND Tcp.destination = a.Tcp.source " +
    ") " +
  "-> " +
    "c = sniffer.header.parsed( " +
      "Tcp.flags.contains(\"ACK\") AND Tcp.flags.size() = 1 AND " +
      "NetworkLayer.source = a.NetworkLayer.source AND " +
      "NetworkLayer.destination = a.NetworkLayer.destination AND " + 
      "Tcp.source = a.Tcp.source AND Tcp.destination = a.Tcp.destination " +
    ") " +
"]");
        
        setCountedEventTypes("sniffer.header.parsed", "feature.tcp.three.way.handshake.time");

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

		TcpConnectionEstablishedFixedRateTests test = new TcpConnectionEstablishedFixedRateTests();

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
	
	private static void printEventStats(TcpConnectionEstablishedFixedRateTests test) throws FileNotFoundException {
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
