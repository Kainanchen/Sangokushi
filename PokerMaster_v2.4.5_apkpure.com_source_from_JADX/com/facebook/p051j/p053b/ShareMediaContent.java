package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.j.b.f */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Creator<ShareMediaContent> CREATOR;
    public final List<ShareMedia> f2596a;

    /* renamed from: com.facebook.j.b.f.1 */
    static class ShareMediaContent implements Creator<ShareMediaContent> {
        ShareMediaContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMediaContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f2596a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f2596a.toArray(), i);
    }

    static {
        CREATOR = new ShareMediaContent();
    }
}
