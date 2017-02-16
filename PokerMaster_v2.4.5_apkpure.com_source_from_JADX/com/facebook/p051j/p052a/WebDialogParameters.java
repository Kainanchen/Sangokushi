package com.facebook.p051j.p052a;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.p036h.af;
import com.facebook.p036h.af.Utility;
import com.facebook.p051j.p052a.ShareInternalUtility.ShareInternalUtility;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareHashtag;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.facebook.p051j.p053b.SharePhoto;
import com.tencent.android.tpush.common.Constants;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.l */
public final class WebDialogParameters {

    /* renamed from: com.facebook.j.a.l.1 */
    static class WebDialogParameters implements Utility<SharePhoto, String> {
        public final /* synthetic */ Object m2494a(Object obj) {
            return ((SharePhoto) obj).f2606c.toString();
        }
    }

    public static Bundle m2496a(ShareLinkContent shareLinkContent) {
        Bundle a = WebDialogParameters.m2495a((ShareContent) shareLinkContent);
        af.m1510a(a, "href", shareLinkContent.f2541h);
        af.m1511a(a, "quote", shareLinkContent.f2590d);
        return a;
    }

    public static Bundle m2497a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = WebDialogParameters.m2495a((ShareContent) shareOpenGraphContent);
        af.m1511a(a, Constants.FLAG_ACTION_TYPE, shareOpenGraphContent.f2599a.m2509a());
        try {
            JSONObject a2 = ShareInternalUtility.m2490a(OpenGraphJSONUtility.m2455a(shareOpenGraphContent.f2599a, new ShareInternalUtility()), false);
            if (a2 != null) {
                af.m1511a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (Throwable e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    public static Bundle m2495a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f2545l;
        if (shareHashtag != null) {
            af.m1511a(bundle, "hashtag", shareHashtag.f2582a);
        }
        return bundle;
    }
}
