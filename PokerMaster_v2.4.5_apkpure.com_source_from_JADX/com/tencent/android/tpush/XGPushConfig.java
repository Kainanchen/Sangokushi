package com.tencent.android.tpush;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.p067a.ProGuard;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.security.TpnsSecurity;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK, EType.INTENTCHECK})
/* compiled from: ProGuard */
public class XGPushConfig {
    public static final String TPUSH_ACCESS_ID = "XG_V2_ACCESS_ID";
    public static final String TPUSH_ACCESS_KEY = "XG_V2_ACCESS_KEY";
    private static final String f7256a;
    private static String f7257b;
    private static String f7258c;
    private static long f7259d;
    private static String f7260e;
    public static boolean enableDebug;

    static {
        f7256a = XGPushConfig.class.getSimpleName();
        f7257b = LetterIndexBar.SEARCH_ICON_LETTER;
        f7258c = LetterIndexBar.SEARCH_ICON_LETTER;
        f7259d = -1;
        f7260e = LetterIndexBar.SEARCH_ICON_LETTER;
        enableDebug = false;
    }

    public static synchronized long getAccessId(Context context) {
        long j;
        synchronized (XGPushConfig.class) {
            if (context == null) {
                j = f7259d;
            } else if (f7259d != -1) {
                j = f7259d;
            } else if (TpnsSecurity.checkTpnsSecurityLibSo(context)) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (defaultSharedPreferences != null) {
                    String string = defaultSharedPreferences.getString(TPUSH_ACCESS_ID, null);
                    if (string != null) {
                        try {
                            f7259d = Long.valueOf(Rijndael.decrypt(string)).longValue();
                        } catch (Throwable e) {
                            f7259d = -1;
                            ProGuard.m4711b(f7256a, "get accessId error", e);
                        }
                    }
                }
                if (f7259d == -1) {
                    Object a = com.tencent.android.tpush.common.ProGuard.m4789a(context, TPUSH_ACCESS_ID, null);
                    if (a != null) {
                        try {
                            f7259d = Long.valueOf(a.toString()).longValue();
                        } catch (Throwable e2) {
                            ProGuard.m4711b(Constants.LogTag, "get accessId from getMetaData failed: ", e2);
                            f7259d = -1;
                        }
                    }
                }
                if (f7259d == -1) {
                    ProGuard.m4723h(Constants.LogTag, "accessId\u6ca1\u6709\u521d\u59cb\u5316");
                }
                j = f7259d;
            } else {
                j = f7259d;
            }
        }
        return j;
    }

    public static void setAccessId(Context context, long j) {
        if (context == null) {
            ProGuard.m4723h(f7256a, "null  context");
            return;
        }
        f7259d = j;
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context, j));
    }

    public static synchronized String getAccessKey(Context context) {
        String str = null;
        synchronized (XGPushConfig.class) {
            if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(f7260e)) {
                str = f7260e;
            } else if (TpnsSecurity.checkTpnsSecurityLibSo(context)) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (defaultSharedPreferences != null) {
                    str = defaultSharedPreferences.getString(TPUSH_ACCESS_KEY, null);
                    if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
                        f7260e = Rijndael.decrypt(str);
                    }
                }
                if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(f7260e)) {
                    Object a = com.tencent.android.tpush.common.ProGuard.m4789a(context, TPUSH_ACCESS_KEY, null);
                    if (a != null) {
                        f7260e = a.toString();
                    }
                }
                if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(f7260e)) {
                    ProGuard.m4723h(f7256a, "accessKey is null");
                }
                str = f7260e;
            }
        }
        return str;
    }

    public static void setAccessKey(Context context, String str) {
        if (context == null || str == null) {
            ProGuard.m4723h(Constants.LogTag, "null context or null accessKey");
            return;
        }
        f7260e = str;
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context, str));
    }

    public static String getToken(Context context) {
        if (context != null) {
            return CacheManager.getToken(context);
        }
        ProGuard.m4723h(Constants.LogTag, "null context");
        return null;
    }

    public static void enableDebug(Context context, boolean z) {
        if (context != null) {
            enableDebug = z;
            com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context, z));
        }
    }

    public static boolean isEnableDebug(Context context) {
        return com.tencent.android.tpush.service.p077d.ProGuard.m5319b(context, new StringBuilder("com.tencent.android.tpush.debug,").append(context.getPackageName()).toString(), 0) != 0;
    }

    public static List getAccessidList(Context context) {
        ArrayList arrayList = new ArrayList(2);
        if (context != null) {
            long accessId = getAccessId(context);
            if (accessId > 0) {
                arrayList.add(Long.valueOf(accessId));
            }
            accessId = XGPush4Msdk.getQQAccessId(context);
            if (accessId > 0) {
                arrayList.add(Long.valueOf(accessId));
            }
            Object a = com.tencent.android.tpush.common.ProGuard.m4789a(context, TPUSH_ACCESS_ID, null);
            if (a != null) {
                try {
                    accessId = Long.valueOf(a.toString()).longValue();
                    if (!arrayList.contains(Long.valueOf(accessId))) {
                        arrayList.add(Long.valueOf(accessId));
                    }
                } catch (Throwable e) {
                    ProGuard.m4711b(f7256a, "get accessId from getMetaData failed: ", e);
                }
            }
        }
        return arrayList;
    }

    public static void setInstallChannel(Context context, String str) {
        if (context != null && str != null && str.trim().length() != 0) {
            f7257b = str;
        }
    }

    public static String getInstallChannel(Context context) {
        return f7257b;
    }

    public static void setGameServer(Context context, String str) {
        if (context != null && str != null && str.trim().length() != 0) {
            f7258c = str;
        }
    }

    public static String getGameServer(Context context) {
        return f7258c;
    }

    public static void setHeartbeatIntervalMs(Context context, int i) {
        if (context != null && i >= 5000 && i < 1800000) {
            try {
                com.tencent.android.tpush.common.ProGuard.m4818b(context, "com.tencent.android.xg.wx.HeartbeatIntervalMs", i);
            } catch (Throwable e) {
                ProGuard.m4716c(f7256a, "setHeartbeatIntervalMs", e);
            }
        }
    }

    public static void setReportDebugMode(Context context, boolean z) {
        if (context != null) {
            com.tencent.android.tpush.service.channel.p076c.ProGuard.m5255a(context).m5258a(context.getPackageName() + ".report.mode", z ? 1 : 0);
        }
    }

    public static boolean getReportDebugMode(Context context) {
        if (com.tencent.android.tpush.service.channel.p076c.ProGuard.m5255a(context).m5262b(context.getPackageName() + ".report.mode", 0) != 0) {
            return true;
        }
        return false;
    }

    public static void setOtherPushAppId(Context context, String str) {
        if (com.tencent.android.tpush.common.ProGuard.m4823a(context).m4825b()) {
            com.tencent.android.tpush.p069c.ProGuard.m4776a(context, str);
        }
    }

    public static String getOtherPushAppId(Context context) {
        if (com.tencent.android.tpush.common.ProGuard.m4823a(context).m4825b()) {
            return com.tencent.android.tpush.p069c.ProGuard.m4783e(context);
        }
        return null;
    }

    public static void setOtherPushAppKey(Context context, String str) {
        if (com.tencent.android.tpush.common.ProGuard.m4823a(context).m4825b()) {
            com.tencent.android.tpush.p069c.ProGuard.m4780b(context, str);
        }
    }

    public static String getOtherPushAppKey(Context context) {
        if (com.tencent.android.tpush.common.ProGuard.m4823a(context).m4825b()) {
            return com.tencent.android.tpush.p069c.ProGuard.m4784f(context);
        }
        return null;
    }
}
