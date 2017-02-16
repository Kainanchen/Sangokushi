package com.facebook.common.p011d;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.d.g */
public final class Objects {

    /* renamed from: com.facebook.common.d.g.a */
    public static final class Objects {
        private final String f1112a;
        private Objects f1113b;
        private Objects f1114c;
        private boolean f1115d;

        /* renamed from: com.facebook.common.d.g.a.a */
        private static final class Objects {
            String f1109a;
            Object f1110b;
            Objects f1111c;

            private Objects() {
            }
        }

        private Objects(String str) {
            this.f1113b = new Objects();
            this.f1114c = this.f1113b;
            this.f1115d = false;
            this.f1112a = (String) Preconditions.m1030a((Object) str);
        }

        public final Objects m1027a(String str, boolean z) {
            return m1026a(str, String.valueOf(z));
        }

        public final String toString() {
            boolean z = this.f1115d;
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            StringBuilder append = new StringBuilder(32).append(this.f1112a).append('{');
            String str2 = str;
            Objects objects = this.f1113b.f1111c;
            while (objects != null) {
                if (!z || objects.f1110b != null) {
                    append.append(str2);
                    str2 = ", ";
                    if (objects.f1109a != null) {
                        append.append(objects.f1109a).append('=');
                    }
                    append.append(objects.f1110b);
                }
                objects = objects.f1111c;
            }
            return append.append('}').toString();
        }

        public final Objects m1026a(String str, @Nullable Object obj) {
            Objects objects = new Objects();
            this.f1114c.f1111c = objects;
            this.f1114c = objects;
            objects.f1110b = obj;
            objects.f1109a = (String) Preconditions.m1030a((Object) str);
            return this;
        }
    }

    @CheckReturnValue
    public static boolean m1029a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Objects m1028a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new Objects((byte) 0);
    }
}
