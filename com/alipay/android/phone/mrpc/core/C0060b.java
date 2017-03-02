package com.alipay.android.phone.mrpc.core;

import android.net.SSLCertificateSocketFactory;
import android.util.Base64;
import android.util.Log;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.data.C0168a;
import com.alipay.sdk.packet.C0182d;
import com.alipay.sdk.util.C0201h;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.b */
public final class C0060b implements HttpClient {
    public static long f26a;
    private static String[] f27b;
    private static final HttpRequestInterceptor f28c;
    private final HttpClient f29d;
    private RuntimeException f30e;
    private volatile C0059b f31f;

    /* renamed from: com.alipay.android.phone.mrpc.core.b.a */
    private class C0058a implements HttpRequestInterceptor {
        final /* synthetic */ C0060b f23a;

        private C0058a(C0060b c0060b) {
            this.f23a = c0060b;
        }

        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0059b a = this.f23a.f31f;
            if (a != null && Log.isLoggable(a.f24a, a.f25b) && (httpRequest instanceof HttpUriRequest)) {
                Log.println(a.f25b, a.f24a, C0060b.m56a((HttpUriRequest) httpRequest));
            }
        }
    }

    /* renamed from: com.alipay.android.phone.mrpc.core.b.b */
    private static class C0059b {
        private final String f24a;
        private final int f25b;
    }

    static {
        f26a = 160;
        f27b = new String[]{"text/", "application/xml", RequestParams.APPLICATION_JSON};
        f28c = new C0061c();
    }

    private C0060b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f30e = new IllegalStateException("AndroidHttpClient created and never closed");
        this.f29d = new C0062d(this, clientConnectionManager, httpParams);
    }

    public static C0060b m54a(String str) {
        HttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, C0168a.f377d);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, AsyncHttpClient.DEFAULT_SOCKET_BUFFER_SIZE);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(C0166b.f350a, SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), 443));
        ClientConnectionManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new C0060b(threadSafeClientConnManager, basicHttpParams);
    }

    public static InputStream m55a(HttpEntity httpEntity) {
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return content;
        }
        Header contentEncoding = httpEntity.getContentEncoding();
        if (contentEncoding == null) {
            return content;
        }
        String value = contentEncoding.getValue();
        if (value == null) {
            return content;
        }
        return value.contains(AsyncHttpClient.ENCODING_GZIP) ? new GZIPInputStream(content) : content;
    }

    static /* synthetic */ String m56a(HttpUriRequest httpUriRequest) {
        Object uri;
        HttpEntity entity;
        OutputStream byteArrayOutputStream;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (!(header.getName().equals("Authorization") || header.getName().equals("Cookie"))) {
                stringBuilder.append("--header \"");
                stringBuilder.append(header.toString().trim());
                stringBuilder.append("\" ");
            }
        }
        URI uri2 = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
                stringBuilder.append(C0201h.f514f);
                stringBuilder.append(uri);
                stringBuilder.append(C0201h.f514f);
                if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                    entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
                    if (entity != null && entity.isRepeatable()) {
                        if (entity.getContentLength() >= 1024) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            entity.writeTo(byteArrayOutputStream);
                            if (C0060b.m62b(httpUriRequest)) {
                                stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append(C0201h.f514f);
                            } else {
                                stringBuilder.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                                stringBuilder.append(" --data-binary @/tmp/$$.bin");
                            }
                        } else {
                            stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                        }
                    }
                }
                return stringBuilder.toString();
            }
        }
        URI uri3 = uri2;
        stringBuilder.append(C0201h.f514f);
        stringBuilder.append(uri);
        stringBuilder.append(C0201h.f514f);
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
            if (entity.getContentLength() >= 1024) {
                stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (C0060b.m62b(httpUriRequest)) {
                    stringBuilder.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append(C0201h.f514f);
                } else {
                    stringBuilder.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    stringBuilder.append(" --data-binary @/tmp/$$.bin");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static AbstractHttpEntity m58a(byte[] bArr) {
        if (((long) bArr.length) < f26a) {
            return new ByteArrayEntity(bArr);
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        AbstractHttpEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding(AsyncHttpClient.ENCODING_GZIP);
        new StringBuilder("gzip size:").append(bArr.length).append("->").append(byteArrayEntity.getContentLength());
        return byteArrayEntity;
    }

    public static void m59a(HttpRequest httpRequest) {
        httpRequest.addHeader(AsyncHttpClient.HEADER_ACCEPT_ENCODING, AsyncHttpClient.ENCODING_GZIP);
    }

    public static long m60b(String str) {
        return C0071k.m76a(str);
    }

    public static void m61b(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", "Keep-Alive");
    }

    private static boolean m62b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header value : headers) {
                if (AsyncHttpClient.ENCODING_GZIP.equalsIgnoreCase(value.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders(C0182d.f422d);
        if (headers2 == null) {
            return true;
        }
        for (Header header : headers2) {
            for (String startsWith : f27b) {
                if (header.getValue().startsWith(startsWith)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void m63a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f29d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f29d.execute(httpHost, httpRequest, responseHandler);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f29d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return this.f29d.execute(httpUriRequest, responseHandler);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.f29d.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f29d.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f29d.execute(httpHost, httpRequest, httpContext);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f29d.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f29d.execute(httpUriRequest, httpContext);
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.f29d.getConnectionManager();
    }

    public final HttpParams getParams() {
        return this.f29d.getParams();
    }
}
