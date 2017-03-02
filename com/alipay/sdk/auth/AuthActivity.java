package com.alipay.sdk.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.alipay.sdk.authjs.C0161a;
import com.alipay.sdk.authjs.C0161a.C0160a;
import com.alipay.sdk.authjs.C0162c;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.util.C0206l;
import com.alipay.sdk.util.C0206l.C0205a;
import com.alipay.sdk.widget.C0210a;
import com.android.volley.DefaultRetryPolicy;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
public class AuthActivity extends Activity {
    static final String f283a = "params";
    static final String f284b = "redirectUri";
    private WebView f285c;
    private String f286d;
    private C0210a f287e;
    private Handler f288f;
    private boolean f289g;
    private boolean f290h;
    private Runnable f291i;

    /* renamed from: com.alipay.sdk.auth.AuthActivity.a */
    private class C0147a extends WebChromeClient {
        final /* synthetic */ AuthActivity f281a;

        private C0147a(AuthActivity authActivity) {
            this.f281a = authActivity;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message)) {
                return super.onConsoleMessage(consoleMessage);
            }
            Object obj = null;
            if (message.startsWith("h5container.message: ")) {
                obj = message.replaceFirst("h5container.message: ", Constants.STR_EMPTY);
            }
            if (TextUtils.isEmpty(obj)) {
                return super.onConsoleMessage(consoleMessage);
            }
            AuthActivity.m425b(this.f281a, obj);
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* renamed from: com.alipay.sdk.auth.AuthActivity.b */
    private class C0148b extends WebViewClient {
        final /* synthetic */ AuthActivity f282a;

        private C0148b(AuthActivity authActivity) {
            this.f282a = authActivity;
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            this.f282a.f290h = true;
            super.onReceivedError(webView, i, str, str2);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.f282a.f289g) {
                sslErrorHandler.proceed();
                this.f282a.f289g = false;
                return;
            }
            this.f282a.runOnUiThread(new C0154e(this, sslErrorHandler));
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.toLowerCase().startsWith(C0165a.f342h.toLowerCase()) || str.toLowerCase().startsWith(C0165a.f343i.toLowerCase())) {
                try {
                    C0205a a = C0206l.m675a(this.f282a, C0206l.f524b);
                    if (a == null || a.m673a()) {
                        return true;
                    }
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst(C0165a.f343i, C0165a.f342h);
                    }
                    this.f282a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (Throwable th) {
                    return true;
                }
            } else if (!AuthActivity.m421a(this.f282a, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            } else {
                webView.stopLoading();
                return true;
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AuthActivity.m429d(this.f282a);
            this.f282a.f288f.postDelayed(this.f282a.f291i, 30000);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onPageFinished(WebView webView, String str) {
            AuthActivity.m432g(this.f282a);
            this.f282a.f288f.removeCallbacks(this.f282a.f291i);
        }
    }

    public AuthActivity() {
        this.f291i = new C0153d(this);
    }

    static /* synthetic */ void m418a(AuthActivity authActivity, C0161a c0161a) {
        if (authActivity.f285c != null && c0161a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0161a.f319e, c0161a.f323i);
                jSONObject.put(C0161a.f321g, c0161a.f325k);
                jSONObject.put(C0161a.f320f, c0161a.f327m);
                jSONObject.put(C0161a.f322h, c0161a.f326l);
                authActivity.runOnUiThread(new C0152c(authActivity, String.format("AlipayJSBridge._invokeJS(%s)", new Object[]{jSONObject.toString()})));
            } catch (JSONException e) {
            }
        }
    }

    static /* synthetic */ boolean m421a(AuthActivity authActivity, String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        if (!"SDKLite://h5quit".equalsIgnoreCase(str)) {
            if (TextUtils.equals(str, authActivity.f286d)) {
                str = str + "?resultCode=150";
            }
            C0157h.m439a((Activity) authActivity, str);
        }
        authActivity.finish();
        return true;
    }

    static /* synthetic */ void m425b(AuthActivity authActivity, String str) {
        String str2;
        C0162c c0162c = new C0162c(authActivity.getApplicationContext(), new C0151b(authActivity));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C0161a.f319e);
            try {
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C0161a.f320f);
                    jSONObject2 = jSONObject2 instanceof JSONObject ? jSONObject2 : null;
                    String string2 = jSONObject.getString(C0161a.f321g);
                    String string3 = jSONObject.getString(C0161a.f318d);
                    C0161a c0161a = new C0161a(C0161a.f316b);
                    c0161a.f324j = string3;
                    c0161a.f325k = string2;
                    c0161a.f327m = jSONObject2;
                    c0161a.f323i = string;
                    c0162c.m467a(c0161a);
                }
            } catch (Exception e) {
                str2 = string;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        c0162c.m468a(str2, C0160a.f312d);
                    } catch (JSONException e2) {
                    }
                }
            }
        } catch (Exception e3) {
            str2 = null;
            if (!TextUtils.isEmpty(str2)) {
                c0162c.m468a(str2, C0160a.f312d);
            }
        }
    }

    static /* synthetic */ void m429d(AuthActivity authActivity) {
        try {
            if (authActivity.f287e == null) {
                authActivity.f287e = new C0210a(authActivity, C0210a.f530a);
            }
            authActivity.f287e.m712a();
        } catch (Exception e) {
            authActivity.f287e = null;
        }
    }

    static /* synthetic */ void m432g(AuthActivity authActivity) {
        if (authActivity.f287e != null) {
            authActivity.f287e.m713b();
        }
        authActivity.f287e = null;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            try {
                this.f286d = extras.getString(f284b);
                String string = extras.getString(f283a);
                if (C0206l.m687b(string)) {
                    Method method;
                    super.requestWindowFeature(1);
                    this.f288f = new Handler(getMainLooper());
                    View linearLayout = new LinearLayout(this);
                    LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    linearLayout.setOrientation(1);
                    setContentView(linearLayout, layoutParams);
                    this.f285c = new WebView(this);
                    layoutParams.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                    this.f285c.setVisibility(0);
                    linearLayout.addView(this.f285c, layoutParams);
                    WebSettings settings = this.f285c.getSettings();
                    settings.setUserAgentString(settings.getUserAgentString() + C0206l.m693d(getApplicationContext()));
                    settings.setRenderPriority(RenderPriority.HIGH);
                    settings.setSupportMultipleWindows(true);
                    settings.setJavaScriptEnabled(true);
                    settings.setSavePassword(false);
                    settings.setJavaScriptCanOpenWindowsAutomatically(true);
                    settings.setMinimumFontSize(settings.getMinimumFontSize() + 8);
                    settings.setAllowFileAccess(false);
                    settings.setTextSize(TextSize.NORMAL);
                    this.f285c.setVerticalScrollbarOverlay(true);
                    this.f285c.setWebViewClient(new C0148b());
                    this.f285c.setWebChromeClient(new C0147a());
                    this.f285c.setDownloadListener(new C0149a(this));
                    this.f285c.loadUrl(string);
                    if (VERSION.SDK_INT >= 7) {
                        try {
                            method = this.f285c.getSettings().getClass().getMethod("setDomStorageEnabled", new Class[]{Boolean.TYPE});
                            if (method != null) {
                                method.invoke(this.f285c.getSettings(), new Object[]{Boolean.valueOf(true)});
                            }
                        } catch (Exception e) {
                        }
                    }
                    try {
                        this.f285c.removeJavascriptInterface("searchBoxJavaBridge_");
                        this.f285c.removeJavascriptInterface("accessibility");
                        this.f285c.removeJavascriptInterface("accessibilityTraversal");
                    } catch (Throwable th) {
                    }
                    if (VERSION.SDK_INT >= 19) {
                        this.f285c.getSettings().setCacheMode(1);
                        return;
                    }
                    return;
                }
                finish();
            } catch (Exception e2) {
                finish();
            }
        } catch (Exception e3) {
            finish();
        }
    }

    public void onBackPressed() {
        if (!this.f285c.canGoBack()) {
            C0157h.m439a((Activity) this, this.f286d + "?resultCode=150");
            finish();
        } else if (this.f290h) {
            C0157h.m439a((Activity) this, this.f286d + "?resultCode=150");
            finish();
        }
    }

    private boolean m423a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        if (!"SDKLite://h5quit".equalsIgnoreCase(str)) {
            if (TextUtils.equals(str, this.f286d)) {
                str = str + "?resultCode=150";
            }
            C0157h.m439a((Activity) this, str);
        }
        finish();
        return true;
    }

    private void m426b(String str) {
        String str2;
        C0162c c0162c = new C0162c(getApplicationContext(), new C0151b(this));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C0161a.f319e);
            try {
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C0161a.f320f);
                    jSONObject2 = jSONObject2 instanceof JSONObject ? jSONObject2 : null;
                    String string2 = jSONObject.getString(C0161a.f321g);
                    String string3 = jSONObject.getString(C0161a.f318d);
                    C0161a c0161a = new C0161a(C0161a.f316b);
                    c0161a.f324j = string3;
                    c0161a.f325k = string2;
                    c0161a.f327m = jSONObject2;
                    c0161a.f323i = string;
                    c0162c.m467a(c0161a);
                }
            } catch (Exception e) {
                str2 = string;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        c0162c.m468a(str2, C0160a.f312d);
                    } catch (JSONException e2) {
                    }
                }
            }
        } catch (Exception e3) {
            str2 = null;
            if (!TextUtils.isEmpty(str2)) {
                c0162c.m468a(str2, C0160a.f312d);
            }
        }
    }

    private void m419a(C0161a c0161a) {
        if (this.f285c != null && c0161a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0161a.f319e, c0161a.f323i);
                jSONObject.put(C0161a.f321g, c0161a.f325k);
                jSONObject.put(C0161a.f320f, c0161a.f327m);
                jSONObject.put(C0161a.f322h, c0161a.f326l);
                runOnUiThread(new C0152c(this, String.format("AlipayJSBridge._invokeJS(%s)", new Object[]{jSONObject.toString()})));
            } catch (JSONException e) {
            }
        }
    }

    private void m417a() {
        try {
            if (this.f287e == null) {
                this.f287e = new C0210a(this, C0210a.f530a);
            }
            this.f287e.m712a();
        } catch (Exception e) {
            this.f287e = null;
        }
    }

    private void m424b() {
        if (this.f287e != null) {
            this.f287e.m713b();
        }
        this.f287e = null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f285c != null) {
            this.f285c.removeAllViews();
            try {
                this.f285c.destroy();
            } catch (Throwable th) {
            }
            this.f285c = null;
        }
    }
}
