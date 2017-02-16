package com.facebook.p051j.p054c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.p036h.AppCall;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.DialogFeature;
import com.facebook.p036h.DialogPresenter.DialogPresenter;
import com.facebook.p036h.FacebookDialogBase;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p036h.ac;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.facebook.p051j.p052a.AppInviteDialogFeature;
import com.facebook.p051j.p052a.ResultProcessor;
import com.facebook.p051j.p052a.ShareInternalUtility;
import com.facebook.p051j.p053b.AppInviteContent;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j.c.a */
public final class AppInviteDialog extends FacebookDialogBase<AppInviteContent, AppInviteDialog> {
    private static final int f2626c;

    /* renamed from: com.facebook.j.c.a.1 */
    class AppInviteDialog extends ResultProcessor {
        final /* synthetic */ FacebookCallback f2617a;
        final /* synthetic */ AppInviteDialog f2618b;

        AppInviteDialog(AppInviteDialog appInviteDialog, FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            this.f2618b = appInviteDialog;
            this.f2617a = facebookCallback2;
            super(facebookCallback);
        }

        public final void m2525a(Bundle bundle) {
            if (!"cancel".equalsIgnoreCase(ShareInternalUtility.m2486a(bundle))) {
                FacebookCallback facebookCallback = this.f2617a;
                AppInviteDialog appInviteDialog = new AppInviteDialog(bundle);
                facebookCallback.m1469a();
            }
        }
    }

    /* renamed from: com.facebook.j.c.a.2 */
    class AppInviteDialog implements CallbackManagerImpl {
        final /* synthetic */ ResultProcessor f2619a;
        final /* synthetic */ AppInviteDialog f2620b;

        AppInviteDialog(AppInviteDialog appInviteDialog, ResultProcessor resultProcessor) {
            this.f2620b = appInviteDialog;
            this.f2619a = resultProcessor;
        }

        public final boolean m2526a(int i, Intent intent) {
            return ShareInternalUtility.m2493a(this.f2620b.f1652b, intent, this.f2619a);
        }
    }

    /* renamed from: com.facebook.j.c.a.a */
    private class AppInviteDialog extends FacebookDialogBase.FacebookDialogBase {
        final /* synthetic */ AppInviteDialog f2623b;

        /* renamed from: com.facebook.j.c.a.a.1 */
        class AppInviteDialog implements DialogPresenter {
            final /* synthetic */ AppInviteContent f2621a;
            final /* synthetic */ AppInviteDialog f2622b;

            AppInviteDialog(AppInviteDialog appInviteDialog, AppInviteContent appInviteContent) {
                this.f2622b = appInviteDialog;
                this.f2621a = appInviteContent;
            }

            public final Bundle m2527a() {
                return AppInviteDialog.m2535b(this.f2621a);
            }

            public final Bundle m2528b() {
                Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                return new Bundle();
            }
        }

        private AppInviteDialog(AppInviteDialog appInviteDialog) {
            this.f2623b = appInviteDialog;
            super(appInviteDialog);
        }

        public final /* synthetic */ AppCall m2530b(Object obj) {
            AppInviteContent appInviteContent = (AppInviteContent) obj;
            AppCall c = this.f2623b.m2543c();
            com.facebook.p036h.DialogPresenter.m1619a(c, new AppInviteDialog(this, appInviteContent), AppInviteDialogFeature.f2511a);
            return c;
        }

        public final /* synthetic */ boolean m2529a(Object obj) {
            return com.facebook.p036h.DialogPresenter.m1622a(AppInviteDialogFeature.f2511a);
        }
    }

    /* renamed from: com.facebook.j.c.a.b */
    public static final class AppInviteDialog {
        private final Bundle f2624a;

        public AppInviteDialog(Bundle bundle) {
            this.f2624a = bundle;
        }
    }

    /* renamed from: com.facebook.j.c.a.c */
    private class AppInviteDialog extends FacebookDialogBase.FacebookDialogBase {
        final /* synthetic */ AppInviteDialog f2625b;

        private AppInviteDialog(AppInviteDialog appInviteDialog) {
            this.f2625b = appInviteDialog;
            super(appInviteDialog);
        }

        public final /* synthetic */ AppCall m2532b(Object obj) {
            AppInviteContent appInviteContent = (AppInviteContent) obj;
            AppCall c = this.f2625b.m2543c();
            Bundle a = AppInviteDialog.m2535b(appInviteContent);
            DialogFeature f = AppInviteDialogFeature.f2511a;
            ag.m1548b(FacebookSdk.m2586f());
            ag.m1542a(FacebookSdk.m2586f());
            String name = f.name();
            Uri b = com.facebook.p036h.DialogPresenter.m1623b(f);
            if (b == null) {
                throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + "'");
            }
            a = ac.m1477a(c.f1535a.toString(), NativeProtocol.m1712a(), a);
            if (a == null) {
                throw new FacebookException("Unable to fetch the app's key-hash");
            }
            Uri a2;
            if (b.isRelative()) {
                a2 = af.m1492a(ac.m1478a(), b.toString(), a);
            } else {
                a2 = af.m1492a(b.getAuthority(), b.getPath(), a);
            }
            Bundle bundle = new Bundle();
            bundle.putString(ParamKey.URL, a2.toString());
            bundle.putBoolean("is_fallback", true);
            Intent intent = new Intent();
            NativeProtocol.m1725a(intent, c.f1535a.toString(), f.m1615a(), NativeProtocol.m1712a(), bundle);
            intent.setClass(FacebookSdk.m2586f(), FacebookActivity.class);
            intent.setAction("FacebookDialogFragment");
            c.f1536b = intent;
            return c;
        }

        public final /* synthetic */ boolean m2531a(Object obj) {
            return AppInviteDialog.m2540h();
        }
    }

    static {
        f2626c = CallbackManagerImpl.AppInvite.m1610a();
    }

    public static void m2534a(Activity activity, AppInviteContent appInviteContent) {
        new AppInviteDialog(activity).m1631a((Object) appInviteContent, FacebookDialogBase.f1651a);
    }

    public AppInviteDialog(Activity activity) {
        super(activity, f2626c);
    }

    protected final void m2541a(com.facebook.p036h.CallbackManagerImpl callbackManagerImpl, FacebookCallback<AppInviteDialog> facebookCallback) {
        callbackManagerImpl.m1614b(this.f1652b, new AppInviteDialog(this, new AppInviteDialog(this, facebookCallback, facebookCallback)));
    }

    protected final AppCall m2543c() {
        return new AppCall(this.f1652b);
    }

    protected final List<FacebookDialogBase.FacebookDialogBase> m2542b() {
        List arrayList = new ArrayList();
        arrayList.add(new AppInviteDialog());
        arrayList.add(new AppInviteDialog());
        return arrayList;
    }

    private static Bundle m2535b(AppInviteContent appInviteContent) {
        AppInviteContent.AppInviteContent.AppInviteContent appInviteContent2;
        Bundle bundle = new Bundle();
        bundle.putString("app_link_url", appInviteContent.f2571a);
        bundle.putString("preview_image_url", appInviteContent.f2572b);
        String str = "destination";
        if (appInviteContent.f2575e != null) {
            appInviteContent2 = appInviteContent.f2575e;
        } else {
            appInviteContent2 = AppInviteContent.AppInviteContent.AppInviteContent.FACEBOOK;
        }
        bundle.putString(str, appInviteContent2.toString());
        String str2 = appInviteContent.f2573c;
        if (str2 == null) {
            str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        Object obj = appInviteContent.f2574d;
        if (!TextUtils.isEmpty(obj)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("promo_code", str2);
                jSONObject.put("promo_text", obj);
                bundle.putString("deeplink_context", jSONObject.toString());
                bundle.putString("promo_code", str2);
                bundle.putString("promo_text", obj);
            } catch (JSONException e) {
                Log.e("AppInviteDialog", "Json Exception in creating deeplink context");
            }
        }
        return bundle;
    }

    public static boolean m2536d() {
        return com.facebook.p036h.DialogPresenter.m1622a(AppInviteDialogFeature.f2511a) || AppInviteDialog.m2540h();
    }

    private static boolean m2540h() {
        return com.facebook.p036h.DialogPresenter.m1623b(AppInviteDialogFeature.f2511a) != null;
    }
}
