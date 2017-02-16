package com.tencent.android.tpush.p070d;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.tencent.android.tpush.service.cache.CacheManager;
import java.util.Locale;

/* renamed from: com.tencent.android.tpush.d.a */
public class ProGuard {
    private String f7397a;
    private String f7398b;
    private int f7399c;
    private String f7400d;
    private String f7401e;
    private String f7402f;
    private int f7403g;
    private int f7404h;
    private int f7405i;
    private String f7406j;
    private String f7407k;
    private String f7408l;
    private String f7409m;
    private String f7410n;
    private String f7411o;

    public ProGuard(Context context) {
        this.f7397a = com.tencent.android.tpush.service.p077d.ProGuard.m5331d(context);
        this.f7398b = "Axg%lu";
        this.f7399c = 0;
        this.f7400d = "%d";
        this.f7401e = com.tencent.android.tpush.stat.p078a.ProGuard.m5512f(context);
        this.f7402f = CacheManager.getToken(context);
        this.f7403g = 2000;
        this.f7404h = 0;
        this.f7405i = com.tencent.android.tpush.service.p077d.ProGuard.m5325c();
        DisplayMetrics c = com.tencent.android.tpush.stat.p078a.ProGuard.m5509c(context);
        this.f7406j = c.widthPixels + "*" + c.heightPixels;
        this.f7407k = Build.MODEL;
        this.f7408l = Locale.getDefault().getLanguage();
        this.f7409m = "2.47";
        this.f7410n = Build.MANUFACTURER;
        this.f7411o = "%s";
    }

    public String m4844a() {
        StringBuffer stringBuffer = new StringBuffer("[{");
        stringBuffer.append("\"idx\":").append(this.f7399c);
        stringBuffer.append(",\"ts\":").append(this.f7400d);
        stringBuffer.append(",\"et\":").append(this.f7403g);
        stringBuffer.append(",\"si\":").append(this.f7404h);
        if (this.f7397a != null) {
            stringBuffer.append(",\"ui\":\"").append(this.f7397a).append("\"");
        }
        if (this.f7398b != null) {
            stringBuffer.append(",\"ky\":\"").append(this.f7398b).append("\"");
        }
        if (this.f7402f != null) {
            stringBuffer.append(",\"mid\":\"").append(this.f7402f).append("\"");
        }
        if (this.f7401e != null) {
            stringBuffer.append(",\"mc\":\"").append(this.f7401e).append("\"");
        }
        stringBuffer.append(",\"ev\":{");
        stringBuffer.append("\"ov\":\"").append(this.f7405i).append("\"");
        if (this.f7406j != null) {
            stringBuffer.append(",\"sr\":\"").append(this.f7406j).append("\"");
        }
        if (this.f7407k != null) {
            stringBuffer.append(",\"md\":\"").append(this.f7407k).append("\"");
        }
        if (this.f7408l != null) {
            stringBuffer.append(",\"lg\":\"").append(this.f7408l).append("\"");
        }
        if (this.f7409m != null) {
            stringBuffer.append(",\"sv\":\"").append(this.f7409m).append("\"");
        }
        if (this.f7410n != null) {
            stringBuffer.append(",\"mf\":\"").append(this.f7410n).append("\"");
        }
        if (this.f7411o != null) {
            stringBuffer.append(",\"apn\":\"").append(this.f7411o).append("\"");
        }
        stringBuffer.append("}}]");
        return stringBuffer.toString();
    }
}
