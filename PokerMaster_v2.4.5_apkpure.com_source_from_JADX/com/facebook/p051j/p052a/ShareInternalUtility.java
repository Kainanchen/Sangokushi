package com.facebook.p051j.p052a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.AppCall;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.NativeAppCallAttachmentStore.NativeAppCallAttachmentStore;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p036h.af;
import com.facebook.p036h.af.Utility;
import com.facebook.p051j.Sharer.Sharer;
import com.facebook.p051j.p052a.OpenGraphJSONUtility.OpenGraphJSONUtility;
import com.facebook.p051j.p053b.ShareMedia;
import com.facebook.p051j.p053b.ShareOpenGraphAction;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.SharePhoto;
import com.facebook.p051j.p053b.SharePhotoContent;
import com.facebook.p051j.p053b.ShareVideo;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.tencent.android.tpush.common.MessageKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.k */
public final class ShareInternalUtility {

    /* renamed from: com.facebook.j.a.k.1 */
    static class ShareInternalUtility extends ResultProcessor {
        final /* synthetic */ FacebookCallback f2553a;

        ShareInternalUtility(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            this.f2553a = facebookCallback2;
            super(facebookCallback);
        }

        public final void m2474a(Bundle bundle) {
            if (bundle != null) {
                String a = ShareInternalUtility.m2486a(bundle);
                if (a == null || "post".equalsIgnoreCase(a)) {
                    if (bundle.containsKey("postId")) {
                        a = bundle.getString("postId");
                    } else if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                        a = bundle.getString("com.facebook.platform.extra.POST_ID");
                    } else {
                        a = bundle.getString("post_id");
                    }
                    FacebookCallback facebookCallback = this.f2553a;
                    ShareInternalUtility.m2492a("succeeded", null);
                    if (facebookCallback != null) {
                        Sharer sharer = new Sharer(a);
                        facebookCallback.m1469a();
                    }
                } else if ("cancel".equalsIgnoreCase(a)) {
                    ShareInternalUtility.m2492a("cancelled", null);
                } else {
                    ShareInternalUtility.m2491a(this.f2553a, new FacebookException("UnknownError"));
                }
            }
        }

        public final void m2475a(FacebookException facebookException) {
            ShareInternalUtility.m2491a(this.f2553a, facebookException);
        }

        public final void m2473a() {
            ShareInternalUtility.m2492a("cancelled", null);
        }
    }

    /* renamed from: com.facebook.j.a.k.2 */
    static class ShareInternalUtility implements CallbackManagerImpl {
        final /* synthetic */ int f2554a;

        public ShareInternalUtility(int i) {
            this.f2554a = i;
        }

        public final boolean m2476a(int i, Intent intent) {
            return ShareInternalUtility.m2493a(this.f2554a, intent, ShareInternalUtility.m2485a(null));
        }
    }

    /* renamed from: com.facebook.j.a.k.3 */
    static class ShareInternalUtility implements CallbackManagerImpl {
        final /* synthetic */ int f2555a;
        final /* synthetic */ FacebookCallback f2556b;

        public ShareInternalUtility(int i, FacebookCallback facebookCallback) {
            this.f2555a = i;
            this.f2556b = facebookCallback;
        }

        public final boolean m2477a(int i, Intent intent) {
            return ShareInternalUtility.m2493a(this.f2555a, intent, ShareInternalUtility.m2485a(this.f2556b));
        }
    }

    /* renamed from: com.facebook.j.a.k.4 */
    static class ShareInternalUtility implements Utility<SharePhoto, NativeAppCallAttachmentStore> {
        final /* synthetic */ UUID f2557a;

        ShareInternalUtility(UUID uuid) {
            this.f2557a = uuid;
        }

        public final /* bridge */ /* synthetic */ Object m2478a(Object obj) {
            return ShareInternalUtility.m2484a(this.f2557a, (SharePhoto) obj);
        }
    }

    /* renamed from: com.facebook.j.a.k.5 */
    static class ShareInternalUtility implements Utility<NativeAppCallAttachmentStore, String> {
        ShareInternalUtility() {
        }

        public final /* bridge */ /* synthetic */ Object m2479a(Object obj) {
            return ((NativeAppCallAttachmentStore) obj).f1764b;
        }
    }

    /* renamed from: com.facebook.j.a.k.6 */
    static class ShareInternalUtility implements Utility<ShareMedia, Bundle> {
        final /* synthetic */ UUID f2558a;
        final /* synthetic */ List f2559b;

        ShareInternalUtility(UUID uuid, List list) {
            this.f2558a = uuid;
            this.f2559b = list;
        }

        public final /* synthetic */ Object m2480a(Object obj) {
            ShareMedia shareMedia = (ShareMedia) obj;
            NativeAppCallAttachmentStore a = ShareInternalUtility.m2484a(this.f2558a, shareMedia);
            this.f2559b.add(a);
            Bundle bundle = new Bundle();
            bundle.putString(MessageKey.MSG_TYPE, shareMedia.m2502a().name());
            bundle.putString("uri", a.f1764b);
            return bundle;
        }
    }

    /* renamed from: com.facebook.j.a.k.7 */
    static class ShareInternalUtility implements OpenGraphJSONUtility {
        final /* synthetic */ UUID f2560a;
        final /* synthetic */ ArrayList f2561b;

        ShareInternalUtility(UUID uuid, ArrayList arrayList) {
            this.f2560a = uuid;
            this.f2561b = arrayList;
        }

        public final JSONObject m2481a(SharePhoto sharePhoto) {
            NativeAppCallAttachmentStore a = ShareInternalUtility.m2484a(this.f2560a, (ShareMedia) sharePhoto);
            if (a == null) {
                return null;
            }
            this.f2561b.add(a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ParamKey.URL, a.f1764b);
                if (!sharePhoto.f2607d) {
                    return jSONObject;
                }
                jSONObject.put("user_generated", true);
                return jSONObject;
            } catch (Throwable e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    /* renamed from: com.facebook.j.a.k.8 */
    static class ShareInternalUtility implements OpenGraphJSONUtility {
        ShareInternalUtility() {
        }

        public final JSONObject m2482a(SharePhoto sharePhoto) {
            Uri uri = sharePhoto.f2606c;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ParamKey.URL, uri.toString());
                return jSONObject;
            } catch (Throwable e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    public static String m2486a(Bundle bundle) {
        if (bundle.containsKey("completionGesture")) {
            return bundle.getString("completionGesture");
        }
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static boolean m2493a(int i, Intent intent, ResultProcessor resultProcessor) {
        AppCall appCall;
        UUID a = NativeProtocol.m1724a(intent);
        if (a == null) {
            appCall = null;
        } else {
            appCall = AppCall.m1471a(a, i);
        }
        if (appCall == null) {
            return false;
        }
        com.facebook.p036h.NativeAppCallAttachmentStore.m1698a(appCall.f1535a);
        if (resultProcessor == null) {
            return true;
        }
        FacebookException a2 = NativeProtocol.m1722a(NativeProtocol.m1734d(intent));
        if (a2 == null) {
            resultProcessor.m2457a(NativeProtocol.m1732c(intent));
            return true;
        } else if (a2 instanceof FacebookOperationCanceledException) {
            resultProcessor.m2456a();
            return true;
        } else {
            resultProcessor.m2458a(a2);
            return true;
        }
    }

    public static ResultProcessor m2485a(FacebookCallback<Sharer> facebookCallback) {
        return new ShareInternalUtility(facebookCallback, facebookCallback);
    }

    public static List<String> m2487a(SharePhotoContent sharePhotoContent, UUID uuid) {
        if (sharePhotoContent != null) {
            List list = sharePhotoContent.f2610a;
            if (list != null) {
                Collection a = af.m1505a(list, new ShareInternalUtility(uuid));
                List<String> a2 = af.m1505a((List) a, new ShareInternalUtility());
                com.facebook.p036h.NativeAppCallAttachmentStore.m1697a(a);
                return a2;
            }
        }
        return null;
    }

    private static JSONArray m2488a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = ShareInternalUtility.m2488a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = ShareInternalUtility.m2490a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject m2490a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                Object a;
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    a = ShareInternalUtility.m2490a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    JSONArray a2 = ShareInternalUtility.m2488a((JSONArray) obj, true);
                } else {
                    a = obj;
                }
                Pair a3 = ShareInternalUtility.m2483a(string);
                String str = (String) a3.first;
                String str2 = (String) a3.second;
                if (z) {
                    if (str != null && str.equals("fbsdk")) {
                        jSONObject2.put(string, a);
                    } else if (str == null || str.equals("og")) {
                        jSONObject2.put(str2, a);
                    } else {
                        jSONObject3.put(str2, a);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, a);
                } else {
                    jSONObject2.put(string, a);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA, jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException e) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static Pair<String, String> m2483a(String str) {
        Object obj = null;
        int indexOf = str.indexOf(58);
        if (indexOf != -1 && str.length() > indexOf + 1) {
            obj = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        }
        return new Pair(obj, str);
    }

    static void m2491a(FacebookCallback<Sharer> facebookCallback, FacebookException facebookException) {
        ShareInternalUtility.m2492a("error", facebookException.getMessage());
        if (facebookCallback != null) {
            facebookCallback.m1470a(facebookException);
        }
    }

    static void m2492a(String str, String str2) {
        AppEventsLogger a = AppEventsLogger.m824a(FacebookSdk.m2586f());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        a.m837b("fb_share_dialog_result", bundle);
    }

    public static JSONObject m2489a(UUID uuid, ShareOpenGraphContent shareOpenGraphContent) {
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f2599a;
        Collection arrayList = new ArrayList();
        JSONObject a = OpenGraphJSONUtility.m2455a(shareOpenGraphAction, new ShareInternalUtility(uuid, arrayList));
        com.facebook.p036h.NativeAppCallAttachmentStore.m1697a(arrayList);
        if (shareOpenGraphContent.f2543j != null && af.m1523a(a.optString("place"))) {
            a.put("place", shareOpenGraphContent.f2543j);
        }
        if (shareOpenGraphContent.f2542i != null) {
            JSONArray optJSONArray = a.optJSONArray("tags");
            if (optJSONArray == null) {
                arrayList = new HashSet();
            } else {
                Object b = af.m1528b(optJSONArray);
            }
            for (String add : shareOpenGraphContent.f2542i) {
                arrayList.add(add);
            }
            a.put("tags", new JSONArray(arrayList));
        }
        return a;
    }

    static /* synthetic */ NativeAppCallAttachmentStore m2484a(UUID uuid, ShareMedia shareMedia) {
        Bitmap bitmap;
        Uri uri;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.f2605b;
            uri = sharePhoto.f2606c;
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).f2612b;
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        if (bitmap != null) {
            return com.facebook.p036h.NativeAppCallAttachmentStore.m1691a(uuid, bitmap);
        }
        if (uri != null) {
            return com.facebook.p036h.NativeAppCallAttachmentStore.m1692a(uuid, uri);
        }
        return null;
    }
}
