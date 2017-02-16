package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.p051j.p053b.ShareOpenGraphValueContainer.ShareOpenGraphValueContainer;

/* renamed from: com.facebook.j.b.h */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, ShareOpenGraphAction> {
    public static final Creator<ShareOpenGraphAction> CREATOR;

    /* renamed from: com.facebook.j.b.h.1 */
    static class ShareOpenGraphAction implements Creator<ShareOpenGraphAction> {
        ShareOpenGraphAction() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.h.a */
    public static final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, ShareOpenGraphAction> {
        private ShareOpenGraphAction m2505a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            ShareOpenGraphAction shareOpenGraphAction2 = (ShareOpenGraphAction) super.m2504a((ShareOpenGraphValueContainer) shareOpenGraphAction);
            String a = shareOpenGraphAction.m2509a();
            shareOpenGraphAction2.f2597a.putString("og:type", a);
            return shareOpenGraphAction2;
        }

        final ShareOpenGraphAction m2506a(Parcel parcel) {
            return m2505a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    private ShareOpenGraphAction(ShareOpenGraphAction shareOpenGraphAction) {
        super((ShareOpenGraphValueContainer) shareOpenGraphAction);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public final String m2509a() {
        return this.f2598a.getString("og:type");
    }

    static {
        CREATOR = new ShareOpenGraphAction();
    }
}
