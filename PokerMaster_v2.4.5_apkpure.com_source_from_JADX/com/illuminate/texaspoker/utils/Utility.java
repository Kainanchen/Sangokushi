package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import com.ali.fixHelper;
import com.facebook.imagepipeline.p041c.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.p043e.ImagePipelineFactory;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p006b.FileBinaryResource;
import com.facebook.p007c.p008a.CacheKey;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p059d.City;
import com.illuminate.texaspoker.p059d.Country;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.State;
import com.illuminate.texaspoker.utils.m.AnonymousClass13;
import com.illuminate.texaspoker.utils.m.AnonymousClass14;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.UserGameInfoNet;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerHttp.SCUpdateRsp;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Collator;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.illuminate.texaspoker.utils.m */
public final class Utility {

    /* compiled from: Utility */
    /* renamed from: com.illuminate.texaspoker.utils.m.13 */
    static class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ SCUpdateRsp f6762a;
        final /* synthetic */ Context f6763b;

        AnonymousClass13(SCUpdateRsp sCUpdateRsp, Context context) {
            this.f6762a = sCUpdateRsp;
            this.f6763b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f6763b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f6762a.getStAppUpdateInfo().getStrURL())));
        }
    }

    /* compiled from: Utility */
    /* renamed from: com.illuminate.texaspoker.utils.m.14 */
    static class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ SCUpdateRsp f6764a;
        final /* synthetic */ Context f6765b;

        AnonymousClass14(SCUpdateRsp sCUpdateRsp, Context context) {
            this.f6764a = sCUpdateRsp;
            this.f6765b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f6765b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f6764a.getStAppUpdateInfo().getStrURL())));
            System.exit(0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.1 */
    static class Utility implements OnClickListener {
        static {
            fixHelper.fixfunc(new int[]{2343, 2344});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.2 */
    static class Utility implements Comparator<CountryRegion> {
        static {
            fixHelper.fixfunc(new int[]{2554, 2555});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.3 */
    static class Utility implements Comparator<State> {
        static {
            fixHelper.fixfunc(new int[]{2180, 2181});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.4 */
    static class Utility implements Comparator<State> {
        static {
            fixHelper.fixfunc(new int[]{2279, 2280});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.5 */
    static class Utility implements Comparator<State> {
        static {
            fixHelper.fixfunc(new int[]{2046, 2047});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.6 */
    static class Utility implements Comparator<City> {
        static {
            fixHelper.fixfunc(new int[]{2107, 2108});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.7 */
    static class Utility implements Comparator<City> {
        static {
            fixHelper.fixfunc(new int[]{AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT, 2049});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.8 */
    static class Utility implements Comparator<City> {
        static {
            fixHelper.fixfunc(new int[]{1824, 1825});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.utils.m.9 */
    static class Utility implements Comparator<Country> {
        static {
            fixHelper.fixfunc(new int[]{1901, 1902});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native Utility();

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    public static String m4473a(String str) {
        byte[] bytes = str.getBytes();
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(bytes);
        StringBuffer stringBuffer = new StringBuffer();
        int length = messageDigest.digest().length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%x", new Object[]{Integer.valueOf(bytes[i] & MotionEventCompat.ACTION_MASK)}));
        }
        return stringBuffer.toString();
    }

    public static String m4484b(String str) {
        byte[] bytes = str.getBytes();
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(bytes);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : messageDigest.digest()) {
            int i = b & MotionEventCompat.ACTION_MASK;
            if (i < 16) {
                stringBuffer.append(0);
            }
            stringBuffer.append(Integer.toHexString(i));
        }
        return stringBuffer.toString().toLowerCase();
    }

    public static String m4471a(long j) {
        if (j <= 7200) {
            return String.format(StringUtils.m4461a(2131165275), new Object[]{Long.valueOf(j / 60)});
        } else if (j <= 7200 || j >= 86400) {
            return String.format(StringUtils.m4461a(2131165699), new Object[]{Long.valueOf(((j / 60) / 60) / 24)});
        } else {
            String a = Utility.m4474a("#.#", (((double) j) / 60.0d) / 60.0d);
            return String.format(StringUtils.m4461a(2131165700), new Object[]{a});
        }
    }

    public static boolean m4486b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(currentTimeMillis);
        if (instance2.get(1) == instance.get(1) && instance2.get(2) == instance.get(2) && instance2.get(5) == instance.get(5)) {
            return true;
        }
        return false;
    }

    public static String m4489c(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(currentTimeMillis);
        instance2.add(5, -1);
        if (instance2.get(1) == instance.get(1) && instance2.get(2) == instance.get(2) && instance2.get(5) == instance.get(5)) {
            String a = Utility.m4472a(j, StringUtils.m4461a(2131165422));
            return String.format(StringUtils.m4461a(2131165512), new Object[]{a});
        }
        instance2.add(5, 1);
        int i = instance.get(1);
        int i2 = instance.get(3);
        int i3 = instance.get(7);
        int i4 = instance2.get(1);
        int i5 = instance2.get(3);
        int i6 = instance2.get(7);
        if (i != i4) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165944));
        }
        if (i == i4 && i2 != i5) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165805));
        }
        if (i == i4 && i2 == i5 && i3 != i6) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165943));
        }
        return Utility.m4472a(j, StringUtils.m4461a(2131165508));
    }

    public static String m4492d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(currentTimeMillis);
        instance2.add(5, -1);
        if (instance2.get(1) == instance.get(1) && instance2.get(2) == instance.get(2) && instance2.get(5) == instance.get(5)) {
            return StringUtils.m4461a(2131165511);
        }
        instance2.add(5, 1);
        int i = instance.get(1);
        int i2 = instance.get(3);
        int i3 = instance.get(7);
        int i4 = instance2.get(1);
        int i5 = instance2.get(3);
        int i6 = instance2.get(7);
        if (i != i4) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165507));
        }
        if (i == i4 && i2 != i5) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165507));
        }
        if (i == i4 && i2 == i5 && i3 != i6) {
            return Utility.m4472a(j, StringUtils.m4461a(2131165510));
        }
        return Utility.m4472a(j, StringUtils.m4461a(2131165508));
    }

    public static String m4496e(long j) {
        long currentTimeMillis = ((System.currentTimeMillis() + RuntimeData.f6671b) - j) / 1000;
        if (currentTimeMillis < 60) {
            return BaseApplication.m3548a().getResources().getString(2131165454);
        }
        currentTimeMillis /= 60;
        if (currentTimeMillis < 60) {
            return String.format(BaseApplication.m3548a().getResources().getString(2131165462), new Object[]{Long.valueOf(currentTimeMillis)});
        }
        currentTimeMillis /= 60;
        if (currentTimeMillis < 24) {
            return String.format(BaseApplication.m3548a().getResources().getString(2131165452), new Object[]{Long.valueOf(currentTimeMillis)});
        }
        currentTimeMillis /= 24;
        if (currentTimeMillis < 30) {
            return String.format(BaseApplication.m3548a().getResources().getString(2131165442), new Object[]{Long.valueOf(currentTimeMillis)});
        }
        currentTimeMillis /= 30;
        if (currentTimeMillis < 12) {
            return String.format(BaseApplication.m3548a().getResources().getString(2131165463), new Object[]{Long.valueOf(currentTimeMillis)});
        }
        currentTimeMillis /= 12;
        return String.format(BaseApplication.m3548a().getResources().getString(2131165519), new Object[]{Long.valueOf(currentTimeMillis)});
    }

    public static String m4499f(long j) {
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        instance.add(5, -1);
        if (instance.get(1) == instance2.get(1) && instance.get(2) == instance2.get(2) && instance.get(5) == instance2.get(5)) {
            return StringUtils.m4461a(2131165511);
        }
        instance.add(5, 1);
        int i = instance2.get(1);
        int i2 = instance2.get(3);
        int i3 = instance2.get(7);
        int i4 = instance.get(1);
        int i5 = instance.get(3);
        int i6 = instance.get(7);
        if (i == i4 && i2 == i5 && i3 == i6) {
            return StringUtils.m4461a(2131165509);
        }
        return Utility.m4472a(j, StringUtils.m4461a(2131165506));
    }

    public static boolean m4480a() {
        if (BaseApplication.m3548a().getResources().getConfiguration().locale.toString().endsWith("zh_CN")) {
            return true;
        }
        return false;
    }

    public static boolean m4485b() {
        Locale locale = BaseApplication.m3548a().getResources().getConfiguration().locale;
        if (locale.toString().endsWith("zh_HK") || locale.toString().endsWith("zh_TW")) {
            return true;
        }
        return false;
    }

    public static boolean m4490c(String str) {
        if (BaseApplication.m3548a().getResources().getConfiguration().locale.toString().equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static void m4493d(String str) {
        Resources resources = BaseApplication.m3548a().getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (str.equals("zh_CN")) {
            configuration.locale = Locale.SIMPLIFIED_CHINESE;
        } else if (str.equals("zh_TW")) {
            configuration.locale = Locale.TRADITIONAL_CHINESE;
        } else if (str.equals("en")) {
            configuration.locale = Locale.ENGLISH;
        } else {
            configuration.locale = Locale.getDefault();
        }
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public static String m4488c() {
        return BaseApplication.m3548a().getResources().getConfiguration().locale.getCountry();
    }

    public static boolean m4494d() {
        if (ContextCompat.checkSelfPermission(BaseApplication.m3548a(), "android.permission.READ_CONTACTS") != 0) {
            return false;
        }
        return true;
    }

    public static void m4498e() {
        new AddressBookAsyncQueryHandler(BaseApplication.m3548a().getContentResolver()).startQuery(0, null, Phone.CONTENT_URI, new String[]{"_id", "display_name", "data1", "sort_key", "data2"}, null, null, "sort_key COLLATE LOCALIZED asc");
    }

    public static String m4472a(long j, String str) {
        return new SimpleDateFormat(str).format(new Date(j));
    }

    public static String m4474a(String str, double d) {
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(d);
    }

    public static String m4502g(long j) {
        double d = (double) j;
        String a = Utility.m4474a("###,###", d);
        if (a.length() <= 8) {
            return a;
        }
        d /= 1000.0d;
        a = Utility.m4474a("###,###.#K", d);
        if (a.length() <= 8) {
            return a;
        }
        return Utility.m4474a("###,###.#M", d / 1000.0d);
    }

    public static String m4505h(long j) {
        double d = (double) j;
        String a = Utility.m4474a("###,###", d);
        if (a.length() <= 8) {
            return a;
        }
        d /= 1000.0d;
        a = Utility.m4474a("###,###K", d);
        if (a.length() <= 8) {
            return a;
        }
        return Utility.m4474a("###,###M", d / 1000.0d);
    }

    public static String m4508i(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        return new DecimalFormat("#.##").format((double) (((float) j) / 1000.0f)) + "K";
    }

    public static boolean m4500f() {
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) BaseApplication.m3548a().getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(BaseApplication.m3548a().getPackageName())) {
                if (runningAppProcessInfo.importance == 100) {
                    Log.i("\u524d\u53f0", runningAppProcessInfo.processName);
                    return true;
                }
                Log.i("\u540e\u53f0", runningAppProcessInfo.processName);
                return false;
            }
        }
        return false;
    }

    public static void m4479a(boolean z) {
        Exception e;
        if (z && SharedPreferencesManager.m4422t() == 1) {
            MediaPlayer create = MediaPlayer.create(BaseApplication.m3548a(), RingtoneManager.getDefaultUri(2));
            if (create != null) {
                create.stop();
            }
            create.setLooping(false);
            try {
                create.prepare();
            } catch (IllegalStateException e2) {
                e = e2;
                e.printStackTrace();
                create.start();
                if (SharedPreferencesManager.m4428v() != 1) {
                    ((Vibrator) BaseApplication.m3548a().getSystemService("vibrator")).vibrate(new long[]{200, 400, 200, 400}, -1);
                }
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                create.start();
                if (SharedPreferencesManager.m4428v() != 1) {
                    ((Vibrator) BaseApplication.m3548a().getSystemService("vibrator")).vibrate(new long[]{200, 400, 200, 400}, -1);
                }
            }
            create.start();
        }
        if (SharedPreferencesManager.m4428v() != 1) {
            ((Vibrator) BaseApplication.m3548a().getSystemService("vibrator")).vibrate(new long[]{200, 400, 200, 400}, -1);
        }
    }

    public static float m4467a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int m4468a(Context context, String str) {
        return context.getResources().getIdentifier(str, "mipmap", context.getApplicationInfo().packageName);
    }

    public static String m4497e(String str) {
        String[] split = str.toLowerCase().split("[?]");
        if (split.length != 2) {
            return null;
        }
        split = split[1].split("[&]");
        Map hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split("[=]");
            hashMap.put(split3[0], split3[1]);
        }
        return (String) hashMap.get(ParamKey.URL);
    }

    public static void m4476a(Context context, SCUpdateRsp sCUpdateRsp) {
        if (sCUpdateRsp.getStAppUpdateInfo() != null) {
            switch (sCUpdateRsp.getStAppUpdateInfo().getEUpdateType().getNumber()) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    SharedPreferencesManager.m4306a(false);
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    SharedPreferencesManager.m4306a(true);
                    new Builder(context).setCancelable(false).setTitle(2131165433).setMessage(sCUpdateRsp.getStAppUpdateInfo().getStrDesc()).setPositiveButton(2131165516, new AnonymousClass14(sCUpdateRsp, context)).create().show();
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    SharedPreferencesManager.m4306a(true);
                    if (!Utility.m4486b(SharedPreferencesManager.m4439z())) {
                        SharedPreferencesManager.m4330d(System.currentTimeMillis() + RuntimeData.f6671b);
                        new Builder(context).setTitle(2131165433).setMessage(sCUpdateRsp.getStAppUpdateInfo().getStrDesc()).setPositiveButton(2131165516, new AnonymousClass13(sCUpdateRsp, context)).setNegativeButton(2131165432, new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).create().show();
                    }
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    new Builder(context).setTitle(2131165433).setMessage(sCUpdateRsp.getSHint()).setPositiveButton(2131165438, new Utility()).create().show();
                default:
            }
        }
    }

    public static boolean m4481a(Uri uri) {
        if (uri == null) {
            return false;
        }
        CacheKey a = DefaultCacheKeyFactory.m1912a().m1913a(ImageRequest.m2327a(uri));
        if (ImagePipelineFactory.m1949a().m1958c().m974c(a) || ImagePipelineFactory.m1949a().m1960e().m974c(a)) {
            return true;
        }
        return false;
    }

    public static File m4483b(Uri uri) {
        if (uri == null) {
            return null;
        }
        CacheKey a = DefaultCacheKeyFactory.m1912a().m1913a(ImageRequest.m2327a(uri));
        if (ImagePipelineFactory.m1949a().m1958c().m974c(a)) {
            return ((FileBinaryResource) ImagePipelineFactory.m1949a().m1958c().m971a(a)).f946a;
        }
        if (ImagePipelineFactory.m1949a().m1960e().m974c(a)) {
            return ((FileBinaryResource) ImagePipelineFactory.m1949a().m1960e().m971a(a)).f946a;
        }
        return null;
    }

    public static Bitmap m4470a(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getWidth(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getWidth() / 2), (float) (bitmap.getWidth() / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void m4478a(String str, Object... objArr) {
        Intent intent = new Intent();
        intent.setAction("com.illuminate.texaspoker.notifyaction");
        intent.putExtra("NOTIFY_NAME", str);
        Object arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        intent.putExtra("NOTIFY_DATA", arrayList);
        BaseApplication.m3548a().sendBroadcast(intent);
    }

    public static long m4469a(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 500;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 1000;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 2000;
            default:
                return 200;
        }
    }

    public static int m4482b(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 300;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 600;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 600;
            default:
                return 180;
        }
    }

    public static long m4487c(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 4000;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 4000;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 8000;
            default:
                return 2000;
        }
    }

    public static final String m4475a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String toHexString = Integer.toHexString(b & MotionEventCompat.ACTION_MASK);
            if (toHexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(toHexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static byte[] m4501f(String str) {
        if (StringUtils.m4462a((CharSequence) str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] toCharArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Utility.m4466a(toCharArray[i2 + 1]) | (Utility.m4466a(toCharArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte m4466a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4504g(java.lang.String r13) {
        /*
        r11 = 1;
        r1 = 0;
        r0 = "cn";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0051;
    L_0x000a:
        r0 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getResources();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getAssets();	 Catch:{ Exception -> 0x01d3 }
        r2 = "res/location/Location_cn.xml";
        r0 = r0.open(r2);	 Catch:{ Exception -> 0x01d3 }
    L_0x001c:
        r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance();	 Catch:{ Exception -> 0x01d3 }
        r3 = 1;
        r2.setNamespaceAware(r3);	 Catch:{ Exception -> 0x01d3 }
        r4 = r2.newPullParser();	 Catch:{ Exception -> 0x01d3 }
        r2 = "UTF-8";
        r4.setInput(r0, r2);	 Catch:{ Exception -> 0x01d3 }
        r0 = r4.getEventType();	 Catch:{ Exception -> 0x01d3 }
        r5 = new java.util.ArrayList;	 Catch:{ Exception -> 0x01d3 }
        r5.<init>();	 Catch:{ Exception -> 0x01d3 }
        r6 = new java.util.HashMap;	 Catch:{ Exception -> 0x01d3 }
        r6.<init>();	 Catch:{ Exception -> 0x01d3 }
        r2 = r1;
        r3 = r1;
    L_0x003d:
        if (r0 == r11) goto L_0x01e1;
    L_0x003f:
        r7 = r4.getName();	 Catch:{ Exception -> 0x01d3 }
        switch(r0) {
            case 2: goto L_0x007f;
            case 3: goto L_0x0115;
            default: goto L_0x0046;
        };	 Catch:{ Exception -> 0x01d3 }
    L_0x0046:
        r0 = r2;
        r2 = r3;
    L_0x0048:
        r3 = r4.next();	 Catch:{ Exception -> 0x01d3 }
        r12 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r12;
        goto L_0x003d;
    L_0x0051:
        r0 = "tw";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x006c;
    L_0x0059:
        r0 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getResources();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getAssets();	 Catch:{ Exception -> 0x01d3 }
        r2 = "res/location/Location_tw.xml";
        r0 = r0.open(r2);	 Catch:{ Exception -> 0x01d3 }
        goto L_0x001c;
    L_0x006c:
        r0 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getResources();	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.getAssets();	 Catch:{ Exception -> 0x01d3 }
        r2 = "res/location/Location_en.xml";
        r0 = r0.open(r2);	 Catch:{ Exception -> 0x01d3 }
        goto L_0x001c;
    L_0x007f:
        r0 = 0;
        r8 = "name";
        r8 = r4.getAttributeValue(r0, r8);	 Catch:{ Exception -> 0x01d3 }
        r0 = 0;
        r9 = "code";
        r9 = r4.getAttributeValue(r0, r9);	 Catch:{ Exception -> 0x01d3 }
        if (r8 == 0) goto L_0x0200;
    L_0x008f:
        r0 = com.illuminate.texaspoker.utils.StringUtils.m4463b(r8);	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.toUpperCase();	 Catch:{ Exception -> 0x01d3 }
    L_0x0097:
        r10 = "CountryRegion";
        r10 = r7.equals(r10);	 Catch:{ Exception -> 0x01d3 }
        if (r10 == 0) goto L_0x00c1;
    L_0x009f:
        r3 = new com.illuminate.texaspoker.d.g;	 Catch:{ Exception -> 0x01d3 }
        r3.<init>();	 Catch:{ Exception -> 0x01d3 }
        r3.d = r8;	 Catch:{ Exception -> 0x01d3 }
        r3.f = r0;	 Catch:{ Exception -> 0x01d3 }
        r3.e = r9;	 Catch:{ Exception -> 0x01d3 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        r3.f6042a = r0;	 Catch:{ Exception -> 0x01d3 }
        r0 = new java.util.HashMap;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        r3.f6043b = r0;	 Catch:{ Exception -> 0x01d3 }
        r5.add(r3);	 Catch:{ Exception -> 0x01d3 }
        r6.put(r9, r3);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x00c1:
        r10 = "State";
        r10 = r7.equals(r10);	 Catch:{ Exception -> 0x01d3 }
        if (r10 == 0) goto L_0x00f2;
    L_0x00c9:
        r2 = new com.illuminate.texaspoker.d.k;	 Catch:{ Exception -> 0x01d3 }
        r2.<init>();	 Catch:{ Exception -> 0x01d3 }
        r2.d = r8;	 Catch:{ Exception -> 0x01d3 }
        r2.f = r0;	 Catch:{ Exception -> 0x01d3 }
        r2.e = r9;	 Catch:{ Exception -> 0x01d3 }
        r2.f6050a = r3;	 Catch:{ Exception -> 0x01d3 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        r2.f6051b = r0;	 Catch:{ Exception -> 0x01d3 }
        r0 = new java.util.HashMap;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        r2.f6052c = r0;	 Catch:{ Exception -> 0x01d3 }
        r0 = r3.f6042a;	 Catch:{ Exception -> 0x01d3 }
        r0.add(r2);	 Catch:{ Exception -> 0x01d3 }
        r0 = r3.f6043b;	 Catch:{ Exception -> 0x01d3 }
        r0.put(r9, r2);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x00f2:
        r10 = "City";
        r7 = r7.equals(r10);	 Catch:{ Exception -> 0x01d3 }
        if (r7 == 0) goto L_0x0046;
    L_0x00fa:
        r7 = new com.illuminate.texaspoker.d.b;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        r7.d = r8;	 Catch:{ Exception -> 0x01d3 }
        r7.f = r0;	 Catch:{ Exception -> 0x01d3 }
        r7.e = r9;	 Catch:{ Exception -> 0x01d3 }
        r7.f6027a = r2;	 Catch:{ Exception -> 0x01d3 }
        r0 = r2.f6051b;	 Catch:{ Exception -> 0x01d3 }
        r0.add(r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2.f6052c;	 Catch:{ Exception -> 0x01d3 }
        r0.put(r9, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0115:
        r0 = "Location";
        r0 = r7.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0151;
    L_0x011d:
        r0 = "cn";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0131;
    L_0x0125:
        r0 = new com.illuminate.texaspoker.utils.m$15;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r5, r0);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0131:
        r0 = "tw";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0145;
    L_0x0139:
        r0 = new com.illuminate.texaspoker.utils.m$16;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r5, r0);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0145:
        r0 = new com.illuminate.texaspoker.utils.m$2;	 Catch:{ Exception -> 0x01d3 }
        r0.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r5, r0);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0151:
        r0 = "CountryRegion";
        r0 = r7.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0193;
    L_0x0159:
        r0 = "cn";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x016f;
    L_0x0161:
        r0 = r3.f6042a;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$3;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x016f:
        r0 = "tw";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0185;
    L_0x0177:
        r0 = r3.f6042a;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$4;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0185:
        r0 = r3.f6042a;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$5;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x0193:
        r0 = "State";
        r0 = r7.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0046;
    L_0x019b:
        r0 = "cn";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x01b1;
    L_0x01a3:
        r0 = r2.f6051b;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$6;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x01b1:
        r0 = "tw";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x01c7;
    L_0x01b9:
        r0 = r2.f6051b;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$7;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        r0 = r2;
        r2 = r3;
        goto L_0x0048;
    L_0x01c7:
        r0 = r2.f6051b;	 Catch:{ Exception -> 0x01d3 }
        r7 = new com.illuminate.texaspoker.utils.m$8;	 Catch:{ Exception -> 0x01d3 }
        r7.<init>();	 Catch:{ Exception -> 0x01d3 }
        java.util.Collections.sort(r0, r7);	 Catch:{ Exception -> 0x01d3 }
        goto L_0x0046;
    L_0x01d3:
        r0 = move-exception;
        r1 = "Utility";
        r2 = r0.getMessage();
        android.util.Log.e(r1, r2, r0);
        r0.printStackTrace();
    L_0x01e0:
        return;
    L_0x01e1:
        r0 = "cn";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x01ee;
    L_0x01e9:
        com.illuminate.texaspoker.utils.RuntimeData.f6683n = r5;	 Catch:{ Exception -> 0x01d3 }
        com.illuminate.texaspoker.utils.RuntimeData.f6684o = r6;	 Catch:{ Exception -> 0x01d3 }
        goto L_0x01e0;
    L_0x01ee:
        r0 = "tw";
        r0 = r13.equals(r0);	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x01fb;
    L_0x01f6:
        com.illuminate.texaspoker.utils.RuntimeData.f6685p = r5;	 Catch:{ Exception -> 0x01d3 }
        com.illuminate.texaspoker.utils.RuntimeData.f6686q = r6;	 Catch:{ Exception -> 0x01d3 }
        goto L_0x01e0;
    L_0x01fb:
        com.illuminate.texaspoker.utils.RuntimeData.f6687r = r5;	 Catch:{ Exception -> 0x01d3 }
        com.illuminate.texaspoker.utils.RuntimeData.f6688s = r6;	 Catch:{ Exception -> 0x01d3 }
        goto L_0x01e0;
    L_0x0200:
        r0 = r1;
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.utils.m.g(java.lang.String):void");
    }

    public static Map<String, CountryRegion> m4503g() {
        if (Utility.m4480a()) {
            return RuntimeData.f6684o;
        }
        if (Utility.m4485b()) {
            return RuntimeData.f6686q;
        }
        return RuntimeData.f6688s;
    }

    public static List<CountryRegion> m4507h() {
        if (Utility.m4480a()) {
            return RuntimeData.f6683n;
        }
        if (Utility.m4485b()) {
            return RuntimeData.f6685p;
        }
        return RuntimeData.f6687r;
    }

    public static String m4506h(String str) {
        CountryRegion countryRegion;
        String[] split = str.split("-");
        String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        if (Utility.m4480a()) {
            countryRegion = (CountryRegion) RuntimeData.f6684o.get(split[0]);
        } else if (Utility.m4485b()) {
            countryRegion = (CountryRegion) RuntimeData.f6686q.get(split[0]);
        } else {
            countryRegion = (CountryRegion) RuntimeData.f6688s.get(split[0]);
        }
        if (countryRegion != null) {
            str2 = countryRegion.d;
            State state = (State) countryRegion.f6043b.get(split[1]);
            if (state != null) {
                City city = (City) state.f6052c.get(split[2]);
                if (city != null) {
                    return str2 + " " + city.d;
                }
            }
        }
        return str2;
    }

    public static void m4509i() {
        try {
            InputStream open;
            if (Utility.m4480a()) {
                open = BaseApplication.m3548a().getResources().getAssets().open("res/location/PhoneLocation_cn.xml");
            } else if (Utility.m4485b()) {
                open = BaseApplication.m3548a().getResources().getAssets().open("res/location/PhoneLocation_tw.xml");
            } else {
                open = BaseApplication.m3548a().getResources().getAssets().open("res/location/PhoneLocation_en.xml");
            }
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
                        String attributeValue = newPullParser.getAttributeValue(null, SelectCountryActivity.EXTRA_COUNTRY_NAME);
                        String attributeValue2 = newPullParser.getAttributeValue(null, SelectCountryActivity.EXTRA_COUNTRY_CODE);
                        String attributeValue3 = newPullParser.getAttributeValue(null, "areaCode");
                        if (!name.equals("Country")) {
                            break;
                        }
                        Country country = new Country();
                        country.f6039a = attributeValue;
                        country.f6040b = attributeValue2;
                        country.f6041c = attributeValue3;
                        arrayList.add(country);
                        country = new Country();
                        country.f6039a = attributeValue;
                        country.f6040b = attributeValue2;
                        country.f6041c = attributeValue3;
                        hashMap.put(attributeValue2, country);
                        break;
                    case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        if (name.equals("Location")) {
                            if (!Utility.m4480a()) {
                                if (!Utility.m4485b()) {
                                    Collections.sort(arrayList, new Comparator<Country>() {
                                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                                            return Collator.getInstance(Locale.ENGLISH).compare(((Country) obj).f6039a, ((Country) obj2).f6039a);
                                        }
                                    });
                                    break;
                                } else {
                                    Collections.sort(arrayList, new Comparator<Country>() {
                                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                                            return Collator.getInstance(Locale.SIMPLIFIED_CHINESE).compare(((Country) obj).f6039a, ((Country) obj2).f6039a);
                                        }
                                    });
                                    break;
                                }
                            }
                            Collections.sort(arrayList, new Utility());
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            RuntimeData.f6689t = arrayList;
            RuntimeData.f6690u = hashMap;
        } catch (Throwable e) {
            Log.e("Utility", e.getMessage(), e);
            e.printStackTrace();
        }
    }

    public static String m4491d(int i) {
        if (i == 0) {
            return StringUtils.m4461a(2131165970);
        }
        if (i == 1) {
            return StringUtils.m4461a(2131165971);
        }
        if (i == 2) {
            return StringUtils.m4461a(2131165972);
        }
        if (i == 3) {
            return StringUtils.m4461a(2131165973);
        }
        if (i == 4) {
            return StringUtils.m4461a(2131165974);
        }
        if (i == 5) {
            return StringUtils.m4461a(2131165975);
        }
        if (i == 6) {
            return StringUtils.m4461a(2131165976);
        }
        if (i == 7) {
            return StringUtils.m4461a(2131165977);
        }
        return StringUtils.m4461a(2131165978);
    }

    public static long m4495e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 10;
        }
        if (i == 4) {
            return 20;
        }
        if (i == 5) {
            return 25;
        }
        if (i == 6) {
            return 50;
        }
        if (i == 7) {
            return 100;
        }
        return 200;
    }

    public static void m4477a(TEXAS_CMD texas_cmd, Object obj) {
        if (obj != null) {
            try {
                String str;
                String str2;
                if (obj instanceof UserGameInfoNet) {
                    UserGameInfoNet userGameInfoNet = (UserGameInfoNet) obj;
                    if (userGameInfoNet.getStUserInfo().getUuid() != SharedPreferencesManager.m4308b() && userGameInfoNet.getStUserInfo().getUuid() != 0) {
                        str = "uuid:" + userGameInfoNet.getStUserInfo().getUuid() + " hands:";
                        str2 = str;
                        for (Integer intValue : userGameInfoNet.getVCurrentHandsList()) {
                            str2 = str2 + intValue.intValue() + ",";
                        }
                        new StringBuilder("ccccmd = ").append(texas_cmd).append(" ").append(str2);
                    }
                } else if (obj instanceof GameRoomInfo) {
                    GameRoomInfo gameRoomInfo = (GameRoomInfo) obj;
                    str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                    for (UserGameInfoNet userGameInfoNet2 : gameRoomInfo.getVUserGameInfosList()) {
                        if (userGameInfoNet2.getStUserInfo().getUuid() == SharedPreferencesManager.m4308b() || userGameInfoNet2.getStUserInfo().getUuid() == 0) {
                            str = str2;
                        } else {
                            str2 = str2 + "uuid:" + userGameInfoNet2.getStUserInfo().getUuid() + " \nGAME_ROOM_GAME_STATE:" + gameRoomInfo.getEGameState() + " \nUSER_GAME_STATE:" + userGameInfoNet2.getEGameState() + " \nhands:";
                            for (Integer intValue2 : userGameInfoNet2.getVCurrentHandsList()) {
                                str2 = str2 + intValue2.intValue() + ",";
                            }
                            str = str2 + "\n";
                        }
                        str2 = str;
                    }
                    new StringBuilder("ccccmd = ").append(texas_cmd).append(" ").append(str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void m4510j() {
        if (!StringUtils.m4462a(RuntimeData.f6693x)) {
            NetworkUtil.m4073a();
            NetworkUtil.m4151c(RuntimeData.f6693x);
        } else if (StringUtils.m4462a(XGPushConfig.getToken(BaseApplication.m3548a()))) {
            XGPushManager.registerPush(BaseApplication.m3548a());
        } else {
            RuntimeData.f6693x = XGPushConfig.getToken(BaseApplication.m3548a().getApplicationContext());
            NetworkUtil.m4073a();
            NetworkUtil.m4151c(RuntimeData.f6693x);
        }
    }
}
