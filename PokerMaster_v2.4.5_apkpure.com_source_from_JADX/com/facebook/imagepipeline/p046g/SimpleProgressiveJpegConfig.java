package com.facebook.imagepipeline.p046g;

import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.p047h.ImmutableQualityInfo;
import com.facebook.imagepipeline.p047h.QualityInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.g.d */
public final class SimpleProgressiveJpegConfig implements ProgressiveJpegConfig {
    private final SimpleProgressiveJpegConfig f2137a;

    /* renamed from: com.facebook.imagepipeline.g.d.b */
    public interface SimpleProgressiveJpegConfig {
        List<Integer> m2013a();
    }

    /* renamed from: com.facebook.imagepipeline.g.d.a */
    private static class SimpleProgressiveJpegConfig implements SimpleProgressiveJpegConfig {
        private SimpleProgressiveJpegConfig() {
        }

        public final List<Integer> m2014a() {
            return Collections.EMPTY_LIST;
        }
    }

    public SimpleProgressiveJpegConfig() {
        this(new SimpleProgressiveJpegConfig());
    }

    private SimpleProgressiveJpegConfig(SimpleProgressiveJpegConfig simpleProgressiveJpegConfig) {
        this.f2137a = (SimpleProgressiveJpegConfig) Preconditions.m1030a((Object) simpleProgressiveJpegConfig);
    }

    public final int m2015a(int i) {
        List a = this.f2137a.m2013a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (((Integer) a.get(i2)).intValue() > i) {
                return ((Integer) a.get(i2)).intValue();
            }
        }
        return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public final QualityInfo m2016b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return ImmutableQualityInfo.m2039a(i, z, false);
    }
}
