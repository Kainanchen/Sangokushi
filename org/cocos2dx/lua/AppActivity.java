package org.cocos2dx.lua;

import a.does.not.Exists0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.ali.fixHelper;
import com.google.protobuf.ByteString;
import com.illuminate.texaspoker.activity.SplashActivity;
import com.illuminate.texaspoker.activity.WebActivity;
import com.illuminate.texaspoker.b.k;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.transaction.ProtocolTransaction;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.illuminate.texaspoker.utils.VoiceFileUtility.4;
import com.illuminate.texaspoker.utils.g;
import com.illuminate.texaspoker.utils.i;
import com.illuminate.texaspoker.utils.m;
import com.illuminate.texaspoker.view.b;
import com.illuminate.texaspoker.view.d;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttp.SCShareFavoriteRsp;
import com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfoByRoomIDRsp;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.cocos2dx.lib.Cocos2dxActivity;

public class AppActivity extends Cocos2dxActivity {
    static String f624a;
    public static long f625c;
    public static b f626d;
    public static boolean f627e;
    public static String f628f;
    public static int f629g;
    public static int f630h;
    public static int f631i;
    public static int f632j;
    public static int f633k;
    public static int f634l;
    public static SCGetBillInfoByRoomIDRsp f635m;
    RelativeLayout f636b;
    private C0547a f637n;
    private ProtocolTransaction f638o;
    private int f639p;
    private int f640q;
    private ScheduledExecutorService f641r;

    /* renamed from: org.cocos2dx.lua.AppActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ String f486a;
        final /* synthetic */ String f487b;
        final /* synthetic */ String f488c;
        final /* synthetic */ int f489d;
        final /* synthetic */ int f490e;
        final /* synthetic */ int f491f;
        final /* synthetic */ int f492g;
        final /* synthetic */ AppActivity f493h;

        static {
            fixHelper.fixfunc(new int[]{31250, 31251});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass10(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ String f494a;
        final /* synthetic */ String f495b;
        final /* synthetic */ String f496c;
        final /* synthetic */ int f497d;
        final /* synthetic */ int f498e;
        final /* synthetic */ int f499f;
        final /* synthetic */ int f500g;
        final /* synthetic */ AppActivity f501h;

        static {
            fixHelper.fixfunc(new int[]{31103, 31104});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass11(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.12 */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ String f503a;
        final /* synthetic */ AppActivity f504b;

        /* renamed from: org.cocos2dx.lua.AppActivity.12.1 */
        class C05261 implements Runnable {
            final /* synthetic */ AnonymousClass12 f502a;

            static {
                fixHelper.fixfunc(new int[]{7589, 7590});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05261(AnonymousClass12 anonymousClass12);

            public final native void run();
        }

        static {
            fixHelper.fixfunc(new int[]{24225, 24226});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass12(AppActivity appActivity, String str);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.13 */
    class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ String f505a;
        final /* synthetic */ AppActivity f506b;

        static {
            fixHelper.fixfunc(new int[]{24520, 24521});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass13(AppActivity appActivity, String str);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.14 */
    class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ d f507a;
        final /* synthetic */ AppActivity f508b;

        static {
            fixHelper.fixfunc(new int[]{23895, 23896});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass14(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.15 */
    class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ d f509a;
        final /* synthetic */ AppActivity f510b;

        static {
            fixHelper.fixfunc(new int[]{24026, 24027});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass15(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.16 */
    class AnonymousClass16 implements OnClickListener {
        final /* synthetic */ d f511a;
        final /* synthetic */ AppActivity f512b;

        static {
            fixHelper.fixfunc(new int[]{24192, 24193});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass16(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.17 */
    class AnonymousClass17 implements OnClickListener {
        final /* synthetic */ d f513a;
        final /* synthetic */ AppActivity f514b;

        static {
            fixHelper.fixfunc(new int[]{25019, 25020});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass17(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.18 */
    class AnonymousClass18 implements OnClickListener {
        final /* synthetic */ d f515a;
        final /* synthetic */ AppActivity f516b;

        static {
            fixHelper.fixfunc(new int[]{25101, 25102});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass18(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.19 */
    class AnonymousClass19 implements OnClickListener {
        final /* synthetic */ d f517a;
        final /* synthetic */ AppActivity f518b;

        static {
            fixHelper.fixfunc(new int[]{24777, 24778});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass19(AppActivity appActivity, d dVar);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.1 */
    class C05271 implements DialogInterface.OnClickListener {
        final /* synthetic */ AppActivity f519a;

        static {
            fixHelper.fixfunc(new int[]{12913, 12914});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05271(AppActivity appActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.23 */
    class AnonymousClass23 implements Runnable {
        final /* synthetic */ String f524a;
        final /* synthetic */ byte[] f525b;
        final /* synthetic */ AppActivity f526c;

        /* renamed from: org.cocos2dx.lua.AppActivity.23.1 */
        class C05281 implements Runnable {
            final /* synthetic */ AnonymousClass23 f523a;

            static {
                fixHelper.fixfunc(new int[]{17536, 17537});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05281(AnonymousClass23 anonymousClass23);

            public final native void run();
        }

        static {
            fixHelper.fixfunc(new int[]{23118, 23119});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass23(AppActivity appActivity, String str, byte[] bArr);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.25 */
    class AnonymousClass25 implements Runnable {
        final /* synthetic */ UserBaseInfoNet f528a;
        final /* synthetic */ long f529b;
        final /* synthetic */ AppActivity f530c;

        static {
            fixHelper.fixfunc(new int[]{17534, 17535});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass25(AppActivity appActivity, UserBaseInfoNet userBaseInfoNet, long j);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.26 */
    class AnonymousClass26 implements Runnable {
        final /* synthetic */ long f531a;
        final /* synthetic */ AppActivity f532b;

        static {
            fixHelper.fixfunc(new int[]{17349, 17350});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass26(AppActivity appActivity, long j);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.2 */
    class C05302 implements OnClickListener {
        final /* synthetic */ String f537a;
        final /* synthetic */ String f538b;
        final /* synthetic */ String f539c;
        final /* synthetic */ int f540d;
        final /* synthetic */ int f541e;
        final /* synthetic */ AppActivity f542f;

        static {
            fixHelper.fixfunc(new int[]{12167, 12168});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05302(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.31 */
    class AnonymousClass31 implements OnClickListener {
        final /* synthetic */ String f544a;
        final /* synthetic */ String f545b;
        final /* synthetic */ String f546c;
        final /* synthetic */ int f547d;
        final /* synthetic */ int f548e;
        final /* synthetic */ AppActivity f549f;

        static {
            fixHelper.fixfunc(new int[]{15319, 15320});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass31(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.32 */
    class AnonymousClass32 implements OnClickListener {
        final /* synthetic */ String f550a;
        final /* synthetic */ String f551b;
        final /* synthetic */ String f552c;
        final /* synthetic */ int f553d;
        final /* synthetic */ int f554e;
        final /* synthetic */ AppActivity f555f;

        static {
            fixHelper.fixfunc(new int[]{13993, 13994});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass32(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.3 */
    class C05313 implements OnClickListener {
        final /* synthetic */ String f556a;
        final /* synthetic */ String f557b;
        final /* synthetic */ String f558c;
        final /* synthetic */ int f559d;
        final /* synthetic */ int f560e;
        final /* synthetic */ AppActivity f561f;

        static {
            fixHelper.fixfunc(new int[]{12395, 12396});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05313(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.4 */
    class C05324 implements OnClickListener {
        final /* synthetic */ String f562a;
        final /* synthetic */ String f563b;
        final /* synthetic */ String f564c;
        final /* synthetic */ int f565d;
        final /* synthetic */ int f566e;
        final /* synthetic */ AppActivity f567f;

        static {
            fixHelper.fixfunc(new int[]{12391, 12392});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05324(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.5 */
    class C05335 implements OnClickListener {
        final /* synthetic */ String f568a;
        final /* synthetic */ String f569b;
        final /* synthetic */ String f570c;
        final /* synthetic */ int f571d;
        final /* synthetic */ int f572e;
        final /* synthetic */ AppActivity f573f;

        static {
            fixHelper.fixfunc(new int[]{11791, 11792});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05335(AppActivity appActivity, String str, String str2, String str3, int i, int i2);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.6 */
    class C05346 implements OnClickListener {
        final /* synthetic */ String f574a;
        final /* synthetic */ String f575b;
        final /* synthetic */ String f576c;
        final /* synthetic */ int f577d;
        final /* synthetic */ int f578e;
        final /* synthetic */ int f579f;
        final /* synthetic */ int f580g;
        final /* synthetic */ AppActivity f581h;

        static {
            fixHelper.fixfunc(new int[]{11917, 11918});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05346(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.7 */
    class C05357 implements OnClickListener {
        final /* synthetic */ String f582a;
        final /* synthetic */ String f583b;
        final /* synthetic */ String f584c;
        final /* synthetic */ int f585d;
        final /* synthetic */ int f586e;
        final /* synthetic */ int f587f;
        final /* synthetic */ int f588g;
        final /* synthetic */ AppActivity f589h;

        static {
            fixHelper.fixfunc(new int[]{25620, 25621});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05357(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.8 */
    class C05368 implements OnClickListener {
        final /* synthetic */ String f590a;
        final /* synthetic */ String f591b;
        final /* synthetic */ String f592c;
        final /* synthetic */ int f593d;
        final /* synthetic */ int f594e;
        final /* synthetic */ int f595f;
        final /* synthetic */ int f596g;
        final /* synthetic */ AppActivity f597h;

        static {
            fixHelper.fixfunc(new int[]{25219, 25220});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05368(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.9 */
    class C05379 implements OnClickListener {
        final /* synthetic */ String f598a;
        final /* synthetic */ String f599b;
        final /* synthetic */ String f600c;
        final /* synthetic */ int f601d;
        final /* synthetic */ int f602e;
        final /* synthetic */ int f603f;
        final /* synthetic */ int f604g;
        final /* synthetic */ AppActivity f605h;

        static {
            fixHelper.fixfunc(new int[]{26027, 26028});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05379(AppActivity appActivity, String str, String str2, String str3, int i, int i2, int i3, int i4);

        public final native void onClick(View view);
    }

    /* renamed from: org.cocos2dx.lua.AppActivity.a */
    private class C0547a extends BroadcastReceiver {
        final /* synthetic */ AppActivity f623a;

        /* renamed from: org.cocos2dx.lua.AppActivity.a.11 */
        class AnonymousClass11 implements Runnable {
            final /* synthetic */ long f607a;
            final /* synthetic */ C0547a f608b;

            static {
                fixHelper.fixfunc(new int[]{7404, 7405});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native AnonymousClass11(C0547a c0547a, long j);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.1 */
        class C05381 implements Runnable {
            final /* synthetic */ C0547a f609a;

            static {
                fixHelper.fixfunc(new int[]{9023, 9024});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05381(C0547a c0547a);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.2 */
        class C05392 implements DialogInterface.OnClickListener {
            final /* synthetic */ C0547a f610a;

            static {
                fixHelper.fixfunc(new int[]{8886, 8887});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05392(C0547a c0547a);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.3 */
        class C05403 implements Runnable {
            final /* synthetic */ int f611a;
            final /* synthetic */ C0547a f612b;

            static {
                fixHelper.fixfunc(new int[]{9411, 9412});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05403(C0547a c0547a, int i);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.4 */
        class C05414 implements Runnable {
            final /* synthetic */ C0547a f613a;

            static {
                fixHelper.fixfunc(new int[]{9264, 9265});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05414(C0547a c0547a);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.5 */
        class C05425 implements Runnable {
            final /* synthetic */ byte[] f614a;
            final /* synthetic */ C0547a f615b;

            static {
                fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCAdminAddClubFundRsp_VALUE, 10136});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05425(C0547a c0547a, byte[] bArr);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.6 */
        class C05436 implements Runnable {
            final /* synthetic */ int f616a;
            final /* synthetic */ C0547a f617b;

            static {
                fixHelper.fixfunc(new int[]{9774, 9775});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05436(C0547a c0547a, int i);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.7 */
        class C05447 implements Runnable {
            final /* synthetic */ long f618a;
            final /* synthetic */ C0547a f619b;

            static {
                fixHelper.fixfunc(new int[]{9608, 9609});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05447(C0547a c0547a, long j);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.8 */
        class C05458 implements Runnable {
            final /* synthetic */ C0547a f620a;

            static {
                fixHelper.fixfunc(new int[]{10333, 10334});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05458(C0547a c0547a);

            public final native void run();
        }

        /* renamed from: org.cocos2dx.lua.AppActivity.a.9 */
        class C05469 implements Runnable {
            final /* synthetic */ long f621a;
            final /* synthetic */ C0547a f622b;

            static {
                fixHelper.fixfunc(new int[]{10228, 10229});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05469(C0547a c0547a, long j);

            public final native void run();
        }

        static {
            fixHelper.fixfunc(new int[]{31582, 31583, 31584});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native C0547a(AppActivity appActivity);

        native /* synthetic */ C0547a(AppActivity appActivity, byte b);

        public final native void onReceive(Context context, Intent intent);
    }

    static {
        fixHelper.fixfunc(new int[]{15482, 15483, 15484, 15485, 15486, 15487, 15488, 15489, 15490, 15491, 15492});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native void m535a();

    private native void m536a(int i, int i2);

    private native boolean m543b();

    private static native boolean nativeIsDebug();

    private static native boolean nativeIsLandScape();

    protected native void onCreate(Bundle bundle);

    protected native void onDestroy();

    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    protected native void onResume();

    protected native void onStart();

    protected native void onStop();

    public native void onWindowFocusChanged(boolean z);

    static /* synthetic */ void m546e(AppActivity appActivity) {
        if (ContextCompat.checkSelfPermission(appActivity, "android.permission.RECORD_AUDIO") != 0) {
            ActivityCompat.requestPermissions(appActivity, new String[]{"android.permission.RECORD_AUDIO"}, 1);
            return;
        }
        VoiceFileUtility a = VoiceFileUtility.a();
        long currentTimeMillis = System.currentTimeMillis();
        a.l = false;
        a.m = false;
        try {
            if (a.h != null) {
                a.h.pause();
            } else if (a.g != null) {
                a.g.pause();
            }
            File file = new File(VoiceFileUtility.b);
            if (!file.exists()) {
                file.mkdirs();
            }
            a.j = 0.0d;
            a.i = new File(VoiceFileUtility.c);
            a.i.delete();
            if (a.d != null) {
                a.d.stop();
                a.d.reset();
                a.d.release();
                a.d = null;
            }
            a.d = new MediaRecorder();
            a.d.setAudioSource(1);
            a.d.setOutputFormat(3);
            a.d.setAudioEncoder(1);
            a.d.setAudioChannels(1);
            a.d.setAudioSamplingRate(8000);
            a.d.setOutputFile(VoiceFileUtility.c);
            a.d.prepare();
            a.d.start();
            if (System.currentTimeMillis() - currentTimeMillis <= 10000) {
                a.l = true;
                if (!a.m) {
                    4 4 = new 4(a);
                    a.k = new Timer();
                    a.k.schedule(4, 0, 100);
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("VoiceFileUtility", e.getMessage(), e);
        }
    }

    static void __clinit__() {
        f624a = "0.0.0.0";
        f627e = false;
        f628f = null;
        f629g = 0;
        f630h = 1;
        f631i = 2;
        f632j = 3;
        f633k = 0;
        f634l = 1;
    }

    static /* synthetic */ void m544c(AppActivity appActivity) {
        ForegroundService.a = false;
        String ac = i.ac();
        i.a();
        i.k(ac);
        i.h();
        k.a().c();
        Intent intent = new Intent(appActivity, SplashActivity.class);
        intent.setFlags(NTLMConstants.FLAG_UNIDENTIFIED_9);
        intent.setFlags(NTLMConstants.FLAG_NEGOTIATE_ALWAYS_SIGN);
        intent.setFlags(NTLMConstants.FLAG_UNIDENTIFIED_11);
        appActivity.startActivity(intent);
        appActivity.overridePendingTransition(0, 0);
    }

    static /* synthetic */ void m537a(List list) {
        for (PushMsg pushMsg : (List) list.get(0)) {
            if (pushMsg.getLGameRoomID() == f625c && pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE && g.a) {
                VoiceFileUtility a = VoiceFileUtility.a();
                ByteString vVoiceDatas = pushMsg.getVVoiceDatas();
                synchronized (VoiceFileUtility.e) {
                    if (vVoiceDatas != null) {
                        if (!vVoiceDatas.isEmpty()) {
                            VoiceFileUtility.e.offer(pushMsg);
                            if (a.g == null && a.h == null) {
                                a.a(pushMsg);
                            }
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ void m540a(AppActivity appActivity, List list) {
        UserBaseInfoNet userBaseInfoNet = (UserBaseInfoNet) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        if (userBaseInfoNet != null && longValue > 0) {
            appActivity.runOnGLThread(new AnonymousClass25(appActivity, userBaseInfoNet, longValue));
        }
    }

    static /* synthetic */ void m542b(AppActivity appActivity, List list) {
        long longValue = ((Long) list.get(0)).longValue();
        if (longValue > 0) {
            appActivity.runOnGLThread(new AnonymousClass26(appActivity, longValue));
        }
    }

    static /* synthetic */ void m547f(AppActivity appActivity) {
        d dVar = new d(appActivity);
        dVar.a = new AnonymousClass14(appActivity, dVar);
        dVar.b = new AnonymousClass15(appActivity, dVar);
        dVar.c = new AnonymousClass16(appActivity, dVar);
        dVar.d = new AnonymousClass17(appActivity, dVar);
        dVar.e = new AnonymousClass18(appActivity, dVar);
        dVar.f = new AnonymousClass19(appActivity, dVar);
        dVar.show();
    }

    static /* synthetic */ void m539a(AppActivity appActivity, SCShareFavoriteRsp sCShareFavoriteRsp) {
        b bVar = new b(appActivity);
        f626d = bVar;
        bVar.m = 4;
        f626d.k = 4;
        f626d.l = 8;
        FavoritePokerHistoryInfo stFavoritePokerHistoryInfo = sCShareFavoriteRsp.getStFavoritePokerHistoryInfo();
        String sPokerHistoryShareUrl = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getSPokerHistoryShareUrl();
        String format = String.format(appActivity.getResources().getString(2131165830), new Object[]{m.g(stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getLMaxPot())});
        String sPokerHistoryName = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getSPokerHistoryName();
        int vHandCards;
        int vHandCards2;
        if (stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCardsCount() == 2) {
            vHandCards = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(0);
            vHandCards2 = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(1);
            f626d.a = new AnonymousClass31(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
            f626d.b = new AnonymousClass32(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
            f626d.c = new C05302(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
            f626d.d = new C05313(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
            f626d.i = new C05324(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
            f626d.j = new C05335(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2);
        } else if (stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCardsCount() == 4) {
            vHandCards = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(0);
            vHandCards2 = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(1);
            int vHandCards3 = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(2);
            int vHandCards4 = stFavoritePokerHistoryInfo.getStPokerHistoryInfo().getVHandCards(3);
            f626d.a = new C05346(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
            f626d.b = new C05357(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
            f626d.c = new C05368(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
            f626d.d = new C05379(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
            f626d.i = new AnonymousClass10(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
            f626d.j = new AnonymousClass11(appActivity, sPokerHistoryShareUrl, format, sPokerHistoryName, vHandCards, vHandCards2, vHandCards3, vHandCards4);
        }
        f626d.e = new AnonymousClass13(appActivity, sPokerHistoryShareUrl);
        f626d.show();
    }

    static /* synthetic */ void m548g(AppActivity appActivity) {
        Intent intent = new Intent(appActivity, WebActivity.class);
        Bundle bundle = new Bundle();
        if (m.a()) {
            bundle.putString("url", "http://upyun.pokermate.net/web/cn/minigameintro_cn.html");
        } else if (m.b()) {
            bundle.putString("url", "http://upyun.pokermate.net/web/tw/minigameintro_tw.html");
        } else {
            bundle.putString("url", "http://upyun.pokermate.net/web/en/minigameintro_en.html");
        }
        bundle.putInt("titleId", 2131165772);
        intent.putExtras(bundle);
        appActivity.startActivity(intent);
    }
}
