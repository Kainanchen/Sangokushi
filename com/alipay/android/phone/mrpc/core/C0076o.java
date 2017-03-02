package com.alipay.android.phone.mrpc.core;

import com.zkunity.app.ResourceIDs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* renamed from: com.alipay.android.phone.mrpc.core.o */
public final class C0076o extends C0075t {
    private String f59b;
    private byte[] f60c;
    private String f61d;
    private ArrayList<Header> f62e;
    private Map<String, String> f63f;
    private boolean f64g;

    public C0076o(String str) {
        this.f59b = str;
        this.f62e = new ArrayList();
        this.f63f = new HashMap();
        this.f61d = "application/x-www-form-urlencoded";
    }

    public final String m91a() {
        return this.f59b;
    }

    public final void m92a(String str) {
        this.f61d = str;
    }

    public final void m93a(String str, String str2) {
        if (this.f63f == null) {
            this.f63f = new HashMap();
        }
        this.f63f.put(str, str2);
    }

    public final void m94a(Header header) {
        this.f62e.add(header);
    }

    public final void m95a(boolean z) {
        this.f64g = z;
    }

    public final void m96a(byte[] bArr) {
        this.f60c = bArr;
    }

    public final String m97b(String str) {
        return this.f63f == null ? null : (String) this.f63f.get(str);
    }

    public final byte[] m98b() {
        return this.f60c;
    }

    public final String m99c() {
        return this.f61d;
    }

    public final ArrayList<Header> m100d() {
        return this.f62e;
    }

    public final boolean m101e() {
        return this.f64g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0076o c0076o = (C0076o) obj;
        if (this.f60c == null) {
            if (c0076o.f60c != null) {
                return false;
            }
        } else if (!this.f60c.equals(c0076o.f60c)) {
            return false;
        }
        return this.f59b == null ? c0076o.f59b == null : this.f59b.equals(c0076o.f59b);
    }

    public final int hashCode() {
        int i = 1;
        if (this.f63f != null && this.f63f.containsKey(ResourceIDs.ID)) {
            i = ((String) this.f63f.get(ResourceIDs.ID)).hashCode() + 31;
        }
        return (this.f59b == null ? 0 : this.f59b.hashCode()) + (i * 31);
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", new Object[]{this.f59b, this.f62e});
    }
}
