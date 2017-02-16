package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class AppServerAuthInfo extends JceStruct {
    public long accessId;
    public String secretKey;

    public AppServerAuthInfo() {
        this.accessId = 0;
        this.secretKey = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public AppServerAuthInfo(long j, String str) {
        this.accessId = 0;
        this.secretKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.accessId = j;
        this.secretKey = str;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.accessId, 0);
        jceOutputStream.write(this.secretKey, 1);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.accessId = jceInputStream.read(this.accessId, 0, true);
        this.secretKey = jceInputStream.readString(1, true);
    }
}
