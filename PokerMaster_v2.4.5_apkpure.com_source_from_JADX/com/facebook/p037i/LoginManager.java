package com.facebook.p037i;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.ag;
import com.facebook.p037i.LoginClient.LoginClient;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.m */
public class LoginManager {
    private static final Set<String> f1882a;
    private static volatile LoginManager f1883b;
    private LoginBehavior f1884c;
    private DefaultAudience f1885d;

    /* renamed from: com.facebook.i.m.1 */
    class LoginManager implements CallbackManagerImpl {
        final /* synthetic */ FacebookCallback f1877a;
        final /* synthetic */ LoginManager f1878b;

        LoginManager(LoginManager loginManager, FacebookCallback facebookCallback) {
            this.f1878b = loginManager;
            this.f1877a = facebookCallback;
        }

        public final boolean m1835a(int i, Intent intent) {
            return LoginManager.m1844a(i, intent, this.f1877a);
        }
    }

    /* renamed from: com.facebook.i.m.2 */
    static class LoginManager extends HashSet<String> {
        LoginManager() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: com.facebook.i.m.3 */
    class LoginManager implements CallbackManagerImpl {
        final /* synthetic */ LoginManager f1879a;

        LoginManager(LoginManager loginManager) {
            this.f1879a = loginManager;
        }

        public final boolean m1836a(int i, Intent intent) {
            return LoginManager.m1844a(i, intent, null);
        }
    }

    /* renamed from: com.facebook.i.m.a */
    private static class LoginManager implements StartActivityDelegate {
        private final Activity f1880a;

        LoginManager(Activity activity) {
            ag.m1544a((Object) activity, Constants.FLAG_ACTIVITY_NAME);
            this.f1880a = activity;
        }

        public final void m1840a(Intent intent, int i) {
            this.f1880a.startActivityForResult(intent, i);
        }

        public final Activity m1839a() {
            return this.f1880a;
        }
    }

    /* renamed from: com.facebook.i.m.b */
    private static class LoginManager {
        private static volatile LoginLogger f1881a;

        static synchronized LoginLogger m1841a(Context context) {
            LoginLogger loginLogger;
            synchronized (LoginManager.class) {
                if (context == null) {
                    context = FacebookSdk.m2586f();
                }
                if (context == null) {
                    loginLogger = null;
                } else {
                    if (f1881a == null) {
                        f1881a = new LoginLogger(context, FacebookSdk.m2590j());
                    }
                    loginLogger = f1881a;
                }
            }
            return loginLogger;
        }
    }

    LoginManager() {
        this.f1884c = LoginBehavior.NATIVE_WITH_FALLBACK;
        this.f1885d = DefaultAudience.FRIENDS;
        ag.m1541a();
    }

    public static LoginManager m1842a() {
        if (f1883b == null) {
            synchronized (LoginManager.class) {
                if (f1883b == null) {
                    f1883b = new LoginManager();
                }
            }
        }
        return f1883b;
    }

    public final void m1849a(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        if (callbackManager instanceof com.facebook.p036h.CallbackManagerImpl) {
            ((com.facebook.p036h.CallbackManagerImpl) callbackManager).m1614b(CallbackManagerImpl.Login.m1610a(), new LoginManager(this, facebookCallback));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    static boolean m1844a(int i, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        Map map;
        Exception exception;
        AccessToken accessToken;
        boolean z;
        LoginClient loginClient;
        LoginClient.LoginClient loginClient2;
        LoginResult loginResult = null;
        LoginClient.LoginClient loginClient3 = LoginClient.LoginClient.ERROR;
        boolean z2 = false;
        if (intent != null) {
            AccessToken accessToken2;
            Map map2;
            LoginClient loginClient4;
            LoginClient.LoginClient loginClient5;
            LoginResult loginResult2;
            LoginClient.LoginClient loginClient6;
            LoginClient loginClient7 = (LoginClient) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (loginClient7 != null) {
                AccessToken accessToken3;
                LoginResult loginResult3;
                LoginClient loginClient8 = loginClient7.f1857e;
                LoginClient.LoginClient loginClient9 = loginClient7.f1853a;
                if (i == -1) {
                    if (loginClient7.f1853a == LoginClient.LoginClient.SUCCESS) {
                        accessToken3 = loginClient7.f1854b;
                        loginResult3 = null;
                    } else {
                        Object facebookAuthorizationException = new FacebookAuthorizationException(loginClient7.f1855c);
                        accessToken3 = null;
                    }
                } else if (i == 0) {
                    z2 = true;
                    accessToken3 = null;
                    loginResult3 = null;
                } else {
                    accessToken3 = null;
                    loginResult3 = null;
                }
                LoginClient loginClient10 = loginClient8;
                accessToken2 = accessToken3;
                map2 = loginClient7.f1858f;
                loginClient4 = loginClient10;
                loginClient5 = loginClient9;
                loginResult2 = loginResult3;
                loginClient6 = loginClient5;
            } else {
                Object obj = null;
                loginClient6 = loginClient3;
                Object obj2 = null;
                loginResult2 = null;
                Object obj3 = null;
            }
            boolean z3 = z2;
            map = map2;
            exception = loginResult2;
            accessToken = accessToken2;
            z = z3;
            loginClient5 = loginClient6;
            loginClient = loginClient4;
            loginClient2 = loginClient5;
        } else if (i == 0) {
            loginClient2 = LoginClient.LoginClient.CANCEL;
            z = true;
            loginClient = null;
            map = null;
            accessToken = null;
            exception = null;
        } else {
            z = false;
            loginClient = null;
            loginClient2 = loginClient3;
            accessToken = null;
            map = null;
            exception = null;
        }
        if (exception == null && accessToken == null && !z) {
            exception = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        LoginManager.m1843a(null, loginClient2, map, exception, true, loginClient);
        if (accessToken != null) {
            AccessToken.m887a(accessToken);
            Profile.m2663b();
        }
        if (facebookCallback != null) {
            if (accessToken != null) {
                Collection collection = loginClient.f1842b;
                obj = new HashSet(accessToken.f920b);
                if (loginClient.f1846f) {
                    obj.retainAll(collection);
                }
                Set hashSet = new HashSet(collection);
                hashSet.removeAll(obj);
                loginResult = new LoginResult(accessToken, obj, hashSet);
            }
            if (!z && (r0 == null || r0.f1886a.size() != 0)) {
                if (exception != null) {
                    facebookCallback.m1470a(exception);
                } else if (accessToken != null) {
                    facebookCallback.m1469a();
                }
            }
        }
        return true;
    }

    public static void m1847b() {
        AccessToken.m887a(null);
        Profile.m2662a(null);
    }

    public final void m1848a(Activity activity, Collection<String> collection) {
        boolean z;
        if (collection != null) {
            for (String a : collection) {
                if (LoginManager.m1846a(a)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{(String) r1.next()}));
                }
            }
        }
        LoginClient loginClient = new LoginClient(this.f1884c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f1885d, FacebookSdk.m2590j(), UUID.randomUUID().toString());
        if (AccessToken.m883a() != null) {
            z = true;
        } else {
            z = false;
        }
        loginClient.f1846f = z;
        StartActivityDelegate loginManager = new LoginManager(activity);
        LoginLogger a2 = LoginManager.m1841a(loginManager.m1837a());
        if (a2 != null) {
            Bundle a3 = LoginLogger.m1832a(loginClient.f1845e);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", loginClient.f1841a.toString());
                jSONObject.put("request_code", LoginClient.m1817a());
                jSONObject.put("permissions", TextUtils.join(",", loginClient.f1842b));
                jSONObject.put("default_audience", loginClient.f1843c.toString());
                jSONObject.put("isReauthorize", loginClient.f1846f);
                if (a2.f1876c != null) {
                    jSONObject.put("facebookVersion", a2.f1876c);
                }
                a3.putString("6_extras", jSONObject.toString());
            } catch (JSONException e) {
            }
            a2.f1874a.m837b("fb_mobile_login_start", a3);
        }
        com.facebook.p036h.CallbackManagerImpl.m1612a(CallbackManagerImpl.Login.m1610a(), new LoginManager(this));
        if (!LoginManager.m1845a(loginManager, loginClient)) {
            Exception facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.m1843a(loginManager.m1837a(), LoginClient.LoginClient.ERROR, null, facebookException, false, loginClient);
            throw facebookException;
        }
    }

    static boolean m1846a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f1882a.contains(str));
    }

    private static boolean m1845a(StartActivityDelegate startActivityDelegate, LoginClient loginClient) {
        boolean z;
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.m2586f(), FacebookActivity.class);
        intent.setAction(loginClient.f1841a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", loginClient);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (FacebookSdk.m2586f().getPackageManager().resolveActivity(intent, 0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        try {
            startActivityDelegate.m1838a(intent, LoginClient.m1817a());
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    private static void m1843a(Context context, LoginClient.LoginClient loginClient, Map<String, String> map, Exception exception, boolean z, LoginClient loginClient2) {
        LoginLogger a = LoginManager.m1841a(context);
        if (a != null) {
            if (loginClient2 == null) {
                a.m1833a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", LetterIndexBar.SEARCH_ICON_LETTER);
                return;
            }
            Object obj;
            Map hashMap = new HashMap();
            String str = "try_login_activity";
            if (z) {
                obj = "1";
            } else {
                obj = "0";
            }
            hashMap.put(str, obj);
            a.m1834a(loginClient2.f1845e, hashMap, loginClient, map, exception);
        }
    }

    static {
        f1882a = Collections.unmodifiableSet(new LoginManager());
    }
}
