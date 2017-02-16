package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.p036h.af;
import com.facebook.p036h.af.Utility;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.w */
public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR;
    private final String f2757a;
    private final String f2758b;
    private final String f2759c;
    private final String f2760d;
    private final String f2761e;
    private final Uri f2762f;

    /* renamed from: com.facebook.w.1 */
    static class Profile implements Utility {
        Profile() {
        }

        public final void m2660a(JSONObject jSONObject) {
            String optString = jSONObject.optString("id");
            if (optString != null) {
                String optString2 = jSONObject.optString("link");
                Profile.m2662a(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString(SelectCountryActivity.EXTRA_COUNTRY_NAME), optString2 != null ? Uri.parse(optString2) : null));
            }
        }

        public final void m2659a(FacebookException facebookException) {
        }
    }

    /* renamed from: com.facebook.w.2 */
    static class Profile implements Creator {
        Profile() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Profile[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Profile((byte) 0);
        }
    }

    public static Profile m2661a() {
        return ProfileManager.m2666a().f2766b;
    }

    public static void m2662a(Profile profile) {
        ProfileManager.m2666a().m2667a(profile, true);
    }

    public static void m2663b() {
        AccessToken a = AccessToken.m883a();
        if (a == null) {
            Profile.m2662a(null);
        } else {
            af.m1516a(a.f922d, new Profile());
        }
    }

    public Profile(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri) {
        ag.m1545a(str, "id");
        this.f2757a = str;
        this.f2758b = str2;
        this.f2759c = str3;
        this.f2760d = str4;
        this.f2761e = str5;
        this.f2762f = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (this.f2757a.equals(profile.f2757a) && this.f2758b == null) {
            if (profile.f2758b != null) {
                return false;
            }
            return true;
        } else if (this.f2758b.equals(profile.f2758b) && this.f2759c == null) {
            if (profile.f2759c != null) {
                return false;
            }
            return true;
        } else if (this.f2759c.equals(profile.f2759c) && this.f2760d == null) {
            if (profile.f2760d != null) {
                return false;
            }
            return true;
        } else if (this.f2760d.equals(profile.f2760d) && this.f2761e == null) {
            if (profile.f2761e != null) {
                return false;
            }
            return true;
        } else if (!this.f2761e.equals(profile.f2761e) || this.f2762f != null) {
            return this.f2762f.equals(profile.f2762f);
        } else {
            if (profile.f2762f != null) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode = this.f2757a.hashCode() + 527;
        if (this.f2758b != null) {
            hashCode = (hashCode * 31) + this.f2758b.hashCode();
        }
        if (this.f2759c != null) {
            hashCode = (hashCode * 31) + this.f2759c.hashCode();
        }
        if (this.f2760d != null) {
            hashCode = (hashCode * 31) + this.f2760d.hashCode();
        }
        if (this.f2761e != null) {
            hashCode = (hashCode * 31) + this.f2761e.hashCode();
        }
        if (this.f2762f != null) {
            return (hashCode * 31) + this.f2762f.hashCode();
        }
        return hashCode;
    }

    final JSONObject m2664c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f2757a);
            jSONObject.put("first_name", this.f2758b);
            jSONObject.put("middle_name", this.f2759c);
            jSONObject.put("last_name", this.f2760d);
            jSONObject.put(SelectCountryActivity.EXTRA_COUNTRY_NAME, this.f2761e);
            if (this.f2762f == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f2762f.toString());
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f2757a = jSONObject.optString("id", null);
        this.f2758b = jSONObject.optString("first_name", null);
        this.f2759c = jSONObject.optString("middle_name", null);
        this.f2760d = jSONObject.optString("last_name", null);
        this.f2761e = jSONObject.optString(SelectCountryActivity.EXTRA_COUNTRY_NAME, null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f2762f = uri;
    }

    private Profile(Parcel parcel) {
        this.f2757a = parcel.readString();
        this.f2758b = parcel.readString();
        this.f2759c = parcel.readString();
        this.f2760d = parcel.readString();
        this.f2761e = parcel.readString();
        String readString = parcel.readString();
        this.f2762f = readString == null ? null : Uri.parse(readString);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2757a);
        parcel.writeString(this.f2758b);
        parcel.writeString(this.f2759c);
        parcel.writeString(this.f2760d);
        parcel.writeString(this.f2761e);
        parcel.writeString(this.f2762f == null ? null : this.f2762f.toString());
    }

    static {
        CREATOR = new Profile();
    }
}
