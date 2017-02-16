package net.sqlcipher.database;

import a.does.not.Exists0;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import com.ali.fixHelper;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;

public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private Map<String, Integer> mColumnNameMap;
    private String[] mColumns;
    private int mCount;
    private int mCursorState;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    private int mInitialRead;
    private ReentrantLock mLock;
    private int mMaxRead;
    protected MainThreadNotificationHandler mNotificationHandler;
    private boolean mPendingData;
    private SQLiteQuery mQuery;
    private Throwable mStackTrace;

    protected class MainThreadNotificationHandler extends Handler {
        final /* synthetic */ SQLiteCursor this$0;

        static {
            fixHelper.fixfunc(new int[]{5620, 5621});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        protected native MainThreadNotificationHandler(SQLiteCursor sQLiteCursor);

        public native void handleMessage(Message message);
    }

    private final class QueryThread implements Runnable {
        private final int mThreadState;
        final /* synthetic */ SQLiteCursor this$0;

        static {
            fixHelper.fixfunc(new int[]{33389, 33390, 33391});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native QueryThread(SQLiteCursor sQLiteCursor, int i);

        private native void sendMessage();

        public final native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{9867, 9868, 9869, 9870, 9871, 9872, 9873, 9874, 9875, 9876, 9877, 9878, 9879, 9880, 9881, 9882, 9883, 9884, 9885, 9886, 9887, 9888});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);

    private native void deactivateCommon();

    private native void fillWindow(int i);

    private native void queryThreadLock();

    private native void queryThreadUnlock();

    public native void close();

    public native boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map);

    public native void deactivate();

    public native boolean deleteRow();

    public native void fillWindow(int i, CursorWindow cursorWindow);

    protected native void finalize();

    public native int getColumnIndex(String str);

    public native String[] getColumnNames();

    public native int getCount();

    public native SQLiteDatabase getDatabase();

    public native boolean onMove(int i, int i2);

    public native void registerDataSetObserver(DataSetObserver dataSetObserver);

    public native boolean requery();

    public native void setLoadStyle(int i, int i2);

    public native void setSelectionArguments(String[] strArr);

    public native void setWindow(net.sqlcipher.CursorWindow cursorWindow);

    public native boolean supportsUpdates();

    static /* synthetic */ int access$512(SQLiteCursor sQLiteCursor, int i) {
        int i2 = sQLiteCursor.mCount + i;
        sQLiteCursor.mCount = i2;
        return i2;
    }
}
