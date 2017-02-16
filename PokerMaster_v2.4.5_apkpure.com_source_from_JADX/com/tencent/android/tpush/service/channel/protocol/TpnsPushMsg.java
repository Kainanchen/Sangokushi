package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsPushMsg extends JceStruct {
    public long accessId;
    public String appPkgName;
    public long busiMsgId;
    public String content;
    public String date;
    public long msgId;
    public long multiPkg;
    public long serverTime;
    public long timestamp;
    public String title;
    public int ttl;
    public long type;

    public TpnsPushMsg() {
        this.msgId = 0;
        this.accessId = 0;
        this.busiMsgId = 0;
        this.title = LetterIndexBar.SEARCH_ICON_LETTER;
        this.content = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = 0;
        this.appPkgName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timestamp = 0;
        this.multiPkg = 0;
        this.date = LetterIndexBar.SEARCH_ICON_LETTER;
        this.serverTime = 0;
        this.ttl = 0;
    }

    public TpnsPushMsg(long j, long j2, long j3, String str, String str2, long j4, String str3, long j5, long j6, String str4, long j7, int i) {
        this.msgId = 0;
        this.accessId = 0;
        this.busiMsgId = 0;
        this.title = LetterIndexBar.SEARCH_ICON_LETTER;
        this.content = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = 0;
        this.appPkgName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timestamp = 0;
        this.multiPkg = 0;
        this.date = LetterIndexBar.SEARCH_ICON_LETTER;
        this.serverTime = 0;
        this.ttl = 0;
        this.msgId = j;
        this.accessId = j2;
        this.busiMsgId = j3;
        this.title = str;
        this.content = str2;
        this.type = j4;
        this.appPkgName = str3;
        this.timestamp = j5;
        this.multiPkg = j6;
        this.date = str4;
        this.serverTime = j7;
        this.ttl = i;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.msgId, 0);
        jceOutputStream.write(this.accessId, 1);
        jceOutputStream.write(this.busiMsgId, 2);
        jceOutputStream.write(this.title, 3);
        jceOutputStream.write(this.content, 4);
        jceOutputStream.write(this.type, 5);
        if (this.appPkgName != null) {
            jceOutputStream.write(this.appPkgName, 6);
        }
        jceOutputStream.write(this.timestamp, 7);
        jceOutputStream.write(this.multiPkg, 8);
        if (this.date != null) {
            jceOutputStream.write(this.date, 9);
        }
        jceOutputStream.write(this.serverTime, 10);
        jceOutputStream.write(this.ttl, 11);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.msgId = jceInputStream.read(this.msgId, 0, true);
        this.accessId = jceInputStream.read(this.accessId, 1, true);
        this.busiMsgId = jceInputStream.read(this.busiMsgId, 2, true);
        this.title = jceInputStream.readString(3, true);
        this.content = jceInputStream.readString(4, true);
        this.type = jceInputStream.read(this.type, 5, true);
        this.appPkgName = jceInputStream.readString(6, false);
        this.timestamp = jceInputStream.read(this.timestamp, 7, false);
        this.multiPkg = jceInputStream.read(this.multiPkg, 8, false);
        this.date = jceInputStream.readString(9, false);
        this.serverTime = jceInputStream.read(this.serverTime, 10, false);
        this.ttl = jceInputStream.read(this.ttl, 11, false);
    }
}
