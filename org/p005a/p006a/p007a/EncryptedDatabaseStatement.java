package org.p005a.p006a.p007a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.database.SQLiteStatement;

/* renamed from: org.a.a.a.e */
public final class EncryptedDatabaseStatement implements DatabaseStatement {
    private final SQLiteStatement f384a;

    static {
        fixHelper.fixfunc(new int[]{7069, 7070, 7071, 7072, 7073, 7074, 7075, 7076});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native EncryptedDatabaseStatement(SQLiteStatement sQLiteStatement);

    public final native void m396a();

    public final native void m397a(int i, long j);

    public final native void m398a(int i, String str);

    public final native long m399b();

    public final native void m400c();

    public final native void m401d();

    public final native Object m402e();
}
