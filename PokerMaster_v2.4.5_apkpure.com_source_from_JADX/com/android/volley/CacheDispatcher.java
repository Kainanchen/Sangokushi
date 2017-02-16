package com.android.volley;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.concurrent.BlockingQueue;

public class CacheDispatcher extends Thread {
    private static final boolean DEBUG = false;
    private final Cache mCache;
    private final BlockingQueue<Request<?>> mCacheQueue;
    private final ResponseDelivery mDelivery;
    private final BlockingQueue<Request<?>> mNetworkQueue;
    private volatile boolean mQuit;

    /* renamed from: com.android.volley.CacheDispatcher.1 */
    class C02591 implements Runnable {
        final /* synthetic */ Request val$request;

        C02591(Request request) {
            this.val$request = request;
        }

        public void run() {
            try {
                CacheDispatcher.this.mNetworkQueue.put(this.val$request);
            } catch (InterruptedException e) {
            }
        }
    }

    static {
        fixHelper.fixfunc(new int[]{3508, 3509, 3510});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native CacheDispatcher(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery);

    public native void quit();

    public native void run();

    static void __clinit__() {
        DEBUG = VolleyLog.DEBUG;
    }
}
