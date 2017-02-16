package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.j.b.j */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Creator<ShareOpenGraphObject> CREATOR;

    /* renamed from: com.facebook.j.b.j.1 */
    static class ShareOpenGraphObject implements Creator<ShareOpenGraphObject> {
        ShareOpenGraphObject() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }
    }

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }

    static {
        CREATOR = new ShareOpenGraphObject();
    }
}
