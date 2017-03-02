package com.ta.utdid2.android.utils;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

public class IntUtils {
    public static byte[] getBytes(int i) {
        bInt = new byte[4];
        int value = i;
        bInt[3] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        value >>= 8;
        bInt[2] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        value >>= 8;
        bInt[1] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        bInt[0] = (byte) ((value >> 8) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        return bInt;
    }

    public static byte[] getBytes(byte[] buffer, int i) {
        if (buffer.length != 4) {
            return null;
        }
        int value = i;
        buffer[3] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        value >>= 8;
        buffer[2] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        value >>= 8;
        buffer[1] = (byte) (value % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        buffer[0] = (byte) ((value >> 8) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        return buffer;
    }
}
