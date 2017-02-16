package com.facebook.p036h;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.h.e */
public final class BundleJSONConverter {
    private static final Map<Class<?>, BundleJSONConverter> f1635a;

    /* renamed from: com.facebook.h.e.a */
    public interface BundleJSONConverter {
        void m1591a(Bundle bundle, String str, Object obj);

        void m1592a(JSONObject jSONObject, String str, Object obj);
    }

    /* renamed from: com.facebook.h.e.1 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1593a(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }

        public final void m1594a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.h.e.2 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1595a(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }

        public final void m1596a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.h.e.3 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1597a(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }

        public final void m1598a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.h.e.4 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1599a(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }

        public final void m1600a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.h.e.5 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1601a(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }

        public final void m1602a(JSONObject jSONObject, String str, Object obj) {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.h.e.6 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1603a(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        public final void m1604a(JSONObject jSONObject, String str, Object obj) {
            JSONArray jSONArray = new JSONArray();
            for (Object put : (String[]) obj) {
                jSONArray.put(put);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* renamed from: com.facebook.h.e.7 */
    static class BundleJSONConverter implements BundleJSONConverter {
        BundleJSONConverter() {
        }

        public final void m1605a(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }

        public final void m1606a(JSONObject jSONObject, String str, Object obj) {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    static {
        Map hashMap = new HashMap();
        f1635a = hashMap;
        hashMap.put(Boolean.class, new BundleJSONConverter());
        f1635a.put(Integer.class, new BundleJSONConverter());
        f1635a.put(Long.class, new BundleJSONConverter());
        f1635a.put(Double.class, new BundleJSONConverter());
        f1635a.put(String.class, new BundleJSONConverter());
        f1635a.put(String[].class, new BundleJSONConverter());
        f1635a.put(JSONArray.class, new BundleJSONConverter());
    }

    public static JSONObject m1608a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, BundleJSONConverter.m1608a((Bundle) obj));
                } else {
                    BundleJSONConverter bundleJSONConverter = (BundleJSONConverter) f1635a.get(obj.getClass());
                    if (bundleJSONConverter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    bundleJSONConverter.m1592a(jSONObject, str, obj);
                }
            }
        }
        return jSONObject;
    }

    public static Bundle m1607a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, BundleJSONConverter.m1607a((JSONObject) obj));
                } else {
                    BundleJSONConverter bundleJSONConverter = (BundleJSONConverter) f1635a.get(obj.getClass());
                    if (bundleJSONConverter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    bundleJSONConverter.m1591a(bundle, str, obj);
                }
            }
        }
        return bundle;
    }
}
