package com.igexin.getuiext.ui.promotion;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.igexin.getuiext.ui.C0305a;
import com.igexin.getuiext.ui.C0310f;

/* renamed from: com.igexin.getuiext.ui.promotion.c */
public abstract class C0313c implements OnClickListener {
    protected C0312b f844a;
    protected Context f845b;
    protected int f846c;
    protected int f847d;
    protected C0310f f848e;
    private C0323m f849f;
    private String f850g;
    private String f851h;

    public C0313c(Context context, C0323m c0323m) {
        this.f845b = context.getApplicationContext();
        this.f849f = c0323m;
        this.f848e = C0310f.m1054a(context);
        this.f846c = C0305a.m1041a(context, 2.0f);
        this.f847d = C0305a.m1041a(context, 3.0f);
    }

    public abstract View m1066a(int i, int i2);

    public C0323m m1067a() {
        return this.f849f;
    }

    protected void m1068a(View view) {
        if (this.f844a == null) {
            m1071b(view);
        } else if (!this.f844a.m1064a(this)) {
            m1071b(view);
            this.f844a.m1065b(this);
        }
    }

    public void m1069a(String str) {
        this.f850g = str;
    }

    public String m1070b() {
        return this.f850g;
    }

    protected abstract void m1071b(View view);

    public void m1072b(String str) {
        this.f851h = str;
    }

    public String m1073c() {
        return this.f851h;
    }

    public abstract void m1074c(String str);

    public void onClick(View view) {
        m1068a(view);
    }
}
