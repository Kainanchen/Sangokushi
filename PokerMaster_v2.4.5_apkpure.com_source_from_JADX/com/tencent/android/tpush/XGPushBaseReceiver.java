package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.ProGuard;
import com.tencent.android.tpush.encrypt.Rijndael;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: ProGuard */
public abstract class XGPushBaseReceiver extends BroadcastReceiver {
    public static final int SUCCESS = 0;

    public abstract void onDeleteTagResult(Context context, int i, String str);

    public abstract void onNotifactionClickedResult(Context context, XGPushClickedResult xGPushClickedResult);

    public abstract void onNotifactionShowedResult(Context context, XGPushShowedResult xGPushShowedResult);

    public abstract void onRegisterResult(Context context, int i, XGPushRegisterResult xGPushRegisterResult);

    public abstract void onSetTagResult(Context context, int i, String str);

    public abstract void onTextMessage(Context context, XGPushTextMessage xGPushTextMessage);

    public abstract void onUnregisterResult(Context context, int i);

    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                if (ProGuard.m4826a(context) <= 0) {
                    String action = intent.getAction();
                    if (Constants.ACTION_PUSH_MESSAGE.equals(action)) {
                        m4010a(context, intent);
                    } else if (Constants.ACTION_FEEDBACK.equals(action)) {
                        m4011b(context, intent);
                    } else {
                        com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.PushMessageLogTag, "\u672a\u77e5\u7684action:" + action);
                    }
                }
            } catch (Throwable th) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.PushMessageLogTag, "onReceive handle error.", th);
            }
        }
    }

    private void m4010a(Context context, Intent intent) {
        com.tencent.android.tpush.p068b.ProGuard a = com.tencent.android.tpush.p068b.ProGuard.m4765a(context, intent);
        if (a.m4772g().m4727c() == 2) {
            long longExtra = intent.getLongExtra(MessageKey.MSG_BUSI_MSG_ID, 0);
            long longExtra2 = intent.getLongExtra(MessageKey.MSG_CREATE_TIMESTAMPS, 0);
            long longExtra3 = intent.getLongExtra(MessageKey.MSG_ID, -1);
            com.tencent.android.tpush.p068b.ProGuard proGuard = new com.tencent.android.tpush.p068b.ProGuard(context, intent);
            XGPushManager.msgAck(context, a);
            if (proGuard.m4743a(a, longExtra2, longExtra, longExtra3)) {
                XGPushTextMessage xGPushTextMessage = new XGPushTextMessage();
                xGPushTextMessage.title = a.m4772g().m4729e();
                xGPushTextMessage.content = a.m4772g().m4730f();
                xGPushTextMessage.customContent = a.m4772g().m4731g();
                xGPushTextMessage.m4697a(intent);
                onTextMessage(context, xGPushTextMessage);
            }
        }
    }

    private void m4011b(Context context, Intent intent) {
        int intExtra = intent.getIntExtra(Constants.FEEDBACK_TAG, -1);
        int intExtra2 = intent.getIntExtra(Constants.FEEDBACK_ERROR_CODE, -1);
        switch (intExtra) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                XGPushRegisterResult xGPushRegisterResult = new XGPushRegisterResult();
                xGPushRegisterResult.parseIntent(intent);
                onRegisterResult(context, intExtra2, xGPushRegisterResult);
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                onUnregisterResult(context, intExtra2);
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                String decrypt = Rijndael.decrypt(intent.getStringExtra(Constants.FLAG_TAG_NAME));
                if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(decrypt)) {
                    int intExtra3 = intent.getIntExtra(Constants.FLAG_TAG_TYPE, -1);
                    if (intExtra3 == 1) {
                        onSetTagResult(context, intExtra2, decrypt);
                    } else if (intExtra3 == 2) {
                        onDeleteTagResult(context, intExtra2, decrypt);
                    } else {
                        com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.PushMessageLogTag, "\u9519\u8bef\u7684\u6807\u7b7e\u5904\u7406\u7c7b\u578b\uff1a" + intExtra3 + " ,\u6807\u7b7e\u540d\uff1a" + decrypt);
                    }
                }
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                intent.getIntExtra(MessageKey.MSG_ACTION, 2);
                long longExtra = intent.getLongExtra(MessageKey.MSG_ACCESS_ID, 0);
                List accessidList = XGPushConfig.getAccessidList(context);
                if (accessidList != null && accessidList.size() > 0 && accessidList.contains(Long.valueOf(longExtra))) {
                    XGPushClickedResult xGPushClickedResult = new XGPushClickedResult();
                    xGPushClickedResult.parseIntent(intent);
                    onNotifactionClickedResult(context, xGPushClickedResult);
                }
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                XGPushShowedResult xGPushShowedResult = new XGPushShowedResult();
                xGPushShowedResult.parseIntent(intent);
                onNotifactionShowedResult(context, xGPushShowedResult);
            default:
                com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.PushMessageLogTag, "\u672a\u77e5\u7684feedbackType:" + intExtra);
        }
    }
}
