package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.FriendUserDao;
import com.illuminate.texaspoker.dao.FriendshipChainDao;
import com.illuminate.texaspoker.dao.SocialMsgDao;
import com.illuminate.texaspoker.dao.SocialMsgDao.Properties;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.p058c.SocialMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpUser.CSSystemFriendMsgRsp;
import com.texaspoker.moment.TexasPokerHttpUser.CSSystemFriendMsgRsp.Builder;
import com.texaspoker.moment.TexasPokerHttpUser.FRIEND_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.FriendPushMsg;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.w */
public final class SocialMsgDBManager {
    public DaoSession f5609a;
    private a f5610b;

    public SocialMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5610b = aVar;
        this.f5609a = daoSession;
    }

    public final long m3701a() {
        g a = g.a(this.f5609a.f6442Q);
        a.a(Properties.f6406c.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        return a.b();
    }

    public final void m3702b() {
        SocialMsgDao socialMsgDao = this.f5609a.f6442Q;
        g a = g.a(socialMsgDao);
        a.a(Properties.f6406c.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        List<SocialMsg> b = a.a().b();
        this.f5610b.a();
        try {
            for (SocialMsg socialMsg : b) {
                socialMsg.f5994c = Integer.valueOf(DBManager.f5540C);
                socialMsgDao.d(socialMsg);
            }
            this.f5610b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5610b.b();
        }
    }

    public final int m3700a(List<FriendPushMsg> list) {
        int i;
        Exception exception;
        int i2;
        int i3 = 0;
        Builder newBuilder = CSSystemFriendMsgRsp.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        this.f5610b.a();
        try {
            for (FriendPushMsg friendPushMsg : list) {
                newBuilder.addVMsgIds(friendPushMsg.getLMsgID());
                if (friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_INVITED || friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND || friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_DELETE_FRIEND || friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_RECOMMAND_FRIEND) {
                    if (friendPushMsg.getEFriendMessageType() != FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_DELETE_FRIEND) {
                        i = i3 + 1;
                    } else {
                        i = i3;
                    }
                    if (!(friendPushMsg.getStFromUser().getUuid() == 100 || friendPushMsg.getStFromUser().getUuid() == 0)) {
                        UserBaseInfoNet stToUser;
                        SocialMsg socialMsg;
                        if (friendPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b() && friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND) {
                            stToUser = friendPushMsg.getStToUser();
                        } else {
                            stToUser = friendPushMsg.getStFromUser();
                        }
                        org.a.a.a aVar = this.f5609a.f6442Q;
                        g a = g.a(aVar);
                        a.a(Properties.f6408e.a(Long.valueOf(stToUser.getUuid())), new i[0]);
                        SocialMsg socialMsg2 = (SocialMsg) a.a().c();
                        if (friendPushMsg.getEFriendMessageType() != FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_DELETE_FRIEND) {
                            if (socialMsg2 == null) {
                                socialMsg2 = new SocialMsg();
                            }
                            socialMsg2.f5993b = Integer.valueOf(friendPushMsg.getEFriendMessageType().getNumber());
                            socialMsg2.f5996e = Long.valueOf(stToUser.getUuid());
                            socialMsg2.f5994c = Integer.valueOf(DBManager.f5541D);
                            socialMsg2.f5998g = Long.valueOf(friendPushMsg.getLMsgID());
                            socialMsg2.f5999h = friendPushMsg.getSMsg();
                            socialMsg2.f5997f = Long.valueOf(friendPushMsg.getLCreateTime());
                            aVar.d(socialMsg2);
                            socialMsg = socialMsg2;
                        } else if (socialMsg2 != null) {
                            aVar.e(socialMsg2);
                            socialMsg = null;
                        } else {
                            socialMsg = socialMsg2;
                        }
                        FriendUserDao friendUserDao = this.f5609a.f6434I;
                        FriendUser a2 = DBManager.m3631a().f5563c.m3641a(stToUser, false);
                        if (friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND) {
                            a2.f5826e = Integer.valueOf(USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND.getNumber());
                            long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
                            if (friendPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b() && friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND) {
                                FriendUser a3 = DBManager.m3631a().f5563c.m3641a(friendPushMsg.getStToUser(), false);
                                DBManager.m3631a().f5565e.m3589a(a3.f5842u.longValue());
                                DBManager.m3631a().f5566f.m3582e(a3.f5842u.longValue(), currentTimeMillis, CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber());
                                long j = currentTimeMillis;
                                DBManager.m3631a().f5566f.m3566a(currentTimeMillis, CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber(), DBManager.f5555y, a3.f5842u.longValue(), a3.f5842u.longValue(), String.format(BaseApplication.m3548a().getResources().getString(2131165262), new Object[]{a3.f5838q}), j, DBManager.f5540C, 0, DBManager.f5548K, a3, true);
                                if (socialMsg != null) {
                                    socialMsg.f5994c = Integer.valueOf(DBManager.f5540C);
                                }
                                friendUserDao.d(a3);
                            } else {
                                DBManager.m3631a().f5565e.m3589a(a2.f5842u.longValue());
                                DBManager.m3631a().f5566f.m3582e(a2.f5842u.longValue(), currentTimeMillis - 1, CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber());
                                DBManager.m3631a().f5566f.m3566a(currentTimeMillis, CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber(), CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT.getNumber(), a2.f5842u.longValue(), a2.f5842u.longValue(), StringUtils.m4461a(2131165286), currentTimeMillis, DBManager.f5541D, 0, DBManager.f5548K, a2, true);
                                if (socialMsg != null) {
                                    socialMsg.f5994c = Integer.valueOf(DBManager.f5540C);
                                }
                            }
                        } else {
                            friendPushMsg.getEFriendMessageType();
                            FRIEND_MESSAGE_TYPE friend_message_type = FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_DELETE_FRIEND;
                            a2.f5826e = Integer.valueOf(USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND.getNumber());
                        }
                        if (!(friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_DELETE_FRIEND || socialMsg == null)) {
                            synchronized (socialMsg) {
                                Long l;
                                socialMsg.f6002k = a2;
                                if (a2 == null) {
                                    l = null;
                                } else {
                                    l = a2.f5822a;
                                }
                                socialMsg.f5995d = l;
                                socialMsg.f6003l = socialMsg.f5995d;
                            }
                        }
                        try {
                            FriendshipChain a4 = DBManager.m3631a().f5562b.m3650a(a2.f5842u);
                            if (a4 != null) {
                                FriendshipChainDao friendshipChainDao = this.f5609a.f6433H;
                                if (a2.f5826e.intValue() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND.getNumber()) {
                                    a4.f5850c = Integer.valueOf(DBManager.f5544G);
                                } else if (a2.f5826e.intValue() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND.getNumber()) {
                                    a4.f5850c = Integer.valueOf(DBManager.f5546I);
                                }
                                friendshipChainDao.d(a4);
                            }
                            friendUserDao.d(a2);
                            if (socialMsg != null) {
                                aVar.d(socialMsg);
                            }
                        } catch (Exception e) {
                            exception = e;
                            i2 = i;
                        }
                    }
                    i3 = i;
                }
            }
            this.f5610b.c();
            this.f5610b.b();
            i2 = i3;
        } catch (Exception e2) {
            Exception exception2 = e2;
            i2 = i3;
            exception = exception2;
            try {
                exception.printStackTrace();
                NetworkUtil.m4073a();
                NetworkUtil.m4109a(newBuilder);
                return i2;
            } finally {
                this.f5610b.b();
            }
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4109a(newBuilder);
        return i2;
    }
}
