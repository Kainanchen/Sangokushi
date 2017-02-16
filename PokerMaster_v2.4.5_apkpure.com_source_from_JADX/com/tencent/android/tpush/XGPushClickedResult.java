package com.tencent.android.tpush;

import android.content.Intent;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.encrypt.Rijndael;
import java.io.Serializable;

/* compiled from: ProGuard */
public class XGPushClickedResult implements XGIResult, Serializable {
    public static final int NOTIFACTION_CLICKED_TYPE = 0;
    public static final int NOTIFACTION_DELETED_TYPE = 2;
    public static final int NOTIFACTION_DOWNLOAD_CANCEL_TYPE = 6;
    public static final int NOTIFACTION_DOWNLOAD_TYPE = 5;
    public static final int NOTIFACTION_OPEN_CANCEL_TYPE = 4;
    public static final int NOTIFACTION_OPEN_TYPE = 3;
    public static final int NOTIFICATION_ACTION_ACTIVITY = 1;
    private static final long serialVersionUID = 5485267763104201539L;
    int actionType;
    String activityName;
    String content;
    String customContent;
    long msgId;
    int notificationActionType;
    String title;

    public XGPushClickedResult() {
        this.msgId = 0;
        this.title = LetterIndexBar.SEARCH_ICON_LETTER;
        this.content = LetterIndexBar.SEARCH_ICON_LETTER;
        this.customContent = LetterIndexBar.SEARCH_ICON_LETTER;
        this.activityName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.actionType = NOTIFACTION_CLICKED_TYPE;
        this.notificationActionType = NOTIFICATION_ACTION_ACTIVITY;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getCustomContent() {
        return this.customContent;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public long getActionType() {
        return (long) this.actionType;
    }

    public int getNotificationActionType() {
        return this.notificationActionType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XGPushClickedResult [msgId=").append(this.msgId).append(", title=").append(this.title).append(", customContent=").append(this.customContent).append(", activityName=").append(this.activityName).append(", actionType=").append(this.actionType).append(", notificationActionType").append(this.notificationActionType).append("]");
        return stringBuilder.toString();
    }

    public void parseIntent(Intent intent) {
        this.msgId = intent.getLongExtra(MessageKey.MSG_ID, -1);
        this.activityName = intent.getStringExtra(Constants.FLAG_ACTIVITY_NAME);
        this.title = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_TITLE));
        this.content = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_CONTENT));
        this.customContent = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_CUSTOM_CONTENT));
        this.actionType = intent.getIntExtra(MessageKey.MSG_ACTION, NOTIFACTION_CLICKED_TYPE);
        this.notificationActionType = intent.getIntExtra(Constants.FLAG_NOTIFICATION_ACTION_TYPE, NOTIFICATION_ACTION_ACTIVITY);
    }
}
