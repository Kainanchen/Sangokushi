package com.tencent.mm.sdk.p063b;

import android.os.Looper;
import com.tencent.mm.sdk.p063b.C0594e.C0591a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.sdk.b.d */
public final class C0592d implements C0591a {
    private C0594e aJ;
    private ConcurrentHashMap<Runnable, WeakReference<C0596g>> aK;
    private int aL;
    private LinkedList<WeakReference<C0596g>> aM;

    public C0592d() {
        this.aK = new ConcurrentHashMap();
        this.aM = new LinkedList();
        this.aJ = new C0594e(this);
        if (this.aJ.getLooper().getThread().getName().equals("initThread")) {
            C0589b.m2017a("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", C0597h.m2034u());
        }
    }

    public C0592d(Looper looper) {
        this.aK = new ConcurrentHashMap();
        this.aM = new LinkedList();
        this.aJ = new C0594e(looper, this);
        if (looper.getThread().getName().equals("initThread")) {
            C0589b.m2017a("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", C0597h.m2034u());
        }
    }

    public final void m2029a(Runnable runnable, C0596g c0596g) {
        this.aK.put(runnable, new WeakReference(c0596g));
    }

    public final void m2030b(Runnable runnable, C0596g c0596g) {
        WeakReference weakReference = (WeakReference) this.aK.get(runnable);
        if (weakReference != null && weakReference.get() != null && weakReference.get() == c0596g) {
            this.aK.remove(runnable);
            if (this.aL > 0) {
                if (this.aM.size() == this.aL) {
                    this.aM.pop();
                }
                this.aM.add(weakReference);
            }
        }
    }

    public final boolean post(Runnable runnable) {
        return this.aJ.post(runnable);
    }

    public final String toString() {
        return "MMHandler(" + getClass().getName() + ")";
    }
}
