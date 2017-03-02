package com.igexin.push.p052f;

import com.igexin.push.config.C0377k;
import java.util.Random;

/* renamed from: com.igexin.push.f.c */
public class C0514c {
    private static final String f1416b;
    private static char[] f1417c;
    public int f1418a;
    private Random f1419d;

    static {
        f1416b = C0377k.f1013a;
        f1417c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`~!@#$%^&*()-_=+[{}];:'/?.>,<".toCharArray();
    }

    public C0514c() {
        this.f1418a = 16;
        this.f1419d = new Random(System.currentTimeMillis());
    }
}
