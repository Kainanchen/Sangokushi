package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.utils.Utility;

public class AuthInfo {
    private String mAppKey;
    private String mKeyHash;
    private String mPackageName;
    private String mRedirectUrl;
    private String mScope;

    public AuthInfo(Context context, String str, String str2, String str3) {
        this.mAppKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mRedirectUrl = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mScope = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mPackageName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mKeyHash = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mAppKey = str;
        this.mRedirectUrl = str2;
        this.mScope = str3;
        this.mPackageName = context.getPackageName();
        this.mKeyHash = Utility.getSign(context, this.mPackageName);
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getRedirectUrl() {
        return this.mRedirectUrl;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getKeyHash() {
        return this.mKeyHash;
    }

    public Bundle getAuthBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(WBConstants.SSO_APP_KEY, this.mAppKey);
        bundle.putString(WBConstants.SSO_REDIRECT_URL, this.mRedirectUrl);
        bundle.putString(WBConstants.SSO_USER_SCOPE, this.mScope);
        bundle.putString(LogBuilder.KEY_PACKAGE_NAME, this.mPackageName);
        bundle.putString(LogBuilder.KEY_HASH, this.mKeyHash);
        return bundle;
    }

    public static AuthInfo parseBundleData(Context context, Bundle bundle) {
        return new AuthInfo(context, bundle.getString(WBConstants.SSO_APP_KEY), bundle.getString(WBConstants.SSO_REDIRECT_URL), bundle.getString(WBConstants.SSO_USER_SCOPE));
    }
}
