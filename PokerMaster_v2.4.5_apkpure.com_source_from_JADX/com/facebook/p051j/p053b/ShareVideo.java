package com.facebook.p051j.p053b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p051j.p053b.ShareMedia.ShareMedia;

/* renamed from: com.facebook.j.b.n */
public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR;
    public final Uri f2612b;

    /* renamed from: com.facebook.j.b.n.1 */
    static class ShareVideo implements Creator<ShareVideo> {
        ShareVideo() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareVideo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.n.a */
    public static final class ShareVideo extends ShareMedia<ShareVideo, ShareVideo> {
        Uri f2611b;

        private ShareVideo m2521a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            ShareVideo shareVideo2 = (ShareVideo) super.m2501a(shareVideo);
            shareVideo2.f2611b = shareVideo.f2612b;
            return shareVideo2;
        }

        final ShareVideo m2523a(Parcel parcel) {
            return m2521a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    private ShareVideo(ShareVideo shareVideo) {
        super((ShareMedia) shareVideo);
        this.f2612b = shareVideo.f2611b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f2612b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2612b, 0);
    }

    static {
        CREATOR = new ShareVideo();
    }

    public final ShareMedia m2524a() {
        return ShareMedia.VIDEO;
    }
}
