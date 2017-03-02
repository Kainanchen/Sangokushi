package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.f */
final class C0064f implements ConnectionKeepAliveStrategy {
    final /* synthetic */ C0062d f35a;

    C0064f(C0062d c0062d) {
        this.f35a = c0062d;
    }

    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000;
    }
}
