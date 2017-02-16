package com.hp.hpl.sparta;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Hashtable;

public class Sparta {
    private static CacheFactory cacheFactory_;
    private static Internment internment_;

    public interface Internment {
        String intern(String str);
    }

    /* renamed from: com.hp.hpl.sparta.Sparta.1 */
    class C03341 implements Internment {
        private final Hashtable strings_;

        static {
            fixHelper.fixfunc(new int[]{2098, 2099});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C03341();

        public native String intern(String str);
    }

    public interface CacheFactory {
        Cache create();
    }

    /* renamed from: com.hp.hpl.sparta.Sparta.2 */
    class C03352 implements CacheFactory {
        static {
            fixHelper.fixfunc(new int[]{2044, 2045});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C03352();

        public native Cache create();
    }

    public interface Cache {
        Object get(Object obj);

        Object put(Object obj, Object obj2);

        int size();
    }

    private static class HashtableCache extends Hashtable implements Cache {
        private HashtableCache() {
        }

        HashtableCache(C03341 c03341) {
            this();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2666, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    static void __clinit__() {
        internment_ = new C03341();
        cacheFactory_ = new C03352();
    }

    public static String intern(String str) {
        return internment_.intern(str);
    }

    static Cache newCache() {
        return cacheFactory_.create();
    }

    public static void setCacheFactory(CacheFactory cacheFactory) {
        cacheFactory_ = cacheFactory;
    }

    public static void setInternment(Internment internment) {
        internment_ = internment;
    }
}
