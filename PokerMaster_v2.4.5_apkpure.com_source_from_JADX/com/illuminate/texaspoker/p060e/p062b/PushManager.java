package com.illuminate.texaspoker.p060e.p062b;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.sina.weibo.sdk.component.GameManager;
import com.texaspoker.moment.TexasPokerCommon.Package;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.IoServiceListener;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/* renamed from: com.illuminate.texaspoker.e.b.f */
public final class PushManager {
    static PushManager f6497a;
    NioSocketConnector f6498b;
    ConnectFuture f6499c;
    IoSession f6500d;
    int f6501e;
    private ExecutorService f6502f;

    /* renamed from: com.illuminate.texaspoker.e.b.f.1 */
    static class PushManager implements Runnable {
        static {
            fixHelper.fixfunc(new int[]{1953, 1954});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PushManager();

        public final native void run();
    }

    /* renamed from: com.illuminate.texaspoker.e.b.f.2 */
    class PushManager implements IoServiceListener {
        final /* synthetic */ PushManager f6491a;

        static {
            fixHelper.fixfunc(new int[]{1840, 1841, 1842, 1843, 1844});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PushManager(PushManager pushManager);

        public final native void serviceActivated(IoService ioService);

        public final native void serviceDeactivated(IoService ioService);

        public final native void sessionCreated(IoSession ioSession);

        public final native void sessionDestroyed(IoSession ioSession);
    }

    /* renamed from: com.illuminate.texaspoker.e.b.f.3 */
    class PushManager implements PushEventListener {
        final /* synthetic */ PushManager f6492a;

        static {
            fixHelper.fixfunc(new int[]{1816, 1817, 1818, 1819, 1820});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PushManager(PushManager pushManager);

        public final native void m3926a();

        public final native void m3927a(Object obj);

        public final native void m3928b();

        public final native void m3929c();
    }

    /* renamed from: com.illuminate.texaspoker.e.b.f.4 */
    class PushManager implements Runnable {
        final /* synthetic */ ScheduledExecutorService f6493a;
        final /* synthetic */ PushManager f6494b;

        static {
            fixHelper.fixfunc(new int[]{1805, 1806});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PushManager(PushManager pushManager, ScheduledExecutorService scheduledExecutorService);

        public final native void run();
    }

    /* renamed from: com.illuminate.texaspoker.e.b.f.5 */
    class PushManager implements Callable<Boolean> {
        final /* synthetic */ Package f6495a;
        final /* synthetic */ PushManager f6496b;

        static {
            fixHelper.fixfunc(new int[]{1763, 1764});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PushManager(PushManager pushManager, Package packageR);

        public final native /* synthetic */ Object call();
    }

    public PushManager() {
        this.f6502f = Executors.newSingleThreadExecutor();
        this.f6501e = 0;
    }

    public static PushManager m3930a() {
        if (f6497a == null) {
            f6497a = new PushManager();
            Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new PushManager(), 0, 60, TimeUnit.SECONDS);
        }
        return f6497a;
    }

    public final void m3932b() {
        if (this.f6498b == null || this.f6498b.isDisposed()) {
            this.f6498b = new NioSocketConnector();
            this.f6498b.setConnectTimeoutMillis(3000);
            this.f6498b.setHandler(new ClientSessionHandler());
            Charset.forName(GameManager.DEFAULT_CHARSET);
            this.f6498b.getFilterChain().addLast("codec", new ProtocolCodecFilter(new ProtoProtocalCodecFactory()));
            this.f6498b.addListener(new PushManager(this));
            PushManager pushManager = f6497a;
            PushEventListener pushManager2 = new PushManager(this);
            if (pushManager.f6498b != null && pushManager.f6498b.getHandler() != null && (pushManager.f6498b.getHandler() instanceof ClientSessionHandler)) {
                ((ClientSessionHandler) pushManager.f6498b.getHandler()).f6488a = pushManager2;
            }
        }
    }

    public final void m3933c() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new PushManager(this, newSingleThreadScheduledExecutor), 0, 5, TimeUnit.SECONDS);
    }

    public final boolean m3934d() {
        NetworkUtil.m4073a();
        if (!NetworkUtil.m4143b() || this.f6498b == null || this.f6498b == null || !this.f6498b.isActive() || this.f6499c == null || !this.f6499c.isConnected() || this.f6500d == null || !this.f6500d.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean m3931a(Package packageR) {
        if (packageR == null || this.f6500d == null || !this.f6500d.isConnected()) {
            return false;
        }
        new StringBuilder("Message cmd:").append(packageR.getECmd());
        Object futureTask = new FutureTask(new PushManager(this, packageR));
        this.f6502f.submit(futureTask);
        try {
            return ((Boolean) futureTask.get()).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    public final void m3935e() {
        if (this.f6500d != null && this.f6500d.isConnected()) {
            this.f6500d.close(true);
            this.f6500d = null;
        }
        if (this.f6499c != null && this.f6499c.isConnected()) {
            this.f6499c.cancel();
            this.f6499c = null;
        }
    }
}
