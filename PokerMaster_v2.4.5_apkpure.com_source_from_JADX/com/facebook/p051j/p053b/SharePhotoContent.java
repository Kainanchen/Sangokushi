package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.p051j.p053b.ShareContent.ShareContent;
import com.facebook.p051j.p053b.SharePhoto.SharePhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.j.b.m */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, SharePhotoContent> {
    public static final Creator<SharePhotoContent> CREATOR;
    public final List<SharePhoto> f2610a;

    /* renamed from: com.facebook.j.b.m.1 */
    static class SharePhotoContent implements Creator<SharePhotoContent> {
        SharePhotoContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SharePhotoContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.m.a */
    public static class SharePhotoContent extends ShareContent<SharePhotoContent, SharePhotoContent> {
        final List<SharePhoto> f2609f;

        public SharePhotoContent() {
            this.f2609f = new ArrayList();
        }

        public final SharePhotoContent m2517a(@Nullable SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f2609f.add(new SharePhoto().m2512a(sharePhoto).m2513a());
            }
            return this;
        }

        private SharePhotoContent m2515b(@Nullable List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto a : list) {
                    m2517a(a);
                }
            }
            return this;
        }

        public final SharePhotoContent m2520a() {
            return new SharePhotoContent();
        }

        public final SharePhotoContent m2518a(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((SharePhotoContent) super.m2498a(sharePhotoContent)).m2515b(sharePhotoContent.f2610a);
        }

        public final SharePhotoContent m2519a(@Nullable List<SharePhoto> list) {
            this.f2609f.clear();
            m2515b(list);
            return this;
        }
    }

    private SharePhotoContent(SharePhotoContent sharePhotoContent) {
        super((ShareContent) sharePhotoContent);
        this.f2610a = Collections.unmodifiableList(sharePhotoContent.f2609f);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        List<ShareMedia> arrayList = new ArrayList(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        List arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add((SharePhoto) shareMedia);
            }
        }
        this.f2610a = Collections.unmodifiableList(arrayList2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List list = this.f2610a;
        Parcelable[] parcelableArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcelableArr[i2] = (ShareMedia) list.get(i2);
        }
        parcel.writeParcelableArray(parcelableArr, i);
    }

    static {
        CREATOR = new SharePhotoContent();
    }
}
