package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsConfigRsp extends JceStruct {
    public String confContent;
    public long confVersion;

    public TpnsConfigRsp() {
        this.confVersion = 0;
        this.confContent = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsConfigRsp(long j, String str) {
        this.confVersion = 0;
        this.confContent = LetterIndexBar.SEARCH_ICON_LETTER;
        this.confVersion = j;
        this.confContent = str;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.confVersion, 0);
        jceOutputStream.write(this.confContent, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.confVersion = jceInputStream.read(this.confVersion, 0, true);
        this.confContent = jceInputStream.readString(1, true);
    }
}
