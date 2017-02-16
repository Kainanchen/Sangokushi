package com.facebook.p037i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.ab.R;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.j */
final class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR;
    LoginMethodHandler[] f1859a;
    int f1860b;
    Fragment f1861c;
    LoginClient f1862d;
    LoginClient f1863e;
    boolean f1864f;
    LoginClient f1865g;
    Map<String, String> f1866h;
    private LoginLogger f1867i;

    /* renamed from: com.facebook.i.j.1 */
    static class LoginClient implements Creator {
        LoginClient() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LoginClient[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }
    }

    /* renamed from: com.facebook.i.j.a */
    interface LoginClient {
        void m1809a();

        void m1810b();
    }

    /* renamed from: com.facebook.i.j.b */
    public interface LoginClient {
        void m1811a(LoginClient loginClient);
    }

    /* renamed from: com.facebook.i.j.c */
    public static class LoginClient implements Parcelable {
        public static final Creator<LoginClient> CREATOR;
        final LoginBehavior f1841a;
        Set<String> f1842b;
        final DefaultAudience f1843c;
        final String f1844d;
        final String f1845e;
        boolean f1846f;
        String f1847g;

        /* renamed from: com.facebook.i.j.c.1 */
        static class LoginClient implements Creator {
            LoginClient() {
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LoginClient[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LoginClient((byte) 0);
            }
        }

        LoginClient(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2) {
            this.f1846f = false;
            this.f1841a = loginBehavior;
            if (set == null) {
                set = new HashSet();
            }
            this.f1842b = set;
            this.f1843c = defaultAudience;
            this.f1844d = str;
            this.f1845e = str2;
        }

        final boolean m1812a() {
            for (String a : this.f1842b) {
                if (LoginManager.m1846a(a)) {
                    return true;
                }
            }
            return false;
        }

        private LoginClient(Parcel parcel) {
            boolean z;
            DefaultAudience defaultAudience = null;
            this.f1846f = false;
            String readString = parcel.readString();
            this.f1841a = readString != null ? LoginBehavior.valueOf(readString) : null;
            Collection arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f1842b = new HashSet(arrayList);
            readString = parcel.readString();
            if (readString != null) {
                defaultAudience = DefaultAudience.valueOf(readString);
            }
            this.f1843c = defaultAudience;
            this.f1844d = parcel.readString();
            this.f1845e = parcel.readString();
            if (parcel.readByte() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f1846f = z;
            this.f1847g = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = null;
            parcel.writeString(this.f1841a != null ? this.f1841a.name() : null);
            parcel.writeStringList(new ArrayList(this.f1842b));
            if (this.f1843c != null) {
                str = this.f1843c.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f1844d);
            parcel.writeString(this.f1845e);
            parcel.writeByte((byte) (this.f1846f ? 1 : 0));
            parcel.writeString(this.f1847g);
        }

        static {
            CREATOR = new LoginClient();
        }
    }

    /* renamed from: com.facebook.i.j.d */
    public static class LoginClient implements Parcelable {
        public static final Creator<LoginClient> CREATOR;
        final LoginClient f1853a;
        final AccessToken f1854b;
        final String f1855c;
        final String f1856d;
        final LoginClient f1857e;
        public Map<String, String> f1858f;

        /* renamed from: com.facebook.i.j.d.1 */
        static class LoginClient implements Creator {
            LoginClient() {
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LoginClient[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LoginClient((byte) 0);
            }
        }

        /* renamed from: com.facebook.i.j.d.a */
        enum LoginClient {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            final String f1852d;

            private LoginClient(String str) {
                this.f1852d = str;
            }
        }

        private LoginClient(LoginClient loginClient, LoginClient loginClient2, AccessToken accessToken, String str, String str2) {
            ag.m1544a((Object) loginClient2, SelectCountryActivity.EXTRA_COUNTRY_CODE);
            this.f1857e = loginClient;
            this.f1854b = accessToken;
            this.f1855c = str;
            this.f1853a = loginClient2;
            this.f1856d = str2;
        }

        static LoginClient m1813a(LoginClient loginClient, AccessToken accessToken) {
            return new LoginClient(loginClient, LoginClient.SUCCESS, accessToken, null, null);
        }

        static LoginClient m1814a(LoginClient loginClient, String str) {
            return new LoginClient(loginClient, LoginClient.CANCEL, null, str, null);
        }

        static LoginClient m1815a(LoginClient loginClient, String str, String str2) {
            return LoginClient.m1816a(loginClient, str, str2, null);
        }

        static LoginClient m1816a(LoginClient loginClient, String str, String str2, String str3) {
            return new LoginClient(loginClient, LoginClient.ERROR, null, TextUtils.join(": ", af.m1527b(str, str2)), str3);
        }

        private LoginClient(Parcel parcel) {
            this.f1853a = LoginClient.valueOf(parcel.readString());
            this.f1854b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f1855c = parcel.readString();
            this.f1856d = parcel.readString();
            this.f1857e = (LoginClient) parcel.readParcelable(LoginClient.class.getClassLoader());
            this.f1858f = af.m1507a(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1853a.name());
            parcel.writeParcelable(this.f1854b, i);
            parcel.writeString(this.f1855c);
            parcel.writeString(this.f1856d);
            parcel.writeParcelable(this.f1857e, i);
            af.m1512a(parcel, this.f1858f);
        }

        static {
            CREATOR = new LoginClient();
        }
    }

    public LoginClient(Fragment fragment) {
        this.f1860b = -1;
        this.f1861c = fragment;
    }

    public static int m1817a() {
        return CallbackManagerImpl.Login.m1610a();
    }

    final LoginMethodHandler m1823b() {
        if (this.f1860b >= 0) {
            return this.f1859a[this.f1860b];
        }
        return null;
    }

    final boolean m1825c() {
        if (this.f1864f) {
            return true;
        }
        if (this.f1861c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            Activity activity = this.f1861c.getActivity();
            m1824b(LoginClient.m1815a(this.f1865g, activity.getString(R.com_facebook_internet_permission_error_title), activity.getString(R.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f1864f = true;
        return true;
    }

    final void m1826d() {
        if (this.f1860b >= 0) {
            m1818a(m1823b().m1739a(), "skipped", null, null, m1823b().f1781a);
        }
        while (this.f1859a != null && this.f1860b < this.f1859a.length - 1) {
            boolean a;
            this.f1860b++;
            LoginMethodHandler b = m1823b();
            if (!b.m1748d() || m1825c()) {
                a = b.m1745a(this.f1865g);
                LoginLogger g;
                String str;
                Bundle a2;
                if (a) {
                    g = m1821g();
                    str = this.f1865g.f1845e;
                    String a3 = b.m1739a();
                    a2 = LoginLogger.m1832a(str);
                    a2.putString("3_method", a3);
                    g.f1874a.m837b("fb_mobile_login_method_start", a2);
                    continue;
                } else {
                    g = m1821g();
                    str = this.f1865g.f1845e;
                    String a4 = b.m1739a();
                    a2 = LoginLogger.m1832a(str);
                    a2.putString("3_method", a4);
                    g.f1874a.m837b("fb_mobile_login_method_not_tried", a2);
                    m1819a("not_tried", b.m1739a(), true);
                    continue;
                }
            } else {
                m1819a("no_internet_permission", "1", false);
                a = false;
                continue;
            }
            if (a) {
                return;
            }
        }
        if (this.f1865g != null) {
            m1824b(LoginClient.m1815a(this.f1865g, "Login attempt failed.", null));
        }
    }

    private void m1819a(String str, String str2, boolean z) {
        if (this.f1866h == null) {
            this.f1866h = new HashMap();
        }
        if (this.f1866h.containsKey(str) && z) {
            str2 = ((String) this.f1866h.get(str)) + "," + str2;
        }
        this.f1866h.put(str, str2);
    }

    final void m1822a(LoginClient loginClient) {
        if (loginClient.f1854b == null || AccessToken.m883a() == null) {
            m1824b(loginClient);
        } else if (loginClient.f1854b == null) {
            throw new FacebookException("Can't validate without a token");
        } else {
            LoginClient a;
            AccessToken a2 = AccessToken.m883a();
            AccessToken accessToken = loginClient.f1854b;
            if (!(a2 == null || accessToken == null)) {
                try {
                    if (a2.f926h.equals(accessToken.f926h)) {
                        a = LoginClient.m1813a(this.f1865g, loginClient.f1854b);
                        m1824b(a);
                    }
                } catch (Exception e) {
                    m1824b(LoginClient.m1815a(this.f1865g, "Caught exception", e.getMessage()));
                    return;
                }
            }
            a = LoginClient.m1815a(this.f1865g, "User logged in as different Facebook user.", null);
            m1824b(a);
        }
    }

    final void m1824b(LoginClient loginClient) {
        LoginMethodHandler b = m1823b();
        if (b != null) {
            m1818a(b.m1739a(), loginClient.f1853a.f1852d, loginClient.f1855c, loginClient.f1856d, b.f1781a);
        }
        if (this.f1866h != null) {
            loginClient.f1858f = this.f1866h;
        }
        this.f1859a = null;
        this.f1860b = -1;
        this.f1865g = null;
        this.f1866h = null;
        if (this.f1862d != null) {
            this.f1862d.m1811a(loginClient);
        }
    }

    private LoginLogger m1821g() {
        if (this.f1867i == null || !this.f1867i.f1875b.equals(this.f1865g.f1844d)) {
            this.f1867i = new LoginLogger(this.f1861c.getActivity(), this.f1865g.f1844d);
        }
        return this.f1867i;
    }

    final void m1827e() {
        if (this.f1863e != null) {
            this.f1863e.m1809a();
        }
    }

    private void m1818a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f1865g == null) {
            m1821g().m1833a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger g = m1821g();
        Bundle a = LoginLogger.m1832a(this.f1865g.f1845e);
        if (str2 != null) {
            a.putString("2_result", str2);
        }
        if (str3 != null) {
            a.putString("5_error_message", str3);
        }
        if (str4 != null) {
            a.putString("4_error_code", str4);
        }
        if (!(map == null || map.isEmpty())) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str);
        g.f1874a.m837b("fb_mobile_login_method_complete", a);
    }

    static String m1820f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    public LoginClient(Parcel parcel) {
        this.f1860b = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f1859a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.f1859a[i] = (LoginMethodHandler) readParcelableArray[i];
            this.f1859a[i].m1741a(this);
        }
        this.f1860b = parcel.readInt();
        this.f1865g = (LoginClient) parcel.readParcelable(LoginClient.class.getClassLoader());
        this.f1866h = af.m1507a(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f1859a, i);
        parcel.writeInt(this.f1860b);
        parcel.writeParcelable(this.f1865g, i);
        af.m1512a(parcel, this.f1866h);
    }

    static {
        CREATOR = new LoginClient();
    }
}
