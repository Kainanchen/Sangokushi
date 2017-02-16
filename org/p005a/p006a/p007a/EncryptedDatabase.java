package org.p005a.p006a.p007a;

import a.does.not.Exists0;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: org.a.a.a.d */
public final class EncryptedDatabase implements Database {
    private final SQLiteDatabase f383a;

    static {
        fixHelper.fixfunc(new int[]{7822, 7823, 7824, 7825, 7826, 7827, 7828, 7829, 7830, 7831});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native EncryptedDatabase(SQLiteDatabase sQLiteDatabase);

    public final native Cursor m387a(String str, String[] strArr);

    public final native void m388a();

    public final native void m389a(String str);

    public final native DatabaseStatement m390b(String str);

    public final native void m391b();

    public final native void m392c();

    public final native boolean m393d();

    public final native void m394e();

    public final native Object m395f();
}
