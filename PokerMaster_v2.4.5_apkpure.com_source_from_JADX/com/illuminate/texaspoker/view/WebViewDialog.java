package com.illuminate.texaspoker.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

/* renamed from: com.illuminate.texaspoker.view.f */
public final class WebViewDialog extends Dialog {
    private Context f7090a;
    private WebView f7091b;
    private String f7092c;

    /* renamed from: com.illuminate.texaspoker.view.f.1 */
    class WebViewDialog extends WebViewClient {
        final /* synthetic */ WebViewDialog f7088a;

        WebViewDialog(WebViewDialog webViewDialog) {
            this.f7088a = webViewDialog;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f7088a.f7091b.loadUrl(str);
            return true;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f7088a.f7091b.setVisibility(0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.f.2 */
    class WebViewDialog implements OnClickListener {
        final /* synthetic */ WebViewDialog f7089a;

        WebViewDialog(WebViewDialog webViewDialog) {
            this.f7089a = webViewDialog;
        }

        public final void onClick(View view) {
            this.f7089a.dismiss();
        }
    }

    public WebViewDialog(Context context, String str) {
        super(context, 2131296473);
        this.f7090a = context;
        this.f7092c = str;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f7090a).inflate(2130968837, null);
        setContentView(inflate);
        this.f7091b = (WebView) inflate.findViewById(2131558879);
        this.f7091b.getSettings().setCacheMode(1);
        this.f7091b.getSettings().setJavaScriptEnabled(true);
        this.f7091b.getSettings().setUseWideViewPort(true);
        this.f7091b.getSettings().setLoadWithOverviewMode(true);
        this.f7091b.setWebViewClient(new WebViewDialog(this));
        this.f7091b.loadUrl(this.f7092c);
        ((ImageButton) findViewById(2131559335)).setOnClickListener(new WebViewDialog(this));
    }
}
