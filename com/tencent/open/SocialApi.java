package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;

/* compiled from: ProGuard */
public class SocialApi {
    private SocialApiIml f1579a;

    public SocialApi(QQToken qQToken) {
        this.f1579a = new SocialApiIml(qQToken);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f1579a.invite(activity, bundle, iUiListener);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f1579a.story(activity, bundle, iUiListener);
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f1579a.gift(activity, bundle, iUiListener);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f1579a.ask(activity, bundle, iUiListener);
    }
}
