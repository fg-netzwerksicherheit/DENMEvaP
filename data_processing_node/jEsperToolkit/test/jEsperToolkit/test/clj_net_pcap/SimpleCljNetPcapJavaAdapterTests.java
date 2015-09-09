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

package jEsperToolkit.test.clj_net_pcap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import clj_net_pcap.CljNetPcapJavaAdapter;

public class SimpleCljNetPcapJavaAdapterTests {

	@Test
	public void testCljNetPcapJavaAdapterClassLoads() {
		assertNotNull(CljNetPcapJavaAdapter.class);
	}

	@Test(expected = RuntimeException.class)
	public void testExceptionOnFileNotFound() {
		System.out
				.println("Please note: this test is supposed to throw an exception.\n"
						+ "So, the following error message is desired.\n"
						+ "It should complain about \"this-file-should-not-exist\" not being there.");
		CljNetPcapJavaAdapter
				.extractNestedMapsFromPcapFile("this-file-should-not-exist");
	}

	@Test
	public void simpleLoadFileTest() {
		@SuppressWarnings("unchecked")
		List<Map<?, ?>> pcapData = CljNetPcapJavaAdapter
				.extractNestedMapsFromPcapFile("test/jEsperToolkit/test/clj_net_pcap/icmp-echo-request.pcap");
		assertEquals(1, pcapData.size());
	}
}
