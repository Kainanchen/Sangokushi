package com.igexin.push.p040c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.igexin.p022a.p023a.p025d.p026a.C0248b;
import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0235c;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0240g;

/* renamed from: com.igexin.push.c.a */
public class C0347a implements C0248b {
    public ConnectivityManager f926a;
    public Context f927b;

    public C0347a(Context context, ConnectivityManager connectivityManager) {
        this.f926a = connectivityManager;
        this.f927b = context;
    }

    public C0234f m1166a(String str, Integer num, C0242c c0242c) {
        if (!str.startsWith("socket")) {
            return str.startsWith("disConnect") ? new C0235c(str) : null;
        } else {
            if (this.f926a == null) {
                return null;
            }
            NetworkInfo activeNetworkInfo = this.f926a.getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) ? null : new C0240g(str, c0242c);
        }
    }
}
