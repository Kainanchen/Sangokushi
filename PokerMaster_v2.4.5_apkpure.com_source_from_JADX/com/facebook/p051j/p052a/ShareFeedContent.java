package com.facebook.p051j.p052a;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p051j.p053b.ShareContent;

/* renamed from: com.facebook.j.a.j */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Creator<ShareFeedContent> CREATOR;
    public final String f2546a;
    public final String f2547b;
    public final String f2548c;
    public final String f2549d;
    public final String f2550e;
    public final String f2551f;
    public final String f2552g;

    /* renamed from: com.facebook.j.a.j.1 */
    static class ShareFeedContent implements Creator<ShareFeedContent> {
        ShareFeedContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareFeedContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f2546a = parcel.readString();
        this.f2547b = parcel.readString();
        this.f2548c = parcel.readString();
        this.f2549d = parcel.readString();
        this.f2550e = parcel.readString();
        this.f2551f = parcel.readString();
        this.f2552g = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2546a);
        parcel.writeString(this.f2547b);
        parcel.writeString(this.f2548c);
        parcel.writeString(this.f2549d);
        parcel.writeString(this.f2550e);
        parcel.writeString(this.f2551f);
        parcel.writeString(this.f2552g);
    }

    static {
        CREATOR = new ShareFeedContent();
    }
}
