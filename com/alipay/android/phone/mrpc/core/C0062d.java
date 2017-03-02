package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.C0060b.C0058a;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.d */
final class C0062d extends DefaultHttpClient {
    final /* synthetic */ C0060b f32a;

    C0062d(C0060b c0060b, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f32a = c0060b;
        super(clientConnectionManager, httpParams);
    }

    protected final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new C0064f(this);
    }

    protected final HttpContext createHttpContext() {
        HttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    protected final BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(C0060b.f28c);
        createHttpProcessor.addRequestInterceptor(new C0058a((byte) 0));
        return createHttpProcessor;
    }

    protected final RedirectHandler createRedirectHandler() {
        return new C0063e(this);
    }
}
