package com.illuminate.texaspoker.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import java.util.List;

public class WebActivity extends BaseToolBarActivity {

    /* renamed from: com.illuminate.texaspoker.activity.WebActivity.1 */
    class C08991 implements OnClickListener {
        final /* synthetic */ WebActivity f5316a;

        C08991(WebActivity webActivity) {
            this.f5316a = webActivity;
        }

        public final void onClick(View view) {
            this.f5316a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.WebActivity.2 */
    class C09002 extends WebChromeClient {
        final /* synthetic */ ProgressBar f5317a;
        final /* synthetic */ WebActivity f5318b;

        C09002(WebActivity webActivity, ProgressBar progressBar) {
            this.f5318b = webActivity;
            this.f5317a = progressBar;
        }

        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                this.f5317a.setVisibility(8);
            } else {
                if (this.f5317a.getVisibility() == 8) {
                    this.f5317a.setVisibility(0);
                }
                this.f5317a.setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.WebActivity.3 */
    class C09013 extends WebViewClient {
        final /* synthetic */ WebActivity f5319a;

        C09013(WebActivity webActivity) {
            this.f5319a = webActivity;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    protected void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        String string = extras.getString(ParamKey.URL);
        int i = extras.getInt("titleId");
        super.onCreate(bundle);
        setContentView(2130968674);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08991(this));
        setTitle(i);
        ProgressBar progressBar = (ProgressBar) findViewById(2131558880);
        WebView webView = (WebView) findViewById(2131558879);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebChromeClient(new C09002(this, progressBar));
        webView.setWebViewClient(new C09013(this));
        webView.loadUrl(string);
    }

    protected final void m3478a(String str, List<Object> list) {
    }
}
