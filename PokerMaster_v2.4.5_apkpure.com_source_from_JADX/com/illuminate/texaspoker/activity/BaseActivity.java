package com.illuminate.texaspoker.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.BuyinControlMsg;
import com.texaspoker.moment.TexasPoker.SCBuyinControlMsg;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.activity.a */
public abstract class BaseActivity extends Activity {
    private static String f3537c;
    public LoadingDialog f3538a;
    BaseActivity f3539b;
    private NotificationManager f3540d;

    /* renamed from: com.illuminate.texaspoker.activity.a.1 */
    class BaseActivity implements OnClickListener {
        final /* synthetic */ BaseActivity f5323a;

        BaseActivity(BaseActivity baseActivity) {
            this.f5323a = baseActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.a.2 */
    class BaseActivity implements OnClickListener {
        final /* synthetic */ BuyinControlMsg f5324a;
        final /* synthetic */ BaseActivity f5325b;

        BaseActivity(BaseActivity baseActivity, BuyinControlMsg buyinControlMsg) {
            this.f5325b = baseActivity;
            this.f5324a = buyinControlMsg;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(this.f5324a.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.a.3 */
    class BaseActivity implements OnClickListener {
        final /* synthetic */ BaseActivity f5326a;

        BaseActivity(BaseActivity baseActivity) {
            this.f5326a = baseActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.a.a */
    private class BaseActivity extends BroadcastReceiver {
        final /* synthetic */ BaseActivity f5327a;

        private BaseActivity(BaseActivity baseActivity) {
            this.f5327a = baseActivity;
        }

        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("NOTIFY_NAME");
            List list = (List) intent.getSerializableExtra("NOTIFY_DATA");
            if (stringExtra.equalsIgnoreCase("NOTIFY_GAME_ROOM_buyinControlMsg_rsp")) {
                BaseActivity.m2744a(this.f5327a, ((SCBuyinControlMsg) list.get(0)).getStBuyinControlMsg());
            }
            this.f5327a.m2745a(stringExtra, list);
        }
    }

    public abstract void m2745a(String str, List<Object> list);

    static {
        f3537c = "BaseActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        this.f3540d = (NotificationManager) getSystemService("notification");
    }

    protected void onPause() {
        unregisterReceiver(this.f3539b);
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
        this.f3540d.cancel(100);
        this.f3539b = new BaseActivity();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.illuminate.texaspoker.notifyaction");
        registerReceiver(this.f3539b, intentFilter);
        super.onResume();
    }

    protected void onStop() {
        super.onStop();
        if (this.f3538a != null) {
            this.f3538a.dismiss();
        }
    }

    static /* synthetic */ void m2744a(BaseActivity baseActivity, BuyinControlMsg buyinControlMsg) {
        if (buyinControlMsg.getEBuyinControlMessageTypeDeny() == BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_ACCEPT) {
            BaseApplication.f5509b.m3213e();
            Intent intent = new Intent(baseActivity, MainActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("returnTo", -1);
            baseActivity.startActivity(intent);
            baseActivity.overridePendingTransition(2131034127, 2131034127);
            new Builder(BaseApplication.f5509b).setTitle(buyinControlMsg.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName()).setMessage(2131165429).setPositiveButton(2131165449, new BaseActivity(baseActivity, buyinControlMsg)).setNegativeButton(2131165432, new BaseActivity(baseActivity)).create().show();
        } else if (buyinControlMsg.getEBuyinControlMessageTypeDeny() == BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DENY) {
            new Builder(baseActivity).setTitle(buyinControlMsg.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName()).setMessage(String.format(baseActivity.getResources().getString(2131165430), new Object[]{buyinControlMsg.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName()})).setPositiveButton(2131165438, new BaseActivity(baseActivity)).create().show();
        }
    }
}
