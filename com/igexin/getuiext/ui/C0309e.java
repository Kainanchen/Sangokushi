package com.igexin.getuiext.ui;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.igexin.getuiext.ui.e */
class C0309e {
    public final Rect f832a;
    public int[] f833b;
    public int[] f834c;
    public int[] f835d;

    C0309e() {
        this.f832a = new Rect();
    }

    public static C0309e m1051a(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == null) {
            return null;
        }
        C0309e c0309e = new C0309e();
        c0309e.f833b = new int[order.get()];
        c0309e.f834c = new int[order.get()];
        c0309e.f835d = new int[order.get()];
        C0309e.m1052a(c0309e.f833b.length);
        C0309e.m1052a(c0309e.f834c.length);
        order.getInt();
        order.getInt();
        c0309e.f832a.left = order.getInt();
        c0309e.f832a.right = order.getInt();
        c0309e.f832a.top = order.getInt();
        c0309e.f832a.bottom = order.getInt();
        order.getInt();
        C0309e.m1053a(c0309e.f833b, order);
        C0309e.m1053a(c0309e.f834c, order);
        C0309e.m1053a(c0309e.f835d, order);
        return c0309e;
    }

    private static void m1052a(int i) {
        if (i == 0 || (i & 1) != 0) {
            throw new RuntimeException("invalid nine-patch: " + i);
        }
    }

    private static void m1053a(int[] iArr, ByteBuffer byteBuffer) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = byteBuffer.getInt();
        }
    }
}
