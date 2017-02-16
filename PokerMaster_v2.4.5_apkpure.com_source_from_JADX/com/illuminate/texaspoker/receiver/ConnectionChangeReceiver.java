package com.illuminate.texaspoker.receiver;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p060e.p062b.PushManager;
import com.illuminate.texaspoker.service.FakeForegroundService;
import com.illuminate.texaspoker.utils.Utility;
import com.tencent.android.tpush.common.Constants;

public class ConnectionChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        int i = 0;
        int i2 = 0;
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) BaseApplication.m3548a().getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningServices(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            int i3;
            if ("com.illuminate.texaspoker.service.ForegroundService".equals(runningServiceInfo.service.getClassName())) {
                i3 = 1;
            } else {
                i3 = i2;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            context.startService(new Intent(context, FakeForegroundService.class));
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                if (connectivityManager.getActiveNetworkInfo() == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected() || !PushManager.m3930a().m3934d()) {
                    Utility.m4478a("NOTIFY_NO_CONNECT", new Object[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Utility.m4478a("NOTIFY_NO_CONNECT", new Object[0]);
            }
        }
        if (connectivityManager != null) {
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                while (i < allNetworkInfo.length && allNetworkInfo[i].getState() != State.CONNECTED) {
                    i++;
                }
            }
        }
    }
}
