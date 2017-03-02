package com.igexin.push.p035e.p049a;

import android.os.Process;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import java.io.ByteArrayInputStream;
import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/* renamed from: com.igexin.push.e.a.a */
public class C0505a extends C0233d {
    public C0466b f1399a;
    public HttpRequestBase f1400b;
    public HttpClient f1401c;

    public C0505a(C0466b c0466b) {
        super(0);
        this.f1399a = c0466b;
    }

    public final void a_() {
        super.a_();
        Process.setThreadPriority(10);
        if (this.f1399a != null && this.f1399a.f1247e != null) {
            this.f1401c = new DefaultHttpClient();
            try {
                HttpResponse execute;
                if (this.f1399a.f1248f == null && this.f1399a.f1249g == null) {
                    HttpUriRequest httpGet = new HttpGet(URI.create(this.f1399a.f1247e));
                    this.f1400b = httpGet;
                    execute = this.f1401c.execute(httpGet);
                } else {
                    Object httpPost = new HttpPost(URI.create(this.f1399a.f1247e));
                    this.f1400b = httpPost;
                    if (this.f1399a.f1249g != null) {
                        httpPost.setEntity(new InputStreamEntity(this.f1399a.f1249g, this.f1399a.f1250h));
                    } else {
                        httpPost.setEntity(new InputStreamEntity(new ByteArrayInputStream(this.f1399a.f1248f), (long) this.f1399a.f1248f.length));
                    }
                    execute = this.f1401c.execute(httpPost);
                }
                if (execute.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                    try {
                        this.f1399a.m1637a(EntityUtils.toByteArray(execute.getEntity()));
                        C0244d.m802c().m797a((Object) this.f1399a);
                        C0244d.m802c().m814d();
                        return;
                    } catch (Exception e) {
                        this.f1399a.m1636a(e);
                        throw e;
                    }
                }
                Exception exception = new Exception("Http response code is : " + execute.getStatusLine().getStatusCode());
                this.f1399a.m1636a(exception);
                throw exception;
            } catch (Exception e2) {
                this.f1399a.m1636a(e2);
                throw e2;
            }
        }
    }

    public final int m1805b() {
        return -2147483639;
    }

    public void m1806d() {
        this.y = true;
    }

    protected void m1807e() {
    }

    public void m1808f() {
        super.m744f();
        if (this.f1400b != null) {
            this.f1400b.abort();
        }
        this.f1401c = null;
    }
}
