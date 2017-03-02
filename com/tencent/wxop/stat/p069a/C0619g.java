package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatGameUser;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.g */
public class C0619g extends C0613e {
    private StatGameUser f1881a;

    public C0619g(Context context, int i, StatGameUser statGameUser, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1881a = null;
        this.f1881a = statGameUser.clone();
    }

    public C0618f m2270a() {
        return C0618f.MTA_GAME_USER;
    }

    public boolean m2271a(JSONObject jSONObject) {
        if (this.f1881a == null) {
            return false;
        }
        C0645q.m2449a(jSONObject, "wod", this.f1881a.getWorldName());
        C0645q.m2449a(jSONObject, "gid", this.f1881a.getAccount());
        C0645q.m2449a(jSONObject, "lev", this.f1881a.getLevel());
        return true;
    }
}
