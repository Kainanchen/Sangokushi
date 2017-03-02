package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.packet.impl.C0186c;
import com.alipay.sdk.util.C0202i;
import java.io.IOException;

/* renamed from: com.alipay.sdk.app.statistic.b */
final class C0145b implements Runnable {
    final /* synthetic */ Context f232a;
    final /* synthetic */ String f233b;

    C0145b(Context context, String str) {
        this.f232a = context;
        this.f233b = str;
    }

    public final void run() {
        C0186c c0186c = new C0186c();
        try {
            String b = C0202i.m665b(this.f232a, C0144a.f230a, null);
            if (!(TextUtils.isEmpty(b) || c0186c.m578a(this.f232a, b) == null)) {
                C0202i.m663a(this.f232a, C0144a.f230a);
            }
        } catch (Throwable th) {
        }
        try {
            if (!TextUtils.isEmpty(this.f233b)) {
                c0186c.m578a(this.f232a, this.f233b);
            }
        } catch (IOException e) {
            C0202i.m664a(this.f232a, C0144a.f230a, this.f233b);
        } catch (Throwable th2) {
        }
    }
}
