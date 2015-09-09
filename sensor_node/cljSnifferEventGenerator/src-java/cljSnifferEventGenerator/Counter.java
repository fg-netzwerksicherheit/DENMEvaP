/*
 *   Copyright 2015, Frankfurt University of Applied Sciences
 *
 *   This software is released under the terms of the Eclipse Public License 
 *   (EPL) 1.0. You can find a copy of the EPL at: 
 *   http://opensource.org/licenses/eclipse-1.0.php
 */

package cljSnifferEventGenerator;

public class Counter {

    private long val = 0;
    private long divisor = 50000;

    public void inc() {
        val++;
    }

    public void reset() {
        val = 0;
    }

    public long value() {
        return val;
    }

    public boolean isMod() {
        return (val % divisor) == 0;
    }
}

