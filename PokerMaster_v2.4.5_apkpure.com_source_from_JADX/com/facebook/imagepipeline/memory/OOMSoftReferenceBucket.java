package com.facebook.imagepipeline.memory;

import com.facebook.common.p017h.OOMSoftReference;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.p */
final class OOMSoftReferenceBucket<V> extends Bucket<V> {
    private LinkedList<OOMSoftReference<V>> f2468e;

    public OOMSoftReferenceBucket(int i, int i2) {
        super(i, i2, 0);
        this.f2468e = new LinkedList();
    }

    public final V m2422a() {
        OOMSoftReference oOMSoftReference = (OOMSoftReference) this.c.poll();
        V v = oOMSoftReference.f1127a == null ? null : oOMSoftReference.f1127a.get();
        if (oOMSoftReference.f1127a != null) {
            oOMSoftReference.f1127a.clear();
            oOMSoftReference.f1127a = null;
        }
        if (oOMSoftReference.f1128b != null) {
            oOMSoftReference.f1128b.clear();
            oOMSoftReference.f1128b = null;
        }
        if (oOMSoftReference.f1129c != null) {
            oOMSoftReference.f1129c.clear();
            oOMSoftReference.f1129c = null;
        }
        this.f2468e.add(oOMSoftReference);
        return v;
    }

    final void m2423a(V v) {
        OOMSoftReference oOMSoftReference = (OOMSoftReference) this.f2468e.poll();
        if (oOMSoftReference == null) {
            oOMSoftReference = new OOMSoftReference();
        }
        oOMSoftReference.f1127a = new SoftReference(v);
        oOMSoftReference.f1128b = new SoftReference(v);
        oOMSoftReference.f1129c = new SoftReference(v);
        this.c.add(oOMSoftReference);
    }
}
