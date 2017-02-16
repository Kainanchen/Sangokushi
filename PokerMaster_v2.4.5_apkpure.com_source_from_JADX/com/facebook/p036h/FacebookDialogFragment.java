package com.facebook.p036h;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.p036h.ah.WebDialog;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.tencent.android.tpush.common.MessageKey;

/* renamed from: com.facebook.h.k */
public final class FacebookDialogFragment extends DialogFragment {
    public Dialog f1658a;

    /* renamed from: com.facebook.h.k.1 */
    class FacebookDialogFragment implements WebDialog {
        final /* synthetic */ FacebookDialogFragment f1656a;

        FacebookDialogFragment(FacebookDialogFragment facebookDialogFragment) {
            this.f1656a = facebookDialogFragment;
        }

        public final void m1634a(Bundle bundle, FacebookException facebookException) {
            this.f1656a.m1636a(bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.h.k.2 */
    class FacebookDialogFragment implements WebDialog {
        final /* synthetic */ FacebookDialogFragment f1657a;

        FacebookDialogFragment(FacebookDialogFragment facebookDialogFragment) {
            this.f1657a = facebookDialogFragment;
        }

        public final void m1635a(Bundle bundle, FacebookException facebookException) {
            FacebookDialogFragment.m1637a(this.f1657a, bundle);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f1658a == null) {
            Dialog facebookWebFallbackDialog;
            Context activity = getActivity();
            Bundle b = NativeProtocol.m1729b(activity.getIntent());
            String string;
            if (b.getBoolean("is_fallback", false)) {
                string = b.getString(ParamKey.URL);
                if (af.m1523a(string)) {
                    af.m1508a();
                    activity.finish();
                    return;
                }
                facebookWebFallbackDialog = new FacebookWebFallbackDialog(activity, string, String.format("fb%s://bridge/", new Object[]{FacebookSdk.m2590j()}));
                facebookWebFallbackDialog.f1594b = new FacebookDialogFragment(this);
            } else {
                string = b.getString(MessageKey.MSG_ACTION);
                b = b.getBundle("params");
                if (af.m1523a(string)) {
                    af.m1508a();
                    activity.finish();
                    return;
                }
                WebDialog webDialog = new WebDialog(activity, string, b);
                webDialog.f1580d = new FacebookDialogFragment(this);
                facebookWebFallbackDialog = webDialog.m1554a();
            }
            this.f1658a = facebookWebFallbackDialog;
        }
    }

    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f1658a == null) {
            m1636a(null, null);
            setShowsDialog(false);
        }
        return this.f1658a;
    }

    public final void onResume() {
        super.onResume();
        if (this.f1658a instanceof ah) {
            ((ah) this.f1658a).m1571a();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f1658a instanceof ah) && isResumed()) {
            ((ah) this.f1658a).m1571a();
        }
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private void m1636a(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        activity.setResult(facebookException == null ? -1 : 0, NativeProtocol.m1719a(activity.getIntent(), bundle, facebookException));
        activity.finish();
    }

    static /* synthetic */ void m1637a(FacebookDialogFragment facebookDialogFragment, Bundle bundle) {
        FragmentActivity activity = facebookDialogFragment.getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
