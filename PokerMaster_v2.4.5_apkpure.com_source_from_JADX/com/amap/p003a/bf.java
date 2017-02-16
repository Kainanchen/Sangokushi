package com.amap.p003a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.json.JSONObject;

/* compiled from: DB */
/* renamed from: com.amap.a.bf */
public final class bf {
    private static bf f375a;
    private String f376b;
    private String f377c;

    static {
        f375a = null;
    }

    public bf() {
        this.f376b = "2.0.201501131131".replace(".", LetterIndexBar.SEARCH_ICON_LETTER);
        this.f377c = null;
    }

    public static synchronized bf m347a() {
        bf bfVar;
        synchronized (bf.class) {
            if (f375a == null) {
                f375a = new bf();
            }
            bfVar = f375a;
        }
        return bfVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m348a(android.database.sqlite.SQLiteDatabase r7, java.lang.String r8) {
        /*
        r6 = this;
        r2 = 0;
        r1 = 1;
        r0 = 0;
        r3 = android.text.TextUtils.isEmpty(r8);
        if (r3 == 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r3.<init>();	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r4 = "SELECT count(*) as c FROM sqlite_master WHERE type = 'table' AND name = '";
        r3.append(r4);	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r4 = r8.trim();	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r4 = r3.append(r4);	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r5 = r6.f376b;	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r4 = r4.append(r5);	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r5 = "' ";
        r4.append(r5);	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r4 = r3.toString();	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        r5 = 0;
        r2 = r7.rawQuery(r4, r5);	 Catch:{ Throwable -> 0x004e, all -> 0x0057 }
        if (r2 == 0) goto L_0x0040;
    L_0x0032:
        r4 = r2.moveToFirst();	 Catch:{ Throwable -> 0x005e, all -> 0x0057 }
        if (r4 == 0) goto L_0x0040;
    L_0x0038:
        r4 = 0;
        r4 = r2.getInt(r4);	 Catch:{ Throwable -> 0x005e, all -> 0x0057 }
        if (r4 <= 0) goto L_0x0040;
    L_0x003f:
        r0 = r1;
    L_0x0040:
        r4 = 0;
        r5 = r3.length();	 Catch:{ Throwable -> 0x005e, all -> 0x0057 }
        r3.delete(r4, r5);	 Catch:{ Throwable -> 0x005e, all -> 0x0057 }
        if (r2 == 0) goto L_0x0009;
    L_0x004a:
        r2.close();
        goto L_0x0009;
    L_0x004e:
        r0 = move-exception;
        r0 = r2;
    L_0x0050:
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r0.close();
    L_0x0055:
        r0 = r1;
        goto L_0x0009;
    L_0x0057:
        r0 = move-exception;
        if (r2 == 0) goto L_0x005d;
    L_0x005a:
        r2.close();
    L_0x005d:
        throw r0;
    L_0x005e:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bf.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final synchronized void m349a(android.content.Context r10) {
        /*
        r9 = this;
        r1 = 0;
        monitor-enter(r9);
        if (r10 != 0) goto L_0x0006;
    L_0x0004:
        monitor-exit(r9);
        return;
    L_0x0006:
        r0 = 0;
        r2 = "hmdb";
        r3 = 0;
        r4 = 0;
        r7 = r10.openOrCreateDatabase(r2, r3, r4);	 Catch:{ Throwable -> 0x0305, all -> 0x02f7 }
        r2 = "hist";
        r2 = r9.m348a(r7, r2);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        if (r2 != 0) goto L_0x0037;
    L_0x0017:
        if (r7 == 0) goto L_0x0022;
    L_0x0019:
        r2 = r7.isOpen();	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        if (r2 == 0) goto L_0x0022;
    L_0x001f:
        r7.close();	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
    L_0x0022:
        r2 = 0;
        if (r1 == 0) goto L_0x0028;
    L_0x0025:
        r0.close();	 Catch:{ all -> 0x0034 }
    L_0x0028:
        if (r1 == 0) goto L_0x0004;
    L_0x002a:
        r0 = r2.isOpen();	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0004;
    L_0x0030:
        r2.close();	 Catch:{ all -> 0x0034 }
        goto L_0x0004;
    L_0x0034:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x0037:
        r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r8.<init>();	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0 = "SELECT feature, nb, loc FROM ";
        r8.append(r0);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0 = "hist";
        r0 = r8.append(r0);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r2 = r9.f376b;	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0.append(r2);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r2 = com.amap.p003a.bu.m464a();	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 - r4;
        r0 = " WHERE time > ";
        r0 = r8.append(r0);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0.append(r2);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0 = " ORDER BY time ASC;";
        r8.append(r0);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0 = r8.toString();	 Catch:{ Throwable -> 0x0195, all -> 0x02fc }
        r2 = 0;
        r1 = r7.rawQuery(r0, r2);	 Catch:{ Throwable -> 0x0195, all -> 0x02fc }
        r6 = r1;
    L_0x006c:
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r9.f377c;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 != 0) goto L_0x0081;
    L_0x0075:
        r0 = "MD5";
        r1 = r10.getPackageName();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.bb.m316a(r0, r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r9.f377c = r0;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x0081:
        if (r6 == 0) goto L_0x0183;
    L_0x0083:
        r0 = r6.moveToFirst();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x0183;
    L_0x0089:
        r0 = 0;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "{";
        r0 = r0.startsWith(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x01e9;
    L_0x0096:
        r1 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 0;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 0;
        r3 = r2.length();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.delete(r0, r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 1;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 != 0) goto L_0x01af;
    L_0x00b3:
        r0 = 1;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x00bb:
        r0 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = 2;
        r3 = r6.getString(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.<init>(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = "type";
        r3 = com.amap.p003a.bu.m473a(r0, r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r3 == 0) goto L_0x00d4;
    L_0x00cd:
        r3 = "type";
        r4 = "new";
        r0.put(r3, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x00d4:
        r3 = new com.autonavi.aps.amapapi.model.AMapLocationServer;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "";
        r3.<init>(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3.m789b(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = "mmac";
        r0 = com.amap.p003a.bu.m473a(r1, r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x02a0;
    L_0x00e6:
        r0 = "cgi";
        r0 = com.amap.p003a.bu.m473a(r1, r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x02a0;
    L_0x00ee:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "cgi";
        r4 = r1.getString(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "#";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "network#";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "cgi";
        r1 = r1.getString(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "#";
        r1 = r1.contains(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r1 == 0) goto L_0x028b;
    L_0x0128:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "cgiwifi";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x013b:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "&";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = r3.isOffset();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "&";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = r3.m803i();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.bd.m338a();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r5 = 0;
        r4 = r10;
        r0.m346a(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x016d:
        r0 = r6.moveToNext();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 != 0) goto L_0x0089;
    L_0x0173:
        r0 = 0;
        r1 = r2.length();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.delete(r0, r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 0;
        r1 = r8.length();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r8.delete(r0, r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x0183:
        if (r6 == 0) goto L_0x0188;
    L_0x0185:
        r6.close();	 Catch:{ all -> 0x0034 }
    L_0x0188:
        if (r7 == 0) goto L_0x0004;
    L_0x018a:
        r0 = r7.isOpen();	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0004;
    L_0x0190:
        r7.close();	 Catch:{ all -> 0x0034 }
        goto L_0x0004;
    L_0x0195:
        r0 = move-exception;
        r2 = "DB";
        r3 = "fetchHist";
        com.amap.p003a.bc.m330a(r0, r2, r3);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r0 = r0.getMessage();	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
        if (r2 != 0) goto L_0x01ac;
    L_0x01a7:
        r2 = "no such table";
        r0.contains(r2);	 Catch:{ Throwable -> 0x0309, all -> 0x02fc }
    L_0x01ac:
        r6 = r1;
        goto L_0x006c;
    L_0x01af:
        r0 = "mmac";
        r0 = com.amap.p003a.bu.m473a(r1, r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x00bb;
    L_0x01b7:
        r0 = "#";
        r0 = r2.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = "mmac";
        r3 = r1.getString(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.append(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = ",access";
        r2.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        goto L_0x00bb;
    L_0x01cd:
        r0 = move-exception;
        r1 = r6;
        r2 = r7;
    L_0x01d0:
        r3 = "DB";
        r4 = "fetchHist p2";
        com.amap.p003a.bc.m330a(r0, r3, r4);	 Catch:{ all -> 0x0300 }
        if (r1 == 0) goto L_0x01dc;
    L_0x01d9:
        r1.close();	 Catch:{ all -> 0x0034 }
    L_0x01dc:
        if (r2 == 0) goto L_0x0004;
    L_0x01de:
        r0 = r2.isOpen();	 Catch:{ all -> 0x0034 }
        if (r0 == 0) goto L_0x0004;
    L_0x01e4:
        r2.close();	 Catch:{ all -> 0x0034 }
        goto L_0x0004;
    L_0x01e9:
        r0 = 0;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.cf.m581b(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = new java.lang.String;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = r9.f377c;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.bb.m323d(r0, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "UTF-8";
        r3.<init>(r0, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 0;
        r3 = r2.length();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.delete(r0, r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = 1;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 != 0) goto L_0x026e;
    L_0x0217:
        r0 = 1;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.cf.m581b(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = new java.lang.String;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = r9.f377c;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = com.amap.p003a.bb.m323d(r0, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "UTF-8";
        r3.<init>(r0, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r2.append(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
    L_0x0230:
        r0 = 2;
        r0 = r6.getString(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = com.amap.p003a.cf.m581b(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = new java.lang.String;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r5 = r9.f377c;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = com.amap.p003a.bb.m323d(r3, r5);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r5 = "UTF-8";
        r4.<init>(r3, r5);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = "type";
        r3 = com.amap.p003a.bu.m473a(r0, r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r3 == 0) goto L_0x00d4;
    L_0x0253:
        r3 = "type";
        r4 = "new";
        r0.put(r3, r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        goto L_0x00d4;
    L_0x025c:
        r0 = move-exception;
    L_0x025d:
        if (r6 == 0) goto L_0x0262;
    L_0x025f:
        r6.close();	 Catch:{ all -> 0x0034 }
    L_0x0262:
        if (r7 == 0) goto L_0x026d;
    L_0x0264:
        r1 = r7.isOpen();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x026d;
    L_0x026a:
        r7.close();	 Catch:{ all -> 0x0034 }
    L_0x026d:
        throw r0;	 Catch:{ all -> 0x0034 }
    L_0x026e:
        r0 = "mmac";
        r0 = com.amap.p003a.bu.m473a(r1, r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x0230;
    L_0x0276:
        r0 = "#";
        r0 = r2.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r3 = "mmac";
        r3 = r1.getString(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.append(r3);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = ",access";
        r2.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        goto L_0x0230;
    L_0x028b:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "wifi";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        goto L_0x013b;
    L_0x02a0:
        r0 = "cgi";
        r0 = com.amap.p003a.bu.m473a(r1, r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r0 == 0) goto L_0x016d;
    L_0x02a8:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "cgi";
        r4 = r1.getString(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "#";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "network#";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "cgi";
        r1 = r1.getString(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r4 = "#";
        r1 = r1.contains(r4);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        if (r1 == 0) goto L_0x016d;
    L_0x02e2:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1.<init>();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r1 = "cgi";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x01cd, all -> 0x025c }
        goto L_0x013b;
    L_0x02f7:
        r0 = move-exception;
        r6 = r1;
        r7 = r1;
        goto L_0x025d;
    L_0x02fc:
        r0 = move-exception;
        r6 = r1;
        goto L_0x025d;
    L_0x0300:
        r0 = move-exception;
        r6 = r1;
        r7 = r2;
        goto L_0x025d;
    L_0x0305:
        r0 = move-exception;
        r2 = r1;
        goto L_0x01d0;
    L_0x0309:
        r0 = move-exception;
        r2 = r7;
        goto L_0x01d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bf.a(android.content.Context):void");
    }

    protected final synchronized void m350a(Context context, String str, String str2, long j) {
        Throwable th;
        Object obj;
        Cursor cursor = null;
        synchronized (this) {
            if (!(TextUtils.isEmpty(str) || context == null)) {
                String b = bu.m480b(str);
                String b2 = bu.m480b(str2);
                SQLiteDatabase openOrCreateDatabase;
                try {
                    int i;
                    ContentValues contentValues;
                    StringBuilder stringBuilder = new StringBuilder();
                    openOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                    try {
                        stringBuilder.append("CREATE TABLE IF NOT EXISTS hm");
                        stringBuilder.append(this.f376b);
                        stringBuilder.append(" (hash VARCHAR PRIMARY KEY, num INTEGER, extra VARCHAR, time VARCHAR);");
                        openOrCreateDatabase.execSQL(stringBuilder.toString());
                        stringBuilder.delete(0, stringBuilder.length());
                        stringBuilder.append("SELECT num FROM hm");
                        stringBuilder.append(this.f376b);
                        stringBuilder.append(" WHERE hash = '").append(b).append("';");
                        cursor = openOrCreateDatabase.rawQuery(stringBuilder.toString(), null);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bc.m330a(th, "DB", "updateHm p2");
                            if (cursor != null) {
                                cursor.close();
                            }
                            openOrCreateDatabase.close();
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            openOrCreateDatabase.close();
                            throw th;
                        }
                    }
                    if (cursor != null) {
                        if (cursor.moveToNext()) {
                            i = cursor.getInt(0);
                            if (i <= 0) {
                                i++;
                                contentValues = new ContentValues();
                                contentValues.put("num", Integer.valueOf(i));
                                contentValues.put("extra", b2);
                                contentValues.put("time", Long.valueOf(j));
                                openOrCreateDatabase.update("hm" + this.f376b, contentValues, "hash = '" + b + "'", null);
                            } else {
                                stringBuilder.delete(0, stringBuilder.length());
                                stringBuilder.append("REPLACE INTO ");
                                stringBuilder.append("hm").append(this.f376b);
                                stringBuilder.append(" VALUES (?, ?, ?, ?)");
                                openOrCreateDatabase.execSQL(stringBuilder.toString(), new Object[]{b, Integer.valueOf(1), b2, Long.valueOf(j)});
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            stringBuilder.delete(0, stringBuilder.length());
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                                openOrCreateDatabase.close();
                            }
                        }
                    }
                    i = 0;
                    if (i <= 0) {
                        stringBuilder.delete(0, stringBuilder.length());
                        stringBuilder.append("REPLACE INTO ");
                        stringBuilder.append("hm").append(this.f376b);
                        stringBuilder.append(" VALUES (?, ?, ?, ?)");
                        openOrCreateDatabase.execSQL(stringBuilder.toString(), new Object[]{b, Integer.valueOf(1), b2, Long.valueOf(j)});
                    } else {
                        i++;
                        contentValues = new ContentValues();
                        contentValues.put("num", Integer.valueOf(i));
                        contentValues.put("extra", b2);
                        contentValues.put("time", Long.valueOf(j));
                        openOrCreateDatabase.update("hm" + this.f376b, contentValues, "hash = '" + b + "'", null);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    stringBuilder.delete(0, stringBuilder.length());
                    if (cursor != null) {
                        cursor.close();
                    }
                    openOrCreateDatabase.close();
                } catch (Throwable th4) {
                    th = th4;
                    obj = cursor;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                        openOrCreateDatabase.close();
                    }
                    throw th;
                }
            }
        }
    }

    protected final void m351a(String str, AMapLocation aMapLocation, StringBuilder stringBuilder, Context context) {
        SQLiteDatabase openOrCreateDatabase;
        Throwable th;
        Cursor cursor = null;
        if (context != null) {
            if (this.f377c == null) {
                this.f377c = bb.m316a("MD5", context.getPackageName());
            }
            JSONObject jSONObject = new JSONObject();
            if (str.contains("&")) {
                str = str.substring(0, str.indexOf("&"));
            }
            String substring = str.substring(str.lastIndexOf("#") + 1);
            if (substring.equals("cgi")) {
                jSONObject.put("cgi", str.substring(0, str.length() - 12));
            } else if (!(TextUtils.isEmpty(stringBuilder) || stringBuilder.indexOf("access") == -1)) {
                jSONObject.put("cgi", str.substring(0, str.length() - (substring.length() + 9)));
                String[] split = stringBuilder.toString().split(",access");
                jSONObject.put("mmac", split[0].contains("#") ? split[0].substring(split[0].lastIndexOf("#") + 1) : split[0]);
            }
            if (bu.m473a(jSONObject, "cgi") || bu.m473a(jSONObject, "mmac")) {
                StringBuilder stringBuilder2 = new StringBuilder();
                try {
                    openOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                    try {
                        stringBuilder2.append("CREATE TABLE IF NOT EXISTS hist");
                        stringBuilder2.append(this.f376b);
                        stringBuilder2.append(" (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);");
                        openOrCreateDatabase.execSQL(stringBuilder2.toString());
                        stringBuilder2.delete(0, stringBuilder2.length());
                        stringBuilder2.append("REPLACE INTO ");
                        stringBuilder2.append("hist").append(this.f376b);
                        stringBuilder2.append(" VALUES (?, ?, ?, ?)");
                        Object[] objArr = new Object[]{bb.m322c(jSONObject.toString().getBytes(GameManager.DEFAULT_CHARSET), this.f377c), bb.m322c(stringBuilder.toString().getBytes(GameManager.DEFAULT_CHARSET), this.f377c), bb.m322c(aMapLocation.toStr().getBytes(GameManager.DEFAULT_CHARSET), this.f377c), Long.valueOf(aMapLocation.getTime())};
                        for (int i = 0; i < 3; i++) {
                            objArr[i] = cf.m577a((byte[]) objArr[i]);
                        }
                        openOrCreateDatabase.execSQL(stringBuilder2.toString(), objArr);
                        stringBuilder2.delete(0, stringBuilder2.length());
                        stringBuilder2.append("SELECT COUNT(*) AS total FROM ");
                        stringBuilder2.append("hist").append(this.f376b).append(";");
                        cursor = openOrCreateDatabase.rawQuery(stringBuilder2.toString(), null);
                        if (cursor != null) {
                            cursor.moveToFirst();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        stringBuilder2.delete(0, stringBuilder2.length());
                        if (openOrCreateDatabase == null || !openOrCreateDatabase.isOpen()) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bc.m330a(th, "DB", "updateHist");
                            if (cursor != null) {
                                cursor.close();
                            }
                            stringBuilder2.delete(0, stringBuilder2.length());
                            if (openOrCreateDatabase != null) {
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            stringBuilder2.delete(0, stringBuilder2.length());
                            openOrCreateDatabase.close();
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    openOrCreateDatabase = cursor;
                    if (cursor != null) {
                        cursor.close();
                    }
                    stringBuilder2.delete(0, stringBuilder2.length());
                    if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                        openOrCreateDatabase.close();
                    }
                    throw th;
                }
                openOrCreateDatabase.close();
            }
        }
    }

    public final synchronized void m352b(Context context) {
        Throwable th;
        if (context != null) {
            SQLiteDatabase openOrCreateDatabase;
            try {
                openOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                try {
                    if (m348a(openOrCreateDatabase, "hist")) {
                        openOrCreateDatabase.delete("hist" + this.f376b, "time<?", new String[]{String.valueOf(bu.m464a() - LogBuilder.MAX_INTERVAL)});
                        if (openOrCreateDatabase != null) {
                            if (openOrCreateDatabase.isOpen()) {
                                openOrCreateDatabase.close();
                            }
                        }
                    } else {
                        if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                            openOrCreateDatabase.close();
                        }
                        SQLiteDatabase sQLiteDatabase = null;
                        if (null != null) {
                            if (sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bc.m330a(th, "DB", "clearHist p2");
                        if (openOrCreateDatabase != null) {
                            if (openOrCreateDatabase.isOpen()) {
                                openOrCreateDatabase.close();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        openOrCreateDatabase.close();
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                openOrCreateDatabase = null;
                if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                    openOrCreateDatabase.close();
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final synchronized void m353c(android.content.Context r12) {
        /*
        r11 = this;
        r1 = 0;
        monitor-enter(r11);
        r0 = com.amap.p003a.av.f292a;	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        if (r12 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r11);
        return;
    L_0x000a:
        r0 = 0;
        r2 = "hmdb";
        r3 = 0;
        r4 = 0;
        r10 = r12.openOrCreateDatabase(r2, r3, r4);	 Catch:{ Throwable -> 0x00e9, all -> 0x0104 }
        r2 = "hm";
        r2 = r11.m348a(r10, r2);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        if (r2 != 0) goto L_0x003b;
    L_0x001b:
        if (r10 == 0) goto L_0x0026;
    L_0x001d:
        r2 = r10.isOpen();	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r10.close();	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
    L_0x0026:
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0029:
        r0.close();	 Catch:{ all -> 0x0038 }
    L_0x002c:
        if (r1 == 0) goto L_0x0008;
    L_0x002e:
        r0 = r2.isOpen();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0008;
    L_0x0034:
        r2.close();	 Catch:{ all -> 0x0038 }
        goto L_0x0008;
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r11);
        throw r0;
    L_0x003b:
        r2 = com.amap.p003a.bu.m464a();	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r4 = 1209600000; // 0x48190800 float:156704.0 double:5.97621805E-315;
        r2 = r2 - r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r4.<init>();	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = "SELECT hash, num, extra, time FROM ";
        r4.append(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = "hm";
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r5 = r11.f376b;	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0.append(r5);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = " WHERE time > ";
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0.append(r2);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = " ORDER BY num DESC LIMIT 0,";
        r4.append(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r2 = ";";
        r0.append(r2);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = r4.toString();	 Catch:{ Throwable -> 0x00d0, all -> 0x0117 }
        r2 = 0;
        r1 = r10.rawQuery(r0, r2);	 Catch:{ Throwable -> 0x00d0, all -> 0x0117 }
        r9 = r1;
    L_0x007b:
        r0 = 0;
        r1 = r4.length();	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r4.delete(r0, r1);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        if (r9 == 0) goto L_0x00be;
    L_0x0085:
        r0 = r9.moveToFirst();	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        if (r0 == 0) goto L_0x00be;
    L_0x008b:
        r0 = 0;
        r3 = r9.getString(r0);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r0 = 1;
        r5 = r9.getInt(r0);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r0 = 2;
        r4 = r9.getString(r0);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r0 = 3;
        r6 = r9.getLong(r0);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r0 = "{";
        r0 = r4.startsWith(r0);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        if (r0 != 0) goto L_0x00af;
    L_0x00a7:
        r3 = com.amap.p003a.bu.m488c(r3);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r4 = com.amap.p003a.bu.m488c(r4);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
    L_0x00af:
        r1 = com.amap.p003a.bg.m354a();	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r8 = 0;
        r2 = r12;
        r1.m357a(r2, r3, r4, r5, r6, r8);	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        r0 = r9.moveToNext();	 Catch:{ Throwable -> 0x0122, all -> 0x0119 }
        if (r0 != 0) goto L_0x008b;
    L_0x00be:
        if (r9 == 0) goto L_0x00c3;
    L_0x00c0:
        r9.close();	 Catch:{ all -> 0x0038 }
    L_0x00c3:
        if (r10 == 0) goto L_0x0008;
    L_0x00c5:
        r0 = r10.isOpen();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0008;
    L_0x00cb:
        r10.close();	 Catch:{ all -> 0x0038 }
        goto L_0x0008;
    L_0x00d0:
        r0 = move-exception;
        r2 = "DB";
        r3 = "fetchHm";
        com.amap.p003a.bc.m330a(r0, r2, r3);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r0 = r0.getMessage();	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
        if (r2 != 0) goto L_0x00e7;
    L_0x00e2:
        r2 = "no such table";
        r0.contains(r2);	 Catch:{ Throwable -> 0x011f, all -> 0x0117 }
    L_0x00e7:
        r9 = r1;
        goto L_0x007b;
    L_0x00e9:
        r0 = move-exception;
        r2 = r1;
    L_0x00eb:
        r3 = "DB";
        r4 = "fetchHm p2";
        com.amap.p003a.bc.m330a(r0, r3, r4);	 Catch:{ all -> 0x011c }
        if (r1 == 0) goto L_0x00f7;
    L_0x00f4:
        r1.close();	 Catch:{ all -> 0x0038 }
    L_0x00f7:
        if (r2 == 0) goto L_0x0008;
    L_0x00f9:
        r0 = r2.isOpen();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0008;
    L_0x00ff:
        r2.close();	 Catch:{ all -> 0x0038 }
        goto L_0x0008;
    L_0x0104:
        r0 = move-exception;
        r10 = r1;
    L_0x0106:
        if (r1 == 0) goto L_0x010b;
    L_0x0108:
        r1.close();	 Catch:{ all -> 0x0038 }
    L_0x010b:
        if (r10 == 0) goto L_0x0116;
    L_0x010d:
        r1 = r10.isOpen();	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0116;
    L_0x0113:
        r10.close();	 Catch:{ all -> 0x0038 }
    L_0x0116:
        throw r0;	 Catch:{ all -> 0x0038 }
    L_0x0117:
        r0 = move-exception;
        goto L_0x0106;
    L_0x0119:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0106;
    L_0x011c:
        r0 = move-exception;
        r10 = r2;
        goto L_0x0106;
    L_0x011f:
        r0 = move-exception;
        r2 = r10;
        goto L_0x00eb;
    L_0x0122:
        r0 = move-exception;
        r1 = r9;
        r2 = r10;
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bf.c(android.content.Context):void");
    }
}
