package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.e */
final class C0063e extends DefaultRedirectHandler {
    int f33a;
    final /* synthetic */ C0062d f34b;

    C0063e(C0062d c0062d) {
        this.f34b = c0062d;
    }

    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        this.f33a++;
        boolean isRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (isRedirectRequested || this.f33a >= 5) {
            return isRedirectRequested;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode == 301 || statusCode == 302) ? true : isRedirectRequested;
    }
}
