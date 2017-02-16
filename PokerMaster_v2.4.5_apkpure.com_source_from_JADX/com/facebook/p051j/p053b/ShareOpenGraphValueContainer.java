package com.facebook.p051j.p053b;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;

/* renamed from: com.facebook.j.b.k */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends ShareOpenGraphValueContainer> implements C0274g {
    public final Bundle f2598a;

    /* renamed from: com.facebook.j.b.k.a */
    public static abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends ShareOpenGraphValueContainer> {
        Bundle f2597a;

        public ShareOpenGraphValueContainer() {
            this.f2597a = new Bundle();
        }

        public E m2504a(P p) {
            if (p != null) {
                this.f2597a.putAll((Bundle) p.f2598a.clone());
            }
            return this;
        }
    }

    protected ShareOpenGraphValueContainer(ShareOpenGraphValueContainer<P, E> shareOpenGraphValueContainer) {
        this.f2598a = (Bundle) shareOpenGraphValueContainer.f2597a.clone();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f2598a = parcel.readBundle(ShareOpenGraphValueContainer.class.getClassLoader());
    }

    @Nullable
    public final Object m2508a(String str) {
        return this.f2598a.get(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2598a);
    }
}
