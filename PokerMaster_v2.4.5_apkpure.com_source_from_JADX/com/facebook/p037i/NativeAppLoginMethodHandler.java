package com.facebook.p037i;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.p036h.ac;
import com.facebook.p036h.af;
import com.facebook.p037i.LoginClient.LoginClient;

/* renamed from: com.facebook.i.p */
abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    abstract boolean m1796a(LoginClient loginClient);

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    final boolean m1794a(int i, int i2, Intent intent) {
        LoginClient a;
        LoginClient loginClient = this.b.f1865g;
        if (intent == null) {
            a = LoginClient.m1814a(loginClient, "Operation canceled");
        } else if (i2 == 0) {
            Bundle extras = intent.getExtras();
            String a2 = NativeAppLoginMethodHandler.m1792a(extras);
            String string = extras.getString("error_code");
            if ("CONNECTION_FAILURE".equals(string)) {
                a = LoginClient.m1816a(loginClient, a2, NativeAppLoginMethodHandler.m1793b(extras), string);
            } else {
                a = LoginClient.m1814a(loginClient, a2);
            }
        } else if (i2 != -1) {
            a = LoginClient.m1815a(loginClient, "Unexpected resultCode from authorization.", null);
        } else {
            a = m1791a(loginClient, intent);
        }
        if (a != null) {
            this.b.m1822a(a);
        } else {
            this.b.m1826d();
        }
        return true;
    }

    private LoginClient m1791a(LoginClient loginClient, Intent intent) {
        String str = null;
        Bundle extras = intent.getExtras();
        String a = NativeAppLoginMethodHandler.m1792a(extras);
        String string = extras.getString("error_code");
        String b = NativeAppLoginMethodHandler.m1793b(extras);
        String string2 = extras.getString("e2e");
        if (!af.m1523a(string2)) {
            m1747b(string2);
        }
        if (a == null && string == null && b == null) {
            try {
                return LoginClient.m1813a(loginClient, LoginMethodHandler.m1737a(loginClient.f1842b, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, loginClient.f1844d));
            } catch (FacebookException e) {
                return LoginClient.m1815a(loginClient, str, e.getMessage());
            }
        } else if (ac.f1549a.contains(a)) {
            return str;
        } else {
            if (ac.f1550b.contains(a)) {
                return LoginClient.m1814a(loginClient, str);
            }
            return LoginClient.m1816a(loginClient, a, b, string);
        }
    }

    private static String m1792a(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    private static String m1793b(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    protected final boolean m1795a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.b.f1861c.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }
}
