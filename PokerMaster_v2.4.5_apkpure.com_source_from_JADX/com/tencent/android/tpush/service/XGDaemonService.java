package com.tencent.android.tpush.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* compiled from: ProGuard */
public class XGDaemonService extends Service {
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
