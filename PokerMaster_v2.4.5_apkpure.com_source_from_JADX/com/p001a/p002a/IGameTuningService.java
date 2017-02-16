package com.p001a.p002a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.a.a.a */
public interface IGameTuningService extends IInterface {

    /* renamed from: com.a.a.a.a */
    public static abstract class IGameTuningService extends Binder implements IGameTuningService {

        /* renamed from: com.a.a.a.a.a */
        private static class IGameTuningService implements IGameTuningService {
            private IBinder f9a;

            IGameTuningService(IBinder iBinder) {
                this.f9a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f9a;
            }

            public final int m21a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f9a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int m23b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f9a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int m24c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    obtain.writeInt(i);
                    this.f9a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int m20a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    this.f9a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int m22a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f9a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IGameTuningService m25a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.enhance.gameservice.IGameTuningService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGameTuningService)) {
                return new IGameTuningService(iBinder);
            }
            return (IGameTuningService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int a;
            switch (i) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    parcel.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    a = m16a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    parcel.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    a = m18b(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    parcel.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    a = m19c(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    parcel.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    a = m15a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    parcel.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    a = m17a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.enhance.gameservice.IGameTuningService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int m15a();

    int m16a(int i);

    int m17a(boolean z);

    int m18b(int i);

    int m19c(int i);
}
