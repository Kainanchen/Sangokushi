package com.tencent.android.tpush.p067a;

import android.content.Context;
import android.os.Environment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.service.channel.protocol.TpnsPushClientReport;
import com.tencent.android.tpush.service.channel.protocol.TpnsPushMsg;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.android.tpush.a.a */
public class ProGuard {
    public static boolean f7279a;
    public static String f7280b;
    protected static volatile ExecutorService f7281c;
    public static AtomicInteger f7282d;
    public static AtomicInteger f7283e;
    public static AtomicInteger f7284f;
    public static AtomicInteger f7285g;
    public static AtomicInteger f7286h;
    public static AtomicInteger f7287i;
    public static AtomicInteger f7288j;
    public static AtomicInteger f7289k;
    public static AtomicInteger f7290l;
    public static AtomicInteger f7291m;
    public static AtomicInteger f7292n;
    private static boolean f7293o;
    private static Boolean f7294p;
    private static final SimpleDateFormat f7295q;
    private static List f7296r;
    private static boolean f7297s;
    private static boolean f7298t;
    private static String f7299u;

    static {
        f7279a = false;
        f7293o = false;
        f7294p = null;
        f7280b = "tencent" + File.separator + Constants.LogTag + File.separator + "Logs";
        f7295q = new SimpleDateFormat("MM.dd_HH:mm:ss_SSS");
        f7296r = Collections.synchronizedList(new ArrayList());
        f7297s = false;
        f7298t = false;
        f7299u = null;
        f7281c = Executors.newSingleThreadExecutor(new ProGuard());
        f7282d = new AtomicInteger();
        f7283e = new AtomicInteger();
        f7284f = new AtomicInteger();
        f7285g = new AtomicInteger();
        f7286h = new AtomicInteger();
        f7287i = new AtomicInteger();
        f7288j = new AtomicInteger();
        f7289k = new AtomicInteger();
        f7290l = new AtomicInteger();
        f7291m = new AtomicInteger();
        f7292n = new AtomicInteger();
    }

    public static void m4699a(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                f7279a = true;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                f7293o = true;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                f7293o = true;
                f7279a = true;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                f7293o = false;
                f7279a = false;
            default:
                Log.e("XGLogger", "TLogger ->setLogToFile unknown cmd " + i);
        }
    }

    public static boolean m4707a(Context context) {
        if (context == null) {
            return false;
        }
        if (f7294p == null) {
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5319b(context, "_isReportEnable", -1) == 1) {
                f7294p = Boolean.valueOf(true);
            } else {
                f7294p = Boolean.valueOf(false);
            }
        }
        return f7294p.booleanValue();
    }

    public static void m4703a(String str, String str2) {
        if (f7279a && ProGuard.m4712b(2)) {
            new StringBuilder("[").append(str).append("] ").append(str2);
        }
        ProGuard.m4704a("TRACE", str, str2, null);
    }

    public static void m4710b(String str, String str2) {
        if (ProGuard.m4712b(2)) {
            new StringBuilder("[").append(str).append("] ").append(str2);
        }
        ProGuard.m4704a("TRACE", str, str2, null);
    }

    public static void m4715c(String str, String str2) {
        if (f7279a && ProGuard.m4712b(3)) {
            new StringBuilder("[").append(str).append("] ").append(str2);
        }
        ProGuard.m4704a("DEBUG", str, str2, null);
    }

    public static void m4718d(String str, String str2) {
        if (f7279a && ProGuard.m4712b(4)) {
            Log.i("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("INFO", str, str2, null);
    }

    public static void m4720e(String str, String str2) {
        if (ProGuard.m4712b(4)) {
            Log.i("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("INFO", str, str2, null);
    }

    public static void m4721f(String str, String str2) {
        if (f7279a && ProGuard.m4712b(5)) {
            Log.w("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("WARN", str, str2, null);
    }

    public static void m4722g(String str, String str2) {
        if (ProGuard.m4712b(5)) {
            Log.w("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("WARN", str, str2, null);
    }

    public static void m4723h(String str, String str2) {
        if (f7279a && ProGuard.m4712b(6)) {
            Log.e("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("ERROR", str, str2, null);
    }

    public static void m4724i(String str, String str2) {
        if (ProGuard.m4712b(6)) {
            Log.e("XINGE", "[" + str + "] " + str2);
        }
        ProGuard.m4704a("ERROR", str, str2, null);
    }

    public static void m4705a(String str, String str2, Throwable th) {
        if (f7279a && ProGuard.m4712b(2)) {
            new StringBuilder("[").append(str).append("] ").append(str2);
        }
        ProGuard.m4704a("TRACE", str, str2, th);
    }

    public static void m4711b(String str, String str2, Throwable th) {
        if (f7279a && ProGuard.m4712b(5)) {
            Log.w("XINGE", "[" + str + "] " + str2, th);
        }
        ProGuard.m4704a("WARN", str, str2, th);
    }

    public static void m4716c(String str, String str2, Throwable th) {
        if (f7279a && ProGuard.m4712b(6)) {
            Log.e("XINGE", "[" + str + "] " + str2, th);
        }
        ProGuard.m4704a("ERROR", str, str2, th);
    }

    public static void m4719d(String str, String str2, Throwable th) {
        if (ProGuard.m4712b(6)) {
            Log.e("XINGE", "[" + str + "] " + str2, th);
        }
        ProGuard.m4704a("ERROR", str, str2, th);
    }

    private static boolean m4712b(int i) {
        return true;
    }

    private static void m4704a(String str, String str2, String str3, Throwable th) {
        if (f7293o || ProGuard.m4707a(com.tencent.android.tpush.service.ProGuard.m5376e())) {
            if (str2 == null || str2.trim().equals(LetterIndexBar.SEARCH_ICON_LETTER)) {
                str2 = "XGLogger";
            }
            String format = f7295q.format(new Date());
            if (str3 == null) {
                str3 = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str3), AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
            String a = com.tencent.android.tpush.service.p077d.ProGuard.m5308a("[" + str2 + "]", 24);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    ProGuard.m4702a(format + " " + com.tencent.android.tpush.service.p077d.ProGuard.m5308a(str, 5) + " " + a + " " + readLine);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (th != null) {
                Writer stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                ProGuard.m4702a(format + " " + str + stringWriter.toString());
            }
        }
    }

    private static void m4702a(String str) {
        if (!f7298t) {
            f7296r.add(str);
            if (f7296r.size() == 100) {
                List list = f7296r;
                f7296r = Collections.synchronizedList(new ArrayList());
                boolean f = com.tencent.android.tpush.service.p077d.ProGuard.m5339f();
                f7297s = f;
                if (f) {
                    ProGuard.m4706a(list);
                }
            }
        }
    }

    private static String m4713c() {
        if (f7299u != null) {
            return f7299u;
        }
        try {
            String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + f7280b;
            f7299u = str;
            return str;
        } catch (Throwable th) {
            Log.e("XGLogger", "TLogger ->getFileNamePre", th);
            return null;
        }
    }

    private static void m4706a(List list) {
        ProGuard.m4707a(com.tencent.android.tpush.service.ProGuard.m5376e());
        if (f7293o) {
            try {
                f7281c.execute(new ProGuard(list));
            } catch (Throwable e) {
                Log.e("XGLogger", "savelog error", e);
            }
        }
    }

    private static void m4717d() {
        try {
            String c = ProGuard.m4713c();
            if (c != null) {
                File file = new File(c);
                if (file.exists()) {
                    int length = c.length() + 5;
                    int length2 = length + com.tencent.android.tpush.service.p077d.ProGuard.f7739a.length();
                    for (File file2 : file.listFiles()) {
                        try {
                            if (file2.isFile() && com.tencent.android.tpush.service.p077d.ProGuard.m5295a(com.tencent.android.tpush.service.p077d.ProGuard.m5294a(file2.getAbsolutePath().substring(length, length2)), 7)) {
                                file2.delete();
                            }
                        } catch (Exception e) {
                            Log.e("XGLogger", "removeOldDebugLogFiles" + e);
                        }
                    }
                }
            }
        } catch (Throwable e2) {
            Log.e("XGLogger", "removeOldDebugLogFiles", e2);
        }
    }

    public static void m4701a(int i, List list) {
        if (f7293o) {
            List arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (TpnsPushClientReport tpnsPushClientReport : list) {
                    arrayList.add(Long.valueOf(tpnsPushClientReport.msgId));
                }
            }
            if (arrayList.size() > 0) {
                ProGuard.m4714c(i, arrayList);
            }
        }
    }

    public static void m4709b(int i, List list) {
        if (f7293o) {
            List arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (TpnsPushMsg tpnsPushMsg : list) {
                    arrayList.add(Long.valueOf(tpnsPushMsg.msgId));
                }
            }
            if (arrayList.size() > 0) {
                ProGuard.m4714c(i, arrayList);
            }
        }
    }

    public static void m4700a(int i, long j) {
        if (f7293o) {
            List arrayList = new ArrayList();
            arrayList.add(Long.valueOf(j));
            if (arrayList.size() > 0) {
                ProGuard.m4714c(i, arrayList);
            }
        }
    }

    public static synchronized void m4714c(int i, List list) {
        FileWriter fileWriter;
        Throwable th;
        synchronized (ProGuard.class) {
            if (f7293o) {
                FileWriter fileWriter2 = null;
                try {
                    int andIncrement;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String str = Environment.getExternalStorageDirectory() + "/";
                    String str2;
                    switch (i) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            str2 = str + "_0ServerSendToService.txt";
                            andIncrement = f7282d.getAndIncrement();
                            str = str2;
                            break;
                        case SQLiteDatabase.OPEN_READONLY /*1*/:
                            str2 = str + "_1ServiceAckToServer.txt";
                            andIncrement = f7283e.getAndIncrement();
                            str = str2;
                            break;
                        case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                            str2 = str + "_2XgSdkReceiveFromXGService.txt";
                            andIncrement = f7284f.getAndIncrement();
                            str = str2;
                            break;
                        case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                            str2 = str + "_3SdkSendAckToService.txt";
                            andIncrement = f7285g.getAndIncrement();
                            str = str2;
                            break;
                        case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                            str2 = str + "_4ServiceRecAckFromSdk1.txt";
                            andIncrement = f7286h.getAndIncrement();
                            str = str2;
                            break;
                        case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                            str2 = str + "_5ServiceRecAckFromSdk2.txt";
                            andIncrement = f7287i.getAndIncrement();
                            str = str2;
                            break;
                        case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                            str2 = str + "_6ServiceRecAckFromSdk3.txt";
                            andIncrement = f7288j.getAndIncrement();
                            str = str2;
                            break;
                        case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                            str2 = str + "_7ServiceRecAckFromServer.txt";
                            andIncrement = f7289k.getAndIncrement();
                            str = str2;
                            break;
                        case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                            str2 = str + "_8ServiceRecAckFromServer_failed";
                            andIncrement = f7290l.getAndIncrement();
                            str = str2;
                            break;
                        case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                            str2 = str + "_11unequal";
                            andIncrement = f7291m.getAndIncrement();
                            str = str2;
                            break;
                        case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                            andIncrement = f7292n.getAndIncrement();
                            str = str + "_12notList";
                            break;
                        default:
                            ProGuard.m4723h("XGLogger", "unknown case");
                            break;
                    }
                    if (com.tencent.android.tpush.common.ProGuard.m4809a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        fileWriter = new FileWriter(str, true);
                        try {
                            for (Long l : list) {
                                fileWriter.write(andIncrement + "\t" + simpleDateFormat.format(new Date()) + "\tmsgid: " + l + "\n");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileWriter2 = fileWriter;
                            if (fileWriter2 != null) {
                                fileWriter2.close();
                            }
                            throw th;
                        }
                    } else {
                        fileWriter = null;
                    }
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ProGuard.m4716c("XGLogger", "writeMsgSession error", th);
                    if (fileWriter2 != null) {
                        fileWriter2.close();
                    }
                }
            }
        }
    }
}
