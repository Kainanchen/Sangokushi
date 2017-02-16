package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.z */
final class ProgressNoopOutputStream extends OutputStream implements ac {
    final Map<GraphRequest, ad> f2768a;
    int f2769b;
    private final Handler f2770c;
    private GraphRequest f2771d;
    private ad f2772e;

    ProgressNoopOutputStream(Handler handler) {
        this.f2768a = new HashMap();
        this.f2770c = handler;
    }

    public final void m2669a(GraphRequest graphRequest) {
        this.f2771d = graphRequest;
        this.f2772e = graphRequest != null ? (ad) this.f2768a.get(graphRequest) : null;
    }

    final void m2668a(long j) {
        if (this.f2772e == null) {
            this.f2772e = new ad(this.f2770c, this.f2771d);
            this.f2768a.put(this.f2771d, this.f2772e);
        }
        ad adVar = this.f2772e;
        adVar.f943d += j;
        this.f2769b = (int) (((long) this.f2769b) + j);
    }

    public final void write(byte[] bArr) {
        m2668a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        m2668a((long) i2);
    }

    public final void write(int i) {
        m2668a(1);
    }
}
