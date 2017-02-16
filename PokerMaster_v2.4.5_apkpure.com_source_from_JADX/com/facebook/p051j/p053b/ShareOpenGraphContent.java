package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.j.b.i */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR;
    public final ShareOpenGraphAction f2599a;
    public final String f2600b;

    /* renamed from: com.facebook.j.b.i.1 */
    static class ShareOpenGraphContent implements Creator<ShareOpenGraphContent> {
        ShareOpenGraphContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f2599a = new ShareOpenGraphAction((byte) 0);
        this.f2600b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2599a, 0);
        parcel.writeString(this.f2600b);
    }

    static {
        CREATOR = new ShareOpenGraphContent();
    }
}
