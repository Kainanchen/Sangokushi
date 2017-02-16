package com.tencent.p080b.p081a.p082a;

import android.content.Context;
import com.tencent.p080b.p081a.C1061f;
import com.tencent.p080b.p081a.p083b.C1041d;
import com.tencent.p080b.p081a.p083b.C1055r;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.c */
public final class C1032c extends C1029d {
    private String f7967a;
    private int f7968n;
    private int f7969o;
    private Thread f7970p;

    public C1032c(Context context, int i, Throwable th, C1061f c1061f) {
        super(context, i, c1061f);
        this.f7969o = 100;
        this.f7970p = null;
        m5638a(99, th);
    }

    public C1032c(Context context, int i, Throwable th, Thread thread) {
        super(context, i, null);
        this.f7969o = 100;
        this.f7970p = null;
        m5638a(2, th);
        this.f7970p = thread;
    }

    private void m5638a(int i, Throwable th) {
        if (th != null) {
            Writer stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            this.f7967a = stringWriter.toString();
            this.f7968n = i;
            printWriter.close();
        }
    }

    public final boolean m5639a(JSONObject jSONObject) {
        C1055r.m5737a(jSONObject, "er", this.f7967a);
        jSONObject.put("ea", this.f7968n);
        if (this.f7968n == 2 || this.f7968n == 3) {
            new C1041d(this.l).m5673a(jSONObject, this.f7970p);
        }
        return true;
    }

    public final C1033e m5640b() {
        return C1033e.ERROR;
    }
}
