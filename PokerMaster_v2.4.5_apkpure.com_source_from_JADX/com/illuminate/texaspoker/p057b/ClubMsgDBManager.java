package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.ClubMsgDao;
import com.illuminate.texaspoker.dao.ClubMsgDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPoker.CLUB_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CSSystemClubMsgRsp;
import com.texaspoker.moment.TexasPoker.CSSystemClubMsgRsp.Builder;
import com.texaspoker.moment.TexasPoker.ClubPushMsg;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.i */
public final class ClubMsgDBManager {
    public DaoSession f5534a;
    private a f5535b;

    public ClubMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5535b = aVar;
        this.f5534a = daoSession;
    }

    public final long m3623a() {
        g a = g.a(this.f5534a.f6430E);
        a.a(Properties.f6217c.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        return a.b();
    }

    public final long m3624a(long j) {
        g a = g.a(this.f5534a.f6430E);
        a.a(Properties.f6217c.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        a.a(Properties.f6220f.a(Long.valueOf(j)), new i[0]);
        return a.b();
    }

    public final List<ClubMsg> m3627b(long j) {
        g a = g.a(this.f5534a.f6430E);
        a.a(Properties.f6220f.a(Long.valueOf(j)), new i[0]);
        a.b(new f[]{Properties.f6221g});
        return a.a().b();
    }

    public final ClubMsg m3625a(long j, long j2) {
        g a = g.a(this.f5534a.f6430E);
        a.a(Properties.f6218d.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6220f.a(Long.valueOf(j)), new i[0]);
        return (ClubMsg) a.a().c();
    }

    public final void m3628b(long j, long j2) {
        ClubMsgDao clubMsgDao = this.f5534a.f6430E;
        ClubMsg a = m3625a(j2, j);
        if (a != null) {
            clubMsgDao.e(a);
        }
    }

    public final void m3629c(long j) {
        ClubMsgDao clubMsgDao = this.f5534a.f6430E;
        this.f5535b.a();
        try {
            g a = g.a(clubMsgDao);
            a.a(Properties.f6217c.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
            a.a(Properties.f6220f.a(Long.valueOf(j)), new i[0]);
            List<ClubMsg> b = a.a().b();
            if (b.size() > 0) {
                for (ClubMsg clubMsg : b) {
                    clubMsg.f5795c = Integer.valueOf(DBManager.f5540C);
                    clubMsgDao.d(clubMsg);
                }
            }
            this.f5535b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5535b.b();
        }
    }

    public final void m3626a(List<ClubPushMsg> list) {
        ClubMsgDao clubMsgDao = this.f5534a.f6430E;
        ChatRoomDao chatRoomDao = this.f5534a.f6426A;
        this.f5535b.a();
        Builder newBuilder = CSSystemClubMsgRsp.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        for (ClubPushMsg clubPushMsg : list) {
            DBManager.m3631a().f5565e.m3593a(clubPushMsg.getStClubBaseInfo(), 0, false);
            if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_APPLY) {
                if (clubPushMsg.getStFromUser().getUuid() != SharedPreferencesManager.m4308b()) {
                    ClubMsg clubMsg;
                    ClubMsgDao clubMsgDao2 = this.f5534a.f6430E;
                    ClubMsg a = m3625a(clubPushMsg.getStClubBaseInfo().getLClubID(), clubPushMsg.getStFromUser().getUuid());
                    if (a == null) {
                        clubMsg = new ClubMsg();
                    } else {
                        clubMsg = a;
                    }
                    clubMsg.f5800h = Long.valueOf(clubPushMsg.getLMsgID());
                    clubMsg.f5794b = Integer.valueOf(clubPushMsg.getEClubMessageType().getNumber());
                    clubMsg.f5796d = Long.valueOf(clubPushMsg.getStFromUser().getUuid());
                    clubMsg.f5798f = Long.valueOf(clubPushMsg.getStClubBaseInfo().getLClubID());
                    clubMsg.f5799g = Long.valueOf(clubPushMsg.getLCreateTime());
                    clubMsg.f5802j = clubPushMsg.getSMsg();
                    DBManager.m3631a().f5565e.m3593a(clubPushMsg.getStClubBaseInfo(), 0, false);
                    FriendUser a2 = DBManager.m3631a().f5563c.m3641a(clubPushMsg.getStFromUser(), false);
                    synchronized (clubMsg) {
                        Long l;
                        clubMsg.f5804l = a2;
                        if (a2 == null) {
                            l = null;
                        } else {
                            l = a2.f5822a;
                        }
                        clubMsg.f5797e = l;
                        clubMsg.f5807o = clubMsg.f5797e;
                    }
                    try {
                        clubMsgDao2.d(clubMsg);
                        clubMsg.f5795c = Integer.valueOf(DBManager.f5541D);
                        clubMsgDao.d(clubMsg);
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.f5535b.b();
                        return;
                    } catch (Throwable th) {
                        this.f5535b.b();
                    }
                }
            } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_REMOVE || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_ACCEPT || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_QUIT || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_ENTER || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_SENIOR || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_JIUNIOR || clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_FUND) {
                ChatRoom a3;
                if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_REMOVE) {
                    if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                        a3 = DBManager.m3631a().f5565e.m3590a(clubPushMsg.getStClubBaseInfo().getLClubID(), 2);
                        a3.f5734U = Boolean.valueOf(false);
                        chatRoomDao.d(a3);
                    }
                    m3628b(clubPushMsg.getStToUser().getUuid(), clubPushMsg.getStClubBaseInfo().getLClubID());
                } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_ACCEPT) {
                    m3622a(clubPushMsg);
                } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_QUIT) {
                    if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                        a3 = DBManager.m3631a().f5565e.m3590a(clubPushMsg.getStClubBaseInfo().getLClubID(), 2);
                        a3.f5734U = Boolean.valueOf(false);
                        chatRoomDao.d(a3);
                    }
                    m3628b(clubPushMsg.getStFromUser().getUuid(), clubPushMsg.getStClubBaseInfo().getLClubID());
                } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_SENIOR) {
                    if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                        a3 = DBManager.m3631a().f5565e.m3590a(clubPushMsg.getStClubBaseInfo().getLClubID(), 2);
                        a3.f5734U = Boolean.valueOf(true);
                        chatRoomDao.d(a3);
                    }
                } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_JIUNIOR && clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                    a3 = DBManager.m3631a().f5565e.m3590a(clubPushMsg.getStClubBaseInfo().getLClubID(), 2);
                    a3.f5734U = Boolean.valueOf(false);
                    chatRoomDao.d(a3);
                }
                long lClubID = clubPushMsg.getStClubBaseInfo().getLClubID();
                if (DBManager.m3631a().f5566f.m3567a(clubPushMsg.getLMsgID(), lClubID, 2) == null) {
                    DBManager.m3631a().f5566f.m3582e(lClubID, clubPushMsg.getLCreateTime(), 2);
                    DBManager.m3631a();
                    ChatMsgDBManager.m3563a(clubPushMsg);
                }
            } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_DENY) {
                m3622a(clubPushMsg);
            }
            newBuilder.addVMsgIds(clubPushMsg.getLMsgID());
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4105a(newBuilder);
        this.f5535b.c();
        this.f5535b.b();
    }

    private ClubMsg m3622a(ClubPushMsg clubPushMsg) {
        ClubMsgDao clubMsgDao = this.f5534a.f6430E;
        ClubMsg a = m3625a(clubPushMsg.getStClubBaseInfo().getLClubID(), clubPushMsg.getStToUser().getUuid());
        if (a != null) {
            a.f5800h = Long.valueOf(clubPushMsg.getLMsgID());
            a.f5799g = Long.valueOf(clubPushMsg.getLCreateTime());
            a.f5794b = Integer.valueOf(clubPushMsg.getEClubMessageType().getNumber());
            a.f5803k = clubPushMsg.getStFromUser().getStrNick();
            clubMsgDao.d(a);
        }
        return a;
    }
}
