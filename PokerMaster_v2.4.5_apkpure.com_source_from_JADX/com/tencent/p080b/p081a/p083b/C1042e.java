package com.tencent.p080b.p081a.p083b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.p080b.p081a.C1058c;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.tencent.b.a.b.e */
final class C1042e {
    String f8037a;
    String f8038b;
    DisplayMetrics f8039c;
    int f8040d;
    String f8041e;
    String f8042f;
    String f8043g;
    String f8044h;
    String f8045i;
    String f8046j;
    String f8047k;
    int f8048l;
    String f8049m;
    String f8050n;
    Context f8051o;
    String f8052p;
    String f8053q;
    String f8054r;
    String f8055s;

    private C1042e(Context context) {
        this.f8038b = "2.0.3";
        this.f8040d = VERSION.SDK_INT;
        this.f8041e = Build.MODEL;
        this.f8042f = Build.MANUFACTURER;
        this.f8043g = Locale.getDefault().getLanguage();
        this.f8048l = 0;
        this.f8049m = null;
        this.f8050n = null;
        this.f8051o = null;
        this.f8052p = null;
        this.f8053q = null;
        this.f8054r = null;
        this.f8055s = null;
        this.f8051o = context.getApplicationContext();
        this.f8039c = C1049l.m5697d(this.f8051o);
        this.f8037a = C1049l.m5706i(this.f8051o);
        this.f8044h = C1058c.m5759b(this.f8051o);
        this.f8045i = C1049l.m5705h(this.f8051o);
        this.f8046j = TimeZone.getDefault().getID();
        this.f8048l = C1049l.m5690b();
        this.f8047k = C1049l.m5712m(this.f8051o);
        this.f8049m = this.f8051o.getPackageName();
        if (this.f8040d >= 14) {
            this.f8052p = C1049l.m5717r(this.f8051o);
        }
        this.f8053q = C1049l.m5703g().toString();
        this.f8054r = C1049l.m5716q(this.f8051o);
        this.f8055s = C1049l.m5700f();
        this.f8050n = C1049l.m5722w(this.f8051o);
    }
}
