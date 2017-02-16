package com.facebook.p036h;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.tencent.android.tpush.common.Constants;
import java.util.List;

/* renamed from: com.facebook.h.j */
public abstract class FacebookDialogBase<CONTENT, RESULT> {
    public static final Object f1651a;
    public int f1652b;
    private final Activity f1653c;
    private final FragmentWrapper f1654d;
    private List<FacebookDialogBase> f1655e;

    /* renamed from: com.facebook.h.j.a */
    protected abstract class FacebookDialogBase {
        final /* synthetic */ FacebookDialogBase f1650a;

        public abstract boolean m1626a(CONTENT content);

        public abstract AppCall m1627b(CONTENT content);

        public FacebookDialogBase(FacebookDialogBase facebookDialogBase) {
            this.f1650a = facebookDialogBase;
        }

        public Object m1625a() {
            return FacebookDialogBase.f1651a;
        }
    }

    public abstract void m1630a(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    public abstract List<FacebookDialogBase> m1632b();

    public abstract AppCall m1633c();

    static {
        f1651a = new Object();
    }

    public FacebookDialogBase(Activity activity, int i) {
        ag.m1544a((Object) activity, Constants.FLAG_ACTIVITY_NAME);
        this.f1653c = activity;
        this.f1654d = null;
        this.f1652b = i;
    }

    public final void m1631a(CONTENT content, Object obj) {
        AppCall b = m1628b(content, obj);
        if (b == null) {
            String str = "No code path should ever result in a null appCall";
            Log.e("FacebookDialog", str);
            if (FacebookSdk.m2579b()) {
                throw new IllegalStateException(str);
            }
        } else if (this.f1654d != null) {
            FragmentWrapper fragmentWrapper = this.f1654d;
            Intent intent = b.f1536b;
            int i = b.f1537c;
            if (fragmentWrapper.f1715a != null) {
                fragmentWrapper.f1715a.startActivityForResult(intent, i);
            } else {
                fragmentWrapper.f1716b.startActivityForResult(intent, i);
            }
            AppCall.m1472a(b);
        } else {
            this.f1653c.startActivityForResult(b.f1536b, b.f1537c);
            AppCall.m1472a(b);
        }
    }

    public final Activity m1629a() {
        if (this.f1653c != null) {
            return this.f1653c;
        }
        if (this.f1654d == null) {
            return null;
        }
        FragmentWrapper fragmentWrapper = this.f1654d;
        if (fragmentWrapper.f1715a != null) {
            return fragmentWrapper.f1715a.getActivity();
        }
        return fragmentWrapper.f1716b.getActivity();
    }

    private AppCall m1628b(CONTENT content, Object obj) {
        Object obj2;
        AppCall b;
        if (obj == f1651a) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (this.f1655e == null) {
            this.f1655e = m1632b();
        }
        for (FacebookDialogBase facebookDialogBase : this.f1655e) {
            if ((obj2 != null || af.m1522a(facebookDialogBase.m1625a(), obj)) && facebookDialogBase.m1626a(content)) {
                try {
                    b = facebookDialogBase.m1627b(content);
                    break;
                } catch (FacebookException e) {
                    b = m1633c();
                    DialogPresenter.m1620a(b, e);
                }
            }
        }
        b = null;
        if (b != null) {
            return b;
        }
        b = m1633c();
        DialogPresenter.m1620a(b, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return b;
    }
}
