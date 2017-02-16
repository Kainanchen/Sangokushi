package com.tencent.android.tpush.rpc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.service.ProGuard;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* compiled from: ProGuard */
public class XGRemoteService extends Service {
    private ProGuard f7498a;

    public XGRemoteService() {
        this.f7498a = new ProGuard();
    }

    public void onCreate() {
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ProGuard.m5371a(getApplication(), "pullup", 1000);
        return super.onStartCommand(intent, i, i2);
    }

    public IBinder onBind(Intent intent) {
        ProGuard.m5375c(getApplicationContext());
        return this.f7498a;
    }
}
