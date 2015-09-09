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

package jEsperToolkit.test.benchmark.api;

import jEsperToolkit.test.api.TestEventSender;
import jEsperToolkit.test.api.TestWithCounter;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.core.service.EPStatementImpl;

/**
 * Base class for timing benchmark tests.
 * 
 * @author Ruediger Gad
 * 
 */
public class TimedBenchmark extends TestWithCounter {

	protected Object sync = new Object();

	private long startNanos;
	private long stopNanos;


	/**
	 * Prepare the actual benchmark. This method must be called before calling
	 * {@link TimedBenchmark#runSimpleBenchmark()}. The parameter is a variable
	 * argument list of event types that shall be counted. The counter will be
	 * used later on for the result output. This must be called after an
	 * {@link TestEventSender} had been set via
	 * {@link TimedBenchmark#setEventSender(TestEventSender)}.
	 * 
	 * @param countedEventTypes
	 * @throws InterruptedException
	 */
	public void prepareBenchmark(String... countedEventTypes) {
		setCountedEventTypes(countedEventTypes);
		
		erf.addEventType(TimedBenchmarkTerminateEvent.class);
		EPStatementImpl statement = erf
				.createStatement("SELECT * FROM TimedBenchmarkTerminateEvent");
		statement.addListener(new UpdateListener() {
			@Override
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				synchronized (sync) {
					sync.notifyAll();
				}
			}
		});

		System.out.println("Warm-up start.");
		for (int i = 0; i < 5; i++) {
			runSimpleBenchmark();
		}
		System.out.println("Warm-up end.\n");
	}

	@Override
	public void setup() {
		super.setup();
	}

	protected void runSimpleBenchmark() {
		resetCounters();
		startNanos = System.nanoTime();
		
		sendEvents();
		erf.send(new TimedBenchmarkTerminateEvent());
		synchronized (sync) {
			try {
				sync.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		stopNanos = System.nanoTime();

		double timeSeconds = (stopNanos - startNanos) / Math.pow(10, 9);
		long totalProcessed = 0;
		for (int i = 0; i < getCountedEventTypes().length; i++) {
			System.out.println("Processed " + getSuccessfullyProcessedEventsCount()[i] + " "
					+ getCountedEventTypes()[i] + " events out of " + events.size()
					+ " total events in ~" + String.format("%.5f", timeSeconds)
					+ "s. Rate is ~"
					+ Math.round(((1 / timeSeconds)) * getSuccessfullyProcessedEventsCount()[i])
					+ " events/second");
			totalProcessed += getSuccessfullyProcessedEventsCount()[i];
		}

		System.out.println("Overall: processed " + totalProcessed
				+ " events out of " + events.size() + " events in ~"
				+ String.format("%.5f", timeSeconds) + "s. Rate is ~"
				+ Math.round(((1 / timeSeconds)) * totalProcessed)
				+ " events/second\n");
	}


}
