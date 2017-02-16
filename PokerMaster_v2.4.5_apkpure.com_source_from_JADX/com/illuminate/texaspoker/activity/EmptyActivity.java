package com.illuminate.texaspoker.activity;

import android.app.Activity;
import android.os.Bundle;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;

public class EmptyActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        finish();
    }
}
