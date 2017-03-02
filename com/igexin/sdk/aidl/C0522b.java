package com.igexin.sdk.aidl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.igexin.sdk.aidl.b */
class C0522b implements ICACallback {
    private IBinder f1446a;

    C0522b(IBinder iBinder) {
        this.f1446a = iBinder;
    }

    public IBinder asBinder() {
        return this.f1446a;
    }

    public boolean onAuthenticated(String str, String str2, String str3, long j) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.igexin.sdk.aidl.ICACallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeLong(j);
            this.f1446a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean onError(int i) {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.igexin.sdk.aidl.ICACallback");
            obtain.writeInt(i);
            this.f1446a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
