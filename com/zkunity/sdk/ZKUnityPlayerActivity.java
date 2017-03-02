package com.zkunity.sdk;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.onevcat.uniwebview.AndroidPlugin;
import com.zkunity.app.AppManager;

public class ZKUnityPlayerActivity extends AndroidPlugin {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getManager().initAppManager(this);
        MUnityPlayerProxy.getManager().onCreate();
    }

    protected void onActivityResult(int arg0, int arg1, Intent arg2) {
        super.onActivityResult(arg0, arg1, arg2);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onPause() {
        MUnityPlayerProxy.getManager().onPause();
        super.onPause();
    }

    protected void onResume() {
        MUnityPlayerProxy.getManager().onResume();
        super.onResume();
    }

    protected void onDestroy() {
        MUnityPlayerProxy.getManager().onDestroy();
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public void onConfigurationChanged(Configuration arg0) {
        super.onConfigurationChanged(arg0);
    }

    public String ZSDKPlatformRequest(String data) {
        return MUnityPlayerProxy.getManager().ZSDKPlatformRequest(data);
    }
}
