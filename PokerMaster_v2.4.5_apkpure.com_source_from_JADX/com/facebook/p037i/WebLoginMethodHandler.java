package com.facebook.p037i;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.p036h.af;
import com.facebook.p037i.LoginClient.LoginClient;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.Locale;

/* renamed from: com.facebook.i.r */
abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private String f1783c;

    abstract AccessTokenSource a_();

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    protected String m1752c() {
        return null;
    }

    protected final Bundle m1751b(LoginClient loginClient) {
        Bundle bundle = new Bundle();
        if (!af.m1524a(loginClient.f1842b)) {
            String join = TextUtils.join(",", loginClient.f1842b);
            bundle.putString(WBConstants.SSO_USER_SCOPE, join);
            m1742a(WBConstants.SSO_USER_SCOPE, join);
        }
        bundle.putString("default_audience", loginClient.f1843c.f1792e);
        bundle.putString("state", m1740a(loginClient.f1845e));
        AccessToken a = AccessToken.m883a();
        if (a != null) {
            join = a.f922d;
        } else {
            join = null;
        }
        if (join == null || !join.equals(this.b.f1861c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", LetterIndexBar.SEARCH_ICON_LETTER))) {
            af.m1529b(this.b.f1861c.getActivity());
            m1742a(WBConstants.AUTH_ACCESS_TOKEN, "0");
        } else {
            bundle.putString(WBConstants.AUTH_ACCESS_TOKEN, join);
            m1742a(WBConstants.AUTH_ACCESS_TOKEN, "1");
        }
        return bundle;
    }

    protected final Bundle m1749a(Bundle bundle, LoginClient loginClient) {
        bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, "fb" + FacebookSdk.m2590j() + "://authorize");
        bundle.putString(WBConstants.AUTH_PARAMS_CLIENT_ID, loginClient.f1844d);
        bundle.putString("e2e", LoginClient.m1820f());
        bundle.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        if (m1752c() != null) {
            bundle.putString(WBConstants.ACTION_LOG_TYPE_SSO, m1752c());
        }
        return bundle;
    }

    protected final void m1750a(LoginClient loginClient, Bundle bundle, FacebookException facebookException) {
        LoginClient a;
        this.f1783c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f1783c = bundle.getString("e2e");
            }
            try {
                AccessToken a2 = LoginMethodHandler.m1737a(loginClient.f1842b, bundle, a_(), loginClient.f1844d);
                a = LoginClient.m1813a(this.b.f1865g, a2);
                CookieSyncManager.createInstance(this.b.f1861c.getActivity()).sync();
                this.b.f1861c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a2.f922d).apply();
            } catch (FacebookException e) {
                a = LoginClient.m1815a(this.b.f1865g, null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            a = LoginClient.m1814a(this.b.f1865g, "User canceled log in.");
        } else {
            String facebookRequestError;
            this.f1783c = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                message = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(((FacebookServiceException) facebookException).f2690a.f2652c)});
                facebookRequestError = r2.toString();
            } else {
                facebookRequestError = message;
                message = null;
            }
            a = LoginClient.m1816a(this.b.f1865g, null, facebookRequestError, message);
        }
        if (!af.m1523a(this.f1783c)) {
            m1747b(this.f1783c);
        }
        this.b.m1822a(a);
    }
}
