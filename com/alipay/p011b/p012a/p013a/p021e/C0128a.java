package com.alipay.p011b.p012a.p013a.p021e;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.alipay.b.a.a.e.a */
public final class C0128a {
    private String f176a;
    private String f177b;
    private String f178c;
    private String f179d;
    private String f180e;
    private String f181f;
    private String f182g;

    public C0128a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f176a = str;
        this.f177b = str2;
        this.f178c = str3;
        this.f179d = str4;
        this.f180e = str5;
        this.f181f = str6;
        this.f182g = str7;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f176a);
        stringBuffer.append("," + this.f177b);
        stringBuffer.append("," + this.f178c);
        stringBuffer.append("," + this.f179d);
        if (C0110a.m234a(this.f180e) || this.f180e.length() < 20) {
            stringBuffer.append("," + this.f180e);
        } else {
            stringBuffer.append("," + this.f180e.substring(0, 20));
        }
        if (C0110a.m234a(this.f181f) || this.f181f.length() < 20) {
            stringBuffer.append("," + this.f181f);
        } else {
            stringBuffer.append("," + this.f181f.substring(0, 20));
        }
        if (C0110a.m234a(this.f182g) || this.f182g.length() < 20) {
            stringBuffer.append("," + this.f182g);
        } else {
            stringBuffer.append("," + this.f182g.substring(0, 20));
        }
        return stringBuffer.toString();
    }
}
