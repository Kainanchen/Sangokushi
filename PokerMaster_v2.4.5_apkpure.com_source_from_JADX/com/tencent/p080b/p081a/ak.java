package com.tencent.p080b.p081a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.component.GameManager;
import com.tencent.p063a.p064a.p065a.p066a.C1027g;
import com.tencent.p063a.p064a.p065a.p066a.C1028h;
import com.tencent.p080b.p081a.p083b.C1044g;
import com.tencent.p080b.p081a.p083b.C1049l;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.ak */
final class ak implements Runnable {
    final /* synthetic */ List f8011a;
    final /* synthetic */ ah f8012b;
    final /* synthetic */ ai f8013c;

    ak(ai aiVar, List list, ah ahVar) {
        this.f8013c = aiVar;
        this.f8011a = list;
        this.f8012b = ahVar;
    }

    public final void run() {
        ai aiVar = this.f8013c;
        List list = this.f8011a;
        ah ahVar = this.f8012b;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            list.get(0);
            Throwable th;
            try {
                int i;
                Object obj;
                String str;
                aiVar.f8008d.delete(0, aiVar.f8008d.length());
                aiVar.f8008d.append("[");
                String str2 = "rc4";
                for (i = 0; i < size; i++) {
                    aiVar.f8008d.append(list.get(i).toString());
                    if (i != size - 1) {
                        aiVar.f8008d.append(",");
                    }
                }
                aiVar.f8008d.append("]");
                String stringBuilder = aiVar.f8008d.toString();
                int length = stringBuilder.length();
                String str3 = C1058c.m5779n() + "/?index=" + aiVar.f8009f;
                aiVar.f8009f++;
                if (C1058c.m5762b()) {
                    ai.f8003a.m5662a("[" + str3 + "]Send request(" + length + "bytes), content:" + stringBuilder);
                }
                HttpPost httpPost = new HttpPost(str3);
                httpPost.addHeader("Accept-Encoding", "gzip");
                httpPost.setHeader("Connection", "Keep-Alive");
                httpPost.removeHeaders("Cache-Control");
                HttpHost httpHost = C1062g.m5813a(ai.f8004e).f8191d;
                httpPost.addHeader("Content-Encoding", str2);
                if (httpHost == null) {
                    aiVar.f8006b.getParams().removeParameter("http.route.default-proxy");
                } else {
                    if (C1058c.m5762b()) {
                        ai.f8003a.m5670g("proxy:" + httpHost.toHostString());
                    }
                    httpPost.addHeader("X-Content-Encoding", str2);
                    aiVar.f8006b.getParams().setParameter("http.route.default-proxy", httpHost);
                    httpPost.addHeader("X-Online-Host", C1058c.f8138l);
                    httpPost.addHeader("Accept", "*/*");
                    httpPost.addHeader("Content-Type", "json");
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
                byte[] bytes = stringBuilder.getBytes(GameManager.DEFAULT_CHARSET);
                int length2 = bytes.length;
                if (length > C1058c.f8142p) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    httpPost.removeHeaders("Content-Encoding");
                    str = str2 + ",gzip";
                    httpPost.addHeader("Content-Encoding", str);
                    if (httpHost != null) {
                        httpPost.removeHeaders("X-Content-Encoding");
                        httpPost.addHeader("X-Content-Encoding", str);
                    }
                    byteArrayOutputStream.write(new byte[4]);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.close();
                    bytes = byteArrayOutputStream.toByteArray();
                    ByteBuffer.wrap(bytes, 0, 4).putInt(length2);
                    if (C1058c.m5762b()) {
                        ai.f8003a.m5670g("before Gzip:" + length2 + " bytes, after Gzip:" + bytes.length + " bytes");
                    }
                }
                httpPost.setEntity(new ByteArrayEntity(C1044g.m5675a(bytes)));
                HttpResponse execute = aiVar.f8006b.execute(httpPost);
                HttpEntity entity = execute.getEntity();
                size = execute.getStatusLine().getStatusCode();
                long contentLength = entity.getContentLength();
                if (C1058c.m5762b()) {
                    ai.f8003a.m5662a("http recv response status code:" + size + ", content length:" + contentLength);
                }
                if (contentLength <= 0) {
                    ai.f8003a.m5668e("Server response no data.");
                    if (ahVar != null) {
                        ahVar.m5653b();
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
                    Header firstHeader = execute.getFirstHeader("Content-Encoding");
                    if (firstHeader != null) {
                        if (firstHeader.getValue().equalsIgnoreCase("gzip,rc4")) {
                            bytes = C1044g.m5677b(C1049l.m5689a(bytes));
                        } else if (firstHeader.getValue().equalsIgnoreCase("rc4,gzip")) {
                            bytes = C1049l.m5689a(C1044g.m5677b(bytes));
                        } else if (firstHeader.getValue().equalsIgnoreCase("gzip")) {
                            bytes = C1049l.m5689a(bytes);
                        } else if (firstHeader.getValue().equalsIgnoreCase("rc4")) {
                            bytes = C1044g.m5677b(bytes);
                        }
                    }
                    str = new String(bytes, GameManager.DEFAULT_CHARSET);
                    if (C1058c.m5762b()) {
                        ai.f8003a.m5662a("http get response data:" + str);
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (size == 200) {
                        try {
                            stringBuilder = jSONObject.optString("mid");
                            if (C1028h.m4654b(stringBuilder)) {
                                if (C1058c.m5762b()) {
                                    ai.f8003a.m5662a("update mid:" + stringBuilder);
                                }
                                C1027g.m4645a(ai.f8004e).m4647a(stringBuilder);
                            }
                            if (!jSONObject.isNull("cfg")) {
                                C1058c.m5754a(ai.f8004e, jSONObject.getJSONObject("cfg"));
                            }
                            if (!jSONObject.isNull("ncts")) {
                                i = jSONObject.getInt("ncts");
                                length = (int) (((long) i) - (System.currentTimeMillis() / 1000));
                                if (C1058c.m5762b()) {
                                    ai.f8003a.m5662a("server time:" + i + ", diff time:" + length);
                                }
                                C1049l.m5721v(ai.f8004e);
                                C1049l.m5687a(ai.f8004e, length);
                            }
                        } catch (Throwable th2) {
                            ai.f8003a.m5666c(th2);
                        }
                        if (ahVar != null) {
                            if (jSONObject.optInt("ret") == 0) {
                                ahVar.m5652a();
                            } else {
                                ai.f8003a.m5667d("response error data.");
                                ahVar.m5653b();
                            }
                        }
                    } else {
                        ai.f8003a.m5667d("Server response error code:" + size + ", error:" + new String(bytes, GameManager.DEFAULT_CHARSET));
                        if (ahVar != null) {
                            ahVar.m5653b();
                        }
                    }
                    content.close();
                } else {
                    EntityUtils.toString(entity);
                }
                byteArrayOutputStream.close();
                th2 = null;
                if (th2 != null) {
                    ai.f8003a.m5663a(th2);
                    if (ahVar != null) {
                        try {
                            ahVar.m5653b();
                        } catch (Throwable th3) {
                            ai.f8003a.m5665b(th3);
                        }
                    }
                    if (th2 instanceof OutOfMemoryError) {
                        System.gc();
                        aiVar.f8008d = null;
                        aiVar.f8008d = new StringBuilder(AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT);
                    }
                    C1062g a = C1062g.m5813a(ai.f8004e);
                    a.f8192e = (a.f8192e + 1) % a.f8188a.size();
                }
            } catch (Throwable th4) {
            }
        }
    }
}
