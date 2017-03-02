package com.zkunity.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

public class ZKActivity {
    private Activity appActivity;

    public ZKActivity(Activity appActivity) {
        this.appActivity = appActivity;
    }

    public Activity getAppActivity() {
        return this.appActivity;
    }

    public Context getAppContext() {
        if (this.appActivity != null) {
            return this.appActivity.getApplicationContext();
        }
        return null;
    }

    public Resources getResource() {
        return this.appActivity != null ? this.appActivity.getResources() : null;
    }

    public String getPackageName() {
        return this.appActivity != null ? this.appActivity.getPackageName() : null;
    }
}
