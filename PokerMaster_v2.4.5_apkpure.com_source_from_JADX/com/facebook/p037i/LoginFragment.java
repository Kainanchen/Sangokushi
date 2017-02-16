package com.facebook.p037i;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.ab.R;
import com.facebook.p037i.LoginClient.LoginClient;
import java.util.ArrayList;

/* renamed from: com.facebook.i.k */
public final class LoginFragment extends Fragment {
    LoginClient f1871a;
    private String f1872b;
    private LoginClient f1873c;

    /* renamed from: com.facebook.i.k.1 */
    class LoginFragment implements LoginClient {
        final /* synthetic */ LoginFragment f1868a;

        LoginFragment(LoginFragment loginFragment) {
            this.f1868a = loginFragment;
        }

        public final void m1828a(LoginClient loginClient) {
            LoginFragment.m1831a(this.f1868a, loginClient);
        }
    }

    /* renamed from: com.facebook.i.k.2 */
    class LoginFragment implements LoginClient {
        final /* synthetic */ View f1869a;
        final /* synthetic */ LoginFragment f1870b;

        LoginFragment(LoginFragment loginFragment, View view) {
            this.f1870b = loginFragment;
            this.f1869a = view;
        }

        public final void m1829a() {
            this.f1869a.findViewById(R.com_facebook_login_activity_progress_bar).setVisibility(0);
        }

        public final void m1830b() {
            this.f1869a.findViewById(R.com_facebook_login_activity_progress_bar).setVisibility(8);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1871a = (LoginClient) bundle.getParcelable("loginClient");
            LoginClient loginClient = this.f1871a;
            if (loginClient.f1861c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f1861c = this;
        } else {
            this.f1871a = new LoginClient((Fragment) this);
        }
        this.f1871a.f1862d = new LoginFragment(this);
        Activity activity = getActivity();
        if (activity != null) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                this.f1872b = callingActivity.getPackageName();
            }
            if (activity.getIntent() != null) {
                this.f1873c = (LoginClient) activity.getIntent().getBundleExtra("com.facebook.LoginFragment:Request").getParcelable("request");
            }
        }
    }

    public final void onDestroy() {
        LoginClient loginClient = this.f1871a;
        if (loginClient.f1860b >= 0) {
            loginClient.m1823b().m1746b();
        }
        super.onDestroy();
    }

    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R.com_facebook_login_fragment, viewGroup, false);
        this.f1871a.f1863e = new LoginFragment(this, inflate);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.f1872b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        Object obj;
        LoginClient loginClient = this.f1871a;
        LoginClient loginClient2 = this.f1873c;
        if (loginClient.f1865g == null || loginClient.f1860b < 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null && loginClient2 != null) {
            if (loginClient.f1865g != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (AccessToken.m883a() == null || loginClient.m1825c()) {
                loginClient.f1865g = loginClient2;
                ArrayList arrayList = new ArrayList();
                LoginBehavior loginBehavior = loginClient2.f1841a;
                if (loginBehavior.f1835g) {
                    arrayList.add(new GetTokenLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f1836h) {
                    arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f1840l) {
                    arrayList.add(new FacebookLiteLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f1839k) {
                    arrayList.add(new CustomTabLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f1837i) {
                    arrayList.add(new WebViewLoginMethodHandler(loginClient));
                }
                if (loginBehavior.f1838j) {
                    arrayList.add(new DeviceAuthMethodHandler(loginClient));
                }
                LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
                arrayList.toArray(loginMethodHandlerArr);
                loginClient.f1859a = loginMethodHandlerArr;
                loginClient.m1826d();
            }
        }
    }

    public final void onPause() {
        super.onPause();
        getActivity().findViewById(R.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LoginClient loginClient = this.f1871a;
        if (loginClient.f1865g != null) {
            loginClient.m1823b().m1744a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f1871a);
    }

    static /* synthetic */ void m1831a(LoginFragment loginFragment, LoginClient loginClient) {
        loginFragment.f1873c = null;
        int i = loginClient.f1853a == LoginClient.LoginClient.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", loginClient);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (loginFragment.isAdded()) {
            loginFragment.getActivity().setResult(i, intent);
            loginFragment.getActivity().finish();
        }
    }
}
