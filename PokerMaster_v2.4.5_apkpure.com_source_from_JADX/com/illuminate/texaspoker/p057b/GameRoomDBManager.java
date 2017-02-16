package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.GameRoomDao;
import com.illuminate.texaspoker.dao.GameRoomDao.Properties;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPoker.CSSystemGameRoomMsgRsp;
import com.texaspoker.moment.TexasPoker.CSSystemGameRoomMsgRsp.Builder;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV4Rsp;
import com.texaspoker.moment.TexasPoker.SNGGameRoomBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.p */
public final class GameRoomDBManager {
    public DaoSession f5595a;
    private a f5596b;

    public GameRoomDBManager(a aVar, DaoSession daoSession) {
        this.f5596b = aVar;
        this.f5595a = daoSession;
    }

    public final List<GameRoom> m3661a() {
        g a = g.a(this.f5595a.f6435J);
        a.a(Properties.f6312u.c(Integer.valueOf(0)), new i[0]);
        a.b(new f[]{Properties.f6308q});
        return a.a().b();
    }

    public final GameRoom m3656a(long j, long j2) {
        g a = g.a(this.f5595a.f6435J);
        a.a(Properties.f6312u.a(Long.valueOf(j)), new i[0]);
        if (j2 != 0) {
            a.a(Properties.f6315x.a(Long.valueOf(j2)), new i[0]);
        }
        return (GameRoom) a.a().c();
    }

    public final List<GameRoom> m3662a(long j) {
        g a = g.a(this.f5595a.f6435J);
        a.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
        a.b(new f[]{Properties.f6308q});
        return a.a().b();
    }

    public final void m3666a(List<GameRoomPushMsg> list) {
        this.f5596b.a();
        try {
            Builder newBuilder = CSSystemGameRoomMsgRsp.newBuilder();
            for (GameRoomPushMsg gameRoomPushMsg : list) {
                m3658a(gameRoomPushMsg.getStGameRoomInfo(), false);
                newBuilder.addVMsgIds(gameRoomPushMsg.getLMsgID());
            }
            newBuilder.setUuid(SharedPreferencesManager.m4308b());
            NetworkUtil.m4073a();
            NetworkUtil.m4106a(newBuilder);
            this.f5596b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }

    public final void m3668b(long j, long j2) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        GameRoom a = m3656a(j, j2);
        if (a != null) {
            DBManager.m3631a().f5579s.m3561a(j);
            gameRoomDao.e(a);
        }
    }

    public final void m3663a(long j, List<GameRoomBaseInfo> list) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        this.f5596b.a();
        try {
            for (GameRoomBaseInfo a : list) {
                GameRoom a2 = m3657a(a, true);
                a2.f5900x = Long.valueOf(j);
                gameRoomDao.d(a2);
            }
            g a3 = g.a(this.f5595a.f6435J);
            a3.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
            a3.a(Properties.f6302k.b(Integer.valueOf(2)), new i[0]);
            a3.b(new f[]{Properties.f6308q});
            for (GameRoom gameRoom : a3.a().b()) {
                Object obj;
                for (GameRoomBaseInfo a4 : list) {
                    if (a4.getLGameRoomId() == gameRoom.f5897u.longValue() && a4.getLChatRoomID() == gameRoom.f5900x.longValue()) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    DBManager.m3631a().f5579s.m3561a(gameRoom.f5897u.longValue());
                    gameRoomDao.e(gameRoom);
                }
            }
            this.f5596b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }

    public final void m3669b(long j, List<SNGGameRoomBaseInfo> list) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        this.f5596b.a();
        try {
            for (SNGGameRoomBaseInfo a : list) {
                GameRoom a2 = m3660a(a, true);
                a2.f5900x = Long.valueOf(j);
                gameRoomDao.d(a2);
            }
            g a3 = g.a(this.f5595a.f6435J);
            a3.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
            a3.a(Properties.f6302k.a(Integer.valueOf(2)), new i[0]);
            a3.b(new f[]{Properties.f6308q});
            for (GameRoom gameRoom : a3.a().b()) {
                Object obj;
                for (SNGGameRoomBaseInfo a4 : list) {
                    if (a4.getLGameRoomId() == gameRoom.f5897u.longValue() && a4.getLFromRoomID() == gameRoom.f5900x.longValue()) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    DBManager.m3631a().f5579s.m3561a(gameRoom.f5897u.longValue());
                    gameRoomDao.e(gameRoom);
                }
            }
            this.f5596b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }

    public final void m3664a(GameRoomInfo gameRoomInfo) {
        this.f5596b.a();
        try {
            m3658a(gameRoomInfo, true);
            this.f5596b.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }

    public final GameRoom m3658a(GameRoomInfo gameRoomInfo, boolean z) {
        GameRoom a;
        if (gameRoomInfo.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            a = m3660a(gameRoomInfo.getStSNGGameRoomBaseInfo(), z);
        } else {
            a = m3657a(gameRoomInfo.getStGameRoomBaseInfo(), z);
        }
        a.f5887k = Integer.valueOf(gameRoomInfo.getEGameRoomType().getNumber());
        this.f5595a.f6435J.d(a);
        return a;
    }

    public final GameRoom m3657a(GameRoomBaseInfo gameRoomBaseInfo, boolean z) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        GameRoom a = m3656a(gameRoomBaseInfo.getLGameRoomId(), gameRoomBaseInfo.getLChatRoomID());
        if (a == null) {
            a = new GameRoom();
            a.f5897u = Long.valueOf(gameRoomBaseInfo.getLGameRoomId());
            a.f5878b = Boolean.valueOf(true);
            a.f5881e = Boolean.valueOf(false);
        }
        if (gameRoomBaseInfo.getECreateRoomType() == CREATE_ROOM_TYPE.QUICK_GAME_ROOM) {
            a.f5879c = Boolean.valueOf(true);
        } else {
            a.f5879c = Boolean.valueOf(false);
        }
        if (z) {
            if (gameRoomBaseInfo.getBInGame() == 1) {
                a.f5881e = Boolean.valueOf(true);
            } else {
                a.f5881e = Boolean.valueOf(false);
            }
        }
        a.f5864D = gameRoomBaseInfo.getStrRoomName();
        a.f5865E = Long.valueOf(gameRoomBaseInfo.getStCreateUserBaseInfo().getUuid());
        a.m3737a(DBManager.m3631a().f5563c.m3641a(gameRoomBaseInfo.getStCreateUserBaseInfo(), false));
        a.f5885i = Integer.valueOf(gameRoomBaseInfo.getBPrivateRoom());
        a.f5898v = Long.valueOf(gameRoomBaseInfo.getLSmallBlinds());
        a.f5894r = Long.valueOf(gameRoomBaseInfo.getLBigBlinds());
        a.f5902z = Integer.valueOf(gameRoomBaseInfo.getIAnte());
        a.f5895s = Long.valueOf(gameRoomBaseInfo.getLBuyIn());
        if (gameRoomBaseInfo.getBBuyIn() == 1) {
            a.f5884h = Boolean.valueOf(true);
        } else {
            a.f5884h = Boolean.valueOf(false);
        }
        a.f5893q = Long.valueOf(gameRoomBaseInfo.getLCreateTime());
        a.f5896t = Long.valueOf(gameRoomBaseInfo.getLDuration());
        a.f5900x = Long.valueOf(gameRoomBaseInfo.getLChatRoomID());
        if (gameRoomBaseInfo.getBStarted() == 1) {
            a.f5880d = Boolean.valueOf(true);
        } else {
            a.f5880d = Boolean.valueOf(false);
        }
        a.f5882f = Boolean.valueOf(false);
        a.f5892p = Integer.valueOf(gameRoomBaseInfo.getIGameRoomUserNums());
        a.f5886j = Integer.valueOf(gameRoomBaseInfo.getECreateRoomType().getNumber());
        a.f5889m = Integer.valueOf(gameRoomBaseInfo.getEGameRoomSeniorType().getNumber());
        a.f5888l = Integer.valueOf(gameRoomBaseInfo.getStCreateUserBaseInfo().getEVipType().getNumber());
        a.f5891o = Integer.valueOf(gameRoomBaseInfo.getIGameRoomUserMaxNums());
        a.f5862B = gameRoomBaseInfo.getStCreateUserBaseInfo().getStrNick();
        a.f5899w = Long.valueOf(gameRoomBaseInfo.getLStartTime());
        if (gameRoomBaseInfo.getBBuyinControl() == 1) {
            a.f5883g = Boolean.valueOf(true);
        } else {
            a.f5883g = Boolean.valueOf(false);
        }
        a.f5887k = Integer.valueOf(gameRoomBaseInfo.getEGameRoomType().getNumber());
        a.f5902z = Integer.valueOf(gameRoomBaseInfo.getIAnte());
        if (gameRoomBaseInfo.getBGPSLimit() == 1) {
            a.f5868H = Boolean.valueOf(true);
        } else {
            a.f5868H = Boolean.valueOf(false);
        }
        if (gameRoomBaseInfo.getBIPLimit() == 1) {
            a.f5867G = Boolean.valueOf(true);
        } else {
            a.f5867G = Boolean.valueOf(false);
        }
        a.f5869I = Long.valueOf(gameRoomBaseInfo.getLLeagueID());
        a.f5870J = gameRoomBaseInfo.getSLeagueName();
        if (gameRoomBaseInfo.getLLeagueID() > 0) {
            if (!StringUtils.m4462a(gameRoomBaseInfo.getSFromClubName())) {
                a.f5861A = gameRoomBaseInfo.getSFromClubName();
            }
            a.f5871K = gameRoomBaseInfo.getSFromClubUrl();
            if (!StringUtils.m4462a(gameRoomBaseInfo.getSFromClubCreatorName())) {
                a.f5872L = gameRoomBaseInfo.getSFromClubCreatorName();
            }
        } else if (!StringUtils.m4462a(gameRoomBaseInfo.getSFromMsg())) {
            a.f5861A = gameRoomBaseInfo.getSFromMsg();
        } else if (StringUtils.m4462a(a.f5861A)) {
            a.f5861A = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        gameRoomDao.d(a);
        return a;
    }

    public final GameRoom m3660a(SNGGameRoomBaseInfo sNGGameRoomBaseInfo, boolean z) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        GameRoom a = m3656a(sNGGameRoomBaseInfo.getLGameRoomId(), sNGGameRoomBaseInfo.getLFromRoomID());
        if (a == null) {
            a = new GameRoom();
            a.f5897u = Long.valueOf(sNGGameRoomBaseInfo.getLGameRoomId());
            a.f5878b = Boolean.valueOf(true);
            a.f5881e = Boolean.valueOf(false);
        }
        if (sNGGameRoomBaseInfo.getECreateRoomType() == CREATE_ROOM_TYPE.QUICK_GAME_ROOM) {
            a.f5879c = Boolean.valueOf(true);
        } else {
            a.f5879c = Boolean.valueOf(false);
        }
        if (z) {
            if (sNGGameRoomBaseInfo.getBInGame() == 1) {
                a.f5881e = Boolean.valueOf(true);
            } else {
                a.f5881e = Boolean.valueOf(false);
            }
        }
        a.f5864D = sNGGameRoomBaseInfo.getStrRoomName();
        a.f5865E = Long.valueOf(sNGGameRoomBaseInfo.getStCreateUserBaseInfo().getUuid());
        a.m3737a(DBManager.m3631a().f5563c.m3641a(sNGGameRoomBaseInfo.getStCreateUserBaseInfo(), false));
        a.f5885i = Integer.valueOf(sNGGameRoomBaseInfo.getBPrivateRoom());
        a.f5898v = Long.valueOf(sNGGameRoomBaseInfo.getLSmallBlinds());
        a.f5894r = Long.valueOf(sNGGameRoomBaseInfo.getLBigBlinds());
        a.f5902z = Integer.valueOf(sNGGameRoomBaseInfo.getIAnte());
        a.f5899w = Long.valueOf(sNGGameRoomBaseInfo.getLStartTime());
        a.f5900x = Long.valueOf(sNGGameRoomBaseInfo.getLFromRoomID());
        a.f5892p = Integer.valueOf(sNGGameRoomBaseInfo.getIGameRoomUserNums());
        if (sNGGameRoomBaseInfo.getBStarted() == 1) {
            a.f5880d = Boolean.valueOf(true);
        } else {
            a.f5880d = Boolean.valueOf(false);
        }
        if (!StringUtils.m4462a(sNGGameRoomBaseInfo.getSFromMsg())) {
            a.f5861A = sNGGameRoomBaseInfo.getSFromMsg();
        } else if (StringUtils.m4462a(a.f5861A)) {
            a.f5861A = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        a.f5886j = Integer.valueOf(sNGGameRoomBaseInfo.getECreateRoomType().getNumber());
        a.f5887k = Integer.valueOf(2);
        a.f5888l = Integer.valueOf(sNGGameRoomBaseInfo.getStCreateUserBaseInfo().getEVipType().getNumber());
        a.f5891o = Integer.valueOf(sNGGameRoomBaseInfo.getIGameRoomUserMaxNums());
        a.f5862B = sNGGameRoomBaseInfo.getStCreateUserBaseInfo().getStrNick();
        a.f5890n = Integer.valueOf(sNGGameRoomBaseInfo.getESNGRoomtype().getNumber());
        a.f5893q = Long.valueOf(sNGGameRoomBaseInfo.getLCreateTime());
        if (sNGGameRoomBaseInfo.getBSignupInviting() == 1) {
            a.f5882f = Boolean.valueOf(true);
        } else {
            a.f5882f = Boolean.valueOf(false);
        }
        a.f5901y = Integer.valueOf(sNGGameRoomBaseInfo.getLCancelWaitInterval());
        if (sNGGameRoomBaseInfo.getBBuyinControl() == 1) {
            a.f5883g = Boolean.valueOf(true);
        } else {
            a.f5883g = Boolean.valueOf(false);
        }
        if (sNGGameRoomBaseInfo.getBGPSLimit() == 1) {
            a.f5868H = Boolean.valueOf(true);
        } else {
            a.f5868H = Boolean.valueOf(false);
        }
        if (sNGGameRoomBaseInfo.getBIPLimit() == 1) {
            a.f5867G = Boolean.valueOf(true);
        } else {
            a.f5867G = Boolean.valueOf(false);
        }
        a.f5869I = Long.valueOf(sNGGameRoomBaseInfo.getLLeagueID());
        a.f5870J = sNGGameRoomBaseInfo.getSLeagueName();
        gameRoomDao.d(a);
        return a;
    }

    public final void m3665a(SCGetFrontPageInfoV4Rsp sCGetFrontPageInfoV4Rsp) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        this.f5596b.a();
        try {
            for (GameRoomBaseInfo a : sCGetFrontPageInfoV4Rsp.getVGameRoomBaseInfosList()) {
                m3657a(a, true);
            }
            for (SNGGameRoomBaseInfo a2 : sCGetFrontPageInfoV4Rsp.getVSNGGameRoomBaseInfosList()) {
                m3660a(a2, true);
            }
            for (QuickGameRoomInfo quickGameRoomInfo : sCGetFrontPageInfoV4Rsp.getVQuickGameRoomInfosList()) {
                GameRoom a3;
                if (quickGameRoomInfo.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                    SNGGameRoomBaseInfo stSNGGameRoomBaseInfo = quickGameRoomInfo.getStSNGGameRoomBaseInfo();
                    if (stSNGGameRoomBaseInfo.getLGameRoomId() != 0) {
                        a3 = m3660a(stSNGGameRoomBaseInfo, true);
                        a3.f5861A = quickGameRoomInfo.getStGameRoomBaseInfo().getStCreateUserBaseInfo().getStrNick();
                        a3.f5886j = Integer.valueOf(CREATE_ROOM_TYPE.QUICK_GAME_ROOM.getNumber());
                        a3.f5863C = quickGameRoomInfo.getSCryptCode();
                        gameRoomDao.d(a3);
                    }
                } else {
                    GameRoomBaseInfo stGameRoomBaseInfo = quickGameRoomInfo.getStGameRoomBaseInfo();
                    if (stGameRoomBaseInfo.getLGameRoomId() != 0) {
                        a3 = m3657a(stGameRoomBaseInfo, true);
                        a3.f5861A = quickGameRoomInfo.getStGameRoomBaseInfo().getStCreateUserBaseInfo().getStrNick();
                        a3.f5886j = Integer.valueOf(CREATE_ROOM_TYPE.QUICK_GAME_ROOM.getNumber());
                        a3.f5863C = quickGameRoomInfo.getSCryptCode();
                        gameRoomDao.d(a3);
                    }
                }
            }
            List a4 = m3661a();
            int size = a4.size();
            for (int i = 0; i < size; i++) {
                Object obj;
                GameRoom gameRoom = (GameRoom) a4.get(i);
                int i2;
                if (gameRoom.f5879c.booleanValue()) {
                    if (gameRoom.f5887k.intValue() == 2) {
                        for (QuickGameRoomInfo quickGameRoomInfo2 : sCGetFrontPageInfoV4Rsp.getVQuickGameRoomInfosList()) {
                            if (quickGameRoomInfo2.getStSNGGameRoomBaseInfo().getLGameRoomId() == gameRoom.f5897u.longValue() && quickGameRoomInfo2.getStSNGGameRoomBaseInfo().getLFromRoomID() == gameRoom.f5900x.longValue()) {
                                obj = null;
                                break;
                            }
                        }
                        i2 = 1;
                    } else {
                        for (QuickGameRoomInfo quickGameRoomInfo22 : sCGetFrontPageInfoV4Rsp.getVQuickGameRoomInfosList()) {
                            if (quickGameRoomInfo22.getStGameRoomBaseInfo().getLGameRoomId() == gameRoom.f5897u.longValue() && quickGameRoomInfo22.getStGameRoomBaseInfo().getLChatRoomID() == gameRoom.f5900x.longValue()) {
                                obj = null;
                                break;
                            }
                        }
                        i2 = 1;
                    }
                } else if (gameRoom.f5887k.intValue() == 2) {
                    for (SNGGameRoomBaseInfo sNGGameRoomBaseInfo : sCGetFrontPageInfoV4Rsp.getVSNGGameRoomBaseInfosList()) {
                        if (sNGGameRoomBaseInfo.getLGameRoomId() == gameRoom.f5897u.longValue() && sNGGameRoomBaseInfo.getLFromRoomID() == gameRoom.f5900x.longValue()) {
                            obj = null;
                            break;
                        }
                    }
                    i2 = 1;
                } else {
                    for (GameRoomBaseInfo gameRoomBaseInfo : sCGetFrontPageInfoV4Rsp.getVGameRoomBaseInfosList()) {
                        if (gameRoomBaseInfo.getLGameRoomId() == gameRoom.f5897u.longValue() && gameRoomBaseInfo.getLChatRoomID() == gameRoom.f5900x.longValue()) {
                            obj = null;
                            break;
                        }
                    }
                    i2 = 1;
                }
                if (obj != null) {
                    DBManager.m3631a().f5579s.m3561a(gameRoom.f5897u.longValue());
                    gameRoomDao.e(gameRoom);
                }
            }
            this.f5596b.c();
        } catch (Throwable e) {
            Log.e("GameRoomDBManager", e.getMessage(), e);
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }

    public final GameRoom m3659a(PushMsg pushMsg, int i) {
        String str;
        int i2;
        long j;
        String str2;
        long parseLong;
        GameRoom a;
        long lChatRoomId;
        List vExtrasList = pushMsg.getVExtrasList();
        int size = vExtrasList.size();
        long parseLong2 = Long.parseLong((String) vExtrasList.get(1));
        long parseLong3 = Long.parseLong((String) vExtrasList.get(2));
        long parseLong4 = Long.parseLong((String) vExtrasList.get(3));
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        String str3 = LetterIndexBar.SEARCH_ICON_LETTER;
        if (size >= 9) {
            j2 = Long.parseLong((String) vExtrasList.get(7));
            j3 = Long.parseLong((String) vExtrasList.get(8));
            if (size > 11) {
                i3 = Integer.parseInt((String) vExtrasList.get(10));
                if (size > 12) {
                    long parseLong5 = Long.parseLong((String) vExtrasList.get(11));
                    str = (String) vExtrasList.get(12);
                    i2 = i3;
                    j = j3;
                    j3 = parseLong5;
                    str2 = (String) vExtrasList.get(5);
                    parseLong = Long.parseLong((String) vExtrasList.get(13));
                    a = m3656a(parseLong2, parseLong);
                    if (a == null) {
                        a = new GameRoom();
                        a.f5897u = Long.valueOf(parseLong2);
                        a.f5878b = Boolean.valueOf(true);
                        a.f5879c = Boolean.valueOf(false);
                    }
                    a.f5864D = str2;
                    a.f5865E = Long.valueOf(pushMsg.getStFromUser().getUuid());
                    a.f5898v = Long.valueOf(parseLong3);
                    a.f5894r = Long.valueOf(parseLong4);
                    a.f5893q = Long.valueOf(j);
                    a.f5896t = Long.valueOf(j2);
                    a.f5887k = Integer.valueOf(i);
                    a.f5902z = Integer.valueOf(i2);
                    a.f5900x = Long.valueOf(parseLong);
                    a.f5869I = Long.valueOf(j3);
                    a.f5870J = str;
                    a.f5882f = Boolean.valueOf(false);
                    if (pushMsg.getETalkType() != CHAT_TYPE.CHAT_TYPE_GROUP) {
                        lChatRoomId = pushMsg.getStChatRoomBaseInfo().getLChatRoomId();
                    } else {
                        lChatRoomId = pushMsg.getStCluBasebInfo().getLClubID();
                    }
                    a.f5900x = Long.valueOf(lChatRoomId);
                    this.f5595a.f6435J.d(a);
                    return a;
                }
            }
        }
        str = str3;
        i2 = i3;
        j = j3;
        j3 = 0;
        str2 = (String) vExtrasList.get(5);
        parseLong = Long.parseLong((String) vExtrasList.get(13));
        a = m3656a(parseLong2, parseLong);
        if (a == null) {
            a = new GameRoom();
            a.f5897u = Long.valueOf(parseLong2);
            a.f5878b = Boolean.valueOf(true);
            a.f5879c = Boolean.valueOf(false);
        }
        a.f5864D = str2;
        a.f5865E = Long.valueOf(pushMsg.getStFromUser().getUuid());
        a.f5898v = Long.valueOf(parseLong3);
        a.f5894r = Long.valueOf(parseLong4);
        a.f5893q = Long.valueOf(j);
        a.f5896t = Long.valueOf(j2);
        a.f5887k = Integer.valueOf(i);
        a.f5902z = Integer.valueOf(i2);
        a.f5900x = Long.valueOf(parseLong);
        a.f5869I = Long.valueOf(j3);
        a.f5870J = str;
        a.f5882f = Boolean.valueOf(false);
        if (pushMsg.getETalkType() != CHAT_TYPE.CHAT_TYPE_GROUP) {
            lChatRoomId = pushMsg.getStCluBasebInfo().getLClubID();
        } else {
            lChatRoomId = pushMsg.getStChatRoomBaseInfo().getLChatRoomId();
        }
        a.f5900x = Long.valueOf(lChatRoomId);
        this.f5595a.f6435J.d(a);
        return a;
    }

    public final void m3667b(long j) {
        GameRoomDao gameRoomDao = this.f5595a.f6435J;
        this.f5596b.a();
        try {
            for (GameRoom gameRoom : m3662a(j)) {
                gameRoom.f5878b = Boolean.valueOf(false);
                gameRoomDao.d(gameRoom);
            }
            this.f5596b.c();
        } catch (Throwable e) {
            Log.e("GameRoomDBManager", e.getMessage(), e);
            e.printStackTrace();
        } finally {
            this.f5596b.b();
        }
    }
}
