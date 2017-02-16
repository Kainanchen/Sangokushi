package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.p036h.CustomTab;

public class CustomTabMainActivity extends Activity {
    public static final String f810a;
    public static final String f811b;
    public static final String f812c;
    public static final String f813d;
    private boolean f814e;
    private BroadcastReceiver f815f;

    /* renamed from: com.facebook.CustomTabMainActivity.1 */
    class C02721 extends BroadcastReceiver {
        final /* synthetic */ CustomTabMainActivity f809a;

        C02721(CustomTabMainActivity customTabMainActivity) {
            this.f809a = customTabMainActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(this.f809a, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f813d);
            intent2.putExtra(CustomTabMainActivity.f812c, intent.getStringExtra(CustomTabMainActivity.f812c));
            intent2.addFlags(603979776);
            this.f809a.startActivity(intent2);
        }
    }

    public CustomTabMainActivity() {
        this.f814e = true;
    }

    static {
        f810a = CustomTabMainActivity.class.getSimpleName() + ".extra_params";
        f811b = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";
        f812c = CustomTabMainActivity.class.getSimpleName() + ".extra_url";
        f813d = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";
    }

    public static final String m805a() {
        return "fb" + FacebookSdk.m2590j() + "://authorize";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f806a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f810a);
            String stringExtra = getIntent().getStringExtra(f811b);
            CustomTab customTab = new CustomTab("oauth", bundleExtra);
            CustomTabsIntent build = new Builder().build();
            build.intent.setPackage(stringExtra);
            build.intent.addFlags(1073741824);
            build.launchUrl(this, customTab.f1649a);
            this.f814e = false;
            this.f815f = new C02721(this);
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f815f, new IntentFilter(CustomTabActivity.f806a));
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f813d.equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.f807b));
            m806a(-1, intent);
        } else if (CustomTabActivity.f806a.equals(intent.getAction())) {
            m806a(-1, intent);
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f814e) {
            m806a(0, null);
        }
        this.f814e = true;
    }

    private void m806a(int i, Intent intent) {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f815f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
