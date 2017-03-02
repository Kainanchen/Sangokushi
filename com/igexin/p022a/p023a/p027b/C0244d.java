package com.igexin.p022a.p023a.p027b;

import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p025d.C0243e;
import com.igexin.p022a.p023a.p025d.p026a.C0248b;
import com.igexin.p022a.p023a.p025d.p026a.C0250d;
import com.igexin.p022a.p023a.p025d.p026a.C0252g;
import com.igexin.p022a.p031b.C0259a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.a.a.b.d */
public class C0244d extends C0243e {
    static C0244d f630a;
    public static boolean f631f;
    public volatile long f632b;
    public volatile long f633c;
    public volatile long f634d;
    public volatile long f635e;
    C0248b f636g;
    private byte[] f637y;
    private byte[] f638z;

    public static C0244d m802c() {
        if (f630a == null) {
            f630a = new C0244d();
        }
        return f630a;
    }

    public static void m803e() {
        f630a.f632b = 0;
        f630a.f634d = 0;
        f630a.f633c = 0;
        f630a.f635e = 0;
    }

    public C0234f m804a(String str, int i, C0242c c0242c) {
        return m806a(str, i, c0242c, null, false, -1, -1, (byte) 0, null, null);
    }

    public C0234f m805a(String str, int i, C0242c c0242c, Object obj, boolean z) {
        return m806a(str, i, c0242c, obj, z, -1, -1, (byte) 0, null, null);
    }

    public C0234f m806a(String str, int i, C0242c c0242c, Object obj, boolean z, int i2, long j, byte b, Object obj2, C0250d c0250d) {
        return m807a(str, i, c0242c, obj, z, i2, j, b, obj2, c0250d, 0, null);
    }

    public C0234f m807a(String str, int i, C0242c c0242c, Object obj, boolean z, int i2, long j, byte b, Object obj2, C0250d c0250d, int i3, C0252g c0252g) {
        if (this.f636g == null) {
            return null;
        }
        C0234f c0234f = (C0234f) this.f636g.m842a(str, Integer.valueOf(i), c0242c);
        if (c0234f == null || c0234f.m750q()) {
            return null;
        }
        if (c0252g != null) {
            c0234f.m737a(i3, c0252g);
        }
        m811a(c0234f, obj, z, i2, j, b, obj2, c0250d);
        return c0234f;
    }

    public C0234f m808a(String str, int i, C0242c c0242c, Object obj, boolean z, int i2, C0252g c0252g) {
        return m807a(str, i, c0242c, obj, z, -1, -1, (byte) 0, null, null, i2, c0252g);
    }

    public void m809a(C0248b c0248b) {
        this.f636g = c0248b;
    }

    public void m810a(byte[] bArr) {
        this.f637y = bArr;
        this.f638z = C0259a.m879a(bArr);
    }

    boolean m811a(C0234f c0234f, Object obj, boolean z, int i, long j, byte b, Object obj2, C0250d c0250d) {
        c0234f.f574c = obj;
        c0234f.m734a(j, TimeUnit.MILLISECONDS);
        c0234f.I = i;
        c0234f.m736a((int) b);
        c0234f.N = obj2;
        c0234f.m740a(c0250d);
        return m794a((C0233d) c0234f, z);
    }

    public byte[] m812a() {
        return this.f637y;
    }

    public byte[] m813b() {
        return this.f638z;
    }

    public final void m814d() {
        m800g();
    }
}
