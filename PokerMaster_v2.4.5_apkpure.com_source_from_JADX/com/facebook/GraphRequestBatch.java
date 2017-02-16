package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.r */
public final class GraphRequestBatch extends AbstractList<GraphRequest> {
    private static AtomicInteger f2728g;
    Handler f2729a;
    List<GraphRequest> f2730b;
    int f2731c;
    final String f2732d;
    List<GraphRequestBatch> f2733e;
    String f2734f;

    /* renamed from: com.facebook.r.a */
    public interface GraphRequestBatch {
        void m905a();
    }

    /* renamed from: com.facebook.r.b */
    public interface GraphRequestBatch extends GraphRequestBatch {
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.f2730b.add(i, (GraphRequest) obj);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.f2730b.add((GraphRequest) obj);
    }

    public final /* synthetic */ Object get(int i) {
        return m2646a(i);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return (GraphRequest) this.f2730b.set(i, (GraphRequest) obj);
    }

    static {
        f2728g = new AtomicInteger();
    }

    public GraphRequestBatch() {
        this.f2730b = new ArrayList();
        this.f2731c = 0;
        this.f2732d = Integer.valueOf(f2728g.incrementAndGet()).toString();
        this.f2733e = new ArrayList();
        this.f2730b = new ArrayList();
    }

    public GraphRequestBatch(Collection<GraphRequest> collection) {
        this.f2730b = new ArrayList();
        this.f2731c = 0;
        this.f2732d = Integer.valueOf(f2728g.incrementAndGet()).toString();
        this.f2733e = new ArrayList();
        this.f2730b = new ArrayList(collection);
    }

    public GraphRequestBatch(GraphRequest... graphRequestArr) {
        this.f2730b = new ArrayList();
        this.f2731c = 0;
        this.f2732d = Integer.valueOf(f2728g.incrementAndGet()).toString();
        this.f2733e = new ArrayList();
        this.f2730b = Arrays.asList(graphRequestArr);
    }

    public final void clear() {
        this.f2730b.clear();
    }

    public final GraphRequest m2646a(int i) {
        return (GraphRequest) this.f2730b.get(i);
    }

    public final int size() {
        return this.f2730b.size();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return (GraphRequest) this.f2730b.remove(i);
    }
}
