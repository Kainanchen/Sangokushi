package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.DefaultDatabaseErrorHandler;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDebug.DbStats;

public class SQLiteDatabase extends SQLiteClosable {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES;
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final Pattern EMAIL_IN_DB_PATTERN;
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "3.5.4";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases;
    private static int sQueryLogTimeInMillis;
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    int mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final Random mRandom;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    private native void dbclose();

    private native void dbopen(String str, int i);

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    private native void key(byte[] bArr);

    private native void key_mutf8(char[] cArr);

    private native int native_getDbLookaside();

    private native void native_key(char[] cArr);

    private native void native_rawExecSQL(String str);

    private native void native_rekey(String str);

    private native int native_status(int i, boolean z);

    private native void rekey(byte[] bArr);

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    native int lastChangeCount();

    native long lastInsertRow();

    native void native_execSQL(String str);

    native void native_setLocale(String str, int i);

    static {
        sActiveDatabases = new WeakHashMap();
        CONFLICT_VALUES = new String[]{LetterIndexBar.SEARCH_ICON_LETTER, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
        sQueryLogTimeInMillis = OPEN_READWRITE;
    }

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    public void changePassword(String str) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (str != null) {
            rekey(getBytes(str.toCharArray()));
        }
    }

    public void changePassword(char[] cArr) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (cArr != null) {
            rekey(getBytes(cArr));
        }
    }

    private static void loadICUData(Context context, File file) {
        Throwable e;
        OutputStream outputStream;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2 = null;
        File file2 = new File(file, "icu");
        File file3 = new File(file2, "icudt46l.dat");
        try {
            ZipInputStream zipInputStream3;
            OutputStream outputStream2;
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file3.exists()) {
                zipInputStream3 = null;
                outputStream2 = null;
            } else {
                zipInputStream3 = new ZipInputStream(context.getAssets().open("icudt46l.zip"));
                try {
                    zipInputStream3.getNextEntry();
                    outputStream2 = new FileOutputStream(file3);
                    try {
                        byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                        while (true) {
                            int read = zipInputStream3.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            outputStream2.write(bArr, OPEN_READWRITE, read);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zipInputStream2 = zipInputStream3;
                        outputStream = outputStream2;
                        try {
                            Log.e(TAG, "Error copying icu dat file", e);
                            if (file3.exists()) {
                                file3.delete();
                            }
                            throw new RuntimeException(e);
                        } catch (Throwable th) {
                            e = th;
                            if (zipInputStream2 != null) {
                                try {
                                    zipInputStream2.close();
                                } catch (Throwable e3) {
                                    Log.e(TAG, "Error in closing streams IO streams after expanding ICU dat file", e3);
                                    throw new RuntimeException(e3);
                                }
                            }
                            if (outputStream != null) {
                                outputStream.flush();
                                outputStream.close();
                            }
                            throw e3;
                        }
                    } catch (Throwable th2) {
                        e3 = th2;
                        zipInputStream2 = zipInputStream3;
                        outputStream = outputStream2;
                        if (zipInputStream2 != null) {
                            zipInputStream2.close();
                        }
                        if (outputStream != null) {
                            outputStream.flush();
                            outputStream.close();
                        }
                        throw e3;
                    }
                } catch (Exception e4) {
                    e3 = e4;
                    zipInputStream = zipInputStream3;
                    outputStream = null;
                    zipInputStream2 = zipInputStream;
                    Log.e(TAG, "Error copying icu dat file", e3);
                    if (file3.exists()) {
                        file3.delete();
                    }
                    throw new RuntimeException(e3);
                } catch (Throwable th3) {
                    e3 = th3;
                    zipInputStream = zipInputStream3;
                    outputStream = null;
                    zipInputStream2 = zipInputStream;
                    if (zipInputStream2 != null) {
                        zipInputStream2.close();
                    }
                    if (outputStream != null) {
                        outputStream.flush();
                        outputStream.close();
                    }
                    throw e3;
                }
            }
            if (zipInputStream3 != null) {
                try {
                    zipInputStream3.close();
                } catch (Throwable e32) {
                    Log.e(TAG, "Error in closing streams IO streams after expanding ICU dat file", e32);
                    throw new RuntimeException(e32);
                }
            }
            if (outputStream2 != null) {
                outputStream2.flush();
                outputStream2.close();
            }
        } catch (Exception e5) {
            e32 = e5;
            outputStream = null;
            Log.e(TAG, "Error copying icu dat file", e32);
            if (file3.exists()) {
                file3.delete();
            }
            throw new RuntimeException(e32);
        } catch (Throwable th4) {
            e32 = th4;
            outputStream = null;
            if (zipInputStream2 != null) {
                zipInputStream2.close();
            }
            if (outputStream != null) {
                outputStream.flush();
                outputStream.close();
            }
            throw e32;
        }
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            System.loadLibrary("sqlcipher");
        }
    }

    void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, null);
        } finally {
            unlock();
        }
    }

    void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    protected void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    void onCorruption() {
        Log.e(TAG, "Calling error handler for corrupt database (detected) " + this.mPath);
        this.mErrorHandler.onCorruption(this);
    }

    void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == OPEN_READ_MASK) {
                this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            }
        }
    }

    private void lockForced() {
        this.mLock.lock();
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == OPEN_READ_MASK) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
        }
    }

    void unlock() {
        if (this.mLockingEnabled) {
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == OPEN_READ_MASK) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == OPEN_READ_MASK) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLockAcquiredWallTime;
        if ((j >= 2000 || Log.isLoggable(TAG, CONFLICT_ABORT) || elapsedRealtime - this.mLastLockMessageTime >= 20000) && j > 300) {
            int threadCpuTimeNanos = (int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000);
            if (threadCpuTimeNanos > LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS || j > 2000) {
                this.mLastLockMessageTime = elapsedRealtime;
                new StringBuilder("lock held on ").append(this.mPath).append(" for ").append(j).append("ms. Thread time was ").append(threadCpuTimeNanos).append("ms");
                if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE) {
                    Exception exception = new Exception();
                }
            }
        }
    }

    public void beginTransaction() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        lockForced();
        if (isOpen()) {
            try {
                if (this.mLock.getHoldCount() <= OPEN_READ_MASK) {
                    execSQL("BEGIN EXCLUSIVE;");
                    this.mTransactionListener = sQLiteTransactionListener;
                    this.mTransactionIsSuccessful = true;
                    this.mInnerTransactionIsSuccessful = false;
                    if (sQLiteTransactionListener != null) {
                        sQLiteTransactionListener.onBegin();
                    }
                } else if (this.mInnerTransactionIsSuccessful) {
                    Throwable illegalStateException = new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                    Log.e(TAG, "beginTransaction() failed", illegalStateException);
                    throw illegalStateException;
                }
            } catch (RuntimeException e) {
                execSQL("ROLLBACK;");
                throw e;
            } catch (Throwable th) {
                unlockForced();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public void endTransaction() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (this.mLock.isHeldByCurrentThread()) {
            RuntimeException runtimeException;
            try {
                if (this.mInnerTransactionIsSuccessful) {
                    this.mInnerTransactionIsSuccessful = false;
                } else {
                    this.mTransactionIsSuccessful = false;
                }
                if (this.mLock.getHoldCount() != OPEN_READ_MASK) {
                    this.mTransactionListener = null;
                    unlockForced();
                    return;
                }
                if (this.mTransactionListener == null) {
                    runtimeException = null;
                } else if (this.mTransactionIsSuccessful) {
                    this.mTransactionListener.onCommit();
                    runtimeException = null;
                } else {
                    this.mTransactionListener.onRollback();
                    runtimeException = null;
                }
                if (this.mTransactionIsSuccessful) {
                    execSQL(COMMIT_SQL);
                } else {
                    try {
                        execSQL("ROLLBACK;");
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                    } catch (SQLException e) {
                    }
                }
                this.mTransactionListener = null;
                unlockForced();
            } catch (RuntimeException e2) {
                runtimeException = e2;
                this.mTransactionIsSuccessful = false;
            } catch (Throwable th) {
                this.mTransactionListener = null;
                unlockForced();
            }
        } else {
            throw new IllegalStateException("no transaction pending");
        }
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        } else if (this.mInnerTransactionIsSuccessful) {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        } else {
            this.mInnerTransactionIsSuccessful = true;
        }
    }

    public boolean inTransaction() {
        return this.mLock.getHoldCount() > 0;
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        return !this.mLock.isHeldByCurrentThread() && this.mLock.isLocked();
    }

    @Deprecated
    public boolean yieldIfContended() {
        if (isOpen()) {
            return yieldIfContendedHelper(false, -1);
        }
        return false;
    }

    public boolean yieldIfContendedSafely() {
        if (isOpen()) {
            return yieldIfContendedHelper(true, -1);
        }
        return false;
    }

    public boolean yieldIfContendedSafely(long j) {
        if (isOpen()) {
            return yieldIfContendedHelper(true, j);
        }
        return false;
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (z && isDbLockedByCurrentThread()) {
            throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
        }
        if (j > 0) {
            long j2 = j;
            while (j2 > 0) {
                try {
                    Thread.sleep(j2 < 1000 ? j2 : 1000);
                } catch (InterruptedException e) {
                    Thread.interrupted();
                }
                j2 -= 1000;
                if (this.mLock.getQueueLength() == 0) {
                    break;
                }
            }
        }
        beginTransactionWithListener(sQLiteTransactionListener);
        return true;
    }

    public Map<String, String> getSyncedTables() {
        Map hashMap;
        synchronized (this.mSyncUpdateInfo) {
            hashMap = new HashMap();
            for (String str : this.mSyncUpdateInfo.keySet()) {
                SyncUpdateInfo syncUpdateInfo = (SyncUpdateInfo) this.mSyncUpdateInfo.get(str);
                if (syncUpdateInfo.deletedTable != null) {
                    hashMap.put(str, syncUpdateInfo.deletedTable);
                }
            }
        }
        return hashMap;
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, null);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, null, null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, null);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2 = null;
        if (databaseErrorHandler == null) {
            databaseErrorHandler = new DefaultDatabaseErrorHandler();
        }
        try {
            sQLiteDatabase = new SQLiteDatabase(str, cursorFactory, i, databaseErrorHandler);
            try {
                sQLiteDatabase.openDatabaseInternal(cArr, sQLiteDatabaseHook);
            } catch (SQLiteDatabaseCorruptException e) {
                SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
                sQLiteDatabase2 = sQLiteDatabase;
                th = sQLiteDatabaseCorruptException;
                Log.e(TAG, "Calling error handler for corrupt database " + str, th);
                databaseErrorHandler.onCorruption(sQLiteDatabase2);
                sQLiteDatabase = new SQLiteDatabase(str, cursorFactory, i, databaseErrorHandler);
                sQLiteDatabase.openDatabaseInternal(cArr, sQLiteDatabaseHook);
                if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                    sQLiteDatabase.enableSqlTracing(str);
                }
                if (SQLiteDebug.DEBUG_SQL_TIME) {
                    sQLiteDatabase.enableSqlProfiling(str);
                }
                synchronized (sActiveDatabases) {
                    sActiveDatabases.put(sQLiteDatabase, null);
                }
                return sQLiteDatabase;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            th = e2;
            Log.e(TAG, "Calling error handler for corrupt database " + str, th);
            databaseErrorHandler.onCorruption(sQLiteDatabase2);
            sQLiteDatabase = new SQLiteDatabase(str, cursorFactory, i, databaseErrorHandler);
            sQLiteDatabase.openDatabaseInternal(cArr, sQLiteDatabaseHook);
            if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                sQLiteDatabase.enableSqlTracing(str);
            }
            if (SQLiteDebug.DEBUG_SQL_TIME) {
                sQLiteDatabase.enableSqlProfiling(str);
            }
            synchronized (sActiveDatabases) {
                sActiveDatabases.put(sQLiteDatabase, null);
            }
            return sQLiteDatabase;
        }
        if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
            sQLiteDatabase.enableSqlTracing(str);
        }
        if (SQLiteDebug.DEBUG_SQL_TIME) {
            sQLiteDatabase.enableSqlProfiling(str);
        }
        synchronized (sActiveDatabases) {
            sActiveDatabases.put(sQLiteDatabase, null);
        }
        return sQLiteDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, null);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        return openDatabase(MEMORY, str == null ? null : str.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(MEMORY, cArr, cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Entry key : this.mPrograms.entrySet()) {
            SQLiteClosable sQLiteClosable = (SQLiteClosable) key.getKey();
            if (sQLiteClosable != null) {
                sQLiteClosable.onAllReferencesReleasedFromContainer();
            }
        }
    }

    public int getVersion() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (isOpen()) {
            try {
                sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;");
                try {
                    int simpleQueryForLong = (int) sQLiteStatement.simpleQueryForLong();
                    sQLiteStatement.close();
                    unlock();
                    return simpleQueryForLong;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    unlock();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteStatement = null;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        }
        throw new IllegalStateException("database not open");
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public long getMaximumSize() {
        Throwable th;
        lock();
        if (isOpen()) {
            SQLiteStatement sQLiteStatement;
            try {
                sQLiteStatement = new SQLiteStatement(this, "PRAGMA max_page_count;");
                try {
                    long simpleQueryForLong = sQLiteStatement.simpleQueryForLong() * getPageSize();
                    sQLiteStatement.close();
                    unlock();
                    return simpleQueryForLong;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    unlock();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteStatement = null;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        }
        throw new IllegalStateException("database not open");
    }

    public long setMaximumSize(long j) {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (isOpen()) {
            try {
                long j2;
                long pageSize = getPageSize();
                long j3 = j / pageSize;
                if (j % pageSize != 0) {
                    j2 = j3 + 1;
                } else {
                    j2 = j3;
                }
                sQLiteStatement = new SQLiteStatement(this, "PRAGMA max_page_count = " + j2);
                try {
                    long simpleQueryForLong = sQLiteStatement.simpleQueryForLong() * pageSize;
                    sQLiteStatement.close();
                    unlock();
                    return simpleQueryForLong;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    unlock();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteStatement = null;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        }
        throw new IllegalStateException("database not open");
    }

    public long getPageSize() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (isOpen()) {
            try {
                sQLiteStatement = new SQLiteStatement(this, "PRAGMA page_size;");
                try {
                    long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                    sQLiteStatement.close();
                    unlock();
                    return simpleQueryForLong;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    unlock();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteStatement = null;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        }
        throw new IllegalStateException("database not open");
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void markTableSyncable(String str, String str2) {
        if (isOpen()) {
            markTableSyncable(str, "_id", str, str2);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (isOpen()) {
            markTableSyncable(str, str2, str3, null);
            return;
        }
        throw new SQLiteException("database not open");
    }

    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } finally {
            unlock();
        }
    }

    void rowUpdated(String str, long j) {
        synchronized (this.mSyncUpdateInfo) {
            SyncUpdateInfo syncUpdateInfo = (SyncUpdateInfo) this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j + ")");
        }
    }

    public static String findEditTable(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Invalid tables");
        }
        int indexOf = str.indexOf(32);
        int indexOf2 = str.indexOf(44);
        if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
            return str.substring(OPEN_READWRITE, indexOf);
        }
        if (indexOf2 <= 0) {
            return str;
        }
        if (indexOf2 < indexOf || indexOf < 0) {
            return str.substring(OPEN_READWRITE, indexOf2);
        }
        return str;
    }

    public SQLiteStatement compileStatement(String str) {
        lock();
        if (isOpen()) {
            try {
                SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str);
                return sQLiteStatement;
            } finally {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (isOpen()) {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
        }
        throw new IllegalStateException("database not open");
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        int i = -1;
        if (isOpen()) {
            long j = 0;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            if (cursorFactory == null) {
                cursorFactory = this.mFactory;
            }
            try {
                Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
                if (this.mSlowQueryThreshold != -1) {
                    if (query != null) {
                        i = query.getCount();
                    }
                    j = System.currentTimeMillis() - j;
                    if (j >= ((long) this.mSlowQueryThreshold)) {
                        new StringBuilder("query (").append(j).append(" ms): ").append(sQLiteDirectCursorDriver.toString()).append(", args are <redacted>, count is ").append(i);
                    }
                }
                return new CrossProcessCursorWrapper(query);
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    j = System.currentTimeMillis() - j;
                    if (j >= ((long) this.mSlowQueryThreshold)) {
                        new StringBuilder("query (").append(j).append(" ms): ").append(sQLiteDirectCursorDriver.toString()).append(", args are <redacted>, count is -1");
                    }
                }
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory(null, str, strArr, null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, OPEN_READWRITE);
        } catch (SQLException e) {
            Log.e(TAG, "Error inserting <redacted values> into " + str, e);
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, OPEN_READWRITE);
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, CONFLICT_REPLACE);
        } catch (SQLException e) {
            Log.e(TAG, "Error inserting <redacted values> into " + str, e);
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, CONFLICT_REPLACE);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        SQLiteStatement sQLiteStatement = null;
        int i2 = OPEN_READWRITE;
        if (isOpen()) {
            Set set;
            StringBuilder stringBuilder = new StringBuilder(152);
            stringBuilder.append("INSERT");
            stringBuilder.append(CONFLICT_VALUES[i]);
            stringBuilder.append(" INTO ");
            stringBuilder.append(str);
            Object stringBuilder2 = new StringBuilder(40);
            if (contentValues == null || contentValues.size() <= 0) {
                stringBuilder.append("(" + str2 + ") ");
                stringBuilder2.append("NULL");
                set = null;
            } else {
                Set<Entry> valueSet = contentValues.valueSet();
                stringBuilder.append('(');
                int i3 = OPEN_READWRITE;
                for (Entry key : valueSet) {
                    if (i3 != 0) {
                        stringBuilder.append(", ");
                        stringBuilder2.append(", ");
                    }
                    stringBuilder.append((String) key.getKey());
                    stringBuilder2.append('?');
                    i3 = OPEN_READ_MASK;
                }
                stringBuilder.append(')');
                set = valueSet;
            }
            stringBuilder.append(" VALUES(");
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(");");
            lock();
            try {
                sQLiteStatement = compileStatement(stringBuilder.toString());
                if (set != null) {
                    int size = set.size();
                    Iterator it = set.iterator();
                    while (i2 < size) {
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i2 + OPEN_READ_MASK, ((Entry) it.next()).getValue());
                        i2 += OPEN_READ_MASK;
                    }
                }
                sQLiteStatement.execute();
                long lastInsertRow = lastInsertRow();
                if (lastInsertRow == -1) {
                    Log.e(TAG, "Error inserting <redacted values> using <redacted sql> into " + str);
                } else if (Log.isLoggable(TAG, CONFLICT_ABORT)) {
                    new StringBuilder("Inserting row ").append(lastInsertRow).append(" from <redacted values> using <redacted sql> into ").append(str);
                }
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                return lastInsertRow;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        lock();
        if (isOpen()) {
            SQLiteStatement sQLiteStatement = null;
            try {
                int i;
                sQLiteStatement = compileStatement("DELETE FROM " + str + (!TextUtils.isEmpty(str2) ? " WHERE " + str2 : LetterIndexBar.SEARCH_ICON_LETTER));
                if (strArr != null) {
                    int length = strArr.length;
                    for (i = OPEN_READWRITE; i < length; i += OPEN_READ_MASK) {
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i + OPEN_READ_MASK, strArr[i]);
                    }
                }
                sQLiteStatement.execute();
                i = lastChangeCount();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                return i;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, OPEN_READWRITE);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder stringBuilder = new StringBuilder(120);
        stringBuilder.append("UPDATE ");
        stringBuilder.append(CONFLICT_VALUES[i]);
        stringBuilder.append(str);
        stringBuilder.append(" SET ");
        Set valueSet = contentValues.valueSet();
        Iterator it = valueSet.iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) ((Entry) it.next()).getKey());
            stringBuilder.append("=?");
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(" WHERE ");
            stringBuilder.append(str2);
        }
        lock();
        if (isOpen()) {
            SQLiteStatement sQLiteStatement = null;
            try {
                int i2;
                int i3;
                sQLiteStatement = compileStatement(stringBuilder.toString());
                int size = valueSet.size();
                Iterator it2 = valueSet.iterator();
                int i4 = OPEN_READ_MASK;
                for (i2 = OPEN_READWRITE; i2 < size; i2 += OPEN_READ_MASK) {
                    DatabaseUtils.bindObjectToProgram(sQLiteStatement, i4, ((Entry) it2.next()).getValue());
                    i4 += OPEN_READ_MASK;
                }
                if (strArr != null) {
                    i2 = strArr.length;
                    int i5 = i4;
                    for (i3 = OPEN_READWRITE; i3 < i2; i3 += OPEN_READ_MASK) {
                        sQLiteStatement.bindString(i5, strArr[i3]);
                        i5 += OPEN_READ_MASK;
                    }
                }
                sQLiteStatement.execute();
                i3 = lastChangeCount();
                if (Log.isLoggable(TAG, CONFLICT_ABORT)) {
                    new StringBuilder("Updated ").append(i3).append(" rows using <redacted values> and <redacted sql> for ").append(str);
                }
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                return i3;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (SQLException e2) {
                Log.e(TAG, "Error updating <redacted values> using <redacted sql> for " + str);
                throw e2;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public void execSQL(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        lock();
        if (isOpen()) {
            logTimeStat(this.mLastSqlStatement, uptimeMillis, GET_LOCK_LOG_PREFIX);
            try {
                native_execSQL(str);
                unlock();
                if (str == COMMIT_SQL) {
                    logTimeStat(this.mLastSqlStatement, uptimeMillis, COMMIT_SQL);
                } else {
                    logTimeStat(str, uptimeMillis, null);
                }
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public void rawExecSQL(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        lock();
        if (isOpen()) {
            logTimeStat(this.mLastSqlStatement, uptimeMillis, GET_LOCK_LOG_PREFIX);
            try {
                native_rawExecSQL(str);
                unlock();
                if (str == COMMIT_SQL) {
                    logTimeStat(this.mLastSqlStatement, uptimeMillis, COMMIT_SQL);
                } else {
                    logTimeStat(str, uptimeMillis, null);
                }
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public void execSQL(String str, Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        lock();
        if (isOpen()) {
            SQLiteStatement sQLiteStatement = null;
            try {
                sQLiteStatement = compileStatement(str);
                if (objArr != null) {
                    int length = objArr.length;
                    for (int i = OPEN_READWRITE; i < length; i += OPEN_READ_MASK) {
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i + OPEN_READ_MASK, objArr[i]);
                    }
                }
                sQLiteStatement.execute();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                logTimeStat(str, uptimeMillis);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    protected void finalize() {
        if (isOpen()) {
            Log.e(TAG, "close() was never explicitly called on database '" + this.mPath + "' ", this.mStackTrace);
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, null);
        openDatabaseInternal(cArr, null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        this.mRandom = new Random();
        this.mLastSqlStatement = null;
        this.mNativeHandle = OPEN_READWRITE;
        this.mTempTableSequence = OPEN_READWRITE;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = MAX_SQL_CACHE_SIZE;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str == null) {
            throw new IllegalArgumentException("path should not be null");
        }
        this.mFlags = i;
        this.mPath = str;
        this.mSlowQueryThreshold = -1;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.mFactory = cursorFactory;
        this.mPrograms = new WeakHashMap();
        this.mErrorHandler = databaseErrorHandler;
    }

    private void openDatabaseInternal(char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        byte[] bytes = getBytes(cArr);
        dbopen(this.mPath, this.mFlags);
        try {
            keyDatabase(sQLiteDatabaseHook, new 1(this, bytes));
            if (bytes != null && bytes.length <= 0) {
            }
        } catch (RuntimeException e) {
            if (containsNull(cArr)) {
                keyDatabase(sQLiteDatabaseHook, new 2(this, cArr));
                if (bytes != null && bytes.length > 0) {
                    rekey(bytes);
                }
                if (bytes != null && bytes.length > 0) {
                    return;
                }
                return;
            }
            throw e;
        } catch (Throwable th) {
            dbclose();
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        int length = cArr.length;
        for (int i = OPEN_READWRITE; i < length; i += OPEN_READ_MASK) {
            if (cArr[i] == '\u0000') {
                return true;
            }
        }
        return false;
    }

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[OPEN_READWRITE]);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                rawQuery.getInt(OPEN_READWRITE);
                rawQuery.close();
            }
        } catch (Throwable e) {
            Log.e(TAG, e.getMessage(), e);
            throw e;
        }
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
    }

    public boolean isReadOnly() {
        return (this.mFlags & OPEN_READ_MASK) == OPEN_READ_MASK;
    }

    public boolean isOpen() {
        return this.mNativeHandle != 0;
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public final String getPath() {
        return this.mPath;
    }

    void logTimeStat(String str, long j) {
        logTimeStat(str, j, null);
    }

    void logTimeStat(String str, long j, String str2) {
        this.mLastSqlStatement = str;
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis != 0 || str2 != GET_LOCK_LOG_PREFIX) {
            if (sQueryLogTimeInMillis == 0) {
                sQueryLogTimeInMillis = 500;
            }
            if (uptimeMillis >= ((long) sQueryLogTimeInMillis) || this.mRandom.nextInt(LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS) < ((int) ((uptimeMillis * 100) / ((long) sQueryLogTimeInMillis))) + OPEN_READ_MASK) {
                if (str2 != null) {
                    str = str2 + str;
                }
                if (str.length() > QUERY_LOG_SQL_LENGTH) {
                    str.substring(OPEN_READWRITE, QUERY_LOG_SQL_LENGTH);
                }
            }
        }
    }

    private String getPathForLogs() {
        if (this.mPathForLogs != null) {
            return this.mPathForLogs;
        }
        if (this.mPath == null) {
            return null;
        }
        if (this.mPath.indexOf(QUERY_LOG_SQL_LENGTH) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    void addToCompiledQueries(String str, SQLiteCompiledSql sQLiteCompiledSql) {
        if (this.mMaxSqlCacheSize != 0) {
            synchronized (this.mCompiledQueries) {
                if (((SQLiteCompiledSql) this.mCompiledQueries.get(str)) != null) {
                    return;
                }
                if (this.mCompiledQueries.size() == this.mMaxSqlCacheSize) {
                    int i = this.mCacheFullWarnings + OPEN_READ_MASK;
                    this.mCacheFullWarnings = i;
                    if (i == OPEN_READ_MASK) {
                        Log.w(TAG, "Reached MAX size for compiled-sql statement cache for database " + getPath() + "; i.e., NO space for this sql statement in cache: " + str + ". Please change your sql statements to use '?' for bindargs, instead of using actual values");
                    }
                } else {
                    this.mCompiledQueries.put(str, sQLiteCompiledSql);
                    if (SQLiteDebug.DEBUG_SQL_CACHE) {
                        new StringBuilder("|adding_sql_to_cache|").append(getPath()).append("|").append(this.mCompiledQueries.size()).append("|").append(str);
                    }
                }
            }
        } else if (SQLiteDebug.DEBUG_SQL_CACHE) {
            new StringBuilder("|NOT adding_sql_to_cache|").append(getPath()).append("|").append(str);
        }
    }

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            for (SQLiteCompiledSql releaseSqlStatement : this.mCompiledQueries.values()) {
                releaseSqlStatement.releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    SQLiteCompiledSql getCompiledStatementForSql(String str) {
        SQLiteCompiledSql sQLiteCompiledSql;
        synchronized (this.mCompiledQueries) {
            if (this.mMaxSqlCacheSize == 0) {
                if (SQLiteDebug.DEBUG_SQL_CACHE) {
                    new StringBuilder("|cache NOT found|").append(getPath());
                }
                sQLiteCompiledSql = null;
            } else {
                sQLiteCompiledSql = (SQLiteCompiledSql) this.mCompiledQueries.get(str);
                boolean z = sQLiteCompiledSql != null;
                if (z) {
                    this.mNumCacheHits += OPEN_READ_MASK;
                } else {
                    this.mNumCacheMisses += OPEN_READ_MASK;
                }
                if (SQLiteDebug.DEBUG_SQL_CACHE) {
                    new StringBuilder("|cache_stats|").append(getPath()).append("|").append(this.mCompiledQueries.size()).append("|").append(this.mNumCacheHits).append("|").append(this.mNumCacheMisses).append("|").append(z).append("|").append(this.mTimeOpened).append("|").append(this.mTimeClosed).append("|").append(str);
                }
            }
        }
        return sQLiteCompiledSql;
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        if (i > MAX_SQL_CACHE_SIZE || i < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        } else if (i < this.mMaxSqlCacheSize) {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        } else {
            this.mMaxSqlCacheSize = i;
        }
    }

    static ArrayList<DbStats> getDbStats() {
        ArrayList<DbStats> arrayList = new ArrayList();
        Iterator it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) it.next();
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                int native_getDbLookaside = sQLiteDatabase.native_getDbLookaside();
                String path = sQLiteDatabase.getPath();
                int lastIndexOf = path.lastIndexOf("/");
                String substring = path.substring(lastIndexOf != -1 ? lastIndexOf + OPEN_READ_MASK : OPEN_READWRITE);
                ArrayList attachedDbs = getAttachedDbs(sQLiteDatabase);
                if (attachedDbs != null) {
                    for (int i = OPEN_READWRITE; i < attachedDbs.size(); i += OPEN_READ_MASK) {
                        Pair pair = (Pair) attachedDbs.get(i);
                        long pragmaVal = getPragmaVal(sQLiteDatabase, ((String) pair.first) + ".page_count;");
                        if (i == 0) {
                            path = substring;
                        } else {
                            String str = "  (attached) " + ((String) pair.first);
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf("/");
                                path = str + " : " + ((String) pair.second).substring(lastIndexOf2 != -1 ? lastIndexOf2 + OPEN_READ_MASK : OPEN_READWRITE);
                                native_getDbLookaside = OPEN_READWRITE;
                            } else {
                                path = str;
                                native_getDbLookaside = OPEN_READWRITE;
                            }
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new DbStats(path, pragmaVal, sQLiteDatabase.getPageSize(), native_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    private static long getPragmaVal(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        if (!sQLiteDatabase.isOpen()) {
            return 0;
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteStatement sQLiteStatement2 = new SQLiteStatement(sQLiteDatabase, "PRAGMA " + str);
            try {
                long simpleQueryForLong = sQLiteStatement2.simpleQueryForLong();
                sQLiteStatement2.close();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                sQLiteStatement = sQLiteStatement2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair(rawQuery.getString(OPEN_READ_MASK), rawQuery.getString(CONFLICT_ABORT)));
        }
        rawQuery.close();
        return arrayList;
    }

    private byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName(KEY_ENCODING).encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }
}