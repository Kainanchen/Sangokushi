package org.p005a.p006a.p009c;

import a.does.not.Exists0;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.ali.fixHelper;

/* renamed from: org.a.a.c.b */
public final class FastCursor implements Cursor {
    private final CursorWindow f415a;
    private int f416b;
    private final int f417c;

    static {
        fixHelper.fixfunc(new int[]{32669, 32670, 32671, 32672, 32673, 32674, 32675, 32676, 32677, 32678, 32679, 32680, 32681, 32682, 32683, 32684, 32685, 32686, 32687, 32688, 32689, 32690, 32691, 32692, 32693, 32694, 32695, 32696, 32697, 32698, 32699, 32700, 32701, 32702, 32703, 32704, 32705, 32706, 32707, 32708, 32709});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native FastCursor(CursorWindow cursorWindow);

    public final native void close();

    public final native void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer);

    public final native void deactivate();

    public final native byte[] getBlob(int i);

    public final native int getColumnCount();

    public final native int getColumnIndex(String str);

    public final native int getColumnIndexOrThrow(String str);

    public final native String getColumnName(int i);

    public final native String[] getColumnNames();

    public final native int getCount();

    public final native double getDouble(int i);

    public final native Bundle getExtras();

    public final native float getFloat(int i);

    public final native int getInt(int i);

    public final native long getLong(int i);

    public final native Uri getNotificationUri();

    public final native int getPosition();

    public final native short getShort(int i);

    public final native String getString(int i);

    public final native int getType(int i);

    public final native boolean getWantsAllOnMoveCalls();

    public final native boolean isAfterLast();

    public final native boolean isBeforeFirst();

    public final native boolean isClosed();

    public final native boolean isFirst();

    public final native boolean isLast();

    public final native boolean isNull(int i);

    public final native boolean move(int i);

    public final native boolean moveToFirst();

    public final native boolean moveToLast();

    public final native boolean moveToNext();

    public final native boolean moveToPosition(int i);

    public final native boolean moveToPrevious();

    public final native void registerContentObserver(ContentObserver contentObserver);

    public final native void registerDataSetObserver(DataSetObserver dataSetObserver);

    public final native boolean requery();

    public final native Bundle respond(Bundle bundle);

    public final native void setNotificationUri(ContentResolver contentResolver, Uri uri);

    public final native void unregisterContentObserver(ContentObserver contentObserver);

    public final native void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
