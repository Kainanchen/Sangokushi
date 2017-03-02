package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: com.igexin.push.c.c.g */
public class C0357g {
    public static int f960a;
    public int f961b;
    public int f962c;
    public int f963d;
    public int f964e;
    public int f965f;
    public byte f966g;
    public byte f967h;
    public byte f968i;

    static {
        f960a = 5;
    }

    public void m1198a() {
        this.f966g = (byte) (this.f964e & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        this.f967h = (byte) (this.f964e & 112);
        this.f968i = (byte) (this.f964e & 15);
    }

    public void m1199a(byte b) {
        this.f964e = b & MotionEventCompat.ACTION_MASK;
        m1198a();
    }

    public void m1200b() {
        this.f964e |= this.f966g;
        this.f964e |= this.f967h;
        this.f964e |= this.f968i;
    }

    public int m1201c() {
        m1200b();
        return this.f964e;
    }
}
