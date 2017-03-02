package com.igexin.push.config;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.push.core.p044c.C0366a;
import com.zkunity.app.ResourceIDs;

/* renamed from: com.igexin.push.config.a */
public class C0367a implements C0366a {
    private static C0367a f1002a;

    public static C0367a m1224a() {
        if (f1002a == null) {
            f1002a = new C0367a();
        }
        return f1002a;
    }

    private void m1225a(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete("config", "id = ?", new String[]{String.valueOf(i)});
    }

    private void m1226a(SQLiteDatabase sQLiteDatabase, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ResourceIDs.ID, Integer.valueOf(i));
        contentValues.put("value", str);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    private void m1227a(SQLiteDatabase sQLiteDatabase, int i, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ResourceIDs.ID, Integer.valueOf(i));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    public void m1231a(SQLiteDatabase sQLiteDatabase) {
    }

    public void m1232a(String str) {
        C0244d.m802c().m795a(new C0374h(this, str), true, false);
    }

    public void m1233b() {
        C0244d.m802c().m795a(new C0368b(this), false, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1234b(android.database.sqlite.SQLiteDatabase r7) {
        /*
        r6 = this;
        r1 = 0;
        r0 = "select id, value from config order by id";
        r2 = 0;
        r0 = r7.rawQuery(r0, r2);	 Catch:{ Exception -> 0x02b0, all -> 0x02ad }
        if (r0 == 0) goto L_0x028e;
    L_0x000a:
        r2 = r0.moveToNext();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x028e;
    L_0x0010:
        r2 = 0;
        r3 = 1;
        r4 = r0.getInt(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = 20;
        if (r4 == r2) goto L_0x0026;
    L_0x001a:
        r2 = 21;
        if (r4 == r2) goto L_0x0026;
    L_0x001e:
        r2 = 22;
        if (r4 == r2) goto L_0x0026;
    L_0x0022:
        r2 = 24;
        if (r4 != r2) goto L_0x008b;
    L_0x0026:
        r2 = r0.getBlob(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r3 = r1;
    L_0x002b:
        switch(r4) {
            case 1: goto L_0x002f;
            case 2: goto L_0x0097;
            case 3: goto L_0x00b7;
            case 4: goto L_0x00cd;
            case 5: goto L_0x00e1;
            case 6: goto L_0x00f5;
            case 7: goto L_0x0109;
            case 8: goto L_0x011d;
            case 9: goto L_0x0131;
            case 10: goto L_0x0145;
            case 11: goto L_0x0159;
            case 12: goto L_0x016d;
            case 13: goto L_0x0181;
            case 14: goto L_0x0195;
            case 15: goto L_0x01a9;
            case 16: goto L_0x01c7;
            case 17: goto L_0x01e5;
            case 18: goto L_0x01f9;
            case 19: goto L_0x020d;
            case 20: goto L_0x0221;
            case 21: goto L_0x0241;
            case 22: goto L_0x0252;
            case 23: goto L_0x0263;
            case 24: goto L_0x0277;
            default: goto L_0x002e;
        };	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
    L_0x002e:
        goto L_0x000a;
    L_0x002f:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x0092;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        r2 = r2.intValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1014a = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x003f:
        r2 = move-exception;
    L_0x0040:
        if (r0 == 0) goto L_0x0045;
    L_0x0042:
        r0.close();
    L_0x0045:
        r0 = "2.7.0.0";
        r2 = com.igexin.push.core.C0483g.f1301M;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x02ac;
    L_0x004f:
        r0 = com.igexin.push.config.C0378l.f1033t;
        if (r0 == 0) goto L_0x029a;
    L_0x0053:
        r0 = com.igexin.push.config.C0378l.f1033t;
        r0 = r0.m1504b();
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0295;
    L_0x005f:
        r0 = com.igexin.push.config.C0378l.f1033t;
        r0 = r0.m1504b();
        r0 = r0.keySet();
        r2 = r0.iterator();
    L_0x006d:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0295;
    L_0x0073:
        r0 = com.igexin.push.config.C0378l.f1033t;
        r0 = r0.m1504b();
        r3 = r2.next();
        r0 = r0.get(r3);
        r0 = (com.igexin.push.core.bean.C0431e) r0;
        r0 = r0.m1489c();
        com.igexin.push.p052f.C0513b.m1850a(r0);
        goto L_0x006d;
    L_0x008b:
        r2 = r0.getString(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r3 = r2;
        r2 = r1;
        goto L_0x002b;
    L_0x0092:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x0038;
    L_0x0097:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x00b2;
    L_0x009f:
        r2 = r1;
    L_0x00a0:
        r2 = r2.intValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1015b = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x00a8:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00ac:
        if (r1 == 0) goto L_0x00b1;
    L_0x00ae:
        r1.close();
    L_0x00b1:
        throw r0;
    L_0x00b2:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x00a0;
    L_0x00b7:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x00c8;
    L_0x00bf:
        r2 = r1;
    L_0x00c0:
        r2 = r2.longValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1016c = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x00c8:
        r2 = java.lang.Long.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x00c0;
    L_0x00cd:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x00d5:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1019f = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x00e1:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x00e9:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1020g = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x00f5:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x00fd:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1021h = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0109:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0111:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1022i = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x011d:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0125:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1023j = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0131:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0139:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1024k = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0145:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x014d:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1027n = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0159:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0161:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1028o = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x016d:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0175:
        r2 = java.lang.Long.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.longValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1029p = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0181:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0189:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1025l = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0195:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x019d:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1026m = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x01a9:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x01b1:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x01c2;
    L_0x01b9:
        r2 = r1;
    L_0x01ba:
        r2 = r2.intValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1017d = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x01c2:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x01ba;
    L_0x01c7:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x01cf:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 == 0) goto L_0x01e0;
    L_0x01d7:
        r2 = r1;
    L_0x01d8:
        r2 = r2.intValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1018e = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x01e0:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x01d8;
    L_0x01e5:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x01ed:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1030q = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x01f9:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0201:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1031r = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x020d:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x0215:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1032s = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0221:
        if (r2 == 0) goto L_0x000a;
    L_0x0223:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r4 = com.igexin.push.core.C0483g.f1290B;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r2, r4);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r3 == 0) goto L_0x000a;
    L_0x0230:
        r2 = com.igexin.push.core.p045a.C0402e.m1330a();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r4 = new org.json.JSONObject;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.m1343a(r4);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1033t = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0241:
        if (r2 == 0) goto L_0x000a;
    L_0x0243:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r4 = com.igexin.push.core.C0483g.f1290B;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r2, r4);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1034u = r3;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0252:
        if (r2 == 0) goto L_0x000a;
    L_0x0254:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r4 = com.igexin.push.core.C0483g.f1290B;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r2, r4);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1035v = r3;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0263:
        r2 = "null";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        if (r2 != 0) goto L_0x000a;
    L_0x026b:
        r2 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        com.igexin.push.config.C0378l.f1036w = r2;	 Catch:{ Exception -> 0x003f, all -> 0x00a8 }
        goto L_0x000a;
    L_0x0277:
        if (r2 == 0) goto L_0x000a;
    L_0x0279:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x028b, all -> 0x00a8 }
        r4 = com.igexin.push.core.C0483g.f1290B;	 Catch:{ Exception -> 0x028b, all -> 0x00a8 }
        r2 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r2, r4);	 Catch:{ Exception -> 0x028b, all -> 0x00a8 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x028b, all -> 0x00a8 }
        if (r3 == 0) goto L_0x000a;
    L_0x0286:
        com.igexin.push.config.C0380n.m1255a(r3);	 Catch:{ Exception -> 0x028b, all -> 0x00a8 }
        goto L_0x000a;
    L_0x028b:
        r2 = move-exception;
        goto L_0x000a;
    L_0x028e:
        if (r0 == 0) goto L_0x0045;
    L_0x0290:
        r0.close();
        goto L_0x0045;
    L_0x0295:
        com.igexin.push.config.C0378l.f1033t = r1;
        r6.m1241h();
    L_0x029a:
        r0 = com.igexin.push.core.p044c.C0444f.m1577a();
        r1 = "2.7.0.0";
        r0.m1602c(r1);
        r0 = com.igexin.push.core.p044c.C0444f.m1577a();
        r2 = 0;
        r0.m1608g(r2);
    L_0x02ac:
        return;
    L_0x02ad:
        r0 = move-exception;
        goto L_0x00ac;
    L_0x02b0:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.config.a.b(android.database.sqlite.SQLiteDatabase):void");
    }

    public void m1235c() {
        C0244d.m802c().m795a(new C0369c(this), false, true);
    }

    public void m1236c(SQLiteDatabase sQLiteDatabase) {
        m1226a(sQLiteDatabase, 1, String.valueOf(C0378l.f1014a));
        m1226a(sQLiteDatabase, 2, String.valueOf(C0378l.f1015b));
        m1226a(sQLiteDatabase, 3, String.valueOf(C0378l.f1016c));
        m1226a(sQLiteDatabase, 4, String.valueOf(C0378l.f1019f));
        m1226a(sQLiteDatabase, 5, String.valueOf(C0378l.f1020g));
        m1226a(sQLiteDatabase, 6, String.valueOf(C0378l.f1021h));
        m1226a(sQLiteDatabase, 7, String.valueOf(C0378l.f1022i));
        m1226a(sQLiteDatabase, 8, String.valueOf(C0378l.f1023j));
        m1226a(sQLiteDatabase, 9, String.valueOf(C0378l.f1024k));
        m1226a(sQLiteDatabase, 10, String.valueOf(C0378l.f1027n));
        m1226a(sQLiteDatabase, 11, String.valueOf(C0378l.f1028o));
        m1226a(sQLiteDatabase, 12, String.valueOf(C0378l.f1029p));
        m1226a(sQLiteDatabase, 13, String.valueOf(C0378l.f1025l));
        m1226a(sQLiteDatabase, 14, String.valueOf(C0378l.f1026m));
        m1226a(sQLiteDatabase, 15, String.valueOf(C0378l.f1017d));
        m1226a(sQLiteDatabase, 3, String.valueOf(C0378l.f1016c));
        m1226a(sQLiteDatabase, 17, String.valueOf(C0378l.f1030q));
        m1226a(sQLiteDatabase, 18, String.valueOf(C0378l.f1031r));
        m1226a(sQLiteDatabase, 19, String.valueOf(C0378l.f1032s));
    }

    public void m1237d() {
        C0244d.m802c().m795a(new C0370d(this), false, true);
    }

    public void m1238e() {
        C0244d.m802c().m795a(new C0371e(this), false, true);
    }

    public void m1239f() {
        C0244d.m802c().m795a(new C0372f(this), false, true);
    }

    public void m1240g() {
        C0244d.m802c().m795a(new C0373g(this), true, false);
    }

    public void m1241h() {
        C0244d.m802c().m795a(new C0375i(this), true, false);
    }
}
