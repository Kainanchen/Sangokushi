package com.tencent.p080b.p081a;

import android.content.Context;

/* renamed from: com.tencent.b.a.h */
final class C1063h implements Runnable {
    final /* synthetic */ Context f8196a;
    final /* synthetic */ int f8197b;

    C1063h(Context context) {
        this.f8196a = context;
        this.f8197b = -1;
    }

    public final void run() {
        try {
            C1060e.m5801c(this.f8196a);
            C1073r.m5835a(this.f8196a).m5858a(this.f8197b);
        } catch (Throwable th) {
            C1060e.f8178q.m5665b(th);
            C1060e.m5794a(this.f8196a, th);
        }
    }
}
