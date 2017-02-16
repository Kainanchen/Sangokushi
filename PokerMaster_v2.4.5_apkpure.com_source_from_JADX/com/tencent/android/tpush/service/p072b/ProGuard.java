package com.tencent.android.tpush.service.p072b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.view.PointerIconCompat;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.data.CachedMessageIntent;
import com.tencent.android.tpush.data.MessageId;
import com.tencent.android.tpush.data.PushClickEntity;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.service.cache.CacheManager;
import com.tencent.android.tpush.service.channel.protocol.TpnsClickClientReport;
import com.tencent.android.tpush.service.channel.protocol.TpnsPushClientReport;
import com.tencent.android.tpush.service.channel.protocol.TpnsPushMsg;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONObject;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.INTENTSCHEMECHECK, EType.INTENTCHECK, EType.RECEIVERCHECK})
/* renamed from: com.tencent.android.tpush.service.b.a */
public class ProGuard {
    public static long f7547a;
    private static ProGuard f7548b;
    private static final byte[] f7549c;
    private static long f7550d;
    private static volatile boolean f7551e;
    private static volatile boolean f7552f;
    private static volatile boolean f7553g;
    private PendingIntent f7554h;

    static {
        f7548b = new ProGuard();
        f7549c = new byte[0];
        f7550d = 0;
        f7551e = false;
        f7552f = false;
        f7553g = false;
        f7547a = 306000;
    }

    private ProGuard() {
        this.f7554h = null;
    }

    public static ProGuard m5021a() {
        return f7548b;
    }

    private void m5022a(Context context, Long l) {
        long currentTimeMillis = System.currentTimeMillis();
        List b = m5058b(context);
        if (f7551e) {
            com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", ">> msg ack is uploading , this time will give up! MessageId = " + l);
            return;
        }
        ArrayList b2 = m5059b(context, b);
        if (b2 == null || b2.size() <= 0) {
            com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", "Null report list with msgId " + l);
        } else {
            f7551e = true;
            f7550d = currentTimeMillis;
        }
        com.tencent.android.tpush.p067a.ProGuard.m4701a(5, (List) b2);
        com.tencent.android.tpush.service.ProGuard.m5389a().m5402a(b2, new ProGuard(this, b2, context));
    }

    public synchronized void m5043a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            long longExtra = intent.getLongExtra(MessageKey.MSG_ID, -1);
            String stringExtra = intent.getStringExtra(Constants.FLAG_PACK_NAME);
            com.tencent.android.tpush.p067a.ProGuard.m4700a(4, longExtra);
            m5062b(context, stringExtra, longExtra);
            m5046a(context, stringExtra, longExtra, (short) 1);
            m5022a(context, Long.valueOf(longExtra));
        }
    }

    public synchronized void m5060b(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            String stringExtra = intent.getStringExtra(Constants.FLAG_PACK_NAME);
            long longExtra = intent.getLongExtra(MessageKey.MSG_ID, -1);
            if (longExtra <= 0) {
                com.tencent.android.tpush.p067a.ProGuard.m4703a(Constants.ServiceLogTag, "@@ msgClick: Not add LocalMsg");
            } else {
                Context context2 = context;
                m5049a(context2, stringExtra, new PushClickEntity(longExtra, intent.getLongExtra(MessageKey.MSG_ACCESS_ID, -1), intent.getLongExtra(MessageKey.MSG_BUSI_MSG_ID, -1), intent.getLongExtra(MessageKey.MSG_CREATE_TIMESTAMPS, -1), stringExtra, 1, intent.getLongExtra(Constants.FLAG_CLICK_TIME, System.currentTimeMillis() / 1000), intent.getIntExtra(MessageKey.MSG_ACTION, 0)));
                m5069c(context, intent);
            }
        }
    }

    public void m5044a(Context context, TpnsPushMsg tpnsPushMsg, long j, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        long currentTimeMillis = System.currentTimeMillis();
        MessageId messageId = new MessageId();
        messageId.id = tpnsPushMsg.msgId;
        messageId.accessId = tpnsPushMsg.accessId;
        messageId.host = com.tencent.android.tpush.service.p077d.ProGuard.m5320b(proGuard.m5143d());
        messageId.port = proGuard.m5144e();
        messageId.pact = com.tencent.android.tpush.service.ProGuard.m5387a(proGuard.m5141b());
        messageId.apn = com.tencent.android.tpush.service.p077d.ProGuard.m5338f(com.tencent.android.tpush.service.ProGuard.m5376e());
        messageId.isp = com.tencent.android.tpush.service.p077d.ProGuard.m5340g(com.tencent.android.tpush.service.ProGuard.m5376e());
        messageId.pushTime = j;
        messageId.serviceHost = com.tencent.android.tpush.service.ProGuard.m5376e().getPackageName();
        messageId.receivedTime = currentTimeMillis;
        messageId.pkgName = tpnsPushMsg.appPkgName;
        messageId.busiMsgId = tpnsPushMsg.busiMsgId;
        messageId.timestamp = tpnsPushMsg.timestamp;
        messageId.msgType = tpnsPushMsg.type;
        messageId.multiPkg = tpnsPushMsg.multiPkg;
        messageId.date = tpnsPushMsg.date;
        m5048a(context, tpnsPushMsg.appPkgName, messageId);
        m5032b(context, messageId);
    }

    private synchronized void m5032b(Context context, MessageId messageId) {
        List a = m5040a(context, messageId);
        if (f7552f) {
            Object obj;
            String str = "MessageManager";
            StringBuilder stringBuilder = new StringBuilder("requestServiceAck ack is uploading , this time will give up!  msgId =  ");
            if (messageId == null) {
                obj = null;
            } else {
                obj = Long.valueOf(messageId.id);
            }
            com.tencent.android.tpush.p067a.ProGuard.m4715c(str, stringBuilder.append(obj).toString());
        } else {
            ArrayList a2 = m5042a(context, a);
            if (a2 == null || a2.size() == 0) {
                com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", "requestServiceAck with null list , give up this time");
            } else {
                f7552f = true;
                com.tencent.android.tpush.service.ProGuard.m5389a().m5402a(a2, new ProGuard(this, messageId, context));
            }
        }
    }

    public void m5052a(Context context, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                if (arrayList.size() > 0) {
                    try {
                        ArrayList e = m5036e(context, "all");
                        if (e != null && e.size() > 0) {
                            HashMap hashMap = new HashMap();
                            Iterator it = e.iterator();
                            while (it.hasNext()) {
                                ArrayList arrayList2;
                                Object obj;
                                MessageId messageId = (MessageId) it.next();
                                e = (ArrayList) hashMap.get(messageId.pkgName);
                                if (e == null) {
                                    e = new ArrayList();
                                    hashMap.put(messageId.pkgName, e);
                                    arrayList2 = e;
                                } else {
                                    arrayList2 = e;
                                }
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (messageId.id == ((TpnsPushClientReport) arrayList.get(i)).msgId) {
                                        arrayList.remove(i);
                                        obj = null;
                                        break;
                                    }
                                }
                                int i2 = 1;
                                if (obj != null) {
                                    arrayList2.add(messageId);
                                    hashMap.put(messageId.pkgName, arrayList2);
                                }
                            }
                            for (String str : hashMap.keySet()) {
                                m5051a(context, str, (ArrayList) hashMap.get(str));
                            }
                        }
                    } catch (Throwable e2) {
                        com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "+++ clear msg id exception", e2);
                    }
                }
            }
            com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "deleteServiceMsgIdBatch with null context or null list");
        }
    }

    public ArrayList m5042a(Context context, List list) {
        ArrayList arrayList = null;
        if (list != null && list.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (MessageId messageId : list) {
                TpnsPushClientReport tpnsPushClientReport = new TpnsPushClientReport();
                tpnsPushClientReport.accessId = messageId.accessId;
                tpnsPushClientReport.msgId = messageId.id;
                tpnsPushClientReport.apn = messageId.apn;
                tpnsPushClientReport.isp = messageId.isp;
                tpnsPushClientReport.locip = messageId.host;
                tpnsPushClientReport.locport = messageId.port;
                tpnsPushClientReport.pack = messageId.pact;
                tpnsPushClientReport.timeUs = messageId.pushTime;
                tpnsPushClientReport.qua = CacheManager.getQua(context, tpnsPushClientReport.accessId);
                tpnsPushClientReport.serviceHost = messageId.serviceHost;
                tpnsPushClientReport.confirmMs = System.currentTimeMillis() - messageId.receivedTime;
                tpnsPushClientReport.broadcastId = messageId.busiMsgId;
                tpnsPushClientReport.timestamp = messageId.timestamp;
                tpnsPushClientReport.type = messageId.msgType;
                tpnsPushClientReport.ackType = (byte) 1;
                tpnsPushClientReport.receiveTime = messageId.receivedTime / 1000;
                if (XGPushConfig.enableDebug) {
                    com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", "Ack to server : @msgId=" + tpnsPushClientReport.msgId + " @accId=" + tpnsPushClientReport.accessId + " @timeUs=" + tpnsPushClientReport.timeUs + " @confirmMs=" + tpnsPushClientReport.confirmMs + " @recTime=" + messageId.receivedTime + " @msgType=" + messageId.msgType + " @broadcastId=" + tpnsPushClientReport.broadcastId);
                }
                arrayList2.add(tpnsPushClientReport);
                if (arrayList2.size() > 30) {
                    return arrayList2;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public ArrayList m5040a(Context context, MessageId messageId) {
        ArrayList arrayList;
        synchronized (f7549c) {
            arrayList = null;
            if (context != null) {
                Object obj = null;
                List<String> registerInfos = CacheManager.getRegisterInfos(context);
                if (registerInfos != null && registerInfos.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : registerInfos) {
                        Collection e = m5036e(context, str);
                        if (messageId == null || str.equals(messageId.pkgName)) {
                            obj = 1;
                        }
                        if (e != null && e.size() > 0) {
                            arrayList2.addAll(e);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (obj == null) {
                    try {
                        Collection e2 = m5036e(context, messageId.pkgName);
                        if (e2 != null && e2.size() > 0) {
                            arrayList.retainAll(e2);
                            if (arrayList.size() > 0) {
                                arrayList.removeAll(arrayList);
                                arrayList.addAll(e2);
                            } else {
                                arrayList.addAll(e2);
                            }
                        }
                    } catch (Exception e3) {
                    }
                }
                m5051a(context, "all", arrayList);
            }
        }
        return arrayList;
    }

    public void m5048a(Context context, String str, MessageId messageId) {
        synchronized (f7549c) {
            if (context != null) {
                if (!(com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || messageId == null)) {
                    ArrayList e = m5036e(context, str);
                    Collection arrayList = new ArrayList();
                    for (int i = 0; i < e.size(); i++) {
                        MessageId messageId2 = (MessageId) e.get(i);
                        if (messageId2.id == messageId.id) {
                            arrayList.add(messageId2);
                        }
                    }
                    e.removeAll(arrayList);
                    e.add(messageId);
                    m5051a(context, str, e);
                }
            }
        }
    }

    public void m5051a(Context context, String str, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                m5023a(context, str, ".tpns.msg.id.service", arrayList);
            }
        }
    }

    private ArrayList m5036e(Context context, String str) {
        ArrayList arrayList;
        if (!(context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            Object b = m5030b(context, str, ".tpns.msg.id.service");
            if (b != null) {
                arrayList = (ArrayList) b;
                if (arrayList != null) {
                    return new ArrayList();
                }
                return arrayList;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public void m5065b(Context context, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                if (arrayList.size() > 0) {
                    try {
                        ArrayList c = m5067c(context);
                        if (c != null && c.size() > 0) {
                            HashMap hashMap = new HashMap();
                            Iterator it = c.iterator();
                            while (it.hasNext()) {
                                ArrayList arrayList2;
                                Object obj;
                                PushClickEntity pushClickEntity = (PushClickEntity) it.next();
                                c = (ArrayList) hashMap.get(pushClickEntity.pkgName);
                                if (c == null) {
                                    c = new ArrayList();
                                    hashMap.put(pushClickEntity.pkgName, c);
                                    arrayList2 = c;
                                } else {
                                    arrayList2 = c;
                                }
                                for (int i = 0; i < arrayList.size(); i++) {
                                    if (pushClickEntity.msgId == ((TpnsClickClientReport) arrayList.get(i)).msgId) {
                                        arrayList.remove(i);
                                        obj = null;
                                        break;
                                    }
                                }
                                int i2 = 1;
                                if (obj != null) {
                                    arrayList2.add(pushClickEntity);
                                    hashMap.put(pushClickEntity.pkgName, arrayList2);
                                }
                            }
                            for (String str : hashMap.keySet()) {
                                m5064b(context, str, (ArrayList) hashMap.get(str));
                            }
                        }
                    } catch (Throwable e) {
                        com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "+++ clear msg id exception", e);
                    }
                }
            }
        }
    }

    public ArrayList m5039a(Context context) {
        ArrayList arrayList = null;
        List<PushClickEntity> c = m5067c(context);
        if (c != null && c.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (PushClickEntity pushClickEntity : c) {
                TpnsClickClientReport tpnsClickClientReport = new TpnsClickClientReport();
                tpnsClickClientReport.accessId = pushClickEntity.accessId;
                tpnsClickClientReport.msgId = pushClickEntity.msgId;
                tpnsClickClientReport.broadcastId = pushClickEntity.broadcastId;
                tpnsClickClientReport.timestamp = pushClickEntity.timestamp;
                tpnsClickClientReport.type = pushClickEntity.type;
                tpnsClickClientReport.clickTime = pushClickEntity.clickTime;
                tpnsClickClientReport.action = (long) pushClickEntity.action;
                arrayList2.add(tpnsClickClientReport);
                if (arrayList2.size() > 30) {
                    return arrayList2;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public void m5069c(Context context, Intent intent) {
        if (!f7553g) {
            ArrayList a = m5039a(context);
            if (a == null || a.size() <= 0) {
                f7553g = false;
                return;
            }
            f7553g = true;
            com.tencent.android.tpush.service.ProGuard.m5389a().m5405b(a, new ProGuard(this, a, context, intent));
        }
    }

    public ArrayList m5058b(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = CacheManager.getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String g : registerInfos) {
            Collection g2 = m5038g(context, g);
            if (g2 != null && g2.size() > 0) {
                arrayList.addAll(g2);
            }
        }
        return arrayList;
    }

    public ArrayList m5067c(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = CacheManager.getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String f : registerInfos) {
            Collection f2 = m5037f(context, f);
            if (f2 != null && f2.size() > 0) {
                arrayList.addAll(f2);
            }
        }
        return arrayList;
    }

    private ArrayList m5037f(Context context, String str) {
        ArrayList arrayList;
        if (!(context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            Object b = m5030b(context, str, ".tpns.msg.id.clicked");
            if (b != null) {
                arrayList = (ArrayList) b;
                if (arrayList != null) {
                    return new ArrayList();
                }
                return arrayList;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public void m5049a(Context context, String str, PushClickEntity pushClickEntity) {
        synchronized (f7549c) {
            if (context != null) {
                if (!(com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || pushClickEntity == null)) {
                    ArrayList f = m5037f(context, str);
                    Collection arrayList = new ArrayList();
                    for (int i = 0; i < f.size(); i++) {
                        PushClickEntity pushClickEntity2 = (PushClickEntity) f.get(i);
                        if (pushClickEntity2.msgId == pushClickEntity.msgId) {
                            arrayList.add(pushClickEntity2);
                        }
                    }
                    f.removeAll(arrayList);
                    f.add(pushClickEntity);
                    m5064b(context, str, f);
                }
            }
        }
    }

    public void m5064b(Context context, String str, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                m5023a(context, str, ".tpns.msg.id.clicked", arrayList);
            }
        }
    }

    public ArrayList m5059b(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (MessageId messageId : list) {
                TpnsPushClientReport tpnsPushClientReport = new TpnsPushClientReport();
                tpnsPushClientReport.accessId = messageId.accessId;
                tpnsPushClientReport.msgId = messageId.id;
                tpnsPushClientReport.apn = messageId.apn;
                tpnsPushClientReport.isp = messageId.isp;
                tpnsPushClientReport.locip = messageId.host;
                tpnsPushClientReport.locport = messageId.port;
                tpnsPushClientReport.pack = messageId.pact;
                tpnsPushClientReport.timeUs = messageId.pushTime;
                tpnsPushClientReport.qua = CacheManager.getQua(context, tpnsPushClientReport.accessId);
                tpnsPushClientReport.serviceHost = messageId.serviceHost;
                tpnsPushClientReport.confirmMs = System.currentTimeMillis() - messageId.receivedTime;
                tpnsPushClientReport.broadcastId = messageId.busiMsgId;
                tpnsPushClientReport.timestamp = messageId.timestamp;
                tpnsPushClientReport.type = messageId.msgType;
                tpnsPushClientReport.receiveTime = messageId.receivedTime / 1000;
                arrayList2.add(tpnsPushClientReport);
                if (arrayList2.size() > 30) {
                    return arrayList2;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private ArrayList m5038g(Context context, String str) {
        ArrayList arrayList;
        synchronized (f7549c) {
            arrayList = null;
            if (context != null) {
                if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
                    ArrayList a = m5041a(context, str);
                    if (a != null && a.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            MessageId messageId = (MessageId) it.next();
                            if (messageId.m4845a()) {
                                arrayList2.add(messageId);
                            } else if (!m5076d(context, str, messageId.id)) {
                                arrayList2.add(messageId);
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList m5041a(Context context, String str) {
        ArrayList arrayList;
        if (!(context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            Object b = m5030b(context, str, ".tpns.msg.id");
            if (b != null) {
                arrayList = (ArrayList) b;
                if (arrayList != null) {
                    return new ArrayList();
                }
                return arrayList;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public void m5070c(Context context, String str, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                m5023a(context, str, ".tpns.msg.id", arrayList);
            }
        }
    }

    public void m5046a(Context context, String str, long j, short s) {
        synchronized (f7549c) {
            Object obj = null;
            if (context != null && j > 0) {
                ArrayList a = m5041a(context, str);
                if (a == null || a.size() <= 0) {
                    com.tencent.android.tpush.p067a.ProGuard.m4700a(12, j);
                } else {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        Object obj2;
                        MessageId messageId = (MessageId) it.next();
                        if (messageId.id == j) {
                            messageId.isAck = s;
                            obj2 = 1;
                        } else {
                            obj2 = obj;
                        }
                        obj = obj2;
                    }
                    if (obj != null) {
                        m5070c(context, str, a);
                    } else {
                        com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "updateMsgIdFlag Failed with no equal MessageId = " + j + " pkgName = " + str);
                        com.tencent.android.tpush.p067a.ProGuard.m4700a(11, j);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5061b(android.content.Context r11, java.lang.String r12) {
        /*
        r10 = this;
        r8 = 0;
        monitor-enter(r10);
        if (r11 != 0) goto L_0x000e;
    L_0x0005:
        r0 = "XGService";
        r1 = "clearLocalMsg context==null";
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r0, r1);	 Catch:{ all -> 0x0085 }
    L_0x000c:
        monitor-exit(r10);
        return;
    L_0x000e:
        r0 = "XGService";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0085 }
        r2 = "@@ clearLocalMsg(current pkg:";
        r1.<init>(r2);	 Catch:{ all -> 0x0085 }
        r2 = r11.getPackageName();	 Catch:{ all -> 0x0085 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0085 }
        r2 = ",remote pkg:";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0085 }
        r1 = r1.append(r12);	 Catch:{ all -> 0x0085 }
        r2 = ")";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0085 }
        r1 = r1.toString();	 Catch:{ all -> 0x0085 }
        com.tencent.android.tpush.p067a.ProGuard.m4703a(r0, r1);	 Catch:{ all -> 0x0085 }
        r2 = r10.m5068c(r11, r12);	 Catch:{ all -> 0x0085 }
        if (r2 == 0) goto L_0x000c;
    L_0x003c:
        r0 = r2.size();	 Catch:{ all -> 0x0085 }
        if (r0 <= 0) goto L_0x000c;
    L_0x0042:
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0085 }
        r3.<init>();	 Catch:{ all -> 0x0085 }
        r0 = 0;
        r1 = r0;
    L_0x0049:
        r0 = r2.size();	 Catch:{ all -> 0x0085 }
        if (r1 >= r0) goto L_0x0088;
    L_0x004f:
        r0 = r2.get(r1);	 Catch:{ all -> 0x0085 }
        r0 = (com.tencent.android.tpush.data.CachedMessageIntent) r0;	 Catch:{ all -> 0x0085 }
        r4 = r0.intent;	 Catch:{ Exception -> 0x007a }
        r4 = com.tencent.android.tpush.encrypt.Rijndael.decrypt(r4);	 Catch:{ Exception -> 0x007a }
        r5 = com.tencent.android.tpush.service.p077d.ProGuard.m5317a(r4);	 Catch:{ Exception -> 0x007a }
        if (r5 == 0) goto L_0x0065;
    L_0x0061:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0049;
    L_0x0065:
        r5 = 1;
        r4 = android.content.Intent.parseUri(r4, r5);	 Catch:{ Exception -> 0x007a }
        r5 = "msgId";
        r6 = 0;
        r4 = r4.getLongExtra(r5, r6);	 Catch:{ Exception -> 0x007a }
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x0061;
    L_0x0076:
        r3.add(r0);	 Catch:{ Exception -> 0x007a }
        goto L_0x0061;
    L_0x007a:
        r0 = move-exception;
        r4 = "XGService";
        r0 = r0.getMessage();	 Catch:{ all -> 0x0085 }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(r4, r0);	 Catch:{ all -> 0x0085 }
        goto L_0x0061;
    L_0x0085:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
    L_0x0088:
        r2.removeAll(r3);	 Catch:{ all -> 0x0085 }
        r10.m5075d(r11, r12, r2);	 Catch:{ all -> 0x0085 }
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.android.tpush.service.b.a.b(android.content.Context, java.lang.String):void");
    }

    public ArrayList m5073d(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = CacheManager.getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String c : registerInfos) {
            Collection c2 = m5068c(context, c);
            if (c2 != null && c2.size() > 0) {
                arrayList.addAll(c2);
            }
        }
        return arrayList;
    }

    public ArrayList m5068c(Context context, String str) {
        ArrayList arrayList;
        if (context != null) {
            try {
                if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
                    Object b = m5030b(context, str, ".tpns.msg.id.cached");
                    if (b != null) {
                        arrayList = (ArrayList) b;
                        if (arrayList != null) {
                            return new ArrayList();
                        }
                        return arrayList;
                    }
                }
            } catch (Throwable th) {
                return new ArrayList();
            }
        }
        arrayList = null;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public void m5047a(Context context, String str, Intent intent) {
        synchronized (f7549c) {
            if (context != null) {
                if (!(com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || intent == null)) {
                    ArrayList arrayList;
                    CachedMessageIntent cachedMessageIntent = new CachedMessageIntent();
                    cachedMessageIntent.pkgName = str;
                    cachedMessageIntent.msgId = intent.getLongExtra(MessageKey.MSG_ID, -1);
                    cachedMessageIntent.intent = Rijndael.encrypt(intent.toUri(1));
                    ArrayList c = m5068c(context, str);
                    if (c == null) {
                        arrayList = new ArrayList();
                    } else {
                        Collection arrayList2 = new ArrayList();
                        for (int i = 0; i < c.size(); i++) {
                            CachedMessageIntent cachedMessageIntent2 = (CachedMessageIntent) c.get(i);
                            if (cachedMessageIntent2.equals(cachedMessageIntent)) {
                                arrayList2.add(cachedMessageIntent2);
                            }
                        }
                        c.removeAll(arrayList2);
                        arrayList = c;
                    }
                    int size = arrayList.size() / 2;
                    if (size >= 100) {
                        com.tencent.android.tpush.p067a.ProGuard.m4721f("MessageManager", "too much cache msg, try to cut " + size);
                        arrayList.subList(0, size).clear();
                    }
                    arrayList.add(cachedMessageIntent);
                    m5075d(context, str, arrayList);
                }
            }
        }
    }

    public void m5075d(Context context, String str, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || arrayList == null)) {
                com.tencent.android.tpush.p067a.ProGuard.m4703a(Constants.ServiceLogTag, "updateCachedMsgIntentByPkgName, size: " + arrayList.size());
                m5023a(context, str, ".tpns.msg.id.cached", arrayList);
            }
        }
    }

    public void m5074d(Context context, String str) {
        synchronized (f7549c) {
            if (context != null) {
                m5075d(context, str, new ArrayList());
            }
        }
    }

    public void m5045a(Context context, String str, long j) {
        synchronized (f7549c) {
            if (context != null) {
                ArrayList c = m5068c(context, str);
                if (c != null && c.size() > 0) {
                    Collection arrayList = new ArrayList();
                    for (int i = 0; i < c.size(); i++) {
                        CachedMessageIntent cachedMessageIntent = (CachedMessageIntent) c.get(i);
                        if (j == Intent.parseUri(Rijndael.decrypt(cachedMessageIntent.intent), 1).getLongExtra(MessageKey.MSG_BUSI_MSG_ID, -1)) {
                            arrayList.add(cachedMessageIntent);
                        }
                    }
                    c.removeAll(arrayList);
                }
                m5075d(context, str, c);
            }
        }
    }

    public void m5062b(Context context, String str, long j) {
        synchronized (f7549c) {
            if (context != null) {
                ArrayList c = m5068c(context, str);
                if (c != null && c.size() > 0) {
                    Collection arrayList = new ArrayList();
                    for (int i = 0; i < c.size(); i++) {
                        CachedMessageIntent cachedMessageIntent = (CachedMessageIntent) c.get(i);
                        if (cachedMessageIntent.msgId == j) {
                            arrayList.add(cachedMessageIntent);
                        }
                    }
                    if (arrayList.size() == 0) {
                        com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "deleteCachedMsgIntentByPkgName do not have MessageId = " + j);
                    }
                    c.removeAll(arrayList);
                }
                m5075d(context, str, c);
            }
        }
    }

    public void m5053a(Context context, List list, ArrayList arrayList) {
        synchronized (f7549c) {
            if (!(context == null || list == null)) {
                if (list.size() > 0) {
                    try {
                        Collection arrayList2 = new ArrayList();
                        if (arrayList != null && arrayList.size() > 0) {
                            CachedMessageIntent cachedMessageIntent;
                            HashMap hashMap = new HashMap();
                            for (int i = 0; i < arrayList.size(); i++) {
                                cachedMessageIntent = (CachedMessageIntent) arrayList.get(i);
                                for (CachedMessageIntent cachedMessageIntent2 : list) {
                                    if (cachedMessageIntent.equals(cachedMessageIntent2)) {
                                        arrayList2.add(cachedMessageIntent);
                                        Object obj = (ArrayList) hashMap.get(cachedMessageIntent2.pkgName);
                                        if (obj == null) {
                                            obj = new ArrayList();
                                        }
                                        hashMap.put(cachedMessageIntent2.pkgName, obj);
                                    }
                                }
                            }
                            arrayList.removeAll(arrayList2);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                cachedMessageIntent = (CachedMessageIntent) it.next();
                                ArrayList arrayList3 = (ArrayList) hashMap.get(cachedMessageIntent.pkgName);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cachedMessageIntent);
                                hashMap.put(cachedMessageIntent.pkgName, arrayList3);
                            }
                            for (String str : hashMap.keySet()) {
                                m5075d(context, str, (ArrayList) hashMap.get(str));
                            }
                        }
                    } catch (Throwable e) {
                        com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "deleteCachedMsgIntent", e);
                    }
                }
            }
        }
    }

    public void m5071c(Context context, List list) {
        synchronized (f7549c) {
            if (!(context == null || list == null)) {
                if (list.size() > 0) {
                    try {
                        ArrayList b = m5058b(context);
                        if (b != null && b.size() > 0) {
                            HashMap hashMap = new HashMap();
                            Iterator it = b.iterator();
                            while (it.hasNext()) {
                                ArrayList arrayList;
                                Object obj;
                                MessageId messageId = (MessageId) it.next();
                                b = (ArrayList) hashMap.get(messageId.pkgName);
                                if (b == null) {
                                    b = new ArrayList();
                                    hashMap.put(messageId.pkgName, b);
                                    arrayList = b;
                                } else {
                                    arrayList = b;
                                }
                                for (int i = 0; i < list.size(); i++) {
                                    if (messageId.id == ((TpnsPushClientReport) list.get(i)).msgId) {
                                        obj = null;
                                        break;
                                    }
                                }
                                int i2 = 1;
                                if (obj != null) {
                                    arrayList.add(messageId);
                                    hashMap.put(messageId.pkgName, arrayList);
                                }
                            }
                            for (String str : hashMap.keySet()) {
                                m5070c(context, str, (ArrayList) hashMap.get(str));
                            }
                        }
                    } catch (Throwable e) {
                        com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "deleteMsgIdBatch", e);
                    }
                }
            }
        }
    }

    public void m5063b(Context context, String str, MessageId messageId) {
        synchronized (f7549c) {
            if (context != null) {
                if (!(com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || messageId == null)) {
                    ArrayList arrayList;
                    ArrayList a = m5041a(context, str);
                    if (a == null) {
                        arrayList = new ArrayList();
                    } else {
                        for (int i = 0; i < a.size(); i++) {
                            if (((MessageId) a.get(i)).id == messageId.id) {
                                a.remove(i);
                                arrayList = a;
                                break;
                            }
                        }
                        arrayList = a;
                    }
                    arrayList.add(messageId);
                    m5070c(context, str, arrayList);
                }
            }
        }
    }

    public boolean m5072c(Context context, String str, long j) {
        if (!(context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || j <= 0)) {
            List<MessageId> a = m5041a(context, str);
            if (a != null && a.size() > 0) {
                for (MessageId messageId : a) {
                    if (messageId.id == j) {
                        return messageId.m4845a();
                    }
                }
            }
        }
        return false;
    }

    public boolean m5076d(Context context, String str, long j) {
        if (!(context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            List<CachedMessageIntent> c = m5068c(context, str);
            if (c != null && c.size() > 0) {
                for (CachedMessageIntent cachedMessageIntent : c) {
                    if (cachedMessageIntent.msgId == j && str.equals(cachedMessageIntent.pkgName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void m5024a(Intent intent, String str, MessageId messageId) {
        List list;
        com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "dispatchMessageOnTime");
        long j = intent.getExtras().getLong(MessageKey.MSG_CREATE_MULTIPKG);
        long j2 = intent.getExtras().getLong(MessageKey.MSG_ACCESS_ID);
        List arrayList = new ArrayList();
        if (j == 0) {
            arrayList.add(intent.getPackage());
            list = arrayList;
        } else {
            list = ProGuard.m5094a().m5097a(com.tencent.android.tpush.service.ProGuard.m5376e(), j2);
        }
        com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "dispatchMessageOnTime pkgs " + list.size());
        for (int i = 0; i < list.size(); i++) {
            try {
                String str2 = (String) list.get(i);
                if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str2)) {
                    com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", ">> msg.appPkgName is null!");
                } else if (com.tencent.android.tpush.service.p077d.ProGuard.m5313a(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, j2)) {
                    com.tencent.android.tpush.data.ProGuard registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str2);
                    if (registerInfoByPkgName != null) {
                        if (registerInfoByPkgName.f7423e > 0) {
                            m5075d(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, new ArrayList());
                        } else if (!(m5076d(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, messageId.id) || com.tencent.android.tpush.service.p077d.ProGuard.m5306a(com.tencent.android.tpush.service.ProGuard.m5376e(), registerInfoByPkgName.f7419a).contains("@" + messageId.id + str2 + "@"))) {
                            if (m5072c(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, messageId.id)) {
                                com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">> msgId:" + messageId.id + " has been acked.");
                            } else {
                                intent.setPackage(str2);
                                messageId.pkgName = str2;
                                if (messageId.id > 0) {
                                    m5063b(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, messageId);
                                }
                                m5047a(com.tencent.android.tpush.service.ProGuard.m5376e(), str, intent);
                                m5034c();
                                m5056a(messageId.date, intent, str2);
                            }
                        }
                    }
                } else {
                    com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "dispatchMessageOnTime appPkgName " + str2 + " is not installed.");
                    com.tencent.android.tpush.service.ProGuard.m5389a().m5400a(str2);
                    ProGuard.m5094a().m5100a(com.tencent.android.tpush.service.ProGuard.m5376e(), str2);
                    m5075d(com.tencent.android.tpush.service.ProGuard.m5376e(), str2, new ArrayList());
                }
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "dispatchMessageOnTime", e);
            }
        }
    }

    public void m5056a(String str, Intent intent, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        List a;
        if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) && simpleDateFormat.parse(str).compareTo(simpleDateFormat.parse(simpleDateFormat.format(new Date()))) == 0)) {
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5316a(intent)) {
                a = com.tencent.android.tpush.service.p077d.ProGuard.m5310a(com.tencent.android.tpush.service.ProGuard.m5376e(), str2 + Constants.RPC_SUFFIX);
                if (a == null || a.size() <= 0) {
                    if (XGPushConfig.enableDebug) {
                        com.tencent.android.tpush.p067a.ProGuard.m4715c(Constants.ServiceLogTag, ">> send message intent:" + intent);
                    }
                    com.tencent.android.tpush.service.ProGuard.m5376e().sendBroadcast(intent);
                    return;
                }
                com.tencent.android.tpush.p067a.ProGuard.m4715c(Constants.ServiceLogTag, ">> send rpc message intent:" + intent);
                m5054a(intent);
            }
        } else if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) && simpleDateFormat.parse(str).compareTo(simpleDateFormat.parse(simpleDateFormat.format(new Date()))) < 0) {
            a = com.tencent.android.tpush.service.p077d.ProGuard.m5310a(com.tencent.android.tpush.service.ProGuard.m5376e(), str2 + Constants.RPC_SUFFIX);
            if (a == null || a.size() <= 0) {
                com.tencent.android.tpush.service.ProGuard.m5376e().sendBroadcast(intent);
            } else {
                m5054a(intent);
            }
        }
    }

    private void m5028a(TpnsPushMsg tpnsPushMsg, long j, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        long currentTimeMillis = System.currentTimeMillis();
        MessageId messageId = new MessageId();
        messageId.id = tpnsPushMsg.msgId;
        messageId.isAck = (short) 0;
        messageId.accessId = tpnsPushMsg.accessId;
        messageId.host = com.tencent.android.tpush.service.p077d.ProGuard.m5320b(proGuard.m5143d());
        messageId.port = proGuard.m5144e();
        messageId.pact = com.tencent.android.tpush.service.ProGuard.m5387a(proGuard.m5141b());
        messageId.apn = com.tencent.android.tpush.service.p077d.ProGuard.m5338f(com.tencent.android.tpush.service.ProGuard.m5376e());
        messageId.isp = com.tencent.android.tpush.service.p077d.ProGuard.m5340g(com.tencent.android.tpush.service.ProGuard.m5376e());
        messageId.pushTime = j;
        messageId.serviceHost = com.tencent.android.tpush.service.ProGuard.m5376e().getPackageName();
        messageId.receivedTime = currentTimeMillis;
        messageId.pkgName = tpnsPushMsg.appPkgName;
        messageId.busiMsgId = tpnsPushMsg.busiMsgId;
        messageId.timestamp = tpnsPushMsg.timestamp;
        messageId.msgType = tpnsPushMsg.type;
        messageId.multiPkg = tpnsPushMsg.multiPkg;
        messageId.date = tpnsPushMsg.date;
        long j2 = 259200000;
        if (tpnsPushMsg.ttl > 0) {
            j2 = ((long) tpnsPushMsg.ttl) * 1000;
        } else if (tpnsPushMsg.msgId > 0 && tpnsPushMsg.ttl == 0) {
            j2 = StatisticConfig.MIN_UPLOAD_INTERVAL;
        }
        if (tpnsPushMsg.serverTime <= 0 || tpnsPushMsg.timestamp <= 0) {
            j2 += currentTimeMillis;
        } else {
            j2 += ((tpnsPushMsg.serverTime - tpnsPushMsg.timestamp) * 1000) + currentTimeMillis;
        }
        com.tencent.android.tpush.p067a.ProGuard.m4723h("confirmMs", ">> msg distribute @msgId=" + messageId.id + " @accId=" + messageId.accessId + " @timeUs=" + j + " @recTime=" + messageId.receivedTime + " @msg.date=" + tpnsPushMsg.date + " @msg.busiMsgId=" + tpnsPushMsg.busiMsgId + " @msg.timestamp=" + tpnsPushMsg.timestamp + " @msg.type=" + tpnsPushMsg.type + " @msg.multiPkg=" + tpnsPushMsg.multiPkg + " @msg.serverTime=" + tpnsPushMsg.serverTime + " @msg.ttl=" + tpnsPushMsg.ttl + " @expire_time=" + j2 + " @currentTimeMillis=" + currentTimeMillis);
        Intent intent = new Intent(Constants.ACTION_INTERNAL_PUSH_MESSAGE);
        intent.setPackage(tpnsPushMsg.appPkgName);
        intent.putExtra(MessageKey.MSG_ID, tpnsPushMsg.msgId);
        intent.putExtra(MessageKey.MSG_TITLE, Rijndael.encrypt(tpnsPushMsg.title));
        intent.putExtra(MessageKey.MSG_CONTENT, Rijndael.encrypt(tpnsPushMsg.content));
        intent.putExtra(MessageKey.MSG_DATE, tpnsPushMsg.date);
        intent.putExtra(MessageKey.MSG_TYPE, tpnsPushMsg.type);
        intent.putExtra(MessageKey.MSG_ACCESS_ID, tpnsPushMsg.accessId);
        intent.putExtra(MessageKey.MSG_BUSI_MSG_ID, tpnsPushMsg.busiMsgId);
        intent.putExtra(MessageKey.MSG_CREATE_TIMESTAMPS, tpnsPushMsg.timestamp);
        intent.putExtra(MessageKey.MSG_CREATE_MULTIPKG, tpnsPushMsg.multiPkg);
        intent.putExtra(MessageKey.MSG_SERVER_TIME, tpnsPushMsg.serverTime * 1000);
        intent.putExtra(MessageKey.MSG_TIME_GAP, currentTimeMillis - (tpnsPushMsg.serverTime * 1000));
        intent.putExtra(MessageKey.MSG_TTL, tpnsPushMsg.ttl * PointerIconCompat.TYPE_DEFAULT);
        intent.putExtra(MessageKey.MSG_EXPIRE_TIME, j2);
        intent.putExtra(MessageKey.MSG_SERVICE_ACK, true);
        intent.putExtra(MessageKey.MSG_SERVICE_PACKAGE_NAME, com.tencent.android.tpush.service.ProGuard.m5377f());
        try {
            intent.putExtra("enKeySet", com.tencent.android.tpush.common.ProGuard.m4805a(new String[]{MessageKey.MSG_TITLE, MessageKey.MSG_CONTENT}));
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "distribute2SDK", e);
        }
        m5024a(intent, tpnsPushMsg.appPkgName, messageId);
    }

    public void m5057a(ArrayList arrayList, long j, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        m5066b(arrayList, j, proGuard);
    }

    public void m5050a(Context context, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt;
            switch (jSONObject.optInt(MessageKey.MSG_ACTION, 2)) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    for (String valueOf : jSONObject.optString("pushIdList", LetterIndexBar.SEARCH_ICON_LETTER).split(",")) {
                        m5045a(context, str, Long.valueOf(valueOf).longValue());
                    }
                    return;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    m5074d(context, str);
                    return;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    optInt = jSONObject.optInt("enabled", -1);
                    com.tencent.android.tpush.p067a.ProGuard.m4720e("MessageManager", "setLogToFile with cmd = " + optInt);
                    com.tencent.android.tpush.p067a.ProGuard.m4699a(optInt);
                    return;
                default:
                    return;
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "onCrtlMsgHandle", e);
        }
        com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "onCrtlMsgHandle", e);
    }

    public void m5055a(TpnsPushMsg tpnsPushMsg) {
        String str = tpnsPushMsg.appPkgName;
        if (tpnsPushMsg.multiPkg == 1) {
            com.tencent.android.tpush.data.ProGuard registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str);
            if (!(registerInfoByPkgName == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(registerInfoByPkgName.f7422d))) {
                str = registerInfoByPkgName.f7422d;
            }
        }
        m5050a(com.tencent.android.tpush.service.ProGuard.m5376e(), str, tpnsPushMsg.content);
    }

    public void m5066b(ArrayList arrayList, long j, com.tencent.android.tpush.service.channel.ProGuard proGuard) {
        if (!(com.tencent.android.tpush.service.ProGuard.m5376e() == null || arrayList == null || arrayList.size() <= 0)) {
            com.tencent.android.tpush.p067a.ProGuard.m4709b(0, (List) arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TpnsPushMsg tpnsPushMsg = (TpnsPushMsg) it.next();
                com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", "distributeFromServer : accid=" + tpnsPushMsg.accessId + ",busiId=" + tpnsPushMsg.busiMsgId + ",pkg=" + tpnsPushMsg.appPkgName + ",msgId=" + tpnsPushMsg.msgId + ",type=" + tpnsPushMsg.type + ",ts=" + tpnsPushMsg.timestamp + ",multi=" + tpnsPushMsg.multiPkg + ",date=" + tpnsPushMsg.date + ",serverTime=" + tpnsPushMsg.serverTime + ",ttl=" + tpnsPushMsg.ttl);
                m5044a(com.tencent.android.tpush.service.ProGuard.m5376e(), tpnsPushMsg, j, proGuard);
                if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(tpnsPushMsg.appPkgName)) {
                    com.tencent.android.tpush.p067a.ProGuard.m4715c("MessageManager", ">> messageDistribute, msg.appPkgName is null!");
                } else {
                    if (tpnsPushMsg.type == 3) {
                        m5055a(tpnsPushMsg);
                    }
                    if (tpnsPushMsg.timestamp > 0) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        currentTimeMillis = (currentTimeMillis - (currentTimeMillis - tpnsPushMsg.serverTime)) - tpnsPushMsg.timestamp;
                        if (tpnsPushMsg.msgId >= 0 && tpnsPushMsg.ttl > 0 && ((long) tpnsPushMsg.ttl) < currentTimeMillis) {
                            com.tencent.android.tpush.p067a.ProGuard.m4723h("MessageManager", "messageDistribute check server time failed, msg discarded cause msg is timeout, msg.ttl:" + tpnsPushMsg.ttl + "<reviseMaxTimeoutSec:" + currentTimeMillis);
                        }
                    }
                    m5028a(tpnsPushMsg, j, proGuard);
                }
            }
        }
        com.tencent.android.tpush.service.p073c.ProGuard.m5104a(arrayList);
    }

    private synchronized void m5031b() {
        if (com.tencent.android.tpush.service.channel.ProGuard.m5199a().m5221b(true) > 0) {
            m5034c();
        }
    }

    private void m5034c() {
        if (this.f7554h == null) {
            com.tencent.android.tpush.service.ProGuard.m5376e().registerReceiver(new ProGuard(this), new IntentFilter("com.tencent.android.tpush.service.channel.cacheMsgBeatIntent"));
            this.f7554h = PendingIntent.getBroadcast(com.tencent.android.tpush.service.ProGuard.m5376e(), 0, new Intent("com.tencent.android.tpush.service.channel.cacheMsgBeatIntent"), 134217728);
        }
        com.tencent.android.tpush.service.ProGuard.m5418a().m5420a(0, System.currentTimeMillis() + f7547a, this.f7554h);
    }

    private void m5023a(Context context, String str, String str2, ArrayList arrayList) {
        try {
            if (arrayList.size() > 50) {
                arrayList.subList(0, 10).clear();
            }
            String encrypt = Rijndael.encrypt(com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) arrayList));
            if (str2.equals(".tpns.msg.id.cached")) {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, str + str2, encrypt, false);
            } else {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, str + str2, encrypt, true);
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "putSettings", e);
        }
    }

    private Object m5030b(Context context, String str, String str2) {
        try {
            String a;
            if (str2.equals(".tpns.msg.id.cached")) {
                a = com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, str + str2, false);
            } else {
                a = com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, str + str2, true);
            }
            return com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(a));
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("MessageManager", "getSettings", e);
            return null;
        }
    }

    public void m5054a(Intent intent) {
        com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ProGuard(this, intent));
    }
}
