package com.tencent.android.tpush.service;

import com.android.volley.DefaultRetryPolicy;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
class ac implements Comparable {
    public String f7541a;
    public float f7542b;
    public long f7543c;

    ac() {
        this.f7541a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7542b = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        this.f7543c = 0;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m5020a((ac) obj);
    }

    public int m5020a(ac acVar) {
        if (this.f7542b > acVar.f7542b) {
            return -1;
        }
        if (this.f7542b < acVar.f7542b) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pkgName:").append(this.f7541a).append(",accid:").append(this.f7543c).append(",ver:").append(this.f7542b);
        return stringBuilder.toString();
    }
}
