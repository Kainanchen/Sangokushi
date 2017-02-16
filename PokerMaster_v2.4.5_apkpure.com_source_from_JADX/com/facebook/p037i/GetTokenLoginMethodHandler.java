package com.facebook.p037i;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p036h.aa.PlatformServiceClient;
import com.facebook.p036h.af;
import com.facebook.p036h.af.Utility;
import com.facebook.p036h.ag;
import com.facebook.p037i.LoginClient.LoginClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.g */
final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR;
    private GetTokenClient f1827c;

    /* renamed from: com.facebook.i.g.1 */
    class GetTokenLoginMethodHandler implements PlatformServiceClient {
        final /* synthetic */ LoginClient f1822a;
        final /* synthetic */ GetTokenLoginMethodHandler f1823b;

        GetTokenLoginMethodHandler(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient loginClient) {
            this.f1823b = getTokenLoginMethodHandler;
            this.f1822a = loginClient;
        }

        public final void m1799a(Bundle bundle) {
            this.f1823b.m1803a(this.f1822a, bundle);
        }
    }

    /* renamed from: com.facebook.i.g.2 */
    class GetTokenLoginMethodHandler implements Utility {
        final /* synthetic */ Bundle f1824a;
        final /* synthetic */ LoginClient f1825b;
        final /* synthetic */ GetTokenLoginMethodHandler f1826c;

        GetTokenLoginMethodHandler(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Bundle bundle, LoginClient loginClient) {
            this.f1826c = getTokenLoginMethodHandler;
            this.f1824a = bundle;
            this.f1825b = loginClient;
        }

        public final void m1801a(JSONObject jSONObject) {
            try {
                this.f1824a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                this.f1826c.m1806b(this.f1825b, this.f1824a);
            } catch (JSONException e) {
                this.f1826c.b.m1824b(LoginClient.m1815a(this.f1826c.b.f1865g, "Caught exception", e.getMessage()));
            }
        }

        public final void m1800a(FacebookException facebookException) {
            this.f1826c.b.m1824b(LoginClient.m1815a(this.f1826c.b.f1865g, "Caught exception", facebookException.getMessage()));
        }
    }

    /* renamed from: com.facebook.i.g.3 */
    static class GetTokenLoginMethodHandler implements Creator {
        GetTokenLoginMethodHandler() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    final String m1802a() {
        return "get_token";
    }

    final void m1805b() {
        if (this.f1827c != null) {
            this.f1827c.f1541c = false;
            this.f1827c.f1540b = null;
            this.f1827c = null;
        }
    }

    final boolean m1804a(LoginClient loginClient) {
        boolean z;
        this.f1827c = new GetTokenClient(this.b.f1861c.getActivity(), loginClient.f1844d);
        ServiceConnection serviceConnection = this.f1827c;
        if (serviceConnection.f1541c) {
            z = false;
        } else if (NativeProtocol.m1727b(serviceConnection.f1543e) == -1) {
            z = false;
        } else {
            Intent a = NativeProtocol.m1715a(serviceConnection.f1539a);
            if (a == null) {
                z = false;
            } else {
                serviceConnection.f1541c = true;
                serviceConnection.f1539a.bindService(a, serviceConnection, 1);
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        this.b.m1827e();
        this.f1827c.f1540b = new GetTokenLoginMethodHandler(this, loginClient);
        return true;
    }

    final void m1803a(LoginClient loginClient, Bundle bundle) {
        if (this.f1827c != null) {
            this.f1827c.f1540b = null;
        }
        this.f1827c = null;
        LoginClient loginClient2 = this.b;
        if (loginClient2.f1863e != null) {
            loginClient2.f1863e.m1810b();
        }
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object<String> obj = loginClient.f1842b;
            String string;
            if (stringArrayList == null || !(obj == null || stringArrayList.containsAll(obj))) {
                Object hashSet = new HashSet();
                for (String string2 : obj) {
                    if (!stringArrayList.contains(string2)) {
                        hashSet.add(string2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    m1742a("new_permissions", TextUtils.join(",", hashSet));
                }
                ag.m1544a(hashSet, "permissions");
                loginClient.f1842b = hashSet;
            } else {
                string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string2 == null || string2.isEmpty()) {
                    this.b.m1827e();
                    af.m1516a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new GetTokenLoginMethodHandler(this, bundle, loginClient));
                    return;
                }
                m1806b(loginClient, bundle);
                return;
            }
        }
        this.b.m1826d();
    }

    final void m1806b(LoginClient loginClient, Bundle bundle) {
        AccessToken accessToken = null;
        AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_SERVICE;
        String str = loginClient.f1844d;
        Date a = af.m1504a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        Collection stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (!af.m1523a(string)) {
            accessToken = new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, accessTokenSource, a, new Date());
        }
        this.b.m1822a(LoginClient.m1813a(this.b.f1865g, accessToken));
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    static {
        CREATOR = new GetTokenLoginMethodHandler();
    }
}
