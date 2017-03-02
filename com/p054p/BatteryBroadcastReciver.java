package com.p054p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.igexin.download.Downloads;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.p.BatteryBroadcastReciver */
public class BatteryBroadcastReciver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
            int level = intent.getIntExtra("level", -1);
            switch (intent.getIntExtra(Downloads.COLUMN_STATUS, -1)) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    NativeTools.refreshPowerInfo(level, 4);
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    NativeTools.refreshPowerInfo(level, 0);
                case StatConstants.STAT_DB_VERSION /*3*/:
                    NativeTools.refreshPowerInfo(level, 3);
                case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                    NativeTools.refreshPowerInfo(level, 3);
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    NativeTools.refreshPowerInfo(level, 2);
                default:
                    NativeTools.refreshPowerInfo(level, -1);
            }
        }
    }
}
