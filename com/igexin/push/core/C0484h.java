package com.igexin.push.core;

import android.os.Looper;

/* renamed from: com.igexin.push.core.h */
public class C0484h extends Thread {
    public void run() {
        Looper.prepare();
        if (C0482f.m1694a() != null) {
            C0482f.m1694a().m1697a(new C0481e());
        }
        C0482f.m1694a().m1706b();
        Looper.loop();
    }
}
