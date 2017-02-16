package com.facebook.p037i;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.p037i.LoginClient.LoginClient;
import java.util.Collection;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.facebook.i.d */
final class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR;
    private static ScheduledThreadPoolExecutor f1821c;

    /* renamed from: com.facebook.i.d.1 */
    static class DeviceAuthMethodHandler implements Creator {
        DeviceAuthMethodHandler() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final void b_() {
        this.b.m1822a(LoginClient.m1814a(this.b.f1865g, "User canceled log in."));
    }

    public final void m1788a(Exception exception) {
        this.b.m1822a(LoginClient.m1815a(this.b.f1865g, null, exception.getMessage()));
    }

    public final void m1789a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, AccessTokenSource accessTokenSource) {
        this.b.m1822a(LoginClient.m1813a(this.b.f1865g, new AccessToken(str, str2, str3, collection, collection2, accessTokenSource, null, null)));
    }

    public static synchronized ScheduledThreadPoolExecutor m1786c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f1821c == null) {
                f1821c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f1821c;
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    final String m1787a() {
        return "device_auth";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    static {
        CREATOR = new DeviceAuthMethodHandler();
    }

    final boolean m1790a(LoginClient loginClient) {
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(this.b.f1861c.getActivity().getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.m1785a(loginClient);
        return true;
    }
}
