package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alipay.android.phone.mrpc.core.l */
public final class C0072l implements ab {
    private static C0072l f45b;
    private static final ThreadFactory f46i;
    Context f47a;
    private ThreadPoolExecutor f48c;
    private C0060b f49d;
    private long f50e;
    private long f51f;
    private long f52g;
    private int f53h;

    static {
        f45b = null;
        f46i = new C0074n();
    }

    private C0072l(Context context) {
        this.f47a = context;
        this.f49d = C0060b.m54a("android");
        this.f48c = new ThreadPoolExecutor(10, 11, 3, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f46i, new CallerRunsPolicy());
        try {
            this.f48c.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
        }
        CookieSyncManager.createInstance(this.f47a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final C0072l m81a(Context context) {
        return f45b != null ? f45b : C0072l.m82b(context);
    }

    private static final synchronized C0072l m82b(Context context) {
        C0072l c0072l;
        synchronized (C0072l.class) {
            if (f45b != null) {
                c0072l = f45b;
            } else {
                c0072l = new C0072l(context);
                f45b = c0072l;
            }
        }
        return c0072l;
    }

    public final C0060b m83a() {
        return this.f49d;
    }

    public final Future<C0077u> m84a(C0075t c0075t) {
        long j = 0;
        if (C0081s.m124a(this.f47a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f48c.getActiveCount());
            objArr[1] = Long.valueOf(this.f48c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f48c.getTaskCount());
            objArr[3] = Long.valueOf(this.f52g == 0 ? 0 : ((this.f50e * 1000) / this.f52g) >> 10);
            if (this.f53h != 0) {
                j = this.f51f / ((long) this.f53h);
            }
            objArr[4] = Long.valueOf(j);
            objArr[5] = Long.valueOf(this.f50e);
            objArr[6] = Long.valueOf(this.f51f);
            objArr[7] = Long.valueOf(this.f52g);
            objArr[8] = Integer.valueOf(this.f53h);
            String.format(str, objArr);
        }
        Object c0079q = new C0079q(this, (C0076o) c0075t);
        Object c0073m = new C0073m(this, c0079q, c0079q);
        this.f48c.execute(c0073m);
        return c0073m;
    }

    public final void m85a(long j) {
        this.f50e += j;
    }

    public final void m86b(long j) {
        this.f51f += j;
        this.f53h++;
    }

    public final void m87c(long j) {
        this.f52g += j;
    }
}
