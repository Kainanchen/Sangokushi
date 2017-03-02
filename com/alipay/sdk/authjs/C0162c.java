package com.alipay.sdk.authjs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.sdk.authjs.C0161a.C0160a;
import com.android.volley.DefaultRetryPolicy;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.authjs.c */
public final class C0162c {
    C0150b f329a;
    Context f330b;

    private static /* synthetic */ int m460a(C0162c c0162c, C0161a c0161a) {
        if (c0161a != null && "toast".equals(c0161a.f325k)) {
            JSONObject jSONObject = c0161a.f327m;
            CharSequence optString = jSONObject.optString("content");
            int optInt = jSONObject.optInt("duration");
            int i = 1;
            if (optInt < DefaultRetryPolicy.DEFAULT_TIMEOUT_MS) {
                i = 0;
            }
            Toast.makeText(c0162c.f330b, optString, i).show();
            new Timer().schedule(new C0164e(c0162c, c0161a), (long) i);
        }
        return C0160a.f309a;
    }

    public C0162c(Context context, C0150b c0150b) {
        this.f330b = context;
        this.f329a = c0150b;
    }

    private void m464a(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C0161a.f319e);
            try {
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C0161a.f320f);
                    if (jSONObject2 instanceof JSONObject) {
                        jSONObject2 = jSONObject2;
                    } else {
                        jSONObject2 = null;
                    }
                    String string2 = jSONObject.getString(C0161a.f321g);
                    String string3 = jSONObject.getString(C0161a.f318d);
                    C0161a c0161a = new C0161a(C0161a.f316b);
                    c0161a.f324j = string3;
                    c0161a.f325k = string2;
                    c0161a.f327m = jSONObject2;
                    c0161a.f323i = string;
                    m467a(c0161a);
                }
            } catch (Exception e) {
                str2 = string;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        m468a(str2, C0160a.f312d);
                    } catch (JSONException e2) {
                    }
                }
            }
        } catch (Exception e3) {
            str2 = null;
            if (!TextUtils.isEmpty(str2)) {
                m468a(str2, C0160a.f312d);
            }
        }
    }

    public final void m467a(C0161a c0161a) throws JSONException {
        if (TextUtils.isEmpty(c0161a.f325k)) {
            m468a(c0161a.f323i, C0160a.f311c);
            return;
        }
        Runnable c0163d = new C0163d(this, c0161a);
        if ((Looper.getMainLooper() == Looper.myLooper() ? 1 : null) != null) {
            c0163d.run();
        } else {
            new Handler(Looper.getMainLooper()).post(c0163d);
        }
    }

    public final void m468a(String str, int i) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", i - 1);
            C0161a c0161a = new C0161a(C0161a.f317c);
            c0161a.f327m = jSONObject;
            c0161a.f323i = str;
            this.f329a.m434a(c0161a);
        }
    }

    private static void m463a(Runnable runnable) {
        if ((Looper.getMainLooper() == Looper.myLooper() ? 1 : null) != null) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private int m465b(C0161a c0161a) {
        if (c0161a != null && "toast".equals(c0161a.f325k)) {
            JSONObject jSONObject = c0161a.f327m;
            CharSequence optString = jSONObject.optString("content");
            int optInt = jSONObject.optInt("duration");
            int i = 1;
            if (optInt < DefaultRetryPolicy.DEFAULT_TIMEOUT_MS) {
                i = 0;
            }
            Toast.makeText(this.f330b, optString, i).show();
            new Timer().schedule(new C0164e(this, c0161a), (long) i);
        }
        return C0160a.f309a;
    }

    private void m466c(C0161a c0161a) {
        JSONObject jSONObject = c0161a.f327m;
        CharSequence optString = jSONObject.optString("content");
        int optInt = jSONObject.optInt("duration");
        int i = 1;
        if (optInt < DefaultRetryPolicy.DEFAULT_TIMEOUT_MS) {
            i = 0;
        }
        Toast.makeText(this.f330b, optString, i).show();
        new Timer().schedule(new C0164e(this, c0161a), (long) i);
    }
}
