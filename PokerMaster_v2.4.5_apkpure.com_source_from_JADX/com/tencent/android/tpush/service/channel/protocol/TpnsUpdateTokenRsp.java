package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsUpdateTokenRsp extends JceStruct {
    public byte result;
    public String token;

    public TpnsUpdateTokenRsp() {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.result = (byte) 0;
    }

    public TpnsUpdateTokenRsp(String str, byte b) {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.result = (byte) 0;
        this.token = str;
        this.result = b;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.token, 0);
        jceOutputStream.write(this.result, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.token = jceInputStream.readString(0, true);
        this.result = jceInputStream.read(this.result, 1, true);
    }
}
