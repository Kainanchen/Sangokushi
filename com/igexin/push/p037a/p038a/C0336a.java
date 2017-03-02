package com.igexin.push.p037a.p038a;

import android.os.Message;
import com.igexin.push.core.C0416a;
import com.igexin.push.core.C0482f;
import com.igexin.push.p035e.p036b.C0335d;

/* renamed from: com.igexin.push.a.a.a */
public class C0336a implements C0335d {
    private long f898a;

    public C0336a() {
        this.f898a = 0;
    }

    public void m1126a() {
        Message message = new Message();
        message.what = C0416a.f1079j;
        C0482f.m1694a().m1700a(message);
    }

    public void m1127a(long j) {
        this.f898a = j;
    }

    public boolean m1128b() {
        return System.currentTimeMillis() - this.f898a > 360000;
    }
}
