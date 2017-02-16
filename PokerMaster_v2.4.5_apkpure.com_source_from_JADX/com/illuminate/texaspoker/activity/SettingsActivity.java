package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.p037i.LoginManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class SettingsActivity extends BaseToolBarActivity {
    private static String f5152d;
    private Switch f5153e;
    private Switch f5154f;
    private Switch f5155g;
    private Switch f5156h;

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.1 */
    class C08261 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5141a;

        C08261(SettingsActivity settingsActivity) {
            this.f5141a = settingsActivity;
        }

        public final void onClick(View view) {
            this.f5141a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.2 */
    class C08292 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5144a;

        /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.2.1 */
        class C08271 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08292 f5142a;

            C08271(C08292 c08292) {
                this.f5142a = c08292;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.2.2 */
        class C08282 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08292 f5143a;

            C08282(C08292 c08292) {
                this.f5143a = c08292;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                NetworkUtil.m4073a();
                NetworkUtil.m4164f();
                SettingsActivity.m3408a(this.f5143a.f5144a);
            }
        }

        C08292(SettingsActivity settingsActivity) {
            this.f5144a = settingsActivity;
        }

        public final void onClick(View view) {
            new Builder(this.f5144a).setTitle(2131165514).setMessage(2131165787).setPositiveButton(2131165785, new C08282(this)).setNegativeButton(2131165432, new C08271(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.3 */
    class C08303 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5145a;

        C08303(SettingsActivity settingsActivity) {
            this.f5145a = settingsActivity;
        }

        public final void onClick(View view) {
            this.f5145a.startActivity(new Intent(this.f5145a, SwitchLanguageActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.4 */
    class C08314 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5146a;

        C08314(SettingsActivity settingsActivity) {
            this.f5146a = settingsActivity;
        }

        public final void onClick(View view) {
            if (this.f5146a.f5153e.isChecked()) {
                SharedPreferencesManager.m4334e(1);
            } else {
                SharedPreferencesManager.m4334e(0);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.5 */
    class C08325 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5147a;

        C08325(SettingsActivity settingsActivity) {
            this.f5147a = settingsActivity;
        }

        public final void onClick(View view) {
            boolean z;
            boolean z2 = true;
            if (SharedPreferencesManager.m4428v() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SharedPreferencesManager.m4431w() != 0) {
                z2 = false;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4099a(SharedPreferencesManager.m4308b(), this.f5147a.f5154f.isChecked(), z, z2);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.6 */
    class C08336 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5148a;

        C08336(SettingsActivity settingsActivity) {
            this.f5148a = settingsActivity;
        }

        public final void onClick(View view) {
            boolean z;
            boolean z2 = true;
            if (SharedPreferencesManager.m4422t() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SharedPreferencesManager.m4431w() != 0) {
                z2 = false;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4099a(SharedPreferencesManager.m4308b(), z, this.f5148a.f5155g.isChecked(), z2);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.7 */
    class C08347 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5149a;

        C08347(SettingsActivity settingsActivity) {
            this.f5149a = settingsActivity;
        }

        public final void onClick(View view) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (SharedPreferencesManager.m4422t() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SharedPreferencesManager.m4428v() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.f5149a.f5156h.isChecked()) {
                z3 = true;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4099a(SharedPreferencesManager.m4308b(), z, z2, z3);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.8 */
    class C08358 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5150a;

        C08358(SettingsActivity settingsActivity) {
            this.f5150a = settingsActivity;
        }

        public final void onClick(View view) {
            this.f5150a.startActivity(new Intent(this.f5150a, FeedbackActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SettingsActivity.9 */
    class C08369 implements OnClickListener {
        final /* synthetic */ SettingsActivity f5151a;

        C08369(SettingsActivity settingsActivity) {
            this.f5151a = settingsActivity;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f5151a, WebActivity.class);
            Bundle bundle = new Bundle();
            if (Utility.m4480a()) {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/cn/about.html");
            } else if (Utility.m4485b()) {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/tw/about.html");
            } else {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/en/about.html");
            }
            bundle.putInt("titleId", 2131165780);
            intent.putExtras(bundle);
            this.f5151a.startActivity(intent);
        }
    }

    static {
        f5152d = "SettingsActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968665);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08261(this));
        ImageButton imageButton = (ImageButton) findViewById(2131558827);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C08292(this));
        }
        imageButton = (ImageButton) findViewById(2131558828);
        TextView textView = (TextView) findViewById(2131558829);
        String ac = SharedPreferencesManager.ac();
        if (StringUtils.m4462a((CharSequence) ac)) {
            ac = "auto";
        }
        if (ac.equalsIgnoreCase("auto")) {
            textView.setText(2131165789);
        } else if (ac.equalsIgnoreCase("zh_CN")) {
            textView.setText(2131165987);
        } else if (ac.equalsIgnoreCase("zh_TW")) {
            textView.setText(2131165989);
        } else if (ac.equalsIgnoreCase("en")) {
            textView.setText(2131165988);
        }
        if (imageButton != null) {
            imageButton.setOnClickListener(new C08303(this));
        }
        this.f5153e = (Switch) findViewById(2131558831);
        this.f5153e.setOnClickListener(new C08314(this));
        this.f5156h = (Switch) findViewById(2131558830);
        this.f5156h.setOnClickListener(new C08347(this));
        this.f5154f = (Switch) findViewById(2131558832);
        this.f5154f.setOnClickListener(new C08325(this));
        this.f5155g = (Switch) findViewById(2131558833);
        this.f5155g.setOnClickListener(new C08336(this));
        ((ImageButton) findViewById(2131558834)).setOnClickListener(new C08358(this));
        ((ImageButton) findViewById(2131558835)).setOnClickListener(new C08369(this));
        try {
            ((TextView) findViewById(2131558836)).setText(getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void onResume() {
        super.onResume();
        m3407a();
        setTitle(2131165791);
    }

    private void m3407a() {
        if (!DBManager.m3631a().m3632b()) {
            if (SharedPreferencesManager.m4425u() == 1) {
                this.f5153e.setChecked(true);
            } else {
                this.f5153e.setChecked(false);
            }
            if (SharedPreferencesManager.m4422t() == 1) {
                this.f5154f.setChecked(true);
            } else {
                this.f5154f.setChecked(false);
            }
            if (SharedPreferencesManager.m4428v() == 1) {
                this.f5155g.setChecked(true);
            } else {
                this.f5155g.setChecked(false);
            }
            if (SharedPreferencesManager.m4431w() == 0) {
                this.f5156h.setChecked(true);
            } else {
                this.f5156h.setChecked(false);
            }
        }
    }

    protected final void m3413a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_CHANGE_SOUND_SUCCESS")) {
            m3407a();
        } else if (str.equalsIgnoreCase("NOTIFY_CHANGE_SOUND_FAULT")) {
            m3407a();
        }
    }

    static /* synthetic */ void m3408a(SettingsActivity settingsActivity) {
        ForegroundService.f6510a = false;
        String ac = SharedPreferencesManager.ac();
        SharedPreferencesManager.m4300a();
        SharedPreferencesManager.m4379k(ac);
        SharedPreferencesManager.m4354h();
        DBManager.m3631a().m3633c();
        LoginManager.m1842a();
        LoginManager.m1847b();
        Intent intent = new Intent(settingsActivity, SplashActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        settingsActivity.startActivity(intent);
        settingsActivity.overridePendingTransition(0, 0);
    }
}
