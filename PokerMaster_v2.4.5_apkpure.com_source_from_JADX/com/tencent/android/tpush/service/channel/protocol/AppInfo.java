package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class AppInfo extends JceStruct {
    public long accessId;
    public String accessKey;
    public String appCert;
    public byte keyEncrypted;

    public AppInfo() {
        this.accessId = 0;
        this.accessKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.appCert = LetterIndexBar.SEARCH_ICON_LETTER;
        this.keyEncrypted = (byte) 0;
    }

    public AppInfo(long j, String str, String str2, byte b) {
        this.accessId = 0;
        this.accessKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.appCert = LetterIndexBar.SEARCH_ICON_LETTER;
        this.keyEncrypted = (byte) 0;
        this.accessId = j;
        this.accessKey = str;
        this.appCert = str2;
        this.keyEncrypted = b;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.accessId, 0);
        jceOutputStream.write(this.accessKey, 1);
        jceOutputStream.write(this.appCert, 2);
        jceOutputStream.write(this.keyEncrypted, 3);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.accessId = jceInputStream.read(this.accessId, 0, true);
        this.accessKey = jceInputStream.readString(1, true);
        this.appCert = jceInputStream.readString(2, true);
        this.keyEncrypted = jceInputStream.read(this.keyEncrypted, 3, false);
    }
}
