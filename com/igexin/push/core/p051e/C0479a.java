package com.igexin.push.core.p051e;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;

/* renamed from: com.igexin.push.core.e.a */
public abstract class C0479a {
    protected Long f1270a;
    protected Activity f1271b;
    protected String f1272c;

    public C0479a() {
        this.f1270a = Long.valueOf(System.currentTimeMillis());
    }

    public Long m1672a() {
        return this.f1270a;
    }

    public void m1673a(Activity activity) {
        this.f1271b = activity;
    }

    public abstract void m1674a(Intent intent);

    public abstract void m1675a(Configuration configuration);

    public void m1676a(Long l) {
        this.f1270a = l;
    }

    public void m1677a(String str) {
        this.f1272c = str;
    }

    public abstract boolean m1678a(int i, KeyEvent keyEvent);

    public abstract boolean m1679a(Menu menu);

    public String m1680b() {
        return this.f1272c;
    }

    public abstract void m1681c();

    public abstract void m1682d();

    public abstract void m1683e();

    public abstract void m1684f();

    public abstract void m1685g();

    public abstract void m1686h();

    public abstract void m1687i();
}
