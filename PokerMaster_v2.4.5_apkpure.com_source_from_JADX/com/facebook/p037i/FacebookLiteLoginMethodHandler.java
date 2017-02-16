package com.facebook.p037i;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p037i.LoginClient.LoginClient;
import java.util.Collection;

/* renamed from: com.facebook.i.e */
final class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR;

    /* renamed from: com.facebook.i.e.1 */
    static class FacebookLiteLoginMethodHandler implements Creator {
        FacebookLiteLoginMethodHandler() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    final String m1797a() {
        return "fb_lite_login";
    }

    final boolean m1798a(LoginClient loginClient) {
        String f = LoginClient.m1820f();
        Context activity = this.b.f1861c.getActivity();
        String str = loginClient.f1844d;
        Collection collection = loginClient.f1842b;
        boolean z = loginClient.f1846f;
        Intent a = NativeProtocol.m1718a(activity, str, collection, f, loginClient.m1812a(), loginClient.f1843c, m1740a(loginClient.f1845e));
        m1742a("e2e", f);
        return m1795a(a, LoginClient.m1817a());
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    static {
        CREATOR = new FacebookLiteLoginMethodHandler();
    }
}
