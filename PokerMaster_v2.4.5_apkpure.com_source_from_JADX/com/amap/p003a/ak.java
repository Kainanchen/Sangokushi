package com.amap.p003a;

import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.amap.p003a.ah.BaseNetManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PushbackInputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

/* compiled from: HttpUrlUtil */
/* renamed from: com.amap.a.ak */
public final class ak {
    static al f185a;
    volatile boolean f186b;
    long f187c;
    long f188d;
    private int f189e;
    private int f190f;
    private boolean f191g;
    private SSLContext f192h;
    private Proxy f193i;
    private String f194j;
    private BaseNetManager f195k;
    private HostnameVerifier f196l;

    /* renamed from: com.amap.a.ak.1 */
    class HttpUrlUtil implements HostnameVerifier {
        final /* synthetic */ ak f184a;

        HttpUrlUtil(ak akVar) {
            this.f184a = akVar;
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            return defaultHostnameVerifier.verify("*.amap.com", sSLSession) || defaultHostnameVerifier.verify("*.apilocate.amap.com", sSLSession);
        }
    }

    ak(int i, int i2, Proxy proxy) {
        this(i, i2, proxy, false);
    }

    ak(int i, int i2, Proxy proxy, boolean z) {
        this(i, i2, proxy, z, (byte) 0);
    }

    private ak(int i, int i2, Proxy proxy, boolean z, byte b) {
        this.f186b = false;
        this.f187c = -1;
        this.f188d = 0;
        this.f196l = new HttpUrlUtil(this);
        this.f189e = i;
        this.f190f = i2;
        this.f193i = proxy;
        this.f191g = z;
        this.f195k = null;
        try {
            this.f194j = UUID.randomUUID().toString().replaceAll("-", LetterIndexBar.SEARCH_ICON_LETTER).toLowerCase();
        } catch (Throwable th) {
            cm.m637a(th, "HttpUrlUtil", "initCSID");
        }
        if (z) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                this.f192h = instance;
            } catch (Throwable th2) {
                cm.m637a(th2, "HttpUtil", "HttpUtil");
            }
        }
    }

    private an m173a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        InputStream pushbackInputStream;
        IOException e;
        InputStream inputStream2;
        Throwable th;
        PushbackInputStream pushbackInputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            Map headerFields = httpURLConnection.getHeaderFields();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                String str;
                String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (headerFields != null) {
                    List list = (List) headerFields.get("gsid");
                    if (list != null && list.size() > 0) {
                        str = (String) list.get(0);
                        throw new ca("\u7f51\u7edc\u5f02\u5e38\u539f\u56e0\uff1a" + httpURLConnection.getResponseMessage() + " \u7f51\u7edc\u5f02\u5e38\u72b6\u6001\u7801\uff1a" + responseCode + "  " + str + " " + this.f194j);
                    }
                }
                str = str2;
                throw new ca("\u7f51\u7edc\u5f02\u5e38\u539f\u56e0\uff1a" + httpURLConnection.getResponseMessage() + " \u7f51\u7edc\u5f02\u5e38\u72b6\u6001\u7801\uff1a" + responseCode + "  " + str + " " + this.f194j);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr;
                    InputStream gZIPInputStream;
                    pushbackInputStream = new PushbackInputStream(inputStream, 2);
                    try {
                        bArr = new byte[2];
                        pushbackInputStream.read(bArr);
                        pushbackInputStream.unread(bArr);
                        gZIPInputStream = (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
                    } catch (IOException e2) {
                        e = e2;
                        inputStream2 = pushbackInputStream;
                        pushbackInputStream = null;
                        gZIPInputStream = inputStream2;
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream2 = pushbackInputStream;
                        pushbackInputStream = null;
                        gZIPInputStream = inputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                cm.m637a(th4, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                cm.m637a(th5, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (pushbackInputStream2 != null) {
                            try {
                                pushbackInputStream2.close();
                            } catch (Throwable th6) {
                                cm.m637a(th6, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (pushbackInputStream != null) {
                            try {
                                pushbackInputStream.close();
                            } catch (Throwable th62) {
                                cm.m637a(th62, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable th622) {
                                cm.m637a(th622, "HttpUrlUtil", "parseResult");
                            }
                        }
                        throw th;
                    }
                    try {
                        bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                        while (true) {
                            int read = gZIPInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        if (f185a != null) {
                            f185a.m178a();
                        }
                        an anVar = new an();
                        anVar.f197a = byteArrayOutputStream.toByteArray();
                        anVar.f198b = headerFields;
                        anVar.f199c = this.f194j;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th42) {
                                cm.m637a(th42, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th52) {
                                cm.m637a(th52, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (pushbackInputStream != null) {
                            try {
                                pushbackInputStream.close();
                            } catch (Throwable th7) {
                                cm.m637a(th7, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th6222) {
                                cm.m637a(th6222, "HttpUrlUtil", "parseResult");
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable th62222) {
                                cm.m637a(th62222, "HttpUrlUtil", "parseResult");
                            }
                        }
                        return anVar;
                    } catch (IOException e3) {
                        e = e3;
                        inputStream2 = pushbackInputStream;
                        pushbackInputStream = gZIPInputStream;
                        gZIPInputStream = inputStream2;
                        throw e;
                    } catch (Throwable th8) {
                        th = th8;
                        inputStream2 = pushbackInputStream;
                        pushbackInputStream = gZIPInputStream;
                        gZIPInputStream = inputStream2;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (pushbackInputStream2 != null) {
                            pushbackInputStream2.close();
                        }
                        if (pushbackInputStream != null) {
                            pushbackInputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    pushbackInputStream = null;
                    throw e;
                } catch (Throwable th9) {
                    th = th9;
                    pushbackInputStream = null;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (pushbackInputStream2 != null) {
                        pushbackInputStream2.close();
                    }
                    if (pushbackInputStream != null) {
                        pushbackInputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                pushbackInputStream = null;
                inputStream = null;
                throw e;
            } catch (Throwable th10) {
                th = th10;
                pushbackInputStream = null;
                inputStream = null;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (pushbackInputStream2 != null) {
                    pushbackInputStream2.close();
                }
                if (pushbackInputStream != null) {
                    pushbackInputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            pushbackInputStream = null;
            inputStream = null;
            byteArrayOutputStream = null;
            throw e;
        } catch (Throwable th11) {
            th = th11;
            pushbackInputStream = null;
            inputStream = null;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (pushbackInputStream2 != null) {
                pushbackInputStream2.close();
            }
            if (pushbackInputStream != null) {
                pushbackInputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    static String m174a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(URLEncoder.encode(str));
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode(str2));
        }
        return stringBuilder.toString();
    }

    private void m175a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
        try {
            httpURLConnection.addRequestProperty("csid", this.f194j);
        } catch (Throwable th) {
            cm.m637a(th, "HttpUrlUtil", "addHeaders");
        }
        httpURLConnection.setConnectTimeout(this.f189e);
        httpURLConnection.setReadTimeout(this.f190f);
    }

    final an m176a(String str, Map<String, String> map, byte[] bArr) {
        try {
            HttpURLConnection a = m177a(str, (Map) map, true);
            if (bArr != null && bArr.length > 0) {
                DataOutputStream dataOutputStream = new DataOutputStream(a.getOutputStream());
                dataOutputStream.write(bArr);
                dataOutputStream.close();
            }
            a.connect();
            return m173a(a);
        } catch (ConnectException e) {
            e.printStackTrace();
            throw new ca("http\u8fde\u63a5\u5931\u8d25 - ConnectionException");
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            throw new ca("url\u5f02\u5e38 - MalformedURLException");
        } catch (UnknownHostException e3) {
            e3.printStackTrace();
            throw new ca("\u672a\u77e5\u4e3b\u673a - UnKnowHostException");
        } catch (SocketException e4) {
            e4.printStackTrace();
            throw new ca("socket \u8fde\u63a5\u5f02\u5e38 - SocketException");
        } catch (SocketTimeoutException e5) {
            e5.printStackTrace();
            throw new ca("socket \u8fde\u63a5\u8d85\u65f6 - SocketTimeoutException");
        } catch (InterruptedIOException e6) {
            throw new ca("\u672a\u77e5\u7684\u9519\u8bef");
        } catch (IOException e7) {
            e7.printStackTrace();
            throw new ca("IO \u64cd\u4f5c\u5f02\u5e38 - IOException");
        } catch (Throwable e8) {
            cm.m637a(e8, "HttpUrlUtil", "makePostReqeust");
            throw e8;
        } catch (Throwable e82) {
            cm.m637a(e82, "HttpUrlUtil", "makePostReqeust");
            ca caVar = new ca("\u672a\u77e5\u7684\u9519\u8bef");
        }
    }

    final HttpURLConnection m177a(String str, Map<String, String> map, boolean z) {
        HttpURLConnection httpURLConnection;
        ce.m548a();
        URLConnection uRLConnection = null;
        URL url = new URL(str);
        if (this.f195k != null) {
            uRLConnection = this.f195k.m148a();
        }
        if (uRLConnection == null) {
            uRLConnection = this.f193i != null ? url.openConnection(this.f193i) : url.openConnection();
        }
        if (this.f191g) {
            httpURLConnection = (HttpsURLConnection) uRLConnection;
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f192h.getSocketFactory());
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(this.f196l);
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnection;
        }
        if (VERSION.SDK != null && VERSION.SDK_INT > 13) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        m175a(map, httpURLConnection);
        if (z) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
        } else {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }
}
