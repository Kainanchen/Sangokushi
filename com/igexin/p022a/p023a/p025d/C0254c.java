package com.igexin.p022a.p023a.p025d;

import com.igexin.p022a.p023a.p030c.C0247a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.igexin.a.a.d.c */
public class C0254c {
    static final /* synthetic */ boolean f650h;
    final transient ReentrantLock f651a;
    final transient Condition f652b;
    final TreeSet f653c;
    final AtomicInteger f654d;
    int f655e;
    C0243e f656f;
    public final AtomicLong f657g;

    static {
        f650h = !C0254c.class.desiredAssertionStatus();
    }

    public C0254c(Comparator comparator, C0243e c0243e) {
        this.f651a = new ReentrantLock();
        this.f652b = this.f651a.newCondition();
        this.f654d = new AtomicInteger(0);
        this.f657g = new AtomicLong(-1);
        this.f653c = new TreeSet(comparator);
        this.f656f = c0243e;
    }

    private C0233d m856e() {
        C0233d a = m858a();
        return (a != null && this.f653c.remove(a)) ? a : null;
    }

    public final int m857a(C0233d c0233d, long j, TimeUnit timeUnit) {
        ReentrantLock reentrantLock = this.f651a;
        reentrantLock.lock();
        try {
            if (!this.f653c.contains(c0233d)) {
                return -1;
            }
            this.f653c.remove(c0233d);
            c0233d.f550F = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
            int i = m859a(c0233d) ? 1 : -2;
            reentrantLock.unlock();
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    C0233d m858a() {
        try {
            return (C0233d) this.f653c.first();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public final boolean m859a(C0233d c0233d) {
        if (c0233d == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f651a;
        reentrantLock.lock();
        try {
            C0233d a = m858a();
            int i = this.f655e + 1;
            this.f655e = i;
            c0233d.f551G = i;
            if (this.f653c.add(c0233d)) {
                c0233d.m746m();
                if (a == null || this.f653c.comparator().compare(c0233d, a) < 0) {
                    this.f652b.signalAll();
                }
                C0247a.m836a("ScheduleQueue|offer|succeeded|" + c0233d.getClass().getName() + "|" + c0233d.hashCode() + "|" + c0233d.m735a(TimeUnit.MILLISECONDS));
                reentrantLock.unlock();
                return true;
            }
            c0233d.f551G--;
            C0247a.m836a("ScheduleQueue|offer|failed|" + c0233d.getClass().getName() + "|" + c0233d.hashCode() + "|" + c0233d.m735a(TimeUnit.MILLISECONDS));
            return false;
        } catch (Exception e) {
            C0247a.m836a("ScheduleQueue|offer|exception|" + c0233d.getClass().getName() + "|" + c0233d.m735a(TimeUnit.MILLISECONDS));
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean m860a(Class cls) {
        if (cls == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f651a;
        reentrantLock.lock();
        try {
            Collection arrayList = new ArrayList();
            C0247a.m836a("ScheduleQueue|removeByType|" + cls.getName());
            Iterator it = this.f653c.iterator();
            while (it.hasNext()) {
                C0233d c0233d = (C0233d) it.next();
                if (c0233d.getClass() == cls) {
                    arrayList.add(c0233d);
                }
            }
            C0247a.m836a("ScheduleQueue|removeByType|" + cls.getName() + "|" + arrayList.size());
            this.f653c.removeAll(arrayList);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    final boolean m861b() {
        ReentrantLock reentrantLock = this.f651a;
        reentrantLock.lock();
        try {
            boolean isEmpty = this.f653c.isEmpty();
            return isEmpty;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.igexin.p022a.p023a.p025d.C0233d m862c() {
        /*
        r10 = this;
        r2 = 1;
        r1 = 0;
        r3 = r10.f651a;
        r3.lockInterruptibly();
    L_0x0007:
        r4 = r10.m858a();	 Catch:{ all -> 0x0021 }
        if (r4 != 0) goto L_0x0026;
    L_0x000d:
        r0 = r10.f654d;	 Catch:{ all -> 0x0021 }
        r4 = 1;
        r0.set(r4);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        r10.f655e = r0;	 Catch:{ all -> 0x0021 }
        r0 = "ScheduleQueue|take|forever";
        com.igexin.p022a.p023a.p030c.C0247a.m836a(r0);	 Catch:{ all -> 0x0021 }
        r0 = r10.f652b;	 Catch:{ all -> 0x0021 }
        r0.await();	 Catch:{ all -> 0x0021 }
        goto L_0x0007;
    L_0x0021:
        r0 = move-exception;
        r3.unlock();
        throw r0;
    L_0x0026:
        r0 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0021 }
        r6 = r4.m735a(r0);	 Catch:{ all -> 0x0021 }
        r0 = r4.f568w;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x0034;
    L_0x0030:
        r0 = r4.f569x;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x004d;
    L_0x0034:
        r0 = r2;
    L_0x0035:
        r8 = 0;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x003d;
    L_0x003b:
        if (r0 == 0) goto L_0x0097;
    L_0x003d:
        r0 = r10.m856e();	 Catch:{ all -> 0x0021 }
        r1 = f650h;	 Catch:{ all -> 0x0021 }
        if (r1 != 0) goto L_0x004f;
    L_0x0045:
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x0021 }
        r0.<init>();	 Catch:{ all -> 0x0021 }
        throw r0;	 Catch:{ all -> 0x0021 }
    L_0x004d:
        r0 = r1;
        goto L_0x0035;
    L_0x004f:
        r1 = r10.m861b();	 Catch:{ all -> 0x0021 }
        if (r1 != 0) goto L_0x005a;
    L_0x0055:
        r1 = r10.f652b;	 Catch:{ all -> 0x0021 }
        r1.signalAll();	 Catch:{ all -> 0x0021 }
    L_0x005a:
        r1 = r10.f657g;	 Catch:{ all -> 0x0021 }
        r6 = -1;
        r1.set(r6);	 Catch:{ all -> 0x0021 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0021 }
        r1.<init>();	 Catch:{ all -> 0x0021 }
        r2 = "ScheduleQueue|take|";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0021 }
        r2 = r4.getClass();	 Catch:{ all -> 0x0021 }
        r2 = r2.getName();	 Catch:{ all -> 0x0021 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0021 }
        r2 = "|";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0021 }
        r2 = r4.hashCode();	 Catch:{ all -> 0x0021 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0021 }
        r2 = "|imediate";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0021 }
        r1 = r1.toString();	 Catch:{ all -> 0x0021 }
        com.igexin.p022a.p023a.p030c.C0247a.m836a(r1);	 Catch:{ all -> 0x0021 }
        r3.unlock();
        return r0;
    L_0x0097:
        r0 = new java.text.SimpleDateFormat;	 Catch:{ all -> 0x0021 }
        r5 = "yyyy-MM-dd HH:mm:ss";
        r0.<init>(r5);	 Catch:{ all -> 0x0021 }
        r5 = new java.util.Date;	 Catch:{ all -> 0x0021 }
        r8 = r4.f550F;	 Catch:{ all -> 0x0021 }
        r5.<init>(r8);	 Catch:{ all -> 0x0021 }
        r0 = r0.format(r5);	 Catch:{ all -> 0x0021 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0021 }
        r5.<init>();	 Catch:{ all -> 0x0021 }
        r8 = "ScheduleQueue|take|";
        r5 = r5.append(r8);	 Catch:{ all -> 0x0021 }
        r8 = r4.getClass();	 Catch:{ all -> 0x0021 }
        r8 = r8.getName();	 Catch:{ all -> 0x0021 }
        r5 = r5.append(r8);	 Catch:{ all -> 0x0021 }
        r8 = "|";
        r5 = r5.append(r8);	 Catch:{ all -> 0x0021 }
        r8 = r4.hashCode();	 Catch:{ all -> 0x0021 }
        r5 = r5.append(r8);	 Catch:{ all -> 0x0021 }
        r8 = "|";
        r5 = r5.append(r8);	 Catch:{ all -> 0x0021 }
        r0 = r5.append(r0);	 Catch:{ all -> 0x0021 }
        r0 = r0.toString();	 Catch:{ all -> 0x0021 }
        com.igexin.p022a.p023a.p030c.C0247a.m836a(r0);	 Catch:{ all -> 0x0021 }
        r0 = r10.f657g;	 Catch:{ all -> 0x0021 }
        r8 = r4.f550F;	 Catch:{ all -> 0x0021 }
        r0.set(r8);	 Catch:{ all -> 0x0021 }
        r0 = r10.f656f;	 Catch:{ all -> 0x0021 }
        r0 = r0.f629w;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x00f3;
    L_0x00ec:
        r0 = r10.f656f;	 Catch:{ all -> 0x0021 }
        r4 = r4.f550F;	 Catch:{ all -> 0x0021 }
        r0.m790a(r4);	 Catch:{ all -> 0x0021 }
    L_0x00f3:
        r0 = r10.f652b;	 Catch:{ all -> 0x0021 }
        r0.awaitNanos(r6);	 Catch:{ all -> 0x0021 }
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.a.a.d.c.c():com.igexin.a.a.d.d");
    }

    public final void m863d() {
        this.f653c.clear();
    }
}
