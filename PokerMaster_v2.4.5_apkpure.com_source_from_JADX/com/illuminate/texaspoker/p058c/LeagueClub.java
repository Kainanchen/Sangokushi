package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.LeagueClubDao;

/* renamed from: com.illuminate.texaspoker.c.p */
public class LeagueClub {
    public Long f5913a;
    public Long f5914b;
    public Long f5915c;
    public String f5916d;
    public String f5917e;
    public Integer f5918f;
    public Integer f5919g;
    public Long f5920h;
    public String f5921i;
    public League f5922j;
    public transient DaoSession f5923k;
    public transient LeagueClubDao f5924l;
    public transient Long f5925m;

    static {
        fixHelper.fixfunc(new int[]{1259, 1260, 1261});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native LeagueClub(Long l, Long l2, Long l3, String str, String str2, Integer num, Integer num2, Long l4, String str3);

    public final native League m3738a();
}
