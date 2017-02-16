package net.sqlcipher;

import a.does.not.Exists0;
import android.database.CharArrayBuffer;
import android.database.CursorWindow;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow mWindow;

    static {
        fixHelper.fixfunc(new int[]{19935, 19936, 19937, 19938, 19939, 19940, 19941, 19942, 19943, 19944, 19945, 19946, 19947, 19948, 19949, 19950, 19951, 19952, 19953, 19954});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native void checkPosition();

    public native void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer);

    public native byte[] getBlob(int i);

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public native short getShort(int i);

    public native String getString(int i);

    public native int getType(int i);

    public native /* bridge */ /* synthetic */ CursorWindow getWindow();

    public native CursorWindow m7094getWindow();

    public native boolean hasWindow();

    public native boolean isBlob(int i);

    public native boolean isFloat(int i);

    public native boolean isLong(int i);

    public native boolean isNull(int i);

    public native boolean isString(int i);

    public native void setWindow(CursorWindow cursorWindow);
}
