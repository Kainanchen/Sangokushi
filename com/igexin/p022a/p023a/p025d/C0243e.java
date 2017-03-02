package com.igexin.p022a.p023a.p025d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.igexin.p022a.p023a.p025d.p026a.C0229f;
import com.igexin.p022a.p023a.p025d.p026a.C0249c;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0238e;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.p040c.p043c.C0364n;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.igexin.a.a.d.e */
public class C0243e extends BroadcastReceiver implements Comparator {
    public static final String f612i;
    public static final long f613x;
    private boolean f614a;
    public String f615h;
    final C0258i f616j;
    final HashMap f617k;
    final ConcurrentLinkedQueue f618l;
    final C0254c f619m;
    final ReentrantLock f620n;
    final ReentrantLock f621o;
    PowerManager f622p;
    AlarmManager f623q;
    Intent f624r;
    PendingIntent f625s;
    Intent f626t;
    PendingIntent f627u;
    String f628v;
    volatile boolean f629w;

    static {
        f612i = C0243e.class.getSimpleName();
        f613x = TimeUnit.SECONDS.toMillis(2);
    }

    protected C0243e() {
        this.f615h = getClass().getSimpleName();
        this.f620n = new ReentrantLock();
        this.f621o = new ReentrantLock();
        this.f614a = false;
        this.f617k = new HashMap(7);
        this.f619m = new C0254c(this, this);
        this.f618l = new ConcurrentLinkedQueue();
        this.f616j = new C0258i(this);
        C0233d.f544P = this;
    }

    public final int m789a(C0233d c0233d, C0233d c0233d2) {
        int i = c0233d.f556L > c0233d2.f556L ? -1 : c0233d.f556L < c0233d2.f556L ? 1 : c0233d.f551G < c0233d2.f551G ? -1 : c0233d.f551G > c0233d2.f551G ? 1 : 0;
        if (c0233d.f550F != c0233d2.f550F) {
            i = c0233d.f550F < c0233d2.f550F ? -1 : 1;
        }
        return i == 0 ? c0233d.hashCode() - c0233d2.hashCode() : i;
    }

    public final void m790a(long j) {
        if (this.f629w) {
            if (j < 0) {
                j = System.currentTimeMillis() + f613x;
            }
            try {
                if (this.f625s == null) {
                    return;
                }
                if (VERSION.SDK_INT < 19) {
                    this.f623q.set(0, j, this.f625s);
                    return;
                }
                try {
                    this.f623q.setExact(0, j, this.f625s);
                } catch (Exception e) {
                    this.f623q.set(0, j, this.f625s);
                }
            } catch (Exception e2) {
            }
        }
    }

    public final void m791a(Context context) {
        if (!this.f614a) {
            this.f622p = (PowerManager) context.getSystemService("power");
            this.f629w = true;
            this.f623q = (AlarmManager) context.getSystemService("alarm");
            context.registerReceiver(this, new IntentFilter("AlarmTaskSchedule." + context.getPackageName()));
            context.registerReceiver(this, new IntentFilter("AlarmTaskScheduleBak." + context.getPackageName()));
            context.registerReceiver(this, new IntentFilter("android.intent.action.SCREEN_OFF"));
            context.registerReceiver(this, new IntentFilter("android.intent.action.SCREEN_ON"));
            this.f628v = "AlarmNioTaskSchedule." + context.getPackageName();
            context.registerReceiver(this, new IntentFilter(this.f628v));
            this.f624r = new Intent("AlarmTaskSchedule." + context.getPackageName());
            this.f625s = PendingIntent.getBroadcast(context, hashCode(), this.f624r, 134217728);
            this.f626t = new Intent(this.f628v);
            this.f627u = PendingIntent.getBroadcast(context, hashCode() + 2, this.f626t, 134217728);
            this.f616j.start();
            Thread.yield();
            this.f614a = true;
        }
    }

    public final boolean m792a(C0249c c0249c) {
        if (c0249c == null) {
            throw new NullPointerException();
        }
        ReentrantLock reentrantLock = this.f620n;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            if (this.f617k.keySet().contains(Long.valueOf(c0249c.m846o()))) {
                return false;
            }
            this.f617k.put(Long.valueOf(c0249c.m846o()), c0249c);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            C0247a.m838b(this.f615h + "|" + th.toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    final boolean m793a(C0229f c0229f, C0249c c0249c) {
        int b = c0229f.m726b();
        if (b <= Integer.MIN_VALUE || b >= 0) {
            return (b < 0 || b >= Integer.MAX_VALUE) ? false : c0249c.m843a(c0229f, this);
        } else {
            C0233d c0233d = (C0233d) c0229f;
            boolean a = c0233d.f549E ? c0249c.m844a(c0233d, this) : c0249c.m843a(c0229f, this);
            if (a) {
                c0233d.m741c();
            }
            return a;
        }
    }

    public final boolean m794a(C0233d c0233d, boolean z) {
        int i = 0;
        if (c0233d == null) {
            throw new NullPointerException();
        } else if (c0233d.f545A || c0233d.f568w) {
            return false;
        } else {
            C0254c c0254c = this.f619m;
            if (z) {
                i = c0254c.f654d.incrementAndGet();
            }
            c0233d.f556L = i;
            return c0254c.m859a(c0233d);
        }
    }

    public final boolean m795a(C0233d c0233d, boolean z, boolean z2) {
        boolean z3 = true;
        if (c0233d == null) {
            throw new NullPointerException();
        } else if (c0233d.f569x) {
            return false;
        } else {
            if (!z || z2) {
                if (!(z2 && z)) {
                    z3 = false;
                }
                return m794a(c0233d, z3);
            }
            c0233d.m742d();
            try {
                c0233d.a_();
                c0233d.m752s();
                c0233d.m754u();
                if (!c0233d.f549E) {
                    c0233d.m741c();
                }
                return true;
            } catch (Exception e) {
                c0233d.f549E = true;
                c0233d.f557M = e;
                c0233d.m748o();
                c0233d.m755v();
                m797a((Object) c0233d);
                m800g();
                if (c0233d.f549E) {
                    return false;
                }
                c0233d.m741c();
                return false;
            } catch (Throwable th) {
                if (!c0233d.f549E) {
                    c0233d.m741c();
                }
            }
        }
    }

    public final boolean m796a(Class cls) {
        C0254c c0254c = this.f619m;
        return c0254c != null ? c0254c.m860a(cls) : false;
    }

    public final boolean m797a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof C0364n) {
                C0247a.m836a("TaskService|responseTask|" + obj.getClass().getName() + "|" + obj.hashCode() + "|" + ((String) ((C0364n) obj).f991e));
            } else {
                C0247a.m836a("TaskService|responseTask|" + obj.getClass().getName() + "|" + obj.hashCode());
            }
        } catch (Exception e) {
        }
        if (obj instanceof C0229f) {
            C0229f c0229f = (C0229f) obj;
            if (c0229f.m727j()) {
                return false;
            }
            c0229f.m725a(false);
            this.f618l.offer(c0229f);
            return true;
        }
        throw new ClassCastException("response Obj is not a TaskResult ");
    }

    public final void m798b(long j) {
        C0247a.m836a("setnioalarm|" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j)));
        if (j < 0) {
            j = System.currentTimeMillis() + f613x;
        }
        if (this.f627u == null) {
            return;
        }
        if (VERSION.SDK_INT < 19) {
            this.f623q.set(0, j, this.f627u);
            return;
        }
        try {
            this.f623q.setExact(0, j, this.f627u);
        } catch (Exception e) {
            this.f623q.set(0, j, this.f627u);
        }
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m789a((C0233d) obj, (C0233d) obj2);
    }

    public final void m799f() {
        if (this.f627u != null) {
            this.f623q.cancel(this.f627u);
        }
    }

    protected final void m800g() {
        if (this.f616j != null && !this.f616j.isInterrupted()) {
            this.f616j.interrupt();
        }
    }

    final void m801h() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x00ba in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:58)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r9 = this;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0002:
        r0 = r9.f618l;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00d3;
    L_0x000a:
        r0 = r9.f618l;
        r0 = r0.poll();
        r0 = (com.igexin.p022a.p023a.p025d.p026a.C0229f) r0;
        r1 = 1;
        r0.m725a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "TaskService|notifyObserver|";
        r1 = r1.append(r2);
        r2 = r0.getClass();
        r2 = r2.getName();
        r1 = r1.append(r2);
        r2 = "|";
        r1 = r1.append(r2);
        r2 = r0.hashCode();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.igexin.p022a.p023a.p030c.C0247a.m836a(r1);
        r2 = 0;
        r3 = r9.f620n;
        r3.lock();
        r1 = r9.f617k;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r1 != 0) goto L_0x0073;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x0050:
        r4 = r0.m728k();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r6 = 0;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r1 == 0) goto L_0x0087;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x005a:
        r1 = r9.f617k;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = r1.get(r4);	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = (com.igexin.p022a.p023a.p025d.p026a.C0249c) r1;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r1 == 0) goto L_0x00d4;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x0068:
        r4 = r1.m845n();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r4 == 0) goto L_0x00d4;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x006e:
        r1 = r9.m793a(r0, r1);	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x0072:
        r2 = r1;
    L_0x0073:
        if (r2 != 0) goto L_0x0082;
    L_0x0075:
        r1 = r0.m726b();
        if (r1 <= r8) goto L_0x0082;
    L_0x007b:
        if (r1 >= 0) goto L_0x0082;
    L_0x007d:
        r0 = (com.igexin.p022a.p023a.p025d.C0233d) r0;
        r0.m741c();
    L_0x0082:
        r3.unlock();
        goto L_0x0002;
    L_0x0087:
        r1 = r9.f617k;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = r1.values();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r4 = r1.iterator();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x0091:
        r1 = r4.hasNext();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r1 == 0) goto L_0x0073;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x0097:
        r1 = r4.next();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r1 = (com.igexin.p022a.p023a.p025d.p026a.C0249c) r1;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        r5 = r1.m845n();	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r5 == 0) goto L_0x0091;	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
    L_0x00a3:
        r2 = r9.m793a(r0, r1);	 Catch:{ Exception -> 0x00aa, all -> 0x00bf }
        if (r2 == 0) goto L_0x0091;
    L_0x00a9:
        goto L_0x0073;
    L_0x00aa:
        r1 = move-exception;
        if (r2 != 0) goto L_0x00ba;
    L_0x00ad:
        r1 = r0.m726b();
        if (r1 <= r8) goto L_0x00ba;
    L_0x00b3:
        if (r1 >= 0) goto L_0x00ba;
    L_0x00b5:
        r0 = (com.igexin.p022a.p023a.p025d.C0233d) r0;
        r0.m741c();
    L_0x00ba:
        r3.unlock();
        goto L_0x0002;
    L_0x00bf:
        r1 = move-exception;
        if (r2 != 0) goto L_0x00cf;
    L_0x00c2:
        r2 = r0.m726b();
        if (r2 <= r8) goto L_0x00cf;
    L_0x00c8:
        if (r2 >= 0) goto L_0x00cf;
    L_0x00ca:
        r0 = (com.igexin.p022a.p023a.p025d.C0233d) r0;
        r0.m741c();
    L_0x00cf:
        r3.unlock();
        throw r1;
    L_0x00d3:
        return;
    L_0x00d4:
        r1 = r2;
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.a.a.d.e.h():void");
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f629w = true;
            C0247a.m838b("screenoff");
            if (this.f619m.f657g.get() > 0) {
                m790a(this.f619m.f657g.get());
            }
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f629w = false;
            C0247a.m838b("screenon");
        } else if (intent.getAction().startsWith("AlarmTaskSchedule.") || intent.getAction().startsWith("AlarmTaskScheduleBak.")) {
            C0247a.m836a("receivealarm|" + this.f629w);
            m800g();
        } else if (this.f628v.equals(intent.getAction())) {
            C0247a.m836a("receivenioalarm");
            try {
                if (C0238e.m769h() != null) {
                    C0238e.m769h().m777i();
                }
            } catch (Exception e) {
            }
        }
    }
}
