package com.facebook.p051j.p053b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p051j.p053b.ShareMedia.ShareMedia;

/* renamed from: com.facebook.j.b.l */
public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR;
    public final Bitmap f2605b;
    public final Uri f2606c;
    public final boolean f2607d;
    final String f2608e;

    /* renamed from: com.facebook.j.b.l.1 */
    static class SharePhoto implements Creator<SharePhoto> {
        SharePhoto() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SharePhoto[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.l.a */
    public static final class SharePhoto extends ShareMedia<SharePhoto, SharePhoto> {
        public Bitmap f2601b;
        public Uri f2602c;
        boolean f2603d;
        String f2604e;

        public final SharePhoto m2513a() {
            return new SharePhoto();
        }

        public final SharePhoto m2512a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            SharePhoto sharePhoto2 = (SharePhoto) super.m2501a(sharePhoto);
            sharePhoto2.f2601b = sharePhoto.f2605b;
            sharePhoto2.f2602c = sharePhoto.f2606c;
            sharePhoto2.f2603d = sharePhoto.f2607d;
            sharePhoto2.f2604e = sharePhoto.f2608e;
            return sharePhoto2;
        }

        final SharePhoto m2511a(Parcel parcel) {
            return m2512a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }
    }

    private SharePhoto(SharePhoto sharePhoto) {
        super((ShareMedia) sharePhoto);
        this.f2605b = sharePhoto.f2601b;
        this.f2606c = sharePhoto.f2602c;
        this.f2607d = sharePhoto.f2603d;
        this.f2608e = sharePhoto.f2604e;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f2605b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f2606c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f2607d = parcel.readByte() != null;
        this.f2608e = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2605b, 0);
        parcel.writeParcelable(this.f2606c, 0);
        if (this.f2607d) {
            i2 = 1;
        }
        parcel.writeByte((byte) i2);
        parcel.writeString(this.f2608e);
    }

    static {
        CREATOR = new SharePhoto();
    }

    public final ShareMedia m2514a() {
        return ShareMedia.PHOTO;
    }
}
