package com.alipay.p000a.p001a;

import com.alipay.p000a.p002b.C0047a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.C0751b;

/* renamed from: com.alipay.a.a.h */
public final class C0044h implements C0035i, C0036j {
    private static Map<Object, Object> m25a(Type type) {
        Class cls = type;
        while (cls != Properties.class) {
            if (cls == Hashtable.class) {
                return new Hashtable();
            }
            if (cls == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (cls == SortedMap.class || cls == TreeMap.class) {
                return new TreeMap();
            }
            if (cls == ConcurrentMap.class || cls == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (cls == Map.class || cls == HashMap.class) {
                return new HashMap();
            }
            if (cls == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (cls instanceof ParameterizedType) {
                cls = ((ParameterizedType) cls).getRawType();
            } else {
                Class cls2 = cls;
                if (cls2.isInterface()) {
                    throw new IllegalArgumentException("unsupport type " + cls);
                }
                try {
                    return (Map) cls2.newInstance();
                } catch (Throwable e) {
                    throw new IllegalArgumentException("unsupport type " + cls, e);
                }
            }
        }
        return new Properties();
    }

    public final Object m26a(Object obj) {
        Map treeMap = new TreeMap();
        for (Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() instanceof String) {
                treeMap.put((String) entry.getKey(), C0042f.m21b(entry.getValue()));
            } else {
                throw new IllegalArgumentException("Map key must be String!");
            }
        }
        return treeMap;
    }

    public final Object m27a(Object obj, Type type) {
        if (!obj.getClass().equals(C0751b.class)) {
            return null;
        }
        C0751b c0751b = (C0751b) obj;
        Map a = C0044h.m25a(type);
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = parameterizedType.getActualTypeArguments()[0];
            Type type2 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == cls) {
                Iterator a2 = c0751b.m2653a();
                while (a2.hasNext()) {
                    String str = (String) a2.next();
                    if (C0047a.m35a((Class) type2)) {
                        a.put(str, c0751b.m2652a(str));
                    } else {
                        a.put(str, C0041e.m18a(c0751b.m2652a(str), type2));
                    }
                }
                return a;
            }
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        throw new IllegalArgumentException("Deserialize Map must be Generics!");
    }

    public final boolean m28a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
