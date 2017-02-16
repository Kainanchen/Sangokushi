package com.tencent.android.tpush.service.p073c;

import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.stat.StatReportStrategy;
import java.util.ArrayList;
import java.util.Properties;

/* renamed from: com.tencent.android.tpush.service.c.a */
public class ProGuard {
    private static Context f7581a;

    static {
        f7581a = null;
    }

    public static void m5102a(Context context) {
        com.tencent.android.tpush.stat.ProGuard.m5568b(true);
        com.tencent.android.tpush.stat.ProGuard.m5564a(StatReportStrategy.BATCH);
        com.tencent.android.tpush.stat.ProGuard.m5608b(context);
        com.tencent.android.tpush.stat.ProGuard.m5619e(context);
        f7581a = context.getApplicationContext();
    }

    public static void m5101a() {
        com.tencent.android.tpush.stat.ProGuard.m5599a(f7581a, -1);
    }

    public static void m5104a(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            try {
                com.tencent.android.tpush.stat.ProGuard.m5602a(f7581a, arrayList);
            } catch (Throwable th) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("XgStat", "reportSrvAck", th);
            }
        }
    }

    public static void m5103a(Intent intent) {
        if (intent != null) {
            try {
                long longExtra = intent.getLongExtra(MessageKey.MSG_TYPE, 0);
                long longExtra2 = intent.getLongExtra(MessageKey.MSG_BUSI_MSG_ID, 0);
                long longExtra3 = intent.getLongExtra(MessageKey.MSG_CREATE_TIMESTAMPS, 0);
                long longExtra4 = intent.getLongExtra(MessageKey.MSG_ID, 0);
                long longExtra5 = intent.getLongExtra(MessageKey.MSG_ACCESS_ID, 0);
                Properties properties = new Properties();
                properties.setProperty(MessageKey.MSG_TYPE, String.valueOf(longExtra));
                properties.setProperty(MessageKey.MSG_BUSI_MSG_ID, String.valueOf(longExtra2));
                properties.setProperty(MessageKey.MSG_ID, String.valueOf(longExtra4));
                com.tencent.android.tpush.stat.ProGuard.m5601a(f7581a, "SdkAck", properties, longExtra5, longExtra3);
            } catch (Throwable th) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("XgStat", "reportSDKAck", th);
            }
        }
    }

    public static void m5105b(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h("XgStat", "ServiceStat reportAck 15 with null list ");
            return;
        }
        try {
            com.tencent.android.tpush.stat.ProGuard.m5609b(f7581a, arrayList);
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("XgStat", "reportAck", th);
        }
    }

    public static void m5106c(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            try {
                com.tencent.android.tpush.stat.ProGuard.m5612c(f7581a, arrayList);
            } catch (Throwable th) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("XgStat", "reportNotifactionClickedOrClear", th);
            }
        }
    }
}
