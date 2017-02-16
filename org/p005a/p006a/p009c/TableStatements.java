package org.p005a.p006a.p009c;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import org.p005a.p006a.p007a.Database;
import org.p005a.p006a.p007a.DatabaseStatement;

/* renamed from: org.a.a.c.e */
public final class TableStatements {
    public final String f426a;
    public final String[] f427b;
    public final String[] f428c;
    public volatile String f429d;
    public volatile String f430e;
    private final Database f431f;
    private DatabaseStatement f432g;
    private DatabaseStatement f433h;

    static {
        fixHelper.fixfunc(new int[]{33220, 33221, 33222});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native TableStatements(Database database, String str, String[] strArr, String[] strArr2);

    public final native DatabaseStatement m492a();

    public final native DatabaseStatement m493b();
}
