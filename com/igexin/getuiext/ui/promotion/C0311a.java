package com.igexin.getuiext.ui.promotion;

/* renamed from: com.igexin.getuiext.ui.promotion.a */
public enum C0311a {
    DOWNLOAD("download"),
    OPEN_LINK("openlink"),
    UNKNOWN("unknown");
    
    private String f843d;

    private C0311a(String str) {
        this.f843d = str;
    }

    public static C0311a m1061a(String str) {
        return str.equals(DOWNLOAD.m1063b()) ? DOWNLOAD : str.equals(OPEN_LINK.m1063b()) ? OPEN_LINK : UNKNOWN;
    }

    public static C0311a[] m1062a() {
        return (C0311a[]) f842e.clone();
    }

    public String m1063b() {
        return this.f843d;
    }
}
