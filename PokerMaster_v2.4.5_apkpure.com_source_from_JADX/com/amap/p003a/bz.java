package com.amap.p003a;

import a.does.not.Exists2;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ali.fixHelper;

/* compiled from: ILocationProviderService */
/* renamed from: com.amap.a.bz */
public interface bz extends IInterface {

    /* renamed from: com.amap.a.bz.a */
    public static abstract class ILocationProviderService extends Binder implements bz {

        /* renamed from: com.amap.a.bz.a.a */
        private static class ILocationProviderService implements bz {
            private IBinder f539a;

            ILocationProviderService(IBinder iBinder) {
                this.f539a = iBinder;
            }

            public final int m514a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amap.api.service.locationprovider.ILocationProviderService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f539a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f539a;
            }
        }

        static {
            fixHelper.fixfunc(new int[]{3611, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public static bz m515a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amap.api.service.locationprovider.ILocationProviderService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bz)) ? new ILocationProviderService(iBinder) : (bz) queryLocalInterface;
        }

        public native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);
    }

    int m513a(Bundle bundle);
}
