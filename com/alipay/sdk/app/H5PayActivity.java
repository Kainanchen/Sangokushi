package com.alipay.sdk.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.util.C0206l;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;

public class H5PayActivity extends Activity {
    private WebView f194a;
    private WebViewClient f195b;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            String string = extras.getString(SocialConstants.PARAM_URL);
            if (C0206l.m687b(string)) {
                String string2 = extras.getString("cookie");
                super.requestWindowFeature(1);
                this.f194a = C0206l.m674a((Activity) this, string, string2);
                this.f195b = new C0136b(this);
                this.f194a.setWebViewClient(this.f195b);
                return;
            }
            finish();
        } catch (Exception e) {
            finish();
        }
    }

    public void onBackPressed() {
        if (!this.f194a.canGoBack()) {
            C0142h.f219a = C0142h.m385a();
            finish();
        } else if (((C0136b) this.f195b).f207a) {
            C0143i a = C0143i.m392a(C0143i.NETWORK_ERROR.f228h);
            C0142h.f219a = C0142h.m386a(a.f228h, a.f229i, Constants.STR_EMPTY);
            finish();
        }
    }

    public void finish() {
        m361a();
        super.finish();
    }

    public void m361a() {
        Object obj = PayTask.f199a;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception e) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f194a != null) {
            this.f194a.removeAllViews();
            try {
                this.f194a.destroy();
            } catch (Throwable th) {
            }
            this.f194a = null;
        }
    }
}
