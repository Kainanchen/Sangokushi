package com.facebook.p051j.p053b;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.p051j.p053b.ShareHashtag.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.j.b.b */
public abstract class ShareContent<P extends ShareContent, E extends ShareContent> implements C0274g {
    public final Uri f2541h;
    public final List<String> f2542i;
    public final String f2543j;
    public final String f2544k;
    public final ShareHashtag f2545l;

    /* renamed from: com.facebook.j.b.b.a */
    public static abstract class ShareContent<P extends ShareContent, E extends ShareContent> {
        public Uri f2576a;
        List<String> f2577b;
        String f2578c;
        String f2579d;
        ShareHashtag f2580e;

        public E m2498a(P p) {
            if (p != null) {
                this.f2576a = p.f2541h;
                List list = p.f2542i;
                if (list == null) {
                    list = null;
                } else {
                    list = Collections.unmodifiableList(list);
                }
                this.f2577b = list;
                this.f2578c = p.f2543j;
                this.f2579d = p.f2544k;
            }
            return this;
        }
    }

    protected ShareContent(ShareContent shareContent) {
        this.f2541h = shareContent.f2576a;
        this.f2542i = shareContent.f2577b;
        this.f2543j = shareContent.f2578c;
        this.f2544k = shareContent.f2579d;
        this.f2545l = shareContent.f2580e;
    }

    public ShareContent(Parcel parcel) {
        ShareHashtag shareHashtag;
        this.f2541h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        List arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            arrayList = null;
        } else {
            arrayList = Collections.unmodifiableList(arrayList);
        }
        this.f2542i = arrayList;
        this.f2543j = parcel.readString();
        this.f2544k = parcel.readString();
        ShareHashtag shareHashtag2 = new ShareHashtag();
        ShareHashtag shareHashtag3 = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag3 == null) {
            shareHashtag = shareHashtag2;
        } else {
            shareHashtag2.f2581a = shareHashtag3.f2582a;
            shareHashtag = shareHashtag2;
        }
        this.f2545l = new ShareHashtag((byte) 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2541h, 0);
        parcel.writeStringList(this.f2542i);
        parcel.writeString(this.f2543j);
        parcel.writeString(this.f2544k);
        parcel.writeParcelable(this.f2545l, 0);
    }
}
