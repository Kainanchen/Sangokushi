package org.p005a.p006a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Map;
import org.p005a.p006a.p007a.Database;
import org.p005a.p006a.p009c.DaoConfig;

/* renamed from: org.a.a.b */
public abstract class AbstractDaoMaster {
    public final Database f402a;
    protected final int f403b;
    public final Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> f404c;

    static {
        fixHelper.fixfunc(new int[]{32216, 32217});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native AbstractDaoMaster(Database database);

    public final native void m474a(Class<? extends AbstractDao<?, ?>> cls);
}
