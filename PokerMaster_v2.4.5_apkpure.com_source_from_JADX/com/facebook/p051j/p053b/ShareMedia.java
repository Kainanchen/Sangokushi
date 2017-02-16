package com.facebook.p051j.p053b;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.facebook.j.b.e */
public abstract class ShareMedia implements C0274g {
    final Bundle f2595a;

    /* renamed from: com.facebook.j.b.e.a */
    public static abstract class ShareMedia<M extends ShareMedia, B extends ShareMedia> {
        Bundle f2591a;

        public ShareMedia() {
            this.f2591a = new Bundle();
        }

        public B m2501a(M m) {
            if (m != null) {
                this.f2591a.putAll(new Bundle(m.f2595a));
            }
            return this;
        }
    }

    /* renamed from: com.facebook.j.b.e.b */
    public enum ShareMedia {
        PHOTO,
        VIDEO
    }

    public abstract ShareMedia m2502a();

    protected ShareMedia(ShareMedia shareMedia) {
        this.f2595a = new Bundle(shareMedia.f2591a);
    }

    ShareMedia(Parcel parcel) {
        this.f2595a = parcel.readBundle();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2595a);
    }
}
