package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class TpnsRegisterReq extends JceStruct {
    static DeviceInfo cache_deviceInfo;
    static MutableInfo cache_mutableInfo;
    public long accessId;
    public String accessKey;
    public String account;
    public String appCert;
    public String appVersion;
    public String deviceId;
    public DeviceInfo deviceInfo;
    public short deviceType;
    public byte keyEncrypted;
    public MutableInfo mutableInfo;
    public String reserved;
    public String ticket;
    public short ticketType;
    public String token;
    public short updateAutoTag;
    public short version;

    public TpnsRegisterReq() {
        this.accessId = 0;
        this.accessKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.deviceId = LetterIndexBar.SEARCH_ICON_LETTER;
        this.appCert = LetterIndexBar.SEARCH_ICON_LETTER;
        this.account = LetterIndexBar.SEARCH_ICON_LETTER;
        this.ticket = LetterIndexBar.SEARCH_ICON_LETTER;
        this.ticketType = (short) 0;
        this.deviceType = (short) 0;
        this.deviceInfo = null;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.version = (short) 0;
        this.keyEncrypted = (byte) 0;
        this.mutableInfo = null;
        this.updateAutoTag = (short) 0;
        this.appVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.reserved = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsRegisterReq(long j, String str, String str2, String str3, String str4, String str5, short s, short s2, DeviceInfo deviceInfo, String str6, short s3, byte b, MutableInfo mutableInfo, short s4, String str7, String str8) {
        this.accessId = 0;
        this.accessKey = LetterIndexBar.SEARCH_ICON_LETTER;
        this.deviceId = LetterIndexBar.SEARCH_ICON_LETTER;
        this.appCert = LetterIndexBar.SEARCH_ICON_LETTER;
        this.account = LetterIndexBar.SEARCH_ICON_LETTER;
        this.ticket = LetterIndexBar.SEARCH_ICON_LETTER;
        this.ticketType = (short) 0;
        this.deviceType = (short) 0;
        this.deviceInfo = null;
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.version = (short) 0;
        this.keyEncrypted = (byte) 0;
        this.mutableInfo = null;
        this.updateAutoTag = (short) 0;
        this.appVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.reserved = LetterIndexBar.SEARCH_ICON_LETTER;
        this.accessId = j;
        this.accessKey = str;
        this.deviceId = str2;
        this.appCert = str3;
        this.account = str4;
        this.ticket = str5;
        this.ticketType = s;
        this.deviceType = s2;
        this.deviceInfo = deviceInfo;
        this.token = str6;
        this.version = s3;
        this.keyEncrypted = b;
        this.mutableInfo = mutableInfo;
        this.updateAutoTag = s4;
        this.appVersion = str7;
        this.reserved = str8;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.accessId, 0);
        jceOutputStream.write(this.accessKey, 1);
        jceOutputStream.write(this.deviceId, 2);
        jceOutputStream.write(this.appCert, 3);
        if (this.account != null) {
            jceOutputStream.write(this.account, 4);
        }
        if (this.ticket != null) {
            jceOutputStream.write(this.ticket, 5);
        }
        jceOutputStream.write(this.ticketType, 6);
        jceOutputStream.write(this.deviceType, 7);
        if (this.deviceInfo != null) {
            jceOutputStream.write(this.deviceInfo, 8);
        }
        if (this.token != null) {
            jceOutputStream.write(this.token, 9);
        }
        jceOutputStream.write(this.version, 10);
        jceOutputStream.write(this.keyEncrypted, 11);
        if (this.mutableInfo != null) {
            jceOutputStream.write(this.mutableInfo, 12);
        }
        jceOutputStream.write(this.updateAutoTag, 13);
        if (this.appVersion != null) {
            jceOutputStream.write(this.appVersion, 14);
        }
        if (this.reserved != null) {
            jceOutputStream.write(this.reserved, 15);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.accessId = jceInputStream.read(this.accessId, 0, true);
        this.accessKey = jceInputStream.readString(1, true);
        this.deviceId = jceInputStream.readString(2, true);
        this.appCert = jceInputStream.readString(3, true);
        this.account = jceInputStream.readString(4, false);
        this.ticket = jceInputStream.readString(5, false);
        this.ticketType = jceInputStream.read(this.ticketType, 6, false);
        this.deviceType = jceInputStream.read(this.deviceType, 7, false);
        if (cache_deviceInfo == null) {
            cache_deviceInfo = new DeviceInfo();
        }
        this.deviceInfo = (DeviceInfo) jceInputStream.read(cache_deviceInfo, 8, false);
        this.token = jceInputStream.readString(9, false);
        this.version = jceInputStream.read(this.version, 10, false);
        this.keyEncrypted = jceInputStream.read(this.keyEncrypted, 11, false);
        if (cache_mutableInfo == null) {
            cache_mutableInfo = new MutableInfo();
        }
        this.mutableInfo = (MutableInfo) jceInputStream.read(cache_mutableInfo, 12, false);
        this.updateAutoTag = jceInputStream.read(this.updateAutoTag, 13, false);
        this.appVersion = jceInputStream.readString(14, false);
        this.reserved = jceInputStream.readString(15, false);
    }
}
