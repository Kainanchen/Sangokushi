package com.facebook.p051j.p053b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p051j.p053b.ShareContent.ShareContent;

/* renamed from: com.facebook.j.b.d */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, ShareLinkContent> {
    public static final Creator<ShareLinkContent> CREATOR;
    public final String f2587a;
    public final String f2588b;
    public final Uri f2589c;
    public final String f2590d;

    /* renamed from: com.facebook.j.b.d.1 */
    static class ShareLinkContent implements Creator<ShareLinkContent> {
        ShareLinkContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareLinkContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.d.a */
    public static final class ShareLinkContent extends ShareContent<ShareLinkContent, ShareLinkContent> {
        public String f2583f;
        public String f2584g;
        public Uri f2585h;
        public String f2586i;

        public final /* bridge */ /* synthetic */ ShareContent m2499a(ShareContent shareContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            if (shareLinkContent == null) {
                return this;
            }
            ShareContent shareContent2 = (ShareLinkContent) super.m2498a(shareLinkContent);
            shareContent2.f2583f = shareLinkContent.f2587a;
            shareContent2.f2585h = shareLinkContent.f2589c;
            shareContent2.f2584g = shareLinkContent.f2588b;
            shareContent2.f2586i = shareLinkContent.f2590d;
            return shareContent2;
        }

        public final ShareLinkContent m2500a() {
            return new ShareLinkContent();
        }
    }

    private ShareLinkContent(ShareLinkContent shareLinkContent) {
        super((ShareContent) shareLinkContent);
        this.f2587a = shareLinkContent.f2583f;
        this.f2588b = shareLinkContent.f2584g;
        this.f2589c = shareLinkContent.f2585h;
        this.f2590d = shareLinkContent.f2586i;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f2587a = parcel.readString();
        this.f2588b = parcel.readString();
        this.f2589c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f2590d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2587a);
        parcel.writeString(this.f2588b);
        parcel.writeParcelable(this.f2589c, 0);
        parcel.writeString(this.f2590d);
    }

    static {
        CREATOR = new ShareLinkContent();
    }
}
