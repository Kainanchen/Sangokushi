package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.GraphRequest;

/* compiled from: RequestProgress */
final class ad {
    final long f940a;
    long f941b;
    long f942c;
    long f943d;
    private final GraphRequest f944e;
    private final Handler f945f;

    /* renamed from: com.facebook.ad.1 */
    class RequestProgress implements Runnable {
        final /* synthetic */ GraphRequest f936a;
        final /* synthetic */ long f937b;
        final /* synthetic */ long f938c;
        final /* synthetic */ ad f939d;

        RequestProgress(ad adVar, GraphRequest graphRequest, long j, long j2) {
            this.f939d = adVar;
            this.f936a = graphRequest;
            this.f937b = j;
            this.f938c = j2;
        }

        public final void run() {
        }
    }

    ad(Handler handler, GraphRequest graphRequest) {
        this.f944e = graphRequest;
        this.f945f = handler;
        this.f940a = FacebookSdk.m2589i();
    }

    final void m893a() {
        if (this.f941b > this.f942c) {
            GraphRequest graphRequest = this.f944e.f2714e;
            if (this.f943d > 0 && (graphRequest instanceof GraphRequest)) {
                long j = this.f941b;
                long j2 = this.f943d;
                GraphRequest graphRequest2 = (GraphRequest) graphRequest;
                if (this.f945f != null) {
                    this.f945f.post(new RequestProgress(this, graphRequest2, j, j2));
                }
                this.f942c = this.f941b;
            }
        }
    }
}
