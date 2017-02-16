package com.tencent.android.tpush.data;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.Serializable;

/* compiled from: ProGuard */
public class CachedMessageIntent implements Serializable {
    private static final long serialVersionUID = 1724218633838690967L;
    public String intent;
    public long msgId;
    public String pkgName;

    public CachedMessageIntent() {
        this.pkgName = LetterIndexBar.SEARCH_ICON_LETTER;
        this.intent = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CachedMessageIntent) {
            return ((CachedMessageIntent) obj).pkgName.equals(this.pkgName) && ((CachedMessageIntent) obj).intent.equals(this.intent);
        } else {
            return super.equals(obj);
        }
    }

    public int hashCode() {
        return super.hashCode();
    }
}
