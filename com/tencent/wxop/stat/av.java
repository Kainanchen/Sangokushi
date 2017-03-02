package com.tencent.wxop.stat;

import java.util.List;

class av implements Runnable {
    final /* synthetic */ List f1961a;
    final /* synthetic */ int f1962b;
    final /* synthetic */ boolean f1963c;
    final /* synthetic */ boolean f1964d;
    final /* synthetic */ au f1965e;

    av(au auVar, List list, int i, boolean z, boolean z2) {
        this.f1965e = auVar;
        this.f1961a = list;
        this.f1962b = i;
        this.f1963c = z;
        this.f1964d = z2;
    }

    public void run() {
        this.f1965e.m2327a(this.f1961a, this.f1962b, this.f1963c);
        if (this.f1964d) {
            this.f1961a.clear();
        }
    }
}
