package com.tencent.p080b.p081a.p083b;

import android.util.Log;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.p080b.p081a.C1058c;

/* renamed from: com.tencent.b.a.b.b */
public final class C1039b {
    boolean f8022a;
    private String f8023b;
    private int f8024c;

    public C1039b() {
        this.f8023b = "default";
        this.f8022a = true;
        this.f8024c = 2;
    }

    public C1039b(String str) {
        this.f8023b = "default";
        this.f8022a = true;
        this.f8024c = 2;
        this.f8023b = str;
    }

    private String m5661a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(getClass().getName())) {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    public final void m5663a(Throwable th) {
        if (this.f8024c <= 6) {
            Log.e(this.f8023b, LetterIndexBar.SEARCH_ICON_LETTER, th);
            C1058c.m5786u();
        }
    }

    public final void m5664b(Object obj) {
        if (this.f8024c <= 5) {
            String a = m5661a();
            Log.w(this.f8023b, a == null ? obj.toString() : a + " - " + obj);
            C1058c.m5786u();
        }
    }

    public final void m5667d(Object obj) {
        if (this.f8024c <= 6) {
            String a = m5661a();
            Log.e(this.f8023b, a == null ? obj.toString() : a + " - " + obj);
            C1058c.m5786u();
        }
    }

    public final void m5669f(Object obj) {
        if (this.f8024c <= 3) {
            String a = m5661a();
            if (a == null) {
                obj.toString();
            } else {
                new StringBuilder().append(a).append(" - ").append(obj);
            }
            C1058c.m5786u();
        }
    }

    public final void m5662a(Object obj) {
        if (this.f8022a && this.f8024c <= 4) {
            String a = m5661a();
            Log.i(this.f8023b, a == null ? obj.toString() : a + " - " + obj);
            C1058c.m5786u();
        }
    }

    public final void m5666c(Object obj) {
        if (this.f8022a) {
            m5664b(obj);
        }
    }

    public final void m5668e(Object obj) {
        if (this.f8022a) {
            m5667d(obj);
        }
    }

    public final void m5665b(Throwable th) {
        if (this.f8022a) {
            m5663a(th);
        }
    }

    public final void m5670g(Object obj) {
        if (this.f8022a) {
            m5669f(obj);
        }
    }
}
