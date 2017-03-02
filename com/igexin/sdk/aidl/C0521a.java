package com.igexin.sdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.sdk.aidl.a */
public abstract class C0521a extends Binder implements ICACallback {
    public static ICACallback m1881a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.igexin.sdk.aidl.ICACallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ICACallback)) ? new C0522b(iBinder) : (ICACallback) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean onAuthenticated;
        switch (i) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.ICACallback");
                onAuthenticated = onAuthenticated(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(onAuthenticated ? 1 : 0);
                return true;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.ICACallback");
                onAuthenticated = onError(parcel.readInt());
                parcel2.writeNoException();
                if (onAuthenticated) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.igexin.sdk.aidl.ICACallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
