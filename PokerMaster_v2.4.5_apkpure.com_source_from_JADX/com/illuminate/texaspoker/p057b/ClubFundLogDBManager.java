package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.ClubFundLogDao;
import com.illuminate.texaspoker.dao.ClubFundLogDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.ClubFundLog;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpClub.FundBillInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.h */
public final class ClubFundLogDBManager {
    public DaoSession f5532a;
    private a f5533b;

    public ClubFundLogDBManager(a aVar, DaoSession daoSession) {
        this.f5533b = aVar;
        this.f5532a = daoSession;
    }

    public final void m3621a(List<FundBillInfo> list, long j) {
        ClubFundLogDao clubFundLogDao = this.f5532a.f6429D;
        this.f5533b.a();
        try {
            g a = g.a(this.f5532a.f6429D);
            a.a(Properties.f6209d.a(Long.valueOf(j)), new i[0]);
            a.b(new f[]{Properties.f6210e});
            for (ClubFundLog e : a.a().b()) {
                clubFundLogDao.e(e);
            }
            for (FundBillInfo fundBillInfo : list) {
                ClubFundLogDao clubFundLogDao2 = this.f5532a.f6429D;
                long lCreateTime = fundBillInfo.getLCreateTime();
                g a2 = g.a(this.f5532a.f6429D);
                a2.a(Properties.f6209d.a(Long.valueOf(j)), new i[0]);
                a2.a(Properties.f6210e.a(Long.valueOf(lCreateTime)), new i[0]);
                a2.b(new f[]{Properties.f6210e});
                ClubFundLog clubFundLog = (ClubFundLog) a2.a().c();
                if (clubFundLog == null) {
                    clubFundLog = new ClubFundLog();
                }
                clubFundLog.f5787d = Long.valueOf(j);
                clubFundLog.f5785b = Integer.valueOf(fundBillInfo.getEFundBillToType().getNumber());
                clubFundLog.f5786c = Integer.valueOf(fundBillInfo.getEFundBillType().getNumber());
                clubFundLog.f5788e = Long.valueOf(fundBillInfo.getLCreateTime());
                clubFundLog.f5789f = Long.valueOf(fundBillInfo.getLFund());
                if (fundBillInfo.getStBillInfoNet().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                    clubFundLog.f5792i = fundBillInfo.getStBillInfoNet().getStSNGBillInfoNet().getSPlayName();
                    clubFundLog.f5790g = Long.valueOf(fundBillInfo.getStBillInfoNet().getStSNGBillInfoNet().getStCreateUserBaseInfo().getUuid());
                } else {
                    clubFundLog.f5792i = fundBillInfo.getStBillInfoNet().getStNormalBillInfoNet().getSPlayName();
                    clubFundLog.f5790g = Long.valueOf(fundBillInfo.getStBillInfoNet().getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid());
                }
                String str = LetterIndexBar.SEARCH_ICON_LETTER;
                String str2 = str;
                int i = 0;
                for (UserBaseInfoNet a3 : fundBillInfo.getStUserBaseInfoNetList()) {
                    String str3;
                    FriendUser a4 = DBManager.m3631a().f5563c.m3641a(a3, false);
                    if (i == 0) {
                        str3 = str2 + a4.f5842u;
                    } else {
                        str3 = str2 + "," + a4.f5842u;
                    }
                    i++;
                    str2 = str3;
                }
                clubFundLog.f5791h = str2;
                clubFundLogDao2.d(clubFundLog);
            }
            this.f5533b.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            this.f5533b.b();
        }
    }
}
