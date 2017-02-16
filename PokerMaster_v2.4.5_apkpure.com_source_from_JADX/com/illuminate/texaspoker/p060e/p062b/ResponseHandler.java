package com.illuminate.texaspoker.p060e.p062b;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.ClubMsgDao;
import com.illuminate.texaspoker.dao.ClubRecordDao;
import com.illuminate.texaspoker.dao.FriendUserDao;
import com.illuminate.texaspoker.dao.LeagueDao;
import com.illuminate.texaspoker.dao.LeagueMsgDao;
import com.illuminate.texaspoker.dao.MessageMsgDao;
import com.illuminate.texaspoker.p057b.BuyInControlMsgDBManager;
import com.illuminate.texaspoker.p057b.ChatMsgDBManager;
import com.illuminate.texaspoker.p057b.ChatRoomDBManager;
import com.illuminate.texaspoker.p057b.ClubMsgDBManager;
import com.illuminate.texaspoker.p057b.ClubRecordDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.FriendUserDBManager;
import com.illuminate.texaspoker.p057b.LeagueDBManager;
import com.illuminate.texaspoker.p057b.LeagueMsgDBManager;
import com.illuminate.texaspoker.p057b.MessageMsgDBManager;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.illuminate.texaspoker.p058c.ClubRecord;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.League;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.illuminate.texaspoker.tea.TEAUtil;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.SplashPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.component.view.TitleBar;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushManager;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPoker.ChatRoomInfo;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.GAME_ROOM_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCAddChatRoomUserRsp;
import com.texaspoker.moment.TexasPoker.SCBuyinActionRsp;
import com.texaspoker.moment.TexasPoker.SCCreateChatRoomRsp;
import com.texaspoker.moment.TexasPoker.SCCreateGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCCreateQuickGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCCreateQuickSNGGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCCreateSNGGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCEnterGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCEnterQuickGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import com.texaspoker.moment.TexasPoker.SCGameRoomStateChange;
import com.texaspoker.moment.TexasPoker.SCGameRoomStateChange.Builder;
import com.texaspoker.moment.TexasPoker.SCGetAllBuyinControlsRsp;
import com.texaspoker.moment.TexasPoker.SCGetChatRoomGamesByRoomIDRsp;
import com.texaspoker.moment.TexasPoker.SCGetChatRoomUsersByRoomIDRsp;
import com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoRsp;
import com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV4Rsp;
import com.texaspoker.moment.TexasPoker.SCGetQuickGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCHelloRsp;
import com.texaspoker.moment.TexasPoker.SCLeaveChatRoomRsp;
import com.texaspoker.moment.TexasPoker.SCLeaveGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCLoginRsp;
import com.texaspoker.moment.TexasPoker.SCLoginThirdPartyRsp;
import com.texaspoker.moment.TexasPoker.SCQuickLoginRsp;
import com.texaspoker.moment.TexasPoker.SCQuitQuickGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCReconnectRsp;
import com.texaspoker.moment.TexasPoker.SCRegetVerifyCodeRsp;
import com.texaspoker.moment.TexasPoker.SCRegisterRsp;
import com.texaspoker.moment.TexasPoker.SCRemoveChatRoomUserRsp;
import com.texaspoker.moment.TexasPoker.SCResetPwdUploadPhonenumberRsp;
import com.texaspoker.moment.TexasPoker.SCResetPwdVerifyCodeRsp;
import com.texaspoker.moment.TexasPoker.SCSetChatInfoSettingRsp;
import com.texaspoker.moment.TexasPoker.SCSetChatRoomInfoRsp;
import com.texaspoker.moment.TexasPoker.SCSignUpSNGGameRoomRsp;
import com.texaspoker.moment.TexasPoker.SCStartQuickRoomGameRsp;
import com.texaspoker.moment.TexasPoker.SCSystemGameRoomMsg;
import com.texaspoker.moment.TexasPoker.SCUploadChatRoomIconRsp;
import com.texaspoker.moment.TexasPoker.SCUploadVerifyCodeRsp;
import com.texaspoker.moment.TexasPoker.SCUseItemPushMsg;
import com.texaspoker.moment.TexasPoker.SCWatchSNGGameRoomRsp;
import com.texaspoker.moment.TexasPoker.UseItemPushMsg;
import com.texaspoker.moment.TexasPoker.UserGameInfoNet;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.PokerResultUserInfo;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttp.FlashPageInfo;
import com.texaspoker.moment.TexasPokerHttp.SCFeedbackRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetAllPokerHistoryRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetBenefitsRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetFavoriteListV2Rsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetFestivalModeRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetFlashPageInfosRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetLastPokerHandResultRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetPokerHandResultByHandIDRsp;
import com.texaspoker.moment.TexasPokerHttp.SCGetSystemMsgByIDRsp;
import com.texaspoker.moment.TexasPokerHttp.SCRemoveFavoriteV2Rsp;
import com.texaspoker.moment.TexasPokerHttp.SCRenameFavoriteRsp;
import com.texaspoker.moment.TexasPokerHttp.SCSaveFavoriteV2Rsp;
import com.texaspoker.moment.TexasPokerHttp.SCShareFavoriteRsp;
import com.texaspoker.moment.TexasPokerHttp.SystemMsgBaseInfo;
import com.texaspoker.moment.TexasPokerHttp.SystemMsgInfo;
import com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosV2Rsp;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_ACT;
import com.texaspoker.moment.TexasPokerHttpClub.SCAddClubFundRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCAddClubMaxMemberRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCClubActionRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCDeleteClubCoverRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetClubByClubIDRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetClubGamesByClubIDRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetClubInfoByUuidRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetClubSellingItemsRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetFundBillInfosRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCGetMyClubsV2Rsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCQuitClubRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCSetClubFundRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCSetClubInfoRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCSetClubUserLevelRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCUploadClubCoverRsp;
import com.texaspoker.moment.TexasPokerHttpClub.SCUploadClubIConRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_ACT;
import com.texaspoker.moment.TexasPokerHttpLeague.LeagueBaseInfo;
import com.texaspoker.moment.TexasPokerHttpLeague.SCCreateLeagueRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCEnterLeagueRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueBaseInfoByLeagueIDRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueByLeagueIDRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueInfoByClubIDRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCLeagueActionRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCQuitLeagueRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCSearchLeagueRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.SCSetLeagueSettingRsp;
import com.texaspoker.moment.TexasPokerHttpTransaction.SCBuyCoinAndroidRsp;
import com.texaspoker.moment.TexasPokerHttpTransaction.SCBuyCoinRsp;
import com.texaspoker.moment.TexasPokerHttpTransaction.SCGetCoinStoreListRsp;
import com.texaspoker.moment.TexasPokerHttpTransaction.SCPreBuyCoinAndroidRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCBuyNicknameRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCCheckNicknameStatusRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCGetLoginRewardRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCGetUserBaseInfoRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCGetUserInfoV2Rsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCRemarkUserNickNameRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCRemoveFriendRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoNewRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoRsp;
import com.texaspoker.moment.TexasPokerHttpUser.SCUploadIconRsp;
import com.texaspoker.moment.TexasPokerHttpUser.UserInfoNetV2;
import com.texaspoker.moment.TexasPokerHttpUser.UserStatisticsInfoNetV2;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.a.a.d.g;

/* renamed from: com.illuminate.texaspoker.e.b.g */
public final class ResponseHandler {
    private static ResponseHandler f6505a;
    private NotificationManager f6506b;

    /* renamed from: com.illuminate.texaspoker.e.b.g.1 */
    static /* synthetic */ class ResponseHandler {
        static final /* synthetic */ int[] f6503a;
        static final /* synthetic */ int[] f6504b;

        static {
            f6504b = new int[TEXAS_CMD.values().length];
            try {
                f6504b[TEXAS_CMD.Cmd_SCStandUpRsp.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSitDownRsp.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyBuyInV2Rsp.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCStartGameRsp.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGameRoomStateChange.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGameActionRsp.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetBillInfoByRoomIDRsp.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUseDelayItemRsp.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCShowCardRsp.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUseItemRsp.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUseItemPushMsg.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetGameRoomInfoByRoomIDRsp.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetLastPokerHandResultRsp.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetBuyinControlStateRsp.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCPauseGameRsp.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLeaveSNGGameRoomRsp.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCReturnGameRsp.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCForceBBRsp.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyInsuranceRsp.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyInsuranceDelayRsp.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUserInsuranceSettingRsp.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetGameSettingRsp.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCPushMsg.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSendMsgRsp.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemFriendMsg.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemChatRoomMsg.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemClubMsg.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemQuickGameRoomMsg.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCKickOffPush.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemGameRoomMsg.ordinal()] = 30;
            } catch (NoSuchFieldError e30) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyinControlMsg.ordinal()] = 31;
            } catch (NoSuchFieldError e31) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadAPNTokenRsp.ordinal()] = 32;
            } catch (NoSuchFieldError e32) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSystemLeagueMsg.ordinal()] = 33;
            } catch (NoSuchFieldError e33) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetBannerInfosRsp.ordinal()] = 34;
            } catch (NoSuchFieldError e34) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUpdateRsp.ordinal()] = 35;
            } catch (NoSuchFieldError e35) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFriendStatusRsp.ordinal()] = 36;
            } catch (NoSuchFieldError e36) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadUserCoverRsp.ordinal()] = 37;
            } catch (NoSuchFieldError e37) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCDeleteUserCoverRsp.ordinal()] = 38;
            } catch (NoSuchFieldError e38) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadFriendRelationRsp.ordinal()] = 39;
            } catch (NoSuchFieldError e39) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSearchFriendRsp.ordinal()] = 40;
            } catch (NoSuchFieldError e40) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetUserInfoSettingRsp.ordinal()] = 41;
            } catch (NoSuchFieldError e41) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCInviteActionRsp.ordinal()] = 42;
            } catch (NoSuchFieldError e42) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetSellingItemListRsp.ordinal()] = 43;
            } catch (NoSuchFieldError e43) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuySellingItemRsp.ordinal()] = 44;
            } catch (NoSuchFieldError e44) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetSystemMsgsRsp.ordinal()] = 45;
            } catch (NoSuchFieldError e45) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateClubRsp.ordinal()] = 46;
            } catch (NoSuchFieldError e46) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSearchClubRsp.ordinal()] = 47;
            } catch (NoSuchFieldError e47) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubsByLocationRsp.ordinal()] = 48;
            } catch (NoSuchFieldError e48) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubBaseInfoByClubIDRsp.ordinal()] = 49;
            } catch (NoSuchFieldError e49) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCEnterClubRsp.ordinal()] = 50;
            } catch (NoSuchFieldError e50) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCClubActionRsp.ordinal()] = 51;
            } catch (NoSuchFieldError e51) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubByClubIDRsp.ordinal()] = 52;
            } catch (NoSuchFieldError e52) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetClubSettingRsp.ordinal()] = 53;
            } catch (NoSuchFieldError e53) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCQuitClubRsp.ordinal()] = 54;
            } catch (NoSuchFieldError e54) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetClubUserLevelRsp.ordinal()] = 55;
            } catch (NoSuchFieldError e55) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubSellingItemsRsp.ordinal()] = 56;
            } catch (NoSuchFieldError e56) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCAddClubMaxMemberRsp.ordinal()] = 57;
            } catch (NoSuchFieldError e57) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFundBillInfosRsp.ordinal()] = 58;
            } catch (NoSuchFieldError e58) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetClubFundRsp.ordinal()] = 59;
            } catch (NoSuchFieldError e59) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCAddClubFundRsp.ordinal()] = 60;
            } catch (NoSuchFieldError e60) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadClubIConRsp.ordinal()] = 61;
            } catch (NoSuchFieldError e61) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadClubCoverRsp.ordinal()] = 62;
            } catch (NoSuchFieldError e62) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCDeleteClubCoverRsp.ordinal()] = 63;
            } catch (NoSuchFieldError e63) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetClubInfoRsp.ordinal()] = 64;
            } catch (NoSuchFieldError e64) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubInfoByUuidRsp.ordinal()] = 65;
            } catch (NoSuchFieldError e65) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRemoveFriendRsp.ordinal()] = 66;
            } catch (NoSuchFieldError e66) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCFeedbackRsp.ordinal()] = 67;
            } catch (NoSuchFieldError e67) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetSystemMsgByIDRsp.ordinal()] = 68;
            } catch (NoSuchFieldError e68) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetBenefitsRsp.ordinal()] = 69;
            } catch (NoSuchFieldError e69) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFavoriteListV2Rsp.ordinal()] = 70;
            } catch (NoSuchFieldError e70) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRemoveFavoriteV2Rsp.ordinal()] = 71;
            } catch (NoSuchFieldError e71) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetAllPokerHistoryRsp.ordinal()] = 72;
            } catch (NoSuchFieldError e72) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSaveFavoriteV2Rsp.ordinal()] = 73;
            } catch (NoSuchFieldError e73) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRenameFavoriteRsp.ordinal()] = 74;
            } catch (NoSuchFieldError e74) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetUserBaseInfoRsp.ordinal()] = 75;
            } catch (NoSuchFieldError e75) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetBillInfosV2Rsp.ordinal()] = 76;
            } catch (NoSuchFieldError e76) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCPreBuyCoinAndroidRsp.ordinal()] = 77;
            } catch (NoSuchFieldError e77) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetLoginRewardRsp.ordinal()] = 78;
            } catch (NoSuchFieldError e78) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetCoinStoreListRsp.ordinal()] = 79;
            } catch (NoSuchFieldError e79) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRemarkUserNickNameRsp.ordinal()] = 80;
            } catch (NoSuchFieldError e80) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetMyClubsV2Rsp.ordinal()] = 81;
            } catch (NoSuchFieldError e81) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetPokerHandResultByHandIDRsp.ordinal()] = 82;
            } catch (NoSuchFieldError e82) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCShareFavoriteRsp.ordinal()] = 83;
            } catch (NoSuchFieldError e83) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyCoinAndroidRsp.ordinal()] = 84;
            } catch (NoSuchFieldError e84) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCReportLocationInfoRsp.ordinal()] = 85;
            } catch (NoSuchFieldError e85) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetLeagueInfoByClubIDRsp.ordinal()] = 86;
            } catch (NoSuchFieldError e86) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateLeagueRsp.ordinal()] = 87;
            } catch (NoSuchFieldError e87) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSearchLeagueRsp.ordinal()] = 88;
            } catch (NoSuchFieldError e88) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCEnterLeagueRsp.ordinal()] = 89;
            } catch (NoSuchFieldError e89) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetLeagueBaseInfoByLeagueIDRsp.ordinal()] = 90;
            } catch (NoSuchFieldError e90) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLeagueActionRsp.ordinal()] = 91;
            } catch (NoSuchFieldError e91) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetLeagueSettingRsp.ordinal()] = 92;
            } catch (NoSuchFieldError e92) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCQuitLeagueRsp.ordinal()] = 93;
            } catch (NoSuchFieldError e93) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetLeagueByLeagueIDRsp.ordinal()] = 94;
            } catch (NoSuchFieldError e94) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFlashPageInfosRsp.ordinal()] = 95;
            } catch (NoSuchFieldError e95) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFestivalModeRsp.ordinal()] = 96;
            } catch (NoSuchFieldError e96) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCReconnectRsp.ordinal()] = 97;
            } catch (NoSuchFieldError e97) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCHelloRsp.ordinal()] = 98;
            } catch (NoSuchFieldError e98) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCQuickLoginRsp.ordinal()] = 99;
            } catch (NoSuchFieldError e99) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLoginRsp.ordinal()] = 100;
            } catch (NoSuchFieldError e100) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRegisterRsp.ordinal()] = XGPushManager.OPERATION_REQ_UNREGISTER;
            } catch (NoSuchFieldError e101) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadVerifyCodeRsp.ordinal()] = R.AppCompatTheme_buttonStyle;
            } catch (NoSuchFieldError e102) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRegetVerifyCodeRsp.ordinal()] = R.AppCompatTheme_buttonStyleSmall;
            } catch (NoSuchFieldError e103) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCResetPwdUploadPhonenumberRsp.ordinal()] = R.AppCompatTheme_checkboxStyle;
            } catch (NoSuchFieldError e104) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCResetPwdVerifyCodeRsp.ordinal()] = R.AppCompatTheme_checkedTextViewStyle;
            } catch (NoSuchFieldError e105) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLoginThirdPartyRsp.ordinal()] = R.AppCompatTheme_editTextStyle;
            } catch (NoSuchFieldError e106) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFrontPageInfoRsp.ordinal()] = R.AppCompatTheme_radioButtonStyle;
            } catch (NoSuchFieldError e107) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadIconRsp.ordinal()] = R.AppCompatTheme_ratingBarStyle;
            } catch (NoSuchFieldError e108) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetUserInfoRsp.ordinal()] = R.AppCompatTheme_ratingBarStyleIndicator;
            } catch (NoSuchFieldError e109) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetUserInfoNewRsp.ordinal()] = R.AppCompatTheme_ratingBarStyleSmall;
            } catch (NoSuchFieldError e110) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetUserInfoV2Rsp.ordinal()] = R.AppCompatTheme_seekBarStyle;
            } catch (NoSuchFieldError e111) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLogoutRsp.ordinal()] = R.AppCompatTheme_spinnerStyle;
            } catch (NoSuchFieldError e112) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetQuickGameRoomRsp.ordinal()] = R.AppCompatTheme_switchStyle;
            } catch (NoSuchFieldError e113) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetFrontPageInfoV4Rsp.ordinal()] = R.AppCompatTheme_listMenuViewStyle;
            } catch (NoSuchFieldError e114) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateQuickGameRoomRsp.ordinal()] = 115;
            } catch (NoSuchFieldError e115) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateGameRoomRsp.ordinal()] = 116;
            } catch (NoSuchFieldError e116) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetClubGamesByClubIDRsp.ordinal()] = 117;
            } catch (NoSuchFieldError e117) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetChatRoomGamesByRoomIDRsp.ordinal()] = 118;
            } catch (NoSuchFieldError e118) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateChatRoomRsp.ordinal()] = 119;
            } catch (NoSuchFieldError e119) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCAddChatRoomUserRsp.ordinal()] = 120;
            } catch (NoSuchFieldError e120) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetChatInfoSettingRsp.ordinal()] = 121;
            } catch (NoSuchFieldError e121) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSetChatRoomInfoRsp.ordinal()] = 122;
            } catch (NoSuchFieldError e122) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLeaveChatRoomRsp.ordinal()] = 123;
            } catch (NoSuchFieldError e123) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetChatRoomUsersByRoomIDRsp.ordinal()] = 124;
            } catch (NoSuchFieldError e124) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCRemoveChatRoomUserRsp.ordinal()] = 125;
            } catch (NoSuchFieldError e125) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCUploadChatRoomIconRsp.ordinal()] = TransportMediator.KEYCODE_MEDIA_PLAY;
            } catch (NoSuchFieldError e126) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCheckNicknameStatusRsp.ordinal()] = TransportMediator.KEYCODE_MEDIA_PAUSE;
            } catch (NoSuchFieldError e127) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyNicknameRsp.ordinal()] = AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
            } catch (NoSuchFieldError e128) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCStartQuickRoomGameRsp.ordinal()] = 129;
            } catch (NoSuchFieldError e129) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCQuitQuickGameRoomRsp.ordinal()] = TransportMediator.KEYCODE_MEDIA_RECORD;
            } catch (NoSuchFieldError e130) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCEnterQuickGameRoomRsp.ordinal()] = 131;
            } catch (NoSuchFieldError e131) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCEnterGameRoomRsp.ordinal()] = 132;
            } catch (NoSuchFieldError e132) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCLeaveGameRoomRsp.ordinal()] = 133;
            } catch (NoSuchFieldError e133) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyCoinRsp.ordinal()] = 134;
            } catch (NoSuchFieldError e134) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateQuickSNGGameRoomRsp.ordinal()] = 135;
            } catch (NoSuchFieldError e135) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCWatchSNGGameRoomRsp.ordinal()] = 136;
            } catch (NoSuchFieldError e136) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCSignUpSNGGameRoomRsp.ordinal()] = 137;
            } catch (NoSuchFieldError e137) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCCreateSNGGameRoomRsp.ordinal()] = 138;
            } catch (NoSuchFieldError e138) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCGetAllBuyinControlsRsp.ordinal()] = 139;
            } catch (NoSuchFieldError e139) {
            }
            try {
                f6504b[TEXAS_CMD.Cmd_SCBuyinActionRsp.ordinal()] = 140;
            } catch (NoSuchFieldError e140) {
            }
            f6503a = new int[ERROR_CODE_TYPE.values().length];
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER.ordinal()] = 1;
            } catch (NoSuchFieldError e141) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_CHATROOM.ordinal()] = 2;
            } catch (NoSuchFieldError e142) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_REGISTER_USER_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError e143) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_VERIFY_CODE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e144) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_ID_PWD_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e145) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_FRIEND_NOT_EXIST.ordinal()] = 6;
            } catch (NoSuchFieldError e146) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_INVITED.ordinal()] = 7;
            } catch (NoSuchFieldError e147) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CHATROOM_OVERFLOW.ordinal()] = 8;
            } catch (NoSuchFieldError e148) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_GAMEROOM_OVERFLOW.ordinal()] = 9;
            } catch (NoSuchFieldError e149) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_SERVER_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError e150) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_GAME_ROOM.ordinal()] = 11;
            } catch (NoSuchFieldError e151) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_GAME_ROOM_FULL.ordinal()] = 12;
            } catch (NoSuchFieldError e152) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY.ordinal()] = 13;
            } catch (NoSuchFieldError e153) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_FRIEND.ordinal()] = 14;
            } catch (NoSuchFieldError e154) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_SHARE_ENOUGH.ordinal()] = 15;
            } catch (NoSuchFieldError e155) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_MORE_REWARDED.ordinal()] = 16;
            } catch (NoSuchFieldError e156) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_BILL.ordinal()] = 17;
            } catch (NoSuchFieldError e157) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_FAVORITE.ordinal()] = 18;
            } catch (NoSuchFieldError e158) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_FAVORITE_DATA_ERROR.ordinal()] = 19;
            } catch (NoSuchFieldError e159) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_SELLING_ITEM.ordinal()] = 20;
            } catch (NoSuchFieldError e160) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_ENOUGH_COIN.ordinal()] = 21;
            } catch (NoSuchFieldError e161) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM.ordinal()] = 22;
            } catch (NoSuchFieldError e162) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER.ordinal()] = 23;
            } catch (NoSuchFieldError e163) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM.ordinal()] = 24;
            } catch (NoSuchFieldError e164) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER.ordinal()] = 25;
            } catch (NoSuchFieldError e165) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER_IN_CHATROOM.ordinal()] = 26;
            } catch (NoSuchFieldError e166) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR.ordinal()] = 27;
            } catch (NoSuchFieldError e167) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_UNKNOWN.ordinal()] = 28;
            } catch (NoSuchFieldError e168) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER_INPOS.ordinal()] = 29;
            } catch (NoSuchFieldError e169) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_BUY_LOW_VIP.ordinal()] = 30;
            } catch (NoSuchFieldError e170) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM.ordinal()] = 31;
            } catch (NoSuchFieldError e171) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_FRIEND_ALREADY.ordinal()] = 32;
            } catch (NoSuchFieldError e172) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_OFFLINE_GAME_OVERED.ordinal()] = 33;
            } catch (NoSuchFieldError e173) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_OVERFLOW.ordinal()] = 34;
            } catch (NoSuchFieldError e174) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_CLUB.ordinal()] = 35;
            } catch (NoSuchFieldError e175) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_CLUB_AUTH.ordinal()] = 36;
            } catch (NoSuchFieldError e176) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_NO_USER.ordinal()] = 37;
            } catch (NoSuchFieldError e177) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY.ordinal()] = 38;
            } catch (NoSuchFieldError e178) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_QUICK_GAMEROOM.ordinal()] = 39;
            } catch (NoSuchFieldError e179) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START.ordinal()] = 40;
            } catch (NoSuchFieldError e180) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER_GET_MONEY.ordinal()] = 41;
            } catch (NoSuchFieldError e181) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM.ordinal()] = 42;
            } catch (NoSuchFieldError e182) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_TRANSACTIONID.ordinal()] = 43;
            } catch (NoSuchFieldError e183) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_TRANSACTIONID_REPEAT.ordinal()] = 44;
            } catch (NoSuchFieldError e184) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_TRANSACTIONID_ERROR.ordinal()] = 45;
            } catch (NoSuchFieldError e185) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_BUYIN_MAX_STACKS.ordinal()] = 46;
            } catch (NoSuchFieldError e186) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_GET_BENFIT_ALREADY.ordinal()] = 47;
            } catch (NoSuchFieldError e187) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT.ordinal()] = 48;
            } catch (NoSuchFieldError e188) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE.ordinal()] = 49;
            } catch (NoSuchFieldError e189) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE.ordinal()] = 50;
            } catch (NoSuchFieldError e190) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM.ordinal()] = 51;
            } catch (NoSuchFieldError e191) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER.ordinal()] = 52;
            } catch (NoSuchFieldError e192) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_HANDRESULT.ordinal()] = 53;
            } catch (NoSuchFieldError e193) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_BEFORE_GAME.ordinal()] = 54;
            } catch (NoSuchFieldError e194) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_POKERHISTORY.ordinal()] = 55;
            } catch (NoSuchFieldError e195) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN.ordinal()] = 56;
            } catch (NoSuchFieldError e196) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_USER_IN_GAME.ordinal()] = 57;
            } catch (NoSuchFieldError e197) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_INVITE_BUYIN.ordinal()] = 58;
            } catch (NoSuchFieldError e198) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_AUTH_BUYINACTION.ordinal()] = 59;
            } catch (NoSuchFieldError e199) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_PAUSED.ordinal()] = 60;
            } catch (NoSuchFieldError e200) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND.ordinal()] = 61;
            } catch (NoSuchFieldError e201) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_START.ordinal()] = 62;
            } catch (NoSuchFieldError e202) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_OWNER.ordinal()] = 63;
            } catch (NoSuchFieldError e203) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_USER_ALREADY_IN.ordinal()] = 64;
            } catch (NoSuchFieldError e204) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_FAVORITE_OVERFLOW.ordinal()] = 65;
            } catch (NoSuchFieldError e205) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START.ordinal()] = 66;
            } catch (NoSuchFieldError e206) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT.ordinal()] = 67;
            } catch (NoSuchFieldError e207) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY.ordinal()] = 68;
            } catch (NoSuchFieldError e208) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_SERVER_MAINTENANCEING.ordinal()] = 69;
            } catch (NoSuchFieldError e209) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_BLACKED.ordinal()] = 70;
            } catch (NoSuchFieldError e210) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_IP_CHECK_ERROR.ordinal()] = 71;
            } catch (NoSuchFieldError e211) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_GPS_CHECK_ERROR.ordinal()] = 72;
            } catch (NoSuchFieldError e212) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR.ordinal()] = 73;
            } catch (NoSuchFieldError e213) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_OVERFLOW.ordinal()] = 74;
            } catch (NoSuchFieldError e214) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE.ordinal()] = 75;
            } catch (NoSuchFieldError e215) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW.ordinal()] = 76;
            } catch (NoSuchFieldError e216) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW.ordinal()] = 77;
            } catch (NoSuchFieldError e217) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE.ordinal()] = 78;
            } catch (NoSuchFieldError e218) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_LEAGUE.ordinal()] = 79;
            } catch (NoSuchFieldError e219) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET.ordinal()] = 80;
            } catch (NoSuchFieldError e220) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB.ordinal()] = 81;
            } catch (NoSuchFieldError e221) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_MUTE.ordinal()] = 82;
            } catch (NoSuchFieldError e222) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_IN_LEAGUE_ALREADY.ordinal()] = 83;
            } catch (NoSuchFieldError e223) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_IN_LEAGUE.ordinal()] = 84;
            } catch (NoSuchFieldError e224) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY.ordinal()] = 85;
            } catch (NoSuchFieldError e225) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_SAME_NAME.ordinal()] = 86;
            } catch (NoSuchFieldError e226) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_MANAGER_FULL.ordinal()] = 87;
            } catch (NoSuchFieldError e227) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW.ordinal()] = 88;
            } catch (NoSuchFieldError e228) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_INVITE_FRIEND_MUTE.ordinal()] = 89;
            } catch (NoSuchFieldError e229) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE.ordinal()] = 90;
            } catch (NoSuchFieldError e230) {
            }
            try {
                f6503a[ERROR_CODE_TYPE.ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST.ordinal()] = 91;
            } catch (NoSuchFieldError e231) {
            }
        }
    }

    public static ResponseHandler m3963a() {
        if (f6505a == null) {
            f6505a = new ResponseHandler();
        }
        return f6505a;
    }

    public ResponseHandler() {
        this.f6506b = (NotificationManager) BaseApplication.m3548a().getSystemService("notification");
    }

    private static void m3967a(String str, Object... objArr) {
        Intent intent = new Intent();
        intent.setAction("com.illuminate.texaspoker.notifyaction");
        intent.putExtra("NOTIFY_NAME", str);
        Object arrayList = new ArrayList();
        Collections.addAll(arrayList, objArr);
        intent.putExtra("NOTIFY_DATA", arrayList);
        BaseApplication.m3548a().sendBroadcast(intent);
    }

    private static void m3965a(UserBaseInfoNet userBaseInfoNet) {
        if (!(SharedPreferencesManager.m4308b() == userBaseInfoNet.getUuid() || SharedPreferencesManager.m4308b() == -1)) {
            String ac = SharedPreferencesManager.ac();
            SharedPreferencesManager.m4300a();
            SharedPreferencesManager.m4379k(ac);
        }
        SharedPreferencesManager.m4303a(userBaseInfoNet.getUuid());
        SharedPreferencesManager.m4312b(userBaseInfoNet.getStrID());
        SharedPreferencesManager.m4322c(userBaseInfoNet.getStrSmallCover());
        SharedPreferencesManager.m4331d(userBaseInfoNet.getStrCover());
        SharedPreferencesManager.m4304a(userBaseInfoNet.getStrNick());
        SharedPreferencesManager.m4301a(userBaseInfoNet.getEType().getNumber());
        SharedPreferencesManager.m4309b(userBaseInfoNet.getEVipType().getNumber());
        SharedPreferencesManager.m4319c(userBaseInfoNet.getIGender());
        SharedPreferencesManager.m4311b(userBaseInfoNet.getLCoin());
        SharedPreferencesManager.m4321c(userBaseInfoNet.getLPopularity());
        if (StringUtils.m4462a(userBaseInfoNet.getStrDesc())) {
            SharedPreferencesManager.m4345f(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            SharedPreferencesManager.m4345f(userBaseInfoNet.getStrDesc());
        }
        if (userBaseInfoNet.getIMute() == 0) {
            SharedPreferencesManager.m4328d(1);
        } else {
            SharedPreferencesManager.m4328d(0);
        }
        if (userBaseInfoNet.getIVibrate() == 0) {
            SharedPreferencesManager.m4342f(1);
        } else {
            SharedPreferencesManager.m4342f(0);
        }
        if (userBaseInfoNet.getIFriendInviteMute() == 0) {
            SharedPreferencesManager.m4348g(0);
        } else {
            SharedPreferencesManager.m4348g(1);
        }
    }

    private static void m3966a(UserInfoNetV2 userInfoNetV2) {
        if (!(SharedPreferencesManager.m4308b() == userInfoNetV2.getStBaseInfo().getUuid() || SharedPreferencesManager.m4308b() == -1)) {
            String ac = SharedPreferencesManager.ac();
            SharedPreferencesManager.m4300a();
            SharedPreferencesManager.m4354h();
            SharedPreferencesManager.m4379k(ac);
        }
        SharedPreferencesManager.m4303a(userInfoNetV2.getStBaseInfo().getUuid());
        SharedPreferencesManager.m4312b(userInfoNetV2.getStBaseInfo().getStrID());
        SharedPreferencesManager.m4331d(userInfoNetV2.getStBaseInfo().getStrCover());
        SharedPreferencesManager.m4322c(userInfoNetV2.getStBaseInfo().getStrSmallCover());
        SharedPreferencesManager.m4304a(userInfoNetV2.getStBaseInfo().getStrNick());
        SharedPreferencesManager.m4301a(userInfoNetV2.getStBaseInfo().getEType().getNumber());
        SharedPreferencesManager.m4309b(userInfoNetV2.getStBaseInfo().getEVipType().getNumber());
        SharedPreferencesManager.m4319c(userInfoNetV2.getStBaseInfo().getIGender());
        SharedPreferencesManager.m4311b(userInfoNetV2.getStBaseInfo().getLCoin());
        SharedPreferencesManager.m4321c(userInfoNetV2.getStBaseInfo().getLPopularity());
        SharedPreferencesManager.m4336e(userInfoNetV2.getStBaseInfo().getLVIPLimitTime());
        if (StringUtils.m4462a(userInfoNetV2.getStBaseInfo().getStrDesc())) {
            SharedPreferencesManager.m4345f(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            SharedPreferencesManager.m4345f(userInfoNetV2.getStBaseInfo().getStrDesc());
        }
        DBManager.m3631a().f5561a.m3638b(SharedPreferencesManager.m4308b(), userInfoNetV2.getStBaseInfo().getSSmallAlbumsList(), userInfoNetV2.getStBaseInfo().getSBigAlbumsList());
        SharedPreferencesManager.m4344f(userInfoNetV2.getStUserStatisticsInfo().getLTotalGames());
        SharedPreferencesManager.m4350g(userInfoNetV2.getStUserStatisticsInfo().getLVPIPNum());
        SharedPreferencesManager.m4357h(userInfoNetV2.getStUserStatisticsInfo().getLTotalHands());
        SharedPreferencesManager.m4364i(userInfoNetV2.getStUserStatisticsInfo().getLWinTimes());
        ClubRecordDBManager clubRecordDBManager = DBManager.m3631a().f5577q;
        List<UserStatisticsInfoNetV2> stClubUserStatisticsInfoList = userInfoNetV2.getStClubUserStatisticsInfoList();
        clubRecordDBManager.f5536a.a();
        try {
            ClubRecordDao clubRecordDao = clubRecordDBManager.f5537b.f6431F;
            Object obj = 1;
            for (ClubRecord clubRecord : g.a(clubRecordDBManager.f5537b.f6431F).a().b()) {
                Object obj2;
                for (UserStatisticsInfoNetV2 lBelongClubID : stClubUserStatisticsInfoList) {
                    if (clubRecord.f5809b.longValue() == lBelongClubID.getLBelongClubID()) {
                        obj2 = null;
                        break;
                    }
                }
                obj2 = obj;
                if (obj2 != null) {
                    clubRecordDao.e(clubRecord);
                }
                obj = obj2;
            }
            for (UserStatisticsInfoNetV2 userStatisticsInfoNetV2 : stClubUserStatisticsInfoList) {
                ClubRecordDao clubRecordDao2 = clubRecordDBManager.f5537b.f6431F;
                ClubRecord a = clubRecordDBManager.m3630a(userStatisticsInfoNetV2.getLBelongClubID());
                if (a == null) {
                    a = new ClubRecord();
                }
                a.f5809b = Long.valueOf(userStatisticsInfoNetV2.getLBelongClubID());
                a.f5811d = Long.valueOf(userStatisticsInfoNetV2.getLTotalGames());
                a.f5810c = Long.valueOf(userStatisticsInfoNetV2.getLVPIPNum());
                a.f5812e = Long.valueOf(userStatisticsInfoNetV2.getLTotalHands());
                a.f5813f = Long.valueOf(userStatisticsInfoNetV2.getLWinTimes());
                clubRecordDao2.d(a);
            }
            clubRecordDBManager.f5536a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ClubRecordDBManager", e.getMessage(), e);
        } finally {
            clubRecordDBManager.f5536a.b();
        }
        SharedPreferencesManager.m4372j(userInfoNetV2.getStUserVipStatisticsInfo().getLTotalBuyin());
        SharedPreferencesManager.m4378k(userInfoNetV2.getStUserVipStatisticsInfo().getLTotalRemain());
        SharedPreferencesManager.m4386l(userInfoNetV2.getStUserVipStatisticsInfo().getLAverageWinStacks());
        SharedPreferencesManager.m4394m(userInfoNetV2.getStUserVipStatisticsInfo().getLAverageLoseStacks());
        if (StringUtils.m4462a(userInfoNetV2.getStUserVipStatisticsInfo().getSRank())) {
            SharedPreferencesManager.m4401n(800);
        } else {
            SharedPreferencesManager.m4401n((long) Float.valueOf(userInfoNetV2.getStUserVipStatisticsInfo().getSRank()).floatValue());
        }
        SharedPreferencesManager.m4406o(userInfoNetV2.getStUserVipStatisticsInfo().getLDays());
    }

    private static void m3964a(DefaultSettingInfoNet defaultSettingInfoNet) {
        SharedPreferencesManager.m4355h(defaultSettingInfoNet.getIFavoriteNum());
        SharedPreferencesManager.m4362i(defaultSettingInfoNet.getIMaxClubNums());
        SharedPreferencesManager.m4392m(defaultSettingInfoNet.getISeniorGamrRoomCost());
        RuntimeData.f6681l = defaultSettingInfoNet.getVSNGBlindsStructuresList();
        RuntimeData.f6682m = defaultSettingInfoNet.getVOddsStructureList();
        if (defaultSettingInfoNet.getBInsurance() == 1) {
            SharedPreferencesManager.m4323c(true);
        } else {
            SharedPreferencesManager.m4323c(false);
        }
    }

    private static int m3962a(ERROR_CODE_TYPE error_code_type) {
        switch (ResponseHandler.f6503a[error_code_type.ordinal()]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 2131165574;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 2131165575;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 2131165576;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return 2131165577;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                return 2131165578;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                return 2131165579;
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                return 2131165580;
            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                return 2131165581;
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                return 2131165582;
            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                return 2131165583;
            case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                return 2131165584;
            case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                return 2131165585;
            case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                return 2131165586;
            case PushMsg.STRPICURL_FIELD_NUMBER /*14*/:
                return 2131165587;
            case PushMsg.LCREATETIME_FIELD_NUMBER /*15*/:
                return 2131165588;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return 2131165589;
            case PushMsg.IMUTE_FIELD_NUMBER /*17*/:
                return 2131165590;
            case PushMsg.IVIBRATE_FIELD_NUMBER /*18*/:
                return 2131165591;
            case PushMsg.STNETPAGESHAREINFONET_FIELD_NUMBER /*19*/:
                return 2131165592;
            case PushMsg.STSHAREPOKERHISTORYINFO_FIELD_NUMBER /*20*/:
                return 2131165593;
            case PushMsg.VEXTRAS_FIELD_NUMBER /*21*/:
                return 2131165594;
            case GameRoomBaseInfo.IGAMEROOMUSERMAXNUMS_FIELD_NUMBER /*22*/:
                return 2131165595;
            case GameRoomBaseInfo.IANTE_FIELD_NUMBER /*23*/:
                return 2131165596;
            case GameRoomBaseInfo.BINSURANCE_FIELD_NUMBER /*24*/:
                return 2131165597;
            case GameRoomBaseInfo.BINGAME_FIELD_NUMBER /*25*/:
                return 2131165598;
            case GameRoomBaseInfo.EGAMEROOMTYPE_FIELD_NUMBER /*26*/:
                return 2131165599;
            case GameRoomBaseInfo.LSTARTTIME_FIELD_NUMBER /*27*/:
                return 2131165600;
            case GameRoomBaseInfo.BGPSLIMIT_FIELD_NUMBER /*29*/:
                return 2131165602;
            case GameRoomBaseInfo.LLEAGUEID_FIELD_NUMBER /*30*/:
                return 2131165603;
            case GameRoomBaseInfo.SLEAGUENAME_FIELD_NUMBER /*31*/:
                return 2131165604;
            case GameRoomBaseInfo.SFROMCLUBNAME_FIELD_NUMBER /*32*/:
                return 2131165605;
            case GameRoomBaseInfo.SFROMCLUBURL_FIELD_NUMBER /*33*/:
                return 2131165606;
            case GameRoomBaseInfo.ITHINKINGINTERVAL_FIELD_NUMBER /*34*/:
                return 2131165607;
            case GameRoomBaseInfo.BSTRADDLE_FIELD_NUMBER /*35*/:
                return 2131165608;
            case GameRoomBaseInfo.SFROMCLUBCREATORNAME_FIELD_NUMBER /*36*/:
                return 2131165609;
            case R.AppCompatTheme_actionModeFindDrawable /*37*/:
                return 2131165610;
            case R.AppCompatTheme_actionModeWebSearchDrawable /*38*/:
                return 2131165611;
            case R.AppCompatTheme_actionModePopupWindowStyle /*39*/:
                return 2131165612;
            case R.AppCompatTheme_textAppearanceLargePopupMenu /*40*/:
                return 2131165613;
            case R.AppCompatTheme_textAppearanceSmallPopupMenu /*41*/:
                return 2131165614;
            case R.AppCompatTheme_textAppearancePopupMenuHeader /*42*/:
                return 2131165615;
            case R.AppCompatTheme_dialogTheme /*43*/:
                return 2131165616;
            case R.AppCompatTheme_dialogPreferredPadding /*44*/:
                return 2131165617;
            case TitleBar.TITLE_BAR_HEIGHT /*45*/:
                return 2131165618;
            case R.AppCompatTheme_actionDropDownStyle /*46*/:
                return 2131165619;
            case R.AppCompatTheme_dropdownListPreferredItemHeight /*47*/:
                return 2131165620;
            case R.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                return 2131165621;
            case R.AppCompatTheme_homeAsUpIndicator /*49*/:
                return 2131165622;
            case R.AppCompatTheme_actionButtonStyle /*50*/:
                return 2131165623;
            case R.AppCompatTheme_buttonBarStyle /*51*/:
                return 2131165624;
            case R.AppCompatTheme_buttonBarButtonStyle /*52*/:
                return 2131165625;
            case R.AppCompatTheme_selectableItemBackground /*53*/:
                return 2131165626;
            case R.AppCompatTheme_selectableItemBackgroundBorderless /*54*/:
                return 2131165627;
            case R.AppCompatTheme_borderlessButtonStyle /*55*/:
                return 2131165628;
            case R.AppCompatTheme_dividerVertical /*56*/:
                return 2131165629;
            case R.AppCompatTheme_dividerHorizontal /*57*/:
                return 2131165630;
            case R.AppCompatTheme_activityChooserViewStyle /*58*/:
                return 2131165631;
            case R.AppCompatTheme_toolbarStyle /*59*/:
                return 2131165632;
            case R.AppCompatTheme_toolbarNavigationButtonStyle /*60*/:
                return 2131165633;
            case R.AppCompatTheme_popupMenuStyle /*61*/:
                return 2131165634;
            case R.AppCompatTheme_popupWindowStyle /*62*/:
                return 2131165635;
            case R.AppCompatTheme_editTextColor /*63*/:
                return 2131165636;
            case R.AppCompatTheme_editTextBackground /*64*/:
                return 2131165637;
            case R.AppCompatTheme_imageButtonStyle /*65*/:
                return 2131165638;
            case R.AppCompatTheme_textAppearanceSearchResultTitle /*66*/:
                return 2131165639;
            case R.AppCompatTheme_textAppearanceSearchResultSubtitle /*67*/:
                return 2131165640;
            case R.AppCompatTheme_textColorSearchUrl /*68*/:
                return 2131165641;
            case R.AppCompatTheme_searchViewStyle /*69*/:
                return 2131165641;
            case R.AppCompatTheme_listPreferredItemHeight /*70*/:
                return 2131165643;
            case R.AppCompatTheme_listPreferredItemHeightSmall /*71*/:
                return 2131165644;
            case R.AppCompatTheme_listPreferredItemHeightLarge /*72*/:
                return 2131165645;
            case R.AppCompatTheme_listPreferredItemPaddingLeft /*73*/:
                return 2131165646;
            case R.AppCompatTheme_listPreferredItemPaddingRight /*74*/:
                return 2131165647;
            case R.AppCompatTheme_dropDownListViewStyle /*75*/:
                return 2131165648;
            case R.AppCompatTheme_listPopupWindowStyle /*76*/:
                return 2131165649;
            case R.AppCompatTheme_textAppearanceListItem /*77*/:
                return 2131165650;
            case R.AppCompatTheme_textAppearanceListItemSmall /*78*/:
                return 2131165651;
            case R.AppCompatTheme_panelBackground /*79*/:
                return 2131165652;
            case R.AppCompatTheme_panelMenuListWidth /*80*/:
                return 2131165653;
            case R.AppCompatTheme_panelMenuListTheme /*81*/:
                return 2131165654;
            case R.AppCompatTheme_listChoiceBackgroundIndicator /*82*/:
                return 2131165655;
            case R.AppCompatTheme_colorPrimary /*83*/:
                return 2131165656;
            case R.AppCompatTheme_colorPrimaryDark /*84*/:
                return 2131165657;
            case R.AppCompatTheme_colorAccent /*85*/:
                return 2131165658;
            case R.AppCompatTheme_colorControlNormal /*86*/:
                return 2131165659;
            case R.AppCompatTheme_colorControlActivated /*87*/:
                return 2131165660;
            case R.AppCompatTheme_colorControlHighlight /*88*/:
                return 2131165661;
            case R.AppCompatTheme_colorButtonNormal /*89*/:
                return 2131165662;
            case R.AppCompatTheme_colorSwitchThumbNormal /*90*/:
                return 2131165663;
            case R.AppCompatTheme_controlBackground /*91*/:
                return 2131165664;
            default:
                return 2131165601;
        }
    }

    private static void m3968a(byte[] bArr, byte[] bArr2) {
        int i;
        SCGameRoomStateChange parseFrom = SCGameRoomStateChange.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGameRoomStateChange:").append(TEXAS_CMD.Cmd_SCGameRoomStateChange);
        Utility.m4477a(TEXAS_CMD.Cmd_SCGameRoomStateChange, parseFrom.getStGameRoomInfo());
        if (parseFrom.getUuid() != SharedPreferencesManager.m4308b()) {
            String str = "uuid:" + parseFrom.getUuid() + " hands:";
            String str2 = str;
            for (Integer intValue : parseFrom.getVGivenHandsList()) {
                str2 = str2 + intValue.intValue() + ",";
            }
            new StringBuilder("ccccmd = ").append(TEXAS_CMD.Cmd_SCGameRoomStateChange).append(" ").append(str2);
        }
        for (UserGameInfoNet stUserInfo : parseFrom.getStGameRoomInfo().getVUserGameInfosList()) {
            if (stUserInfo.getStUserInfo().getUuid() > 0) {
                i = 1;
                break;
            }
        }
        i = 0;
        if ((RuntimeData.f6674e == parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId() || RuntimeData.f6674e == parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId()) && r0 != 0) {
            ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
        }
    }

    private static void m3970b(byte[] bArr, byte[] bArr2) {
        SCUseItemPushMsg parseFrom = SCUseItemPushMsg.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUseItemPushMsg:").append(TEXAS_CMD.Cmd_SCUseItemPushMsg);
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
        List arrayList = new ArrayList();
        for (UseItemPushMsg lMsgID : parseFrom.getVMsgsList()) {
            arrayList.add(Long.valueOf(lMsgID.getLMsgID()));
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4141b(arrayList);
    }

    private static void m3972c(byte[] bArr, byte[] bArr2) {
        SCGetLastPokerHandResultRsp parseFrom = SCGetLastPokerHandResultRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetLastPokerHandResultRsp:").append(TEXAS_CMD.Cmd_SCGetLastPokerHandResultRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getStPokerHandResult() != null) {
            for (PokerResultUserInfo pokerResultUserInfo : parseFrom.getStPokerHandResult().getVPokerResultUserInfovsList()) {
                if (pokerResultUserInfo.getUuid() != SharedPreferencesManager.m4308b() && pokerResultUserInfo.getVGivenHandsCount() > 0) {
                    new StringBuilder("ccccmd = ").append(TEXAS_CMD.Cmd_SCGetLastPokerHandResultRsp).append(" uuid:").append(pokerResultUserInfo.getUuid()).append(" showcard0:").append(pokerResultUserInfo.getBShowCard(0)).append(" card0:").append(pokerResultUserInfo.getVGivenHands(0)).append(" showcard1:").append(pokerResultUserInfo.getBShowCard(1)).append(" card1:").append(pokerResultUserInfo.getVGivenHands(1));
                }
            }
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3974d(byte[] r7, byte[] r8) {
        /*
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003a }
        r1 = "TEXAS_CMD.Cmd_SCPushMsg:";
        r0.<init>(r1);	 Catch:{ Exception -> 0x003a }
        r1 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCPushMsg;	 Catch:{ Exception -> 0x003a }
        r0.append(r1);	 Catch:{ Exception -> 0x003a }
        r0 = com.texaspoker.moment.TexasPoker.SCPushMsg.parseFrom(r7);	 Catch:{ Exception -> 0x003a }
        r1 = new java.util.ArrayList;	 Catch:{ Exception -> 0x003a }
        r1.<init>();	 Catch:{ Exception -> 0x003a }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x003a }
        r2.<init>();	 Catch:{ Exception -> 0x003a }
        r0 = r0.getVMsgsList();	 Catch:{ Exception -> 0x003a }
        r3 = r0.iterator();	 Catch:{ Exception -> 0x003a }
    L_0x0022:
        r0 = r3.hasNext();	 Catch:{ Exception -> 0x003a }
        if (r0 == 0) goto L_0x0058;
    L_0x0028:
        r0 = r3.next();	 Catch:{ Exception -> 0x003a }
        r0 = (com.texaspoker.moment.TexasPoker.PushMsg) r0;	 Catch:{ Exception -> 0x003a }
        r4 = r0.getEChatMessageType();	 Catch:{ Exception -> 0x003a }
        r5 = com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_SYSTEM;	 Catch:{ Exception -> 0x003a }
        if (r4 != r5) goto L_0x0048;
    L_0x0036:
        r2.add(r0);	 Catch:{ Exception -> 0x003a }
        goto L_0x0022;
    L_0x003a:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x0052 }
        r1 = "ResponseHandler";
        r2 = r0.getMessage();	 Catch:{ all -> 0x0052 }
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0052 }
    L_0x0047:
        return;
    L_0x0048:
        r4 = r0.getBChatRoom();	 Catch:{ Exception -> 0x003a }
        if (r4 != 0) goto L_0x0054;
    L_0x004e:
        r1.add(r0);	 Catch:{ Exception -> 0x003a }
        goto L_0x0022;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r2.add(r0);	 Catch:{ Exception -> 0x003a }
        goto L_0x0022;
    L_0x0058:
        r0 = r1.size();	 Catch:{ Exception -> 0x003a }
        if (r0 <= 0) goto L_0x009e;
    L_0x005e:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x003a }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003a }
        r3 = "save msg start:";
        r0.<init>(r3);	 Catch:{ Exception -> 0x003a }
        r3 = r1.size();	 Catch:{ Exception -> 0x003a }
        r0.append(r3);	 Catch:{ Exception -> 0x003a }
        r0 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x003a }
        r0 = r0.f5566f;	 Catch:{ Exception -> 0x003a }
        r0.m3571a(r1);	 Catch:{ Exception -> 0x003a }
        r0 = "NOTIFY_REFRESH_MSG";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r0, r1);	 Catch:{ Exception -> 0x003a }
        r0 = "NOTIFY_REFRESH_MOMENTS";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r0, r1);	 Catch:{ Exception -> 0x003a }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x003a }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003a }
        r6 = "save msg end:";
        r3.<init>(r6);	 Catch:{ Exception -> 0x003a }
        r0 = r0 - r4;
        r0 = r3.append(r0);	 Catch:{ Exception -> 0x003a }
        r1 = " ms";
        r0.append(r1);	 Catch:{ Exception -> 0x003a }
    L_0x009e:
        r0 = r2.size();	 Catch:{ Exception -> 0x003a }
        if (r0 <= 0) goto L_0x0047;
    L_0x00a4:
        r0 = "NOTIFY_GAME_DATA_TO_CC2D";
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003a }
        r3 = 0;
        r1[r3] = r8;	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r0, r1);	 Catch:{ Exception -> 0x003a }
        r0 = "NOTIFY_PUSH_GAME_VOICE_MSG";
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003a }
        r3 = 0;
        r1[r3] = r2;	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r0, r1);	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.utils.NetworkUtil.m4073a();	 Catch:{ Exception -> 0x003a }
        com.illuminate.texaspoker.utils.NetworkUtil.m4124a(r2);	 Catch:{ Exception -> 0x003a }
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.e.b.g.d(byte[], byte[]):void");
    }

    private static void m3976e(byte[] bArr, byte[] bArr2) {
        SCSystemGameRoomMsg parseFrom = SCSystemGameRoomMsg.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSystemGameRoomMsg:").append(TEXAS_CMD.Cmd_SCSystemGameRoomMsg);
        for (GameRoomPushMsg gameRoomPushMsg : parseFrom.getVMsgsList()) {
            if (gameRoomPushMsg.getEGameMessageType() == GAME_ROOM_MESSAGE_TYPE.GAME_ROOM_MESSAGE_RESET_BUYIN_RATIO) {
                RuntimeData.f6676g = gameRoomPushMsg.getStGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
                RuntimeData.f6677h = gameRoomPushMsg.getStGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
                RuntimeData.f6678i = gameRoomPushMsg.getStGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            }
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
        DBManager.m3631a().f5572l.m3666a(parseFrom.getVMsgsList());
        for (GameRoomPushMsg gameRoomPushMsg2 : parseFrom.getVMsgsList()) {
            Utility.m4477a(TEXAS_CMD.Cmd_SCSystemGameRoomMsg, gameRoomPushMsg2.getStGameRoomInfo());
            if (gameRoomPushMsg2.getEGameMessageType() == GAME_ROOM_MESSAGE_TYPE.GAME_ROOM_MESSAGE_OVER) {
                long lGameRoomId;
                long lFromRoomID;
                if (gameRoomPushMsg2.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                    lGameRoomId = gameRoomPushMsg2.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId();
                    lFromRoomID = gameRoomPushMsg2.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID();
                } else {
                    lGameRoomId = gameRoomPushMsg2.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId();
                    lFromRoomID = gameRoomPushMsg2.getStGameRoomInfo().getStGameRoomBaseInfo().getLChatRoomID();
                }
                DBManager.m3631a().f5579s.m3561a(lGameRoomId);
                DBManager.m3631a().f5572l.m3668b(lGameRoomId, lFromRoomID);
                NetworkUtil.m4073a();
                NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
                NetworkUtil.m4073a();
                NetworkUtil.m4134b(0, 0);
            } else if (gameRoomPushMsg2.getEGameMessageType() == GAME_ROOM_MESSAGE_TYPE.GAME_ROOM_MESSAGE_RESET_BUYIN_RATIO) {
                RuntimeData.f6676g = gameRoomPushMsg2.getStGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
                RuntimeData.f6677h = gameRoomPushMsg2.getStGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
                RuntimeData.f6678i = gameRoomPushMsg2.getStGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            }
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        ResponseHandler.m3967a("NOTIFY_REFRESH_MSG", new Object[0]);
        ResponseHandler.m3967a("NOTIFY_REFRESH_DISCOVERY", new Object[0]);
        ResponseHandler.m3967a("NOTIFY_REFRESH_CHAT_ROOM_GAME", new Object[0]);
    }

    private static void m3978f(byte[] bArr, byte[] bArr2) {
        SCReconnectRsp parseFrom = SCReconnectRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCReconnectRsp:").append(TEXAS_CMD.Cmd_SCReconnectRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCReconnectRsp, parseFrom.getStUserGameInfo());
        Utility.m4477a(TEXAS_CMD.Cmd_SCReconnectRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            try {
                new StringBuilder("new accessToken=").append(parseFrom.getSAccessToken());
                SharedPreferencesManager.m4373j(Utility.m4475a(TEAUtil.m4068a().encode(null, parseFrom.getSAccessToken().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a())));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            ResponseHandler.m3967a("NOTIFY_RECONNECT_SUCCESS", Integer.valueOf(parseFrom.getEErrCode().getNumber()));
        } else {
            if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR) {
                SharedPreferencesManager.m4327d();
            } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_TOKEN_EXPIRED) {
                SharedPreferencesManager.m4341f();
            }
            SharedPreferencesManager.m4303a(-1);
            SharedPreferencesManager.m4373j(null);
            ResponseHandler.m3967a("NOTIFY_RECONNECT_SUCCESS", Integer.valueOf(parseFrom.getEErrCode().getNumber()));
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void m3969b(byte[] bArr) {
        new StringBuilder("TEXAS_CMD.Cmd_SCHelloRsp:").append(TEXAS_CMD.Cmd_SCHelloRsp).append(" error code:").append(SCHelloRsp.parseFrom(bArr).getEErrCode());
    }

    private static void m3971c(byte[] bArr) {
        SCQuickLoginRsp parseFrom = SCQuickLoginRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCQuickLoginRsp:").append(TEXAS_CMD.Cmd_SCQuickLoginRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCQuickLoginRsp, parseFrom.getStUserGameInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3965a(parseFrom.getStUserGameInfo().getStUserInfo());
            ResponseHandler.m3964a(parseFrom.getStDefaultSettingInfo());
            RuntimeData.f6673d = true;
            DBManager.m3631a();
            Utility.m4510j();
            ResponseHandler.m3967a("NOTIFY_QUICK_LOGIN_SUCCESS", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR) {
            SharedPreferencesManager.m4327d();
            SharedPreferencesManager.m4303a(-1);
            ResponseHandler.m3967a("NOTIFY_KICK_OUT_PUSH", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_QUICK_LOGIN_FAULT", new Object[0]);
        }
    }

    private static void m3973d(byte[] bArr) {
        SCLoginRsp parseFrom = SCLoginRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCLoginRsp:").append(TEXAS_CMD.Cmd_SCLoginRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCLoginRsp, parseFrom.getStUserGameInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            try {
                byte[] encode = TEAUtil.m4068a().encode(null, parseFrom.getSAccessToken().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                byte[] encode2 = TEAUtil.m4068a().encode(null, parseFrom.getSEncryptKey().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                SharedPreferencesManager.m4373j(Utility.m4475a(encode));
                SharedPreferencesManager.m4365i(Utility.m4475a(encode2));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            ResponseHandler.m3965a(parseFrom.getStUserGameInfo().getStUserInfo());
            ResponseHandler.m3964a(parseFrom.getStDefaultSettingInfo());
            DBManager.m3631a();
            Utility.m4510j();
            ResponseHandler.m3967a("NOTIFY_LOGIN_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_LOGIN_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3975e(byte[] bArr) {
        SCRegisterRsp parseFrom = SCRegisterRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRegisterRsp:").append(TEXAS_CMD.Cmd_SCRegisterRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_REGISTER_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REGISTER_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3977f(byte[] bArr) {
        SCUploadVerifyCodeRsp parseFrom = SCUploadVerifyCodeRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUploadVerifyCodeRsp:").append(TEXAS_CMD.Cmd_SCUploadVerifyCodeRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            try {
                byte[] encode = TEAUtil.m4068a().encode(null, parseFrom.getSAccessToken().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                byte[] encode2 = TEAUtil.m4068a().encode(null, parseFrom.getSEncryptKey().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                SharedPreferencesManager.m4373j(Utility.m4475a(encode));
                SharedPreferencesManager.m4365i(Utility.m4475a(encode2));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            ResponseHandler.m3965a(parseFrom.getStUserBaseInfo());
            ResponseHandler.m3964a(parseFrom.getStDefaultSettingInfo());
            DBManager.m3631a();
            Utility.m4510j();
            ResponseHandler.m3967a("NOTIFY_UPLOAD_VERIFY_CODE_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_VERIFY_CODE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3979g(byte[] bArr) {
        SCRegetVerifyCodeRsp parseFrom = SCRegetVerifyCodeRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRegetVerifyCodeRsp:").append(TEXAS_CMD.Cmd_SCRegetVerifyCodeRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_REGET_VERIFY_CODE_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REGET_VERIFY_CODE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3981h(byte[] bArr) {
        new StringBuilder("TEXAS_CMD.Cmd_SCResetPwdUploadPhonenumberRsp:").append(TEXAS_CMD.Cmd_SCResetPwdUploadPhonenumberRsp).append(" error code:").append(SCResetPwdUploadPhonenumberRsp.parseFrom(bArr).getEErrCode());
        ResponseHandler.m3967a("NOTIFY_RESET_PWD_UPLOAD_SUCCESS", new Object[0]);
    }

    private static void m3983i(byte[] bArr) {
        SCResetPwdVerifyCodeRsp parseFrom = SCResetPwdVerifyCodeRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCResetPwdVerifyCodeRsp:").append(TEXAS_CMD.Cmd_SCResetPwdVerifyCodeRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_RESET_PWD_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_RESET_PWD_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3985j(byte[] bArr) {
        SCLoginThirdPartyRsp parseFrom = SCLoginThirdPartyRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCLoginThirdPartyRsp:").append(TEXAS_CMD.Cmd_SCLoginThirdPartyRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            parseFrom.getBNewUser();
            try {
                byte[] encode = TEAUtil.m4068a().encode(null, parseFrom.getSAccessToken().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                byte[] encode2 = TEAUtil.m4068a().encode(null, parseFrom.getSEncryptKey().getBytes(GameManager.DEFAULT_CHARSET), BaseApplication.m3548a());
                SharedPreferencesManager.m4373j(Utility.m4475a(encode));
                SharedPreferencesManager.m4365i(Utility.m4475a(encode2));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            ResponseHandler.m3965a(parseFrom.getStUserBaseInfo());
            ResponseHandler.m3964a(parseFrom.getStDefaultSettingInfo());
            DBManager.m3631a();
            Utility.m4510j();
            ResponseHandler.m3967a("NOTIFY_LOGIN_FACEBOOK_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_LOGIN_FACEBOOK_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3987k(byte[] bArr) {
        SCGetFrontPageInfoRsp parseFrom = SCGetFrontPageInfoRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFrontPageInfoRsp:").append(TEXAS_CMD.Cmd_SCGetFrontPageInfoRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            for (Object a : parseFrom.getStGameRoomInfoList()) {
                Utility.m4477a(TEXAS_CMD.Cmd_SCGetFrontPageInfoRsp, a);
            }
            DBManager.m3631a().f5565e.m3599a(parseFrom.getStChatRoomBaseInfoList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        }
    }

    private static void m3989l(byte[] bArr) {
        SCUploadIconRsp parseFrom = SCUploadIconRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUploadIconRsp:").append(TEXAS_CMD.Cmd_SCUploadIconRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4322c(parseFrom.getSSmallIconUrl());
            SharedPreferencesManager.m4331d(parseFrom.getSIconUrl());
            FriendUserDBManager friendUserDBManager = DBManager.m3631a().f5563c;
            long b = SharedPreferencesManager.m4308b();
            String sSmallIconUrl = parseFrom.getSSmallIconUrl();
            String sIconUrl = parseFrom.getSIconUrl();
            FriendUser a = friendUserDBManager.m3639a(b);
            if (a != null) {
                a.f5836o = sSmallIconUrl;
                a.f5837p = sIconUrl;
                friendUserDBManager.f5592b.f6434I.d(a);
            }
            ResponseHandler.m3967a("NOTIFY_UPLOAD_PHOTO_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_TAB_MY_INFO", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_ICON_FAULT", new Object[0]);
    }

    private static void m3991m(byte[] bArr) {
        SCSetUserInfoRsp parseFrom = SCSetUserInfoRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetUserInfoRsp:").append(TEXAS_CMD.Cmd_SCSetUserInfoRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4304a(parseFrom.getSNickname());
            SharedPreferencesManager.m4319c(parseFrom.getIGender());
            if (StringUtils.m4462a(parseFrom.getSDesc())) {
                SharedPreferencesManager.m4345f(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                SharedPreferencesManager.m4345f(parseFrom.getSDesc());
            }
            DBManager.m3631a().f5563c.m3643a(SharedPreferencesManager.m4308b(), parseFrom.getIGender(), parseFrom.getSNickname());
            ResponseHandler.m3967a("NOTIFY_SET_USERINFO_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_USERINFO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3993n(byte[] bArr) {
        SCSetUserInfoNewRsp parseFrom = SCSetUserInfoNewRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetUserInfoNewRsp:").append(TEXAS_CMD.Cmd_SCSetUserInfoNewRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4304a(parseFrom.getSNickname());
            SharedPreferencesManager.m4319c(parseFrom.getIGender());
            DBManager.m3631a().f5563c.m3643a(SharedPreferencesManager.m4308b(), parseFrom.getIGender(), parseFrom.getSNickname());
            ResponseHandler.m3967a("NOTIFY_SET_USERINFO_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_USERINFO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3980g(byte[] bArr, byte[] bArr2) {
        SCGetUserInfoV2Rsp parseFrom = SCGetUserInfoV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetUserInfoV2Rsp:").append(TEXAS_CMD.Cmd_SCGetUserInfoV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            boolean z;
            if (SharedPreferencesManager.m4308b() == parseFrom.getStUserInfo().getStBaseInfo().getUuid()) {
                ResponseHandler.m3966a(parseFrom.getStUserInfo());
            }
            if (parseFrom.getBRemark() == 1) {
                z = true;
            } else {
                z = false;
            }
            DBManager.m3631a().f5563c.m3644a(parseFrom.getStUserInfo(), z);
            ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_FRIEND", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_UPLOAD_USER_COVER_PHOTO_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_TAB_MY_INFO", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_RECORD", new Object[0]);
        }
    }

    private static void m3995o(byte[] bArr) {
        SCGetQuickGameRoomRsp parseFrom = SCGetQuickGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetQuickGameRoomRsp:").append(TEXAS_CMD.Cmd_SCGetQuickGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3607c(parseFrom.getVQuickGameRoomInfosList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        }
    }

    private static void m3997p(byte[] bArr) {
        SCGetFrontPageInfoV4Rsp parseFrom = SCGetFrontPageInfoV4Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFrontPageInfoV4Rsp:").append(TEXAS_CMD.Cmd_SCGetFrontPageInfoV4Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3665a(parseFrom);
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_DISCOVERY", new Object[0]);
    }

    private static void m3999q(byte[] bArr) {
        SCCreateQuickGameRoomRsp parseFrom = SCCreateQuickGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.SCCreateQuickGameRoomRsp:").append(TEXAS_CMD.Cmd_SCCreateQuickGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            RuntimeData.f6672c = parseFrom.getStQuickGameRoomInfo().getSCryptCode();
            DBManager.m3631a().f5565e.m3596a(parseFrom.getStQuickGameRoomInfo());
            DBManager.m3631a().f5566f.m3573a(parseFrom.getStQuickGameRoomInfo().getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId());
            RuntimeData.f6676g = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
            RuntimeData.f6677h = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
            RuntimeData.f6678i = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            SharedPreferencesManager.m4321c(parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getStCreateUserBaseInfo().getLPopularity());
            SharedPreferencesManager.m4311b(parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getStCreateUserBaseInfo().getLCoin());
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_CREATE_QUICK_CHAT_ROOM_SUCCESS", Long.valueOf(parseFrom.getStQuickGameRoomInfo().getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREATE_QUICK_CHAT_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), Integer.valueOf(parseFrom.getEErrCode().getNumber()));
    }

    private static void m4000r(byte[] bArr) {
        SCCreateGameRoomRsp parseFrom = SCCreateGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCreateGameRoomRsp:").append(TEXAS_CMD.Cmd_SCCreateGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCCreateGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4311b(parseFrom.getStUserBaseInfoNet().getLCoin());
            SharedPreferencesManager.m4321c(parseFrom.getStUserBaseInfoNet().getLPopularity());
            DBManager.m3631a().f5572l.m3664a(parseFrom.getStGameRoomInfo());
            Builder newBuilder = SCGameRoomStateChange.newBuilder();
            newBuilder.setStGameRoomInfo(parseFrom.getStGameRoomInfo());
            newBuilder.setUuid(0);
            String strRoomName = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getStrRoomName();
            RuntimeData.f6674e = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId();
            List arrayList = new ArrayList();
            if (parseFrom.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_NORMAL_INSURANCE) {
                arrayList.add("NormalInsurance");
            } else if (parseFrom.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SIX) {
                arrayList.add("Six");
            } else if (parseFrom.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_OMAHA) {
                arrayList.add("Omaha");
            } else if (parseFrom.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_OMAHA_INSURANCE) {
                arrayList.add("OmahaInsurance");
            } else {
                arrayList.add("normal");
            }
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLSmallBlinds());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLBigBlinds());
            arrayList.add(SharedPreferencesManager.m4396n());
            arrayList.add(strRoomName);
            arrayList.add(parseFrom.getStGameRoomInfo().getEGameRoomType().getNumber());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLDuration());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLCreateTime());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getStCreateUserBaseInfo().getStrNick());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getIAnte());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLLeagueID());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getSLeagueName());
            arrayList.add(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLChatRoomID());
            NetworkUtil.m4073a();
            NetworkUtil.m4117a(LetterIndexBar.SEARCH_ICON_LETTER, parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLChatRoomID(), arrayList);
            SharedPreferencesManager.m4409p(parseFrom.getStGameRoomInfo().getEGameRoomType().getNumber());
            VoiceFileUtility.f6580f.clear();
            RuntimeData.f6676g = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
            RuntimeData.f6677h = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
            RuntimeData.f6678i = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            SharedPreferencesManager.m4311b(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getStCreateUserBaseInfo().getLCoin());
            DBManager.m3631a().f5563c.m3645a(parseFrom.getStGameRoomInfo().getVUserGameInfosList());
            ResponseHandler.m3967a("NOTIFY_CREATE_GAME_ROOM_SUCCESS", Long.valueOf(parseFrom.getLGameRoomId()));
            NetworkUtil.m4073a();
            NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREATE_GAME_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), Integer.valueOf(parseFrom.getEErrCode().getNumber()));
    }

    private static void m4001s(byte[] bArr) {
        SCGetClubGamesByClubIDRsp parseFrom = SCGetClubGamesByClubIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetClubGamesByClubIDRsp:").append(TEXAS_CMD.Cmd_SCGetClubGamesByClubIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3663a(parseFrom.getStClubBaseInfos().getLClubID(), parseFrom.getVGameRoomBaseInfosList());
            DBManager.m3631a().f5572l.m3669b(parseFrom.getStClubBaseInfos().getLClubID(), parseFrom.getVSNGGameRoomBaseInfosList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHATROOM", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHAT_ROOM_GAME", new Object[0]);
        }
    }

    private static void m4002t(byte[] bArr) {
        SCGetChatRoomGamesByRoomIDRsp parseFrom = SCGetChatRoomGamesByRoomIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetChatRoomGamesByRoomIDRsp:").append(TEXAS_CMD.Cmd_SCGetChatRoomGamesByRoomIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3663a(parseFrom.getStChatRoomBaseInfo().getLChatRoomId(), parseFrom.getVGameRoomBaseInfosList());
            DBManager.m3631a().f5572l.m3669b(parseFrom.getStChatRoomBaseInfo().getLChatRoomId(), parseFrom.getVSNGGameRoomBaseInfosList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHATROOM", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHAT_ROOM_GAME", new Object[0]);
        }
    }

    private static void m4003u(byte[] bArr) {
        SCCreateChatRoomRsp parseFrom = SCCreateChatRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCreateChatRoomRsp:").append(TEXAS_CMD.Cmd_SCCreateChatRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            ChatRoomInfo stChatRoomInfo = parseFrom.getStChatRoomInfo();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            chatRoomDBManager.f5526a.a();
            try {
                ChatRoom a = chatRoomDBManager.m3592a(stChatRoomInfo.getStChatRoomBaseInfo(), System.currentTimeMillis() + RuntimeData.f6671b);
                a.f5715B = Boolean.valueOf(false);
                a.f5717D = Boolean.valueOf(true);
                chatRoomDao.d(a);
                chatRoomDBManager.f5526a.c();
            } catch (Throwable e) {
                e.printStackTrace();
                Log.e("ChatRoomDBManager", e.getMessage(), e);
            } finally {
                parseFrom = chatRoomDBManager.f5526a;
                parseFrom.b();
            }
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_CREAT_CHAT_ROOM_SUCCESS", Long.valueOf(parseFrom.getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREAT_CHAT_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m4004v(byte[] bArr) {
        SCAddChatRoomUserRsp parseFrom = SCAddChatRoomUserRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCAddChatRoomUserRsp:").append(TEXAS_CMD.Cmd_SCAddChatRoomUserRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3595a(parseFrom.getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId(), parseFrom.getStChatRoomInfo().getVUserBaseInfosList());
            ResponseHandler.m3967a("NOTIFY_ADD_CHATROOM_USER_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_ADD_CHATROOM_USER_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m4005w(byte[] bArr) {
        SCSetChatInfoSettingRsp parseFrom = SCSetChatInfoSettingRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetChatInfoSettingRsp:").append(TEXAS_CMD.Cmd_SCSetChatInfoSettingRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            long chatUuid;
            int iMute;
            if (parseFrom.getEChatType() == CHAT_TYPE.CHAT_TYPE_SINGLE) {
                FriendUserDBManager friendUserDBManager = DBManager.m3631a().f5563c;
                chatUuid = parseFrom.getChatUuid();
                iMute = parseFrom.getIMute();
                FriendUser a = friendUserDBManager.m3639a(chatUuid);
                if (a != null) {
                    if (iMute == 0) {
                        a.f5823b = Boolean.valueOf(true);
                    } else {
                        a.f5823b = Boolean.valueOf(false);
                    }
                    friendUserDBManager.f5592b.f6434I.d(a);
                }
            } else {
                ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
                chatUuid = parseFrom.getLRoomID();
                iMute = parseFrom.getIMute();
                CHAT_TYPE chat_type = CHAT_TYPE.CHAT_TYPE_GROUP;
                ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
                ChatRoom a2 = chatRoomDBManager.m3590a(chatUuid, chat_type.getNumber());
                if (a2 != null) {
                    if (iMute == 0) {
                        a2.f5719F = Boolean.valueOf(true);
                    } else {
                        a2.f5719F = Boolean.valueOf(false);
                    }
                    chatRoomDao.d(a2);
                }
            }
            ResponseHandler.m3967a("NOTIFY_CHANGE_ROOM_SOUND_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CHANGE_ROOM_SOUND_FAULT", new Object[0]);
    }

    private static void m4006x(byte[] bArr) {
        SCSetChatRoomInfoRsp parseFrom = SCSetChatRoomInfoRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetChatRoomInfoRsp:").append(TEXAS_CMD.Cmd_SCSetChatRoomInfoRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            chatRoomDBManager.f5527b.f6426A.d(chatRoomDBManager.m3592a(parseFrom.getStChatRoomBaseInfo(), 0));
            ResponseHandler.m3967a("NOTIFY_SET_CHATROOM_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_CHATROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m4007y(byte[] bArr) {
        SCLeaveChatRoomRsp parseFrom = SCLeaveChatRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCLeaveChatRoomRsp:").append(TEXAS_CMD.Cmd_SCLeaveChatRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3606c(parseFrom.getLRoomID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_CHATROOM) {
            DBManager.m3631a().f5565e.m3606c(parseFrom.getLRoomID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
    }

    private static void m4008z(byte[] bArr) {
        SCGetChatRoomUsersByRoomIDRsp parseFrom = SCGetChatRoomUsersByRoomIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetChatRoomUsersByRoomIDRsp:").append(TEXAS_CMD.Cmd_SCGetChatRoomUsersByRoomIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5569i.m3617b(parseFrom.getStChatRoomBaseInfo().getLChatRoomId(), parseFrom.getVUserBaseInfosList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_SETTING", new Object[0]);
        }
    }

    private static void m3936A(byte[] bArr) {
        SCRemoveChatRoomUserRsp parseFrom = SCRemoveChatRoomUserRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRemoveChatRoomUserRsp:").append(TEXAS_CMD.Cmd_SCRemoveChatRoomUserRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            ChatRoomInfo stChatRoomInfo = parseFrom.getStChatRoomInfo();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            ChatRoom a = chatRoomDBManager.m3591a(stChatRoomInfo.getStChatRoomBaseInfo());
            if (a != null) {
                chatRoomDao.d(a);
            }
            DBManager.m3631a().f5569i.m3617b(parseFrom.getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId(), parseFrom.getStChatRoomInfo().getVUserBaseInfosList());
            ResponseHandler.m3967a("NOTIFY_REMOVE_CHATROOM_USER_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REMOVE_CHATROOM_USER_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3937B(byte[] bArr) {
        SCUploadChatRoomIconRsp parseFrom = SCUploadChatRoomIconRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUploadChatRoomIconRsp:").append(TEXAS_CMD.Cmd_SCUploadChatRoomIconRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            long lRoomID = parseFrom.getLRoomID();
            String sSmallIconUrl = parseFrom.getSSmallIconUrl();
            String sIconUrl = parseFrom.getSIconUrl();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            ChatRoom a = chatRoomDBManager.m3590a(lRoomID, 2);
            if (a != null) {
                a.f5760u = sSmallIconUrl;
                a.f5761v = sIconUrl;
                chatRoomDao.d(a);
            }
            ResponseHandler.m3967a("NOTIFY_UPLOAD_GROUP_PHOTO_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_GROUP_PHOTO_FAULT", parseFrom.getEErrCode());
    }

    private static void m3938C(byte[] bArr) {
        SCCheckNicknameStatusRsp parseFrom = SCCheckNicknameStatusRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCheckNicknameStatusRsp:").append(TEXAS_CMD.Cmd_SCCheckNicknameStatusRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4424t(parseFrom.getLSpendCoin());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHECK_NICKNAME_SUCCESS", Integer.valueOf(parseFrom.getBModifyed()), Long.valueOf(parseFrom.getLSpendCoin()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_CHECK_NICKNAME_FAILED", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3939D(byte[] bArr) {
        SCBuyNicknameRsp parseFrom = SCBuyNicknameRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCBuyNicknameRsp:").append(TEXAS_CMD.Cmd_SCBuyNicknameRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4304a(parseFrom.getSNickname());
            SharedPreferencesManager.m4311b(parseFrom.getLCoin());
            ResponseHandler.m3967a("NOTIFY_REFRESH_BUY_NICKNAME_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_BUY_NICKNAME_FAILED", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), Integer.valueOf(parseFrom.getEErrCode().getNumber()));
    }

    private static void m3940E(byte[] bArr) {
        SCStartQuickRoomGameRsp parseFrom = SCStartQuickRoomGameRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCStartQuickRoomGameRsp:").append(TEXAS_CMD.Cmd_SCStartQuickRoomGameRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCStartQuickRoomGameRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            long lRoomID = parseFrom.getLRoomID();
            long lGameRoomId = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            chatRoomDBManager.f5526a.a();
            try {
                ChatRoom a = chatRoomDBManager.m3590a(lRoomID, 2);
                a.f5723J = Integer.valueOf(2);
                a.f5750k = Long.valueOf(lGameRoomId);
                chatRoomDao.d(a);
                long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
                DBManager.m3631a().f5566f.m3582e(lRoomID, currentTimeMillis, 2);
                ChatMsgDBManager chatMsgDBManager = DBManager.m3631a().f5566f;
                r2.m3566a(1 + currentTimeMillis, 2, DBManager.f5555y, SharedPreferencesManager.m4308b(), lRoomID, StringUtils.m4461a(2131165852), currentTimeMillis + 1, DBManager.f5540C, 0, DBManager.f5548K, null, true);
                chatRoomDBManager.f5526a.c();
            } catch (Throwable e) {
                e.printStackTrace();
                Log.e("ChatRoomDBManager", e.getMessage(), e);
            } finally {
                chatRoomDBManager.f5526a.b();
            }
            ResponseHandler.m3967a("NOTIFY_START_QUICK_GAME", Long.valueOf(parseFrom.getLRoomID()), Long.valueOf(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_START_QUICK_GAME_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3941F(byte[] bArr) {
        SCQuitQuickGameRoomRsp parseFrom = SCQuitQuickGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCQuitQuickGameRoomRsp:").append(TEXAS_CMD.Cmd_SCQuitQuickGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3608d(parseFrom.getLRoomID());
            ResponseHandler.m3967a("NOTIFY_QUIT_QUICK_GAME_ROOM_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_QUIT_QUICK_GAME_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3942G(byte[] bArr) {
        SCEnterQuickGameRoomRsp parseFrom = SCEnterQuickGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCEnterQuickGameRoomRsp:").append(TEXAS_CMD.Cmd_SCEnterQuickGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCEnterQuickGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3596a(parseFrom.getStQuickGameRoomInfo());
            if (parseFrom.getStQuickGameRoomInfo().getEGameRoomType() != GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                RuntimeData.f6676g = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
                RuntimeData.f6677h = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
                RuntimeData.f6678i = parseFrom.getStQuickGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            }
            ResponseHandler.m3967a("NOTIFY_ENTER_QUICK_GAME_ROOM_SUCCESS", Long.valueOf(parseFrom.getStQuickGameRoomInfo().getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_ENTER_QUICK_GAME_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3982h(byte[] bArr, byte[] bArr2) {
        SCEnterGameRoomRsp parseFrom = SCEnterGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCEnterGameRoomRsp:").append(TEXAS_CMD.Cmd_SCEnterGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCEnterGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            Builder newBuilder = SCGameRoomStateChange.newBuilder();
            newBuilder.setStGameRoomInfo(parseFrom.getStGameRoomInfo());
            newBuilder.setUuid(0);
            SharedPreferencesManager.m4409p(parseFrom.getStGameRoomInfo().getEGameRoomType().getNumber());
            VoiceFileUtility.f6580f.clear();
            RuntimeData.f6676g = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getIMaxBuyinRatio();
            RuntimeData.f6677h = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getIMinBuyinRatio();
            RuntimeData.f6678i = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getEGameRoomSeniorType().getNumber();
            DBManager.m3631a().f5563c.m3645a(parseFrom.getStGameRoomInfo().getVUserGameInfosList());
            ResponseHandler.m3967a("NOTIFY_ENTER_GAME_ROOM_SUCCESS", Long.valueOf(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId()), bArr2, Long.valueOf(parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLChatRoomID()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_ENTER_GAME_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
    }

    private static void m3943H(byte[] bArr) {
        SCLeaveGameRoomRsp parseFrom = SCLeaveGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCLeaveGameRoomRsp:").append(TEXAS_CMD.Cmd_SCLeaveGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_LEAVE_GAME_ROOM_SUCCESS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_LEAVE_GAME_ROOM_FAILED", new Object[0]);
        }
    }

    private static void m3944I(byte[] bArr) {
        SCBuyCoinRsp parseFrom = SCBuyCoinRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCBuyCoinRsp:").append(TEXAS_CMD.Cmd_SCBuyCoinRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4311b(parseFrom.getLCoin());
            ResponseHandler.m3967a("NOTIFY_BUY_COIN_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_BUY_COIN_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3945J(byte[] bArr) {
        SCCreateQuickSNGGameRoomRsp parseFrom = SCCreateQuickSNGGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCreateQuickSNGGameRoomRsp:").append(TEXAS_CMD.Cmd_SCCreateQuickSNGGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCCreateQuickSNGGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3596a(parseFrom.getStQuickGameRoomInfo());
            DBManager.m3631a().f5566f.m3573a(parseFrom.getStQuickGameRoomInfo().getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId());
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_CREATE_QUICK_SNG_GAME_SUCCESS", Long.valueOf(parseFrom.getStQuickGameRoomInfo().getStChatRoomInfo().getStChatRoomBaseInfo().getLChatRoomId()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREATE_QUICK_SNG_GAME_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), Integer.valueOf(parseFrom.getEErrCode().getNumber()));
    }

    private static void m3984i(byte[] bArr, byte[] bArr2) {
        SCWatchSNGGameRoomRsp parseFrom = SCWatchSNGGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCWatchSNGGameRoomRsp:").append(TEXAS_CMD.Cmd_SCWatchSNGGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCWatchSNGGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3664a(parseFrom.getStGameRoomInfo());
            ResponseHandler.m3967a("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS", Long.valueOf(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId()), bArr2, Long.valueOf(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3986j(byte[] bArr, byte[] bArr2) {
        SCSignUpSNGGameRoomRsp parseFrom = SCSignUpSNGGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSignUpSNGGameRoomRsp:").append(TEXAS_CMD.Cmd_SCSignUpSNGGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCSignUpSNGGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3664a(parseFrom.getStGameRoomInfo());
            SharedPreferencesManager.m4311b(parseFrom.getStUserBaseInfoNet().getLCoin());
            SharedPreferencesManager.m4321c(parseFrom.getStUserBaseInfoNet().getLPopularity());
            ResponseHandler.m3967a("NOTIFY_SIGN_UP_SNG_GAME_ROOM_SUCCESS", Long.valueOf(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId()), bArr2, Long.valueOf(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID()));
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT) {
            ResponseHandler.m3967a("NOTIFY_SIGN_UP_SNG_GAME_ROOM_INVITE_WAITTING", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_SIGN_UP_SNG_GAME_ROOM__FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), parseFrom.getEErrCode());
        }
    }

    private static void m3946K(byte[] bArr) {
        SCCreateSNGGameRoomRsp parseFrom = SCCreateSNGGameRoomRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCreateSNGGameRoomRsp:").append(TEXAS_CMD.Cmd_SCCreateSNGGameRoomRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCCreateSNGGameRoomRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5572l.m3664a(parseFrom.getStGameRoomInfo());
            List arrayList = new ArrayList();
            arrayList.add("sng");
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStrRoomName());
            arrayList.add(SharedPreferencesManager.m4396n());
            arrayList.add(parseFrom.getStGameRoomInfo().getEGameRoomType().getNumber());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getESNGRoomtype().getNumber());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLCreateTime());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getStCreateUserBaseInfo().getStrNick());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLLeagueID());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getSLeagueName());
            arrayList.add(parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID());
            NetworkUtil.m4073a();
            NetworkUtil.m4117a(LetterIndexBar.SEARCH_ICON_LETTER, parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID(), arrayList);
            ResponseHandler.m3967a("NOTIFY_CREATE_SNG_GAME_SUCCESS", parseFrom);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREATE_SNG_GAME_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())), Integer.valueOf(parseFrom.getEErrCode().getNumber()));
    }

    private static void m3988k(byte[] bArr, byte[] bArr2) {
        SCGetAllBuyinControlsRsp parseFrom = SCGetAllBuyinControlsRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetAllBuyinControlsRsp:").append(TEXAS_CMD.Cmd_SCGetAllBuyinControlsRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5579s.m3562a(parseFrom.getVBuyinControlsList());
            ResponseHandler.m3967a("NOTIFY_GAME_ROOM_buyinControlMsg_CC2D_REFRESH_rsp", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GAME_ROOM_ScgetallbuyinControl_FAILED", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3947L(byte[] bArr) {
        SCBuyinActionRsp parseFrom = SCBuyinActionRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCBuyinActionRsp:").append(TEXAS_CMD.Cmd_SCBuyinActionRsp).append(" error code:").append(parseFrom.getEErrCode());
        Utility.m4477a(TEXAS_CMD.Cmd_SCBuyinActionRsp, parseFrom.getStGameRoomInfo());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            long lGameRoomId;
            if (parseFrom.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                lGameRoomId = parseFrom.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId();
            } else {
                lGameRoomId = parseFrom.getStGameRoomInfo().getStGameRoomBaseInfo().getLGameRoomId();
            }
            BuyInControlMsgDBManager buyInControlMsgDBManager = DBManager.m3631a().f5579s;
            BuyInControlMsg a = buyInControlMsgDBManager.m3560a(lGameRoomId, parseFrom.getLActionUuid());
            if (a != null) {
                buyInControlMsgDBManager.f5520b.f6468y.e(a);
            }
            ResponseHandler.m3967a("NOTIFY_GAME_ROOM_ScbuyinActionRsp_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GAME_ROOM_ScbuyinActionRsp_FAILED", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3948M(byte[] bArr) {
        SCClubActionRsp parseFrom = SCClubActionRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCClubActionRsp:").append(TEXAS_CMD.Cmd_SCClubActionRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3597a(parseFrom.getStClubInfo().getStClubBaseInfo());
            if (parseFrom.getEClubAct() == CLUB_ACT.CLUB_ACCEPT_INVITE || parseFrom.getEClubAct() == CLUB_ACT.CLUB_DENY_INVITE) {
                ClubMsgDBManager clubMsgDBManager = DBManager.m3631a().f5575o;
                long lClubID = parseFrom.getStClubInfo().getStClubBaseInfo().getLClubID();
                CLUB_ACT eClubAct = parseFrom.getEClubAct();
                long lActionedID = parseFrom.getLActionedID();
                ClubMsgDao clubMsgDao = clubMsgDBManager.f5534a.f6430E;
                ClubMsg a = clubMsgDBManager.m3625a(lClubID, lActionedID);
                if (a != null) {
                    if (eClubAct == CLUB_ACT.CLUB_ACCEPT_INVITE) {
                        a.f5794b = Integer.valueOf(2);
                    } else if (eClubAct == CLUB_ACT.CLUB_DENY_INVITE) {
                        a.f5794b = Integer.valueOf(3);
                    }
                    clubMsgDao.d(a);
                }
                ResponseHandler.m3967a("NOTIFY_CLUB_ACTION_SUCCESS", new Object[0]);
                return;
            } else if (parseFrom.getEClubAct() == CLUB_ACT.CLUB_REMOVE_INVITE) {
                DBManager.m3631a().f5569i.m3616b(parseFrom.getStClubInfo().getStClubBaseInfo().getLClubID(), parseFrom.getLActionedID());
                ResponseHandler.m3967a("NOTIFY_REMOVE_CLUB_USER_SUCCESS", new Object[0]);
                return;
            } else {
                return;
            }
        }
        int a2 = ResponseHandler.m3962a(parseFrom.getEErrCode());
        if (parseFrom.getEClubAct() == CLUB_ACT.CLUB_ACCEPT_INVITE || parseFrom.getEClubAct() == CLUB_ACT.CLUB_DENY_INVITE) {
            ResponseHandler.m3967a("NOTIFY_CLUB_ACTION_FAULT", Integer.valueOf(a2));
        } else if (parseFrom.getEClubAct() == CLUB_ACT.CLUB_REMOVE_INVITE) {
            ResponseHandler.m3967a("NOTIFY_REMOVE_CLUB_USER_FAULT", Integer.valueOf(a2));
        }
    }

    private static void m3949N(byte[] bArr) {
        SCGetClubByClubIDRsp parseFrom = SCGetClubByClubIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetClubByClubIDRsp:").append(TEXAS_CMD.Cmd_SCGetClubByClubIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3597a(parseFrom.getStClubInfo().getStClubBaseInfo());
            DBManager.m3631a().f5569i.m3612a(parseFrom.getStClubInfo().getStClubBaseInfo().getLClubID(), parseFrom.getStClubInfo().getVClubUserInfosList());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CHATROOM", new Object[0]);
        }
    }

    private static void m3950O(byte[] bArr) {
        SCQuitClubRsp parseFrom = SCQuitClubRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCQuitClubRsp:").append(TEXAS_CMD.Cmd_SCQuitClubRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3602b(parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_CHATROOM) {
            DBManager.m3631a().f5565e.m3602b(parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_LEAVE_CHATROOM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
    }

    private static void m3951P(byte[] bArr) {
        SCSetClubUserLevelRsp parseFrom = SCSetClubUserLevelRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetClubUserLevelRsp:").append(TEXAS_CMD.Cmd_SCSetClubUserLevelRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3603b(parseFrom.getStClubInfos().getStClubBaseInfo(), true);
            DBManager.m3631a().f5569i.m3612a(parseFrom.getStClubInfos().getStClubBaseInfo().getLClubID(), parseFrom.getStClubInfos().getVClubUserInfosList());
            ResponseHandler.m3967a("NOTIFY_SET_CLUB_USER_LEVEL_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_CLUB_USER_LEVEL_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3952Q(byte[] bArr) {
        SCGetClubSellingItemsRsp parseFrom = SCGetClubSellingItemsRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetClubSellingItemsRsp:").append(TEXAS_CMD.Cmd_SCGetClubSellingItemsRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4414q(parseFrom.getStMaxMemberSellingItem().getLCoin());
            SharedPreferencesManager.m4399n(parseFrom.getStMaxMemberSellingItem().getIPerAddMember());
            SharedPreferencesManager.m4405o(parseFrom.getStMaxMemberSellingItem().getIMaxAddMember());
            SharedPreferencesManager.m4351g(parseFrom.getStMaxMemberSellingItem().getSClubSellingItemDetail());
            SharedPreferencesManager.m4358h(parseFrom.getStAddClubFundSellingItem().getSClubSellingItemDetail());
            SharedPreferencesManager.m4418r(parseFrom.getStAddClubFundSellingItem().getLCoin());
            SharedPreferencesManager.m4421s(parseFrom.getStAddClubFundSellingItem().getLAddFund());
            ResponseHandler.m3967a("NOTIFY_GET_CLUB_SELLING_ITEM_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GET_CLUB_SELLING_ITEM_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3953R(byte[] bArr) {
        SCAddClubMaxMemberRsp parseFrom = SCAddClubMaxMemberRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCAddClubMaxMemberRsp:").append(TEXAS_CMD.Cmd_SCAddClubMaxMemberRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            long lClubID = parseFrom.getLClubID();
            int iMaxMembers = parseFrom.getIMaxMembers();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            ChatRoom a = chatRoomDBManager.m3590a(lClubID, 2);
            a.f5731R = Integer.valueOf(iMaxMembers);
            chatRoomDao.d(a);
            SharedPreferencesManager.m4311b(parseFrom.getLCoin());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CLUB_MAX_MEMBER_SUCCESS", Integer.valueOf(parseFrom.getIMaxMembers()));
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_CLUB_MAX_MEMBER_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3954S(byte[] bArr) {
        SCGetFundBillInfosRsp parseFrom = SCGetFundBillInfosRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFundBillInfosRsp:").append(TEXAS_CMD.Cmd_SCGetFundBillInfosRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5576p.m3621a(parseFrom.getVFundBillInfosList(), parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_GET_FUND_LIST_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GET_FUND_LIST_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3955T(byte[] bArr) {
        SCSetClubFundRsp parseFrom = SCSetClubFundRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetClubFundRsp:").append(TEXAS_CMD.Cmd_SCSetClubFundRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3603b(parseFrom.getStClubInfo().getStClubBaseInfo(), true);
            ResponseHandler.m3967a("NOTIFY_GIVE_OUT_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GIVE_OUT_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3956U(byte[] bArr) {
        SCAddClubFundRsp parseFrom = SCAddClubFundRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCAddClubFundRsp:").append(TEXAS_CMD.Cmd_SCAddClubFundRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            long lClubID = parseFrom.getLClubID();
            long lFund = parseFrom.getLFund();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            ChatRoom a = chatRoomDBManager.m3590a(lClubID, 2);
            a.f5752m = Long.valueOf(lFund);
            chatRoomDao.d(a);
            SharedPreferencesManager.m4311b(parseFrom.getLCoin());
            ResponseHandler.m3967a("NOTIFY_REFRESH_CLUB_FUND_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_REFRESH_CLUB_FUND_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3957V(byte[] bArr) {
        SCUploadClubIConRsp parseFrom = SCUploadClubIConRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUploadClubIConRsp:").append(TEXAS_CMD.Cmd_SCUploadClubIConRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ChatRoomDBManager chatRoomDBManager = DBManager.m3631a().f5565e;
            long lClubID = parseFrom.getLClubID();
            String sSmallClubIcon = parseFrom.getSSmallClubIcon();
            String sBigClubIcon = parseFrom.getSBigClubIcon();
            ChatRoomDao chatRoomDao = chatRoomDBManager.f5527b.f6426A;
            ChatRoom a = chatRoomDBManager.m3590a(lClubID, 2);
            a.f5760u = sSmallClubIcon;
            a.f5761v = sBigClubIcon;
            chatRoomDao.d(a);
            ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3958W(byte[] bArr) {
        SCUploadClubCoverRsp parseFrom = SCUploadClubCoverRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCUploadClubCoverRsp:").append(TEXAS_CMD.Cmd_SCUploadClubCoverRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5567g.m3620b(parseFrom.getLClubID(), parseFrom.getSSmallAlbumsList(), parseFrom.getSBigAlbumsList());
            ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_COVER_PHOTO_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_COVER_PHOTO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3959X(byte[] bArr) {
        SCDeleteClubCoverRsp parseFrom = SCDeleteClubCoverRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCDeleteClubCoverRsp:").append(TEXAS_CMD.Cmd_SCDeleteClubCoverRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5567g.m3620b(parseFrom.getLClubID(), parseFrom.getSSmallAlbumsList(), parseFrom.getSBigAlbumsList());
            ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3960Y(byte[] bArr) {
        SCSetClubInfoRsp parseFrom = SCSetClubInfoRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetClubInfoRsp:").append(TEXAS_CMD.Cmd_SCSetClubInfoRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3597a(parseFrom.getStClubBaseInfos());
            ResponseHandler.m3967a("NOTIFY_SET_CLUB_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_CLUB_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3961Z(byte[] bArr) {
        SCGetClubInfoByUuidRsp parseFrom = SCGetClubInfoByUuidRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetClubInfoByUuidRsp:").append(TEXAS_CMD.Cmd_SCGetClubInfoByUuidRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5565e.m3600a(parseFrom.getVClubBaseInfosList(), parseFrom.getUuid());
            ResponseHandler.m3967a("NOTIFY_REFRESH_FRIEND", new Object[0]);
        }
    }

    private static void aa(byte[] bArr) {
        SCRemoveFriendRsp parseFrom = SCRemoveFriendRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRemoveFriendRsp:").append(TEXAS_CMD.Cmd_SCRemoveFriendRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5563c.m3646b(parseFrom.getFriendUuid());
            ResponseHandler.m3967a("NOTIFY_REMOVE_FRIEND_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("UPLOAD_FRIEND_RELATION_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_FRIEND", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_TAB_MY_INFO", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_INVITED) {
            DBManager.m3631a().f5563c.m3646b(parseFrom.getFriendUuid());
            ResponseHandler.m3967a("UPLOAD_FRIEND_RELATION_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REMOVE_FRIEND_SUCCESS", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_FRIEND", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_TAB_MY_INFO", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_REMOVE_FRIEND_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
    }

    private static void ab(byte[] bArr) {
        SCFeedbackRsp parseFrom = SCFeedbackRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCFeedbackRsp:").append(TEXAS_CMD.Cmd_SCFeedbackRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_SEND_FEEDBACK_SUCCESS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_SEND_FEEDBACK_FAULT", new Object[0]);
        }
    }

    private static void ac(byte[] bArr) {
        SCGetSystemMsgByIDRsp parseFrom = SCGetSystemMsgByIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetSystemMsgByIDRsp:").append(TEXAS_CMD.Cmd_SCGetSystemMsgByIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            MessageMsgDBManager messageMsgDBManager = DBManager.m3631a().f5574n;
            SystemMsgInfo stSystemMsgInfo = parseFrom.getStSystemMsgInfo();
            MessageMsgDao messageMsgDao = messageMsgDBManager.f5603a.f6439N;
            MessageMsg a = messageMsgDBManager.m3686a(stSystemMsgInfo.getStSystemMsgBaseInfo().getLSystemMsgID());
            SystemMsgBaseInfo stSystemMsgBaseInfo = stSystemMsgInfo.getStSystemMsgBaseInfo();
            if (a == null) {
                a = new MessageMsg();
                a.f5941b = Boolean.valueOf(true);
            }
            a.f5945f = Long.valueOf(stSystemMsgBaseInfo.getLSystemMsgID());
            a.f5944e = Integer.valueOf(stSystemMsgBaseInfo.getESystemMessageType().getNumber());
            a.f5949j = stSystemMsgBaseInfo.getSSystemMsgTitle();
            a.f5948i = stSystemMsgBaseInfo.getSSystemMsgSummary();
            a.f5943d = Integer.valueOf(stSystemMsgBaseInfo.getESystemMessageContentType().getNumber());
            a.f5950k = stSystemMsgBaseInfo.getSSystemMsgUrl();
            a.f5947h = stSystemMsgBaseInfo.getSSystemMsgImgUrl();
            a.f5946g = Long.valueOf(stSystemMsgBaseInfo.getLSystemSendTime());
            if (stSystemMsgInfo.getBGet() == 1) {
                a.f5942c = Boolean.valueOf(true);
            } else {
                a.f5942c = Boolean.valueOf(false);
            }
            a.f5951l = stSystemMsgInfo.getSSystemMsgDetail();
            messageMsgDao.d(a);
            ResponseHandler.m3967a("NOTIFY_REFRESH_SYSTEM_MESSAGE_BYID", new Object[0]);
        }
    }

    private static void ad(byte[] bArr) {
        SCGetBenefitsRsp parseFrom = SCGetBenefitsRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetBenefitsRsp:").append(TEXAS_CMD.Cmd_SCGetBenefitsRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4321c(parseFrom.getStUserBaseInfoN().getLPopularity());
            SharedPreferencesManager.m4311b(parseFrom.getStUserBaseInfoN().getLCoin());
            DBManager.m3631a().f5574n.m3689b(parseFrom.getLSystemMsgID());
            ResponseHandler.m3967a("NOTIFY_GET_BENEFITS_SUCCESS", parseFrom);
            return;
        }
        int a = ResponseHandler.m3962a(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_GET_BENFIT_ALREADY) {
            DBManager.m3631a().f5574n.m3689b(parseFrom.getLSystemMsgID());
        }
        ResponseHandler.m3967a("NOTIFY_GET_BENEFITS_FAILED", Integer.valueOf(a));
    }

    private static void ae(byte[] bArr) {
        SCGetFavoriteListV2Rsp parseFrom = SCGetFavoriteListV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFavoriteListV2Rsp:").append(TEXAS_CMD.Cmd_SCGetFavoriteListV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5578r.m3696a(parseFrom.getStFavoritePokerHistoryInfoList());
            ResponseHandler.m3967a("NOTIFY_GET_FAVORITE_LIST_SUCCESS", new Object[0]);
        }
    }

    private static void m3990l(byte[] bArr, byte[] bArr2) {
        SCRemoveFavoriteV2Rsp parseFrom = SCRemoveFavoriteV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRemoveFavoriteV2Rsp:").append(TEXAS_CMD.Cmd_SCRemoveFavoriteV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5578r.m3694a(parseFrom.getLSaveUserUuid(), parseFrom.getLRoomID(), parseFrom.getLHandID());
            ResponseHandler.m3967a("NOTIFY_DEL_FAVORITE_SUCCESS", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_FAVORITE) {
            DBManager.m3631a().f5578r.m3694a(parseFrom.getLSaveUserUuid(), parseFrom.getLRoomID(), parseFrom.getLHandID());
            ResponseHandler.m3967a("NOTIFY_DEL_FAVORITE_SUCCESS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_DEL_FAVORITE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void af(byte[] bArr) {
        SCGetAllPokerHistoryRsp parseFrom = SCGetAllPokerHistoryRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetAllPokerHistoryRsp:").append(TEXAS_CMD.Cmd_SCGetAllPokerHistoryRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_GET_ALL_POKERHAND_RESULT_SUCCESS", parseFrom);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GET_ALL_POKERHAND_RESULT_FAILT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3992m(byte[] bArr, byte[] bArr2) {
        SCSaveFavoriteV2Rsp parseFrom = SCSaveFavoriteV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSaveFavoriteV2Rsp:").append(TEXAS_CMD.Cmd_SCSaveFavoriteV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5578r.m3695a(parseFrom.getStFavoritePokerHistoryInfo(), false);
            ResponseHandler.m3967a("NOTIFY_SAVE_FAVORITE_SUCCESS", parseFrom);
        } else {
            ResponseHandler.m3967a("NOTIFY_SAVE_FAVORITE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void ag(byte[] bArr) {
        SCRenameFavoriteRsp parseFrom = SCRenameFavoriteRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRenameFavoriteRsp:").append(TEXAS_CMD.Cmd_SCRenameFavoriteRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            if (DBManager.m3631a().f5578r.m3692a(parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLSaveUuid(), parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLRoomID(), parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLHandID(), false) != null) {
                DBManager.m3631a().f5578r.m3695a(parseFrom.getStFavoritePokerHistoryInfo(), false);
            }
            if (DBManager.m3631a().f5578r.m3692a(parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLSaveUuid(), parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLRoomID(), parseFrom.getStFavoritePokerHistoryInfo().getStPokerHistoryInfo().getLHandID(), true) != null) {
                DBManager.m3631a().f5578r.m3695a(parseFrom.getStFavoritePokerHistoryInfo(), true);
            }
            ResponseHandler.m3967a("NOTIFY_SAVE_FAVORITE_RENAME_SUCCESS", parseFrom);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SAVE_FAVORITE_RENAME_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void ah(byte[] bArr) {
        int i = 1;
        SCGetUserBaseInfoRsp parseFrom = SCGetUserBaseInfoRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetUserBaseInfoRsp:").append(TEXAS_CMD.Cmd_SCGetUserBaseInfoRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            boolean z;
            if (parseFrom.getBRemark() == 1) {
                z = true;
            } else {
                z = false;
            }
            FriendUserDBManager friendUserDBManager = DBManager.m3631a().f5563c;
            UserBaseInfoNet stUserBaseInfoNet = parseFrom.getStUserBaseInfoNet();
            friendUserDBManager.f5591a.a();
            try {
                friendUserDBManager.m3641a(stUserBaseInfoNet, z);
                friendUserDBManager.f5591a.c();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                i = friendUserDBManager.f5591a;
                i.b();
            }
            Object[] objArr = new Object[i];
            objArr[0] = Long.valueOf(parseFrom.getStUserBaseInfoNet().getUuid());
            ResponseHandler.m3967a("NOTIFY_GET_USERBASEINFO_SUCCESS", objArr);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GET_USERBASEINFO_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void ai(byte[] bArr) {
        SCGetBillInfosV2Rsp parseFrom = SCGetBillInfosV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetBillInfosV2Rsp:").append(TEXAS_CMD.Cmd_SCGetBillInfosV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() != ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            return;
        }
        if (parseFrom.getLNewestTime() == 0) {
            if (parseFrom.getLClubID() == 0) {
                SharedPreferencesManager.m4370j(SharedPreferencesManager.m4282M() + parseFrom.getIUnReadNum());
                SharedPreferencesManager.m4376k(SharedPreferencesManager.m4283N() + parseFrom.getIUnReadNum());
            }
            DBManager.m3631a().f5570j.m3557a(parseFrom.getStBillInfoNetList(), parseFrom.getLClubID(), parseFrom.getLTotalWinStacks());
            ResponseHandler.m3967a("NOTIFY_REFRESH_BILL", parseFrom);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_LOAD_BILL", parseFrom);
    }

    private static void aj(byte[] bArr) {
        SCPreBuyCoinAndroidRsp parseFrom = SCPreBuyCoinAndroidRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCPreBuyCoinAndroidRsp:").append(TEXAS_CMD.Cmd_SCPreBuyCoinAndroidRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_PRE_BUY_SUCCESS", parseFrom.getStAndroidOrderInfo());
            return;
        }
        ResponseHandler.m3967a("NOTIFY_PRE_BUY__FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void ak(byte[] bArr) {
        SCGetLoginRewardRsp parseFrom = SCGetLoginRewardRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetLoginRewardRsp:").append(TEXAS_CMD.Cmd_SCGetLoginRewardRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4410p(System.currentTimeMillis() + RuntimeData.f6671b);
            ResponseHandler.m3967a("NOTIFY_LOGIN_REWARD_SUCCESS", new Object[0]);
            SharedPreferencesManager.m4321c(parseFrom.getLPopularity());
            ResponseHandler.m3967a("NOTIFY_GET_LOGIN_REWARD_SUCCESS", Long.valueOf(parseFrom.getLAddPopularity()));
            return;
        }
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_MORE_REWARDED) {
            SharedPreferencesManager.m4410p(System.currentTimeMillis() + RuntimeData.f6671b);
        }
        ResponseHandler.m3967a("NOTIFY_GET_LOGIN_REWARD_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void al(byte[] bArr) {
        SCGetCoinStoreListRsp parseFrom = SCGetCoinStoreListRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetCoinStoreListRsp:").append(TEXAS_CMD.Cmd_SCGetCoinStoreListRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            RuntimeData.f6680k.clear();
            RuntimeData.f6680k.addAll(parseFrom.getVCoinItemsListList());
            ResponseHandler.m3967a("NOTIFY_GET_COIN_LIST_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_GET_COIN_LIST_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void m3994n(byte[] bArr, byte[] bArr2) {
        SCRemarkUserNickNameRsp parseFrom = SCRemarkUserNickNameRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCRemarkUserNickNameRsp:").append(TEXAS_CMD.Cmd_SCRemarkUserNickNameRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            FriendUserDBManager friendUserDBManager = DBManager.m3631a().f5563c;
            long remarkUuid = parseFrom.getRemarkUuid();
            String sRemarContent = parseFrom.getSRemarContent();
            FriendUserDao friendUserDao = friendUserDBManager.f5592b.f6434I;
            FriendUser a = friendUserDBManager.m3639a(remarkUuid);
            if (a != null) {
                a.f5841t = sRemarContent;
                friendUserDao.d(a);
            }
            ResponseHandler.m3967a("NOTIFY_REMARK_friend_UCCESS", new Object[0]);
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void am(byte[] bArr) {
        SCGetMyClubsV2Rsp parseFrom = SCGetMyClubsV2Rsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetMyClubsV2Rsp:").append(TEXAS_CMD.Cmd_SCGetMyClubsV2Rsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            List arrayList = new ArrayList();
            arrayList.addAll(parseFrom.getVMyClubBaseInfosList());
            arrayList.addAll(parseFrom.getVAttendedClubBaseInfosList());
            DBManager.m3631a().f5565e.m3604b(arrayList);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MY_CLUB", new Object[0]);
            ResponseHandler.m3967a("NOTIFY_REFRESH_MOMENTS", new Object[0]);
        }
    }

    private static void m3996o(byte[] bArr, byte[] bArr2) {
        new StringBuilder("TEXAS_CMD.Cmd_SCGetPokerHandResultByHandIDRsp:").append(TEXAS_CMD.Cmd_SCGetPokerHandResultByHandIDRsp).append(" error code:").append(SCGetPokerHandResultByHandIDRsp.parseFrom(bArr).getEErrCode());
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void m3998p(byte[] bArr, byte[] bArr2) {
        SCShareFavoriteRsp parseFrom = SCShareFavoriteRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCShareFavoriteRsp:").append(TEXAS_CMD.Cmd_SCShareFavoriteRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_GET_FAVORITE_SUCCESS", parseFrom);
        }
        ResponseHandler.m3967a("NOTIFY_GAME_DATA_TO_CC2D", bArr2);
    }

    private static void an(byte[] bArr) {
        SCBuyCoinAndroidRsp parseFrom = SCBuyCoinAndroidRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCBuyCoinAndroidRsp:").append(TEXAS_CMD.Cmd_SCBuyCoinAndroidRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            SharedPreferencesManager.m4311b(parseFrom.getLCoin());
            ResponseHandler.m3967a("NOTIFY_BUY_DIAMOND_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_BUY_DIAMOND_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void ao(byte[] bArr) {
        SCGetLeagueInfoByClubIDRsp parseFrom = SCGetLeagueInfoByClubIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetLeagueInfoByClubIDRsp:").append(TEXAS_CMD.Cmd_SCGetLeagueInfoByClubIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5580t.m3677a(parseFrom.getVLeagueInfosList(), parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_GET_LEAGUE_LIST_SUCCESS", new Object[0]);
        }
    }

    private static void ap(byte[] bArr) {
        SCCreateLeagueRsp parseFrom = SCCreateLeagueRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCCreateLeagueRsp:").append(TEXAS_CMD.Cmd_SCCreateLeagueRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5580t.m3676a(parseFrom.getStLeagueInfo());
            ResponseHandler.m3967a("NOTIFY_CREATE_LEAGUE_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_CREATE_LEAGUE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void aq(byte[] bArr) {
        SCSearchLeagueRsp parseFrom = SCSearchLeagueRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSearchLeagueRsp:").append(TEXAS_CMD.Cmd_SCSearchLeagueRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_SEARCH_LEAGUE_SUCCESS", parseFrom.getStLeagueInfo());
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SEARCH_LEAGUE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void ar(byte[] bArr) {
        SCEnterLeagueRsp parseFrom = SCEnterLeagueRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCEnterLeagueRsp:").append(TEXAS_CMD.Cmd_SCEnterLeagueRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            ResponseHandler.m3967a("NOTIFY_JOIN_LEAGUE_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_JOIN_LEAGUE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void as(byte[] bArr) {
        SCGetLeagueBaseInfoByLeagueIDRsp parseFrom = SCGetLeagueBaseInfoByLeagueIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetLeagueBaseInfoByLeagueIDRsp:").append(TEXAS_CMD.Cmd_SCGetLeagueBaseInfoByLeagueIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            LeagueDBManager leagueDBManager = DBManager.m3631a().f5580t;
            LeagueBaseInfo stLeagueBaseInfo = parseFrom.getStLeagueBaseInfo();
            leagueDBManager.f5599a.a();
            try {
                LeagueDao leagueDao = leagueDBManager.f5600b.f6436K;
                long lLeagueID = stLeagueBaseInfo.getLLeagueID();
                League a = leagueDBManager.m3675a(lLeagueID);
                if (a == null) {
                    a = new League();
                }
                a.f5904b = Long.valueOf(lLeagueID);
                a.f5905c = Long.valueOf(stLeagueBaseInfo.getStLeagueCreator());
                a.f5906d = stLeagueBaseInfo.getSLeagueName();
                if (stLeagueBaseInfo.getBLeagueMute() == 1) {
                    a.f5907e = Boolean.valueOf(true);
                } else {
                    a.f5907e = Boolean.valueOf(false);
                }
                a.f5908f = Integer.valueOf(stLeagueBaseInfo.getIMaxMembers());
                a.f5909g = Long.valueOf(stLeagueBaseInfo.getLCreateTime());
                leagueDao.d(a);
                leagueDBManager.f5599a.c();
            } catch (Throwable e) {
                e.printStackTrace();
                Log.e("LeagueDBManager", e.getMessage(), e);
            } finally {
                leagueDBManager.f5599a.b();
            }
            ResponseHandler.m3967a("NOTIFY_GET_LEAGUE_SUCCESS", new Object[0]);
        }
    }

    private static void at(byte[] bArr) {
        SCLeagueActionRsp parseFrom = SCLeagueActionRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCLeagueActionRsp:").append(TEXAS_CMD.Cmd_SCLeagueActionRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() != ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            int a = ResponseHandler.m3962a(parseFrom.getEErrCode());
            if (parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_ACCEPT_INVITE || parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_DENY_INVITE) {
                ResponseHandler.m3967a("NOTIFY_LEAGUE_ACTION_FAULT", Integer.valueOf(a));
            } else if (parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_REMOVE_INVITE) {
                ResponseHandler.m3967a("NOTIFY_REMOVE_LEAGUE_FAULT", Integer.valueOf(a));
            }
        } else if (parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_ACCEPT_INVITE || parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_DENY_INVITE) {
            LeagueMsgDBManager leagueMsgDBManager = DBManager.m3631a().f5582v;
            long stLeagueCreator = parseFrom.getStLeagueInfo().getStLeagueBaseInfo().getStLeagueCreator();
            long lActionedClubdID = parseFrom.getLActionedClubdID();
            long lLeagueID = parseFrom.getStLeagueInfo().getStLeagueBaseInfo().getLLeagueID();
            LEAGUE_ACT eLeagueAct = parseFrom.getELeagueAct();
            LeagueMsgDao leagueMsgDao = leagueMsgDBManager.f5601a.f6438M;
            LeagueMsg a2 = leagueMsgDBManager.m3681a(lLeagueID, stLeagueCreator, lActionedClubdID);
            if (a2 != null) {
                if (eLeagueAct == LEAGUE_ACT.LEAGUE_ACCEPT_INVITE) {
                    a2.f5930e = Integer.valueOf(2);
                    a2.f5936k = SharedPreferencesManager.m4361i();
                } else if (eLeagueAct == LEAGUE_ACT.LEAGUE_DENY_INVITE) {
                    a2.f5930e = Integer.valueOf(3);
                    a2.f5936k = SharedPreferencesManager.m4361i();
                }
                leagueMsgDao.d(a2);
            }
            ResponseHandler.m3967a("NOTIFY_LEAGUE_ACTION_SUCCESS", new Object[0]);
        } else if (parseFrom.getELeagueAct() == LEAGUE_ACT.LEAGUE_REMOVE_INVITE) {
            DBManager.m3631a().f5582v.m3684b(parseFrom.getStLeagueInfo().getStLeagueBaseInfo().getStLeagueCreator(), parseFrom.getLActionedClubdID(), parseFrom.getStLeagueInfo().getStLeagueBaseInfo().getLLeagueID());
            DBManager.m3631a().f5581u.m3673b(parseFrom.getStLeagueInfo().getStLeagueBaseInfo().getLLeagueID(), parseFrom.getLActionedClubdID());
            ResponseHandler.m3967a("NOTIFY_REMOVE_LEAGUE_SUCCESS", new Object[0]);
        }
    }

    private static void au(byte[] bArr) {
        SCSetLeagueSettingRsp parseFrom = SCSetLeagueSettingRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCSetLeagueSettingRsp:").append(TEXAS_CMD.Cmd_SCSetLeagueSettingRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            LeagueDBManager leagueDBManager = DBManager.m3631a().f5580t;
            LeagueBaseInfo stLeagueBaseInfo = parseFrom.getStLeagueBaseInfo();
            LeagueDao leagueDao = leagueDBManager.f5600b.f6436K;
            League a = leagueDBManager.m3675a(stLeagueBaseInfo.getLLeagueID());
            if (a != null) {
                if (stLeagueBaseInfo.getBLeagueMute() == 1) {
                    a.f5907e = Boolean.valueOf(true);
                } else {
                    a.f5907e = Boolean.valueOf(false);
                }
                leagueDao.d(a);
            }
            ResponseHandler.m3967a("NOTIFY_SET_LEAGUE_SUCCESS", new Object[0]);
            return;
        }
        ResponseHandler.m3967a("NOTIFY_SET_LEAGUE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
    }

    private static void av(byte[] bArr) {
        SCQuitLeagueRsp parseFrom = SCQuitLeagueRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCQuitLeagueRsp:").append(TEXAS_CMD.Cmd_SCQuitLeagueRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5581u.m3673b(parseFrom.getLLeagueID(), parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_LEAGUE_SUCCESS", new Object[0]);
        } else if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NO_LEAGUE) {
            DBManager.m3631a().f5581u.m3673b(parseFrom.getLLeagueID(), parseFrom.getLClubID());
            ResponseHandler.m3967a("NOTIFY_LEAVE_LEAGUE_SUCCESS", new Object[0]);
        } else {
            ResponseHandler.m3967a("NOTIFY_LEAVE_LEAGUE_FAULT", Integer.valueOf(ResponseHandler.m3962a(parseFrom.getEErrCode())));
        }
    }

    private static void aw(byte[] bArr) {
        SCGetLeagueByLeagueIDRsp parseFrom = SCGetLeagueByLeagueIDRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetLeagueByLeagueIDRsp:").append(TEXAS_CMD.Cmd_SCGetLeagueByLeagueIDRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            DBManager.m3631a().f5580t.m3676a(parseFrom.getStLeagueInfo());
            ResponseHandler.m3967a("NOTIFY_GET_LEAGUE_SUCCESS", new Object[0]);
        }
    }

    private static void ax(byte[] bArr) {
        SCGetFlashPageInfosRsp parseFrom = SCGetFlashPageInfosRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFlashPageInfosRsp:").append(TEXAS_CMD.Cmd_SCGetFlashPageInfosRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() == ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS && parseFrom.getVFlashPageInfosCount() > 0) {
            FlashPageInfo vFlashPageInfos = parseFrom.getVFlashPageInfos(0);
            SplashPreferencesManager.m4442a(vFlashPageInfos.getLFlashPageID());
            SplashPreferencesManager.m4443a(vFlashPageInfos.getSFlashUrl());
            SplashPreferencesManager.m4450b(vFlashPageInfos.getIBeginTime());
            SplashPreferencesManager.m4453c(vFlashPageInfos.getIEndTime());
            SplashPreferencesManager.m4441a(vFlashPageInfos.getIDuration());
            SplashPreferencesManager.m4449b(vFlashPageInfos.getEFlashPageActType().getNumber());
            SplashPreferencesManager.m4451b(vFlashPageInfos.getSJumpUrl());
            SplashPreferencesManager.m4454c(vFlashPageInfos.getSNativeExtra());
        }
    }

    private static void ay(byte[] bArr) {
        SCGetFestivalModeRsp parseFrom = SCGetFestivalModeRsp.parseFrom(bArr);
        new StringBuilder("TEXAS_CMD.Cmd_SCGetFestivalModeRsp:").append(TEXAS_CMD.Cmd_SCGetFestivalModeRsp).append(" error code:").append(parseFrom.getEErrCode());
        if (parseFrom.getEErrCode() != ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS) {
            return;
        }
        if (parseFrom.getBFestivalMode() == 1) {
            SplashPreferencesManager.m4447a(true);
        } else {
            SplashPreferencesManager.m4447a(false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4009a(byte[] r26) {
        /*
        r25 = this;
        r5 = com.texaspoker.moment.TexasPokerCommon.Package.parseFrom(r26);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "pbPackage cmd:";
        r2.<init>(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r5.getECmd();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r5.getECmd();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r5.getLCurrentSystemTime();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2 - r8;
        com.illuminate.texaspoker.utils.RuntimeData.f6671b = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.utils.RuntimeData.f6679j;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r10 = r5.getISeqNo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = java.lang.Long.valueOf(r10);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.get(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = (java.lang.Long) r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == 0) goto L_0x0063;
    L_0x0033:
        r3 = com.illuminate.texaspoker.utils.RuntimeData.f6679j;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r10 = r5.getISeqNo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = java.lang.Long.valueOf(r10);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.remove(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r10 = r5.getISeqNo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r12 = 0;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 <= 0) goto L_0x0063;
    L_0x004a:
        r3 = "NOTIFY_SINGNAL_VALUE";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = 0;
        r10 = r2.longValue();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = r8 - r10;
        r8 = (double) r8;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r10 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r8 = r8 * r10;
        r8 = (long) r8;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r7] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0063:
        r2 = r5.getBody();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.toByteArray();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUpdateRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x14b8;
    L_0x006f:
        r4 = 0;
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCLoginRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0074:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCLoginThirdPartyRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0078:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCRegisterRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x007c:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUploadVerifyCodeRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0080:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCRegetVerifyCodeRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0084:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCResetPwdUploadPhonenumberRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0088:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCResetPwdVerifyCodeRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x008c:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCHelloRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0090:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCHelloGameRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0094:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCReconnectRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x0098:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCKickOffPush;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x009c:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetFlashPageInfosRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00a4;
    L_0x00a0:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetFestivalModeRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 != r2) goto L_0x00b4;
    L_0x00a4:
        r2 = 0;
    L_0x00a5:
        r4 = com.illuminate.texaspoker.tea.TEAUtil.m4068a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r4.decode(r2, r3, r7);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != 0) goto L_0x00dd;
    L_0x00b3:
        return;
    L_0x00b4:
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCLogoutRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r6 == r2) goto L_0x00b3;
    L_0x00b8:
        r2 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4295Z();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = com.illuminate.texaspoker.utils.Utility.m4501f(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == 0) goto L_0x00db;
    L_0x00c2:
        r2 = com.illuminate.texaspoker.tea.TEAUtil.m4068a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = 0;
        r9 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = r2.decode(r8, r7, r9);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x00d7 }
        r8 = "UTF-8";
        r2.<init>(r7, r8);	 Catch:{ UnsupportedEncodingException -> 0x00d7 }
        goto L_0x00a5;
    L_0x00d7:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x00db:
        r2 = r4;
        goto L_0x00a5;
    L_0x00dd:
        r3 = r5.toBuilder();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.google.protobuf.ByteString.copyFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.setBody(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.build();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r26 = r3.toByteArray();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x00f1:
        r3 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ResponseHandler.f6504b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r6.ordinal();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        switch(r3) {
            case 1: goto L_0x0116;
            case 2: goto L_0x014a;
            case 3: goto L_0x01a2;
            case 4: goto L_0x01f4;
            case 5: goto L_0x021f;
            case 6: goto L_0x0226;
            case 7: goto L_0x0251;
            case 8: goto L_0x02a7;
            case 9: goto L_0x02f2;
            case 10: goto L_0x0326;
            case 11: goto L_0x0367;
            case 12: goto L_0x036e;
            case 13: goto L_0x03eb;
            case 14: goto L_0x03f2;
            case 15: goto L_0x041d;
            case 16: goto L_0x0448;
            case 17: goto L_0x0473;
            case 18: goto L_0x049e;
            case 19: goto L_0x04d2;
            case 20: goto L_0x0506;
            case 21: goto L_0x0538;
            case 22: goto L_0x0563;
            case 23: goto L_0x058e;
            case 24: goto L_0x0595;
            case 25: goto L_0x0639;
            case 26: goto L_0x0692;
            case 27: goto L_0x06d1;
            case 28: goto L_0x071f;
            case 29: goto L_0x076c;
            case 30: goto L_0x0831;
            case 31: goto L_0x0838;
            case 32: goto L_0x0ab6;
            case 33: goto L_0x0ad6;
            case 34: goto L_0x0b15;
            case 35: goto L_0x0b58;
            case 36: goto L_0x0b8b;
            case 37: goto L_0x0bea;
            case 38: goto L_0x0c48;
            case 39: goto L_0x0ca6;
            case 40: goto L_0x0d25;
            case 41: goto L_0x0d7b;
            case 42: goto L_0x0de2;
            case 43: goto L_0x0ea4;
            case 44: goto L_0x0ee1;
            case 45: goto L_0x0f9e;
            case 46: goto L_0x0ffd;
            case 47: goto L_0x1116;
            case 48: goto L_0x115f;
            case 49: goto L_0x11a8;
            case 50: goto L_0x11e5;
            case 51: goto L_0x1275;
            case 52: goto L_0x127a;
            case 53: goto L_0x127f;
            case 54: goto L_0x12d6;
            case 55: goto L_0x12db;
            case 56: goto L_0x12e0;
            case 57: goto L_0x12e5;
            case 58: goto L_0x12ea;
            case 59: goto L_0x12ef;
            case 60: goto L_0x12f4;
            case 61: goto L_0x12f9;
            case 62: goto L_0x12fe;
            case 63: goto L_0x1303;
            case 64: goto L_0x1308;
            case 65: goto L_0x130d;
            case 66: goto L_0x1312;
            case 67: goto L_0x1317;
            case 68: goto L_0x131c;
            case 69: goto L_0x1321;
            case 70: goto L_0x1326;
            case 71: goto L_0x132b;
            case 72: goto L_0x1332;
            case 73: goto L_0x1337;
            case 74: goto L_0x133e;
            case 75: goto L_0x1343;
            case 76: goto L_0x1348;
            case 77: goto L_0x134d;
            case 78: goto L_0x1352;
            case 79: goto L_0x1357;
            case 80: goto L_0x135c;
            case 81: goto L_0x1363;
            case 82: goto L_0x1368;
            case 83: goto L_0x136f;
            case 84: goto L_0x1376;
            case 85: goto L_0x137b;
            case 86: goto L_0x139b;
            case 87: goto L_0x13a0;
            case 88: goto L_0x13a5;
            case 89: goto L_0x13aa;
            case 90: goto L_0x13af;
            case 91: goto L_0x13b4;
            case 92: goto L_0x13b9;
            case 93: goto L_0x13be;
            case 94: goto L_0x13c3;
            case 95: goto L_0x13c8;
            case 96: goto L_0x13cd;
            case 97: goto L_0x13d2;
            case 98: goto L_0x13d9;
            case 99: goto L_0x13de;
            case 100: goto L_0x13e3;
            case 101: goto L_0x13e8;
            case 102: goto L_0x13ed;
            case 103: goto L_0x13f2;
            case 104: goto L_0x13f7;
            case 105: goto L_0x13fc;
            case 106: goto L_0x1401;
            case 107: goto L_0x1406;
            case 108: goto L_0x140b;
            case 109: goto L_0x1410;
            case 110: goto L_0x1415;
            case 111: goto L_0x141a;
            case 112: goto L_0x00b3;
            case 113: goto L_0x1421;
            case 114: goto L_0x1426;
            case 115: goto L_0x142b;
            case 116: goto L_0x1430;
            case 117: goto L_0x1435;
            case 118: goto L_0x143a;
            case 119: goto L_0x143f;
            case 120: goto L_0x1444;
            case 121: goto L_0x1449;
            case 122: goto L_0x144e;
            case 123: goto L_0x1453;
            case 124: goto L_0x1458;
            case 125: goto L_0x145d;
            case 126: goto L_0x1462;
            case 127: goto L_0x1467;
            case 128: goto L_0x146c;
            case 129: goto L_0x1471;
            case 130: goto L_0x1476;
            case 131: goto L_0x147b;
            case 132: goto L_0x1480;
            case 133: goto L_0x1487;
            case 134: goto L_0x148c;
            case 135: goto L_0x1491;
            case 136: goto L_0x1496;
            case 137: goto L_0x149d;
            case 138: goto L_0x14a4;
            case 139: goto L_0x14a9;
            case 140: goto L_0x14b0;
            default: goto L_0x00fc;
        };	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x00fc:
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0108:
        r2 = move-exception;
        r2.printStackTrace();
        r3 = "ResponseHandler";
        r4 = r2.getMessage();
        android.util.Log.e(r3, r4, r2);
        goto L_0x00b3;
    L_0x0116:
        r2 = com.texaspoker.moment.TexasPoker.SCStandUpRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCStandUpRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCStandUpRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCStandUpRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x014a:
        r2 = com.texaspoker.moment.TexasPoker.SCSitDownRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSitDownRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSitDownRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x018c;
    L_0x0170:
        r3 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getStGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getIMaxBuyinRatio();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.RuntimeData.f6676g = r3;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getStGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getIMinBuyinRatio();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.RuntimeData.f6677h = r3;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x018c:
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSitDownRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x01a2:
        r2 = com.texaspoker.moment.TexasPoker.SCBuyBuyInRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCBuyBuyInRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyBuyInRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyBuyInRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x01e7;
    L_0x01d1:
        r3 = r2.getStUserBaseInfoNet();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r3.getLCoin();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4311b(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStUserBaseInfoNet();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLPopularity();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4321c(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x01e7:
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x01f4:
        r2 = com.texaspoker.moment.TexasPoker.SCStartGameRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCStartGameRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCStartGameRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x021f:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3968a(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0226:
        r2 = com.texaspoker.moment.TexasPoker.SCGameActionRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGameActionRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGameActionRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0251:
        r2 = com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfoByRoomIDRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetBillInfoByRoomIDRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetBillInfoByRoomIDRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x028f;
    L_0x0277:
        r3 = "NOTIFY_GAME_DATA_TO_CC2D";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_GET_BILLINFO_BY_ROOMID_SUCCESS";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x028f:
        r3 = "NOTIFY_GAME_DATA_TO_CC2D";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_GET_BILLINFO_BY_ROOMID_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x02a7:
        r2 = com.texaspoker.moment.TexasPoker.SCUseDelayItemRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUseDelayItemRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUseDelayItemRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUseDelayItemRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStUserGameInfoNet();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x02e5;
    L_0x02d6:
        r2 = r2.getStUserGameInfoNet();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStUserInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLCoin();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4311b(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x02e5:
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x02f2:
        r2 = com.texaspoker.moment.TexasPoker.SCShowCardRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCShowCardRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCShowCardRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCShowCardRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0326:
        r2 = com.texaspoker.moment.TexasPoker.SCUseItemRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUseItemRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUseItemRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x035a;
    L_0x034c:
        r4 = r2.getLCoin();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4311b(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLPopularity();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4321c(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x035a:
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0367:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3970b(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x036e:
        r2 = com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoByRoomIDRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetGameRoomInfoByRoomIDRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetGameRoomInfoByRoomIDRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetGameRoomInfoByRoomIDRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x03d3;
    L_0x039d:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5572l;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3664a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5563c;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.getVUserGameInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3648c(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_GetGameRoomInfoByRoomID_Success";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x03c6:
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x03d3:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_GetGameRoomInfoByRoomID_Failed";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x03c6;
    L_0x03eb:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3972c(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x03f2:
        r2 = com.texaspoker.moment.TexasPoker.SCSetBuyinControlStateRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSetBuyinControlStateRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSetBuyinControlStateRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x041d:
        r2 = com.texaspoker.moment.TexasPoker.SCPauseGameRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCPauseGameRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCPauseGameRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0448:
        r2 = com.texaspoker.moment.TexasPoker.SCLeaveSNGGameRoomRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCLeaveSNGGameRoomRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCLeaveSNGGameRoomRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0473:
        r2 = com.texaspoker.moment.TexasPoker.SCReturnGameRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCReturnGameRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCReturnGameRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x049e:
        r2 = com.texaspoker.moment.TexasPoker.SCForceBBRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCForceBBRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCForceBBRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCForceBBRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x04d2:
        r2 = com.texaspoker.moment.TexasPoker.SCBuyInsuranceRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCBuyInsuranceRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyInsuranceRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyInsuranceRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0506:
        r2 = com.texaspoker.moment.TexasPoker.SCBuyInsuranceDelayRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCBuyInsuranceDelayRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyInsuranceDelayRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLCoin();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4311b(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0538:
        r2 = com.texaspoker.moment.TexasPoker.SCUserInsuranceSettingRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUserInsuranceSettingRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUserInsuranceSettingRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0563:
        r2 = com.texaspoker.moment.TexasPoker.SCGetGameSettingRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetGameSettingRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetGameSettingRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x058e:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3974d(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0595:
        r10 = com.texaspoker.moment.TexasPoker.SCSendMsgRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "TEXAS_CMD.Cmd_SCSendMsgRsp:";
        r2.<init>(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSendMsgRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = " error code:";
        r2 = r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r10.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r10.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x0620;
    L_0x05bb:
        r2 = r10.getETalkType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.CHAT_TYPE.CHAT_TYPE_SINGLE;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x061c;
    L_0x05c3:
        r2 = r10.getETalkType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r9 = r2;
    L_0x05c8:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5566f;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.f5540C;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r10.getLMsgId();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r10.getLTalkwith();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = r9.getNumber();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.m3572a(r3, r4, r6, r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_SEND_MSG_SUCCES";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r6 = r10.getLMsgId();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3[r4] = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.f5566f;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r10.getLMsgId();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r10.getLTalkwith();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = r9.getNumber();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r3.m3567a(r4, r6, r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5704q;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.intValue();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = 2;
        if (r2 != r3) goto L_0x00b3;
    L_0x0611:
        r2 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "res/social_sound/after_upload_voice.mp3";
        com.illuminate.texaspoker.utils.VoiceFileUtility.m4202a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x061c:
        r2 = com.texaspoker.moment.TexasPoker.CHAT_TYPE.CHAT_TYPE_GROUP;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r9 = r2;
        goto L_0x05c8;
    L_0x0620:
        r2 = r10.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_SEND_MSG_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0639:
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSystemFriendMsg:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSystemFriendMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCSystemFriendMsg.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5564d;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.m3700a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "NOTIFY_REFRESH_NEW_FRIEND";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = 0;
        r2 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r6] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_RFRESH_USER_INFO";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "UPLOAD_FRIEND_RELATION_SUCCESS";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_FRIEND";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_TAB_MY_INFO";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 <= 0) goto L_0x00b3;
    L_0x0688:
        r2 = "NOTIFY_PLAY_NEW_FRIEND_SOUND";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0692:
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSystemChatRoomMsg:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSystemChatRoomMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.texaspoker.moment.TexasPoker.SCSystemChatRoomMsg.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5566f;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3578b(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_SYS_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MOMENTS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_SETTING";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x06d1:
        r2 = com.texaspoker.moment.TexasPoker.SCSystemClubMsg.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSystemClubMsg:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSystemClubMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5575o;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3626a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_REFRESH_NEW_FRIEND";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_SYS_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MOMENTS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_CHATROOM";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x071f:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0769 }
        r4 = "TEXAS_CMD.Cmd_SCSystemQuickGameRoomMsg:";
        r3.<init>(r4);	 Catch:{ Exception -> 0x0769 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSystemQuickGameRoomMsg;	 Catch:{ Exception -> 0x0769 }
        r3.append(r4);	 Catch:{ Exception -> 0x0769 }
        r2 = com.texaspoker.moment.TexasPoker.SCSystemQuickGameRoomMsg.parseFrom(r2);	 Catch:{ Exception -> 0x0769 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x0769 }
        r3 = r3.f5565e;	 Catch:{ Exception -> 0x0769 }
        r2 = r3.m3594a(r2);	 Catch:{ Exception -> 0x0769 }
        r3 = "NOTIFY_REFRESH_MOMENTS";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0769 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ Exception -> 0x0769 }
        r3 = "NOTIFY_REFRESH_QUICK_USER_TABLE";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0769 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ Exception -> 0x0769 }
        r3 = "NOTIFY_REFRESH_DISCOVERY";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0769 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ Exception -> 0x0769 }
        r3 = "NOTIFY_REMOVE_QUICK_ROOM";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0769 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ Exception -> 0x0769 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ Exception -> 0x0769 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0769 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ Exception -> 0x0769 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ Exception -> 0x0769 }
        goto L_0x00b3;
    L_0x0769:
        r2 = move-exception;
        goto L_0x00b3;
    L_0x076c:
        r2 = com.texaspoker.moment.TexasPoker.SCPushKickOff.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCKickOffPush:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCKickOffPush;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4327d();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = -1;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4303a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_KICK_OUT_PUSH";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r6 = r2.getLTime();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.utils.Utility.m4500f();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != 0) goto L_0x00b3;
    L_0x079d:
        r2 = new android.support.v7.app.NotificationCompat$Builder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.<init>(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getResources();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 2130903382; // 0x7f030156 float:1.741358E38 double:1.0528061557E-314;
        r3 = android.graphics.BitmapFactory.decodeResource(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.setLargeIcon(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 2130903438; // 0x7f03018e float:1.7413694E38 double:1.0528061833E-314;
        r3 = r3.setSmallIcon(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 2131165230; // 0x7f07002e float:1.7944671E38 double:1.052935526E-314;
        r4 = com.illuminate.texaspoker.utils.StringUtils.m4461a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.setContentTitle(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 2131165721; // 0x7f070219 float:1.7945667E38 double:1.0529357683E-314;
        r4 = com.illuminate.texaspoker.utils.StringUtils.m4461a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.setContentText(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 1;
        r3 = r3.setAutoCancel(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 1;
        r3 = r3.setPriority(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = -1;
        r3 = r3.setDefaults(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = new android.support.v4.app.NotificationCompat$BigTextStyle;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 2131165721; // 0x7f070219 float:1.7945667E38 double:1.0529357683E-314;
        r5 = com.illuminate.texaspoker.utils.StringUtils.m4461a(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.bigText(r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.setStyle(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 2;
        r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.setSound(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new android.content.Intent;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = com.illuminate.texaspoker.activity.EmptyActivity.class;
        r3.<init>(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r3.setFlags(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r6 = 0;
        r3 = android.app.PendingIntent.getActivity(r4, r5, r3, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.setContentIntent(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.build();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r0 = r25;
        r3 = r0.f6506b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r3.notify(r4, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0831:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3976e(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0838:
        r10 = com.texaspoker.moment.TexasPoker.SCBuyinControlMsg.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "TEXAS_CMD.Cmd_SCBuyinControlMsg:";
        r2.<init>(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyinControlMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyinControlMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r10.getStBuyinControlMsg();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuyinControlMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r10.getStBuyinControlMsg();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getStFromUser();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.Utility.m4477a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r10.getStBuyinControlMsg();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r11 = r2.getStGameRoomInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r11.getEGameRoomType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE.GAME_ROOM_SNG;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x09fb;
    L_0x0872:
        r2 = r11.getStSNGGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getLGameRoomId();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r11.getStSNGGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLFromRoomID();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2;
        r8 = r4;
    L_0x0884:
        r12 = r10.getStBuyinControlMsg();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_INVITE;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x0a35;
    L_0x0890:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r13 = r2.f5579s;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r13.f5519a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r12.getStGameRoomInfo();	 Catch:{ Exception -> 0x0a1a }
        r3 = r2.getEGameRoomType();	 Catch:{ Exception -> 0x0a1a }
        r4 = com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE.GAME_ROOM_SNG;	 Catch:{ Exception -> 0x0a1a }
        if (r3 != r4) goto L_0x0a0f;
    L_0x08a7:
        r2 = r2.getStSNGGameRoomBaseInfo();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.getLGameRoomId();	 Catch:{ Exception -> 0x0a1a }
        r4 = r2;
    L_0x08b0:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.f5572l;	 Catch:{ Exception -> 0x0a1a }
        r14 = r12.getLClubID();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.m3656a(r4, r14);	 Catch:{ Exception -> 0x0a1a }
        if (r2 != 0) goto L_0x14b5;
    L_0x08c0:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.f5572l;	 Catch:{ Exception -> 0x0a1a }
        r3 = r12.getStGameRoomInfo();	 Catch:{ Exception -> 0x0a1a }
        r14 = 1;
        r2 = r2.m3658a(r3, r14);	 Catch:{ Exception -> 0x0a1a }
        r3 = r2;
    L_0x08d0:
        if (r3 == 0) goto L_0x095a;
    L_0x08d2:
        r2 = r12.getStFromUser();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.getStUserInfo();	 Catch:{ Exception -> 0x0a1a }
        r14 = r2.getUuid();	 Catch:{ Exception -> 0x0a1a }
        r2 = r13.m3560a(r4, r14);	 Catch:{ Exception -> 0x0a1a }
        if (r2 != 0) goto L_0x08f0;
    L_0x08e4:
        r2 = new com.illuminate.texaspoker.c.c;	 Catch:{ Exception -> 0x0a1a }
        r2.<init>();	 Catch:{ Exception -> 0x0a1a }
        r14 = 0;
        r14 = java.lang.Boolean.valueOf(r14);	 Catch:{ Exception -> 0x0a1a }
        r2.f5673f = r14;	 Catch:{ Exception -> 0x0a1a }
    L_0x08f0:
        r14 = r12.getLBuyinActionID();	 Catch:{ Exception -> 0x0a1a }
        r14 = java.lang.Long.valueOf(r14);	 Catch:{ Exception -> 0x0a1a }
        r2.f5669b = r14;	 Catch:{ Exception -> 0x0a1a }
        r2.m3718a(r3);	 Catch:{ Exception -> 0x0a1a }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0a1a }
        r2.f5670c = r3;	 Catch:{ Exception -> 0x0a1a }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x0a1a }
        r3 = r3.f5563c;	 Catch:{ Exception -> 0x0a1a }
        r4 = r12.getStFromUser();	 Catch:{ Exception -> 0x0a1a }
        r4 = r4.getStUserInfo();	 Catch:{ Exception -> 0x0a1a }
        r3 = r3.m3640a(r4);	 Catch:{ Exception -> 0x0a1a }
        r2.m3717a(r3);	 Catch:{ Exception -> 0x0a1a }
        r3 = r3.f5842u;	 Catch:{ Exception -> 0x0a1a }
        r2.f5671d = r3;	 Catch:{ Exception -> 0x0a1a }
        r4 = r12.getLBuyStacks();	 Catch:{ Exception -> 0x0a1a }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0a1a }
        r2.f5672e = r3;	 Catch:{ Exception -> 0x0a1a }
        r3 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ Exception -> 0x0a1a }
        r3 = r3.getNumber();	 Catch:{ Exception -> 0x0a1a }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0a1a }
        r2.f5674g = r3;	 Catch:{ Exception -> 0x0a1a }
        r3 = r12.getSActionNickname();	 Catch:{ Exception -> 0x0a1a }
        r2.m3719a(r3);	 Catch:{ Exception -> 0x0a1a }
        r4 = r12.getLMsgID();	 Catch:{ Exception -> 0x0a1a }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0a1a }
        r2.f5678k = r3;	 Catch:{ Exception -> 0x0a1a }
        r4 = r12.getLClubID();	 Catch:{ Exception -> 0x0a1a }
        r2.f5679l = r4;	 Catch:{ Exception -> 0x0a1a }
        r3 = r12.getSClubName();	 Catch:{ Exception -> 0x0a1a }
        r2.f5680m = r3;	 Catch:{ Exception -> 0x0a1a }
        r3 = r13.f5520b;	 Catch:{ Exception -> 0x0a1a }
        r3 = r3.m3917a();	 Catch:{ Exception -> 0x0a1a }
        r3.d(r2);	 Catch:{ Exception -> 0x0a1a }
    L_0x095a:
        r2 = r13.f5519a;	 Catch:{ Exception -> 0x0a1a }
        r2.c();	 Catch:{ Exception -> 0x0a1a }
        r2 = r13.f5519a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0964:
        r2 = com.illuminate.texaspoker.application.BaseApplication.m3548a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "res/social_sound/buy_in_apply.mp3";
        com.illuminate.texaspoker.utils.VoiceFileUtility.m4202a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x096d:
        com.illuminate.texaspoker.utils.NetworkUtil.m4073a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r12.getLBuyinActionID();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.NetworkUtil.m4175k(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_ROOM_ScbuyinControlMsg";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r12;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r11.getEGameRoomType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE.GAME_ROOM_SNG;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x09e6;
    L_0x098a:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_ACCEPT;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == r3) goto L_0x099a;
    L_0x0992:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DENY;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x09e6;
    L_0x099a:
        r2 = r12.getStFromUser();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStUserInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getUuid();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x09e6;
    L_0x09ae:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DENY;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x09db;
    L_0x09b6:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5572l;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.f5595a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f6435J;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.m3656a(r8, r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == 0) goto L_0x09d0;
    L_0x09c6:
        r4 = 0;
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.f5882f = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.d(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x09d0:
        r2 = "NOTIFY_TO_REFRESH_VIEW_AFTER_DENNY";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r10;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x09db:
        r2 = "NOTIFY_GAME_ROOM_buyinControlMsg_rsp";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r10;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x09e6:
        r2 = "NOTIFY_GAME_ROOM_buyinControlMsg_CC2D_REFRESH_rsp";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GAME_DATA_TO_CC2D";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3[r4] = r26;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x09fb:
        r2 = r11.getStGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getLGameRoomId();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r11.getStGameRoomBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getLChatRoomID();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2;
        r8 = r4;
        goto L_0x0884;
    L_0x0a0f:
        r2 = r2.getStGameRoomBaseInfo();	 Catch:{ Exception -> 0x0a1a }
        r2 = r2.getLGameRoomId();	 Catch:{ Exception -> 0x0a1a }
        r4 = r2;
        goto L_0x08b0;
    L_0x0a1a:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ all -> 0x0a2e }
        r3 = "MessageMsgDBManager";
        r4 = r2.getMessage();	 Catch:{ all -> 0x0a2e }
        android.util.Log.e(r3, r4, r2);	 Catch:{ all -> 0x0a2e }
        r2 = r13.f5519a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x0964;
    L_0x0a2e:
        r2 = move-exception;
        r3 = r13.f5519a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        throw r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0a35:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_ACCEPT;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == r3) goto L_0x0a45;
    L_0x0a3d:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DENY;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x0a75;
    L_0x0a45:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5579s;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r12.getLActionUuid();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.m3560a(r8, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 == 0) goto L_0x096d;
    L_0x0a55:
        r2 = r2.f5520b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.m3917a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r12.getSActionNickname();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3719a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.getNumber();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.f5674g = r4;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.d(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x096d;
    L_0x0a75:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_DISABLE;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 == r3) goto L_0x0a85;
    L_0x0a7d:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_ENABLE;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x0a90;
    L_0x0a85:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5579s;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.m3561a(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x096d;
    L_0x0a90:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_SNG_START;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x0aa3;
    L_0x0a98:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5579s;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.m3561a(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x096d;
    L_0x0aa3:
        r2 = r12.getEBuyinControlMessageTypeDeny();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_SNG_CANCEL;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x096d;
    L_0x0aab:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.f5579s;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.m3561a(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x096d;
    L_0x0ab6:
        r2 = com.texaspoker.moment.TexasPoker.SCUploadAPNTokenRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUploadAPNTokenRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUploadAPNTokenRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0ad6:
        r2 = com.texaspoker.moment.TexasPokerHttpLeague.SCSystemLeagueMsg.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSystemLeagueMsg:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSystemLeagueMsg;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5582v;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVMsgsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3682a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_SYS_MSG";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MOMENTS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_CHATROOM";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0b15:
        r2 = com.texaspoker.moment.TexasPokerHttp.SCGetBannerInfosRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetBannerInfosRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetBannerInfosRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0b3b:
        r3 = r2.getVBannerInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 == 0) goto L_0x00b3;
    L_0x0b41:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5568h;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVBannerInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3553a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_DISCOVERY";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0b58:
        r2 = com.texaspoker.moment.TexasPokerHttp.SCUpdateRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUpdateRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUpdateRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0b7e:
        r3 = "NOTIFY_UPDATE_RESULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0b8b:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCGetFriendStatusRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetFriendStatusRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetFriendStatusRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0bb1:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5563c;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVFriendsInfoList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r3.f5592b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = new com.illuminate.texaspoker.b.n$1;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7.<init>(r3, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6.a(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = "use time = ";
        r6.<init>(r7);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2 - r4;
        r6.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_FRIEND";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_MOMENTS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0bea:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCUploadUserCoverRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUploadUserCoverRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUploadUserCoverRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0c2f;
    L_0x0c10:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5561a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2.getSSmallAlbumsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getSBigAlbumsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3638b(r4, r6, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_UPLOAD_USER_COVER_PHOTO_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0c2f:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_UPLOAD_USER_COVER_PHOTO_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0c48:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCDeleteUserCoverRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.SCDeleteUserCoverRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCDeleteUserCoverRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0c8d;
    L_0x0c6e:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5561a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2.getSSmallAlbumsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getSBigAlbumsList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3638b(r4, r6, r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_DELETE_USER_COVER_PHOTO_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0c8d:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_DELETE_USER_COVER_PHOTO_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0ca6:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCUploadFriendRelationRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCUploadFriendRelationRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCUploadFriendRelationRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0d1b;
    L_0x0ccc:
        r3 = r2.getEUploadType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_FRIEND_RELATION_TYPE.UPLOAD_FRIEND_RELATION_PHONE;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0cf3;
    L_0x0cd4:
        r3 = r2.getVFriendsInfoList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 == 0) goto L_0x0ce9;
    L_0x0cda:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5562b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVFriendsInfoList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.p057b.DBManager.f5556z;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3655a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0ce9:
        r2 = "UPLOAD_FRIEND_RELATION_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0cf3:
        r3 = r2.getEUploadType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_FRIEND_RELATION_TYPE.UPLOAD_FRIEND_RELATION_FACEBOOK;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0cfb:
        r3 = r2.getVFriendsInfoList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 == 0) goto L_0x0d0e;
    L_0x0d01:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5562b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getVFriendsInfoList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3654a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0d0e:
        r3 = "UPLOAD_FACBOOK_FRIEND_RELATION_SUCCESS";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0d1b:
        r2 = "UPLOAD_FRIEND_RELATION_FAULT";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0d25:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCSearchFriendRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSearchFriendRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSearchFriendRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0d69;
    L_0x0d4b:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5563c;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getVUserFriendIfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3647b(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_SEARCH_RESULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = r2.getVUserFriendIfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0d69:
        r2 = "NOTIFY_SEARCH_RESULT";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3[r4] = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0d7b:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoSettingRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSetUserInfoSettingRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSetUserInfoSettingRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0dd8;
    L_0x0da1:
        r3 = r2.getIMute();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != 0) goto L_0x0dc9;
    L_0x0da7:
        r3 = 1;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4328d(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0dab:
        r3 = r2.getIVibrate();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != 0) goto L_0x0dce;
    L_0x0db1:
        r3 = 1;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4342f(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0db5:
        r2 = r2.getIFriendInviteMute();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != 0) goto L_0x0dd3;
    L_0x0dbb:
        r2 = 0;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4348g(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0dbf:
        r2 = "NOTIFY_CHANGE_SOUND_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0dc9:
        r3 = 0;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4328d(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x0dab;
    L_0x0dce:
        r3 = 0;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4342f(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x0db5;
    L_0x0dd3:
        r2 = 1;
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4348g(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x0dbf;
    L_0x0dd8:
        r2 = "NOTIFY_CHANGE_SOUND_FAULT";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0de2:
        r2 = com.texaspoker.moment.TexasPokerHttpUser.SCInviteActionRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCInviteActionRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCInviteActionRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0e84;
    L_0x0e08:
        r3 = r2.getStInviteUser();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.f5563c;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = r4.f5592b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = r5.m3918b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r4.f5592b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r6.f6433H;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = r4.f5592b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = new com.illuminate.texaspoker.b.n$2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8.<init>(r4, r3, r6, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7.a(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "NOTIFY_REFRESH_FRIEND";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "NOTIFY_REFRESH_NEW_FRIEND";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = 0;
        r7 = r2.getBState();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r6] = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = 1;
        r7 = r3.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r8 = r7.getUuid();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r6] = r7;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "UPLOAD_FRIEND_RELATION_SUCCESS";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "NOTIFY_REFRESH_TAB_MY_INFO";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "INVITE_FRIEND_SUCCESS";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = 0;
        r2 = r2.getBState();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r6] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "INVITE_FRIEND_INGAME_SUCCESS";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r3 = r3.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r3.getUuid();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = java.lang.Long.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r3;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0e84:
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "INVITE_FRIEND_FAULT";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = 0;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r6] = r3;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = 1;
        r2 = r2.getBState();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5[r3] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0ea4:
        r2 = com.texaspoker.moment.TexasPokerHttpTransaction.SCGetSellingItemListRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetSellingItemListRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetSellingItemListRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0eca:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5573m;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVSellingItemListList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3699a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_GET_SELL_ITEM_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0ee1:
        r2 = com.texaspoker.moment.TexasPokerHttpTransaction.SCBuySellingItemRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCBuySellingItemRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCBuySellingItemRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0f73;
    L_0x0f07:
        r3 = r2.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r3.getLCoin();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4311b(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r3.getLPopularity();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4321c(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getEVipType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.getNumber();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4309b(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r3.getLVIPLimitTime();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4336e(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5563c;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2.getStUserBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r6.getEVipType();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r6.getNumber();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r3.m3639a(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r4 == 0) goto L_0x0f62;
    L_0x0f53:
        r3 = r3.f5592b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.m3918b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = java.lang.Integer.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4.f5830i = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.d(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x0f62:
        r2 = r2.getIMaxClubNums();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4362i(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_BUY_ITEM_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0f73:
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_TRANSACTIONID_REPEAT;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x0f85;
    L_0x0f7b:
        r2 = "NOTIFY_BUY_ITEM_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0f85:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_BUY_ITEM_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0f9e:
        r2 = com.texaspoker.moment.TexasPokerHttp.SCGetSystemMsgsRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetSystemMsgsRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetSystemMsgsRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x0fc4:
        r3 = r2.getIOffset();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != 0) goto L_0x0fe2;
    L_0x0fca:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5574n;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getVSystemMsgBaseInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r3.m3688a(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_SYSTEM_MESSAGE";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0fe2:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5574n;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getVSystemMsgBaseInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 1;
        r3.m3688a(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_LOAD_SYSTEM_MESSAGE";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x0ffd:
        r21 = com.texaspoker.moment.TexasPokerHttpClub.SCCreateClubRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "TEXAS_CMD.Cmd_SCCreateClubRsp:";
        r2.<init>(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCCreateClubRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = " error code:";
        r2 = r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r21.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.append(r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r21.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r2 != r3) goto L_0x10fd;
    L_0x1023:
        r2 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r0 = r2.f5565e;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r22 = r0;
        r2 = r21.getStClubInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStClubBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r0 = r22;
        r3 = r0.f5527b;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f6426A;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r0 = r22;
        r4 = r0.f5526a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4.a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x10df }
        r6 = com.illuminate.texaspoker.utils.RuntimeData.f6671b;	 Catch:{ Exception -> 0x10df }
        r4 = r4 + r6;
        r6 = 1;
        r0 = r22;
        r4 = r0.m3593a(r2, r4, r6);	 Catch:{ Exception -> 0x10df }
        r5 = 1;
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x10df }
        r4.f5717D = r5;	 Catch:{ Exception -> 0x10df }
        r3.d(r4);	 Catch:{ Exception -> 0x10df }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x10df }
        r6 = com.illuminate.texaspoker.utils.RuntimeData.f6671b;	 Catch:{ Exception -> 0x10df }
        r6 = r6 + r4;
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x10df }
        r3 = r3.f5566f;	 Catch:{ Exception -> 0x10df }
        r4 = r2.getLClubID();	 Catch:{ Exception -> 0x10df }
        r8 = 2;
        r3.m3582e(r4, r6, r8);	 Catch:{ Exception -> 0x10df }
        r3 = 2131165334; // 0x7f070096 float:1.7944882E38 double:1.052935577E-314;
        r3 = com.illuminate.texaspoker.utils.StringUtils.m4461a(r3);	 Catch:{ Exception -> 0x10df }
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x10df }
        r5 = 0;
        r8 = r2.getSClubName();	 Catch:{ Exception -> 0x10df }
        r4[r5] = r8;	 Catch:{ Exception -> 0x10df }
        r12 = java.lang.String.format(r3, r4);	 Catch:{ Exception -> 0x10df }
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ Exception -> 0x10df }
        r3 = r3.f5566f;	 Catch:{ Exception -> 0x10df }
        r4 = 1;
        r4 = r4 + r6;
        r23 = 2;
        r24 = com.illuminate.texaspoker.p057b.DBManager.f5555y;	 Catch:{ Exception -> 0x10df }
        r8 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();	 Catch:{ Exception -> 0x10df }
        r10 = r2.getLClubID();	 Catch:{ Exception -> 0x10df }
        r14 = 1;
        r13 = r6 + r14;
        r15 = com.illuminate.texaspoker.p057b.DBManager.f5540C;	 Catch:{ Exception -> 0x10df }
        r16 = 0;
        r18 = com.illuminate.texaspoker.p057b.DBManager.f5548K;	 Catch:{ Exception -> 0x10df }
        r19 = 0;
        r20 = 1;
        r6 = r23;
        r7 = r24;
        r3.m3566a(r4, r6, r7, r8, r10, r12, r13, r15, r16, r18, r19, r20);	 Catch:{ Exception -> 0x10df }
        r0 = r22;
        r2 = r0.f5526a;	 Catch:{ Exception -> 0x10df }
        r2.c();	 Catch:{ Exception -> 0x10df }
        r0 = r22;
        r2 = r0.f5526a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x10ba:
        r2 = "NOTIFY_REFRESH_MOMENTS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_CREATE_CLUB_SUCCESS";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r5 = r21.getStClubInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = r5.getStClubBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r5.getLClubID();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3[r4] = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x10df:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ all -> 0x10f4 }
        r3 = "ChatRoomDBManager";
        r4 = r2.getMessage();	 Catch:{ all -> 0x10f4 }
        android.util.Log.e(r3, r4, r2);	 Catch:{ all -> 0x10f4 }
        r0 = r22;
        r2 = r0.f5526a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x10ba;
    L_0x10f4:
        r2 = move-exception;
        r0 = r22;
        r3 = r0.f5526a;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.b();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        throw r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x10fd:
        r2 = r21.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_CREATE_CLUB_FALUT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1116:
        r2 = com.texaspoker.moment.TexasPokerHttpClub.SCSearchClubRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSearchClubRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSearchClubRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x114d;
    L_0x113c:
        r3 = "NOTIFY_SEARCH_CLUB_RESULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = r2.getVClubBaseInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x114d:
        r2 = "NOTIFY_SEARCH_CLUB_RESULT";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3[r4] = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x115f:
        r2 = com.texaspoker.moment.TexasPokerHttpClub.SCGetClubsByLocationRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetClubsByLocationRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetClubsByLocationRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x1196;
    L_0x1185:
        r3 = "NOTIFY_GET_CLUB_BY_LOCATION_RESULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = r2.getVClubBaseInfosList();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1196:
        r2 = "NOTIFY_GET_CLUB_BY_LOCATION_RESULT";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 0;
        r5 = new java.util.ArrayList;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5.<init>();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3[r4] = r5;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x11a8:
        r2 = com.texaspoker.moment.TexasPokerHttpClub.SCGetClubBaseInfoByClubIDRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCGetClubBaseInfoByClubIDRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCGetClubBaseInfoByClubIDRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x00b3;
    L_0x11ce:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5565e;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStClubBaseInfos();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.m3597a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_REFRESH_CHATROOM";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x11e5:
        r2 = com.texaspoker.moment.TexasPokerHttpClub.SCEnterClubRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCEnterClubRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCEnterClubRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x125c;
    L_0x120b:
        r3 = r2.getEClubUserLevel();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerHttpClub.CLUB_USER_LEVEL.CLUB_USER_NOT;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x1249;
    L_0x1213:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5565e;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStClubInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.getStClubBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r3.m3603b(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
    L_0x1225:
        r3 = "NOTIFY_CLUB_ENTER_SUCCESS";
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r6 = r2.getEClubUserLevel();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r6;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 1;
        r2 = r2.getStClubInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStClubBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r6 = r2.getLClubID();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1249:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5565e;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getStClubInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r4.getStClubBaseInfo();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 1;
        r3.m3603b(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x1225;
    L_0x125c:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_CLUB_ENTER_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1275:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3948M(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x127a:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3949N(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x127f:
        r2 = com.texaspoker.moment.TexasPokerHttpClub.SCSetClubSettingRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCSetClubSettingRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCSetClubSettingRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.ERROR_CODE_TYPE_SUCCESS;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        if (r3 != r4) goto L_0x12bd;
    L_0x12a5:
        r3 = com.illuminate.texaspoker.p057b.DBManager.m3631a();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.f5565e;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getStClubBaseInfos();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = 1;
        r3.m3603b(r2, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = "NOTIFY_SET_CLUB_SETTING_SUCCESS";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r2, r3);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12bd:
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3962a(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = "NOTIFY_SET_CLUB_SETTING_FAULT";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4[r5] = r2;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3967a(r3, r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12d6:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3950O(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12db:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3951P(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12e0:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3952Q(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12e5:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3953R(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12ea:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3954S(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12ef:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3955T(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12f4:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3956U(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12f9:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3957V(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x12fe:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3958W(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1303:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3959X(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1308:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3960Y(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x130d:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3961Z(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1312:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.aa(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1317:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ab(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x131c:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ac(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1321:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ad(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1326:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ae(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x132b:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3990l(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1332:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.af(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1337:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3992m(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x133e:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ag(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1343:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ah(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1348:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ai(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x134d:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.aj(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1352:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ak(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1357:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.al(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x135c:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3994n(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1363:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.am(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1368:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3996o(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x136f:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3998p(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1376:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.an(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x137b:
        r2 = com.texaspoker.moment.TexasPokerHarbour.SCReportLocationInfoRsp.parseFrom(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = "TEXAS_CMD.Cmd_SCReportLocationInfoRsp:";
        r3.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.Cmd_SCReportLocationInfoRsp;	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r4 = " error code:";
        r3 = r3.append(r4);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r2 = r2.getEErrCode();	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        r3.append(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x139b:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ao(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13a0:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ap(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13a5:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.aq(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13aa:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ar(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13af:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.as(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13b4:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.at(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13b9:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.au(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13be:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.av(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13c3:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.aw(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13c8:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ax(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13cd:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.ay(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13d2:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3978f(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13d9:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3969b(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13de:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3971c(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13e3:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3973d(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13e8:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3975e(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13ed:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3977f(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13f2:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3979g(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13f7:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3981h(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x13fc:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3983i(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1401:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3985j(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1406:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3987k(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x140b:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3989l(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1410:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3991m(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1415:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3993n(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x141a:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3980g(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1421:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3995o(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1426:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3997p(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x142b:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3999q(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1430:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4000r(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1435:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4001s(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x143a:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4002t(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x143f:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4003u(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1444:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4004v(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1449:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4005w(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x144e:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4006x(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1453:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4007y(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1458:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m4008z(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x145d:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3936A(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1462:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3937B(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1467:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3938C(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x146c:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3939D(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1471:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3940E(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1476:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3941F(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x147b:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3942G(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1480:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3982h(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1487:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3943H(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x148c:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3944I(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1491:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3945J(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x1496:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3984i(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x149d:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3986j(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x14a4:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3946K(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x14a9:
        r0 = r26;
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3988k(r2, r0);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x14b0:
        com.illuminate.texaspoker.p060e.p062b.ResponseHandler.m3947L(r2);	 Catch:{ InvalidProtocolBufferException -> 0x0108 }
        goto L_0x00b3;
    L_0x14b5:
        r3 = r2;
        goto L_0x08d0;
    L_0x14b8:
        r2 = r3;
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.e.b.g.a(byte[]):void");
    }
}
