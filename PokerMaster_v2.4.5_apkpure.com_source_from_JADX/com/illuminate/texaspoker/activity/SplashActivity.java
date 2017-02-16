package com.illuminate.texaspoker.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.p037i.LoginManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.service.FakeForegroundService;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.SplashPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.util.Timer;
import java.util.TimerTask;
import net.sqlcipher.database.SQLiteDatabase;

public class SplashActivity extends Activity {
    private SimpleDraweeView f5229a;
    private ImageView f5230b;
    private Button f5231c;
    private long f5232d;
    private Timer f5233e;
    private TimerTask f5234f;
    private Handler f5235g;

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.1 */
    class C08531 implements OnClickListener {
        final /* synthetic */ SplashActivity f5220a;

        C08531(SplashActivity splashActivity) {
            this.f5220a = splashActivity;
        }

        public final void onClick(View view) {
            this.f5220a.m3441d();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.2 */
    class C08542 implements DialogInterface.OnClickListener {
        final /* synthetic */ SplashActivity f5221a;

        C08542(SplashActivity splashActivity) {
            this.f5221a = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse("package:" + this.f5221a.getPackageName()));
            this.f5221a.startActivity(intent);
            this.f5221a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.3 */
    class C08553 extends Handler {
        final /* synthetic */ SplashActivity f5222a;

        C08553(SplashActivity splashActivity) {
            this.f5222a = splashActivity;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f5222a.m3441d();
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    this.f5222a.m3434a();
                default:
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.4 */
    class C08564 extends TimerTask {
        final /* synthetic */ SplashActivity f5223a;

        C08564(SplashActivity splashActivity) {
            this.f5223a = splashActivity;
        }

        public final void run() {
            Message message = new Message();
            this.f5223a.f5232d = this.f5223a.f5232d - 1;
            if (this.f5223a.f5232d >= 0) {
                message.what = 2;
                this.f5223a.f5235g.sendMessage(message);
            }
            if (this.f5223a.f5232d == 0) {
                message = new Message();
                message.what = 1;
                this.f5223a.f5235g.sendMessage(message);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.5 */
    class C08575 implements Runnable {
        final /* synthetic */ SplashActivity f5224a;

        C08575(SplashActivity splashActivity) {
            this.f5224a = splashActivity;
        }

        public final void run() {
            if (ContextCompat.checkSelfPermission(this.f5224a, "android.permission.READ_PHONE_STATE") != 0) {
                ActivityCompat.requestPermissions(this.f5224a, new String[]{"android.permission.READ_PHONE_STATE"}, 1);
            } else if (ContextCompat.checkSelfPermission(this.f5224a, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                ActivityCompat.requestPermissions(this.f5224a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            } else if (ContextCompat.checkSelfPermission(this.f5224a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.requestPermissions(this.f5224a, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 3);
            } else {
                this.f5224a.m3439c();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.6 */
    class C08586 implements DialogInterface.OnClickListener {
        final /* synthetic */ SplashActivity f5225a;

        C08586(SplashActivity splashActivity) {
            this.f5225a = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5225a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.7 */
    class C08597 implements DialogInterface.OnClickListener {
        final /* synthetic */ SplashActivity f5226a;

        C08597(SplashActivity splashActivity) {
            this.f5226a = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse("package:" + this.f5226a.getPackageName()));
            this.f5226a.startActivity(intent);
            this.f5226a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.8 */
    class C08608 implements DialogInterface.OnClickListener {
        final /* synthetic */ SplashActivity f5227a;

        C08608(SplashActivity splashActivity) {
            this.f5227a = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5227a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SplashActivity.9 */
    class C08619 implements DialogInterface.OnClickListener {
        final /* synthetic */ SplashActivity f5228a;

        C08619(SplashActivity splashActivity) {
            this.f5228a = splashActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse("package:" + this.f5228a.getPackageName()));
            this.f5228a.startActivity(intent);
            this.f5228a.finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5232d = (long) SplashPreferencesManager.m4455d();
        if (this.f5232d == 0) {
            this.f5232d = 3;
        }
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        setContentView(2130968668);
        this.f5229a = (SimpleDraweeView) findViewById(2131558869);
        CharSequence a = SplashPreferencesManager.m4440a();
        if (!StringUtils.m4462a(a)) {
            this.f5229a.setImageURI(Uri.parse(a));
        }
        this.f5230b = (ImageView) findViewById(2131558870);
        this.f5231c = (Button) findViewById(2131558871);
        this.f5231c.setOnClickListener(new C08531(this));
    }

    private void m3434a() {
        this.f5231c.setText(String.format(getResources().getString(2131165503), new Object[]{Long.valueOf(this.f5232d)}));
    }

    private void m3436b() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3436b();
    }

    protected void onResume() {
        super.onResume();
        m3436b();
    }

    protected void onStop() {
        super.onStop();
        if (this.f5233e != null) {
            this.f5233e.cancel();
        }
    }

    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new C08575(this), 2000);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if (iArr[0] != 0) {
                new Builder(this).setTitle(2131165473).setMessage(2131165474).setPositiveButton(2131165472, new C08597(this)).setNegativeButton(2131165432, new C08586(this)).show();
            } else if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 3);
            } else {
                m3439c();
            }
        } else if (i == 2) {
            if (iArr[0] != 0) {
                new Builder(this).setTitle(2131165473).setMessage(2131165518).setPositiveButton(2131165472, new C08619(this)).setNegativeButton(2131165432, new C08608(this)).show();
            } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 3);
            } else {
                m3439c();
            }
        } else if (i != 3) {
        } else {
            if (iArr[0] == 0) {
                m3439c();
            } else {
                new Builder(this).setTitle(2131165473).setMessage(2131165458).setPositiveButton(2131165472, new C08542(this)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                    final /* synthetic */ SplashActivity f5219a;

                    {
                        this.f5219a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f5219a.m3439c();
                    }
                }).show();
            }
        }
    }

    private void m3441d() {
        startService(new Intent(this, FakeForegroundService.class));
        if (SharedPreferencesManager.m4325c() || SharedPreferencesManager.m4339e()) {
            SharedPreferencesManager.m4303a(-1);
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(67108864);
            intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            startActivity(intent);
            finish();
            return;
        }
        Bundle bundle;
        if (SharedPreferencesManager.m4308b() == -1 || SharedPreferencesManager.m4389m() != 4) {
            if (SharedPreferencesManager.m4308b() != -1 && SharedPreferencesManager.m4389m() == 6) {
                AccessToken a = AccessToken.m883a();
                new StringBuilder("accessToken.getExpires():").append(a.f919a.getTime());
                String ac;
                if (a == null || a.m888b()) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4164f();
                    ForegroundService.f6510a = false;
                    ac = SharedPreferencesManager.ac();
                    SharedPreferencesManager.m4300a();
                    SharedPreferencesManager.m4379k(ac);
                    SharedPreferencesManager.m4354h();
                    DBManager.m3631a().m3633c();
                } else if (Profile.m2661a() == null) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4164f();
                    ForegroundService.f6510a = false;
                    ac = SharedPreferencesManager.ac();
                    SharedPreferencesManager.m4300a();
                    SharedPreferencesManager.m4379k(ac);
                    SharedPreferencesManager.m4354h();
                    DBManager.m3631a().m3633c();
                    LoginManager.m1842a();
                    LoginManager.m1847b();
                } else {
                    DBManager.m3631a();
                    SharedPreferencesManager.m4361i();
                    if (StringUtils.m4462a(SharedPreferencesManager.m4361i())) {
                        startActivity(new Intent(this, CompleteActivity.class));
                        finish();
                    } else if (SharedPreferencesManager.m4353g()) {
                        intent = new Intent(this, MainActivity.class);
                        intent.setFlags(67108864);
                        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                        intent.putExtra("returnTo", -1);
                        startActivity(intent);
                        finish();
                    } else {
                        intent = new Intent(this, GuideActivity.class);
                        intent.setFlags(67108864);
                        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                        bundle = new Bundle();
                        bundle.putBoolean("fromLogin", false);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        finish();
                    }
                }
            }
            RuntimeData.f6673d = true;
            if (SharedPreferencesManager.m4353g()) {
                intent = new Intent(this, LoginActivity.class);
                intent.setFlags(67108864);
                intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                startActivity(intent);
                finish();
            } else {
                intent = new Intent(this, GuideActivity.class);
                intent.setFlags(67108864);
                intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                bundle = new Bundle();
                bundle.putBoolean("fromLogin", true);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        } else {
            DBManager.m3631a();
            SharedPreferencesManager.m4361i();
            if (StringUtils.m4462a(SharedPreferencesManager.m4361i())) {
                startActivity(new Intent(this, CompleteActivity.class));
                finish();
            } else if (SharedPreferencesManager.m4353g()) {
                intent = new Intent(this, MainActivity.class);
                intent.setFlags(67108864);
                intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.putExtra("returnTo", -1);
                startActivity(intent);
                finish();
            } else {
                intent = new Intent(this, GuideActivity.class);
                intent.setFlags(67108864);
                intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                bundle = new Bundle();
                bundle.putBoolean("fromLogin", false);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        }
        overridePendingTransition(0, 0);
    }

    private void m3439c() {
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        long b = SplashPreferencesManager.m4448b();
        long c = SplashPreferencesManager.m4452c();
        CharSequence a = SplashPreferencesManager.m4440a();
        if (StringUtils.m4462a(a)) {
            m3441d();
        } else if (currentTimeMillis < b || currentTimeMillis > c) {
            m3441d();
        } else if (Utility.m4486b(SplashPreferencesManager.m4458e())) {
            m3441d();
        } else if (Utility.m4481a(Uri.parse(a))) {
            SplashPreferencesManager.m4457d(System.currentTimeMillis() + RuntimeData.f6671b);
            this.f5230b.setVisibility(8);
            this.f5231c.setVisibility(0);
            m3434a();
            this.f5235g = new C08553(this);
            this.f5234f = new C08564(this);
            this.f5233e = new Timer();
            this.f5233e.schedule(this.f5234f, 0, 1000);
        } else {
            m3441d();
        }
    }
}
