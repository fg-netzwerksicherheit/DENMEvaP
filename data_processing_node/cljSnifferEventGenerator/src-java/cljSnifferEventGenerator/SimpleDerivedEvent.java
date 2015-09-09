/*
 *   Copyright 2015, Frankfurt University of Applied Sciences
 *
 *   This software is released under the terms of the Eclipse Public License 
 *   (EPL) 1.0. You can find a copy of the EPL at: 
 *   http://opensource.org/licenses/eclipse-1.0.php
 */

package cljSnifferEventGenerator;

import java.io.Serializable;

/**
 * 
 * Simple POJO for storing header data.
 * 
 * @author Ruediger Gad
 * 
 */
public class SimpleDerivedEvent implements Serializable {

    public static final long serialVersionUID = 1L;

	/*
	 * General pcap information
	 */
	public long ts = 0;


	/*
	 * IP
	 */
	public String ipSrc;
	public String ipDst;

	/*
	 * UDP
	 */
	public int udpSrc = 0;
	public int udpDst = 0;

	/*
	 * Getter and setter
	 */
	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public String getIpSrc() {
		return ipSrc;
	}

	public void setIpSrc(String ipSrc) {
		this.ipSrc = ipSrc;
	}

	public String getIpDst() {
		return ipDst;
	}

	public void setIpDst(String ipDst) {
		this.ipDst = ipDst;
	}

	public int getUdpSrc() {
		return udpSrc;
	}

	public void setUdpSrc(int udpSrc) {
		this.udpSrc = udpSrc;
	}

	public int getUdpDst() {
		return udpDst;
	}

	public void setUdpDst(int udpDst) {
		this.udpDst = udpDst;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleDerivedEvent: ");
		if (ts > 0) {
			builder.append("ts=");
			builder.append(ts);
		}
		if (ipSrc != null) {
			builder.append("ip4Src=");
			builder.append(ipSrc);
			builder.append(", ");
		}
		if (ipDst != null) {
			builder.append("ip4Dst=");
			builder.append(ipDst);
			builder.append(", ");
		}
		if (udpSrc > 0) {
			builder.append(", udpSrc=");
			builder.append(udpSrc);
		}
		if (udpDst > 0) {
			builder.append(", udpDst=");
			builder.append(udpDst);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ipDst == null) ? 0 : ipDst.hashCode());
		result = prime * result + ((ipSrc == null) ? 0 : ipSrc.hashCode());
		result = prime * result + (int) (ts ^ (ts >>> 32));
		result = prime * result + udpDst;
		result = prime * result + udpSrc;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SimpleDerivedEvent))
			return false;
		SimpleDerivedEvent other = (SimpleDerivedEvent) obj;
		if (ipDst == null) {
			if (other.ipDst != null)
				return false;
		} else if (!ipDst.equals(other.ipDst))
			return false;
		if (ipSrc == null) {
			if (other.ipSrc != null)
				return false;
		} else if (!ipSrc.equals(other.ipSrc))
			return false;
		if (ts != other.ts)
			return false;
		if (udpDst != other.udpDst)
			return false;
		if (udpSrc != other.udpSrc)
			return false;
		return true;
	}

}
