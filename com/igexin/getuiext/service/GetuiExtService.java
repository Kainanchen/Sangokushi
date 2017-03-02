package com.igexin.getuiext.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.igexin.download.IDownloadCallback;
import com.igexin.download.SdkDownLoader;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.p033b.C0287c;
import com.igexin.getuiext.util.C0334h;
import com.igexin.sdk.PushConsts;
import java.util.Random;

public class GetuiExtService extends Service {
    private GetuiExtReceiver f795a;
    private C0304j f796b;
    private Context f797c;
    private volatile Looper f798d;
    private volatile C0302h f799e;
    private volatile Looper f800f;
    private volatile C0303i f801g;

    private void m1010a() {
        HandlerThread handlerThread = new HandlerThread("GetuiExt-GetuiExtService");
        handlerThread.start();
        this.f798d = handlerThread.getLooper();
        this.f799e = new C0302h(this, this.f798d);
        handlerThread = new HandlerThread("BI");
        handlerThread.start();
        this.f800f = handlerThread.getLooper();
        this.f801g = new C0303i(this, this.f800f);
    }

    private void m1011b() {
        SdkDownLoader instantiate = SdkDownLoader.getInstantiate(this);
        IDownloadCallback iDownloadCallback = (C0298d) instantiate.getCallback(Consts.DOWNLOAD_HANDLER_OWNER);
        if (iDownloadCallback == null) {
            iDownloadCallback = new C0298d(this, Consts.DOWNLOAD_HANDLER_OWNER);
        }
        instantiate.registerDownloadCallback(iDownloadCallback);
    }

    private void m1012c() {
        this.f796b = new C0304j(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f796b, intentFilter);
    }

    private void m1013d() {
        this.f795a = new GetuiExtReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.igexin.increment");
        intentFilter.addAction("com.igexin.download.action.notify.click");
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_USER_PRESENT);
        registerReceiver(this.f795a, intentFilter);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f797c = this;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        Consts.verifyCode = random.nextInt();
        C0287c.m994d().m996a(this.f797c);
        String a = C0334h.m1114a(this.f797c);
        if (a != null) {
            Consts.APPID = a;
        }
        m1010a();
        try {
            m1013d();
            m1012c();
            m1011b();
        } catch (Exception e) {
            stopSelf();
        }
    }

    public void onDestroy() {
        if (this.f795a != null) {
            unregisterReceiver(this.f795a);
        }
        if (this.f796b != null) {
            unregisterReceiver(this.f796b);
        }
        if (this.f798d != null) {
            this.f798d.quit();
        }
        if (this.f800f != null) {
            this.f800f.quit();
        }
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        if (intent == null) {
            return;
        }
        if (intent.getIntExtra("what", -1) == Consts.SEND_BI) {
            Message obtainMessage = this.f801g.obtainMessage(Consts.SEND_BI);
            obtainMessage.arg1 = i;
            obtainMessage.obj = intent;
            this.f801g.sendMessage(obtainMessage);
            return;
        }
        obtainMessage = this.f799e.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.f799e.sendMessage(obtainMessage);
    }
}
