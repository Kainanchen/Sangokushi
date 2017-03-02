package com.igexin.p022a.p023a.p025d;

import android.os.PowerManager.WakeLock;
import com.igexin.p022a.p023a.p025d.p026a.C0228a;
import com.igexin.p022a.p023a.p025d.p026a.C0250d;
import com.igexin.p022a.p023a.p025d.p026a.C0251e;
import com.igexin.p022a.p023a.p025d.p026a.C0252g;
import com.tencent.mm.sdk.modelbase.BaseResp.ErrCode;
import com.tencent.mm.sdk.modelpay.PayReq.Options;
import com.tencent.wxop.stat.common.StatConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.igexin.a.a.d.d */
public abstract class C0233d extends C0230a implements C0228a {
    protected static C0243e f544P;
    protected volatile boolean f545A;
    protected volatile boolean f546B;
    protected volatile boolean f547C;
    protected volatile boolean f548D;
    protected volatile boolean f549E;
    protected volatile long f550F;
    volatile int f551G;
    public long f552H;
    public int f553I;
    public int f554J;
    public int f555K;
    public int f556L;
    public Exception f557M;
    public Object f558N;
    public C0252g f559O;
    protected final ReentrantLock f560Q;
    protected final Condition f561R;
    Thread f562S;
    protected volatile boolean f563T;
    WakeLock f564U;
    int f565V;
    protected C0250d f566W;
    private byte f567a;
    protected volatile boolean f568w;
    protected volatile boolean f569x;
    protected volatile boolean f570y;
    protected volatile boolean f571z;

    public C0233d(int i) {
        this(i, null);
    }

    public C0233d(int i, C0250d c0250d) {
        this.f555K = i;
        this.f566W = c0250d;
        this.f560Q = new ReentrantLock();
        this.f561R = this.f560Q.newCondition();
    }

    public final int m734a(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return 0;
        }
        switch (f544P.f619m.m857a(this, j, timeUnit)) {
            case ErrCode.ERR_USER_CANCEL /*-2*/:
                return -2;
            case Options.INVALID_FLAGS /*-1*/:
                this.f550F = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
                return -1;
            case StatConstants.XG_PRO_VERSION /*1*/:
                return 1;
            default:
                return 0;
        }
    }

    public long m735a(TimeUnit timeUnit) {
        return timeUnit.convert(m747n(), TimeUnit.MILLISECONDS);
    }

    public final void m736a(int i) {
        this.f567a = (byte) (this.f567a & 15);
        this.f567a = (byte) (this.f567a | ((i & 15) << 4));
    }

    public final void m737a(int i, C0252g c0252g) {
        if (i < 0) {
            throw new IllegalArgumentException("second must > 0");
        }
        this.f554J = i;
        this.f559O = c0252g;
    }

    public final void m738a(long j) {
        this.f552H = j;
    }

    public void m739a(WakeLock wakeLock) {
        this.f564U = wakeLock;
    }

    public final void m740a(C0250d c0250d) {
        this.f566W = c0250d;
    }

    public void a_() {
        this.f562S = Thread.currentThread();
        this.f545A = true;
    }

    public void m741c() {
        if (this.f568w || this.f569x) {
            m744f();
        }
    }

    public void m742d() {
        this.f548D = true;
    }

    protected abstract void m743e();

    public void m744f() {
        this.f558N = null;
        this.f557M = null;
        this.f562S = null;
    }

    public WakeLock m745l() {
        return this.f564U;
    }

    final void m746m() {
        this.f565V++;
        this.f565V &= 1090519038;
    }

    long m747n() {
        return this.f550F - System.currentTimeMillis();
    }

    public final void m748o() {
        this.f568w = true;
    }

    public final boolean m749p() {
        return this.f570y;
    }

    public final boolean m750q() {
        return this.f569x;
    }

    public final boolean m751r() {
        return this.f548D;
    }

    protected void m752s() {
    }

    public final void m753t() {
        this.f569x = true;
    }

    protected void m754u() {
        if (!this.f571z && !this.f546B && !this.f547C) {
            this.f568w = true;
            this.f545A = false;
        } else if (this.f546B && !this.f568w) {
            this.f545A = false;
        } else if (this.f571z && !this.f570y && !this.f568w) {
            this.f545A = false;
        }
    }

    protected void m755v() {
        if (this.f566W != null) {
            this.f566W.m847a(C0251e.error);
        }
    }
}
