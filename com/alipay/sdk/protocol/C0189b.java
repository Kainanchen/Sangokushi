package com.alipay.sdk.protocol;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.tid.C0192a;
import com.alipay.sdk.tid.C0193b;
import com.alipay.sdk.util.C0194a;
import com.alipay.sdk.util.C0201h;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.protocol.b */
public final class C0189b {
    public C0188a f447a;
    public String[] f448b;
    private String f449c;

    private C0189b(String str) {
        this.f449c = str;
    }

    private C0189b(String str, C0188a c0188a) {
        this.f449c = str;
        this.f447a = c0188a;
    }

    private static void m587a(C0189b c0189b) {
        String[] strArr = c0189b.f448b;
        if (strArr.length == 3 && TextUtils.equals(C0166b.f352c, strArr[0])) {
            Context context = C0191b.m600a().f467a;
            C0193b a = C0193b.m619a();
            if (!TextUtils.isEmpty(strArr[1]) && !TextUtils.isEmpty(strArr[2])) {
                a.f472a = strArr[1];
                a.f473b = strArr[2];
                C0192a c0192a = new C0192a(context);
                try {
                    c0192a.m617a(C0194a.m628a(context).m636a(), C0194a.m628a(context).m637b(), a.f472a, a.f473b);
                } catch (Exception e) {
                } finally {
                    c0192a.close();
                }
            }
        }
    }

    public static List<C0189b> m586a(JSONObject jSONObject) {
        List<C0189b> arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Object optString = jSONObject.optString(C0167c.f364e, Constants.STR_EMPTY);
        String[] strArr = null;
        if (!TextUtils.isEmpty(optString)) {
            strArr = optString.split(C0201h.f510b);
        }
        for (int i = 0; i < strArr.length; i++) {
            C0188a a = C0188a.m584a(strArr[i]);
            if (a != C0188a.None) {
                C0189b c0189b = new C0189b(strArr[i], a);
                c0189b.f448b = C0189b.m588a(strArr[i]);
                arrayList.add(c0189b);
            }
        }
        return arrayList;
    }

    private static String[] m588a(String str) {
        List arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        String[] split = str.substring(indexOf + 1, lastIndexOf).split(",");
        if (split != null) {
            for (indexOf = 0; indexOf < split.length; indexOf++) {
                if (!TextUtils.isEmpty(split[indexOf])) {
                    arrayList.add(split[indexOf].trim().replaceAll("'", Constants.STR_EMPTY).replaceAll(C0201h.f514f, Constants.STR_EMPTY));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String[] m590b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(C0201h.f510b);
    }

    private String m585a() {
        return this.f449c;
    }

    private C0188a m589b() {
        return this.f447a;
    }

    private String[] m591c() {
        return this.f448b;
    }
}
