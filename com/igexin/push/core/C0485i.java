package com.igexin.push.core;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.igexin.push.config.C0378l;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import com.ut.device.AidConstants;

/* renamed from: com.igexin.push.core.i */
public class C0485i {
    private static C0485i f1341e;
    public long f1342a;
    private C0488l f1343b;
    private long f1344c;
    private ConnectivityManager f1345d;

    private C0485i() {
        this.f1342a = 240000;
        this.f1343b = C0488l.DETECT;
        this.f1344c = 0;
        this.f1345d = C0482f.m1694a().m1715j();
    }

    public static C0485i m1729a() {
        if (f1341e == null) {
            f1341e = new C0485i();
        }
        return f1341e;
    }

    public long m1730a(long j, long j2) {
        return j > j2 ? j : j2;
    }

    public void m1731a(long j) {
        this.f1342a = j;
    }

    public void m1732a(C0487k c0487k) {
        switch (C0486j.f1347b[this.f1343b.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                switch (C0486j.f1346a[c0487k.ordinal()]) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        m1731a(m1735b(this.f1342a + 60000, 420000));
                        m1733a(C0488l.DETECT);
                    case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        this.f1344c++;
                        if (this.f1344c >= 2) {
                            m1731a(m1730a(this.f1342a - 60000, 240000));
                            m1733a(C0488l.STABLE);
                        }
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        m1731a(240000);
                        m1733a(C0488l.DETECT);
                    default:
                }
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                switch (C0486j.f1346a[c0487k.ordinal()]) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        m1733a(C0488l.STABLE);
                    case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        m1731a(m1730a(this.f1342a - 60000, 240000));
                        this.f1344c++;
                        if (this.f1344c >= 2) {
                            m1731a(240000);
                            m1733a(C0488l.PENDING);
                        }
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        m1731a(240000);
                        m1733a(C0488l.DETECT);
                    default:
                }
            case StatConstants.STAT_DB_VERSION /*3*/:
                switch (C0486j.f1346a[c0487k.ordinal()]) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        m1731a(240000);
                        m1733a(C0488l.DETECT);
                    case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        m1733a(C0488l.PENDING);
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        m1731a(240000);
                        m1733a(C0488l.DETECT);
                    default:
                }
            default:
        }
    }

    public void m1733a(C0488l c0488l) {
        this.f1343b = c0488l;
        this.f1344c = 0;
    }

    public long m1734b() {
        long j = this.f1342a;
        if (C0378l.f1017d > 0) {
            j = (long) (C0378l.f1017d * AidConstants.EVENT_REQUEST_STARTED);
        }
        NetworkInfo activeNetworkInfo = this.f1345d.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) ? 3600000 : !C0483g.f1327m ? 3600000 : !C0482f.m1694a().m1712g().m1800a() ? 3600000 : j;
    }

    public long m1735b(long j, long j2) {
        return j < j2 ? j : j2;
    }
}
