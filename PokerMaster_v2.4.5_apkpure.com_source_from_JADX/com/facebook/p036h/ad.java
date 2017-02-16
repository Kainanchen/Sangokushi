package com.facebook.p036h;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: SmartLoginOption */
/* renamed from: com.facebook.h.ad */
public enum ad {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<ad> f1555d;
    private final long f1557e;

    static {
        f1555d = EnumSet.allOf(ad.class);
    }

    public static EnumSet<ad> m1482a(long j) {
        EnumSet<ad> noneOf = EnumSet.noneOf(ad.class);
        Iterator it = f1555d.iterator();
        while (it.hasNext()) {
            ad adVar = (ad) it.next();
            if ((adVar.f1557e & j) != 0) {
                noneOf.add(adVar);
            }
        }
        return noneOf;
    }

    private ad(long j) {
        this.f1557e = j;
    }
}
