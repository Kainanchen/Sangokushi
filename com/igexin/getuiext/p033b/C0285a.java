package com.igexin.getuiext.p033b;

import android.content.ContentValues;
import android.database.Cursor;
import com.alipay.sdk.cons.C0167c;
import com.igexin.getuiext.data.C0294a;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.data.p034a.C0293f;
import com.tencent.open.SocialConstants;

/* renamed from: com.igexin.getuiext.b.a */
public class C0285a {
    private C0294a f757a;

    public C0285a(C0294a c0294a) {
        this.f757a = c0294a;
    }

    public C0288a m988a(int i) {
        C0288a c0288a = null;
        Cursor a = this.f757a.m1004a("appinfo", null, "download_id = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (a != null) {
            if (a.moveToFirst()) {
                c0288a = new C0292e();
                c0288a.a = a.getString(a.getColumnIndexOrThrow(C0167c.f364e));
                c0288a.b = a.getString(a.getColumnIndexOrThrow("pkgName"));
                c0288a.d = a.getInt(a.getColumnIndexOrThrow("versionCode"));
                c0288a.c = a.getString(a.getColumnIndexOrThrow("versionName"));
                c0288a.f782o = a.getLong(a.getColumnIndexOrThrow("diffSize"));
                c0288a.i = a.getLong(a.getColumnIndexOrThrow("fullSize"));
                c0288a.f = a.getString(a.getColumnIndexOrThrow("logo"));
                c0288a.g = a.getString(a.getColumnIndexOrThrow(SocialConstants.PARAM_URL));
                c0288a.f781n = C0293f.m999a(a.getString(a.getColumnIndexOrThrow("updateType")));
                c0288a.f783p = a.getString(a.getColumnIndexOrThrow("diffChecksum"));
                c0288a.f784q = a.getString(a.getColumnIndexOrThrow("fullChecksum"));
            }
            a.close();
        }
        return c0288a;
    }

    public void m989a(int i, C0288a c0288a) {
        if (c0288a != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("download_id", Integer.valueOf(i));
            if (c0288a.f764a != null) {
                contentValues.put(C0167c.f364e, c0288a.f764a);
            }
            if (c0288a.f765b != null) {
                contentValues.put("pkgName", c0288a.f765b);
            }
            if (c0288a.f766c != null) {
                contentValues.put("versionName", c0288a.f766c);
            }
            contentValues.put("versionCode", Integer.valueOf(c0288a.f767d));
            if (c0288a instanceof C0291d) {
                if (((C0291d) c0288a).f773f != null) {
                    contentValues.put("logo", ((C0291d) c0288a).f773f);
                }
                contentValues.put("fullSize", Long.valueOf(((C0291d) c0288a).f776i));
                if (((C0291d) c0288a).f774g != null) {
                    contentValues.put(SocialConstants.PARAM_URL, ((C0291d) c0288a).f774g);
                }
                if (c0288a instanceof C0292e) {
                    C0292e c0292e = (C0292e) c0288a;
                    contentValues.put("diffSize", Long.valueOf(c0292e.f782o));
                    if (c0292e.f781n != null) {
                        contentValues.put("updateType", c0292e.f781n.name());
                    }
                    if (c0292e.f783p != null) {
                        contentValues.put("diffChecksum", c0292e.f783p);
                    }
                    if (c0292e.f784q != null) {
                        contentValues.put("fullChecksum", c0292e.f784q);
                    }
                }
            }
            this.f757a.m1006a("appinfo", contentValues);
        }
    }

    public void m990b(int i) {
        this.f757a.m1007a("appinfo", "download_id = ?", new String[]{String.valueOf(i)});
    }
}
