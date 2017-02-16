package com.tencent.android.tpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.service.p077d.ProGuard;

/* compiled from: ProGuard */
public class XGPush4Msdk {
    private static long f7253a;
    private static long f7254b;
    private static String f7255c;

    static {
        f7253a = 0;
        f7254b = 0;
        f7255c = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    private static String m4676b(Context context) {
        return context.getPackageName() + ":XG_DEBUG_SERVER_INFO";
    }

    public static void setDebugServerInfo(Context context, String str, int i) {
        if (ProGuard.m5317a(str)) {
            com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(context));
        } else {
            com.tencent.android.tpush.common.ProGuard.m4820b(context, m4676b(context), str + "," + i);
        }
    }

    public static String getDebugServerInfo(Context context) {
        return com.tencent.android.tpush.common.ProGuard.m4815a(context, m4676b(context), null);
    }

    private static boolean m4675a(long j, long j2, long j3) {
        return j >= j2 && j < j3;
    }

    public static void setQQAppId(Context context, long j) {
        long j2;
        if (m4675a(j, 0, 200000)) {
            j2 = 90000000;
        } else if (m4675a(j, 99000000, 100000000)) {
            j2 = 0;
        } else if (m4675a(j, 100200000, 100600000)) {
            j2 = -10000000;
        } else if (m4675a(j, 101000000, 101400000)) {
            j2 = -10400000;
        } else if (m4675a(j, 900000000, 900100000)) {
            j2 = -809000000;
        } else if (m4675a(j, 1000000000, 1000100000)) {
            j2 = -908900000;
        } else if (m4675a(j, 1101000000, 1104500000)) {
            j2 = -1009800000;
        } else if (m4675a(j, 1150000000, 1150100000)) {
            j2 = -1055300000;
        } else if (m4675a(j, 100600000, 101000000)) {
            j2 = -5800000;
        } else if (m4675a(j, 1104500000, 1109300000)) {
            j2 = -1009300000;
        } else if (m4675a(j, 1109300000, 1119300000)) {
            j2 = -1029300000;
        } else if (m4675a(j, 1119300000, 1120000000)) {
            j2 = -1049300000;
        } else {
            Log.e(Constants.MSDK_TAG, "\u624bQ\u7684appid\uff1a" + j + " \u4e0d\u5728\u56fa\u5b9a\u7684\u8303\u56f4\uff0c\u8bf7\u8054\u7cfbmsdk\u548c\u4fe1\u9e3d\u7684\u540c\u4e8b\u89e3\u51b3\u4e4b\u3002");
            j2 = 0;
        }
        j2 = (j2 + 2100000000) + j;
        f7253a = j;
        f7254b = j2;
        com.tencent.android.tpush.common.ProGuard.m4819b(context, "TPUSH_QQ_ACCESS_ID", f7254b);
        if (com.tencent.android.tpush.common.ProGuard.m4816a(context, "TPUSH_QQ_APP_ID")) {
            com.tencent.android.tpush.common.ProGuard.m4817b(context, "TPUSH_QQ_APP_ID");
        }
        f7255c = "MSDK_" + j;
        com.tencent.android.tpush.common.ProGuard.m4820b(context, "__en__TPUSH_QQ_ACCESS_KEY", Rijndael.encrypt(f7255c));
        if (com.tencent.android.tpush.common.ProGuard.m4816a(context, "TPUSH_QQ_ACCESS_KEY")) {
            com.tencent.android.tpush.common.ProGuard.m4817b(context, "TPUSH_QQ_ACCESS_KEY");
        }
    }

    public static long getQQAccessId(Context context) {
        if (f7254b <= 0) {
            f7254b = com.tencent.android.tpush.common.ProGuard.m4813a(context, "TPUSH_QQ_ACCESS_ID", f7254b);
        }
        return f7254b;
    }

    public static void setQQAppKey(Context context, String str) {
    }

    public static String getQQAppKey(Context context) {
        if (!TextUtils.isEmpty(f7255c)) {
            return f7255c;
        }
        Object a = com.tencent.android.tpush.common.ProGuard.m4815a(context, "__en__TPUSH_QQ_ACCESS_KEY", f7255c);
        if (TextUtils.isEmpty(a)) {
            f7255c = com.tencent.android.tpush.common.ProGuard.m4815a(context, "TPUSH_QQ_ACCESS_KEY", LetterIndexBar.SEARCH_ICON_LETTER);
            com.tencent.android.tpush.common.ProGuard.m4820b(context, "TPUSH_QQ_ACCESS_KEY", LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            f7255c = Rijndael.decrypt(a);
        }
        return f7255c;
    }

    public static void setTag(Context context, String str) {
        com.tencent.android.tpush.p067a.ProGuard.m4715c(Constants.MSDK_TAG, "setTag: tagName=" + str + ",qqAppid=" + f7253a + ",xg_accessid=" + getQQAccessId(context));
        XGPushManager.m4687a(context, str, 1, getQQAccessId(context));
    }

    public static void deleteTag(Context context, String str) {
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4715c(Constants.MSDK_TAG, "deleteTag: tagName=" + str + ",qqAppid=" + f7253a + ",xg_accessid=" + getQQAccessId(context));
        }
        XGPushManager.m4687a(context, str, 2, getQQAccessId(context));
    }

    public static void registerPush(Context context, String str, XGIOperateCallback xGIOperateCallback) {
        XGIOperateCallback proGuard;
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4718d(Constants.MSDK_TAG, "registerPush: account=" + str + ",qqAppid=" + f7253a + ",xg_accessid=" + getQQAccessId(context));
        }
        if (xGIOperateCallback == null) {
            proGuard = new ProGuard();
        } else {
            proGuard = xGIOperateCallback;
        }
        if (ProGuard.m5317a(str)) {
            XGPushManager.m4688a(context, null, null, -1, null, proGuard, getQQAccessId(context), getQQAppKey(context));
            return;
        }
        XGPushManager.m4688a(context, str, "0", 0, null, proGuard, getQQAccessId(context), getQQAppKey(context));
    }

    public static void unregisterPush(Context context, XGIOperateCallback xGIOperateCallback) {
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4718d(Constants.MSDK_TAG, "unregisterPush,qqAppid=" + f7253a + ",xg_accessid=" + getQQAccessId(context));
        }
        if (xGIOperateCallback == null) {
            xGIOperateCallback = new ProGuard();
        }
        XGPushManager.m4686a(context, xGIOperateCallback, getQQAccessId(context), getQQAppKey(context));
    }

    public static long addLocalNotification(Context context, XGLocalMessage xGLocalMessage) {
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4718d(Constants.MSDK_TAG, "addLocalNotification:msg=" + xGLocalMessage.toString() + ",qqAppid=" + f7253a + ",xg_accessid=" + getQQAccessId(context));
        }
        return XGPushManager.m4677a(context, xGLocalMessage, getQQAccessId(context));
    }

    public static void setPushNotificationBuilder(Context context, int i, XGPushNotificationBuilder xGPushNotificationBuilder) {
        if (context == null) {
            throw new IllegalArgumentException("context is null.");
        } else if (i < 5000 || i > 6000) {
            throw new IllegalArgumentException("notificationBulderId\u8d85\u8fc7\u8303\u56f4[5000, 6000].");
        } else if (xGPushNotificationBuilder != null) {
            com.tencent.android.tpush.p068b.ProGuard.m4736a(context, i, xGPushNotificationBuilder);
        }
    }

    public static void setDefaultNotificationBuilder(Context context, XGPushNotificationBuilder xGPushNotificationBuilder) {
        XGPushManager.setDefaultNotificationBuilder(context, xGPushNotificationBuilder);
    }
}
