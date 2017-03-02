package com.igexin.p022a.p023a.p025d;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.igexin.a.a.d.f */
final class C0255f {
    final BlockingQueue f658a;
    final HashMap f659b;
    final ReentrantLock f660c;
    ThreadFactory f661d;
    volatile long f662e;
    volatile int f663f;
    volatile int f664g;
    volatile int f665h;
    final /* synthetic */ C0243e f666i;

    public C0255f(C0243e c0243e) {
        this.f666i = c0243e;
        this.f660c = new ReentrantLock();
        this.f658a = new SynchronousQueue();
        this.f659b = new HashMap();
        this.f662e = TimeUnit.SECONDS.toNanos(60);
        this.f663f = 0;
        this.f661d = new C0257h(this);
        this.f665h = Integer.MAX_VALUE;
    }

    final C0233d m864a() {
        while (true) {
            try {
                C0233d c0233d = this.f664g > this.f663f ? (C0233d) this.f658a.poll(this.f662e, TimeUnit.NANOSECONDS) : (C0233d) this.f658a.take();
                if (c0233d != null) {
                    return c0233d;
                }
                if (this.f658a.isEmpty()) {
                    return null;
                }
            } catch (InterruptedException e) {
            }
        }
    }

    final void m865a(C0233d c0233d) {
        if (c0233d == null) {
            throw new NullPointerException();
        }
        if (c0233d.f555K != 0) {
            ReentrantLock reentrantLock = this.f660c;
            reentrantLock.lock();
            try {
                C0256g c0256g = (C0256g) this.f659b.get(Integer.valueOf(c0233d.f555K));
                if (c0256g != null) {
                    c0256g.f667a.offer(c0233d);
                    return;
                }
                reentrantLock.unlock();
            } finally {
                reentrantLock.unlock();
            }
        }
        m867b(c0233d);
    }

    final boolean m866a(C0256g c0256g) {
        ReentrantLock reentrantLock = this.f660c;
        reentrantLock.lock();
        try {
            int i = this.f664g - 1;
            this.f664g = i;
            if (i == 0 && !this.f658a.isEmpty()) {
                Thread f = m871f(null);
                if (f != null) {
                    f.start();
                }
            } else if (!c0256g.f667a.isEmpty()) {
                reentrantLock.unlock();
                return true;
            }
            this.f659b.remove(Integer.valueOf(c0256g.f670d));
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    final void m867b(C0233d c0233d) {
        if (this.f664g < this.f663f && m868c(c0233d)) {
            return;
        }
        if (this.f658a.offer(c0233d)) {
            if (this.f664g == 0) {
                m870e(c0233d);
            }
        } else if (!m869d(c0233d)) {
        }
    }

    final boolean m868c(C0233d c0233d) {
        Thread thread = null;
        ReentrantLock reentrantLock = this.f660c;
        reentrantLock.lock();
        try {
            if (this.f664g < this.f663f) {
                thread = m871f(c0233d);
            }
            reentrantLock.unlock();
            if (thread == null) {
                return false;
            }
            thread.start();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    final boolean m869d(C0233d c0233d) {
        Thread thread = null;
        ReentrantLock reentrantLock = this.f660c;
        reentrantLock.lock();
        try {
            if (this.f664g < this.f665h) {
                thread = m871f(c0233d);
            }
            reentrantLock.unlock();
            if (thread == null) {
                return false;
            }
            thread.start();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    final void m870e(C0233d c0233d) {
        Thread thread = null;
        ReentrantLock reentrantLock = this.f660c;
        reentrantLock.lock();
        try {
            if (this.f664g < Math.max(this.f663f, 1) && !this.f658a.isEmpty()) {
                thread = m871f(null);
            }
            reentrantLock.unlock();
            if (thread != null) {
                thread.start();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    final Thread m871f(C0233d c0233d) {
        Runnable c0256g = new C0256g(this, c0233d);
        if (!(c0233d == null || c0233d.f555K == 0)) {
            this.f659b.put(Integer.valueOf(c0233d.f555K), c0256g);
        }
        Thread newThread = this.f661d.newThread(c0256g);
        if (newThread != null) {
            this.f664g++;
        }
        return newThread;
    }
}
