package com.alipay.apmobilesecuritysdk.p005b;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.alipay.apmobilesecuritysdk.b.a */
public final class C0086a {
    private static C0086a f104b;
    private int f105a;

    static {
        f104b = new C0086a();
    }

    public C0086a() {
        this.f105a = 0;
    }

    public static C0086a m134a() {
        return f104b;
    }

    public final void m135a(int i) {
        this.f105a = i;
    }

    public final int m136b() {
        return this.f105a;
    }

    public final String m137c() {
        if (C0110a.m237b(null)) {
            return null;
        }
        switch (this.f105a) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                return "http://mobilegw.stable.alipay.net/mgw.htm";
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                return "https://mobilegw.alipay.com/mgw.htm";
            case StatConstants.STAT_DB_VERSION /*3*/:
                return "http://mobilegw-1-64.test.alipay.net/mgw.htm";
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                return "http://mobilegw.aaa.alipay.net/mgw.htm";
            default:
                return "https://mobilegw.alipay.com/mgw.htm";
        }
    }
}
