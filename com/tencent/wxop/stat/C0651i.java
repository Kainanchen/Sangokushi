package com.tencent.wxop.stat;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.p055a.p056a.p057a.p058a.C0579g;
import com.tencent.p055a.p056a.p057a.p058a.C0580h;
import com.tencent.wxop.stat.common.C0633e;
import com.tencent.wxop.stat.common.C0634f;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.p069a.C0613e;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.mime.MIME;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.i */
class C0651i {
    private static StatLogger f2079d;
    private static C0651i f2080e;
    private static Context f2081f;
    DefaultHttpClient f2082a;
    C0633e f2083b;
    StringBuilder f2084c;
    private long f2085g;

    static {
        f2079d = C0639k.m2401b();
        f2080e = null;
        f2081f = null;
    }

    private C0651i(Context context) {
        this.f2082a = null;
        this.f2083b = null;
        this.f2084c = new StringBuilder(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
        this.f2085g = 0;
        try {
            f2081f = context.getApplicationContext();
            this.f2085g = System.currentTimeMillis() / 1000;
            this.f2083b = new C0633e();
            if (StatConfig.isDebugEnable()) {
                try {
                    Logger.getLogger("org.apache.http.wire").setLevel(Level.FINER);
                    Logger.getLogger("org.apache.http.headers").setLevel(Level.FINER);
                    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
                    System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
                    System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
                    System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "debug");
                    System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "debug");
                } catch (Throwable th) {
                }
            }
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            HttpConnectionParams.setSoTimeout(basicHttpParams, AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            this.f2082a = new DefaultHttpClient(basicHttpParams);
            this.f2082a.setKeepAliveStrategy(new C0652j(this));
        } catch (Throwable th2) {
            f2079d.m2360e(th2);
        }
    }

    static Context m2468a() {
        return f2081f;
    }

    static void m2469a(Context context) {
        f2081f = context.getApplicationContext();
    }

    private void m2470a(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("mid");
            if (C0580h.m1931c(optString)) {
                if (StatConfig.isDebugEnable()) {
                    f2079d.m2361i("update mid:" + optString);
                }
                C0579g.m1921E(f2081f).m1923a(optString);
            }
            if (!jSONObject.isNull("cfg")) {
                StatConfig.m2212a(f2081f, jSONObject.getJSONObject("cfg"));
            }
            if (!jSONObject.isNull("ncts")) {
                int i = jSONObject.getInt("ncts");
                int currentTimeMillis = (int) (((long) i) - (System.currentTimeMillis() / 1000));
                if (StatConfig.isDebugEnable()) {
                    f2079d.m2361i("server time:" + i + ", diff time:" + currentTimeMillis);
                }
                C0639k.m2433z(f2081f);
                C0639k.m2397a(f2081f, currentTimeMillis);
            }
        } catch (Throwable th) {
            f2079d.m2363w(th);
        }
    }

    static C0651i m2471b(Context context) {
        if (f2080e == null) {
            synchronized (C0651i.class) {
                if (f2080e == null) {
                    f2080e = new C0651i(context);
                }
            }
        }
        return f2080e;
    }

    void m2472a(C0613e c0613e, C0626h c0626h) {
        m2474b(Arrays.asList(new String[]{c0613e.m2258g()}), c0626h);
    }

    void m2473a(List<?> list, C0626h c0626h) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            list.get(0);
            Throwable th;
            try {
                String str;
                this.f2084c.delete(0, this.f2084c.length());
                this.f2084c.append("[");
                String str2 = "rc4";
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2084c.append(list.get(i2).toString());
                    if (i2 != size - 1) {
                        this.f2084c.append(",");
                    }
                }
                this.f2084c.append("]");
                String stringBuilder = this.f2084c.toString();
                size = stringBuilder.length();
                String str3 = StatConfig.getStatReportUrl() + "/?index=" + this.f2085g;
                this.f2085g++;
                if (StatConfig.isDebugEnable()) {
                    f2079d.m2361i("[" + str3 + "]Send request(" + size + "bytes), content:" + stringBuilder);
                }
                HttpPost httpPost = new HttpPost(str3);
                httpPost.addHeader(AsyncHttpClient.HEADER_ACCEPT_ENCODING, AsyncHttpClient.ENCODING_GZIP);
                httpPost.setHeader("Connection", "Keep-Alive");
                httpPost.removeHeaders("Cache-Control");
                HttpHost a = C0625a.m2283a(f2081f).m2290a();
                httpPost.addHeader(AsyncHttpClient.HEADER_CONTENT_ENCODING, str2);
                if (a == null) {
                    this.f2082a.getParams().removeParameter("http.route.default-proxy");
                } else {
                    if (StatConfig.isDebugEnable()) {
                        f2079d.m2358d("proxy:" + a.toHostString());
                    }
                    httpPost.addHeader("X-Content-Encoding", str2);
                    this.f2082a.getParams().setParameter("http.route.default-proxy", a);
                    httpPost.addHeader("X-Online-Host", StatConfig.f1802k);
                    httpPost.addHeader("Accept", "*/*");
                    httpPost.addHeader(MIME.CONTENT_TYPE, "json");
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream(size);
                byte[] bytes = stringBuilder.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET);
                int length = bytes.length;
                if (size > StatConfig.f1806o) {
                    i = 1;
                }
                if (i != 0) {
                    httpPost.removeHeaders(AsyncHttpClient.HEADER_CONTENT_ENCODING);
                    str = str2 + ",gzip";
                    httpPost.addHeader(AsyncHttpClient.HEADER_CONTENT_ENCODING, str);
                    if (a != null) {
                        httpPost.removeHeaders("X-Content-Encoding");
                        httpPost.addHeader("X-Content-Encoding", str);
                    }
                    byteArrayOutputStream.write(new byte[4]);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.close();
                    bytes = byteArrayOutputStream.toByteArray();
                    ByteBuffer.wrap(bytes, 0, 4).putInt(length);
                    if (StatConfig.isDebugEnable()) {
                        f2079d.m2358d("before Gzip:" + length + " bytes, after Gzip:" + bytes.length + " bytes");
                    }
                }
                httpPost.setEntity(new ByteArrayEntity(C0634f.m2375a(bytes)));
                HttpResponse execute = this.f2082a.execute(httpPost);
                HttpEntity entity = execute.getEntity();
                size = execute.getStatusLine().getStatusCode();
                long contentLength = entity.getContentLength();
                if (StatConfig.isDebugEnable()) {
                    f2079d.m2361i("http recv response status code:" + size + ", content length:" + contentLength);
                }
                if (contentLength <= 0) {
                    f2079d.m2359e((Object) "Server response no data.");
                    if (c0626h != null) {
                        c0626h.m2310b();
                    }
                    EntityUtils.toString(entity);
                    return;
                }
                if (contentLength > 0) {
                    InputStream content = entity.getContent();
                    DataInputStream dataInputStream = new DataInputStream(content);
                    bytes = new byte[((int) entity.getContentLength())];
                    dataInputStream.readFully(bytes);
                    content.close();
                    dataInputStream.close();
                    Header firstHeader = execute.getFirstHeader(AsyncHttpClient.HEADER_CONTENT_ENCODING);
                    if (firstHeader != null) {
                        if (firstHeader.getValue().equalsIgnoreCase("gzip,rc4")) {
                            bytes = C0634f.m2377b(C0639k.m2399a(bytes));
                        } else if (firstHeader.getValue().equalsIgnoreCase("rc4,gzip")) {
                            bytes = C0639k.m2399a(C0634f.m2377b(bytes));
                        } else if (firstHeader.getValue().equalsIgnoreCase(AsyncHttpClient.ENCODING_GZIP)) {
                            bytes = C0639k.m2399a(bytes);
                        } else if (firstHeader.getValue().equalsIgnoreCase("rc4")) {
                            bytes = C0634f.m2377b(bytes);
                        }
                    }
                    str = new String(bytes, AsyncHttpResponseHandler.DEFAULT_CHARSET);
                    if (StatConfig.isDebugEnable()) {
                        f2079d.m2361i("http get response data:" + str);
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (size == Downloads.STATUS_SUCCESS) {
                        m2470a(jSONObject);
                        if (c0626h != null) {
                            if (jSONObject.optInt("ret") == 0) {
                                c0626h.m2309a();
                            } else {
                                f2079d.error((Object) "response error data.");
                                c0626h.m2310b();
                            }
                        }
                    } else {
                        f2079d.error("Server response error code:" + size + ", error:" + new String(bytes, AsyncHttpResponseHandler.DEFAULT_CHARSET));
                        if (c0626h != null) {
                            c0626h.m2310b();
                        }
                    }
                    content.close();
                } else {
                    EntityUtils.toString(entity);
                }
                byteArrayOutputStream.close();
                th = null;
                if (th != null) {
                    f2079d.error(th);
                    if (c0626h != null) {
                        try {
                            c0626h.m2310b();
                        } catch (Throwable th2) {
                            f2079d.m2360e(th2);
                        }
                    }
                    if (th instanceof OutOfMemoryError) {
                        System.gc();
                        this.f2084c = null;
                        this.f2084c = new StringBuilder(AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT);
                    }
                    C0625a.m2283a(f2081f).m2294d();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    void m2474b(List<?> list, C0626h c0626h) {
        if (this.f2083b != null) {
            this.f2083b.m2373a(new C0653k(this, list, c0626h));
        }
    }
}
