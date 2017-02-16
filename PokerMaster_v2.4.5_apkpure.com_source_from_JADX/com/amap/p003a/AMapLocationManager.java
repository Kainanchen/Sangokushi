package com.amap.p003a;

import a.does.not.Exists2;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.view.PointerIconCompat;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.amap.api.fence.Fence;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationClientOption.AMapLocationMode;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.APSService;
import com.amap.api.location.LocationManagerBase;
import com.illuminate.texaspoker.R.R;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.utils.AidTask;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.MessageKey;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.amap.a.a */
public class AMapLocationManager implements LocationManagerBase {
    public static boolean f26r;
    Callable<Messenger> f27A;
    boolean f28B;
    boolean f29C;
    JSONObject f30D;
    private int f31E;
    private boolean f32F;
    private Context f33G;
    private boolean f34H;
    private boolean f35I;
    private JSONArray f36J;
    private int f37K;
    private boolean f38L;
    private ServiceConnection f39M;
    private LinkedList<AMapLocationManager> f40N;
    private LinkedList<AMapLocationManager> f41O;
    private int f42P;
    private AMapLocation f43Q;
    AMapLocationClientOption f44a;
    public AMapLocationManager f45b;
    bx f46c;
    ArrayList<AMapLocationListener> f47d;
    bw f48e;
    boolean f49f;
    public boolean f50g;
    by f51h;
    Messenger f52i;
    Messenger f53j;
    Intent f54k;
    int f55l;
    boolean f56m;
    long f57n;
    AMapLocation f58o;
    long f59p;
    long f60q;
    ScheduledExecutorService f61s;
    AMapLocationManager f62t;
    AMapLocationManager f63u;
    ScheduledFuture<Messenger> f64v;
    ScheduledFuture<?> f65w;
    Future<?> f66x;
    int f67y;
    int f68z;

    /* renamed from: com.amap.a.a.1 */
    class AMapLocationManager implements Callable<Messenger> {
        final /* synthetic */ AMapLocationManager f10a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f10a = aMapLocationManager;
        }

        private Messenger m26a() {
            while (this.f10a.f52i == null) {
                try {
                    Thread.sleep(50);
                } catch (Throwable th) {
                }
            }
            return this.f10a.f52i;
        }

        public final /* synthetic */ Object call() {
            return m26a();
        }
    }

    /* renamed from: com.amap.a.a.2 */
    class AMapLocationManager implements ServiceConnection {
        final /* synthetic */ AMapLocationManager f11a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f11a = aMapLocationManager;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f11a.f52i = new Messenger(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f11a.f52i = null;
        }
    }

    /* renamed from: com.amap.a.a.3 */
    class AMapLocationManager implements OnClickListener {
        final /* synthetic */ AMapLocationManager f12a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f12a = aMapLocationManager;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12a.m56g();
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.amap.a.a.4 */
    class AMapLocationManager implements OnClickListener {
        final /* synthetic */ AMapLocationManager f13a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f13a = aMapLocationManager;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.amap.a.a.5 */
    static /* synthetic */ class AMapLocationManager {
        static final /* synthetic */ int[] f14a;

        static {
            f14a = new int[AMapLocationMode.values().length];
            try {
                f14a[AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f14a[AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f14a[AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: com.amap.a.a.a */
    static class AMapLocationManager {
        double f15a;
        double f16b;
        long f17c;
        float f18d;
        float f19e;
        int f20f;
        String f21g;

        static {
            fixHelper.fixfunc(new int[]{2706, 2707, 2708, 2709});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native AMapLocationManager(AMapLocation aMapLocation, int i);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();
    }

    /* renamed from: com.amap.a.a.b */
    class AMapLocationManager implements Runnable {
        final /* synthetic */ AMapLocationManager f22a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f22a = aMapLocationManager;
        }

        public final void run() {
            bx bxVar;
            try {
                bxVar = this.f22a.f46c;
                bxVar.f523d = this.f22a.f44a;
                long interval = bxVar.f523d.getInterval();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = bxVar.f521b.getMainLooper();
                }
                bxVar.f526g = interval;
                bxVar.f527h = bu.m477b();
                bxVar.f524e.f497a = bxVar.f527h;
                bxVar.f522c.requestLocationUpdates("gps", 1000, 0.0f, bxVar.f530k, myLooper);
            } catch (SecurityException e) {
                if (AMapLocationMode.Device_Sensors.equals(bxVar.f523d.getLocationMode())) {
                    Message obtain = Message.obtain();
                    AMapLocation aMapLocation = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
                    aMapLocation.setProvider("gps");
                    aMapLocation.setErrorCode(12);
                    aMapLocation.setLocationType(1);
                    obtain.what = 2;
                    obtain.obj = aMapLocation;
                    if (bxVar.f520a != null) {
                        bxVar.f520a.sendMessage(obtain);
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationManager$GPSTask", "run");
            }
        }
    }

    /* renamed from: com.amap.a.a.c */
    public static class AMapLocationManager extends Handler {
        AMapLocationManager f23a;
        AMapLocation f24b;

        public AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f23a = null;
            this.f24b = null;
            this.f23a = aMapLocationManager;
        }

        public AMapLocationManager(AMapLocationManager aMapLocationManager, Looper looper) {
            super(looper);
            this.f23a = null;
            this.f24b = null;
            this.f23a = aMapLocationManager;
        }

        public final void handleMessage(Message message) {
            AMapLocation aMapLocation;
            Throwable th;
            Throwable th2;
            AMapLocation aMapLocation2;
            Throwable th3 = null;
            super.handleMessage(message);
            if (this.f23a != null) {
                Message obtain;
                switch (message.what) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        try {
                            Bundle data = message.getData();
                            this.f23a.f31E = 0;
                            if (data != null) {
                                String string = data.getString("locationJson");
                                aMapLocation = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
                                bc.m329a(aMapLocation, new JSONObject(string));
                                this.f23a.f37K = data.getInt("originalLocType", 0);
                                try {
                                    if (aMapLocation.getErrorCode() == 0) {
                                        this.f24b = aMapLocation;
                                    }
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    bc.m330a(th3, "AMapLocationManager$MHandler", "handleMessage LBS_LOCATIONSUCCESS");
                                    AMapLocationManager.m36a(this.f23a, aMapLocation, th3);
                                }
                            }
                            aMapLocation = null;
                        } catch (Throwable th22) {
                            th = th22;
                            aMapLocation = null;
                            th3 = th;
                            bc.m330a(th3, "AMapLocationManager$MHandler", "handleMessage LBS_LOCATIONSUCCESS");
                            AMapLocationManager.m36a(this.f23a, aMapLocation, th3);
                        }
                        AMapLocationManager.m36a(this.f23a, aMapLocation, th3);
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        try {
                            aMapLocation = (AMapLocation) message.obj;
                            try {
                                this.f23a.f37K = aMapLocation.getLocationType();
                                if (aMapLocation.getErrorCode() == 0) {
                                    this.f23a.f31E = this.f23a.f31E + 1;
                                    this.f23a.f57n = bu.m477b();
                                    this.f23a.f56m = true;
                                }
                                aMapLocation2 = aMapLocation;
                                th22 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                aMapLocation2 = aMapLocation;
                                th22 = th;
                                bc.m330a(th22, "AMapLocationManager$MHandler", "handleMessage GPS_LOCATIONSUCCESS");
                                AMapLocationManager.m35a(this.f23a, aMapLocation2, this.f24b);
                                AMapLocationManager.m36a(this.f23a, aMapLocation2, th22);
                                if (!this.f23a.f38L) {
                                    this.f23a.m29a(7, null);
                                }
                            }
                        } catch (Throwable th6) {
                            th22 = th6;
                            aMapLocation2 = null;
                            bc.m330a(th22, "AMapLocationManager$MHandler", "handleMessage GPS_LOCATIONSUCCESS");
                            AMapLocationManager.m35a(this.f23a, aMapLocation2, this.f24b);
                            AMapLocationManager.m36a(this.f23a, aMapLocation2, th22);
                            if (!this.f23a.f38L) {
                                this.f23a.m29a(7, null);
                            }
                        }
                        AMapLocationManager.m35a(this.f23a, aMapLocation2, this.f24b);
                        AMapLocationManager.m36a(this.f23a, aMapLocation2, th22);
                        if (!this.f23a.f38L) {
                            this.f23a.m29a(7, null);
                        }
                    case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        this.f23a.f56m = false;
                    case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                        this.f23a.f57n = bu.m477b();
                        this.f23a.f56m = true;
                        if (message.obj != null) {
                            AMapLocationManager.m35a(this.f23a, (AMapLocation) message.obj, this.f24b);
                        }
                    case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                        try {
                            Bundle data2 = message.getData();
                            if (data2 != null) {
                                this.f23a.f67y = data2.getInt("lMaxGeoDis");
                                this.f23a.f68z = data2.getInt("lMinGeoDis");
                                String string2 = data2.getString("locationJson");
                                AMapLocation aMapLocation3 = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
                                bc.m329a(aMapLocation3, new JSONObject(string2));
                                this.f24b = aMapLocation3;
                            }
                        } catch (Throwable th222) {
                            bc.m330a(th222, "AMapLocationManager$MHandler", "handleMessage GPS_GEO_SUCCESS");
                        }
                    case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                        this.f23a.f38L = message.getData().getBoolean("ngpsAble");
                    case XGPushManager.OPERATION_REQ_REGISTER /*100*/:
                        try {
                            AMapLocationManager.m59i(this.f23a);
                        } catch (Throwable th2222) {
                            bc.m330a(th2222, "AMapLocationManager$MHandler", "handleMessage FASTSKY");
                        }
                    case R.AppCompatTheme_buttonStyleSmall /*103*/:
                        try {
                            AMapLocationManager.m33a(this.f23a, (Intent) message.obj);
                        } catch (Throwable th22222) {
                            bc.m330a(th22222, "AMapLocationManager$MHandler", "handleMessage START_SERVICE");
                        }
                    case AidTask.WHAT_LOAD_AID_ERR /*1002*/:
                        try {
                            AMapLocationManager.m37a(this.f23a, (AMapLocationListener) message.obj);
                        } catch (Throwable th222222) {
                            bc.m330a(th222222, "AMapLocationManage$MHandlerr", "handleMessage SET_LISTENER");
                        }
                    case PointerIconCompat.TYPE_HELP /*1003*/:
                        try {
                            AMapLocationManager.m60j(this.f23a);
                        } catch (Throwable th2222222) {
                            bc.m330a(th2222222, "AMapLocationManager$MHandler", "handleMessage START_LOCATION");
                        }
                    case PointerIconCompat.TYPE_WAIT /*1004*/:
                        try {
                            this.f23a.m57h();
                        } catch (Throwable th22222222) {
                            bc.m330a(th22222222, "AMapLocationManager$MHandler", "handleMessage STOP_LOCATION");
                        }
                    case 1005:
                        try {
                            AMapLocationManager.m46b(this.f23a, (AMapLocationListener) message.obj);
                        } catch (Throwable th222222222) {
                            bc.m330a(th222222222, "AMapLocationManager$MHandler", "handleMessage REMOVE_LISTENER");
                        }
                    case PointerIconCompat.TYPE_CELL /*1006*/:
                        try {
                            AMapLocationManager.m34a(this.f23a, (Fence) message.obj);
                        } catch (Throwable th2222222222) {
                            bc.m330a(th2222222222, "AMapLocationManager$MHandler", "handleMessage ADD_GEOFENCE");
                        }
                    case PointerIconCompat.TYPE_CROSSHAIR /*1007*/:
                        try {
                            AMapLocationManager.m32a(this.f23a, (PendingIntent) message.obj);
                        } catch (Throwable th22222222222) {
                            bc.m330a(th22222222222, "AMapLocationManager$MHandler", "handleMessage REMOVE_GEOFENCE");
                        }
                    case PointerIconCompat.TYPE_TEXT /*1008*/:
                        try {
                            obtain = Message.obtain();
                            obtain.what = 2;
                            if (this.f23a.f52i != null) {
                                this.f23a.f55l = 0;
                                this.f23a.f52i.send(obtain);
                                return;
                            }
                            AMapLocationManager aMapLocationManager = this.f23a;
                            aMapLocationManager.f55l++;
                            if (this.f23a.f55l < 10) {
                                this.f23a.f45b.sendEmptyMessageDelayed(PointerIconCompat.TYPE_TEXT, 50);
                            }
                        } catch (Throwable th222222222222) {
                            bc.m330a(th222222222222, "AMapLocationManager$MHandler", "handleMessage START_SOCKET");
                        }
                    case PointerIconCompat.TYPE_VERTICAL_TEXT /*1009*/:
                        try {
                            obtain = Message.obtain();
                            obtain.what = 3;
                            if (this.f23a.f52i != null) {
                                this.f23a.f52i.send(obtain);
                            }
                        } catch (Throwable th2222222222222) {
                            bc.m330a(th2222222222222, "AMapLocationManager$MHandler", "handleMessage STOP_SOCKET");
                        }
                    case PointerIconCompat.TYPE_ALIAS /*1010*/:
                        try {
                            AMapLocationManager.m45b(this.f23a, (Fence) message.obj);
                        } catch (Throwable th22222222222222) {
                            bc.m330a(th22222222222222, "AMapLocationManager$MHandler", "handleMessage REMOVE_GEOFENCE_ONE");
                        }
                    case PointerIconCompat.TYPE_COPY /*1011*/:
                        try {
                            AMapLocationManager.m62l(this.f23a);
                            this.f23a = null;
                        } catch (Throwable th222222222222222) {
                            bc.m330a(th222222222222222, "AMapLocationManager$MHandler", "handleMessage DESTROY");
                        }
                    default:
                }
            }
        }
    }

    /* renamed from: com.amap.a.a.d */
    class AMapLocationManager implements Runnable {
        final /* synthetic */ AMapLocationManager f25a;

        AMapLocationManager(AMapLocationManager aMapLocationManager) {
            this.f25a = aMapLocationManager;
        }

        public final void run() {
            try {
                if (this.f25a.m52e() || !this.f25a.f56m) {
                    if (this.f25a.f50g) {
                        AMapLocationManager.m44b(this.f25a);
                    }
                    if (this.f25a.m40a()) {
                        this.f25a.f34H = true;
                        Bundle bundle = new Bundle();
                        bundle.putString("extraJson", bc.m327a(this.f25a.f44a, this.f25a.f33G).toString());
                        if (this.f25a.f50g) {
                            this.f25a.m29a(0, bundle);
                        } else {
                            this.f25a.m29a(1, bundle);
                        }
                    }
                    this.f25a.f50g = false;
                    return;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationManager$NetWorkTask", "run");
            }
        }
    }

    static {
        f26r = false;
    }

    public AMapLocationManager(Context context, Intent intent) {
        this.f31E = 0;
        this.f32F = false;
        this.f46c = null;
        this.f34H = false;
        this.f35I = true;
        this.f47d = new ArrayList();
        this.f49f = false;
        this.f50g = true;
        this.f52i = null;
        this.f53j = null;
        this.f54k = null;
        this.f55l = 0;
        this.f56m = false;
        this.f57n = 0;
        this.f58o = null;
        this.f59p = 0;
        this.f60q = 0;
        this.f61s = Executors.newScheduledThreadPool(3);
        this.f62t = null;
        this.f63u = null;
        this.f64v = null;
        this.f65w = null;
        this.f66x = null;
        this.f36J = null;
        this.f37K = 0;
        this.f38L = true;
        this.f67y = 240;
        this.f68z = 80;
        this.f27A = new AMapLocationManager(this);
        this.f39M = new AMapLocationManager(this);
        this.f40N = new LinkedList();
        this.f41O = new LinkedList();
        this.f42P = 0;
        this.f43Q = null;
        this.f28B = false;
        this.f29C = false;
        this.f30D = null;
        this.f33G = context;
        this.f54k = intent;
        if (bc.m336c()) {
            try {
                bs.m443a(this.f33G, bc.m324a("loc", "3.0.0"));
            } catch (Throwable th) {
            }
        }
        if (Looper.myLooper() == null) {
            this.f45b = new AMapLocationManager(this, this.f33G.getMainLooper());
        } else {
            this.f45b = new AMapLocationManager(this);
        }
        Message obtain = Message.obtain();
        obtain.what = R.AppCompatTheme_buttonStyleSmall;
        obtain.obj = this.f54k;
        this.f45b.sendMessage(obtain);
        try {
            if (this.f64v == null || this.f64v.isCancelled()) {
                this.f64v = this.f61s.schedule(this.f27A, 0, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            bc.m330a(th2, "AMapLocationManager", "doGetServiceMessengerFuture");
        }
        this.f51h = new by(this.f33G);
        this.f53j = new Messenger(this.f45b);
        this.f46c = new bx(this.f33G, this.f45b);
        try {
            this.f48e = new bw(this.f33G);
        } catch (Throwable th22) {
            bc.m330a(th22, "AMapLocationManager", "init");
        }
        this.f62t = new AMapLocationManager(this);
        this.f63u = new AMapLocationManager(this);
    }

    private static AMapLocationManager m28a(AMapLocation aMapLocation, int i) {
        return new AMapLocationManager(aMapLocation, i);
    }

    private void m29a(int i, Bundle bundle) {
        try {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.setData(bundle);
            obtain.replyTo = this.f53j;
            if (this.f52i != null) {
                this.f52i.send(obtain);
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "sendLocMessage");
        }
    }

    private void m30a(long j) {
        try {
            if (this.f65w == null || this.f65w.isCancelled()) {
                this.f65w = this.f61s.scheduleAtFixedRate(this.f62t, j, this.f44a.getInterval(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "startNetLocationTask");
        }
    }

    private void m38a(at atVar, boolean z) {
        try {
            if (!this.f29C) {
                Object apikey = AMapLocationClientOption.getAPIKEY();
                if (!TextUtils.isEmpty(apikey)) {
                    cc.m533a(apikey);
                }
                this.f29C = true;
                this.f30D = bc.m327a(this.f44a, this.f33G);
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "initAPS part3");
            return;
        }
        atVar.m244a(this.f30D);
        if (z) {
            atVar.m246a(this.f33G);
        } else {
            atVar.m248b(this.f33G);
        }
    }

    private void m39a(AMapLocation aMapLocation) {
        try {
            if ("gps".equals(aMapLocation.getProvider()) || m52e()) {
                Iterator it = this.f47d.iterator();
                while (it.hasNext()) {
                    try {
                        ((AMapLocationListener) it.next()).onLocationChanged(aMapLocation);
                    } catch (Throwable th) {
                    }
                }
            }
        } catch (Throwable th2) {
        }
    }

    private boolean m40a() {
        try {
            if (!(this.f64v == null || this.f64v.isDone() || this.f64v.isCancelled())) {
                this.f52i = (Messenger) this.f64v.get(5000, TimeUnit.MILLISECONDS);
            }
            if (this.f64v != null) {
                this.f64v.cancel(true);
                this.f64v = null;
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "checkAPSManager");
            return false;
        }
        if (this.f52i != null) {
            return true;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        AMapLocation aMapLocation = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
        aMapLocation.setErrorCode(10);
        aMapLocation.setLocationDetail("\u8bf7\u68c0\u67e5\u914d\u7f6e\u6587\u4ef6\u662f\u5426\u914d\u7f6e\u670d\u52a1");
        bundle.putString("locationJson", aMapLocation.toStr(1));
        obtain.setData(bundle);
        obtain.what = 1;
        if (this.f45b != null) {
            this.f45b.sendMessage(obtain);
        }
        return false;
    }

    private void m43b() {
        try {
            if (!this.f44a.getLocationMode().equals(AMapLocationMode.Hight_Accuracy)) {
                m49d();
            }
            if (this.f66x == null || this.f66x.isCancelled()) {
                this.f66x = this.f61s.submit(this.f63u);
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "deviceSensorsLocation");
        }
    }

    private void m47c() {
        try {
            if (this.f66x != null) {
                this.f66x.cancel(false);
                this.f66x = null;
            }
            bx bxVar = this.f46c;
            if (bxVar.f522c != null) {
                if (bxVar.f530k != null) {
                    bxVar.f522c.removeUpdates(bxVar.f530k);
                }
                bxVar.f527h = 0;
                bxVar.f528i = false;
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "stopGPSLocationTask");
        }
    }

    private void m49d() {
        try {
            if (this.f65w != null) {
                this.f65w.cancel(false);
                this.f65w = null;
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "stopNetLocationTask");
        }
    }

    private boolean m52e() {
        return bu.m477b() - this.f57n > 10000;
    }

    private synchronized void m54f() {
        try {
            if (bn.m415o()) {
                if (this.f36J != null && this.f36J.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("detail", this.f36J);
                    ap.m182a(new ao(this.f33G, bc.m324a("loc", "3.0.0"), jSONObject.toString()), this.f33G);
                    this.f36J = null;
                }
            }
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "writeOfflineLog");
        }
    }

    private void m56g() {
        Intent intent;
        try {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.autonavi.minimap", bn.m412l()));
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.setData(Uri.parse(bn.m410j()));
            this.f33G.startActivity(intent);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "callAMap part2");
        }
    }

    private void m57h() {
        try {
            m47c();
            m49d();
            this.f40N.clear();
            this.f41O.clear();
            m54f();
            this.f56m = false;
            this.f35I = true;
            this.f57n = 0;
            this.f55l = 0;
            this.f58o = null;
            this.f59p = 0;
            this.f32F = false;
            this.f42P = 0;
            this.f31E = 0;
            this.f43Q = null;
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "stopLocation");
        }
    }

    static /* synthetic */ void m62l(AMapLocationManager aMapLocationManager) {
        aMapLocationManager.f50g = true;
        aMapLocationManager.f34H = false;
        aMapLocationManager.m57h();
        aMapLocationManager.f51h.m512b();
        aMapLocationManager.f51h = null;
        if (aMapLocationManager.f48e != null) {
            aMapLocationManager.f48e.f518b.clear();
        }
        if (aMapLocationManager.f39M != null) {
            aMapLocationManager.f33G.unbindService(aMapLocationManager.f39M);
        }
        if (aMapLocationManager.f47d != null) {
            aMapLocationManager.f47d.clear();
            aMapLocationManager.f47d = null;
        }
        if (aMapLocationManager.f64v != null) {
            aMapLocationManager.f64v.cancel(true);
            aMapLocationManager.f64v = null;
        }
        aMapLocationManager.f61s.shutdownNow();
        aMapLocationManager.f39M = null;
        if (aMapLocationManager.f45b != null) {
            aMapLocationManager.f45b.removeCallbacksAndMessages(null);
        }
    }

    public void addGeoFenceAlert(String str, double d, double d2, float f, long j, PendingIntent pendingIntent) {
        try {
            Message obtain = Message.obtain();
            Fence fence = new Fence();
            fence.f734b = str;
            fence.f736d = d;
            fence.f735c = d2;
            fence.f737e = f;
            fence.f733a = pendingIntent;
            fence.m757a(j);
            obtain.obj = fence;
            obtain.what = PointerIconCompat.TYPE_CELL;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "addGeoFenceAlert");
        }
    }

    public AMapLocation getLastKnownLocation() {
        AMapLocation aMapLocation = null;
        try {
            aMapLocation = this.f51h.m510a();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "getLastKnownLocation");
        }
        return aMapLocation;
    }

    public boolean isStarted() {
        return this.f34H;
    }

    public void onDestroy() {
        try {
            Message obtain = Message.obtain();
            obtain.what = PointerIconCompat.TYPE_COPY;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "onDestroy");
        }
    }

    public void removeGeoFenceAlert(PendingIntent pendingIntent) {
        try {
            Message obtain = Message.obtain();
            obtain.obj = pendingIntent;
            obtain.what = PointerIconCompat.TYPE_CROSSHAIR;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "removeGeoFenceAlert 2");
        }
    }

    public void removeGeoFenceAlert(PendingIntent pendingIntent, String str) {
        try {
            Message obtain = Message.obtain();
            Fence fence = new Fence();
            fence.f734b = str;
            fence.f733a = pendingIntent;
            obtain.obj = fence;
            obtain.what = PointerIconCompat.TYPE_ALIAS;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "removeGeoFenceAlert 1");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            try {
                throw new IllegalArgumentException("listener\u53c2\u6570\u4e0d\u80fd\u4e3anull");
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationManager", "setLocationListener");
                return;
            }
        }
        Message obtain = Message.obtain();
        obtain.what = AidTask.WHAT_LOAD_AID_ERR;
        obtain.obj = aMapLocationListener;
        this.f45b.sendMessage(obtain);
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (!(this.f35I || this.f44a == null || this.f44a.getInterval() == aMapLocationClientOption.getInterval())) {
                this.f44a = aMapLocationClientOption.clone();
                m49d();
                m47c();
                m30a(0);
                if (!this.f44a.getLocationMode().equals(AMapLocationMode.Battery_Saving)) {
                    m43b();
                }
            }
            this.f44a = aMapLocationClientOption.clone();
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "setLocationOption");
        }
    }

    public void startAssistantLocation() {
        try {
            Message obtain = Message.obtain();
            obtain.what = PointerIconCompat.TYPE_TEXT;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "startAssistantLocation");
        }
    }

    public void startLocation() {
        try {
            Message obtain = Message.obtain();
            obtain.what = PointerIconCompat.TYPE_HELP;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "startLocation");
        }
    }

    public void stopAssistantLocation() {
        try {
            Message obtain = Message.obtain();
            obtain.what = PointerIconCompat.TYPE_VERTICAL_TEXT;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "stopAssistantLocation");
        }
    }

    public void stopLocation() {
        try {
            Message obtain = Message.obtain();
            obtain.what = PointerIconCompat.TYPE_WAIT;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "stopLocation");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            Message obtain = Message.obtain();
            obtain.what = 1005;
            obtain.obj = aMapLocationListener;
            this.f45b.sendMessage(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "AMapLocationManager", "unRegisterLocationListener");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m44b(com.amap.p003a.AMapLocationManager r8) {
        /*
        r2 = 1;
        r0 = 0;
        r3 = new com.amap.a.bq;	 Catch:{ Throwable -> 0x0090 }
        r3.<init>();	 Catch:{ Throwable -> 0x0090 }
        r1 = 0;
        r4 = com.amap.p003a.bu.m477b();	 Catch:{ Throwable -> 0x0090 }
        r3.f497a = r4;	 Catch:{ Throwable -> 0x0090 }
        r4 = new com.amap.a.at;	 Catch:{ Throwable -> 0x0090 }
        r4.<init>();	 Catch:{ Throwable -> 0x0090 }
        r5 = r8.f44a;	 Catch:{ Throwable -> 0x0090 }
        r5 = r5.isLocationCacheEnable();	 Catch:{ Throwable -> 0x0090 }
        if (r5 == 0) goto L_0x0023;
    L_0x001b:
        r5 = 1;
        r8.m38a(r4, r5);	 Catch:{ Throwable -> 0x0090 }
        r1 = r4.m256h();	 Catch:{ Throwable -> 0x0087 }
    L_0x0023:
        if (r1 == 0) goto L_0x002b;
    L_0x0025:
        r5 = com.amap.p003a.bu.m471a(r1);	 Catch:{ Throwable -> 0x0090 }
        if (r5 != 0) goto L_0x0035;
    L_0x002b:
        r5 = 0;
        r8.m38a(r4, r5);	 Catch:{ Throwable -> 0x0090 }
        r5 = 0;
        r1 = r4.m242a(r5);	 Catch:{ Throwable -> 0x0099 }
        r0 = r2;
    L_0x0035:
        r6 = com.amap.p003a.bu.m477b();	 Catch:{ Throwable -> 0x0090 }
        r3.f498b = r6;	 Catch:{ Throwable -> 0x0090 }
        r3.f499c = r1;	 Catch:{ Throwable -> 0x0090 }
        r2 = android.os.Message.obtain();	 Catch:{ Throwable -> 0x0090 }
        r5 = new android.os.Bundle;	 Catch:{ Throwable -> 0x0090 }
        r5.<init>();	 Catch:{ Throwable -> 0x0090 }
        if (r1 == 0) goto L_0x00a2;
    L_0x0048:
        r6 = "originalLocType";
        r7 = r1.getLocationType();	 Catch:{ Throwable -> 0x0090 }
        r5.putInt(r6, r7);	 Catch:{ Throwable -> 0x0090 }
        r6 = "locationJson";
        r7 = 1;
        r7 = r1.toStr(r7);	 Catch:{ Throwable -> 0x0090 }
        r5.putString(r6, r7);	 Catch:{ Throwable -> 0x0090 }
    L_0x005b:
        r2.setData(r5);	 Catch:{ Throwable -> 0x0090 }
        r5 = 1;
        r2.what = r5;	 Catch:{ Throwable -> 0x0090 }
        r5 = r8.f45b;	 Catch:{ Throwable -> 0x0090 }
        if (r5 == 0) goto L_0x006a;
    L_0x0065:
        r5 = r8.f45b;	 Catch:{ Throwable -> 0x0090 }
        r5.sendMessage(r2);	 Catch:{ Throwable -> 0x0090 }
    L_0x006a:
        r2 = r8.f33G;	 Catch:{ Throwable -> 0x00bc }
        com.amap.p003a.br.m432a(r2, r3);	 Catch:{ Throwable -> 0x00bc }
    L_0x006f:
        if (r0 == 0) goto L_0x0083;
    L_0x0071:
        r0 = 0;
        r8.m38a(r4, r0);	 Catch:{ Throwable -> 0x00a9 }
        r0 = 1;
        r0 = r4.m242a(r0);	 Catch:{ Throwable -> 0x00a9 }
    L_0x007a:
        r1 = r0.getErrorCode();	 Catch:{ Throwable -> 0x0090 }
        if (r1 != 0) goto L_0x0083;
    L_0x0080:
        r4.m243a(r0);	 Catch:{ Throwable -> 0x00b3 }
    L_0x0083:
        r4.m249c();	 Catch:{ Throwable -> 0x0090 }
    L_0x0086:
        return;
    L_0x0087:
        r5 = move-exception;
        r6 = "AMapLocationManager";
        r7 = "doAPSLocation:doFirstCacheLocate";
        com.amap.p003a.bc.m330a(r5, r6, r7);	 Catch:{ Throwable -> 0x0090 }
        goto L_0x0023;
    L_0x0090:
        r0 = move-exception;
        r1 = "AMapLocationManager";
        r2 = "doAPSLocation";
        com.amap.p003a.bc.m330a(r0, r1, r2);
        goto L_0x0086;
    L_0x0099:
        r2 = move-exception;
        r5 = "AMapLocationManager";
        r6 = "doAPSLocation:doFirstNetLocate";
        com.amap.p003a.bc.m330a(r2, r5, r6);	 Catch:{ Throwable -> 0x0090 }
        goto L_0x0035;
    L_0x00a2:
        r6 = "originalLocType";
        r7 = 0;
        r5.putInt(r6, r7);	 Catch:{ Throwable -> 0x0090 }
        goto L_0x005b;
    L_0x00a9:
        r0 = move-exception;
        r2 = "AMapLocationManager";
        r3 = "doAPSLocation:doFirstNetLocate 2";
        com.amap.p003a.bc.m330a(r0, r2, r3);	 Catch:{ Throwable -> 0x0090 }
        r0 = r1;
        goto L_0x007a;
    L_0x00b3:
        r0 = move-exception;
        r1 = "AMapLocationManager";
        r2 = "doAPSLocation:doFirstAddCache";
        com.amap.p003a.bc.m330a(r0, r1, r2);	 Catch:{ Throwable -> 0x0090 }
        goto L_0x0083;
    L_0x00bc:
        r2 = move-exception;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.a.b(com.amap.a.a):void");
    }

    static /* synthetic */ void m36a(AMapLocationManager aMapLocationManager, AMapLocation aMapLocation, Throwable th) {
        try {
            if (!bc.m336c() || aMapLocation != null) {
                AMapLocation aMapLocation2;
                if (aMapLocation == null) {
                    aMapLocation2 = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
                    aMapLocation2.setErrorCode(8);
                } else {
                    aMapLocation2 = aMapLocation;
                }
                if (!"gps".equals(aMapLocation2.getProvider())) {
                    aMapLocation2.setProvider("lbs");
                }
                if (aMapLocationManager.f48e != null) {
                    bw bwVar = aMapLocationManager.f48e;
                    if (!bwVar.f518b.isEmpty()) {
                        Iterator it = bwVar.f518b.entrySet().iterator();
                        while (it != null && it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            Iterator it2 = ((ArrayList) entry.getValue()).iterator();
                            while (it2.hasNext()) {
                                Fence fence = (Fence) it2.next();
                                if (!bw.m505a(fence)) {
                                    float a = bu.m459a(new double[]{fence.f736d, fence.f735c, aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
                                    float accuracy = aMapLocation2.getAccuracy();
                                    if (accuracy >= 500.0f) {
                                        accuracy = a - (fence.f737e + 500.0f);
                                    } else {
                                        accuracy = a - (accuracy + fence.f737e);
                                    }
                                    Object obj = null;
                                    if (accuracy > 0.0f) {
                                        if (fence.f738f != 0) {
                                            obj = 1;
                                        }
                                        fence.f738f = 0;
                                    } else {
                                        if (fence.f738f != 1) {
                                            obj = 1;
                                        }
                                        fence.f738f = 1;
                                    }
                                    if (obj != null) {
                                        switch (fence.f738f) {
                                            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                                                fence.f739g = -1;
                                                if ((fence.m756a() & 2) != 2) {
                                                    break;
                                                }
                                                bwVar.m506a((PendingIntent) entry.getKey(), fence, 2);
                                                break;
                                            case SQLiteDatabase.OPEN_READONLY /*1*/:
                                                fence.f739g = bu.m477b();
                                                if ((fence.m756a() & 1) != 1) {
                                                    break;
                                                }
                                                bwVar.m506a((PendingIntent) entry.getKey(), fence, 1);
                                                break;
                                            default:
                                                break;
                                        }
                                    } else if ((fence.m756a() & 4) == 4 && fence.f739g > 0 && bu.m477b() - fence.f739g > fence.m759c()) {
                                        fence.f739g = bu.m477b();
                                        bwVar.m506a((PendingIntent) entry.getKey(), fence, 4);
                                    }
                                }
                            }
                        }
                    }
                }
                try {
                    if (!aMapLocationManager.f35I) {
                        Object obj2;
                        long time = aMapLocation2.getTime();
                        if (aMapLocation2.getErrorCode() == 0) {
                            AMapLocation aMapLocation3;
                            AMapLocation aMapLocation4 = aMapLocationManager.f58o;
                            aMapLocationManager.f43Q = aMapLocation2;
                            long b = bu.m477b();
                            obj2 = null;
                            aMapLocationManager.f60q = 0;
                            aMapLocationManager.f42P = 0;
                            if (aMapLocation4 == null || aMapLocation2 == null || aMapLocation4.getLocationType() != 1 || aMapLocationManager.f31E <= 3 || aMapLocation2.getAccuracy() < 0.0f || aMapLocation2.getSpeed() < 0.0f) {
                                if (aMapLocation2.getAccuracy() < 0.0f) {
                                    aMapLocation2.setAccuracy(0.0f);
                                }
                                if (aMapLocation2.getSpeed() < 0.0f) {
                                    aMapLocation2.setSpeed(0.0f);
                                }
                                aMapLocation3 = aMapLocation2;
                            } else {
                                long time2 = aMapLocation2.getTime() - aMapLocation4.getTime();
                                if (time2 >= 0) {
                                    if (aMapLocation2.getLocationType() == 1) {
                                        if (b - aMapLocationManager.f59p < 5000) {
                                            if (bu.m459a(new double[]{aMapLocation4.getLatitude(), aMapLocation4.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()}) > ((((aMapLocation4.getSpeed() + aMapLocation2.getSpeed()) * ((float) time2)) / 2000.0f) + (2.0f * (aMapLocation4.getAccuracy() + aMapLocation2.getAccuracy()))) + 3000.0f) {
                                                obj2 = 1;
                                            }
                                        } else {
                                            aMapLocationManager.f31E = 0;
                                        }
                                    }
                                    if (obj2 != null) {
                                        if (aMapLocationManager.f60q == 0) {
                                            aMapLocationManager.f60q = bu.m477b();
                                        }
                                        if (b - aMapLocationManager.f60q < StatisticConfig.MIN_UPLOAD_INTERVAL) {
                                            aMapLocationManager.f32F = true;
                                            aMapLocationManager.f42P = 1;
                                            aMapLocation3 = aMapLocation4;
                                        }
                                    }
                                }
                                aMapLocation3 = aMapLocation2;
                            }
                            AMapLocationManager a2 = AMapLocationManager.m28a(aMapLocation3, aMapLocationManager.f42P);
                            AMapLocationManager a3 = AMapLocationManager.m28a(aMapLocationManager.f43Q, aMapLocationManager.f42P);
                            if (aMapLocationManager.f32F) {
                                if (aMapLocationManager.f42P == 0) {
                                    if (!(aMapLocationManager.f40N.contains(a2) || aMapLocationManager.f41O.contains(a2))) {
                                        aMapLocationManager.f41O.add(a2);
                                    }
                                } else if (!aMapLocationManager.f41O.contains(a3)) {
                                    aMapLocationManager.f41O.add(a3);
                                }
                            } else if (!aMapLocationManager.f40N.contains(a2)) {
                                if (aMapLocationManager.f40N.size() >= 5) {
                                    aMapLocationManager.f40N.removeFirst();
                                }
                                aMapLocationManager.f40N.add(a2);
                            }
                            if (aMapLocationManager.f40N.size() + aMapLocationManager.f41O.size() >= 10) {
                                aMapLocationManager.f40N.addAll(aMapLocationManager.f41O);
                                StringBuffer stringBuffer = new StringBuffer();
                                Iterator it3 = aMapLocationManager.f40N.iterator();
                                while (it3.hasNext()) {
                                    stringBuffer.append(((AMapLocationManager) it3.next()).toString());
                                    stringBuffer.append("#");
                                }
                                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                                br.m437a("gpsstatistics", stringBuffer.toString());
                                aMapLocationManager.f40N.clear();
                                aMapLocationManager.f41O.clear();
                                aMapLocationManager.f32F = false;
                            }
                        }
                        aMapLocationManager.f59p = bu.m477b();
                        aMapLocationManager.f58o = aMapLocation2;
                        aMapLocation2.setTime(time);
                        aMapLocationManager.m39a(aMapLocation2);
                        aMapLocationManager.f51h.m511a(aMapLocation2);
                        try {
                            if (bn.m415o()) {
                                int i = 0;
                                switch (aMapLocationManager.f37K) {
                                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                                        obj2 = 1;
                                        i = 0;
                                        break;
                                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                    case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                                    case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                                        obj2 = 1;
                                        i = 1;
                                        break;
                                    default:
                                        obj2 = null;
                                        break;
                                }
                                if (obj2 != null) {
                                    if (aMapLocationManager.f36J == null) {
                                        aMapLocationManager.f36J = new JSONArray();
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("lon", aMapLocation2.getLongitude());
                                    jSONObject.put("lat", aMapLocation2.getLatitude());
                                    jSONObject.put(MessageKey.MSG_TYPE, i);
                                    jSONObject.put("timestamp", bu.m464a());
                                    aMapLocationManager.f36J = aMapLocationManager.f36J.put(jSONObject);
                                    if (aMapLocationManager.f36J.length() >= 10) {
                                        aMapLocationManager.m54f();
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            bc.m330a(th2, "AMapLocationManager", "handlerOfflineLog");
                        }
                        br.m431a(aMapLocationManager.f33G, aMapLocationManager.f37K, aMapLocation2);
                    }
                } catch (Throwable th22) {
                    bc.m330a(th22, "AMapLocationManager", "handlerLocation part2");
                }
                bs.m445b(aMapLocationManager.f33G);
                if (aMapLocationManager.f44a.isOnceLocation()) {
                    aMapLocationManager.stopLocation();
                }
            } else if (th != null) {
                bs.m444a(aMapLocationManager.f33G, "loc", th.getMessage());
            } else {
                bs.m444a(aMapLocationManager.f33G, "loc", "amaplocation is null");
            }
        } catch (Throwable th222) {
            bc.m330a(th222, "AMapLocationManager", "handlerLocation part3");
        }
    }

    static /* synthetic */ void m35a(AMapLocationManager aMapLocationManager, AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        Bundle bundle = null;
        if (aMapLocation != null) {
            bundle = new Bundle();
            bundle.putDouble("lat", aMapLocation.getLatitude());
            bundle.putDouble("lon", aMapLocation.getLongitude());
        }
        if (aMapLocationManager.f44a.isNeedAddress() && aMapLocation2 == null) {
            aMapLocationManager.m29a(10, bundle);
        } else if (aMapLocation2 != null && aMapLocationManager.f44a.isNeedAddress()) {
            float a = bu.m459a(new double[]{aMapLocation2.getLatitude(), aMapLocation2.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()});
            if (a < ((float) aMapLocationManager.f67y)) {
                bc.m325a(aMapLocation, aMapLocation2);
            }
            if (a > ((float) aMapLocationManager.f68z)) {
                aMapLocationManager.m29a(10, bundle);
            }
        }
    }

    static /* synthetic */ void m59i(AMapLocationManager aMapLocationManager) {
        Object obj = 1;
        Object obj2 = null;
        try {
            if (aMapLocationManager.f33G.checkCallingOrSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == 0) {
                obj2 = 1;
            } else if (aMapLocationManager.f33G instanceof Activity) {
                int i = 1;
                obj = null;
            } else {
                obj = null;
            }
            if (obj2 != null) {
                Builder builder = new Builder(aMapLocationManager.f33G);
                builder.setMessage(bn.m404g());
                if (!(LetterIndexBar.SEARCH_ICON_LETTER.equals(bn.m406h()) || bn.m406h() == null)) {
                    builder.setPositiveButton(bn.m406h(), new AMapLocationManager(aMapLocationManager));
                }
                builder.setNegativeButton(bn.m408i(), new AMapLocationManager(aMapLocationManager));
                AlertDialog create = builder.create();
                if (obj != null) {
                    create.getWindow().setType(2003);
                }
                create.setCanceledOnTouchOutside(false);
                create.show();
                return;
            }
            aMapLocationManager.m56g();
        } catch (Throwable th) {
            aMapLocationManager.m56g();
            bc.m330a(th, "AMapLocationManager", "showDialog");
        }
    }

    static /* synthetic */ void m33a(AMapLocationManager aMapLocationManager, Intent intent) {
        String str;
        if (intent == null) {
            try {
                intent = new Intent(aMapLocationManager.f33G, APSService.class);
            } catch (Throwable th) {
                bc.m330a(th, "AMapLocationManager", "startServiceImpl");
                return;
            }
        }
        String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        str = !TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()) ? AMapLocationClientOption.getAPIKEY() : cb.m523f(aMapLocationManager.f33G);
        intent.putExtra("a", str);
        intent.putExtra("b", aMapLocationManager.f33G.getPackageName());
        aMapLocationManager.f33G.bindService(intent, aMapLocationManager.f39M, 1);
    }

    static /* synthetic */ void m37a(AMapLocationManager aMapLocationManager, AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener == null) {
            throw new IllegalArgumentException("listener\u53c2\u6570\u4e0d\u80fd\u4e3anull");
        }
        if (aMapLocationManager.f47d == null) {
            aMapLocationManager.f47d = new ArrayList();
        }
        if (!aMapLocationManager.f47d.contains(aMapLocationListener)) {
            aMapLocationManager.f47d.add(aMapLocationListener);
        }
    }

    static /* synthetic */ void m46b(AMapLocationManager aMapLocationManager, AMapLocationListener aMapLocationListener) {
        if (!aMapLocationManager.f47d.isEmpty() && aMapLocationManager.f47d.contains(aMapLocationListener)) {
            aMapLocationManager.f47d.remove(aMapLocationListener);
        }
        if (aMapLocationManager.f47d.isEmpty()) {
            aMapLocationManager.stopLocation();
        }
    }

    static /* synthetic */ void m60j(AMapLocationManager aMapLocationManager) {
        long j = 0;
        if (aMapLocationManager.f44a == null) {
            aMapLocationManager.f44a = new AMapLocationClientOption();
        }
        aMapLocationManager.f35I = false;
        switch (AMapLocationManager.f14a[aMapLocationManager.f44a.getLocationMode().ordinal()]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                try {
                    aMapLocationManager.m47c();
                    aMapLocationManager.m30a(0);
                } catch (Throwable th) {
                    bc.m330a(th, "AMapLocationManager", "batterySavingLocaiton");
                }
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                aMapLocationManager.m43b();
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                try {
                    aMapLocationManager.m43b();
                    if (aMapLocationManager.f44a.isGpsFirst()) {
                        j = StatisticConfig.MIN_UPLOAD_INTERVAL;
                    }
                    aMapLocationManager.m30a(j);
                } catch (Throwable th2) {
                    bc.m330a(th2, "AMapLocationManager", "hightAccuracyLocation");
                }
            default:
        }
    }

    static /* synthetic */ void m34a(AMapLocationManager aMapLocationManager, Fence fence) {
        if (fence != null && aMapLocationManager.f48e != null) {
            bw bwVar = aMapLocationManager.f48e;
            PendingIntent pendingIntent = fence.f733a;
            if (pendingIntent != null && fence != null && !TextUtils.isEmpty(fence.f734b) && fence.f737e >= 100.0f && fence.f737e <= 10000.0f) {
                if ((bwVar.f518b.isEmpty() || bwVar.f518b.containsKey(pendingIntent)) && fence.m756a() != 0 && fence.m756a() <= 7) {
                    Iterator it = bwVar.f518b.entrySet().iterator();
                    int i = 0;
                    while (it != null && it.hasNext()) {
                        i = ((ArrayList) ((Entry) it.next()).getValue()).size() + i;
                    }
                    if (i <= 20) {
                        fence.f738f = -1;
                        ArrayList arrayList;
                        if (bwVar.f518b.isEmpty()) {
                            arrayList = new ArrayList();
                            arrayList.add(fence);
                            bwVar.f518b.put(pendingIntent, arrayList);
                            return;
                        }
                        arrayList = (ArrayList) bwVar.f518b.get(pendingIntent);
                        Fence fence2 = null;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Fence fence3 = (Fence) it2.next();
                            if (!fence3.f734b.equals(fence.f734b)) {
                                fence3 = fence2;
                            }
                            fence2 = fence3;
                        }
                        if (fence2 != null) {
                            arrayList.remove(fence2);
                        }
                        arrayList.add(fence);
                        bwVar.f518b.put(pendingIntent, arrayList);
                    }
                }
            }
        }
    }

    static /* synthetic */ void m32a(AMapLocationManager aMapLocationManager, PendingIntent pendingIntent) {
        if (pendingIntent != null && aMapLocationManager.f48e != null) {
            bw bwVar = aMapLocationManager.f48e;
            if (pendingIntent != null && bwVar.f518b.containsKey(pendingIntent)) {
                bwVar.f518b.remove(pendingIntent);
            }
        }
    }

    static /* synthetic */ void m45b(AMapLocationManager aMapLocationManager, Fence fence) {
        if (fence != null && aMapLocationManager.f48e != null) {
            bw bwVar = aMapLocationManager.f48e;
            PendingIntent pendingIntent = fence.f733a;
            CharSequence charSequence = fence.f734b;
            if (pendingIntent != null && bwVar.f518b.containsKey(pendingIntent) && !TextUtils.isEmpty(charSequence)) {
                List arrayList = new ArrayList();
                arrayList.add(charSequence);
                bwVar.m507a(pendingIntent, arrayList);
            }
        }
    }
}
