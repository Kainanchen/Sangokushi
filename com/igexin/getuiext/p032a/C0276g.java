package com.igexin.getuiext.p032a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.alipay.sdk.cons.C0167c;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.data.p034a.C0293f;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.service.C0297c;
import com.igexin.getuiext.util.C0329c;
import com.igexin.getuiext.util.C0332f;
import com.igexin.getuiext.util.C0334h;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.tencent.wxop.stat.common.StatConstants;
import com.ut.device.AidConstants;
import com.zkunity.app.ResourceIDs;
import java.io.IOException;
import java.util.Random;
import org.apache.http.MethodNotSupportedException;

/* renamed from: com.igexin.getuiext.a.g */
public class C0276g implements C0270a {
    private final String f727a;
    private Random f728b;

    public C0276g() {
        this.f727a = "GetuiExt-HandleQueryUpdateResponseAction";
        this.f728b = null;
    }

    private String m963a(String str, Intent intent) {
        return str == null ? null : str.equals("app") ? intent.getStringExtra("recommendApps") : str.equals(SocialConstants.PARAM_IMG_URL) ? intent.getStringExtra("recommendImg") : str.equals("txt") ? intent.getStringExtra("recommendTxt") : null;
    }

    private void m964b(Context context, Intent intent) {
        Object obj;
        CharSequence charSequence;
        Object obj2 = null;
        C0288a c0292e = new C0292e();
        c0292e.f781n = C0293f.m999a(intent.getStringExtra("updateType"));
        switch (C0277h.f729a[c0292e.f781n.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                c0292e.g = intent.getStringExtra("diffFileurl");
                obj = null;
                break;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                obj2 = 1;
                c0292e.g = intent.getStringExtra("fullFileurl");
                break;
        }
        obj = obj2;
        String stringExtra = intent.getStringExtra(C0167c.f364e);
        if (stringExtra == null || !stringExtra.equals("null")) {
            Object obj3 = stringExtra;
        } else {
            charSequence = "\u672a\u77e5\u5e94\u7528";
        }
        c0292e.a = charSequence;
        stringExtra = intent.getStringExtra("logo_url");
        String str = (stringExtra == null || !stringExtra.equals("null")) ? stringExtra : null;
        c0292e.f = str;
        c0292e.b = intent.getStringExtra("pkgname");
        c0292e.c = intent.getStringExtra("versionName");
        c0292e.d = Integer.parseInt(intent.getStringExtra("versionCode"));
        c0292e.i = intent.getLongExtra("fullSize", 0);
        c0292e.f782o = intent.getLongExtra("diffSize", 0);
        c0292e.f783p = intent.getStringExtra("diffChecksum");
        c0292e.f784q = intent.getStringExtra("fullChecksum");
        c0292e.j = intent.getStringExtra("sendId");
        c0292e.h = intent.getStringExtra("originalUrl");
        c0292e.f786s = intent.getStringExtra("recommendType");
        c0292e.f787t = m963a(c0292e.f786s, intent);
        c0292e.k = intent.getStringExtra("taskid");
        c0292e.f785r = intent.getStringExtra(SocialConstants.PARAM_COMMENT);
        c0292e.f780m = C0334h.m1112a(context, c0292e.b);
        C0297c.m1021a().m1024a(c0292e.b, (C0291d) c0292e);
        int currentTimeMillis = (int) System.currentTimeMillis();
        PendingIntent a = m965a(context, c0292e, c0292e.f786s, c0292e.f787t, currentTimeMillis);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Notification notification = new Notification();
        notification.icon = 17301633;
        notification.tickerText = charSequence + "\u6709\u66f4\u65b0";
        notification.defaults = 4;
        notification.flags = 16;
        int ringerMode = ((AudioManager) context.getSystemService("audio")).getRingerMode();
        if (ringerMode == 1) {
            notification.sound = null;
            notification.defaults |= 2;
        } else if (ringerMode == 2) {
            notification.defaults |= 2;
            notification.defaults |= 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int identifier = context.getResources().getIdentifier("notification_inc", ResourceIDs.LAYOUT, applicationInfo.packageName);
        if (identifier != 0) {
            notification.contentView = new RemoteViews(applicationInfo.packageName, identifier);
            int identifier2 = context.getResources().getIdentifier("notification_icon", ResourceIDs.ID, applicationInfo.packageName);
            int identifier3 = context.getResources().getIdentifier("notification_update_icon", ResourceIDs.ID, applicationInfo.packageName);
            Bitmap a2 = C0332f.m1108a(context, "inc-default.png");
            if (str != null) {
                Bitmap bitmap = null;
                try {
                    bitmap = BitmapFactory.decodeStream(C0329c.m1093a(Constants.HTTP_GET, str, null));
                } catch (MethodNotSupportedException e) {
                }
                if (bitmap != null) {
                    notification.contentView.setImageViewBitmap(identifier2, bitmap);
                } else if (a2 != null) {
                    notification.contentView.setImageViewBitmap(identifier2, a2);
                } else {
                    notification.contentView.setImageViewResource(identifier2, 17301651);
                }
            } else if (a2 != null) {
                notification.contentView.setImageViewBitmap(identifier2, a2);
            } else {
                notification.contentView.setImageViewResource(identifier2, 17301651);
            }
            notification.contentView.setOnClickPendingIntent(identifier3, a);
            try {
                notification.contentView.setImageViewBitmap(identifier3, BitmapFactory.decodeStream(context.getAssets().open("inc_update.png")));
            } catch (IOException e2) {
            }
            notification.contentView.setTextViewText(context.getResources().getIdentifier("notification_name", ResourceIDs.ID, applicationInfo.packageName), charSequence);
            notification.contentView.setTextViewText(context.getResources().getIdentifier("notification_version", ResourceIDs.ID, applicationInfo.packageName), "V" + c0292e.c);
            RemoteViews remoteViews = notification.contentView;
            int identifier4 = context.getResources().getIdentifier("notification_fullsize", ResourceIDs.ID, applicationInfo.packageName);
            StringBuilder stringBuilder = new StringBuilder();
            Object[] objArr = new Object[1];
            objArr[0] = Float.valueOf(((float) c0292e.i) / 1048576.0f);
            remoteViews.setTextViewText(identifier4, stringBuilder.append(String.format("%.2f", objArr)).append("M").toString());
            if (obj == null) {
                remoteViews = notification.contentView;
                int identifier5 = context.getResources().getIdentifier("notification_diffsize", ResourceIDs.ID, applicationInfo.packageName);
                StringBuilder append = new StringBuilder().append("\u53ea\u9700:");
                Object[] objArr2 = new Object[1];
                objArr2[0] = Float.valueOf(((float) c0292e.f782o) / 1048576.0f);
                remoteViews.setTextViewText(identifier5, append.append(String.format("%.2f", objArr2)).append("M").toString());
            }
            notification.contentView.setTextViewText(context.getResources().getIdentifier("notification_update_text", ResourceIDs.ID, applicationInfo.packageName), "\u66f4\u65b0");
        }
        if (identifier == 0) {
            notification.setLatestEventInfo(context, Constants.STR_EMPTY, Constants.STR_EMPTY, a);
        } else {
            notification.contentIntent = a;
        }
        C0334h c0334h = new C0334h();
        if (System.currentTimeMillis() - c0334h.m1122b() >= Consts.TIME_24HOUR) {
            notificationManager.notify(currentTimeMillis, notification);
            c0334h.m1121a();
            C0295a.m1016a(context, c0292e, 1);
        }
    }

    PendingIntent m965a(Context context, C0292e c0292e, String str, String str2, int i) {
        Intent intent = new Intent("com.igexin.increment");
        intent.addFlags(268435456);
        intent.putExtra(AuthActivity.ACTION_KEY, "download");
        Bundle bundle = new Bundle();
        bundle.putString(C0167c.f364e, c0292e.a);
        bundle.putLong("diffSize", c0292e.f782o);
        bundle.putLong("fullSize", c0292e.i);
        bundle.putString("versionName", c0292e.c);
        bundle.putString(SocialConstants.PARAM_COMMENT, c0292e.f785r);
        bundle.putString(SocialConstants.PARAM_URL, c0292e.g);
        bundle.putString("logo_url", c0292e.f);
        bundle.putInt("notifID", i);
        bundle.putString("updateType", c0292e.f781n.toString());
        bundle.putString("pkgname", c0292e.b);
        bundle.putInt("versionCode", c0292e.d);
        bundle.putInt("verifyCode", Consts.verifyCode);
        bundle.putString("originalUrl", c0292e.h);
        bundle.putInt("previous_version_code", c0292e.f780m);
        bundle.putString("recommendType", str);
        bundle.putString("promotion_attrs", str2);
        bundle.putString("taskid", c0292e.k);
        bundle.putString("sendId", c0292e.j);
        intent.putExtras(bundle);
        if (this.f728b == null) {
            this.f728b = new Random();
            this.f728b.setSeed(System.currentTimeMillis());
        }
        return PendingIntent.getBroadcast(context, this.f728b.nextInt(AidConstants.EVENT_REQUEST_STARTED), intent, 134217728);
    }

    public void m966a(Context context, Intent intent) {
        m964b(context, intent);
    }
}
