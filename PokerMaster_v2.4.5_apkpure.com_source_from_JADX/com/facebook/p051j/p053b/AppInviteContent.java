package com.facebook.p051j.p053b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.j.b.a */
public final class AppInviteContent implements C0274g {
    public static final Creator<AppInviteContent> CREATOR;
    public final String f2571a;
    public final String f2572b;
    public final String f2573c;
    public final String f2574d;
    public final AppInviteContent f2575e;

    /* renamed from: com.facebook.j.b.a.1 */
    static class AppInviteContent implements Creator<AppInviteContent> {
        AppInviteContent() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AppInviteContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }
    }

    /* renamed from: com.facebook.j.b.a.a */
    public static class AppInviteContent {
        public String f2566a;
        public String f2567b;
        String f2568c;
        String f2569d;
        AppInviteContent f2570e;

        /* renamed from: com.facebook.j.b.a.a.a */
        public enum AppInviteContent {
            FACEBOOK("facebook"),
            MESSENGER("messenger");
            
            private final String f2565c;

            private AppInviteContent(String str) {
                this.f2565c = str;
            }

            public final String toString() {
                return this.f2565c;
            }
        }
    }

    private AppInviteContent(AppInviteContent appInviteContent) {
        this.f2571a = appInviteContent.f2566a;
        this.f2572b = appInviteContent.f2567b;
        this.f2573c = appInviteContent.f2568c;
        this.f2574d = appInviteContent.f2569d;
        this.f2575e = appInviteContent.f2570e;
    }

    AppInviteContent(Parcel parcel) {
        this.f2571a = parcel.readString();
        this.f2572b = parcel.readString();
        this.f2574d = parcel.readString();
        this.f2573c = parcel.readString();
        String readString = parcel.readString();
        if (readString.length() > 0) {
            this.f2575e = AppInviteContent.valueOf(readString);
        } else {
            this.f2575e = AppInviteContent.FACEBOOK;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2571a);
        parcel.writeString(this.f2572b);
        parcel.writeString(this.f2574d);
        parcel.writeString(this.f2573c);
        parcel.writeString(this.f2575e.toString());
    }

    static {
        CREATOR = new AppInviteContent();
    }
}
