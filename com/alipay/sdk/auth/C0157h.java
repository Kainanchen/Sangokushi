package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.data.C0170c;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.widget.C0210a;

/* renamed from: com.alipay.sdk.auth.h */
public final class C0157h {
    private static final String f301a = "com.eg.android.AlipayGphone";
    private static final int f302b = 65;
    private static C0210a f303c;
    private static String f304d;

    private static boolean m440a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f301a, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (packageInfo != null && packageInfo.versionCode >= f302b) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static void m438a(Activity activity, APAuthInfo aPAuthInfo) {
        C0191b a = C0191b.m600a();
        C0170c.m479a();
        a.m605a((Context) activity);
        if (C0157h.m440a((Context) activity)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("alipayauth://platformapi/startapp");
            stringBuilder.append("?appId=20000122");
            stringBuilder.append("&approveType=005");
            stringBuilder.append("&scope=kuaijie");
            stringBuilder.append("&productId=");
            stringBuilder.append(aPAuthInfo.getProductId());
            stringBuilder.append("&thirdpartyId=");
            stringBuilder.append(aPAuthInfo.getAppId());
            stringBuilder.append("&redirectUri=");
            stringBuilder.append(aPAuthInfo.getRedirectUri());
            C0157h.m439a(activity, stringBuilder.toString());
            return;
        }
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    C0210a c0210a = new C0210a(activity, C0210a.f530a);
                    f303c = c0210a;
                    c0210a.m712a();
                }
            } catch (Exception e) {
                f303c = null;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("app_id=");
        stringBuilder.append(aPAuthInfo.getAppId());
        stringBuilder.append("&partner=");
        stringBuilder.append(aPAuthInfo.getPid());
        stringBuilder.append("&scope=kuaijie");
        stringBuilder.append("&login_goal=auth");
        stringBuilder.append("&redirect_url=");
        stringBuilder.append(aPAuthInfo.getRedirectUri());
        stringBuilder.append("&view=wap");
        stringBuilder.append("&prod_code=");
        stringBuilder.append(aPAuthInfo.getProductId());
        new Thread(new C0158i(activity, stringBuilder, aPAuthInfo)).start();
    }

    private static void m442b(Activity activity, APAuthInfo aPAuthInfo) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("alipayauth://platformapi/startapp");
        stringBuilder.append("?appId=20000122");
        stringBuilder.append("&approveType=005");
        stringBuilder.append("&scope=kuaijie");
        stringBuilder.append("&productId=");
        stringBuilder.append(aPAuthInfo.getProductId());
        stringBuilder.append("&thirdpartyId=");
        stringBuilder.append(aPAuthInfo.getAppId());
        stringBuilder.append("&redirectUri=");
        stringBuilder.append(aPAuthInfo.getRedirectUri());
        C0157h.m439a(activity, stringBuilder.toString());
    }

    static {
        f303c = null;
        f304d = null;
    }

    private static void m444c(Activity activity, APAuthInfo aPAuthInfo) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    C0210a c0210a = new C0210a(activity, C0210a.f530a);
                    f303c = c0210a;
                    c0210a.m712a();
                }
            } catch (Exception e) {
                f303c = null;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("app_id=");
        stringBuilder.append(aPAuthInfo.getAppId());
        stringBuilder.append("&partner=");
        stringBuilder.append(aPAuthInfo.getPid());
        stringBuilder.append("&scope=kuaijie");
        stringBuilder.append("&login_goal=auth");
        stringBuilder.append("&redirect_url=");
        stringBuilder.append(aPAuthInfo.getRedirectUri());
        stringBuilder.append("&view=wap");
        stringBuilder.append("&prod_code=");
        stringBuilder.append(aPAuthInfo.getProductId());
        new Thread(new C0158i(activity, stringBuilder, aPAuthInfo)).start();
    }

    public static void m439a(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
