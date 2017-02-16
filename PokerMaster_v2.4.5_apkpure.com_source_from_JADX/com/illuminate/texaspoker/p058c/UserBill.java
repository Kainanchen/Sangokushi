package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.UserBillDao;

/* renamed from: com.illuminate.texaspoker.c.v */
public class UserBill {
    public Long f6004a;
    public Long f6005b;
    public Long f6006c;
    public Long f6007d;
    public Long f6008e;
    public Long f6009f;
    public Long f6010g;
    public Long f6011h;
    public Long f6012i;
    public Boolean f6013j;
    public Long f6014k;
    public String f6015l;
    public transient DaoSession f6016m;
    public transient UserBillDao f6017n;

    static {
        fixHelper.fixfunc(new int[]{912, 913});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native UserBill(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Boolean bool, Long l10, String str);
}
