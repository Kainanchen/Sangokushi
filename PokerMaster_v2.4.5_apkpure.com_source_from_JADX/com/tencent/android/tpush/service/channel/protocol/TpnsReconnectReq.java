package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;

/* compiled from: ProGuard */
public final class TpnsReconnectReq extends JceStruct {
    static ArrayList cache_msgClickList;
    static MutableInfo cache_mutableInfo;
    static ArrayList cache_recvMsgList;
    static ArrayList cache_unregInfoList;
    public String deviceId;
    public short deviceType;
    public ArrayList msgClickList;
    public MutableInfo mutableInfo;
    public short networkType;
    public ArrayList recvMsgList;
    public String reserved;
    public String sdkVersion;
    public String token;
    public ArrayList unregInfoList;

    public TpnsReconnectReq() {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.deviceId = LetterIndexBar.SEARCH_ICON_LETTER;
        this.networkType = (short) 0;
        this.unregInfoList = null;
        this.recvMsgList = null;
        this.mutableInfo = null;
        this.deviceType = (short) 0;
        this.msgClickList = null;
        this.sdkVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.reserved = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public TpnsReconnectReq(String str, String str2, short s, ArrayList arrayList, ArrayList arrayList2, MutableInfo mutableInfo, short s2, ArrayList arrayList3, String str3, String str4) {
        this.token = LetterIndexBar.SEARCH_ICON_LETTER;
        this.deviceId = LetterIndexBar.SEARCH_ICON_LETTER;
        this.networkType = (short) 0;
        this.unregInfoList = null;
        this.recvMsgList = null;
        this.mutableInfo = null;
        this.deviceType = (short) 0;
        this.msgClickList = null;
        this.sdkVersion = LetterIndexBar.SEARCH_ICON_LETTER;
        this.reserved = LetterIndexBar.SEARCH_ICON_LETTER;
        this.token = str;
        this.deviceId = str2;
        this.networkType = s;
        this.unregInfoList = arrayList;
        this.recvMsgList = arrayList2;
        this.mutableInfo = mutableInfo;
        this.deviceType = s2;
        this.msgClickList = arrayList3;
        this.sdkVersion = str3;
        this.reserved = str4;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.token, 0);
        jceOutputStream.write(this.deviceId, 1);
        jceOutputStream.write(this.networkType, 2);
        if (this.unregInfoList != null) {
            jceOutputStream.write(this.unregInfoList, 3);
        }
        if (this.recvMsgList != null) {
            jceOutputStream.write(this.recvMsgList, 4);
        }
        if (this.mutableInfo != null) {
            jceOutputStream.write(this.mutableInfo, 5);
        }
        jceOutputStream.write(this.deviceType, 6);
        if (this.msgClickList != null) {
            jceOutputStream.write(this.msgClickList, 7);
        }
        if (this.sdkVersion != null) {
            jceOutputStream.write(this.sdkVersion, 8);
        }
        if (this.reserved != null) {
            jceOutputStream.write(this.reserved, 9);
        }
    }

    public final void readFrom(JceInputStream jceInputStream) {
        this.token = jceInputStream.readString(0, true);
        this.deviceId = jceInputStream.readString(1, true);
        this.networkType = jceInputStream.read(this.networkType, 2, true);
        if (cache_unregInfoList == null) {
            cache_unregInfoList = new ArrayList();
            cache_unregInfoList.add(new UnregInfo());
        }
        this.unregInfoList = (ArrayList) jceInputStream.read(cache_unregInfoList, 3, false);
        if (cache_recvMsgList == null) {
            cache_recvMsgList = new ArrayList();
            cache_recvMsgList.add(new TpnsPushClientReport());
        }
        this.recvMsgList = (ArrayList) jceInputStream.read(cache_recvMsgList, 4, false);
        if (cache_mutableInfo == null) {
            cache_mutableInfo = new MutableInfo();
        }
        this.mutableInfo = (MutableInfo) jceInputStream.read(cache_mutableInfo, 5, false);
        this.deviceType = jceInputStream.read(this.deviceType, 6, false);
        if (cache_msgClickList == null) {
            cache_msgClickList = new ArrayList();
            cache_msgClickList.add(new TpnsClickClientReport());
        }
        this.msgClickList = (ArrayList) jceInputStream.read(cache_msgClickList, 7, false);
        this.sdkVersion = jceInputStream.readString(8, false);
        this.reserved = jceInputStream.readString(9, false);
    }
}
