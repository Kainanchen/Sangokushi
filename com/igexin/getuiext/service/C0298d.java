package com.igexin.getuiext.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.Toast;
import com.igexin.download.DownloadInfo;
import com.igexin.download.Downloads;
import com.igexin.download.IDownloadCallback;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.ui.C0310f;
import com.igexin.getuiext.ui.promotion.C0316f;
import com.tencent.tauth.AuthActivity;
import com.ut.device.AidConstants;
import java.util.Random;
import java.util.Timer;

/* renamed from: com.igexin.getuiext.service.d */
public class C0298d implements IDownloadCallback {
    private Context f806a;
    private String f807b;
    private NotificationManager f808c;
    private SparseArray f809d;
    private SparseArray f810e;
    private SparseArray f811f;
    private SparseArray f812g;
    private Timer f813h;
    private boolean f814i;
    private C0310f f815j;
    private C0297c f816k;

    public C0298d(Context context, String str) {
        this.f809d = new SparseArray();
        this.f810e = new SparseArray();
        this.f811f = new SparseArray();
        this.f812g = new SparseArray();
        this.f813h = null;
        this.f814i = true;
        this.f806a = context;
        this.f807b = str;
        this.f808c = (NotificationManager) context.getSystemService("notification");
        this.f815j = C0310f.m1054a(context);
        this.f816k = C0297c.m1021a();
    }

    private int m1027a(int i) {
        return i << 11;
    }

    private Notification m1028a(DownloadInfo downloadInfo, Notification notification, C0291d c0291d) {
        if (!downloadInfo.mNotice) {
            downloadInfo.mNotice = true;
            Intent intent = new Intent("com.igexin.increment");
            intent.putExtra(AuthActivity.ACTION_KEY, "install");
            intent.putExtra("filepath", downloadInfo.mFileName);
            intent.putExtra("pkgname", c0291d.b);
            intent.putExtra("verifyCode", Consts.verifyCode);
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            notification.contentIntent = PendingIntent.getBroadcast(this.f806a, random.nextInt(AidConstants.EVENT_REQUEST_STARTED), intent, 1073741824);
            intent = new Intent("com.igexin.getuiext.ui.upgrade_progress");
            intent.putExtra("download_id", downloadInfo.mId);
            intent.putExtra("file_path", downloadInfo.mFileName);
            intent.putExtra("progress", 100);
            this.f806a.sendBroadcast(intent);
        }
        return notification;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1031a(com.igexin.download.DownloadInfo r22) {
        /*
        r21 = this;
        r0 = r21;
        r4 = r0.f809d;
        r0 = r22;
        r5 = r0.mId;
        r4 = r4.get(r5);
        r4 = (android.app.Notification) r4;
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r5 = r4.contentView;
        if (r5 != 0) goto L_0x047a;
    L_0x0014:
        r4 = new android.app.Notification;
        r4.<init>();
        r0 = r21;
        r5 = r0.f815j;
        r6 = "notification_inc";
        r7 = "layout";
        r5 = r5.m1056a(r6, r7);
        r6 = new android.widget.RemoteViews;
        r0 = r21;
        r7 = r0.f806a;
        r7 = r7.getPackageName();
        r6.<init>(r7, r5);
        r4.contentView = r6;
        r5 = new android.content.Intent;
        r0 = r21;
        r6 = r0.f806a;
        r7 = com.igexin.getuiext.activity.GetuiExtActivity.class;
        r5.<init>(r6, r7);
        r0 = r21;
        r6 = r0.f806a;
        r7 = 0;
        r8 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r5 = android.app.PendingIntent.getActivity(r6, r7, r5, r8);
        r4.contentIntent = r5;
        r0 = r21;
        r5 = r0.f809d;
        r0 = r22;
        r6 = r0.mId;
        r5.put(r6, r4);
        r6 = r4;
    L_0x0058:
        r0 = r21;
        r4 = r0.f812g;
        r0 = r22;
        r5 = r0.mId;
        r4 = r4.get(r5);
        r4 = (com.igexin.getuiext.data.p034a.C0291d) r4;
        if (r4 != 0) goto L_0x0088;
    L_0x0068:
        r4 = com.igexin.getuiext.p033b.C0287c.m994d();
        r4 = r4.m998c();
        r0 = r22;
        r5 = r0.mId;
        r4 = r4.m988a(r5);
        r4 = (com.igexin.getuiext.data.p034a.C0291d) r4;
        if (r4 != 0) goto L_0x007d;
    L_0x007c:
        return;
    L_0x007d:
        r0 = r21;
        r5 = r0.f812g;
        r0 = r22;
        r7 = r0.mId;
        r5.put(r7, r4);
    L_0x0088:
        r5 = r4;
        r0 = r21;
        r4 = r0.f815j;
        r7 = "notification_right";
        r8 = "id";
        r4 = r4.m1056a(r7, r8);
        r0 = r21;
        r7 = r0.f815j;
        r8 = "download_layout";
        r9 = "id";
        r7 = r7.m1056a(r8, r9);
        r0 = r21;
        r8 = r0.f815j;
        r9 = "notification_icon";
        r10 = "id";
        r8 = r8.m1056a(r9, r10);
        r0 = r21;
        r9 = r0.f815j;
        r10 = "download_app_name";
        r11 = "id";
        r9 = r9.m1056a(r10, r11);
        r0 = r21;
        r10 = r0.f815j;
        r11 = "download_app_version";
        r12 = "id";
        r10 = r10.m1056a(r11, r12);
        r0 = r21;
        r11 = r0.f815j;
        r12 = "downlaod_progress_horizontal";
        r13 = "id";
        r11 = r11.m1056a(r12, r13);
        r0 = r21;
        r12 = r0.f815j;
        r13 = "setup_layout";
        r14 = "id";
        r12 = r12.m1056a(r13, r14);
        r0 = r21;
        r13 = r0.f815j;
        r14 = "setup_icon";
        r15 = "id";
        r13 = r13.m1056a(r14, r15);
        r0 = r21;
        r14 = r0.f815j;
        r15 = "setup_app_name";
        r16 = "id";
        r14 = r14.m1056a(r15, r16);
        r0 = r21;
        r15 = r0.f815j;
        r16 = "setup_app_version";
        r17 = "id";
        r15 = r15.m1056a(r16, r17);
        r0 = r21;
        r0 = r0.f815j;
        r16 = r0;
        r17 = "setup_message";
        r18 = "id";
        r16 = r16.m1056a(r17, r18);
        r0 = r21;
        r0 = r0.f815j;
        r17 = r0;
        r18 = "setup_text";
        r19 = "id";
        r17 = r17.m1056a(r18, r19);
        r0 = r21;
        r0 = r0.f816k;
        r18 = r0;
        r0 = r5.b;
        r19 = r0;
        r18 = r18.m1022a(r19);
        if (r18 != 0) goto L_0x0231;
    L_0x012d:
        r0 = r5.f773f;
        r18 = r0;
        r0 = r5.b;
        r19 = r0;
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r0.m1033a(r1, r2);
        r0 = r6.contentView;
        r18 = r0;
        r0 = r21;
        r0 = r0.f806a;
        r19 = r0;
        r19 = r19.getApplicationInfo();
        r0 = r19;
        r0 = r0.icon;
        r19 = r0;
        r0 = r18;
        r1 = r19;
        r0.setImageViewResource(r8, r1);
    L_0x0159:
        r8 = r6.contentView;
        r0 = r5.a;
        r18 = r0;
        r0 = r18;
        r8.setTextViewText(r9, r0);
        r8 = r6.contentView;
        r9 = r5.c;
        r8.setTextViewText(r10, r9);
        r0 = r22;
        r8 = r0.mStatus;
        switch(r8) {
            case 192: goto L_0x0256;
            case 193: goto L_0x043a;
            case 200: goto L_0x0372;
            default: goto L_0x0172;
        };
    L_0x0172:
        r0 = r22;
        r4 = r0.mStatus;
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r4 < r7) goto L_0x007c;
    L_0x017a:
        r0 = r22;
        r4 = r0.mStatus;
        r7 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r4 >= r7) goto L_0x007c;
    L_0x0182:
        r4 = r6.contentView;
        if (r4 == 0) goto L_0x0213;
    L_0x0186:
        r4 = 16;
        r6.flags = r4;
        r4 = 17301642; // 0x108008a float:2.4979642E-38 double:8.548147E-317;
        r6.icon = r4;
        r4 = 0;
        r6.contentView = r4;
        r0 = r21;
        r4 = r0.f806a;
        r5 = r5.a;
        r7 = "\u4e0b\u8f7d\u5931\u8d25\uff01";
        r0 = r21;
        r8 = r0.f806a;
        r9 = com.igexin.getuiext.util.C0334h.m1119c();
        r10 = new android.content.Intent;
        r10.<init>();
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.app.PendingIntent.getActivity(r8, r9, r10, r11);
        r6.setLatestEventInfo(r4, r5, r7, r8);
        r0 = r21;
        r4 = r0.f810e;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r0 = r21;
        r4 = r0.f811f;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r0 = r21;
        r4 = r0.f812g;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r4 = com.igexin.getuiext.p033b.C0287c.m994d();
        r4 = r4.m998c();
        r0 = r22;
        r5 = r0.mId;
        r4.m990b(r5);
        r0 = r21;
        r4 = r0.f806a;
        r4 = com.igexin.download.SdkDownLoader.getInstantiate(r4);
        r0 = r22;
        r5 = r0.mId;
        r4.deleteTask(r5);
        r4 = new android.content.Intent;
        r5 = "com.igexin.getuiext.ui.upgrade_progress";
        r4.<init>(r5);
        r5 = "download_id";
        r0 = r22;
        r7 = r0.mId;
        r4.putExtra(r5, r7);
        r5 = "file_path";
        r7 = "";
        r4.putExtra(r5, r7);
        r5 = "progress";
        r7 = -1;
        r4.putExtra(r5, r7);
        r0 = r21;
        r5 = r0.f806a;
        r5.sendBroadcast(r4);
    L_0x0213:
        r0 = r21;
        r4 = r0.f809d;
        r0 = r22;
        r5 = r0.mId;
        r4.put(r5, r6);
        r0 = r21;
        r4 = r0.f808c;
        r0 = r22;
        r5 = r0.mId;
        r0 = r21;
        r5 = r0.m1027a(r5);
        r4.notify(r5, r6);
        goto L_0x007c;
    L_0x0231:
        r19 = r18.getHeight();
        r20 = 100;
        r0 = r19;
        r1 = r20;
        if (r0 < r1) goto L_0x0249;
    L_0x023d:
        r19 = r18.getWidth();
        r20 = 100;
        r0 = r19;
        r1 = r20;
        if (r0 >= r1) goto L_0x0159;
    L_0x0249:
        r0 = r6.contentView;
        r19 = r0;
        r0 = r19;
        r1 = r18;
        r0.setImageViewBitmap(r8, r1);
        goto L_0x0159;
    L_0x0256:
        r8 = r6.contentView;
        r9 = 8;
        r8.setViewVisibility(r4, r9);
        r4 = r6.contentView;
        r8 = 0;
        r4.setViewVisibility(r7, r8);
        r0 = r22;
        r4 = r0.mNotify;
        if (r4 == 0) goto L_0x031e;
    L_0x0269:
        r4 = 0;
        r0 = r22;
        r0.mNotify = r4;
        r0 = r21;
        r4 = r0.f806a;
        r7 = "audio";
        r4 = r4.getSystemService(r7);
        r4 = (android.media.AudioManager) r4;
        r4 = r4.getRingerMode();
        r7 = 1;
        if (r4 != r7) goto L_0x030d;
    L_0x0281:
        r4 = 0;
        r6.sound = r4;
        r4 = r6.defaults;
        r4 = r4 | 2;
        r6.defaults = r4;
    L_0x028a:
        r4 = 17301633; // 0x1080081 float:2.4979616E-38 double:8.5481425E-317;
        r6.icon = r4;
        r4 = "\u6b63\u5728\u4e0b\u8f7d";
        r6.tickerText = r4;
        r4 = r6.flags;
        r4 = r4 | 32;
        r6.flags = r4;
        r4 = new android.content.Intent;
        r4.<init>();
        r0 = r21;
        r7 = r0.f806a;
        r8 = 0;
        r9 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r4 = android.app.PendingIntent.getBroadcast(r7, r8, r4, r9);
        r6.contentIntent = r4;
        r7 = 0;
        r4 = r5 instanceof com.igexin.getuiext.data.p034a.C0292e;
        if (r4 == 0) goto L_0x035b;
    L_0x02b0:
        r4 = r5;
        r4 = (com.igexin.getuiext.data.p034a.C0292e) r4;
        r4 = r4.f781n;
        r8 = com.igexin.getuiext.service.C0300f.f818a;
        r4 = r4.ordinal();
        r4 = r8[r4];
        switch(r4) {
            case 1: goto L_0x0329;
            case 2: goto L_0x0344;
            default: goto L_0x02c0;
        };
    L_0x02c0:
        r4 = r7;
    L_0x02c1:
        r5 = r6.contentView;
        r7 = 100;
        r8 = 0;
        r5.setProgressBar(r11, r7, r4, r8);
        r5 = new android.content.Intent;
        r7 = "com.igexin.getuiext.ui.upgrade_progress";
        r5.<init>(r7);
        r7 = "download_id";
        r0 = r22;
        r8 = r0.mId;
        r5.putExtra(r7, r8);
        r7 = "file_path";
        r8 = "";
        r5.putExtra(r7, r8);
        r7 = "progress";
        r5.putExtra(r7, r4);
        r0 = r21;
        r4 = r0.f806a;
        r4.sendBroadcast(r5);
        r0 = r21;
        r4 = r0.f809d;
        r0 = r22;
        r5 = r0.mId;
        r4.put(r5, r6);
        r0 = r21;
        r4 = r0.f808c;	 Catch:{ Exception -> 0x030a }
        r0 = r22;
        r5 = r0.mId;	 Catch:{ Exception -> 0x030a }
        r0 = r21;
        r5 = r0.m1027a(r5);	 Catch:{ Exception -> 0x030a }
        r4.notify(r5, r6);	 Catch:{ Exception -> 0x030a }
        goto L_0x007c;
    L_0x030a:
        r4 = move-exception;
        goto L_0x007c;
    L_0x030d:
        r7 = 2;
        if (r4 != r7) goto L_0x028a;
    L_0x0310:
        r4 = r6.defaults;
        r4 = r4 | 2;
        r6.defaults = r4;
        r4 = r6.defaults;
        r4 = r4 | 1;
        r6.defaults = r4;
        goto L_0x028a;
    L_0x031e:
        r4 = 0;
        r6.defaults = r4;
        r4 = 0;
        r6.sound = r4;
        r4 = 0;
        r6.vibrate = r4;
        goto L_0x028a;
    L_0x0329:
        r8 = r5.f776i;
        r5 = (com.igexin.getuiext.data.p034a.C0292e) r5;
        r4 = r5.f782o;
        r12 = 0;
        r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r10 == 0) goto L_0x02c0;
    L_0x0335:
        r0 = r22;
        r7 = r0.mCurrentBytes;
        r12 = (long) r7;
        r4 = r8 - r4;
        r4 = r4 + r12;
        r12 = 100;
        r4 = r4 * r12;
        r4 = r4 / r8;
        r4 = (int) r4;
        goto L_0x02c1;
    L_0x0344:
        r0 = r22;
        r4 = r0.mTotalBytes;
        if (r4 == 0) goto L_0x02c0;
    L_0x034a:
        r0 = r22;
        r4 = r0.mCurrentBytes;
        r4 = (long) r4;
        r8 = 100;
        r4 = r4 * r8;
        r0 = r22;
        r7 = r0.mTotalBytes;
        r8 = (long) r7;
        r4 = r4 / r8;
        r4 = (int) r4;
        goto L_0x02c1;
    L_0x035b:
        r0 = r22;
        r4 = r0.mTotalBytes;
        if (r4 == 0) goto L_0x02c0;
    L_0x0361:
        r0 = r22;
        r4 = r0.mCurrentBytes;
        r4 = (long) r4;
        r8 = 100;
        r4 = r4 * r8;
        r0 = r22;
        r7 = r0.mTotalBytes;
        r8 = (long) r7;
        r4 = r4 / r8;
        r4 = (int) r4;
        goto L_0x02c1;
    L_0x0372:
        r0 = r21;
        r1 = r22;
        r6 = r0.m1028a(r1, r6, r5);
        r4 = 16;
        r6.flags = r4;
        r4 = 17301634; // 0x1080082 float:2.497962E-38 double:8.548143E-317;
        r6.icon = r4;
        r4 = "\u4e0b\u8f7d\u6210\u529f";
        r6.tickerText = r4;
        r4 = r6.contentView;
        r8 = 8;
        r4.setViewVisibility(r7, r8);
        r4 = r6.contentView;
        r7 = 0;
        r4.setViewVisibility(r12, r7);
        r4 = r6.contentView;
        r0 = r21;
        r7 = r0.f815j;
        r8 = "inc_setup.png";
        r7 = r7.m1059c(r8);
        r4.setImageViewBitmap(r13, r7);
        r4 = r6.contentView;
        r7 = r5.a;
        r4.setTextViewText(r14, r7);
        r4 = r6.contentView;
        r5 = r5.c;
        r4.setTextViewText(r15, r5);
        r4 = r6.contentView;
        r5 = "\u4e0b\u8f7d\u5b8c\u6210";
        r0 = r16;
        r4.setTextViewText(r0, r5);
        r4 = r6.contentView;
        r5 = "\u5b89\u88c5";
        r0 = r17;
        r4.setTextViewText(r0, r5);
        r0 = r21;
        r4 = r0.f806a;
        r4 = com.igexin.download.SdkDownLoader.getInstantiate(r4);
        r0 = r22;
        r5 = r0.mId;
        r4.deleteTask(r5);
        r0 = r21;
        r4 = r0.f811f;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r4 = com.igexin.getuiext.p033b.C0287c.m994d();
        r4 = r4.m998c();
        r0 = r22;
        r5 = r0.mId;
        r4.m990b(r5);
        r0 = r21;
        r4 = r0.f812g;
        r0 = r22;
        r5 = r0.mId;
        r4 = r4.get(r5);
        r4 = (com.igexin.getuiext.data.p034a.C0288a) r4;
        r0 = r21;
        r5 = r0.f812g;
        r0 = r22;
        r7 = r0.mId;
        r5.remove(r7);
        if (r4 == 0) goto L_0x041c;
    L_0x0407:
        r5 = r4.f765b;
        if (r5 == 0) goto L_0x041c;
    L_0x040b:
        r5 = r4.f765b;
        r7 = "";
        r5 = r5.equals(r7);
        if (r5 != 0) goto L_0x041c;
    L_0x0415:
        r4 = r4.f765b;
        r0 = r21;
        r0.m1032a(r4);
    L_0x041c:
        r0 = r21;
        r4 = r0.f809d;
        r0 = r22;
        r5 = r0.mId;
        r4.put(r5, r6);
        r0 = r21;
        r4 = r0.f808c;
        r0 = r22;
        r5 = r0.mId;
        r0 = r21;
        r5 = r0.m1027a(r5);
        r4.notify(r5, r6);
        goto L_0x007c;
    L_0x043a:
        r0 = r22;
        r4 = r0.mControl;
        r5 = 1;
        if (r4 != r5) goto L_0x007c;
    L_0x0441:
        r0 = r21;
        r4 = r0.f808c;
        r0 = r22;
        r5 = r0.mId;
        r0 = r21;
        r5 = r0.m1027a(r5);
        r4.cancel(r5);
        r0 = r21;
        r4 = r0.f809d;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r0 = r21;
        r4 = r0.f811f;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r0 = r21;
        r4 = r0.f810e;
        r0 = r22;
        r5 = r0.mId;
        r4.remove(r5);
        r4 = 1;
        r0 = r22;
        r0.mNotify = r4;
        goto L_0x007c;
    L_0x047a:
        r6 = r4;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.getuiext.service.d.a(com.igexin.download.DownloadInfo):void");
    }

    private void m1032a(String str) {
        C0288a b = C0297c.m1021a().m1025b(str);
        if (b == null) {
            return;
        }
        if (b instanceof C0316f) {
            C0295a.m1016a(this.f806a, b, 3);
        } else if (b instanceof C0292e) {
            C0295a.m1016a(this.f806a, b, 4);
        }
    }

    private void m1033a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            new C0299e(this).execute(new String[]{str, str2});
        }
    }

    public String getName() {
        return this.f807b;
    }

    public void update(DownloadInfo downloadInfo) {
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        if (equals || this.f814i) {
            if (equals) {
                this.f814i = true;
            } else {
                Toast.makeText(this.f806a, "\u5f53\u524dSD\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u8bbe\u7f6e\u3002", 0).show();
                this.f814i = false;
            }
            downloadInfo.refreshSpeed();
            if (this.f811f.get(downloadInfo.mId) == null) {
                this.f811f.put(downloadInfo.mId, downloadInfo);
            }
            if (downloadInfo.mStatus == Downloads.STATUS_SUCCESS) {
                this.f810e.remove(downloadInfo.mId);
            } else {
                if (this.f810e.get(downloadInfo.mId) == null) {
                    this.f810e.put(downloadInfo.mId, Long.valueOf(System.currentTimeMillis()));
                }
                if (downloadInfo.mDownSpeed != 0) {
                    this.f810e.put(downloadInfo.mId, Long.valueOf(System.currentTimeMillis()));
                }
            }
            if (this.f813h == null) {
                this.f813h = new Timer();
                this.f813h.schedule(new C0301g(), 100, 5000);
            }
            m1031a(downloadInfo);
        }
    }
}
