package com.alipay.sdk.sys;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.util.C0206l;
import com.tencent.connect.common.Constants;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.sys.a */
public final class C0190a {
    public static final String f450a = "\"&";
    public static final String f451b = "&";
    public static final String f452c = "bizcontext=\"";
    public static final String f453d = "bizcontext=";
    public static final String f454e = "\"";
    public static final String f455f = "appkey";
    public static final String f456g = "ty";
    public static final String f457h = "sv";
    public static final String f458i = "an";
    public static final String f459j = "setting";
    public static final String f460k = "av";
    public static final String f461l = "sdk_start_time";
    public static final String f462m = "UTF-8";
    private String f463n;
    private String f464o;
    private Context f465p;

    public C0190a(Context context) {
        this.f463n = Constants.STR_EMPTY;
        this.f464o = Constants.STR_EMPTY;
        this.f465p = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f463n = packageInfo.versionName;
            this.f464o = packageInfo.packageName;
            this.f465p = context.getApplicationContext();
        } catch (Exception e) {
        }
    }

    public final String m598a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if ((!str.contains(f450a) ? 1 : null) != null) {
            return m596c(str);
        }
        return m597d(str);
    }

    private static boolean m595b(String str) {
        return !str.contains(f450a);
    }

    private String m596c(String str) {
        try {
            String a = C0190a.m592a(str, f451b, f453d);
            if (TextUtils.isEmpty(a)) {
                return str + f451b + m593b(f453d, Constants.STR_EMPTY);
            }
            int indexOf = str.indexOf(a);
            String substring = str.substring(0, indexOf);
            return substring + m594b(a, f453d, Constants.STR_EMPTY) + str.substring(indexOf + a.length());
        } catch (Throwable th) {
            return str;
        }
    }

    private String m597d(String str) {
        try {
            String a = C0190a.m592a(str, f450a, f452c);
            if (TextUtils.isEmpty(a)) {
                return str + f451b + m593b(f452c, f454e);
            }
            if (!a.endsWith(f454e)) {
                a = a + f454e;
            }
            int indexOf = str.indexOf(a);
            String substring = str.substring(0, indexOf);
            return substring + m594b(a, f452c, f454e) + str.substring(indexOf + a.length());
        } catch (Throwable th) {
            return str;
        }
    }

    private static String m592a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str4;
        String[] split = str.split(str2);
        int i = 0;
        while (i < split.length) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                str4 = split[i];
                break;
            }
            i++;
        }
        str4 = null;
        return str4;
    }

    private String m593b(String str, String str2) throws JSONException, UnsupportedEncodingException {
        return str + m599a(Constants.STR_EMPTY, Constants.STR_EMPTY) + str2;
    }

    public final String m599a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f455f, C0165a.f337c);
            jSONObject.put(f456g, "and_lite");
            jSONObject.put(f457h, C0165a.f340f);
            if (!(this.f464o.contains(f459j) && C0206l.m690c(this.f465p))) {
                jSONObject.put(f458i, this.f464o);
            }
            jSONObject.put(f460k, this.f463n);
            jSONObject.put(f461l, System.currentTimeMillis());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            return Constants.STR_EMPTY;
        }
    }

    private String m594b(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        String substring = str.substring(str2.length());
        JSONObject jSONObject = new JSONObject(substring.substring(0, substring.length() - str3.length()));
        if (!jSONObject.has(f455f)) {
            jSONObject.put(f455f, C0165a.f337c);
        }
        if (!jSONObject.has(f456g)) {
            jSONObject.put(f456g, "and_lite");
        }
        if (!jSONObject.has(f457h)) {
            jSONObject.put(f457h, C0165a.f340f);
        }
        if (!(jSONObject.has(f458i) || (this.f464o.contains(f459j) && C0206l.m690c(this.f465p)))) {
            jSONObject.put(f458i, this.f464o);
        }
        if (!jSONObject.has(f460k)) {
            jSONObject.put(f460k, this.f463n);
        }
        if (!jSONObject.has(f461l)) {
            jSONObject.put(f461l, System.currentTimeMillis());
        }
        return str2 + jSONObject.toString() + str3;
    }
}
