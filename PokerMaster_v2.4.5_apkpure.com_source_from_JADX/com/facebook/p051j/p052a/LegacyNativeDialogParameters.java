package com.facebook.p051j.p052a;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.SharePhotoContent;
import com.facebook.p051j.p053b.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.c */
public final class LegacyNativeDialogParameters {
    public static Bundle m2447a(UUID uuid, ShareContent shareContent, boolean z) {
        ag.m1544a((Object) shareContent, "shareContent");
        ag.m1544a((Object) uuid, "callId");
        Bundle a;
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            a = LegacyNativeDialogParameters.m2446a(shareLinkContent, z);
            af.m1511a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.f2588b);
            af.m1511a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f2587a);
            af.m1510a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.f2589c);
            return a;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            Collection a2 = ShareInternalUtility.m2487a(sharePhotoContent, uuid);
            a = LegacyNativeDialogParameters.m2446a(sharePhotoContent, z);
            a.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(a2));
            return a;
        } else if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a3 = ShareInternalUtility.m2489a(uuid, shareOpenGraphContent);
                a = LegacyNativeDialogParameters.m2446a(shareOpenGraphContent, z);
                af.m1511a(a, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f2600b);
                af.m1511a(a, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f2599a.m2509a());
                af.m1511a(a, "com.facebook.platform.extra.ACTION", a3.toString());
                return a;
            } catch (JSONException e) {
                throw new FacebookException("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        }
    }

    private static Bundle m2446a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        af.m1510a(bundle, "com.facebook.platform.extra.LINK", shareContent.f2541h);
        af.m1511a(bundle, "com.facebook.platform.extra.PLACE", shareContent.f2543j);
        af.m1511a(bundle, "com.facebook.platform.extra.REF", shareContent.f2544k);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        Collection collection = shareContent.f2542i;
        if (!af.m1524a(collection)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(collection));
        }
        return bundle;
    }
}
