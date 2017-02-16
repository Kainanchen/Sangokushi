package com.facebook.drawee.p029c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.volley.BuildConfig;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import com.facebook.drawee.p026b.DeferredReleaser.DeferredReleaser;
import com.facebook.drawee.p026b.DraweeEventTracker;
import com.facebook.drawee.p026b.RetryManager;
import com.facebook.drawee.p027f.GestureDetector.GestureDetector;
import com.facebook.drawee.p028g.DraweeController;
import com.facebook.drawee.p028g.DraweeHierarchy;
import com.facebook.drawee.p028g.SettableDraweeHierarchy;
import com.facebook.p023d.BaseDataSubscriber;
import com.facebook.p023d.DataSource;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
import net.sqlcipher.database.SQLiteDatabase;

@NotThreadSafe
/* renamed from: com.facebook.drawee.c.a */
public abstract class AbstractDraweeController<T, INFO> implements DeferredReleaser, GestureDetector, DraweeController {
    private static final Class<?> f1214f;
    @Nullable
    RetryManager f1215a;
    @Nullable
    com.facebook.drawee.p027f.GestureDetector f1216b;
    @Nullable
    ControllerViewportVisibilityListener f1217c;
    boolean f1218d;
    @Nullable
    String f1219e;
    private final DraweeEventTracker f1220g;
    private final com.facebook.drawee.p026b.DeferredReleaser f1221h;
    private final Executor f1222i;
    @Nullable
    private ControllerListener<INFO> f1223j;
    @Nullable
    private SettableDraweeHierarchy f1224k;
    @Nullable
    private Drawable f1225l;
    private String f1226m;
    private Object f1227n;
    private boolean f1228o;
    private boolean f1229p;
    private boolean f1230q;
    private boolean f1231r;
    @Nullable
    private DataSource<T> f1232s;
    @Nullable
    private T f1233t;
    @Nullable
    private Drawable f1234u;

    /* renamed from: com.facebook.drawee.c.a.1 */
    class AbstractDraweeController extends BaseDataSubscriber<T> {
        final /* synthetic */ String f1312a;
        final /* synthetic */ boolean f1313b;
        final /* synthetic */ AbstractDraweeController f1314c;

        AbstractDraweeController(AbstractDraweeController abstractDraweeController, String str, boolean z) {
            this.f1314c = abstractDraweeController;
            this.f1312a = str;
            this.f1313b = z;
        }

        public final void m1292d(DataSource<T> dataSource) {
            boolean b = dataSource.m1145b();
            float f = dataSource.m1149f();
            Object d = dataSource.m1147d();
            if (d != null) {
                this.f1314c.m1225a(this.f1312a, dataSource, d, f, b, this.f1313b);
            } else if (b) {
                this.f1314c.m1226a(this.f1312a, (DataSource) dataSource, new NullPointerException(), true);
            }
        }

        public final void m1293e(DataSource<T> dataSource) {
            this.f1314c.m1226a(this.f1312a, (DataSource) dataSource, dataSource.m1148e(), true);
        }

        public final void m1291c(DataSource<T> dataSource) {
            boolean b = dataSource.m1145b();
            AbstractDraweeController.m1222a(this.f1314c, this.f1312a, dataSource, dataSource.m1149f(), b);
        }
    }

    /* renamed from: com.facebook.drawee.c.a.a */
    private static class AbstractDraweeController<INFO> extends ForwardingControllerListener<INFO> {
        AbstractDraweeController() {
        }
    }

    public abstract DataSource<T> m1234a();

    public abstract void m1237a(@Nullable T t);

    @Nullable
    public abstract INFO m1242c(T t);

    public abstract Drawable m1244d(T t);

    static {
        f1214f = AbstractDraweeController.class;
    }

    public AbstractDraweeController(com.facebook.drawee.p026b.DeferredReleaser deferredReleaser, Executor executor, String str, Object obj) {
        this.f1220g = DraweeEventTracker.m1288a();
        this.f1221h = deferredReleaser;
        this.f1222i = executor;
        m1238a(str, obj, true);
    }

    public final void m1238a(String str, Object obj, boolean z) {
        this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_INIT_CONTROLLER);
        if (!(z || this.f1221h == null)) {
            this.f1221h.m1287a((DeferredReleaser) this);
        }
        this.f1228o = false;
        this.f1230q = false;
        m1230h();
        this.f1218d = false;
        if (this.f1215a != null) {
            this.f1215a.m1290a();
        }
        if (this.f1216b != null) {
            this.f1216b.m1425a();
            this.f1216b.f1481a = this;
        }
        if (this.f1223j instanceof AbstractDraweeController) {
            ((AbstractDraweeController) this.f1223j).m1301a();
        } else {
            this.f1223j = null;
        }
        this.f1217c = null;
        if (this.f1224k != null) {
            this.f1224k.m1396b();
            this.f1224k.m1394a(null);
            this.f1224k = null;
        }
        this.f1225l = null;
        if (FLog.m1051a(2)) {
            FLog.m1043a(f1214f, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f1226m, str);
        }
        this.f1226m = str;
        this.f1227n = obj;
    }

    public final void m1243c() {
        this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_RELEASE_CONTROLLER);
        if (this.f1215a != null) {
            this.f1215a.f1311c = 0;
        }
        if (this.f1216b != null) {
            this.f1216b.m1426b();
        }
        if (this.f1224k != null) {
            this.f1224k.m1396b();
        }
        m1230h();
    }

    private void m1230h() {
        boolean z = this.f1229p;
        this.f1229p = false;
        this.f1231r = false;
        if (this.f1232s != null) {
            this.f1232s.m1150g();
            this.f1232s = null;
        }
        if (this.f1219e != null) {
            this.f1219e = null;
        }
        this.f1234u = null;
        if (this.f1233t != null) {
            m1227a(BuildConfig.BUILD_TYPE, this.f1233t);
            m1237a(this.f1233t);
            this.f1233t = null;
        }
        if (z) {
            m1231i().m1294a(this.f1226m);
        }
    }

    public final void m1235a(ControllerListener<? super INFO> controllerListener) {
        Preconditions.m1030a((Object) controllerListener);
        if (this.f1223j instanceof AbstractDraweeController) {
            ((AbstractDraweeController) this.f1223j).m1302a((ControllerListener) controllerListener);
        } else if (this.f1223j != null) {
            ControllerListener controllerListener2 = this.f1223j;
            ControllerListener abstractDraweeController = new AbstractDraweeController();
            abstractDraweeController.m1302a(controllerListener2);
            abstractDraweeController.m1302a((ControllerListener) controllerListener);
            this.f1223j = abstractDraweeController;
        } else {
            this.f1223j = controllerListener;
        }
    }

    private ControllerListener<INFO> m1231i() {
        if (this.f1223j == null) {
            return BaseControllerListener.m1309a();
        }
        return this.f1223j;
    }

    @Nullable
    public final DraweeHierarchy m1245d() {
        return this.f1224k;
    }

    public final void m1236a(@Nullable DraweeHierarchy draweeHierarchy) {
        if (FLog.m1051a(2)) {
            FLog.m1043a(f1214f, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f1226m, draweeHierarchy);
        }
        this.f1220g.m1289a(draweeHierarchy != null ? DraweeEventTracker.DraweeEventTracker.ON_SET_HIERARCHY : DraweeEventTracker.DraweeEventTracker.ON_CLEAR_HIERARCHY);
        if (this.f1229p) {
            this.f1221h.m1287a((DeferredReleaser) this);
            m1243c();
        }
        if (this.f1224k != null) {
            this.f1224k.m1394a(null);
            this.f1224k = null;
        }
        if (draweeHierarchy != null) {
            Preconditions.m1033a(draweeHierarchy instanceof SettableDraweeHierarchy);
            this.f1224k = (SettableDraweeHierarchy) draweeHierarchy;
            this.f1224k.m1394a(this.f1225l);
        }
    }

    public final void m1246e() {
        if (FLog.m1051a(2)) {
            FLog.m1043a(f1214f, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f1226m, this.f1229p ? "request already submitted" : "request needs submit");
        }
        this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_ATTACH_CONTROLLER);
        Preconditions.m1030a(this.f1224k);
        this.f1221h.m1287a((DeferredReleaser) this);
        this.f1228o = true;
        if (!this.f1229p) {
            m1233k();
        }
    }

    public final void m1247f() {
        if (FLog.m1051a(2)) {
            FLog.m1042a(f1214f, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f1226m);
        }
        this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_DETACH_CONTROLLER);
        this.f1228o = false;
        com.facebook.drawee.p026b.DeferredReleaser deferredReleaser = this.f1221h;
        com.facebook.drawee.p026b.DeferredReleaser.m1285b();
        if (deferredReleaser.f1276a.add(this) && deferredReleaser.f1276a.size() == 1) {
            deferredReleaser.f1277b.post(deferredReleaser.f1278c);
        }
    }

    public final boolean m1239a(MotionEvent motionEvent) {
        if (FLog.m1051a(2)) {
            FLog.m1043a(f1214f, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f1226m, motionEvent);
        }
        if (this.f1216b == null) {
            return false;
        }
        if (!this.f1216b.f1483c && !m1232j()) {
            return false;
        }
        com.facebook.drawee.p027f.GestureDetector gestureDetector = this.f1216b;
        switch (motionEvent.getAction()) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                gestureDetector.f1483c = true;
                gestureDetector.f1484d = true;
                gestureDetector.f1485e = motionEvent.getEventTime();
                gestureDetector.f1486f = motionEvent.getX();
                gestureDetector.f1487g = motionEvent.getY();
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                gestureDetector.f1483c = false;
                if (Math.abs(motionEvent.getX() - gestureDetector.f1486f) > gestureDetector.f1482b || Math.abs(motionEvent.getY() - gestureDetector.f1487g) > gestureDetector.f1482b) {
                    gestureDetector.f1484d = false;
                }
                if (gestureDetector.f1484d && motionEvent.getEventTime() - gestureDetector.f1485e <= ((long) ViewConfiguration.getLongPressTimeout()) && gestureDetector.f1481a != null) {
                    gestureDetector.f1481a.m1216g();
                    break;
                }
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                if (Math.abs(motionEvent.getX() - gestureDetector.f1486f) > gestureDetector.f1482b || Math.abs(motionEvent.getY() - gestureDetector.f1487g) > gestureDetector.f1482b) {
                    gestureDetector.f1484d = false;
                    break;
                }
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                gestureDetector.f1483c = false;
                break;
        }
        gestureDetector.f1484d = false;
        return true;
    }

    private boolean m1232j() {
        if (this.f1231r && this.f1215a != null) {
            boolean z;
            RetryManager retryManager = this.f1215a;
            if (!retryManager.f1309a || retryManager.f1311c >= retryManager.f1310b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean m1248g() {
        if (FLog.m1051a(2)) {
            FLog.m1042a(f1214f, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f1226m);
        }
        if (!m1232j()) {
            return false;
        }
        RetryManager retryManager = this.f1215a;
        retryManager.f1311c++;
        this.f1224k.m1396b();
        m1233k();
        return true;
    }

    private void m1233k() {
        Object b = m1241b();
        if (b != null) {
            this.f1232s = null;
            this.f1229p = true;
            this.f1231r = false;
            this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_SUBMIT_CACHE_HIT);
            m1231i().m1295a(this.f1226m, this.f1227n);
            m1225a(this.f1226m, this.f1232s, b, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, true, true);
            return;
        }
        this.f1220g.m1289a(DraweeEventTracker.DraweeEventTracker.ON_DATASOURCE_SUBMIT);
        m1231i().m1295a(this.f1226m, this.f1227n);
        this.f1224k.m1393a(0.0f, true);
        this.f1229p = true;
        this.f1231r = false;
        this.f1232s = m1234a();
        if (FLog.m1051a(2)) {
            FLog.m1043a(f1214f, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f1226m, Integer.valueOf(System.identityHashCode(this.f1232s)));
        }
        this.f1232s.m1144a(new AbstractDraweeController(this, this.f1226m, this.f1232s.m1146c()), this.f1222i);
    }

    private void m1225a(String str, DataSource<T> dataSource, @Nullable T t, float f, boolean z, boolean z2) {
        if (m1229a(str, (DataSource) dataSource)) {
            this.f1220g.m1289a(z ? DraweeEventTracker.DraweeEventTracker.ON_DATASOURCE_RESULT : DraweeEventTracker.DraweeEventTracker.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable d = m1244d(t);
                Object obj = this.f1233t;
                this.f1233t = t;
                this.f1234u = d;
                if (z) {
                    try {
                        Animatable animatable;
                        m1227a("set_final_result @ onNewResult", (Object) t);
                        this.f1232s = null;
                        this.f1224k.m1395a(d, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, z2);
                        ControllerListener i = m1231i();
                        Object c = m1242c(t);
                        if (this.f1234u instanceof Animatable) {
                            animatable = (Animatable) this.f1234u;
                        } else {
                            animatable = null;
                        }
                        i.m1296a(str, c, animatable);
                    } catch (Throwable th) {
                        if (!(obj == null || obj == t)) {
                            m1227a("release_previous_result @ onNewResult", obj);
                            m1237a(obj);
                        }
                    }
                } else {
                    m1227a("set_intermediate_result @ onNewResult", (Object) t);
                    this.f1224k.m1395a(d, f, z2);
                    m1231i().m1298b(str, m1242c(t));
                }
                if (obj != null && obj != t) {
                    m1227a("release_previous_result @ onNewResult", obj);
                    m1237a(obj);
                    return;
                }
                return;
            } catch (Throwable e) {
                m1227a("drawable_failed @ onNewResult", (Object) t);
                m1237a((Object) t);
                m1226a(str, (DataSource) dataSource, e, z);
                return;
            }
        }
        m1227a("ignore_old_datasource @ onNewResult", (Object) t);
        m1237a((Object) t);
        dataSource.m1150g();
    }

    private void m1226a(String str, DataSource<T> dataSource, Throwable th, boolean z) {
        if (m1229a(str, (DataSource) dataSource)) {
            this.f1220g.m1289a(z ? DraweeEventTracker.DraweeEventTracker.ON_DATASOURCE_FAILURE : DraweeEventTracker.DraweeEventTracker.ON_DATASOURCE_FAILURE_INT);
            if (z) {
                m1228a("final_failed @ onFailure", th);
                this.f1232s = null;
                this.f1231r = true;
                if (this.f1218d && this.f1234u != null) {
                    this.f1224k.m1395a(this.f1234u, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, true);
                } else if (m1232j()) {
                    this.f1224k.m1398d();
                } else {
                    this.f1224k.m1397c();
                }
                m1231i().m1299b(this.f1226m, th);
                return;
            }
            m1228a("intermediate_failed @ onFailure", th);
            m1231i().m1297a(this.f1226m, th);
            return;
        }
        m1228a("ignore_old_datasource @ onFailure", th);
        dataSource.m1150g();
    }

    private boolean m1229a(String str, DataSource<T> dataSource) {
        if (dataSource == null && this.f1232s == null) {
            return true;
        }
        if (str.equals(this.f1226m) && dataSource == this.f1232s && this.f1229p) {
            return true;
        }
        return false;
    }

    private void m1227a(String str, T t) {
        if (FLog.m1051a(2)) {
            String simpleName;
            Class cls = f1214f;
            String str2 = "controller %x %s: %s: image: %s %x";
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = this.f1226m;
            objArr[2] = str;
            if (t != null) {
                simpleName = t.getClass().getSimpleName();
            } else {
                simpleName = "<null>";
            }
            objArr[3] = simpleName;
            objArr[4] = Integer.valueOf(m1240b(t));
            FLog.m1046a(cls, str2, objArr);
        }
    }

    private void m1228a(String str, Throwable th) {
        if (FLog.m1051a(2)) {
            FLog.m1044a(f1214f, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f1226m, str, th);
        }
    }

    public int m1240b(@Nullable T t) {
        return System.identityHashCode(t);
    }

    public String toString() {
        return Objects.m1028a(this).m1027a("isAttached", this.f1228o).m1027a("isRequestSubmitted", this.f1229p).m1027a("hasFetchFailed", this.f1231r).m1026a("fetchedImage", String.valueOf(m1240b(this.f1233t))).m1026a("events", this.f1220g.toString()).toString();
    }

    public T m1241b() {
        return null;
    }

    static /* synthetic */ void m1222a(AbstractDraweeController abstractDraweeController, String str, DataSource dataSource, float f, boolean z) {
        if (!abstractDraweeController.m1229a(str, dataSource)) {
            abstractDraweeController.m1228a("ignore_old_datasource @ onProgress", null);
            dataSource.m1150g();
        } else if (!z) {
            abstractDraweeController.f1224k.m1393a(f, false);
        }
    }
}
