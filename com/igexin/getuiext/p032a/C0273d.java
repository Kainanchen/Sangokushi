package com.igexin.getuiext.p032a;

import com.igexin.getuiext.data.p034a.C0290c;
import java.util.Comparator;

/* renamed from: com.igexin.getuiext.a.d */
class C0273d implements Comparator {
    final /* synthetic */ C0272c f726a;

    C0273d(C0272c c0272c) {
        this.f726a = c0272c;
    }

    public int m960a(C0290c c0290c, C0290c c0290c2) {
        return c0290c.b != c0290c2.b ? c0290c.b.compareTo(c0290c2.b) : 0;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m960a((C0290c) obj, (C0290c) obj2);
    }
}
