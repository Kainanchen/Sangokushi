package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsRegisterRsp extends JceStruct {
    public long confVersion;
    public String token;

    public TpnsRegisterRsp() {
        this.confVersion = 0;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsRegisterRsp(long j, String str) {
        this.confVersion = 0;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.confVersion = j;
        this.token = str;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.confVersion, 0);
        jceOutputStream.write(this.token, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.confVersion = jceInputStream.read(this.confVersion, 0, true);
        this.token = jceInputStream.readString(1, true);
    }
}
