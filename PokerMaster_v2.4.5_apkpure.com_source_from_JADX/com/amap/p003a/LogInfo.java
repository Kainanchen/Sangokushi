package com.amap.p003a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.a.m */
public abstract class LogInfo {
    @EntityField(a = "a1", b = 6)
    String f680a;
    @EntityField(a = "b2", b = 2)
    protected int f681b;
    @EntityField(a = "b1", b = 6)
    protected String f682c;
    @EntityField(a = "b3", b = 2)
    protected int f683d;

    public LogInfo() {
        this.f681b = -1;
        this.f683d = 1;
    }

    public static String m690b(String str) {
        Map hashMap = new HashMap();
        hashMap.put("b1", str);
        return DBOperation.m678a(hashMap);
    }

    public static String m691c(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("b2=").append(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public final int m692a() {
        return this.f681b;
    }

    public final void m693a(int i) {
        this.f681b = i;
    }

    public final void m694a(String str) {
        this.f682c = str;
    }

    public final String m695b() {
        return this.f682c;
    }

    public final void m696b(int i) {
        this.f683d = i;
    }

    public final int m697c() {
        return this.f683d;
    }
}
