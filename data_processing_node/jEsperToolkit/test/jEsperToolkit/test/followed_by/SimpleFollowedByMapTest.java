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

package jEsperToolkit.test.followed_by;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import jEsperToolkit.test.api.TestWithEsperRuntimeFacade;

import org.junit.Test;

import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

/**
 * 
 * @author Ruediger Gad
 *
 */
public class SimpleFollowedByMapTest extends TestWithEsperRuntimeFacade {

    @Test
    public void testFollowedBy() throws InterruptedException {
        assertFalse(wasRun);
        
        Map<String, Object> eventA = new HashMap<String, Object>();
        eventA.put("x", 1);
        Map<String, Object> eventB = new HashMap<String, Object>();
        eventB.put("y", 1);
        
        erf.addEventType("A", eventA);
        erf.addEventType("B", eventB);
        
        EPStatement stmt = erf.createStatement("SELECT * FROM PATTERN [every a = A(x = 1) -> b = B(y = a.x)]");
        stmt.addListener(new UpdateListener() {
            
            @Override
            public void update(EventBean[] newEvents, EventBean[] oldEvents) {
                wasRun = true;
            }
        });
        
        erf.send("A", eventA);
        /*
         * TODO:
         * Interesting observation: if those events are sent to quickly,
         * the event is not correctly triggered.
         */
        Thread.sleep(10);
        erf.send("B", eventB);
        
        Thread.sleep(100);
        
        assertTrue(wasRun);
    }

}
