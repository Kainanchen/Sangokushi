package com.facebook.p037i;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.af;
import com.facebook.p037i.LoginClient.LoginClient;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.n */
abstract class LoginMethodHandler implements Parcelable {
    Map<String, String> f1781a;
    protected LoginClient f1782b;

    abstract String m1739a();

    abstract boolean m1745a(LoginClient loginClient);

    LoginMethodHandler(LoginClient loginClient) {
        this.f1782b = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f1781a = af.m1507a(parcel);
    }

    final void m1741a(LoginClient loginClient) {
        if (this.f1782b != null) {
            throw new FacebookException("Can't set LoginClient if it is already set.");
        }
        this.f1782b = loginClient;
    }

    boolean m1744a(int i, int i2, Intent intent) {
        return false;
    }

    boolean m1748d() {
        return false;
    }

    void m1746b() {
    }

    void m1743a(JSONObject jSONObject) {
    }

    protected final String m1740a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", m1739a());
            m1743a(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    protected final void m1742a(String str, Object obj) {
        if (this.f1781a == null) {
            this.f1781a = new HashMap();
        }
        this.f1781a.put(str, obj == null ? null : obj.toString());
    }

    protected final void m1747b(String str) {
        String str2 = this.f1782b.f1865g.f1844d;
        AppEventsLogger a = AppEventsLogger.m825a(this.f1782b.f1861c.getActivity(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        a.m837b("fb_dialogs_web_login_dialog_complete", bundle);
    }

    public static AccessToken m1737a(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Collection collection2;
        Date a = af.m1504a(bundle, Oauth2AccessToken.KEY_EXPIRES_IN, new Date());
        String string = bundle.getString(WBConstants.AUTH_ACCESS_TOKEN);
        String string2 = bundle.getString("granted_scopes");
        if (af.m1523a(string2)) {
            Collection<String> collection3 = collection;
        } else {
            Collection arrayList = new ArrayList(Arrays.asList(string2.split(",")));
        }
        string2 = bundle.getString("denied_scopes");
        if (af.m1523a(string2)) {
            collection2 = null;
        } else {
            collection2 = new ArrayList(Arrays.asList(string2.split(",")));
        }
        if (af.m1523a(string)) {
            return null;
        }
        return new AccessToken(string, str, LoginMethodHandler.m1738c(bundle.getString("signed_request")), arrayList, collection2, accessTokenSource, a, new Date());
    }

    private static String m1738c(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), GameManager.DEFAULT_CHARSET)).getString("user_id");
            }
        } catch (UnsupportedEncodingException e) {
        } catch (JSONException e2) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.m1512a(parcel, this.f1781a);
    }
}
