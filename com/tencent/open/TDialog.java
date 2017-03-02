package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.auth.AuthConstants;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.Util;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class TDialog extends ProGuard {
    static final LayoutParams f1587a;
    static Toast f1588b;
    private static WeakReference<ProgressDialog> f1589d;
    private WeakReference<Context> f1590c;
    private String f1591e;
    private OnTimeListener f1592f;
    private IUiListener f1593g;
    private FrameLayout f1594h;
    private com.tencent.open.p066c.ProGuard f1595i;
    private Handler f1596j;
    private boolean f1597k;
    private QQToken f1598l;

    /* compiled from: ProGuard */
    private class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(ServerSetting.getInstance().getEnvUrl((Context) TDialog.this.f1590c.get(), ServerSetting.DEFAULT_REDIRECT_URI))) {
                TDialog.this.f1592f.onComplete(Util.parseUrlToJson(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (str.startsWith(Constants.CANCEL_URI)) {
                TDialog.this.f1592f.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (str.startsWith(Constants.CLOSE_URI)) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            } else if (str.startsWith(Constants.DOWNLOAD_URI)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring(Constants.DOWNLOAD_URI.length()))));
                intent.addFlags(268435456);
                if (!(TDialog.this.f1590c == null || TDialog.this.f1590c.get() == null)) {
                    ((Context) TDialog.this.f1590c.get()).startActivity(intent);
                }
                return true;
            } else if (str.startsWith(AuthConstants.PROGRESS_URI)) {
                return true;
            } else {
                return false;
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TDialog.this.f1592f.onError(new UiError(i, str, str2));
            if (!(TDialog.this.f1590c == null || TDialog.this.f1590c.get() == null)) {
                Toast.makeText((Context) TDialog.this.f1590c.get(), "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\u6216\u7cfb\u7edf\u9519\u8bef", 0).show();
            }
            TDialog.this.dismiss();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TDialog.this.f1595i.setVisibility(0);
        }
    }

    /* compiled from: ProGuard */
    private class JsListener extends com.tencent.open.ProGuard.ProGuard {
        private JsListener() {
        }

        public void onAddShare(String str) {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onCancelAddShare(String str) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelLogin() {
            onCancel(Constants.STR_EMPTY);
        }

        public void onCancelInvite() {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel(Constants.STR_EMPTY);
        }

        public void onComplete(String str) {
            TDialog.this.f1596j.obtainMessage(1, str).sendToTarget();
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onCancel(String str) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.f1596j.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void showMsg(String str) {
            TDialog.this.f1596j.obtainMessage(3, str).sendToTarget();
        }

        public void onLoad(String str) {
            TDialog.this.f1596j.obtainMessage(4, str).sendToTarget();
        }
    }

    /* compiled from: ProGuard */
    private static class OnTimeListener implements IUiListener {
        private String mAction;
        String mAppid;
        String mUrl;
        private WeakReference<Context> mWeakCtx;
        private IUiListener mWeakL;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.mWeakCtx = new WeakReference(context);
            this.mAction = str;
            this.mUrl = str2;
            this.mAppid = str3;
            this.mWeakL = iUiListener;
        }

        private void onComplete(String str) {
            try {
                onComplete(Util.parseJson(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            com.tencent.open.p068b.ProGuard.m2156a().m2160a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0, 0, jSONObject.optInt("ret", -6), this.mUrl, false);
            if (this.mWeakL != null) {
                this.mWeakL.onComplete(jSONObject);
                this.mWeakL = null;
            }
        }

        public void onError(UiError uiError) {
            com.tencent.open.p068b.ProGuard.m2156a().m2160a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0, 0, uiError.errorCode, uiError.errorMessage != null ? uiError.errorMessage + this.mUrl : this.mUrl, false);
            if (this.mWeakL != null) {
                this.mWeakL.onError(uiError);
                this.mWeakL = null;
            }
        }

        public void onCancel() {
            if (this.mWeakL != null) {
                this.mWeakL.onCancel();
                this.mWeakL = null;
            }
        }
    }

    /* compiled from: ProGuard */
    private class THandler extends Handler {
        private OnTimeListener mL;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.mL = onTimeListener;
        }

        public void handleMessage(Message message) {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            switch (message.what) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    this.mL.onComplete((String) message.obj);
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    this.mL.onCancel();
                case StatConstants.STAT_DB_VERSION /*3*/:
                    if (TDialog.this.f1590c != null && TDialog.this.f1590c.get() != null) {
                        TDialog.m2060c((Context) TDialog.this.f1590c.get(), (String) message.obj);
                    }
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    if (TDialog.this.f1590c != null && TDialog.this.f1590c.get() != null) {
                        TDialog.m2062d((Context) TDialog.this.f1590c.get(), (String) message.obj);
                    }
                default:
            }
        }
    }

    static {
        f1587a = new LayoutParams(-1, -1);
        f1588b = null;
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.f1597k = false;
        this.f1598l = null;
        this.f1590c = new WeakReference(context);
        this.f1591e = str2;
        this.f1592f = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f1596j = new THandler(this.f1592f, context.getMainLooper());
        this.f1593g = iUiListener;
        this.f1598l = qQToken;
    }

    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        m2054a();
        m2057b();
    }

    public void onBackPressed() {
        if (this.f1592f != null) {
            this.f1592f.onCancel();
        }
        super.onBackPressed();
    }

    private void m2054a() {
        new TextView((Context) this.f1590c.get()).setText("test");
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f1595i = new com.tencent.open.p066c.ProGuard((Context) this.f1590c.get());
        this.f1595i.setLayoutParams(layoutParams);
        this.f1594h = new FrameLayout((Context) this.f1590c.get());
        layoutParams.gravity = 17;
        this.f1594h.setLayoutParams(layoutParams);
        this.f1594h.addView(this.f1595i);
        setContentView(this.f1594h);
    }

    protected void onConsoleMessage(String str) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.jsBridge.m2133a(this.f1595i, str);
        } catch (Exception e) {
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void m2057b() {
        this.f1595i.setVerticalScrollBarEnabled(false);
        this.f1595i.setHorizontalScrollBarEnabled(false);
        this.f1595i.setWebViewClient(new FbWebViewClient());
        this.f1595i.setWebChromeClient(this.mChromeClient);
        this.f1595i.clearFormData();
        WebSettings settings = this.f1595i.getSettings();
        if (settings != null) {
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(RenderPriority.HIGH);
            settings.setJavaScriptEnabled(true);
            if (!(this.f1590c == null || this.f1590c.get() == null)) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(((Context) this.f1590c.get()).getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.jsBridge.m2131a(new JsListener(), "sdk_js_if");
            this.f1595i.loadUrl(this.f1591e);
            this.f1595i.setLayoutParams(f1587a);
            this.f1595i.setVisibility(4);
            this.f1595i.getSettings().setSavePassword(false);
        }
    }

    private static void m2060c(Context context, String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt(SocialConstants.PARAM_TYPE);
            CharSequence string = parseJson.getString(SocialConstants.PARAM_SEND_MSG);
            if (i == 0) {
                if (f1588b == null) {
                    f1588b = Toast.makeText(context, string, 0);
                } else {
                    f1588b.setView(f1588b.getView());
                    f1588b.setText(string);
                    f1588b.setDuration(0);
                }
                f1588b.show();
            } else if (i == 1) {
                if (f1588b == null) {
                    f1588b = Toast.makeText(context, string, 1);
                } else {
                    f1588b.setView(f1588b.getView());
                    f1588b.setText(string);
                    f1588b.setDuration(1);
                }
                f1588b.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void m2062d(Context context, String str) {
        if (context != null && str != null) {
            try {
                JSONObject parseJson = Util.parseJson(str);
                int i = parseJson.getInt(AuthActivity.ACTION_KEY);
                CharSequence string = parseJson.getString(SocialConstants.PARAM_SEND_MSG);
                if (i == 1) {
                    if (f1589d == null || f1589d.get() == null) {
                        ProgressDialog progressDialog = new ProgressDialog(context);
                        progressDialog.setMessage(string);
                        f1589d = new WeakReference(progressDialog);
                        progressDialog.show();
                        return;
                    }
                    ((ProgressDialog) f1589d.get()).setMessage(string);
                    if (!((ProgressDialog) f1589d.get()).isShowing()) {
                        ((ProgressDialog) f1589d.get()).show();
                    }
                } else if (i == 0 && f1589d != null && f1589d.get() != null && ((ProgressDialog) f1589d.get()).isShowing()) {
                    ((ProgressDialog) f1589d.get()).dismiss();
                    f1589d = null;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
