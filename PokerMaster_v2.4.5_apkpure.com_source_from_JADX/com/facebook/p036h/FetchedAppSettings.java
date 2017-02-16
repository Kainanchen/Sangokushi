package com.facebook.p036h;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.h.n */
public final class FetchedAppSettings {
    public boolean f1674a;
    public boolean f1675b;
    public int f1676c;
    public EnumSet<ad> f1677d;
    public boolean f1678e;
    public FacebookRequestErrorClassification f1679f;
    public String f1680g;
    public String f1681h;
    private String f1682i;
    private boolean f1683j;
    private Map<String, Map<String, FetchedAppSettings>> f1684k;

    /* renamed from: com.facebook.h.n.a */
    public static class FetchedAppSettings {
        String f1670a;
        String f1671b;
        Uri f1672c;
        int[] f1673d;

        static int[] m1643a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!af.m1523a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (Exception e) {
                            af.m1515a(e);
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        FetchedAppSettings(String str, String str2, Uri uri, int[] iArr) {
            this.f1670a = str;
            this.f1671b = str2;
            this.f1672c = uri;
            this.f1673d = iArr;
        }
    }

    public FetchedAppSettings(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<ad> enumSet, Map<String, Map<String, FetchedAppSettings>> map, boolean z4, FacebookRequestErrorClassification facebookRequestErrorClassification, String str2, String str3) {
        this.f1674a = z;
        this.f1682i = str;
        this.f1683j = z2;
        this.f1675b = z3;
        this.f1684k = map;
        this.f1679f = facebookRequestErrorClassification;
        this.f1676c = i;
        this.f1678e = z4;
        this.f1677d = enumSet;
        this.f1680g = str2;
        this.f1681h = str3;
    }

    public static FetchedAppSettings m1644a(String str, String str2, String str3) {
        if (af.m1523a(str2) || af.m1523a(str3)) {
            return null;
        }
        FetchedAppSettings a = FetchedAppSettingsManager.m1645a(str);
        if (a != null) {
            Map map = (Map) a.f1684k.get(str2);
            if (map != null) {
                return (FetchedAppSettings) map.get(str3);
            }
        }
        return null;
    }
}
