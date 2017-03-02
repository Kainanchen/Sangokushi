package com.zkunity.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.zkunity.sdk.ZKUnityPlayerActivity;

public class BaseActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, ZKUnityPlayerActivity.class));
        finish();
    }
}
