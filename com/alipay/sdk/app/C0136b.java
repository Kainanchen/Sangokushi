package com.alipay.sdk.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.util.C0206l;
import com.alipay.sdk.widget.C0210a;

/* renamed from: com.alipay.sdk.app.b */
public final class C0136b extends WebViewClient {
    boolean f207a;
    private Activity f208b;
    private boolean f209c;
    private Handler f210d;
    private C0210a f211e;
    private Runnable f212f;

    public C0136b(Activity activity) {
        this.f212f = new C0140f(this);
        this.f208b = activity;
        this.f210d = new Handler(this.f208b.getMainLooper());
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f207a = true;
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C0144a.m398a(C0146c.f241a, C0146c.f257q, "\u8bc1\u4e66\u9519\u8bef");
        if (this.f209c) {
            sslErrorHandler.proceed();
            this.f209c = false;
            return;
        }
        this.f208b.runOnUiThread(new C0137c(this, sslErrorHandler));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return C0206l.m682a(webView, str, this.f208b);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f211e == null) {
            this.f211e = new C0210a(this.f208b, C0210a.f530a);
        }
        this.f211e.m712a();
        this.f210d.postDelayed(this.f212f, 30000);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onPageFinished(WebView webView, String str) {
        m381b();
        this.f210d.removeCallbacks(this.f212f);
    }

    private void m379a() {
        if (this.f211e == null) {
            this.f211e = new C0210a(this.f208b, C0210a.f530a);
        }
        this.f211e.m712a();
    }

    private void m381b() {
        if (this.f211e != null) {
            this.f211e.m713b();
        }
        this.f211e = null;
    }

    private boolean m383c() {
        return this.f207a;
    }
}
