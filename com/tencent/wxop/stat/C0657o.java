package com.tencent.wxop.stat;

import android.content.Context;

/* renamed from: com.tencent.wxop.stat.o */
final class C0657o implements Runnable {
    final /* synthetic */ Context f2094a;

    C0657o(Context context) {
        this.f2094a = context;
    }

    public final void run() {
        StatServiceImpl.flushDataToDB(this.f2094a);
    }
}
