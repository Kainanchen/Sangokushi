package net.sqlcipher;

import a.does.not.Exists0;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.ali.fixHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCursor implements CrossProcessCursor, Cursor {
    private static final String TAG = "Cursor";
    protected boolean mClosed;
    ContentObservable mContentObservable;
    protected ContentResolver mContentResolver;
    public Long mCurrentRowID;
    DataSetObservable mDataSetObservable;
    private Bundle mExtras;
    private Uri mNotifyUri;
    public int mPos;
    public int mRowIdColumnIndex;
    private ContentObserver mSelfObserver;
    private final Object mSelfObserverLock;
    private boolean mSelfObserverRegistered;
    public HashMap<Long, Map<String, Object>> mUpdatedRows;

    protected static class SelfContentObserver extends ContentObserver {
        WeakReference<AbstractCursor> mCursor;

        static {
            fixHelper.fixfunc(new int[]{21251, 21252, 21253});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native SelfContentObserver(AbstractCursor abstractCursor);

        public native boolean deliverSelfNotifications();

        public native void onChange(boolean z);
    }

    static {
        fixHelper.fixfunc(new int[]{19656, 19657, 19658, 19659, 19660, 19661, 19662, 19663, 19664, 19665, 19666, 19667, 19668, 19669, 19670, 19671, 19672, 19673, 19674, 19675, 19676, 19677, 19678, 19679, 19680, 19681, 19682, 19683, 19684, 19685, 19686, 19687, 19688, 19689, 19690, 19691, 19692, 19693, 19694, 19695, 19696, 19697, 19698, 19699, 19700, 19701, 19702, 19703, 19704, 19705, 19706, 19707, 19708, 19709, 19710, 19711, 19712, 19713, 19714});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native void abortUpdates();

    protected native void checkPosition();

    public native void close();

    public native boolean commitUpdates();

    public native boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map);

    public native void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer);

    public native void deactivate();

    public native void deactivateInternal();

    public native boolean deleteRow();

    public native void fillWindow(int i, CursorWindow cursorWindow);

    public native void finalize();

    public native byte[] getBlob(int i);

    public native int getColumnCount();

    public native int getColumnIndex(String str);

    public native int getColumnIndexOrThrow(String str);

    public native String getColumnName(int i);

    public abstract String[] getColumnNames();

    public abstract int getCount();

    protected native DataSetObservable getDataSetObservable();

    public abstract double getDouble(int i);

    public native Bundle getExtras();

    public abstract float getFloat(int i);

    public abstract int getInt(int i);

    public abstract long getLong(int i);

    public native Uri getNotificationUri();

    public final native int getPosition();

    public abstract short getShort(int i);

    public abstract String getString(int i);

    public abstract int getType(int i);

    protected native Object getUpdatedField(int i);

    public native boolean getWantsAllOnMoveCalls();

    public native /* bridge */ /* synthetic */ CursorWindow getWindow();

    public native CursorWindow m7095getWindow();

    public native boolean hasUpdates();

    public final native boolean isAfterLast();

    public final native boolean isBeforeFirst();

    public native boolean isClosed();

    protected native boolean isFieldUpdated(int i);

    public final native boolean isFirst();

    public final native boolean isLast();

    public abstract boolean isNull(int i);

    public final native boolean move(int i);

    public final native boolean moveToFirst();

    public final native boolean moveToLast();

    public final native boolean moveToNext();

    public final native boolean moveToPosition(int i);

    public final native boolean moveToPrevious();

    public native void notifyDataSetChange();

    public native void onChange(boolean z);

    public native boolean onMove(int i, int i2);

    public native void registerContentObserver(ContentObserver contentObserver);

    public native void registerDataSetObserver(DataSetObserver dataSetObserver);

    public native boolean requery();

    public native Bundle respond(Bundle bundle);

    public native void setExtras(Bundle bundle);

    public native void setNotificationUri(ContentResolver contentResolver, Uri uri);

    public native boolean supportsUpdates();

    public native void unregisterContentObserver(ContentObserver contentObserver);

    public native void unregisterDataSetObserver(DataSetObserver dataSetObserver);

    public native boolean update(int i, Object obj);

    public native boolean updateBlob(int i, byte[] bArr);

    public native boolean updateDouble(int i, double d);

    public native boolean updateFloat(int i, float f);

    public native boolean updateInt(int i, int i2);

    public native boolean updateLong(int i, long j);

    public native boolean updateShort(int i, short s);

    public native boolean updateString(int i, String str);

    public native boolean updateToNull(int i);
}
