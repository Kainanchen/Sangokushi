package com.igexin.getuiext.p032a;

import android.content.Context;
import android.content.Intent;
import com.tencent.tauth.AuthActivity;

/* renamed from: com.igexin.getuiext.a.i */
public class C0278i implements C0270a {
    public void m967a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AuthActivity.ACTION_KEY);
        if (stringExtra != null) {
            C0270a a = C0271b.m955a(stringExtra);
            if (a != null) {
                a.m954a(context, intent);
            }
        }
    }
}
