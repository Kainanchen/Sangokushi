package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.APSServiceBase;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* compiled from: APSServiceCore */
/* renamed from: com.amap.a.ab */
public class ab implements APSServiceBase {
    boolean f89A;
    volatile Socket f90B;
    boolean f91C;
    APSServiceCore f92D;
    private volatile boolean f93E;
    private int f94F;
    private boolean f95G;
    private boolean f96H;
    private boolean f97I;
    private boolean f98J;
    private boolean f99K;
    private boolean f100L;
    private boolean f101M;
    private long f102N;
    private long f103O;
    private at f104P;
    private boolean f105Q;
    private String f106R;
    Context f107a;
    boolean f108b;
    boolean f109c;
    Messenger f110d;
    String f111e;
    Messenger f112f;
    APSServiceCore f113g;
    APSServiceCore f114h;
    Vector<Messenger> f115i;
    Vector<Messenger> f116j;
    Vector<Messenger> f117k;
    ExecutorService f118l;
    Future<?> f119m;
    AMapLocation f120n;
    APSServiceCore f121o;
    boolean f122p;
    volatile boolean f123q;
    boolean f124r;
    Object f125s;
    AMapLocationServer f126t;
    long f127u;
    long f128v;
    volatile int f129w;
    JSONObject f130x;
    AMapLocation f131y;
    volatile ServerSocket f132z;

    /* renamed from: com.amap.a.ab.a */
    class APSServiceCore implements Runnable {
        double f81a;
        double f82b;
        final /* synthetic */ ab f83c;

        static {
            fixHelper.fixfunc(new int[]{419, 420});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native APSServiceCore(ab abVar);

        public final native void run();
    }

    /* renamed from: com.amap.a.ab.b */
    class APSServiceCore extends Thread {
        final /* synthetic */ ab f84a;

        static {
            fixHelper.fixfunc(new int[]{242, 243});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native APSServiceCore(ab abVar);

        public final native void run();
    }

    /* renamed from: com.amap.a.ab.c */
    class APSServiceCore extends Handler {
        ab f85a;
        final /* synthetic */ ab f86b;
        private String f87c;

        static {
            fixHelper.fixfunc(new int[]{91, 92});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native APSServiceCore(ab abVar, ab abVar2);

        public final native void handleMessage(Message message);
    }

    /* renamed from: com.amap.a.ab.d */
    class APSServiceCore extends Thread {
        final /* synthetic */ ab f88a;

        static {
            fixHelper.fixfunc(new int[]{43, 44});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native APSServiceCore(ab abVar);

        public final native void run();
    }

    public ab(Context context) {
        this.f108b = false;
        this.f109c = false;
        this.f110d = null;
        this.f93E = false;
        this.f111e = null;
        this.f113g = new APSServiceCore(this, this);
        this.f114h = null;
        this.f115i = new Vector();
        this.f116j = new Vector();
        this.f117k = new Vector();
        this.f94F = 0;
        this.f95G = false;
        this.f96H = false;
        this.f97I = false;
        this.f98J = false;
        this.f99K = false;
        this.f100L = false;
        this.f101M = false;
        this.f102N = 0;
        this.f103O = 0;
        this.f118l = Executors.newCachedThreadPool();
        this.f119m = null;
        this.f120n = null;
        this.f121o = new APSServiceCore(this);
        this.f104P = null;
        this.f122p = false;
        this.f123q = false;
        this.f124r = false;
        this.f125s = new Object();
        this.f127u = bu.m477b();
        this.f128v = 0;
        this.f105Q = true;
        this.f106R = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f129w = 0;
        this.f130x = null;
        this.f132z = null;
        this.f89A = false;
        this.f90B = null;
        this.f91C = false;
        this.f107a = context.getApplicationContext();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.os.Messenger m72a(java.util.Vector<android.os.Messenger> r5, android.os.Bundle r6, int r7) {
        /*
        r0 = 0;
        if (r5 == 0) goto L_0x002c;
    L_0x0003:
        r1 = r5.size();	 Catch:{ Throwable -> 0x0024 }
        if (r1 <= 0) goto L_0x002c;
    L_0x0009:
        r1 = r5.size();	 Catch:{ Throwable -> 0x0024 }
        r2 = r1;
        r1 = r0;
    L_0x000f:
        if (r2 <= 0) goto L_0x0032;
    L_0x0011:
        r0 = 0;
        r0 = r5.get(r0);	 Catch:{ Throwable -> 0x002d }
        r0 = (android.os.Messenger) r0;	 Catch:{ Throwable -> 0x002d }
        com.amap.p003a.ab.m74a(r0, r7, r6);	 Catch:{ Throwable -> 0x0024 }
        r1 = 0;
        r5.remove(r1);	 Catch:{ Throwable -> 0x0024 }
        r1 = r2 + -1;
        r2 = r1;
        r1 = r0;
        goto L_0x000f;
    L_0x0024:
        r1 = move-exception;
    L_0x0025:
        r2 = "APSServiceCore";
        r3 = "reciveLoc";
        com.amap.p003a.bc.m330a(r1, r2, r3);
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = move-exception;
        r4 = r0;
        r0 = r1;
        r1 = r4;
        goto L_0x0025;
    L_0x0032:
        r0 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.ab.a(java.util.Vector, android.os.Bundle, int):android.os.Messenger");
    }

    private static void m74a(Messenger messenger, int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.setData(bundle);
        obtain.what = i;
        try {
            messenger.send(obtain);
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "sendMessage");
        }
    }

    private static AMapLocationServer m83b(int i, String str) {
        try {
            AMapLocationServer aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
            aMapLocationServer.setErrorCode(i);
            aMapLocationServer.setLocationDetail(str);
            return aMapLocationServer;
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    private boolean m84c() {
        boolean z;
        synchronized (this.f125s) {
            z = this.f123q;
        }
        return z;
    }

    private void m86d() {
        try {
            bc.m328a(this.f107a);
            if (this.f130x == null) {
                this.f130x = bc.m327a(null, this.f107a);
            }
            this.f93E = true;
            this.f104P.m244a(this.f130x);
            this.f104P.m250c(this.f107a);
        } catch (Throwable th) {
            this.f106R = th.getMessage();
            this.f105Q = false;
            bc.m330a(th, "APSServiceCore", "doInit");
        }
    }

    static /* synthetic */ void m96m(ab abVar) {
        if (abVar.f98J) {
            abVar.f103O = bu.m477b();
            abVar.f98J = false;
            abVar.f104P.m247b();
        }
        if (abVar.f99K) {
            abVar.f99K = false;
            abVar.f104P.m247b();
        }
        if (abVar.f100L) {
            abVar.f100L = false;
            abVar.f104P.m247b();
        }
        if (abVar.f101M && bn.m390a(abVar.f107a, abVar.f102N)) {
            abVar.f102N = bu.m464a();
            abVar.f101M = false;
            abVar.f104P.m247b();
        }
    }

    public final synchronized void m101a() {
        try {
            if (!this.f91C) {
                this.f92D = new APSServiceCore(this);
                this.f92D.start();
                this.f91C = true;
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "startSocket");
        }
    }

    public final synchronized void m102b() {
        try {
            if (this.f132z != null) {
                this.f132z.close();
            }
            if (this.f90B != null) {
                this.f90B.close();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "stopScocket");
        }
        this.f132z = null;
        this.f92D = null;
        this.f91C = false;
        this.f89A = false;
    }

    public IBinder onBind(Intent intent) {
        Object stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            cc.m533a(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("b");
        this.f122p = "true".equals(intent.getStringExtra("as"));
        if (this.f122p && this.f113g != null) {
            this.f113g.sendEmptyMessageDelayed(9, 100);
        }
        cb.m517a(stringExtra2);
        this.f112f = new Messenger(this.f113g);
        return this.f112f.getBinder();
    }

    public void onCreate() {
        try {
            this.f104P = new at();
            this.f111e = this.f107a.getApplicationContext().getPackageName();
            this.f123q = true;
            this.f114h = new APSServiceCore(this);
            this.f114h.setName("serviceThread");
            this.f114h.start();
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "onCreate");
        }
    }

    public void onDestroy() {
        try {
            synchronized (this.f125s) {
                this.f123q = false;
                this.f125s.notify();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "onDestroy");
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 0;
    }

    static /* synthetic */ void m79a(ab abVar, JSONObject jSONObject) {
        try {
            if (abVar.f104P != null) {
                abVar.f104P.m244a(jSONObject);
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "setExtra");
        }
    }

    static /* synthetic */ void m88e(ab abVar) {
        try {
            if (!abVar.f93E) {
                abVar.m86d();
            }
        } catch (Throwable th) {
            abVar.f105Q = false;
            abVar.f106R = th.getMessage();
            bc.m330a(th, "APSServiceCore", "init");
        }
    }

    static /* synthetic */ void m95l(ab abVar) {
        try {
            abVar.f104P.m251d(abVar.f107a);
            if (bn.m416p()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("ngpsAble", bn.m418r());
                ab.m72a(abVar.f117k, bundle, 7);
                bn.m417q();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "initAuth");
        }
    }

    static /* synthetic */ void m80a(ab abVar, boolean z, Context context) {
        try {
            abVar.f104P.m245a(z, context);
        } catch (Throwable th) {
        }
    }

    static /* synthetic */ void m77a(ab abVar, Messenger messenger) {
        try {
            if (bn.m399d(abVar.f107a)) {
                if (messenger == null && !abVar.f115i.isEmpty()) {
                    messenger = (Messenger) abVar.f115i.get(0);
                }
                if (messenger != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 100;
                    messenger.send(obtain);
                }
            }
            if (bn.m388a(abVar.f103O) && !abVar.f97I && abVar.f126t != null && (abVar.f129w == 2 || abVar.f129w == 4)) {
                abVar.f98J = true;
                abVar.f97I = true;
            }
            if (bn.m387a() && !abVar.f95G) {
                abVar.f95G = true;
                abVar.f113g.sendEmptyMessage(4);
            }
            if (bn.m396c() && bn.m398d() > 2 && !abVar.f96H) {
                abVar.f96H = true;
                abVar.f113g.sendEmptyMessage(5);
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "checkConfig");
        }
    }

    static /* synthetic */ void m97n(ab abVar) {
        int i = 1;
        try {
            if (abVar.f104P != null) {
                at atVar = abVar.f104P;
                if (bn.m421u()) {
                    Context context = atVar.f247a;
                    if (atVar.f249c == null && !atVar.f258l) {
                        cj a = bc.m324a("Collection", "1.0.0");
                        atVar.f258l = br.m438a(context, a);
                        if (atVar.f258l) {
                            int i2;
                            atVar.f249c = InstanceFactory.m717a(context, a, atVar.f256j, null, new Class[]{Context.class}, new Object[]{context});
                            if (atVar.f249c == null) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            br.m434a(context, "Collertor", i2);
                        } else {
                            atVar.f258l = true;
                        }
                    }
                }
                if (!atVar.f263q || !bn.m421u() || atVar.m253e() || !atVar.m252d()) {
                    return;
                }
                if (bn.m421u()) {
                    int i3;
                    if (bu.m473a(atVar.f248b, "coll")) {
                        try {
                            if (atVar.f248b.getString("coll").equals("0")) {
                                i3 = 0;
                                if (i3 == 0) {
                                    atVar.m255g();
                                    return;
                                } else if (!atVar.m253e()) {
                                    try {
                                        atVar.m254f();
                                        try {
                                            bp.m426a(atVar.f249c, MessageKey.MSG_ACCEPT_TIME_START, new Object[0]);
                                        } catch (Throwable th) {
                                            i = 0;
                                        }
                                        if (atVar.f247a != null && !at.f217r) {
                                            atVar.f260n = true;
                                            br.m440b(atVar.f247a, "Collertor", i);
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        bc.m330a(th2, "APS", "start3rdCM");
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Throwable th22) {
                            bc.m330a(th22, "APS", "start3rdCM");
                        }
                    }
                    i3 = 1;
                    if (i3 == 0) {
                        atVar.m255g();
                        return;
                    } else if (!atVar.m253e()) {
                        atVar.m254f();
                        bp.m426a(atVar.f249c, MessageKey.MSG_ACCEPT_TIME_START, new Object[0]);
                        if (atVar.f247a != null) {
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                atVar.m255g();
            }
        } catch (Throwable th222) {
            bc.m330a(th222, "APSServiceCore", "startColl");
        }
    }

    static /* synthetic */ void m98o(ab abVar) {
        try {
            abVar.m102b();
            if (abVar.f119m != null) {
                abVar.f119m.cancel(true);
            }
            abVar.f93E = false;
            abVar.f95G = false;
            abVar.f96H = false;
            abVar.f94F = 0;
            abVar.f104P.m249c();
            abVar.f115i.clear();
            abVar.f116j.clear();
            abVar.f117k.clear();
            cp.m657a();
            if (abVar.f108b) {
                Process.killProcess(Process.myPid());
            }
            if (abVar.f113g != null) {
                abVar.f113g.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            bc.m330a(th, "APSServiceCore", "threadDestroy");
        }
    }

    static /* synthetic */ void m76a(ab abVar, double d, double d2) {
        if (abVar.f104P != null) {
            abVar.f120n = abVar.f104P.m241a(d, d2);
            Bundle bundle = new Bundle();
            bundle.putString("locationJson", abVar.f120n.toStr(1));
            bundle.putInt("lMaxGeoDis", bn.m425y() * 3);
            bundle.putInt("lMinGeoDis", bn.m425y());
            ab.m72a(abVar.f116j, bundle, 6);
        }
    }

    static /* synthetic */ void m78a(ab abVar, Socket socket) {
        BufferedReader bufferedReader;
        Throwable th;
        PrintStream printStream;
        PrintStream printStream2;
        String str = null;
        int i = 0;
        if (socket != null) {
            int i2 = 30000;
            try {
                String str2 = "jsonp1";
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), GameManager.DEFAULT_CHARSET));
                    String readLine = bufferedReader.readLine();
                    if (readLine != null && readLine.length() > 0) {
                        String[] split = readLine.split(" ");
                        if (split != null && split.length > 1) {
                            split = split[1].split("\\?");
                            if (split != null && split.length > 1) {
                                split = split[1].split("&");
                                if (split != null && split.length > 0) {
                                    String str3 = str2;
                                    int i3 = 30000;
                                    String str4 = str3;
                                    while (i < split.length) {
                                        try {
                                            String[] split2 = split[i].split("=");
                                            if (split2 != null && split2.length > 1) {
                                                if ("to".equals(split2[0])) {
                                                    i3 = Integer.parseInt(split2[1]);
                                                }
                                                if ("callback".equals(split2[0])) {
                                                    str4 = split2[1];
                                                }
                                            }
                                            i++;
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            str2 = str4;
                                            th = th3;
                                        }
                                    }
                                    str3 = str4;
                                    i2 = i3;
                                    str2 = str3;
                                }
                            }
                        }
                    }
                    try {
                        i = bc.f351e;
                        bc.f351e = i2;
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((abVar.f131y == null || currentTimeMillis - abVar.f131y.getTime() > 5000) && !bu.m492d(abVar.f107a)) {
                            abVar.f131y = abVar.f104P.m240a();
                            if (abVar.f131y.getErrorCode() != 0) {
                                str = str2 + "&&" + str2 + "({'package':'" + abVar.f111e + "','error_code':" + abVar.f131y.getErrorCode() + ",'error':'" + abVar.f131y.getErrorInfo() + "'})";
                            }
                            bc.f351e = i;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            str = str2 + "&&" + str2 + "({'package':'" + abVar.f111e + "','error_code':1,'error':'params error'})";
                            bc.m330a(th, "APSServiceCore", "invoke part2");
                            try {
                                printStream = new PrintStream(socket.getOutputStream(), true, GameManager.DEFAULT_CHARSET);
                                printStream.println("HTTP/1.0 200 OK");
                                printStream.println("Content-Length:" + str.getBytes(GameManager.DEFAULT_CHARSET).length);
                                printStream.println();
                                printStream.println(str);
                                printStream.close();
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th5) {
                                    bc.m330a(th5, "APSServiceCore", "invoke part4");
                                    return;
                                }
                            } catch (Throwable th52) {
                                bc.m330a(th52, "APSServiceCore", "invoke part4");
                                return;
                            }
                        } catch (Throwable th6) {
                            th52 = th6;
                            try {
                                printStream2 = new PrintStream(socket.getOutputStream(), true, GameManager.DEFAULT_CHARSET);
                                printStream2.println("HTTP/1.0 200 OK");
                                printStream2.println("Content-Length:" + str.getBytes(GameManager.DEFAULT_CHARSET).length);
                                printStream2.println();
                                printStream2.println(str);
                                printStream2.close();
                                try {
                                    bufferedReader.close();
                                    socket.close();
                                } catch (Throwable th22) {
                                    bc.m330a(th22, "APSServiceCore", "invoke part4");
                                }
                            } catch (Throwable th222) {
                                bc.m330a(th222, "APSServiceCore", "invoke part4");
                            }
                            throw th52;
                        }
                    }
                    if (str == null) {
                        if (abVar.f131y == null) {
                            str = str2 + "&&" + str2 + "({'package':'" + abVar.f111e + "','error_code':8,'error':'unknown error'})";
                        } else {
                            AMapLocation aMapLocation = abVar.f131y;
                            str = str2 + "&&" + str2 + "({'package':'" + abVar.f111e + "','error_code':0,'error':'','location':{'y':" + aMapLocation.getLatitude() + ",'precision':" + aMapLocation.getAccuracy() + ",'x':" + aMapLocation.getLongitude() + "},'version_code':'3.0.0','version':'3.0.0'})";
                        }
                        if (bu.m492d(abVar.f107a)) {
                            str = str2 + "&&" + str2 + "({'package':'" + abVar.f111e + "','error_code':36,'error':'app is background'})";
                        }
                    }
                    try {
                        printStream = new PrintStream(socket.getOutputStream(), true, GameManager.DEFAULT_CHARSET);
                        printStream.println("HTTP/1.0 200 OK");
                        printStream.println("Content-Length:" + str.getBytes(GameManager.DEFAULT_CHARSET).length);
                        printStream.println();
                        printStream.println(str);
                        printStream.close();
                        bufferedReader.close();
                        socket.close();
                    } catch (Throwable th522) {
                        bc.m330a(th522, "APSServiceCore", "invoke part4");
                    }
                } catch (Throwable th7) {
                    th522 = th7;
                    bufferedReader = null;
                    printStream2 = new PrintStream(socket.getOutputStream(), true, GameManager.DEFAULT_CHARSET);
                    printStream2.println("HTTP/1.0 200 OK");
                    printStream2.println("Content-Length:" + str.getBytes(GameManager.DEFAULT_CHARSET).length);
                    printStream2.println();
                    printStream2.println(str);
                    printStream2.close();
                    bufferedReader.close();
                    socket.close();
                    throw th522;
                }
            } catch (Throwable th5222) {
                bc.m330a(th5222, "APSServiceCore", "invoke part5");
            }
        }
    }
}
