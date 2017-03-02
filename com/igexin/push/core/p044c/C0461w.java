package com.igexin.push.core.p044c;

import com.igexin.getuiext.data.Consts;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0483g;
import com.tencent.wxop.stat.common.StatConstants;
import java.util.List;

/* renamed from: com.igexin.push.core.c.w */
public class C0461w {
    private static int f1226a;
    private static int f1227b;
    private static int f1228c;
    private static List f1229d;
    private static C0463y f1230e;
    private static int f1231f;

    static {
        f1226a = 0;
        f1227b = 0;
        f1228c = 0;
        f1230e = C0463y.NORMAL;
        f1231f = 0;
    }

    public static void m1626a() {
        String e = C0461w.m1632e();
        if (e == null) {
            int i;
            if (!C0378l.f1019f) {
                C0247a.m838b("ServerAddressManager switch from normal domain!");
                f1227b++;
                if (f1227b >= 3) {
                    f1227b = 0;
                    i = f1226a + 1;
                    f1226a = i;
                    f1226a = i % SDKUrlConfig.XFR_ADDRESS_IPS.length;
                }
                e = SDKUrlConfig.XFR_ADDRESS_IPS[f1226a];
                C0247a.m838b("retry connect to " + e + " " + f1227b + " times");
            } else if (f1230e == C0463y.BACKUP) {
                i = f1226a + 1;
                f1226a = i;
                f1226a = i % SDKUrlConfig.XFR_ADDRESS_IPS_BAK.length;
                e = SDKUrlConfig.XFR_ADDRESS_IPS_BAK[f1226a];
                C0247a.m838b("ServerAddressManager switch from backup domain, address : " + e);
            } else {
                i = f1226a + 1;
                f1226a = i;
                f1226a = i % SDKUrlConfig.XFR_ADDRESS_IPS.length;
                e = SDKUrlConfig.XFR_ADDRESS_IPS[f1226a];
                C0247a.m838b("ServerAddressManager switch from normal domain, address : " + e);
            }
        }
        C0247a.m838b("ServerAddressManager SERVER_CM_Address changed : form [" + SDKUrlConfig.getCmAddress() + "] to [" + e + "]");
        SDKUrlConfig.setCmAddress(e);
    }

    private static void m1627a(C0463y c0463y) {
        if (C0378l.f1019f) {
            if (f1230e != c0463y) {
                C0461w.m1628a(null);
            }
            switch (C0462x.f1232a[c0463y.ordinal()]) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    break;
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    if (f1230e != c0463y) {
                        C0444f.m1577a().m1606e(System.currentTimeMillis());
                    }
                    SDKUrlConfig.setCmAddress(SDKUrlConfig.XFR_ADDRESS_IPS_BAK[0]);
                    break;
                case StatConstants.STAT_DB_VERSION /*3*/:
                    if (f1230e != c0463y) {
                        f1231f = 0;
                        break;
                    }
                    break;
            }
            SDKUrlConfig.setCmAddress(SDKUrlConfig.XFR_ADDRESS_IPS[0]);
            f1230e = c0463y;
        }
    }

    public static void m1628a(List list) {
        f1229d = list;
        f1228c = 0;
    }

    public static void m1629b() {
        switch (C0462x.f1232a[f1230e.ordinal()]) {
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                if (System.currentTimeMillis() - C0483g.f1305Q > Consts.TIME_24HOUR) {
                    C0461w.m1627a(C0463y.TRY_NORMAL);
                }
            default:
        }
    }

    public static void m1630c() {
        switch (C0462x.f1232a[f1230e.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                C0444f.m1577a().m1597b(System.currentTimeMillis());
            case StatConstants.STAT_DB_VERSION /*3*/:
                C0461w.m1627a(C0463y.NORMAL);
            default:
        }
    }

    public static void m1631d() {
        C0461w.m1633f();
        if (C0483g.f1327m) {
            C0444f.m1577a().m1597b(System.currentTimeMillis());
        }
        switch (C0462x.f1232a[f1230e.ordinal()]) {
            case StatConstants.STAT_DB_VERSION /*3*/:
                int i = f1231f + 1;
                f1231f = i;
                if (i >= 10) {
                    C0461w.m1627a(C0463y.BACKUP);
                }
            default:
        }
    }

    private static String m1632e() {
        if (f1229d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            while (!f1229d.isEmpty()) {
                if (f1228c >= f1229d.size()) {
                    f1228c = 0;
                }
                C0464z c0464z = (C0464z) f1229d.get(f1228c);
                if (c0464z.f1238b < currentTimeMillis) {
                    f1229d.remove(c0464z);
                } else {
                    f1228c++;
                    return c0464z.f1237a;
                }
            }
        }
        return null;
    }

    private static void m1633f() {
        switch (C0462x.f1232a[f1230e.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                long currentTimeMillis = System.currentTimeMillis();
                if (C0483g.f1304P != 0 && currentTimeMillis - C0483g.f1304P > 1296000000) {
                    if (currentTimeMillis - C0483g.f1305Q > Consts.TIME_24HOUR) {
                        C0461w.m1627a(C0463y.TRY_NORMAL);
                    } else {
                        C0461w.m1627a(C0463y.BACKUP);
                    }
                }
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                if (System.currentTimeMillis() - C0483g.f1305Q > Consts.TIME_24HOUR) {
                    C0461w.m1627a(C0463y.TRY_NORMAL);
                }
            default:
        }
    }
}
