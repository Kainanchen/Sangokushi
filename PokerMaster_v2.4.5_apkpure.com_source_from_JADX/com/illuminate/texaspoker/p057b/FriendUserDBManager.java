package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.FriendUserDao;
import com.illuminate.texaspoker.dao.FriendUserDao.Properties;
import com.illuminate.texaspoker.dao.FriendshipChainDao;
import com.illuminate.texaspoker.dao.SocialMsgDao;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.p058c.SocialMsg;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.UserGameInfoNet;
import com.texaspoker.moment.TexasPokerCommon.ID_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.VIP_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet;
import com.texaspoker.moment.TexasPokerHttpUser.UserInfoNetV2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.n */
public final class FriendUserDBManager {
    public a f5591a;
    public DaoSession f5592b;

    /* renamed from: com.illuminate.texaspoker.b.n.1 */
    class FriendUserDBManager implements Runnable {
        final /* synthetic */ List f5585a;
        final /* synthetic */ FriendUserDBManager f5586b;

        public FriendUserDBManager(FriendUserDBManager friendUserDBManager, List list) {
            this.f5586b = friendUserDBManager;
            this.f5585a = list;
        }

        public final void run() {
            FriendUserDao friendUserDao = this.f5586b.f5592b.f6434I;
            FriendshipChainDao friendshipChainDao = this.f5586b.f5592b.f6433H;
            Map hashMap = new HashMap();
            for (UserFriendInfoNet userFriendInfoNet : this.f5585a) {
                if (!(StringUtils.m4462a(userFriendInfoNet.getStUserBaseInfo().getStrID()) || userFriendInfoNet.getStUserBaseInfo().getUuid() == 100)) {
                    FriendUser a = this.f5586b.m3640a(userFriendInfoNet.getStUserBaseInfo());
                    a.f5829h = Integer.valueOf(userFriendInfoNet.getEUserState().getNumber());
                    a.f5826e = Integer.valueOf(userFriendInfoNet.getEFriendState().getNumber());
                    a.f5821C = Long.valueOf(userFriendInfoNet.getLRoomId());
                    if (userFriendInfoNet.getIMute() == 0) {
                        a.f5823b = Boolean.valueOf(true);
                    } else {
                        a.f5823b = Boolean.valueOf(false);
                    }
                    FriendshipChain a2 = DBManager.m3631a().f5562b.m3650a(a.f5842u);
                    if (a2 != null) {
                        if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
                            a2.f5850c = Integer.valueOf(DBManager.f5544G);
                        } else if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND) {
                            a2.f5850c = Integer.valueOf(DBManager.f5546I);
                        }
                        friendshipChainDao.d(a2);
                    }
                    friendUserDao.d(a);
                    hashMap.put(a.f5842u, userFriendInfoNet);
                }
            }
            for (FriendUser friendUser : this.f5586b.m3642a()) {
                if (((UserFriendInfoNet) hashMap.get(friendUser.f5842u)) == null) {
                    this.f5586b.m3646b(friendUser.f5842u.longValue());
                }
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.b.n.2 */
    class FriendUserDBManager implements Runnable {
        final /* synthetic */ UserFriendInfoNet f5587a;
        final /* synthetic */ FriendshipChainDao f5588b;
        final /* synthetic */ FriendUserDao f5589c;
        final /* synthetic */ FriendUserDBManager f5590d;

        public FriendUserDBManager(FriendUserDBManager friendUserDBManager, UserFriendInfoNet userFriendInfoNet, FriendshipChainDao friendshipChainDao, FriendUserDao friendUserDao) {
            this.f5590d = friendUserDBManager;
            this.f5587a = userFriendInfoNet;
            this.f5588b = friendshipChainDao;
            this.f5589c = friendUserDao;
        }

        public final void run() {
            FriendUser a = this.f5590d.m3641a(this.f5587a.getStUserBaseInfo(), false);
            a.f5829h = Integer.valueOf(this.f5587a.getEUserState().getNumber());
            a.f5826e = Integer.valueOf(this.f5587a.getEFriendState().getNumber());
            a.f5821C = Long.valueOf(this.f5587a.getLRoomId());
            if (this.f5587a.getIMute() == 0) {
                a.f5823b = Boolean.valueOf(true);
            } else {
                a.f5823b = Boolean.valueOf(false);
            }
            FriendshipChain a2 = DBManager.m3631a().f5562b.m3650a(a.f5842u);
            if (a2 != null) {
                if (this.f5587a.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
                    a2.f5850c = Integer.valueOf(DBManager.f5544G);
                } else if (this.f5587a.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND) {
                    a2.f5850c = Integer.valueOf(DBManager.f5546I);
                }
                this.f5588b.d(a2);
            }
            this.f5589c.d(a);
        }
    }

    public FriendUserDBManager(a aVar, DaoSession daoSession) {
        this.f5591a = aVar;
        this.f5592b = daoSession;
    }

    public final FriendUser m3639a(long j) {
        g a = g.a(this.f5592b.f6434I);
        a.a(Properties.f6261u.a(Long.valueOf(j)), new i[0]);
        return (FriendUser) a.a().c();
    }

    public final List<FriendUser> m3642a() {
        g a = g.a(this.f5592b.f6434I);
        a.a(Properties.f6245e.a(Integer.valueOf(USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND.getNumber())), new i[0]);
        a.a(Properties.f6261u.b(Integer.valueOf(100)), new i[0]);
        a.a(new f[]{Properties.f6252l});
        return a.a().b();
    }

    public final void m3645a(List<UserGameInfoNet> list) {
        this.f5591a.a();
        try {
            for (UserGameInfoNet userGameInfoNet : list) {
                if (userGameInfoNet.getStUserInfo().getUuid() > 0) {
                    m3641a(userGameInfoNet.getStUserInfo(), false);
                }
            }
            this.f5591a.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5591a.b();
        }
    }

    public final void m3647b(List<UserFriendInfoNet> list) {
        FriendUserDao friendUserDao = this.f5592b.f6434I;
        FriendshipChainDao friendshipChainDao = this.f5592b.f6433H;
        this.f5591a.a();
        for (UserFriendInfoNet userFriendInfoNet : list) {
            FriendUser a = m3641a(userFriendInfoNet.getStUserBaseInfo(), false);
            a.f5829h = Integer.valueOf(userFriendInfoNet.getEUserState().getNumber());
            a.f5826e = Integer.valueOf(userFriendInfoNet.getEFriendState().getNumber());
            a.f5821C = Long.valueOf(userFriendInfoNet.getLRoomId());
            if (userFriendInfoNet.getIMute() == 0) {
                a.f5823b = Boolean.valueOf(true);
            } else {
                a.f5823b = Boolean.valueOf(false);
            }
            FriendshipChain a2 = DBManager.m3631a().f5562b.m3650a(a.f5842u);
            if (a2 != null) {
                if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
                    a2.f5850c = Integer.valueOf(DBManager.f5544G);
                } else {
                    try {
                        if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND) {
                            a2.f5850c = Integer.valueOf(DBManager.f5546I);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        this.f5591a.b();
                    }
                }
                friendshipChainDao.d(a2);
            }
            friendUserDao.d(a);
        }
        this.f5591a.c();
    }

    public final void m3646b(long j) {
        FriendUser a = m3639a(j);
        FriendUserDao friendUserDao = this.f5592b.f6434I;
        FriendshipChainDao friendshipChainDao = this.f5592b.f6433H;
        SocialMsgDao socialMsgDao = this.f5592b.f6442Q;
        this.f5591a.a();
        if (a != null) {
            try {
                a.f5826e = Integer.valueOf(USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND.getNumber());
                friendUserDao.d(a);
                g a2 = g.a(DBManager.m3631a().f5564d.f5609a.f6442Q);
                a2.a(SocialMsgDao.Properties.f6408e.a(Long.valueOf(j)), new i[0]);
                SocialMsg socialMsg = (SocialMsg) a2.a().c();
                if (socialMsg != null) {
                    socialMsgDao.e(socialMsg);
                }
                FriendshipChain a3 = DBManager.m3631a().f5562b.m3650a(a.f5842u);
                if (a3 != null) {
                    if (a.f5826e.intValue() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND.getNumber()) {
                        a3.f5850c = Integer.valueOf(DBManager.f5544G);
                    } else if (a.f5826e.intValue() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND.getNumber()) {
                        a3.f5850c = Integer.valueOf(DBManager.f5546I);
                    }
                    friendshipChainDao.d(a3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            } finally {
                this.f5591a.b();
            }
        }
        this.f5591a.c();
        this.f5591a.b();
    }

    public final FriendUser m3640a(UserBaseInfoNet userBaseInfoNet) {
        return m3641a(userBaseInfoNet, false);
    }

    public final FriendUser m3641a(UserBaseInfoNet userBaseInfoNet, boolean z) {
        CharSequence sRemark;
        if (z) {
            sRemark = userBaseInfoNet.getSRemark();
        } else {
            sRemark = null;
        }
        long uuid = userBaseInfoNet.getUuid();
        ID_TYPE eType = userBaseInfoNet.getEType();
        userBaseInfoNet.getStrID();
        CharSequence strSmallCover = userBaseInfoNet.getStrSmallCover();
        String strNick = userBaseInfoNet.getStrNick();
        userBaseInfoNet.getStrPhoneNumber();
        VIP_TYPE eVipType = userBaseInfoNet.getEVipType();
        int iGender = userBaseInfoNet.getIGender();
        long lLoginTime = userBaseInfoNet.getLLoginTime();
        String strDesc = userBaseInfoNet.getStrDesc();
        CharSequence strCover = userBaseInfoNet.getStrCover();
        long lPopularity = userBaseInfoNet.getLPopularity();
        FriendUser a = m3639a(uuid);
        if (a == null) {
            a = new FriendUser();
            a.f5842u = Long.valueOf(uuid);
            a.f5823b = Boolean.valueOf(true);
            a.f5826e = Integer.valueOf(USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND.getNumber());
        }
        a.f5820B = Long.valueOf(lPopularity);
        a.f5828g = Integer.valueOf(eType.getNumber());
        if (!StringUtils.m4462a(strSmallCover)) {
            a.f5836o = strSmallCover;
        } else if (StringUtils.m4462a(a.f5836o)) {
            a.f5836o = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        a.f5838q = strNick;
        a.f5830i = Integer.valueOf(eVipType.getNumber());
        a.f5832k = Integer.valueOf(iGender);
        if (!StringUtils.m4462a(strCover)) {
            a.f5837p = strCover;
        }
        if (a.f5842u.longValue() == 100) {
            a.f5843v = Long.valueOf(System.currentTimeMillis() + RuntimeData.f6671b);
        } else if (lLoginTime != 0 && (a.f5843v == null || lLoginTime > a.f5843v.longValue())) {
            a.f5843v = Long.valueOf(lLoginTime);
        }
        a.f5835n = strDesc;
        if (!StringUtils.m4462a(sRemark)) {
            a.f5841t = sRemark;
        }
        if (StringUtils.m4462a(a.f5838q)) {
            a.f5833l = "#";
        } else {
            a.f5833l = StringUtils.m4463b(a.f5838q).toUpperCase();
        }
        this.f5592b.f6434I.d(a);
        DBManager.m3631a().f5561a.m3637a(userBaseInfoNet.getUuid(), userBaseInfoNet.getSSmallAlbumsList(), userBaseInfoNet.getSBigAlbumsList());
        return a;
    }

    public final void m3643a(long j, int i, String str) {
        FriendUser a = m3639a(j);
        if (a != null) {
            a.f5832k = Integer.valueOf(i);
            a.f5838q = str;
            this.f5592b.f6434I.d(a);
        }
    }

    public final void m3644a(UserInfoNetV2 userInfoNetV2, boolean z) {
        FriendUserDao friendUserDao = this.f5592b.f6434I;
        this.f5591a.a();
        try {
            FriendUser a = m3641a(userInfoNetV2.getStBaseInfo(), z);
            a.f5845x = Long.valueOf(userInfoNetV2.getStUserStatisticsInfo().getLTotalGames());
            a.f5847z = Long.valueOf(userInfoNetV2.getStUserStatisticsInfo().getLVPIPNum());
            a.f5846y = Long.valueOf(userInfoNetV2.getStUserStatisticsInfo().getLTotalHands());
            a.f5819A = Long.valueOf(userInfoNetV2.getStUserStatisticsInfo().getLWinTimes());
            a.f5820B = Long.valueOf(userInfoNetV2.getStBaseInfo().getLPopularity());
            if (userInfoNetV2.getStBaseInfo().getLLoginTime() != 0 && userInfoNetV2.getStBaseInfo().getLLoginTime() > a.f5843v.longValue()) {
                a.f5843v = Long.valueOf(userInfoNetV2.getStBaseInfo().getLLoginTime());
            }
            a.f5835n = userInfoNetV2.getStBaseInfo().getStrDesc();
            if (StringUtils.m4462a(a.f5838q)) {
                a.f5833l = "#";
            } else {
                a.f5833l = StringUtils.m4463b(a.f5838q).toUpperCase();
            }
            friendUserDao.d(a);
            this.f5591a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("FriendUserDBManager", e.getMessage(), e);
        } finally {
            this.f5591a.b();
        }
    }

    public final void m3648c(List<UserGameInfoNet> list) {
        this.f5591a.a();
        try {
            for (UserGameInfoNet stUserInfo : list) {
                m3641a(stUserInfo.getStUserInfo(), false);
            }
            this.f5591a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("FriendUserDBManager", e.getMessage(), e);
        } finally {
            this.f5591a.b();
        }
    }
}
