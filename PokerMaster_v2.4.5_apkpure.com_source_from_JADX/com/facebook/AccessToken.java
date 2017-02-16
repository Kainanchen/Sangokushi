package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.android.tpush.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR;
    private static final Date f915i;
    private static final Date f916j;
    private static final Date f917k;
    private static final AccessTokenSource f918l;
    public final Date f919a;
    public final Set<String> f920b;
    final Set<String> f921c;
    public final String f922d;
    final AccessTokenSource f923e;
    final Date f924f;
    public final String f925g;
    public final String f926h;

    /* renamed from: com.facebook.a.1 */
    static class AccessToken implements Creator {
        AccessToken() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccessToken[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }
    }

    /* renamed from: com.facebook.a.a */
    public interface AccessToken {
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f915i = date;
        f916j = date;
        f917k = new Date();
        f918l = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new AccessToken();
    }

    public AccessToken(String str, String str2, String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2) {
        ag.m1545a(str, "accessToken");
        ag.m1545a(str2, "applicationId");
        ag.m1545a(str3, "userId");
        if (date == null) {
            date = f916j;
        }
        this.f919a = date;
        this.f920b = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f921c = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f922d = str;
        if (accessTokenSource == null) {
            accessTokenSource = f918l;
        }
        this.f923e = accessTokenSource;
        if (date2 == null) {
            date2 = f917k;
        }
        this.f924f = date2;
        this.f925g = str2;
        this.f926h = str3;
    }

    public static AccessToken m883a() {
        return AccessTokenManager.m999a().f1096b;
    }

    public static void m887a(AccessToken accessToken) {
        AccessTokenManager.m999a().m1003a(accessToken, true);
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccessToken");
        StringBuilder append = stringBuilder.append(" token:");
        if (this.f922d == null) {
            str = "null";
        } else if (FacebookSdk.m2577a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
            str = this.f922d;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        append.append(str);
        stringBuilder.append(" permissions:");
        if (this.f920b == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("[");
            stringBuilder.append(TextUtils.join(", ", this.f920b));
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        if (r4 != r5) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r5 instanceof com.facebook.AccessToken;
        if (r2 != 0) goto L_0x000b;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r5 = (com.facebook.AccessToken) r5;
        r2 = r4.f919a;
        r3 = r5.f919a;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0017:
        r2 = r4.f920b;
        r3 = r5.f920b;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0021:
        r2 = r4.f921c;
        r3 = r5.f921c;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x002b:
        r2 = r4.f922d;
        r3 = r5.f922d;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0035:
        r2 = r4.f923e;
        r3 = r5.f923e;
        if (r2 != r3) goto L_0x0057;
    L_0x003b:
        r2 = r4.f924f;
        r3 = r5.f924f;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0045:
        r2 = r4.f925g;
        if (r2 != 0) goto L_0x0059;
    L_0x0049:
        r2 = r5.f925g;
        if (r2 != 0) goto L_0x0057;
    L_0x004d:
        r2 = r4.f926h;
        r3 = r5.f926h;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0004;
    L_0x0057:
        r0 = r1;
        goto L_0x0004;
    L_0x0059:
        r2 = r4.f925g;
        r3 = r5.f925g;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0063:
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((this.f925g == null ? 0 : this.f925g.hashCode()) + ((((((((((((this.f919a.hashCode() + 527) * 31) + this.f920b.hashCode()) * 31) + this.f921c.hashCode()) * 31) + this.f922d.hashCode()) * 31) + this.f923e.hashCode()) * 31) + this.f924f.hashCode()) * 31)) * 31) + this.f926h.hashCode();
    }

    static AccessToken m884a(Bundle bundle) {
        Collection a = AccessToken.m886a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        Collection a2 = AccessToken.m886a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String d = LegacyTokenHelper.m2656d(bundle);
        if (af.m1523a(d)) {
            d = FacebookSdk.m2590j();
        }
        String b = LegacyTokenHelper.m2654b(bundle);
        try {
            return new AccessToken(b, d, af.m1539e(b).getString("id"), a, a2, LegacyTokenHelper.m2655c(bundle), LegacyTokenHelper.m2651a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.m2651a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
        } catch (JSONException e) {
            return null;
        }
    }

    private static List<String> m886a(Bundle bundle, String str) {
        Collection stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final boolean m888b() {
        return new Date().after(this.f919a);
    }

    static AccessToken m885a(JSONObject jSONObject) {
        if (jSONObject.getInt(LogBuilder.KEY_VERSION) > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString(Constants.FLAG_TOKEN);
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        return new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), af.m1506a(jSONArray), af.m1506a(jSONArray2), AccessTokenSource.valueOf(jSONObject.getString(WBConstants.GAME_PARAMS_SOURCE)), date, date2);
    }

    AccessToken(Parcel parcel) {
        this.f919a = new Date(parcel.readLong());
        Collection arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f920b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f921c = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f922d = parcel.readString();
        this.f923e = AccessTokenSource.valueOf(parcel.readString());
        this.f924f = new Date(parcel.readLong());
        this.f925g = parcel.readString();
        this.f926h = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f919a.getTime());
        parcel.writeStringList(new ArrayList(this.f920b));
        parcel.writeStringList(new ArrayList(this.f921c));
        parcel.writeString(this.f922d);
        parcel.writeString(this.f923e.name());
        parcel.writeLong(this.f924f.getTime());
        parcel.writeString(this.f925g);
        parcel.writeString(this.f926h);
    }
}
