package org.p005a.p006a.p007a;

import a.does.not.Exists0;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: org.a.a.a.g */
public final class StandardDatabaseStatement implements DatabaseStatement {
    private final SQLiteStatement f386a;

    static {
        fixHelper.fixfunc(new int[]{6632, 6633, 6634, 6635, 6636, 6637, 6638, 6639});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native StandardDatabaseStatement(SQLiteStatement sQLiteStatement);

    public final native void m412a();

    public final native void m413a(int i, long j);

    public final native void m414a(int i, String str);

    public final native long m415b();

    public final native void m416c();

    public final native void m417d();

    public final native Object m418e();
}
