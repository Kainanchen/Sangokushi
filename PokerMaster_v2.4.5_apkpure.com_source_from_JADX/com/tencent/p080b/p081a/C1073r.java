package com.tencent.p080b.p081a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.p080b.p081a.p082a.C1029d;
import com.tencent.p080b.p081a.p083b.C1039b;
import com.tencent.p080b.p081a.p083b.C1040c;
import com.tencent.p080b.p081a.p083b.C1043f;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1055r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.r */
public class C1073r {
    static C1039b f8214d;
    private static Context f8215i;
    private static C1073r f8216j;
    C1043f f8217a;
    volatile int f8218b;
    C1040c f8219c;
    private aa f8220e;
    private aa f8221f;
    private String f8222g;
    private String f8223h;
    private int f8224k;
    private ConcurrentHashMap<C1029d, String> f8225l;
    private boolean f8226m;
    private HashMap<String, String> f8227n;

    static {
        f8214d = C1049l.m5693c();
        f8215i = null;
        f8216j = null;
    }

    private C1073r(Context context) {
        this.f8220e = null;
        this.f8221f = null;
        this.f8217a = null;
        this.f8222g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f8223h = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f8218b = 0;
        this.f8219c = null;
        this.f8224k = 0;
        this.f8225l = null;
        this.f8226m = false;
        this.f8227n = new HashMap();
        try {
            this.f8217a = new C1043f();
            f8215i = context.getApplicationContext();
            this.f8225l = new ConcurrentHashMap();
            this.f8222g = C1049l.m5714o(context);
            this.f8223h = "pri_" + C1049l.m5714o(context);
            this.f8220e = new aa(f8215i, this.f8222g);
            this.f8221f = new aa(f8215i, this.f8223h);
            m5847a(true);
            m5847a(false);
            m5852c();
            m5860b(f8215i);
            m5856g();
            m5857h();
        } catch (Throwable th) {
            f8214d.m5665b(th);
        }
    }

    public static C1073r m5834a() {
        return f8216j;
    }

    public static C1073r m5835a(Context context) {
        if (f8216j == null) {
            synchronized (C1073r.class) {
                if (f8216j == null) {
                    f8216j = new C1073r(context);
                }
            }
        }
        return f8216j;
    }

    private static String m5836a(List<ab> list) {
        StringBuilder stringBuilder = new StringBuilder(list.size() * 3);
        stringBuilder.append("event_id in (");
        int size = list.size();
        int i = 0;
        for (ab abVar : list) {
            stringBuilder.append(abVar.f7990a);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
            i++;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private synchronized void m5837a(int i, boolean z) {
        try {
            if (this.f8218b > 0 && i > 0 && !C1060e.m5795a()) {
                if (C1058c.m5762b()) {
                    f8214d.m5662a("Load " + this.f8218b + " unsent events");
                }
                List arrayList = new ArrayList(i);
                m5851b(arrayList, i, z);
                if (arrayList.size() > 0) {
                    if (C1058c.m5762b()) {
                        f8214d.m5662a("Peek " + arrayList.size() + " unsent events.");
                    }
                    m5845a(arrayList, 2, z);
                    ai.m5656b(f8215i).m5658a(arrayList, new C1080y(this, arrayList, z));
                }
            }
        } catch (Throwable th) {
            f8214d.m5665b(th);
        }
    }

    private synchronized void m5838a(af afVar) {
        Throwable th;
        Cursor query;
        try {
            Object obj;
            long update;
            String jSONObject = afVar.f8000b.toString();
            String a = C1049l.m5685a(jSONObject);
            ContentValues contentValues = new ContentValues();
            contentValues.put(MessageKey.MSG_CONTENT, afVar.f8000b.toString());
            contentValues.put("md5sum", a);
            afVar.f8001c = a;
            contentValues.put(LogBuilder.KEY_VERSION, Integer.valueOf(afVar.f8002d));
            query = this.f8220e.getReadableDatabase().query("config", null, null, null, null, null, null);
            do {
                try {
                    if (!query.moveToNext()) {
                        obj = null;
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (query.getInt(0) != afVar.f7999a);
            obj = 1;
            this.f8220e.getWritableDatabase().beginTransaction();
            if (1 == obj) {
                update = (long) this.f8220e.getWritableDatabase().update("config", contentValues, "type=?", new String[]{Integer.toString(afVar.f7999a)});
            } else {
                contentValues.put(MessageKey.MSG_TYPE, Integer.valueOf(afVar.f7999a));
                update = this.f8220e.getWritableDatabase().insert("config", null, contentValues);
            }
            if (update == -1) {
                f8214d.m5668e("Failed to store cfg:" + jSONObject);
            } else {
                f8214d.m5670g("Sucessed to store cfg:" + jSONObject);
            }
            this.f8220e.getWritableDatabase().setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            try {
                this.f8220e.getWritableDatabase().endTransaction();
            } catch (Exception e) {
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            this.f8220e.getWritableDatabase().endTransaction();
            throw th;
        }
    }

    private synchronized void m5845a(List<ab> list, int i, boolean z) {
        SQLiteDatabase b;
        Throwable th;
        String str = null;
        synchronized (this) {
            if (list.size() != 0) {
                int f = !z ? C1058c.m5771f() : C1058c.m5766d();
                try {
                    String str2;
                    b = m5848b(z);
                    if (i == 2) {
                        try {
                            str2 = "update events set status=" + i + ", send_count=send_count+1  where " + C1073r.m5836a((List) list);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                f8214d.m5665b(th);
                                if (b != null) {
                                    try {
                                        b.endTransaction();
                                    } catch (Throwable th3) {
                                        f8214d.m5665b(th3);
                                    }
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                if (b != null) {
                                    try {
                                        b.endTransaction();
                                    } catch (Throwable th5) {
                                        f8214d.m5665b(th5);
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    String str3 = "update events set status=" + i + " where " + C1073r.m5836a((List) list);
                    if (this.f8224k % 3 == 0) {
                        str = "delete from events where send_count>" + f;
                    }
                    this.f8224k++;
                    str2 = str3;
                    if (C1058c.m5762b()) {
                        f8214d.m5662a("update sql:" + str2);
                    }
                    b.beginTransaction();
                    b.execSQL(str2);
                    if (str != null) {
                        f8214d.m5662a("update for delete sql:" + str);
                        b.execSQL(str);
                        m5852c();
                    }
                    b.setTransactionSuccessful();
                    if (b != null) {
                        try {
                            b.endTransaction();
                        } catch (Throwable th32) {
                            f8214d.m5665b(th32);
                        }
                    }
                } catch (Throwable th6) {
                    th32 = th6;
                    b = null;
                    if (b != null) {
                        b.endTransaction();
                    }
                    throw th32;
                }
            }
        }
    }

    private synchronized void m5846a(java.util.List<com.tencent.p080b.p081a.ab> r9, boolean r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.tencent.b.a.r.a(java.util.List, boolean):void. bs: [B:26:0x00c1, B:49:0x00e9]
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
        r0 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0032;	 Catch:{ all -> 0x00ce }
    L_0x0010:
        r0 = f8214d;	 Catch:{ all -> 0x00ce }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ce }
        r3 = "Delete ";	 Catch:{ all -> 0x00ce }
        r2.<init>(r3);	 Catch:{ all -> 0x00ce }
        r3 = r9.size();	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00ce }
        r3 = " events, important:";	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00ce }
        r2 = r2.append(r10);	 Catch:{ all -> 0x00ce }
        r2 = r2.toString();	 Catch:{ all -> 0x00ce }
        r0.m5662a(r2);	 Catch:{ all -> 0x00ce }
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
        r0 = (com.tencent.p080b.p081a.ab) r0;	 Catch:{ all -> 0x00ce }
        r6 = r0.f7990a;	 Catch:{ all -> 0x00ce }
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
        r1 = r8.m5848b(r10);	 Catch:{ Throwable -> 0x00d1 }
        r1.beginTransaction();	 Catch:{ Throwable -> 0x00d1 }
        r0 = "events";	 Catch:{ Throwable -> 0x00d1 }
        r2 = r3.toString();	 Catch:{ Throwable -> 0x00d1 }
        r5 = 0;	 Catch:{ Throwable -> 0x00d1 }
        r0 = r1.delete(r0, r2, r5);	 Catch:{ Throwable -> 0x00d1 }
        r2 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ Throwable -> 0x00d1 }
        if (r2 == 0) goto L_0x00b3;	 Catch:{ Throwable -> 0x00d1 }
    L_0x0087:
        r2 = f8214d;	 Catch:{ Throwable -> 0x00d1 }
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
        r2.m5662a(r3);	 Catch:{ Throwable -> 0x00d1 }
    L_0x00b3:
        r2 = r8.f8218b;	 Catch:{ Throwable -> 0x00d1 }
        r0 = r2 - r0;	 Catch:{ Throwable -> 0x00d1 }
        r8.f8218b = r0;	 Catch:{ Throwable -> 0x00d1 }
        r1.setTransactionSuccessful();	 Catch:{ Throwable -> 0x00d1 }
        r8.m5852c();	 Catch:{ Throwable -> 0x00d1 }
        if (r1 == 0) goto L_0x0008;
    L_0x00c1:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00c6 }
        goto L_0x0008;
    L_0x00c6:
        r0 = move-exception;
        r1 = f8214d;	 Catch:{ all -> 0x00ce }
        r1.m5665b(r0);	 Catch:{ all -> 0x00ce }
        goto L_0x0008;
    L_0x00ce:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        r2 = f8214d;	 Catch:{ all -> 0x00e6 }
        r2.m5665b(r0);	 Catch:{ all -> 0x00e6 }
        if (r1 == 0) goto L_0x0008;
    L_0x00d9:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00de }
        goto L_0x0008;
    L_0x00de:
        r0 = move-exception;
        r1 = f8214d;	 Catch:{ all -> 0x00ce }
        r1.m5665b(r0);	 Catch:{ all -> 0x00ce }
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
        r2 = f8214d;	 Catch:{ all -> 0x00ce }
        r2.m5665b(r1);	 Catch:{ all -> 0x00ce }
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.b.a.r.a(java.util.List, boolean):void");
    }

    private void m5847a(boolean z) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = m5848b(z);
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put(NotificationCompatApi24.CATEGORY_STATUS, Integer.valueOf(1));
            int update = sQLiteDatabase.update("events", contentValues, "status=?", new String[]{Long.toString(2)});
            if (C1058c.m5762b()) {
                f8214d.m5662a("update " + update + " unsent events.");
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    f8214d.m5665b(th);
                }
            }
        } catch (Throwable th2) {
            f8214d.m5665b(th2);
        }
    }

    private SQLiteDatabase m5848b(boolean z) {
        return !z ? this.f8220e.getWritableDatabase() : this.f8221f.getWritableDatabase();
    }

    private synchronized void m5850b(com.tencent.p080b.p081a.p082a.C1029d r7, com.tencent.p080b.p081a.ah r8, boolean r9, boolean r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.tencent.b.a.r.b(com.tencent.b.a.a.d, com.tencent.b.a.ah, boolean, boolean):void. bs: [B:20:0x0092, B:51:0x00e9]
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
        r6 = this;
        r1 = 0;
        monitor-enter(r6);
        r0 = com.tencent.p080b.p081a.C1058c.m5774i();	 Catch:{ all -> 0x00ed }
        if (r0 <= 0) goto L_0x00c5;	 Catch:{ all -> 0x00ed }
    L_0x0008:
        r0 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x00ed }
        if (r0 <= 0) goto L_0x0010;
    L_0x000c:
        if (r9 != 0) goto L_0x0010;
    L_0x000e:
        if (r10 == 0) goto L_0x0110;
    L_0x0010:
        r1 = r6.m5848b(r9);	 Catch:{ Throwable -> 0x00cf }
        r1.beginTransaction();	 Catch:{ Throwable -> 0x00cf }
        if (r9 != 0) goto L_0x003c;	 Catch:{ Throwable -> 0x00cf }
    L_0x0019:
        r0 = r6.f8218b;	 Catch:{ Throwable -> 0x00cf }
        r2 = com.tencent.p080b.p081a.C1058c.m5774i();	 Catch:{ Throwable -> 0x00cf }
        if (r0 <= r2) goto L_0x003c;	 Catch:{ Throwable -> 0x00cf }
    L_0x0021:
        r0 = f8214d;	 Catch:{ Throwable -> 0x00cf }
        r2 = "Too many events stored in db.";	 Catch:{ Throwable -> 0x00cf }
        r0.m5664b(r2);	 Catch:{ Throwable -> 0x00cf }
        r0 = r6.f8218b;	 Catch:{ Throwable -> 0x00cf }
        r2 = r6.f8220e;	 Catch:{ Throwable -> 0x00cf }
        r2 = r2.getWritableDatabase();	 Catch:{ Throwable -> 0x00cf }
        r3 = "events";	 Catch:{ Throwable -> 0x00cf }
        r4 = "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)";	 Catch:{ Throwable -> 0x00cf }
        r5 = 0;	 Catch:{ Throwable -> 0x00cf }
        r2 = r2.delete(r3, r4, r5);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0 - r2;	 Catch:{ Throwable -> 0x00cf }
        r6.f8218b = r0;	 Catch:{ Throwable -> 0x00cf }
    L_0x003c:
        r0 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x00cf }
        r0.<init>();	 Catch:{ Throwable -> 0x00cf }
        r2 = r7.m5634f();	 Catch:{ Throwable -> 0x00cf }
        r3 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ Throwable -> 0x00cf }
        if (r3 == 0) goto L_0x005f;	 Catch:{ Throwable -> 0x00cf }
    L_0x004b:
        r3 = f8214d;	 Catch:{ Throwable -> 0x00cf }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00cf }
        r5 = "insert 1 event, content:";	 Catch:{ Throwable -> 0x00cf }
        r4.<init>(r5);	 Catch:{ Throwable -> 0x00cf }
        r4 = r4.append(r2);	 Catch:{ Throwable -> 0x00cf }
        r4 = r4.toString();	 Catch:{ Throwable -> 0x00cf }
        r3.m5662a(r4);	 Catch:{ Throwable -> 0x00cf }
    L_0x005f:
        r2 = com.tencent.p080b.p081a.p083b.C1055r.m5740b(r2);	 Catch:{ Throwable -> 0x00cf }
        r3 = "content";	 Catch:{ Throwable -> 0x00cf }
        r0.put(r3, r2);	 Catch:{ Throwable -> 0x00cf }
        r2 = "send_count";	 Catch:{ Throwable -> 0x00cf }
        r3 = "0";	 Catch:{ Throwable -> 0x00cf }
        r0.put(r2, r3);	 Catch:{ Throwable -> 0x00cf }
        r2 = "status";	 Catch:{ Throwable -> 0x00cf }
        r3 = 1;	 Catch:{ Throwable -> 0x00cf }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ Throwable -> 0x00cf }
        r0.put(r2, r3);	 Catch:{ Throwable -> 0x00cf }
        r2 = "timestamp";	 Catch:{ Throwable -> 0x00cf }
        r4 = r7.m5631c();	 Catch:{ Throwable -> 0x00cf }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Throwable -> 0x00cf }
        r0.put(r2, r3);	 Catch:{ Throwable -> 0x00cf }
        r2 = "events";	 Catch:{ Throwable -> 0x00cf }
        r3 = 0;	 Catch:{ Throwable -> 0x00cf }
        r2 = r1.insert(r2, r3, r0);	 Catch:{ Throwable -> 0x00cf }
        r1.setTransactionSuccessful();	 Catch:{ Throwable -> 0x00cf }
        if (r1 == 0) goto L_0x018a;
    L_0x0092:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00c7 }
        r0 = r2;
    L_0x0096:
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f7;
    L_0x009c:
        r0 = r6.f8218b;	 Catch:{ all -> 0x00ed }
        r0 = r0 + 1;	 Catch:{ all -> 0x00ed }
        r6.f8218b = r0;	 Catch:{ all -> 0x00ed }
        r0 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ all -> 0x00ed }
        if (r0 == 0) goto L_0x00c0;	 Catch:{ all -> 0x00ed }
    L_0x00a8:
        r0 = f8214d;	 Catch:{ all -> 0x00ed }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ed }
        r2 = "directStoreEvent insert event to db, event:";	 Catch:{ all -> 0x00ed }
        r1.<init>(r2);	 Catch:{ all -> 0x00ed }
        r2 = r7.m5634f();	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r1 = r1.toString();	 Catch:{ all -> 0x00ed }
        r0.m5670g(r1);	 Catch:{ all -> 0x00ed }
    L_0x00c0:
        if (r8 == 0) goto L_0x00c5;	 Catch:{ all -> 0x00ed }
    L_0x00c2:
        r8.m5652a();	 Catch:{ all -> 0x00ed }
    L_0x00c5:
        monitor-exit(r6);
        return;
    L_0x00c7:
        r0 = move-exception;
        r1 = f8214d;	 Catch:{ all -> 0x00ed }
        r1.m5665b(r0);	 Catch:{ all -> 0x00ed }
        r0 = r2;
        goto L_0x0096;
    L_0x00cf:
        r0 = move-exception;
        r2 = -1;
        r4 = f8214d;	 Catch:{ all -> 0x00e6 }
        r4.m5665b(r0);	 Catch:{ all -> 0x00e6 }
        if (r1 == 0) goto L_0x018a;
    L_0x00d9:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00de }
        r0 = r2;
        goto L_0x0096;
    L_0x00de:
        r0 = move-exception;
        r1 = f8214d;	 Catch:{ all -> 0x00ed }
        r1.m5665b(r0);	 Catch:{ all -> 0x00ed }
        r0 = r2;
        goto L_0x0096;
    L_0x00e6:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00ec;
    L_0x00e9:
        r1.endTransaction();	 Catch:{ Throwable -> 0x00f0 }
    L_0x00ec:
        throw r0;	 Catch:{ all -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x00f0:
        r1 = move-exception;
        r2 = f8214d;	 Catch:{ all -> 0x00ed }
        r2.m5665b(r1);	 Catch:{ all -> 0x00ed }
        goto L_0x00ec;	 Catch:{ all -> 0x00ed }
    L_0x00f7:
        r0 = f8214d;	 Catch:{ all -> 0x00ed }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ed }
        r2 = "Failed to store event:";	 Catch:{ all -> 0x00ed }
        r1.<init>(r2);	 Catch:{ all -> 0x00ed }
        r2 = r7.m5634f();	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r1 = r1.toString();	 Catch:{ all -> 0x00ed }
        r0.m5667d(r1);	 Catch:{ all -> 0x00ed }
        goto L_0x00c5;	 Catch:{ all -> 0x00ed }
    L_0x0110:
        r0 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x00ed }
        if (r0 <= 0) goto L_0x00c5;	 Catch:{ all -> 0x00ed }
    L_0x0114:
        r0 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ all -> 0x00ed }
        if (r0 == 0) goto L_0x0164;	 Catch:{ all -> 0x00ed }
    L_0x011a:
        r0 = f8214d;	 Catch:{ all -> 0x00ed }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ed }
        r2 = "cacheEventsInMemory.size():";	 Catch:{ all -> 0x00ed }
        r1.<init>(r2);	 Catch:{ all -> 0x00ed }
        r2 = r6.f8225l;	 Catch:{ all -> 0x00ed }
        r2 = r2.size();	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r2 = ",numEventsCachedInMemory:";	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r2 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r2 = ",numStoredEvents:";	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r2 = r6.f8218b;	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r1 = r1.toString();	 Catch:{ all -> 0x00ed }
        r0.m5662a(r1);	 Catch:{ all -> 0x00ed }
        r0 = f8214d;	 Catch:{ all -> 0x00ed }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ed }
        r2 = "cache event:";	 Catch:{ all -> 0x00ed }
        r1.<init>(r2);	 Catch:{ all -> 0x00ed }
        r2 = r7.m5634f();	 Catch:{ all -> 0x00ed }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ed }
        r1 = r1.toString();	 Catch:{ all -> 0x00ed }
        r0.m5662a(r1);	 Catch:{ all -> 0x00ed }
    L_0x0164:
        r0 = r6.f8225l;	 Catch:{ all -> 0x00ed }
        r1 = "";	 Catch:{ all -> 0x00ed }
        r0.put(r7, r1);	 Catch:{ all -> 0x00ed }
        r0 = r6.f8225l;	 Catch:{ all -> 0x00ed }
        r0 = r0.size();	 Catch:{ all -> 0x00ed }
        r1 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x00ed }
        if (r0 < r1) goto L_0x0178;	 Catch:{ all -> 0x00ed }
    L_0x0175:
        r6.m5855f();	 Catch:{ all -> 0x00ed }
    L_0x0178:
        if (r8 == 0) goto L_0x00c5;	 Catch:{ all -> 0x00ed }
    L_0x017a:
        r0 = r6.f8225l;	 Catch:{ all -> 0x00ed }
        r0 = r0.size();	 Catch:{ all -> 0x00ed }
        if (r0 <= 0) goto L_0x0185;	 Catch:{ all -> 0x00ed }
    L_0x0182:
        r6.m5855f();	 Catch:{ all -> 0x00ed }
    L_0x0185:
        r8.m5652a();	 Catch:{ all -> 0x00ed }
        goto L_0x00c5;
    L_0x018a:
        r0 = r2;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.b.a.r.b(com.tencent.b.a.a.d, com.tencent.b.a.ah, boolean, boolean):void");
    }

    private void m5851b(List<ab> list, int i, boolean z) {
        SQLiteDatabase readableDatabase;
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        if (z) {
            readableDatabase = this.f8221f.getReadableDatabase();
        } else {
            try {
                readableDatabase = this.f8220e.getReadableDatabase();
            } catch (Throwable th2) {
                th = th2;
                cursor2 = null;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
        cursor2 = readableDatabase.query("events", null, "status=?", new String[]{Integer.toString(1)}, null, null, null, Integer.toString(i));
        while (cursor2.moveToNext()) {
            try {
                long j = cursor2.getLong(0);
                String string = cursor2.getString(1);
                if (!C1058c.f8133g) {
                    string = C1055r.m5736a(string);
                }
                int i2 = cursor2.getInt(2);
                int i3 = cursor2.getInt(3);
                ab abVar = new ab(j, string, i2, i3);
                if (C1058c.m5762b()) {
                    f8214d.m5662a("peek event, id=" + j + ",send_count=" + i3 + ",timestamp=" + cursor2.getLong(4));
                }
                list.add(abVar);
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    private void m5852c() {
        this.f8218b = m5853d() + m5854e();
    }

    private int m5853d() {
        return (int) DatabaseUtils.queryNumEntries(this.f8220e.getReadableDatabase(), "events");
    }

    private int m5854e() {
        return (int) DatabaseUtils.queryNumEntries(this.f8221f.getReadableDatabase(), "events");
    }

    private void m5855f() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.tencent.b.a.r.f():void. bs: [B:42:0x011b, B:53:0x0133]
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
        r0 = r9.f8226m;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2 = r9.f8225l;
        monitor-enter(r2);
        r0 = r9.f8225l;	 Catch:{ all -> 0x0013 }
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
        r9.f8226m = r0;	 Catch:{ all -> 0x0013 }
        r0 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ all -> 0x0013 }
    L_0x001f:
        r0 = f8214d;	 Catch:{ all -> 0x0013 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0013 }
        r4 = "insert ";	 Catch:{ all -> 0x0013 }
        r3.<init>(r4);	 Catch:{ all -> 0x0013 }
        r4 = r9.f8225l;	 Catch:{ all -> 0x0013 }
        r4 = r4.size();	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = " events ,numEventsCachedInMemory:";	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = ",numStoredEvents:";	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r4 = r9.f8218b;	 Catch:{ all -> 0x0013 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0013 }
        r3 = r3.toString();	 Catch:{ all -> 0x0013 }
        r0.m5662a(r3);	 Catch:{ all -> 0x0013 }
    L_0x0051:
        r0 = r9.f8220e;	 Catch:{ Throwable -> 0x00ca }
        r1 = r0.getWritableDatabase();	 Catch:{ Throwable -> 0x00ca }
        r1.beginTransaction();	 Catch:{ Throwable -> 0x00ca }
        r0 = r9.f8225l;	 Catch:{ Throwable -> 0x00ca }
        r0 = r0.entrySet();	 Catch:{ Throwable -> 0x00ca }
        r3 = r0.iterator();	 Catch:{ Throwable -> 0x00ca }
    L_0x0064:
        r0 = r3.hasNext();	 Catch:{ Throwable -> 0x00ca }
        if (r0 == 0) goto L_0x0116;	 Catch:{ Throwable -> 0x00ca }
    L_0x006a:
        r0 = r3.next();	 Catch:{ Throwable -> 0x00ca }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ Throwable -> 0x00ca }
        r0 = r0.getKey();	 Catch:{ Throwable -> 0x00ca }
        r0 = (com.tencent.p080b.p081a.p082a.C1029d) r0;	 Catch:{ Throwable -> 0x00ca }
        r4 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x00ca }
        r4.<init>();	 Catch:{ Throwable -> 0x00ca }
        r5 = r0.m5634f();	 Catch:{ Throwable -> 0x00ca }
        r6 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ Throwable -> 0x00ca }
        if (r6 == 0) goto L_0x0099;	 Catch:{ Throwable -> 0x00ca }
    L_0x0085:
        r6 = f8214d;	 Catch:{ Throwable -> 0x00ca }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ca }
        r8 = "insert content:";	 Catch:{ Throwable -> 0x00ca }
        r7.<init>(r8);	 Catch:{ Throwable -> 0x00ca }
        r7 = r7.append(r5);	 Catch:{ Throwable -> 0x00ca }
        r7 = r7.toString();	 Catch:{ Throwable -> 0x00ca }
        r6.m5662a(r7);	 Catch:{ Throwable -> 0x00ca }
    L_0x0099:
        r5 = com.tencent.p080b.p081a.p083b.C1055r.m5740b(r5);	 Catch:{ Throwable -> 0x00ca }
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
        r6 = r0.m5631c();	 Catch:{ Throwable -> 0x00ca }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x00ca }
        r4.put(r5, r0);	 Catch:{ Throwable -> 0x00ca }
        r0 = "events";	 Catch:{ Throwable -> 0x00ca }
        r5 = 0;	 Catch:{ Throwable -> 0x00ca }
        r1.insert(r0, r5, r4);	 Catch:{ Throwable -> 0x00ca }
        r3.remove();	 Catch:{ Throwable -> 0x00ca }
        goto L_0x0064;
    L_0x00ca:
        r0 = move-exception;
        r3 = f8214d;	 Catch:{ all -> 0x0130 }
        r3.m5665b(r0);	 Catch:{ all -> 0x0130 }
        if (r1 == 0) goto L_0x00d8;
    L_0x00d2:
        r1.endTransaction();	 Catch:{ Throwable -> 0x0129 }
        r9.m5852c();	 Catch:{ Throwable -> 0x0129 }
    L_0x00d8:
        r0 = 0;
        r9.f8226m = r0;	 Catch:{ all -> 0x0013 }
        r0 = com.tencent.p080b.p081a.C1058c.m5762b();	 Catch:{ all -> 0x0013 }
        if (r0 == 0) goto L_0x0113;	 Catch:{ all -> 0x0013 }
    L_0x00e1:
        r0 = f8214d;	 Catch:{ all -> 0x0013 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0013 }
        r3 = "after insert, cacheEventsInMemory.size():";	 Catch:{ all -> 0x0013 }
        r1.<init>(r3);	 Catch:{ all -> 0x0013 }
        r3 = r9.f8225l;	 Catch:{ all -> 0x0013 }
        r3 = r3.size();	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = ",numEventsCachedInMemory:";	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = com.tencent.p080b.p081a.C1058c.f8140n;	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = ",numStoredEvents:";	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r3 = r9.f8218b;	 Catch:{ all -> 0x0013 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0013 }
        r1 = r1.toString();	 Catch:{ all -> 0x0013 }
        r0.m5662a(r1);	 Catch:{ all -> 0x0013 }
    L_0x0113:
        monitor-exit(r2);	 Catch:{ all -> 0x0013 }
        goto L_0x0005;
    L_0x0116:
        r1.setTransactionSuccessful();	 Catch:{ Throwable -> 0x00ca }
        if (r1 == 0) goto L_0x00d8;
    L_0x011b:
        r1.endTransaction();	 Catch:{ Throwable -> 0x0122 }
        r9.m5852c();	 Catch:{ Throwable -> 0x0122 }
        goto L_0x00d8;
    L_0x0122:
        r0 = move-exception;
        r1 = f8214d;	 Catch:{ all -> 0x0013 }
        r1.m5665b(r0);	 Catch:{ all -> 0x0013 }
        goto L_0x00d8;	 Catch:{ all -> 0x0013 }
    L_0x0129:
        r0 = move-exception;	 Catch:{ all -> 0x0013 }
        r1 = f8214d;	 Catch:{ all -> 0x0013 }
        r1.m5665b(r0);	 Catch:{ all -> 0x0013 }
        goto L_0x00d8;
    L_0x0130:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0139;
    L_0x0133:
        r1.endTransaction();	 Catch:{ Throwable -> 0x013a }
        r9.m5852c();	 Catch:{ Throwable -> 0x013a }
    L_0x0139:
        throw r0;	 Catch:{ all -> 0x0013 }
    L_0x013a:
        r1 = move-exception;	 Catch:{ all -> 0x0013 }
        r3 = f8214d;	 Catch:{ all -> 0x0013 }
        r3.m5665b(r1);	 Catch:{ all -> 0x0013 }
        goto L_0x0139;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.b.a.r.f():void");
    }

    private void m5856g() {
        Throwable th;
        Cursor query;
        try {
            query = this.f8220e.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    String string2 = query.getString(2);
                    int i2 = query.getInt(3);
                    af afVar = new af(i);
                    afVar.f7999a = i;
                    afVar.f8000b = new JSONObject(string);
                    afVar.f8001c = string2;
                    afVar.f8002d = i2;
                    C1058c.m5751a(f8215i, afVar);
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

    private void m5857h() {
        Throwable th;
        Cursor query;
        try {
            query = this.f8220e.getReadableDatabase().query("keyvalues", null, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    this.f8227n.put(query.getString(0), query.getString(1));
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

    final void m5858a(int i) {
        this.f8217a.m5674a(new C1081z(this, i));
    }

    final void m5859a(C1029d c1029d, ah ahVar, boolean z, boolean z2) {
        if (this.f8217a != null) {
            this.f8217a.m5674a(new C1077v(this, c1029d, ahVar, z, z2));
        }
    }

    public final synchronized C1040c m5860b(Context context) {
        C1040c c1040c;
        Throwable th;
        Cursor cursor;
        if (this.f8219c != null) {
            c1040c = this.f8219c;
        } else {
            Cursor query;
            try {
                this.f8220e.getWritableDatabase().beginTransaction();
                if (C1058c.m5762b()) {
                    f8214d.m5662a((Object) "try to load user info from db.");
                }
                query = this.f8220e.getReadableDatabase().query("user", null, null, null, null, null, null, null);
                Object obj = null;
                try {
                    String string;
                    String b;
                    if (query.moveToNext()) {
                        String a = C1055r.m5736a(query.getString(0));
                        int i = query.getInt(1);
                        string = query.getString(2);
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        int i2 = (i == 1 || C1049l.m5683a(query.getLong(3) * 1000).equals(C1049l.m5683a(1000 * currentTimeMillis))) ? i : 1;
                        int i3 = !string.equals(C1049l.m5711l(context)) ? i2 | 2 : i2;
                        String[] split = a.split(",");
                        obj = null;
                        if (split == null || split.length <= 0) {
                            b = C1049l.m5692b(context);
                            obj = 1;
                            a = b;
                        } else {
                            b = split[0];
                            if (b == null || b.length() < 11) {
                                string = C1055r.m5735a(context);
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
                            string = C1049l.m5694c(context);
                            if (string != null && string.length() > 0) {
                                b = a + "," + string;
                                obj = 1;
                            }
                        } else {
                            string = split[1];
                            b = a + "," + string;
                        }
                        this.f8219c = new C1040c(a, string, i3);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(ParamKey.UID, C1055r.m5740b(b));
                        contentValues.put("user_type", Integer.valueOf(i3));
                        contentValues.put("app_ver", C1049l.m5711l(context));
                        contentValues.put("ts", Long.valueOf(currentTimeMillis));
                        if (obj != null) {
                            this.f8220e.getWritableDatabase().update("user", contentValues, "uid=?", new String[]{r10});
                        }
                        if (i3 != i) {
                            this.f8220e.getWritableDatabase().replace("user", null, contentValues);
                        }
                        obj = 1;
                    }
                    if (obj == null) {
                        string = C1049l.m5692b(context);
                        b = C1049l.m5694c(context);
                        String str2 = (b == null || b.length() <= 0) ? string : string + "," + b;
                        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                        String l = C1049l.m5711l(context);
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(ParamKey.UID, C1055r.m5740b(str2));
                        contentValues2.put("user_type", Integer.valueOf(0));
                        contentValues2.put("app_ver", l);
                        contentValues2.put("ts", Long.valueOf(currentTimeMillis2));
                        this.f8220e.getWritableDatabase().insert("user", null, contentValues2);
                        this.f8219c = new C1040c(string, b, 0);
                    }
                    this.f8220e.getWritableDatabase().setTransactionSuccessful();
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            f8214d.m5665b(th2);
                        }
                    }
                    this.f8220e.getWritableDatabase().endTransaction();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (query != null) {
                        query.close();
                    }
                    this.f8220e.getWritableDatabase().endTransaction();
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                query = null;
                if (query != null) {
                    query.close();
                }
                this.f8220e.getWritableDatabase().endTransaction();
                throw th2;
            }
            c1040c = this.f8219c;
        }
        return c1040c;
    }

    static /* synthetic */ void m5840a(C1073r c1073r, int i, boolean z) {
        int d = i == -1 ? !z ? c1073r.m5853d() : c1073r.m5854e() : i;
        if (d > 0) {
            int k = (C1058c.m5776k() * 60) * C1058c.m5772g();
            if (d > k && k > 0) {
                d = k;
            }
            int h = C1058c.m5773h();
            int i2 = d / h;
            int i3 = d % h;
            if (C1058c.m5762b()) {
                f8214d.m5662a("sentStoreEventsByDb sendNumbers=" + d + ",important=" + z + ",maxSendNumPerFor1Period=" + k + ",maxCount=" + i2 + ",restNumbers=" + i3);
            }
            for (d = 0; d < i2; d++) {
                c1073r.m5837a(h, z);
            }
            if (i3 > 0) {
                c1073r.m5837a(i3, z);
            }
        }
    }
}
