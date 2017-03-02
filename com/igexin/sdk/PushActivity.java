package com.igexin.sdk;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import com.igexin.sdk.p053a.C0516a;

public class PushActivity extends Activity {
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityConfigurationChanged(this, configuration);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return C0516a.m1869a().m1872b() != null ? C0516a.m1869a().m1872b().onActivityCreateOptionsMenu(this, menu) : true;
    }

    protected void onDestroy() {
        super.onDestroy();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityDestroy(this);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return (C0516a.m1869a().m1872b() == null || !C0516a.m1869a().m1872b().onActivityKeyDown(this, i, keyEvent)) ? super.onKeyDown(i, keyEvent) : true;
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityNewIntent(this, intent);
        }
    }

    protected void onPause() {
        super.onPause();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityPause(this);
        }
    }

    protected void onRestart() {
        super.onRestart();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityRestart(this);
        }
    }

    protected void onResume() {
        super.onResume();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityResume(this);
        }
    }

    protected void onStart() {
        super.onStart();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityStart(this, getIntent());
        }
    }

    protected void onStop() {
        super.onStop();
        if (C0516a.m1869a().m1872b() != null) {
            C0516a.m1869a().m1872b().onActivityStop(this);
        }
    }
}
