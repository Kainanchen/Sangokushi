package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.onevcat.uniwebview.UniWebViewDialog.DialogListener;
import com.tencent.connect.common.Constants;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerNativeActivity;
import java.util.Iterator;

public class AndroidPlugin extends UnityPlayerNativeActivity {
    public static final int FILECHOOSER_RESULTCODE = 1;
    protected static final String LOG_TAG = "UniWebView";
    protected static ValueCallback<Uri> _uploadMessages;

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.10 */
    static class AnonymousClass10 implements Runnable {
        final /* synthetic */ String val$js;
        final /* synthetic */ String val$name;

        AnonymousClass10(String str, String str2) {
            this.val$name = str;
            this.val$js = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewAddJavaScript");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.addJs(this.val$js);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.11 */
    static class AnonymousClass11 implements Runnable {
        final /* synthetic */ String val$name;

        AnonymousClass11(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewCleanCache");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.cleanCache();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.12 */
    static class AnonymousClass12 implements Runnable {
        final /* synthetic */ String val$key;

        AnonymousClass12(String str) {
            this.val$key = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewCleanCookie");
            CookieManager cm = CookieManager.getInstance();
            if (this.val$key == null || this.val$key.length() == 0) {
                Log.d(AndroidPlugin.LOG_TAG, "Cleaning all cookies");
                cm.removeAllCookie();
            } else {
                Log.d(AndroidPlugin.LOG_TAG, "Setting an empty cookie for: " + this.val$key);
                cm.setCookie(this.val$key, Constants.STR_EMPTY);
            }
            CookieSyncManager manager = CookieSyncManager.getInstance();
            if (manager != null) {
                manager.sync();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.13 */
    static class AnonymousClass13 implements Runnable {
        final /* synthetic */ String val$name;

        AnonymousClass13(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewDestroy");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.destroy();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.14 */
    static class AnonymousClass14 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ boolean val$transparent;

        AnonymousClass14(String str, boolean z) {
            this.val$name = str;
            this.val$transparent = z;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewTransparentBackground");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setTransparent(this.val$transparent);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.15 */
    static class AnonymousClass15 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ boolean val$show;

        AnonymousClass15(boolean z, String str) {
            this.val$show = z;
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewSetSpinnerShowWhenLoading: " + this.val$show);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setSpinnerShowWhenLoading(this.val$show);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.16 */
    static class AnonymousClass16 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$text;

        AnonymousClass16(String str, String str2) {
            this.val$text = str;
            this.val$name = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewSetSpinnerText: " + this.val$text);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setSpinnerText(this.val$text);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.17 */
    static class AnonymousClass17 implements Runnable {
        final /* synthetic */ String val$name;

        AnonymousClass17(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewGoBack");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.goBack();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.18 */
    static class AnonymousClass18 implements Runnable {
        final /* synthetic */ String val$name;

        AnonymousClass18(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewGoForward");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.goForward();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.19 */
    static class AnonymousClass19 implements Runnable {
        final /* synthetic */ String val$baseURL;
        final /* synthetic */ String val$htmlString;
        final /* synthetic */ String val$name;

        AnonymousClass19(String str, String str2, String str3) {
            this.val$name = str;
            this.val$htmlString = str2;
            this.val$baseURL = str3;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewLoadHTMLString");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.loadHTMLString(this.val$htmlString, this.val$baseURL);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.1 */
    class C05451 implements Runnable {
        C05451() {
        }

        public void run() {
            AndroidPlugin.this.ShowAllWebViewDialogs(true);
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.20 */
    static class AnonymousClass20 implements Runnable {
        final /* synthetic */ boolean val$enable;
        final /* synthetic */ String val$name;

        AnonymousClass20(boolean z, String str) {
            this.val$enable = z;
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewSetBackButtonEnable:" + this.val$enable);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setBackButtonEnable(this.val$enable);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.21 */
    static class AnonymousClass21 implements Runnable {
        final /* synthetic */ boolean val$enable;
        final /* synthetic */ String val$name;

        AnonymousClass21(boolean z, String str) {
            this.val$enable = z;
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewSetBounces:" + this.val$enable);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setBounces(this.val$enable);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.22 */
    static class AnonymousClass22 implements Runnable {
        final /* synthetic */ boolean val$enable;
        final /* synthetic */ String val$name;

        AnonymousClass22(boolean z, String str) {
            this.val$enable = z;
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewSetZoomEnable:" + this.val$enable);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setZoomEnable(this.val$enable);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.23 */
    static class AnonymousClass23 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$scheme;

        AnonymousClass23(String str, String str2) {
            this.val$scheme = str;
            this.val$name = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewAddUrlScheme:" + this.val$scheme);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.addUrlScheme(this.val$scheme);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.24 */
    static class AnonymousClass24 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$scheme;

        AnonymousClass24(String str, String str2) {
            this.val$scheme = str;
            this.val$name = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewAddUrlScheme:" + this.val$scheme);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.removeUrlScheme(this.val$scheme);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.25 */
    static class AnonymousClass25 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ boolean val$use;

        AnonymousClass25(boolean z, String str) {
            this.val$use = z;
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewUseWideViewPort:" + this.val$use);
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.useWideViewPort(this.val$use);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.26 */
    static class AnonymousClass26 implements Runnable {
        final /* synthetic */ Runnable val$r;

        AnonymousClass26(Runnable runnable) {
            this.val$r = runnable;
        }

        public void run() {
            try {
                this.val$r.run();
            } catch (Exception e) {
                Log.d(AndroidPlugin.LOG_TAG, "UniWebView should run on UI thread: " + e.getMessage());
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.2 */
    static class C05472 implements Runnable {
        final /* synthetic */ int val$bottom;
        final /* synthetic */ int val$left;
        final /* synthetic */ String val$name;
        final /* synthetic */ int val$right;
        final /* synthetic */ int val$top;

        /* renamed from: com.onevcat.uniwebview.AndroidPlugin.2.1 */
        class C05461 implements DialogListener {
            C05461() {
            }

            public void onPageFinished(UniWebViewDialog dialog, String url) {
                Log.d(AndroidPlugin.LOG_TAG, "page load finished: " + url);
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "LoadComplete", Constants.STR_EMPTY);
            }

            public void onPageStarted(UniWebViewDialog dialog, String url) {
                Log.d(AndroidPlugin.LOG_TAG, "page load started: " + url);
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "LoadBegin", url);
            }

            public void onReceivedError(UniWebViewDialog dialog, int errorCode, String description, String failingUrl) {
                Log.d(AndroidPlugin.LOG_TAG, "page load error: " + failingUrl + " Error: " + description);
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "LoadComplete", description);
            }

            public boolean shouldOverrideUrlLoading(UniWebViewDialog dialog, String url) {
                if (url.startsWith("mailto:")) {
                    AndroidPlugin.getUnityActivity_().startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(url)));
                    return true;
                } else if (url.startsWith("tel:")) {
                    AndroidPlugin.getUnityActivity_().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(url)));
                    return false;
                } else {
                    boolean canResponseScheme = false;
                    Iterator it = dialog.schemes.iterator();
                    while (it.hasNext()) {
                        if (url.startsWith(((String) it.next()) + "://")) {
                            canResponseScheme = true;
                            break;
                        }
                    }
                    if (!canResponseScheme) {
                        return false;
                    }
                    UnityPlayer.UnitySendMessage(C05472.this.val$name, "ReceivedMessage", url);
                    return true;
                }
            }

            public void onDialogShouldCloseByBackButton(UniWebViewDialog dialog) {
                Log.d(AndroidPlugin.LOG_TAG, "dialog should be closed");
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "WebViewDone", Constants.STR_EMPTY);
            }

            public void onDialogKeyDown(UniWebViewDialog dialog, int keyCode) {
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "WebViewKeyDown", Integer.toString(keyCode));
            }

            public void onDialogClose(UniWebViewDialog dialog) {
                UniWebViewManager.Instance().removeUniWebView(C05472.this.val$name);
            }

            public void onJavaScriptFinished(UniWebViewDialog dialog, String result) {
                UnityPlayer.UnitySendMessage(C05472.this.val$name, "EvalJavaScriptFinished", result);
            }
        }

        C05472(String str, int i, int i2, int i3, int i4) {
            this.val$name = str;
            this.val$top = i;
            this.val$left = i2;
            this.val$bottom = i3;
            this.val$right = i4;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewInit");
            UniWebViewDialog dialog = new UniWebViewDialog(AndroidPlugin.getUnityActivity_(), new C05461());
            dialog.changeSize(this.val$top, this.val$left, this.val$bottom, this.val$right);
            UniWebViewManager.Instance().setUniWebView(this.val$name, dialog);
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.3 */
    static class C05483 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$url;

        C05483(String str, String str2) {
            this.val$name = str;
            this.val$url = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewLoad");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.load(this.val$url);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.4 */
    static class C05494 implements Runnable {
        final /* synthetic */ String val$name;

        C05494(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewReload");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.reload();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.5 */
    static class C05505 implements Runnable {
        final /* synthetic */ String val$name;

        C05505(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewStop");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.stop();
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.6 */
    static class C05516 implements Runnable {
        final /* synthetic */ int val$bottom;
        final /* synthetic */ int val$left;
        final /* synthetic */ String val$name;
        final /* synthetic */ int val$right;
        final /* synthetic */ int val$top;

        C05516(String str, int i, int i2, int i3, int i4) {
            this.val$name = str;
            this.val$top = i;
            this.val$left = i2;
            this.val$bottom = i3;
            this.val$right = i4;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewChangeSize");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.changeSize(this.val$top, this.val$left, this.val$bottom, this.val$right);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.7 */
    static class C05527 implements Runnable {
        final /* synthetic */ String val$name;

        C05527(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewShow");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setShow(true);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.8 */
    static class C05538 implements Runnable {
        final /* synthetic */ String val$name;

        C05538(String str) {
            this.val$name = str;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewHide");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.setShow(false);
            }
        }
    }

    /* renamed from: com.onevcat.uniwebview.AndroidPlugin.9 */
    static class C05549 implements Runnable {
        final /* synthetic */ String val$js;
        final /* synthetic */ String val$name;

        C05549(String str, String str2) {
            this.val$name = str;
            this.val$js = str2;
        }

        public void run() {
            Log.d(AndroidPlugin.LOG_TAG, "_UniWebViewEvaluatingJavaScript");
            UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(this.val$name);
            if (dialog != null) {
                dialog.loadJS(this.val$js);
            }
        }
    }

    public static Activity getUnityActivity_() {
        return UnityPlayer.currentActivity;
    }

    public static void setUploadMessage(ValueCallback<Uri> message) {
        _uploadMessages = message;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CookieSyncManager.createInstance(getUnityActivity_());
    }

    protected void onPause() {
        super.onPause();
        ShowAllWebViewDialogs(false);
        CookieSyncManager manager = CookieSyncManager.getInstance();
        if (manager != null) {
            manager.stopSync();
        }
    }

    protected void onResume() {
        super.onResume();
        ShowAllWebViewDialogs(false);
        new Handler().postDelayed(new C05451(), 200);
        CookieSyncManager manager = CookieSyncManager.getInstance();
        if (manager != null) {
            manager.startSync();
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(LOG_TAG, "Rotation: " + newConfig.orientation);
        for (UniWebViewDialog dialog : UniWebViewManager.Instance().allDialogs()) {
            dialog.updateContentSize();
            dialog.HideSystemUI();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == FILECHOOSER_RESULTCODE && _uploadMessages != null) {
            Uri result = (intent == null || resultCode != -1) ? null : intent.getData();
            _uploadMessages.onReceiveValue(result);
            _uploadMessages = null;
        }
    }

    public static void _UniWebViewInit(String name, int top, int left, int bottom, int right) {
        runSafelyOnUiThread(new C05472(name, top, left, bottom, right));
    }

    public static void _UniWebViewLoad(String name, String url) {
        runSafelyOnUiThread(new C05483(name, url));
    }

    public static void _UniWebViewReload(String name) {
        runSafelyOnUiThread(new C05494(name));
    }

    public static void _UniWebViewStop(String name) {
        runSafelyOnUiThread(new C05505(name));
    }

    public static void _UniWebViewChangeSize(String name, int top, int left, int bottom, int right) {
        runSafelyOnUiThread(new C05516(name, top, left, bottom, right));
    }

    public static void _UniWebViewShow(String name) {
        runSafelyOnUiThread(new C05527(name));
    }

    public static void _UniWebViewDismiss(String name) {
        runSafelyOnUiThread(new C05538(name));
    }

    public static void _UniWebViewEvaluatingJavaScript(String name, String js) {
        runSafelyOnUiThread(new C05549(name, js));
    }

    public static void _UniWebViewAddJavaScript(String name, String js) {
        runSafelyOnUiThread(new AnonymousClass10(name, js));
    }

    public static void _UniWebViewCleanCache(String name) {
        runSafelyOnUiThread(new AnonymousClass11(name));
    }

    public static void _UniWebViewCleanCookie(String name, String key) {
        runSafelyOnUiThread(new AnonymousClass12(key));
    }

    public static void _UniWebViewDestroy(String name) {
        runSafelyOnUiThread(new AnonymousClass13(name));
    }

    public static void _UniWebViewTransparentBackground(String name, boolean transparent) {
        runSafelyOnUiThread(new AnonymousClass14(name, transparent));
    }

    public static void _UniWebViewSetSpinnerShowWhenLoading(String name, boolean show) {
        runSafelyOnUiThread(new AnonymousClass15(show, name));
    }

    public static void _UniWebViewSetSpinnerText(String name, String text) {
        runSafelyOnUiThread(new AnonymousClass16(text, name));
    }

    public static void _UniWebViewGoBack(String name) {
        runSafelyOnUiThread(new AnonymousClass17(name));
    }

    public static void _UniWebViewGoForward(String name) {
        runSafelyOnUiThread(new AnonymousClass18(name));
    }

    public static void _UniWebViewLoadHTMLString(String name, String htmlString, String baseURL) {
        runSafelyOnUiThread(new AnonymousClass19(name, htmlString, baseURL));
    }

    public static String _UniWebViewGetCurrentUrl(String name) {
        UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(name);
        if (dialog != null) {
            return dialog.getUrl();
        }
        return Constants.STR_EMPTY;
    }

    public static void _UniWebViewSetBackButtonEnable(String name, boolean enable) {
        runSafelyOnUiThread(new AnonymousClass20(enable, name));
    }

    public static void _UniWebViewSetBounces(String name, boolean enable) {
        runSafelyOnUiThread(new AnonymousClass21(enable, name));
    }

    public static void _UniWebViewSetZoomEnable(String name, boolean enable) {
        runSafelyOnUiThread(new AnonymousClass22(enable, name));
    }

    public static void _UniWebViewAddUrlScheme(String name, String scheme) {
        runSafelyOnUiThread(new AnonymousClass23(scheme, name));
    }

    public static void _UniWebViewRemoveUrlScheme(String name, String scheme) {
        runSafelyOnUiThread(new AnonymousClass24(scheme, name));
    }

    public static void _UniWebViewUseWideViewPort(String name, boolean use) {
        runSafelyOnUiThread(new AnonymousClass25(use, name));
    }

    public static void _UniWebViewSetUserAgent(String userAgent) {
        UniWebView.customUserAgent = userAgent;
    }

    public static String _UniWebViewGetUserAgent(String name) {
        UniWebViewDialog dialog = UniWebViewManager.Instance().getUniWebViewDialog(name);
        if (dialog != null) {
            return dialog.getUserAgent();
        }
        return Constants.STR_EMPTY;
    }

    protected static void runSafelyOnUiThread(Runnable r) {
        getUnityActivity_().runOnUiThread(new AnonymousClass26(r));
    }

    protected void ShowAllWebViewDialogs(boolean show) {
        Iterator it = UniWebViewManager.Instance().getShowingWebViewDialogs().iterator();
        while (it.hasNext()) {
            UniWebViewDialog webViewDialog = (UniWebViewDialog) it.next();
            if (show) {
                Log.d(LOG_TAG, webViewDialog + "goForeGround");
                webViewDialog.goForeGround();
                webViewDialog.HideSystemUI();
            } else {
                Log.d(LOG_TAG, webViewDialog + "goBackGround");
                webViewDialog.goBackGround();
                webViewDialog.HideSystemUI();
            }
        }
    }
}
