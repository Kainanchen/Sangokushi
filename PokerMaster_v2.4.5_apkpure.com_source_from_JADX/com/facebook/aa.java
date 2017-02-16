package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequestBatch.GraphRequestBatch;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: ProgressOutputStream */
final class aa extends FilterOutputStream implements ac {
    private final Map<GraphRequest, ad> f929a;
    private final GraphRequestBatch f930b;
    private final long f931c;
    private long f932d;
    private long f933e;
    private long f934f;
    private ad f935g;

    /* renamed from: com.facebook.aa.1 */
    class ProgressOutputStream implements Runnable {
        final /* synthetic */ GraphRequestBatch f927a;
        final /* synthetic */ aa f928b;

        ProgressOutputStream(aa aaVar, GraphRequestBatch graphRequestBatch) {
            this.f928b = aaVar;
            this.f927a = graphRequestBatch;
        }

        public final void run() {
        }
    }

    aa(OutputStream outputStream, GraphRequestBatch graphRequestBatch, Map<GraphRequest, ad> map, long j) {
        super(outputStream);
        this.f930b = graphRequestBatch;
        this.f929a = map;
        this.f934f = j;
        this.f931c = FacebookSdk.m2589i();
    }

    private void m891a(long j) {
        if (this.f935g != null) {
            ad adVar = this.f935g;
            adVar.f941b += j;
            if (adVar.f941b >= adVar.f942c + adVar.f940a || adVar.f941b >= adVar.f943d) {
                adVar.m893a();
            }
        }
        this.f932d += j;
        if (this.f932d >= this.f933e + this.f931c || this.f932d >= this.f934f) {
            m890a();
        }
    }

    private void m890a() {
        if (this.f932d > this.f933e) {
            for (GraphRequestBatch graphRequestBatch : this.f930b.f2733e) {
                if (graphRequestBatch instanceof GraphRequestBatch) {
                    Handler handler = this.f930b.f2729a;
                    GraphRequestBatch graphRequestBatch2 = (GraphRequestBatch) graphRequestBatch;
                    if (handler != null) {
                        handler.post(new ProgressOutputStream(this, graphRequestBatch2));
                    }
                }
            }
            this.f933e = this.f932d;
        }
    }

    public final void m892a(GraphRequest graphRequest) {
        this.f935g = graphRequest != null ? (ad) this.f929a.get(graphRequest) : null;
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        m891a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        m891a((long) i2);
    }

    public final void write(int i) {
        this.out.write(i);
        m891a(1);
    }

    public final void close() {
        super.close();
        for (ad a : this.f929a.values()) {
            a.m893a();
        }
        m890a();
    }
}
