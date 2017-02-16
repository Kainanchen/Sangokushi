package net.sqlcipher;

import a.does.not.Exists0;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import com.ali.fixHelper;

public abstract class BulkCursorNative extends Binder implements IBulkCursor {
    static {
        fixHelper.fixfunc(new int[]{33020, 33021, 33022});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native IBinder asBinder();

    public native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);

    public static IBulkCursor asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IBulkCursor iBulkCursor = (IBulkCursor) iBinder.queryLocalInterface(IBulkCursor.descriptor);
        return iBulkCursor == null ? new BulkCursorProxy(iBinder) : iBulkCursor;
    }
}
