package com.onevcat.uniwebview;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;

public class UniWebViewCustomViewActivity extends Activity {
    public static UniWebChromeClient currentFullScreenClient;
    public static UniWebViewCustomViewActivity customViewActivity;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customViewActivity = this;
        currentFullScreenClient.ToggleFullScreen(this);
    }

    public void onBackPressed() {
        if (VERSION.SDK_INT <= 11) {
            currentFullScreenClient.onHideCustomView();
        }
        finish();
    }
}
