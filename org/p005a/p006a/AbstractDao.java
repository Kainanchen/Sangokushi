package org.p005a.p006a;

import a.does.not.Exists0;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import org.p005a.p006a.p007a.Database;
import org.p005a.p006a.p007a.DatabaseStatement;
import org.p005a.p006a.p008b.IdentityScope;
import org.p005a.p006a.p008b.IdentityScopeLong;
import org.p005a.p006a.p009c.DaoConfig;
import org.p005a.p006a.p009c.TableStatements;

/* renamed from: org.a.a.a */
public abstract class AbstractDao<T, K> {
    protected final DaoConfig f387c;
    public final Database f388d;
    protected final boolean f389e;
    public final IdentityScope<K, T> f390f;
    protected final IdentityScopeLong<T> f391g;
    protected final TableStatements f392h;
    protected final AbstractDaoSession f393i;
    protected final int f394j;

    static {
        fixHelper.fixfunc(new int[]{32503, 32504, 32505, 32506, 32507, 32508, 32509, 32510, 32511, 32512, 32513, 32514, 32515, 32516, 32517, 32518, 32519, 32520});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native AbstractDao(DaoConfig daoConfig, AbstractDaoSession abstractDaoSession);

    private native long m419a(T t, DatabaseStatement databaseStatement);

    private native List<T> m420a(Cursor cursor);

    private native void m421a(Cursor cursor, CursorWindow cursorWindow, List<T> list);

    private native void m422a(K k, T t, boolean z);

    private native long m423b(T t, DatabaseStatement databaseStatement);

    private native CursorWindow m425d(Cursor cursor);

    private native void m426d();

    public abstract K m427a(Cursor cursor, int i);

    public final native T m428a(Cursor cursor, int i, boolean z);

    public abstract K m429a(T t);

    public abstract K m430a(T t, long j);

    public final native String m431a();

    public abstract void m432a(SQLiteStatement sQLiteStatement, T t);

    public abstract void m433a(DatabaseStatement databaseStatement, T t);

    protected final native T m434b(Cursor cursor);

    public abstract T m435b(Cursor cursor, int i);

    public native void m436b(T t);

    public final native Property[] m437b();

    public final native T m438c(K k);

    protected final native List<T> m439c(Cursor cursor);

    public final native String[] m440c();

    public final native long m441d(T t);

    public final native void m442e(T t);

    private static void m424c(K k, DatabaseStatement databaseStatement) {
        if (k instanceof Long) {
            databaseStatement.m381a(1, ((Long) k).longValue());
        } else if (k == null) {
            throw new DaoException("Cannot delete entity, key is null");
        } else {
            databaseStatement.m382a(1, k.toString());
        }
        databaseStatement.m380a();
    }
}
