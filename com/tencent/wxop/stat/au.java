package com.tencent.wxop.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.download.Downloads;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.wxop.stat.common.C0629a;
import com.tencent.wxop.stat.common.C0633e;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.p069a.C0613e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class au {
    private static StatLogger f1947h;
    private static Context f1948i;
    private static au f1949j;
    volatile int f1950a;
    C0629a f1951b;
    private bc f1952c;
    private bc f1953d;
    private C0633e f1954e;
    private String f1955f;
    private String f1956g;
    private int f1957k;
    private ConcurrentHashMap<C0613e, String> f1958l;
    private boolean f1959m;
    private HashMap<String, String> f1960n;

    static {
        f1947h = C0639k.m2401b();
        f1948i = null;
        f1949j = null;
    }

    private au(Context context) {
        this.f1952c = null;
        this.f1953d = null;
        this.f1954e = null;
        this.f1955f = Constants.STR_EMPTY;
        this.f1956g = Constants.STR_EMPTY;
        this.f1950a = 0;
        this.f1951b = null;
        this.f1957k = 0;
        this.f1958l = null;
        this.f1959m = false;
        this.f1960n = new HashMap();
        try {
            this.f1954e = new C0633e();
            f1948i = context.getApplicationContext();
            this.f1958l = new ConcurrentHashMap();
            this.f1955f = C0639k.m2425r(context);
            this.f1956g = "pri_" + C0639k.m2425r(context);
            this.f1952c = new bc(f1948i, this.f1955f);
            this.f1953d = new bc(f1948i, this.f1956g);
            m2329a(true);
            m2329a(false);
            m2339f();
            m2350b(f1948i);
            m2352d();
            m2343j();
        } catch (Throwable th) {
            f1947h.m2360e(th);
        }
    }

    public static au m2317a(Context context) {
        if (f1949j == null) {
            synchronized (au.class) {
                if (f1949j == null) {
                    f1949j = new au(context);
                }
            }
        }
        return f1949j;
    }

    private String m2318a(List<bd> list) {
        StringBuilder stringBuilder = new StringBuilder(list.size() * 3);
        stringBuilder.append("event_id in (");
        int size = list.size();
        int i = 0;
        for (bd bdVar : list) {
            stringBuilder.append(bdVar.f1986a);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
            i++;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private synchronized void m2319a(int i, boolean z) {
        try {
            if (this.f1950a > 0 && i > 0 && !StatServiceImpl.m2230a()) {
                if (StatConfig.isDebugEnable()) {
                    f1947h.m2361i("Load " + this.f1950a + " unsent events");
                }
                List arrayList = new ArrayList(i);
                m2335b(arrayList, i, z);
                if (arrayList.size() > 0) {
                    if (StatConfig.isDebugEnable()) {
                        f1947h.m2361i("Peek " + arrayList.size() + " unsent events.");
                    }
                    m2327a(arrayList, 2, z);
                    C0651i.m2471b(f1948i).m2474b(arrayList, new ba(this, arrayList, z));
                }
            }
        } catch (Throwable th) {
            f1947h.m2360e(th);
        }
    }

    private void m2320a(C0613e c0613e, C0626h c0626h, boolean z) {
        long insert;
        long j;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = m2336c(z);
            sQLiteDatabase.beginTransaction();
            if (!z && this.f1950a > StatConfig.getMaxStoreEventCount()) {
                f1947h.warn("Too many events stored in db.");
                this.f1950a -= this.f1952c.getWritableDatabase().delete("events", "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)", null);
            }
            ContentValues contentValues = new ContentValues();
            String g = c0613e.m2258g();
            if (StatConfig.isDebugEnable()) {
                f1947h.m2361i("insert 1 event, content:" + g);
            }
            contentValues.put("content", C0645q.m2452b(g));
            contentValues.put("send_count", Constants.VIA_RESULT_SUCCESS);
            contentValues.put(Downloads.COLUMN_STATUS, Integer.toString(1));
            contentValues.put("timestamp", Long.valueOf(c0613e.m2254c()));
            insert = sQLiteDatabase.insert("events", null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                    j = insert;
                } catch (Throwable th) {
                    f1947h.m2360e(th);
                    j = insert;
                }
                if (j <= 0) {
                    this.f1950a++;
                    if (StatConfig.isDebugEnable()) {
                        f1947h.m2358d("directStoreEvent insert event to db, event:" + c0613e.m2258g());
                    }
                    if (c0626h != null) {
                        c0626h.m2309a();
                    }
                }
                f1947h.error("Failed to store event:" + c0613e.m2258g());
                return;
            }
        } catch (Throwable th2) {
            f1947h.m2360e(th2);
            j = -1;
        }
        j = insert;
        if (j <= 0) {
            f1947h.error("Failed to store event:" + c0613e.m2258g());
            return;
        }
        this.f1950a++;
        if (StatConfig.isDebugEnable()) {
            f1947h.m2358d("directStoreEvent insert event to db, event:" + c0613e.m2258g());
        }
        if (c0626h != null) {
            c0626h.m2309a();
        }
    }

    private synchronized void m2327a(List<bd> list, int i, boolean z) {
        Throwable th;
        String str = null;
        synchronized (this) {
            if (list.size() != 0) {
                int b = m2330b(z);
                SQLiteDatabase c;
                try {
                    String str2;
                    c = m2336c(z);
                    if (i == 2) {
                        try {
                            str2 = "update events set status=" + i + ", send_count=send_count+1  where " + m2318a((List) list);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                f1947h.m2360e(th);
                                if (c != null) {
                                    try {
                                        c.endTransaction();
                                    } catch (Throwable th3) {
                                        f1947h.m2360e(th3);
                                    }
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                if (c != null) {
                                    try {
                                        c.endTransaction();
                                    } catch (Throwable th5) {
                                        f1947h.m2360e(th5);
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    str2 = "update events set status=" + i + " where " + m2318a((List) list);
                    if (this.f1957k % 3 == 0) {
                        str = "delete from events where send_count>" + b;
                    }
                    this.f1957k++;
                    if (StatConfig.isDebugEnable()) {
                        f1947h.m2361i("update sql:" + str2);
                    }
                    c.beginTransaction();
                    c.execSQL(str2);
                    if (str != null) {
                        f1947h.m2361i("update for delete sql:" + str);
                        c.execSQL(str);
                        m2339f();
                    }
                    c.setTransactionSuccessful();
                    if (c != null) {
                        try {
                            c.endTransaction();
                        } catch (Throwable th32) {
                            f1947h.m2360e(th32);
                        }
                    }
                } catch (Throwable th6) {
                    th32 = th6;
                    c = null;
                    if (c != null) {
                        c.endTransaction();
                    }
                    throw th32;
                }
            }
        }
    }

    private synchronized void m2328a(java.util.List<com.tencent.wxop.stat.bd> r9, boolean r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.tencent.wxop.stat.au.a(java.util.List, boolean):void. bs: [B:26:0x00c1, B:49:0x00e9]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r8 = this;
        r1 = 0;
        monitor-enter(r8);
        r0 = r9.size();	 Catch:{ all -> 0x00ce }
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r8);
        return;
    L_0x000a:
        r0 = com.tencent.wxop.stat.StatConfig.isDebugEnable();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0032;	 Catch:{ all -> 0x00ce }
    L_0x0010:
        r0 = f1947h;	 Catch:{ all -> 0x00ce }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ce }
        r3 = "Delete ";	 Catch:{ all -> 0x00ce }
        r2.<init>(r3);	 Catch:{ all -> 0x00ce }
        r3 = r9.size();	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00ce }
        r3 = " events, important:";	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r10);	 Catch:{ all -> 0x00ce }
        r2 = r2.toString();	 Catch:{ all -> 0x00ce }
        r0.m2361i(r2);	 Catch:{ all -> 0x00ce }
    L_0x0032:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ce }
        r0 = r9.size();	 Catch:{ all -> 0x00ce }
        r0 = r0 * 3;	 Catch:{ all -> 0x00ce }
        r3.<init>(r0);	 Catch:{ all -> 0x00ce }
        r0 = "event_id in (";	 Catch:{ all -> 0x00ce }
        r3.append(r0);	 Catch:{ all -> 0x00ce }
        r0 = 0;	 Catch:{ all -> 0x00ce }
        r4 = r9.size();	 Catch:{ all -> 0x00ce }
        r5 = r9.iterator();	 Catch:{ all -> 0x00ce }
        r2 = r0;	 Catch:{ all -> 0x00ce }
    L_0x004c:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x006a;	 Catch:{ all -> 0x00ce }
    L_0x0052:
        r0 = r5.next();	 Catch:{ all -> 0x00ce }
        r0 = (com.tencent.wxop.stat.bd) r0;	 Catch:{ all -> 0x00ce }
        r6 = r0.f1986a;	 Catch:{ all -> 0x00ce }
        r3.append(r6);	 Catch:{ all -> 0x00ce }
        r0 = r4 + -1;	 Catch:{ all -> 0x00ce }
        if (r2 == r0) goto L_0x0066;	 Catch:{ all -> 0x00ce }
    L_0x0061:
        r0 = ",";	 Catch:{ all -> 0x00ce }
        r3.append(r0);	 Catch:{ all -> 0x00ce }
    L_0x0066:
        r0 = r2 + 1;	 Catch:{ all -> 0x00ce }
        r2 = r0;	 Catch:{ all -> 0x00ce }
        goto L_0x004c;	 Catch:{ all -> 0x00ce }
    L_0x006a:
        r0 = ")";	 Catch:{ all -> 0x00ce }
        r3.append(r0);	 Catch:{ all -> 0x00ce }
        r1 = r8.m2336c(r10);	 Catch:{ Throwable -> 0x00d1 }
        r1.beginTransaction();	 Catch:{ Throwable -> 0x00d1 }
        r0 = "events";	 Catch:{ Throwable -> 0x00d1 }
        r2 = r3.toString();	 Catch:{ Throwable -> 0x00d1 }
        r5 = 0;	 Catch:{ Throwable -> 0x00d1 }
        r0 = r1.delete(r0, r2, r5);	 Catch:{ Throwable -> 0x00d1 }
        r2 = com.tencent.wxop.stat.StatConfig.isDebugEnable();	 Catch:{ Throwable -> 0x00d1 }
        if (r2 == 0) goto L_0x00b3;	 Catch:{ Throwable -> 0x00d1 }
    L_0x0087:
        r2 = f1947h;	 Catch:{ Throwable -> 0x00d1 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00d1 }
        r6 = "delete ";	 Catch:{ Throwable -> 0x00d1 }
        r5.<init>(r6);	 Catch:{ Throwable -> 0x00d1 }
        r4 = r5.append(r4);	 Catch:{ Throwable -> 0x00d1 }
        r5 = " event ";	 Catch:{ Throwable -> 0x00d1 }
        r4 = r4.append(r5);	 Catch:{ Throwable -> 0x00d1 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x00d1 }
        r3 = r4.append(r3);	 Catch:{ Throwable -> 0x00d1 }
        r4 = ", success delete:";	 Catch:{ Throwable -> 0x00d1 }
        r3 = r3.append(r4);	 Catch:{ Throwable -> 0x00d1 }
        r3 = r3.append(r0);	 Catch:{ Throwable -> 0x00d1 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x00d1 }
        r2.m2361i(r3);	 Catch:{ Throwable -> 0x00d1 }
    L_0x00b3:
        r2 = r8.f1950a;	 Catch:{ Throwable -> 0x00d1 }
        r0 = r2 - r0;	 Catch:{ Throwable -> 0x00d1 }
        r8.f1950a = r0;	 Catch:{ Throwable -> 0x00d1 }
        r1.setTransactionSuccessful();	 Catch:{ Throwable -> 0x00d1 }
        r8.m2339f();	 Catch:{ Throwable -> 0x00d1 }
        if (r1 == 0) goto L_0x0008;
    L_0x00c1:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00c6 }
        goto L_0x0008;
    L_0x00c6:
        r0 = move-exception;
        r1 = f1947h;	 Catch:{ all -> 0x00ce }
        r1.m2360e(r0);	 Catch:{ all -> 0x00ce }
        goto L_0x0008;
    L_0x00ce:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        r2 = f1947h;	 Catch:{ all -> 0x00e6 }
        r2.m2360e(r0);	 Catch:{ all -> 0x00e6 }
        if (r1 == 0) goto L_0x0008;
    L_0x00d9:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00de }
        goto L_0x0008;
    L_0x00de:
        r0 = move-exception;
        r1 = f1947h;	 Catch:{ all -> 0x00ce }
        r1.m2360e(r0);	 Catch:{ all -> 0x00ce }
        goto L_0x0008;
    L_0x00e6:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00ec;
    L_0x00e9:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00ed }
    L_0x00ec:
        throw r0;	 Catch:{ all -> 0x00ce }
    L_0x00ed:
        r1 = move-exception;	 Catch:{ all -> 0x00ce }
        r2 = f1947h;	 Catch:{ all -> 0x00ce }
        r2.m2360e(r1);	 Catch:{ all -> 0x00ce }
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.au.a(java.util.List, boolean):void");
    }

    private void m2329a(boolean z) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = m2336c(z);
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(1));
            int update = sQLiteDatabase.update("events", contentValues, "status=?", new String[]{Long.toString(2)});
            if (StatConfig.isDebugEnable()) {
                f1947h.m2361i("update " + update + " unsent events.");
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    f1947h.m2360e(th);
                }
            }
        } catch (Throwable th2) {
            f1947h.m2360e(th2);
        }
    }

    private int m2330b(boolean z) {
        return !z ? StatConfig.getMaxSendRetryCount() : StatConfig.getMaxImportantDataSendRetryCount();
    }

    public static au m2331b() {
        return f1949j;
    }

    private void m2332b(int i, boolean z) {
        int g = i == -1 ? !z ? m2340g() : m2341h() : i;
        if (g > 0) {
            int sendPeriodMinutes = (StatConfig.getSendPeriodMinutes() * 60) * StatConfig.getNumEventsCommitPerSec();
            if (g > sendPeriodMinutes && sendPeriodMinutes > 0) {
                g = sendPeriodMinutes;
            }
            int a = StatConfig.m2204a();
            int i2 = g / a;
            int i3 = g % a;
            if (StatConfig.isDebugEnable()) {
                f1947h.m2361i("sentStoreEventsByDb sendNumbers=" + g + ",important=" + z + ",maxSendNumPerFor1Period=" + sendPeriodMinutes + ",maxCount=" + i2 + ",restNumbers=" + i3);
            }
            for (g = 0; g < i2; g++) {
                m2319a(a, z);
            }
            if (i3 > 0) {
                m2319a(i3, z);
            }
        }
    }

    private synchronized void m2333b(C0613e c0613e, C0626h c0626h, boolean z, boolean z2) {
        if (StatConfig.getMaxStoreEventCount() > 0) {
            if (StatConfig.f1804m <= 0 || z || z2) {
                m2320a(c0613e, c0626h, z);
            } else if (StatConfig.f1804m > 0) {
                if (StatConfig.isDebugEnable()) {
                    f1947h.m2361i("cacheEventsInMemory.size():" + this.f1958l.size() + ",numEventsCachedInMemory:" + StatConfig.f1804m + ",numStoredEvents:" + this.f1950a);
                    f1947h.m2361i("cache event:" + c0613e.m2258g());
                }
                this.f1958l.put(c0613e, Constants.STR_EMPTY);
                if (this.f1958l.size() >= StatConfig.f1804m) {
                    m2342i();
                }
                if (c0626h != null) {
                    if (this.f1958l.size() > 0) {
                        m2342i();
                    }
                    c0626h.m2309a();
                }
            }
        }
    }

    private synchronized void m2334b(C0649f c0649f) {
        Throwable th;
        Cursor query;
        try {
            Object obj;
            long update;
            String a = c0649f.m2462a();
            String a2 = C0639k.m2395a(a);
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", c0649f.f2076b.toString());
            contentValues.put("md5sum", a2);
            c0649f.f2077c = a2;
            contentValues.put("version", Integer.valueOf(c0649f.f2078d));
            query = this.f1952c.getReadableDatabase().query("config", null, null, null, null, null, null);
            do {
                try {
                    if (!query.moveToNext()) {
                        obj = null;
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (query.getInt(0) != c0649f.f2075a);
            obj = 1;
            this.f1952c.getWritableDatabase().beginTransaction();
            if (1 == obj) {
                update = (long) this.f1952c.getWritableDatabase().update("config", contentValues, "type=?", new String[]{Integer.toString(c0649f.f2075a)});
            } else {
                contentValues.put(SocialConstants.PARAM_TYPE, Integer.valueOf(c0649f.f2075a));
                update = this.f1952c.getWritableDatabase().insert("config", null, contentValues);
            }
            if (update == -1) {
                f1947h.m2359e("Failed to store cfg:" + a);
            } else {
                f1947h.m2358d("Sucessed to store cfg:" + a);
            }
            this.f1952c.getWritableDatabase().setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            try {
                this.f1952c.getWritableDatabase().endTransaction();
            } catch (Exception e) {
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            this.f1952c.getWritableDatabase().endTransaction();
            throw th;
        }
    }

    private void m2335b(List<bd> list, int i, boolean z) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        try {
            query = m2337d(z).query("events", null, "status=?", new String[]{Integer.toString(1)}, null, null, null, Integer.toString(i));
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    if (!StatConfig.f1798g) {
                        string = C0645q.m2447a(string);
                    }
                    int i2 = query.getInt(2);
                    int i3 = query.getInt(3);
                    bd bdVar = new bd(j, string, i2, i3);
                    if (StatConfig.isDebugEnable()) {
                        f1947h.m2361i("peek event, id=" + j + ",send_count=" + i3 + ",timestamp=" + query.getLong(4));
                    }
                    list.add(bdVar);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    private SQLiteDatabase m2336c(boolean z) {
        return !z ? this.f1952c.getWritableDatabase() : this.f1953d.getWritableDatabase();
    }

    private SQLiteDatabase m2337d(boolean z) {
        return !z ? this.f1952c.getReadableDatabase() : this.f1953d.getReadableDatabase();
    }

    private void m2339f() {
        this.f1950a = m2340g() + m2341h();
    }

    private int m2340g() {
        return (int) DatabaseUtils.queryNumEntries(this.f1952c.getReadableDatabase(), "events");
    }

    private int m2341h() {
        return (int) DatabaseUtils.queryNumEntries(this.f1953d.getReadableDatabase(), "events");
    }

    private void m2342i() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.tencent.wxop.stat.au.i():void. bs: [B:42:0x011b, B:53:0x0133]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r9 = this;
        r1 = 0;
        r0 = r9.f1959m;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2 = r9.f1958l;
        monitor-enter(r2);
        r0 = r9.f1958l;	 Catch:{ all -> 0x0013 }
        r0 = r0.size();	 Catch:{ all -> 0x0013 }
        if (r0 != 0) goto L_0x0016;	 Catch:{ all -> 0x0013 }
    L_0x0011:
        monitor-exit(r2);	 Catch:{ all -> 0x0013 }
        goto L_0x0005;	 Catch:{ all -> 0x0013 }
    L_0x0013:
        r0 = move-exception;	 Catch:{ all -> 0x0013 }
        monitor-exit(r2);	 Catch:{ all -> 0x0013 }
        throw r0;
    L_0x0016:
        r0 = 1;
        r9.f1959m = r0;	 Catch:{ all -> 0x0013 }
        r0 = com.tencent.wxop.stat.StatConfig.isDebugEnable();	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ all -> 0x0013 }
    L_0x001f:
        r0 = f1947h;	 Catch:{ all -> 0x0013 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0013 }
        r4 = "insert ";	 Catch:{ all -> 0x0013 }
        r3.<init>(r4);	 Catch:{ all -> 0x0013 }
        r4 = r9.f1958l;	 Catch:{ all -> 0x0013 }
        r4 = r4.size();	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = " events ,numEventsCachedInMemory:";	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = com.tencent.wxop.stat.StatConfig.f1804m;	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = ",numStoredEvents:";	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = r9.f1950a;	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r3 = r3.toString();	 Catch:{ all -> 0x0013 }
        r0.m2361i(r3);	 Catch:{ all -> 0x0013 }
    L_0x0051:
        r0 = r9.f1952c;	 Catch:{ Throwable -> 0x00ca }
        r1 = r0.getWritableDatabase();	 Catch:{ Throwable -> 0x00ca }
        r1.beginTransaction();	 Catch:{ Throwable -> 0x00ca }
        r0 = r9.f1958l;	 Catch:{ Throwable -> 0x00ca }
        r0 = r0.entrySet();	 Catch:{ Throwable -> 0x00ca }
        r3 = r0.iterator();	 Catch:{ Throwable -> 0x00ca }
    L_0x0064:
        r0 = r3.hasNext();	 Catch:{ Throwable -> 0x00ca }
        if (r0 == 0) goto L_0x0116;	 Catch:{ Throwable -> 0x00ca }
    L_0x006a:
        r0 = r3.next();	 Catch:{ Throwable -> 0x00ca }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ Throwable -> 0x00ca }
        r0 = r0.getKey();	 Catch:{ Throwable -> 0x00ca }
        r0 = (com.tencent.wxop.stat.p069a.C0613e) r0;	 Catch:{ Throwable -> 0x00ca }
        r4 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x00ca }
        r4.<init>();	 Catch:{ Throwable -> 0x00ca }
        r5 = r0.m2258g();	 Catch:{ Throwable -> 0x00ca }
        r6 = com.tencent.wxop.stat.StatConfig.isDebugEnable();	 Catch:{ Throwable -> 0x00ca }
        if (r6 == 0) goto L_0x0099;	 Catch:{ Throwable -> 0x00ca }
    L_0x0085:
        r6 = f1947h;	 Catch:{ Throwable -> 0x00ca }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ca }
        r8 = "insert content:";	 Catch:{ Throwable -> 0x00ca }
        r7.<init>(r8);	 Catch:{ Throwable -> 0x00ca }
        r7 = r7.append(r5);	 Catch:{ Throwable -> 0x00ca }
        r7 = r7.toString();	 Catch:{ Throwable -> 0x00ca }
        r6.m2361i(r7);	 Catch:{ Throwable -> 0x00ca }
    L_0x0099:
        r5 = com.tencent.wxop.stat.common.C0645q.m2452b(r5);	 Catch:{ Throwable -> 0x00ca }
        r6 = "content";	 Catch:{ Throwable -> 0x00ca }
        r4.put(r6, r5);	 Catch:{ Throwable -> 0x00ca }
        r5 = "send_count";	 Catch:{ Throwable -> 0x00ca }
        r6 = "0";	 Catch:{ Throwable -> 0x00ca }
        r4.put(r5, r6);	 Catch:{ Throwable -> 0x00ca }
        r5 = "status";	 Catch:{ Throwable -> 0x00ca }
        r6 = 1;	 Catch:{ Throwable -> 0x00ca }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ Throwable -> 0x00ca }
        r4.put(r5, r6);	 Catch:{ Throwable -> 0x00ca }
        r5 = "timestamp";	 Catch:{ Throwable -> 0x00ca }
        r6 = r0.m2254c();	 Catch:{ Throwable -> 0x00ca }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x00ca }
        r4.put(r5, r0);	 Catch:{ Throwable -> 0x00ca }
        r0 = "events";	 Catch:{ Throwable -> 0x00ca }
        r5 = 0;	 Catch:{ Throwable -> 0x00ca }
        r1.insert(r0, r5, r4);	 Catch:{ Throwable -> 0x00ca }
        r3.remove();	 Catch:{ Throwable -> 0x00ca }
        goto L_0x0064;
    L_0x00ca:
        r0 = move-exception;
        r3 = f1947h;	 Catch:{ all -> 0x0130 }
        r3.m2360e(r0);	 Catch:{ all -> 0x0130 }
        if (r1 == 0) goto L_0x00d8;
    L_0x00d2:
        r1.endTransaction();	 Catch:{ Throwable -> 0x0129 }
        r9.m2339f();	 Catch:{ Throwable -> 0x0129 }
    L_0x00d8:
        r0 = 0;
        r9.f1959m = r0;	 Catch:{ all -> 0x0013 }
        r0 = com.tencent.wxop.stat.StatConfig.isDebugEnable();	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0113;	 Catch:{ all -> 0x0013 }
    L_0x00e1:
        r0 = f1947h;	 Catch:{ all -> 0x0013 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0013 }
        r3 = "after insert, cacheEventsInMemory.size():";	 Catch:{ all -> 0x0013 }
        r1.<init>(r3);	 Catch:{ all -> 0x0013 }
        r3 = r9.f1958l;	 Catch:{ all -> 0x0013 }
        r3 = r3.size();	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = ",numEventsCachedInMemory:";	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = com.tencent.wxop.stat.StatConfig.f1804m;	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = ",numStoredEvents:";	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = r9.f1950a;	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r1 = r1.toString();	 Catch:{ all -> 0x0013 }
        r0.m2361i(r1);	 Catch:{ all -> 0x0013 }
    L_0x0113:
        monitor-exit(r2);	 Catch:{ all -> 0x0013 }
        goto L_0x0005;
    L_0x0116:
        r1.setTransactionSuccessful();	 Catch:{ Throwable -> 0x00ca }
        if (r1 == 0) goto L_0x00d8;
    L_0x011b:
        r1.endTransaction();	 Catch:{ Throwable -> 0x0122 }
        r9.m2339f();	 Catch:{ Throwable -> 0x0122 }
        goto L_0x00d8;
    L_0x0122:
        r0 = move-exception;
        r1 = f1947h;	 Catch:{ all -> 0x0013 }
        r1.m2360e(r0);	 Catch:{ all -> 0x0013 }
        goto L_0x00d8;	 Catch:{ all -> 0x0013 }
    L_0x0129:
        r0 = move-exception;	 Catch:{ all -> 0x0013 }
        r1 = f1947h;	 Catch:{ all -> 0x0013 }
        r1.m2360e(r0);	 Catch:{ all -> 0x0013 }
        goto L_0x00d8;
    L_0x0130:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0139;
    L_0x0133:
        r1.endTransaction();	 Catch:{ Throwable -> 0x013a }
        r9.m2339f();	 Catch:{ Throwable -> 0x013a }
    L_0x0139:
        throw r0;	 Catch:{ all -> 0x0013 }
    L_0x013a:
        r1 = move-exception;	 Catch:{ all -> 0x0013 }
        r3 = f1947h;	 Catch:{ all -> 0x0013 }
        r3.m2360e(r1);	 Catch:{ all -> 0x0013 }
        goto L_0x0139;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.au.i():void");
    }

    private void m2343j() {
        Throwable th;
        Cursor query;
        try {
            query = this.f1952c.getReadableDatabase().query("keyvalues", null, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    this.f1960n.put(query.getString(0), query.getString(1));
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public int m2344a() {
        return this.f1950a;
    }

    void m2345a(int i) {
        this.f1954e.m2373a(new bb(this, i));
    }

    void m2346a(C0613e c0613e, C0626h c0626h, boolean z, boolean z2) {
        if (this.f1954e != null) {
            this.f1954e.m2373a(new ay(this, c0613e, c0626h, z, z2));
        }
    }

    void m2347a(C0649f c0649f) {
        if (c0649f != null) {
            this.f1954e.m2373a(new az(this, c0649f));
        }
    }

    void m2348a(List<bd> list, int i, boolean z, boolean z2) {
        if (this.f1954e != null) {
            this.f1954e.m2373a(new av(this, list, i, z, z2));
        }
    }

    void m2349a(List<bd> list, boolean z, boolean z2) {
        if (this.f1954e != null) {
            this.f1954e.m2373a(new aw(this, list, z, z2));
        }
    }

    public synchronized C0629a m2350b(Context context) {
        C0629a c0629a;
        Throwable th;
        Cursor cursor;
        if (this.f1951b != null) {
            c0629a = this.f1951b;
        } else {
            Cursor query;
            try {
                this.f1952c.getWritableDatabase().beginTransaction();
                if (StatConfig.isDebugEnable()) {
                    f1947h.m2361i("try to load user info from db.");
                }
                query = this.f1952c.getReadableDatabase().query("user", null, null, null, null, null, null, null);
                Object obj = null;
                try {
                    String string;
                    String b;
                    if (query.moveToNext()) {
                        String a = C0645q.m2447a(query.getString(0));
                        int i = query.getInt(1);
                        string = query.getString(2);
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        int i2 = (i == 1 || C0639k.m2393a(query.getLong(3) * 1000).equals(C0639k.m2393a(1000 * currentTimeMillis))) ? i : 1;
                        int i3 = !string.equals(C0639k.m2421n(context)) ? i2 | 2 : i2;
                        String[] split = a.split(",");
                        obj = null;
                        if (split == null || split.length <= 0) {
                            b = C0639k.m2402b(context);
                            obj = 1;
                            a = b;
                        } else {
                            b = split[0];
                            if (b == null || b.length() < 11) {
                                string = C0645q.m2446a(context);
                                if (string == null || string.length() <= 10) {
                                    string = b;
                                } else {
                                    obj = 1;
                                }
                                b = a;
                                a = string;
                            } else {
                                String str = b;
                                b = a;
                                a = str;
                            }
                        }
                        if (split == null || split.length < 2) {
                            string = C0639k.m2404c(context);
                            if (string != null && string.length() > 0) {
                                b = a + "," + string;
                                obj = 1;
                            }
                        } else {
                            string = split[1];
                            b = a + "," + string;
                        }
                        this.f1951b = new C0629a(a, string, i3);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("uid", C0645q.m2452b(b));
                        contentValues.put("user_type", Integer.valueOf(i3));
                        contentValues.put("app_ver", C0639k.m2421n(context));
                        contentValues.put("ts", Long.valueOf(currentTimeMillis));
                        if (obj != null) {
                            this.f1952c.getWritableDatabase().update("user", contentValues, "uid=?", new String[]{r10});
                        }
                        if (i3 != i) {
                            this.f1952c.getWritableDatabase().replace("user", null, contentValues);
                        }
                        obj = 1;
                    }
                    if (obj == null) {
                        string = C0639k.m2402b(context);
                        b = C0639k.m2404c(context);
                        String str2 = (b == null || b.length() <= 0) ? string : string + "," + b;
                        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                        String n = C0639k.m2421n(context);
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("uid", C0645q.m2452b(str2));
                        contentValues2.put("user_type", Integer.valueOf(0));
                        contentValues2.put("app_ver", n);
                        contentValues2.put("ts", Long.valueOf(currentTimeMillis2));
                        this.f1952c.getWritableDatabase().insert("user", null, contentValues2);
                        this.f1951b = new C0629a(string, b, 0);
                    }
                    this.f1952c.getWritableDatabase().setTransactionSuccessful();
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            f1947h.m2360e(th2);
                        }
                    }
                    this.f1952c.getWritableDatabase().endTransaction();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (query != null) {
                        query.close();
                    }
                    this.f1952c.getWritableDatabase().endTransaction();
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                query = null;
                if (query != null) {
                    query.close();
                }
                this.f1952c.getWritableDatabase().endTransaction();
                throw th2;
            }
            c0629a = this.f1951b;
        }
        return c0629a;
    }

    void m2351c() {
        if (StatConfig.isEnableStatService()) {
            try {
                this.f1954e.m2373a(new ax(this));
            } catch (Throwable th) {
                f1947h.m2360e(th);
            }
        }
    }

    void m2352d() {
        Throwable th;
        Cursor query;
        try {
            query = this.f1952c.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    String string2 = query.getString(2);
                    int i2 = query.getInt(3);
                    C0649f c0649f = new C0649f(i);
                    c0649f.f2075a = i;
                    c0649f.f2076b = new JSONObject(string);
                    c0649f.f2077c = string2;
                    c0649f.f2078d = i2;
                    StatConfig.m2209a(f1948i, c0649f);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }
}
