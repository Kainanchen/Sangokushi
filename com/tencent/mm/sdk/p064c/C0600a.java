package com.tencent.mm.sdk.p064c;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.mm.sdk.p063b.C0589b;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.tencent.mm.sdk.c.a */
public final class C0600a {

    /* renamed from: com.tencent.mm.sdk.c.a.a */
    public static final class C0598a {
        public static Object m2035a(int i, String str) {
            switch (i) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    return Integer.valueOf(str);
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    return Long.valueOf(str);
                case StatConstants.STAT_DB_VERSION /*3*/:
                    return str;
                case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                    return Boolean.valueOf(str);
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    return Float.valueOf(str);
                case StatAccount.EMAIL_TYPE /*6*/:
                    return Double.valueOf(str);
                default:
                    try {
                        C0589b.m2018b("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.c.a.b */
    public static final class C0599b implements BaseColumns {
        public static final Uri CONTENT_URI;

        static {
            CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
        }
    }
}
