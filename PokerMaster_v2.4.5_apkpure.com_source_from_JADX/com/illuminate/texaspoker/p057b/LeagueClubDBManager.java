package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.LeagueClubDao;
import com.illuminate.texaspoker.dao.LeagueClubDao.Properties;
import com.illuminate.texaspoker.dao.LeagueMsgDao;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.q */
public final class LeagueClubDBManager {
    public DaoSession f5597a;
    private a f5598b;

    public LeagueClubDBManager(a aVar, DaoSession daoSession) {
        this.f5598b = aVar;
        this.f5597a = daoSession;
    }

    public final LeagueClub m3670a(long j, long j2) {
        g a = g.a(this.f5597a.f6437L);
        a.a(Properties.f6320b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6321c.a(Long.valueOf(j2)), new i[0]);
        return (LeagueClub) a.a().c();
    }

    public final List<LeagueClub> m3671a(long j) {
        g a = g.a(this.f5597a.f6437L);
        a.a(Properties.f6321c.a(Long.valueOf(j)), new i[0]);
        return a.a().b();
    }

    public final List<LeagueClub> m3672b(long j) {
        g a = g.a(this.f5597a.f6437L);
        a.a(Properties.f6320b.a(Long.valueOf(j)), new i[0]);
        return a.a().b();
    }

    public final void m3673b(long j, long j2) {
        LeagueClubDao leagueClubDao = this.f5597a.f6437L;
        this.f5598b.a();
        try {
            LeagueClub a = m3670a(j, j2);
            if (a != null) {
                leagueClubDao.e(a);
            }
            LeagueMsgDBManager leagueMsgDBManager = DBManager.m3631a().f5582v;
            LeagueMsgDao leagueMsgDao = leagueMsgDBManager.f5601a.f6438M;
            g a2 = g.a(leagueMsgDBManager.f5601a.f6438M);
            a2.a(LeagueMsgDao.Properties.f6340b.a(Long.valueOf(j2)), new i[0]);
            a2.a(LeagueMsgDao.Properties.f6345g.a(Long.valueOf(j)), new i[0]);
            a2.b(new f[]{LeagueMsgDao.Properties.f6341c});
            for (LeagueMsg e : a2.a().b()) {
                leagueMsgDao.e(e);
            }
            this.f5598b.c();
        } catch (Throwable e2) {
            e2.printStackTrace();
            Log.e("LeagueDBManager", e2.getMessage(), e2);
        } finally {
            this.f5598b.b();
        }
    }
}
