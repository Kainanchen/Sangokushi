package com.facebook.p036h;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;

/* renamed from: com.facebook.h.g */
public final class CustomTab {
    public Uri f1649a;

    public CustomTab(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1649a = af.m1492a(ac.m1478a(), FacebookSdk.m2587g() + "/dialog/" + str, bundle);
    }
}
