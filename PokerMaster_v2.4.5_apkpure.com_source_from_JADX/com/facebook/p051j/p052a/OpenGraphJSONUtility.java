package com.facebook.p051j.p052a;

import android.support.annotation.Nullable;
import com.facebook.p051j.p053b.ShareOpenGraphAction;
import com.facebook.p051j.p053b.ShareOpenGraphObject;
import com.facebook.p051j.p053b.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.f */
public final class OpenGraphJSONUtility {

    /* renamed from: com.facebook.j.a.f.a */
    public interface OpenGraphJSONUtility {
        JSONObject m2452a(SharePhoto sharePhoto);
    }

    public static JSONObject m2455a(ShareOpenGraphAction shareOpenGraphAction, OpenGraphJSONUtility openGraphJSONUtility) {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.f2598a.keySet()) {
            jSONObject.put(str, OpenGraphJSONUtility.m2453a(shareOpenGraphAction.m2508a(str), openGraphJSONUtility));
        }
        return jSONObject;
    }

    private static JSONArray m2454a(List list, OpenGraphJSONUtility openGraphJSONUtility) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : list) {
            jSONArray.put(OpenGraphJSONUtility.m2453a(a, openGraphJSONUtility));
        }
        return jSONArray;
    }

    private static Object m2453a(@Nullable Object obj, OpenGraphJSONUtility openGraphJSONUtility) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (openGraphJSONUtility != null) {
                return openGraphJSONUtility.m2452a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.f2598a.keySet()) {
                jSONObject.put(str, OpenGraphJSONUtility.m2453a(shareOpenGraphObject.m2508a(str), openGraphJSONUtility));
            }
            return jSONObject;
        } else if (obj instanceof List) {
            return OpenGraphJSONUtility.m2454a((List) obj, openGraphJSONUtility);
        } else {
            throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
        }
    }
}
