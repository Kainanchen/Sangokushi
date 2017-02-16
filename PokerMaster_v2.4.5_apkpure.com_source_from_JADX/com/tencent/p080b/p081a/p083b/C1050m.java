package com.tencent.p080b.p081a.p083b;

import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.b.a.b.m */
final class C1050m {
    static int m5723a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C1051n()).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    static int m5724b() {
        int i = 0;
        try {
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            str = str.trim();
            if (str.length() > 0) {
                i = Integer.valueOf(str).intValue();
            }
        } catch (Throwable e) {
            C1049l.f8085k.m5665b(e);
        }
        return i * PointerIconCompat.TYPE_DEFAULT;
    }

    static int m5725c() {
        int i = 0;
        try {
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            InputStream inputStream = new ProcessBuilder(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"}).start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            str = str.trim();
            if (str.length() > 0) {
                i = Integer.valueOf(str).intValue();
            }
        } catch (Throwable th) {
            C1049l.f8085k.m5665b(th);
        }
        return i * PointerIconCompat.TYPE_DEFAULT;
    }

    static String m5726d() {
        int i = 2;
        String[] strArr = new String[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER};
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            String[] split = bufferedReader.readLine().split("\\s+");
            while (i < split.length) {
                strArr[0] = strArr[0] + split[i] + " ";
                i++;
            }
            bufferedReader.close();
        } catch (IOException e) {
        }
        return strArr[0];
    }
}
