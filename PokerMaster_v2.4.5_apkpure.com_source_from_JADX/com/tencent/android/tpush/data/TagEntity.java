package com.tencent.android.tpush.data;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.Serializable;

/* compiled from: ProGuard */
public class TagEntity implements Serializable {
    private static final long serialVersionUID = 1450594384664278962L;
    public long accessId;
    public int flag;
    public String tag;

    public TagEntity() {
        this.accessId = 0;
        this.tag = LetterIndexBar.SEARCH_ICON_LETTER;
        this.flag = 0;
    }
}
