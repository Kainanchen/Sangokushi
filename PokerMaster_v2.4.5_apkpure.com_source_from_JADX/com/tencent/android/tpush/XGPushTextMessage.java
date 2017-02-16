package com.tencent.android.tpush;

import android.content.Intent;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import java.io.Serializable;

/* compiled from: ProGuard */
public class XGPushTextMessage implements Serializable {
    private static final long serialVersionUID = -1854661081378847806L;
    String content;
    String customContent;
    private Intent simpleIntent;
    String title;

    public XGPushTextMessage() {
        this.title = LetterIndexBar.SEARCH_ICON_LETTER;
        this.content = LetterIndexBar.SEARCH_ICON_LETTER;
        this.customContent = LetterIndexBar.SEARCH_ICON_LETTER;
        this.simpleIntent = null;
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

    void m4697a(Intent intent) {
        this.simpleIntent = intent;
        if (intent != null) {
            this.simpleIntent.removeExtra(MessageKey.MSG_CONTENT);
        }
    }

    Intent m4696a() {
        return this.simpleIntent;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("XGPushShowedResult [title=").append(this.title).append(", content=").append(this.content).append(", customContent=").append(this.customContent).append("]");
        return stringBuilder.toString();
    }
}
