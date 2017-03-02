package com.tencent.mm.sdk.p063b;

import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.alipay.sdk.util.C0201h;
import com.tencent.mm.sdk.p063b.C0596g.C0593a;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.b.e */
final class C0594e extends Handler implements C0593a {
    private Looper aN;
    private Callback aO;
    C0591a aP;

    /* renamed from: com.tencent.mm.sdk.b.e.a */
    public interface C0591a {
        void m2027a(Runnable runnable, C0596g c0596g);

        void m2028b(Runnable runnable, C0596g c0596g);
    }

    C0594e(Looper looper, C0591a c0591a) {
        super(looper);
        this.aN = getLooper();
        this.aP = c0591a;
    }

    C0594e(C0591a c0591a) {
        this.aN = getLooper();
        this.aP = c0591a;
    }

    public final void m2032c(Runnable runnable, C0596g c0596g) {
        if (this.aP != null) {
            this.aP.m2028b(runnable, c0596g);
        }
    }

    public final void dispatchMessage(Message message) {
        if (message.getCallback() == null && this.aO == null) {
            System.currentTimeMillis();
            Debug.threadCpuTimeNanos();
            handleMessage(message);
            if (this.aP != null) {
                this.aN.getThread();
                System.currentTimeMillis();
                Debug.threadCpuTimeNanos();
                return;
            }
            return;
        }
        super.dispatchMessage(message);
    }

    public final void handleMessage(Message message) {
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        Assert.assertTrue("msg is null", message != null);
        Runnable callback = message.getCallback();
        if (callback == null) {
            return super.sendMessageAtTime(message, j);
        }
        long uptimeMillis = j - SystemClock.uptimeMillis();
        C0596g c0596g = new C0596g(this.aN.getThread(), message.getTarget() == null ? this : message.getTarget(), callback, message.obj, this);
        if (uptimeMillis > 0) {
            c0596g.aY = uptimeMillis;
        }
        Message obtain = Message.obtain(message.getTarget(), c0596g);
        obtain.what = message.what;
        obtain.arg1 = message.arg1;
        obtain.arg2 = message.arg2;
        obtain.obj = message.obj;
        obtain.replyTo = message.replyTo;
        obtain.setData(message.getData());
        message.recycle();
        if (this.aP != null) {
            this.aP.m2027a(callback, c0596g);
        }
        boolean sendMessageAtTime = super.sendMessageAtTime(obtain, j);
        if (!(sendMessageAtTime || this.aP == null)) {
            this.aP.m2028b(callback, c0596g);
        }
        return sendMessageAtTime;
    }

    public final String toString() {
        return "MMInnerHandler{listener = " + this.aP + C0201h.f512d;
    }
}
