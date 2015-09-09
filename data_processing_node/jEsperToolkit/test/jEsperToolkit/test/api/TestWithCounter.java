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

package jEsperToolkit.test.api;

import static org.junit.Assert.assertNotNull;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.core.service.EPStatementImpl;

/**
 * 
 * @author Ruediger Gad
 *
 */
public class TestWithCounter extends TestWithEventSender {

	private long[] successfullyProcessedEventsCount;
	private Object[] mutex;
	private String[] countedEventTypes;
	
	public void setCountedEventTypes(String... countedEventTypes) {
		this.countedEventTypes = new String[countedEventTypes.length];
		System.arraycopy(countedEventTypes, 0, this.countedEventTypes, 0,
				countedEventTypes.length);
		successfullyProcessedEventsCount = new long[countedEventTypes.length];
		mutex = new Object[countedEventTypes.length];
		for (int i = 0; i < countedEventTypes.length; i++) {
			mutex[i] = new Object();
		}
		resetCounters();

		for (int i = 0; i < countedEventTypes.length; i++) {
			String pattern = "SELECT * FROM " + countedEventTypes[i];
			EPStatementImpl statement = erf.createStatement(pattern);
			statement.addListener(new CountListener(i));
		}
	}

	public long[] getSuccessfullyProcessedEventsCount() {
		long[] ret = new long[successfullyProcessedEventsCount.length];
		System.arraycopy(successfullyProcessedEventsCount, 0, ret, 0, successfullyProcessedEventsCount.length);
		return ret;
	}
	
	public long getSuccessfullyProcessedEventsCount(String eventType) {
		for (int i = 0; i < countedEventTypes.length; i++) {
			if (countedEventTypes[i].compareTo(eventType) == 0) {
				return successfullyProcessedEventsCount[i];
			}
		}
		
		return -1;
	}
	
	public String[] getCountedEventTypes() {
		String[] ret = new String[countedEventTypes.length];
		System.arraycopy(countedEventTypes, 0, ret, 0, countedEventTypes.length);
		return ret;
	}
	
	public long getSuccessfullyProcessedEventsOverallCount() {
		long ret = 0;
		for (int i = 0; i < successfullyProcessedEventsCount.length; i++) {
			ret += successfullyProcessedEventsCount[i];
		}
		return ret;
	}
	
	public void resetCounters() {
		for (int i = 0; i < successfullyProcessedEventsCount.length; i++) {
			successfullyProcessedEventsCount[i] = 0;
		}
	}
	
	@Override
	protected void sendEvents() {
		assertNotNull(
				"Counted events must be set prior to sending events." +
				"Please set the counted events via setCountedEvents(String...).",
				countedEventTypes);
		
		super.sendEvents();
	}
	
	/**
	 * 
	 * Built-in listener for counting events.
	 * 
	 * @author Ruediger Gad
	 * 
	 */
	private class CountListener implements UpdateListener {
		private int index;

		private CountListener(int index) {
			this.index = index;
		}

		@Override
		public void update(EventBean[] newEvents, EventBean[] oldEvents) {
			synchronized (mutex[index]) {
				successfullyProcessedEventsCount[index]++;	
			}
		}
	}
}
