package com.tencent.wxop.stat;

class bb implements Runnable {
    final /* synthetic */ int f1982a;
    final /* synthetic */ au f1983b;

    bb(au auVar, int i) {
        this.f1983b = auVar;
        this.f1982a = i;
    }

    public void run() {
        this.f1983b.m2332b(this.f1982a, true);
        this.f1983b.m2332b(this.f1982a, false);
    }
}
