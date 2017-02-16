package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.facebook.ab.R;
import com.facebook.p036h.FacebookDialogFragment;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p037i.LoginFragment;
import com.facebook.p051j.p052a.DeviceShareDialogFragment;
import com.facebook.p051j.p053b.ShareContent;
import com.tencent.android.tpush.common.MessageKey;

public class FacebookActivity extends FragmentActivity {
    public static String f816a;
    private static String f817c;
    private static final String f818d;
    public Fragment f819b;

    static {
        f816a = "PassThrough";
        f817c = "SingleFragment";
        f818d = FacebookActivity.class.getName();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.m2576a()) {
            FacebookSdk.m2574a(getApplicationContext());
        }
        setContentView(R.com_facebook_activity_layout);
        if (f816a.equals(intent.getAction())) {
            setResult(0, NativeProtocol.m1719a(getIntent(), null, NativeProtocol.m1722a(NativeProtocol.m1729b(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(f817c);
        if (findFragmentByTag == null) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                findFragmentByTag = new FacebookDialogFragment();
                findFragmentByTag.setRetainInstance(true);
                findFragmentByTag.show(supportFragmentManager, f817c);
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                Fragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.f2520a = (ShareContent) intent2.getParcelableExtra(MessageKey.MSG_CONTENT);
                deviceShareDialogFragment.show(supportFragmentManager, f817c);
                findFragmentByTag = deviceShareDialogFragment;
            } else {
                findFragmentByTag = new LoginFragment();
                findFragmentByTag.setRetainInstance(true);
                supportFragmentManager.beginTransaction().add(R.com_facebook_fragment_container, findFragmentByTag, f817c).commit();
            }
        }
        this.f819b = findFragmentByTag;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f819b != null) {
            this.f819b.onConfigurationChanged(configuration);
        }
    }
}
