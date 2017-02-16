package com.illuminate.texaspoker.service;

import android.app.Notification.Builder;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.illuminate.texaspoker.application.BaseApplication;

public class FakeForegroundService extends Service {
    public int onStartCommand(Intent intent, int i, int i2) {
        startForeground(999997, new Builder(BaseApplication.m3548a()).setWhen(System.currentTimeMillis()).getNotification());
        startService(new Intent(this, ForegroundService.class));
        return 1;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }
}
