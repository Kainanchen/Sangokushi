package com.tencent.android.tpush.horse;

import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.horse.data.ServerItem;
import com.tencent.android.tpush.service.ProGuard;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.exception.NullReturnException;
import com.tencent.android.tpush.service.channel.protocol.ApList;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProGuard */
public class DefaultServer {
    public static String f7431a;
    public static ArrayList f7432b;
    public static String[] f7433c;
    public static String[] f7434d;
    public static String[] f7435e;
    public static final ENV f7436f;
    public static final ArrayList f7437g;

    /* compiled from: ProGuard */
    public enum ENV {
        RELEASE
    }

    static {
        f7431a = "tpns.qq.com";
        f7432b = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(443), Integer.valueOf(8080), Integer.valueOf(80), Integer.valueOf(14000)}));
        f7433c = new String[]{"183.232.98.178"};
        f7434d = new String[]{"58.251.139.182"};
        f7435e = new String[]{"183.61.46.193"};
        f7436f = ENV.RELEASE;
        Collections.shuffle(f7432b);
        f7431a = "tpns.qq.com";
        f7433c = new String[]{"183.232.98.178", "111.30.131.23"};
        f7434d = new String[]{"58.251.139.182", "125.39.240.55"};
        f7435e = new String[]{"183.61.46.193", "123.151.152.50"};
        ArrayList arrayList = new ArrayList();
        f7437g = arrayList;
        arrayList.add(new ServerItem("183.61.46.193", 443, 0));
    }

    public static ArrayList m4852a(String str) {
        if (str == null) {
            throw new NullReturnException("createDefaultItems return null,because key is null");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it;
        int intValue;
        if (str.equals("3")) {
            it = f7432b.iterator();
            while (it.hasNext()) {
                intValue = ((Integer) it.next()).intValue();
                for (String serverItem : f7433c) {
                    arrayList.add(new ServerItem(serverItem, intValue, 3));
                }
            }
        } else if (str.equals("1")) {
            it = f7432b.iterator();
            while (it.hasNext()) {
                intValue = ((Integer) it.next()).intValue();
                for (String serverItem2 : f7435e) {
                    arrayList.add(new ServerItem(serverItem2, intValue, 1));
                }
            }
        } else if (str.equals("2")) {
            it = f7432b.iterator();
            while (it.hasNext()) {
                intValue = ((Integer) it.next()).intValue();
                for (String serverItem22 : f7434d) {
                    arrayList.add(new ServerItem(serverItem22, intValue, 2));
                }
            }
        } else {
            String hostAddress;
            String domain = CacheManager.getDomain(ProGuard.m5376e());
            if (TextUtils.isEmpty(domain)) {
                domain = f7431a;
            }
            try {
                hostAddress = InetAddress.getByName(domain).getHostAddress();
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
                hostAddress = f7433c[0];
            }
            Iterator it2 = f7432b.iterator();
            while (it2.hasNext()) {
                arrayList.add(new ServerItem(hostAddress, ((Integer) it2.next()).intValue(), 0));
            }
        }
        return arrayList;
    }

    public static void m4853a(ApList apList) {
        Map map = apList.primary;
        Map map2 = apList.secondary;
        ArrayList arrayList = apList.portList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Byte b : map.keySet()) {
            String a = com.tencent.android.tpush.service.p077d.ProGuard.m5305a(((Long) map.get(b)).longValue());
            if (!TextUtils.isEmpty(a)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ServerItem serverItem = new ServerItem(a, ((Integer) it.next()).intValue(), b.intValue());
                    if (b.byteValue() == 3) {
                        arrayList2.add(serverItem);
                    }
                    if (b.byteValue() == 1) {
                        arrayList3.add(serverItem);
                    }
                    if (b.byteValue() == 2) {
                        arrayList4.add(serverItem);
                    }
                }
            }
        }
        for (Byte b2 : map2.keySet()) {
            String a2 = com.tencent.android.tpush.service.p077d.ProGuard.m5305a(((Long) map2.get(b2)).longValue());
            if (!TextUtils.isEmpty(a2)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ServerItem serverItem2 = new ServerItem(a2, ((Integer) it2.next()).intValue(), b2.intValue());
                    if (b2.byteValue() == 3) {
                        arrayList2.add(serverItem2);
                    }
                    if (b2.byteValue() == 1) {
                        arrayList3.add(serverItem2);
                    }
                    if (b2.byteValue() == 2) {
                        arrayList4.add(serverItem2);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            CacheManager.addServerItems(ProGuard.m5376e(), "3", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            CacheManager.addServerItems(ProGuard.m5376e(), "1", arrayList3);
        }
        if (!arrayList4.isEmpty()) {
            CacheManager.addServerItems(ProGuard.m5376e(), "2", arrayList4);
        }
        ArrayList arrayList5 = apList.speedTestIpList;
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Long l = (Long) it3.next();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new ServerItem(l.longValue(), ((Integer) it4.next()).intValue(), 0));
            }
        }
        CacheManager.saveSpeedTestList(ProGuard.m5376e(), arrayList6);
        String str = apList.domain;
        if (!TextUtils.isEmpty(str) && !str.equals(CacheManager.getDomain(ProGuard.m5376e()))) {
            CacheManager.clearDomainServerItem(ProGuard.m5376e());
            CacheManager.saveDomain(ProGuard.m5376e(), str);
        }
    }

    public static ArrayList m4851a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = f7432b.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            for (String serverItem : f7433c) {
                arrayList.add(new ServerItem(serverItem, intValue, 3));
            }
            for (String serverItem2 : f7435e) {
                arrayList.add(new ServerItem(serverItem2, intValue, 1));
            }
            for (String serverItem22 : f7434d) {
                arrayList.add(new ServerItem(serverItem22, intValue, 2));
            }
        }
        String domain = CacheManager.getDomain(ProGuard.m5376e());
        if (TextUtils.isEmpty(domain)) {
            domain = f7431a;
        }
        try {
            String hostAddress = InetAddress.getByName(domain).getHostAddress();
            it = f7432b.iterator();
            while (it.hasNext()) {
                arrayList.add(new ServerItem(hostAddress, ((Integer) it.next()).intValue(), 0));
            }
        } catch (Exception e) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">> Dns resolve err : " + e.getMessage());
        }
        return arrayList;
    }
}
