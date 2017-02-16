package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.LeagueMsgDao;

/* renamed from: com.illuminate.texaspoker.c.q */
public class LeagueMsg {
    public Long f5926a;
    public Long f5927b;
    public Long f5928c;
    public Long f5929d;
    public Integer f5930e;
    public Integer f5931f;
    public Long f5932g;
    public Long f5933h;
    public String f5934i;
    public String f5935j;
    public String f5936k;
    public String f5937l;
    public transient DaoSession f5938m;
    public transient LeagueMsgDao f5939n;

    static {
        fixHelper.fixfunc(new int[]{1218, 1219});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native LeagueMsg(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2, Long l5, Long l6, String str, String str2, String str3, String str4);
}
