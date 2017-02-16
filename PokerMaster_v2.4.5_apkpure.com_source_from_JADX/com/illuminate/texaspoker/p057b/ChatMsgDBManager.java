package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.ChatMsgDao;
import com.illuminate.texaspoker.dao.ChatMsgDao.Properties;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.ChatUserDao;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.PokerHistoryDao;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_ROOM_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPoker.CLUB_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CSPushMsgRsp;
import com.texaspoker.moment.TexasPoker.CSPushMsgRsp.Builder;
import com.texaspoker.moment.TexasPoker.CSSystemChatRoomMsgRsp;
import com.texaspoker.moment.TexasPoker.ChatRoomPushMsg;
import com.texaspoker.moment.TexasPoker.ClubPushMsg;
import com.texaspoker.moment.TexasPoker.NetPageShareInfoNet;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.SharePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.ShareBillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.d */
public final class ChatMsgDBManager {
    private static String f5522b;
    public DaoSession f5523a;
    private Pattern f5524c;
    private a f5525d;

    /* renamed from: com.illuminate.texaspoker.b.d.1 */
    class ChatMsgDBManager implements Comparator<PushMsg> {
        final /* synthetic */ ChatMsgDBManager f5521a;

        ChatMsgDBManager(ChatMsgDBManager chatMsgDBManager) {
            this.f5521a = chatMsgDBManager;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            PushMsg pushMsg = (PushMsg) obj;
            PushMsg pushMsg2 = (PushMsg) obj2;
            if (pushMsg == null || pushMsg2 == null) {
                return -2;
            }
            if (pushMsg.getLCreateTime() > pushMsg2.getLCreateTime()) {
                return 1;
            }
            if (pushMsg.getLCreateTime() < pushMsg2.getLCreateTime()) {
                return -1;
            }
            return 0;
        }
    }

    static {
        f5522b = "\\[[a-zA-Z0-9\\-\\\\!\\u4e00-\\u9fa5]+\\]";
    }

    public ChatMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5525d = aVar;
        this.f5523a = daoSession;
        this.f5524c = Pattern.compile(f5522b);
    }

    public final ChatMsg m3567a(long j, long j2, int i) {
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6130l.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6120b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        a.a().b();
        return (ChatMsg) a.a().c();
    }

    public final long m3565a(long j, int i) {
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6138t.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        return a.b();
    }

    public final long m3576b(long j, int i) {
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        return a.b();
    }

    public final List<ChatMsg> m3577b(long j, long j2, int i) {
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6134p.c(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        a.a(new f[]{Properties.f6134p});
        return a.a().b();
    }

    public final List<ChatMsg> m3579c(long j, long j2, int i) {
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6134p.d(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        a.b(new f[]{Properties.f6134p});
        a.a(20);
        List<ChatMsg> b = a.a().b();
        Collections.reverse(b);
        return b;
    }

    public final void m3572a(int i, long j, long j2, int i2) {
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        g a = g.a(chatMsgDao);
        a.a(Properties.f6130l.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6120b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i2)), new i[0]);
        ChatMsg chatMsg = (ChatMsg) a.a().c();
        if (chatMsg != null) {
            chatMsg.f5707t = Integer.valueOf(i);
        }
        chatMsgDao.d(chatMsg);
    }

    private ChatMsg m3564a(PushMsg pushMsg) {
        long j = 0;
        if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_SINGLE) {
            j = pushMsg.getStFromUser().getUuid();
        } else if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_GROUP) {
            j = pushMsg.getStChatRoomBaseInfo().getLChatRoomId();
        } else if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_CLUB) {
            j = pushMsg.getStCluBasebInfo().getLClubID();
        }
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT) {
            CharSequence sMsg = pushMsg.getSMsg();
            Matcher matcher = this.f5524c.matcher(sMsg);
            String str2 = sMsg;
            while (matcher.find()) {
                String str3;
                Expression expression = (Expression) RuntimeData.f6691v.get(matcher.group());
                if (expression == null) {
                    str3 = str2;
                } else if (Utility.m4480a()) {
                    str2 = str2.replace(matcher.group(), expression.f6045b);
                } else if (Utility.m4485b()) {
                    str2 = str2.replace(matcher.group(), expression.f6046c);
                } else {
                    str3 = str2.replace(matcher.group(), expression.f6044a);
                }
                str2 = str3;
            }
            str = str2;
        } else if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE) {
            VoiceFileUtility.m4201a(j, pushMsg.getLMsgID(), pushMsg.getVVoiceDatas().toByteArray(), pushMsg.getETalkType().getNumber());
        } else if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL) {
            long lBillID;
            Bill bill;
            BillDBManager billDBManager = DBManager.m3631a().f5570j;
            ShareBillInfoNet stShareBillInfo = pushMsg.getStShareBillInfo();
            if (stShareBillInfo.getStBillInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                lBillID = stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLBillID();
            } else {
                lBillID = stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLBillID();
            }
            Bill a = billDBManager.m3554a(lBillID, true);
            if (a == null) {
                a = new Bill();
                a.f5643b = Long.valueOf(lBillID);
                a.f5646e = Boolean.valueOf(false);
                a.f5647f = Boolean.valueOf(true);
                bill = a;
            } else {
                bill = a;
            }
            bill.f5644c = Integer.valueOf(stShareBillInfo.getStBillInfo().getEGameRoomType().getNumber());
            if (stShareBillInfo.getStBillInfo().getEGameRoomType() != GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                bill.f5629M = stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getSPlayName();
                bill.f5631O = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid());
                bill.f5626J = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLCreateTime());
                bill.f5627K = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLDuration());
                bill.f5662u = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLSmallBlind());
                bill.f5663v = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLBigBlind());
                bill.f5666y = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLBuyin());
                bill.f5661t = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLTotalBuyin());
                bill.f5649h = Boolean.valueOf(true);
                bill.f5665x = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLMaxPot());
                bill.f5660s = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLTotalGameNum());
                bill.f5656o = Integer.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getIAnte());
                bill.f5654m = Integer.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getIGameRoomUserMaxNums());
                bill.f5645d = Integer.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getECreateRoomType().getNumber());
                bill.f5667z = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLFromRoomID());
                bill.m3707a(DBManager.m3631a().f5563c.m3641a(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getStCreateUserBaseInfo(), false));
                bill.f5664w = Long.valueOf(0);
                bill.f5625I = Long.valueOf(0);
                bill.f5633Q = Boolean.valueOf(false);
                bill.f5634R = Long.valueOf(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLLeagueID());
                bill.f5635S = stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getSLeagueName();
                if (stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLLeagueID() > 0) {
                    if (!StringUtils.m4462a(stShareBillInfo.getStBillInfo().getSFromClubName())) {
                        bill.f5630N = stShareBillInfo.getStBillInfo().getSFromClubName();
                    }
                    bill.f5636T = stShareBillInfo.getStBillInfo().getSFromClubUrl();
                    if (!StringUtils.m4462a(stShareBillInfo.getStBillInfo().getSFromClubCreatorName())) {
                        bill.f5637U = stShareBillInfo.getStBillInfo().getSFromClubCreatorName();
                    }
                } else if (StringUtils.m4462a(stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getSFromText())) {
                    bill.f5630N = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    bill.f5630N = stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getSFromText();
                }
                for (UserBillInfoNet userBillInfoNet : stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getVUserBillInfosList()) {
                    DBManager.m3631a().f5571k.m3704a(userBillInfoNet, stShareBillInfo.getStBillInfo().getStNormalBillInfoNet().getLBillID(), true);
                    if (stShareBillInfo.getLShareUuid() == userBillInfoNet.getUuid()) {
                        bill.f5664w = Long.valueOf(userBillInfoNet.getLRemainBuyStacks() - userBillInfoNet.getLTotalBuyStacks());
                    }
                    if (userBillInfoNet.getUuid() == 1000) {
                        bill.f5625I = Long.valueOf(userBillInfoNet.getLInsuranceGetStacks());
                    }
                }
            } else {
                bill.f5629M = stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getSPlayName();
                bill.f5631O = Long.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getStCreateUserBaseInfo().getUuid());
                bill.f5626J = Long.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLCreateTime());
                bill.f5649h = Boolean.valueOf(true);
                if (stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getBPrivateRoom() == 1) {
                    bill.f5651j = Boolean.valueOf(true);
                } else {
                    bill.f5651j = Boolean.valueOf(false);
                }
                bill.f5652k = Long.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLOriginalStacks());
                bill.f5653l = Integer.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getIBlindInterval());
                bill.f5654m = Integer.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getIGameRoomUserMaxNums());
                bill.f5655n = Integer.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getESNGRoomType().getNumber());
                bill.f5645d = Integer.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getECreateRoomType().getNumber());
                bill.f5667z = Long.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLFromRoomID());
                if (StringUtils.m4462a(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getSFromText())) {
                    bill.f5630N = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    bill.f5630N = stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getSFromText();
                }
                bill.f5633Q = Boolean.valueOf(false);
                bill.m3707a(DBManager.m3631a().f5563c.m3641a(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getStCreateUserBaseInfo(), false));
                bill.f5664w = Long.valueOf(0);
                bill.f5634R = Long.valueOf(stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLLeagueID());
                bill.f5635S = stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getSLeagueName();
                for (UserBillInfoNet userBillInfoNet2 : stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getVUserBillInfosList()) {
                    DBManager.m3631a().f5571k.m3704a(userBillInfoNet2, stShareBillInfo.getStBillInfo().getStSNGBillInfoNet().getLBillID(), true);
                    if (stShareBillInfo.getLShareUuid() == userBillInfoNet2.getUuid()) {
                        bill.f5664w = Long.valueOf(userBillInfoNet2.getLRemainBuyStacks() - userBillInfoNet2.getLTotalBuyStacks());
                    }
                }
            }
            billDBManager.f5518b.f6467x.d(bill);
            if (pushMsg.getStShareBillInfo().getStBillInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                lBillID = pushMsg.getStShareBillInfo().getStBillInfo().getStSNGBillInfoNet().getLBillID();
            } else {
                lBillID = pushMsg.getStShareBillInfo().getStBillInfo().getStNormalBillInfoNet().getLBillID();
            }
            str = String.valueOf(lBillID);
        } else if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_POKER_HISTORY) {
            if (pushMsg.getStSharePokerHistoryInfo() != null) {
                PokerHistoryDBManager pokerHistoryDBManager = DBManager.m3631a().f5578r;
                SharePokerHistoryInfo stSharePokerHistoryInfo = pushMsg.getStSharePokerHistoryInfo();
                PokerHistoryDao pokerHistoryDao = pokerHistoryDBManager.f5606b.f6440O;
                pokerHistoryDBManager.f5605a.a();
                try {
                    PokerHistoryInfo stPokerHistoryInfo = stSharePokerHistoryInfo.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo();
                    PokerHistoryDao pokerHistoryDao2 = pokerHistoryDBManager.f5606b.f6440O;
                    PokerHistory a2 = pokerHistoryDBManager.m3692a(stPokerHistoryInfo.getLSaveUuid(), stPokerHistoryInfo.getLRoomID(), stPokerHistoryInfo.getLHandID(), true);
                    if (a2 == null) {
                        a2 = new PokerHistory();
                        if (stPokerHistoryInfo.getBInGame() == 1) {
                            a2.f5956b = Boolean.valueOf(true);
                        } else {
                            a2.f5956b = Boolean.valueOf(false);
                        }
                        a2.f5957c = Boolean.valueOf(true);
                        if (stPokerHistoryInfo.getVHandCardsList().size() == 2) {
                            a2.f5958d = Integer.valueOf(stPokerHistoryInfo.getVHandCards(0));
                            a2.f5959e = Integer.valueOf(stPokerHistoryInfo.getVHandCards(1));
                            a2.f5962h = Boolean.valueOf(false);
                        } else if (stPokerHistoryInfo.getVHandCardsList().size() == 4) {
                            a2.f5958d = Integer.valueOf(stPokerHistoryInfo.getVHandCards(0));
                            a2.f5959e = Integer.valueOf(stPokerHistoryInfo.getVHandCards(1));
                            a2.f5960f = Integer.valueOf(stPokerHistoryInfo.getVHandCards(2));
                            a2.f5961g = Integer.valueOf(stPokerHistoryInfo.getVHandCards(3));
                            a2.f5962h = Boolean.valueOf(true);
                        } else {
                            a2.f5958d = Integer.valueOf(-1);
                            a2.f5959e = Integer.valueOf(-1);
                            a2.f5962h = Boolean.valueOf(false);
                        }
                        a2.f5963i = Integer.valueOf(stPokerHistoryInfo.getIGameType());
                        a2.f5964j = Long.valueOf(stPokerHistoryInfo.getLBigBlind());
                        a2.f5966l = Long.valueOf(stPokerHistoryInfo.getLGetPopularity());
                        a2.f5967m = Long.valueOf(stPokerHistoryInfo.getLHandID());
                        a2.f5968n = Long.valueOf(stPokerHistoryInfo.getLRoomID());
                        a2.f5970p = Long.valueOf(stPokerHistoryInfo.getLSaveUuid());
                        a2.f5972r = Long.valueOf(stPokerHistoryInfo.getLSmallBlind());
                        a2.f5969o = Long.valueOf(stPokerHistoryInfo.getLTime());
                        a2.f5979y = Integer.valueOf(stPokerHistoryInfo.getIAnte());
                    }
                    a2.f5975u = stPokerHistoryInfo.getSPokerHistoryName();
                    a2.f5976v = stPokerHistoryInfo.getSPokerHistoryRoomName();
                    a2.f5978x = stPokerHistoryInfo.getSPokerHistoryUrl();
                    a2.f5977w = stPokerHistoryInfo.getSPokerHistoryShareUrl();
                    a2.f5974t = Utility.m4497e(stPokerHistoryInfo.getSPokerHistoryShareUrl());
                    pokerHistoryDao2.d(a2);
                    a2.f5971q = Long.valueOf(stSharePokerHistoryInfo.getLShareUuid());
                    a2.f5973s = stSharePokerHistoryInfo.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getSPokerHistoryName();
                    a2.f5965k = Long.valueOf(stSharePokerHistoryInfo.getStFavoritePokerHistoryInfo().getLFavoriteSaveTime());
                    pokerHistoryDao.d(a2);
                    pokerHistoryDBManager.f5605a.c();
                } catch (Throwable e) {
                    e.printStackTrace();
                    Log.e("PokerHistoryDBManager", e.getMessage(), e);
                } finally {
                    pokerHistoryDBManager.f5605a.b();
                }
                str = pushMsg.getStSharePokerHistoryInfo().getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLSaveUuid() + "-" + pushMsg.getStSharePokerHistoryInfo().getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLRoomID() + "-" + pushMsg.getStSharePokerHistoryInfo().getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLHandID();
            }
        } else if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE) {
            str = pushMsg.getSMsg();
        } else if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_WEBPAGE) {
            str = pushMsg.getStNetPageShareInfoNet().getSPageTitle();
        }
        FriendUser a3 = DBManager.m3631a().f5563c.m3641a(pushMsg.getStFromUser(), false);
        CHAT_TYPE eTalkType = pushMsg.getETalkType();
        if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_CLUB) {
            eTalkType = CHAT_TYPE.CHAT_TYPE_GROUP;
        }
        long lMsgID = pushMsg.getLMsgID();
        int number = eTalkType.getNumber();
        int number2 = pushMsg.getEChatMessageType().getNumber();
        long uuid = pushMsg.getStFromUser().getUuid();
        long lCreateTime = pushMsg.getLCreateTime();
        int i = DBManager.f5541D;
        long lDuration = pushMsg.getLDuration();
        int i2 = DBManager.f5547J;
        NetPageShareInfoNet stNetPageShareInfoNet = pushMsg.getStNetPageShareInfoNet();
        ChatMsg a4 = m3566a(lMsgID, number, number2, uuid, j, str, lCreateTime, i, lDuration, i2, a3, true);
        if (stNetPageShareInfoNet != null) {
            ChatMsgDao chatMsgDao = this.f5523a.f6469z;
            a4.f5698k = Long.valueOf(stNetPageShareInfoNet.getLPageID());
            a4.f5696i = stNetPageShareInfoNet.getSPageTitle();
            a4.f5695h = stNetPageShareInfoNet.getSCoverPicUrl();
            a4.f5694g = stNetPageShareInfoNet.getSPageDesc();
            a4.f5697j = stNetPageShareInfoNet.getSUrl();
            chatMsgDao.d(a4);
        }
        if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE) {
            m3575a(a4, pushMsg.getVExtrasList());
        }
        return a4;
    }

    public final Map<String, List<ChatMsg>> m3571a(List<PushMsg> list) {
        this.f5525d.a();
        Map hashMap = new HashMap();
        Collections.sort(list, new ChatMsgDBManager(this));
        Builder newBuilder = CSPushMsgRsp.newBuilder();
        ChatRoom chatRoom = null;
        for (PushMsg pushMsg : list) {
            ChatRoom a;
            newBuilder.addVMsgIds(pushMsg.getLMsgID());
            long j = 0;
            if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_SINGLE) {
                j = pushMsg.getStFromUser().getUuid();
                a = DBManager.m3631a().f5565e.m3590a(j, 1);
                if (a == null) {
                    a = DBManager.m3631a().f5565e.m3589a(j);
                }
            } else if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_GROUP) {
                j = pushMsg.getStChatRoomBaseInfo().getLChatRoomId();
                a = DBManager.m3631a().f5565e.m3591a(pushMsg.getStChatRoomBaseInfo());
            } else if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_CLUB) {
                j = pushMsg.getStCluBasebInfo().getLClubID();
                a = DBManager.m3631a().f5565e.m3593a(pushMsg.getStCluBasebInfo(), 0, false);
            } else {
                a = chatRoom;
            }
            if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_POKER_HISTORY || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_ENTER_GAME || pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_WEBPAGE) {
                long parseLong;
                CHAT_TYPE chat_type;
                if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE) {
                    Utility.m4478a("NOTIFY_TO_GET_GAMEROOMS", new Object[0]);
                    if (pushMsg.getVExtrasList().size() > 0) {
                        if (pushMsg.getVExtras(0).equals("normal")) {
                            DBManager.m3631a().f5572l.m3659a(pushMsg, 1);
                        } else if (pushMsg.getVExtras(0).equals("NormalInsurance")) {
                            DBManager.m3631a().f5572l.m3659a(pushMsg, 3);
                        } else {
                            try {
                                if (pushMsg.getVExtras(0).equals("Six")) {
                                    DBManager.m3631a().f5572l.m3659a(pushMsg, 4);
                                } else if (pushMsg.getVExtras(0).equals("Omaha")) {
                                    DBManager.m3631a().f5572l.m3659a(pushMsg, 5);
                                } else if (pushMsg.getVExtras(0).equals("OmahaInsurance")) {
                                    DBManager.m3631a().f5572l.m3659a(pushMsg, 6);
                                } else if (pushMsg.getVExtras(0).equals("sng")) {
                                    GameRoom gameRoom;
                                    long lChatRoomId;
                                    GameRoomDBManager gameRoomDBManager = DBManager.m3631a().f5572l;
                                    List vExtrasList = pushMsg.getVExtrasList();
                                    vExtrasList.size();
                                    long parseLong2 = Long.parseLong((String) vExtrasList.get(1));
                                    String str = (String) vExtrasList.get(2);
                                    int parseInt = Integer.parseInt((String) vExtrasList.get(5));
                                    long parseLong3 = Long.parseLong((String) vExtrasList.get(6));
                                    parseLong = Long.parseLong((String) vExtrasList.get(8));
                                    String str2 = (String) vExtrasList.get(9);
                                    long parseLong4 = Long.parseLong((String) vExtrasList.get(10));
                                    GameRoom a2 = gameRoomDBManager.m3656a(parseLong2, parseLong4);
                                    if (a2 == null) {
                                        a2 = new GameRoom();
                                        a2.f5897u = Long.valueOf(parseLong2);
                                        a2.f5878b = Boolean.valueOf(true);
                                        a2.f5879c = Boolean.valueOf(false);
                                        gameRoom = a2;
                                    } else {
                                        gameRoom = a2;
                                    }
                                    gameRoom.f5864D = str;
                                    gameRoom.f5865E = Long.valueOf(pushMsg.getStFromUser().getUuid());
                                    gameRoom.f5893q = Long.valueOf(parseLong3);
                                    gameRoom.f5887k = Integer.valueOf(2);
                                    gameRoom.f5890n = Integer.valueOf(parseInt);
                                    gameRoom.f5900x = Long.valueOf(parseLong4);
                                    gameRoom.f5869I = Long.valueOf(parseLong);
                                    gameRoom.f5870J = str2;
                                    gameRoom.f5882f = Boolean.valueOf(false);
                                    if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_GROUP) {
                                        lChatRoomId = pushMsg.getStChatRoomBaseInfo().getLChatRoomId();
                                    } else {
                                        lChatRoomId = pushMsg.getStCluBasebInfo().getLClubID();
                                    }
                                    gameRoom.f5900x = Long.valueOf(lChatRoomId);
                                    gameRoomDBManager.f5595a.f6435J.d(gameRoom);
                                }
                            } catch (Throwable e) {
                                e.printStackTrace();
                                Log.e("ChatMsgDBManager", e.getMessage(), e);
                            } finally {
                                this.f5525d.b();
                            }
                        }
                    }
                }
                CHAT_TYPE eTalkType = pushMsg.getETalkType();
                if (pushMsg.getETalkType() == CHAT_TYPE.CHAT_TYPE_CLUB) {
                    chat_type = CHAT_TYPE.CHAT_TYPE_GROUP;
                } else {
                    chat_type = eTalkType;
                }
                if (m3567a(pushMsg.getLMsgID(), j, chat_type.getNumber()) == null) {
                    m3582e(j, pushMsg.getLCreateTime(), chat_type.getNumber());
                    DBManager.m3631a().f5563c.m3641a(pushMsg.getStFromUser(), false);
                    if (pushMsg.getEChatMessageType() == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_ENTER_GAME) {
                        parseLong = j;
                        m3566a(pushMsg.getLMsgID(), 2, DBManager.f5555y, pushMsg.getStFromUser().getUuid(), parseLong, String.format(StringUtils.m4461a(2131165269), new Object[]{pushMsg.getStFromUser().getStrNick(), pushMsg.getSMsg()}), pushMsg.getLCreateTime(), DBManager.f5540C, 0, DBManager.f5548K, null, true);
                        chatRoom = a;
                    } else {
                        ChatMsg a3 = m3564a(pushMsg);
                        if (a3 != null) {
                            List list2;
                            if (a3.f5705r.intValue() == 1) {
                                if (a.m3726a().f5823b.booleanValue()) {
                                    list2 = (List) hashMap.get(j + "s");
                                    if (list2 == null) {
                                        list2 = new ArrayList();
                                        hashMap.put(j + "s", list2);
                                    }
                                    list2.add(a3);
                                    chatRoom = a;
                                }
                            } else if (!(a == null || a.f5719F == null || !a.f5719F.booleanValue())) {
                                list2 = (List) hashMap.get(String.valueOf(j));
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    hashMap.put(String.valueOf(j), list2);
                                }
                                list2.add(a3);
                            }
                        }
                        chatRoom = a;
                    }
                }
            }
            chatRoom = a;
        }
        this.f5523a.f6426A.d(chatRoom);
        NetworkUtil.m4073a();
        NetworkUtil.m4103a(newBuilder);
        this.f5525d.c();
        return hashMap;
    }

    public final void m3574a(long j, int i, boolean z) {
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        g a = g.a(chatMsgDao);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        List<ChatMsg> b = a.a().b();
        this.f5525d.a();
        try {
            for (ChatMsg e : b) {
                chatMsgDao.e(e);
            }
            ChatRoom a2 = DBManager.m3631a().f5565e.m3590a(j, i);
            if (a2 != null) {
                ChatRoomDao chatRoomDao = this.f5523a.f6426A;
                a2.f5759t = LetterIndexBar.SEARCH_ICON_LETTER;
                if (z) {
                    a2.f5714A = Boolean.valueOf(true);
                }
                chatRoomDao.d(a2);
            }
            this.f5525d.c();
        } catch (Throwable e2) {
            e2.printStackTrace();
            Log.e("ChatMsgDBManager", e2.getMessage(), e2);
        } finally {
            this.f5525d.b();
        }
    }

    public final void m3581d(long j, long j2, int i) {
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        ChatMsg a = m3567a(j, j2, i);
        if (a != null) {
            if (a.f5704q.intValue() == 2) {
                VoiceFileUtility.m4200a(j2, j, i);
            }
            chatMsgDao.e(a);
        }
    }

    public final ChatMsg m3570a(ChatMsg chatMsg, long j, String str) {
        ChatMsg a;
        Throwable e;
        this.f5525d.a();
        try {
            m3582e(chatMsg.f5699l.longValue(), j, chatMsg.f5705r.intValue());
            long j2 = j;
            String str2 = str;
            long j3 = j;
            a = m3566a(j2, chatMsg.f5705r.intValue(), chatMsg.f5704q.intValue(), SharedPreferencesManager.m4308b(), chatMsg.f5699l.longValue(), str2, j3, DBManager.f5542E, chatMsg.f5702o.longValue(), DBManager.f5548K, DBManager.m3631a().f5563c.m3639a(SharedPreferencesManager.m4308b()), true);
            try {
                this.f5525d.c();
                this.f5525d.b();
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    Log.e("ChatMsgDBManager", e.getMessage(), e);
                    return a;
                } finally {
                    this.f5525d.b();
                }
            }
        } catch (Throwable e3) {
            e = e3;
            a = null;
            e.printStackTrace();
            Log.e("ChatMsgDBManager", e.getMessage(), e);
            return a;
        }
        return a;
    }

    public final ChatMsg m3568a(long j, long j2, int i, int i2, String str, long j3) {
        return m3569a(j, j2, i, i2, str, j3, DBManager.f5542E);
    }

    public final ChatMsg m3569a(long j, long j2, int i, int i2, String str, long j3, int i3) {
        ChatMsg a;
        Throwable e;
        this.f5525d.a();
        try {
            m3582e(j, j2, i);
            long j4 = j2;
            int i4 = i;
            int i5 = i2;
            long j5 = j;
            String str2 = str;
            long j6 = j2;
            int i6 = i3;
            long j7 = j3;
            a = m3566a(j4, i4, i5, SharedPreferencesManager.m4308b(), j5, str2, j6, i6, j7, DBManager.f5548K, DBManager.m3631a().f5563c.m3639a(SharedPreferencesManager.m4308b()), true);
            try {
                this.f5525d.c();
                this.f5525d.b();
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    Log.e("ChatMsgDBManager", e.getMessage(), e);
                    return a;
                } finally {
                    this.f5525d.b();
                }
            }
        } catch (Throwable e3) {
            e = e3;
            a = null;
            e.printStackTrace();
            Log.e("ChatMsgDBManager", e.getMessage(), e);
            return a;
        }
        return a;
    }

    public final void m3575a(ChatMsg chatMsg, List<String> list) {
        if (((String) list.get(0)).equals("normal") || ((String) list.get(0)).equals("NormalInsurance") || ((String) list.get(0)).equals("Six") || ((String) list.get(0)).equals("Omaha") || ((String) list.get(0)).equals("OmahaInsurance")) {
            chatMsg.f5708u = (String) list.get(0);
            chatMsg.f5710w = (String) list.get(5);
            chatMsg.f5709v = (String) list.get(9);
        } else if (((String) list.get(0)).equals("sng")) {
            chatMsg.f5708u = (String) list.get(0);
            chatMsg.f5710w = (String) list.get(2);
            chatMsg.f5709v = (String) list.get(7);
        }
        this.f5523a.f6469z.d(chatMsg);
    }

    public final void m3573a(long j) {
        this.f5525d.a();
        try {
            long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
            m3582e(j, currentTimeMillis, CHAT_TYPE.CHAT_TYPE_GROUP.getNumber());
            String a = StringUtils.m4461a(2131165697);
            int i = DBManager.f5555y;
            m3566a(currentTimeMillis + 1, 2, r10, SharedPreferencesManager.m4308b(), j, a, currentTimeMillis + 1, DBManager.f5540C, 0, DBManager.f5548K, null, true);
            this.f5525d.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatMsgDBManager", e.getMessage(), e);
        } finally {
            this.f5525d.b();
        }
    }

    public final ChatMsg m3582e(long j, long j2, int i) {
        ChatMsg chatMsg;
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        g a = g.a(this.f5523a.f6469z);
        a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6134p.d(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
        a.b(new f[]{Properties.f6134p});
        List b = a.a().b();
        if (b.size() > 0) {
            chatMsg = (ChatMsg) b.get(0);
        } else {
            chatMsg = null;
        }
        long j3 = 0;
        if (chatMsg != null) {
            j3 = chatMsg.f5703p.longValue();
        }
        if (j2 - j3 <= DBManager.f5553w) {
            return null;
        }
        ChatMsg chatMsg2 = new ChatMsg();
        chatMsg2.f5689b = Long.valueOf(j2 - 1);
        chatMsg2.f5705r = Integer.valueOf(i);
        chatMsg2.f5704q = Integer.valueOf(DBManager.f5554x);
        chatMsg2.f5703p = Long.valueOf(j2 - 1);
        chatMsg2.f5699l = Long.valueOf(j);
        chatMsg2.f5707t = Integer.valueOf(DBManager.f5540C);
        chatMsg2.f5706s = Integer.valueOf(DBManager.f5548K);
        chatMsgDao.d(chatMsg2);
        return chatMsg2;
    }

    public final void m3580c(long j, int i) {
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        this.f5525d.a();
        try {
            g a = g.a(chatMsgDao);
            a.a(Properties.f6130l.a(Long.valueOf(j)), new i[0]);
            a.a(Properties.f6138t.a(Integer.valueOf(DBManager.f5541D)), new i[0]);
            a.a(Properties.f6136r.a(Integer.valueOf(i)), new i[0]);
            for (ChatMsg chatMsg : a.a().b()) {
                chatMsg.f5707t = Integer.valueOf(DBManager.f5540C);
                chatMsgDao.d(chatMsg);
            }
            this.f5525d.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ChatMsgDBManager", e.getMessage(), e);
        } finally {
            this.f5525d.b();
        }
    }

    public final void m3578b(List<ChatRoomPushMsg> list) {
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        CSSystemChatRoomMsgRsp.Builder newBuilder = CSSystemChatRoomMsgRsp.newBuilder();
        this.f5525d.a();
        for (ChatRoomPushMsg chatRoomPushMsg : list) {
            newBuilder.addVMsgIds(chatRoomPushMsg.getLMsgID());
            long lChatRoomId = chatRoomPushMsg.getStChatRoomBaseInfo().getLChatRoomId();
            if (m3567a(chatRoomPushMsg.getLMsgID(), lChatRoomId, 2) == null) {
                Object obj;
                int i;
                ChatMsg chatMsg;
                ChatMsg e = m3582e(lChatRoomId, chatRoomPushMsg.getLCreateTime(), 2);
                long lChatRoomId2 = chatRoomPushMsg.getStChatRoomBaseInfo().getLChatRoomId();
                ChatUserDao chatUserDao = this.f5523a.f6427B;
                ChatRoomDao chatRoomDao = this.f5523a.f6426A;
                String str = LetterIndexBar.SEARCH_ICON_LETTER;
                ChatRoom a = DBManager.m3631a().f5565e.m3590a(lChatRoomId2, 3);
                if (a != null) {
                    obj = a.f5755p;
                } else {
                    String str2 = str;
                }
                ChatRoom a2 = DBManager.m3631a().f5565e.m3592a(chatRoomPushMsg.getStChatRoomBaseInfo(), 0);
                String str3 = LetterIndexBar.SEARCH_ICON_LETTER;
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                for (i = 0; i < chatRoomPushMsg.getVUsersCount(); i++) {
                    UserBaseInfoNet vUsers = chatRoomPushMsg.getVUsers(i);
                    if (vUsers.getUuid() == SharedPreferencesManager.m4308b()) {
                        if (chatRoomPushMsg.getVUsersCount() > 2) {
                            str = StringUtils.m4461a(2131165945) + str;
                        } else {
                            str = StringUtils.m4461a(2131165946) + str;
                        }
                    } else if (vUsers.getUuid() != chatRoomPushMsg.getStFromUser().getUuid() || chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_LEAVE) {
                        if (i != 0) {
                            if (Utility.m4480a() || Utility.m4485b()) {
                                str = str + "\u3001";
                            } else {
                                str = str + ", ";
                            }
                        }
                        str = str + vUsers.getStrNick();
                    }
                }
                if (chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_ENTER) {
                    if (chatRoomPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                        str = String.format(StringUtils.m4461a(2131165710), new Object[]{StringUtils.m4461a(2131165946), str});
                    } else {
                        for (i = 0; i < chatRoomPushMsg.getVUsersCount(); i++) {
                            if (chatRoomPushMsg.getVUsers(i).getUuid() == SharedPreferencesManager.m4308b()) {
                                a2.f5717D = Boolean.valueOf(true);
                                break;
                            }
                        }
                        str = String.format(StringUtils.m4461a(2131165710), new Object[]{chatRoomPushMsg.getStFromUser().getStrNick(), str});
                    }
                    for (i = 0; i < chatRoomPushMsg.getVUsersCount(); i++) {
                        ChatUser a3 = DBManager.m3631a().f5569i.m3609a(a2.f5741b.longValue(), chatRoomPushMsg.getVUsers(i).getUuid());
                        if (a3 != null) {
                            chatUserDao.e(a3);
                        }
                    }
                    str3 = str;
                } else {
                    try {
                        if (chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_INVITE) {
                            if (chatRoomPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                                str3 = String.format(StringUtils.m4461a(2131165710), new Object[]{StringUtils.m4461a(2131165946), str});
                            } else {
                                str3 = String.format(StringUtils.m4461a(2131165710), new Object[]{chatRoomPushMsg.getStFromUser().getStrNick(), str});
                            }
                            a2.f5717D = Boolean.valueOf(true);
                        } else if (chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_KICK) {
                            UserBaseInfoNet vUsers2 = chatRoomPushMsg.getVUsers(0);
                            if (chatRoomPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                                str3 = String.format(StringUtils.m4461a(2131165711), new Object[]{StringUtils.m4461a(2131165946), str});
                            } else {
                                if (vUsers2.getUuid() == SharedPreferencesManager.m4308b()) {
                                    a2.f5717D = Boolean.valueOf(false);
                                }
                                str3 = String.format(StringUtils.m4461a(2131165711), new Object[]{chatRoomPushMsg.getStFromUser().getStrNick(), str});
                            }
                            r3 = DBManager.m3631a().f5569i.m3609a(a2.f5741b.longValue(), vUsers2.getUuid());
                            if (r3 != null) {
                                chatUserDao.e(r3);
                            }
                        } else if (chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_LEAVE) {
                            str3 = String.format(StringUtils.m4461a(2131165854), new Object[]{str});
                            r3 = DBManager.m3631a().f5569i.m3609a(a2.f5741b.longValue(), chatRoomPushMsg.getVUsers(0).getUuid());
                            if (r3 != null) {
                                chatUserDao.e(r3);
                            }
                        } else if (chatRoomPushMsg.getEGameMessageType() == CHAT_ROOM_MESSAGE_TYPE.CHAT_ROOM_MESSAGE_SET) {
                            a2.f5732S = Integer.valueOf(chatRoomPushMsg.getStChatRoomBaseInfo().getNOwnerCreate());
                            a2.f5733T = Integer.valueOf(chatRoomPushMsg.getStChatRoomBaseInfo().getNOwnerInvite());
                            a2.f5755p = chatRoomPushMsg.getStChatRoomBaseInfo().getStrRoomName();
                            if (chatRoomPushMsg.getStChatRoomBaseInfo().getStrRoomName().equals(obj)) {
                                chatMsg = null;
                                if (chatMsg == null && e != null) {
                                    chatMsgDao.e(e);
                                }
                            } else {
                                str3 = String.format(StringUtils.m4461a(2131165252), new Object[]{chatRoomPushMsg.getStFromUser().getStrNick(), chatRoomPushMsg.getStChatRoomBaseInfo().getStrRoomName()});
                            }
                        }
                    } catch (Throwable e2) {
                        e2.printStackTrace();
                        Log.e("ChatMsgDBManager", e2.getMessage(), e2);
                    } finally {
                        this.f5525d.b();
                    }
                }
                chatRoomDao.d(a2);
                DBManager.m3631a().f5569i.m3614a(chatRoomPushMsg.getVUsersList(), chatRoomPushMsg.getEGameMessageType(), a2);
                chatMsg = DBManager.m3631a().f5566f.m3566a(chatRoomPushMsg.getLMsgID(), 2, DBManager.f5555y, chatRoomPushMsg.getStFromUser().getUuid(), lChatRoomId2, str3, chatRoomPushMsg.getLCreateTime(), DBManager.f5540C, 0, DBManager.f5548K, null, false);
                chatMsgDao.e(e);
            }
        }
        this.f5525d.c();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        NetworkUtil.m4073a();
        NetworkUtil.m4104a(newBuilder);
    }

    public static ChatMsg m3563a(ClubPushMsg clubPushMsg) {
        long lClubID = clubPushMsg.getStClubBaseInfo().getLClubID();
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_ACCEPT) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                str = String.format(StringUtils.m4461a(2131165357), new Object[]{StringUtils.m4461a(2131165946), clubPushMsg.getStToUser().getStrNick()});
            } else if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), true);
                str = String.format(StringUtils.m4461a(2131165357), new Object[]{clubPushMsg.getStFromUser().getStrNick(), StringUtils.m4461a(2131165946)});
            } else {
                str = String.format(StringUtils.m4461a(2131165357), new Object[]{clubPushMsg.getStFromUser().getStrNick(), clubPushMsg.getStToUser().getStrNick()});
            }
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_REMOVE) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                str = String.format(StringUtils.m4461a(2131165364), new Object[]{StringUtils.m4461a(2131165946), clubPushMsg.getStToUser().getStrNick()});
            } else if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), false);
                DBManager.m3631a().f5569i.m3616b(clubPushMsg.getStClubBaseInfo().getLClubID(), SharedPreferencesManager.m4308b());
                str = String.format(StringUtils.m4461a(2131165364), new Object[]{clubPushMsg.getStFromUser().getStrNick(), StringUtils.m4461a(2131165946)});
            } else {
                str = String.format(StringUtils.m4461a(2131165364), new Object[]{clubPushMsg.getStFromUser().getStrNick(), clubPushMsg.getStToUser().getStrNick()});
            }
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_QUIT) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), false);
            } else {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), true);
            }
            str = String.format(StringUtils.m4461a(2131165409), new Object[]{clubPushMsg.getStFromUser().getStrNick()});
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_ENTER) {
            DBManager.m3631a().f5565e.m3593a(clubPushMsg.getStClubBaseInfo(), 0, false);
            str = String.format(StringUtils.m4461a(2131165346), new Object[]{clubPushMsg.getStFromUser().getStrNick()});
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_SENIOR) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                str = String.format(StringUtils.m4461a(2131165416), new Object[]{StringUtils.m4461a(2131165946), clubPushMsg.getStToUser().getStrNick()});
            } else if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), true);
                str = String.format(StringUtils.m4461a(2131165416), new Object[]{clubPushMsg.getStFromUser().getStrNick(), StringUtils.m4461a(2131165946)});
            } else {
                str = String.format(StringUtils.m4461a(2131165416), new Object[]{clubPushMsg.getStFromUser().getStrNick(), clubPushMsg.getStToUser().getStrNick()});
            }
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_JIUNIOR) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                str = String.format(StringUtils.m4461a(2131165415), new Object[]{StringUtils.m4461a(2131165946), clubPushMsg.getStToUser().getStrNick()});
            } else if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), true);
                str = String.format(StringUtils.m4461a(2131165415), new Object[]{clubPushMsg.getStFromUser().getStrNick(), StringUtils.m4461a(2131165946)});
            } else {
                str = String.format(StringUtils.m4461a(2131165415), new Object[]{clubPushMsg.getStFromUser().getStrNick(), clubPushMsg.getStToUser().getStrNick()});
            }
        } else if (clubPushMsg.getEClubMessageType() == CLUB_MESSAGE_TYPE.CLUB_MESSAGE_FUND) {
            if (clubPushMsg.getStFromUser().getUuid() == SharedPreferencesManager.m4308b()) {
                str = String.format(StringUtils.m4461a(2131165353), new Object[]{StringUtils.m4461a(2131165946), Long.valueOf(clubPushMsg.getLFund()), clubPushMsg.getStToUser().getStrNick()});
            } else if (clubPushMsg.getStToUser().getUuid() == SharedPreferencesManager.m4308b()) {
                DBManager.m3631a().f5565e.m3598a(clubPushMsg.getStClubBaseInfo(), true);
                str = String.format(StringUtils.m4461a(2131165353), new Object[]{clubPushMsg.getStFromUser().getStrNick(), Long.valueOf(clubPushMsg.getLFund()), StringUtils.m4461a(2131165946)});
            } else {
                str = String.format(StringUtils.m4461a(2131165353), new Object[]{clubPushMsg.getStFromUser().getStrNick(), Long.valueOf(clubPushMsg.getLFund()), clubPushMsg.getStToUser().getStrNick()});
            }
        }
        return DBManager.m3631a().f5566f.m3566a(clubPushMsg.getLMsgID(), 2, DBManager.f5555y, clubPushMsg.getStFromUser().getUuid(), lClubID, str, clubPushMsg.getLCreateTime(), DBManager.f5540C, 0, DBManager.f5548K, null, false);
    }

    public final ChatMsg m3566a(long j, int i, int i2, long j2, long j3, String str, long j4, int i3, long j5, int i4, FriendUser friendUser, boolean z) {
        String str2;
        ChatMsgDao chatMsgDao = this.f5523a.f6469z;
        ChatMsg chatMsg = new ChatMsg();
        chatMsg.f5689b = Long.valueOf(j);
        chatMsg.f5705r = Integer.valueOf(i);
        chatMsg.f5704q = Integer.valueOf(i2);
        chatMsg.f5701n = Long.valueOf(j2);
        chatMsg.f5699l = Long.valueOf(j3);
        chatMsg.f5690c = str;
        chatMsg.f5703p = Long.valueOf(j4);
        chatMsg.f5707t = Integer.valueOf(i3);
        chatMsg.f5702o = Long.valueOf(j5);
        chatMsg.f5698k = Long.valueOf(-1);
        chatMsg.f5706s = Integer.valueOf(i4);
        synchronized (chatMsg) {
            Long l;
            chatMsg.f5713z = friendUser;
            if (friendUser == null) {
                l = null;
            } else {
                l = friendUser.f5822a;
            }
            chatMsg.f5700m = l;
            chatMsg.f5687A = chatMsg.f5700m;
        }
        ChatRoom a = DBManager.m3631a().f5565e.m3590a(j3, i);
        ChatRoomDao chatRoomDao = this.f5523a.f6426A;
        a.f5714A = Boolean.valueOf(false);
        if (z) {
            a.f5717D = Boolean.valueOf(true);
            chatRoomDao.d(a);
        }
        if (j2 == SharedPreferencesManager.m4308b() || friendUser == null) {
            str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        } else {
            str2 = friendUser.f5838q + ":";
        }
        if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT.getNumber()) {
            a.f5759t = str2 + str;
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE.getNumber()) {
            a.f5759t = str2 + BaseApplication.m3548a().getResources().getString(2131165229);
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL.getNumber()) {
            a.f5759t = str2 + BaseApplication.m3548a().getResources().getString(2131165224);
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_POKER_HISTORY.getNumber()) {
            a.f5759t = str2 + BaseApplication.m3548a().getResources().getString(2131165227);
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == DBManager.f5555y) {
            a.f5759t = str;
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE.getNumber()) {
            a.f5759t = str2 + BaseApplication.m3548a().getResources().getString(2131165225);
            a.f5745f = Long.valueOf(j4);
        } else if (i2 == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_WEBPAGE.getNumber()) {
            a.f5759t = str2 + str;
            a.f5745f = Long.valueOf(j4);
        }
        chatRoomDao.d(a);
        chatMsgDao.d(chatMsg);
        return chatMsg;
    }
}
