package com.amap.p003a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.amap.a.e */
public @interface EntityClass {
    String m686a();

    boolean m687b() default false;
}
