package com.igexin.p022a.p023a.p024a;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: com.igexin.a.a.a.a */
public class C0227a {
    public static void m720a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static boolean m721a(byte[] bArr) {
        if (r3 <= 0 || r3 > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
            return false;
        }
        int i = 0;
        for (byte b : bArr) {
            if ((b & MotionEventCompat.ACTION_MASK) == 14) {
                i++;
                if (i > 3) {
                    return false;
                }
            }
        }
        return true;
    }

    public static byte[] m722a(byte[] bArr, String str) {
        return C0227a.m723a(bArr, str.getBytes());
    }

    public static byte[] m723a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        if (!C0227a.m721a(bArr2)) {
            throw new IllegalArgumentException("key is fail!");
        } else if (bArr.length < 1) {
            throw new IllegalArgumentException("data is fail!");
        } else {
            int i2;
            int[] iArr = new int[AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY];
            for (i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = i2;
            }
            int i3 = 0;
            for (i2 = 0; i2 < iArr.length; i2++) {
                i3 = ((i3 + iArr[i2]) + (bArr2[i2 % bArr2.length] & MotionEventCompat.ACTION_MASK)) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                C0227a.m720a(iArr, i2, i3);
            }
            byte[] bArr3 = new byte[bArr.length];
            i2 = 0;
            i3 = 0;
            while (i < bArr3.length) {
                i2 = (i2 + 1) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                i3 = (i3 + iArr[i2]) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                C0227a.m720a(iArr, i2, i3);
                bArr3[i] = (byte) (iArr[(iArr[i2] + iArr[i3]) % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY] ^ bArr[i]);
                i++;
            }
            return bArr3;
        }
    }

    public static byte[] m724b(byte[] bArr, String str) {
        return C0227a.m723a(bArr, str.getBytes());
    }
}
