package com.alipay.p011b.p012a.p013a.p021e;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alipay.b.a.a.e.d */
public final class C0131d {
    private static String f186a;
    private static String f187b;
    private static String f188c;

    static {
        f186a = Constants.STR_EMPTY;
        f187b = Constants.STR_EMPTY;
        f188c = Constants.STR_EMPTY;
    }

    public static synchronized void m349a(String str) {
        synchronized (C0131d.class) {
            List arrayList = new ArrayList();
            arrayList.add(str);
            C0131d.m352a(arrayList);
        }
    }

    public static synchronized void m350a(String str, String str2, String str3) {
        synchronized (C0131d.class) {
            f186a = str;
            f187b = str2;
            f188c = str3;
        }
    }

    public static synchronized void m351a(Throwable th) {
        synchronized (C0131d.class) {
            Object obj;
            List arrayList = new ArrayList();
            if (th != null) {
                Writer stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                obj = stringWriter.toString();
            } else {
                obj = Constants.STR_EMPTY;
            }
            arrayList.add(obj);
            C0131d.m352a(arrayList);
        }
    }

    private static synchronized void m352a(List<String> list) {
        synchronized (C0131d.class) {
            if (!(C0110a.m234a(f187b) || C0110a.m234a(f188c))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f188c);
                for (String str : list) {
                    stringBuffer.append(", " + str);
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f186a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f186a, f187b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = file2.length() + ((long) stringBuffer.length()) <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
