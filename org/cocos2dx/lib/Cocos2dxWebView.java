package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ali.fixHelper;

public class Cocos2dxWebView extends WebView {
    private static final String TAG = null;
    private String mJSScheme;
    private int mViewTag;

    class Cocos2dxWebViewClient extends WebViewClient {
        final /* synthetic */ Cocos2dxWebView this$0;

        static {
            fixHelper.fixfunc(new int[]{29124, 29125, 29126, 29127});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native Cocos2dxWebViewClient(Cocos2dxWebView cocos2dxWebView);

        public native void onPageFinished(WebView webView, String str);

        public native void onReceivedError(WebView webView, int i, String str, String str2);

        public native boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    static {
        fixHelper.fixfunc(new int[]{9125, 9126, 9127, 9128, 9129});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxWebView(Context context);

    @SuppressLint({"SetJavaScriptEnabled"})
    public native Cocos2dxWebView(Context context, int i);

    public native void setJavascriptInterfaceScheme(String str);

    public native void setScalesPageToFit(boolean z);

    public native void setWebViewRect(int i, int i2, int i3, int i4);

    static void __clinit__() {
        TAG = Cocos2dxWebViewHelper.class.getSimpleName();
    }
}
