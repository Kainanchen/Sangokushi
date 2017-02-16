package net.sqlcipher;

import a.does.not.Exists0;
import android.database.CharArrayBuffer;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.ali.fixHelper;

public class CursorWindow extends android.database.CursorWindow implements Parcelable {
    public static final Creator<CursorWindow> CREATOR = null;
    private int mStartPos;
    private int nWindow;

    /* renamed from: net.sqlcipher.CursorWindow.1 */
    static class C03941 implements Creator<CursorWindow> {
        static {
            fixHelper.fixfunc(new int[]{23798, 23799, 23800, 23801, 23802});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C03941();

        public final native /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel);

        public final native CursorWindow m7097createFromParcel(Parcel parcel);

        public final native /* bridge */ /* synthetic */ Object[] newArray(int i);

        public final native CursorWindow[] m7098newArray(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{15035, 15036, 15037, 15038, 15039, 15040, 15041, 15042, 15043, 15044, 15045, 15046, 15047, 15048, 15049, 15050, 15051, 15052, 15053, 15054, 15055, 15056, 15057, 15058, 15059, 15060, 15061, 15062, 15063, 15064, 15065, 15066, 15067});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native CursorWindow(Parcel parcel, int i);

    public native CursorWindow(boolean z);

    private native boolean allocRow_native();

    private native void close_native();

    private native char[] copyStringToBuffer_native(int i, int i2, int i3, CharArrayBuffer charArrayBuffer);

    private native void freeLastRow_native();

    private native byte[] getBlob_native(int i, int i2);

    private native double getDouble_native(int i, int i2);

    private native long getLong_native(int i, int i2);

    private native int getNumRows_native();

    private native String getString_native(int i, int i2);

    private native int getType_native(int i, int i2);

    private native boolean isBlob_native(int i, int i2);

    private native boolean isFloat_native(int i, int i2);

    private native boolean isInteger_native(int i, int i2);

    private native boolean isNull_native(int i, int i2);

    private native boolean isString_native(int i, int i2);

    private native void native_clear();

    private native IBinder native_getBinder();

    private native void native_init(IBinder iBinder);

    private native void native_init(boolean z);

    private native boolean putBlob_native(byte[] bArr, int i, int i2);

    private native boolean putDouble_native(double d, int i, int i2);

    private native boolean putLong_native(long j, int i, int i2);

    private native boolean putNull_native(int i, int i2);

    private native boolean putString_native(String str, int i, int i2);

    private native boolean setNumColumns_native(int i);

    public native boolean allocRow();

    public native void clear();

    public native void close();

    public native void copyStringToBuffer(int i, int i2, CharArrayBuffer charArrayBuffer);

    public native int describeContents();

    protected native void finalize();

    public native void freeLastRow();

    public native byte[] getBlob(int i, int i2);

    public native double getDouble(int i, int i2);

    public native float getFloat(int i, int i2);

    public native int getInt(int i, int i2);

    public native long getLong(int i, int i2);

    public native int getNumRows();

    public native short getShort(int i, int i2);

    public native int getStartPosition();

    public native String getString(int i, int i2);

    public native int getType(int i, int i2);

    public native boolean isBlob(int i, int i2);

    public native boolean isFloat(int i, int i2);

    public native boolean isLong(int i, int i2);

    public native boolean isNull(int i, int i2);

    public native boolean isString(int i, int i2);

    protected native void onAllReferencesReleased();

    public native boolean putBlob(byte[] bArr, int i, int i2);

    public native boolean putDouble(double d, int i, int i2);

    public native boolean putLong(long j, int i, int i2);

    public native boolean putNull(int i, int i2);

    public native boolean putString(String str, int i, int i2);

    public native boolean setNumColumns(int i);

    public native void setStartPosition(int i);

    public native void writeToParcel(Parcel parcel, int i);

    static void __clinit__() {
        CREATOR = new C03941();
    }

    public static CursorWindow newFromParcel(Parcel parcel) {
        return (CursorWindow) CREATOR.createFromParcel(parcel);
    }
}
