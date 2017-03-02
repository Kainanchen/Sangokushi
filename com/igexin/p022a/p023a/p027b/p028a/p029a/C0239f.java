package com.igexin.p022a.p023a.p027b.p028a.p029a;

import java.util.Comparator;

/* renamed from: com.igexin.a.a.b.a.a.f */
class C0239f implements Comparator {
    final /* synthetic */ C0238e f600a;

    C0239f(C0238e c0238e) {
        this.f600a = c0238e;
    }

    public int m778a(C0240g c0240g, C0240g c0240g2) {
        return c0240g == null ? 1 : c0240g2 == null ? -1 : ((long) c0240g.J) + c0240g.H <= ((long) c0240g2.J) + c0240g2.H ? ((long) c0240g.J) + c0240g.H < ((long) c0240g2.J) + c0240g2.H ? -1 : 0 : 1;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m778a((C0240g) obj, (C0240g) obj2);
    }
}
