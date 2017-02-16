package com.facebook.p036h;

import com.facebook.FacebookRequestError.FacebookRequestError;
import com.illuminate.texaspoker.R.R;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.h.l */
public final class FacebookRequestErrorClassification {
    private static FacebookRequestErrorClassification f1660g;
    public final Map<Integer, Set<Integer>> f1661a;
    public final Map<Integer, Set<Integer>> f1662b;
    public final Map<Integer, Set<Integer>> f1663c;
    public final String f1664d;
    public final String f1665e;
    public final String f1666f;

    /* renamed from: com.facebook.h.l.1 */
    static class FacebookRequestErrorClassification extends HashMap<Integer, Set<Integer>> {
        FacebookRequestErrorClassification() {
            put(Integer.valueOf(2), null);
            put(Integer.valueOf(4), null);
            put(Integer.valueOf(9), null);
            put(Integer.valueOf(17), null);
            put(Integer.valueOf(341), null);
        }
    }

    /* renamed from: com.facebook.h.l.2 */
    static class FacebookRequestErrorClassification extends HashMap<Integer, Set<Integer>> {
        FacebookRequestErrorClassification() {
            put(Integer.valueOf(R.AppCompatTheme_buttonStyle), null);
            put(Integer.valueOf(190), null);
        }
    }

    /* renamed from: com.facebook.h.l.3 */
    static /* synthetic */ class FacebookRequestErrorClassification {
        public static final /* synthetic */ int[] f1659a;

        static {
            f1659a = new int[FacebookRequestError.m2570a().length];
            try {
                f1659a[FacebookRequestError.f2645b - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1659a[FacebookRequestError.f2644a - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1659a[FacebookRequestError.f2646c - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    FacebookRequestErrorClassification(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f1661a = map;
        this.f1662b = map2;
        this.f1663c = map3;
        this.f1664d = str;
        this.f1665e = str2;
        this.f1666f = str3;
    }

    public static synchronized FacebookRequestErrorClassification m1639a() {
        FacebookRequestErrorClassification facebookRequestErrorClassification;
        synchronized (FacebookRequestErrorClassification.class) {
            if (f1660g == null) {
                f1660g = new FacebookRequestErrorClassification(null, new FacebookRequestErrorClassification(), new FacebookRequestErrorClassification(), null, null, null);
            }
            facebookRequestErrorClassification = f1660g;
        }
        return facebookRequestErrorClassification;
    }

    static Map<Integer, Set<Integer>> m1640a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        Map<Integer, Set<Integer>> hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt(SelectCountryActivity.EXTRA_COUNTRY_CODE);
                if (optInt != 0) {
                    Object obj;
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        obj = null;
                    } else {
                        Set hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                        obj = hashSet;
                    }
                    hashMap.put(Integer.valueOf(optInt), obj);
                }
            }
        }
        return hashMap;
    }
}
