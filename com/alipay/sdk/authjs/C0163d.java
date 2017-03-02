package com.alipay.sdk.authjs;

import android.widget.Toast;
import com.alipay.sdk.authjs.C0161a.C0160a;
import com.android.volley.DefaultRetryPolicy;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.authjs.d */
final class C0163d implements Runnable {
    final /* synthetic */ C0161a f331a;
    final /* synthetic */ C0162c f332b;

    C0163d(C0162c c0162c, C0161a c0161a) {
        this.f332b = c0162c;
        this.f331a = c0161a;
    }

    public final void run() {
        int i;
        C0162c c0162c = this.f332b;
        C0161a c0161a = this.f331a;
        if (c0161a != null && "toast".equals(c0161a.f325k)) {
            JSONObject jSONObject = c0161a.f327m;
            CharSequence optString = jSONObject.optString("content");
            int optInt = jSONObject.optInt("duration");
            i = 1;
            if (optInt < DefaultRetryPolicy.DEFAULT_TIMEOUT_MS) {
                i = 0;
            }
            Toast.makeText(c0162c.f330b, optString, i).show();
            new Timer().schedule(new C0164e(c0162c, c0161a), (long) i);
        }
        i = C0160a.f309a;
        if (i != C0160a.f309a) {
            try {
                this.f332b.m468a(this.f331a.f323i, i);
            } catch (JSONException e) {
            }
        }
    }
}
