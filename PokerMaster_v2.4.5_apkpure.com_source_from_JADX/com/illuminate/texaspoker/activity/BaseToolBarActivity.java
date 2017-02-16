package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
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
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.fixHelper;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.swipback.SwipeBackActivity;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.BuyinControlMsg;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.activity.d */
public abstract class BaseToolBarActivity extends SwipeBackActivity {
    private static String f3522d;
    BaseToolBarActivity f3523a;
    public LoadingDialog f3524b;
    RelativeLayout f3525c;
    private NotificationManager f3526e;

    /* renamed from: com.illuminate.texaspoker.activity.d.1 */
    class BaseToolBarActivity implements OnClickListener {
        final /* synthetic */ BaseToolBarActivity f5334a;

        static {
            fixHelper.fixfunc(new int[]{3166, 3167});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.d.2 */
    class BaseToolBarActivity implements OnClickListener {
        final /* synthetic */ BaseToolBarActivity f5335a;

        static {
            fixHelper.fixfunc(new int[]{3199, 3200});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.d.3 */
    class BaseToolBarActivity implements OnClickListener {
        final /* synthetic */ BuyinControlMsg f5336a;
        final /* synthetic */ BaseToolBarActivity f5337b;

        static {
            fixHelper.fixfunc(new int[]{3024, 3025});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity, BuyinControlMsg buyinControlMsg);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.d.4 */
    class BaseToolBarActivity implements OnClickListener {
        final /* synthetic */ BaseToolBarActivity f5338a;

        static {
            fixHelper.fixfunc(new int[]{3041, 3042});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.d.a */
    private class BaseToolBarActivity extends BroadcastReceiver {
        final /* synthetic */ BaseToolBarActivity f5339a;

        static {
            fixHelper.fixfunc(new int[]{702, 703, 704});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity);

        native /* synthetic */ BaseToolBarActivity(BaseToolBarActivity baseToolBarActivity, byte b);

        public final native void onReceive(Context context, Intent intent);
    }

    protected abstract void m2733a(String str, List<Object> list);

    static {
        f3522d = "BaseToolBarActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        this.f3526e = (NotificationManager) getSystemService("notification");
    }

    protected void onPause() {
        unregisterReceiver(this.f3523a);
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
        this.f3526e.cancel(100);
        if (SharedPreferencesManager.m4325c()) {
            m2728a(2131165514, 2131165721);
        }
        if (SharedPreferencesManager.m4339e()) {
            m2728a(2131165488, 2131165487);
        }
        this.f3523a = new BaseToolBarActivity();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.illuminate.texaspoker.notifyaction");
        registerReceiver(this.f3523a, intentFilter);
        super.onResume();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(2131034127, 2131034127);
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(2131034126, 2131034126);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        overridePendingTransition(2131034126, 2131034126);
    }

    protected void m2734b() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f3524b != null && this.f3524b.isShowing()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected final int m2735c() {
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

    public final void m2732a(int i, int i2, int i3) {
        if (this.f3525c == null) {
            this.f3525c = (RelativeLayout) LayoutInflater.from(this).inflate(2130968833, null);
        }
        ((ImageView) this.f3525c.findViewById(2131559415)).setImageResource(i);
        ((TextView) this.f3525c.findViewById(2131559416)).setText(i2);
        Toast toast = new Toast(this);
        toast.setGravity(17, 0, 0);
        toast.setDuration(i3);
        toast.setView(this.f3525c);
        toast.show();
    }

    private void m2728a(int i, int i2) {
        new Builder(this).setTitle(i).setMessage(i2).setPositiveButton(2131165438, new BaseToolBarActivity(this)).setCancelable(false).create().show();
    }

    static /* synthetic */ void m2731a(BaseToolBarActivity baseToolBarActivity, BuyinControlMsg buyinControlMsg) {
        if (buyinControlMsg.getEBuyinControlMessageTypeDeny() == BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_ACCEPT) {
            BaseApplication.f5509b.m3213e();
            Intent intent = new Intent(baseToolBarActivity, MainActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("returnTo", -1);
            baseToolBarActivity.startActivity(intent);
            baseToolBarActivity.overridePendingTransition(2131034127, 2131034127);
            new Builder(BaseApplication.f5509b).setTitle(2131165514).setMessage(String.format(baseToolBarActivity.getResources().getString(2131165429), new Object[]{buyinControlMsg.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName()})).setPositiveButton(2131165449, new BaseToolBarActivity(baseToolBarActivity, buyinControlMsg)).setNegativeButton(2131165432, new BaseToolBarActivity(baseToolBarActivity)).create().show();
        } else if (buyinControlMsg.getEBuyinControlMessageTypeDeny() == BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DENY) {
            new Builder(baseToolBarActivity).setTitle(2131165514).setMessage(String.format(baseToolBarActivity.getResources().getString(2131165430), new Object[]{buyinControlMsg.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName()})).setPositiveButton(2131165438, new BaseToolBarActivity(baseToolBarActivity)).create().show();
        }
    }

    static /* synthetic */ void m2729a(BaseToolBarActivity baseToolBarActivity) {
        ForegroundService.f6510a = false;
        String ac = SharedPreferencesManager.ac();
        SharedPreferencesManager.m4300a();
        SharedPreferencesManager.m4379k(ac);
        SharedPreferencesManager.m4354h();
        DBManager.m3631a().m3633c();
        Intent intent = new Intent(baseToolBarActivity, SplashActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        baseToolBarActivity.startActivity(intent);
        baseToolBarActivity.overridePendingTransition(0, 0);
    }
}
