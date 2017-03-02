package com.igexin.push.core.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0416a;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0491o;
import com.igexin.push.core.p051e.C0479a;
import com.igexin.push.core.p051e.C0480b;
import com.igexin.sdk.IPushCore;
import java.util.HashMap;
import java.util.Map;

public class PushCore implements IPushCore {
    private C0482f f1361a;
    private Map f1362b;

    public PushCore() {
        this.f1362b = new HashMap();
    }

    public void onActivityConfigurationChanged(Activity activity, Configuration configuration) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1675a(configuration);
        }
    }

    public boolean onActivityCreateOptionsMenu(Activity activity, Menu menu) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        return c0479a != null ? c0479a.m1679a(menu) : false;
    }

    public void onActivityDestroy(Activity activity) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1686h();
            this.f1362b.remove(activity);
            C0480b.m1688a().m1693c(c0479a);
        }
    }

    public boolean onActivityKeyDown(Activity activity, int i, KeyEvent keyEvent) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        return c0479a != null ? c0479a.m1678a(i, keyEvent) : false;
    }

    public void onActivityNewIntent(Activity activity, Intent intent) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1674a(intent);
        }
    }

    public void onActivityPause(Activity activity) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1684f();
        }
    }

    public void onActivityRestart(Activity activity) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1682d();
        }
    }

    public void onActivityResume(Activity activity) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1683e();
        }
    }

    public void onActivityStart(Activity activity, Intent intent) {
        if (activity != null && intent != null && intent.hasExtra("activityid")) {
            C0479a a = C0480b.m1688a().m1690a(Long.valueOf(intent.getLongExtra("activityid", 0)));
            if (a != null) {
                a.m1673a(activity);
                this.f1362b.put(activity, a);
                a.m1681c();
                return;
            }
            activity.finish();
        }
    }

    public void onActivityStop(Activity activity) {
        C0479a c0479a = (C0479a) this.f1362b.get(activity);
        if (c0479a != null) {
            c0479a.m1685g();
        }
    }

    public IBinder onServiceBind(Intent intent) {
        return C0491o.m1740a();
    }

    public void onServiceDestroy() {
        this.f1361a.m1717l();
    }

    public int onServiceStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            C0247a.m838b("pushmanager|onServiceStartCommand|" + intent.hashCode());
        }
        if (this.f1361a != null) {
            Message message = new Message();
            message.what = C0416a.f1072c;
            message.obj = intent;
            this.f1361a.m1700a(message);
        }
        return 1;
    }

    public boolean start(Context context) {
        this.f1361a = C0482f.m1694a();
        this.f1361a.m1698a(context);
        return true;
    }
}
