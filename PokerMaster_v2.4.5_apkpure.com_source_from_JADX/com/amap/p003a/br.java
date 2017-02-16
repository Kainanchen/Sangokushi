package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONObject;

/* compiled from: ReportUtil */
/* renamed from: com.amap.a.br */
public final class br {
    public static synchronized void m431a(Context context, int i, AMapLocation aMapLocation) {
        Object obj = null;
        Object obj2 = 1;
        synchronized (br.class) {
            if (!(context == null || aMapLocation == null)) {
                try {
                    if (bn.m415o()) {
                        String str = "net";
                        int i2 = aMapLocation.getErrorCode() == 0 ? 1 : 0;
                        int i3;
                        switch (i) {
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                                str = "cache";
                                i3 = 1;
                                break;
                            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                str = "net";
                                i3 = 1;
                                break;
                        }
                        if (aMapLocation.getErrorCode() != 0) {
                            switch (aMapLocation.getErrorCode()) {
                                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                                    str = "net";
                                    break;
                            }
                        }
                        obj2 = obj;
                        if (obj2 != null) {
                            br.m435a(context, "O005", i2, str);
                        }
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ReportUtil", "reportBatting");
                }
            }
        }
    }

    public static synchronized void m432a(Context context, bq bqVar) {
        Object obj = 1;
        Object obj2 = null;
        synchronized (br.class) {
            if (context != null) {
                try {
                    if (bn.m415o()) {
                        int intValue;
                        AMapLocationServer aMapLocationServer = bqVar.f499c;
                        int intValue2 = Long.valueOf(bqVar.f498b - bqVar.f497a).intValue();
                        String str = "net";
                        if (aMapLocationServer != null) {
                            intValue = Long.valueOf(aMapLocationServer.m804j()).intValue();
                            switch (aMapLocationServer.getLocationType()) {
                                case SQLiteDatabase.OPEN_READONLY /*1*/:
                                    obj = null;
                                    break;
                                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                                    str = "cache";
                                    int i = 1;
                                    break;
                                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                    str = "net";
                                    break;
                            }
                        }
                        intValue = 0;
                        if (obj != null) {
                            if (obj2 == null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("param_int_first", intValue);
                                jSONObject.put("param_int_second", intValue2);
                                br.m436a(context, "O003", jSONObject);
                            }
                            br.m435a(context, "O002", intValue2, str);
                        }
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ReportUtil", "reportLBSLocUseTime");
                }
            }
        }
    }

    public static synchronized void m433a(Context context, String str) {
        synchronized (br.class) {
            try {
                br.m435a(context, "O007", ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, str);
            } catch (Throwable th) {
                bc.m330a(th, "ReportUtil", "reportDex_triggerDownload");
            }
        }
    }

    public static synchronized void m434a(Context context, String str, int i) {
        synchronized (br.class) {
            try {
                br.m435a(context, "O009", i, str);
            } catch (Throwable th) {
                bc.m330a(th, "ReportUtil", "reportDex_dexLoadClass");
            }
        }
    }

    private static synchronized void m435a(Context context, String str, int i, String str2) {
        synchronized (br.class) {
            if (context != null) {
                try {
                    if (bn.m415o()) {
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("param_string_first", str2);
                        }
                        if (i != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                            jSONObject.put("param_int_first", i);
                        }
                        br.m436a(context, str, jSONObject);
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ReportUtil", "applyStatisticsEx");
                }
            }
        }
    }

    private static synchronized void m436a(Context context, String str, JSONObject jSONObject) {
        synchronized (br.class) {
            if (context != null) {
                try {
                    if (bn.m415o()) {
                        aq aqVar = new aq(context, "loc", "3.0.0", str);
                        aqVar.m187a(jSONObject.toString());
                        ar.m190a(aqVar, context);
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ReportUtil", "applyStatistics");
                }
            }
        }
    }

    public static synchronized void m437a(String str, String str2) {
        synchronized (br.class) {
            try {
                cp.m659b(bc.m324a("loc", "3.0.0"), str2, str);
            } catch (Throwable th) {
                bc.m330a(th, "ReportUtil", "reportLog");
            }
        }
    }

    public static synchronized boolean m438a(Context context, cj cjVar) {
        boolean z;
        synchronized (br.class) {
            z = false;
            try {
                z = InstanceFactory.m722a(context, cjVar);
            } catch (Throwable th) {
            }
        }
        return z;
    }

    public static synchronized void m439b(Context context, bq bqVar) {
        synchronized (br.class) {
            if (context != null) {
                try {
                    if (bn.m415o()) {
                        String str = "O004";
                        br.m435a(context, str, Long.valueOf(bqVar.f498b - bqVar.f497a).intValue(), null);
                    }
                } catch (Throwable th) {
                    bc.m330a(th, "ReportUtil", "reportGPSLocUseTime");
                }
            }
        }
    }

    public static synchronized void m440b(Context context, String str, int i) {
        synchronized (br.class) {
            try {
                br.m435a(context, "O010", i, str);
            } catch (Throwable th) {
                bc.m330a(th, "ReportUtil", "reportDex_dexFunction");
            }
        }
    }
}
