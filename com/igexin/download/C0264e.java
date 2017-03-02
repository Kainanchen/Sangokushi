package com.igexin.download;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: com.igexin.download.e */
public class C0264e implements ServiceConnection {
    final /* synthetic */ DownloadService f712a;

    public C0264e(DownloadService downloadService) {
        this.f712a = downloadService;
    }

    public void m931a() {
        synchronized (this.f712a) {
            if (this.f712a.f692h != null) {
                this.f712a.f692h = null;
                try {
                    this.f712a.unbindService(this);
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f712a.f691g = false;
        synchronized (this.f712a) {
            try {
                Method method = Class.forName("android.media.IMediaScannerService").getField("Stub").getType().getMethod("asInterface", new Class[]{IBinder.class});
                this.f712a.f692h = method.invoke(null, new Object[]{iBinder});
                if (this.f712a.f692h != null) {
                    this.f712a.m898a();
                }
            } catch (Exception e) {
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f712a) {
            this.f712a.f692h = null;
        }
    }
}
