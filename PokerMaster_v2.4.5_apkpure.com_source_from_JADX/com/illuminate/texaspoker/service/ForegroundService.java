package com.illuminate.texaspoker.service;

import android.app.Notification.Builder;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.IBinder;
import android.provider.ContactsContract.Contacts;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p060e.p062b.PushManager;
import com.illuminate.texaspoker.tea.TEAUtil;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.api.share.WeiboShareSDK;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public class ForegroundService extends Service {
    public static boolean f6510a;
    public static float f6511b;
    private static ContentObserver f6512f;
    private C0910a f6513c;
    private TEAUtil f6514d;
    private BroadcastReceiver f6515e;

    /* renamed from: com.illuminate.texaspoker.service.ForegroundService.1 */
    class C09081 extends BroadcastReceiver {
        final /* synthetic */ ForegroundService f6508a;

        C09081(ForegroundService foregroundService) {
            this.f6508a = foregroundService;
        }

        public final void onReceive(Context context, Intent intent) {
            ForegroundService.f6511b = ((float) intent.getIntExtra("level", 0)) / 100.0f;
        }
    }

    /* renamed from: com.illuminate.texaspoker.service.ForegroundService.2 */
    static class C09092 extends ContentObserver {
        C09092(Handler handler) {
            super(handler);
        }

        public final void onChange(boolean z) {
            if (SharedPreferencesManager.m4308b() != -1) {
                DBManager.m3631a();
                if (Utility.m4494d()) {
                    Utility.m4498e();
                }
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.service.ForegroundService.a */
    private class C0910a extends BroadcastReceiver {
        final /* synthetic */ ForegroundService f6509a;

        private C0910a(ForegroundService foregroundService) {
            this.f6509a = foregroundService;
        }

        public final void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("NOTIFY_NAME");
            List list = (List) intent.getSerializableExtra("NOTIFY_DATA");
            if (stringExtra.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
                if (((Integer) list.get(0)).intValue() != ERROR_CODE_TYPE.ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR.getNumber() && SharedPreferencesManager.m4308b() != -1 && !RuntimeData.f6673d) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4161e();
                }
            } else if (stringExtra.equalsIgnoreCase("NOTIFY_QUICK_LOGIN_SUCCESS")) {
                ForegroundService.m4012a();
            } else if (!stringExtra.equalsIgnoreCase("NOTIFY_QUICK_LOGIN_FAULT")) {
                if (stringExtra.equalsIgnoreCase("NOTIFY_LOGIN_SUCCESS")) {
                    ForegroundService.m4012a();
                } else if (stringExtra.equalsIgnoreCase("NOTIFY_UPLOAD_VERIFY_CODE_SUCCESS")) {
                    ForegroundService.m4012a();
                }
            }
        }
    }

    public ForegroundService() {
        this.f6515e = new C09081(this);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        startForeground(999997, new Builder(BaseApplication.m3548a()).setWhen(System.currentTimeMillis()).getNotification());
        stopService(new Intent(this, FakeForegroundService.class));
        PushManager.m3930a().m3932b();
        PushManager.m3930a().m3933c();
        return 1;
    }

    public void onCreate() {
        try {
            System.loadLibrary(getPackageManager().getApplicationInfo(getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString("android.app.lib_name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f6514d = new TEAUtil();
        this.f6513c = new C0910a();
        ShareUtil a = ShareUtil.m4248a();
        if (a.f6696a == null) {
            a.f6696a = WXAPIFactory.createWXAPI(BaseApplication.m3548a(), "wxc373d29b97145fd3", true);
        }
        a.f6696a.registerApp("wxc373d29b97145fd3");
        a = ShareUtil.m4248a();
        if (a.f6697b == null) {
            a.f6697b = WeiboShareSDK.createWeiboAPI(BaseApplication.m3548a(), "4099207092");
        }
        a.f6697b.registerApp();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.illuminate.texaspoker.notifyaction");
        registerReceiver(this.f6513c, intentFilter);
        registerReceiver(this.f6515e, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        getContentResolver().registerContentObserver(Contacts.CONTENT_URI, true, f6512f);
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        unregisterReceiver(this.f6513c);
        unregisterReceiver(this.f6515e);
        getContentResolver().unregisterContentObserver(f6512f);
        PushManager.m3930a().m3935e();
    }

    static {
        f6512f = new C09092(new Handler());
    }

    static void m4012a() {
        NetworkUtil.m4073a();
        NetworkUtil.m4178m();
        f6510a = true;
        NetworkUtil.m4073a();
        NetworkUtil.m4166g();
        NetworkUtil.m4073a();
        NetworkUtil.m4192t();
        NetworkUtil.m4073a();
        NetworkUtil.m4176l();
        NetworkUtil.m4073a();
        NetworkUtil.m4168h();
        NetworkUtil.m4073a();
        NetworkUtil.m4134b(0, 0);
        NetworkUtil.m4073a();
        NetworkUtil.m4170i();
        NetworkUtil.m4073a();
        NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
        NetworkUtil.m4073a();
        NetworkUtil.m4186q();
        NetworkUtil.m4073a();
        NetworkUtil.m4182o();
        NetworkUtil.m4073a();
        NetworkUtil.m4180n();
        NetworkUtil.m4073a();
        NetworkUtil.m4190s();
        if (Utility.m4494d()) {
            Utility.m4498e();
        }
    }
}
