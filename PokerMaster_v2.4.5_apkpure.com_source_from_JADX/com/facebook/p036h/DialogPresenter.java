package com.facebook.p036h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.p036h.FetchedAppSettings.FetchedAppSettings;
import com.tencent.android.tpush.common.MessageKey;

/* renamed from: com.facebook.h.i */
public final class DialogPresenter {

    /* renamed from: com.facebook.h.i.a */
    public interface DialogPresenter {
        Bundle m1617a();

        Bundle m1618b();
    }

    public static boolean m1622a(DialogFeature dialogFeature) {
        return DialogPresenter.m1624c(dialogFeature) != -1;
    }

    public static void m1621a(AppCall appCall, String str, Bundle bundle) {
        ag.m1548b(FacebookSdk.m2586f());
        ag.m1542a(FacebookSdk.m2586f());
        Bundle bundle2 = new Bundle();
        bundle2.putString(MessageKey.MSG_ACTION, str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        NativeProtocol.m1725a(intent, appCall.f1535a.toString(), str, NativeProtocol.m1712a(), bundle2);
        intent.setClass(FacebookSdk.m2586f(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.f1536b = intent;
    }

    public static void m1619a(AppCall appCall, DialogPresenter dialogPresenter, DialogFeature dialogFeature) {
        Context f = FacebookSdk.m2586f();
        String a = dialogFeature.m1615a();
        int c = DialogPresenter.m1624c(dialogFeature);
        if (c == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle a2;
        if (NativeProtocol.m1726a(c)) {
            a2 = dialogPresenter.m1617a();
        } else {
            a2 = dialogPresenter.m1618b();
        }
        if (a2 == null) {
            a2 = new Bundle();
        }
        Intent a3 = NativeProtocol.m1717a(f, appCall.f1535a.toString(), a, c, a2);
        if (a3 == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.f1536b = a3;
    }

    public static Uri m1623b(DialogFeature dialogFeature) {
        String name = dialogFeature.name();
        FetchedAppSettings a = FetchedAppSettings.m1644a(FacebookSdk.m2590j(), dialogFeature.m1615a(), name);
        if (a != null) {
            return a.f1672c;
        }
        return null;
    }

    private static int m1624c(DialogFeature dialogFeature) {
        String j = FacebookSdk.m2590j();
        String a = dialogFeature.m1615a();
        FetchedAppSettings a2 = FetchedAppSettings.m1644a(j, a, dialogFeature.name());
        return NativeProtocol.m1713a(a, a2 != null ? a2.f1673d : new int[]{dialogFeature.m1616b()});
    }

    public static void m1620a(AppCall appCall, FacebookException facebookException) {
        ag.m1548b(FacebookSdk.m2586f());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.m2586f(), FacebookActivity.class);
        intent.setAction(FacebookActivity.f816a);
        NativeProtocol.m1725a(intent, appCall.f1535a.toString(), null, NativeProtocol.m1712a(), NativeProtocol.m1721a(facebookException));
        appCall.f1536b = intent;
    }
}
