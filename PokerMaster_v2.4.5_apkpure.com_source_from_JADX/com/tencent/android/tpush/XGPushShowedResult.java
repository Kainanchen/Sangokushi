package com.tencent.android.tpush;

import android.content.Intent;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.encrypt.Rijndael;

/* compiled from: ProGuard */
public class XGPushShowedResult implements XGIResult {
    public static final int NOTIFICATION_ACTION_ACTIVITY = 1;
    public static final int NOTIFICATION_ACTION_INTENT = 3;
    public static final int NOTIFICATION_ACTION_PACKAGE = 4;
    public static final int NOTIFICATION_ACTION_URL = 2;
    long f7272a;
    String f7273b;
    String f7274c;
    String f7275d;
    String f7276e;
    int f7277f;
    int f7278g;

    public XGPushShowedResult() {
        this.f7272a = 0;
        this.f7273b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7274c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7275d = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7276e = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7277f = 0;
        this.f7278g = NOTIFICATION_ACTION_ACTIVITY;
    }

    public int getNotifactionId() {
        return this.f7277f;
    }

    public long getMsgId() {
        return this.f7272a;
    }

    public String getTitle() {
        return this.f7273b;
    }

    public String getContent() {
        return this.f7274c;
    }

    public String getCustomContent() {
        return this.f7275d;
    }

    public String getActivity() {
        return this.f7276e;
    }

    public int getNotificationActionType() {
        return this.f7278g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XGPushShowedResult [msgId=").append(this.f7272a).append(", title=").append(this.f7273b).append(", content=").append(this.f7274c).append(", customContent=").append(this.f7275d).append(", activity=").append(this.f7276e).append(", notificationActionType").append(this.f7278g).append("]");
        return stringBuilder.toString();
    }

    public void parseIntent(Intent intent) {
        this.f7272a = intent.getLongExtra(MessageKey.MSG_ID, -1);
        this.f7276e = intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME);
        this.f7273b = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_TITLE));
        this.f7274c = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_CONTENT));
        this.f7278g = intent.getIntExtra(Constants.FLAG_NOTIFICATION_ACTION_TYPE, NOTIFICATION_ACTION_ACTIVITY);
        this.f7275d = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_CUSTOM_CONTENT));
        this.f7277f = intent.getIntExtra(MessageKey.NOTIFACTION_ID, 0);
    }
}
