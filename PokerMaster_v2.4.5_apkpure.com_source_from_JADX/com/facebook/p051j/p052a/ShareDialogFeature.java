package com.facebook.p051j.p052a;

import com.facebook.p036h.DialogFeature;

/* renamed from: com.facebook.j.a.i */
public enum ShareDialogFeature implements DialogFeature {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private int f2540g;

    private ShareDialogFeature(int i) {
        this.f2540g = i;
    }

    public final String m2471a() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public final int m2472b() {
        return this.f2540g;
    }
}
