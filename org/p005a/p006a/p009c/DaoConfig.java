package org.p005a.p006a.p009c;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.p005a.p006a.AbstractDao;
import org.p005a.p006a.DaoException;
import org.p005a.p006a.Property;
import org.p005a.p006a.p007a.Database;
import org.p005a.p006a.p008b.IdentityScope;
import org.p005a.p006a.p008b.IdentityScopeType;

/* renamed from: org.a.a.c.a */
public final class DaoConfig implements Cloneable {
    public final Database f405a;
    public final String f406b;
    public final Property[] f407c;
    public final String[] f408d;
    public final String[] f409e;
    public final String[] f410f;
    public final Property f411g;
    public final boolean f412h;
    public final TableStatements f413i;
    public IdentityScope<?, ?> f414j;

    static {
        fixHelper.fixfunc(new int[]{32328, 32329, 32330, 32331, 32332, 32333});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native DaoConfig(Database database, Class<? extends AbstractDao<?, ?>> cls);

    private native DaoConfig(DaoConfig daoConfig);

    public final native DaoConfig m476a();

    public final native void m477a(IdentityScopeType identityScopeType);

    public final native void m478b();

    public final native /* synthetic */ Object clone();

    private static Property[] m475a(Class<? extends AbstractDao<?, ?>> cls) {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof Property) {
                    arrayList.add((Property) obj);
                }
            }
        }
        Property[] propertyArr = new Property[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Property property = (Property) it.next();
            if (propertyArr[property.f478a] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            propertyArr[property.f478a] = property;
        }
        return propertyArr;
    }
}
