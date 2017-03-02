package com.tencent.wxop.stat;

import java.util.List;

class aw implements Runnable {
    final /* synthetic */ List f1966a;
    final /* synthetic */ boolean f1967b;
    final /* synthetic */ boolean f1968c;
    final /* synthetic */ au f1969d;

    aw(au auVar, List list, boolean z, boolean z2) {
        this.f1969d = auVar;
        this.f1966a = list;
        this.f1967b = z;
        this.f1968c = z2;
    }

    public void run() {
        this.f1969d.m2328a(this.f1966a, this.f1967b);
        if (this.f1968c) {
            this.f1966a.clear();
        }
    }
}
