package com.tencent.wxop.stat.common;

import com.loopj.android.http.AsyncHttpClient;
import com.tencent.connect.common.Constants;
import com.ut.device.AidConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.wxop.stat.common.l */
class C0640l {
    static int m2434a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C0641m()).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    static int m2435b() {
        int i = 0;
        try {
            String str = Constants.STR_EMPTY;
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
            C0639k.f2054k.m2360e(e);
        }
        return i * AidConstants.EVENT_REQUEST_STARTED;
    }

    static int m2436c() {
        int i = 0;
        try {
            String str = Constants.STR_EMPTY;
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
            C0639k.f2054k.m2360e(th);
        }
        return i * AidConstants.EVENT_REQUEST_STARTED;
    }

    static String m2437d() {
        int i = 2;
        String[] strArr = new String[]{Constants.STR_EMPTY, Constants.STR_EMPTY};
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), AsyncHttpClient.DEFAULT_SOCKET_BUFFER_SIZE);
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
