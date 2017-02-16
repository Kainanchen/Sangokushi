package org.p005a.p006a.p007a;

import a.does.not.Exists0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: org.a.a.a.f */
public final class StandardDatabase implements Database {
    private final SQLiteDatabase f385a;

    static {
        fixHelper.fixfunc(new int[]{7240, 7241, 7242, 7243, 7244, 7245, 7246, 7247, 7248, 7249});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native StandardDatabase(SQLiteDatabase sQLiteDatabase);

    public final native Cursor m403a(String str, String[] strArr);

    public final native void m404a();

    public final native void m405a(String str);

    public final native DatabaseStatement m406b(String str);

    public final native void m407b();

    public final native void m408c();

    public final native boolean m409d();

    public final native void m410e();

    public final native Object m411f();
}
