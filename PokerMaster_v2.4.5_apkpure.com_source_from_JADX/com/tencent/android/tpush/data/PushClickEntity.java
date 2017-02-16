package com.tencent.android.tpush.data;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.Serializable;

/* compiled from: ProGuard */
public class PushClickEntity implements Serializable {
    private static final long serialVersionUID = -166678396447407161L;
    public long accessId;
    public int action;
    public long broadcastId;
    public long clickTime;
    public long msgId;
    public String pkgName;
    public long timestamp;
    public long type;

    public PushClickEntity() {
        this.msgId = 0;
        this.accessId = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.pkgName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = 1;
        this.clickTime = 0;
        this.action = 0;
    }

    public PushClickEntity(long j, long j2, long j3, long j4, String str, long j5, long j6, int i) {
        this.msgId = 0;
        this.accessId = 0;
        this.broadcastId = 0;
        this.timestamp = 0;
        this.pkgName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = 1;
        this.clickTime = 0;
        this.action = 0;
        this.msgId = j;
        this.accessId = j2;
        this.broadcastId = j3;
        this.timestamp = j4;
        this.pkgName = str;
        this.type = j5;
        this.clickTime = j6;
        this.action = i;
    }
}
