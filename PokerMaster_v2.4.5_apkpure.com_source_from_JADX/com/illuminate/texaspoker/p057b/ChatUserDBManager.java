package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.ChatUserDao;
import com.illuminate.texaspoker.dao.ChatUserDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.FriendUserDao;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPoker.CHAT_ROOM_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_USER_LEVEL;
import com.texaspoker.moment.TexasPokerHttpClub.ClubUserInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.c.d;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.f */
public final class ChatUserDBManager {
    public DaoSession f5528a;
    private a f5529b;

    public ChatUserDBManager(a aVar, DaoSession daoSession) {
        this.f5529b = aVar;
        this.f5528a = daoSession;
    }

    public final List<ChatUser> m3610a(long j) {
        g a = g.a(this.f5528a.f6427B);
        a.a(Properties.f6194c.a(Long.valueOf(j)), new i[0]);
        return a.a().b();
    }

    public final List<ChatUser> m3611a(long j, String str) {
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        String str2 = "WHERE T0." + FriendUserDao.Properties.f6257q.e + " like ? AND T." + Properties.f6194c.e + " = ?";
        String[] strArr = new String[]{"%" + str + "%", String.valueOf(j)};
        a aVar = chatUserDao.d;
        StringBuilder stringBuilder = new StringBuilder();
        if (chatUserDao.f6200b == null) {
            StringBuilder stringBuilder2 = new StringBuilder("SELECT ");
            d.a(stringBuilder2, "T", chatUserDao.c());
            stringBuilder2.append(',');
            d.a(stringBuilder2, "T0", chatUserDao.f6199a.f6434I.c());
            stringBuilder2.append(',');
            d.a(stringBuilder2, "T1", chatUserDao.f6199a.f6426A.c());
            stringBuilder2.append(" FROM CHAT_USER T");
            stringBuilder2.append(" LEFT JOIN FRIEND_USER T0 ON T.\"FRIEND_USER_ID\"=T0.\"_id\"");
            stringBuilder2.append(" LEFT JOIN CHAT_ROOM T1 ON T.\"CLUB\"=T1.\"_id\"");
            stringBuilder2.append(' ');
            chatUserDao.f6200b = stringBuilder2.toString();
        }
        return chatUserDao.m3794a(aVar.a(stringBuilder.append(chatUserDao.f6200b).append(str2).toString(), strArr));
    }

    public final ChatUser m3609a(long j, long j2) {
        g a = g.a(this.f5528a.f6427B);
        a.a(Properties.f6194c.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6197f.a(Long.valueOf(j2)), new i[0]);
        return (ChatUser) a.a().c();
    }

    public final List<ChatUser> m3615b(long j) {
        g a = g.a(this.f5528a.f6427B);
        a.a(Properties.f6197f.a(Long.valueOf(j)), new i[0]);
        return a.a().b();
    }

    public final void m3613a(ChatRoom chatRoom, FriendUser friendUser) {
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        ChatUser a = m3609a(chatRoom.f5741b.longValue(), friendUser.f5842u.longValue());
        if (a == null) {
            a = new ChatUser();
        }
        a.f5768c = chatRoom.f5741b;
        a.f5771f = friendUser.f5842u;
        a.m3730a(friendUser);
        a.m3729a(chatRoom);
        chatUserDao.d(a);
    }

    public final void m3616b(long j, long j2) {
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        ChatUser a = m3609a(j, j2);
        if (a != null) {
            chatUserDao.e(a);
        }
    }

    public final void m3614a(List<UserBaseInfoNet> list, CHAT_ROOM_MESSAGE_TYPE chat_room_message_type, ChatRoom chatRoom) {
        boolean z;
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        if (chat_room_message_type == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_ENTER) {
            z = true;
        } else if (chat_room_message_type == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_INVITE) {
            z = true;
        } else if (chat_room_message_type == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_KICK) {
            z = false;
        } else if (chat_room_message_type == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_LEAVE) {
            z = false;
        } else {
            z = false;
        }
        for (UserBaseInfoNet userBaseInfoNet : list) {
            if (z) {
                m3613a(chatRoom, DBManager.m3631a().f5563c.m3641a(userBaseInfoNet, false));
            } else {
                ChatUser a = m3609a(chatRoom.f5741b.longValue(), userBaseInfoNet.getUuid());
                if (a != null) {
                    chatUserDao.e(a);
                }
            }
        }
    }

    public final void m3612a(long j, List<ClubUserInfo> list) {
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        ChatRoomDao chatRoomDao = this.f5528a.f6426A;
        this.f5529b.a();
        try {
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(j, 2);
            for (ChatUser chatUser : m3610a(j)) {
                Object obj;
                for (ClubUserInfo stUserBaseInfo : list) {
                    if (chatUser.f5771f.longValue() == stUserBaseInfo.getStUserBaseInfo().getUuid()) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    chatUserDao.e(chatUser);
                }
            }
            for (ClubUserInfo clubUserInfo : list) {
                FriendUser a2 = DBManager.m3631a().f5563c.m3641a(clubUserInfo.getStUserBaseInfo(), false);
                ChatUserDao chatUserDao2 = this.f5528a.f6427B;
                ChatUser a3 = m3609a(j, clubUserInfo.getStUserBaseInfo().getUuid());
                if (a3 == null) {
                    a3 = new ChatUser();
                }
                a3.f5768c = Long.valueOf(j);
                a3.f5771f = Long.valueOf(clubUserInfo.getStUserBaseInfo().getUuid());
                a3.m3730a(DBManager.m3631a().f5563c.m3641a(clubUserInfo.getStUserBaseInfo(), false));
                a3.f5767b = Integer.valueOf(clubUserInfo.getEClubUserLevel().getNumber());
                a3.m3729a(a);
                chatUserDao2.d(a3);
                if (a2.f5842u.longValue() == a.f5748i.longValue()) {
                    a.m3727a(a2);
                    chatRoomDao.d(a);
                }
                if (clubUserInfo.getStUserBaseInfo().getUuid() == SharedPreferencesManager.m4308b()) {
                    if (clubUserInfo.getEClubUserLevel() == CLUB_USER_LEVEL.CLUB_USER_SENIOR) {
                        a.f5734U = Boolean.valueOf(true);
                    } else if (clubUserInfo.getEClubUserLevel() == CLUB_USER_LEVEL.CLUB_USER_CREATOR) {
                        a.f5734U = Boolean.valueOf(true);
                    } else {
                        a.f5734U = Boolean.valueOf(false);
                    }
                    chatRoomDao.d(a);
                }
            }
            this.f5529b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5529b.b();
        }
    }

    public final void m3617b(long j, List<UserBaseInfoNet> list) {
        ChatUserDao chatUserDao = this.f5528a.f6427B;
        ChatRoomDao chatRoomDao = this.f5528a.f6426A;
        this.f5529b.a();
        try {
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(j, 2);
            for (ChatUser chatUser : m3610a(j)) {
                Object obj;
                for (UserBaseInfoNet uuid : list) {
                    if (chatUser.f5771f.longValue() == uuid.getUuid()) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    chatUserDao.e(chatUser);
                }
            }
            for (UserBaseInfoNet userBaseInfoNet : list) {
                if (userBaseInfoNet.getUuid() == SharedPreferencesManager.m4308b()) {
                    a.f5717D = Boolean.valueOf(true);
                    chatRoomDao.d(a);
                }
                FriendUser a2 = DBManager.m3631a().f5563c.m3641a(userBaseInfoNet, false);
                m3613a(a, a2);
                if (a2.f5842u.longValue() == a.f5748i.longValue()) {
                    a.m3727a(a2);
                    chatRoomDao.d(a);
                }
            }
            this.f5529b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5529b.b();
        }
    }
}
