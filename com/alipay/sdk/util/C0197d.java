package com.alipay.sdk.util;

import com.igexin.sdk.PushBuildConfig;

/* renamed from: com.alipay.sdk.util.d */
public enum C0197d {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NONE(-1, PushBuildConfig.sdk_conf_debug_level);
    
    public String f497p;
    private int f498q;

    private C0197d(int i, String str) {
        this.f498q = i;
        this.f497p = str;
    }

    private int m649a() {
        return this.f498q;
    }

    private String m651b() {
        return this.f497p;
    }

    public static C0197d m650a(int i) {
        for (C0197d c0197d : C0197d.values()) {
            if (c0197d.f498q == i) {
                return c0197d;
            }
        }
        return NONE;
    }
}
