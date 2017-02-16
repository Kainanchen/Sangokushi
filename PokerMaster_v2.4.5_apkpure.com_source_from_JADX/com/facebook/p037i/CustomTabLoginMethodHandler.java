package com.facebook.p037i;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.customtabs.CustomTabsService;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.p036h.FetchedAppSettings;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.facebook.p037i.LoginClient.LoginClient;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.a */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR;
    private static final String[] f1784c;
    private String f1785d;
    private String f1786e;

    /* renamed from: com.facebook.i.a.1 */
    static class CustomTabLoginMethodHandler implements Creator {
        CustomTabLoginMethodHandler() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }
    }

    static {
        f1784c = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
        CREATOR = new CustomTabLoginMethodHandler();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f1786e = af.m1525b();
    }

    final String m1755a() {
        return "custom_tab";
    }

    final AccessTokenSource a_() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    protected final String m1759c() {
        return "chrome_custom_tab";
    }

    final boolean m1758a(LoginClient loginClient) {
        FetchedAppSettings a = FetchedAppSettingsManager.m1645a(af.m1496a(this.b.f1861c.getActivity()));
        if (a == null || !a.f1675b) {
            boolean z = false;
        } else {
            int i = 1;
        }
        if (i == 0 || m1754e() == null || !ag.m1551c(FacebookSdk.m2586f())) {
            z = false;
        } else {
            i = 1;
        }
        if (i == 0) {
            return false;
        }
        Bundle a2 = m1749a(m1751b(loginClient), loginClient);
        Intent intent = new Intent(this.b.f1861c.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f810a, a2);
        intent.putExtra(CustomTabMainActivity.f811b, m1754e());
        this.b.f1861c.startActivityForResult(intent, 1);
        return true;
    }

    private String m1754e() {
        if (this.f1785d != null) {
            return this.f1785d;
        }
        Context activity = this.b.f1861c.getActivity();
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        if (queryIntentServices != null) {
            Set hashSet = new HashSet(Arrays.asList(f1784c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.f1785d = serviceInfo.packageName;
                    return this.f1785d;
                }
            }
        }
        return null;
    }

    final boolean m1757a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.m1744a(i, i2, intent);
        }
        LoginClient loginClient = this.b.f1865g;
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra(CustomTabMainActivity.f812c);
            if (stringExtra != null && stringExtra.startsWith(CustomTabMainActivity.m805a())) {
                Uri parse = Uri.parse(stringExtra);
                Bundle c = af.m1532c(parse.getQuery());
                c.putAll(af.m1532c(parse.getFragment()));
                if (m1753a(c)) {
                    int i3;
                    stringExtra = c.getString("error");
                    if (stringExtra == null) {
                        stringExtra = c.getString("error_type");
                    }
                    String string = c.getString("error_msg");
                    if (string == null) {
                        string = c.getString("error_message");
                    }
                    if (string == null) {
                        string = c.getString("error_description");
                    }
                    String string2 = c.getString("error_code");
                    if (af.m1523a(string2)) {
                        i3 = -1;
                    } else {
                        try {
                            i3 = Integer.parseInt(string2);
                        } catch (NumberFormatException e) {
                            i3 = -1;
                        }
                    }
                    if (af.m1523a(stringExtra) && af.m1523a(string) && i3 == -1) {
                        super.m1750a(loginClient, c, null);
                    } else if (stringExtra != null && (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException"))) {
                        super.m1750a(loginClient, null, new FacebookOperationCanceledException());
                    } else if (i3 == 4201) {
                        super.m1750a(loginClient, null, new FacebookOperationCanceledException());
                    } else {
                        super.m1750a(loginClient, null, new FacebookServiceException(new FacebookRequestError(i3, stringExtra, string), string));
                    }
                } else {
                    super.m1750a(loginClient, null, new FacebookException("Invalid state parameter"));
                }
            }
            return true;
        }
        super.m1750a(loginClient, null, new FacebookOperationCanceledException());
        return false;
    }

    protected final void m1756a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f1786e);
    }

    private boolean m1753a(Bundle bundle) {
        boolean z = false;
        try {
            String string = bundle.getString("state");
            if (string != null) {
                z = new JSONObject(string).getString("7_challenge").equals(this.f1786e);
            }
        } catch (JSONException e) {
        }
        return z;
    }

    public final int describeContents() {
        return 0;
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f1786e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f1786e);
    }
}
