package net.sqlcipher;

import a.does.not.Exists0;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class CursorWrapper extends android.database.CursorWrapper implements Cursor {
    private final Cursor mCursor;

    static {
        fixHelper.fixfunc(new int[]{21902, 21903, 21904, 21905});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native CursorWrapper(Cursor cursor);

    public native int getType(int i);

    public native /* bridge */ /* synthetic */ Cursor getWrappedCursor();

    public native Cursor m7096getWrappedCursor();
}
