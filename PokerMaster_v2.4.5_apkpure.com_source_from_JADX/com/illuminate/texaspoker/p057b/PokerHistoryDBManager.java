package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.PokerHistoryDao;
import com.illuminate.texaspoker.dao.PokerHistoryDao.Properties;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.utils.Utility;
import com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.u */
public final class PokerHistoryDBManager {
    a f5605a;
    public DaoSession f5606b;

    public PokerHistoryDBManager(a aVar, DaoSession daoSession) {
        this.f5605a = aVar;
        this.f5606b = daoSession;
    }

    public final long m3691a() {
        g a = g.a(this.f5606b.f6440O);
        a.a(Properties.f6369c.a(Boolean.valueOf(false)), new i[0]);
        a.b(new f[]{Properties.f6377k});
        return a.b();
    }

    public final List<PokerHistory> m3697b() {
        g a = g.a(this.f5606b.f6440O);
        a.a(Properties.f6369c.a(Boolean.valueOf(false)), new i[0]);
        a.b(new f[]{Properties.f6377k});
        return a.a().b();
    }

    public final PokerHistory m3692a(long j, long j2, long j3, boolean z) {
        g a = g.a(this.f5606b.f6440O);
        a.a(Properties.f6382p.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6380n.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6379m.a(Long.valueOf(j3)), new i[0]);
        a.a(Properties.f6369c.a(Boolean.valueOf(z)), new i[0]);
        a.b(new f[]{Properties.f6377k});
        return (PokerHistory) a.a().c();
    }

    public final PokerHistory m3693a(String str) {
        g a = g.a(this.f5606b.f6440O);
        a.a(Properties.f6386t.a(str), new i[0]);
        a.a(Properties.f6369c.a(Boolean.valueOf(false)), new i[0]);
        return (PokerHistory) a.a().c();
    }

    public final void m3695a(FavoritePokerHistoryInfo favoritePokerHistoryInfo, boolean z) {
        m3690b(favoritePokerHistoryInfo, z);
    }

    private PokerHistory m3690b(FavoritePokerHistoryInfo favoritePokerHistoryInfo, boolean z) {
        PokerHistoryDao pokerHistoryDao = this.f5606b.f6440O;
        PokerHistoryInfo stPokerHistoryInfo = favoritePokerHistoryInfo.getStPokerHistoryInfo();
        PokerHistory a = m3692a(stPokerHistoryInfo.getLSaveUuid(), stPokerHistoryInfo.getLRoomID(), stPokerHistoryInfo.getLHandID(), z);
        if (a == null) {
            a = new PokerHistory();
            a.f5957c = Boolean.valueOf(z);
            if (stPokerHistoryInfo.getVHandCardsList().size() == 2) {
                a.f5958d = Integer.valueOf(stPokerHistoryInfo.getVHandCards(0));
                a.f5959e = Integer.valueOf(stPokerHistoryInfo.getVHandCards(1));
                a.f5962h = Boolean.valueOf(false);
            } else if (stPokerHistoryInfo.getVHandCardsList().size() == 4) {
                a.f5958d = Integer.valueOf(stPokerHistoryInfo.getVHandCards(0));
                a.f5959e = Integer.valueOf(stPokerHistoryInfo.getVHandCards(1));
                a.f5960f = Integer.valueOf(stPokerHistoryInfo.getVHandCards(2));
                a.f5961g = Integer.valueOf(stPokerHistoryInfo.getVHandCards(3));
                a.f5962h = Boolean.valueOf(true);
            } else {
                a.f5958d = Integer.valueOf(-1);
                a.f5959e = Integer.valueOf(-1);
                a.f5962h = Boolean.valueOf(false);
            }
            a.f5979y = Integer.valueOf(stPokerHistoryInfo.getIAnte());
            a.f5980z = Long.valueOf(stPokerHistoryInfo.getLMaxPot());
            a.f5963i = Integer.valueOf(stPokerHistoryInfo.getIGameType());
            a.f5964j = Long.valueOf(stPokerHistoryInfo.getLBigBlind());
            a.f5966l = Long.valueOf(stPokerHistoryInfo.getLGetPopularity());
            a.f5967m = Long.valueOf(stPokerHistoryInfo.getLHandID());
            a.f5968n = Long.valueOf(stPokerHistoryInfo.getLRoomID());
            a.f5970p = Long.valueOf(stPokerHistoryInfo.getLSaveUuid());
            a.f5972r = Long.valueOf(stPokerHistoryInfo.getLSmallBlind());
            a.f5969o = Long.valueOf(stPokerHistoryInfo.getLTime());
            a.f5965k = Long.valueOf(favoritePokerHistoryInfo.getLFavoriteSaveTime());
            if (stPokerHistoryInfo.getBInGame() == 1) {
                a.f5956b = Boolean.valueOf(true);
            } else {
                a.f5956b = Boolean.valueOf(false);
            }
            a.f5976v = stPokerHistoryInfo.getSPokerHistoryRoomName();
            a.f5978x = stPokerHistoryInfo.getSPokerHistoryUrl();
            a.f5977w = stPokerHistoryInfo.getSPokerHistoryShareUrl();
            a.f5974t = Utility.m4497e(stPokerHistoryInfo.getSPokerHistoryShareUrl());
            a.f5952A = Integer.valueOf(stPokerHistoryInfo.getIType());
            a.f5953B = Long.valueOf(stPokerHistoryInfo.getLWinUuid());
            a.f5954C = stPokerHistoryInfo.getSPokerDesc();
        }
        a.f5975u = stPokerHistoryInfo.getSPokerHistoryName();
        pokerHistoryDao.d(a);
        return a;
    }

    public final void m3696a(List<FavoritePokerHistoryInfo> list) {
        PokerHistoryDao pokerHistoryDao = this.f5606b.f6440O;
        this.f5605a.a();
        try {
            List b = m3697b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                Object obj;
                PokerHistory pokerHistory = (PokerHistory) b.get(i);
                for (FavoritePokerHistoryInfo favoritePokerHistoryInfo : list) {
                    if (favoritePokerHistoryInfo.getStPokerHistoryInfo().getLSaveUuid() == pokerHistory.f5970p.longValue() && favoritePokerHistoryInfo.getStPokerHistoryInfo().getLRoomID() == pokerHistory.f5968n.longValue() && favoritePokerHistoryInfo.getStPokerHistoryInfo().getLHandID() == pokerHistory.f5967m.longValue()) {
                        obj = null;
                        break;
                    }
                }
                int i2 = 1;
                if (obj != null) {
                    pokerHistoryDao.e(pokerHistory);
                }
            }
            for (FavoritePokerHistoryInfo b2 : list) {
                m3690b(b2, false);
            }
            this.f5605a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("PokerHistoryDBManager", e.getMessage(), e);
        } finally {
            this.f5605a.b();
        }
    }

    public final void m3694a(long j, long j2, long j3) {
        PokerHistoryDao pokerHistoryDao = this.f5606b.f6440O;
        PokerHistory a = m3692a(j, j2, j3, false);
        if (a != null) {
            pokerHistoryDao.e(a);
        }
    }
}
