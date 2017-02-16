package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.util.Log;
import com.ali.fixHelper;

public final class SQLiteDebug {
    public static final boolean DEBUG_ACTIVE_CURSOR_FINALIZATION = false;
    public static final boolean DEBUG_LOCK_TIME_TRACKING = false;
    public static final boolean DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = false;
    public static final boolean DEBUG_SQL_CACHE = false;
    public static final boolean DEBUG_SQL_STATEMENTS = false;
    public static final boolean DEBUG_SQL_TIME = false;
    private static int sNumActiveCursorsFinalized;

    public static class DbStats {
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        static {
            fixHelper.fixfunc(new int[]{32989, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native DbStats(String str, long j, long j2, int i);
    }

    static {
        fixHelper.fixfunc(new int[]{10734, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public static native long getHeapAllocatedSize();

    public static native void getHeapDirtyPages(int[] iArr);

    public static native long getHeapFreeSize();

    public static native long getHeapSize();

    public static native void getPagerStats(PagerStats pagerStats);

    static void __clinit__() {
        DEBUG_SQL_STATEMENTS = Log.isLoggable("SQLiteStatements", 2);
        DEBUG_SQL_TIME = Log.isLoggable("SQLiteTime", 2);
        DEBUG_SQL_CACHE = Log.isLoggable("SQLiteCompiledSql", 2);
        DEBUG_ACTIVE_CURSOR_FINALIZATION = Log.isLoggable("SQLiteCursorClosing", 2);
        DEBUG_LOCK_TIME_TRACKING = Log.isLoggable("SQLiteLockTime", 2);
        DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = Log.isLoggable("SQLiteLockStackTrace", 2);
        sNumActiveCursorsFinalized = 0;
    }

    public static PagerStats getDatabaseInfo() {
        PagerStats pagerStats = new PagerStats();
        getPagerStats(pagerStats);
        pagerStats.dbStats = SQLiteDatabase.getDbStats();
        return pagerStats;
    }

    public static int getNumActiveCursorsFinalized() {
        return sNumActiveCursorsFinalized;
    }

    static synchronized void notifyActiveCursorFinalized() {
        synchronized (SQLiteDebug.class) {
            sNumActiveCursorsFinalized++;
        }
    }
}
