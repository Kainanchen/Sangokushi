package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.p036h.FacebookRequestErrorClassification;
import com.facebook.p036h.FetchedAppSettings;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.af;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.android.tpush.common.MessageKey;
import java.net.HttpURLConnection;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.l */
public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR;
    static final FacebookRequestError f2650a;
    final int f2651b;
    public final int f2652c;
    public final int f2653d;
    final String f2654e;
    public final FacebookException f2655f;
    private final int f2656g;
    private final String f2657h;
    private final String f2658i;
    private final String f2659j;
    private final String f2660k;
    private final JSONObject f2661l;
    private final JSONObject f2662m;
    private final Object f2663n;
    private final HttpURLConnection f2664o;

    /* renamed from: com.facebook.l.1 */
    static class FacebookRequestError implements Creator<FacebookRequestError> {
        FacebookRequestError() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FacebookRequestError[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FacebookRequestError((byte) 0);
        }
    }

    /* renamed from: com.facebook.l.a */
    public enum FacebookRequestError {
        ;

        public static int[] m2570a() {
            return (int[]) f2647d.clone();
        }

        static {
            f2644a = 1;
            f2645b = 2;
            f2646c = 3;
            f2647d = new int[]{f2644a, f2645b, f2646c};
        }
    }

    /* renamed from: com.facebook.l.b */
    private static class FacebookRequestError {
        final int f2648a;
        final int f2649b;

        private FacebookRequestError() {
            this.f2648a = 200;
            this.f2649b = 299;
        }
    }

    static {
        f2650a = new FacebookRequestError();
        CREATOR = new FacebookRequestError();
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int i4;
        String str5;
        this.f2651b = i;
        this.f2652c = i2;
        this.f2653d = i3;
        this.f2654e = str;
        this.f2657h = str2;
        this.f2662m = jSONObject;
        this.f2661l = jSONObject2;
        this.f2663n = obj;
        this.f2664o = httpURLConnection;
        this.f2658i = str3;
        this.f2659j = str4;
        Object obj2 = null;
        if (facebookException != null) {
            this.f2655f = facebookException;
            obj2 = 1;
        } else {
            this.f2655f = new FacebookServiceException(this, str2);
        }
        FacebookRequestErrorClassification b = FacebookRequestError.m2572b();
        if (obj2 == null) {
            if (z) {
                i4 = FacebookRequestError.f2646c;
            } else {
                Set set;
                if (b.f1661a != null && b.f1661a.containsKey(Integer.valueOf(i2))) {
                    set = (Set) b.f1661a.get(Integer.valueOf(i2));
                    if (set == null || set.contains(Integer.valueOf(i3))) {
                        i4 = FacebookRequestError.f2645b;
                    }
                }
                if (b.f1663c != null && b.f1663c.containsKey(Integer.valueOf(i2))) {
                    set = (Set) b.f1663c.get(Integer.valueOf(i2));
                    if (set == null || set.contains(Integer.valueOf(i3))) {
                        i4 = FacebookRequestError.f2644a;
                    }
                }
                if (b.f1662b != null && b.f1662b.containsKey(Integer.valueOf(i2))) {
                    set = (Set) b.f1662b.get(Integer.valueOf(i2));
                    if (set == null || set.contains(Integer.valueOf(i3))) {
                        i4 = FacebookRequestError.f2646c;
                    }
                }
            }
            this.f2656g = i4;
            switch (FacebookRequestErrorClassification.FacebookRequestErrorClassification.f1659a[this.f2656g - 1]) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    str5 = b.f1664d;
                    break;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    str5 = b.f1666f;
                    break;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    str5 = b.f1665e;
                    break;
                default:
                    str5 = null;
                    break;
            }
            this.f2660k = str5;
        }
        i4 = FacebookRequestError.f2645b;
        this.f2656g = i4;
        switch (FacebookRequestErrorClassification.FacebookRequestErrorClassification.f1659a[this.f2656g - 1]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                str5 = b.f1664d;
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                str5 = b.f1666f;
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                str5 = b.f1665e;
                break;
            default:
                str5 = null;
                break;
        }
        this.f2660k = str5;
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exception) {
        FacebookException facebookException;
        if (exception instanceof FacebookException) {
            facebookException = (FacebookException) exception;
        } else {
            facebookException = new FacebookException((Throwable) exception);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, facebookException);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    public final String m2573a() {
        if (this.f2657h != null) {
            return this.f2657h;
        }
        return this.f2655f.getLocalizedMessage();
    }

    public final String toString() {
        return "{HttpStatus: " + this.f2651b + ", errorCode: " + this.f2652c + ", errorType: " + this.f2654e + ", errorMessage: " + m2573a() + "}";
    }

    static FacebookRequestError m2571a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        try {
            if (jSONObject.has(SelectCountryActivity.EXTRA_COUNTRY_CODE)) {
                JSONObject jSONObject2;
                Object obj2;
                int i = jSONObject.getInt(SelectCountryActivity.EXTRA_COUNTRY_CODE);
                Object a = af.m1495a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    jSONObject2 = (JSONObject) a;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    boolean z = false;
                    int i2 = 0;
                    int i3 = 0;
                    obj2 = null;
                    if (jSONObject2.has("error")) {
                        JSONObject jSONObject3 = (JSONObject) af.m1495a(jSONObject2, "error", null);
                        str = jSONObject3.optString(MessageKey.MSG_TYPE, null);
                        str2 = jSONObject3.optString(WBConstants.ACTION_LOG_TYPE_MESSAGE, null);
                        i2 = jSONObject3.optInt(SelectCountryActivity.EXTRA_COUNTRY_CODE, -1);
                        i3 = jSONObject3.optInt("error_subcode", -1);
                        str3 = jSONObject3.optString("error_user_msg", null);
                        str4 = jSONObject3.optString("error_user_title", null);
                        z = jSONObject3.optBoolean("is_transient", false);
                        obj2 = 1;
                    } else if (jSONObject2.has("error_code") || jSONObject2.has("error_msg") || jSONObject2.has("error_reason")) {
                        str = jSONObject2.optString("error_reason", null);
                        str2 = jSONObject2.optString("error_msg", null);
                        i2 = jSONObject2.optInt("error_code", -1);
                        i3 = jSONObject2.optInt("error_subcode", -1);
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        return new FacebookRequestError(i, i2, i3, str, str2, str4, str3, z, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    }
                }
                FacebookRequestError facebookRequestError = f2650a;
                if (facebookRequestError.f2648a > i || i > facebookRequestError.f2649b) {
                    obj2 = null;
                } else {
                    obj2 = 1;
                }
                if (obj2 == null) {
                    if (jSONObject.has("body")) {
                        jSONObject2 = (JSONObject) af.m1495a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    return new FacebookRequestError(i, -1, -1, null, null, null, null, false, jSONObject2, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException e) {
        }
        return null;
    }

    private static synchronized FacebookRequestErrorClassification m2572b() {
        FacebookRequestErrorClassification a;
        synchronized (FacebookRequestError.class) {
            FetchedAppSettings a2 = FetchedAppSettingsManager.m1645a(FacebookSdk.m2590j());
            if (a2 == null) {
                a = FacebookRequestErrorClassification.m1639a();
            } else {
                a = a2.f1679f;
            }
        }
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2651b);
        parcel.writeInt(this.f2652c);
        parcel.writeInt(this.f2653d);
        parcel.writeString(this.f2654e);
        parcel.writeString(this.f2657h);
        parcel.writeString(this.f2658i);
        parcel.writeString(this.f2659j);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    public final int describeContents() {
        return 0;
    }
}
