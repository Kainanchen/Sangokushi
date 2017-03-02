package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alipay.sdk.util.C0201h;
import com.igexin.download.Downloads;
import com.loopj.android.http.AsyncHttpClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.mime.MIME;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.alipay.android.phone.mrpc.core.q */
public final class C0079q implements Callable<C0077u> {
    private static final HttpRequestRetryHandler f73e;
    protected C0072l f74a;
    protected Context f75b;
    protected C0076o f76c;
    String f77d;
    private HttpUriRequest f78f;
    private HttpContext f79g;
    private CookieStore f80h;
    private CookieManager f81i;
    private AbstractHttpEntity f82j;
    private HttpHost f83k;
    private URL f84l;
    private int f85m;
    private boolean f86n;
    private boolean f87o;
    private String f88p;
    private String f89q;

    static {
        f73e = new ad();
    }

    public C0079q(C0072l c0072l, C0076o c0076o) {
        this.f79g = new BasicHttpContext();
        this.f80h = new BasicCookieStore();
        this.f85m = 0;
        this.f86n = false;
        this.f87o = false;
        this.f88p = null;
        this.f74a = c0072l;
        this.f75b = this.f74a.f47a;
        this.f76c = c0076o;
    }

    private static long m108a(String[] strArr) {
        int i = 0;
        while (i < strArr.length) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && strArr[i + 1] != null) {
                try {
                    return Long.parseLong(strArr[i + 1]);
                } catch (Exception e) {
                }
            }
            i++;
        }
        return 0;
    }

    private static HttpUrlHeader m109a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private C0077u m110a(HttpResponse httpResponse, int i, String str) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        String str2 = null;
        new StringBuilder("\u5f00\u59cbhandle\uff0chandleResponse-1,").append(Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
            new StringBuilder("200\uff0c\u5f00\u59cb\u5904\u7406\uff0chandleResponse-2,threadid = ").append(Thread.currentThread().getId());
            try {
                OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    String str3;
                    long currentTimeMillis = System.currentTimeMillis();
                    m112a(entity, byteArrayOutputStream2);
                    byte[] toByteArray = byteArrayOutputStream2.toByteArray();
                    this.f87o = false;
                    this.f74a.m87c(System.currentTimeMillis() - currentTimeMillis);
                    this.f74a.m85a((long) toByteArray.length);
                    new StringBuilder("res:").append(toByteArray.length);
                    C0077u c0078p = new C0078p(C0079q.m109a(httpResponse), i, str, toByteArray);
                    currentTimeMillis = C0079q.m113b(httpResponse);
                    Header contentType = httpResponse.getEntity().getContentType();
                    if (contentType != null) {
                        HashMap a = C0079q.m111a(contentType.getValue());
                        str2 = (String) a.get("charset");
                        str3 = (String) a.get(MIME.CONTENT_TYPE);
                    } else {
                        str3 = null;
                    }
                    c0078p.m102b(str3);
                    c0078p.m106a(str2);
                    c0078p.m105a(System.currentTimeMillis());
                    c0078p.m107b(currentTimeMillis);
                    try {
                        byteArrayOutputStream2.close();
                        return c0078p;
                    } catch (IOException e) {
                        throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    OutputStream outputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                byteArrayOutputStream = null;
                th = th4;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } else if (entity != null) {
            return null;
        } else {
            httpResponse.getStatusLine().getStatusCode();
            return null;
        }
    }

    private static HashMap<String, String> m111a(String str) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str2 : str.split(C0201h.f510b)) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{MIME.CONTENT_TYPE, str2} : str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m112a(org.apache.http.HttpEntity r7, java.io.OutputStream r8) {
        /*
        r6 = this;
        r1 = com.alipay.android.phone.mrpc.core.C0060b.m55a(r7);
        r2 = r7.getContentLength();
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x003c }
    L_0x000c:
        r4 = r1.read(r0);	 Catch:{ Exception -> 0x003c }
        r5 = -1;
        if (r4 == r5) goto L_0x0035;
    L_0x0013:
        r5 = r6.f76c;	 Catch:{ Exception -> 0x003c }
        r5 = r5.m90h();	 Catch:{ Exception -> 0x003c }
        if (r5 != 0) goto L_0x0035;
    L_0x001b:
        r5 = 0;
        r8.write(r0, r5, r4);	 Catch:{ Exception -> 0x003c }
        r4 = r6.f76c;	 Catch:{ Exception -> 0x003c }
        r4 = r4.m88f();	 Catch:{ Exception -> 0x003c }
        if (r4 == 0) goto L_0x000c;
    L_0x0027:
        r4 = 0;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x000c;
    L_0x002d:
        r4 = r6.f76c;	 Catch:{ Exception -> 0x003c }
        r4.m88f();	 Catch:{ Exception -> 0x003c }
        r4 = r6.f76c;	 Catch:{ Exception -> 0x003c }
        goto L_0x000c;
    L_0x0035:
        r8.flush();	 Catch:{ Exception -> 0x003c }
        com.alipay.android.phone.mrpc.core.C0080r.m123a(r1);
        return;
    L_0x003c:
        r0 = move-exception;
        r0.getCause();	 Catch:{ all -> 0x0059 }
        r2 = new java.io.IOException;	 Catch:{ all -> 0x0059 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r4 = "HttpWorker Request Error!";
        r3.<init>(r4);	 Catch:{ all -> 0x0059 }
        r0 = r0.getLocalizedMessage();	 Catch:{ all -> 0x0059 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0059 }
        r0 = r0.toString();	 Catch:{ all -> 0x0059 }
        r2.<init>(r0);	 Catch:{ all -> 0x0059 }
        throw r2;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        com.alipay.android.phone.mrpc.core.C0080r.m123a(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.a(org.apache.http.HttpEntity, java.io.OutputStream):void");
    }

    private static long m113b(HttpResponse httpResponse) {
        long j = 0;
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return C0079q.m108a(split);
                } catch (NumberFormatException e) {
                }
            }
        }
        firstHeader = httpResponse.getFirstHeader("Expires");
        return firstHeader != null ? C0060b.m60b(firstHeader.getValue()) - System.currentTimeMillis() : j;
    }

    private URI m114b() {
        String a = this.f76c.m91a();
        if (this.f77d != null) {
            a = this.f77d;
        }
        if (a != null) {
            return new URI(a);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest m115c() {
        if (this.f78f != null) {
            return this.f78f;
        }
        if (this.f82j == null) {
            byte[] b = this.f76c.m98b();
            CharSequence b2 = this.f76c.m97b(AsyncHttpClient.ENCODING_GZIP);
            if (b != null) {
                if (TextUtils.equals(b2, "true")) {
                    this.f82j = C0060b.m58a(b);
                } else {
                    this.f82j = new ByteArrayEntity(b);
                }
                this.f82j.setContentType(this.f76c.m99c());
            }
        }
        HttpEntity httpEntity = this.f82j;
        if (httpEntity != null) {
            HttpUriRequest httpPost = new HttpPost(m114b());
            httpPost.setEntity(httpEntity);
            this.f78f = httpPost;
        } else {
            this.f78f = new HttpGet(m114b());
        }
        return this.f78f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.android.phone.mrpc.core.C0077u m116d() {
        /*
        r15 = this;
        r14 = 6;
        r13 = 3;
        r12 = 2;
        r4 = 1;
        r5 = 0;
    L_0x0005:
        r2 = r15.f75b;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = "connectivity";
        r2 = r2.getSystemService(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = (android.net.ConnectivityManager) r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r2.getAllNetworkInfo();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r3 != 0) goto L_0x0047;
    L_0x0015:
        r2 = r5;
    L_0x0016:
        if (r2 != 0) goto L_0x0060;
    L_0x0018:
        r2 = new com.alipay.android.phone.mrpc.core.HttpException;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = "The network is not available";
        r2.<init>(r3, r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        throw r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0025:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x003e;
    L_0x0031:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r2.getCode();
        r2.getMsg();
    L_0x003e:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        throw r2;
    L_0x0047:
        r6 = r3.length;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r5;
    L_0x0049:
        if (r2 >= r6) goto L_0x04ec;
    L_0x004b:
        r7 = r3[r2];	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r7 == 0) goto L_0x005d;
    L_0x004f:
        r8 = r7.isAvailable();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r8 == 0) goto L_0x005d;
    L_0x0055:
        r7 = r7.isConnectedOrConnecting();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r7 == 0) goto L_0x005d;
    L_0x005b:
        r2 = r4;
        goto L_0x0016;
    L_0x005d:
        r2 = r2 + 1;
        goto L_0x0049;
    L_0x0060:
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.m88f();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x006f;
    L_0x0068:
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.m88f();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x006f:
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.m100d();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x00a2;
    L_0x0077:
        r3 = r2.isEmpty();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r3 != 0) goto L_0x00a2;
    L_0x007d:
        r3 = r2.iterator();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0081:
        r2 = r3.hasNext();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x00a2;
    L_0x0087:
        r2 = r3.next();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = (org.apache.http.Header) r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r15.m115c();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6.addHeader(r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        goto L_0x0081;
    L_0x0095:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = "Url parser error!";
        r2 = r2.getCause();
        r3.<init>(r4, r2);
        throw r3;
    L_0x00a2:
        r2 = r15.m115c();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        com.alipay.android.phone.mrpc.core.C0060b.m59a(r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.m115c();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        com.alipay.android.phone.mrpc.core.C0060b.m61b(r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.m115c();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = "cookie";
        r6 = r15.m121i();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r7.m91a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r6.getCookie(r7);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.addHeader(r3, r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f79g;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = "http.cookie-store";
        r6 = r15.f80h;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.setAttribute(r3, r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f74a;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.m83a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = f73e;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.m63a(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = "By Http/Https to request. operationType=";
        r2.<init>(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r15.m118f();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.append(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = " url=";
        r2 = r2.append(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r15.f78f;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.getURI();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.toString();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.append(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f74a;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.m83a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r2.getParams();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r9 = "http.route.default-proxy";
        r2 = r15.f75b;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = 0;
        r10 = "connectivity";
        r2 = r2.getSystemService(r10);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = (android.net.ConnectivityManager) r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.getActiveNetworkInfo();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x04e9;
    L_0x011e:
        r2 = r2.isAvailable();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x04e9;
    L_0x0124:
        r10 = android.net.Proxy.getDefaultHost();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r11 = android.net.Proxy.getDefaultPort();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r10 == 0) goto L_0x04e9;
    L_0x012e:
        r2 = new org.apache.http.HttpHost;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.<init>(r10, r11);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0133:
        if (r2 == 0) goto L_0x014a;
    L_0x0135:
        r3 = r2.getHostName();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r10 = "127.0.0.1";
        r3 = android.text.TextUtils.equals(r3, r10);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r3 == 0) goto L_0x014a;
    L_0x0141:
        r3 = r2.getPort();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r10 = 8087; // 0x1f97 float:1.1332E-41 double:3.9955E-320;
        if (r3 != r10) goto L_0x014a;
    L_0x0149:
        r2 = 0;
    L_0x014a:
        r8.setParameter(r9, r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f83k;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x0231;
    L_0x0151:
        r2 = r15.f83k;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0153:
        r3 = r15.m119g();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = 80;
        if (r3 != r8) goto L_0x0168;
    L_0x015b:
        r2 = new org.apache.http.HttpHost;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r15.m120h();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.getHost();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.<init>(r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0168:
        r3 = r15.f74a;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.m83a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r15.f78f;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r9 = r15.f79g;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.execute(r2, r8, r9);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f74a;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r8 - r6;
        r2.m86b(r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f80h;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.getCookies();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r6.m101e();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r6 == 0) goto L_0x0196;
    L_0x018f:
        r6 = r15.m121i();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6.removeAllCookie();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0196:
        r6 = r2.isEmpty();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r6 != 0) goto L_0x024f;
    L_0x019c:
        r6 = r2.iterator();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x01a0:
        r2 = r6.hasNext();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x024f;
    L_0x01a6:
        r2 = r6.next();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = (org.apache.http.cookie.Cookie) r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r2.getDomain();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r7 == 0) goto L_0x01a0;
    L_0x01b2:
        r7 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7.<init>();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r2.getName();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r7.append(r8);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = "=";
        r7 = r7.append(r8);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r2.getValue();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r7.append(r8);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = "; domain=";
        r7 = r7.append(r8);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r2.getDomain();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r7.append(r8);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.isSecure();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x024c;
    L_0x01e1:
        r2 = "; Secure";
    L_0x01e3:
        r2 = r7.append(r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.toString();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r15.m121i();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r8.m91a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7.setCookie(r8, r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = android.webkit.CookieSyncManager.getInstance();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.sync();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        goto L_0x01a0;
    L_0x0200:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x021b;
    L_0x020c:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x021b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r12);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0231:
        r2 = r15.m120h();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = new org.apache.http.HttpHost;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r8 = r2.getHost();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r9 = r15.m119g();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.getProtocol();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3.<init>(r8, r9, r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r15.f83k = r3;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r15.f83k;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        goto L_0x0153;
    L_0x024c:
        r2 = "";
        goto L_0x01e3;
    L_0x024f:
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r3.getStatusLine();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r2.getStatusCode();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r3.getStatusLine();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r7 = r2.getReasonPhrase();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 == r2) goto L_0x02b9;
    L_0x0265:
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r6 != r2) goto L_0x02b7;
    L_0x0269:
        r2 = r4;
    L_0x026a:
        if (r2 != 0) goto L_0x02b9;
    L_0x026c:
        r2 = new com.alipay.android.phone.mrpc.core.HttpException;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r3.getStatusLine();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r6.getStatusCode();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.getStatusLine();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r3 = r3.getReasonPhrase();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.<init>(r6, r3);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        throw r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0286:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x02a1;
    L_0x0292:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x02a1:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r12);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x02b7:
        r2 = r5;
        goto L_0x026a;
    L_0x02b9:
        r3 = r15.m110a(r3, r6, r7);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = -1;
        if (r3 == 0) goto L_0x02cd;
    L_0x02c1:
        r2 = r3.m103b();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x02cd;
    L_0x02c7:
        r2 = r3.m103b();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.length;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = (long) r2;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x02cd:
        r8 = -1;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 != 0) goto L_0x02e8;
    L_0x02d3:
        r2 = r3 instanceof com.alipay.android.phone.mrpc.core.C0078p;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x02e8;
    L_0x02d7:
        r0 = r3;
        r0 = (com.alipay.android.phone.mrpc.core.C0078p) r0;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r0;
        r2 = r2.m104a();	 Catch:{ Exception -> 0x04e6, HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497 }
        r6 = "Content-Length";
        r2 = r2.getHead(r6);	 Catch:{ Exception -> 0x04e6, HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497 }
        java.lang.Long.parseLong(r2);	 Catch:{ Exception -> 0x04e6, HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497 }
    L_0x02e8:
        r2 = r15.f76c;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r2.m91a();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r2 == 0) goto L_0x0310;
    L_0x02f0:
        r6 = r15.m118f();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        if (r6 != 0) goto L_0x0310;
    L_0x02fa:
        r6 = new java.lang.StringBuilder;	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6.<init>();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2 = r6.append(r2);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = "#";
        r2 = r2.append(r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r6 = r15.m118f();	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
        r2.append(r6);	 Catch:{ HttpException -> 0x0025, URISyntaxException -> 0x0095, SSLHandshakeException -> 0x0200, SSLPeerUnverifiedException -> 0x0286, SSLException -> 0x0311, ConnectionPoolTimeoutException -> 0x0342, ConnectTimeoutException -> 0x0373, SocketTimeoutException -> 0x03a4, NoHttpResponseException -> 0x03d6, HttpHostConnectException -> 0x0408, UnknownHostException -> 0x0433, IOException -> 0x0466, NullPointerException -> 0x0497, Exception -> 0x04bd }
    L_0x0310:
        return r3;
    L_0x0311:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x032c;
    L_0x031d:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x032c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r14);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0342:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x035d;
    L_0x034e:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x035d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r13);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0373:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x038e;
    L_0x037f:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x038e:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r13);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x03a4:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x03bf;
    L_0x03b0:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x03bf:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = 4;
        r4 = java.lang.Integer.valueOf(r4);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x03d6:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x03f1;
    L_0x03e2:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x03f1:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = 5;
        r4 = java.lang.Integer.valueOf(r4);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0408:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x0423;
    L_0x0414:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x0423:
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = 8;
        r4 = java.lang.Integer.valueOf(r4);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0433:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x044e;
    L_0x043f:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x044e:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = 9;
        r4 = java.lang.Integer.valueOf(r4);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0466:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x0481;
    L_0x0472:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x0481:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r14);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x0497:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f85m;
        if (r3 > 0) goto L_0x04a7;
    L_0x049f:
        r2 = r15.f85m;
        r2 = r2 + 1;
        r15.f85m = r2;
        goto L_0x0005;
    L_0x04a7:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r5);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x04bd:
        r2 = move-exception;
        r15.m117e();
        r3 = r15.f76c;
        r3 = r3.m88f();
        if (r3 == 0) goto L_0x04d8;
    L_0x04c9:
        r3 = r15.f76c;
        r3.m88f();
        r3 = r15.f76c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
    L_0x04d8:
        r3 = new com.alipay.android.phone.mrpc.core.HttpException;
        r4 = java.lang.Integer.valueOf(r5);
        r2 = java.lang.String.valueOf(r2);
        r3.<init>(r4, r2);
        throw r3;
    L_0x04e6:
        r2 = move-exception;
        goto L_0x02e8;
    L_0x04e9:
        r2 = r3;
        goto L_0x0133;
    L_0x04ec:
        r2 = r5;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.d():com.alipay.android.phone.mrpc.core.u");
    }

    private void m117e() {
        if (this.f78f != null) {
            this.f78f.abort();
        }
    }

    private String m118f() {
        if (!TextUtils.isEmpty(this.f89q)) {
            return this.f89q;
        }
        this.f89q = this.f76c.m97b("operationType");
        return this.f89q;
    }

    private int m119g() {
        URL h = m120h();
        return h.getPort() == -1 ? h.getDefaultPort() : h.getPort();
    }

    private URL m120h() {
        if (this.f84l != null) {
            return this.f84l;
        }
        this.f84l = new URL(this.f76c.m91a());
        return this.f84l;
    }

    private CookieManager m121i() {
        if (this.f81i != null) {
            return this.f81i;
        }
        this.f81i = CookieManager.getInstance();
        return this.f81i;
    }

    public final C0076o m122a() {
        return this.f76c;
    }

    public final /* synthetic */ Object call() {
        return m116d();
    }
}
