package com.tencent.android.tpush.service;

import com.tencent.android.tpush.p067a.ProGuard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: ProGuard */
class ad extends Thread {
    InputStream f7544a;
    String f7545b;
    final /* synthetic */ XGWatchdog f7546c;

    ad(XGWatchdog xGWatchdog, InputStream inputStream, String str) {
        this.f7546c = xGWatchdog;
        this.f7544a = inputStream;
        this.f7545b = str;
    }

    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7544a));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                if (this.f7545b.equals("Error")) {
                    ProGuard.m4723h(XGWatchdog.TAG, "Runtime exe return err: " + readLine);
                } else {
                    ProGuard.m4723h(XGWatchdog.TAG, "Runtime exe return " + readLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
