package com.alipay.p011b.p012a.p013a.p014a;

import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.alipay.b.a.a.a.b */
public final class C0111b {
    public static String m242a(String str, String str2) {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                return null;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AsyncHttpResponseHandler.DEFAULT_CHARSET));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        stringBuilder.append(readLine);
                    } else {
                        try {
                            break;
                        } catch (Throwable th2) {
                        }
                    }
                } catch (IOException e) {
                    bufferedReader2 = bufferedReader;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            bufferedReader.close();
            return stringBuilder.toString();
        } catch (IOException e2) {
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Throwable th4) {
                }
            }
            return stringBuilder.toString();
        } catch (Throwable th5) {
            Throwable th6 = th5;
            bufferedReader = null;
            th = th6;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable th7) {
                }
            }
            throw th;
        }
    }
}