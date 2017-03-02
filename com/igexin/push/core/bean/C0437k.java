package com.igexin.push.core.bean;

import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;

/* renamed from: com.igexin.push.core.bean.k */
public class C0437k extends BaseAction {
    private String f1185a;
    private boolean f1186b;
    private boolean f1187c;
    private String f1188d;

    public String m1536a() {
        return this.f1185a;
    }

    public void m1537a(String str) {
        this.f1185a = str;
    }

    public void m1538a(boolean z) {
        this.f1186b = z;
    }

    public String m1539b() {
        return this.f1188d;
    }

    public void m1540b(String str) {
        this.f1188d = str;
    }

    public void m1541b(boolean z) {
        this.f1187c = z;
    }

    public String m1542c() {
        String str = this.f1185a;
        if (this.f1186b) {
            str = str.indexOf("?") > 0 ? str + "&cid=" + C0483g.f1333s : str + "?cid=" + C0483g.f1333s;
        }
        if (!this.f1187c) {
            return str;
        }
        String m = C0482f.m1694a().m1718m();
        return m != null ? str.indexOf("?") > 0 ? str + "&nettype=" + m : str + "?nettype=" + m : str;
    }
}
