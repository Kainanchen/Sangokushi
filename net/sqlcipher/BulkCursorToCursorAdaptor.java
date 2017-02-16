package net.sqlcipher;

import a.does.not.Exists0;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.ali.fixHelper;
import java.util.Map;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    static {
        fixHelper.fixfunc(new int[]{16309, 16310, 16311, 16312, 16313, 16314, 16315, 16316, 16317, 16318, 16319, 16320, 16321, 16322, 16323, 16324, 16325, 16326, 16327});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public final native void close();

    public final native boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map);

    public final native void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer);

    public final native void deactivate();

    public final native boolean deleteRow();

    public final native String[] getColumnNames();

    public final native int getCount();

    public final native Bundle getExtras();

    public final native synchronized IContentObserver getObserver();

    public final native boolean onMove(int i, int i2);

    public final native void registerContentObserver(ContentObserver contentObserver);

    public final native void registerDataSetObserver(DataSetObserver dataSetObserver);

    public final native boolean requery();

    public final native Bundle respond(Bundle bundle);

    public final native void set(IBulkCursor iBulkCursor);

    public final native void set(IBulkCursor iBulkCursor, int i, int i2);

    public final native void unregisterContentObserver(ContentObserver contentObserver);

    public final native void unregisterDataSetObserver(DataSetObserver dataSetObserver);

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }
}
