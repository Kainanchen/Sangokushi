package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.sdk.sys.C0190a;
import com.tencent.connect.auth.AuthMap.Auth;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class AuthDialog extends Dialog {
    private String f1512a;
    private OnTimeListener f1513b;
    private IUiListener f1514c;
    private Handler f1515d;
    private FrameLayout f1516e;
    private LinearLayout f1517f;
    private FrameLayout f1518g;
    private ProgressBar f1519h;
    private String f1520i;
    private com.tencent.open.p066c.ProGuard f1521j;
    private Context f1522k;
    private com.tencent.open.web.security.ProGuard f1523l;
    private boolean f1524m;
    private int f1525n;
    private String f1526o;
    private String f1527p;
    private long f1528q;
    private long f1529r;
    private HashMap<String, Runnable> f1530s;

    /* renamed from: com.tencent.connect.auth.AuthDialog.1 */
    class ProGuard implements OnLongClickListener {
        final /* synthetic */ AuthDialog f1498a;

        ProGuard(AuthDialog authDialog) {
            this.f1498a = authDialog;
        }

        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* renamed from: com.tencent.connect.auth.AuthDialog.2 */
    class ProGuard implements OnTouchListener {
        final /* synthetic */ AuthDialog f1499a;

        ProGuard(AuthDialog authDialog) {
            this.f1499a = authDialog;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case StatAccount.DEFAULT_TYPE /*0*/:
                case StatConstants.XG_PRO_VERSION /*1*/:
                    if (!view.hasFocus()) {
                        view.requestFocus();
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.connect.auth.AuthDialog.3 */
    class ProGuard implements OnDismissListener {
        final /* synthetic */ AuthDialog f1500a;

        ProGuard(AuthDialog authDialog) {
            this.f1500a = authDialog;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            try {
                JniInterface.clearAllPWD();
            } catch (Exception e) {
            }
        }
    }

    /* compiled from: ProGuard */
    private class LoginWebViewClient extends WebViewClient {
        final /* synthetic */ AuthDialog f1502a;

        /* renamed from: com.tencent.connect.auth.AuthDialog.LoginWebViewClient.1 */
        class ProGuard implements Runnable {
            final /* synthetic */ LoginWebViewClient f1501a;

            ProGuard(LoginWebViewClient loginWebViewClient) {
                this.f1501a = loginWebViewClient;
            }

            public void run() {
                this.f1501a.f1502a.f1521j.loadUrl(this.f1501a.f1502a.f1526o);
            }
        }

        private LoginWebViewClient(AuthDialog authDialog) {
            this.f1502a = authDialog;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith(AuthConstants.REDIRECT_BROWSER_URI)) {
                JSONObject parseUrlToJson = Util.parseUrlToJson(str);
                this.f1502a.f1524m = this.f1502a.m1975e();
                if (!this.f1502a.f1524m) {
                    if (parseUrlToJson.optString("fail_cb", null) != null) {
                        this.f1502a.callJs(parseUrlToJson.optString("fail_cb"), Constants.STR_EMPTY);
                    } else if (parseUrlToJson.optInt("fall_to_wv") == 1) {
                        AuthDialog.m1960a(this.f1502a, this.f1502a.f1512a.indexOf("?") > -1 ? C0190a.f451b : "?");
                        AuthDialog.m1960a(this.f1502a, (Object) "browser_error=1");
                        this.f1502a.f1521j.loadUrl(this.f1502a.f1512a);
                    } else {
                        String optString = parseUrlToJson.optString("redir", null);
                        if (optString != null) {
                            this.f1502a.f1521j.loadUrl(optString);
                        }
                    }
                }
                return true;
            } else if (str.startsWith(ServerSetting.DEFAULT_REDIRECT_URI)) {
                this.f1502a.f1513b.onComplete(Util.parseUrlToJson(str));
                this.f1502a.dismiss();
                return true;
            } else if (str.startsWith(Constants.CANCEL_URI)) {
                this.f1502a.f1513b.onCancel();
                this.f1502a.dismiss();
                return true;
            } else if (str.startsWith(Constants.CLOSE_URI)) {
                this.f1502a.dismiss();
                return true;
            } else if (str.startsWith(Constants.DOWNLOAD_URI)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring(Constants.DOWNLOAD_URI.length()))));
                    intent.addFlags(268435456);
                    this.f1502a.f1522k.startActivity(intent);
                } catch (Throwable e) {
                    com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                }
                return true;
            } else if (str.startsWith(AuthConstants.PROGRESS_URI)) {
                try {
                    r0 = Uri.parse(str).getPathSegments();
                    if (r0.isEmpty()) {
                        return true;
                    }
                    int intValue = Integer.valueOf((String) r0.get(0)).intValue();
                    if (intValue == 0) {
                        this.f1502a.f1518g.setVisibility(8);
                        this.f1502a.f1521j.setVisibility(0);
                    } else if (intValue == 1) {
                        this.f1502a.f1518g.setVisibility(0);
                    }
                    return true;
                } catch (Exception e2) {
                    return true;
                }
            } else if (str.startsWith(AuthConstants.ON_LOGIN_URI)) {
                try {
                    r0 = Uri.parse(str).getPathSegments();
                    if (!r0.isEmpty()) {
                        this.f1502a.f1527p = (String) r0.get(0);
                    }
                } catch (Exception e3) {
                }
                return true;
            } else if (this.f1502a.f1523l.m2199a(this.f1502a.f1521j, str)) {
                return true;
            } else {
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            if (!Util.checkNetWork(this.f1502a.f1522k)) {
                this.f1502a.f1513b.onError(new UiError(9001, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\uff01", str2));
                this.f1502a.dismiss();
            } else if (this.f1502a.f1526o.startsWith(ServerSetting.DOWNLOAD_QQ_URL)) {
                this.f1502a.f1513b.onError(new UiError(i, str, str2));
                this.f1502a.dismiss();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1502a.f1528q;
                if (this.f1502a.f1525n >= 1 || elapsedRealtime >= this.f1502a.f1529r) {
                    this.f1502a.f1521j.loadUrl(this.f1502a.m1959a());
                    return;
                }
                this.f1502a.f1525n = this.f1502a.f1525n + 1;
                this.f1502a.f1515d.postDelayed(new ProGuard(this), 500);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            this.f1502a.f1518g.setVisibility(0);
            this.f1502a.f1528q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(this.f1502a.f1526o)) {
                this.f1502a.f1515d.removeCallbacks((Runnable) this.f1502a.f1530s.remove(this.f1502a.f1526o));
            }
            this.f1502a.f1526o = str;
            Runnable timeOutRunable = new TimeOutRunable(this.f1502a, this.f1502a.f1526o);
            this.f1502a.f1530s.put(str, timeOutRunable);
            this.f1502a.f1515d.postDelayed(timeOutRunable, 120000);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            this.f1502a.f1518g.setVisibility(8);
            if (this.f1502a.f1521j != null) {
                this.f1502a.f1521j.setVisibility(0);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f1502a.f1515d.removeCallbacks((Runnable) this.f1502a.f1530s.remove(str));
            }
        }

        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            this.f1502a.f1513b.onError(new UiError(sslError.getPrimaryError(), "\u8bf7\u6c42\u4e0d\u5408\u6cd5\uff0c\u8bf7\u68c0\u67e5\u624b\u673a\u5b89\u5168\u8bbe\u7f6e\uff0c\u5982\u7cfb\u7edf\u65f6\u95f4\u3001\u4ee3\u7406\u7b49\u3002", "ssl error"));
            this.f1502a.dismiss();
        }
    }

    /* compiled from: ProGuard */
    private class OnTimeListener implements IUiListener {
        String f1503a;
        String f1504b;
        final /* synthetic */ AuthDialog f1505c;
        private String f1506d;
        private IUiListener f1507e;

        public OnTimeListener(AuthDialog authDialog, String str, String str2, String str3, IUiListener iUiListener) {
            this.f1505c = authDialog;
            this.f1506d = str;
            this.f1503a = str2;
            this.f1504b = str3;
            this.f1507e = iUiListener;
        }

        private void m1956a(String str) {
            try {
                onComplete(Util.parseJson(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            com.tencent.open.p068b.ProGuard.m2156a().m2160a(this.f1506d + "_H5", SystemClock.elapsedRealtime(), 0, 0, jSONObject.optInt("ret", -6), this.f1503a, false);
            if (this.f1507e != null) {
                this.f1507e.onComplete(jSONObject);
                this.f1507e = null;
            }
        }

        public void onError(UiError uiError) {
            String str = uiError.errorMessage != null ? uiError.errorMessage + this.f1503a : this.f1503a;
            com.tencent.open.p068b.ProGuard.m2156a().m2160a(this.f1506d + "_H5", SystemClock.elapsedRealtime(), 0, 0, uiError.errorCode, str, false);
            this.f1505c.m1962a(str);
            if (this.f1507e != null) {
                this.f1507e.onError(uiError);
                this.f1507e = null;
            }
        }

        public void onCancel() {
            if (this.f1507e != null) {
                this.f1507e.onCancel();
                this.f1507e = null;
            }
        }
    }

    /* compiled from: ProGuard */
    private class THandler extends Handler {
        final /* synthetic */ AuthDialog f1508a;
        private OnTimeListener f1509b;

        public THandler(AuthDialog authDialog, OnTimeListener onTimeListener, Looper looper) {
            this.f1508a = authDialog;
            super(looper);
            this.f1509b = onTimeListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    this.f1509b.m1956a((String) message.obj);
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    this.f1509b.onCancel();
                case StatConstants.STAT_DB_VERSION /*3*/:
                    AuthDialog.m1967b(this.f1508a.f1522k, (String) message.obj);
                default:
            }
        }
    }

    /* compiled from: ProGuard */
    class TimeOutRunable implements Runnable {
        String f1510a;
        final /* synthetic */ AuthDialog f1511b;

        public TimeOutRunable(AuthDialog authDialog, String str) {
            this.f1511b = authDialog;
            this.f1510a = Constants.STR_EMPTY;
            this.f1510a = str;
        }

        public void run() {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f1510a + " | mRetryUrl: " + this.f1511b.f1526o);
            if (this.f1510a.equals(this.f1511b.f1526o)) {
                this.f1511b.f1513b.onError(new UiError(9002, "\u8bf7\u6c42\u9875\u9762\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\uff01", this.f1511b.f1526o));
                this.f1511b.dismiss();
            }
        }
    }

    static /* synthetic */ String m1960a(AuthDialog authDialog, Object obj) {
        String str = authDialog.f1512a + obj;
        authDialog.f1512a = str;
        return str;
    }

    static {
        try {
            Context context = Global.getContext();
            if (context == null) {
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
            } else if (new File(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                System.load(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->load lib success:" + AuthAgent.SECURE_LIB_NAME);
            } else {
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
            }
        } catch (Throwable e) {
            com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.AuthDialog", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, e);
        }
    }

    public AuthDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.f1524m = false;
        this.f1528q = 0;
        this.f1529r = 30000;
        this.f1522k = context;
        this.f1512a = str2;
        this.f1513b = new OnTimeListener(this, str, str2, qQToken.getAppId(), iUiListener);
        this.f1515d = new THandler(this, this.f1513b, context.getMainLooper());
        this.f1514c = iUiListener;
        this.f1520i = str;
        this.f1523l = new com.tencent.open.web.security.ProGuard();
        getWindow().setSoftInputMode(32);
    }

    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        m1966b();
        m1973d();
        this.f1530s = new HashMap();
    }

    public void onBackPressed() {
        if (!this.f1524m) {
            this.f1513b.onCancel();
        }
        super.onBackPressed();
    }

    protected void onStop() {
        super.onStop();
    }

    private String m1962a(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f1527p) && this.f1527p.length() >= 4) {
            stringBuilder.append("_u_").append(this.f1527p.substring(this.f1527p.length() - 4));
        }
        return stringBuilder.toString();
    }

    private String m1959a() {
        String str = ServerSetting.DOWNLOAD_QQ_URL + this.f1512a.substring(this.f1512a.indexOf("?") + 1);
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: http://qzs.qq.com/open/mobile/login/qzsjump.html?");
        return str;
    }

    private void m1966b() {
        m1970c();
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f1521j = new com.tencent.open.p066c.ProGuard(this.f1522k);
        this.f1521j.setLayoutParams(layoutParams);
        this.f1516e = new FrameLayout(this.f1522k);
        layoutParams.gravity = 17;
        this.f1516e.setLayoutParams(layoutParams);
        this.f1516e.addView(this.f1521j);
        this.f1516e.addView(this.f1518g);
        setContentView(this.f1516e);
    }

    private void m1970c() {
        LayoutParams layoutParams;
        this.f1519h = new ProgressBar(this.f1522k);
        this.f1519h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f1517f = new LinearLayout(this.f1522k);
        View view = null;
        if (this.f1520i.equals(SystemUtils.ACTION_LOGIN)) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            view = new TextView(this.f1522k);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                view.setText("\u767b\u5f55\u4e2d...");
            } else {
                view.setText("Logging in...");
            }
            view.setTextColor(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK));
            view.setTextSize(18.0f);
            view.setLayoutParams(layoutParams);
        }
        layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1517f.setLayoutParams(layoutParams);
        this.f1517f.addView(this.f1519h);
        if (view != null) {
            this.f1517f.addView(view);
        }
        this.f1518g = new FrameLayout(this.f1522k);
        LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = 80;
        layoutParams2.rightMargin = 80;
        layoutParams2.topMargin = 40;
        layoutParams2.bottomMargin = 40;
        layoutParams2.gravity = 17;
        this.f1518g.setLayoutParams(layoutParams2);
        this.f1518g.setBackgroundResource(17301504);
        this.f1518g.addView(this.f1517f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void m1973d() {
        this.f1521j.setVerticalScrollBarEnabled(false);
        this.f1521j.setHorizontalScrollBarEnabled(false);
        this.f1521j.setWebViewClient(new LoginWebViewClient());
        this.f1521j.setWebChromeClient(new WebChromeClient());
        this.f1521j.clearFormData();
        this.f1521j.clearSslPreferences();
        this.f1521j.setOnLongClickListener(new ProGuard(this));
        this.f1521j.setOnTouchListener(new ProGuard(this));
        WebSettings settings = this.f1521j.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.f1522k.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f1512a);
        this.f1526o = this.f1512a;
        this.f1521j.loadUrl(this.f1512a);
        this.f1521j.setVisibility(4);
        this.f1521j.getSettings().setSavePassword(false);
        this.f1523l.m2131a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new ProGuard(this));
    }

    private boolean m1975e() {
        AuthMap instance = AuthMap.getInstance();
        String makeKey = instance.makeKey();
        Auth auth = new Auth();
        auth.listener = this.f1514c;
        auth.dialog = this;
        auth.key = makeKey;
        String str = instance.set(auth);
        String substring = this.f1512a.substring(0, this.f1512a.indexOf("?"));
        Bundle parseUrl = Util.parseUrl(this.f1512a);
        parseUrl.putString("token_key", makeKey);
        parseUrl.putString("serial", str);
        parseUrl.putString("browser", Constants.VIA_TO_TYPE_QQ_GROUP);
        this.f1512a = substring + "?" + Util.encodeUrl(parseUrl);
        return Util.openBrowser(this.f1522k, this.f1512a);
    }

    private static void m1967b(Context context, String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt(SocialConstants.PARAM_TYPE);
            Toast.makeText(context.getApplicationContext(), parseJson.getString(SocialConstants.PARAM_SEND_MSG), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void callJs(String str, String str2) {
        this.f1521j.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
    }

    public void dismiss() {
        this.f1530s.clear();
        this.f1515d.removeCallbacksAndMessages(null);
        if (isShowing()) {
            super.dismiss();
        }
        if (this.f1521j != null) {
            this.f1521j.destroy();
            this.f1521j = null;
        }
    }
}
