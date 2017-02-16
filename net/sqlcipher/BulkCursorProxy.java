package net.sqlcipher;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.ali.fixHelper;
import java.util.Map;

/* compiled from: BulkCursorNative */
final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras;
    private IBinder mRemote;

    static {
        fixHelper.fixfunc(new int[]{28777, 28778, 28779, 28780, 28781, 28782, 28783, 28784, 28785, 28786, 28787, 28788, 28789, 28790});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native BulkCursorProxy(IBinder iBinder);

    public final native IBinder asBinder();

    public final native void close();

    public final native int count();

    public final native void deactivate();

    public final native boolean deleteRow(int i);

    public final native String[] getColumnNames();

    public final native Bundle getExtras();

    public final native boolean getWantsAllOnMoveCalls();

    public final native CursorWindow getWindow(int i);

    public final native void onMove(int i);

    public final native int requery(IContentObserver iContentObserver, CursorWindow cursorWindow);

    public final native Bundle respond(Bundle bundle);

    public final native boolean updateRows(Map map);
}
