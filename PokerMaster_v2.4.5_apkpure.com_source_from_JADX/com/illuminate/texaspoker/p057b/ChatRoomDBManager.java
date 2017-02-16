package com.illuminate.texaspoker.p057b;

import android.content.Intent;
import android.util.Log;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.ChatMsgDao;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.ChatRoomDao.Properties;
import com.illuminate.texaspoker.dao.ChatUserDao;
import com.illuminate.texaspoker.dao.ClubMsgDao;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.GameRoomDao;
import com.illuminate.texaspoker.dao.LeagueMsgDao;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPoker.CSSystemQuickGameRoomMsRspg;
import com.texaspoker.moment.TexasPoker.CSSystemQuickGameRoomMsRspg.Builder;
import com.texaspoker.moment.TexasPoker.ChatRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.QUICK_GAME_ROOM_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCSystemQuickGameRoomMsg;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpClub.ClubManagerBaseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.e */
public final class ChatRoomDBManager {
    public a f5526a;
    public DaoSession f5527b;

    public ChatRoomDBManager(a aVar, DaoSession daoSession) {
        this.f5526a = aVar;
        this.f5527b = daoSession;
    }

    public final ChatRoom m3590a(long j, int i) {
        g a = g.a(this.f5527b.f6426A);
        a.a(Properties.f6166b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6153K.a(Integer.valueOf(i)), new i[0]);
        ChatRoom chatRoom = (ChatRoom) a.a().c();
        a.a().b();
        return chatRoom;
    }

    private List<ChatRoom> m3584a(boolean z) {
        g a = g.a(this.f5527b.f6426A);
        a.a(Properties.f6153K.a(Integer.valueOf(CHAT_TYPE.CHAT_TYPE_GROUP.getNumber())), new i[0]);
        a.a(Properties.f6144B.a(Boolean.valueOf(z)), new i[0]);
        a.b(new f[]{Properties.f6170f});
        return a.a().b();
    }

    public final long m3588a() {
        g a = g.a(this.f5527b.f6426A);
        a.a(Properties.f6153K.a(Integer.valueOf(CHAT_TYPE.CHAT_TYPE_GROUP.getNumber())), new i[0]);
        a.a(Properties.f6144B.a(Boolean.valueOf(false)), new i[0]);
        a.a(Properties.f6146D.a(Boolean.valueOf(true)), new i[0]);
        a.a(Properties.f6147E.a(Boolean.valueOf(false)), new i[0]);
        return a.b();
    }

    public final long m3601b() {
        g a = g.a(this.f5527b.f6426A);
        a.a(Properties.f6144B.a(Boolean.valueOf(true)), new i[0]);
        a.a(Properties.f6146D.a(Boolean.valueOf(true)), new i[0]);
        a.a(Properties.f6173i.a(Long.valueOf(SharedPreferencesManager.m4308b())), new i[0]);
        return a.b();
    }

    public final List<ChatRoom> m3605c() {
        g a = g.a(this.f5527b.f6426A);
        a.a(Properties.f6144B.a(Boolean.valueOf(true)), new i[0]);
        a.a(Properties.f6146D.a(Boolean.valueOf(true)), new i[0]);
        a.b(new f[]{Properties.f6170f});
        return a.a().b();
    }

    public final ChatRoom m3589a(long j) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatRoom a = m3590a(j, CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber());
        if (a == null) {
            a = new ChatRoom();
            a.f5718E = Boolean.valueOf(false);
            a.f5715B = Boolean.valueOf(false);
        }
        a.f5741b = Long.valueOf(j);
        a.f5724K = Integer.valueOf(CHAT_TYPE.CHAT_TYPE_SINGLE.getNumber());
        a.f5731R = Integer.valueOf(0);
        a.f5748i = Long.valueOf(SharedPreferencesManager.m4308b());
        a.f5730Q = Integer.valueOf(0);
        a.f5732S = Integer.valueOf(0);
        a.f5733T = Integer.valueOf(0);
        a.m3727a(DBManager.m3631a().f5563c.m3639a(j));
        chatRoomDao.d(a);
        return a;
    }

    public final ChatRoom m3592a(ChatRoomBaseInfo chatRoomBaseInfo, long j) {
        return m3583a(chatRoomBaseInfo.getLChatRoomId(), CHAT_TYPE.CHAT_TYPE_GROUP, chatRoomBaseInfo.getStrRoomName(), chatRoomBaseInfo.getStrRoomTempName(), chatRoomBaseInfo.getNMaxMembers(), chatRoomBaseInfo.getLCreateUser(), chatRoomBaseInfo.getNOwnerCreate(), chatRoomBaseInfo.getNOwnerInvite(), chatRoomBaseInfo.getStrSmallRoomIcon(), chatRoomBaseInfo.getIMute(), j, chatRoomBaseInfo.getStrRoomIcon(), chatRoomBaseInfo.getNCurMembers());
    }

    private ChatRoom m3583a(long j, CHAT_TYPE chat_type, String str, String str2, int i, long j2, int i2, int i3, String str3, int i4, long j3, String str4, int i5) {
        ChatRoom a = m3590a(j, chat_type.getNumber());
        if (a == null) {
            a = new ChatRoom();
            a.f5714A = Boolean.valueOf(true);
            a.f5718E = Boolean.valueOf(false);
            a.f5715B = Boolean.valueOf(false);
            a.f5719F = Boolean.valueOf(true);
        }
        a.f5741b = Long.valueOf(j);
        a.f5724K = Integer.valueOf(chat_type.getNumber());
        a.f5755p = str;
        a.f5757r = str2;
        a.f5731R = Integer.valueOf(i);
        a.f5748i = Long.valueOf(j2);
        a.f5730Q = Integer.valueOf(0);
        a.f5732S = Integer.valueOf(i2);
        a.f5733T = Integer.valueOf(i3);
        a.f5760u = str3;
        a.f5761v = str4;
        a.f5729P = Integer.valueOf(i5);
        if (SharedPreferencesManager.m4308b() == a.f5748i.longValue()) {
            a.f5734U = Boolean.valueOf(true);
        }
        if (i4 != -1) {
            if (i4 == 0) {
                a.f5719F = Boolean.valueOf(true);
            } else {
                a.f5719F = Boolean.valueOf(false);
            }
        }
        if (j3 != 0) {
            a.f5745f = Long.valueOf(j3);
        }
        return a;
    }

    public final void m3599a(List<ChatRoomBaseInfo> list) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        try {
            Map hashMap = new HashMap();
            for (ChatRoomBaseInfo chatRoomBaseInfo : list) {
                ChatRoom a = m3592a(chatRoomBaseInfo, 0);
                a.f5717D = Boolean.valueOf(true);
                hashMap.put(a.f5741b, chatRoomBaseInfo);
                chatRoomDao.d(a);
            }
            for (ChatRoom chatRoom : m3584a(false)) {
                if (((ChatRoomBaseInfo) hashMap.get(chatRoom.f5741b)) == null) {
                    chatRoom.f5717D = Boolean.valueOf(false);
                    chatRoomDao.d(chatRoom);
                }
            }
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final ChatRoom m3593a(ClubBaseInfo clubBaseInfo, long j, boolean z) {
        int bClubMsgMute;
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        if (z) {
            bClubMsgMute = clubBaseInfo.getBClubMsgMute();
        } else {
            bClubMsgMute = -1;
        }
        ChatRoom a = m3583a(clubBaseInfo.getLClubID(), CHAT_TYPE.CHAT_TYPE_GROUP, clubBaseInfo.getSClubName(), LetterIndexBar.SEARCH_ICON_LETTER, clubBaseInfo.getIMaxMembers(), clubBaseInfo.getStCreateUserBaseInfo().getUuid(), 1, 1, clubBaseInfo.getSSmallIcon(), bClubMsgMute, j, clubBaseInfo.getSBigIcon(), clubBaseInfo.getICurMembers());
        a.f5752m = Long.valueOf(clubBaseInfo.getLFund());
        DBManager.m3631a().f5567g.m3619a(clubBaseInfo.getLClubID(), clubBaseInfo.getSSmallAlbumsList(), clubBaseInfo.getSBigAlbumsList());
        a.f5764y = clubBaseInfo.getSDesc();
        a.f5721H = Boolean.valueOf(clubBaseInfo.hasBVerify());
        a.f5727N = Integer.valueOf(clubBaseInfo.getIClubLevel());
        a.f5726M = Integer.valueOf(clubBaseInfo.getIClubExperience());
        a.f5746g = Long.valueOf(clubBaseInfo.getLCreateTime());
        a.f5742c = Long.valueOf(clubBaseInfo.getLClubID());
        a.f5715B = Boolean.valueOf(true);
        a.f5765z = clubBaseInfo.getSClubLocation();
        if (z) {
            if (clubBaseInfo.getIManagerCreate() == 1) {
                a.f5735V = Boolean.valueOf(true);
            } else {
                a.f5735V = Boolean.valueOf(false);
            }
        }
        a.m3727a(DBManager.m3631a().f5563c.m3641a(clubBaseInfo.getStCreateUserBaseInfo(), false));
        chatRoomDao.d(a);
        return a;
    }

    public final void m3604b(List<ClubManagerBaseInfo> list) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        Map hashMap = new HashMap();
        for (ClubManagerBaseInfo clubManagerBaseInfo : list) {
            ClubBaseInfo stClubBaseInfo = clubManagerBaseInfo.getStClubBaseInfo();
            ChatRoomDao chatRoomDao2 = this.f5527b.f6426A;
            ChatRoom a = m3593a(stClubBaseInfo, 0, true);
            a.f5717D = Boolean.valueOf(true);
            chatRoomDao2.d(a);
            hashMap.put(Long.valueOf(clubManagerBaseInfo.getStClubBaseInfo().getLClubID()), clubManagerBaseInfo.getStClubBaseInfo());
            if (clubManagerBaseInfo.getBManager() == 1) {
                a.f5734U = Boolean.valueOf(true);
            } else if (SharedPreferencesManager.m4308b() == a.f5748i.longValue()) {
                a.f5734U = Boolean.valueOf(true);
            } else {
                try {
                    a.f5734U = Boolean.valueOf(false);
                } catch (Throwable e) {
                    e.printStackTrace();
                    Log.e("ChatRoomDBManager", e.getMessage(), e);
                } finally {
                    this.f5526a.b();
                }
            }
            chatRoomDao.d(a);
        }
        for (ChatRoom chatRoom : m3584a(true)) {
            if (((ClubBaseInfo) hashMap.get(chatRoom.f5741b)) == null) {
                chatRoom.f5717D = Boolean.valueOf(false);
                chatRoomDao.d(chatRoom);
            }
        }
        this.f5526a.c();
    }

    private ChatRoom m3587b(QuickGameRoomInfo quickGameRoomInfo) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatRoom a = m3592a(quickGameRoomInfo.getStChatRoomInfo().getStChatRoomBaseInfo(), 0);
        a.f5715B = Boolean.valueOf(false);
        a.f5717D = Boolean.valueOf(true);
        a.f5718E = Boolean.valueOf(true);
        a.f5719F = Boolean.valueOf(false);
        a.f5762w = quickGameRoomInfo.getSCryptCode();
        a.f5723J = Integer.valueOf(quickGameRoomInfo.getEQuickGameRoomStatus().getNumber());
        a.f5722I = Integer.valueOf(quickGameRoomInfo.getEGameRoomType().getNumber());
        if (quickGameRoomInfo.getEGameRoomType() != GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            a.f5750k = Long.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getLGameRoomId());
            a.f5743d = Long.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getLSmallBlinds());
            a.f5744e = Long.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getLBigBlinds());
            a.f5753n = Long.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getLDuration());
            a.f5746g = Long.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getLCreateTime());
            a.f5725L = Integer.valueOf(quickGameRoomInfo.getStGameRoomBaseInfo().getIAnte());
            if (quickGameRoomInfo.getStGameRoomBaseInfo().getLGameRoomId() > 0) {
                GameRoomDao gameRoomDao = this.f5527b.f6435J;
                GameRoom a2 = DBManager.m3631a().f5572l.m3657a(quickGameRoomInfo.getStGameRoomBaseInfo(), true);
                a2.f5861A = quickGameRoomInfo.getStGameRoomBaseInfo().getStCreateUserBaseInfo().getStrNick();
                a2.f5886j = Integer.valueOf(CREATE_ROOM_TYPE.QUICK_GAME_ROOM.getNumber());
                a2.f5863C = quickGameRoomInfo.getSCryptCode();
                gameRoomDao.d(a2);
            }
        } else {
            a.f5750k = Long.valueOf(quickGameRoomInfo.getStSNGGameRoomBaseInfo().getLGameRoomId());
            GameRoom a3 = DBManager.m3631a().f5572l.m3660a(quickGameRoomInfo.getStSNGGameRoomBaseInfo(), true);
            a3.f5863C = quickGameRoomInfo.getSCryptCode();
            this.f5527b.f6435J.d(a3);
        }
        ChatUserDao chatUserDao = this.f5527b.f6427B;
        List a4 = DBManager.m3631a().f5569i.m3610a(a.f5741b.longValue());
        int size = a4.size();
        for (int i = 0; i < size; i++) {
            ChatUser chatUser = (ChatUser) a4.get(i);
            FriendUser a5 = chatUser.m3728a();
            for (UserBaseInfoNet uuid : quickGameRoomInfo.getStChatRoomInfo().getVUserBaseInfosList()) {
                if (a5.f5842u.longValue() == uuid.getUuid()) {
                    Object obj = null;
                    break;
                }
            }
            int i2 = 1;
            if (obj != null) {
                chatUserDao.e(chatUser);
            }
        }
        for (UserBaseInfoNet userBaseInfoNet : quickGameRoomInfo.getStChatRoomInfo().getVUserBaseInfosList()) {
            if (userBaseInfoNet.getUuid() == SharedPreferencesManager.m4308b()) {
                a.f5717D = Boolean.valueOf(true);
            }
            FriendUser a6 = DBManager.m3631a().f5563c.m3641a(userBaseInfoNet, false);
            DBManager.m3631a().f5569i.m3613a(a, a6);
            if (a6.f5842u.longValue() == a.f5748i.longValue()) {
                a.m3727a(a6);
            }
        }
        chatRoomDao.d(a);
        return a;
    }

    public final void m3607c(List<QuickGameRoomInfo> list) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        try {
            Map hashMap = new HashMap();
            for (QuickGameRoomInfo quickGameRoomInfo : list) {
                ChatRoom b = m3587b(quickGameRoomInfo);
                b.f5717D = Boolean.valueOf(true);
                hashMap.put(b.f5741b, quickGameRoomInfo);
                chatRoomDao.d(b);
            }
            g a = g.a(this.f5527b.f6426A);
            a.a(Properties.f6153K.a(Integer.valueOf(CHAT_TYPE.CHAT_TYPE_GROUP.getNumber())), new i[0]);
            a.a(Properties.f6147E.a(Boolean.valueOf(true)), new i[0]);
            a.b(new f[]{Properties.f6170f});
            for (ChatRoom chatRoom : a.a().b()) {
                if (((QuickGameRoomInfo) hashMap.get(chatRoom.f5741b)) == null) {
                    m3585a(chatRoom.f5741b.longValue(), CHAT_TYPE.valueOf(chatRoom.f5724K.intValue()));
                    GameRoom a2 = DBManager.m3631a().f5572l.m3656a(chatRoom.f5750k.longValue(), chatRoom.f5741b.longValue());
                    if (a2 != null) {
                        this.f5527b.f6435J.e(a2);
                    }
                    chatRoomDao.e(chatRoom);
                }
                if (chatRoom.m3726a() == null) {
                    chatRoomDao.e(chatRoom);
                }
            }
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    private void m3585a(long j, CHAT_TYPE chat_type) {
        g a = g.a(DBManager.m3631a().f5566f.f5523a.f6469z);
        a.a(ChatMsgDao.Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(ChatMsgDao.Properties.f6136r.a(Integer.valueOf(chat_type.getNumber())), new i[0]);
        List<ChatMsg> b = a.a().b();
        ChatMsgDao chatMsgDao = this.f5527b.f6469z;
        for (ChatMsg e : b) {
            chatMsgDao.e(e);
        }
        ChatRoom a2 = m3590a(j, chat_type.getNumber());
        if (a2 != null) {
            a2.f5759t = LetterIndexBar.SEARCH_ICON_LETTER;
            a2.f5714A = Boolean.valueOf(true);
            this.f5527b.f6426A.d(a2);
        }
    }

    public final void m3596a(QuickGameRoomInfo quickGameRoomInfo) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        try {
            ChatRoom b = m3587b(quickGameRoomInfo);
            b.f5745f = Long.valueOf(System.currentTimeMillis() + RuntimeData.f6671b);
            chatRoomDao.d(b);
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final ChatRoom m3591a(ChatRoomBaseInfo chatRoomBaseInfo) {
        return m3583a(chatRoomBaseInfo.getLChatRoomId(), CHAT_TYPE.CHAT_TYPE_GROUP, chatRoomBaseInfo.getStrRoomName(), chatRoomBaseInfo.getStrRoomTempName(), chatRoomBaseInfo.getNMaxMembers(), chatRoomBaseInfo.getLCreateUser(), chatRoomBaseInfo.getNOwnerCreate(), chatRoomBaseInfo.getNOwnerInvite(), chatRoomBaseInfo.getStrSmallRoomIcon(), -1, 0, chatRoomBaseInfo.getStrSmallRoomIcon(), chatRoomBaseInfo.getNCurMembers());
    }

    public final void m3598a(ClubBaseInfo clubBaseInfo, boolean z) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatRoom a = m3593a(clubBaseInfo, 0, false);
        a.f5717D = Boolean.valueOf(z);
        chatRoomDao.d(a);
    }

    public final void m3595a(long j, List<UserBaseInfoNet> list) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatUserDao chatUserDao = this.f5527b.f6427B;
        this.f5526a.a();
        try {
            ChatRoom a = m3590a(j, 2);
            for (ChatUser chatUser : DBManager.m3631a().f5569i.m3610a(j)) {
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
                }
                FriendUser a2 = DBManager.m3631a().f5563c.m3641a(userBaseInfoNet, false);
                DBManager.m3631a().f5569i.m3613a(a, a2);
                if (a2.f5842u.longValue() == a.f5748i.longValue()) {
                    a.m3727a(a2);
                }
            }
            chatRoomDao.d(a);
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final void m3603b(ClubBaseInfo clubBaseInfo, boolean z) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        try {
            ChatRoom a = m3593a(clubBaseInfo, 0, true);
            a.f5717D = Boolean.valueOf(z);
            chatRoomDao.d(a);
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final void m3602b(long j) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatUserDao chatUserDao = this.f5527b.f6427B;
        ClubMsgDao clubMsgDao = this.f5527b.f6430E;
        LeagueMsgDao leagueMsgDao = this.f5527b.f6438M;
        this.f5526a.a();
        try {
            ChatRoom a = m3590a(j, 2);
            DBManager.m3631a().f5566f.m3574a(j, 2, true);
            for (ChatUser e : DBManager.m3631a().f5569i.m3610a(j)) {
                chatUserDao.e(e);
            }
            for (ClubMsg e2 : DBManager.m3631a().f5575o.m3627b(j)) {
                clubMsgDao.e(e2);
            }
            for (LeagueMsg e3 : DBManager.m3631a().f5582v.m3683b(j)) {
                leagueMsgDao.e(e3);
            }
            a.f5714A = Boolean.valueOf(true);
            a.f5717D = Boolean.valueOf(false);
            chatRoomDao.d(a);
            this.f5526a.c();
        } catch (Throwable e4) {
            e4.printStackTrace();
            Log.e("ChatRoomDBManager", e4.getMessage(), e4);
        } finally {
            this.f5526a.b();
        }
    }

    public final void m3606c(long j) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        ChatUserDao chatUserDao = this.f5527b.f6427B;
        this.f5526a.a();
        try {
            ChatRoom a = m3590a(j, 2);
            if (a != null) {
                DBManager.m3631a().f5566f.m3574a(j, 2, true);
                for (ChatUser e : DBManager.m3631a().f5569i.m3610a(j)) {
                    chatUserDao.e(e);
                }
                a.f5714A = Boolean.valueOf(true);
                a.f5717D = Boolean.valueOf(false);
                chatRoomDao.e(a);
            }
            this.f5526a.c();
        } catch (Throwable e2) {
            e2.printStackTrace();
            Log.e("ChatRoomDBManager", e2.getMessage(), e2);
        } finally {
            this.f5526a.b();
        }
    }

    public final void m3600a(List<ClubBaseInfo> list, long j) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        this.f5526a.a();
        try {
            FriendUser a = DBManager.m3631a().f5563c.m3639a(j);
            List<ChatUser> b = DBManager.m3631a().f5569i.m3615b(j);
            ChatUserDao chatUserDao = this.f5527b.f6427B;
            for (ChatUser chatUser : b) {
                Object obj;
                for (ClubBaseInfo clubBaseInfo : list) {
                    if (chatUser.m3731b() == null || !chatUser.m3731b().f5715B.booleanValue()) {
                        if (clubBaseInfo.getLClubID() == chatUser.f5768c.longValue()) {
                        }
                    }
                    obj = null;
                    break;
                }
                int i = 1;
                if (obj != null) {
                    chatUserDao.e(chatUser);
                }
            }
            for (ClubBaseInfo a2 : list) {
                ChatRoom a3 = m3593a(a2, 0, false);
                chatRoomDao.d(a3);
                DBManager.m3631a().f5569i.m3613a(a3, a);
            }
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final void m3608d(long j) {
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        GameRoomDao gameRoomDao = this.f5527b.f6435J;
        this.f5526a.a();
        try {
            ChatRoom a = m3590a(j, 2);
            if (a != null) {
                DBManager.m3631a().f5566f.m3574a(a.f5741b.longValue(), a.f5724K.intValue(), true);
                GameRoom a2 = DBManager.m3631a().f5572l.m3656a(a.f5750k.longValue(), a.f5741b.longValue());
                chatRoomDao.e(a);
                if (a2 != null) {
                    DBManager.m3631a().f5579s.m3561a(a2.f5897u.longValue());
                    gameRoomDao.e(a2);
                }
            }
            this.f5526a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatRoomDBManager", e.getMessage(), e);
        } finally {
            this.f5526a.b();
        }
    }

    public final List<Long> m3594a(SCSystemQuickGameRoomMsg sCSystemQuickGameRoomMsg) {
        List arrayList = new ArrayList();
        GameRoomDao gameRoomDao = this.f5527b.f6435J;
        ChatRoomDao chatRoomDao = this.f5527b.f6426A;
        Builder newBuilder = CSSystemQuickGameRoomMsRspg.newBuilder();
        this.f5526a.a();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        for (QuickGameRoomPushMsg quickGameRoomPushMsg : sCSystemQuickGameRoomMsg.getVMsgsList()) {
            newBuilder.addVMsgIds(quickGameRoomPushMsg.getLMsgID());
            ChatRoom a = m3590a(quickGameRoomPushMsg.getLChatRoomID(), 2);
            new StringBuilder("quickGameRoomPushMsg.getEMessageType() = ").append(quickGameRoomPushMsg.getEMessageType());
            FriendUser a2;
            if (quickGameRoomPushMsg.getEMessageType() == QUICK_GAME_ROOM_MESSAGE_TYPE.QUICK_GAME_ROOM_MESSAGE_ENTER) {
                a2 = DBManager.m3631a().f5563c.m3641a(quickGameRoomPushMsg.getStFromUser(), false);
                if (a != null) {
                    DBManager.m3631a().f5569i.m3613a(a, a2);
                    ChatRoomDBManager.m3586a("NOTIFY_REFRESH_QUICK_USER", a.f5741b, a2.f5842u, Boolean.valueOf(true));
                }
            } else if (quickGameRoomPushMsg.getEMessageType() == QUICK_GAME_ROOM_MESSAGE_TYPE.QUICK_GAME_ROOM_MESSAGE_QUIT) {
                a2 = DBManager.m3631a().f5563c.m3641a(quickGameRoomPushMsg.getStFromUser(), false);
                if (a != null) {
                    ChatUserDBManager chatUserDBManager = DBManager.m3631a().f5569i;
                    r6 = a.f5741b.longValue();
                    long longValue = a2.f5842u.longValue();
                    ChatUserDao chatUserDao = chatUserDBManager.f5528a.f6427B;
                    ChatUser a3 = chatUserDBManager.m3609a(r6, longValue);
                    if (a3 != null) {
                        chatUserDao.e(a3);
                    }
                    ChatRoomDBManager.m3586a("NOTIFY_REFRESH_QUICK_USER", a.f5741b, a2.f5842u, Boolean.valueOf(false));
                }
            } else {
                try {
                    GameRoom a4;
                    if (quickGameRoomPushMsg.getEMessageType() == QUICK_GAME_ROOM_MESSAGE_TYPE.QUICK_GAME_ROOM_MESSAGE_REMOVEROOM) {
                        arrayList.add(Long.valueOf(quickGameRoomPushMsg.getLChatRoomID()));
                        if (a != null) {
                            DBManager.m3631a().f5566f.m3574a(a.f5741b.longValue(), a.f5724K.intValue(), true);
                            a4 = DBManager.m3631a().f5572l.m3656a(a.f5750k.longValue(), a.f5741b.longValue());
                            if (a4 != null) {
                                DBManager.m3631a().f5579s.m3561a(a4.f5897u.longValue());
                                gameRoomDao.e(a4);
                            }
                            chatRoomDao.e(a);
                        }
                    } else if (quickGameRoomPushMsg.getEMessageType() == QUICK_GAME_ROOM_MESSAGE_TYPE.QUICK_GAME_ROOM_MESSAGE_FINISH) {
                        arrayList.add(Long.valueOf(quickGameRoomPushMsg.getLChatRoomID()));
                        if (a != null) {
                            DBManager.m3631a().f5566f.m3574a(a.f5741b.longValue(), a.f5724K.intValue(), true);
                            a4 = DBManager.m3631a().f5572l.m3656a(a.f5750k.longValue(), a.f5741b.longValue());
                            if (a4 != null) {
                                DBManager.m3631a().f5579s.m3561a(a4.f5897u.longValue());
                                gameRoomDao.e(a4);
                            }
                            chatRoomDao.e(a);
                        }
                    } else if (quickGameRoomPushMsg.getEMessageType() == QUICK_GAME_ROOM_MESSAGE_TYPE.QUICK_GAME_ROOM_MESSAGE_STARTGAME) {
                        if (a != null) {
                            a.f5723J = Integer.valueOf(2);
                            a.f5750k = Long.valueOf(quickGameRoomPushMsg.getLGameRoomID());
                            chatRoomDao.d(a);
                            r6 = RuntimeData.f6671b + System.currentTimeMillis();
                            DBManager.m3631a().f5566f.m3582e(quickGameRoomPushMsg.getLChatRoomID(), r6, 2);
                            int i = DBManager.f5555y;
                            DBManager.m3631a().f5566f.m3566a(1 + r6, 2, r27, SharedPreferencesManager.m4308b(), quickGameRoomPushMsg.getLChatRoomID(), StringUtils.m4461a(2131165852), r6 + 1, DBManager.f5540C, 0, DBManager.f5548K, null, true);
                        }
                        ChatRoomDBManager.m3586a("NOTIFY_START_QUICK_GAME", Long.valueOf(quickGameRoomPushMsg.getLChatRoomID()), Long.valueOf(quickGameRoomPushMsg.getLGameRoomID()));
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                    Log.e("ChatRoomDBManager", e.getMessage(), e);
                } finally {
                    this.f5526a.b();
                }
            }
        }
        this.f5526a.c();
        NetworkUtil.m4073a();
        NetworkUtil.m4107a(newBuilder);
        return arrayList;
    }

    private static void m3586a(String str, Object... objArr) {
        Intent intent = new Intent();
        intent.setAction("com.illuminate.texaspoker.notifyaction");
        intent.putExtra("NOTIFY_NAME", str);
        Object arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        intent.putExtra("NOTIFY_DATA", arrayList);
        BaseApplication.m3548a().sendBroadcast(intent);
    }

    public final void m3597a(ClubBaseInfo clubBaseInfo) {
        m3593a(clubBaseInfo, 0, true);
    }
}
