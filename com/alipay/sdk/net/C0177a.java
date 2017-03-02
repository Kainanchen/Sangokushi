package com.alipay.sdk.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0166b;
import com.igexin.sdk.PushBuildConfig;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.net.URL;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpParams;

/* renamed from: com.alipay.sdk.net.a */
public final class C0177a {
    public static final String f409a = "application/octet-stream;binary/octet-stream";
    public String f410b;
    private Context f411c;

    private C0177a(Context context) {
        this(context, null);
    }

    public C0177a(Context context, String str) {
        this.f411c = context;
        this.f410b = str;
    }

    private void m513a(String str) {
        this.f410b = str;
    }

    private String m512a() {
        return this.f410b;
    }

    private URL m514b() {
        try {
            return new URL(this.f410b);
        } catch (Exception e) {
            return null;
        }
    }

    public final HttpResponse m520a(byte[] bArr, List<Header> list) throws Throwable {
        HttpResponse a;
        Object obj = null;
        new StringBuilder("requestUrl : ").append(this.f410b);
        C0178b a2 = C0178b.m521a();
        if (a2 != null) {
            try {
                HttpUriRequest httpGet;
                HttpParams params = a2.f414c.getParams();
                String g;
                if (VERSION.SDK_INT >= 11) {
                    g = m519g();
                    if (g == null || g.contains("wap")) {
                        URL b = m514b();
                        if (b != null) {
                            C0166b.f350a.equalsIgnoreCase(b.getProtocol());
                            Object property = System.getProperty("https.proxyHost");
                            String property2 = System.getProperty("https.proxyPort");
                            if (!TextUtils.isEmpty(property)) {
                                obj = new HttpHost(property, Integer.parseInt(property2));
                            }
                        }
                    }
                } else {
                    NetworkInfo f = m518f();
                    if (f != null && f.isAvailable() && f.getType() == 0) {
                        g = Proxy.getDefaultHost();
                        int defaultPort = Proxy.getDefaultPort();
                        if (g != null) {
                            obj = new HttpHost(g, defaultPort);
                        }
                    }
                }
                if (obj != null) {
                    params.setParameter("http.route.default-proxy", obj);
                }
                if (bArr == null || bArr.length == 0) {
                    httpGet = new HttpGet(this.f410b);
                } else {
                    httpGet = new HttpPost(this.f410b);
                    HttpEntity byteArrayEntity = new ByteArrayEntity(bArr);
                    byteArrayEntity.setContentType(f409a);
                    ((HttpPost) httpGet).setEntity(byteArrayEntity);
                    httpGet.addHeader("Accept-Charset", AsyncHttpResponseHandler.DEFAULT_CHARSET);
                    httpGet.addHeader("Connection", "Keep-Alive");
                    httpGet.addHeader("Keep-Alive", "timeout=180, max=100");
                }
                if (list != null) {
                    for (Header addHeader : list) {
                        httpGet.addHeader(addHeader);
                    }
                }
                a = a2.m535a(httpGet);
                Header[] headers = a.getHeaders("X-Hostname");
                if (!(headers == null || headers.length <= 0 || headers[0] == null)) {
                    a.getHeaders("X-Hostname")[0].toString();
                }
                headers = a.getHeaders("X-ExecuteTime");
                if (!(headers == null || headers.length <= 0 || headers[0] == null)) {
                    a.getHeaders("X-ExecuteTime")[0].toString();
                }
            } catch (Throwable th) {
            }
        }
        return a;
    }

    private HttpHost m515c() {
        String g;
        if (VERSION.SDK_INT >= 11) {
            g = m519g();
            if (g != null && !g.contains("wap")) {
                return null;
            }
            URL b = m514b();
            if (b == null) {
                return null;
            }
            C0166b.f350a.equalsIgnoreCase(b.getProtocol());
            Object property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new HttpHost(property, Integer.parseInt(property2));
        }
        NetworkInfo f = m518f();
        if (f == null || !f.isAvailable() || f.getType() != 0) {
            return null;
        }
        g = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (g != null) {
            return new HttpHost(g, defaultPort);
        }
        return null;
    }

    private HttpHost m516d() {
        NetworkInfo f = m518f();
        if (f == null || !f.isAvailable() || f.getType() != 0) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (defaultHost != null) {
            return new HttpHost(defaultHost, defaultPort);
        }
        return null;
    }

    private HttpHost m517e() {
        String g = m519g();
        if (g != null && !g.contains("wap")) {
            return null;
        }
        URL b = m514b();
        if (b == null) {
            return null;
        }
        C0166b.f350a.equalsIgnoreCase(b.getProtocol());
        Object property = System.getProperty("https.proxyHost");
        String property2 = System.getProperty("https.proxyPort");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        return new HttpHost(property, Integer.parseInt(property2));
    }

    private NetworkInfo m518f() {
        try {
            return ((ConnectivityManager) this.f411c.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            return null;
        }
    }

    private String m519g() {
        try {
            NetworkInfo f = m518f();
            if (f == null || !f.isAvailable()) {
                return PushBuildConfig.sdk_conf_debug_level;
            }
            if (f.getType() == 1) {
                return "wifi";
            }
            return f.getExtraInfo().toLowerCase();
        } catch (Exception e) {
            return PushBuildConfig.sdk_conf_debug_level;
        }
    }
}
