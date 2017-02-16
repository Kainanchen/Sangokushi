package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.BillDao;
import com.illuminate.texaspoker.dao.BillDao.Properties;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.GameUserStatisticsInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.b */
public final class BillDBManager {
    public a f5517a;
    public DaoSession f5518b;

    public BillDBManager(a aVar, DaoSession daoSession) {
        this.f5517a = aVar;
        this.f5518b = daoSession;
    }

    public final Bill m3554a(long j, boolean z) {
        g a = g.a(this.f5518b.f6467x);
        a.a(Properties.f6079b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6085h.a(Boolean.valueOf(z)), new i[0]);
        return (Bill) a.a().c();
    }

    public final List<Bill> m3556a() {
        g a = g.a(this.f5518b.f6467x);
        a.a(Properties.f6085h.a(Boolean.valueOf(false)), new i[0]);
        a.a(10);
        a.b(new f[]{Properties.f6066J});
        return a.a().b();
    }

    public final Bill m3555a(BillInfoNet billInfoNet, boolean z) {
        long lBillID;
        Bill bill;
        if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            lBillID = billInfoNet.getStSNGBillInfoNet().getLBillID();
        } else {
            lBillID = billInfoNet.getStNormalBillInfoNet().getLBillID();
        }
        BillDao billDao = this.f5518b.f6467x;
        Bill a = m3554a(lBillID, z);
        if (a == null) {
            a = new Bill();
            a.f5643b = Long.valueOf(lBillID);
            a.f5646e = Boolean.valueOf(false);
            a.f5647f = Boolean.valueOf(true);
            bill = a;
        } else {
            bill = a;
        }
        bill.f5644c = Integer.valueOf(billInfoNet.getEGameRoomType().getNumber());
        if (billInfoNet.getEGameRoomType() != GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            bill.f5650i = Boolean.valueOf(billInfoNet.getStNormalBillInfoNet().hasBOwnerDeleted());
            bill.f5629M = billInfoNet.getStNormalBillInfoNet().getSPlayName();
            bill.f5631O = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid());
            bill.f5626J = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLCreateTime());
            bill.f5627K = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLDuration());
            bill.f5662u = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLSmallBlind());
            bill.f5663v = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLBigBlind());
            bill.f5666y = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLBuyin());
            bill.f5661t = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLTotalBuyin());
            bill.f5649h = Boolean.valueOf(z);
            bill.f5665x = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLMaxPot());
            bill.f5660s = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLTotalGameNum());
            bill.f5654m = Integer.valueOf(billInfoNet.getStNormalBillInfoNet().getIGameRoomUserMaxNums());
            bill.f5656o = Integer.valueOf(billInfoNet.getStNormalBillInfoNet().getIAnte());
            bill.f5645d = Integer.valueOf(billInfoNet.getStNormalBillInfoNet().getECreateRoomType().getNumber());
            bill.f5667z = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLFromRoomID());
            bill.m3707a(DBManager.m3631a().f5563c.m3641a(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo(), false));
            bill.f5664w = Long.valueOf(0);
            bill.f5625I = Long.valueOf(0);
            bill.f5634R = Long.valueOf(billInfoNet.getStNormalBillInfoNet().getLLeagueID());
            bill.f5635S = billInfoNet.getStNormalBillInfoNet().getSLeagueName();
            if (billInfoNet.getStNormalBillInfoNet().getLLeagueID() > 0) {
                if (StringUtils.m4462a(billInfoNet.getSFromClubName())) {
                    bill.f5630N = billInfoNet.getStNormalBillInfoNet().getSFromText();
                } else {
                    bill.f5630N = billInfoNet.getSFromClubName();
                }
                if (StringUtils.m4462a(billInfoNet.getSFromClubUrl())) {
                    bill.f5636T = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
                } else {
                    bill.f5636T = billInfoNet.getSFromClubUrl();
                }
                if (StringUtils.m4462a(billInfoNet.getSFromClubCreatorName())) {
                    bill.f5637U = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                } else {
                    bill.f5637U = billInfoNet.getSFromClubCreatorName();
                }
            } else if (StringUtils.m4462a(billInfoNet.getStNormalBillInfoNet().getSFromText())) {
                bill.f5630N = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                bill.f5630N = billInfoNet.getStNormalBillInfoNet().getSFromText();
            }
            for (UserBillInfoNet userBillInfoNet : billInfoNet.getStNormalBillInfoNet().getVUserBillInfosList()) {
                DBManager.m3631a().f5571k.m3704a(userBillInfoNet, billInfoNet.getStNormalBillInfoNet().getLBillID(), z);
                if (SharedPreferencesManager.m4308b() == userBillInfoNet.getUuid()) {
                    bill.f5664w = Long.valueOf(userBillInfoNet.getLRemainBuyStacks() - userBillInfoNet.getLTotalBuyStacks());
                } else if (userBillInfoNet.getUuid() == 1000) {
                    bill.f5625I = Long.valueOf(userBillInfoNet.getLInsuranceGetStacks());
                }
            }
            if (billInfoNet.getBClubManager() != 1 || z) {
                bill.f5633Q = Boolean.valueOf(false);
            } else {
                bill.f5633Q = Boolean.valueOf(true);
            }
        } else {
            bill.f5650i = Boolean.valueOf(billInfoNet.getStSNGBillInfoNet().hasBOwnerDeleted());
            bill.f5629M = billInfoNet.getStSNGBillInfoNet().getSPlayName();
            bill.f5631O = Long.valueOf(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getUuid());
            bill.f5626J = Long.valueOf(billInfoNet.getStSNGBillInfoNet().getLCreateTime());
            bill.f5649h = Boolean.valueOf(z);
            if (billInfoNet.getStSNGBillInfoNet().getBPrivateRoom() == 1) {
                bill.f5651j = Boolean.valueOf(true);
            } else {
                bill.f5651j = Boolean.valueOf(false);
            }
            bill.f5652k = Long.valueOf(billInfoNet.getStSNGBillInfoNet().getLOriginalStacks());
            bill.f5653l = Integer.valueOf(billInfoNet.getStSNGBillInfoNet().getIBlindInterval());
            bill.f5654m = Integer.valueOf(billInfoNet.getStSNGBillInfoNet().getIGameRoomUserMaxNums());
            bill.f5655n = Integer.valueOf(billInfoNet.getStSNGBillInfoNet().getESNGRoomType().getNumber());
            bill.f5645d = Integer.valueOf(billInfoNet.getStSNGBillInfoNet().getECreateRoomType().getNumber());
            bill.f5667z = Long.valueOf(billInfoNet.getStSNGBillInfoNet().getLFromRoomID());
            if (StringUtils.m4462a(billInfoNet.getStSNGBillInfoNet().getSFromText())) {
                bill.f5630N = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                bill.f5630N = billInfoNet.getStSNGBillInfoNet().getSFromText();
            }
            bill.m3707a(DBManager.m3631a().f5563c.m3641a(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo(), false));
            bill.f5664w = Long.valueOf(0);
            bill.f5625I = Long.valueOf(0);
            bill.f5634R = Long.valueOf(billInfoNet.getStSNGBillInfoNet().getLLeagueID());
            bill.f5635S = billInfoNet.getStSNGBillInfoNet().getSLeagueName();
            for (UserBillInfoNet userBillInfoNet2 : billInfoNet.getStSNGBillInfoNet().getVUserBillInfosList()) {
                DBManager.m3631a().f5571k.m3704a(userBillInfoNet2, billInfoNet.getStSNGBillInfoNet().getLBillID(), z);
                if (SharedPreferencesManager.m4308b() == userBillInfoNet2.getUuid()) {
                    bill.f5664w = Long.valueOf(userBillInfoNet2.getLRemainBuyStacks() - userBillInfoNet2.getLTotalBuyStacks());
                }
            }
            if (billInfoNet.getBClubManager() == 1) {
                bill.f5633Q = Boolean.valueOf(true);
            } else {
                bill.f5633Q = Boolean.valueOf(false);
            }
        }
        billDao.d(bill);
        return bill;
    }

    public final void m3557a(List<BillInfoNet> list, long j, long j2) {
        this.f5517a.a();
        try {
            BillDao billDao = this.f5518b.f6467x;
            if (j != 0) {
                ChatRoomDao chatRoomDao = this.f5518b.f6426A;
                ChatRoom a = DBManager.m3631a().f5565e.m3590a(j, 2);
                a.f5754o = Long.valueOf(j2);
                chatRoomDao.d(a);
            }
            for (BillInfoNet billInfoNet : list) {
                Bill a2 = m3555a(billInfoNet, false);
                if (a2.f5644c.intValue() != 2) {
                    GameUserStatisticsInfoNet stGameUserStatisticsInfoNet = billInfoNet.getStNormalBillInfoNet().getStGameUserStatisticsInfoNet();
                    a2.f5659r = Long.valueOf(stGameUserStatisticsInfoNet.getLTotalHand());
                    a2.f5658q = Long.valueOf(stGameUserStatisticsInfoNet.getLTotalJoinHand());
                    a2.f5657p = Long.valueOf(stGameUserStatisticsInfoNet.getLTotalWin());
                    a2.f5617A = Long.valueOf(stGameUserStatisticsInfoNet.getLCountJoinFlop());
                    a2.f5619C = Long.valueOf(stGameUserStatisticsInfoNet.getLCountJoinTurn());
                    a2.f5618B = Long.valueOf(stGameUserStatisticsInfoNet.getLCountJoinRiver());
                    a2.f5620D = Long.valueOf(stGameUserStatisticsInfoNet.getLCountShowdownFlopWin());
                    a2.f5623G = Long.valueOf(stGameUserStatisticsInfoNet.getLCountShowdownTurnWin());
                    a2.f5621E = Long.valueOf(stGameUserStatisticsInfoNet.getLCountShowdownRiverWin());
                    a2.f5624H = Long.valueOf(stGameUserStatisticsInfoNet.getLCountShowdownWinShow());
                    a2.f5622F = Long.valueOf(stGameUserStatisticsInfoNet.getLCountShowdownShow());
                }
                billDao.d(a2);
            }
            this.f5517a.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5517a.b();
        }
    }
}
