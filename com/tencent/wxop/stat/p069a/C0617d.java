package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0630b;
import com.tencent.wxop.stat.common.C0645q;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.d */
public class C0617d extends C0613e {
    private String f1866a;
    private int f1867m;
    private int f1868n;
    private Thread f1869o;

    public C0617d(Context context, int i, int i2, Throwable th, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1868n = 100;
        this.f1869o = null;
        m2266a(i2, th);
    }

    public C0617d(Context context, int i, int i2, Throwable th, Thread thread, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1868n = 100;
        this.f1869o = null;
        m2266a(i2, th);
        this.f1869o = thread;
    }

    public C0617d(Context context, int i, String str, int i2, int i3, Thread thread, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1868n = 100;
        this.f1869o = null;
        if (str != null) {
            if (i3 <= 0) {
                i3 = StatConfig.getMaxReportEventLength();
            }
            if (str.length() <= i3) {
                this.f1866a = str;
            } else {
                this.f1866a = str.substring(0, i3);
            }
        }
        this.f1869o = thread;
        this.f1867m = i2;
    }

    private void m2266a(int i, Throwable th) {
        if (th != null) {
            Writer stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            this.f1866a = stringWriter.toString();
            this.f1867m = i;
            printWriter.close();
        }
    }

    public C0618f m2267a() {
        return C0618f.ERROR;
    }

    public boolean m2268a(JSONObject jSONObject) {
        C0645q.m2449a(jSONObject, "er", this.f1866a);
        jSONObject.put("ea", this.f1867m);
        if (this.f1867m == 2 || this.f1867m == 3) {
            new C0630b(this.l).m2371a(jSONObject, this.f1869o);
        }
        return true;
    }
}
