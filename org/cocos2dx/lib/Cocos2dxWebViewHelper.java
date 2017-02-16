package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.ali.fixHelper;
import com.chukong.cocosplay.client.CocosPlayClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Cocos2dxWebViewHelper {
    private static final String TAG = null;
    private static Cocos2dxActivity sCocos2dxActivity;
    private static Handler sHandler;
    private static FrameLayout sLayout;
    private static int viewTag;
    private static SparseArray<Cocos2dxWebView> webViews;

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.10 */
    static class AnonymousClass10 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{33724, 33725});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass10(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.11 */
    static class AnonymousClass11 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{33794, 33795});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass11(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.12 */
    static class AnonymousClass12 implements Callable<Boolean> {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{31502, 31503, 31504});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass12(int i);

        public final native Boolean call();

        public final native /* bridge */ /* synthetic */ Object m8347call();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.13 */
    static class AnonymousClass13 implements Callable<Boolean> {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{31585, 31586, 31587});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass13(int i);

        public final native Boolean call();

        public final native /* bridge */ /* synthetic */ Object m8348call();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.14 */
    static class AnonymousClass14 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{31254, 31255});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass14(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.15 */
    static class AnonymousClass15 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{31367, 31368});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass15(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.16 */
    static class AnonymousClass16 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$js;

        static {
            fixHelper.fixfunc(new int[]{32283, 32284});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass16(int i, String str);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.17 */
    static class AnonymousClass17 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ boolean val$scalesPageToFit;

        static {
            fixHelper.fixfunc(new int[]{32665, 32666});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass17(int i, boolean z);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.1 */
    static class C05121 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{23122, 23123});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05121(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.2 */
    static class C05132 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{23891, 23892});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05132(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.3 */
    static class C05143 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ boolean val$visible;

        static {
            fixHelper.fixfunc(new int[]{23497, 23498});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05143(int i, boolean z);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.4 */
    static class C05154 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$left;
        final /* synthetic */ int val$maxHeight;
        final /* synthetic */ int val$maxWidth;
        final /* synthetic */ int val$top;

        static {
            fixHelper.fixfunc(new int[]{22359, 22360});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05154(int i, int i2, int i3, int i4, int i5);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.5 */
    static class C05165 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$scheme;

        static {
            fixHelper.fixfunc(new int[]{22136, 22137});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05165(int i, String str);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.6 */
    static class C05176 implements Runnable {
        final /* synthetic */ String val$baseURL;
        final /* synthetic */ String val$data;
        final /* synthetic */ String val$encoding;
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$mimeType;

        static {
            fixHelper.fixfunc(new int[]{22916, 22917});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05176(int i, String str, String str2, String str3, String str4);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.7 */
    static class C05187 implements Runnable {
        final /* synthetic */ String val$baseUrl;
        final /* synthetic */ String val$data;
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{22782, 22783});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05187(int i, String str, String str2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.8 */
    static class C05198 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$url;

        static {
            fixHelper.fixfunc(new int[]{32382, 32383});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05198(int i, String str);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxWebViewHelper.9 */
    static class C05209 implements Runnable {
        final /* synthetic */ String val$filePath;
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{32710, 32711});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05209(int i, String str);

        public final native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{16597, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxWebViewHelper(FrameLayout frameLayout);

    private static native void didFailLoading(int i, String str);

    private static native void didFinishLoading(int i, String str);

    private static native void onJsCallback(int i, String str);

    private static native boolean shouldStartLoading(int i, String str);

    static void __clinit__() {
        TAG = Cocos2dxWebViewHelper.class.getSimpleName();
        viewTag = 0;
    }

    public static boolean _shouldStartLoading(int i, String str) {
        return !shouldStartLoading(i, str);
    }

    public static void _didFinishLoading(int i, String str) {
        didFinishLoading(i, str);
    }

    public static void _didFailLoading(int i, String str) {
        didFailLoading(i, str);
    }

    public static void _onJsCallback(int i, String str) {
        onJsCallback(i, str);
    }

    public static int createWebView() {
        sCocos2dxActivity.runOnUiThread(new C05121(viewTag));
        int i = viewTag;
        viewTag = i + 1;
        return i;
    }

    public static void removeWebView(int i) {
        sCocos2dxActivity.runOnUiThread(new C05132(i));
    }

    public static void setVisible(int i, boolean z) {
        sCocos2dxActivity.runOnUiThread(new C05143(i, z));
    }

    public static void setWebViewRect(int i, int i2, int i3, int i4, int i5) {
        sCocos2dxActivity.runOnUiThread(new C05154(i, i2, i3, i4, i5));
    }

    public static void setJavascriptInterfaceScheme(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new C05165(i, str));
    }

    public static void loadData(int i, String str, String str2, String str3, String str4) {
        sCocos2dxActivity.runOnUiThread(new C05176(i, str4, str, str2, str3));
    }

    public static void loadHTMLString(int i, String str, String str2) {
        sCocos2dxActivity.runOnUiThread(new C05187(i, str2, str));
    }

    public static void loadUrl(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new C05198(i, str));
    }

    public static void loadFile(int i, String str) {
        if (CocosPlayClient.isEnabled() && !CocosPlayClient.isDemo()) {
            CocosPlayClient.updateAssets(str);
        }
        CocosPlayClient.notifyFileLoaded(str);
        sCocos2dxActivity.runOnUiThread(new C05209(i, str));
    }

    public static void stopLoading(int i) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass10(i));
    }

    public static void reload(int i) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass11(i));
    }

    public static <T> T callInMainThread(Callable<T> callable) {
        Object futureTask = new FutureTask(callable);
        sHandler.post(futureTask);
        return futureTask.get();
    }

    public static boolean canGoBack(int i) {
        try {
            return ((Boolean) callInMainThread(new AnonymousClass12(i))).booleanValue();
        } catch (ExecutionException e) {
            return false;
        } catch (InterruptedException e2) {
            return false;
        }
    }

    public static boolean canGoForward(int i) {
        try {
            return ((Boolean) callInMainThread(new AnonymousClass13(i))).booleanValue();
        } catch (ExecutionException e) {
            return false;
        } catch (InterruptedException e2) {
            return false;
        }
    }

    public static void goBack(int i) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass14(i));
    }

    public static void goForward(int i) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass15(i));
    }

    public static void evaluateJS(int i, String str) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass16(i, str));
    }

    public static void setScalesPageToFit(int i, boolean z) {
        sCocos2dxActivity.runOnUiThread(new AnonymousClass17(i, z));
    }
}
