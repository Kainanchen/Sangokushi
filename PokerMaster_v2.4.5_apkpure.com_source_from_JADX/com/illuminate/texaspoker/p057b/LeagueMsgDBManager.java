package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.LeagueMsgDao;
import com.illuminate.texaspoker.dao.LeagueMsgDao.Properties;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPokerHttpLeague.CSSystemLeagueMsgRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.CSSystemLeagueMsgRsp.Builder;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPokerHttpLeague.LeaguePushMsg;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.s */
public final class LeagueMsgDBManager {
    public DaoSession f5601a;
    private a f5602b;

    public LeagueMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5602b = aVar;
        this.f5601a = daoSession;
    }

    public final long m3679a() {
        g a = g.a(this.f5601a.f6438M);
        a.a(Properties.f6344f.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        return a.b();
    }

    public final long m3680a(long j) {
        g a = g.a(this.f5601a.f6438M);
        a.a(Properties.f6344f.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        a.a(Properties.f6340b.a(Long.valueOf(j)), new i[0]);
        return a.b();
    }

    public final List<LeagueMsg> m3683b(long j) {
        g a = g.a(this.f5601a.f6438M);
        a.a(Properties.f6340b.a(Long.valueOf(j)), new i[0]);
        a.b(new f[]{Properties.f6341c});
        return a.a().b();
    }

    public final LeagueMsg m3681a(long j, long j2, long j3) {
        g a = g.a(this.f5601a.f6438M);
        a.a(Properties.f6345g.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6346h.a(Long.valueOf(j3)), new i[0]);
        a.a(Properties.f6340b.a(Long.valueOf(j2)), new i[0]);
        return (LeagueMsg) a.a().c();
    }

    public final void m3684b(long j, long j2, long j3) {
        LeagueMsgDao leagueMsgDao = this.f5601a.f6438M;
        LeagueMsg a = m3681a(j3, j, j2);
        if (a != null) {
            leagueMsgDao.e(a);
        }
    }

    public final void m3685c(long j) {
        LeagueMsgDao leagueMsgDao = this.f5601a.f6438M;
        this.f5602b.a();
        try {
            g a = g.a(leagueMsgDao);
            a.a(Properties.f6344f.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
            a.a(Properties.f6340b.a(Long.valueOf(j)), new i[0]);
            List<LeagueMsg> b = a.a().b();
            if (b.size() > 0) {
                for (LeagueMsg leagueMsg : b) {
                    leagueMsg.f5931f = Integer.valueOf(DBManager.f5540C);
                    leagueMsgDao.d(leagueMsg);
                }
            }
            this.f5602b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5602b.b();
        }
    }

    public final void m3682a(List<LeaguePushMsg> list) {
        LeagueMsgDao leagueMsgDao = this.f5601a.f6438M;
        this.f5602b.a();
        Builder newBuilder = CSSystemLeagueMsgRsp.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        for (LeaguePushMsg leaguePushMsg : list) {
            if (leaguePushMsg.getELeagueMessageType() == LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_APPLY) {
                LeagueMsgDao leagueMsgDao2 = this.f5601a.f6438M;
                LeagueMsg a = m3681a(leaguePushMsg.getStLeagueBaseInfo().getLLeagueID(), leaguePushMsg.getStToClub().getLClubID(), leaguePushMsg.getStFromClub().getLClubID());
                if (a == null) {
                    a = new LeagueMsg();
                }
                a.f5927b = Long.valueOf(leaguePushMsg.getStToClub().getLClubID());
                a.f5928c = Long.valueOf(leaguePushMsg.getLMsgID());
                a.f5929d = Long.valueOf(leaguePushMsg.getLMsgID());
                a.f5930e = Integer.valueOf(leaguePushMsg.getELeagueMessageType().getNumber());
                a.f5932g = Long.valueOf(leaguePushMsg.getStLeagueBaseInfo().getLLeagueID());
                a.f5933h = Long.valueOf(leaguePushMsg.getStFromClub().getLClubID());
                a.f5934i = leaguePushMsg.getStFromClub().getSClubName();
                a.f5935j = leaguePushMsg.getStFromClub().getSSmallIcon();
                a.f5937l = String.format(BaseApplication.m3548a().getResources().getString(2131165360), new Object[]{leaguePushMsg.getStLeagueBaseInfo().getSLeagueName()});
                leagueMsgDao2.d(a);
                a.f5931f = Integer.valueOf(DBManager.f5541D);
                leagueMsgDao.d(a);
            } else {
                try {
                    if (leaguePushMsg.getELeagueMessageType() == LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_ACCEPT) {
                        m3678a(leaguePushMsg);
                    } else if (leaguePushMsg.getELeagueMessageType() == LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_DENY) {
                        m3678a(leaguePushMsg);
                    } else if (leaguePushMsg.getELeagueMessageType() == LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_REMOVE) {
                        m3684b(leaguePushMsg.getStFromClub().getLClubID(), leaguePushMsg.getStToClub().getLClubID(), leaguePushMsg.getStLeagueBaseInfo().getLLeagueID());
                        DBManager.m3631a().f5581u.m3673b(leaguePushMsg.getStLeagueBaseInfo().getLLeagueID(), leaguePushMsg.getStToClub().getLClubID());
                    } else if (leaguePushMsg.getELeagueMessageType() == LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_QUIT) {
                        m3684b(leaguePushMsg.getStToClub().getLClubID(), leaguePushMsg.getStFromClub().getLClubID(), leaguePushMsg.getStLeagueBaseInfo().getLLeagueID());
                        DBManager.m3631a().f5581u.m3673b(leaguePushMsg.getStLeagueBaseInfo().getLLeagueID(), leaguePushMsg.getStFromClub().getLClubID());
                    } else {
                        leaguePushMsg.getELeagueMessageType();
                        LEAGUE_MESSAGE_TYPE league_message_type = LEAGUE_MESSAGE_TYPE.LEAGUE_MESSAGE_ENTER;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    this.f5602b.b();
                }
            }
            newBuilder.addVMsgIds(leaguePushMsg.getLMsgID());
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4108a(newBuilder);
        this.f5602b.c();
    }

    private LeagueMsg m3678a(LeaguePushMsg leaguePushMsg) {
        LeagueMsgDao leagueMsgDao = this.f5601a.f6438M;
        LeagueMsg a = m3681a(leaguePushMsg.getStLeagueBaseInfo().getLLeagueID(), leaguePushMsg.getStFromClub().getLClubID(), leaguePushMsg.getStToClub().getLClubID());
        if (a != null) {
            a.f5928c = Long.valueOf(leaguePushMsg.getLMsgID());
            a.f5929d = Long.valueOf(leaguePushMsg.getLMsgID());
            a.f5930e = Integer.valueOf(leaguePushMsg.getELeagueMessageType().getNumber());
            a.f5936k = leaguePushMsg.getSFromNick();
            leagueMsgDao.d(a);
        }
        return a;
    }
}
