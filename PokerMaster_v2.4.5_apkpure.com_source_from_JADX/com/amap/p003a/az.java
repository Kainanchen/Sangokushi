package com.amap.p003a;

import android.content.Context;
import android.os.HandlerThread;
import android.support.v4.internal.view.SupportMenu;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONObject;

/* compiled from: CgiManager */
/* renamed from: com.amap.a.az */
public final class az {
    Context f317a;
    int f318b;
    ArrayList<ay> f319c;
    int f320d;
    TelephonyManager f321e;
    Object f322f;
    JSONObject f323g;
    PhoneStateListener f324h;
    volatile CellLocation f325i;
    HandlerThread f326j;
    boolean f327k;
    Object f328l;
    volatile boolean f329m;
    PhoneStateListener f330n;
    String f331o;
    private long f332p;

    /* renamed from: com.amap.a.az.1 */
    class CgiManager extends PhoneStateListener {
        final /* synthetic */ az f315a;

        CgiManager(az azVar) {
            this.f315a = azVar;
        }

        public final void onCellLocationChanged(CellLocation cellLocation) {
            try {
                if (this.f315a.m278a(cellLocation)) {
                    this.f315a.f325i = cellLocation;
                    if (this.f315a.f330n != null) {
                        this.f315a.f330n.onCellLocationChanged(cellLocation);
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "CgiManager", "initPhoneStateListener7");
            }
        }

        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                switch (serviceState.getState()) {
                    case SQLiteDatabase.OPEN_READWRITE /*0*/:
                        this.f315a.m281c();
                        break;
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        this.f315a.m282d();
                        break;
                }
                if (this.f315a.f330n != null) {
                    this.f315a.f330n.onServiceStateChanged(serviceState);
                }
            } catch (Throwable th) {
                bc.m330a(th, "CgiManager", "initPhoneStateListener4");
            }
        }

        public final void onSignalStrengthChanged(int i) {
            int i2 = -113;
            try {
                switch (this.f315a.f318b) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        i2 = bu.m460a(i);
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        i2 = bu.m460a(i);
                        break;
                }
                az.m271a(this.f315a, i2);
                if (this.f315a.f330n != null) {
                    this.f315a.f330n.onSignalStrengthChanged(i);
                }
            } catch (Throwable th) {
                bc.m330a(th, "CgiManager", "initPhoneStateListener6");
            }
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (signalStrength != null) {
                int i = -113;
                try {
                    switch (this.f315a.f318b) {
                        case SQLiteDatabase.OPEN_READONLY /*1*/:
                            i = bu.m460a(signalStrength.getGsmSignalStrength());
                            break;
                        case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                            i = signalStrength.getCdmaDbm();
                            break;
                    }
                    az.m271a(this.f315a, i);
                    if (this.f315a.f330n != null) {
                        this.f315a.f330n.onSignalStrengthsChanged(signalStrength);
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "CgiManager", "initPhoneStateListener5");
                }
            }
        }
    }

    /* renamed from: com.amap.a.az.a */
    class CgiManager extends HandlerThread {
        final /* synthetic */ az f316a;

        public CgiManager(az azVar, String str) {
            this.f316a = azVar;
            super(str);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected final void onLooperPrepared() {
            /*
            r6 = this;
            super.onLooperPrepared();	 Catch:{ Throwable -> 0x0058 }
            r0 = r6.f316a;	 Catch:{ Throwable -> 0x0058 }
            r1 = r0.f328l;	 Catch:{ Throwable -> 0x0058 }
            monitor-enter(r1);	 Catch:{ Throwable -> 0x0058 }
            r0 = r6.f316a;	 Catch:{ all -> 0x0055 }
            r0 = r0.f327k;	 Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0039;
        L_0x000e:
            r2 = r6.f316a;	 Catch:{ all -> 0x0055 }
            r0 = new com.amap.a.az$1;	 Catch:{ all -> 0x0055 }
            r0.<init>(r2);	 Catch:{ all -> 0x0055 }
            r2.f324h = r0;	 Catch:{ all -> 0x0055 }
            r3 = "android.telephony.PhoneStateListener";
            r0 = 0;
            r4 = com.amap.p003a.bu.m485c();	 Catch:{ Throwable -> 0x0084 }
            r5 = 7;
            if (r4 >= r5) goto L_0x003b;
        L_0x0021:
            r4 = "LISTEN_SIGNAL_STRENGTH";
            r0 = com.amap.p003a.bp.m430b(r3, r4);	 Catch:{ Throwable -> 0x0084 }
        L_0x0027:
            if (r0 != 0) goto L_0x0042;
        L_0x0029:
            r0 = r2.f321e;	 Catch:{ all -> 0x0055 }
            r3 = r2.f324h;	 Catch:{ all -> 0x0055 }
            r4 = 16;
            r0.listen(r3, r4);	 Catch:{ all -> 0x0055 }
        L_0x0032:
            r0 = com.amap.p003a.az.m273e();	 Catch:{ Throwable -> 0x0065 }
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x005a;
                case 2: goto L_0x006e;
                default: goto L_0x0039;
            };
        L_0x0039:
            monitor-exit(r1);	 Catch:{ all -> 0x0055 }
        L_0x003a:
            return;
        L_0x003b:
            r4 = "LISTEN_SIGNAL_STRENGTHS";
            r0 = com.amap.p003a.bp.m430b(r3, r4);	 Catch:{ Throwable -> 0x0084 }
            goto L_0x0027;
        L_0x0042:
            r3 = r2.f321e;	 Catch:{ Throwable -> 0x004c }
            r4 = r2.f324h;	 Catch:{ Throwable -> 0x004c }
            r0 = r0 | 16;
            r3.listen(r4, r0);	 Catch:{ Throwable -> 0x004c }
            goto L_0x0032;
        L_0x004c:
            r0 = move-exception;
            r3 = "CgiManager";
            r4 = "initPhoneStateListener1";
            com.amap.p003a.bc.m330a(r0, r3, r4);	 Catch:{ all -> 0x0055 }
            goto L_0x0032;
        L_0x0055:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0055 }
            throw r0;	 Catch:{ Throwable -> 0x0058 }
        L_0x0058:
            r0 = move-exception;
            goto L_0x003a;
        L_0x005a:
            r0 = r2.f317a;	 Catch:{ Throwable -> 0x0065 }
            r3 = "phone_msim";
            r0 = com.amap.p003a.bu.m465a(r0, r3);	 Catch:{ Throwable -> 0x0065 }
            r2.f322f = r0;	 Catch:{ Throwable -> 0x0065 }
            goto L_0x0039;
        L_0x0065:
            r0 = move-exception;
            r2 = "CgiManager";
            r3 = "initPhoneStateListener";
            com.amap.p003a.bc.m330a(r0, r2, r3);	 Catch:{ all -> 0x0055 }
            goto L_0x0039;
        L_0x006e:
            r0 = r2.f317a;	 Catch:{ Throwable -> 0x0065 }
            r3 = "phone2";
            r0 = com.amap.p003a.bu.m465a(r0, r3);	 Catch:{ Throwable -> 0x0065 }
            r2.f322f = r0;	 Catch:{ Throwable -> 0x0065 }
            goto L_0x0039;
        L_0x0079:
            r0 = r2.f317a;	 Catch:{ Throwable -> 0x0065 }
            r3 = "phone2";
            r0 = com.amap.p003a.bu.m465a(r0, r3);	 Catch:{ Throwable -> 0x0065 }
            r2.f322f = r0;	 Catch:{ Throwable -> 0x0065 }
            goto L_0x0039;
        L_0x0084:
            r3 = move-exception;
            goto L_0x0027;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.a.az.a.onLooperPrepared():void");
        }

        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
            }
        }
    }

    public az(Context context, JSONObject jSONObject) {
        this.f318b = 9;
        this.f319c = new ArrayList();
        this.f320d = -113;
        this.f321e = null;
        this.f332p = 0;
        this.f326j = null;
        this.f327k = false;
        this.f328l = new Object();
        this.f329m = false;
        this.f330n = null;
        this.f331o = null;
        this.f323g = jSONObject;
        this.f317a = context;
        if (this.f321e == null) {
            this.f321e = (TelephonyManager) bu.m465a(this.f317a, "phone");
        }
    }

    private CellLocation m267a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            CellLocation a;
            if (str.equals("getAllCellInfo")) {
                a = az.m268a((List) bp.m426a(obj, "getAllCellInfo", new Object[0]));
            } else {
                Object a2 = bp.m426a(obj, str, objArr);
                a = a2 != null ? (CellLocation) a2 : null;
            }
            if (m278a(a)) {
                return a;
            }
        } catch (Throwable th) {
        }
        return null;
    }

    private static CellLocation m268a(List<?> list) {
        CellLocation cellLocation;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        CellLocation cellLocation2 = null;
        int i2 = 0;
        int i3 = 0;
        CellLocation cellLocation3 = null;
        while (i2 < list.size()) {
            CellLocation cellLocation4;
            Object obj = list.get(i2);
            if (obj != null) {
                try {
                    Object cast;
                    Class loadClass = systemClassLoader.loadClass("android.telephony.CellInfoGsm");
                    Class loadClass2 = systemClassLoader.loadClass("android.telephony.CellInfoWcdma");
                    Class loadClass3 = systemClassLoader.loadClass("android.telephony.CellInfoLte");
                    Class loadClass4 = systemClassLoader.loadClass("android.telephony.CellInfoCdma");
                    if (loadClass.isInstance(obj)) {
                        i = 1;
                        try {
                            cast = loadClass.cast(obj);
                        } catch (Throwable th) {
                            i3 = i;
                            cellLocation4 = cellLocation2;
                        }
                    } else if (loadClass2.isInstance(obj)) {
                        i = 2;
                        cast = loadClass2.cast(obj);
                    } else if (loadClass3.isInstance(obj)) {
                        i = 3;
                        cast = loadClass3.cast(obj);
                    } else if (loadClass4.isInstance(obj)) {
                        i = 4;
                        cast = loadClass4.cast(obj);
                    } else {
                        i = 0;
                        cast = null;
                    }
                    if (i > 0) {
                        Object a = bp.m426a(cast, "getCellIdentity", new Object[0]);
                        if (a != null) {
                            if (i != 4) {
                                int b;
                                if (i != 3) {
                                    i3 = bp.m429b(a, "getLac", new Object[0]);
                                    b = bp.m429b(a, "getCid", new Object[0]);
                                    cellLocation4 = new GsmCellLocation();
                                    cellLocation4.setLacAndCid(i3, b);
                                    cellLocation = cellLocation3;
                                    cellLocation3 = cellLocation4;
                                    break;
                                }
                                i3 = bp.m429b(a, "getTac", new Object[0]);
                                b = bp.m429b(a, "getCi", new Object[0]);
                                cellLocation4 = new GsmCellLocation();
                                try {
                                    cellLocation4.setLacAndCid(i3, b);
                                    cellLocation = cellLocation3;
                                    cellLocation3 = cellLocation4;
                                    break;
                                } catch (Throwable th2) {
                                    i3 = i;
                                }
                            } else {
                                cellLocation = new CdmaCellLocation();
                                try {
                                    cellLocation.setCellLocationData(bp.m429b(a, "getBasestationId", new Object[0]), bp.m429b(a, "getLatitude", new Object[0]), bp.m429b(a, "getLongitude", new Object[0]), bp.m429b(a, "getSystemId", new Object[0]), bp.m429b(a, "getNetworkId", new Object[0]));
                                    cellLocation3 = cellLocation2;
                                    break;
                                } catch (Throwable th3) {
                                    cellLocation3 = cellLocation;
                                    cellLocation4 = cellLocation2;
                                    i3 = i;
                                }
                            }
                        } else {
                            i3 = i;
                            cellLocation4 = cellLocation2;
                        }
                    } else {
                        i3 = i;
                        cellLocation4 = cellLocation2;
                    }
                } catch (Throwable th4) {
                    cellLocation4 = cellLocation2;
                }
            } else {
                cellLocation4 = cellLocation2;
            }
            i2++;
            cellLocation2 = cellLocation4;
        }
        i = i3;
        cellLocation = cellLocation3;
        cellLocation3 = cellLocation2;
        return i != 4 ? cellLocation3 : cellLocation;
    }

    private ay m269a(NeighboringCellInfo neighboringCellInfo) {
        if (bu.m485c() < 5) {
            return null;
        }
        try {
            ay ayVar = new ay(1);
            String[] a = bu.m476a(this.f321e);
            ayVar.f304a = a[0];
            ayVar.f305b = a[1];
            ayVar.f306c = bp.m429b(neighboringCellInfo, "getLac", new Object[0]);
            ayVar.f307d = neighboringCellInfo.getCid();
            ayVar.f313j = bu.m460a(neighboringCellInfo.getRssi());
            return ayVar;
        } catch (Throwable th) {
            bc.m330a(th, "CgiManager", "getGsm");
            return null;
        }
    }

    private void m270a(CellLocation cellLocation, boolean z) {
        if (cellLocation != null && this.f321e != null) {
            this.f319c.clear();
            if (m278a(cellLocation)) {
                this.f318b = 1;
                ArrayList arrayList = this.f319c;
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                ay ayVar = new ay(1);
                String[] a = bu.m476a(this.f321e);
                ayVar.f304a = a[0];
                ayVar.f305b = a[1];
                ayVar.f306c = gsmCellLocation.getLac();
                ayVar.f307d = gsmCellLocation.getCid();
                ayVar.f313j = this.f320d;
                arrayList.add(ayVar);
                if (!z) {
                    List<NeighboringCellInfo> neighboringCellInfo = this.f321e.getNeighboringCellInfo();
                    if (neighboringCellInfo != null && !neighboringCellInfo.isEmpty()) {
                        for (NeighboringCellInfo neighboringCellInfo2 : neighboringCellInfo) {
                            if (neighboringCellInfo2 != null && az.m272a(neighboringCellInfo2.getLac(), neighboringCellInfo2.getCid())) {
                                ay a2 = m269a(neighboringCellInfo2);
                                if (!(a2 == null || this.f319c.contains(a2))) {
                                    this.f319c.add(a2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean m272a(int i, int i2) {
        return (i == -1 || i == 0 || i > SupportMenu.USER_MASK || i2 == -1 || i2 == 0 || i2 == SupportMenu.USER_MASK || i2 >= 268435455) ? false : true;
    }

    public static int m273e() {
        int i = 0;
        try {
            Class.forName("android.telephony.MSimTelephonyManager");
            i = 1;
        } catch (Throwable th) {
        }
        if (i != 0) {
            return i;
        }
        try {
            Class.forName("android.telephony.TelephonyManager2");
            return 2;
        } catch (Throwable th2) {
            return i;
        }
    }

    private CellLocation m274f() {
        CellLocation cellLocation = null;
        Object obj = this.f322f;
        if (obj != null) {
            try {
                Class g = az.m275g();
                if (g.isInstance(obj)) {
                    obj = g.cast(obj);
                    String str = "getCellLocation";
                    cellLocation = m267a(obj, str, new Object[0]);
                    if (cellLocation == null) {
                        cellLocation = m267a(obj, str, Integer.valueOf(1));
                        if (cellLocation == null) {
                            cellLocation = m267a(obj, "getCellLocationGemini", Integer.valueOf(1));
                            if (cellLocation == null) {
                                cellLocation = m267a(obj, "getAllCellInfo", Integer.valueOf(1));
                                if (cellLocation != null) {
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "CgiManager", "getSim2Cgi");
            }
        }
        return cellLocation;
    }

    private static Class<?> m275g() {
        String str;
        Class<?> cls = null;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        switch (az.m273e()) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                str = "android.telephony.TelephonyManager";
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                str = "android.telephony.MSimTelephonyManager";
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                str = "android.telephony.TelephonyManager2";
                break;
            default:
                str = cls;
                break;
        }
        try {
            cls = systemClassLoader.loadClass(str);
        } catch (Throwable th) {
            bc.m330a(th, "CgiManager", "getSim2TmClass");
        }
        return cls;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized android.telephony.CellLocation m276a(boolean r10, boolean r11) {
        /*
        r9 = this;
        r3 = 0;
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 1;
        r2 = 0;
        monitor-enter(r9);
        r9.f329m = r10;	 Catch:{ all -> 0x0081 }
        r0 = r9.f329m;	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x0028;
    L_0x000d:
        r0 = r9.f321e;	 Catch:{ all -> 0x0081 }
        if (r0 == 0) goto L_0x0028;
    L_0x0011:
        r4 = r9.f321e;	 Catch:{ all -> 0x0081 }
        if (r4 != 0) goto L_0x0033;
    L_0x0015:
        r0 = r3;
    L_0x0016:
        r4 = r9.m278a(r0);	 Catch:{ all -> 0x0081 }
        if (r4 != 0) goto L_0x0020;
    L_0x001c:
        r0 = r9.m274f();	 Catch:{ all -> 0x0081 }
    L_0x0020:
        r4 = r9.m278a(r0);	 Catch:{ all -> 0x0081 }
        if (r4 == 0) goto L_0x0028;
    L_0x0026:
        r9.f325i = r0;	 Catch:{ all -> 0x0081 }
    L_0x0028:
        r0 = r9.f325i;	 Catch:{ all -> 0x0081 }
        r0 = r9.m278a(r0);	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x006d;
    L_0x0030:
        r0 = r3;
    L_0x0031:
        monitor-exit(r9);
        return r0;
    L_0x0033:
        r0 = r9.m280b();	 Catch:{ all -> 0x0081 }
        r5 = r9.m278a(r0);	 Catch:{ all -> 0x0081 }
        if (r5 != 0) goto L_0x0016;
    L_0x003d:
        r0 = "getAllCellInfo";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0081 }
        r0 = r9.m267a(r4, r0, r5);	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x0016;
    L_0x0048:
        r0 = "getCellLocationExt";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0081 }
        r6 = 0;
        r7 = 1;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0081 }
        r5[r6] = r7;	 Catch:{ all -> 0x0081 }
        r0 = r9.m267a(r4, r0, r5);	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x0016;
    L_0x005b:
        r0 = "getCellLocationGemini";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0081 }
        r6 = 0;
        r7 = 1;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0081 }
        r5[r6] = r7;	 Catch:{ all -> 0x0081 }
        r0 = r9.m267a(r4, r0, r5);	 Catch:{ all -> 0x0081 }
        goto L_0x0016;
    L_0x006d:
        r0 = r9.f329m;	 Catch:{ all -> 0x0081 }
        r3 = r9.f325i;	 Catch:{ all -> 0x0081 }
        r0 = com.amap.p003a.bu.m463a(r0, r3);	 Catch:{ all -> 0x0081 }
        switch(r0) {
            case 1: goto L_0x007b;
            case 2: goto L_0x0084;
            default: goto L_0x0078;
        };	 Catch:{ all -> 0x0081 }
    L_0x0078:
        r0 = r9.f325i;	 Catch:{ all -> 0x0081 }
        goto L_0x0031;
    L_0x007b:
        r0 = r9.f325i;	 Catch:{ all -> 0x0081 }
        r9.m270a(r0, r11);	 Catch:{ all -> 0x0081 }
        goto L_0x0078;
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x0084:
        r3 = r9.f325i;	 Catch:{ all -> 0x0081 }
        if (r3 == 0) goto L_0x0078;
    L_0x0088:
        r0 = r9.f319c;	 Catch:{ all -> 0x0081 }
        r0.clear();	 Catch:{ all -> 0x0081 }
        r0 = com.amap.p003a.bu.m485c();	 Catch:{ all -> 0x0081 }
        r4 = 5;
        if (r0 < r4) goto L_0x0078;
    L_0x0094:
        r0 = r9.f322f;	 Catch:{ Throwable -> 0x0149 }
        if (r0 == 0) goto L_0x00c0;
    L_0x0098:
        r0 = r3.getClass();	 Catch:{ Throwable -> 0x0153 }
        r4 = "mGsmCellLoc";
        r0 = r0.getDeclaredField(r4);	 Catch:{ Throwable -> 0x0153 }
        r4 = r0.isAccessible();	 Catch:{ Throwable -> 0x0153 }
        if (r4 != 0) goto L_0x00ac;
    L_0x00a8:
        r4 = 1;
        r0.setAccessible(r4);	 Catch:{ Throwable -> 0x0153 }
    L_0x00ac:
        r0 = r0.get(r3);	 Catch:{ Throwable -> 0x0153 }
        r0 = (android.telephony.gsm.GsmCellLocation) r0;	 Catch:{ Throwable -> 0x0153 }
        if (r0 == 0) goto L_0x0154;
    L_0x00b4:
        r4 = r9.m278a(r0);	 Catch:{ Throwable -> 0x0153 }
        if (r4 == 0) goto L_0x0154;
    L_0x00ba:
        r9.m270a(r0, r11);	 Catch:{ Throwable -> 0x0153 }
        r0 = r1;
    L_0x00be:
        if (r0 != 0) goto L_0x0078;
    L_0x00c0:
        r0 = r9.m278a(r3);	 Catch:{ Throwable -> 0x0149 }
        if (r0 == 0) goto L_0x0078;
    L_0x00c6:
        r0 = 2;
        r9.f318b = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = r9.f321e;	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bu.m476a(r0);	 Catch:{ Throwable -> 0x0149 }
        r1 = new com.amap.a.ay;	 Catch:{ Throwable -> 0x0149 }
        r2 = 2;
        r1.<init>(r2);	 Catch:{ Throwable -> 0x0149 }
        r2 = 0;
        r2 = r0[r2];	 Catch:{ Throwable -> 0x0149 }
        r1.f304a = r2;	 Catch:{ Throwable -> 0x0149 }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ Throwable -> 0x0149 }
        r1.f305b = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = "getSystemId";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bp.m429b(r3, r0, r2);	 Catch:{ Throwable -> 0x0149 }
        r1.f310g = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = "getNetworkId";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bp.m429b(r3, r0, r2);	 Catch:{ Throwable -> 0x0149 }
        r1.f311h = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = "getBaseStationId";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bp.m429b(r3, r0, r2);	 Catch:{ Throwable -> 0x0149 }
        r1.f312i = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = r9.f320d;	 Catch:{ Throwable -> 0x0149 }
        r1.f313j = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = "getBaseStationLatitude";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bp.m429b(r3, r0, r2);	 Catch:{ Throwable -> 0x0149 }
        r1.f308e = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = "getBaseStationLongitude";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0149 }
        r0 = com.amap.p003a.bp.m429b(r3, r0, r2);	 Catch:{ Throwable -> 0x0149 }
        r1.f309f = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = r1.f308e;	 Catch:{ Throwable -> 0x0149 }
        if (r0 < 0) goto L_0x0134;
    L_0x011e:
        r0 = r1.f309f;	 Catch:{ Throwable -> 0x0149 }
        if (r0 < 0) goto L_0x0134;
    L_0x0122:
        r0 = r1.f308e;	 Catch:{ Throwable -> 0x0149 }
        if (r0 == r8) goto L_0x0134;
    L_0x0126:
        r0 = r1.f309f;	 Catch:{ Throwable -> 0x0149 }
        if (r0 == r8) goto L_0x0134;
    L_0x012a:
        r0 = r1.f308e;	 Catch:{ Throwable -> 0x0149 }
        r2 = r1.f309f;	 Catch:{ Throwable -> 0x0149 }
        if (r0 != r2) goto L_0x013a;
    L_0x0130:
        r0 = r1.f308e;	 Catch:{ Throwable -> 0x0149 }
        if (r0 <= 0) goto L_0x013a;
    L_0x0134:
        r0 = 0;
        r1.f308e = r0;	 Catch:{ Throwable -> 0x0149 }
        r0 = 0;
        r1.f309f = r0;	 Catch:{ Throwable -> 0x0149 }
    L_0x013a:
        r0 = r9.f319c;	 Catch:{ Throwable -> 0x0149 }
        r0 = r0.contains(r1);	 Catch:{ Throwable -> 0x0149 }
        if (r0 != 0) goto L_0x0078;
    L_0x0142:
        r0 = r9.f319c;	 Catch:{ Throwable -> 0x0149 }
        r0.add(r1);	 Catch:{ Throwable -> 0x0149 }
        goto L_0x0078;
    L_0x0149:
        r0 = move-exception;
        r1 = "CgiManager";
        r2 = "hdlCdmaLocChange";
        com.amap.p003a.bc.m330a(r0, r1, r2);	 Catch:{ all -> 0x0081 }
        goto L_0x0078;
    L_0x0153:
        r0 = move-exception;
    L_0x0154:
        r0 = r2;
        goto L_0x00be;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.az.a(boolean, boolean):android.telephony.CellLocation");
    }

    public final ay m277a() {
        ArrayList arrayList = this.f319c;
        return arrayList.size() > 0 ? (ay) arrayList.get(0) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m278a(android.telephony.CellLocation r5) {
        /*
        r4 = this;
        r1 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r1;
    L_0x0004:
        r0 = 1;
        r2 = r4.f329m;
        r2 = com.amap.p003a.bu.m463a(r2, r5);
        switch(r2) {
            case 1: goto L_0x0016;
            case 2: goto L_0x0030;
            default: goto L_0x000e;
        };
    L_0x000e:
        r1 = r0;
    L_0x000f:
        if (r1 != 0) goto L_0x0003;
    L_0x0011:
        r0 = 9;
        r4.f318b = r0;
        goto L_0x0003;
    L_0x0016:
        r5 = (android.telephony.gsm.GsmCellLocation) r5;	 Catch:{ Throwable -> 0x0026 }
        r1 = r5.getLac();	 Catch:{ Throwable -> 0x0026 }
        r2 = r5.getCid();	 Catch:{ Throwable -> 0x0026 }
        r0 = com.amap.p003a.az.m272a(r1, r2);	 Catch:{ Throwable -> 0x0026 }
        r1 = r0;
        goto L_0x000f;
    L_0x0026:
        r1 = move-exception;
        r2 = "CgiManager";
        r3 = "cgiUseful Cgi.iGsmT";
        com.amap.p003a.bc.m330a(r1, r2, r3);
        r1 = r0;
        goto L_0x000f;
    L_0x0030:
        r2 = "getSystemId";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0054 }
        r2 = com.amap.p003a.bp.m429b(r5, r2, r3);	 Catch:{ Throwable -> 0x0054 }
        if (r2 <= 0) goto L_0x0051;
    L_0x003b:
        r2 = "getNetworkId";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0054 }
        r2 = com.amap.p003a.bp.m429b(r5, r2, r3);	 Catch:{ Throwable -> 0x0054 }
        if (r2 < 0) goto L_0x0051;
    L_0x0046:
        r2 = "getBaseStationId";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0054 }
        r2 = com.amap.p003a.bp.m429b(r5, r2, r3);	 Catch:{ Throwable -> 0x0054 }
        if (r2 >= 0) goto L_0x0052;
    L_0x0051:
        r0 = r1;
    L_0x0052:
        r1 = r0;
        goto L_0x000f;
    L_0x0054:
        r1 = move-exception;
        r2 = "CgiManager";
        r3 = "cgiUseful Cgi.iCdmaT";
        com.amap.p003a.bc.m330a(r1, r2, r3);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.az.a(android.telephony.CellLocation):boolean");
    }

    public final boolean m279a(boolean z) {
        return (z || this.f332p == 0 || bu.m477b() - this.f332p < StatisticConfig.MIN_UPLOAD_INTERVAL) ? false : true;
    }

    public final CellLocation m280b() {
        if (this.f321e != null) {
            try {
                CellLocation cellLocation = this.f321e.getCellLocation();
                this.f331o = null;
                if (m278a(cellLocation)) {
                    this.f325i = cellLocation;
                    return cellLocation;
                }
            } catch (SecurityException e) {
                this.f331o = e.getMessage();
            } catch (Throwable th) {
                this.f331o = null;
                bc.m330a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    final void m281c() {
        Object obj = 1;
        JSONObject jSONObject = this.f323g;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("cellupdate") && jSONObject.getString("cellupdate").equals("0")) {
                    obj = null;
                }
            } catch (Throwable th) {
                bc.m330a(th, "CgiManager", "updateCgi1");
            }
        }
        if (obj != null) {
            try {
                CellLocation.requestLocationUpdate();
            } catch (Throwable th2) {
                bc.m330a(th2, "CgiManager", "updateCgi");
            }
            this.f332p = bu.m477b();
        }
    }

    final void m282d() {
        this.f331o = null;
        this.f325i = null;
        this.f318b = 9;
        this.f319c.clear();
    }

    static /* synthetic */ void m271a(az azVar, int i) {
        if (i == -113) {
            azVar.f320d = -113;
            return;
        }
        azVar.f320d = i;
        switch (azVar.f318b) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                if (!azVar.f319c.isEmpty()) {
                    try {
                        ((ay) azVar.f319c.get(0)).f313j = azVar.f320d;
                    } catch (Throwable th) {
                        bc.m330a(th, "CgiManager", "hdlCgiSigStrenChange");
                    }
                }
            default:
        }
    }
}
