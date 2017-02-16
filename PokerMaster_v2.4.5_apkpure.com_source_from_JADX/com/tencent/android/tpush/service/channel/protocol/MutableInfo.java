package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class MutableInfo extends JceStruct {
    public String bssid;
    public String mac;
    public String ssid;
    public String wflist;

    public MutableInfo() {
        this.ssid = LetterIndexBar.SEARCH_ICON_LETTER;
        this.bssid = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mac = LetterIndexBar.SEARCH_ICON_LETTER;
        this.wflist = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public MutableInfo(String str, String str2, String str3, String str4) {
        this.ssid = LetterIndexBar.SEARCH_ICON_LETTER;
        this.bssid = LetterIndexBar.SEARCH_ICON_LETTER;
        this.mac = LetterIndexBar.SEARCH_ICON_LETTER;
        this.wflist = LetterIndexBar.SEARCH_ICON_LETTER;
        this.ssid = str;
        this.bssid = str2;
        this.mac = str3;
        this.wflist = str4;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        if (this.ssid != null) {
            jceOutputStream.write(this.ssid, 0);
        }
        if (this.bssid != null) {
            jceOutputStream.write(this.bssid, 1);
        }
        if (this.mac != null) {
            jceOutputStream.write(this.mac, 2);
        }
        if (this.wflist != null) {
            jceOutputStream.write(this.wflist, 3);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.ssid = jceInputStream.readString(0, false);
        this.bssid = jceInputStream.readString(1, false);
        this.mac = jceInputStream.readString(2, false);
        this.wflist = jceInputStream.readString(3, false);
    }
}
