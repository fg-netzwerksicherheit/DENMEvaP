/*
 *   Copyright 2015, Frankfurt University of Applied Sciences
 *
 *   This software is released under the terms of the Eclipse Public License 
 *   (EPL) 1.0. You can find a copy of the EPL at: 
 *   http://opensource.org/licenses/eclipse-1.0.php
 */

package cljSnifferEventGenerator;

public class ByteArrayHelper {

    public static int getInt(byte[] array, int index) {
        return   array[index+3] & 0xFF |
            (array[index+2] & 0xFF) << 8 |
            (array[index+1] & 0xFF) << 16 |
            (array[index+0] & 0xFF) << 24;
    }

    public static long getLong(byte[] array, int index) {
        return   array[index+7] & 0xFF |
            (array[index+6] & 0xFF) << 8 |
            (array[index+5] & 0xFF) << 16 |
            (array[index+4] & 0xFF) << 24 |
            (array[index+3] & 0xFF) << 32 |
            (array[index+2] & 0xFF) << 40 |
            (array[index+1] & 0xFF) << 48 |
            (array[index] & 0xFF) << 56;
    }
}

