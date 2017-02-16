package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public final class DeviceInfo extends JceStruct {
    public String apiLevel;
    public String appList;
    public String cpuInfo;
    public String imei;
    public long isRooted;
    public String language;
    public String launcherName;
    public String manu;
    public String model;
    public String network;
    public String os;
    public String resolution;
    public String sdCard;
    public String sdDouble;
    public String sdkVersion;
    public String sdkVersionName;
    public String timezone;
    public String xgAppList;

    public DeviceInfo() {
        this.imei = LetterIndexBar.SEARCH_ICON_LETTER;
        this.model = LetterIndexBar.SEARCH_ICON_LETTER;
        this.os = LetterIndexBar.SEARCH_ICON_LETTER;
        this.network = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdCard = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdDouble = LetterIndexBar.SEARCH_ICON_LETTER;
        this.resolution = LetterIndexBar.SEARCH_ICON_LETTER;
        this.manu = LetterIndexBar.SEARCH_ICON_LETTER;
        this.apiLevel = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdkVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdkVersionName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.isRooted = 0;
        this.appList = LetterIndexBar.SEARCH_ICON_LETTER;
        this.cpuInfo = LetterIndexBar.SEARCH_ICON_LETTER;
        this.language = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timezone = LetterIndexBar.SEARCH_ICON_LETTER;
        this.launcherName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.xgAppList = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.imei = LetterIndexBar.SEARCH_ICON_LETTER;
        this.model = LetterIndexBar.SEARCH_ICON_LETTER;
        this.os = LetterIndexBar.SEARCH_ICON_LETTER;
        this.network = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdCard = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdDouble = LetterIndexBar.SEARCH_ICON_LETTER;
        this.resolution = LetterIndexBar.SEARCH_ICON_LETTER;
        this.manu = LetterIndexBar.SEARCH_ICON_LETTER;
        this.apiLevel = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdkVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.sdkVersionName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.isRooted = 0;
        this.appList = LetterIndexBar.SEARCH_ICON_LETTER;
        this.cpuInfo = LetterIndexBar.SEARCH_ICON_LETTER;
        this.language = LetterIndexBar.SEARCH_ICON_LETTER;
        this.timezone = LetterIndexBar.SEARCH_ICON_LETTER;
        this.launcherName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.xgAppList = LetterIndexBar.SEARCH_ICON_LETTER;
        this.imei = str;
        this.model = str2;
        this.os = str3;
        this.network = str4;
        this.sdCard = str5;
        this.sdDouble = str6;
        this.resolution = str7;
        this.manu = str8;
        this.apiLevel = str9;
        this.sdkVersion = str10;
        this.sdkVersionName = str11;
        this.isRooted = j;
        this.appList = str12;
        this.cpuInfo = str13;
        this.language = str14;
        this.timezone = str15;
        this.launcherName = str16;
        this.xgAppList = str17;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        if (this.imei != null) {
            jceOutputStream.write(this.imei, 0);
        }
        if (this.model != null) {
            jceOutputStream.write(this.model, 1);
        }
        if (this.os != null) {
            jceOutputStream.write(this.os, 2);
        }
        if (this.network != null) {
            jceOutputStream.write(this.network, 3);
        }
        if (this.sdCard != null) {
            jceOutputStream.write(this.sdCard, 4);
        }
        if (this.sdDouble != null) {
            jceOutputStream.write(this.sdDouble, 5);
        }
        if (this.resolution != null) {
            jceOutputStream.write(this.resolution, 6);
        }
        if (this.manu != null) {
            jceOutputStream.write(this.manu, 7);
        }
        if (this.apiLevel != null) {
            jceOutputStream.write(this.apiLevel, 8);
        }
        if (this.sdkVersion != null) {
            jceOutputStream.write(this.sdkVersion, 9);
        }
        if (this.sdkVersionName != null) {
            jceOutputStream.write(this.sdkVersionName, 10);
        }
        jceOutputStream.write(this.isRooted, 11);
        if (this.appList != null) {
            jceOutputStream.write(this.appList, 12);
        }
        if (this.cpuInfo != null) {
            jceOutputStream.write(this.cpuInfo, 13);
        }
        if (this.language != null) {
            jceOutputStream.write(this.language, 14);
        }
        if (this.timezone != null) {
            jceOutputStream.write(this.timezone, 15);
        }
        if (this.launcherName != null) {
            jceOutputStream.write(this.launcherName, 16);
        }
        if (this.xgAppList != null) {
            jceOutputStream.write(this.xgAppList, 17);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.imei = jceInputStream.readString(0, false);
        this.model = jceInputStream.readString(1, false);
        this.os = jceInputStream.readString(2, false);
        this.network = jceInputStream.readString(3, false);
        this.sdCard = jceInputStream.readString(4, false);
        this.sdDouble = jceInputStream.readString(5, false);
        this.resolution = jceInputStream.readString(6, false);
        this.manu = jceInputStream.readString(7, false);
        this.apiLevel = jceInputStream.readString(8, false);
        this.sdkVersion = jceInputStream.readString(9, false);
        this.sdkVersionName = jceInputStream.readString(10, false);
        this.isRooted = jceInputStream.read(this.isRooted, 11, false);
        this.appList = jceInputStream.readString(12, false);
        this.cpuInfo = jceInputStream.readString(13, false);
        this.language = jceInputStream.readString(14, false);
        this.timezone = jceInputStream.readString(15, false);
        this.launcherName = jceInputStream.readString(16, false);
        this.xgAppList = jceInputStream.readString(17, false);
    }
}
