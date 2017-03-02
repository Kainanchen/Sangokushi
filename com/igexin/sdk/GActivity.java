package com.igexin.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.tencent.tauth.AuthActivity;

public class GActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = new Intent(this, PushService.class);
            intent.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE);
            startService(intent);
        } catch (Exception e) {
            C0247a.m838b("GActivity|" + e.toString());
        }
        C0247a.m838b("GActivity|start PushService from GActivity");
        finish();
    }

    protected void onDestroy() {
        super.onDestroy();
    }
}
