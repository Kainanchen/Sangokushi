package com.facebook.p051j.p052a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.ab.R;
import com.facebook.p032e.p033a.DeviceRequestsHelper;
import com.facebook.p036h.ag;
import com.facebook.p051j.p053b.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p053b.ShareOpenGraphContent;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.j.a.b */
public final class DeviceShareDialogFragment extends DialogFragment {
    private static ScheduledThreadPoolExecutor f2519g;
    public ShareContent f2520a;
    private ProgressBar f2521b;
    private TextView f2522c;
    private Dialog f2523d;
    private volatile DeviceShareDialogFragment f2524e;
    private volatile ScheduledFuture f2525f;

    /* renamed from: com.facebook.j.a.b.1 */
    class DeviceShareDialogFragment implements OnClickListener {
        final /* synthetic */ DeviceShareDialogFragment f2514a;

        DeviceShareDialogFragment(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f2514a = deviceShareDialogFragment;
        }

        public final void onClick(View view) {
            this.f2514a.f2523d.dismiss();
        }
    }

    /* renamed from: com.facebook.j.a.b.2 */
    class DeviceShareDialogFragment implements GraphRequest {
        final /* synthetic */ DeviceShareDialogFragment f2515a;

        DeviceShareDialogFragment(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f2515a = deviceShareDialogFragment;
        }

        public final void m2438a(GraphResponse graphResponse) {
            FacebookRequestError facebookRequestError = graphResponse.f2736b;
            if (facebookRequestError != null) {
                this.f2515a.m2445a(facebookRequestError);
                return;
            }
            JSONObject jSONObject = graphResponse.f2735a;
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            try {
                deviceShareDialogFragment.f2517a = jSONObject.getString("user_code");
                deviceShareDialogFragment.f2518b = jSONObject.getLong(Oauth2AccessToken.KEY_EXPIRES_IN);
                this.f2515a.m2442a(deviceShareDialogFragment);
            } catch (JSONException e) {
                this.f2515a.m2445a(new FacebookRequestError(0, LetterIndexBar.SEARCH_ICON_LETTER, "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.j.a.b.3 */
    class DeviceShareDialogFragment implements Runnable {
        final /* synthetic */ DeviceShareDialogFragment f2516a;

        DeviceShareDialogFragment(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f2516a = deviceShareDialogFragment;
        }

        public final void run() {
            this.f2516a.f2523d.dismiss();
        }
    }

    /* renamed from: com.facebook.j.a.b.a */
    private static class DeviceShareDialogFragment implements Parcelable {
        public static final Creator<DeviceShareDialogFragment> CREATOR;
        String f2517a;
        long f2518b;

        /* renamed from: com.facebook.j.a.b.a.1 */
        static class DeviceShareDialogFragment implements Creator<DeviceShareDialogFragment> {
            DeviceShareDialogFragment() {
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new DeviceShareDialogFragment[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new DeviceShareDialogFragment(parcel);
            }
        }

        DeviceShareDialogFragment() {
        }

        protected DeviceShareDialogFragment(Parcel parcel) {
            this.f2517a = parcel.readString();
            this.f2518b = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2517a);
            parcel.writeLong(this.f2518b);
        }

        static {
            CREATOR = new DeviceShareDialogFragment();
        }
    }

    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            DeviceShareDialogFragment deviceShareDialogFragment = (DeviceShareDialogFragment) bundle.getParcelable("request_state");
            if (deviceShareDialogFragment != null) {
                m2442a(deviceShareDialogFragment);
            }
        }
        return onCreateView;
    }

    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle a;
        this.f2523d = new Dialog(getActivity(), R.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(R.com_facebook_device_auth_dialog_fragment, null);
        this.f2521b = (ProgressBar) inflate.findViewById(R.progress_bar);
        this.f2522c = (TextView) inflate.findViewById(R.confirmation_code);
        ((Button) inflate.findViewById(R.cancel_button)).setOnClickListener(new DeviceShareDialogFragment(this));
        ((TextView) inflate.findViewById(R.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.com_facebook_device_auth_instructions)));
        this.f2523d.setContentView(inflate);
        ShareContent shareContent = this.f2520a;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                a = WebDialogParameters.m2496a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                a = WebDialogParameters.m2497a((ShareOpenGraphContent) shareContent);
            }
            if (a == null || a.size() == 0) {
                m2445a(new FacebookRequestError(0, LetterIndexBar.SEARCH_ICON_LETTER, "Failed to get share content"));
            }
            a.putString(WBConstants.AUTH_ACCESS_TOKEN, ag.m1547b() + "|" + ag.m1550c());
            a.putString("device_info", DeviceRequestsHelper.m1442a());
            new com.facebook.GraphRequest(null, "device/share", a, HttpMethod.POST, new DeviceShareDialogFragment(this)).m2644b();
            return this.f2523d;
        }
        a = null;
        m2445a(new FacebookRequestError(0, LetterIndexBar.SEARCH_ICON_LETTER, "Failed to get share content"));
        a.putString(WBConstants.AUTH_ACCESS_TOKEN, ag.m1547b() + "|" + ag.m1550c());
        a.putString("device_info", DeviceRequestsHelper.m1442a());
        new com.facebook.GraphRequest(null, "device/share", a, HttpMethod.POST, new DeviceShareDialogFragment(this)).m2644b();
        return this.f2523d;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f2525f != null) {
            this.f2525f.cancel(true);
        }
        m2441a(new Intent());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f2524e != null) {
            bundle.putParcelable("request_state", this.f2524e);
        }
    }

    private void m2441a(Intent intent) {
        DeviceRequestsHelper.m1444b(this.f2524e.f2517a);
        if (isAdded()) {
            Activity activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    private static synchronized ScheduledThreadPoolExecutor m2440a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f2519g == null) {
                f2519g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f2519g;
        }
        return scheduledThreadPoolExecutor;
    }

    private void m2442a(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.f2524e = deviceShareDialogFragment;
        this.f2522c.setText(deviceShareDialogFragment.f2517a);
        this.f2522c.setVisibility(0);
        this.f2521b.setVisibility(8);
        this.f2525f = DeviceShareDialogFragment.m2440a().schedule(new DeviceShareDialogFragment(this), deviceShareDialogFragment.f2518b, TimeUnit.SECONDS);
    }

    private void m2445a(FacebookRequestError facebookRequestError) {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m2441a(intent);
    }
}
