package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsCheckMsgReq extends JceStruct {
    public String token;

    public TpnsCheckMsgReq() {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsCheckMsgReq(String str) {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.token = str;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.token, 0);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.token = jceInputStream.readString(0, true);
    }
}
