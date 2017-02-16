package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Preconditions;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.e */
class Bucket<V> {
    public final int f2449a;
    public final int f2450b;
    final Queue f2451c;
    int f2452d;

    public Bucket(int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        Preconditions.m1035b(i > 0);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1035b(z);
        if (i3 < 0) {
            z2 = false;
        }
        Preconditions.m1035b(z2);
        this.f2449a = i;
        this.f2450b = i2;
        this.f2451c = new LinkedList();
        this.f2452d = i3;
    }

    @Nullable
    public V m2374a() {
        return this.f2451c.poll();
    }

    void m2375a(V v) {
        this.f2451c.add(v);
    }

    public final void m2376b() {
        Preconditions.m1035b(this.f2452d > 0);
        this.f2452d--;
    }
}
