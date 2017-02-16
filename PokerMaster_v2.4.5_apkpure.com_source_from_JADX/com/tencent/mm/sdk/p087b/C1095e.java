package com.tencent.mm.sdk.p087b;

import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.mm.sdk.p087b.C1097g.C1094a;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.b.e */
final class C1095e extends Handler implements C1094a {
    private Looper aN;
    private Callback aO;
    C1092a aP;

    /* renamed from: com.tencent.mm.sdk.b.e.a */
    public interface C1092a {
        void m5883a(Runnable runnable, C1097g c1097g);

        void m5884b(Runnable runnable, C1097g c1097g);
    }

    C1095e(Looper looper, C1092a c1092a) {
        super(looper);
        this.aN = getLooper();
        this.aP = c1092a;
    }

    C1095e(C1092a c1092a) {
        this.aN = getLooper();
        this.aP = c1092a;
    }

    public final void m5888c(Runnable runnable, C1097g c1097g) {
        if (this.aP != null) {
            this.aP.m5884b(runnable, c1097g);
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
        C1097g c1097g = new C1097g(this.aN.getThread(), message.getTarget() == null ? this : message.getTarget(), callback, message.obj, this);
        if (uptimeMillis > 0) {
            c1097g.aY = uptimeMillis;
        }
        Message obtain = Message.obtain(message.getTarget(), c1097g);
        obtain.what = message.what;
        obtain.arg1 = message.arg1;
        obtain.arg2 = message.arg2;
        obtain.obj = message.obj;
        obtain.replyTo = message.replyTo;
        obtain.setData(message.getData());
        message.recycle();
        if (this.aP != null) {
            this.aP.m5883a(callback, c1097g);
        }
        boolean sendMessageAtTime = super.sendMessageAtTime(obtain, j);
        if (!(sendMessageAtTime || this.aP == null)) {
            this.aP.m5884b(callback, c1097g);
        }
        return sendMessageAtTime;
    }

    public final String toString() {
        return "MMInnerHandler{listener = " + this.aP + "}";
    }
}
