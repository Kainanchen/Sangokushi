package com.igexin.p022a.p023a.p025d;

import android.os.PowerManager.WakeLock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.igexin.a.a.d.g */
final class C0256g implements Runnable {
    final BlockingQueue f667a;
    C0233d f668b;
    C0233d f669c;
    volatile int f670d;
    WakeLock f671e;
    final /* synthetic */ C0255f f672f;

    public C0256g(C0255f c0255f, C0233d c0233d) {
        this.f672f = c0255f;
        this.f668b = c0233d;
        this.f667a = new LinkedBlockingQueue();
        this.f671e = c0255f.f666i.f622p.newWakeLock(1, toString());
        this.f671e.setReferenceCounted(false);
    }

    public final void m872a() {
        this.f667a.clear();
        this.f669c = null;
        this.f671e = null;
    }

    public final void m873a(C0233d c0233d) {
        c0233d.m739a(this.f671e);
        if (this.f670d == 0) {
            this.f670d = c0233d.f555K;
        }
        Object obj = 1;
        while (obj != null) {
            if (c0233d.f563T) {
                this.f671e.acquire();
            }
            try {
                c0233d.a_();
                c0233d.m752s();
                c0233d.m754u();
                if (c0233d.f563T) {
                    this.f671e.release();
                }
                if (!c0233d.f549E) {
                    c0233d.m741c();
                }
                if (!c0233d.f568w && c0233d.f571z) {
                }
            } catch (Exception e) {
                c0233d.f549E = true;
                c0233d.f557M = e;
                c0233d.m755v();
                c0233d.m748o();
                this.f672f.f666i.m797a((Object) c0233d);
                this.f672f.f666i.m800g();
                if (c0233d.f563T) {
                    this.f671e.release();
                }
                if (!c0233d.f549E) {
                    c0233d.m741c();
                }
                if (!c0233d.f568w && c0233d.f571z) {
                }
            } catch (Throwable th) {
                if (c0233d.f563T) {
                    this.f671e.release();
                }
                if (!c0233d.f549E) {
                    c0233d.m741c();
                }
                if (c0233d.f568w || !c0233d.f571z) {
                }
            }
            obj = null;
            c0233d = null;
        }
    }

    final C0233d m874b() {
        while (this.f670d != 0) {
            ReentrantLock reentrantLock;
            try {
                C0233d c0233d = (C0233d) this.f667a.poll(this.f672f.f662e, TimeUnit.NANOSECONDS);
                if (c0233d != null) {
                    return c0233d;
                }
                if (this.f667a.isEmpty()) {
                    reentrantLock = this.f672f.f660c;
                    reentrantLock.lock();
                    if (this.f667a.isEmpty()) {
                        this.f672f.f659b.remove(Integer.valueOf(this.f670d));
                        this.f669c.m743e();
                        this.f670d = 0;
                        reentrantLock.unlock();
                        return null;
                    }
                    reentrantLock.unlock();
                } else {
                    continue;
                }
            } catch (InterruptedException e) {
            } catch (Throwable th) {
                reentrantLock.unlock();
            }
        }
        return null;
    }

    public final void run() {
        boolean z = true;
        while (z) {
            try {
                C0233d c0233d = this.f668b;
                this.f668b = null;
                while (true) {
                    if (c0233d == null) {
                        c0233d = m874b();
                        if (c0233d == null) {
                            c0233d = this.f672f.m864a();
                            if (c0233d == null) {
                                break;
                            }
                        }
                    }
                    this.f669c = null;
                    m873a(c0233d);
                    this.f669c = c0233d;
                    c0233d = null;
                }
                z = this.f672f.m866a(this);
                if (!z) {
                    m872a();
                }
            } catch (Exception e) {
                z = this.f672f.m866a(this);
                if (!z) {
                    m872a();
                }
            } catch (Throwable th) {
                if (!this.f672f.m866a(this)) {
                    m872a();
                }
            }
        }
    }
}
