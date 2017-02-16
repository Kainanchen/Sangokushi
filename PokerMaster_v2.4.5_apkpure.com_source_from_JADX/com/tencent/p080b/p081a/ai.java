package com.tencent.p080b.p081a;

import android.content.Context;
import com.google.protobuf.CodedOutputStream;
import com.tencent.android.tpush.common.Constants;
import com.tencent.p080b.p081a.p082a.C1029d;
import com.tencent.p080b.p081a.p083b.C1039b;
import com.tencent.p080b.p081a.p083b.C1043f;
import com.tencent.p080b.p081a.p083b.C1049l;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.tencent.b.a.ai */
class ai {
    static C1039b f8003a;
    static Context f8004e;
    private static ai f8005g;
    DefaultHttpClient f8006b;
    C1043f f8007c;
    StringBuilder f8008d;
    long f8009f;

    static {
        f8003a = C1049l.m5693c();
        f8005g = null;
        f8004e = null;
    }

    private ai(Context context) {
        this.f8006b = null;
        this.f8007c = null;
        this.f8008d = new StringBuilder(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        this.f8009f = 0;
        try {
            f8004e = context.getApplicationContext();
            this.f8009f = System.currentTimeMillis() / 1000;
            this.f8007c = new C1043f();
            if (C1058c.m5762b()) {
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
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, Constants.ERRORCODE_UNKNOWN);
            HttpConnectionParams.setSoTimeout(basicHttpParams, Constants.ERRORCODE_UNKNOWN);
            this.f8006b = new DefaultHttpClient(basicHttpParams);
            this.f8006b.setKeepAliveStrategy(new aj(this));
        } catch (Throwable th2) {
            f8003a.m5665b(th2);
        }
    }

    static Context m5654a() {
        return f8004e;
    }

    static void m5655a(Context context) {
        f8004e = context.getApplicationContext();
    }

    static ai m5656b(Context context) {
        if (f8005g == null) {
            synchronized (ai.class) {
                if (f8005g == null) {
                    f8005g = new ai(context);
                }
            }
        }
        return f8005g;
    }

    final void m5657a(C1029d c1029d, ah ahVar) {
        m5658a(Arrays.asList(new String[]{c1029d.m5634f()}), ahVar);
    }

    final void m5658a(List<?> list, ah ahVar) {
        if (this.f8007c != null) {
            this.f8007c.m5674a(new ak(this, list, ahVar));
        }
    }
}
