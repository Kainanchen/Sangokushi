package com.igexin.getuiext.ui.promotion;

import android.content.Context;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.getuiext.ui.promotion.g */
public class C0317g {
    public static C0313c m1079a(Context context, C0323m c0323m) {
        switch (C0318h.f864a[c0323m.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                return new C0314d(context, c0323m);
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                return new C0319i(context, c0323m);
            case StatConstants.STAT_DB_VERSION /*3*/:
                return new C0321k(context, c0323m);
            default:
                return null;
        }
    }
}
