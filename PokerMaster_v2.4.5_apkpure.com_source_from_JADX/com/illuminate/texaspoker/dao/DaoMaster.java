package com.illuminate.texaspoker.dao;

import android.content.Context;
import android.util.Log;
import org.a.a.a.a;
import org.a.a.b;

/* renamed from: com.illuminate.texaspoker.dao.a */
public final class DaoMaster extends b {

    /* renamed from: com.illuminate.texaspoker.dao.a.a */
    public static abstract class DaoMaster extends org.a.a.a.b {
        public DaoMaster(Context context, String str) {
            super(context, str);
        }

        public final void m3634a(a aVar) {
            Log.i("greenDAO", "Creating tables for schema version 5");
            BannerDao.m3749a(aVar);
            BillDao.m3756a(aVar);
            BuyInControlMsgDao.m3764a(aVar);
            ChatMsgDao.m3772a(aVar);
            ChatRoomDao.m3780a(aVar);
            ChatUserDao.m3788a(aVar);
            ClubAlbumDao.m3799a(aVar);
            ClubFundLogDao.m3806a(aVar);
            ClubMsgDao.m3813a(aVar);
            ClubRecordDao.m3821a(aVar);
            FriendAlbumDao.m3828a(aVar);
            FriendshipChainDao.m3842a(aVar);
            FriendUserDao.m3835a(aVar);
            GameRoomDao.m3849a(aVar);
            LeagueDao.m3865a(aVar);
            LeagueClubDao.m3857a(aVar);
            LeagueMsgDao.m3872a(aVar);
            MessageMsgDao.m3880a(aVar);
            PokerHistoryDao.m3887a(aVar);
            SellItemDao.m3894a(aVar);
            SocialMsgDao.m3901a(aVar);
            UserBillDao.m3909a(aVar);
        }
    }

    public DaoMaster(a aVar) {
        super(aVar);
        a(BannerDao.class);
        a(BillDao.class);
        a(BuyInControlMsgDao.class);
        a(ChatMsgDao.class);
        a(ChatRoomDao.class);
        a(ChatUserDao.class);
        a(ClubAlbumDao.class);
        a(ClubFundLogDao.class);
        a(ClubMsgDao.class);
        a(ClubRecordDao.class);
        a(FriendAlbumDao.class);
        a(FriendshipChainDao.class);
        a(FriendUserDao.class);
        a(GameRoomDao.class);
        a(LeagueDao.class);
        a(LeagueClubDao.class);
        a(LeagueMsgDao.class);
        a(MessageMsgDao.class);
        a(PokerHistoryDao.class);
        a(SellItemDao.class);
        a(SocialMsgDao.class);
        a(UserBillDao.class);
    }
}
