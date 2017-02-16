package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.ali.fixHelper;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import java.util.List;

public class WebPopupActivity extends BaseMainActivity {

    /* renamed from: com.illuminate.texaspoker.activity.WebPopupActivity.1 */
    class C09021 implements OnClickListener {
        final /* synthetic */ WebPopupActivity f5320a;

        static {
            fixHelper.fixfunc(new int[]{59, 60});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C09021(WebPopupActivity webPopupActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.WebPopupActivity.2 */
    class C09032 extends WebChromeClient {
        final /* synthetic */ ProgressBar f5321a;
        final /* synthetic */ WebPopupActivity f5322b;

        static {
            fixHelper.fixfunc(new int[]{10, 11});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C09032(WebPopupActivity webPopupActivity, ProgressBar progressBar);

        public final native void onProgressChanged(WebView webView, int i);
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
        toolbar.setNavigationIcon(2130837653);
        toolbar.setNavigationOnClickListener(new C09021(this));
        setTitle(i);
        ProgressBar progressBar = (ProgressBar) findViewById(2131558880);
        WebView webView = (WebView) findViewById(2131558879);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new C09032(this, progressBar));
        webView.loadUrl(string);
    }

    protected final void m3479a(String str, List<Object> list) {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2131034133);
    }
}
