package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsTokenTagReq extends JceStruct {
    public long accessId;
    public int flag;
    public String tag;

    public TpnsTokenTagReq() {
        this.accessId = 0;
        this.tag = LetterIndexBar.SEARCH_ICON_LETTER;
        this.flag = 0;
    }

    public TpnsTokenTagReq(long j, String str, int i) {
        this.accessId = 0;
        this.tag = LetterIndexBar.SEARCH_ICON_LETTER;
        this.flag = 0;
        this.accessId = j;
        this.tag = str;
        this.flag = i;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.accessId, 0);
        jceOutputStream.write(this.tag, 1);
        jceOutputStream.write(this.flag, 2);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.accessId = jceInputStream.read(this.accessId, 0, true);
        this.tag = jceInputStream.readString(1, true);
        this.flag = jceInputStream.read(this.flag, 2, true);
    }
}
