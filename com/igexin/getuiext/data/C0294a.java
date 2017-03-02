package com.igexin.getuiext.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alipay.sdk.cons.C0167c;
import com.tencent.wxop.stat.common.StatConstants;
import com.zkunity.app.ResourceIDs;

/* renamed from: com.igexin.getuiext.data.a */
public class C0294a extends SQLiteOpenHelper {
    public static long f791a;
    public static long f792b;
    public static C0294a f793c;
    SQLiteDatabase f794d;

    static {
        f791a = 0;
        f792b = 0;
    }

    public C0294a(Context context) {
        super(context, "increment.db", null, 3);
        this.f794d = null;
        f793c = this;
        m1002c();
    }

    private void m1001a(String str, int i, String str2, long j) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ResourceIDs.ID, Integer.valueOf(i));
            contentValues.put(C0167c.f364e, str2);
            contentValues.put("value", Long.valueOf(j));
            this.f794d.replace(str, null, contentValues);
        } catch (Exception e) {
        }
    }

    private void m1002c() {
        Throwable th;
        Cursor cursor;
        Throwable th2;
        Cursor cursor2 = null;
        this.f794d = getReadableDatabase();
        try {
            cursor2 = this.f794d.rawQuery("select id, value from config order by id", null);
            if (cursor2 != null) {
                while (cursor2.moveToNext()) {
                    try {
                        switch (cursor2.getInt(0)) {
                            case StatConstants.XG_PRO_VERSION /*1*/:
                                f791a = cursor2.getLong(1);
                                break;
                            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                                break;
                            case StatConstants.STAT_DB_VERSION /*3*/:
                                f792b = cursor2.getLong(1);
                                break;
                            default:
                                break;
                        }
                    } catch (Exception e) {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor2;
                        th2 = th;
                    }
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Exception e2) {
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Throwable th32) {
            th = th32;
            cursor = cursor2;
            th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public Cursor m1003a(String str) {
        return m1004a(str, null, null, null, null, null, null);
    }

    public Cursor m1004a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        this.f794d = getReadableDatabase();
        try {
            return this.f794d.query(str, strArr, str2, strArr2, str3, str4, str5);
        } catch (Exception e) {
            return null;
        }
    }

    public void m1005a() {
        this.f794d = getWritableDatabase();
        m1001a("config", 1, "lastUploadAppListTime", f791a);
    }

    public void m1006a(String str, ContentValues contentValues) {
        this.f794d = getWritableDatabase();
        try {
            this.f794d.insert(str, null, contentValues);
        } catch (Exception e) {
        }
    }

    public void m1007a(String str, String str2, String[] strArr) {
        this.f794d = getWritableDatabase();
        try {
            this.f794d.delete(str, str2, strArr);
        } catch (Exception e) {
        }
    }

    public void m1008b() {
        this.f794d = getWritableDatabase();
        m1001a("config", 3, "lastBindCIDTime", f792b);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table if not exists config (id integer primary key,name text,value text)");
            sQLiteDatabase.execSQL("create table if not exists appinfo(download_id integer primary key, name text, pkgName text,  versionCode integer, versionName text, logo text, fullSize long, diffSize long, url text, updateType text, diffChecksum text, fullChecksum text)");
            sQLiteDatabase.execSQL("create table if not exists biinfo (id integer primary key, value text, bitype text)");
        } catch (Exception e) {
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS appinfo");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS biinfo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        onCreate(sQLiteDatabase);
    }
}
