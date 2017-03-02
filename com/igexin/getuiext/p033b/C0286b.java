package com.igexin.getuiext.p033b;

import android.content.ContentValues;
import android.database.Cursor;
import com.igexin.getuiext.data.C0294a;
import com.igexin.getuiext.data.p034a.C0289b;
import com.zkunity.app.ResourceIDs;
import java.util.ArrayList;

/* renamed from: com.igexin.getuiext.b.b */
public class C0286b {
    private C0294a f758a;

    public C0286b(C0294a c0294a) {
        this.f758a = null;
        this.f758a = c0294a;
    }

    public ArrayList m991a(String str) {
        ArrayList arrayList = null;
        Cursor a = this.f758a.m1004a("biinfo", null, "bitype=?", new String[]{str}, null, null, null);
        if (a != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < 20 && a.moveToNext(); i++) {
                C0289b c0289b = new C0289b();
                int i2 = a.getInt(a.getColumnIndex(ResourceIDs.ID));
                String string = a.getString(a.getColumnIndex("value"));
                c0289b.f769a = i2;
                c0289b.f770b = string;
                c0289b.f771c = str;
                arrayList.add(c0289b);
            }
            a.close();
        }
        return arrayList;
    }

    public void m992a(String str, int i) {
        Cursor a = this.f758a.m1003a("biinfo");
        if (a != null && a.getCount() >= 20) {
            a.moveToFirst();
            int i2 = a.getInt(a.getColumnIndex(ResourceIDs.ID));
            this.f758a.m1007a("biinfo", "id = ?", new String[]{String.valueOf(i2)});
        }
        if (a != null) {
            a.close();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("bitype", String.valueOf(i));
        this.f758a.m1006a("biinfo", contentValues);
    }

    public void m993b(String str) {
        this.f758a.m1007a("biinfo", "bitype = ?", new String[]{str});
    }
}
