package net.sqlcipher;

import a.does.not.Exists0;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ali.fixHelper;

public interface IContentObserver extends IInterface {

    public static abstract class Stub extends Binder implements IContentObserver {
        private static final String DESCRIPTOR = "net.sqlcipher.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        private static class Proxy implements IContentObserver {
            private IBinder mRemote;

            static {
                fixHelper.fixfunc(new int[]{4485, 4486, 4487, 4488});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native Proxy(IBinder iBinder);

            public native IBinder asBinder();

            public native String getInterfaceDescriptor();

            public native void onChange(boolean z);
        }

        static {
            fixHelper.fixfunc(new int[]{14737, 14738, 14739});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native IBinder asBinder();

        public native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);

        public static IContentObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IContentObserver)) {
                return new Proxy(iBinder);
            }
            return (IContentObserver) queryLocalInterface;
        }
    }

    void onChange(boolean z);
}
