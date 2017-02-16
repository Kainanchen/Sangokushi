package com.facebook.imagepipeline.p048i;

import com.facebook.common.p014e.FLog;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.i.a */
public final class ForwardingRequestListener implements RequestListener {
    private final List<RequestListener> f2154a;

    public ForwardingRequestListener(Set<RequestListener> set) {
        this.f2154a = new ArrayList(set.size());
        for (RequestListener add : set) {
            this.f2154a.add(add);
        }
    }

    public ForwardingRequestListener(RequestListener... requestListenerArr) {
        this.f2154a = Arrays.asList(requestListenerArr);
    }

    public final void m2053a(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2049a(imageRequest, obj, str, z);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public final void m2057a(String str, String str2) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2043a(str, str2);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void m2060a(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2046a(str, str2, (Map) map);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void m2059a(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2045a(str, str2, th, map);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void m2061b(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2047b(str, str2, map);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public final void m2058a(String str, String str2, String str3) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2044a(str, str2, str3);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void m2055a(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2051a(imageRequest, str, z);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void m2054a(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2050a(imageRequest, str, th, z);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void m2056a(String str) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((RequestListener) this.f2154a.get(i)).m2052a(str);
            } catch (Throwable e) {
                FLog.m1049a("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean m2062b(String str) {
        int size = this.f2154a.size();
        for (int i = 0; i < size; i++) {
            if (((RequestListener) this.f2154a.get(i)).m2048b(str)) {
                return true;
            }
        }
        return false;
    }
}
