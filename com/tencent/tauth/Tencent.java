package com.tencent.tauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzonePublish;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.SocialApi;
import com.tencent.open.p067a.ProGuard;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.HttpUtils.HttpStatusException;
import com.tencent.open.utils.HttpUtils.NetworkUnavailableException;
import com.tencent.open.utils.SystemUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class Tencent {
    public static final int REQUEST_LOGIN = 10001;
    private static final String TAG = "openSDK_LOG.Tencent";
    private static Tencent sInstance;
    private final QQAuth mQQAuth;

    private Tencent(String str, Context context) {
        Global.setContext(context.getApplicationContext());
        this.mQQAuth = QQAuth.createInstance(str, context);
    }

    public static synchronized Tencent createInstance(String str, Context context) {
        Tencent tencent;
        synchronized (Tencent.class) {
            Global.setContext(context.getApplicationContext());
            ProGuard.m2120c(TAG, "createInstance()  -- start");
            if (sInstance == null) {
                sInstance = new Tencent(str, context);
            } else if (!str.equals(sInstance.getAppId())) {
                sInstance.logout(context);
                sInstance = new Tencent(str, context);
            }
            if (checkManifestConfig(context, str)) {
                ProGuard.m2120c(TAG, "createInstance()  -- end");
                tencent = sInstance;
            } else {
                tencent = null;
            }
        }
        return tencent;
    }

    private static boolean checkManifestConfig(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
            try {
                context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
                return true;
            } catch (NameNotFoundException e) {
                ProGuard.m2122e(TAG, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity\n" + ("\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity,\u8bf7\u52a0\u4e0acom.tencent.connect.common.AssistActivity,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863." + "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
                return false;
            }
        } catch (NameNotFoundException e2) {
            ProGuard.m2122e(TAG, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity" + (("\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity,\u8bf7\u52a0\u4e0acom.tencent.tauth.AuthActivity,\u5e76\u914d\u7f6e<data android:scheme=\"tencent" + str + "\" />,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863.") + "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n" + "</intent-filter>\n" + "</activity>"));
            return false;
        }
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "login() with activity, scope is " + str);
        return this.mQQAuth.login(activity, str, iUiListener);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "login() with fragment, scope is " + str);
        return this.mQQAuth.login(fragment, str, iUiListener, Constants.STR_EMPTY);
    }

    public int loginServerSide(Activity activity, String str, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "loginServerSide() with activity, scope = " + str + ",server_side");
        return this.mQQAuth.login(activity, str + ",server_side", iUiListener);
    }

    public int loginServerSide(Fragment fragment, String str, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "loginServerSide() with fragment, scope = " + str + ",server_side");
        return this.mQQAuth.login(fragment, str + ",server_side", iUiListener, Constants.STR_EMPTY);
    }

    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, String str2, String str3, String str4) {
        ProGuard.m2120c(TAG, "loginWithOEM() with activity, scope = " + str);
        return this.mQQAuth.loginWithOEM(activity, str, iUiListener, str2, str3, str4);
    }

    public void logout(Context context) {
        ProGuard.m2120c(TAG, "logout()");
        this.mQQAuth.getQQToken().setAccessToken(null, Constants.VIA_RESULT_SUCCESS);
        this.mQQAuth.getQQToken().setOpenId(null);
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "reAuth() with activity, scope = " + str);
        return this.mQQAuth.reAuth(activity, str, iUiListener);
    }

    public void reportDAU() {
        this.mQQAuth.reportDAU();
    }

    public void checkLogin(IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "checkLogin()");
        this.mQQAuth.checkLogin(iUiListener);
    }

    public int invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "invite()");
        new SocialApi(this.mQQAuth.getQQToken()).invite(activity, bundle, iUiListener);
        return 0;
    }

    public int story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "story()");
        new SocialApi(this.mQQAuth.getQQToken()).story(activity, bundle, iUiListener);
        return 0;
    }

    public int gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "gift()");
        new SocialApi(this.mQQAuth.getQQToken()).gift(activity, bundle, iUiListener);
        return 0;
    }

    public int ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "ask()");
        new SocialApi(this.mQQAuth.getQQToken()).ask(activity, bundle, iUiListener);
        return 0;
    }

    public void requestAsync(String str, Bundle bundle, String str2, IRequestListener iRequestListener, Object obj) {
        ProGuard.m2120c(TAG, "requestAsync()");
        HttpUtils.requestAsync(this.mQQAuth.getQQToken(), Global.getContext(), str, bundle, str2, iRequestListener);
    }

    public JSONObject request(String str, Bundle bundle, String str2) throws IOException, JSONException, NetworkUnavailableException, HttpStatusException {
        ProGuard.m2120c(TAG, "request()");
        return HttpUtils.request(this.mQQAuth.getQQToken(), Global.getContext(), str, bundle, str2);
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "shareToQQ()");
        new QQShare(activity, this.mQQAuth.getQQToken()).shareToQQ(activity, bundle, iUiListener);
    }

    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "shareToQzone()");
        new QzoneShare(activity, this.mQQAuth.getQQToken()).shareToQzone(activity, bundle, iUiListener);
    }

    public void publishToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        ProGuard.m2120c(TAG, "publishToQzone()");
        new QzonePublish(activity, this.mQQAuth.getQQToken()).publishToQzone(activity, bundle, iUiListener);
    }

    public void releaseResource() {
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        ProGuard.m2120c(TAG, "onActivityResult() deprecated, will do nothing");
        return false;
    }

    public static boolean onActivityResultData(int i, int i2, Intent intent, IUiListener iUiListener) {
        boolean z;
        boolean z2 = true;
        String str = TAG;
        StringBuilder append = new StringBuilder().append("onActivityResultData() reqcode = ").append(i).append(", resultcode = ").append(i2).append(", data = null ? ");
        if (intent == null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder append2 = append.append(z).append(", listener = null ? ");
        if (iUiListener != null) {
            z2 = false;
        }
        ProGuard.m2120c(str, append2.append(z2).toString());
        return UIListenerManager.getInstance().onActivityResult(i, i2, intent, iUiListener);
    }

    public boolean isSessionValid() {
        return this.mQQAuth.isSessionValid();
    }

    public String getAppId() {
        return this.mQQAuth.getQQToken().getAppId();
    }

    public String getAccessToken() {
        return this.mQQAuth.getQQToken().getAccessToken();
    }

    public long getExpiresIn() {
        return this.mQQAuth.getQQToken().getExpireTimeInSecond();
    }

    public String getOpenId() {
        return this.mQQAuth.getQQToken().getOpenId();
    }

    @Deprecated
    public void handleLoginData(Intent intent, IUiListener iUiListener) {
        boolean z;
        boolean z2 = true;
        String str = TAG;
        StringBuilder append = new StringBuilder().append("handleLoginData() data = null ? ");
        if (intent == null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder append2 = append.append(z).append(", listener = null ? ");
        if (iUiListener != null) {
            z2 = false;
        }
        ProGuard.m2120c(str, append2.append(z2).toString());
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public static void handleResultData(Intent intent, IUiListener iUiListener) {
        boolean z;
        boolean z2 = true;
        String str = TAG;
        StringBuilder append = new StringBuilder().append("handleResultData() data = null ? ");
        if (intent == null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder append2 = append.append(z).append(", listener = null ? ");
        if (iUiListener != null) {
            z2 = false;
        }
        ProGuard.m2120c(str, append2.append(z2).toString());
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public void setAccessToken(String str, String str2) {
        ProGuard.m2114a(TAG, "setAccessToken(), expiresIn = " + str2 + Constants.STR_EMPTY);
        this.mQQAuth.setAccessToken(str, str2);
    }

    public void setOpenId(String str) {
        ProGuard.m2114a(TAG, "setOpenId() --start");
        this.mQQAuth.setOpenId(Global.getContext(), str);
        ProGuard.m2114a(TAG, "setOpenId() --end");
    }

    public boolean isReady() {
        return isSessionValid() && getOpenId() != null;
    }

    public QQToken getQQToken() {
        return this.mQQAuth.getQQToken();
    }

    public boolean isSupportSSOLogin(Activity activity) {
        if (SystemUtils.getAppVersionName(activity, Constants.PACKAGE_QQ) == null) {
            return false;
        }
        return SystemUtils.checkMobileQQ(activity);
    }
}
