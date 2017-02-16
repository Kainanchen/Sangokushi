package com.amap.p003a;

import a.does.not.Exists2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.PointerIconCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.amap.p003a.au.ConnectionServiceManager;
import com.amap.p003a.az.CgiManager;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.exception.WeiboAuthException;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.PushMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONObject;

/* compiled from: APS */
/* renamed from: com.amap.a.at */
public final class at {
    static boolean f217r;
    static int f218t;
    static long f219u;
    static int f220v;
    private ArrayList<ScanResult> f221A;
    private volatile ArrayList<ScanResult> f222B;
    private HashMap<String, ArrayList<ScanResult>> f223C;
    private APS f224D;
    private volatile WifiInfo f225E;
    private volatile AMapLocationServer f226F;
    private volatile long f227G;
    private long f228H;
    private long f229I;
    private volatile boolean f230J;
    private boolean f231K;
    private long f232L;
    private volatile long f233M;
    private int f234N;
    private volatile String f235O;
    private String f236P;
    private bm f237Q;
    private volatile Timer f238R;
    private volatile TimerTask f239S;
    private int f240T;
    private volatile Object f241U;
    private boolean f242V;
    private String f243W;
    private String f244X;
    private long f245Y;
    private volatile long f246Z;
    volatile Context f247a;
    private volatile String aa;
    private ay ab;
    private bj ac;
    private StringBuilder ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private volatile boolean aj;
    private String ak;
    private String al;
    private boolean am;
    JSONObject f248b;
    Object f249c;
    au f250d;
    volatile int f251e;
    boolean f252f;
    volatile boolean f253g;
    Object f254h;
    public boolean f255i;
    public String f256j;
    public String f257k;
    boolean f258l;
    volatile boolean f259m;
    boolean f260n;
    int f261o;
    TreeMap<Integer, ScanResult> f262p;
    boolean f263q;
    APS f264s;
    StringBuilder f265w;
    private ConnectivityManager f266x;
    private volatile ba f267y;
    private volatile az f268z;

    /* renamed from: com.amap.a.at.1 */
    class APS extends TimerTask {
        final /* synthetic */ int f213a;
        final /* synthetic */ at f214b;

        APS(at atVar) {
            this.f214b = atVar;
            this.f213a = 2;
        }

        public final void run() {
            try {
                Thread.currentThread().setPriority(1);
                long b = bu.m477b() - this.f214b.f229I;
                if (this.f214b.m252d() && this.f214b.m233t() == 0) {
                    this.f214b.m234u();
                }
                if (b >= 10000) {
                    if (this.f214b.m235v()) {
                        at.m205a(this.f214b, this.f213a);
                    } else {
                        this.f214b.m234u();
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "APS", "timerTaskU run");
            }
        }
    }

    /* renamed from: com.amap.a.at.a */
    class APS implements ConnectionServiceManager {
        final /* synthetic */ at f215a;

        static {
            fixHelper.fixfunc(new int[]{1480, 1481});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native APS(at atVar);

        public final native void m199a(int i);
    }

    /* renamed from: com.amap.a.at.b */
    private class APS extends BroadcastReceiver {
        final /* synthetic */ at f216a;

        static {
            fixHelper.fixfunc(new int[]{1527, 1528, 1529});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native APS(at atVar);

        native /* synthetic */ APS(at atVar, byte b);

        public final native void onReceive(Context context, Intent intent);
    }

    static {
        f217r = false;
        f218t = -1;
        f219u = 0;
        f220v = -1;
    }

    public at() {
        this.f247a = null;
        this.f266x = null;
        this.f267y = null;
        this.f268z = null;
        this.f221A = new ArrayList();
        this.f222B = new ArrayList();
        this.f223C = new HashMap();
        this.f224D = null;
        this.f225E = null;
        this.f248b = null;
        this.f226F = null;
        this.f227G = 0;
        this.f228H = 0;
        this.f229I = 0;
        this.f230J = false;
        this.f231K = false;
        this.f232L = 0;
        this.f233M = 0;
        this.f234N = 0;
        this.f235O = "00:00:00:00:00:00";
        this.f236P = null;
        this.f237Q = null;
        this.f238R = null;
        this.f239S = null;
        this.f240T = 0;
        this.f249c = null;
        this.f241U = null;
        this.f242V = false;
        this.f243W = null;
        this.f244X = null;
        this.f245Y = 0;
        this.f246Z = 0;
        this.aa = null;
        this.ab = null;
        this.ac = null;
        this.ad = new StringBuilder();
        this.f251e = -1;
        this.f252f = false;
        this.ae = true;
        this.af = true;
        this.f253g = true;
        this.ag = false;
        this.ah = false;
        this.f254h = new Object();
        this.f255i = false;
        this.f256j = "com.data.carrier_v4.CollectorManager";
        this.f257k = "com.autonavi.aps.amapapi.offline.Off";
        this.f258l = false;
        this.ai = false;
        this.aj = false;
        this.f259m = false;
        this.f260n = false;
        this.f261o = 12;
        this.f262p = null;
        this.f263q = true;
        this.f264s = new APS(this);
        this.ak = null;
        this.al = null;
        this.f265w = null;
        this.am = false;
    }

    private AMapLocationServer m202a(String str, String str2, JSONObject jSONObject, Context context, String str3) {
        int i = 0;
        try {
            if (m239z()) {
                Object a;
                try {
                    a = bp.m426a(this.f241U, "getPureOfflineLocation", str, str2, jSONObject, str3);
                    i = 1;
                } catch (Throwable th) {
                    a = null;
                }
                if (!this.f260n) {
                    this.f260n = true;
                    br.m440b(context, "OffLocation", i);
                }
                String str4 = (String) a;
                AMapLocationServer aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
                aMapLocationServer.m789b(new JSONObject(str4));
                return aMapLocationServer;
            }
        } catch (Throwable th2) {
        }
        return null;
    }

    private AMapLocationServer m203a(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String f;
        int a;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder3;
        int i;
        TelephonyManager telephonyManager;
        String str11;
        NetworkInfo activeNetworkInfo;
        int i2;
        boolean z3;
        bl blVar;
        an a2;
        int i3;
        byte[] bArr;
        Object obj;
        AMapLocationServer aMapLocationServer;
        Object obj2;
        AMapLocationServer aMapLocationServer2 = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
        if (!z) {
            this.f227G = bu.m477b();
            if (this.f247a == null) {
                this.ad.append("context is null");
                aMapLocationServer2.setErrorCode(1);
                aMapLocationServer2.setLocationDetail(this.ad.toString());
                return aMapLocationServer2;
            }
        }
        try {
            if (this.f268z.m279a(this.f230J)) {
                this.f268z.m281c();
            }
            str = "0";
            str2 = "0";
            str3 = "0";
            str4 = "0";
            str5 = "0";
            f = cb.m523f(this.f247a);
            bc.f349c = LetterIndexBar.SEARCH_ICON_LETTER;
            a = bu.m461a(-32768, 32767);
            str6 = LetterIndexBar.SEARCH_ICON_LETTER;
            String str12 = LetterIndexBar.SEARCH_ICON_LETTER;
            String str13 = LetterIndexBar.SEARCH_ICON_LETTER;
            str7 = "api_serverSDK_130905";
            str8 = "S128DF1572465B890OE3F7A13167KLEI";
            if (this.af) {
                str9 = str8;
                str10 = str7;
            } else {
                str9 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
                str10 = "UC_nlp_20131029";
            }
            stringBuilder = new StringBuilder();
            stringBuilder2 = new StringBuilder();
            stringBuilder3 = new StringBuilder();
            az azVar = this.f268z;
            i = azVar.f318b;
            telephonyManager = azVar.f321e;
            ArrayList arrayList = azVar.f319c;
            if (i == 2) {
                str11 = "1";
            } else {
                str11 = str;
            }
            if (telephonyManager != null) {
                if (TextUtils.isEmpty(bc.f347a)) {
                    bc.f347a = ce.m567q(this.f247a);
                }
                if (TextUtils.isEmpty(bc.f347a)) {
                    bc.f347a = "888888888888888";
                }
                if (TextUtils.isEmpty(bc.f348b)) {
                    try {
                        bc.f348b = telephonyManager.getSubscriberId();
                    } catch (Throwable th) {
                        bc.m330a(th, "APS", "getApsReq part2");
                    }
                }
                if (TextUtils.isEmpty(bc.f348b)) {
                    bc.f348b = "888888888888888";
                }
            }
        } catch (Throwable th2) {
            this.ad.append("get parames error:" + th2.getMessage());
            aMapLocationServer2.setErrorCode(3);
            aMapLocationServer2.setLocationDetail(this.ad.toString());
            return aMapLocationServer2;
        }
        try {
            activeNetworkInfo = this.f266x.getActiveNetworkInfo();
        } catch (Throwable th22) {
            bc.m330a(th22, "APS", "getApsReq part");
            activeNetworkInfo = null;
        }
        if (bu.m462a(activeNetworkInfo) != -1) {
            str12 = bu.m479b(telephonyManager);
            str = (m231r() && at.m208a(this.f225E)) ? "2" : "1";
            if (!m231r()) {
                m229p();
                if (this.f221A != null) {
                    this.f221A.clear();
                    str8 = str;
                    str7 = str12;
                }
            }
            str8 = str;
            str7 = str12;
        } else {
            this.f225E = null;
            str8 = str12;
            str7 = str6;
        }
        if (bu.m473a(this.f248b, ParamKey.POIID)) {
            try {
                str = this.f248b.getString(ParamKey.POIID);
                if (TextUtils.isEmpty(str)) {
                    this.f236P = null;
                } else if (str.length() > 32) {
                    this.f236P = null;
                } else {
                    this.f236P = str;
                }
            } catch (Throwable th222) {
                bc.m330a(th222, "APS", "setPoiid");
            }
        } else {
            this.f236P = null;
        }
        if (arrayList.isEmpty()) {
            str6 = str13;
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            ay ayVar;
            switch (i) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    m206a("resetCdmaData");
                    ayVar = (ay) arrayList.get(0);
                    stringBuilder4.delete(0, stringBuilder4.length());
                    stringBuilder4.append("<mcc>").append(ayVar.f304a).append("</mcc>");
                    stringBuilder4.append("<mnc>").append(ayVar.f305b).append("</mnc>");
                    stringBuilder4.append("<lac>").append(ayVar.f306c).append("</lac>");
                    stringBuilder4.append("<cellid>").append(ayVar.f307d);
                    stringBuilder4.append("</cellid>");
                    stringBuilder4.append("<signal>").append(ayVar.f313j);
                    stringBuilder4.append("</signal>");
                    str13 = stringBuilder4.toString();
                    for (i2 = 1; i2 < arrayList.size(); i2++) {
                        ayVar = (ay) arrayList.get(i2);
                        stringBuilder.append(ayVar.f306c).append(",");
                        stringBuilder.append(ayVar.f307d).append(",");
                        stringBuilder.append(ayVar.f313j);
                        if (i2 < arrayList.size() - 1) {
                            stringBuilder.append("*");
                        }
                    }
                    str = str13;
                    break;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    ayVar = (ay) arrayList.get(0);
                    stringBuilder4.delete(0, stringBuilder4.length());
                    stringBuilder4.append("<mcc>").append(ayVar.f304a).append("</mcc>");
                    stringBuilder4.append("<sid>").append(ayVar.f310g).append("</sid>");
                    stringBuilder4.append("<nid>").append(ayVar.f311h).append("</nid>");
                    stringBuilder4.append("<bid>").append(ayVar.f312i).append("</bid>");
                    if (ayVar.f309f <= 0 || ayVar.f308e <= 0) {
                        m206a("resetCdmaData");
                    } else {
                        if (m239z()) {
                            r22 = new Object[2];
                            r22[0] = Integer.valueOf(ayVar.f308e);
                            r22[1] = Integer.valueOf(ayVar.f309f);
                            bp.m426a(this.f241U, "setCdmaLatLon", r22);
                        }
                        stringBuilder4.append("<lon>").append(ayVar.f309f).append("</lon>");
                        stringBuilder4.append("<lat>").append(ayVar.f308e).append("</lat>");
                    }
                    stringBuilder4.append("<signal>").append(ayVar.f313j).append("</signal>");
                    str = stringBuilder4.toString();
                    break;
                default:
                    m206a("resetCdmaData");
                    str = str13;
                    break;
            }
            stringBuilder4.delete(0, stringBuilder4.length());
            str6 = str;
        }
        if (m231r()) {
            if (at.m208a(this.f225E)) {
                stringBuilder3.append(this.f225E.getBSSID()).append(",");
                int rssi = this.f225E.getRssi();
                if (rssi < -128) {
                    rssi = 0;
                } else if (rssi > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    rssi = 0;
                }
                stringBuilder3.append(rssi).append(",");
                str13 = this.f225E.getSSID();
                try {
                    rssi = this.f225E.getSSID().getBytes(GameManager.DEFAULT_CHARSET).length;
                } catch (Throwable th2222) {
                    bc.m330a(th2222, "APS", "getApsReq");
                    rssi = 32;
                }
                stringBuilder3.append((rssi >= 32 ? "unkwn" : str13).replace("*", "."));
            }
            i2 = Math.min(this.f221A.size(), 15);
            for (int i4 = 0; i4 < i2; i4++) {
                ScanResult scanResult = (ScanResult) this.f221A.get(i4);
                stringBuilder2.append(scanResult.BSSID).append(",");
                stringBuilder2.append(scanResult.level).append(",");
                stringBuilder2.append(scanResult.SSID).append("*");
            }
        } else {
            m229p();
        }
        if (stringBuilder2.length() == 0) {
            stringBuilder2.append(stringBuilder3);
        } else {
            stringBuilder2.deleteCharAt(stringBuilder2.length() - 1);
        }
        if (bu.m473a(this.f248b, "reversegeo")) {
            try {
                z3 = this.f248b.getBoolean("reversegeo");
            } catch (Throwable th22222) {
                bc.m330a(th22222, "APS", "getApsReq part");
            }
            if (z3) {
                this.f237Q.f411b = (short) 2;
            } else {
                this.f237Q.f411b = (short) 0;
            }
            if (bu.m473a(this.f248b, "multi")) {
                try {
                    if (this.f248b.getString("multi").equals("1")) {
                        this.f237Q.f411b = (short) 1;
                    }
                } catch (Throwable th222222) {
                    bc.m330a(th222222, "APS", "getApsReq");
                }
            }
            this.f237Q.f412c = str10;
            this.f237Q.f413d = str9;
            this.f237Q.f415f = bu.m491d();
            this.f237Q.f416g = "android" + bu.m495e();
            this.f237Q.f417h = bu.m478b(this.f247a);
            this.f237Q.f418i = str11;
            this.f237Q.f419j = str2;
            this.f237Q.f420k = this.f231K ? "1" : "0";
            this.f237Q.f421l = str3;
            this.f237Q.f422m = str4;
            this.f237Q.f423n = str5;
            this.f237Q.f424o = f;
            this.f237Q.f425p = bc.f347a;
            this.f237Q.f426q = bc.f348b;
            this.f237Q.f428s = String.valueOf(a);
            this.f237Q.f429t = this.f235O;
            this.f237Q.f431v = "3.0.0";
            this.f237Q.f432w = m236w();
            this.f237Q.f408F = this.f236P;
            this.f237Q.f430u = bc.f349c;
            this.f237Q.f433x = str7;
            this.f237Q.f434y = str8;
            this.f237Q.f435z = String.valueOf(i);
            this.f237Q.f403A = str6;
            this.f237Q.f404B = stringBuilder.toString();
            this.f237Q.f406D = stringBuilder2.toString();
            this.f237Q.f407E = String.valueOf(bu.m477b() - this.f233M);
            this.f237Q.f405C = stringBuilder3.toString();
            stringBuilder.delete(0, stringBuilder.length());
            stringBuilder2.delete(0, stringBuilder2.length());
            stringBuilder3.delete(0, stringBuilder3.length());
            blVar = new bl();
            str11 = LetterIndexBar.SEARCH_ICON_LETTER;
            a2 = this.ac.m368a(this.f247a, this.f248b, this.f237Q, bc.m326a(), z2);
            i3 = this.ac.f390g;
            if (a2 == null) {
                bArr = a2.f197a;
                obj = a2.f199c;
            } else {
                str12 = str11;
                bArr = null;
            }
            try {
                aMapLocationServer2.m783a((long) i3);
                if (!z) {
                    aMapLocationServer = aMapLocationServer2;
                } else if (bArr != null || bArr.length == 0) {
                    aMapLocationServer2.setErrorCode(4);
                    this.ad.append("please check the network");
                    if (!TextUtils.isEmpty(obj)) {
                        this.ad.append(" #csid:" + obj);
                    }
                    aMapLocationServer2.setLocationDetail(this.ad.toString());
                    return aMapLocationServer2;
                } else {
                    str8 = new String(bArr, GameManager.DEFAULT_CHARSET);
                    if (str8.contains("\"status\":\"0\"")) {
                        aMapLocationServer2 = blVar.m379a(str8, this.f247a, a2);
                        aMapLocationServer2.m783a((long) i3);
                        return aMapLocationServer2;
                    }
                    bArr = bb.m317a(bArr);
                    if (bArr == null) {
                        aMapLocationServer2.setErrorCode(6);
                        this.ad.append("decrypt response data error");
                        if (!TextUtils.isEmpty(obj)) {
                            this.ad.append(" #csid:" + obj);
                        }
                        aMapLocationServer2.setLocationDetail(this.ad.toString());
                        return aMapLocationServer2;
                    }
                    AMapLocationServer a3 = blVar.m380a(bArr);
                    a3.m783a((long) i3);
                    if (a3.getErrorCode() != 0) {
                        if (!TextUtils.isEmpty(obj)) {
                            a3.setLocationDetail(a3.getLocationDetail() + " #csid:" + obj);
                        }
                        return a3;
                    } else if (bu.m471a(a3)) {
                        if (a3.m796f() != null) {
                        }
                        if (a3.getErrorCode() == 0 && a3.getLocationType() == 0) {
                            if ("-5".equals(a3.m790c()) || "1".equals(a3.m790c()) || "2".equals(a3.m790c()) || "14".equals(a3.m790c()) || "24".equals(a3.m790c()) || WeiboAuthException.DEFAULT_AUTH_ERROR_CODE.equals(a3.m790c())) {
                                a3.setLocationType(5);
                            } else {
                                a3.setLocationType(6);
                            }
                            this.ad.append(a3.m790c());
                            if (!TextUtils.isEmpty(obj)) {
                                this.ad.append(" #csid:" + obj);
                            }
                            a3.setLocationDetail(this.ad.toString());
                        }
                        a3.setOffset(this.af);
                        a3.m786a(this.ae);
                        aMapLocationServer = a3;
                    } else {
                        this.f243W = a3.m781a();
                        a3.setErrorCode(6);
                        this.ad.append("location faile retype:" + a3.m790c() + " rdesc:" + (this.f243W != null ? this.f243W : "null"));
                        if (!TextUtils.isEmpty(obj)) {
                            this.ad.append(" #csid:" + obj);
                        }
                        a3.setLocationDetail(this.ad.toString());
                        return a3;
                    }
                }
                return aMapLocationServer;
            } catch (Throwable th3) {
                obj2 = obj;
                aMapLocationServer2.setErrorCode(4);
                this.ad.append("please check the network");
                if (!TextUtils.isEmpty(obj2)) {
                    this.ad.append(" #csid:" + obj2);
                }
                aMapLocationServer2.setLocationDetail(this.ad.toString());
                return aMapLocationServer2;
            }
        }
        z3 = true;
        if (z3) {
            this.f237Q.f411b = (short) 0;
        } else {
            this.f237Q.f411b = (short) 2;
        }
        if (bu.m473a(this.f248b, "multi")) {
            if (this.f248b.getString("multi").equals("1")) {
                this.f237Q.f411b = (short) 1;
            }
        }
        this.f237Q.f412c = str10;
        this.f237Q.f413d = str9;
        this.f237Q.f415f = bu.m491d();
        this.f237Q.f416g = "android" + bu.m495e();
        this.f237Q.f417h = bu.m478b(this.f247a);
        this.f237Q.f418i = str11;
        this.f237Q.f419j = str2;
        if (this.f231K) {
        }
        this.f237Q.f420k = this.f231K ? "1" : "0";
        this.f237Q.f421l = str3;
        this.f237Q.f422m = str4;
        this.f237Q.f423n = str5;
        this.f237Q.f424o = f;
        this.f237Q.f425p = bc.f347a;
        this.f237Q.f426q = bc.f348b;
        this.f237Q.f428s = String.valueOf(a);
        this.f237Q.f429t = this.f235O;
        this.f237Q.f431v = "3.0.0";
        this.f237Q.f432w = m236w();
        this.f237Q.f408F = this.f236P;
        this.f237Q.f430u = bc.f349c;
        this.f237Q.f433x = str7;
        this.f237Q.f434y = str8;
        this.f237Q.f435z = String.valueOf(i);
        this.f237Q.f403A = str6;
        this.f237Q.f404B = stringBuilder.toString();
        this.f237Q.f406D = stringBuilder2.toString();
        this.f237Q.f407E = String.valueOf(bu.m477b() - this.f233M);
        this.f237Q.f405C = stringBuilder3.toString();
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder2.delete(0, stringBuilder2.length());
        stringBuilder3.delete(0, stringBuilder3.length());
        blVar = new bl();
        str11 = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            a2 = this.ac.m368a(this.f247a, this.f248b, this.f237Q, bc.m326a(), z2);
            i3 = this.ac.f390g;
            if (a2 == null) {
                str12 = str11;
                bArr = null;
            } else {
                bArr = a2.f197a;
                obj = a2.f199c;
            }
            aMapLocationServer2.m783a((long) i3);
            if (!z) {
                aMapLocationServer = aMapLocationServer2;
            } else {
                if (bArr != null) {
                }
                aMapLocationServer2.setErrorCode(4);
                this.ad.append("please check the network");
                if (TextUtils.isEmpty(obj)) {
                    this.ad.append(" #csid:" + obj);
                }
                aMapLocationServer2.setLocationDetail(this.ad.toString());
                return aMapLocationServer2;
            }
            return aMapLocationServer;
        } catch (Throwable th4) {
            obj2 = str11;
            aMapLocationServer2.setErrorCode(4);
            this.ad.append("please check the network");
            if (TextUtils.isEmpty(obj2)) {
                this.ad.append(" #csid:" + obj2);
            }
            aMapLocationServer2.setLocationDetail(this.ad.toString());
            return aMapLocationServer2;
        }
    }

    static /* synthetic */ void m205a(at atVar, int i) {
        int i2 = 674234367;
        if (atVar.m252d() && bn.m421u()) {
            Object[] objArr;
            JSONObject jSONObject;
            Object a;
            String a2;
            switch (i) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    i2 = 70254591;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    if (atVar.m235v()) {
                        i2 = 2083520511;
                    }
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    objArr = new Object[1];
                    jSONObject = new JSONObject();
                    jSONObject.put("e", 1);
                    jSONObject.put("d", i2);
                    jSONObject.put("u", 1);
                    objArr[0] = jSONObject.toString();
                    bp.m426a(atVar.f249c, "callBackWrapData", objArr);
                    a = bp.m426a(atVar.f249c, "getReportDate", new Object[0]);
                    if (a != null) {
                        a2 = bj.m365a((byte[]) a, atVar.f247a, "http://cgicol.amap.com/collection/writedata?ver=v1.0_ali&", false);
                        if (atVar.m252d()) {
                            try {
                                atVar.f240T = ((Integer) bp.m426a(atVar.f249c, "setUploadResult", a2, Integer.valueOf(i2))).intValue();
                            } catch (Throwable th) {
                                atVar.f240T = 3;
                            }
                        }
                    }
                    atVar.m254f();
                    if (!atVar.m252d() && atVar.m233t() == 0) {
                        atVar.m234u();
                        return;
                    } else if (atVar.f240T >= 3) {
                        atVar.m234u();
                    }
                default:
                    i2 = 70254591;
            }
            try {
                objArr = new Object[1];
                jSONObject = new JSONObject();
                jSONObject.put("e", 1);
                jSONObject.put("d", i2);
                jSONObject.put("u", 1);
                objArr[0] = jSONObject.toString();
                bp.m426a(atVar.f249c, "callBackWrapData", objArr);
            } catch (Throwable th2) {
                bc.m330a(th2, "APS", "up");
                return;
            }
            try {
                a = bp.m426a(atVar.f249c, "getReportDate", new Object[0]);
            } catch (Throwable th3) {
                a = null;
            }
            if (a != null) {
                a2 = bj.m365a((byte[]) a, atVar.f247a, "http://cgicol.amap.com/collection/writedata?ver=v1.0_ali&", false);
                if (atVar.m252d()) {
                    atVar.f240T = ((Integer) bp.m426a(atVar.f249c, "setUploadResult", a2, Integer.valueOf(i2))).intValue();
                }
            }
            atVar.m254f();
            if (!atVar.m252d()) {
            }
            if (atVar.f240T >= 3) {
                atVar.m234u();
            }
        }
    }

    private void m206a(String str) {
        try {
            if (m239z()) {
                try {
                    bp.m426a(this.f241U, str, new Object[0]);
                } catch (Throwable th) {
                }
                if (this.f247a != null) {
                }
            } else if (this.f241U != null) {
                bp.m426a(this.f241U, "stopOff", new Object[0]);
                this.f259m = false;
            }
        } catch (Throwable th2) {
        }
    }

    private static boolean m207a(int i) {
        int i2 = 20;
        try {
            i2 = WifiManager.calculateSignalLevel(i, 20);
        } catch (Throwable e) {
            bc.m330a(e, "APS", "wifiSigFine");
        }
        return i2 > 0;
    }

    private static boolean m208a(WifiInfo wifiInfo) {
        return (wifiInfo == null || TextUtils.isEmpty(wifiInfo.getBSSID()) || TextUtils.isEmpty(wifiInfo.getSSID()) || wifiInfo.getBSSID().equals("00:00:00:00:00:00") || wifiInfo.getBSSID().contains(" :")) ? false : true;
    }

    private synchronized StringBuilder m209b(boolean z) {
        StringBuilder stringBuilder;
        Object obj = null;
        synchronized (this) {
            az azVar = this.f268z;
            if (this.f230J) {
                azVar.m282d();
            }
            stringBuilder = new StringBuilder(700);
            int i = azVar.f318b;
            ArrayList arrayList = azVar.f319c;
            switch (i) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    for (i = 1; i < arrayList.size(); i++) {
                        stringBuilder.append("#").append(((ay) arrayList.get(i)).f305b);
                        stringBuilder.append("|").append(((ay) arrayList.get(i)).f306c);
                        stringBuilder.append("|").append(((ay) arrayList.get(i)).f307d);
                    }
                    break;
            }
            if (((!z && TextUtils.isEmpty(this.f235O)) || this.f235O.equals("00:00:00:00:00:00")) && this.f225E != null) {
                this.f235O = this.f225E.getMacAddress();
                if (!(this.f247a == null || TextUtils.isEmpty(this.f235O))) {
                    Object a;
                    SharedPreferences sharedPreferences = this.f247a.getSharedPreferences("pref", 0);
                    try {
                        a = cf.m577a(this.f235O.getBytes(GameManager.DEFAULT_CHARSET));
                    } catch (Throwable th) {
                        bc.m330a(th, "APS", "setSmac");
                        a = null;
                    }
                    if (!TextUtils.isEmpty(a)) {
                        sharedPreferences.edit().putString("smac", a).commit();
                    }
                }
                if (TextUtils.isEmpty(this.f235O)) {
                    this.f235O = "00:00:00:00:00:00";
                }
            }
            if (m231r()) {
                Object bssid;
                String str = LetterIndexBar.SEARCH_ICON_LETTER;
                if (at.m208a(this.f225E)) {
                    bssid = this.f225E.getBSSID();
                } else {
                    String str2 = str;
                }
                int size = this.f221A.size();
                for (i = 0; i < size; i++) {
                    str = "nb";
                    if (bssid.equals(((ScanResult) this.f221A.get(i)).BSSID)) {
                        str = "access";
                        obj = 1;
                    }
                    stringBuilder.append(String.format(Locale.US, "#%s,%s", new Object[]{((ScanResult) this.f221A.get(i)).BSSID, str}));
                }
                if (obj == null && !TextUtils.isEmpty(bssid)) {
                    stringBuilder.append("#").append(bssid);
                    stringBuilder.append(",access");
                }
            } else {
                m229p();
                if (this.f221A != null) {
                    this.f221A.clear();
                }
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.deleteCharAt(0);
            }
        }
        return stringBuilder;
    }

    private void m211b(JSONObject jSONObject) {
        try {
            if (m239z()) {
                bp.m426a(this.f241U, "setLastLoc", jSONObject);
            }
        } catch (Throwable th) {
        }
    }

    private void m214e(Context context) {
        try {
            if (this.f241U == null && !this.ai) {
                cj a = bc.m324a("OfflineLocation", "1.0.0");
                this.ai = br.m438a(context, a);
                if (this.ai) {
                    this.f241U = InstanceFactory.m717a(context, a, this.f257k, null, new Class[]{Context.class}, new Object[]{context});
                    br.m434a(context, "OffLocation", this.f241U == null ? 0 : 1);
                    return;
                }
                this.ai = true;
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "initOffLocation");
        }
    }

    static /* synthetic */ void m217g(at atVar) {
        if (!atVar.m252d()) {
            return;
        }
        if (bn.m421u()) {
            if (atVar.f239S == null) {
                atVar.f239S = new APS(atVar);
            }
            if (atVar.f238R == null) {
                atVar.f238R = new Timer("T-U", false);
                atVar.f238R.schedule(atVar.f239S, 2000, 2000);
                return;
            }
            return;
        }
        atVar.m234u();
    }

    private void m219i() {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            z = bu.m473a(this.f248b, "reversegeo") ? this.f248b.getBoolean("reversegeo") : true;
            try {
                z2 = bu.m473a(this.f248b, "isOffset") ? this.f248b.getBoolean("isOffset") : true;
                try {
                    z3 = bu.m473a(this.f248b, "isLocationCacheEnable") ? this.f248b.getBoolean("isLocationCacheEnable") : true;
                    try {
                        if (!(z2 == this.af && z == this.ae && z3 == this.f253g)) {
                            this.aa = null;
                            this.f226F = null;
                            m211b(null);
                            this.f246Z = 0;
                            this.f227G = 0;
                            aw.m262a().m265b();
                        }
                    } catch (Throwable th) {
                    }
                } catch (Throwable th2) {
                    z3 = true;
                }
            } catch (Throwable th3) {
                z3 = true;
                z2 = true;
            }
        } catch (Throwable th4) {
            z3 = true;
            z = true;
            z2 = true;
        }
        this.af = z2;
        this.ae = z;
        this.f253g = z3;
        this.f230J = bu.m468a(this.f247a);
        this.aj = true;
    }

    private void m222j() {
        try {
            if (m239z()) {
                bp.m426a(this.f241U, "resetPureOfflineCache", new Object[0]);
            }
        } catch (Throwable th) {
        }
    }

    private void m223k() {
        try {
            if (this.f224D == null) {
                this.f224D = new APS();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.location.GPS_FIX_CHANGE");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f247a.registerReceiver(this.f224D, intentFilter);
            m230q();
        } catch (Throwable th) {
            bc.m330a(th, "APS", "initBroadcastListener");
        }
    }

    private synchronized String m225l() {
        String str;
        Object obj = null;
        synchronized (this) {
            if (!this.f230J) {
                az azVar = this.f268z;
                switch (azVar.f318b) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        if (azVar.f319c.isEmpty()) {
                            azVar.f318b = 9;
                            break;
                        }
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        if (azVar.f319c.isEmpty()) {
                            azVar.f318b = 9;
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            this.f268z.m282d();
            str = LetterIndexBar.SEARCH_ICON_LETTER;
            String str2 = "network";
            if (m231r()) {
                ba baVar = this.f267y;
                this.f225E = baVar.f339a != null ? baVar.f339a.getConnectionInfo() : null;
            } else {
                m229p();
                if (this.f221A != null) {
                    this.f221A.clear();
                }
            }
            int i = this.f268z.f318b;
            ArrayList arrayList = this.f268z.f319c;
            if ((arrayList == null || arrayList.isEmpty()) && (this.f221A == null || this.f221A.isEmpty())) {
                String str3 = this.f268z.f331o;
                String str4 = this.f267y.f343e;
                if (str3 != null || str4 != null) {
                    this.f261o = 12;
                    StringBuilder stringBuilder = this.ad;
                    if (str3 == null) {
                        str3 = str4;
                    }
                    stringBuilder.append(str3);
                } else if (bu.m499f(this.f247a)) {
                    this.ad.append("\u2297 lstCgi & \u2297 wifis");
                    this.f261o = 13;
                } else {
                    this.f261o = 12;
                }
            } else {
                ay ayVar;
                StringBuilder stringBuilder2;
                switch (i) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        if (!arrayList.isEmpty()) {
                            ayVar = (ay) arrayList.get(0);
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(ayVar.f304a).append("#");
                            stringBuilder2.append(ayVar.f305b).append("#");
                            stringBuilder2.append(ayVar.f306c).append("#");
                            stringBuilder2.append(ayVar.f307d).append("#");
                            stringBuilder2.append(str2).append("#");
                            str = (!this.f221A.isEmpty() || at.m208a(this.f225E)) ? "cgiwifi" : "cgi";
                            stringBuilder2.append(str);
                            str = stringBuilder2.toString();
                            break;
                        }
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        if (!arrayList.isEmpty()) {
                            ayVar = (ay) arrayList.get(0);
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(ayVar.f304a).append("#");
                            stringBuilder2.append(ayVar.f305b).append("#");
                            stringBuilder2.append(ayVar.f310g).append("#");
                            stringBuilder2.append(ayVar.f311h).append("#");
                            stringBuilder2.append(ayVar.f312i).append("#");
                            stringBuilder2.append(str2).append("#");
                            str = (!this.f221A.isEmpty() || at.m208a(this.f225E)) ? "cgiwifi" : "cgi";
                            stringBuilder2.append(str);
                            str = stringBuilder2.toString();
                            break;
                        }
                        break;
                    case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                        Object obj2 = (!this.f221A.isEmpty() || at.m208a(this.f225E)) ? 1 : null;
                        if (at.m208a(this.f225E) && this.f221A.isEmpty()) {
                            this.f261o = 2;
                            this.ad.append("\u2297 around wifi(s) & has access wifi");
                        } else {
                            if (this.f221A.size() == 1) {
                                this.f261o = 2;
                                if (at.m208a(this.f225E)) {
                                    if (this.f225E.getBSSID().equals(((ScanResult) this.f221A.get(0)).BSSID)) {
                                        this.ad.append("same access wifi & around wifi 1");
                                    }
                                } else {
                                    this.ad.append("\u2297 access wifi & around wifi 1");
                                }
                            }
                            obj = obj2;
                        }
                        str = String.format(Locale.US, "#%s#", new Object[]{str2});
                        if (obj == null) {
                            if (str2.equals("network")) {
                                str = LetterIndexBar.SEARCH_ICON_LETTER;
                                this.f261o = 2;
                                this.ad.append("is network & no wifi");
                                break;
                            }
                        }
                        str = str + "wifi";
                        break;
                        break;
                    default:
                        this.f261o = 11;
                        this.ad.append("get cgi failure");
                        break;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!str.startsWith("#")) {
                        str = "#" + str;
                    }
                    str = bu.m501h() + str;
                }
            }
        }
        return str;
    }

    private void m226m() {
        int i;
        Object obj = 1;
        Object obj2 = null;
        long b = bu.m477b();
        if (TextUtils.isEmpty(this.f236P)) {
            if (m231r()) {
                if (this.f232L == 0) {
                    i = 1;
                } else if (bu.m477b() - this.f232L >= 3000 && bu.m477b() - this.f233M >= 1500) {
                    i = 1;
                }
            }
            obj = obj2;
        }
        if (obj != null || bu.m477b() - this.f233M > 3000) {
            if (b - this.f228H >= 10000) {
                synchronized (this.f254h) {
                    this.f222B.clear();
                }
            }
            m230q();
            if (b - this.f228H >= 10000) {
                for (i = 20; i > 0 && this.f222B.isEmpty(); i--) {
                    try {
                        Thread.sleep(150);
                    } catch (Throwable th) {
                    }
                }
            }
            synchronized (this.f254h) {
            }
        }
        if (this.f222B.isEmpty() && this.f267y != null) {
            this.f233M = bu.m477b();
            Collection a = this.f267y.m311a();
            if (a != null) {
                synchronized (this.f254h) {
                    this.f222B.addAll(a);
                }
            }
        }
    }

    private synchronized void m227n() {
        List list = this.f221A;
        Collection collection = this.f222B;
        list.clear();
        synchronized (this.f254h) {
            if (collection != null) {
                if (collection.size() > 0) {
                    list.addAll(collection);
                }
            }
        }
    }

    private synchronized void m228o() {
        if (!(this.f221A == null || this.f221A.isEmpty())) {
            boolean z;
            int size;
            int i;
            ScanResult scanResult;
            int length;
            if (bu.m477b() - this.f233M > 3600000) {
                m229p();
                this.f221A.clear();
            }
            boolean f = bu.m498f();
            if (bu.m473a(this.f248b, "nbssid")) {
                try {
                    if (this.f248b.getString("nbssid").equals("1")) {
                        z = true;
                    } else {
                        if (this.f248b.getString("nbssid").equals("0")) {
                            f = false;
                        }
                        z = f;
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "APS", "setWifiOrder part");
                }
                if (this.f262p == null) {
                    this.f262p = new TreeMap(Collections.reverseOrder());
                }
                this.f262p.clear();
                size = this.f221A.size();
                for (i = 0; i < size; i++) {
                    scanResult = (ScanResult) this.f221A.get(i);
                    if (bu.m469a(scanResult) && (size <= 20 || at.m207a(scanResult.level))) {
                        if (!TextUtils.isEmpty(scanResult.SSID)) {
                            scanResult.SSID = "unkwn";
                        } else if (z) {
                            scanResult.SSID = String.valueOf(i);
                        } else {
                            scanResult.SSID = scanResult.SSID.replace("*", ".");
                            try {
                                length = scanResult.SSID.getBytes(GameManager.DEFAULT_CHARSET).length;
                            } catch (Throwable th2) {
                                bc.m330a(th2, "APS", "setWifiOrder");
                                length = 32;
                            }
                            if (length >= 32) {
                                scanResult.SSID = String.valueOf(i);
                            }
                        }
                        this.f262p.put(Integer.valueOf((scanResult.level * 30) + i), scanResult);
                    }
                }
                this.f221A.clear();
                for (ScanResult scanResult2 : this.f262p.values()) {
                    this.f221A.add(scanResult2);
                }
                this.f262p.clear();
            }
            z = f;
            if (this.f262p == null) {
                this.f262p = new TreeMap(Collections.reverseOrder());
            }
            this.f262p.clear();
            size = this.f221A.size();
            for (i = 0; i < size; i++) {
                scanResult2 = (ScanResult) this.f221A.get(i);
                if (!TextUtils.isEmpty(scanResult2.SSID)) {
                    scanResult2.SSID = "unkwn";
                } else if (z) {
                    scanResult2.SSID = String.valueOf(i);
                } else {
                    scanResult2.SSID = scanResult2.SSID.replace("*", ".");
                    length = scanResult2.SSID.getBytes(GameManager.DEFAULT_CHARSET).length;
                    if (length >= 32) {
                        scanResult2.SSID = String.valueOf(i);
                    }
                }
                this.f262p.put(Integer.valueOf((scanResult2.level * 30) + i), scanResult2);
            }
            this.f221A.clear();
            while (r1.hasNext()) {
                this.f221A.add(scanResult2);
            }
            this.f262p.clear();
        }
    }

    private void m229p() {
        this.f233M = 0;
        this.f225E = null;
        synchronized (this.f254h) {
            this.f222B.clear();
            this.f223C.clear();
        }
    }

    private void m230q() {
        Throwable th;
        ba baVar;
        boolean z = false;
        if (m231r()) {
            boolean equals;
            boolean z2;
            if (bu.m485c() < 18 && bu.m485c() > 3 && bu.m473a(this.f248b, "wifiactivescan")) {
                try {
                    equals = "1".equals(this.f248b.getString("wifiactivescan"));
                } catch (Throwable th2) {
                    bc.m330a(th2, "APS", "updateWifi part1");
                }
                if (equals) {
                    z2 = false;
                } else {
                    try {
                        z2 = this.f267y.m313b();
                        if (z2) {
                            try {
                                this.f232L = bu.m477b();
                            } catch (Throwable th3) {
                                th2 = th3;
                                bc.m330a(th2, "APS", "updateWifi part");
                                if (z2) {
                                    try {
                                        baVar = this.f267y;
                                        baVar.f342d = bu.m477b();
                                        z = baVar.f339a.startScan();
                                        if (!z) {
                                            this.f232L = bu.m477b();
                                        }
                                    } catch (Throwable th22) {
                                        bc.m330a(th22, "APS", "updateWifi");
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th22 = th4;
                        z2 = false;
                        bc.m330a(th22, "APS", "updateWifi part");
                        if (z2) {
                            baVar = this.f267y;
                            baVar.f342d = bu.m477b();
                            z = baVar.f339a.startScan();
                            if (!z) {
                                this.f232L = bu.m477b();
                            }
                        }
                    }
                }
                if (z2) {
                    baVar = this.f267y;
                    if (bu.m477b() - baVar.f342d >= 3000 && baVar.f339a != null) {
                        baVar.f342d = bu.m477b();
                        z = baVar.f339a.startScan();
                    }
                    if (!z) {
                        this.f232L = bu.m477b();
                    }
                }
            }
            equals = false;
            if (equals) {
                z2 = false;
            } else {
                z2 = this.f267y.m313b();
                if (z2) {
                    this.f232L = bu.m477b();
                }
            }
            if (z2) {
                baVar = this.f267y;
                baVar.f342d = bu.m477b();
                z = baVar.f339a.startScan();
                if (!z) {
                    this.f232L = bu.m477b();
                }
            }
        }
    }

    private boolean m231r() {
        return this.f267y != null ? this.f267y.m314c() : false;
    }

    private boolean m232s() {
        try {
            return ((Boolean) bp.m426a(this.f249c, "isStarted", new Object[0])).booleanValue();
        } catch (Throwable th) {
            return false;
        }
    }

    private int m233t() {
        try {
            return ((Integer) bp.m426a(this.f249c, "getLeftUploadNum", new Object[0])).intValue();
        } catch (Throwable th) {
            return 0;
        }
    }

    private synchronized void m234u() {
        if (this.f239S != null) {
            this.f239S.cancel();
            this.f239S = null;
        }
        if (this.f238R != null) {
            this.f238R.cancel();
            this.f238R.purge();
            this.f238R = null;
        }
    }

    private boolean m235v() {
        return (this.f267y == null || this.f266x == null) ? false : this.f267y.m312a(this.f266x);
    }

    private String m236w() {
        try {
            if (this.f249c != null) {
                return (String) bp.m426a(this.f249c, "getInnerString", LogBuilder.KEY_VERSION);
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "getCollVer");
        }
        return null;
    }

    private boolean m237x() {
        try {
            if (this.f247a == null || bu.m477b() - f219u < 1800000) {
                return false;
            }
            f219u = bu.m477b();
            return bu.m494e(this.f247a) > f220v;
        } catch (Throwable th) {
            bc.m330a(th, "APS", "isConfigNeedUpdate");
            return false;
        }
    }

    private synchronized void m238y() {
        if (this.ak != null) {
            this.ak = null;
            this.al = null;
            this.f265w = null;
        }
        try {
            if (!this.f230J) {
                this.f268z.m276a(this.f230J, true);
            }
            this.ah = this.f248b.optBoolean("isOnceLocationLatest", false);
            if (this.ah) {
                if (!this.ag) {
                    m223k();
                    this.ag = true;
                }
                m226m();
            }
            m227n();
            if (this.f221A != null && this.f221A.isEmpty()) {
                this.f233M = bu.m477b();
                Collection a = this.f267y.m311a();
                if (a != null) {
                    this.f221A.addAll(a);
                    synchronized (this.f254h) {
                        if (this.f222B != null && this.f222B.isEmpty()) {
                            this.f222B.addAll(a);
                        }
                    }
                }
            }
            m228o();
        } catch (Throwable th) {
            bc.m330a(th, "APS", "initFirstLocateParam");
        }
        this.ak = m225l();
        if (!TextUtils.isEmpty(this.ak)) {
            this.al = this.ak + "&" + this.af + "&" + this.ae;
            this.f265w = m209b(true);
        }
        this.am = true;
    }

    private boolean m239z() {
        return bn.m403f() && this.f241U != null && bn.m422v();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.autonavi.aps.amapapi.model.AMapLocationServer m240a() {
        /*
        r14 = this;
        r8 = 0;
        r3 = 0;
        r11 = 2;
        r1 = 1;
        r2 = 0;
        monitor-enter(r14);
        r0 = r14.ad;	 Catch:{ all -> 0x018b }
        r0 = r0.length();	 Catch:{ all -> 0x018b }
        if (r0 <= 0) goto L_0x001b;
    L_0x000f:
        r0 = r14.ad;	 Catch:{ all -> 0x018b }
        r4 = 0;
        r5 = r14.ad;	 Catch:{ all -> 0x018b }
        r5 = r5.length();	 Catch:{ all -> 0x018b }
        r0.delete(r4, r5);	 Catch:{ all -> 0x018b }
    L_0x001b:
        r0 = r14.f247a;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x003c;
    L_0x001f:
        r0 = r14.ad;	 Catch:{ all -> 0x018b }
        r1 = "context is null";
        r0.append(r1);	 Catch:{ all -> 0x018b }
        r0 = new com.autonavi.aps.amapapi.model.AMapLocationServer;	 Catch:{ all -> 0x018b }
        r1 = "";
        r0.<init>(r1);	 Catch:{ all -> 0x018b }
        r1 = 1;
        r0.setErrorCode(r1);	 Catch:{ all -> 0x018b }
        r1 = r14.ad;	 Catch:{ all -> 0x018b }
        r1 = r1.toString();	 Catch:{ all -> 0x018b }
        r0.setLocationDetail(r1);	 Catch:{ all -> 0x018b }
    L_0x003a:
        monitor-exit(r14);
        return r0;
    L_0x003c:
        r14.m219i();	 Catch:{ all -> 0x018b }
        r0 = r14.f234N;	 Catch:{ all -> 0x018b }
        r0 = r0 + 1;
        r14.f234N = r0;	 Catch:{ all -> 0x018b }
        r14.m254f();	 Catch:{ all -> 0x018b }
        r0 = r14.f267y;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0054;
    L_0x004c:
        r0 = r14.f247a;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0054;
    L_0x0050:
        r0 = r14.f242V;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x00fb;
    L_0x0054:
        r0 = r14.f247a;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x00af;
    L_0x0058:
        r0 = r14.m252d();	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0068;
    L_0x005e:
        r0 = r14.f249c;	 Catch:{ Throwable -> 0x04dd }
        r4 = "getColUpHist";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x04dd }
        com.amap.p003a.bp.m426a(r0, r4, r5);	 Catch:{ Throwable -> 0x04dd }
    L_0x0068:
        r0 = r14.m239z();	 Catch:{ Throwable -> 0x01aa }
        if (r0 == 0) goto L_0x0197;
    L_0x006e:
        r0 = r14.f241U;	 Catch:{ Throwable -> 0x01aa }
        r4 = "getOffDlHist";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x01aa }
        com.amap.p003a.bp.m426a(r0, r4, r5);	 Catch:{ Throwable -> 0x01aa }
    L_0x0078:
        r0 = r14.f247a;	 Catch:{ all -> 0x018b }
        r4 = "pref";
        r5 = 0;
        r4 = r0.getSharedPreferences(r4, r5);	 Catch:{ all -> 0x018b }
        r0 = r14.f247a;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x00af;
    L_0x0085:
        if (r4 == 0) goto L_0x00af;
    L_0x0087:
        r5 = "smac";
        r0 = r4.contains(r5);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x04ef;
    L_0x008f:
        r0 = 0;
        r6 = r4.getString(r5, r0);	 Catch:{ Throwable -> 0x01ad }
        r0 = new java.lang.String;	 Catch:{ Throwable -> 0x01ad }
        r6 = com.amap.p003a.cf.m581b(r6);	 Catch:{ Throwable -> 0x01ad }
        r7 = "UTF-8";
        r0.<init>(r6, r7);	 Catch:{ Throwable -> 0x01ad }
    L_0x009f:
        r4 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x018b }
        if (r4 != 0) goto L_0x00af;
    L_0x00a5:
        r4 = "00:00:00:00:00:00";
        r4 = r0.equals(r4);	 Catch:{ all -> 0x018b }
        if (r4 != 0) goto L_0x00af;
    L_0x00ad:
        r14.f235O = r0;	 Catch:{ all -> 0x018b }
    L_0x00af:
        r4 = r14.f227G;	 Catch:{ all -> 0x018b }
        r6 = com.amap.p003a.bu.m477b();	 Catch:{ all -> 0x018b }
        r4 = r6 - r4;
        r6 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x04e9;
    L_0x00bd:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x04ec;
    L_0x00c5:
        r4 = com.amap.p003a.bu.m464a();	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r6 = r0.getTime();	 Catch:{ all -> 0x018b }
        r4 = r4 - r6;
    L_0x00d0:
        r6 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 > 0) goto L_0x04e9;
    L_0x00d6:
        r0 = r1;
    L_0x00d7:
        if (r0 == 0) goto L_0x01c3;
    L_0x00d9:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x01c3;
    L_0x00e1:
        r0 = r14.f253g;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x00f7;
    L_0x00e5:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = r0.getTime();	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bn.m394b(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x00f7;
    L_0x00f1:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r1 = 2;
        r0.setLocationType(r1);	 Catch:{ all -> 0x018b }
    L_0x00f7:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        goto L_0x003a;
    L_0x00fb:
        r0 = r14.f267y;	 Catch:{ all -> 0x018b }
        r4 = r14.f242V;	 Catch:{ all -> 0x018b }
        r5 = r0.f341c;	 Catch:{ all -> 0x018b }
        r6 = r0.f339a;	 Catch:{ all -> 0x018b }
        if (r6 == 0) goto L_0x0054;
    L_0x0105:
        if (r5 == 0) goto L_0x0054;
    L_0x0107:
        if (r4 == 0) goto L_0x0054;
    L_0x0109:
        r4 = com.amap.p003a.bu.m485c();	 Catch:{ all -> 0x018b }
        r6 = 17;
        if (r4 <= r6) goto L_0x0054;
    L_0x0111:
        r4 = "autoenablewifialwaysscan";
        r6 = r0.f340b;	 Catch:{ all -> 0x018b }
        r6 = com.amap.p003a.bu.m473a(r6, r4);	 Catch:{ all -> 0x018b }
        if (r6 == 0) goto L_0x0129;
    L_0x011b:
        r6 = "0";
        r0 = r0.f340b;	 Catch:{ Throwable -> 0x018e }
        r0 = r0.getString(r4);	 Catch:{ Throwable -> 0x018e }
        r0 = r6.equals(r0);	 Catch:{ Throwable -> 0x018e }
        if (r0 != 0) goto L_0x0054;
    L_0x0129:
        r4 = r5.getContentResolver();	 Catch:{ all -> 0x018b }
        r5 = "android.provider.Settings$Global";
        r0 = 2;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x018b }
        r6 = 0;
        r0[r6] = r4;	 Catch:{ all -> 0x018b }
        r6 = 1;
        r7 = "wifi_scan_always_enabled";
        r0[r6] = r7;	 Catch:{ all -> 0x018b }
        r6 = 2;
        r6 = new java.lang.Class[r6];	 Catch:{ all -> 0x018b }
        r7 = 0;
        r10 = android.content.ContentResolver.class;
        r6[r7] = r10;	 Catch:{ all -> 0x018b }
        r7 = 1;
        r10 = java.lang.String.class;
        r6[r7] = r10;	 Catch:{ all -> 0x018b }
        r7 = "getInt";
        r0 = com.amap.p003a.bp.m428a(r5, r7, r0, r6);	 Catch:{ Throwable -> 0x0181 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Throwable -> 0x0181 }
        r0 = r0.intValue();	 Catch:{ Throwable -> 0x0181 }
        if (r0 != 0) goto L_0x0054;
    L_0x0155:
        r0 = 3;
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0181 }
        r6 = 0;
        r0[r6] = r4;	 Catch:{ Throwable -> 0x0181 }
        r4 = 1;
        r6 = "wifi_scan_always_enabled";
        r0[r4] = r6;	 Catch:{ Throwable -> 0x0181 }
        r4 = 2;
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Throwable -> 0x0181 }
        r0[r4] = r6;	 Catch:{ Throwable -> 0x0181 }
        r4 = 3;
        r4 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x0181 }
        r6 = 0;
        r7 = android.content.ContentResolver.class;
        r4[r6] = r7;	 Catch:{ Throwable -> 0x0181 }
        r6 = 1;
        r7 = java.lang.String.class;
        r4[r6] = r7;	 Catch:{ Throwable -> 0x0181 }
        r6 = 2;
        r7 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x0181 }
        r4[r6] = r7;	 Catch:{ Throwable -> 0x0181 }
        r6 = "putInt";
        com.amap.p003a.bp.m428a(r5, r6, r0, r4);	 Catch:{ Throwable -> 0x0181 }
        goto L_0x0054;
    L_0x0181:
        r0 = move-exception;
        r4 = "WifiManagerWrapper";
        r5 = "enableWifiAlwaysScan";
        com.amap.p003a.bc.m330a(r0, r4, r5);	 Catch:{ all -> 0x018b }
        goto L_0x0054;
    L_0x018b:
        r0 = move-exception;
        monitor-exit(r14);
        throw r0;
    L_0x018e:
        r0 = move-exception;
        r4 = "WifiManagerWrapper";
        r6 = "enableWifiAlwaysScan1";
        com.amap.p003a.bc.m330a(r0, r4, r6);	 Catch:{ all -> 0x018b }
        goto L_0x0129;
    L_0x0197:
        r0 = r14.f241U;	 Catch:{ Throwable -> 0x01aa }
        if (r0 == 0) goto L_0x0078;
    L_0x019b:
        r0 = r14.f241U;	 Catch:{ Throwable -> 0x01aa }
        r4 = "stopOff";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x01aa }
        com.amap.p003a.bp.m426a(r0, r4, r5);	 Catch:{ Throwable -> 0x01aa }
        r0 = 0;
        r14.f259m = r0;	 Catch:{ Throwable -> 0x01aa }
        goto L_0x0078;
    L_0x01aa:
        r0 = move-exception;
        goto L_0x0078;
    L_0x01ad:
        r0 = move-exception;
        r6 = "APS";
        r7 = "getSmac";
        com.amap.p003a.bc.m330a(r0, r6, r7);	 Catch:{ all -> 0x018b }
        r0 = r4.edit();	 Catch:{ all -> 0x018b }
        r0 = r0.remove(r5);	 Catch:{ all -> 0x018b }
        r0.commit();	 Catch:{ all -> 0x018b }
        r0 = r3;
        goto L_0x009f;
    L_0x01c3:
        r0 = r14.f268z;	 Catch:{ all -> 0x018b }
        r4 = r14.f230J;	 Catch:{ all -> 0x018b }
        r5 = 0;
        r0.m276a(r4, r5);	 Catch:{ all -> 0x018b }
        r14.m226m();	 Catch:{ Throwable -> 0x0201 }
        r4 = com.amap.p003a.bu.m477b();	 Catch:{ Throwable -> 0x0201 }
        r14.f228H = r4;	 Catch:{ Throwable -> 0x0201 }
        r14.m227n();	 Catch:{ Throwable -> 0x0201 }
        r14.m228o();	 Catch:{ Throwable -> 0x0201 }
    L_0x01da:
        r0 = r14.m225l();	 Catch:{ all -> 0x018b }
        r14.ak = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.ak;	 Catch:{ all -> 0x018b }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0235;
    L_0x01e8:
        r0 = r14.f252f;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x01f2;
    L_0x01ec:
        r0 = 0;
        r1 = r14.f247a;	 Catch:{ all -> 0x018b }
        r14.m245a(r0, r1);	 Catch:{ all -> 0x018b }
    L_0x01f2:
        r0 = 4;
    L_0x01f3:
        if (r0 <= 0) goto L_0x020a;
    L_0x01f5:
        r1 = r14.f251e;	 Catch:{ all -> 0x018b }
        if (r1 == 0) goto L_0x020a;
    L_0x01f9:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        android.os.SystemClock.sleep(r2);	 Catch:{ all -> 0x018b }
        r0 = r0 + -1;
        goto L_0x01f3;
    L_0x0201:
        r0 = move-exception;
        r4 = "APS";
        r5 = "getLocation";
        com.amap.p003a.bc.m330a(r0, r4, r5);	 Catch:{ all -> 0x018b }
        goto L_0x01da;
    L_0x020a:
        r0 = r14.f251e;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x021e;
    L_0x020e:
        r0 = r14.f250d;	 Catch:{ all -> 0x018b }
        r0 = r0.m261c();	 Catch:{ all -> 0x018b }
        r14.f226F = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x021e;
    L_0x021a:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        goto L_0x003a;
    L_0x021e:
        r0 = new com.autonavi.aps.amapapi.model.AMapLocationServer;	 Catch:{ all -> 0x018b }
        r1 = "";
        r0.<init>(r1);	 Catch:{ all -> 0x018b }
        r1 = r14.f261o;	 Catch:{ all -> 0x018b }
        r0.setErrorCode(r1);	 Catch:{ all -> 0x018b }
        r1 = r14.ad;	 Catch:{ all -> 0x018b }
        r1 = r1.toString();	 Catch:{ all -> 0x018b }
        r0.setLocationDetail(r1);	 Catch:{ all -> 0x018b }
        goto L_0x003a;
    L_0x0235:
        r0 = r14.m239z();	 Catch:{ Throwable -> 0x0306 }
        if (r0 == 0) goto L_0x0256;
    L_0x023b:
        r0 = r14.f259m;	 Catch:{ Throwable -> 0x0306 }
        if (r0 != 0) goto L_0x0256;
    L_0x023f:
        r0 = r14.f241U;	 Catch:{ Throwable -> 0x0306 }
        r4 = "startOff";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x0306 }
        r6 = 0;
        r7 = r14.f248b;	 Catch:{ Throwable -> 0x0306 }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x0306 }
        r6 = 1;
        r7 = r14.ak;	 Catch:{ Throwable -> 0x0306 }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x0306 }
        com.amap.p003a.bp.m426a(r0, r4, r5);	 Catch:{ Throwable -> 0x0306 }
        r0 = 1;
        r14.f259m = r0;	 Catch:{ Throwable -> 0x0306 }
    L_0x0256:
        r0 = 0;
        r0 = r14.m209b(r0);	 Catch:{ all -> 0x018b }
        r14.f265w = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f230J;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x04e6;
    L_0x0261:
        r0 = r14.f268z;	 Catch:{ all -> 0x018b }
        r0 = r0.m277a();	 Catch:{ all -> 0x018b }
        r6 = r0;
    L_0x0268:
        if (r6 != 0) goto L_0x026e;
    L_0x026a:
        r0 = r14.ab;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0350;
    L_0x026e:
        r0 = r14.ab;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x027e;
    L_0x0272:
        r0 = r14.ab;	 Catch:{ all -> 0x018b }
        if (r6 == 0) goto L_0x027b;
    L_0x0276:
        r4 = r6.f314k;	 Catch:{ all -> 0x018b }
        switch(r4) {
            case 1: goto L_0x032c;
            case 2: goto L_0x0310;
            default: goto L_0x027b;
        };	 Catch:{ all -> 0x018b }
    L_0x027b:
        r0 = r2;
    L_0x027c:
        if (r0 != 0) goto L_0x0350;
    L_0x027e:
        r5 = r1;
    L_0x027f:
        r10 = r14.f227G;	 Catch:{ all -> 0x018b }
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0353;
    L_0x0285:
        r4 = r1;
    L_0x0286:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x04e3;
    L_0x028a:
        r0 = r14.f221A;	 Catch:{ all -> 0x018b }
        r0 = r0.size();	 Catch:{ all -> 0x018b }
        r7 = r14.f226F;	 Catch:{ all -> 0x018b }
        r7 = r7.getAccuracy();	 Catch:{ all -> 0x018b }
        r10 = 1133871104; // 0x43958000 float:299.0 double:5.602067593E-315;
        r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r7 <= 0) goto L_0x0366;
    L_0x029d:
        r7 = 5;
        if (r0 <= r7) goto L_0x0366;
    L_0x02a0:
        r0 = r1;
    L_0x02a1:
        r1 = r0;
    L_0x02a2:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0369;
    L_0x02a6:
        r0 = r14.aa;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0369;
    L_0x02aa:
        if (r1 != 0) goto L_0x0369;
    L_0x02ac:
        if (r5 != 0) goto L_0x0369;
    L_0x02ae:
        r0 = r14.f253g;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0369;
    L_0x02b2:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r10 = r0.getTime();	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bn.m394b(r10);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0369;
    L_0x02be:
        com.amap.p003a.bd.m338a();	 Catch:{ all -> 0x018b }
        r0 = r14.aa;	 Catch:{ all -> 0x018b }
        r2 = r14.f265w;	 Catch:{ all -> 0x018b }
        r2 = com.amap.p003a.bd.m340a(r0, r2);	 Catch:{ all -> 0x018b }
        if (r2 != 0) goto L_0x02de;
    L_0x02cb:
        r10 = r14.f246Z;	 Catch:{ all -> 0x018b }
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0369;
    L_0x02d1:
        r8 = com.amap.p003a.bu.m477b();	 Catch:{ all -> 0x018b }
        r10 = r14.f246Z;	 Catch:{ all -> 0x018b }
        r8 = r8 - r10;
        r10 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x0369;
    L_0x02de:
        r0 = r14.f268z;	 Catch:{ all -> 0x018b }
        r5 = r14.f230J;	 Catch:{ all -> 0x018b }
        r0 = r0.m279a(r5);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x02ed;
    L_0x02e8:
        r0 = r14.f268z;	 Catch:{ all -> 0x018b }
        r0.m281c();	 Catch:{ all -> 0x018b }
    L_0x02ed:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x0369;
    L_0x02f5:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r1 = "mem";
        r0.m797f(r1);	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r1 = 2;
        r0.setLocationType(r1);	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        goto L_0x003a;
    L_0x0306:
        r0 = move-exception;
        r4 = "APS";
        r5 = "getLocation:isOffLineLoc";
        com.amap.p003a.bc.m330a(r0, r4, r5);	 Catch:{ all -> 0x018b }
        goto L_0x0256;
    L_0x0310:
        r4 = r0.f314k;	 Catch:{ all -> 0x018b }
        if (r4 != r11) goto L_0x027b;
    L_0x0314:
        r4 = r6.f312i;	 Catch:{ all -> 0x018b }
        r5 = r0.f312i;	 Catch:{ all -> 0x018b }
        if (r4 != r5) goto L_0x0329;
    L_0x031a:
        r4 = r6.f311h;	 Catch:{ all -> 0x018b }
        r5 = r0.f311h;	 Catch:{ all -> 0x018b }
        if (r4 != r5) goto L_0x0329;
    L_0x0320:
        r4 = r6.f310g;	 Catch:{ all -> 0x018b }
        r0 = r0.f310g;	 Catch:{ all -> 0x018b }
        if (r4 != r0) goto L_0x0329;
    L_0x0326:
        r0 = r1;
        goto L_0x027c;
    L_0x0329:
        r0 = r2;
        goto L_0x027c;
    L_0x032c:
        r4 = r0.f314k;	 Catch:{ all -> 0x018b }
        if (r4 != r1) goto L_0x027b;
    L_0x0330:
        r4 = r6.f306c;	 Catch:{ all -> 0x018b }
        r5 = r0.f306c;	 Catch:{ all -> 0x018b }
        if (r4 != r5) goto L_0x034d;
    L_0x0336:
        r4 = r6.f307d;	 Catch:{ all -> 0x018b }
        r5 = r0.f307d;	 Catch:{ all -> 0x018b }
        if (r4 != r5) goto L_0x034d;
    L_0x033c:
        r4 = r6.f305b;	 Catch:{ all -> 0x018b }
        if (r4 == 0) goto L_0x034d;
    L_0x0340:
        r4 = r6.f305b;	 Catch:{ all -> 0x018b }
        r0 = r0.f305b;	 Catch:{ all -> 0x018b }
        r0 = r4.equals(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x034d;
    L_0x034a:
        r0 = r1;
        goto L_0x027c;
    L_0x034d:
        r0 = r2;
        goto L_0x027c;
    L_0x0350:
        r5 = r2;
        goto L_0x027f;
    L_0x0353:
        r10 = com.amap.p003a.bu.m477b();	 Catch:{ all -> 0x018b }
        r12 = r14.f227G;	 Catch:{ all -> 0x018b }
        r10 = r10 - r12;
        r12 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r0 <= 0) goto L_0x0363;
    L_0x0360:
        r4 = r1;
        goto L_0x0286;
    L_0x0363:
        r4 = r2;
        goto L_0x0286;
    L_0x0366:
        r0 = r2;
        goto L_0x02a1;
    L_0x0369:
        if (r2 != 0) goto L_0x047b;
    L_0x036b:
        r8 = com.amap.p003a.bu.m477b();	 Catch:{ all -> 0x018b }
        r14.f246Z = r8;	 Catch:{ all -> 0x018b }
    L_0x0371:
        r0 = r14.f244X;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x048d;
    L_0x0375:
        r0 = r14.ak;	 Catch:{ all -> 0x018b }
        r2 = r14.f244X;	 Catch:{ all -> 0x018b }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x048d;
    L_0x037f:
        r8 = com.amap.p003a.bu.m464a();	 Catch:{ all -> 0x018b }
        r10 = r14.f245Y;	 Catch:{ all -> 0x018b }
        r8 = r8 - r10;
        r10 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x0481;
    L_0x038c:
        r0 = r14.f244X;	 Catch:{ all -> 0x018b }
        r14.ak = r0;	 Catch:{ all -> 0x018b }
    L_0x0390:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x018b }
        r0.<init>();	 Catch:{ all -> 0x018b }
        r2 = r14.ak;	 Catch:{ all -> 0x018b }
        r0 = r0.append(r2);	 Catch:{ all -> 0x018b }
        r2 = "&";
        r0 = r0.append(r2);	 Catch:{ all -> 0x018b }
        r2 = r14.af;	 Catch:{ all -> 0x018b }
        r0 = r0.append(r2);	 Catch:{ all -> 0x018b }
        r2 = "&";
        r0 = r0.append(r2);	 Catch:{ all -> 0x018b }
        r2 = r14.ae;	 Catch:{ all -> 0x018b }
        r0 = r0.append(r2);	 Catch:{ all -> 0x018b }
        r0 = r0.toString();	 Catch:{ all -> 0x018b }
        r14.al = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f253g;	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x04e0;
    L_0x03bd:
        if (r1 != 0) goto L_0x04e0;
    L_0x03bf:
        if (r4 != 0) goto L_0x04e0;
    L_0x03c1:
        r0 = com.amap.p003a.bd.m338a();	 Catch:{ all -> 0x018b }
        r2 = r14.al;	 Catch:{ all -> 0x018b }
        r3 = r14.f265w;	 Catch:{ all -> 0x018b }
        r5 = r14.f253g;	 Catch:{ all -> 0x018b }
        r0 = r0.m344a(r2, r3, r5);	 Catch:{ all -> 0x018b }
    L_0x03cf:
        if (r4 != 0) goto L_0x03d7;
    L_0x03d1:
        r2 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r2 == 0) goto L_0x03d9;
    L_0x03d7:
        if (r1 == 0) goto L_0x04a5;
    L_0x03d9:
        r0 = 0;
        r1 = 1;
        r0 = r14.m203a(r0, r1);	 Catch:{ all -> 0x018b }
        r14.f226F = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x03fd;
    L_0x03e9:
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r1 = "new";
        r0.m797f(r1);	 Catch:{ all -> 0x018b }
        r0 = r14.f265w;	 Catch:{ all -> 0x018b }
        r0 = r0.toString();	 Catch:{ all -> 0x018b }
        r14.aa = r0;	 Catch:{ all -> 0x018b }
        r14.ab = r6;	 Catch:{ all -> 0x018b }
        r14.m222j();	 Catch:{ all -> 0x018b }
    L_0x03fd:
        r0 = com.amap.p003a.bd.m338a();	 Catch:{ all -> 0x018b }
        r1 = r14.al;	 Catch:{ all -> 0x018b }
        r2 = r14.f265w;	 Catch:{ all -> 0x018b }
        r3 = r14.f226F;	 Catch:{ all -> 0x018b }
        r4 = r14.f247a;	 Catch:{ all -> 0x018b }
        r5 = 1;
        r0.m346a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bg.m354a();	 Catch:{ all -> 0x018b }
        r1 = r14.f247a;	 Catch:{ all -> 0x018b }
        r2 = r14.ak;	 Catch:{ all -> 0x018b }
        r3 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0.m356a(r1, r2, r3);	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x0468;
    L_0x0422:
        r1 = r14.ak;	 Catch:{ all -> 0x018b }
        r0 = r14.f265w;	 Catch:{ all -> 0x018b }
        r2 = r0.toString();	 Catch:{ all -> 0x018b }
        r3 = r14.f248b;	 Catch:{ all -> 0x018b }
        r4 = r14.f247a;	 Catch:{ all -> 0x018b }
        r5 = r14.m225l();	 Catch:{ all -> 0x018b }
        r0 = r14;
        r0 = r0.m202a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x018b }
        r1 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r1 == 0) goto L_0x0468;
    L_0x043d:
        r1 = r14.f265w;	 Catch:{ all -> 0x018b }
        r1 = r1.toString();	 Catch:{ all -> 0x018b }
        r14.aa = r1;	 Catch:{ all -> 0x018b }
        r1 = r14.f226F;	 Catch:{ all -> 0x018b }
        r14.f226F = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r2 = 8;
        r0.setLocationType(r2);	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x018b }
        r3 = "\u79bb\u7ebf\u5b9a\u4f4d\uff0c\u5728\u7ebf\u5b9a\u4f4d\u5931\u8d25\u539f\u56e0:";
        r2.<init>(r3);	 Catch:{ all -> 0x018b }
        r1 = r1.getErrorInfo();	 Catch:{ all -> 0x018b }
        r1 = r2.append(r1);	 Catch:{ all -> 0x018b }
        r1 = r1.toString();	 Catch:{ all -> 0x018b }
        r0.setLocationDetail(r1);	 Catch:{ all -> 0x018b }
    L_0x0468:
        r0 = r14.f265w;	 Catch:{ all -> 0x018b }
        r1 = 0;
        r2 = r14.f265w;	 Catch:{ all -> 0x018b }
        r2 = r2.length();	 Catch:{ all -> 0x018b }
        r0.delete(r1, r2);	 Catch:{ all -> 0x018b }
        r0 = 0;
        r14.f265w = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        goto L_0x003a;
    L_0x047b:
        r8 = 0;
        r14.f246Z = r8;	 Catch:{ all -> 0x018b }
        goto L_0x0371;
    L_0x0481:
        r8 = com.amap.p003a.bu.m464a();	 Catch:{ all -> 0x018b }
        r14.f245Y = r8;	 Catch:{ all -> 0x018b }
        r0 = r14.ak;	 Catch:{ all -> 0x018b }
        r14.f244X = r0;	 Catch:{ all -> 0x018b }
        goto L_0x0390;
    L_0x048d:
        r0 = r14.f244X;	 Catch:{ all -> 0x018b }
        if (r0 != 0) goto L_0x049d;
    L_0x0491:
        r8 = com.amap.p003a.bu.m464a();	 Catch:{ all -> 0x018b }
        r14.f245Y = r8;	 Catch:{ all -> 0x018b }
        r0 = r14.ak;	 Catch:{ all -> 0x018b }
        r14.f244X = r0;	 Catch:{ all -> 0x018b }
        goto L_0x0390;
    L_0x049d:
        r8 = com.amap.p003a.bu.m464a();	 Catch:{ all -> 0x018b }
        r14.f245Y = r8;	 Catch:{ all -> 0x018b }
        goto L_0x0390;
    L_0x04a5:
        if (r4 == 0) goto L_0x04c6;
    L_0x04a7:
        r0 = 0;
        r1 = 1;
        r0 = r14.m203a(r0, r1);	 Catch:{ all -> 0x018b }
        r14.f226F = r0;	 Catch:{ all -> 0x018b }
        r0 = r14.f226F;	 Catch:{ all -> 0x018b }
        r0 = com.amap.p003a.bu.m471a(r0);	 Catch:{ all -> 0x018b }
        if (r0 == 0) goto L_0x03fd;
    L_0x04b7:
        r0 = r14.f265w;	 Catch:{ all -> 0x018b }
        r0 = r0.toString();	 Catch:{ all -> 0x018b }
        r14.aa = r0;	 Catch:{ all -> 0x018b }
        r14.ab = r6;	 Catch:{ all -> 0x018b }
        r14.m222j();	 Catch:{ all -> 0x018b }
        goto L_0x03fd;
    L_0x04c6:
        r2 = 0;
        r14.f246Z = r2;	 Catch:{ all -> 0x018b }
        r1 = 4;
        r0.setLocationType(r1);	 Catch:{ all -> 0x018b }
        r14.f226F = r0;	 Catch:{ all -> 0x018b }
        r1 = 1;
        r0 = r0.m782a(r1);	 Catch:{ all -> 0x018b }
        r14.m211b(r0);	 Catch:{ all -> 0x018b }
        r14.m222j();	 Catch:{ all -> 0x018b }
        goto L_0x03fd;
    L_0x04dd:
        r0 = move-exception;
        goto L_0x0068;
    L_0x04e0:
        r0 = r3;
        goto L_0x03cf;
    L_0x04e3:
        r1 = r2;
        goto L_0x02a2;
    L_0x04e6:
        r6 = r3;
        goto L_0x0268;
    L_0x04e9:
        r0 = r2;
        goto L_0x00d7;
    L_0x04ec:
        r4 = r8;
        goto L_0x00d0;
    L_0x04ef:
        r0 = r3;
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.at.a():com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    public final AMapLocationServer m241a(double d, double d2) {
        try {
            String a = bj.m365a(("output=json&radius=1000&extensions=all&location=" + d2 + "," + d).getBytes(GameManager.DEFAULT_CHARSET), this.f247a, "http://restapi.amap.com/v3/geocode/regeo", true);
            bl blVar = new bl();
            if (a.contains("\"status\":\"1\"")) {
                AMapLocationServer a2 = bl.m377a(a);
                a2.setLatitude(d);
                a2.setLongitude(d2);
                return a2;
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public final synchronized AMapLocationServer m242a(boolean z) {
        AMapLocationServer a;
        AMapLocationServer aMapLocationServer;
        if (!this.aj) {
            m219i();
        }
        if (!this.am) {
            m238y();
        }
        ay ayVar = null;
        try {
            if (!this.f230J) {
                ayVar = this.f268z.m277a();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "doFirstNetLocate");
        }
        if (TextUtils.isEmpty(this.ak)) {
            aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
            aMapLocationServer.setErrorCode(this.f261o);
            aMapLocationServer.setLocationDetail(this.ad.toString());
        } else {
            a = m203a(false, z);
            if (bu.m471a(a)) {
                a.m797f("new");
                this.aa = this.f265w.toString();
                this.ab = ayVar;
                this.f226F = a;
                m211b(a.m782a(1));
                m222j();
                aMapLocationServer = a;
            } else {
                String stringBuilder = this.f265w.toString();
                m214e(this.f247a);
                aMapLocationServer = m202a(this.ak, stringBuilder, this.f248b, this.f247a, m225l());
                if (bu.m471a(aMapLocationServer)) {
                    this.aa = this.f265w.toString();
                    aMapLocationServer.m797f("file");
                    aMapLocationServer.setLocationType(8);
                    aMapLocationServer.setLocationDetail("\u79bb\u7ebf\u5b9a\u4f4d\u7ed3\u679c\uff0c\u5728\u7ebf\u5b9a\u4f4d\u5931\u8d25\u539f\u56e0:" + a.getErrorInfo());
                    this.f226F = aMapLocationServer;
                    m211b(aMapLocationServer.m782a(1));
                }
            }
        }
        a = aMapLocationServer;
        return a;
    }

    public final synchronized void m243a(AMapLocationServer aMapLocationServer) {
        if (bu.m471a(aMapLocationServer)) {
            bd.m338a().m346a(this.al, this.f265w, aMapLocationServer, this.f247a, true);
        }
    }

    public final void m244a(JSONObject jSONObject) {
        this.f248b = jSONObject;
        if (bu.m473a(jSONObject, "collwifiscan")) {
            try {
                Object string = jSONObject.getString("collwifiscan");
                if (TextUtils.isEmpty(string)) {
                    bc.f354h = 20;
                } else {
                    bc.f354h = Integer.parseInt(string) / PointerIconCompat.TYPE_DEFAULT;
                }
            } catch (Throwable th) {
                bc.m330a(th, "APS", "setExtra");
            }
        }
        if (this.f268z != null) {
            this.f268z.f323g = jSONObject;
        }
        if (this.f267y != null) {
            this.f267y.f340b = jSONObject;
        }
    }

    public final synchronized void m245a(boolean z, Context context) {
        if ((this.f234N > 0 && !this.f252f) || (z && !this.f252f)) {
            if (this.f250d == null) {
                this.f250d = new au(context.getApplicationContext());
                au auVar = this.f250d;
                ConnectionServiceManager connectionServiceManager = this.f264s;
                try {
                    auVar.f282j = connectionServiceManager;
                    if (auVar.f276d == null) {
                        auVar.f276d = new ConnectionServiceManager(auVar, connectionServiceManager);
                    }
                    if (auVar.f277e == null) {
                        auVar.f277e = new ConnectionServiceManager(auVar);
                    }
                    if (auVar.f278f == null) {
                        auVar.f278f = new ConnectionServiceManager(auVar);
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ConnectionServiceManager", "init");
                }
            }
            try {
                if (this.f250d != null) {
                    if (z) {
                        this.f250d.m260b();
                    } else {
                        this.f250d.m259a();
                    }
                }
                this.f252f = true;
            } catch (Throwable th2) {
                bc.m330a(th2, "APS", "bindService");
                this.f252f = true;
            }
        }
    }

    public final synchronized boolean m246a(Context context) {
        boolean z;
        if (this.f247a != null) {
            z = true;
        } else if (context == null) {
            z = false;
        } else {
            this.f247a = context.getApplicationContext();
            bn.m400e(this.f247a);
            bu.m478b(this.f247a);
            if (this.f267y == null) {
                this.f267y = new ba(this.f247a, (WifiManager) bu.m465a(this.f247a, "wifi"), this.f248b);
            }
            if (this.f268z == null) {
                this.f268z = new az(this.f247a, this.f248b);
            }
            bd.m338a().m345a(this.f247a);
            z = true;
        }
        return z;
    }

    public final void m247b() {
        try {
            m219i();
            m238y();
            m243a(m203a(true, true));
        } catch (Throwable th) {
            bc.m330a(th, "APS", "doFusionLocation");
        }
    }

    public final synchronized boolean m248b(Context context) {
        boolean z;
        if (m246a(context)) {
            this.ac = bj.m363a(this.f247a);
            if (this.f266x == null) {
                this.f266x = (ConnectivityManager) bu.m465a(this.f247a, "connectivity");
            }
            this.f237Q = new bm();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void m249c() {
        this.aj = false;
        this.am = false;
        this.f255i = false;
        bc.f355i = false;
        m255g();
        this.f249c = null;
        this.aa = null;
        m222j();
        if (this.f250d != null) {
            au auVar = this.f250d;
            try {
                if (auVar.f279g) {
                    auVar.f273a.unbindService(auVar.f276d);
                }
                if (auVar.f280h) {
                    auVar.f273a.unbindService(auVar.f277e);
                }
                if (auVar.f281i) {
                    auVar.f273a.unbindService(auVar.f278f);
                }
            } catch (Throwable th) {
                bc.m330a(th, "ConnectionServiceManager", "unbindService");
            }
            auVar.f275c = null;
            auVar.f273a = null;
            auVar.f275c = null;
            auVar.f276d = null;
            auVar.f277e = null;
            auVar.f278f = null;
            if (auVar.f282j != null) {
                auVar.f282j.m198a(-1);
            }
            auVar.f274b = true;
            auVar.f279g = false;
            auVar.f280h = false;
            auVar.f281i = false;
            this.f250d = null;
            this.f252f = false;
            this.f251e = -1;
        }
        m234u();
        try {
            bf.m347a().m352b(this.f247a);
        } catch (Throwable th2) {
            bc.m330a(th2, "APS", "destroy part");
        }
        aw.m262a().m265b();
        bu.m500g();
        try {
            if (!(this.f247a == null || this.f224D == null)) {
                this.f247a.unregisterReceiver(this.f224D);
            }
            this.f224D = null;
        } catch (Throwable th3) {
            this.f224D = null;
        }
        this.ag = false;
        if (this.f268z != null) {
            az azVar = this.f268z;
            if (!(azVar.f321e == null || azVar.f324h == null)) {
                try {
                    azVar.f321e.listen(azVar.f324h, 0);
                } catch (Throwable th22) {
                    bc.m330a(th22, "CgiManager", "destroy");
                }
            }
            azVar.f324h = null;
            synchronized (azVar.f328l) {
                azVar.f327k = true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            if (azVar.f326j != null) {
                azVar.f326j.quit();
                azVar.f326j = null;
            }
            azVar.f319c.clear();
            azVar.f320d = -113;
            azVar.f321e = null;
            azVar.f322f = null;
        }
        bg a = bg.m354a();
        bg a2 = bg.m354a();
        if (!a2.f379a.isEmpty()) {
            a2.f379a.clear();
        }
        a.f380b = false;
        m206a("stopOff");
        m206a("destroy");
        this.f259m = false;
        this.f245Y = 0;
        m229p();
        if (this.f221A != null) {
            this.f221A.clear();
        }
        this.f226F = null;
        this.f247a = null;
        if (this.f262p != null) {
            this.f262p.clear();
            this.f262p = null;
        }
        this.f249c = null;
        this.f241U = null;
    }

    public final synchronized void m250c(Context context) {
        if (m248b(context)) {
            bc.f355i = true;
            m214e(this.f247a);
            this.f229I = bu.m477b();
            if (!this.ag) {
                m223k();
                this.ag = true;
            }
            az azVar = this.f268z;
            azVar.m281c();
            if (!(azVar.f327k || azVar.f321e == null)) {
                try {
                    azVar.f318b = bu.m463a(azVar.f329m, azVar.f321e.getCellLocation());
                    azVar.f331o = null;
                } catch (SecurityException e) {
                    azVar.f331o = e.getMessage();
                } catch (Throwable th) {
                    azVar.f331o = null;
                    bc.m330a(th, "CgiManager", "CgiManager");
                    azVar.f318b = 9;
                }
                if (azVar.f326j != null) {
                    azVar.f326j.quit();
                    azVar.f326j = null;
                }
                if (azVar.f326j == null) {
                    azVar.f326j = new CgiManager(azVar, "listenerPhoneStateThread");
                    azVar.f326j.start();
                }
            }
            this.f268z.m281c();
            this.f268z.m280b();
            bg.m354a().m355a(this.f247a);
            this.f255i = true;
        }
    }

    public final synchronized void m251d(Context context) {
        try {
            if (f218t == -1 || m237x()) {
                f218t = 1;
                bn.m389a(context);
                f220v = bn.m420t();
                bu.m466a(context, f220v);
                f219u = bu.m477b();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "initAuth");
        }
    }

    final boolean m252d() {
        return this.f249c != null;
    }

    final boolean m253e() {
        boolean z = false;
        try {
            if (m252d()) {
                z = m232s();
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "collStarted");
        }
        return z;
    }

    final void m254f() {
        if (!m252d() || !m252d() || m233t() <= 0) {
        }
    }

    final void m255g() {
        if (m252d() && m253e()) {
            bc.f354h = 20;
            try {
                bp.m426a(this.f249c, "destroy", new Object[0]);
            } catch (Throwable th) {
                bc.m330a(th, "APS", "stop3rdCM");
            }
        }
    }

    public final synchronized AMapLocationServer m256h() {
        AMapLocationServer aMapLocationServer;
        if (this.ad.length() > 0) {
            this.ad.delete(0, this.ad.length());
        }
        if (!this.aj) {
            m219i();
        }
        m238y();
        if (TextUtils.isEmpty(this.ak)) {
            aMapLocationServer = new AMapLocationServer(LetterIndexBar.SEARCH_ICON_LETTER);
            aMapLocationServer.setErrorCode(this.f261o);
            aMapLocationServer.setLocationDetail(this.ad.toString());
        } else {
            aMapLocationServer = bd.m338a().m344a(this.al, this.f265w, this.f253g);
            if (bu.m471a(aMapLocationServer)) {
                this.f246Z = 0;
                aMapLocationServer.setLocationType(4);
                this.f226F = aMapLocationServer;
                m211b(aMapLocationServer.m782a(1));
                m222j();
            }
        }
        return aMapLocationServer;
    }
}
