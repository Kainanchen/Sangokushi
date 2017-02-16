package com.facebook.p051j.p054c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.os.EnvironmentCompat;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.AppCall;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.DialogFeature;
import com.facebook.p036h.DialogPresenter;
import com.facebook.p036h.FacebookDialogBase;
import com.facebook.p036h.NativeAppCallAttachmentStore.NativeAppCallAttachmentStore;
import com.facebook.p036h.af;
import com.facebook.p051j.Sharer.Sharer;
import com.facebook.p051j.p052a.LegacyNativeDialogParameters;
import com.facebook.p051j.p052a.NativeDialogParameters;
import com.facebook.p051j.p052a.OpenGraphActionDialogFeature;
import com.facebook.p051j.p052a.ShareContentValidation;
import com.facebook.p051j.p052a.ShareDialogFeature;
import com.facebook.p051j.p052a.ShareFeedContent;
import com.facebook.p051j.p052a.ShareInternalUtility.ShareInternalUtility;
import com.facebook.p051j.p052a.WebDialogParameters;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareMediaContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.SharePhoto;
import com.facebook.p051j.p053b.SharePhotoContent;
import com.facebook.p051j.p053b.ShareVideoContent;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.j.c.b */
public final class ShareDialog extends FacebookDialogBase<ShareContent, Sharer> implements com.facebook.p051j.Sharer {
    private static final int f2640d;
    boolean f2641c;
    private boolean f2642e;

    /* renamed from: com.facebook.j.c.b.1 */
    static /* synthetic */ class ShareDialog {
        static final /* synthetic */ int[] f2627a;

        static {
            f2627a = new int[ShareDialog.values().length];
            try {
                f2627a[ShareDialog.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2627a[ShareDialog.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2627a[ShareDialog.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: com.facebook.j.c.b.a */
    private class ShareDialog extends FacebookDialogBase.FacebookDialogBase {
        final /* synthetic */ ShareDialog f2628b;

        private ShareDialog(ShareDialog shareDialog) {
            this.f2628b = shareDialog;
            super(shareDialog);
        }

        public final /* bridge */ /* synthetic */ boolean m2545a(Object obj) {
            ShareContent shareContent = (ShareContent) obj;
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        public final /* synthetic */ AppCall m2546b(Object obj) {
            Bundle bundle;
            ShareContent shareContent = (ShareContent) obj;
            ShareDialog.m2556a(this.f2628b, this.f2628b.m1629a(), shareContent, ShareDialog.FEED);
            AppCall c = this.f2628b.m2569c();
            if (shareContent instanceof ShareLinkContent) {
                shareContent = (ShareLinkContent) shareContent;
                ShareContentValidation.m2467a(shareContent);
                bundle = new Bundle();
                af.m1511a(bundle, SelectCountryActivity.EXTRA_COUNTRY_NAME, shareContent.f2588b);
                af.m1511a(bundle, WBConstants.GAME_PARAMS_DESCRIPTION, shareContent.f2587a);
                af.m1511a(bundle, "link", af.m1497a(shareContent.f2541h));
                af.m1511a(bundle, "picture", af.m1497a(shareContent.f2589c));
                af.m1511a(bundle, "quote", shareContent.f2590d);
                if (shareContent.f2545l != null) {
                    af.m1511a(bundle, "hashtag", shareContent.f2545l.f2582a);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                af.m1511a(bundle, "to", shareFeedContent.f2546a);
                af.m1511a(bundle, "link", shareFeedContent.f2547b);
                af.m1511a(bundle, "picture", shareFeedContent.f2551f);
                af.m1511a(bundle, WBConstants.GAME_PARAMS_SOURCE, shareFeedContent.f2552g);
                af.m1511a(bundle, SelectCountryActivity.EXTRA_COUNTRY_NAME, shareFeedContent.f2548c);
                af.m1511a(bundle, "caption", shareFeedContent.f2549d);
                af.m1511a(bundle, WBConstants.GAME_PARAMS_DESCRIPTION, shareFeedContent.f2550e);
            }
            DialogPresenter.m1621a(c, "feed", bundle);
            return c;
        }

        public final Object m2544a() {
            return ShareDialog.FEED;
        }
    }

    /* renamed from: com.facebook.j.c.b.b */
    public enum ShareDialog {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.j.c.b.c */
    private class ShareDialog extends FacebookDialogBase.FacebookDialogBase {
        final /* synthetic */ ShareDialog f2638b;

        /* renamed from: com.facebook.j.c.b.c.1 */
        class ShareDialog implements DialogPresenter.DialogPresenter {
            final /* synthetic */ AppCall f2634a;
            final /* synthetic */ ShareContent f2635b;
            final /* synthetic */ boolean f2636c;
            final /* synthetic */ ShareDialog f2637d;

            ShareDialog(ShareDialog shareDialog, AppCall appCall, ShareContent shareContent, boolean z) {
                this.f2637d = shareDialog;
                this.f2634a = appCall;
                this.f2635b = shareContent;
                this.f2636c = z;
            }

            public final Bundle m2547a() {
                return NativeDialogParameters.m2449a(this.f2634a.f1535a, this.f2635b, this.f2636c);
            }

            public final Bundle m2548b() {
                return LegacyNativeDialogParameters.m2447a(this.f2634a.f1535a, this.f2635b, this.f2636c);
            }
        }

        private ShareDialog(ShareDialog shareDialog) {
            this.f2638b = shareDialog;
            super(shareDialog);
        }

        public final /* synthetic */ boolean m2550a(Object obj) {
            ShareContent shareContent = (ShareContent) obj;
            return shareContent != null && ShareDialog.m2563e(shareContent.getClass());
        }

        public final /* synthetic */ AppCall m2551b(Object obj) {
            ShareContent shareContent = (ShareContent) obj;
            ShareDialog.m2556a(this.f2638b, this.f2638b.m1629a(), shareContent, ShareDialog.NATIVE);
            if (ShareContentValidation.f2531a == null) {
                ShareContentValidation.f2531a = new ShareContentValidation.ShareContentValidation();
            }
            ShareContentValidation.m2468a(shareContent, ShareContentValidation.f2531a);
            AppCall c = this.f2638b.m2569c();
            DialogPresenter.m1619a(c, new ShareDialog(this, c, shareContent, this.f2638b.f2641c), ShareDialog.m2565g(shareContent.getClass()));
            return c;
        }

        public final Object m2549a() {
            return ShareDialog.NATIVE;
        }
    }

    /* renamed from: com.facebook.j.c.b.d */
    private class ShareDialog extends FacebookDialogBase.FacebookDialogBase {
        final /* synthetic */ ShareDialog f2639b;

        private ShareDialog(ShareDialog shareDialog) {
            this.f2639b = shareDialog;
            super(shareDialog);
        }

        public final /* synthetic */ boolean m2553a(Object obj) {
            ShareContent shareContent = (ShareContent) obj;
            return shareContent != null && ShareDialog.m2564f(shareContent.getClass());
        }

        public final /* synthetic */ AppCall m2554b(Object obj) {
            Bundle a;
            ShareContent shareContent = (ShareContent) obj;
            ShareDialog.m2556a(this.f2639b, this.f2639b.m1629a(), shareContent, ShareDialog.WEB);
            AppCall c = this.f2639b.m2569c();
            ShareContentValidation.m2467a(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                a = WebDialogParameters.m2496a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof SharePhotoContent) {
                SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
                UUID uuid = c.f1535a;
                SharePhotoContent.SharePhotoContent a2 = new SharePhotoContent.SharePhotoContent().m2518a(sharePhotoContent);
                List arrayList = new ArrayList();
                Collection arrayList2 = new ArrayList();
                for (int i = 0; i < sharePhotoContent.f2610a.size(); i++) {
                    Object obj2 = (SharePhoto) sharePhotoContent.f2610a.get(i);
                    Bitmap bitmap = obj2.f2605b;
                    if (bitmap != null) {
                        NativeAppCallAttachmentStore a3 = com.facebook.p036h.NativeAppCallAttachmentStore.m1691a(uuid, bitmap);
                        SharePhoto.SharePhoto a4 = new SharePhoto.SharePhoto().m2512a((SharePhoto) obj2);
                        a4.f2602c = Uri.parse(a3.f1764b);
                        a4.f2601b = null;
                        obj2 = a4.m2513a();
                        arrayList2.add(a3);
                    }
                    arrayList.add(obj2);
                }
                a2.m2519a(arrayList);
                com.facebook.p036h.NativeAppCallAttachmentStore.m1697a(arrayList2);
                ShareContent a5 = a2.m2520a();
                a = WebDialogParameters.m2495a(a5);
                String[] strArr = new String[a5.f2610a.size()];
                af.m1505a(a5.f2610a, new WebDialogParameters.WebDialogParameters()).toArray(strArr);
                a.putStringArray("media", strArr);
            } else {
                a = WebDialogParameters.m2497a((ShareOpenGraphContent) shareContent);
            }
            String str = ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) ? WBConstants.ACTION_LOG_TYPE_SHARE : shareContent instanceof ShareOpenGraphContent ? "share_open_graph" : null;
            DialogPresenter.m1621a(c, str, a);
            return c;
        }

        public final Object m2552a() {
            return ShareDialog.WEB;
        }
    }

    static {
        f2640d = CallbackManagerImpl.Share.m1610a();
    }

    public static boolean m2557a(Class<? extends ShareContent> cls) {
        return ShareDialog.m2564f(cls) || ShareDialog.m2563e(cls);
    }

    private static boolean m2563e(Class<? extends ShareContent> cls) {
        DialogFeature g = ShareDialog.m2565g(cls);
        return g != null && DialogPresenter.m1622a(g);
    }

    private static boolean m2564f(Class<? extends ShareContent> cls) {
        AccessToken a = AccessToken.m883a();
        boolean z;
        if (a == null || a.m888b()) {
            z = false;
        } else {
            z = true;
        }
        if (ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && r0)) {
            return true;
        }
        return false;
    }

    public ShareDialog(Activity activity) {
        super(activity, f2640d);
        this.f2641c = false;
        this.f2642e = true;
        int i = f2640d;
        com.facebook.p036h.CallbackManagerImpl.m1612a(i, new ShareInternalUtility(i));
    }

    public final void m2567a(ShareContent shareContent, ShareDialog shareDialog) {
        this.f2642e = shareDialog == ShareDialog.AUTOMATIC;
        if (this.f2642e) {
            shareDialog = a;
        }
        m1631a((Object) shareContent, (Object) shareDialog);
    }

    protected final AppCall m2569c() {
        return new AppCall(this.f1652b);
    }

    protected final List<FacebookDialogBase.FacebookDialogBase> m2568b() {
        List arrayList = new ArrayList();
        arrayList.add(new ShareDialog());
        arrayList.add(new ShareDialog());
        arrayList.add(new ShareDialog());
        return arrayList;
    }

    private static DialogFeature m2565g(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.f2526a;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        return null;
    }

    protected final void m2566a(com.facebook.p036h.CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer> facebookCallback) {
        int i = this.f1652b;
        if (callbackManagerImpl instanceof com.facebook.p036h.CallbackManagerImpl) {
            callbackManagerImpl.m1614b(i, new ShareInternalUtility(i, facebookCallback));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    static /* synthetic */ void m2556a(ShareDialog shareDialog, Context context, ShareContent shareContent, ShareDialog shareDialog2) {
        String str;
        String str2;
        if (shareDialog.f2642e) {
            shareDialog2 = ShareDialog.AUTOMATIC;
        }
        switch (ShareDialog.f2627a[shareDialog2.ordinal()]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                str = "automatic";
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                str = "web";
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                str = "native";
                break;
            default:
                str = EnvironmentCompat.MEDIA_UNKNOWN;
                break;
        }
        DialogFeature g = ShareDialog.m2565g(shareContent.getClass());
        if (g == ShareDialogFeature.SHARE_DIALOG) {
            str2 = NotificationCompatApi24.CATEGORY_STATUS;
        } else if (g == ShareDialogFeature.PHOTOS) {
            str2 = "photo";
        } else if (g == ShareDialogFeature.VIDEO) {
            str2 = "video";
        } else if (g == OpenGraphActionDialogFeature.f2526a) {
            str2 = "open_graph";
        } else {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        AppEventsLogger a = AppEventsLogger.m824a(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        a.m837b("fb_share_dialog_show", bundle);
    }
}
