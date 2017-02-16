package com.facebook.p007c.p008a;

import com.facebook.common.p021l.SecureHashUtil;
import com.sina.weibo.sdk.component.GameManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.c.a.d */
public final class CacheKeyUtil {
    public static List<String> m907a(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof MultiCacheKey) {
                List list = ((MultiCacheKey) cacheKey).f990a;
                List<String> arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(CacheKeyUtil.m909c((CacheKey) list.get(i)));
                }
                return arrayList;
            }
            List<String> arrayList2 = new ArrayList(1);
            arrayList2.add(CacheKeyUtil.m909c(cacheKey));
            return arrayList2;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String m908b(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof MultiCacheKey) {
                return CacheKeyUtil.m909c((CacheKey) ((MultiCacheKey) cacheKey).f990a.get(0));
            }
            return CacheKeyUtil.m909c(cacheKey);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static String m909c(CacheKey cacheKey) {
        return SecureHashUtil.m1118a(cacheKey.toString().getBytes(GameManager.DEFAULT_CHARSET));
    }
}
