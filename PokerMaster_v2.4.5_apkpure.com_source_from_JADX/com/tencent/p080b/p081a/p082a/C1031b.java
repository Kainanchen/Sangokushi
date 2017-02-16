package com.tencent.p080b.p081a.p082a;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.a.b */
public final class C1031b {
    public String f7964a;
    public JSONArray f7965b;
    public JSONObject f7966c;

    public C1031b() {
        this.f7966c = null;
    }

    public C1031b(String str) {
        this.f7966c = null;
        this.f7964a = str;
        this.f7966c = new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1031b)) {
            return false;
        }
        return toString().equals(((C1031b) obj).toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.f7964a).append(",");
        if (this.f7965b != null) {
            stringBuilder.append(this.f7965b.toString());
        }
        if (this.f7966c != null) {
            stringBuilder.append(this.f7966c.toString());
        }
        return stringBuilder.toString();
    }
}
