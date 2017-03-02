package com.onevcat.uniwebview;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.Editable;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.alipay.sdk.util.C0201h;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;

public class UniWebViewDialog extends Dialog {
    private AlertDialog _alertDialog;
    private boolean _backButtonEnable;
    private int _bottom;
    private FrameLayout _content;
    private String _currentUrl;
    private String _currentUserAgent;
    private boolean _isLoading;
    private int _left;
    private DialogListener _listener;
    private boolean _loadingInterrupted;
    private boolean _manualHide;
    private int _right;
    private boolean _showSpinnerWhenLoading;
    private ProgressDialog _spinner;
    private String _spinnerText;
    private int _top;
    private boolean _transparent;
    private UniWebView _uniWebView;
    public ArrayList<String> schemes;

    public interface DialogListener {
        void onDialogClose(UniWebViewDialog uniWebViewDialog);

        void onDialogKeyDown(UniWebViewDialog uniWebViewDialog, int i);

        void onDialogShouldCloseByBackButton(UniWebViewDialog uniWebViewDialog);

        void onJavaScriptFinished(UniWebViewDialog uniWebViewDialog, String str);

        void onPageFinished(UniWebViewDialog uniWebViewDialog, String str);

        void onPageStarted(UniWebViewDialog uniWebViewDialog, String str);

        void onReceivedError(UniWebViewDialog uniWebViewDialog, int i, String str, String str2);

        boolean shouldOverrideUrlLoading(UniWebViewDialog uniWebViewDialog, String str);
    }

    /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.1 */
    class C05551 implements OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View val$decorView;
        final /* synthetic */ int val$finalUiOptions;

        C05551(View view, int i) {
            this.val$decorView = view;
            this.val$finalUiOptions = i;
        }

        public void onSystemUiVisibilityChange(int i) {
            this.val$decorView.setSystemUiVisibility(this.val$finalUiOptions);
        }
    }

    /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.2 */
    class C05562 extends WebViewClient {
        C05562() {
        }

        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Log.d("UniWebView", "Start Loading URL: " + url);
            super.onPageStarted(view, url, favicon);
            if (UniWebViewDialog.this._showSpinnerWhenLoading && UniWebViewDialog.this.isShowing()) {
                UniWebViewDialog.this.showSpinner();
            }
            UniWebViewDialog.this._isLoading = true;
            UniWebViewDialog.this._listener.onPageStarted(UniWebViewDialog.this, url);
            UniWebViewDialog.this.HideSystemUI();
        }

        public void onPageFinished(WebView view, String url) {
            UniWebViewDialog.this._spinner.hide();
            UniWebViewDialog.this._currentUrl = url;
            UniWebViewDialog.this._currentUserAgent = UniWebViewDialog.this._uniWebView.getSettings().getUserAgentString();
            UniWebViewDialog.this._listener.onPageFinished(UniWebViewDialog.this, url);
            UniWebViewDialog.this._isLoading = false;
            UniWebViewDialog.this._uniWebView.updateTransparent(UniWebViewDialog.this._transparent);
            UniWebViewDialog.this.HideSystemUI();
        }

        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            UniWebViewDialog.this.HideSystemUI();
            UniWebViewDialog.this._spinner.hide();
            UniWebViewDialog.this._currentUrl = failingUrl;
            UniWebViewDialog.this._currentUserAgent = UniWebViewDialog.this._uniWebView.getSettings().getUserAgentString();
            UniWebViewDialog.this._listener.onReceivedError(UniWebViewDialog.this, errorCode, description, failingUrl);
            UniWebViewDialog.this._isLoading = false;
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("UniWebView", "shouldOverrideUrlLoading: " + url);
            return UniWebViewDialog.this._listener.shouldOverrideUrlLoading(UniWebViewDialog.this, url);
        }

        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Log.d("UniWebView", "onReceivedSslError: " + error.toString());
            handler.proceed();
        }
    }

    /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3 */
    class C05623 extends UniWebChromeClient {

        /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3.1 */
        class C05571 implements OnClickListener {
            final /* synthetic */ JsResult val$result;

            C05571(JsResult jsResult) {
                this.val$result = jsResult;
            }

            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                this.val$result.confirm();
                UniWebViewDialog.this._alertDialog = null;
            }
        }

        /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3.2 */
        class C05582 implements OnClickListener {
            final /* synthetic */ JsResult val$result;

            C05582(JsResult jsResult) {
                this.val$result = jsResult;
            }

            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                this.val$result.cancel();
                UniWebViewDialog.this._alertDialog = null;
            }
        }

        /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3.3 */
        class C05593 implements OnClickListener {
            final /* synthetic */ JsResult val$result;

            C05593(JsResult jsResult) {
                this.val$result = jsResult;
            }

            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
                this.val$result.confirm();
                UniWebViewDialog.this._alertDialog = null;
            }
        }

        /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3.4 */
        class C05604 implements OnClickListener {
            final /* synthetic */ EditText val$input;
            final /* synthetic */ JsPromptResult val$result;

            C05604(EditText editText, JsPromptResult jsPromptResult) {
                this.val$input = editText;
                this.val$result = jsPromptResult;
            }

            public void onClick(DialogInterface dialog, int whichButton) {
                Editable editable = this.val$input.getText();
                String value = Constants.STR_EMPTY;
                if (editable != null) {
                    value = editable.toString();
                }
                dialog.dismiss();
                this.val$result.confirm(value);
                UniWebViewDialog.this._alertDialog = null;
            }
        }

        /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.3.5 */
        class C05615 implements OnClickListener {
            final /* synthetic */ JsPromptResult val$result;

            C05615(JsPromptResult jsPromptResult) {
                this.val$result = jsPromptResult;
            }

            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
                this.val$result.cancel();
                UniWebViewDialog.this._alertDialog = null;
            }
        }

        C05623(FrameLayout oriLayout) {
            super(oriLayout);
        }

        public void openFileChooser(ValueCallback<Uri> uploadMsg) {
            AndroidPlugin.setUploadMessage(uploadMsg);
            Intent i = new Intent("android.intent.action.GET_CONTENT");
            i.addCategory("android.intent.category.OPENABLE");
            i.setType("image/*");
            AndroidPlugin.getUnityActivity_().startActivityForResult(Intent.createChooser(i, "File Chooser"), 1);
        }

        public void openFileChooser(ValueCallback uploadMsg, String acceptType) {
            AndroidPlugin.setUploadMessage(uploadMsg);
            Intent i = new Intent("android.intent.action.GET_CONTENT");
            i.addCategory("android.intent.category.OPENABLE");
            i.setType("*/*");
            AndroidPlugin.getUnityActivity_().startActivityForResult(Intent.createChooser(i, "File Browser"), 1);
        }

        public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
            AndroidPlugin.setUploadMessage(uploadMsg);
            Intent i = new Intent("android.intent.action.GET_CONTENT");
            i.addCategory("android.intent.category.OPENABLE");
            i.setType("image/*");
            AndroidPlugin.getUnityActivity_().startActivityForResult(Intent.createChooser(i, "File Chooser"), 1);
        }

        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            UniWebViewDialog.this._alertDialog = new Builder(UniWebViewDialog.this.getContext()).setTitle(url).setMessage(message).setCancelable(false).setIcon(17301543).setPositiveButton(17039370, new C05571(result)).create();
            if (VERSION.SDK_INT >= 19) {
                UniWebViewDialog.this._alertDialog.getWindow().setFlags(8, 8);
                UniWebViewDialog.this._alertDialog.show();
                UniWebViewDialog.this._alertDialog.getWindow().getDecorView().setSystemUiVisibility(UniWebViewDialog.this.getWindow().getDecorView().getSystemUiVisibility());
                UniWebViewDialog.this._alertDialog.getWindow().clearFlags(8);
            } else {
                UniWebViewDialog.this._alertDialog.show();
            }
            return true;
        }

        public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
            UniWebViewDialog.this._alertDialog = new Builder(UniWebViewDialog.this.getContext()).setTitle(url).setMessage(message).setIcon(17301659).setCancelable(false).setPositiveButton(17039379, new C05593(result)).setNegativeButton(17039369, new C05582(result)).show();
            return true;
        }

        public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
            Builder alertDialogBuilder = new Builder(UniWebViewDialog.this.getContext());
            alertDialogBuilder.setTitle(url).setMessage(message).setIcon(17301659).setCancelable(false);
            EditText input = new EditText(UniWebViewDialog.this.getContext());
            input.setSingleLine();
            alertDialogBuilder.setView(input);
            alertDialogBuilder.setPositiveButton(17039379, new C05604(input, result));
            alertDialogBuilder.setNegativeButton(17039369, new C05615(result));
            UniWebViewDialog.this._alertDialog = alertDialogBuilder.show();
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String origin, Callback callback) {
            callback.invoke(origin, true, false);
        }
    }

    /* renamed from: com.onevcat.uniwebview.UniWebViewDialog.4 */
    class C05634 implements DownloadListener {
        C05634() {
        }

        public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
            Intent i = new Intent("android.intent.action.VIEW");
            i.setData(Uri.parse(url));
            AndroidPlugin.getUnityActivity_().startActivity(i);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("UniWebView", "onKeyDown " + event);
        this._listener.onDialogKeyDown(this, keyCode);
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        if (!this._backButtonEnable || goBack()) {
            return true;
        }
        this._listener.onDialogShouldCloseByBackButton(this);
        return true;
    }

    @SuppressLint({"NewApi"})
    public UniWebViewDialog(Context context, DialogListener listener) {
        super(context, 16973932);
        this._showSpinnerWhenLoading = true;
        this._spinnerText = "Loading...";
        this._currentUrl = Constants.STR_EMPTY;
        this._backButtonEnable = true;
        this._listener = listener;
        this.schemes = new ArrayList();
        this.schemes.add("uniwebview");
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.addFlags(32);
        window.setSoftInputMode(16);
        if (VERSION.SDK_INT < 16) {
            window.addFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        } else {
            HideSystemUI();
        }
        createContent();
        createWebView();
        createSpinner();
        addContentView(this._content, new LayoutParams(-1, -1));
        this._content.addView(this._uniWebView);
        Log.d("UniWebView", "Create a new UniWebView Dialog");
    }

    @SuppressLint({"NewApi"})
    public void HideSystemUI() {
        if (VERSION.SDK_INT >= 16) {
            int uiOptions;
            int updatedUIOptions;
            View decorView = getWindow().getDecorView();
            if (VERSION.SDK_INT >= 19) {
                uiOptions = 3846;
            } else {
                uiOptions = 4;
            }
            decorView.setSystemUiVisibility(uiOptions);
            if (VERSION.SDK_INT >= 19) {
                updatedUIOptions = 5894;
            } else {
                updatedUIOptions = 4;
            }
            decorView.setOnSystemUiVisibilityChangeListener(new C05551(decorView, updatedUIOptions));
        }
    }

    public void changeSize(int top, int left, int bottom, int right) {
        this._top = top;
        this._left = left;
        this._bottom = bottom;
        this._right = right;
        updateContentSize();
    }

    public void load(String url) {
        Log.d("UniWebView", url);
        this._uniWebView.loadUrl(url);
    }

    public void addJs(String js) {
        if (js == null) {
            Log.d("UniWebView", "Trying to add a null js. Abort.");
            return;
        }
        load(String.format("javascript:%s", new Object[]{js}));
    }

    public void loadJS(String js) {
        if (js == null) {
            Log.d("UniWebView", "Trying to eval a null js. Abort.");
            return;
        }
        String jsReformat = js.trim();
        while (jsReformat.endsWith(C0201h.f510b) && jsReformat.length() != 0) {
            jsReformat = jsReformat.substring(0, jsReformat.length() - 1);
        }
        load(String.format("javascript:android.onData(%s)", new Object[]{jsReformat}));
    }

    public void loadHTMLString(String html, String baseURL) {
        this._uniWebView.loadDataWithBaseURL(baseURL, html, "text/html", AsyncHttpResponseHandler.DEFAULT_CHARSET, null);
    }

    public void cleanCache() {
        this._uniWebView.clearCache(true);
    }

    public boolean goBack() {
        if (!this._uniWebView.canGoBack()) {
            return false;
        }
        this._uniWebView.goBack();
        return true;
    }

    public boolean goForward() {
        if (!this._uniWebView.canGoForward()) {
            return false;
        }
        this._uniWebView.goForward();
        return true;
    }

    public void destroy() {
        this._uniWebView.loadUrl("about:blank");
        UniWebViewManager.Instance().removeShowingWebViewDialog(this);
        dismiss();
    }

    protected void onStop() {
        this._listener.onDialogClose(this);
    }

    private void showDialog() {
        if (VERSION.SDK_INT >= 19) {
            getWindow().setFlags(8, 8);
            show();
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility());
            getWindow().clearFlags(8);
            return;
        }
        show();
    }

    public void setShow(boolean show) {
        if (show) {
            showDialog();
            if (this._showSpinnerWhenLoading && this._isLoading) {
                showSpinner();
            }
            UniWebViewManager.Instance().addShowingWebViewDialog(this);
            this._manualHide = false;
            return;
        }
        ((InputMethodManager) UnityPlayer.currentActivity.getSystemService("input_method")).hideSoftInputFromWindow(this._uniWebView.getWindowToken(), 0);
        this._spinner.hide();
        hide();
        this._manualHide = true;
    }

    public void updateContentSize() {
        int width;
        int height;
        Window window = getWindow();
        Display display = window.getWindowManager().getDefaultDisplay();
        Point size;
        if (VERSION.SDK_INT >= 19) {
            size = new Point();
            display.getRealSize(size);
            width = size.x;
            height = size.y;
        } else if (VERSION.SDK_INT >= 13) {
            size = new Point();
            display.getSize(size);
            width = size.x;
            height = size.y;
        } else {
            width = display.getWidth();
            height = display.getHeight();
        }
        width = Math.max(0, (width - this._left) - this._right);
        height = Math.max(0, (height - this._top) - this._bottom);
        if (width == 0 || height == 0) {
            Log.d("UniWebView", "The inset is lager then screen size. Webview will not show. Please check your insets setting.");
            return;
        }
        window.setLayout(width, height);
        WindowManager.LayoutParams layoutParam = window.getAttributes();
        layoutParam.gravity = 51;
        layoutParam.x = this._left;
        layoutParam.y = this._top;
        window.setAttributes(layoutParam);
    }

    public void setSpinnerShowWhenLoading(boolean showSpinnerWhenLoading) {
        this._showSpinnerWhenLoading = showSpinnerWhenLoading;
    }

    public void setSpinnerText(String text) {
        if (text != null) {
            this._spinnerText = text;
        } else {
            this._spinnerText = Constants.STR_EMPTY;
        }
        this._spinner.setMessage(text);
    }

    private void showSpinner() {
        if (VERSION.SDK_INT >= 19) {
            this._spinner.getWindow().setFlags(8, 8);
            this._spinner.show();
            this._spinner.getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility());
            this._spinner.getWindow().clearFlags(8);
            return;
        }
        this._spinner.show();
    }

    private void createContent() {
        this._content = new FrameLayout(getContext());
        this._content.setVisibility(0);
    }

    private void createSpinner() {
        this._spinner = new ProgressDialog(getContext());
        this._spinner.setCanceledOnTouchOutside(true);
        this._spinner.requestWindowFeature(1);
        this._spinner.setMessage(this._spinnerText);
    }

    private void createWebView() {
        this._uniWebView = new UniWebView(getContext());
        this._uniWebView.setWebViewClient(new C05562());
        this._uniWebView.setWebChromeClient(new C05623(this._content));
        this._uniWebView.setDownloadListener(new C05634());
        this._uniWebView.setVisibility(0);
        this._uniWebView.addJavascriptInterface(this, "android");
        setBounces(false);
    }

    @JavascriptInterface
    public void onData(String value) {
        Log.d("UniWebView", "receive a call back from js: " + value);
        this._listener.onJavaScriptFinished(this, value);
    }

    public void goBackGround() {
        if (this._isLoading) {
            this._loadingInterrupted = true;
            this._uniWebView.stopLoading();
        }
        if (this._alertDialog != null) {
            this._alertDialog.hide();
        }
        hide();
    }

    public void goForeGround() {
        if (!this._manualHide) {
            if (this._loadingInterrupted) {
                this._uniWebView.reload();
                this._loadingInterrupted = false;
            }
            show();
            if (this._alertDialog != null) {
                this._alertDialog.show();
            }
        }
    }

    public void setTransparent(boolean transparent) {
        this._transparent = transparent;
        this._uniWebView.updateTransparent(this._transparent);
    }

    public String getUrl() {
        return this._currentUrl;
    }

    public void setBackButtonEnable(boolean enable) {
        this._backButtonEnable = enable;
    }

    public void setBounces(boolean enable) {
        if (VERSION.SDK_INT <= 8) {
            Log.d("UniWebView", "WebView over scroll effect supports after API 9");
        } else if (enable) {
            this._uniWebView.setOverScrollMode(0);
        } else {
            this._uniWebView.setOverScrollMode(2);
        }
    }

    public void setZoomEnable(boolean enable) {
        this._uniWebView.getSettings().setBuiltInZoomControls(enable);
    }

    public void reload() {
        this._uniWebView.reload();
    }

    public void addUrlScheme(String scheme) {
        if (!this.schemes.contains(scheme)) {
            this.schemes.add(scheme);
        }
    }

    public void removeUrlScheme(String scheme) {
        if (this.schemes.contains(scheme)) {
            this.schemes.remove(scheme);
        }
    }

    public void stop() {
        this._uniWebView.stopLoading();
    }

    public void useWideViewPort(boolean use) {
        this._uniWebView.getSettings().setUseWideViewPort(use);
    }

    public String getUserAgent() {
        return this._currentUserAgent;
    }
}
