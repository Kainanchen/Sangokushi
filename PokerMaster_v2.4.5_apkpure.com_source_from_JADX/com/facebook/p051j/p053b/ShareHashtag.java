package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.j.b.c */
public class ShareHashtag implements C0274g {
    public static final Creator<ShareHashtag> CREATOR;
    public final String f2582a;

    /* renamed from: com.facebook.j.b.c.1 */
    static class ShareHashtag implements Creator<ShareHashtag> {
        ShareHashtag() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareHashtag[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.c.a */
    public static class ShareHashtag {
        String f2581a;
    }

    private ShareHashtag(ShareHashtag shareHashtag) {
        this.f2582a = shareHashtag.f2581a;
    }

    ShareHashtag(Parcel parcel) {
        this.f2582a = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2582a);
    }

    static {
        CREATOR = new ShareHashtag();
    }
}
