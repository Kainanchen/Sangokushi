package com.onevcat.uniwebview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.connect.common.Constants;

@SuppressLint({"SetJavaScriptEnabled"})
public class UniWebView extends WebView {
    public static String customUserAgent;

    public UniWebView(Context context) {
        super(context);
        WebSettings webSettings = getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setGeolocationEnabled(true);
        if (!(customUserAgent == null || customUserAgent.equals(Constants.STR_EMPTY))) {
            webSettings.setUserAgentString(customUserAgent);
        }
        if (VERSION.SDK_INT >= 8) {
            webSettings.setPluginState(PluginState.ON);
        }
        if (VERSION.SDK_INT >= 11) {
            webSettings.setDisplayZoomControls(false);
        }
        if (VERSION.SDK_INT >= 16) {
            webSettings.setAllowFileAccessFromFileURLs(true);
            webSettings.setAllowUniversalAccessFromFileURLs(true);
        }
        setScrollBarStyle(0);
        setVerticalScrollbarOverlay(true);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    public void updateTransparent(boolean transparent) {
        if (transparent) {
            setBackgroundColor(0);
            if (VERSION.SDK_INT >= 11) {
                setLayerType(1, null);
                return;
            }
            return;
        }
        setBackgroundColor(-1);
        if (VERSION.SDK_INT >= 11) {
            setLayerType(0, null);
        }
    }
}
