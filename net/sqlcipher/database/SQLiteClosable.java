package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public abstract class SQLiteClosable {
    private Object mLock;
    private int mReferenceCount;

    static {
        fixHelper.fixfunc(new int[]{18451, 18452, 18453, 18454, 18455, 18456});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native String getObjInfo();

    public native void acquireReference();

    protected abstract void onAllReferencesReleased();

    protected native void onAllReferencesReleasedFromContainer();

    public native void releaseReference();

    public native void releaseReferenceFromContainer();
}
