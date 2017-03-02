package com.unity3d.player;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.NativeActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Size;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import com.alipay.sdk.cons.C0167c;
import com.unity3d.player.C0688a.C0684a;
import com.zkunity.app.ResourceIDs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UnityPlayer extends FrameLayout implements C0684a {
    private static Lock f2193D;
    public static Activity currentActivity;
    private static boolean f2194p;
    private ProgressBar f2195A;
    private Runnable f2196B;
    private Runnable f2197C;
    C0683b f2198a;
    C0719s f2199b;
    private boolean f2200c;
    private boolean f2201d;
    private boolean f2202e;
    private final C0700j f2203f;
    private final C0720t f2204g;
    private boolean f2205h;
    private C0722v f2206i;
    private final ConcurrentLinkedQueue f2207j;
    private BroadcastReceiver f2208k;
    private boolean f2209l;
    private ContextWrapper f2210m;
    private SurfaceView f2211n;
    private WindowManager f2212o;
    private boolean f2213q;
    private boolean f2214r;
    private int f2215s;
    private int f2216t;
    private final C0715r f2217u;
    private String f2218v;
    private NetworkInfo f2219w;
    private Bundle f2220x;
    private List f2221y;
    private C0724w f2222z;

    /* renamed from: com.unity3d.player.UnityPlayer.c */
    private abstract class C0671c implements Runnable {
        final /* synthetic */ UnityPlayer f2134f;

        private C0671c(UnityPlayer unityPlayer) {
            this.f2134f = unityPlayer;
        }

        public abstract void m2485a();

        public final void run() {
            if (!this.f2134f.isFinishing()) {
                m2485a();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.10 */
    class AnonymousClass10 extends C0671c {
        final /* synthetic */ boolean f2135a;
        final /* synthetic */ String f2136b;
        final /* synthetic */ int f2137c;
        final /* synthetic */ UnityPlayer f2138d;

        AnonymousClass10(UnityPlayer unityPlayer, boolean z, String str, int i) {
            this.f2138d = unityPlayer;
            this.f2135a = z;
            this.f2136b = str;
            this.f2137c = i;
            super((byte) 0);
        }

        public final void m2486a() {
            if (this.f2135a) {
                this.f2138d.nativeSetInputCanceled(true);
            } else if (this.f2136b != null) {
                this.f2138d.nativeSetInputString(this.f2136b);
            }
            if (this.f2137c == 1) {
                this.f2138d.nativeSoftInputClosed();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.11 */
    class AnonymousClass11 extends C0671c {
        final /* synthetic */ int f2139a;
        final /* synthetic */ byte[] f2140b;
        final /* synthetic */ Size f2141c;
        final /* synthetic */ C0688a f2142d;
        final /* synthetic */ UnityPlayer f2143e;

        AnonymousClass11(UnityPlayer unityPlayer, int i, byte[] bArr, Size size, C0688a c0688a) {
            this.f2143e = unityPlayer;
            this.f2139a = i;
            this.f2140b = bArr;
            this.f2141c = size;
            this.f2142d = c0688a;
            super((byte) 0);
        }

        public final void m2487a() {
            this.f2143e.nativeVideoFrameCallback(this.f2139a, this.f2140b, this.f2141c.width, this.f2141c.height);
            this.f2142d.m2551a(this.f2140b);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.12 */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ String f2144a;
        final /* synthetic */ int f2145b;
        final /* synthetic */ int f2146c;
        final /* synthetic */ int f2147d;
        final /* synthetic */ boolean f2148e;
        final /* synthetic */ int f2149f;
        final /* synthetic */ int f2150g;
        final /* synthetic */ UnityPlayer f2151h;

        AnonymousClass12(UnityPlayer unityPlayer, String str, int i, int i2, int i3, boolean z, int i4, int i5) {
            this.f2151h = unityPlayer;
            this.f2144a = str;
            this.f2145b = i;
            this.f2146c = i2;
            this.f2147d = i3;
            this.f2148e = z;
            this.f2149f = i4;
            this.f2150g = i5;
        }

        public final void run() {
            if (this.f2151h.f2222z == null) {
                this.f2151h.pause();
                this.f2151h.f2222z = new C0724w(this.f2151h, this.f2151h.f2210m, this.f2144a, this.f2145b, this.f2146c, this.f2147d, this.f2148e, (long) this.f2149f, (long) this.f2150g);
                this.f2151h.addView(this.f2151h.f2222z);
                this.f2151h.f2222z.requestFocus();
                this.f2151h.f2204g.m2626d(this.f2151h.f2211n);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.17 */
    class AnonymousClass17 implements Runnable {
        final /* synthetic */ Semaphore f2157a;
        final /* synthetic */ UnityPlayer f2158b;

        AnonymousClass17(UnityPlayer unityPlayer, Semaphore semaphore) {
            this.f2158b = unityPlayer;
            this.f2157a = semaphore;
        }

        public final void run() {
            this.f2158b.m2519f();
            this.f2157a.release();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.18 */
    class AnonymousClass18 implements Runnable {
        final /* synthetic */ Semaphore f2159a;
        final /* synthetic */ UnityPlayer f2160b;

        AnonymousClass18(UnityPlayer unityPlayer, Semaphore semaphore) {
            this.f2160b = unityPlayer;
            this.f2159a = semaphore;
        }

        public final void run() {
            if (this.f2160b.nativePause()) {
                this.f2160b.f2213q = true;
                this.f2160b.m2519f();
                this.f2159a.release(2);
                return;
            }
            this.f2159a.release();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.1 */
    class C06731 implements OnClickListener {
        final /* synthetic */ UnityPlayer f2162a;

        C06731(UnityPlayer unityPlayer) {
            this.f2162a = unityPlayer;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f2162a.m2508b();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.20 */
    class AnonymousClass20 implements Runnable {
        final /* synthetic */ boolean f2163a;
        final /* synthetic */ UnityPlayer f2164b;

        AnonymousClass20(UnityPlayer unityPlayer, boolean z) {
            this.f2164b = unityPlayer;
            this.f2163a = z;
        }

        public final void run() {
            this.f2164b.nativeFocusChanged(this.f2163a);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.2 */
    class C06742 implements Runnable {
        final /* synthetic */ UnityPlayer f2165a;

        C06742(UnityPlayer unityPlayer) {
            this.f2165a = unityPlayer;
        }

        public final void run() {
            int l = this.f2165a.nativeActivityIndicatorStyle();
            if (l >= 0) {
                if (this.f2165a.f2195A == null) {
                    this.f2165a.f2195A = new ProgressBar(this.f2165a.f2210m, null, new int[]{16842874, 16843401, 16842873, 16843400}[l]);
                    this.f2165a.f2195A.setIndeterminate(true);
                    this.f2165a.f2195A.setLayoutParams(new LayoutParams(-2, -2, 51));
                    this.f2165a.addView(this.f2165a.f2195A);
                }
                this.f2165a.f2195A.setVisibility(0);
                this.f2165a.bringChildToFront(this.f2165a.f2195A);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.3 */
    class C06753 extends BroadcastReceiver {
        final /* synthetic */ UnityPlayer f2166a;

        public void onReceive(Context context, Intent intent) {
            this.f2166a.m2508b();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.4 */
    class C06764 implements Runnable {
        final /* synthetic */ UnityPlayer f2167a;

        C06764(UnityPlayer unityPlayer) {
            this.f2167a = unityPlayer;
        }

        public final void run() {
            if (this.f2167a.f2195A != null) {
                this.f2167a.f2195A.setVisibility(8);
                this.f2167a.removeView(this.f2167a.f2195A);
                this.f2167a.f2195A = null;
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.5 */
    class C06775 implements Runnable {
        final /* synthetic */ boolean f2168a;
        final /* synthetic */ UnityPlayer f2169b;

        C06775(UnityPlayer unityPlayer, boolean z) {
            this.f2169b = unityPlayer;
            this.f2168a = z;
        }

        public final void run() {
            C0714q.f2299i.m2557a(this.f2169b, this.f2168a);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.6 */
    class C06786 implements Runnable {
        final /* synthetic */ UnityPlayer f2170a;
        final /* synthetic */ String f2171b;
        final /* synthetic */ int f2172c;
        final /* synthetic */ boolean f2173d;
        final /* synthetic */ boolean f2174e;
        final /* synthetic */ boolean f2175f;
        final /* synthetic */ boolean f2176g;
        final /* synthetic */ String f2177h;
        final /* synthetic */ UnityPlayer f2178i;

        C06786(UnityPlayer unityPlayer, UnityPlayer unityPlayer2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            this.f2178i = unityPlayer;
            this.f2170a = unityPlayer2;
            this.f2171b = str;
            this.f2172c = i;
            this.f2173d = z;
            this.f2174e = z2;
            this.f2175f = z3;
            this.f2176g = z4;
            this.f2177h = str2;
        }

        public final void run() {
            this.f2178i.f2199b = new C0719s(this.f2178i.f2210m, this.f2170a, this.f2171b, this.f2172c, this.f2173d, this.f2174e, this.f2175f, this.f2177h);
            this.f2178i.f2199b.show();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.7 */
    class C06797 implements Runnable {
        final /* synthetic */ UnityPlayer f2179a;

        C06797(UnityPlayer unityPlayer) {
            this.f2179a = unityPlayer;
        }

        public final void run() {
            if (this.f2179a.f2199b != null) {
                this.f2179a.f2199b.dismiss();
                this.f2179a.f2199b = null;
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.8 */
    class C06808 extends C0671c {
        final /* synthetic */ Runnable f2180a;
        final /* synthetic */ UnityPlayer f2181b;

        C06808(UnityPlayer unityPlayer, Runnable runnable) {
            this.f2181b = unityPlayer;
            this.f2180a = runnable;
            super((byte) 0);
        }

        public final void m2488a() {
            this.f2181b.m2536b(this.f2180a);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.9 */
    class C06819 implements Runnable {
        final /* synthetic */ String f2182a;
        final /* synthetic */ UnityPlayer f2183b;

        C06819(UnityPlayer unityPlayer, String str) {
            this.f2183b = unityPlayer;
            this.f2182a = str;
        }

        public final void run() {
            if (this.f2183b.f2199b != null && this.f2182a != null) {
                this.f2183b.f2199b.m2619a(this.f2182a);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer.a */
    enum C0682a {
        PAUSE,
        RESUME,
        QUIT,
        FOCUS_GAINED,
        FOCUS_LOST
    }

    /* renamed from: com.unity3d.player.UnityPlayer.b */
    private class C0683b extends Thread {
        ArrayBlockingQueue f2190a;
        boolean f2191b;
        final /* synthetic */ UnityPlayer f2192c;

        C0683b(UnityPlayer unityPlayer) {
            this.f2192c = unityPlayer;
            this.f2191b = false;
            this.f2190a = new ArrayBlockingQueue(32);
        }

        private void m2489a(C0682a c0682a) {
            try {
                this.f2190a.put(c0682a);
            } catch (InterruptedException e) {
                interrupt();
            }
        }

        public final void m2490a() {
            m2489a(C0682a.QUIT);
        }

        public final void m2491a(boolean z) {
            m2489a(z ? C0682a.FOCUS_GAINED : C0682a.FOCUS_LOST);
        }

        public final void m2492b() {
            m2489a(C0682a.RESUME);
        }

        public final void m2493c() {
            m2489a(C0682a.PAUSE);
        }

        public final void run() {
            setName("UnityMain");
            while (true) {
                try {
                    C0682a c0682a = (C0682a) this.f2190a.take();
                    if (c0682a != C0682a.QUIT) {
                        if (c0682a == C0682a.RESUME) {
                            this.f2191b = true;
                        } else if (c0682a == C0682a.PAUSE) {
                            this.f2191b = false;
                            this.f2192c.executeGLThreadJobs();
                        } else if (c0682a == C0682a.FOCUS_LOST && !this.f2191b) {
                            this.f2192c.executeGLThreadJobs();
                        }
                        if (this.f2191b) {
                            do {
                                this.f2192c.executeGLThreadJobs();
                                if (this.f2190a.peek() != null) {
                                    break;
                                } else if (!(this.f2192c.isFinishing() || this.f2192c.nativeRender())) {
                                    this.f2192c.m2508b();
                                }
                            } while (!C0683b.interrupted());
                        }
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    static {
        currentActivity = null;
        new C0721u().m2627a();
        f2194p = false;
        f2194p = loadLibraryStatic("main");
        f2193D = new ReentrantLock();
    }

    public UnityPlayer(ContextWrapper contextWrapper) {
        super(contextWrapper);
        this.f2200c = false;
        this.f2201d = false;
        this.f2202e = true;
        this.f2205h = false;
        this.f2206i = new C0722v();
        this.f2207j = new ConcurrentLinkedQueue();
        this.f2208k = null;
        this.f2209l = false;
        this.f2198a = new C0683b(this);
        this.f2214r = true;
        this.f2215s = 0;
        this.f2216t = 0;
        this.f2218v = null;
        this.f2219w = null;
        this.f2220x = new Bundle();
        this.f2221y = new ArrayList();
        this.f2199b = null;
        this.f2195A = null;
        this.f2196B = new C06742(this);
        this.f2197C = new C06764(this);
        if (contextWrapper instanceof Activity) {
            currentActivity = (Activity) contextWrapper;
        }
        this.f2204g = new C0720t(this);
        this.f2210m = contextWrapper;
        this.f2203f = contextWrapper instanceof Activity ? new C0713p(contextWrapper) : null;
        this.f2217u = new C0715r(contextWrapper, this);
        m2497a();
        if (C0714q.f2291a) {
            C0714q.f2299i.m2556a((View) this);
        }
        setFullscreen(true);
        m2499a(this.f2210m.getApplicationInfo());
        if (C0722v.m2630c()) {
            initJni(contextWrapper);
            nativeFile(this.f2210m.getPackageCodePath());
            m2526j();
            this.f2211n = new SurfaceView(contextWrapper);
            this.f2211n.getHolder().setFormat(2);
            this.f2211n.getHolder().addCallback(new Callback() {
                final /* synthetic */ UnityPlayer f2152a;

                {
                    this.f2152a = r1;
                }

                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    this.f2152a.m2498a(0, surfaceHolder.getSurface());
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    this.f2152a.m2498a(0, surfaceHolder.getSurface());
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    this.f2152a.m2498a(0, null);
                }
            });
            this.f2211n.setFocusable(true);
            this.f2211n.setFocusableInTouchMode(true);
            this.f2204g.m2625c(this.f2211n);
            this.f2213q = false;
            m2512c();
            nativeInitWWW(WWW.class);
            nativeInitWebRequest(UnityWebRequest.class);
            if (C0714q.f2295e) {
                C0714q.f2302l.m2568a(this, this.f2210m);
            }
            if (C0714q.f2298h) {
                if (currentActivity != null) {
                    C0714q.f2303m.m2574a(currentActivity, new Runnable() {
                        final /* synthetic */ UnityPlayer f2155a;

                        /* renamed from: com.unity3d.player.UnityPlayer.15.1 */
                        class C06721 implements Runnable {
                            final /* synthetic */ AnonymousClass15 f2154a;

                            C06721(AnonymousClass15 anonymousClass15) {
                                this.f2154a = anonymousClass15;
                            }

                            public final void run() {
                                this.f2154a.f2155a.f2206i.m2634d();
                                this.f2154a.f2155a.m2521g();
                            }
                        }

                        {
                            this.f2155a = r1;
                        }

                        public final void run() {
                            this.f2155a.m2536b(new C06721(this));
                        }
                    });
                } else {
                    this.f2206i.m2634d();
                }
            }
            if (C0714q.f2294d) {
                C0714q.f2301k.m2571a(this);
            }
            this.f2212o = (WindowManager) this.f2210m.getSystemService("window");
            m2528k();
            this.f2198a.start();
            return;
        }
        AlertDialog create = new Builder(this.f2210m).setTitle("Failure to initialize!").setPositiveButton("OK", new C06731(this)).setMessage("Your hardware does not support this application, sorry!").create();
        create.setCancelable(false);
        create.show();
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (C0722v.m2630c()) {
            nativeUnitySendMessage(str, str2, str3);
        } else {
            C0708m.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
        }
    }

    private static String m2496a(String str) {
        byte[] digest;
        int i = 0;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(str);
            long length = new File(str).length();
            fileInputStream.skip(length - Math.min(length, 65558));
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            for (int i2 = 0; i2 != -1; i2 = fileInputStream.read(bArr)) {
                instance.update(bArr, 0, i2);
            }
            digest = instance.digest();
        } catch (FileNotFoundException e) {
            digest = null;
        } catch (IOException e2) {
            digest = null;
        } catch (NoSuchAlgorithmException e3) {
            digest = null;
        }
        if (digest == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i < digest.length) {
            stringBuffer.append(Integer.toString((digest[i] & MotionEventCompat.ACTION_MASK) + AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY, 16).substring(1));
            i++;
        }
        return stringBuffer.toString();
    }

    private void m2497a() {
        try {
            File file = new File(this.f2210m.getPackageCodePath(), "assets/bin/Data/settings.xml");
            InputStream fileInputStream = file.exists() ? new FileInputStream(file) : this.f2210m.getAssets().open("bin/Data/settings.xml");
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(fileInputStream, null);
            String str = null;
            String str2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    str2 = newPullParser.getName();
                    String str3 = str;
                    for (int i = 0; i < newPullParser.getAttributeCount(); i++) {
                        if (newPullParser.getAttributeName(i).equalsIgnoreCase(C0167c.f364e)) {
                            str3 = newPullParser.getAttributeValue(i);
                        }
                    }
                    str = str3;
                } else if (eventType == 3) {
                    str2 = null;
                } else if (eventType == 4 && str != null) {
                    if (str2.equalsIgnoreCase("integer")) {
                        this.f2220x.putInt(str, Integer.parseInt(newPullParser.getText()));
                    } else if (str2.equalsIgnoreCase(ResourceIDs.STRING_ID)) {
                        this.f2220x.putString(str, newPullParser.getText());
                    } else if (str2.equalsIgnoreCase("bool")) {
                        this.f2220x.putBoolean(str, Boolean.parseBoolean(newPullParser.getText()));
                    } else if (str2.equalsIgnoreCase("float")) {
                        this.f2220x.putFloat(str, Float.parseFloat(newPullParser.getText()));
                    }
                    str = null;
                }
            }
        } catch (Exception e) {
            C0708m.Log(6, "Unable to locate player settings. " + e.getLocalizedMessage());
            m2508b();
        }
    }

    private void m2498a(int i, Surface surface) {
        if (!this.f2200c) {
            m2510b(0, surface);
        }
    }

    private static void m2499a(ApplicationInfo applicationInfo) {
        if (f2194p && NativeLoader.load(applicationInfo.nativeLibraryDir)) {
            C0722v.m2628a();
        }
    }

    private void m2500a(C0671c c0671c) {
        if (!isFinishing()) {
            m2513c((Runnable) c0671c);
        }
    }

    static void m2505a(Runnable runnable) {
        new Thread(runnable).start();
    }

    private static String[] m2507a(Context context) {
        String packageName = context.getPackageName();
        Vector vector = new Vector();
        try {
            int i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            if (Environment.getExternalStorageState().equals("mounted")) {
                File file = new File(Environment.getExternalStorageDirectory().toString() + "/Android/obb/" + packageName);
                if (file.exists()) {
                    if (i > 0) {
                        String str = file + File.separator + "main." + i + "." + packageName + ".obb";
                        if (new File(str).isFile()) {
                            vector.add(str);
                        }
                    }
                    if (i > 0) {
                        packageName = file + File.separator + "patch." + i + "." + packageName + ".obb";
                        if (new File(packageName).isFile()) {
                            vector.add(packageName);
                        }
                    }
                }
            }
            String[] strArr = new String[vector.size()];
            vector.toArray(strArr);
            return strArr;
        } catch (NameNotFoundException e) {
            return new String[0];
        }
    }

    private void m2508b() {
        if ((this.f2210m instanceof Activity) && !((Activity) this.f2210m).isFinishing()) {
            ((Activity) this.f2210m).finish();
        }
    }

    private boolean m2510b(int i, Surface surface) {
        if (!C0722v.m2630c()) {
            return false;
        }
        nativeRecreateGfxState(i, surface);
        return true;
    }

    private void m2512c() {
        if (this.f2210m instanceof NativeActivity) {
            boolean a = new C0711o((Activity) this.f2210m).m2594a();
            this.f2209l = a;
            nativeForwardEventsToDalvik(a);
        }
    }

    private void m2513c(Runnable runnable) {
        if (!C0722v.m2630c()) {
            return;
        }
        if (Thread.currentThread() == this.f2198a) {
            runnable.run();
        } else {
            this.f2207j.add(runnable);
        }
    }

    private void m2514d() {
        for (C0688a c : this.f2221y) {
            c.m2553c();
        }
    }

    private void m2516e() {
        for (C0688a c0688a : this.f2221y) {
            try {
                c0688a.m2550a((C0684a) this);
            } catch (Exception e) {
                C0708m.Log(6, "Unable to initialize camera: " + e.getMessage());
                c0688a.m2553c();
            }
        }
    }

    private void m2519f() {
        nativeDone();
    }

    private void m2521g() {
        if (!this.f2206i.m2636f()) {
            return;
        }
        if (this.f2222z != null) {
            this.f2222z.onResume();
            return;
        }
        if (C0714q.f2294d) {
            C0714q.f2301k.m2573c();
        }
        this.f2206i.m2633c(true);
        m2516e();
        this.f2217u.m2611e();
        this.f2218v = null;
        this.f2219w = null;
        if (C0722v.m2630c()) {
            m2526j();
        }
        m2513c(new Runnable() {
            final /* synthetic */ UnityPlayer f2161a;

            {
                this.f2161a = r1;
            }

            public final void run() {
                this.f2161a.nativeResume();
            }
        });
        this.f2198a.m2492b();
    }

    private static void m2522h() {
        if (C0722v.m2630c()) {
            lockNativeAccess();
            if (NativeLoader.unload()) {
                C0722v.m2629b();
                unlockNativeAccess();
                return;
            }
            unlockNativeAccess();
            throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
        }
    }

    private boolean m2524i() {
        return this.f2210m.getPackageManager().hasSystemFeature("android.hardware.camera") || this.f2210m.getPackageManager().hasSystemFeature("android.hardware.camera.front");
    }

    private final native void initJni(Context context);

    private void m2526j() {
        if (this.f2220x.getBoolean("useObb")) {
            for (String str : m2507a(this.f2210m)) {
                String a = m2496a(str);
                if (this.f2220x.getBoolean(a)) {
                    nativeFile(str);
                }
                this.f2220x.remove(a);
            }
        }
    }

    private void m2528k() {
        if (this.f2210m instanceof Activity) {
            ((Activity) this.f2210m).getWindow().setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        }
    }

    protected static boolean loadLibraryStatic(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            C0708m.Log(6, "Unable to find " + str);
            return false;
        } catch (Exception e2) {
            C0708m.Log(6, "Unknown error " + e2);
            return false;
        }
    }

    protected static void lockNativeAccess() {
        f2193D.lock();
    }

    private final native int nativeActivityIndicatorStyle();

    private final native void nativeDone();

    private final native void nativeFile(String str);

    private final native void nativeFocusChanged(boolean z);

    private final native void nativeInitWWW(Class cls);

    private final native void nativeInitWebRequest(Class cls);

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    private final native boolean nativePause();

    private final native void nativeRecreateGfxState(int i, Surface surface);

    private final native boolean nativeRender();

    private final native void nativeResume();

    private final native void nativeSetExtras(Bundle bundle);

    private final native void nativeSetInputCanceled(boolean z);

    private final native void nativeSetInputString(String str);

    private final native void nativeSetTouchDeltaY(float f);

    private final native void nativeSoftInputClosed();

    private static native void nativeUnitySendMessage(String str, String str2, String str3);

    private final native void nativeVideoFrameCallback(int i, byte[] bArr, int i2, int i3);

    protected static void unlockNativeAccess() {
        f2193D.unlock();
    }

    protected boolean Location_IsServiceEnabledByUser() {
        return this.f2217u.m2606a();
    }

    protected void Location_SetDesiredAccuracy(float f) {
        this.f2217u.m2608b(f);
    }

    protected void Location_SetDistanceFilter(float f) {
        this.f2217u.m2605a(f);
    }

    protected void Location_StartUpdatingLocation() {
        this.f2217u.m2607b();
    }

    protected void Location_StopUpdatingLocation() {
        this.f2217u.m2609c();
    }

    final void m2536b(Runnable runnable) {
        if (this.f2210m instanceof Activity) {
            ((Activity) this.f2210m).runOnUiThread(runnable);
        } else {
            C0708m.Log(5, "Not running Unity from an Activity; ignored...");
        }
    }

    protected void closeCamera(int i) {
        for (C0688a c0688a : this.f2221y) {
            if (c0688a.m2549a() == i) {
                c0688a.m2553c();
                this.f2221y.remove(c0688a);
                return;
            }
        }
    }

    public void configurationChanged(Configuration configuration) {
        if (this.f2211n instanceof SurfaceView) {
            this.f2211n.getHolder().setSizeFromLayout();
        }
        if (this.f2222z != null) {
            this.f2222z.updateVideoLayout();
        }
    }

    protected void disableLogger() {
        C0708m.f2281a = true;
    }

    public boolean displayChanged(int i, Surface surface) {
        if (i == 0) {
            this.f2200c = surface != null;
            m2536b(new Runnable() {
                final /* synthetic */ UnityPlayer f2156a;

                {
                    this.f2156a = r1;
                }

                public final void run() {
                    if (this.f2156a.f2200c) {
                        this.f2156a.f2204g.m2626d(this.f2156a.f2211n);
                    } else {
                        this.f2156a.f2204g.m2625c(this.f2156a.f2211n);
                    }
                }
            });
        }
        return m2510b(i, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.f2207j.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }

    protected void forwardMotionEventToDalvik(long j, long j2, int i, int i2, int[] iArr, float[] fArr, int i3, float f, float f2, int i4, int i5, int i6, int i7, int i8, long[] jArr, float[] fArr2) {
        this.f2203f.m2575a(j, j2, i, i2, iArr, fArr, i3, f, f2, i4, i5, i6, i7, i8, jArr, fArr2);
    }

    protected int getCameraOrientation(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        return cameraInfo.orientation;
    }

    protected int getNumCameras() {
        return !m2524i() ? 0 : Camera.getNumberOfCameras();
    }

    public Bundle getSettings() {
        return this.f2220x;
    }

    protected int getSplashMode() {
        return this.f2220x.getInt("splash_mode");
    }

    public View getView() {
        return this;
    }

    protected void hideSoftInput() {
        Runnable c06797 = new C06797(this);
        if (C0714q.f2297g) {
            m2500a(new C06808(this, c06797));
        } else {
            m2536b(c06797);
        }
    }

    protected void hideVideoPlayer() {
        m2536b(new Runnable() {
            final /* synthetic */ UnityPlayer f2153a;

            {
                this.f2153a = r1;
            }

            public final void run() {
                if (this.f2153a.f2222z != null) {
                    this.f2153a.f2204g.m2625c(this.f2153a.f2211n);
                    this.f2153a.removeView(this.f2153a.f2222z);
                    this.f2153a.f2222z = null;
                    this.f2153a.resume();
                }
            }
        });
    }

    public void init(int i, boolean z) {
    }

    protected int[] initCamera(int i, int i2, int i3, int i4) {
        C0688a c0688a = new C0688a(i, i2, i3, i4);
        try {
            c0688a.m2550a((C0684a) this);
            this.f2221y.add(c0688a);
            Size b = c0688a.m2552b();
            return new int[]{b.width, b.height};
        } catch (Exception e) {
            C0708m.Log(6, "Unable to initialize camera: " + e.getMessage());
            c0688a.m2553c();
            return null;
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        return nativeInjectEvent(inputEvent);
    }

    protected boolean installPresentationDisplay(int i) {
        return C0714q.f2295e ? C0714q.f2302l.m2569a(this, this.f2210m, i) : false;
    }

    protected boolean isCameraFrontFacing(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        return cameraInfo.facing == 1;
    }

    protected boolean isFinishing() {
        if (!this.f2213q) {
            boolean z = (this.f2210m instanceof Activity) && ((Activity) this.f2210m).isFinishing();
            this.f2213q = z;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        return loadLibraryStatic(str);
    }

    protected final native void nativeAddVSyncTime(long j);

    final native void nativeForwardEventsToDalvik(boolean z);

    protected native void nativeSetLocation(float f, float f2, float f3, float f4, double d, float f5);

    protected native void nativeSetLocationStatus(int i);

    public void onCameraFrame(C0688a c0688a, byte[] bArr) {
        m2500a(new AnonymousClass11(this, c0688a.m2549a(), bArr, c0688a.m2552b(), c0688a));
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return injectEvent(motionEvent);
    }

    public void pause() {
        if (this.f2222z != null) {
            this.f2222z.onPause();
            return;
        }
        reportSoftInputStr(null, 1, true);
        if (this.f2206i.m2637g()) {
            if (C0722v.m2630c()) {
                Semaphore semaphore = new Semaphore(0);
                if (isFinishing()) {
                    m2513c(new AnonymousClass17(this, semaphore));
                } else {
                    m2513c(new AnonymousClass18(this, semaphore));
                }
                try {
                    if (!semaphore.tryAcquire(4, TimeUnit.SECONDS)) {
                        C0708m.Log(5, "Timeout while trying to pause the Unity Engine.");
                    }
                } catch (InterruptedException e) {
                    C0708m.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
                }
                if (semaphore.drainPermits() > 0) {
                    quit();
                }
            }
            this.f2206i.m2633c(false);
            this.f2206i.m2632b(true);
            m2514d();
            this.f2198a.m2493c();
            this.f2217u.m2610d();
            if (C0714q.f2294d) {
                C0714q.f2301k.m2572b();
            }
        }
    }

    public void quit() {
        this.f2213q = true;
        if (!this.f2206i.m2635e()) {
            pause();
        }
        this.f2198a.m2490a();
        try {
            this.f2198a.join(4000);
        } catch (InterruptedException e) {
            this.f2198a.interrupt();
        }
        if (this.f2208k != null) {
            this.f2210m.unregisterReceiver(this.f2208k);
        }
        this.f2208k = null;
        if (C0722v.m2630c()) {
            removeAllViews();
        }
        if (C0714q.f2295e) {
            C0714q.f2302l.m2567a(this.f2210m);
        }
        if (C0714q.f2294d) {
            C0714q.f2301k.m2570a();
        }
        kill();
        m2522h();
    }

    protected void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        m2500a(new AnonymousClass10(this, z, str, i));
    }

    public void resume() {
        if (C0714q.f2291a) {
            C0714q.f2299i.m2559b(this);
        }
        this.f2206i.m2632b(false);
        m2521g();
    }

    protected void setFullscreen(boolean z) {
        this.f2202e = z;
        if (C0714q.f2291a) {
            m2536b(new C06775(this, z));
        }
    }

    protected void setSoftInputStr(String str) {
        m2536b(new C06819(this, str));
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        m2536b(new C06786(this, this, str, i, z, z2, z3, z4, str2));
    }

    protected void showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        m2536b(new AnonymousClass12(this, str, i, i2, i3, z, i4, i5));
    }

    protected void startActivityIndicator() {
        m2536b(this.f2196B);
    }

    protected void stopActivityIndicator() {
        m2536b(this.f2197C);
    }

    public void windowFocusChanged(boolean z) {
        this.f2206i.m2631a(z);
        if (z && this.f2199b != null) {
            reportSoftInputStr(null, 1, false);
        }
        if (C0714q.f2291a && z) {
            C0714q.f2299i.m2559b(this);
        }
        m2513c(new AnonymousClass20(this, z));
        this.f2198a.m2491a(z);
        m2521g();
    }
}
