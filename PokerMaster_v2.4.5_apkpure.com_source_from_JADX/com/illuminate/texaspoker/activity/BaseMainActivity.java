package com.illuminate.texaspoker.activity;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPokerHttp.SCUpdateRsp;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.activity.c */
public abstract class BaseMainActivity extends AppCompatActivity {
    private static String f4215c;
    BaseMainActivity f4216a;
    protected LoadingDialog f4217b;
    private NotificationManager f4218d;
    private RelativeLayout f4219e;

    /* renamed from: com.illuminate.texaspoker.activity.c.1 */
    class BaseMainActivity implements OnClickListener {
        final /* synthetic */ BaseMainActivity f5332a;

        BaseMainActivity(BaseMainActivity baseMainActivity) {
            this.f5332a = baseMainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            BaseMainActivity.m3011a(this.f5332a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.c.a */
    private class BaseMainActivity extends BroadcastReceiver {
        final /* synthetic */ BaseMainActivity f5333a;

        private BaseMainActivity(BaseMainActivity baseMainActivity) {
            this.f5333a = baseMainActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("NOTIFY_NAME");
            List list = (List) intent.getSerializableExtra("NOTIFY_DATA");
            if (stringExtra.equalsIgnoreCase("NOTIFY_KICK_OUT_PUSH")) {
                this.f5333a.m3010a(2131165514, 2131165721);
            } else if (stringExtra.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
                Integer num = (Integer) list.get(0);
                if (num.intValue() == 27) {
                    this.f5333a.m3010a(2131165514, 2131165721);
                } else if (num.intValue() == 73) {
                    this.f5333a.m3010a(2131165488, 2131165487);
                }
            } else if (stringExtra.equalsIgnoreCase("NOTIFY_UPDATE_RESULT")) {
                Utility.m4476a(this.f5333a, (SCUpdateRsp) list.get(0));
            }
            this.f5333a.m3015a(stringExtra, list);
        }
    }

    protected abstract void m3015a(String str, List<Object> list);

    static {
        f4215c = "BaseToolBarActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        this.f4218d = (NotificationManager) getSystemService("notification");
    }

    protected void onPause() {
        unregisterReceiver(this.f4216a);
        super.onPause();
    }

    protected void onStart() {
        super.onStart();
        if (ContextCompat.checkSelfPermission(BaseApplication.m3548a(), "android.permission.READ_PHONE_STATE") != 0 || ContextCompat.checkSelfPermission(BaseApplication.m3548a(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Intent intent = new Intent(this, SplashActivity.class);
            intent.setFlags(268468224);
            startActivity(intent);
            Process.killProcess(Process.myPid());
            overridePendingTransition(0, 0);
        }
    }

    protected void onResume() {
        this.f4218d.cancel(100);
        if (SharedPreferencesManager.m4325c()) {
            m3010a(2131165514, 2131165721);
        }
        if (SharedPreferencesManager.m4339e()) {
            m3010a(2131165488, 2131165487);
        }
        this.f4216a = new BaseMainActivity();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.illuminate.texaspoker.notifyaction");
        registerReceiver(this.f4216a, intentFilter);
        super.onResume();
    }

    protected final void m3013a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f4217b != null && this.f4217b.isShowing()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected final int m3016b() {
        int i;
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = getWindow().getDecorView().getRootView().getHeight() - rect.bottom;
        if (VERSION.SDK_INT >= 20) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            if (i > i2) {
                i -= i2;
            } else {
                i = 0;
            }
            i = height - i;
        } else {
            i = height;
        }
        if (i > 210 && SharedPreferencesManager.m4296a(getResources()) != i) {
            SharedPreferencesManager.m4384l(i);
        }
        return i;
    }

    public final void m3014a(int i) {
        if (this.f4219e == null) {
            this.f4219e = (RelativeLayout) LayoutInflater.from(this).inflate(2130968833, null);
        }
        ((ImageView) this.f4219e.findViewById(2131559415)).setImageResource(2130903246);
        ((TextView) this.f4219e.findViewById(2131559416)).setText(i);
        Toast toast = new Toast(this);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(this.f4219e);
        toast.show();
    }

    private void m3010a(int i, int i2) {
        new Builder(this).setTitle(i).setMessage(i2).setPositiveButton(2131165438, new BaseMainActivity(this)).setCancelable(false).create().show();
    }

    static /* synthetic */ void m3011a(BaseMainActivity baseMainActivity) {
        ForegroundService.f6510a = false;
        String ac = SharedPreferencesManager.ac();
        SharedPreferencesManager.m4300a();
        SharedPreferencesManager.m4354h();
        SharedPreferencesManager.m4379k(ac);
        DBManager.m3631a().m3633c();
        Intent intent = new Intent(baseMainActivity, SplashActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        baseMainActivity.startActivity(intent);
        baseMainActivity.overridePendingTransition(0, 0);
    }
}
