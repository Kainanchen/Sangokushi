package com.igexin.push.core.p045a;

import com.igexin.push.core.bean.C0438l;
import java.util.Comparator;

/* renamed from: com.igexin.push.core.a.f */
class C0403f implements Comparator {
    final /* synthetic */ C0402e f1059a;

    C0403f(C0402e c0402e) {
        this.f1059a = c0402e;
    }

    public int m1407a(C0438l c0438l, C0438l c0438l2) {
        return c0438l.m1549d() != c0438l2.m1549d() ? c0438l.m1549d().compareTo(c0438l2.m1549d()) : 0;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m1407a((C0438l) obj, (C0438l) obj2);
    }
}
