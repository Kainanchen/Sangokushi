package com.alipay.sdk.net;

import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.data.C0168a;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.sdk.net.b */
public final class C0178b {
    public static final String f412a = "msp";
    static C0178b f413b;
    final DefaultHttpClient f414c;

    private static C0178b m529b() {
        return f413b;
    }

    private static void m530c() {
        f413b = null;
    }

    private C0178b(HttpParams httpParams) {
        this.f414c = new DefaultHttpClient(httpParams);
    }

    private C0178b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f414c = new DefaultHttpClient(clientConnectionManager, httpParams);
    }

    public static C0178b m521a() {
        if (f413b == null) {
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
            basicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
            ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(30));
            ConnManagerParams.setTimeout(basicHttpParams, 1000);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, C0168a.f377d);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, AccessibilityEventCompat.TYPE_ANNOUNCEMENT);
            HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
            HttpClientParams.setRedirecting(basicHttpParams, true);
            HttpClientParams.setAuthenticating(basicHttpParams, false);
            HttpProtocolParams.setUserAgent(basicHttpParams, f412a);
            try {
                SocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
                socketFactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                Scheme scheme = new Scheme(C0166b.f350a, socketFactory, 443);
                Scheme scheme2 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
                SchemeRegistry schemeRegistry = new SchemeRegistry();
                schemeRegistry.register(scheme);
                schemeRegistry.register(scheme2);
                f413b = new C0178b(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
            } catch (Exception e) {
                f413b = new C0178b(basicHttpParams);
            }
        }
        return f413b;
    }

    private void m531d() {
        ClientConnectionManager connectionManager = this.f414c.getConnectionManager();
        if (connectionManager != null) {
            connectionManager.closeExpiredConnections();
            if (VERSION.SDK_INT >= 9) {
                connectionManager.closeIdleConnections(30, TimeUnit.MINUTES);
            }
        }
    }

    private void m532e() {
        ClientConnectionManager connectionManager = this.f414c.getConnectionManager();
        if (connectionManager != null) {
            connectionManager.shutdown();
            f413b = null;
        }
    }

    private HttpParams m533f() {
        return this.f414c.getParams();
    }

    private ClientConnectionManager m534g() {
        return this.f414c.getConnectionManager();
    }

    public final HttpResponse m535a(HttpUriRequest httpUriRequest) throws Exception {
        try {
            return this.f414c.execute(httpUriRequest);
        } catch (Exception e) {
            throw e;
        }
    }

    private HttpResponse m528a(HttpUriRequest httpUriRequest, HttpContext httpContext) throws Exception {
        try {
            return this.f414c.execute(httpUriRequest, httpContext);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private HttpResponse m526a(HttpHost httpHost, HttpRequest httpRequest) throws Exception {
        try {
            return this.f414c.execute(httpHost, httpRequest);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private HttpResponse m527a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws Exception {
        try {
            return this.f414c.execute(httpHost, httpRequest, httpContext);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private <T> T m524a(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws Exception {
        try {
            return this.f414c.execute(httpUriRequest, responseHandler);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private <T> T m525a(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws Exception {
        try {
            return this.f414c.execute(httpUriRequest, responseHandler, httpContext);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private <T> T m522a(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws Exception {
        try {
            return this.f414c.execute(httpHost, httpRequest, responseHandler);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }

    private <T> T m523a(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws Exception {
        try {
            return this.f414c.execute(httpHost, httpRequest, responseHandler, httpContext);
        } catch (Throwable e) {
            throw new Exception(e);
        }
    }
}
