package com.facebook.p037i;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.p036h.FacebookDialogFragment;
import com.facebook.p036h.ah;
import com.facebook.p036h.ah.WebDialog;
import com.facebook.p037i.LoginClient.LoginClient;
import com.sina.weibo.sdk.constant.WBConstants;

/* renamed from: com.facebook.i.s */
final class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR;
    private ah f1893c;
    private String f1894d;

    /* renamed from: com.facebook.i.s.1 */
    class WebViewLoginMethodHandler implements WebDialog {
        final /* synthetic */ LoginClient f1889a;
        final /* synthetic */ WebViewLoginMethodHandler f1890b;

        WebViewLoginMethodHandler(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient loginClient) {
            this.f1890b = webViewLoginMethodHandler;
            this.f1889a = loginClient;
        }

        public final void m1850a(Bundle bundle, FacebookException facebookException) {
            this.f1890b.m1855b(this.f1889a, bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.i.s.2 */
    static class WebViewLoginMethodHandler implements Creator {
        WebViewLoginMethodHandler() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }
    }

    /* renamed from: com.facebook.i.s.a */
    static class WebViewLoginMethodHandler extends WebDialog {
        String f1891f;
        boolean f1892g;

        public WebViewLoginMethodHandler(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        public final ah m1851a() {
            Bundle bundle = this.f1581e;
            bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, "fbconnect://success");
            bundle.putString(WBConstants.AUTH_PARAMS_CLIENT_ID, this.f1578b);
            bundle.putString("e2e", this.f1891f);
            bundle.putString(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token,signed_request");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", "rerequest");
            return new ah(this.f1577a, "oauth", bundle, this.f1579c, this.f1580d);
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    final String m1852a() {
        return "web_view";
    }

    final AccessTokenSource a_() {
        return AccessTokenSource.WEB_VIEW;
    }

    final boolean m1856d() {
        return true;
    }

    final void m1854b() {
        if (this.f1893c != null) {
            this.f1893c.cancel();
            this.f1893c = null;
        }
    }

    final boolean m1853a(LoginClient loginClient) {
        Bundle b = m1751b(loginClient);
        WebDialog webViewLoginMethodHandler = new WebViewLoginMethodHandler(this, loginClient);
        this.f1894d = LoginClient.m1820f();
        m1742a("e2e", this.f1894d);
        Context activity = this.b.f1861c.getActivity();
        WebDialog webViewLoginMethodHandler2 = new WebViewLoginMethodHandler(activity, loginClient.f1844d, b);
        webViewLoginMethodHandler2.f1891f = this.f1894d;
        webViewLoginMethodHandler2.f1892g = loginClient.f1846f;
        webViewLoginMethodHandler2.f1580d = webViewLoginMethodHandler;
        this.f1893c = webViewLoginMethodHandler2.m1554a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.f1658a = this.f1893c;
        facebookDialogFragment.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    final void m1855b(LoginClient loginClient, Bundle bundle, FacebookException facebookException) {
        super.m1750a(loginClient, bundle, facebookException);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f1894d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f1894d);
    }

    static {
        CREATOR = new WebViewLoginMethodHandler();
    }
}
