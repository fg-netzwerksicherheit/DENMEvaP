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

package jEsperToolkit.test.benchmark.followed_by;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import jEsperToolkit.EsperRuntimeFacade;
import jEsperToolkit.test.api.TestEventSender;
import jEsperToolkit.test.benchmark.api.TimedBenchmark;

public class FollowdByBenchmarkWithCalculationAndComparison extends
		TimedBenchmark {
	@BeforeClass
	public static void setupClass() {
		for (int i = 1; i <= 1000; i++) {
			Map<String, Object> eventA = new HashMap<String, Object>();
			eventA.put("x", i);
			eventA.put("xString", String.valueOf(i));
			Map<String, Map<String, Object>> containerA = new HashMap<String, Map<String, Object>>();
			containerA.put("A", eventA);
			events.add(containerA);

			Map<String, Object> eventB = new HashMap<String, Object>();
			eventB.put("y", i);
			eventB.put("yString", String.valueOf(2 * i));
			Map<String, Map<String, Object>> containerB = new HashMap<String, Map<String, Object>>();
			containerB.put("B", eventB);
			events.add(containerB);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setup() {
		super.setup();
		erf.addEventType("A", (Map<String, Object>) ((Map<String, Object>) events.get(0)).get("A"));
		erf.addEventType("B", (Map<String, Object>) ((Map<String, Object>) events.get(1)).get("B"));

		setEventSender(new TestEventSender() {
			@Override
			public void sendEvents(EsperRuntimeFacade erf) {
				erf.sendAllMap(events);
			}
		});

		String bFollowsAPattern = "INSERT INTO BFollowsA SELECT * FROM PATTERN [ EVERY a = A -> b = B(y/2 = a.x) ]";
		erf.createStatement(bFollowsAPattern);

		prepareBenchmark("A", "B", "BFollowsA");
	}

	@Test
	public void simpleMapEventBenchmark() throws InterruptedException {
		System.out.println("SimpleSendTwoEventTypesBenchmark Begin");
		for (int i = 0; i < 30; i++) {
			runSimpleBenchmark();
		}
		System.out.println("SimpleSendTwoEventTypesBenchmark End");
	}
}
