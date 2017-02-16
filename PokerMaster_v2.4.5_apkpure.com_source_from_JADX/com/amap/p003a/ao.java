package com.amap.p003a;

import android.content.Context;

/* compiled from: OfflineLocEntity */
/* renamed from: com.amap.a.ao */
public final class ao {
    Context f200a;
    cj f201b;
    String f202c;

    public ao(Context context, cj cjVar, String str) {
        this.f200a = context.getApplicationContext();
        this.f201b = cjVar;
        this.f202c = str;
    }

    static String m179a(Context context, cj cjVar, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("\"sdkversion\":\"").append(cjVar.m612b()).append("\",\"product\":\"").append(cjVar.m611a()).append("\",\"nt\":\"").append(ce.m553c(context)).append("\",\"details\":").append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
