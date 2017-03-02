package com.tencent.connect.auth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import android.widget.Toast;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.p067a.ProGuard;
import com.tencent.open.utils.ApkExternalInfoTool;
import com.tencent.open.utils.Global;
import com.tencent.tauth.IUiListener;
import java.io.File;

/* compiled from: ProGuard */
public class QQAuth {
    private AuthAgent f1533a;
    private QQToken f1534b;

    private QQAuth(String str, Context context) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f1534b = new QQToken(str);
        this.f1533a = new AuthAgent(this.f1534b);
        com.tencent.connect.p059a.ProGuard.m1937c(context, this.f1534b);
        ProGuard.m2120c("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    public static QQAuth createInstance(String str, Context context) {
        Global.setContext(context.getApplicationContext());
        ProGuard.m2120c("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
            packageManager.getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
            QQAuth qQAuth = new QQAuth(str, context);
            ProGuard.m2120c("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
            return qQAuth;
        } catch (Throwable e) {
            ProGuard.m2118b("openSDK_LOG.QQAuth", "createInstance() error --end", e);
            Toast.makeText(context.getApplicationContext(), "\u8bf7\u53c2\u7167\u6587\u6863\u5728Androidmanifest.xml\u52a0\u4e0aAuthActivity\u548cAssitActivity\u7684\u5b9a\u4e49 ", 1).show();
            return null;
        }
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "login()");
        return login(activity, str, iUiListener, Constants.STR_EMPTY);
    }

    public int login(Activity activity, String str, IUiListener iUiListener, String str2) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m1988a(activity, null, str, iUiListener, str2);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        Activity activity = fragment.getActivity();
        ProGuard.m2120c("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m1988a(activity, fragment, str, iUiListener, str2);
    }

    private int m1988a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        String str3;
        String packageName = activity.getApplicationContext().getPackageName();
        for (ApplicationInfo applicationInfo : activity.getPackageManager().getInstalledApplications(AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS)) {
            if (packageName.equals(applicationInfo.packageName)) {
                str3 = applicationInfo.sourceDir;
                break;
            }
        }
        str3 = null;
        if (str3 != null) {
            try {
                String readChannelId = ApkExternalInfoTool.readChannelId(new File(str3));
                if (!TextUtils.isEmpty(readChannelId)) {
                    ProGuard.m2114a("openSDK_LOG.QQAuth", "-->login channelId: " + readChannelId);
                    return loginWithOEM(activity, str, iUiListener, readChannelId, readChannelId, Constants.STR_EMPTY);
                }
            } catch (Throwable e) {
                ProGuard.m2118b("openSDK_LOG.QQAuth", "-->login get channel id exception.", e);
                e.printStackTrace();
            }
        }
        ProGuard.m2117b("openSDK_LOG.QQAuth", "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f1533a.doLogin(activity, str, iUiListener, false, fragment);
    }

    @Deprecated
    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, String str2, String str3, String str4) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "loginWithOEM");
        BaseApi.isOEM = true;
        if (str2.equals(Constants.STR_EMPTY)) {
            str2 = "null";
        }
        if (str3.equals(Constants.STR_EMPTY)) {
            str3 = "null";
        }
        if (str4.equals(Constants.STR_EMPTY)) {
            str4 = "null";
        }
        BaseApi.installChannel = str3;
        BaseApi.registerChannel = str2;
        BaseApi.businessId = str4;
        return this.f1533a.doLogin(activity, str, iUiListener);
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "reAuth()");
        return this.f1533a.doLogin(activity, str, iUiListener, true, null);
    }

    public void reportDAU() {
        this.f1533a.m1953a(null);
    }

    public void checkLogin(IUiListener iUiListener) {
        this.f1533a.m1954b(iUiListener);
    }

    public void logout(Context context) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "logout() --start");
        CookieSyncManager.createInstance(context);
        setAccessToken(null, null);
        setOpenId(context, null);
        ProGuard.m2120c("openSDK_LOG.QQAuth", "logout() --end");
    }

    public QQToken getQQToken() {
        return this.f1534b;
    }

    public void setAccessToken(String str, String str2) {
        ProGuard.m2114a("openSDK_LOG.QQAuth", "setAccessToken(), validTimeInSecond = " + str2 + Constants.STR_EMPTY);
        this.f1534b.setAccessToken(str, str2);
    }

    public boolean isSessionValid() {
        ProGuard.m2114a("openSDK_LOG.QQAuth", "isSessionValid(), result = " + (this.f1534b.isSessionValid() ? "true" : "false") + Constants.STR_EMPTY);
        return this.f1534b.isSessionValid();
    }

    public void setOpenId(Context context, String str) {
        ProGuard.m2114a("openSDK_LOG.QQAuth", "setOpenId() --start");
        this.f1534b.setOpenId(str);
        com.tencent.connect.p059a.ProGuard.m1938d(context, this.f1534b);
        ProGuard.m2114a("openSDK_LOG.QQAuth", "setOpenId() --end");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        ProGuard.m2120c("openSDK_LOG.QQAuth", "onActivityResult() ,resultCode = " + i2 + Constants.STR_EMPTY);
        return true;
    }
}
