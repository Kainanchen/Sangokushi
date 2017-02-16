package com.facebook.p037i;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.ab.R;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p032e.p033a.DeviceRequestsHelper;
import com.facebook.p036h.FetchedAppSettings;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.ImageDownloader;
import com.facebook.p036h.ImageRequest.ImageRequest;
import com.facebook.p036h.ImageResponse;
import com.facebook.p036h.ad;
import com.facebook.p036h.af;
import com.facebook.p036h.af.Utility;
import com.facebook.p036h.ag;
import com.facebook.p037i.LoginClient.LoginClient;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.facebook.i.c */
public final class DeviceAuthDialog extends DialogFragment {
    private ProgressBar f1810a;
    private TextView f1811b;
    private DeviceAuthMethodHandler f1812c;
    private AtomicBoolean f1813d;
    private volatile GraphRequestAsyncTask f1814e;
    private volatile ScheduledFuture f1815f;
    private volatile DeviceAuthDialog f1816g;
    private Dialog f1817h;
    private boolean f1818i;
    private boolean f1819j;
    private LoginClient f1820k;

    /* renamed from: com.facebook.i.c.1 */
    class DeviceAuthDialog implements GraphRequest {
        final /* synthetic */ DeviceAuthDialog f1793a;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog) {
            this.f1793a = deviceAuthDialog;
        }

        public final void m1760a(GraphResponse graphResponse) {
            if (graphResponse.f2736b != null) {
                DeviceAuthDialog.m1770a(this.f1793a, graphResponse.f2736b.f2655f);
                return;
            }
            JSONObject jSONObject = graphResponse.f2735a;
            DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
            try {
                deviceAuthDialog.f1806a = jSONObject.getString("user_code");
                deviceAuthDialog.f1807b = jSONObject.getString(SelectCountryActivity.EXTRA_COUNTRY_CODE);
                deviceAuthDialog.f1808c = jSONObject.getLong("interval");
                this.f1793a.m1767a(deviceAuthDialog);
            } catch (Throwable e) {
                DeviceAuthDialog.m1770a(this.f1793a, new FacebookException(e));
            }
        }
    }

    /* renamed from: com.facebook.i.c.2 */
    class DeviceAuthDialog implements ImageRequest {
        final /* synthetic */ TextView f1794a;
        final /* synthetic */ DeviceAuthDialog f1795b;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog, TextView textView) {
            this.f1795b = deviceAuthDialog;
            this.f1794a = textView;
        }

        public final void m1761a(ImageResponse imageResponse) {
            if (imageResponse.f1746a != null) {
                this.f1794a.setCompoundDrawablesWithIntrinsicBounds(null, null, new BitmapDrawable(this.f1795b.getResources(), Bitmap.createScaledBitmap(imageResponse.f1746a, 24, 24, false)), null);
            }
        }
    }

    /* renamed from: com.facebook.i.c.3 */
    class DeviceAuthDialog implements OnClickListener {
        final /* synthetic */ DeviceAuthDialog f1796a;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog) {
            this.f1796a = deviceAuthDialog;
        }

        public final void onClick(View view) {
            this.f1796a.m1777c();
        }
    }

    /* renamed from: com.facebook.i.c.4 */
    class DeviceAuthDialog implements Runnable {
        final /* synthetic */ DeviceAuthDialog f1797a;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog) {
            this.f1797a = deviceAuthDialog;
        }

        public final void run() {
            this.f1797a.m1765a();
        }
    }

    /* renamed from: com.facebook.i.c.5 */
    class DeviceAuthDialog implements GraphRequest {
        final /* synthetic */ DeviceAuthDialog f1798a;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog) {
            this.f1798a = deviceAuthDialog;
        }

        public final void m1762a(GraphResponse graphResponse) {
            if (!this.f1798a.f1813d.get()) {
                FacebookRequestError facebookRequestError = graphResponse.f2736b;
                if (facebookRequestError != null) {
                    switch (facebookRequestError.f2653d) {
                        case 1349152:
                        case 1349173:
                            this.f1798a.m1777c();
                            return;
                        case 1349172:
                        case 1349174:
                            this.f1798a.m1774b();
                            return;
                        default:
                            DeviceAuthDialog.m1770a(this.f1798a, graphResponse.f2736b.f2655f);
                            return;
                    }
                }
                try {
                    DeviceAuthDialog.m1771a(this.f1798a, graphResponse.f2735a.getString(WBConstants.AUTH_ACCESS_TOKEN));
                } catch (Throwable e) {
                    DeviceAuthDialog.m1770a(this.f1798a, new FacebookException(e));
                }
            }
        }
    }

    /* renamed from: com.facebook.i.c.6 */
    class DeviceAuthDialog implements DialogInterface.OnClickListener {
        final /* synthetic */ DeviceAuthDialog f1799a;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog) {
            this.f1799a = deviceAuthDialog;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f1799a.f1817h.setContentView(this.f1799a.m1764a(false));
            this.f1799a.m1785a(this.f1799a.f1820k);
        }
    }

    /* renamed from: com.facebook.i.c.7 */
    class DeviceAuthDialog implements DialogInterface.OnClickListener {
        final /* synthetic */ String f1800a;
        final /* synthetic */ Utility f1801b;
        final /* synthetic */ String f1802c;
        final /* synthetic */ DeviceAuthDialog f1803d;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog, String str, Utility utility, String str2) {
            this.f1803d = deviceAuthDialog;
            this.f1800a = str;
            this.f1801b = utility;
            this.f1802c = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.m1772a(this.f1803d, this.f1800a, this.f1801b, this.f1802c);
        }
    }

    /* renamed from: com.facebook.i.c.8 */
    class DeviceAuthDialog implements GraphRequest {
        final /* synthetic */ String f1804a;
        final /* synthetic */ DeviceAuthDialog f1805b;

        DeviceAuthDialog(DeviceAuthDialog deviceAuthDialog, String str) {
            this.f1805b = deviceAuthDialog;
            this.f1804a = str;
        }

        public final void m1763a(GraphResponse graphResponse) {
            if (!this.f1805b.f1813d.get()) {
                if (graphResponse.f2736b != null) {
                    DeviceAuthDialog.m1770a(this.f1805b, graphResponse.f2736b.f2655f);
                    return;
                }
                try {
                    JSONObject jSONObject = graphResponse.f2735a;
                    String string = jSONObject.getString("id");
                    Utility a = af.m1493a(jSONObject);
                    String string2 = jSONObject.getString(SelectCountryActivity.EXTRA_COUNTRY_NAME);
                    DeviceRequestsHelper.m1444b(this.f1805b.f1816g.f1806a);
                    if (!FetchedAppSettingsManager.m1645a(FacebookSdk.m2590j()).f1677d.contains(ad.RequireConfirm) || this.f1805b.f1819j) {
                        DeviceAuthDialog.m1772a(this.f1805b, string, a, this.f1804a);
                        return;
                    }
                    this.f1805b.f1819j = true;
                    DeviceAuthDialog.m1773a(this.f1805b, string, a, this.f1804a, string2);
                } catch (Throwable e) {
                    DeviceAuthDialog.m1770a(this.f1805b, new FacebookException(e));
                }
            }
        }
    }

    /* renamed from: com.facebook.i.c.a */
    private static class DeviceAuthDialog implements Parcelable {
        public static final Creator<DeviceAuthDialog> CREATOR;
        String f1806a;
        String f1807b;
        long f1808c;
        long f1809d;

        /* renamed from: com.facebook.i.c.a.1 */
        static class DeviceAuthDialog implements Creator<DeviceAuthDialog> {
            DeviceAuthDialog() {
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new DeviceAuthDialog[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new DeviceAuthDialog(parcel);
            }
        }

        DeviceAuthDialog() {
        }

        protected DeviceAuthDialog(Parcel parcel) {
            this.f1806a = parcel.readString();
            this.f1807b = parcel.readString();
            this.f1808c = parcel.readLong();
            this.f1809d = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1806a);
            parcel.writeString(this.f1807b);
            parcel.writeLong(this.f1808c);
            parcel.writeLong(this.f1809d);
        }

        static {
            CREATOR = new DeviceAuthDialog();
        }
    }

    public DeviceAuthDialog() {
        this.f1813d = new AtomicBoolean();
        this.f1818i = false;
        this.f1819j = false;
        this.f1820k = null;
    }

    static /* synthetic */ void m1773a(DeviceAuthDialog deviceAuthDialog, String str, Utility utility, String str2, String str3) {
        CharSequence string = deviceAuthDialog.getResources().getString(R.com_facebook_smart_login_confirmation_title);
        String string2 = deviceAuthDialog.getResources().getString(R.com_facebook_smart_login_confirmation_continue_as);
        CharSequence string3 = deviceAuthDialog.getResources().getString(R.com_facebook_smart_login_confirmation_cancel);
        CharSequence format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(deviceAuthDialog.getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DeviceAuthDialog(deviceAuthDialog, str, utility, str2)).setPositiveButton(string3, new DeviceAuthDialog(deviceAuthDialog));
        builder.create().show();
    }

    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f1812c = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).f819b).f1871a.m1823b();
        if (bundle != null) {
            DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) bundle.getParcelable("request_state");
            if (deviceAuthDialog != null) {
                m1767a(deviceAuthDialog);
            }
        }
        return onCreateView;
    }

    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f1817h = new Dialog(getActivity(), R.com_facebook_auth_dialog);
        getActivity().getLayoutInflater();
        boolean z = DeviceRequestsHelper.m1445b() && !this.f1819j;
        this.f1817h.setContentView(m1764a(z));
        return this.f1817h;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f1818i) {
            m1777c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f1816g != null) {
            bundle.putParcelable("request_state", this.f1816g);
        }
    }

    public final void onDestroy() {
        this.f1818i = true;
        this.f1813d.set(true);
        super.onDestroy();
        if (this.f1814e != null) {
            this.f1814e.cancel(true);
        }
        if (this.f1815f != null) {
            this.f1815f.cancel(true);
        }
    }

    public final void m1785a(LoginClient loginClient) {
        this.f1820k = loginClient;
        Bundle bundle = new Bundle();
        bundle.putString(WBConstants.SSO_USER_SCOPE, TextUtils.join(",", loginClient.f1842b));
        String str = loginClient.f1847g;
        if (str != null) {
            bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, str);
        }
        bundle.putString(WBConstants.AUTH_ACCESS_TOKEN, ag.m1547b() + "|" + ag.m1550c());
        bundle.putString("device_info", DeviceRequestsHelper.m1442a());
        new com.facebook.GraphRequest(null, "device/login", bundle, HttpMethod.POST, new DeviceAuthDialog(this)).m2644b();
    }

    private void m1767a(DeviceAuthDialog deviceAuthDialog) {
        int i = 0;
        this.f1816g = deviceAuthDialog;
        this.f1811b.setText(deviceAuthDialog.f1806a);
        this.f1811b.setVisibility(0);
        this.f1810a.setVisibility(8);
        if (!this.f1819j && DeviceRequestsHelper.m1443a(deviceAuthDialog.f1806a)) {
            AppEventsLogger.m824a(getContext()).m837b("fb_smart_login_service", null);
        }
        if (deviceAuthDialog.f1809d != 0 && (new Date().getTime() - deviceAuthDialog.f1809d) - (deviceAuthDialog.f1808c * 1000) < 0) {
            i = 1;
        }
        if (i != 0) {
            m1774b();
        } else {
            m1765a();
        }
    }

    private void m1766a(TextView textView, String str) {
        ImageRequest imageRequest = new ImageRequest(getContext(), Uri.parse(str));
        imageRequest.f1738c = new DeviceAuthDialog(this, textView);
        ImageDownloader.m1672a(new com.facebook.p036h.ImageRequest((byte) 0));
    }

    private View m1764a(boolean z) {
        View inflate;
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        if (z) {
            inflate = layoutInflater.inflate(R.com_facebook_smart_device_dialog_fragment, null);
            FetchedAppSettings a = FetchedAppSettingsManager.m1645a(FacebookSdk.m2590j());
            if (a.f1680g != null) {
                m1766a((TextView) inflate.findViewById(R.com_facebook_smart_instructions_2), a.f1680g);
            }
            if (a.f1681h != null) {
                m1766a((TextView) inflate.findViewById(R.com_facebook_smart_instructions_1), a.f1681h);
            }
        } else {
            inflate = layoutInflater.inflate(R.com_facebook_device_auth_dialog_fragment, null);
        }
        this.f1810a = (ProgressBar) inflate.findViewById(R.progress_bar);
        this.f1811b = (TextView) inflate.findViewById(R.confirmation_code);
        ((Button) inflate.findViewById(R.cancel_button)).setOnClickListener(new DeviceAuthDialog(this));
        ((TextView) inflate.findViewById(R.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.com_facebook_device_auth_instructions)));
        return inflate;
    }

    private void m1765a() {
        this.f1816g.f1809d = new Date().getTime();
        Bundle bundle = new Bundle();
        bundle.putString(SelectCountryActivity.EXTRA_COUNTRY_CODE, this.f1816g.f1807b);
        this.f1814e = new com.facebook.GraphRequest(null, "device/login_status", bundle, HttpMethod.POST, new DeviceAuthDialog(this)).m2644b();
    }

    private void m1774b() {
        this.f1815f = DeviceAuthMethodHandler.m1786c().schedule(new DeviceAuthDialog(this), this.f1816g.f1808c, TimeUnit.SECONDS);
    }

    private void m1777c() {
        if (this.f1813d.compareAndSet(false, true)) {
            DeviceRequestsHelper.m1444b(this.f1816g.f1806a);
            if (this.f1812c != null) {
                this.f1812c.b_();
            }
            this.f1817h.dismiss();
        }
    }

    static /* synthetic */ void m1770a(DeviceAuthDialog deviceAuthDialog, FacebookException facebookException) {
        if (deviceAuthDialog.f1813d.compareAndSet(false, true)) {
            if (deviceAuthDialog.f1816g != null) {
                DeviceRequestsHelper.m1444b(deviceAuthDialog.f1816g.f1806a);
            }
            deviceAuthDialog.f1812c.m1788a((Exception) facebookException);
            deviceAuthDialog.f1817h.dismiss();
        }
    }

    static /* synthetic */ void m1771a(DeviceAuthDialog deviceAuthDialog, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        AccessToken accessToken = new AccessToken(str, FacebookSdk.m2590j(), "0", null, null, null, null, null);
        new com.facebook.GraphRequest(r0, "me", bundle, HttpMethod.GET, new DeviceAuthDialog(deviceAuthDialog, str)).m2644b();
    }

    static /* synthetic */ void m1772a(DeviceAuthDialog deviceAuthDialog, String str, Utility utility, String str2) {
        deviceAuthDialog.f1812c.m1789a(str2, FacebookSdk.m2590j(), str, utility.f1563a, utility.f1564b, AccessTokenSource.DEVICE_AUTH);
        deviceAuthDialog.f1817h.dismiss();
    }
}
