package com.igexin.push.core.p044c;

import android.content.ContentValues;
import com.igexin.push.p039b.C0343d;

/* renamed from: com.igexin.push.core.c.e */
class C0443e extends C0343d {
    final /* synthetic */ long f1204a;
    final /* synthetic */ C0441c f1205b;

    C0443e(C0441c c0441c, ContentValues contentValues, long j) {
        this.f1205b = c0441c;
        this.f1204a = j;
        super(contentValues);
    }

    public void m1576a() {
        this.c.delete("ral", "id=?", new String[]{String.valueOf(this.f1204a)});
    }
}
