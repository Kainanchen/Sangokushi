package com.facebook.p051j.p052a;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.p036h.NativeAppCallAttachmentStore.NativeAppCallAttachmentStore;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.facebook.p051j.p052a.ShareInternalUtility.ShareInternalUtility;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareHashtag;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareMediaContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.SharePhotoContent;
import com.facebook.p051j.p053b.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.d */
public final class NativeDialogParameters {
    public static Bundle m2449a(UUID uuid, ShareContent shareContent, boolean z) {
        Collection collection = null;
        ag.m1544a((Object) shareContent, "shareContent");
        ag.m1544a((Object) uuid, "callId");
        Bundle a;
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            a = NativeDialogParameters.m2448a(shareLinkContent, z);
            af.m1511a(a, "TITLE", shareLinkContent.f2588b);
            af.m1511a(a, "DESCRIPTION", shareLinkContent.f2587a);
            af.m1510a(a, "IMAGE", shareLinkContent.f2589c);
            af.m1511a(a, "QUOTE", shareLinkContent.f2590d);
            return a;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            r1 = ShareInternalUtility.m2487a(sharePhotoContent, uuid);
            a = NativeDialogParameters.m2448a(sharePhotoContent, z);
            a.putStringArrayList("PHOTOS", new ArrayList(r1));
            return a;
        } else if (shareContent instanceof ShareVideoContent) {
            String str;
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            if (!(shareVideoContent == null || shareVideoContent.f2616d == null)) {
                NativeAppCallAttachmentStore a2 = com.facebook.p036h.NativeAppCallAttachmentStore.m1692a(uuid, shareVideoContent.f2616d.f2612b);
                r1 = new ArrayList(1);
                r1.add(a2);
                com.facebook.p036h.NativeAppCallAttachmentStore.m1697a(r1);
                str = a2.f1764b;
            }
            r1 = NativeDialogParameters.m2448a(shareVideoContent, z);
            af.m1511a(r1, "TITLE", shareVideoContent.f2614b);
            af.m1511a(r1, "DESCRIPTION", shareVideoContent.f2613a);
            af.m1511a(r1, "VIDEO", str);
            return r1;
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a3 = ShareInternalUtility.m2490a(ShareInternalUtility.m2489a(uuid, shareOpenGraphContent), false);
                r1 = NativeDialogParameters.m2448a(shareOpenGraphContent, z);
                af.m1511a(r1, "PREVIEW_PROPERTY_NAME", (String) ShareInternalUtility.m2483a(shareOpenGraphContent.f2600b).second);
                af.m1511a(r1, "ACTION_TYPE", shareOpenGraphContent.f2599a.m2509a());
                af.m1511a(r1, "ACTION", a3.toString());
                return r1;
            } catch (JSONException e) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        } else if (!(shareContent instanceof ShareMediaContent)) {
            return null;
        } else {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            if (shareMediaContent != null) {
                List list = shareMediaContent.f2596a;
                if (list != null) {
                    Collection arrayList = new ArrayList();
                    collection = af.m1505a(list, new ShareInternalUtility(uuid, arrayList));
                    com.facebook.p036h.NativeAppCallAttachmentStore.m1697a(arrayList);
                }
            }
            r1 = NativeDialogParameters.m2448a(shareMediaContent, z);
            r1.putParcelableArrayList("MEDIA", new ArrayList(collection));
            return r1;
        }
    }

    private static Bundle m2448a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        af.m1510a(bundle, "LINK", shareContent.f2541h);
        af.m1511a(bundle, "PLACE", shareContent.f2543j);
        af.m1511a(bundle, "REF", shareContent.f2544k);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        Collection collection = shareContent.f2542i;
        if (!af.m1524a(collection)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(collection));
        }
        ShareHashtag shareHashtag = shareContent.f2545l;
        if (shareHashtag != null) {
            af.m1511a(bundle, "HASHTAG", shareHashtag.f2582a);
        }
        return bundle;
    }
}
