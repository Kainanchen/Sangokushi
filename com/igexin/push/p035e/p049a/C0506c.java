package com.igexin.push.p035e.p049a;

import android.os.Process;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
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

/* renamed from: com.igexin.push.e.a.c */
public class C0506c extends C0233d {
    public C0466b f1402a;
    public HttpRequestBase f1403b;
    public HttpClient f1404c;

    public C0506c(C0466b c0466b) {
        super(0);
        this.f1402a = c0466b;
    }

    public final void a_() {
        super.a_();
        Process.setThreadPriority(10);
        if (this.f1402a != null && this.f1402a.f1247e != null) {
            this.f1404c = new DefaultHttpClient();
            int i = 0;
            while (i < 3) {
                try {
                    HttpResponse execute;
                    if (this.f1402a.f1248f == null && this.f1402a.f1249g == null) {
                        HttpUriRequest httpGet = new HttpGet(URI.create(this.f1402a.f1247e));
                        this.f1403b = httpGet;
                        execute = this.f1404c.execute(httpGet);
                    } else {
                        Object httpPost = new HttpPost(URI.create(this.f1402a.f1247e));
                        this.f1403b = httpPost;
                        if (this.f1402a.f1249g != null) {
                            httpPost.setEntity(new InputStreamEntity(this.f1402a.f1249g, this.f1402a.f1250h));
                        } else {
                            httpPost.setEntity(new InputStreamEntity(new ByteArrayInputStream(this.f1402a.f1248f), (long) this.f1402a.f1248f.length));
                        }
                        execute = this.f1404c.execute(httpPost);
                    }
                    if (execute.getStatusLine().getStatusCode() == Downloads.STATUS_SUCCESS) {
                        this.f1402a.m1637a(EntityUtils.toByteArray(execute.getEntity()));
                        C0244d.m802c().m797a((Object) this.f1402a);
                        C0244d.m802c().m814d();
                        return;
                    } else if (i == 2) {
                        throw new Exception("Http response code is : " + execute.getStatusLine().getStatusCode() + " try times = " + (i + 1));
                    } else {
                        i++;
                    }
                } catch (Exception e) {
                    C0247a.m838b("HttpTask" + e.toString());
                    if (i == 2) {
                        this.f1402a.m1636a(this.M);
                    }
                }
            }
        }
    }

    public final int m1809b() {
        return -2147483638;
    }

    public void m1810d() {
        this.y = true;
    }

    protected void m1811e() {
    }

    public void m1812f() {
        super.m744f();
        if (this.f1403b != null) {
            this.f1403b.abort();
        }
        this.f1404c = null;
    }
}
