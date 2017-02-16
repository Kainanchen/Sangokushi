package com.tencent.android.tpush.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.tencent.android.tpush.data.b */
final class ProGuard implements Creator {
    ProGuard() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m4847a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return m4848a(i);
    }

    public final StorageEntity m4847a(Parcel parcel) {
        return new StorageEntity(parcel);
    }

    public final StorageEntity[] m4848a(int i) {
        return new StorageEntity[i];
    }
}
