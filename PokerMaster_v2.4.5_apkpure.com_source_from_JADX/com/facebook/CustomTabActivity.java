package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

public class CustomTabActivity extends Activity {
    public static final String f806a;
    public static final String f807b;
    private BroadcastReceiver f808c;

    /* renamed from: com.facebook.CustomTabActivity.1 */
    class C02711 extends BroadcastReceiver {
        final /* synthetic */ CustomTabActivity f805a;

        C02711(CustomTabActivity customTabActivity) {
            this.f805a = customTabActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            this.f805a.finish();
        }
    }

    static {
        f806a = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";
        f807b = CustomTabActivity.class.getSimpleName() + ".action_destroy";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f806a);
        intent.putExtra(CustomTabMainActivity.f812c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f806a);
            intent2.putExtra(CustomTabMainActivity.f812c, getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            this.f808c = new C02711(this);
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f808c, new IntentFilter(f807b));
        }
    }

    protected void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f808c);
        super.onDestroy();
    }
}
