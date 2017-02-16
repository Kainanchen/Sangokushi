package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.LeagueClubDao;
import com.illuminate.texaspoker.dao.LeagueDao;
import com.illuminate.texaspoker.dao.LeagueDao.Properties;
import com.illuminate.texaspoker.p058c.League;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerHttpLeague.LeagueInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.r */
public final class LeagueDBManager {
    public a f5599a;
    public DaoSession f5600b;

    public LeagueDBManager(a aVar, DaoSession daoSession) {
        this.f5599a = aVar;
        this.f5600b = daoSession;
    }

    public final League m3675a(long j) {
        g a = g.a(this.f5600b.f6436K);
        a.a(Properties.f6330b.a(Long.valueOf(j)), new i[0]);
        return (League) a.a().c();
    }

    private void m3674b(LeagueInfo leagueInfo) {
        League league;
        LeagueDao leagueDao = this.f5600b.f6436K;
        long lLeagueID = leagueInfo.getStLeagueBaseInfo().getLLeagueID();
        League a = m3675a(lLeagueID);
        if (a == null) {
            league = new League();
        } else {
            league = a;
        }
        league.f5904b = Long.valueOf(lLeagueID);
        league.f5905c = Long.valueOf(leagueInfo.getStLeagueBaseInfo().getStLeagueCreator());
        league.f5906d = leagueInfo.getStLeagueBaseInfo().getSLeagueName();
        if (leagueInfo.getStLeagueBaseInfo().getBLeagueMute() == 1) {
            league.f5907e = Boolean.valueOf(true);
        } else {
            league.f5907e = Boolean.valueOf(false);
        }
        league.f5908f = Integer.valueOf(leagueInfo.getStLeagueBaseInfo().getIMaxMembers());
        league.f5909g = Long.valueOf(leagueInfo.getStLeagueBaseInfo().getLCreateTime());
        leagueDao.d(league);
        int i = 0;
        int i2 = 0;
        for (ClubBaseInfo clubBaseInfo : leagueInfo.getVClubBaseInfosList()) {
            i += clubBaseInfo.getICurMembers();
            i2 += clubBaseInfo.getIMaxMembers();
            LeagueClubDBManager leagueClubDBManager = DBManager.m3631a().f5581u;
            LeagueClubDao leagueClubDao = leagueClubDBManager.f5597a.f6437L;
            LeagueClub a2 = leagueClubDBManager.m3670a(lLeagueID, clubBaseInfo.getLClubID());
            if (a2 == null) {
                a2 = new LeagueClub();
            }
            a2.f5914b = Long.valueOf(lLeagueID);
            a2.f5915c = Long.valueOf(clubBaseInfo.getLClubID());
            a2.f5916d = clubBaseInfo.getSClubName();
            a2.f5917e = clubBaseInfo.getStCreateUserBaseInfo().getStrNick();
            a2.f5918f = Integer.valueOf(clubBaseInfo.getICurMembers());
            a2.f5919g = Integer.valueOf(clubBaseInfo.getIMaxMembers());
            a2.f5921i = clubBaseInfo.getSSmallIcon();
            synchronized (a2) {
                Long l;
                a2.f5922j = league;
                if (league == null) {
                    l = null;
                } else {
                    l = league.f5903a;
                }
                a2.f5920h = l;
                a2.f5925m = a2.f5920h;
            }
            leagueClubDao.d(a2);
            if (leagueInfo.getStLeagueBaseInfo().getStLeagueCreator() == clubBaseInfo.getLClubID()) {
                league.f5912j = clubBaseInfo.getStCreateUserBaseInfo().getStrNick();
            }
        }
        league.f5910h = Integer.valueOf(i);
        league.f5911i = Integer.valueOf(i2);
        LeagueClubDao leagueClubDao2 = this.f5600b.f6437L;
        for (LeagueClub leagueClub : DBManager.m3631a().f5581u.m3672b(lLeagueID)) {
            for (ClubBaseInfo clubBaseInfo2 : leagueInfo.getVClubBaseInfosList()) {
                if (leagueClub.f5915c.longValue() == clubBaseInfo2.getLClubID()) {
                    Object obj = null;
                    break;
                }
            }
            int i3 = 1;
            if (obj != null) {
                leagueClubDao2.e(leagueClub);
            }
        }
        leagueDao.d(league);
    }

    public final void m3677a(List<LeagueInfo> list, long j) {
        this.f5599a.a();
        try {
            for (LeagueInfo b : list) {
                m3674b(b);
            }
            LeagueClubDao leagueClubDao = this.f5600b.f6437L;
            for (LeagueClub leagueClub : DBManager.m3631a().f5581u.m3671a(j)) {
                Object obj;
                for (LeagueInfo stLeagueBaseInfo : list) {
                    if (leagueClub.f5914b.longValue() == stLeagueBaseInfo.getStLeagueBaseInfo().getLLeagueID()) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    leagueClubDao.e(leagueClub);
                }
            }
            this.f5599a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("LeagueDBManager", e.getMessage(), e);
        } finally {
            this.f5599a.b();
        }
    }

    public final void m3676a(LeagueInfo leagueInfo) {
        this.f5599a.a();
        try {
            m3674b(leagueInfo);
            this.f5599a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("LeagueDBManager", e.getMessage(), e);
        } finally {
            this.f5599a.b();
        }
    }
}
