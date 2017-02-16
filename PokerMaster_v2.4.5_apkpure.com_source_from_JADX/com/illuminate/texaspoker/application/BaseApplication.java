package com.illuminate.texaspoker.application;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.multidex.MultiDex;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.ali.fixHelper;
import com.facebook.FacebookSdk;
import com.facebook.drawee.p024a.p025a.Fresco;
import com.facebook.p004a.AppEventsLogger;
import com.illuminate.texaspoker.activity.MainActivity;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.p060e.p062b.PushManager;
import com.illuminate.texaspoker.utils.LocationUtil;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.component.GameManager;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class BaseApplication extends Application {
    public static String f5508a;
    public static MainActivity f5509b;
    private static Application f5510c;
    private NotificationManager f5511d;
    private ActivityLifecycleCallbacks f5512e;
    private boolean f5513f;
    private long f5514g;

    /* renamed from: com.illuminate.texaspoker.application.BaseApplication.1 */
    class C09071 implements Runnable {
        final /* synthetic */ BaseApplication f5507a;

        /* renamed from: com.illuminate.texaspoker.application.BaseApplication.1.1 */
        class C09041 implements Runnable {
            final /* synthetic */ C09071 f5504a;

            C09041(C09071 c09071) {
                this.f5504a = c09071;
            }

            public final void run() {
                Utility.m4504g("cn");
                Utility.m4504g("tw");
                Utility.m4504g("en");
                try {
                    InputStream open = BaseApplication.m3548a().getResources().getAssets().open("res/social_expression/Expressions.xml");
                    XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                    newInstance.setNamespaceAware(true);
                    XmlPullParser newPullParser = newInstance.newPullParser();
                    newPullParser.setInput(open, GameManager.DEFAULT_CHARSET);
                    List arrayList = new ArrayList();
                    Map hashMap = new HashMap();
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                        String name = newPullParser.getName();
                        switch (eventType) {
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                if (name.equals("Expression")) {
                                    Expression expression = new Expression();
                                    name = newPullParser.getAttributeValue(null, "id");
                                    if (name.equalsIgnoreCase("expression_del")) {
                                        expression.f6047d = 0;
                                    } else {
                                        expression.f6044a = newPullParser.getAttributeValue(null, "en");
                                        expression.f6045b = newPullParser.getAttributeValue(null, "cn");
                                        expression.f6046c = newPullParser.getAttributeValue(null, "tw");
                                        hashMap.put(expression.f6044a, expression);
                                        hashMap.put(expression.f6045b, expression);
                                        hashMap.put(expression.f6046c, expression);
                                        expression.f6047d = Utility.m4468a(BaseApplication.m3548a(), name);
                                    }
                                    arrayList.add(expression);
                                    break;
                                }
                                continue;
                            default:
                                break;
                        }
                    }
                    RuntimeData.f6692w = arrayList;
                    RuntimeData.f6691v = hashMap;
                } catch (Throwable e) {
                    Log.e("Utility", e.getMessage(), e);
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.application.BaseApplication.1.2 */
        class C09062 implements ActivityLifecycleCallbacks {
            final /* synthetic */ C09071 f5506a;

            /* renamed from: com.illuminate.texaspoker.application.BaseApplication.1.2.1 */
            class C09051 implements Runnable {
                final /* synthetic */ C09062 f5505a;

                C09051(C09062 c09062) {
                    this.f5505a = c09062;
                }

                public final void run() {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4178m();
                }
            }

            C09062(C09071 c09071) {
                this.f5506a = c09071;
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityResumed(Activity activity) {
                LocationUtil.m4237a().f6664a.startLocation();
                if (this.f5506a.f5507a.f5514g != 0 && System.currentTimeMillis() - this.f5506a.f5507a.f5514g >= StatisticConfig.MIN_UPLOAD_INTERVAL) {
                    this.f5506a.f5507a.f5514g = 0;
                    PushManager.m3930a().m3932b();
                    PushManager.m3930a().m3933c();
                }
                BaseApplication.f5508a = activity.getComponentName().getClassName();
                new Handler().postDelayed(new C09051(this), 200);
                this.f5506a.f5507a.f5511d.cancelAll();
            }

            public final void onActivityPaused(Activity activity) {
                this.f5506a.f5507a.f5514g = System.currentTimeMillis();
                LocationUtil.m4237a().f6664a.stopLocation();
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }
        }

        C09071(BaseApplication baseApplication) {
            this.f5507a = baseApplication;
        }

        public final void run() {
            FacebookSdk.m2574a(this.f5507a);
            AppEventsLogger.m826a(this.f5507a);
            new Thread(new C09041(this)).start();
            XGPushManager.registerPush(this.f5507a);
            this.f5507a.f5511d = (NotificationManager) this.f5507a.getSystemService("notification");
            this.f5507a.f5512e = new C09062(this);
            BaseApplication baseApplication = this.f5507a;
            try {
                System.loadLibrary(baseApplication.getPackageManager().getApplicationInfo(baseApplication.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString("android.app.lib_name"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f5507a.registerActivityLifecycleCallbacks(this.f5507a.f5512e);
        }
    }

    public BaseApplication() {
        this.f5514g = 0;
    }

    public void onCreate() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            applicationContext = getBaseContext();
        }
        fixHelper.prepareForWalkaroundPreVerify(applicationContext);
        super.onCreate();
        f5510c = this;
        String ac = SharedPreferencesManager.ac();
        if (!(StringUtils.m4462a((CharSequence) ac) || Utility.m4490c(ac))) {
            Utility.m4493d(ac);
        }
        this.f5513f = false;
        int myPid = Process.myPid();
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                ac = runningAppProcessInfo.processName;
                break;
            }
        }
        ac = null;
        if (ac != null && ac.equalsIgnoreCase("com.illuminate.texaspoker")) {
            Fresco.m1212a(this);
            new Handler().postDelayed(new C09071(this), 1000);
        }
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public void onTerminate() {
        super.onTerminate();
        LocationUtil a = LocationUtil.m4237a();
        if (a.f6664a.isStarted()) {
            a.f6664a.stopLocation();
        }
        a.f6664a.onDestroy();
        unregisterActivityLifecycleCallbacks(this.f5512e);
    }

    public static Application m3548a() {
        return f5510c;
    }
}
