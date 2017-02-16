package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p051j.p053b.SharePhoto.SharePhoto;

/* renamed from: com.facebook.j.b.o */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> implements C0274g {
    public static final Creator<ShareVideoContent> CREATOR;
    public final String f2613a;
    public final String f2614b;
    public final SharePhoto f2615c;
    public final ShareVideo f2616d;

    /* renamed from: com.facebook.j.b.o.1 */
    static class ShareVideoContent implements Creator<ShareVideoContent> {
        ShareVideoContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareVideoContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f2613a = parcel.readString();
        this.f2614b = parcel.readString();
        SharePhoto a = new SharePhoto().m2511a(parcel);
        if (a.f2602c == null && a.f2601b == null) {
            this.f2615c = null;
        } else {
            this.f2615c = a.m2513a();
        }
        this.f2616d = new ShareVideo((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2613a);
        parcel.writeString(this.f2614b);
        parcel.writeParcelable(this.f2615c, 0);
        parcel.writeParcelable(this.f2616d, 0);
    }

    static {
        CREATOR = new ShareVideoContent();
    }
}
