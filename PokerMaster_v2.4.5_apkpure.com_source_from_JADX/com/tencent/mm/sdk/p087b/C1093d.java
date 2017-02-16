package com.tencent.mm.sdk.p087b;

import android.os.Looper;
import com.tencent.mm.sdk.p087b.C1095e.C1092a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.sdk.b.d */
public final class C1093d implements C1092a {
    private C1095e aJ;
    private ConcurrentHashMap<Runnable, WeakReference<C1097g>> aK;
    private int aL;
    private LinkedList<WeakReference<C1097g>> aM;

    public C1093d() {
        this.aK = new ConcurrentHashMap();
        this.aM = new LinkedList();
        this.aJ = new C1095e(this);
        if (this.aJ.getLooper().getThread().getName().equals("initThread")) {
            C1090b.m5873a("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", C1098h.m5890u());
        }
    }

    public C1093d(Looper looper) {
        this.aK = new ConcurrentHashMap();
        this.aM = new LinkedList();
        this.aJ = new C1095e(looper, this);
        if (looper.getThread().getName().equals("initThread")) {
            C1090b.m5873a("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", C1098h.m5890u());
        }
    }

    public final void m5885a(Runnable runnable, C1097g c1097g) {
        this.aK.put(runnable, new WeakReference(c1097g));
    }

    public final void m5886b(Runnable runnable, C1097g c1097g) {
        WeakReference weakReference = (WeakReference) this.aK.get(runnable);
        if (weakReference != null && weakReference.get() != null && weakReference.get() == c1097g) {
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
