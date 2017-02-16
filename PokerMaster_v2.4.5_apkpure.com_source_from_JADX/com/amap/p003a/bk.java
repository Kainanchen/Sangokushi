package com.amap.p003a;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: LocationRequest */
/* renamed from: com.amap.a.bk */
public final class bk extends ai {
    Map<String, String> f395f;
    String f396g;
    byte[] f397h;
    byte[] f398i;
    boolean f399j;
    String f400k;
    Map<String, String> f401l;

    public bk(Context context, cj cjVar) {
        super(context, cjVar);
        this.f395f = null;
        this.f396g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f397h = null;
        this.f398i = null;
        this.f399j = false;
        this.f400k = null;
        this.f401l = null;
    }

    public final Map<String, String> m369a() {
        return this.f401l;
    }

    public final Map<String, String> m370b() {
        return this.f395f;
    }

    public final void m371b(byte[] bArr) {
        Throwable th;
        IOException e;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    try {
                        byteArrayOutputStream.write(ai.m156a(bArr));
                        byteArrayOutputStream.write(bArr);
                    } catch (IOException e2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            }
            this.f398i = byteArrayOutputStream.toByteArray();
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e5) {
                    e = e5;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    public final String m372c() {
        return this.f396g;
    }

    public final boolean m373d() {
        return this.f399j;
    }

    public final String m374f() {
        return this.f400k;
    }

    public final byte[] m375h() {
        return this.f397h;
    }

    public final byte[] m376i() {
        return this.f398i;
    }
}
