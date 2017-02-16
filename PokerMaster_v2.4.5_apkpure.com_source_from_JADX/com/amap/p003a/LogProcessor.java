package com.amap.p003a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.amap.p003a.ad.DiskLruCache;
import com.amap.p003a.cj.SDKInfo;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.amap.a.b */
public abstract class LogProcessor {
    cj f335a;
    int f336b;
    private ae f337c;
    private ad f338d;

    /* renamed from: com.amap.a.b.a */
    class LogProcessor implements ae {
        final /* synthetic */ LogProcessor f333a;
        private LogDBOperation f334b;

        LogProcessor(LogProcessor logProcessor, LogDBOperation logDBOperation) {
            this.f333a = logProcessor;
            this.f334b = logDBOperation;
        }

        public final void m283a(String str) {
            try {
                this.f334b.m701a(str, cn.m641a(this.f333a.f336b));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    protected LogProcessor(int i) {
        this.f336b = i;
    }

    private static ad m284a(Context context, String str) {
        ad adVar = null;
        try {
            File file = new File(cn.m642a(context, str));
            if (file.exists() || file.mkdirs()) {
                adVar = ad.m118a(file, 20480);
            }
        } catch (Throwable e) {
            cm.m637a(e, "LogProcessor", "initDiskLru");
        } catch (Throwable e2) {
            cm.m637a(e2, "LogProcessor", "initDiskLru");
        }
        return adVar;
    }

    private ae m285a(LogDBOperation logDBOperation) {
        try {
            if (this.f337c == null) {
                this.f337c = new LogProcessor(this, logDBOperation);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.f337c;
    }

    private static String m286a(Context context, cj cjVar) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("\"sim\":\"").append(ce.m555e(context)).append("\",\"sdkversion\":\"").append(cjVar.m612b()).append("\",\"product\":\"").append(cjVar.m611a()).append("\",\"ed\":\"").append(cjVar.m613c()).append("\",\"nt\":\"").append(ce.m553c(context)).append("\",\"np\":\"").append(ce.m545a(context)).append("\",\"mnc\":\"").append(ce.m551b(context)).append("\",\"ant\":\"").append(ce.m554d(context)).append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private static String m287a(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    private static String m288a(Throwable th) {
        String str = null;
        try {
            str = ck.m616a(th);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return str;
    }

    private static void m289a(LogDBOperation logDBOperation, String str, String str2, int i) {
        Object b = cn.m646b(i);
        b.m693a(0);
        b.f680a = ck.m625b(str);
        b.m694a(str2);
        if (b != null) {
            String b2 = LogInfo.m690b(b.m695b());
            List a = logDBOperation.f687a.m681a(b2, b.getClass(), true);
            if (a.size() == 0) {
                logDBOperation.f687a.m682a(b);
                return;
            }
            Object obj = (LogInfo) a.get(0);
            if (b.m692a() == 0) {
                obj.m696b(obj.m697c() + 1);
            } else {
                obj.m696b(0);
            }
            logDBOperation.f687a.m685a(b2, obj, true);
        }
    }

    private void m290a(List<? extends LogInfo> list, LogDBOperation logDBOperation) {
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                if (m296c(obj.m695b())) {
                    try {
                        logDBOperation.m701a(obj.m695b(), obj.getClass());
                    } catch (Throwable th) {
                        cm.m637a(th, "LogDB", "delLog");
                    }
                } else {
                    obj.m693a(2);
                    try {
                        logDBOperation.f687a.m685a(LogInfo.m690b(obj.m695b()), obj, false);
                    } catch (Throwable th2) {
                        cm.m637a(th2, "LogDB", "updateLogInfo");
                    }
                }
            }
        }
    }

    private boolean m291a(Context context, String str, String str2, String str3, LogDBOperation logDBOperation) {
        ad a;
        Throwable th;
        IOException e;
        DiskLruCache diskLruCache;
        Object obj;
        OutputStream outputStream;
        Throwable th2;
        OutputStream outputStream2;
        Object obj2;
        DiskLruCache diskLruCache2 = null;
        OutputStream outputStream3 = null;
        ad adVar = null;
        DiskLruCache diskLruCache3 = null;
        try {
            File file = new File(cn.m642a(context, str2));
            if (file.exists() || file.mkdirs()) {
                a = ad.m118a(file, 20480);
                try {
                    a.f153b = m285a(logDBOperation);
                    DiskLruCache a2 = a.m138a(str);
                    if (a2 != null) {
                        if (diskLruCache2 != null) {
                            try {
                                outputStream3.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        if (a2 != null) {
                            try {
                                a2.close();
                            } catch (Throwable th32) {
                                th32.printStackTrace();
                            }
                        }
                        if (a == null || a.m139a()) {
                            return false;
                        }
                        try {
                            a.close();
                            return false;
                        } catch (Throwable th4) {
                            th32 = th4;
                            th32.printStackTrace();
                            return false;
                        }
                    }
                    byte[] a3;
                    DiskLruCache b;
                    OutputStream a4;
                    try {
                        a3 = ck.m624a(str3);
                        b = a.m140b(str);
                        a4 = b.m110a();
                    } catch (IOException e2) {
                        e = e2;
                        diskLruCache = a2;
                        adVar = a;
                        obj = diskLruCache2;
                        diskLruCache2 = diskLruCache;
                        try {
                            e.printStackTrace();
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th322) {
                                    th322.printStackTrace();
                                }
                            }
                            if (diskLruCache2 != null) {
                                try {
                                    diskLruCache2.close();
                                } catch (Throwable th3222) {
                                    th3222.printStackTrace();
                                }
                            }
                            return adVar == null ? false : false;
                        } catch (Throwable th5) {
                            th2 = th5;
                            ad adVar2 = adVar;
                            outputStream2 = outputStream;
                            a = adVar2;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (Throwable th32222) {
                                    th32222.printStackTrace();
                                }
                            }
                            if (diskLruCache2 != null) {
                                try {
                                    diskLruCache2.close();
                                } catch (Throwable th322222) {
                                    th322222.printStackTrace();
                                }
                            }
                            try {
                                a.close();
                            } catch (Throwable th3222222) {
                                th3222222.printStackTrace();
                            }
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        diskLruCache = a2;
                        obj2 = diskLruCache2;
                        diskLruCache2 = diskLruCache;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (diskLruCache2 != null) {
                            diskLruCache2.close();
                        }
                        a.close();
                        throw th2;
                    }
                    try {
                        a4.write(a3);
                        b.m111b();
                        a.m141b();
                        if (a4 != null) {
                            try {
                                a4.close();
                            } catch (Throwable th22) {
                                th22.printStackTrace();
                            }
                        }
                        if (a2 != null) {
                            try {
                                a2.close();
                            } catch (Throwable th222) {
                                th222.printStackTrace();
                            }
                        }
                        if (!(a == null || a.m139a())) {
                            try {
                                a.close();
                            } catch (Throwable th2222) {
                                th2222.printStackTrace();
                            }
                        }
                        return true;
                    } catch (IOException e3) {
                        e = e3;
                        diskLruCache = a2;
                        adVar = a;
                        outputStream = a4;
                        diskLruCache2 = diskLruCache;
                        e.printStackTrace();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (diskLruCache2 != null) {
                            diskLruCache2.close();
                        }
                        if (adVar == null) {
                        }
                    } catch (Throwable th7) {
                        th2222 = th7;
                        diskLruCache = a2;
                        outputStream2 = a4;
                        diskLruCache2 = diskLruCache;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (diskLruCache2 != null) {
                            diskLruCache2.close();
                        }
                        a.close();
                        throw th2222;
                    }
                } catch (IOException e4) {
                    e = e4;
                    adVar = a;
                    obj = diskLruCache2;
                    e.printStackTrace();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (diskLruCache2 != null) {
                        diskLruCache2.close();
                    }
                    if (adVar == null) {
                    }
                } catch (Throwable th8) {
                    th2222 = th8;
                    obj2 = diskLruCache2;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (diskLruCache2 != null) {
                        diskLruCache2.close();
                    }
                    a.close();
                    throw th2222;
                }
            }
            if (diskLruCache2 != null) {
                try {
                    outputStream3.close();
                } catch (Throwable th32222222) {
                    th32222222.printStackTrace();
                }
            }
            if (diskLruCache2 != null) {
                try {
                    diskLruCache3.close();
                } catch (Throwable th322222222) {
                    th322222222.printStackTrace();
                }
            }
            if (diskLruCache2 == null || diskLruCache2.m139a()) {
                return false;
            }
            try {
                adVar.close();
                return false;
            } catch (Throwable th9) {
                th322222222 = th9;
            }
        } catch (IOException e5) {
            e = e5;
            adVar = diskLruCache2;
            outputStream = diskLruCache2;
            e.printStackTrace();
            if (outputStream != null) {
                outputStream.close();
            }
            if (diskLruCache2 != null) {
                diskLruCache2.close();
            }
            if (adVar == null && !adVar.m139a()) {
                try {
                    adVar.close();
                    return false;
                } catch (Throwable th10) {
                    th322222222 = th10;
                    th322222222.printStackTrace();
                    return false;
                }
            }
        } catch (Throwable th11) {
            th2222 = th11;
            a = diskLruCache2;
            outputStream2 = diskLruCache2;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            if (diskLruCache2 != null) {
                diskLruCache2.close();
            }
            a.close();
            throw th2222;
        }
    }

    public static boolean m292a(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            for (CharSequence charSequence : strArr) {
                str = str.trim();
                if (str.startsWith("at ") && str.contains(charSequence) && str.endsWith(")")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static String m293b() {
        return ck.m615a(new Date().getTime());
    }

    private static String m294b(String str) {
        String str2 = null;
        try {
            str2 = cd.m543c(ck.m624a(str));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str2;
    }

    private static boolean m295b(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            for (String trim : str.split("\n")) {
                if (LogProcessor.m292a(strArr, trim.trim())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean m296c(String str) {
        boolean z = false;
        if (this.f338d != null) {
            try {
                z = this.f338d.m142c(str);
            } catch (Throwable th) {
                cm.m637a(th, "LogUpdateProcessor", "deleteLogData");
            }
        }
        return z;
    }

    private static int m297d(String str) {
        int i = 0;
        am coVar = new co(ck.m630c(ck.m624a(str)));
        try {
            ah.m149a();
            byte[] a = ah.m151a(coVar);
            if (a == null) {
                return 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(ck.m618a(a));
                String str2 = SelectCountryActivity.EXTRA_COUNTRY_CODE;
                return jSONObject.has(str2) ? jSONObject.getInt(str2) : 0;
            } catch (Throwable e) {
                cm.m637a(e, "LogProcessor", "processUpdate");
                return 1;
            }
        } catch (Throwable e2) {
            if (e2.f541b != 27) {
                i = 1;
            }
            cm.m637a(e2, "LogProcessor", "processUpdate");
            return i;
        }
    }

    private static List<cj> m298d(Context context) {
        List<cj> a;
        Throwable th;
        Throwable th2;
        Throwable th3;
        List<cj> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    a = new SDKDBOperation(context, false).m703a();
                    try {
                        return a;
                    } catch (Throwable th22) {
                        th = th22;
                        list = a;
                        th3 = th;
                        try {
                            throw th3;
                        } catch (Throwable th32) {
                            th = th32;
                            a = list;
                            th22 = th;
                        }
                    }
                } catch (Throwable th4) {
                    th32 = th4;
                    throw th32;
                }
            }
        } catch (Throwable th322) {
            th = th322;
            a = null;
            th22 = th;
            th22.printStackTrace();
            return a;
        }
    }

    private static String m299e(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("\"key\":\"").append(cb.m523f(context)).append("\",\"platform\":\"android\",\"diu\":\"").append(ce.m567q(context)).append("\",\"pkg\":\"").append(cb.m520c(context)).append("\",\"model\":\"").append(Build.MODEL).append("\",\"appname\":\"").append(cb.m518b(context)).append("\",\"appversion\":\"").append(cb.m521d(context)).append("\",\"sysversion\":\"").append(VERSION.RELEASE).append("\",");
        } catch (Throwable th) {
            cm.m637a(th, "CInfo", "getPublicJSONInfo");
        }
        return stringBuilder.toString();
    }

    private String m300e(String str) {
        Throwable e;
        String str2;
        String str3;
        InputStream inputStream;
        Throwable th;
        Object obj;
        String str4 = null;
        InputStream inputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            if (this.f338d == null) {
                if (str4 != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable e2) {
                        cm.m637a(e2, "LogProcessor", "readLog1");
                    }
                }
                if (str4 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e3) {
                        e = e3;
                        str2 = "LogProcessor";
                        str3 = "readLog2";
                        cm.m637a(e, str2, str3);
                        return str4;
                    }
                }
                return str4;
            }
            DiskLruCache a = this.f338d.m138a(str);
            if (a == null) {
                if (str4 != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable e22) {
                        cm.m637a(e22, "LogProcessor", "readLog1");
                    }
                }
                if (str4 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        e = e4;
                        str2 = "LogProcessor";
                        str3 = "readLog2";
                        cm.m637a(e, str2, str3);
                        return str4;
                    }
                }
                return str4;
            }
            inputStream = a.f140a[0];
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    str4 = ck.m618a(byteArrayOutputStream.toByteArray());
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable e5) {
                            cm.m637a(e5, "LogProcessor", "readLog1");
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e6) {
                            e5 = e6;
                            str2 = "LogProcessor";
                            str3 = "readLog2";
                            cm.m637a(e5, str2, str3);
                            return str4;
                        }
                    }
                } catch (Throwable th2) {
                    e5 = th2;
                    try {
                        cm.m637a(e5, "LogProcessor", "readLog");
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable e52) {
                                cm.m637a(e52, "LogProcessor", "readLog1");
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e7) {
                                e52 = e7;
                                str2 = "LogProcessor";
                                str3 = "readLog2";
                                cm.m637a(e52, str2, str3);
                                return str4;
                            }
                        }
                        return str4;
                    } catch (Throwable th3) {
                        th = th3;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable e522) {
                                cm.m637a(e522, "LogProcessor", "readLog1");
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable e5222) {
                                cm.m637a(e5222, "LogProcessor", "readLog2");
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable e52222) {
                obj = str4;
                th = e52222;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
            return str4;
        } catch (Throwable e522222) {
            byteArrayOutputStream = str4;
            inputStream = str4;
            th = e522222;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    private static String m301f(Context context) {
        String str = null;
        try {
            String e = LogProcessor.m299e(context);
            if (!LetterIndexBar.SEARCH_ICON_LETTER.equals(e)) {
                str = cd.m542b(ck.m624a(e));
            }
        } catch (Throwable th) {
            cm.m637a(th, "LogProcessor", "getPublicInfo");
        }
        return str;
    }

    protected abstract String m303a(List<cj> list);

    final void m304a() {
        try {
            if (this.f338d != null && !this.f338d.m139a()) {
                this.f338d.close();
            }
        } catch (Throwable e) {
            cm.m637a(e, "LogProcessor", "closeDiskLru");
        } catch (Throwable e2) {
            cm.m637a(e2, "LogProcessor", "closeDiskLru");
        }
    }

    final void m305a(Context context) {
        List d = LogProcessor.m298d(context);
        if (d != null && d.size() != 0) {
            String a = m303a(d);
            if (a != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(a)) {
                String b = LogProcessor.m293b();
                String a2 = LogProcessor.m286a(context, this.f335a);
                cb.m516a(context);
                int i = this.f336b;
                b = LogProcessor.m287a(a2, b, i, "ANR", a);
                if (b != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(b)) {
                    a2 = m302a(a);
                    String b2 = LogProcessor.m294b(b);
                    String c = cn.m648c(this.f336b);
                    synchronized (Looper.getMainLooper()) {
                        LogDBOperation logDBOperation = new LogDBOperation(context);
                        m291a(context, a2, c, b2, logDBOperation);
                        LogProcessor.m289a(logDBOperation, this.f335a.m611a(), a2, i);
                    }
                }
            }
        }
    }

    final void m306a(Context context, Throwable th, String str, String str2) {
        List<cj> d = LogProcessor.m298d(context);
        if (d != null && d.size() != 0) {
            String a = LogProcessor.m288a(th);
            if (a != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(a)) {
                for (cj cjVar : d) {
                    if (LogProcessor.m295b(cjVar.m614d(), a)) {
                        m308a(cjVar, context, th, a.replaceAll("\n", "<br/>"), str, str2);
                        return;
                    }
                }
                if (a.contains("com.amap.api.col")) {
                    try {
                        m308a(new SDKInfo("collection", "1.0", "AMap_collection_1.0").m605a(new String[]{"com.amap.api.collection"}).m606a(), context, th, a, str, str2);
                    } catch (ca e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    final void m309b(Context context) {
        try {
            this.f338d = LogProcessor.m284a(context, cn.m648c(this.f336b));
        } catch (Throwable th) {
            cm.m637a(th, "LogProcessor", "processUpdateLog");
            return;
        }
        if (m310c(context)) {
            synchronized (Looper.getMainLooper()) {
                LogDBOperation logDBOperation = new LogDBOperation(context);
                try {
                    m290a(logDBOperation.m700a(2, cn.m641a(this.f336b)), logDBOperation);
                } catch (Throwable th2) {
                    cm.m637a(th2, "LogProcessor", "processDeleteFail");
                }
                List<LogInfo> a = logDBOperation.m700a(0, cn.m641a(this.f336b));
                if (a == null || a.size() == 0) {
                    return;
                }
                String str;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("{\"pinfo\":\"").append(LogProcessor.m301f(context)).append("\",\"els\":[");
                Object obj = 1;
                for (LogInfo logInfo : a) {
                    Object obj2;
                    String e = m300e(logInfo.m695b());
                    if (e == null || LetterIndexBar.SEARCH_ICON_LETTER.equals(e)) {
                        obj2 = obj;
                    } else {
                        e = e + "||" + logInfo.m697c();
                        if (obj != null) {
                            obj2 = null;
                        } else {
                            stringBuilder.append(",");
                            obj2 = obj;
                        }
                        stringBuilder.append("{\"log\":\"").append(e).append("\"}");
                    }
                    obj = obj2;
                }
                if (obj != null) {
                    str = null;
                } else {
                    stringBuilder.append("]}");
                    str = stringBuilder.toString();
                }
                if (str == null) {
                    return;
                }
                if (LogProcessor.m297d(str) == 1) {
                    m290a((List) a, logDBOperation);
                }
            }
        }
    }

    protected abstract boolean m310c(Context context);

    final void m308a(cj cjVar, Context context, Throwable th, String str, String str2, String str3) {
        m307a(cjVar, context, th.toString(), str, str2, str3);
    }

    final void m307a(cj cjVar, Context context, String str, String str2, String str3, String str4) {
        this.f335a = cjVar;
        String b = LogProcessor.m293b();
        String a = LogProcessor.m286a(context, cjVar);
        cb.m516a(context);
        if (str != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(str)) {
            int i = this.f336b;
            StringBuilder stringBuilder = new StringBuilder();
            if (str3 != null) {
                stringBuilder.append("class:").append(str3);
            }
            if (str4 != null) {
                stringBuilder.append(" method:").append(str4).append("$<br/>");
            }
            stringBuilder.append(str2);
            String a2 = m302a(str2);
            b = LogProcessor.m287a(a, b, i, str, stringBuilder.toString());
            if (b != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(b)) {
                String b2 = LogProcessor.m294b(b);
                String c = cn.m648c(this.f336b);
                synchronized (Looper.getMainLooper()) {
                    LogDBOperation logDBOperation = new LogDBOperation(context);
                    m291a(context, a2, c, b2, logDBOperation);
                    LogProcessor.m289a(logDBOperation, cjVar.m611a(), a2, i);
                }
            }
        }
    }

    protected String m302a(String str) {
        return ck.m633e(cg.m587c(str));
    }
}
