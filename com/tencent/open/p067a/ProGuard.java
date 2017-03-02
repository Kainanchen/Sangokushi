package com.tencent.open.p067a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.tencent.open.a.a */
public class ProGuard extends ProGuard implements Callback {
    private ProGuard f1605a;
    private FileWriter f1606b;
    private File f1607c;
    private char[] f1608d;
    private volatile ProGuard f1609e;
    private volatile ProGuard f1610f;
    private volatile ProGuard f1611g;
    private volatile ProGuard f1612h;
    private volatile boolean f1613i;
    private HandlerThread f1614j;
    private Handler f1615k;

    public ProGuard(ProGuard proGuard) {
        this(ProGuard.f1627b, true, ProGuard.f1650a, proGuard);
    }

    public ProGuard(int i, boolean z, ProGuard proGuard, ProGuard proGuard2) {
        super(i, z, proGuard);
        this.f1613i = false;
        m2079a(proGuard2);
        this.f1609e = new ProGuard();
        this.f1610f = new ProGuard();
        this.f1611g = this.f1609e;
        this.f1612h = this.f1610f;
        this.f1608d = new char[proGuard2.m2097d()];
        m2074g();
        this.f1614j = new HandlerThread(proGuard2.m2095c(), proGuard2.m2100f());
        if (this.f1614j != null) {
            this.f1614j.start();
        }
        if (this.f1614j.isAlive() && this.f1614j.getLooper() != null) {
            this.f1615k = new Handler(this.f1614j.getLooper(), this);
        }
    }

    public void m2077a() {
        if (this.f1615k.hasMessages(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT)) {
            this.f1615k.removeMessages(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        }
        this.f1615k.sendEmptyMessage(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
    }

    public void m2081b() {
        m2075h();
        this.f1614j.quit();
    }

    protected void m2078a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        m2080a(m2072e().m2130a(i, thread, j, str, str2, th));
    }

    protected void m2080a(String str) {
        this.f1611g.m2126a(str);
        if (this.f1611g.m2125a() >= m2082c().m2097d()) {
            m2077a();
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT /*1024*/:
                m2073f();
                break;
        }
        return true;
    }

    private void m2073f() {
        if (Thread.currentThread() == this.f1614j && !this.f1613i) {
            this.f1613i = true;
            m2076i();
            try {
                this.f1612h.m2127a(m2074g(), this.f1608d);
            } catch (IOException e) {
            } finally {
                this.f1612h.m2128b();
            }
            this.f1613i = false;
        }
    }

    private Writer m2074g() {
        File a = m2082c().m2086a();
        if (!(a == null || a.equals(this.f1607c)) || (this.f1606b == null && a != null)) {
            this.f1607c = a;
            m2075h();
            try {
                this.f1606b = new FileWriter(this.f1607c, true);
            } catch (IOException e) {
                return null;
            }
        }
        return this.f1606b;
    }

    private void m2075h() {
        try {
            if (this.f1606b != null) {
                this.f1606b.flush();
                this.f1606b.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void m2076i() {
        synchronized (this) {
            if (this.f1611g == this.f1609e) {
                this.f1611g = this.f1610f;
                this.f1612h = this.f1609e;
            } else {
                this.f1611g = this.f1609e;
                this.f1612h = this.f1610f;
            }
        }
    }

    public ProGuard m2082c() {
        return this.f1605a;
    }

    public void m2079a(ProGuard proGuard) {
        this.f1605a = proGuard;
    }
}
