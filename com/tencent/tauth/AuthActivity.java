package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.Constants;
import com.tencent.open.p067a.ProGuard;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;

/* compiled from: ProGuard */
public class AuthActivity extends Activity {
    private static final String ACTION_ADD_TO_QQFAVORITES = "addToQQFavorites";
    public static final String ACTION_KEY = "action";
    private static final String ACTION_SEND_TO_MY_COMPUTER = "sendToMyComputer";
    public static final String ACTION_SHARE_PRIZE = "sharePrize";
    private static final String ACTION_SHARE_TO_QQ = "shareToQQ";
    private static final String ACTION_SHARE_TO_QZONE = "shareToQzone";
    private static final String ACTION_SHARE_TO_TROOP_BAR = "shareToTroopBar";
    private static final String SHARE_PRIZE_ACTIVITY_ID = "activityid";
    private static final String TAG = "openSDK_LOG.AuthActivity";
    private static int mShareQzoneBackTime;

    static {
        mShareQzoneBackTime = 0;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            ProGuard.m2121d(TAG, "-->onCreate, getIntent() return null");
            return;
        }
        Uri uri = null;
        try {
            uri = getIntent().getData();
        } catch (Exception e) {
            ProGuard.m2122e(TAG, "-->onCreate, getIntent().getData() has exception! " + e.getMessage());
        }
        ProGuard.m2114a(TAG, "-->onCreate, uri: " + uri);
        handleActionUri(uri);
    }

    private void handleActionUri(Uri uri) {
        ProGuard.m2120c(TAG, "-->handleActionUri--start");
        if (uri == null || uri.toString() == null || uri.toString().equals(Constants.STR_EMPTY)) {
            ProGuard.m2121d(TAG, "-->handleActionUri, uri invalid");
            finish();
            return;
        }
        String uri2 = uri.toString();
        Bundle decodeUrl = Util.decodeUrl(uri2.substring(uri2.indexOf("#") + 1));
        if (decodeUrl == null) {
            ProGuard.m2121d(TAG, "-->handleActionUri, bundle is null");
            finish();
            return;
        }
        String string = decodeUrl.getString(ACTION_KEY);
        ProGuard.m2120c(TAG, "-->handleActionUri, action: " + string);
        if (string == null) {
            execAuthCallback(decodeUrl, uri2);
        } else if (string.equals(ACTION_SHARE_TO_QQ) || string.equals(ACTION_SHARE_TO_QZONE) || string.equals(ACTION_ADD_TO_QQFAVORITES) || string.equals(ACTION_SEND_TO_MY_COMPUTER) || string.equals(ACTION_SHARE_TO_TROOP_BAR)) {
            if (string.equals(ACTION_SHARE_TO_QZONE) && SystemUtils.getAppVersionName(this, Constants.PACKAGE_QQ) != null && SystemUtils.compareQQVersion(this, SystemUtils.QQ_VERSION_NAME_5_2_0) < 0) {
                mShareQzoneBackTime++;
                if (mShareQzoneBackTime == 2) {
                    mShareQzoneBackTime = 0;
                    finish();
                    return;
                }
            }
            ProGuard.m2120c(TAG, "-->handleActionUri, most share action, start assistactivity");
            Intent intent = new Intent(this, AssistActivity.class);
            intent.putExtras(decodeUrl);
            intent.setFlags(603979776);
            startActivity(intent);
            finish();
        } else if (string.equals(ACTION_SHARE_PRIZE)) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            String string2 = decodeUrl.getString("response");
            Object obj = Constants.STR_EMPTY;
            try {
                obj = Util.parseJson(string2).getString(SHARE_PRIZE_ACTIVITY_ID);
            } catch (Throwable e) {
                ProGuard.m2118b(TAG, "sharePrize parseJson has exception.", e);
            }
            if (!TextUtils.isEmpty(obj)) {
                launchIntentForPackage.putExtra(ACTION_SHARE_PRIZE, true);
                decodeUrl = new Bundle();
                decodeUrl.putString(SHARE_PRIZE_ACTIVITY_ID, obj);
                launchIntentForPackage.putExtras(decodeUrl);
            }
            startActivity(launchIntentForPackage);
            finish();
        } else {
            execAuthCallback(decodeUrl, uri2);
        }
    }

    private void execAuthCallback(Bundle bundle, String str) {
        ProGuard.m2114a(TAG, "execAuthCallback url = " + str);
    }
}
