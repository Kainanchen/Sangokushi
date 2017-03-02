package com.igexin.push.core.p048b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0366a;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.igexin.push.core.b.e */
public class C0421e implements C0366a {
    private static C0421e f1093a;
    private Map f1094b;
    private Map f1095c;

    public C0421e() {
        this.f1094b = new HashMap();
        this.f1095c = new HashMap();
    }

    private ContentValues m1441a(C0424h c0424h) {
        if (c0424h == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pkgname", c0424h.m1460a());
        contentValues.put("signature", c0424h.m1468d());
        contentValues.put("permissions", m1448a(c0424h.m1469e()));
        if (c0424h.m1464b() == null || c0424h.m1464b().equals(Constants.STR_EMPTY)) {
            contentValues.put("accesstoken", Constants.STR_EMPTY);
        } else {
            contentValues.put("accesstoken", C0227a.m724b(c0424h.m1464b().getBytes(), C0483g.f1290B));
            m1445b(c0424h.m1464b(), c0424h.m1460a());
        }
        contentValues.put("expire", Long.valueOf(c0424h.m1466c()));
        return contentValues;
    }

    public static C0421e m1442a() {
        if (f1093a == null) {
            f1093a = new C0421e();
        }
        return f1093a;
    }

    private void m1443a(ContentValues contentValues) {
        if (contentValues != null) {
            C0244d.m802c().m795a(new C0422f(this, contentValues), false, true);
        }
    }

    private void m1444b() {
        C0244d.m802c().m795a(new C0423g(this), false, true);
    }

    private void m1445b(String str, String str2) {
        this.f1095c.put(str, str2);
    }

    private List m1446c() {
        List arrayList = new ArrayList();
        C0424h c0424h = new C0424h();
        List arrayList2 = new ArrayList();
        arrayList2.add(C0425i.START_SERVICE);
        arrayList2.add(C0425i.STOP_SERVICE);
        arrayList2.add(C0425i.IS_STARTED);
        arrayList2.add(C0425i.SET_SILENTTIME);
        c0424h.m1462a("com.igexin.pushmanager");
        c0424h.m1467c("308202133082017ca00302010202045080e7f1300d06092a864886f70d0101050500304e310b300906035504061302636e310b300906035504081302636e310b300906035504071302636e310b3009060355040a1302636e310b3009060355040b1302636e310b300906035504031302636e301e170d3132313031393035343130355a170d3232313031373035343130355a304e310b300906035504061302636e310b300906035504081302636e310b300906035504071302636e310b3009060355040a1302636e310b3009060355040b1302636e310b300906035504031302636e30819f300d06092a864886f70d010101050003818d0030818902818100805aee69ca3415ca32130b233fc07ad6eb666dcfe119efad8e5d0e4d51e175c6468a3869a5c131c342e5261a93f3bc30303ae0f23a3824d28df692092f8cf72ba7f2251f005ebfb1c1b210dc377aacf2168809f07e8d6756e6214c0288314388a2ead4a4453d358aa8cb1e2f02d1604c63cd0d075a558c718c43e3922f5198b50203010001300d06092a864886f70d0101050500038181004a4dc5634909f61710cf35229a63d7b8d2bfd89891d6ada1704b6c614d694cce35383cfb1fd8fed192dea23552413e74a9e1ff6e280246a6e30178a9b221b2dfee032cfc6acf660d62b514df92bbcf23e992a0543003705c679ba2fbae5acad0d89c6e44ee1cb05085d300ae60b7318472579007bde0e09ad75675a26a2f1c85");
        c0424h.m1463a(arrayList2);
        arrayList.add(c0424h);
        return arrayList;
    }

    public C0424h m1447a(String str) {
        return (C0424h) this.f1094b.get(str);
    }

    public String m1448a(List list) {
        String str = Constants.STR_EMPTY;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == C0425i.START_SERVICE) {
                str = str + Constants.VIA_RESULT_SUCCESS;
            } else if (list.get(i) == C0425i.STOP_SERVICE) {
                str = str + Constants.VIA_TO_TYPE_QQ_GROUP;
            } else if (list.get(i) == C0425i.IS_STARTED) {
                str = str + Constants.VIA_SSO_LOGIN;
            } else if (list.get(i) == C0425i.SET_SILENTTIME) {
                str = str + Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP;
            }
            if (i != list.size() - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    public Map m1449a(Map map, Map map2) {
        for (Entry entry : map.entrySet()) {
            map2.put(entry.getKey().toString(), (C0424h) entry.getValue());
        }
        return map2;
    }

    public void m1450a(SQLiteDatabase sQLiteDatabase) {
    }

    public void m1451a(String str, C0424h c0424h) {
        this.f1094b.put(str, c0424h);
        m1443a(m1441a(c0424h));
    }

    public void m1452a(Map map) {
        Map a = m1449a(this.f1094b, new HashMap());
        m1444b();
        this.f1094b.clear();
        this.f1095c.clear();
        for (Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            C0424h c0424h = (C0424h) entry.getValue();
            C0424h c0424h2 = (C0424h) a.get(obj);
            if (c0424h2 != null) {
                c0424h.m1465b(c0424h2.m1464b());
                c0424h.m1461a(c0424h2.m1466c());
            }
            m1451a(obj, c0424h);
        }
    }

    public boolean m1453a(String str, String str2) {
        C0424h a = m1447a(str);
        return a != null && a.m1468d().equals(str2);
    }

    public String m1454b(String str) {
        return (String) this.f1095c.get(str);
    }

    public void m1455b(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        Throwable th;
        Cursor cursor = null;
        try {
            rawQuery = sQLiteDatabase.rawQuery("select * from ca order by pkgname", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        while (rawQuery.moveToNext()) {
                            String str;
                            C0424h c0424h = new C0424h();
                            c0424h.m1462a(rawQuery.getString(rawQuery.getColumnIndex("pkgname")));
                            c0424h.m1467c(rawQuery.getString(rawQuery.getColumnIndex("signature")));
                            c0424h.m1463a(m1456c(rawQuery.getString(rawQuery.getColumnIndex("permissions"))));
                            byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex("accesstoken"));
                            if (blob != null) {
                                str = new String(C0227a.m722a(blob, C0483g.f1290B));
                                m1445b(str, c0424h.m1460a());
                            } else {
                                str = null;
                            }
                            c0424h.m1465b(str);
                            c0424h.m1461a(rawQuery.getLong(rawQuery.getColumnIndex("expire")));
                            this.f1094b.put(c0424h.m1460a(), c0424h);
                        }
                    } else {
                        List c = m1446c();
                        for (int i = 0; i < c.size(); i++) {
                            C0424h c0424h2 = (C0424h) c.get(i);
                            m1451a(c0424h2.m1460a(), c0424h2);
                        }
                    }
                } catch (Exception e) {
                    cursor = rawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e2) {
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            rawQuery = null;
            th = th4;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    public List m1456c(String str) {
        List arrayList = new ArrayList();
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(Constants.VIA_RESULT_SUCCESS)) {
                arrayList.add(C0425i.START_SERVICE);
            } else if (split[i].equals(Constants.VIA_TO_TYPE_QQ_GROUP)) {
                arrayList.add(C0425i.STOP_SERVICE);
            } else if (split[i].equals(Constants.VIA_SSO_LOGIN)) {
                arrayList.add(C0425i.IS_STARTED);
            } else if (split[i].equals(Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP)) {
                arrayList.add(C0425i.SET_SILENTTIME);
            }
        }
        return arrayList;
    }

    public void m1457c(SQLiteDatabase sQLiteDatabase) {
    }
}
