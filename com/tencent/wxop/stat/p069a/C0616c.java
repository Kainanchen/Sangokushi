package com.tencent.wxop.stat.p069a;

import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.c */
public class C0616c {
    public String f1863a;
    public JSONArray f1864b;
    public JSONObject f1865c;

    public C0616c() {
        this.f1865c = null;
    }

    public C0616c(String str, String[] strArr, Properties properties) {
        this.f1865c = null;
        this.f1863a = str;
        if (properties != null) {
            this.f1865c = new JSONObject(properties);
        } else if (strArr != null) {
            this.f1864b = new JSONArray();
            for (Object put : strArr) {
                this.f1864b.put(put);
            }
        } else {
            this.f1865c = new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0616c)) {
            return false;
        }
        return toString().equals(((C0616c) obj).toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.f1863a).append(",");
        if (this.f1864b != null) {
            stringBuilder.append(this.f1864b.toString());
        }
        if (this.f1865c != null) {
            stringBuilder.append(this.f1865c.toString());
        }
        return stringBuilder.toString();
    }
}
