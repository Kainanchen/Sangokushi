package com.alipay.sdk.data;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.alipay.sdk.data.d */
final class C0171d implements Callable<String> {
    final /* synthetic */ Context f394a;
    final /* synthetic */ HashMap f395b;
    final /* synthetic */ C0170c f396c;

    C0171d(C0170c c0170c, Context context, HashMap hashMap) {
        this.f396c = c0170c;
        this.f394a = context;
        this.f395b = hashMap;
    }

    public final /* synthetic */ Object call() throws Exception {
        C0170c c0170c = this.f396c;
        return C0170c.m481a(this.f394a, this.f395b);
    }

    private String m494a() throws Exception {
        C0170c c0170c = this.f396c;
        return C0170c.m481a(this.f394a, this.f395b);
    }
}
