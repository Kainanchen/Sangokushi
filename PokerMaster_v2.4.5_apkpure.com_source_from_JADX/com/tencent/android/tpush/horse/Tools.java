package com.tencent.android.tpush.horse;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.horse.data.OptStrategyList;
import com.tencent.android.tpush.p067a.ProGuard;
import com.tencent.android.tpush.service.cache.CacheManager;
import java.util.Iterator;

/* compiled from: ProGuard */
public class Tools {
    public static final String KEY = ".com.tencent.tpush.toolschannel";
    public static final String SHARE_NAME = ".com.tencent.tpush.toolschannel_name";
    public static final String STRATEGY = ".com.tencent.tpush.toolsstrategy";
    public static final String TOOLS_NAME_UNI_SUFFIX = ".com.tencent.tpush.tools";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_HTTP = 2;
    public static final int TYPE_HTTP_WAP = 3;
    public static final int TYPE_TCP = 1;

    public static void clearOptKeyList(Context context) {
        if (context != null) {
            CacheManager.clearOptKeyList(context);
        }
    }

    public static void clearOptStrategyItem(Context context) {
        if (context != null) {
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(Constants.ServiceLogTag, "Action -> clearOptStrategyItem(" + context.getPackageName() + ")");
            }
            try {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, com.tencent.android.tpush.service.p077d.ProGuard.m5341h(com.tencent.android.tpush.service.ProGuard.m5376e()) + ".com.tencent.tpush.cache.redirect", LetterIndexBar.SEARCH_ICON_LETTER, true);
                Iterator it = CacheManager.getOptKeyList(context).iterator();
                while (it.hasNext()) {
                    CacheManager.addOptStrategyList(context, (String) it.next(), new OptStrategyList());
                }
            } catch (Throwable e) {
                CacheManager.clearOptKeyList(com.tencent.android.tpush.service.ProGuard.m5376e());
                ProGuard.m4719d(Constants.ServiceLogTag, "clearOptStrategyItem error", e);
            }
            CacheManager.addOptStrategyList(context, com.tencent.android.tpush.service.p077d.ProGuard.m5341h(context), new OptStrategyList());
        }
    }

    public static void clearCacheServerItems(Context context) {
        if (context != null) {
            if (XGPushConfig.enableDebug) {
                ProGuard.m4720e(Constants.ServiceLogTag, "Action -> clearCacheServerItems(" + context.getPackageName() + ")");
            }
            try {
                CacheManager.clearDomainServerItem(context);
                CacheManager.saveDomain(context, LetterIndexBar.SEARCH_ICON_LETTER);
                CacheManager.saveDomainKeyList(context, null);
                com.tencent.android.tpush.service.p071a.ProGuard.m4972a(context).m4978a(0);
            } catch (Throwable th) {
                ProGuard.m4719d(Constants.ServiceLogTag, "clearCacheServerItems error", th);
            }
        }
    }

    public static void clearMultPkgs(Context context) {
        if (context != null) {
            try {
                com.tencent.android.tpush.service.p072b.ProGuard.m5094a().m5098a(context);
            } catch (Throwable e) {
                ProGuard.m4716c(Constants.ServiceLogTag, "clearMultPkgs", e);
            }
        }
    }

    public static void clearRegisterInfo(Context context, long j) {
        if (context != null) {
            try {
                CacheManager.removeRegisterInfoByPkgName(context.getPackageName());
            } catch (Throwable e) {
                ProGuard.m4716c(Constants.ServiceLogTag, "clearRegisterInfo", e);
            }
        }
    }

    public static void setChannelType(Context context, int i) {
        if (context != null) {
            com.tencent.android.tpush.service.p077d.ProGuard.m5312a(context, KEY, i);
        }
    }

    public static int getChannelType(Context context) {
        if (context != null) {
            return com.tencent.android.tpush.service.p077d.ProGuard.m5319b(context, KEY, (int) TYPE_DEFAULT);
        }
        return TYPE_DEFAULT;
    }

    public static void clearAll(Context context) {
        clearOptKeyList(context);
        clearCacheServerItems(context);
        clearOptStrategyItem(context);
        clearMultPkgs(context);
        XGPushManager.clearLocalNotifications(context);
        com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, Constants.IS_CACHE_CLEAR, Constants.IS_CLEAR_CACHE, true);
    }
}
