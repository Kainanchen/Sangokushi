package com.tencent.android.tpush.service.channel.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProGuard */
public final class ApList extends JceStruct {
    static ArrayList cache_portList;
    static Map cache_primary;
    static Map cache_secondary;
    static ArrayList cache_speedTestIpList;
    public long backup;
    public String domain;
    public ArrayList portList;
    public Map primary;
    public Map secondary;
    public ArrayList speedTestIpList;

    public ApList() {
        this.primary = null;
        this.secondary = null;
        this.backup = 0;
        this.domain = LetterIndexBar.SEARCH_ICON_LETTER;
        this.portList = null;
        this.speedTestIpList = null;
    }

    public ApList(Map map, Map map2, long j, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.primary = null;
        this.secondary = null;
        this.backup = 0;
        this.domain = LetterIndexBar.SEARCH_ICON_LETTER;
        this.portList = null;
        this.speedTestIpList = null;
        this.primary = map;
        this.secondary = map2;
        this.backup = j;
        this.domain = str;
        this.portList = arrayList;
        this.speedTestIpList = arrayList2;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.primary, 0);
        jceOutputStream.write(this.secondary, 1);
        jceOutputStream.write(this.backup, 2);
        jceOutputStream.write(this.domain, 3);
        jceOutputStream.write(this.portList, 4);
        jceOutputStream.write(this.speedTestIpList, 5);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        if (cache_primary == null) {
            cache_primary = new HashMap();
            cache_primary.put(Byte.valueOf((byte) 0), Long.valueOf(0));
        }
        this.primary = (Map) jceInputStream.read(cache_primary, 0, true);
        if (cache_secondary == null) {
            cache_secondary = new HashMap();
            cache_secondary.put(Byte.valueOf((byte) 0), Long.valueOf(0));
        }
        this.secondary = (Map) jceInputStream.read(cache_secondary, 1, true);
        this.backup = jceInputStream.read(this.backup, 2, true);
        this.domain = jceInputStream.readString(3, true);
        if (cache_portList == null) {
            cache_portList = new ArrayList();
            cache_portList.add(Integer.valueOf(0));
        }
        this.portList = (ArrayList) jceInputStream.read(cache_portList, 4, true);
        if (cache_speedTestIpList == null) {
            cache_speedTestIpList = new ArrayList();
            cache_speedTestIpList.add(Long.valueOf(0));
        }
        this.speedTestIpList = (ArrayList) jceInputStream.read(cache_speedTestIpList, 5, true);
    }
}
