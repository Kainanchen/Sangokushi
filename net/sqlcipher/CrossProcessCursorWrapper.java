package net.sqlcipher;

import a.does.not.Exists0;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    static {
        fixHelper.fixfunc(new int[]{5541, 5542, 5543, 5544});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native CrossProcessCursorWrapper(Cursor cursor);

    public native void fillWindow(int i, CursorWindow cursorWindow);

    public native CursorWindow getWindow();

    public native boolean onMove(int i, int i2);
}
