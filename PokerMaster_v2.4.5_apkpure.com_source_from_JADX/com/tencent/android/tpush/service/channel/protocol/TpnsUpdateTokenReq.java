package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsUpdateTokenReq extends JceStruct {
    public long accessId;
    public String externalToken;
    public String token;
    public String type;

    public TpnsUpdateTokenReq() {
        this.accessId = 0;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = LetterIndexBar.SEARCH_ICON_LETTER;
        this.externalToken = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsUpdateTokenReq(long j, String str, String str2, String str3) {
        this.accessId = 0;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.type = LetterIndexBar.SEARCH_ICON_LETTER;
        this.externalToken = LetterIndexBar.SEARCH_ICON_LETTER;
        this.accessId = j;
        this.token = str;
        this.type = str2;
        this.externalToken = str3;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.accessId, 0);
        jceOutputStream.write(this.token, 1);
        jceOutputStream.write(this.type, 2);
        jceOutputStream.write(this.externalToken, 3);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.accessId = jceInputStream.read(this.accessId, 0, true);
        this.token = jceInputStream.readString(1, true);
        this.type = jceInputStream.readString(2, true);
        this.externalToken = jceInputStream.readString(3, true);
    }
}
