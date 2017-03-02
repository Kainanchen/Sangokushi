package com.tencent.wxop.stat;

import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.f */
class C0649f {
    int f2075a;
    JSONObject f2076b;
    String f2077c;
    int f2078d;

    public C0649f(int i) {
        this.f2076b = new JSONObject();
        this.f2077c = Constants.STR_EMPTY;
        this.f2078d = 0;
        this.f2075a = i;
    }

    String m2462a() {
        return this.f2076b.toString();
    }
}
