package com.facebook.p036h;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: PlatformServiceClient */
/* renamed from: com.facebook.h.aa */
public abstract class aa implements ServiceConnection {
    public final Context f1539a;
    public PlatformServiceClient f1540b;
    public boolean f1541c;
    int f1542d;
    public final int f1543e;
    private final Handler f1544f;
    private Messenger f1545g;
    private int f1546h;
    private final String f1547i;

    /* renamed from: com.facebook.h.aa.1 */
    class PlatformServiceClient extends Handler {
        final /* synthetic */ aa f1538a;

        PlatformServiceClient(aa aaVar) {
            this.f1538a = aaVar;
        }

        public final void handleMessage(Message message) {
            Object obj = this.f1538a;
            if (message.what == obj.f1542d) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    obj.m1474a(null);
                } else {
                    obj.m1474a(data);
                }
                try {
                    obj.f1539a.unbindService(obj);
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }

    /* renamed from: com.facebook.h.aa.a */
    public interface PlatformServiceClient {
        void m1473a(Bundle bundle);
    }

    public aa(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f1539a = context;
        this.f1546h = AccessibilityNodeInfoCompat.ACTION_CUT;
        this.f1542d = 65537;
        this.f1547i = str;
        this.f1543e = 20121101;
        this.f1544f = new PlatformServiceClient(this);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1545g = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f1547i);
        Message obtain = Message.obtain(null, this.f1546h);
        obtain.arg1 = this.f1543e;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f1544f);
        try {
            this.f1545g.send(obtain);
        } catch (RemoteException e) {
            m1474a(null);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f1545g = null;
        try {
            this.f1539a.unbindService(this);
        } catch (IllegalArgumentException e) {
        }
        m1474a(null);
    }

    final void m1474a(Bundle bundle) {
        if (this.f1541c) {
            this.f1541c = false;
            PlatformServiceClient platformServiceClient = this.f1540b;
            if (platformServiceClient != null) {
                platformServiceClient.m1473a(bundle);
            }
        }
    }
}
