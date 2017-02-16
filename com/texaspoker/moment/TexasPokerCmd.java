package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public final class TexasPokerCmd {
    private static FileDescriptor f0a;

    /* renamed from: com.texaspoker.moment.TexasPokerCmd.1 */
    class C00811 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{13995, 13996});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00811();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public enum TEXAS_CMD implements ProtocolMessageEnum {
        ;
        
        public static final int Cmd_CSAddChatRoomUser_VALUE = 32;
        public static final int Cmd_CSAddClubFund_VALUE = 145;
        public static final int Cmd_CSAddClubMaxMember_VALUE = 144;
        public static final int Cmd_CSAddFriend_VALUE = 73;
        public static final int Cmd_CSAddLeagueMaxMember_VALUE = 200;
        public static final int Cmd_CSAdminAddClubFund_VALUE = 135;
        public static final int Cmd_CSAdminAddCoin_VALUE = 86;
        public static final int Cmd_CSBuyBuyInV2_VALUE = 204;
        public static final int Cmd_CSBuyBuyIn_VALUE = 51;
        public static final int Cmd_CSBuyCoinAndroid_VALUE = 170;
        public static final int Cmd_CSBuyCoin_VALUE = 44;
        public static final int Cmd_CSBuyInsuranceDelay_VALUE = 178;
        public static final int Cmd_CSBuyInsurance_VALUE = 175;
        public static final int Cmd_CSBuyNickname_VALUE = 147;
        public static final int Cmd_CSBuySellingItem_VALUE = 46;
        public static final int Cmd_CSBuyinAction_VALUE = 158;
        public static final int Cmd_CSBuyinControlMsgRsp_VALUE = 10157;
        public static final int Cmd_CSCSGetAllPokerHistory_VALUE = 154;
        public static final int Cmd_CSCancelGame_VALUE = 188;
        public static final int Cmd_CSCancelOfflineGameRoom_VALUE = 81;
        public static final int Cmd_CSChangeOfflineGameRoom_VALUE = 82;
        public static final int Cmd_CSCheckNicknameStatus_VALUE = 148;
        public static final int Cmd_CSClubAction_VALUE = 89;
        public static final int Cmd_CSCreateChatRoom_VALUE = 15;
        public static final int Cmd_CSCreateClub_VALUE = 87;
        public static final int Cmd_CSCreateGameRoom_VALUE = 16;
        public static final int Cmd_CSCreateLeague_VALUE = 191;
        public static final int Cmd_CSCreateOfflineGame_VALUE = 76;
        public static final int Cmd_CSCreateQuickGameRoom_VALUE = 124;
        public static final int Cmd_CSCreateQuickSNGGameRoom_VALUE = 168;
        public static final int Cmd_CSCreateSNGGameRoom_VALUE = 164;
        public static final int Cmd_CSCreatorInsuranceSetting_VALUE = 176;
        public static final int Cmd_CSDeleteClubCover_VALUE = 105;
        public static final int Cmd_CSDeleteUserCover_VALUE = 108;
        public static final int Cmd_CSEnterClub_VALUE = 88;
        public static final int Cmd_CSEnterGameRoom_VALUE = 27;
        public static final int Cmd_CSEnterLeague_VALUE = 192;
        public static final int Cmd_CSEnterQuickGameRoom_VALUE = 125;
        public static final int Cmd_CSFeedback_VALUE = 30;
        public static final int Cmd_CSForceBB_VALUE = 179;
        public static final int Cmd_CSForceStandup_VALUE = 209;
        public static final int Cmd_CSGameActionV3_VALUE = 123;
        public static final int Cmd_CSGameAction_VALUE = 37;
        public static final int Cmd_CSGameRoomStateChangeRsp_VALUE = 1038;
        public static final int Cmd_CSGetAllBannerInfo_VALUE = 117;
        public static final int Cmd_CSGetAllBuyinControls_VALUE = 162;
        public static final int Cmd_CSGetAllRecommendUserInfo_VALUE = 119;
        public static final int Cmd_CSGetBannerInfos_VALUE = 134;
        public static final int Cmd_CSGetBenefits_VALUE = 140;
        public static final int Cmd_CSGetBillInfoByRoomID_VALUE = 75;
        public static final int Cmd_CSGetBillInfosV2_VALUE = 207;
        public static final int Cmd_CSGetBillInfos_VALUE = 52;
        public static final int Cmd_CSGetChatRoomGamesByRoomID_VALUE = 110;
        public static final int Cmd_CSGetChatRoomInfoByRoomID_VALUE = 18;
        public static final int Cmd_CSGetChatRoomInfosByUuid_VALUE = 19;
        public static final int Cmd_CSGetChatRoomUsersByRoomID_VALUE = 109;
        public static final int Cmd_CSGetClubBaseInfoByClubID_VALUE = 113;
        public static final int Cmd_CSGetClubByClubID_VALUE = 102;
        public static final int Cmd_CSGetClubGamesByClubID_VALUE = 112;
        public static final int Cmd_CSGetClubInfoByUuid_VALUE = 106;
        public static final int Cmd_CSGetClubSellingItems_VALUE = 146;
        public static final int Cmd_CSGetClubUsersByClubID_VALUE = 111;
        public static final int Cmd_CSGetClubsByLocation_VALUE = 92;
        public static final int Cmd_CSGetCoinStoreList_VALUE = 43;
        public static final int Cmd_CSGetDefaultSetting_VALUE = 48;
        public static final int Cmd_CSGetFavoriteListV2_VALUE = 152;
        public static final int Cmd_CSGetFavoriteList_VALUE = 54;
        public static final int Cmd_CSGetFestivalMode_VALUE = 211;
        public static final int Cmd_CSGetFlashPageInfos_VALUE = 205;
        public static final int Cmd_CSGetFriendStatus_VALUE = 9;
        public static final int Cmd_CSGetFrontPageInfoV2_VALUE = 114;
        public static final int Cmd_CSGetFrontPageInfoV3_VALUE = 133;
        public static final int Cmd_CSGetFrontPageInfoV4_VALUE = 206;
        public static final int Cmd_CSGetFrontPageInfo_VALUE = 17;
        public static final int Cmd_CSGetFundBillInfos_VALUE = 103;
        public static final int Cmd_CSGetGameInfo_VALUE = 7;
        public static final int Cmd_CSGetGameRoomInfoByRoomID_VALUE = 67;
        public static final int Cmd_CSGetGameRoomInfo_VALUE = 20;
        public static final int Cmd_CSGetGameRoomLeagueClubs_VALUE = 203;
        public static final int Cmd_CSGetGameSetting_VALUE = 180;
        public static final int Cmd_CSGetHotClubs_VALUE = 93;
        public static final int Cmd_CSGetItemList_VALUE = 47;
        public static final int Cmd_CSGetLastPokerHandResult_VALUE = 153;
        public static final int Cmd_CSGetLeagueBaseInfoByLeagueID_VALUE = 197;
        public static final int Cmd_CSGetLeagueByLeagueID_VALUE = 198;
        public static final int Cmd_CSGetLeagueInfoByClubID_VALUE = 199;
        public static final int Cmd_CSGetLoginReward_VALUE = 59;
        public static final int Cmd_CSGetMyClubsV2_VALUE = 202;
        public static final int Cmd_CSGetMyClubs_VALUE = 98;
        public static final int Cmd_CSGetOfflineOverGameInfo_VALUE = 83;
        public static final int Cmd_CSGetPokerHandResultByHandID_VALUE = 183;
        public static final int Cmd_CSGetQuickGameRoom_VALUE = 128;
        public static final int Cmd_CSGetRecommendClubs_VALUE = 115;
        public static final int Cmd_CSGetSellingItemList_VALUE = 45;
        public static final int Cmd_CSGetSystemMsgByIDCMS_VALUE = 142;
        public static final int Cmd_CSGetSystemMsgByID_VALUE = 139;
        public static final int Cmd_CSGetSystemMsgByTypeCMS_VALUE = 141;
        public static final int Cmd_CSGetSystemMsgs_VALUE = 138;
        public static final int Cmd_CSGetUserBaseInfo_VALUE = 150;
        public static final int Cmd_CSGetUserGameInfoInRoom_VALUE = 64;
        public static final int Cmd_CSGetUserInfoV2_VALUE = 137;
        public static final int Cmd_CSGetUserInfo_VALUE = 6;
        public static final int Cmd_CSGiveMoneyPushMsgRsp_VALUE = 10130;
        public static final int Cmd_CSGiveMoney_VALUE = 129;
        public static final int Cmd_CSHelloGame_VALUE = 174;
        public static final int Cmd_CSHello_VALUE = 11;
        public static final int Cmd_CSInviteAction_VALUE = 10;
        public static final int Cmd_CSJoinOfflineGameRoom_VALUE = 78;
        public static final int Cmd_CSKickUserGameRoom_VALUE = 41;
        public static final int Cmd_CSKickUserInGame_VALUE = 186;
        public static final int Cmd_CSLeagueAction_VALUE = 193;
        public static final int Cmd_CSLeaveChatRoom_VALUE = 39;
        public static final int Cmd_CSLeaveGameRoom_VALUE = 40;
        public static final int Cmd_CSLeaveSNGGameRoom_VALUE = 167;
        public static final int Cmd_CSLoginReward_VALUE = 58;
        public static final int Cmd_CSLoginThirdParty_VALUE = 173;
        public static final int Cmd_CSLoginWeibo_VALUE = 4;
        public static final int Cmd_CSLogin_VALUE = 5;
        public static final int Cmd_CSLogout_VALUE = 63;
        public static final int Cmd_CSMiniGameChange_VALUE = 9001;
        public static final int Cmd_CSMiniGameCheck_VALUE = 9003;
        public static final int Cmd_CSMiniGameDouble_VALUE = 9002;
        public static final int Cmd_CSMiniGameExit_VALUE = 9004;
        public static final int Cmd_CSMiniGameIni_VALUE = 9005;
        public static final int Cmd_CSMiniGameStart_VALUE = 9000;
        public static final int Cmd_CSOverOfflineGameRoom_VALUE = 80;
        public static final int Cmd_CSPauseGame_VALUE = 160;
        public static final int Cmd_CSPreBuyCoinAndroid_VALUE = 169;
        public static final int Cmd_CSPushMsgRsp_VALUE = 1022;
        public static final int Cmd_CSQuickLogin_VALUE = 13;
        public static final int Cmd_CSQuitClub_VALUE = 100;
        public static final int Cmd_CSQuitLeague_VALUE = 196;
        public static final int Cmd_CSQuitQuickGameRoom_VALUE = 131;
        public static final int Cmd_CSReconnect_VALUE = 26;
        public static final int Cmd_CSRegetVerifyCode_VALUE = 69;
        public static final int Cmd_CSRegister_VALUE = 1;
        public static final int Cmd_CSRemarkUserNickName_VALUE = 182;
        public static final int Cmd_CSRemoveBill_VALUE = 56;
        public static final int Cmd_CSRemoveChatRoomUser_VALUE = 33;
        public static final int Cmd_CSRemoveChatRoom_VALUE = 42;
        public static final int Cmd_CSRemoveFavoriteV2_VALUE = 155;
        public static final int Cmd_CSRemoveFavorite_VALUE = 57;
        public static final int Cmd_CSRemoveFriend_VALUE = 28;
        public static final int Cmd_CSRenameFPokerHistory_VALUE = 163;
        public static final int Cmd_CSRenameFavorite_VALUE = 156;
        public static final int Cmd_CSReportLocationInfo_VALUE = 190;
        public static final int Cmd_CSResetBuyinRatio_VALUE = 149;
        public static final int Cmd_CSResetPwdUploadPhonenumber_VALUE = 65;
        public static final int Cmd_CSResetPwdVerifyCode_VALUE = 66;
        public static final int Cmd_CSReturnGame_VALUE = 171;
        public static final int Cmd_CSSaveFavoriteUrl_VALUE = 68;
        public static final int Cmd_CSSaveFavoriteV2_VALUE = 151;
        public static final int Cmd_CSSaveFavorite_VALUE = 53;
        public static final int Cmd_CSSearchClub_VALUE = 91;
        public static final int Cmd_CSSearchFriend_VALUE = 29;
        public static final int Cmd_CSSearchLeague_VALUE = 194;
        public static final int Cmd_CSSearchUser_VALUE = 121;
        public static final int Cmd_CSSendMsgToAll_VALUE = 72;
        public static final int Cmd_CSSendMsg_VALUE = 21;
        public static final int Cmd_CSSendSystemMsgCMS_VALUE = 143;
        public static final int Cmd_CSSetBannerInfo_VALUE = 118;
        public static final int Cmd_CSSetBuyinControlState_VALUE = 159;
        public static final int Cmd_CSSetChatInfoSetting_VALUE = 70;
        public static final int Cmd_CSSetChatRoomInfo_VALUE = 34;
        public static final int Cmd_CSSetChatRoomUser_VALUE = 31;
        public static final int Cmd_CSSetClubFund_VALUE = 101;
        public static final int Cmd_CSSetClubInfo_VALUE = 94;
        public static final int Cmd_CSSetClubSetting_VALUE = 99;
        public static final int Cmd_CSSetClubUserLevel_VALUE = 95;
        public static final int Cmd_CSSetGameThinkingInterval_VALUE = 208;
        public static final int Cmd_CSSetLeagueSetting_VALUE = 195;
        public static final int Cmd_CSSetRecommendUser_VALUE = 120;
        public static final int Cmd_CSSetStraddle_VALUE = 210;
        public static final int Cmd_CSSetUserInfoNew_VALUE = 181;
        public static final int Cmd_CSSetUserInfoSetting_VALUE = 71;
        public static final int Cmd_CSSetUserInfo_VALUE = 36;
        public static final int Cmd_CSShareFavorite_VALUE = 184;
        public static final int Cmd_CSShareOut_VALUE = 60;
        public static final int Cmd_CSShowCard_VALUE = 122;
        public static final int Cmd_CSShowTableCards_VALUE = 189;
        public static final int Cmd_CSSignUpSNGGameRoom_VALUE = 165;
        public static final int Cmd_CSSitDown_VALUE = 49;
        public static final int Cmd_CSStandUpV3_VALUE = 126;
        public static final int Cmd_CSStandUp_VALUE = 50;
        public static final int Cmd_CSStartGame_VALUE = 62;
        public static final int Cmd_CSStartQuickRoomGame_VALUE = 127;
        public static final int Cmd_CSStopSNGGame_VALUE = 172;
        public static final int Cmd_CSSystemChatRoomMsgRsp_VALUE = 1024;
        public static final int Cmd_CSSystemClubMsgRsp_VALUE = 10090;
        public static final int Cmd_CSSystemFriendMsgRsp_VALUE = 1023;
        public static final int Cmd_CSSystemGameRoomMsgRsp_VALUE = 1025;
        public static final int Cmd_CSSystemLeagueMsgRsp_VALUE = 10201;
        public static final int Cmd_CSSystemMsgRsp_VALUE = 1055;
        public static final int Cmd_CSSystemOfflineGameRoomMsgRsp_VALUE = 1077;
        public static final int Cmd_CSSystemQuickGameRoomMsgRsp_VALUE = 10132;
        public static final int Cmd_CSUnJoinOfflineGameRoom_VALUE = 79;
        public static final int Cmd_CSUpdate_VALUE = 12;
        public static final int Cmd_CSUploadAPNToken_VALUE = 187;
        public static final int Cmd_CSUploadChatRoomIcon_VALUE = 74;
        public static final int Cmd_CSUploadClubCover_VALUE = 97;
        public static final int Cmd_CSUploadClubICon_VALUE = 96;
        public static final int Cmd_CSUploadFriendRelation_VALUE = 8;
        public static final int Cmd_CSUploadIcon_VALUE = 35;
        public static final int Cmd_CSUploadPhoneBook_VALUE = 14;
        public static final int Cmd_CSUploadPhoneNumber_VALUE = 2;
        public static final int Cmd_CSUploadSGScore_VALUE = 104;
        public static final int Cmd_CSUploadUserCover_VALUE = 107;
        public static final int Cmd_CSUploadVerifyCode_VALUE = 3;
        public static final int Cmd_CSUseDelayItem_VALUE = 116;
        public static final int Cmd_CSUseItemPushMsgRsp_VALUE = 1085;
        public static final int Cmd_CSUseItem_VALUE = 84;
        public static final int Cmd_CSUserDelegate_VALUE = 185;
        public static final int Cmd_CSUserInsuranceSetting_VALUE = 177;
        public static final int Cmd_CSWatchSNGGameRoom_VALUE = 166;
        public static final int Cmd_SCAddChatRoomUserRsp_VALUE = 1032;
        public static final int Cmd_SCAddClubFundRsp_VALUE = 10145;
        public static final int Cmd_SCAddClubMaxMemberRsp_VALUE = 10144;
        public static final int Cmd_SCAddFriendRsp_VALUE = 1073;
        public static final int Cmd_SCAddLeagueMaxMemberRsp_VALUE = 10200;
        public static final int Cmd_SCAdminAddClubFundRsp_VALUE = 10135;
        public static final int Cmd_SCAdminAddCoinRsp_VALUE = 10086;
        public static final int Cmd_SCBuyBuyInRsp_VALUE = 1051;
        public static final int Cmd_SCBuyBuyInV2Rsp_VALUE = 10204;
        public static final int Cmd_SCBuyCoinAndroidRsp_VALUE = 10170;
        public static final int Cmd_SCBuyCoinRsp_VALUE = 1044;
        public static final int Cmd_SCBuyInsuranceDelayRsp_VALUE = 10178;
        public static final int Cmd_SCBuyInsuranceRsp_VALUE = 10175;
        public static final int Cmd_SCBuyNicknameRsp_VALUE = 10147;
        public static final int Cmd_SCBuySellingItemRsp_VALUE = 1046;
        public static final int Cmd_SCBuyinActionRsp_VALUE = 10158;
        public static final int Cmd_SCBuyinControlMsg_VALUE = 157;
        public static final int Cmd_SCCancelGameRsp_VALUE = 10188;
        public static final int Cmd_SCCancelOfflineGameRoomRsp_VALUE = 1081;
        public static final int Cmd_SCChangeOfflineGameRoomRsp_VALUE = 1082;
        public static final int Cmd_SCCheckNicknameStatusRsp_VALUE = 10148;
        public static final int Cmd_SCClubActionRsp_VALUE = 10089;
        public static final int Cmd_SCCreateChatRoomRsp_VALUE = 1015;
        public static final int Cmd_SCCreateClubRsp_VALUE = 10087;
        public static final int Cmd_SCCreateGameRoomRsp_VALUE = 1016;
        public static final int Cmd_SCCreateLeagueRsp_VALUE = 10191;
        public static final int Cmd_SCCreateOfflineGameRsp_VALUE = 1076;
        public static final int Cmd_SCCreateQuickGameRoomRsp_VALUE = 10124;
        public static final int Cmd_SCCreateQuickSNGGameRoomRsp_VALUE = 10168;
        public static final int Cmd_SCCreateSNGGameRoomRsp_VALUE = 10164;
        public static final int Cmd_SCCreatorInsuranceSettingRsp_VALUE = 10176;
        public static final int Cmd_SCDeleteClubCoverRsp_VALUE = 10105;
        public static final int Cmd_SCDeleteUserCoverRsp_VALUE = 10108;
        public static final int Cmd_SCEnterClubRsp_VALUE = 10088;
        public static final int Cmd_SCEnterGameRoomRsp_VALUE = 1027;
        public static final int Cmd_SCEnterLeagueRsp_VALUE = 10192;
        public static final int Cmd_SCEnterQuickGameRoomRsp_VALUE = 10125;
        public static final int Cmd_SCFeedbackRsp_VALUE = 1030;
        public static final int Cmd_SCForceBBRsp_VALUE = 10179;
        public static final int Cmd_SCForceStandupRsp_VALUE = 10209;
        public static final int Cmd_SCGameActionRsp_VALUE = 1037;
        public static final int Cmd_SCGameActionV3Rsp_VALUE = 10123;
        public static final int Cmd_SCGameRoomStateChange_VALUE = 38;
        public static final int Cmd_SCGetAllBannerInfoRsp_VALUE = 10117;
        public static final int Cmd_SCGetAllBuyinControlsRsp_VALUE = 10162;
        public static final int Cmd_SCGetAllPokerHistoryRsp_VALUE = 10154;
        public static final int Cmd_SCGetAllRecommendUserInfoRsp_VALUE = 10119;
        public static final int Cmd_SCGetBannerInfosRsp_VALUE = 10134;
        public static final int Cmd_SCGetBenefitsRsp_VALUE = 10140;
        public static final int Cmd_SCGetBillInfoByRoomIDRsp_VALUE = 1075;
        public static final int Cmd_SCGetBillInfosRsp_VALUE = 1052;
        public static final int Cmd_SCGetBillInfosV2Rsp_VALUE = 10207;
        public static final int Cmd_SCGetChatRoomGamesByRoomIDRsp_VALUE = 10110;
        public static final int Cmd_SCGetChatRoomInfoByRoomIDRsp_VALUE = 1018;
        public static final int Cmd_SCGetChatRoomInfosByUuidRsp_VALUE = 1019;
        public static final int Cmd_SCGetChatRoomUsersByRoomIDRsp_VALUE = 10109;
        public static final int Cmd_SCGetClubBaseInfoByClubIDRsp_VALUE = 10113;
        public static final int Cmd_SCGetClubByClubIDRsp_VALUE = 10102;
        public static final int Cmd_SCGetClubGamesByClubIDRsp_VALUE = 10112;
        public static final int Cmd_SCGetClubInfoByUuidRsp_VALUE = 10106;
        public static final int Cmd_SCGetClubSellingItemsRsp_VALUE = 10146;
        public static final int Cmd_SCGetClubUsersByClubIDRsp_VALUE = 10111;
        public static final int Cmd_SCGetClubsByLocationRsp_VALUE = 10092;
        public static final int Cmd_SCGetCoinStoreListRsp_VALUE = 1043;
        public static final int Cmd_SCGetDefaultSettingRsp_VALUE = 1048;
        public static final int Cmd_SCGetFavoriteListRsp_VALUE = 1054;
        public static final int Cmd_SCGetFavoriteListV2Rsp_VALUE = 10152;
        public static final int Cmd_SCGetFestivalModeRsp_VALUE = 10211;
        public static final int Cmd_SCGetFlashPageInfosRsp_VALUE = 10205;
        public static final int Cmd_SCGetFriendStatusRsp_VALUE = 1009;
        public static final int Cmd_SCGetFrontPageInfoRsp_VALUE = 1017;
        public static final int Cmd_SCGetFrontPageInfoV2Rsp_VALUE = 10114;
        public static final int Cmd_SCGetFrontPageInfoV3Rsp_VALUE = 10133;
        public static final int Cmd_SCGetFrontPageInfoV4Rsp_VALUE = 10206;
        public static final int Cmd_SCGetFundBillInfosRsp_VALUE = 10103;
        public static final int Cmd_SCGetGameInfoRsp_VALUE = 1007;
        public static final int Cmd_SCGetGameRoomInfoByRoomIDRsp_VALUE = 1067;
        public static final int Cmd_SCGetGameRoomInfoRsp_VALUE = 1020;
        public static final int Cmd_SCGetGameRoomLeagueClubsRsp_VALUE = 10203;
        public static final int Cmd_SCGetGameSettingRsp_VALUE = 10180;
        public static final int Cmd_SCGetHotClubsRsp_VALUE = 10093;
        public static final int Cmd_SCGetItemListRsp_VALUE = 1047;
        public static final int Cmd_SCGetLastPokerHandResultRsp_VALUE = 10153;
        public static final int Cmd_SCGetLeagueBaseInfoByLeagueIDRsp_VALUE = 10197;
        public static final int Cmd_SCGetLeagueByLeagueIDRsp_VALUE = 10198;
        public static final int Cmd_SCGetLeagueInfoByClubIDRsp_VALUE = 10199;
        public static final int Cmd_SCGetLoginRewardRsp_VALUE = 1059;
        public static final int Cmd_SCGetMyClubsRsp_VALUE = 10098;
        public static final int Cmd_SCGetMyClubsV2Rsp_VALUE = 10202;
        public static final int Cmd_SCGetOfflineOverGameInfoRsp_VALUE = 1083;
        public static final int Cmd_SCGetPokerHandResultByHandIDRsp_VALUE = 10183;
        public static final int Cmd_SCGetQuickGameRoomRsp_VALUE = 10128;
        public static final int Cmd_SCGetRecommendClubsRsp_VALUE = 10115;
        public static final int Cmd_SCGetSellingItemListRsp_VALUE = 1045;
        public static final int Cmd_SCGetSystemMsgByIDCMSRsp_VALUE = 10142;
        public static final int Cmd_SCGetSystemMsgByIDRsp_VALUE = 10139;
        public static final int Cmd_SCGetSystemMsgsByTypeCMSRsp_VALUE = 10141;
        public static final int Cmd_SCGetSystemMsgsRsp_VALUE = 10138;
        public static final int Cmd_SCGetUserBaseInfoRsp_VALUE = 10150;
        public static final int Cmd_SCGetUserGameInfoInRoomRsp_VALUE = 1064;
        public static final int Cmd_SCGetUserInfoRsp_VALUE = 1006;
        public static final int Cmd_SCGetUserInfoV2Rsp_VALUE = 10137;
        public static final int Cmd_SCGiveMoneyPushMsg_VALUE = 130;
        public static final int Cmd_SCGiveMoneyRsp_VALUE = 10129;
        public static final int Cmd_SCHelloGameRsp_VALUE = 10174;
        public static final int Cmd_SCHelloRsp_VALUE = 1011;
        public static final int Cmd_SCInviteActionRsp_VALUE = 1010;
        public static final int Cmd_SCJoinOfflineGameRoomRsp_VALUE = 1078;
        public static final int Cmd_SCKickOffPush_VALUE = 61;
        public static final int Cmd_SCKickUserGameRoomRsp_VALUE = 1041;
        public static final int Cmd_SCKickUserInGameRsp_VALUE = 10186;
        public static final int Cmd_SCLeagueActionRsp_VALUE = 10193;
        public static final int Cmd_SCLeaveChatRoomRsp_VALUE = 1039;
        public static final int Cmd_SCLeaveGameRoomRsp_VALUE = 1040;
        public static final int Cmd_SCLeaveSNGGameRoomRsp_VALUE = 10167;
        public static final int Cmd_SCLoginRewardRsp_VALUE = 1058;
        public static final int Cmd_SCLoginRsp_VALUE = 1005;
        public static final int Cmd_SCLoginThirdPartyRsp_VALUE = 10173;
        public static final int Cmd_SCLoginWeiboRsp_VALUE = 1004;
        public static final int Cmd_SCLogoutRsp_VALUE = 1063;
        public static final int Cmd_SCMiniGameChangeRsp_VALUE = 19001;
        public static final int Cmd_SCMiniGameCheckRsp_VALUE = 19003;
        public static final int Cmd_SCMiniGameDoubleRsp_VALUE = 19002;
        public static final int Cmd_SCMiniGameExitRsp_VALUE = 19004;
        public static final int Cmd_SCMiniGameIniRsp_VALUE = 19005;
        public static final int Cmd_SCMiniGameStartRsp_VALUE = 19000;
        public static final int Cmd_SCOverOfflineGameRoomRsp_VALUE = 1080;
        public static final int Cmd_SCPauseGameRsp_VALUE = 10160;
        public static final int Cmd_SCPreBuyCoinAndroidRsp_VALUE = 10169;
        public static final int Cmd_SCPushMsg_VALUE = 22;
        public static final int Cmd_SCQuickLoginRsp_VALUE = 1013;
        public static final int Cmd_SCQuitClubRsp_VALUE = 10100;
        public static final int Cmd_SCQuitLeagueRsp_VALUE = 10196;
        public static final int Cmd_SCQuitQuickGameRoomRsp_VALUE = 10131;
        public static final int Cmd_SCReconnectRsp_VALUE = 1026;
        public static final int Cmd_SCRegetVerifyCodeRsp_VALUE = 1069;
        public static final int Cmd_SCRegisterRsp_VALUE = 1001;
        public static final int Cmd_SCRemarkUserNickNameRsp_VALUE = 10182;
        public static final int Cmd_SCRemoveBillRsp_VALUE = 1056;
        public static final int Cmd_SCRemoveChatRoomRsp_VALUE = 1042;
        public static final int Cmd_SCRemoveChatRoomUserRsp_VALUE = 1033;
        public static final int Cmd_SCRemoveFavoriteRsp_VALUE = 1057;
        public static final int Cmd_SCRemoveFavoriteV2Rsp_VALUE = 10155;
        public static final int Cmd_SCRemoveFriendRsp_VALUE = 1028;
        public static final int Cmd_SCRenameFPokerHistoryRsp_VALUE = 10163;
        public static final int Cmd_SCRenameFavoriteRsp_VALUE = 10156;
        public static final int Cmd_SCReportLocationInfoRsp_VALUE = 10190;
        public static final int Cmd_SCResetBuyinRatioRsp_VALUE = 10149;
        public static final int Cmd_SCResetPwdUploadPhonenumberRsp_VALUE = 1065;
        public static final int Cmd_SCResetPwdVerifyCodeRsp_VALUE = 1066;
        public static final int Cmd_SCReturnGameRsp_VALUE = 10171;
        public static final int Cmd_SCSaveFavoriteRsp_VALUE = 1053;
        public static final int Cmd_SCSaveFavoriteUrlRsp_VALUE = 1068;
        public static final int Cmd_SCSaveFavoriteV2Rsp_VALUE = 10151;
        public static final int Cmd_SCSearchClubRsp_VALUE = 10091;
        public static final int Cmd_SCSearchFriendRsp_VALUE = 1029;
        public static final int Cmd_SCSearchLeagueRsp_VALUE = 10194;
        public static final int Cmd_SCSearchUserRsp_VALUE = 10121;
        public static final int Cmd_SCSendMsgRsp_VALUE = 1021;
        public static final int Cmd_SCSendMsgToAllRsp_VALUE = 1072;
        public static final int Cmd_SCSendSystemMsgCMSRsp_VALUE = 10143;
        public static final int Cmd_SCSetBannerInfoRsp_VALUE = 10118;
        public static final int Cmd_SCSetBuyinControlStateRsp_VALUE = 10159;
        public static final int Cmd_SCSetChatInfoSettingRsp_VALUE = 1070;
        public static final int Cmd_SCSetChatRoomInfoRsp_VALUE = 1034;
        public static final int Cmd_SCSetChatRoomUserRsp_VALUE = 1031;
        public static final int Cmd_SCSetClubFundRsp_VALUE = 10101;
        public static final int Cmd_SCSetClubInfoRsp_VALUE = 10094;
        public static final int Cmd_SCSetClubSettingRsp_VALUE = 10099;
        public static final int Cmd_SCSetClubUserLevelRsp_VALUE = 10095;
        public static final int Cmd_SCSetGameThinkingIntervalRsp_VALUE = 10208;
        public static final int Cmd_SCSetLeagueSettingRsp_VALUE = 10195;
        public static final int Cmd_SCSetRecommendUserRsp_VALUE = 10120;
        public static final int Cmd_SCSetStraddleRsp_VALUE = 10210;
        public static final int Cmd_SCSetUserInfoNewRsp_VALUE = 10181;
        public static final int Cmd_SCSetUserInfoRsp_VALUE = 1036;
        public static final int Cmd_SCSetUserInfoSettingRsp_VALUE = 1071;
        public static final int Cmd_SCShareFavoriteRsp_VALUE = 10184;
        public static final int Cmd_SCShareOutRsp_VALUE = 1060;
        public static final int Cmd_SCShowCardRsp_VALUE = 10122;
        public static final int Cmd_SCShowTableCardsRsp_VALUE = 10189;
        public static final int Cmd_SCSignUpSNGGameRoomRsp_VALUE = 10165;
        public static final int Cmd_SCSitDownRsp_VALUE = 1049;
        public static final int Cmd_SCStandUpRsp_VALUE = 1050;
        public static final int Cmd_SCStandUpV3Rsp_VALUE = 10126;
        public static final int Cmd_SCStartGameRsp_VALUE = 1062;
        public static final int Cmd_SCStartQuickRoomGameRsp_VALUE = 10127;
        public static final int Cmd_SCStopSNGGameRsp_VALUE = 10172;
        public static final int Cmd_SCSystemChatRoomMsg_VALUE = 24;
        public static final int Cmd_SCSystemClubMsg_VALUE = 90;
        public static final int Cmd_SCSystemFriendMsg_VALUE = 23;
        public static final int Cmd_SCSystemGameRoomMsg_VALUE = 25;
        public static final int Cmd_SCSystemLeagueMsg_VALUE = 201;
        public static final int Cmd_SCSystemMsg_VALUE = 55;
        public static final int Cmd_SCSystemOfflineGameRoomMsg_VALUE = 77;
        public static final int Cmd_SCSystemQuickGameRoomMsg_VALUE = 132;
        public static final int Cmd_SCUnJoinOfflineGameRoomRsp_VALUE = 1079;
        public static final int Cmd_SCUpdateRsp_VALUE = 1012;
        public static final int Cmd_SCUploadAPNTokenRsp_VALUE = 10187;
        public static final int Cmd_SCUploadChatRoomIconRsp_VALUE = 1074;
        public static final int Cmd_SCUploadClubCoverRsp_VALUE = 10097;
        public static final int Cmd_SCUploadClubIConRsp_VALUE = 10096;
        public static final int Cmd_SCUploadFriendRelationRsp_VALUE = 1008;
        public static final int Cmd_SCUploadIconRsp_VALUE = 1035;
        public static final int Cmd_SCUploadPhoneBookRsp_VALUE = 1014;
        public static final int Cmd_SCUploadPhoneNumberRsp_VALUE = 1002;
        public static final int Cmd_SCUploadSGScoreRsp_VALUE = 10104;
        public static final int Cmd_SCUploadUserCoverRsp_VALUE = 10107;
        public static final int Cmd_SCUploadVerifyCodeRsp_VALUE = 1003;
        public static final int Cmd_SCUseDelayItemRsp_VALUE = 10116;
        public static final int Cmd_SCUseItemPushMsg_VALUE = 85;
        public static final int Cmd_SCUseItemRsp_VALUE = 1084;
        public static final int Cmd_SCUserDelegateRsp_VALUE = 10185;
        public static final int Cmd_SCUserInsuranceSettingRsp_VALUE = 10177;
        public static final int Cmd_SCWatchSNGGameRoomRsp_VALUE = 10166;
        private static final TEXAS_CMD[] VALUES = null;
        private static EnumLiteMap<TEXAS_CMD> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD.1 */
        class C00821 implements EnumLiteMap<TEXAS_CMD> {
            static {
                fixHelper.fixfunc(new int[]{18807, 18808});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00821();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{12337, 12338, 12339, 12340});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native TEXAS_CMD(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            Cmd_CSRegister = new TEXAS_CMD("Cmd_CSRegister", 0, 0, Cmd_CSRegister_VALUE);
            Cmd_CSUploadPhoneNumber = new TEXAS_CMD("Cmd_CSUploadPhoneNumber", Cmd_CSRegister_VALUE, Cmd_CSRegister_VALUE, Cmd_CSUploadPhoneNumber_VALUE);
            Cmd_CSUploadVerifyCode = new TEXAS_CMD("Cmd_CSUploadVerifyCode", Cmd_CSUploadPhoneNumber_VALUE, Cmd_CSUploadPhoneNumber_VALUE, Cmd_CSUploadVerifyCode_VALUE);
            Cmd_CSLoginWeibo = new TEXAS_CMD("Cmd_CSLoginWeibo", Cmd_CSUploadVerifyCode_VALUE, Cmd_CSUploadVerifyCode_VALUE, Cmd_CSLoginWeibo_VALUE);
            Cmd_CSLogin = new TEXAS_CMD("Cmd_CSLogin", Cmd_CSLoginWeibo_VALUE, Cmd_CSLoginWeibo_VALUE, Cmd_CSLogin_VALUE);
            Cmd_CSGetUserInfo = new TEXAS_CMD("Cmd_CSGetUserInfo", Cmd_CSLogin_VALUE, Cmd_CSLogin_VALUE, Cmd_CSGetUserInfo_VALUE);
            Cmd_CSGetGameInfo = new TEXAS_CMD("Cmd_CSGetGameInfo", Cmd_CSGetUserInfo_VALUE, Cmd_CSGetUserInfo_VALUE, Cmd_CSGetGameInfo_VALUE);
            Cmd_CSUploadFriendRelation = new TEXAS_CMD("Cmd_CSUploadFriendRelation", Cmd_CSGetGameInfo_VALUE, Cmd_CSGetGameInfo_VALUE, Cmd_CSUploadFriendRelation_VALUE);
            Cmd_CSGetFriendStatus = new TEXAS_CMD("Cmd_CSGetFriendStatus", Cmd_CSUploadFriendRelation_VALUE, Cmd_CSUploadFriendRelation_VALUE, Cmd_CSGetFriendStatus_VALUE);
            Cmd_CSInviteAction = new TEXAS_CMD("Cmd_CSInviteAction", Cmd_CSGetFriendStatus_VALUE, Cmd_CSGetFriendStatus_VALUE, Cmd_CSInviteAction_VALUE);
            Cmd_CSHello = new TEXAS_CMD("Cmd_CSHello", Cmd_CSInviteAction_VALUE, Cmd_CSInviteAction_VALUE, Cmd_CSHello_VALUE);
            Cmd_CSUpdate = new TEXAS_CMD("Cmd_CSUpdate", Cmd_CSHello_VALUE, Cmd_CSHello_VALUE, Cmd_CSUpdate_VALUE);
            Cmd_CSQuickLogin = new TEXAS_CMD("Cmd_CSQuickLogin", Cmd_CSUpdate_VALUE, Cmd_CSUpdate_VALUE, Cmd_CSQuickLogin_VALUE);
            Cmd_CSUploadPhoneBook = new TEXAS_CMD("Cmd_CSUploadPhoneBook", Cmd_CSQuickLogin_VALUE, Cmd_CSQuickLogin_VALUE, Cmd_CSUploadPhoneBook_VALUE);
            Cmd_CSCreateChatRoom = new TEXAS_CMD("Cmd_CSCreateChatRoom", Cmd_CSUploadPhoneBook_VALUE, Cmd_CSUploadPhoneBook_VALUE, Cmd_CSCreateChatRoom_VALUE);
            Cmd_CSCreateGameRoom = new TEXAS_CMD("Cmd_CSCreateGameRoom", Cmd_CSCreateChatRoom_VALUE, Cmd_CSCreateChatRoom_VALUE, Cmd_CSCreateGameRoom_VALUE);
            Cmd_CSGetFrontPageInfo = new TEXAS_CMD("Cmd_CSGetFrontPageInfo", Cmd_CSCreateGameRoom_VALUE, Cmd_CSCreateGameRoom_VALUE, Cmd_CSGetFrontPageInfo_VALUE);
            Cmd_CSGetChatRoomInfoByRoomID = new TEXAS_CMD("Cmd_CSGetChatRoomInfoByRoomID", Cmd_CSGetFrontPageInfo_VALUE, Cmd_CSGetFrontPageInfo_VALUE, Cmd_CSGetChatRoomInfoByRoomID_VALUE);
            Cmd_CSGetChatRoomInfosByUuid = new TEXAS_CMD("Cmd_CSGetChatRoomInfosByUuid", Cmd_CSGetChatRoomInfoByRoomID_VALUE, Cmd_CSGetChatRoomInfoByRoomID_VALUE, Cmd_CSGetChatRoomInfosByUuid_VALUE);
            Cmd_CSGetGameRoomInfo = new TEXAS_CMD("Cmd_CSGetGameRoomInfo", Cmd_CSGetChatRoomInfosByUuid_VALUE, Cmd_CSGetChatRoomInfosByUuid_VALUE, Cmd_CSGetGameRoomInfo_VALUE);
            Cmd_CSSendMsg = new TEXAS_CMD("Cmd_CSSendMsg", Cmd_CSGetGameRoomInfo_VALUE, Cmd_CSGetGameRoomInfo_VALUE, Cmd_CSSendMsg_VALUE);
            Cmd_SCPushMsg = new TEXAS_CMD("Cmd_SCPushMsg", Cmd_CSSendMsg_VALUE, Cmd_CSSendMsg_VALUE, Cmd_SCPushMsg_VALUE);
            Cmd_SCSystemFriendMsg = new TEXAS_CMD("Cmd_SCSystemFriendMsg", Cmd_SCPushMsg_VALUE, Cmd_SCPushMsg_VALUE, Cmd_SCSystemFriendMsg_VALUE);
            Cmd_SCSystemChatRoomMsg = new TEXAS_CMD("Cmd_SCSystemChatRoomMsg", Cmd_SCSystemFriendMsg_VALUE, Cmd_SCSystemFriendMsg_VALUE, Cmd_SCSystemChatRoomMsg_VALUE);
            Cmd_SCSystemGameRoomMsg = new TEXAS_CMD("Cmd_SCSystemGameRoomMsg", Cmd_SCSystemChatRoomMsg_VALUE, Cmd_SCSystemChatRoomMsg_VALUE, Cmd_SCSystemGameRoomMsg_VALUE);
            Cmd_CSReconnect = new TEXAS_CMD("Cmd_CSReconnect", Cmd_SCSystemGameRoomMsg_VALUE, Cmd_SCSystemGameRoomMsg_VALUE, Cmd_CSReconnect_VALUE);
            Cmd_CSEnterGameRoom = new TEXAS_CMD("Cmd_CSEnterGameRoom", Cmd_CSReconnect_VALUE, Cmd_CSReconnect_VALUE, Cmd_CSEnterGameRoom_VALUE);
            Cmd_CSRemoveFriend = new TEXAS_CMD("Cmd_CSRemoveFriend", Cmd_CSEnterGameRoom_VALUE, Cmd_CSEnterGameRoom_VALUE, Cmd_CSRemoveFriend_VALUE);
            Cmd_CSSearchFriend = new TEXAS_CMD("Cmd_CSSearchFriend", Cmd_CSRemoveFriend_VALUE, Cmd_CSRemoveFriend_VALUE, Cmd_CSSearchFriend_VALUE);
            Cmd_CSFeedback = new TEXAS_CMD("Cmd_CSFeedback", Cmd_CSSearchFriend_VALUE, Cmd_CSSearchFriend_VALUE, Cmd_CSFeedback_VALUE);
            Cmd_CSSetChatRoomUser = new TEXAS_CMD("Cmd_CSSetChatRoomUser", Cmd_CSFeedback_VALUE, Cmd_CSFeedback_VALUE, Cmd_CSSetChatRoomUser_VALUE);
            Cmd_CSAddChatRoomUser = new TEXAS_CMD("Cmd_CSAddChatRoomUser", Cmd_CSSetChatRoomUser_VALUE, Cmd_CSSetChatRoomUser_VALUE, Cmd_CSAddChatRoomUser_VALUE);
            Cmd_CSRemoveChatRoomUser = new TEXAS_CMD("Cmd_CSRemoveChatRoomUser", Cmd_CSAddChatRoomUser_VALUE, Cmd_CSAddChatRoomUser_VALUE, Cmd_CSRemoveChatRoomUser_VALUE);
            Cmd_CSSetChatRoomInfo = new TEXAS_CMD("Cmd_CSSetChatRoomInfo", Cmd_CSRemoveChatRoomUser_VALUE, Cmd_CSRemoveChatRoomUser_VALUE, Cmd_CSSetChatRoomInfo_VALUE);
            Cmd_CSUploadIcon = new TEXAS_CMD("Cmd_CSUploadIcon", Cmd_CSSetChatRoomInfo_VALUE, Cmd_CSSetChatRoomInfo_VALUE, Cmd_CSUploadIcon_VALUE);
            Cmd_CSSetUserInfo = new TEXAS_CMD("Cmd_CSSetUserInfo", Cmd_CSUploadIcon_VALUE, Cmd_CSUploadIcon_VALUE, Cmd_CSSetUserInfo_VALUE);
            Cmd_CSGameAction = new TEXAS_CMD("Cmd_CSGameAction", Cmd_CSSetUserInfo_VALUE, Cmd_CSSetUserInfo_VALUE, Cmd_CSGameAction_VALUE);
            Cmd_SCGameRoomStateChange = new TEXAS_CMD("Cmd_SCGameRoomStateChange", Cmd_CSGameAction_VALUE, Cmd_CSGameAction_VALUE, Cmd_SCGameRoomStateChange_VALUE);
            Cmd_CSLeaveChatRoom = new TEXAS_CMD("Cmd_CSLeaveChatRoom", Cmd_SCGameRoomStateChange_VALUE, Cmd_SCGameRoomStateChange_VALUE, Cmd_CSLeaveChatRoom_VALUE);
            Cmd_CSLeaveGameRoom = new TEXAS_CMD("Cmd_CSLeaveGameRoom", Cmd_CSLeaveChatRoom_VALUE, Cmd_CSLeaveChatRoom_VALUE, Cmd_CSLeaveGameRoom_VALUE);
            Cmd_CSKickUserGameRoom = new TEXAS_CMD("Cmd_CSKickUserGameRoom", Cmd_CSLeaveGameRoom_VALUE, Cmd_CSLeaveGameRoom_VALUE, Cmd_CSKickUserGameRoom_VALUE);
            Cmd_CSRemoveChatRoom = new TEXAS_CMD("Cmd_CSRemoveChatRoom", Cmd_CSKickUserGameRoom_VALUE, Cmd_CSKickUserGameRoom_VALUE, Cmd_CSRemoveChatRoom_VALUE);
            Cmd_CSGetCoinStoreList = new TEXAS_CMD("Cmd_CSGetCoinStoreList", Cmd_CSRemoveChatRoom_VALUE, Cmd_CSRemoveChatRoom_VALUE, Cmd_CSGetCoinStoreList_VALUE);
            Cmd_CSBuyCoin = new TEXAS_CMD("Cmd_CSBuyCoin", Cmd_CSGetCoinStoreList_VALUE, Cmd_CSGetCoinStoreList_VALUE, Cmd_CSBuyCoin_VALUE);
            Cmd_CSGetSellingItemList = new TEXAS_CMD("Cmd_CSGetSellingItemList", Cmd_CSBuyCoin_VALUE, Cmd_CSBuyCoin_VALUE, Cmd_CSGetSellingItemList_VALUE);
            Cmd_CSBuySellingItem = new TEXAS_CMD("Cmd_CSBuySellingItem", Cmd_CSGetSellingItemList_VALUE, Cmd_CSGetSellingItemList_VALUE, Cmd_CSBuySellingItem_VALUE);
            Cmd_CSGetItemList = new TEXAS_CMD("Cmd_CSGetItemList", Cmd_CSBuySellingItem_VALUE, Cmd_CSBuySellingItem_VALUE, Cmd_CSGetItemList_VALUE);
            Cmd_CSGetDefaultSetting = new TEXAS_CMD("Cmd_CSGetDefaultSetting", Cmd_CSGetItemList_VALUE, Cmd_CSGetItemList_VALUE, Cmd_CSGetDefaultSetting_VALUE);
            Cmd_CSSitDown = new TEXAS_CMD("Cmd_CSSitDown", Cmd_CSGetDefaultSetting_VALUE, Cmd_CSGetDefaultSetting_VALUE, Cmd_CSSitDown_VALUE);
            Cmd_CSStandUp = new TEXAS_CMD("Cmd_CSStandUp", Cmd_CSSitDown_VALUE, Cmd_CSSitDown_VALUE, Cmd_CSStandUp_VALUE);
            Cmd_CSBuyBuyIn = new TEXAS_CMD("Cmd_CSBuyBuyIn", Cmd_CSStandUp_VALUE, Cmd_CSStandUp_VALUE, Cmd_CSBuyBuyIn_VALUE);
            Cmd_CSGetBillInfos = new TEXAS_CMD("Cmd_CSGetBillInfos", Cmd_CSBuyBuyIn_VALUE, Cmd_CSBuyBuyIn_VALUE, Cmd_CSGetBillInfos_VALUE);
            Cmd_CSSaveFavorite = new TEXAS_CMD("Cmd_CSSaveFavorite", Cmd_CSGetBillInfos_VALUE, Cmd_CSGetBillInfos_VALUE, Cmd_CSSaveFavorite_VALUE);
            Cmd_CSGetFavoriteList = new TEXAS_CMD("Cmd_CSGetFavoriteList", Cmd_CSSaveFavorite_VALUE, Cmd_CSSaveFavorite_VALUE, Cmd_CSGetFavoriteList_VALUE);
            Cmd_SCSystemMsg = new TEXAS_CMD("Cmd_SCSystemMsg", Cmd_CSGetFavoriteList_VALUE, Cmd_CSGetFavoriteList_VALUE, Cmd_SCSystemMsg_VALUE);
            Cmd_CSRemoveBill = new TEXAS_CMD("Cmd_CSRemoveBill", Cmd_SCSystemMsg_VALUE, Cmd_SCSystemMsg_VALUE, Cmd_CSRemoveBill_VALUE);
            Cmd_CSRemoveFavorite = new TEXAS_CMD("Cmd_CSRemoveFavorite", Cmd_CSRemoveBill_VALUE, Cmd_CSRemoveBill_VALUE, Cmd_CSRemoveFavorite_VALUE);
            Cmd_CSLoginReward = new TEXAS_CMD("Cmd_CSLoginReward", Cmd_CSRemoveFavorite_VALUE, Cmd_CSRemoveFavorite_VALUE, Cmd_CSLoginReward_VALUE);
            Cmd_CSGetLoginReward = new TEXAS_CMD("Cmd_CSGetLoginReward", Cmd_CSLoginReward_VALUE, Cmd_CSLoginReward_VALUE, Cmd_CSGetLoginReward_VALUE);
            Cmd_CSShareOut = new TEXAS_CMD("Cmd_CSShareOut", Cmd_CSGetLoginReward_VALUE, Cmd_CSGetLoginReward_VALUE, Cmd_CSShareOut_VALUE);
            Cmd_SCKickOffPush = new TEXAS_CMD("Cmd_SCKickOffPush", Cmd_CSShareOut_VALUE, Cmd_CSShareOut_VALUE, Cmd_SCKickOffPush_VALUE);
            Cmd_CSStartGame = new TEXAS_CMD("Cmd_CSStartGame", Cmd_SCKickOffPush_VALUE, Cmd_SCKickOffPush_VALUE, Cmd_CSStartGame_VALUE);
            Cmd_CSLogout = new TEXAS_CMD("Cmd_CSLogout", Cmd_CSStartGame_VALUE, Cmd_CSStartGame_VALUE, Cmd_CSLogout_VALUE);
            Cmd_CSGetUserGameInfoInRoom = new TEXAS_CMD("Cmd_CSGetUserGameInfoInRoom", Cmd_CSLogout_VALUE, Cmd_CSLogout_VALUE, Cmd_CSGetUserGameInfoInRoom_VALUE);
            Cmd_CSResetPwdUploadPhonenumber = new TEXAS_CMD("Cmd_CSResetPwdUploadPhonenumber", Cmd_CSGetUserGameInfoInRoom_VALUE, Cmd_CSGetUserGameInfoInRoom_VALUE, Cmd_CSResetPwdUploadPhonenumber_VALUE);
            Cmd_CSResetPwdVerifyCode = new TEXAS_CMD("Cmd_CSResetPwdVerifyCode", Cmd_CSResetPwdUploadPhonenumber_VALUE, Cmd_CSResetPwdUploadPhonenumber_VALUE, Cmd_CSResetPwdVerifyCode_VALUE);
            Cmd_CSGetGameRoomInfoByRoomID = new TEXAS_CMD("Cmd_CSGetGameRoomInfoByRoomID", Cmd_CSResetPwdVerifyCode_VALUE, Cmd_CSResetPwdVerifyCode_VALUE, Cmd_CSGetGameRoomInfoByRoomID_VALUE);
            Cmd_CSSaveFavoriteUrl = new TEXAS_CMD("Cmd_CSSaveFavoriteUrl", Cmd_CSGetGameRoomInfoByRoomID_VALUE, Cmd_CSGetGameRoomInfoByRoomID_VALUE, Cmd_CSSaveFavoriteUrl_VALUE);
            Cmd_CSRegetVerifyCode = new TEXAS_CMD("Cmd_CSRegetVerifyCode", Cmd_CSSaveFavoriteUrl_VALUE, Cmd_CSSaveFavoriteUrl_VALUE, Cmd_CSRegetVerifyCode_VALUE);
            Cmd_CSSetChatInfoSetting = new TEXAS_CMD("Cmd_CSSetChatInfoSetting", Cmd_CSRegetVerifyCode_VALUE, Cmd_CSRegetVerifyCode_VALUE, Cmd_CSSetChatInfoSetting_VALUE);
            Cmd_CSSetUserInfoSetting = new TEXAS_CMD("Cmd_CSSetUserInfoSetting", Cmd_CSSetChatInfoSetting_VALUE, Cmd_CSSetChatInfoSetting_VALUE, Cmd_CSSetUserInfoSetting_VALUE);
            Cmd_CSSendMsgToAll = new TEXAS_CMD("Cmd_CSSendMsgToAll", Cmd_CSSetUserInfoSetting_VALUE, Cmd_CSSetUserInfoSetting_VALUE, Cmd_CSSendMsgToAll_VALUE);
            Cmd_CSAddFriend = new TEXAS_CMD("Cmd_CSAddFriend", Cmd_CSSendMsgToAll_VALUE, Cmd_CSSendMsgToAll_VALUE, Cmd_CSAddFriend_VALUE);
            Cmd_CSUploadChatRoomIcon = new TEXAS_CMD("Cmd_CSUploadChatRoomIcon", Cmd_CSAddFriend_VALUE, Cmd_CSAddFriend_VALUE, Cmd_CSUploadChatRoomIcon_VALUE);
            Cmd_CSGetBillInfoByRoomID = new TEXAS_CMD("Cmd_CSGetBillInfoByRoomID", Cmd_CSUploadChatRoomIcon_VALUE, Cmd_CSUploadChatRoomIcon_VALUE, Cmd_CSGetBillInfoByRoomID_VALUE);
            Cmd_CSCreateOfflineGame = new TEXAS_CMD("Cmd_CSCreateOfflineGame", Cmd_CSGetBillInfoByRoomID_VALUE, Cmd_CSGetBillInfoByRoomID_VALUE, Cmd_CSCreateOfflineGame_VALUE);
            Cmd_SCSystemOfflineGameRoomMsg = new TEXAS_CMD("Cmd_SCSystemOfflineGameRoomMsg", Cmd_CSCreateOfflineGame_VALUE, Cmd_CSCreateOfflineGame_VALUE, Cmd_SCSystemOfflineGameRoomMsg_VALUE);
            Cmd_CSJoinOfflineGameRoom = new TEXAS_CMD("Cmd_CSJoinOfflineGameRoom", Cmd_SCSystemOfflineGameRoomMsg_VALUE, Cmd_SCSystemOfflineGameRoomMsg_VALUE, Cmd_CSJoinOfflineGameRoom_VALUE);
            Cmd_CSUnJoinOfflineGameRoom = new TEXAS_CMD("Cmd_CSUnJoinOfflineGameRoom", Cmd_CSJoinOfflineGameRoom_VALUE, Cmd_CSJoinOfflineGameRoom_VALUE, Cmd_CSUnJoinOfflineGameRoom_VALUE);
            Cmd_CSOverOfflineGameRoom = new TEXAS_CMD("Cmd_CSOverOfflineGameRoom", Cmd_CSUnJoinOfflineGameRoom_VALUE, Cmd_CSUnJoinOfflineGameRoom_VALUE, Cmd_CSOverOfflineGameRoom_VALUE);
            Cmd_CSCancelOfflineGameRoom = new TEXAS_CMD("Cmd_CSCancelOfflineGameRoom", Cmd_CSOverOfflineGameRoom_VALUE, Cmd_CSOverOfflineGameRoom_VALUE, Cmd_CSCancelOfflineGameRoom_VALUE);
            Cmd_CSChangeOfflineGameRoom = new TEXAS_CMD("Cmd_CSChangeOfflineGameRoom", Cmd_CSCancelOfflineGameRoom_VALUE, Cmd_CSCancelOfflineGameRoom_VALUE, Cmd_CSChangeOfflineGameRoom_VALUE);
            Cmd_CSGetOfflineOverGameInfo = new TEXAS_CMD("Cmd_CSGetOfflineOverGameInfo", Cmd_CSChangeOfflineGameRoom_VALUE, Cmd_CSChangeOfflineGameRoom_VALUE, Cmd_CSGetOfflineOverGameInfo_VALUE);
            Cmd_CSUseItem = new TEXAS_CMD("Cmd_CSUseItem", Cmd_CSGetOfflineOverGameInfo_VALUE, Cmd_CSGetOfflineOverGameInfo_VALUE, Cmd_CSUseItem_VALUE);
            Cmd_SCUseItemPushMsg = new TEXAS_CMD("Cmd_SCUseItemPushMsg", Cmd_CSUseItem_VALUE, Cmd_CSUseItem_VALUE, Cmd_SCUseItemPushMsg_VALUE);
            Cmd_CSAdminAddCoin = new TEXAS_CMD("Cmd_CSAdminAddCoin", Cmd_SCUseItemPushMsg_VALUE, Cmd_SCUseItemPushMsg_VALUE, Cmd_CSAdminAddCoin_VALUE);
            Cmd_CSCreateClub = new TEXAS_CMD("Cmd_CSCreateClub", Cmd_CSAdminAddCoin_VALUE, Cmd_CSAdminAddCoin_VALUE, Cmd_CSCreateClub_VALUE);
            Cmd_CSEnterClub = new TEXAS_CMD("Cmd_CSEnterClub", Cmd_CSCreateClub_VALUE, Cmd_CSCreateClub_VALUE, Cmd_CSEnterClub_VALUE);
            Cmd_CSClubAction = new TEXAS_CMD("Cmd_CSClubAction", Cmd_CSEnterClub_VALUE, Cmd_CSEnterClub_VALUE, Cmd_CSClubAction_VALUE);
            Cmd_SCSystemClubMsg = new TEXAS_CMD("Cmd_SCSystemClubMsg", Cmd_CSClubAction_VALUE, Cmd_CSClubAction_VALUE, Cmd_SCSystemClubMsg_VALUE);
            Cmd_CSSearchClub = new TEXAS_CMD("Cmd_CSSearchClub", Cmd_SCSystemClubMsg_VALUE, Cmd_SCSystemClubMsg_VALUE, Cmd_CSSearchClub_VALUE);
            Cmd_CSGetClubsByLocation = new TEXAS_CMD("Cmd_CSGetClubsByLocation", Cmd_CSSearchClub_VALUE, Cmd_CSSearchClub_VALUE, Cmd_CSGetClubsByLocation_VALUE);
            Cmd_CSGetHotClubs = new TEXAS_CMD("Cmd_CSGetHotClubs", Cmd_CSGetClubsByLocation_VALUE, Cmd_CSGetClubsByLocation_VALUE, Cmd_CSGetHotClubs_VALUE);
            Cmd_CSSetClubInfo = new TEXAS_CMD("Cmd_CSSetClubInfo", Cmd_CSGetHotClubs_VALUE, Cmd_CSGetHotClubs_VALUE, Cmd_CSSetClubInfo_VALUE);
            Cmd_CSSetClubUserLevel = new TEXAS_CMD("Cmd_CSSetClubUserLevel", Cmd_CSSetClubInfo_VALUE, Cmd_CSSetClubInfo_VALUE, Cmd_CSSetClubUserLevel_VALUE);
            Cmd_CSUploadClubICon = new TEXAS_CMD("Cmd_CSUploadClubICon", Cmd_CSSetClubUserLevel_VALUE, Cmd_CSSetClubUserLevel_VALUE, Cmd_CSUploadClubICon_VALUE);
            Cmd_CSUploadClubCover = new TEXAS_CMD("Cmd_CSUploadClubCover", Cmd_CSUploadClubICon_VALUE, Cmd_CSUploadClubICon_VALUE, Cmd_CSUploadClubCover_VALUE);
            Cmd_CSGetMyClubs = new TEXAS_CMD("Cmd_CSGetMyClubs", Cmd_CSUploadClubCover_VALUE, Cmd_CSUploadClubCover_VALUE, Cmd_CSGetMyClubs_VALUE);
            Cmd_CSSetClubSetting = new TEXAS_CMD("Cmd_CSSetClubSetting", Cmd_CSGetMyClubs_VALUE, Cmd_CSGetMyClubs_VALUE, Cmd_CSSetClubSetting_VALUE);
            Cmd_CSQuitClub = new TEXAS_CMD("Cmd_CSQuitClub", Cmd_CSSetClubSetting_VALUE, Cmd_CSSetClubSetting_VALUE, Cmd_CSQuitClub_VALUE);
            Cmd_CSSetClubFund = new TEXAS_CMD("Cmd_CSSetClubFund", Cmd_CSQuitClub_VALUE, Cmd_CSQuitClub_VALUE, Cmd_CSSetClubFund_VALUE);
            Cmd_CSGetClubByClubID = new TEXAS_CMD("Cmd_CSGetClubByClubID", Cmd_CSSetClubFund_VALUE, Cmd_CSSetClubFund_VALUE, Cmd_CSGetClubByClubID_VALUE);
            Cmd_CSGetFundBillInfos = new TEXAS_CMD("Cmd_CSGetFundBillInfos", Cmd_CSGetClubByClubID_VALUE, Cmd_CSGetClubByClubID_VALUE, Cmd_CSGetFundBillInfos_VALUE);
            Cmd_CSUploadSGScore = new TEXAS_CMD("Cmd_CSUploadSGScore", Cmd_CSGetFundBillInfos_VALUE, Cmd_CSGetFundBillInfos_VALUE, Cmd_CSUploadSGScore_VALUE);
            Cmd_CSDeleteClubCover = new TEXAS_CMD("Cmd_CSDeleteClubCover", Cmd_CSUploadSGScore_VALUE, Cmd_CSUploadSGScore_VALUE, Cmd_CSDeleteClubCover_VALUE);
            Cmd_CSGetClubInfoByUuid = new TEXAS_CMD("Cmd_CSGetClubInfoByUuid", Cmd_CSDeleteClubCover_VALUE, Cmd_CSDeleteClubCover_VALUE, Cmd_CSGetClubInfoByUuid_VALUE);
            Cmd_CSUploadUserCover = new TEXAS_CMD("Cmd_CSUploadUserCover", Cmd_CSGetClubInfoByUuid_VALUE, Cmd_CSGetClubInfoByUuid_VALUE, Cmd_CSUploadUserCover_VALUE);
            Cmd_CSDeleteUserCover = new TEXAS_CMD("Cmd_CSDeleteUserCover", Cmd_CSUploadUserCover_VALUE, Cmd_CSUploadUserCover_VALUE, Cmd_CSDeleteUserCover_VALUE);
            Cmd_CSGetChatRoomUsersByRoomID = new TEXAS_CMD("Cmd_CSGetChatRoomUsersByRoomID", Cmd_CSDeleteUserCover_VALUE, Cmd_CSDeleteUserCover_VALUE, Cmd_CSGetChatRoomUsersByRoomID_VALUE);
            Cmd_CSGetChatRoomGamesByRoomID = new TEXAS_CMD("Cmd_CSGetChatRoomGamesByRoomID", Cmd_CSGetChatRoomUsersByRoomID_VALUE, Cmd_CSGetChatRoomUsersByRoomID_VALUE, Cmd_CSGetChatRoomGamesByRoomID_VALUE);
            Cmd_CSGetClubUsersByClubID = new TEXAS_CMD("Cmd_CSGetClubUsersByClubID", Cmd_CSGetChatRoomGamesByRoomID_VALUE, Cmd_CSGetChatRoomGamesByRoomID_VALUE, Cmd_CSGetClubUsersByClubID_VALUE);
            Cmd_CSGetClubGamesByClubID = new TEXAS_CMD("Cmd_CSGetClubGamesByClubID", Cmd_CSGetClubUsersByClubID_VALUE, Cmd_CSGetClubUsersByClubID_VALUE, Cmd_CSGetClubGamesByClubID_VALUE);
            Cmd_CSGetClubBaseInfoByClubID = new TEXAS_CMD("Cmd_CSGetClubBaseInfoByClubID", Cmd_CSGetClubGamesByClubID_VALUE, Cmd_CSGetClubGamesByClubID_VALUE, Cmd_CSGetClubBaseInfoByClubID_VALUE);
            Cmd_CSGetFrontPageInfoV2 = new TEXAS_CMD("Cmd_CSGetFrontPageInfoV2", Cmd_CSGetClubBaseInfoByClubID_VALUE, Cmd_CSGetClubBaseInfoByClubID_VALUE, Cmd_CSGetFrontPageInfoV2_VALUE);
            Cmd_CSGetRecommendClubs = new TEXAS_CMD("Cmd_CSGetRecommendClubs", Cmd_CSGetFrontPageInfoV2_VALUE, Cmd_CSGetFrontPageInfoV2_VALUE, Cmd_CSGetRecommendClubs_VALUE);
            Cmd_CSUseDelayItem = new TEXAS_CMD("Cmd_CSUseDelayItem", Cmd_CSGetRecommendClubs_VALUE, Cmd_CSGetRecommendClubs_VALUE, Cmd_CSUseDelayItem_VALUE);
            Cmd_CSGetAllBannerInfo = new TEXAS_CMD("Cmd_CSGetAllBannerInfo", Cmd_CSUseDelayItem_VALUE, Cmd_CSUseDelayItem_VALUE, Cmd_CSGetAllBannerInfo_VALUE);
            Cmd_CSSetBannerInfo = new TEXAS_CMD("Cmd_CSSetBannerInfo", Cmd_CSGetAllBannerInfo_VALUE, Cmd_CSGetAllBannerInfo_VALUE, Cmd_CSSetBannerInfo_VALUE);
            Cmd_CSGetAllRecommendUserInfo = new TEXAS_CMD("Cmd_CSGetAllRecommendUserInfo", Cmd_CSSetBannerInfo_VALUE, Cmd_CSSetBannerInfo_VALUE, Cmd_CSGetAllRecommendUserInfo_VALUE);
            Cmd_CSSetRecommendUser = new TEXAS_CMD("Cmd_CSSetRecommendUser", Cmd_CSGetAllRecommendUserInfo_VALUE, Cmd_CSGetAllRecommendUserInfo_VALUE, Cmd_CSSetRecommendUser_VALUE);
            Cmd_CSSearchUser = new TEXAS_CMD("Cmd_CSSearchUser", Cmd_CSSetRecommendUser_VALUE, Cmd_CSSetRecommendUser_VALUE, Cmd_CSSearchUser_VALUE);
            Cmd_CSShowCard = new TEXAS_CMD("Cmd_CSShowCard", Cmd_CSSearchUser_VALUE, Cmd_CSSearchUser_VALUE, Cmd_CSShowCard_VALUE);
            Cmd_CSGameActionV3 = new TEXAS_CMD("Cmd_CSGameActionV3", Cmd_CSShowCard_VALUE, Cmd_CSShowCard_VALUE, Cmd_CSGameActionV3_VALUE);
            Cmd_CSCreateQuickGameRoom = new TEXAS_CMD("Cmd_CSCreateQuickGameRoom", Cmd_CSGameActionV3_VALUE, Cmd_CSGameActionV3_VALUE, Cmd_CSCreateQuickGameRoom_VALUE);
            Cmd_CSEnterQuickGameRoom = new TEXAS_CMD("Cmd_CSEnterQuickGameRoom", Cmd_CSCreateQuickGameRoom_VALUE, Cmd_CSCreateQuickGameRoom_VALUE, Cmd_CSEnterQuickGameRoom_VALUE);
            Cmd_CSStandUpV3 = new TEXAS_CMD("Cmd_CSStandUpV3", Cmd_CSEnterQuickGameRoom_VALUE, Cmd_CSEnterQuickGameRoom_VALUE, Cmd_CSStandUpV3_VALUE);
            Cmd_CSStartQuickRoomGame = new TEXAS_CMD("Cmd_CSStartQuickRoomGame", Cmd_CSStandUpV3_VALUE, Cmd_CSStandUpV3_VALUE, Cmd_CSStartQuickRoomGame_VALUE);
            Cmd_CSGetQuickGameRoom = new TEXAS_CMD("Cmd_CSGetQuickGameRoom", Cmd_CSStartQuickRoomGame_VALUE, Cmd_CSStartQuickRoomGame_VALUE, Cmd_CSGetQuickGameRoom_VALUE);
            Cmd_CSGiveMoney = new TEXAS_CMD("Cmd_CSGiveMoney", Cmd_CSGetQuickGameRoom_VALUE, Cmd_CSGetQuickGameRoom_VALUE, Cmd_CSGiveMoney_VALUE);
            Cmd_SCGiveMoneyPushMsg = new TEXAS_CMD("Cmd_SCGiveMoneyPushMsg", Cmd_CSGiveMoney_VALUE, Cmd_CSGiveMoney_VALUE, Cmd_SCGiveMoneyPushMsg_VALUE);
            Cmd_CSQuitQuickGameRoom = new TEXAS_CMD("Cmd_CSQuitQuickGameRoom", Cmd_SCGiveMoneyPushMsg_VALUE, Cmd_SCGiveMoneyPushMsg_VALUE, Cmd_CSQuitQuickGameRoom_VALUE);
            Cmd_SCSystemQuickGameRoomMsg = new TEXAS_CMD("Cmd_SCSystemQuickGameRoomMsg", Cmd_CSQuitQuickGameRoom_VALUE, Cmd_CSQuitQuickGameRoom_VALUE, Cmd_SCSystemQuickGameRoomMsg_VALUE);
            Cmd_CSGetFrontPageInfoV3 = new TEXAS_CMD("Cmd_CSGetFrontPageInfoV3", Cmd_SCSystemQuickGameRoomMsg_VALUE, Cmd_SCSystemQuickGameRoomMsg_VALUE, Cmd_CSGetFrontPageInfoV3_VALUE);
            Cmd_CSGetBannerInfos = new TEXAS_CMD("Cmd_CSGetBannerInfos", Cmd_CSGetFrontPageInfoV3_VALUE, Cmd_CSGetFrontPageInfoV3_VALUE, Cmd_CSGetBannerInfos_VALUE);
            Cmd_CSAdminAddClubFund = new TEXAS_CMD("Cmd_CSAdminAddClubFund", Cmd_CSGetBannerInfos_VALUE, Cmd_CSGetBannerInfos_VALUE, Cmd_CSAdminAddClubFund_VALUE);
            Cmd_CSGetUserInfoV2 = new TEXAS_CMD("Cmd_CSGetUserInfoV2", Cmd_CSAdminAddClubFund_VALUE, Cmd_CSAdminAddClubFund_VALUE, Cmd_CSGetUserInfoV2_VALUE);
            Cmd_CSGetSystemMsgs = new TEXAS_CMD("Cmd_CSGetSystemMsgs", 136, 136, Cmd_CSGetSystemMsgs_VALUE);
            Cmd_CSGetSystemMsgByID = new TEXAS_CMD("Cmd_CSGetSystemMsgByID", Cmd_CSGetUserInfoV2_VALUE, Cmd_CSGetUserInfoV2_VALUE, Cmd_CSGetSystemMsgByID_VALUE);
            Cmd_CSGetBenefits = new TEXAS_CMD("Cmd_CSGetBenefits", Cmd_CSGetSystemMsgs_VALUE, Cmd_CSGetSystemMsgs_VALUE, Cmd_CSGetBenefits_VALUE);
            Cmd_CSGetSystemMsgByTypeCMS = new TEXAS_CMD("Cmd_CSGetSystemMsgByTypeCMS", Cmd_CSGetSystemMsgByID_VALUE, Cmd_CSGetSystemMsgByID_VALUE, Cmd_CSGetSystemMsgByTypeCMS_VALUE);
            Cmd_CSGetSystemMsgByIDCMS = new TEXAS_CMD("Cmd_CSGetSystemMsgByIDCMS", Cmd_CSGetBenefits_VALUE, Cmd_CSGetBenefits_VALUE, Cmd_CSGetSystemMsgByIDCMS_VALUE);
            Cmd_CSSendSystemMsgCMS = new TEXAS_CMD("Cmd_CSSendSystemMsgCMS", Cmd_CSGetSystemMsgByTypeCMS_VALUE, Cmd_CSGetSystemMsgByTypeCMS_VALUE, Cmd_CSSendSystemMsgCMS_VALUE);
            Cmd_CSAddClubMaxMember = new TEXAS_CMD("Cmd_CSAddClubMaxMember", Cmd_CSGetSystemMsgByIDCMS_VALUE, Cmd_CSGetSystemMsgByIDCMS_VALUE, Cmd_CSAddClubMaxMember_VALUE);
            Cmd_CSAddClubFund = new TEXAS_CMD("Cmd_CSAddClubFund", Cmd_CSSendSystemMsgCMS_VALUE, Cmd_CSSendSystemMsgCMS_VALUE, Cmd_CSAddClubFund_VALUE);
            Cmd_CSGetClubSellingItems = new TEXAS_CMD("Cmd_CSGetClubSellingItems", Cmd_CSAddClubMaxMember_VALUE, Cmd_CSAddClubMaxMember_VALUE, Cmd_CSGetClubSellingItems_VALUE);
            Cmd_CSBuyNickname = new TEXAS_CMD("Cmd_CSBuyNickname", Cmd_CSAddClubFund_VALUE, Cmd_CSAddClubFund_VALUE, Cmd_CSBuyNickname_VALUE);
            Cmd_CSCheckNicknameStatus = new TEXAS_CMD("Cmd_CSCheckNicknameStatus", Cmd_CSGetClubSellingItems_VALUE, Cmd_CSGetClubSellingItems_VALUE, Cmd_CSCheckNicknameStatus_VALUE);
            Cmd_CSResetBuyinRatio = new TEXAS_CMD("Cmd_CSResetBuyinRatio", Cmd_CSBuyNickname_VALUE, Cmd_CSBuyNickname_VALUE, Cmd_CSResetBuyinRatio_VALUE);
            Cmd_CSGetUserBaseInfo = new TEXAS_CMD("Cmd_CSGetUserBaseInfo", Cmd_CSCheckNicknameStatus_VALUE, Cmd_CSCheckNicknameStatus_VALUE, Cmd_CSGetUserBaseInfo_VALUE);
            Cmd_CSSaveFavoriteV2 = new TEXAS_CMD("Cmd_CSSaveFavoriteV2", Cmd_CSResetBuyinRatio_VALUE, Cmd_CSResetBuyinRatio_VALUE, Cmd_CSSaveFavoriteV2_VALUE);
            Cmd_CSGetFavoriteListV2 = new TEXAS_CMD("Cmd_CSGetFavoriteListV2", Cmd_CSGetUserBaseInfo_VALUE, Cmd_CSGetUserBaseInfo_VALUE, Cmd_CSGetFavoriteListV2_VALUE);
            Cmd_CSGetLastPokerHandResult = new TEXAS_CMD("Cmd_CSGetLastPokerHandResult", Cmd_CSSaveFavoriteV2_VALUE, Cmd_CSSaveFavoriteV2_VALUE, Cmd_CSGetLastPokerHandResult_VALUE);
            Cmd_CSCSGetAllPokerHistory = new TEXAS_CMD("Cmd_CSCSGetAllPokerHistory", Cmd_CSGetFavoriteListV2_VALUE, Cmd_CSGetFavoriteListV2_VALUE, Cmd_CSCSGetAllPokerHistory_VALUE);
            Cmd_CSRemoveFavoriteV2 = new TEXAS_CMD("Cmd_CSRemoveFavoriteV2", Cmd_CSGetLastPokerHandResult_VALUE, Cmd_CSGetLastPokerHandResult_VALUE, Cmd_CSRemoveFavoriteV2_VALUE);
            Cmd_CSRenameFavorite = new TEXAS_CMD("Cmd_CSRenameFavorite", Cmd_CSCSGetAllPokerHistory_VALUE, Cmd_CSCSGetAllPokerHistory_VALUE, Cmd_CSRenameFavorite_VALUE);
            Cmd_SCBuyinControlMsg = new TEXAS_CMD("Cmd_SCBuyinControlMsg", Cmd_CSRemoveFavoriteV2_VALUE, Cmd_CSRemoveFavoriteV2_VALUE, Cmd_SCBuyinControlMsg_VALUE);
            Cmd_CSBuyinAction = new TEXAS_CMD("Cmd_CSBuyinAction", Cmd_CSRenameFavorite_VALUE, Cmd_CSRenameFavorite_VALUE, Cmd_CSBuyinAction_VALUE);
            Cmd_CSSetBuyinControlState = new TEXAS_CMD("Cmd_CSSetBuyinControlState", Cmd_SCBuyinControlMsg_VALUE, Cmd_SCBuyinControlMsg_VALUE, Cmd_CSSetBuyinControlState_VALUE);
            Cmd_CSPauseGame = new TEXAS_CMD("Cmd_CSPauseGame", Cmd_CSBuyinAction_VALUE, Cmd_CSBuyinAction_VALUE, Cmd_CSPauseGame_VALUE);
            Cmd_CSGetAllBuyinControls = new TEXAS_CMD("Cmd_CSGetAllBuyinControls", Cmd_CSSetBuyinControlState_VALUE, Cmd_CSSetBuyinControlState_VALUE, Cmd_CSGetAllBuyinControls_VALUE);
            Cmd_CSRenameFPokerHistory = new TEXAS_CMD("Cmd_CSRenameFPokerHistory", Cmd_CSPauseGame_VALUE, Cmd_CSPauseGame_VALUE, Cmd_CSRenameFPokerHistory_VALUE);
            Cmd_CSCreateSNGGameRoom = new TEXAS_CMD("Cmd_CSCreateSNGGameRoom", 161, 161, Cmd_CSCreateSNGGameRoom_VALUE);
            Cmd_CSSignUpSNGGameRoom = new TEXAS_CMD("Cmd_CSSignUpSNGGameRoom", Cmd_CSGetAllBuyinControls_VALUE, Cmd_CSGetAllBuyinControls_VALUE, Cmd_CSSignUpSNGGameRoom_VALUE);
            Cmd_CSWatchSNGGameRoom = new TEXAS_CMD("Cmd_CSWatchSNGGameRoom", Cmd_CSRenameFPokerHistory_VALUE, Cmd_CSRenameFPokerHistory_VALUE, Cmd_CSWatchSNGGameRoom_VALUE);
            Cmd_CSLeaveSNGGameRoom = new TEXAS_CMD("Cmd_CSLeaveSNGGameRoom", Cmd_CSCreateSNGGameRoom_VALUE, Cmd_CSCreateSNGGameRoom_VALUE, Cmd_CSLeaveSNGGameRoom_VALUE);
            Cmd_CSCreateQuickSNGGameRoom = new TEXAS_CMD("Cmd_CSCreateQuickSNGGameRoom", Cmd_CSSignUpSNGGameRoom_VALUE, Cmd_CSSignUpSNGGameRoom_VALUE, Cmd_CSCreateQuickSNGGameRoom_VALUE);
            Cmd_CSPreBuyCoinAndroid = new TEXAS_CMD("Cmd_CSPreBuyCoinAndroid", Cmd_CSWatchSNGGameRoom_VALUE, Cmd_CSWatchSNGGameRoom_VALUE, Cmd_CSPreBuyCoinAndroid_VALUE);
            Cmd_CSBuyCoinAndroid = new TEXAS_CMD("Cmd_CSBuyCoinAndroid", Cmd_CSLeaveSNGGameRoom_VALUE, Cmd_CSLeaveSNGGameRoom_VALUE, Cmd_CSBuyCoinAndroid_VALUE);
            Cmd_CSReturnGame = new TEXAS_CMD("Cmd_CSReturnGame", Cmd_CSCreateQuickSNGGameRoom_VALUE, Cmd_CSCreateQuickSNGGameRoom_VALUE, Cmd_CSReturnGame_VALUE);
            Cmd_CSStopSNGGame = new TEXAS_CMD("Cmd_CSStopSNGGame", Cmd_CSPreBuyCoinAndroid_VALUE, Cmd_CSPreBuyCoinAndroid_VALUE, Cmd_CSStopSNGGame_VALUE);
            Cmd_CSLoginThirdParty = new TEXAS_CMD("Cmd_CSLoginThirdParty", Cmd_CSBuyCoinAndroid_VALUE, Cmd_CSBuyCoinAndroid_VALUE, Cmd_CSLoginThirdParty_VALUE);
            Cmd_CSHelloGame = new TEXAS_CMD("Cmd_CSHelloGame", Cmd_CSReturnGame_VALUE, Cmd_CSReturnGame_VALUE, Cmd_CSHelloGame_VALUE);
            Cmd_CSBuyInsurance = new TEXAS_CMD("Cmd_CSBuyInsurance", Cmd_CSStopSNGGame_VALUE, Cmd_CSStopSNGGame_VALUE, Cmd_CSBuyInsurance_VALUE);
            Cmd_CSCreatorInsuranceSetting = new TEXAS_CMD("Cmd_CSCreatorInsuranceSetting", Cmd_CSLoginThirdParty_VALUE, Cmd_CSLoginThirdParty_VALUE, Cmd_CSCreatorInsuranceSetting_VALUE);
            Cmd_CSUserInsuranceSetting = new TEXAS_CMD("Cmd_CSUserInsuranceSetting", Cmd_CSHelloGame_VALUE, Cmd_CSHelloGame_VALUE, Cmd_CSUserInsuranceSetting_VALUE);
            Cmd_CSBuyInsuranceDelay = new TEXAS_CMD("Cmd_CSBuyInsuranceDelay", Cmd_CSBuyInsurance_VALUE, Cmd_CSBuyInsurance_VALUE, Cmd_CSBuyInsuranceDelay_VALUE);
            Cmd_CSForceBB = new TEXAS_CMD("Cmd_CSForceBB", Cmd_CSCreatorInsuranceSetting_VALUE, Cmd_CSCreatorInsuranceSetting_VALUE, Cmd_CSForceBB_VALUE);
            Cmd_CSGetGameSetting = new TEXAS_CMD("Cmd_CSGetGameSetting", Cmd_CSUserInsuranceSetting_VALUE, Cmd_CSUserInsuranceSetting_VALUE, Cmd_CSGetGameSetting_VALUE);
            Cmd_CSSetUserInfoNew = new TEXAS_CMD("Cmd_CSSetUserInfoNew", Cmd_CSBuyInsuranceDelay_VALUE, Cmd_CSBuyInsuranceDelay_VALUE, Cmd_CSSetUserInfoNew_VALUE);
            Cmd_CSRemarkUserNickName = new TEXAS_CMD("Cmd_CSRemarkUserNickName", Cmd_CSForceBB_VALUE, Cmd_CSForceBB_VALUE, Cmd_CSRemarkUserNickName_VALUE);
            Cmd_CSGetPokerHandResultByHandID = new TEXAS_CMD("Cmd_CSGetPokerHandResultByHandID", Cmd_CSGetGameSetting_VALUE, Cmd_CSGetGameSetting_VALUE, Cmd_CSGetPokerHandResultByHandID_VALUE);
            Cmd_CSShareFavorite = new TEXAS_CMD("Cmd_CSShareFavorite", Cmd_CSSetUserInfoNew_VALUE, Cmd_CSSetUserInfoNew_VALUE, Cmd_CSShareFavorite_VALUE);
            Cmd_CSUserDelegate = new TEXAS_CMD("Cmd_CSUserDelegate", Cmd_CSRemarkUserNickName_VALUE, Cmd_CSRemarkUserNickName_VALUE, Cmd_CSUserDelegate_VALUE);
            Cmd_CSKickUserInGame = new TEXAS_CMD("Cmd_CSKickUserInGame", Cmd_CSGetPokerHandResultByHandID_VALUE, Cmd_CSGetPokerHandResultByHandID_VALUE, Cmd_CSKickUserInGame_VALUE);
            Cmd_CSUploadAPNToken = new TEXAS_CMD("Cmd_CSUploadAPNToken", Cmd_CSShareFavorite_VALUE, Cmd_CSShareFavorite_VALUE, Cmd_CSUploadAPNToken_VALUE);
            Cmd_CSCancelGame = new TEXAS_CMD("Cmd_CSCancelGame", Cmd_CSUserDelegate_VALUE, Cmd_CSUserDelegate_VALUE, Cmd_CSCancelGame_VALUE);
            Cmd_CSShowTableCards = new TEXAS_CMD("Cmd_CSShowTableCards", Cmd_CSKickUserInGame_VALUE, Cmd_CSKickUserInGame_VALUE, Cmd_CSShowTableCards_VALUE);
            Cmd_CSReportLocationInfo = new TEXAS_CMD("Cmd_CSReportLocationInfo", Cmd_CSUploadAPNToken_VALUE, Cmd_CSUploadAPNToken_VALUE, Cmd_CSReportLocationInfo_VALUE);
            Cmd_CSCreateLeague = new TEXAS_CMD("Cmd_CSCreateLeague", Cmd_CSCancelGame_VALUE, Cmd_CSCancelGame_VALUE, Cmd_CSCreateLeague_VALUE);
            Cmd_CSEnterLeague = new TEXAS_CMD("Cmd_CSEnterLeague", Cmd_CSShowTableCards_VALUE, Cmd_CSShowTableCards_VALUE, Cmd_CSEnterLeague_VALUE);
            Cmd_CSLeagueAction = new TEXAS_CMD("Cmd_CSLeagueAction", Cmd_CSReportLocationInfo_VALUE, Cmd_CSReportLocationInfo_VALUE, Cmd_CSLeagueAction_VALUE);
            Cmd_CSSearchLeague = new TEXAS_CMD("Cmd_CSSearchLeague", Cmd_CSCreateLeague_VALUE, Cmd_CSCreateLeague_VALUE, Cmd_CSSearchLeague_VALUE);
            Cmd_CSSetLeagueSetting = new TEXAS_CMD("Cmd_CSSetLeagueSetting", Cmd_CSEnterLeague_VALUE, Cmd_CSEnterLeague_VALUE, Cmd_CSSetLeagueSetting_VALUE);
            Cmd_CSQuitLeague = new TEXAS_CMD("Cmd_CSQuitLeague", Cmd_CSLeagueAction_VALUE, Cmd_CSLeagueAction_VALUE, Cmd_CSQuitLeague_VALUE);
            Cmd_CSGetLeagueBaseInfoByLeagueID = new TEXAS_CMD("Cmd_CSGetLeagueBaseInfoByLeagueID", Cmd_CSSearchLeague_VALUE, Cmd_CSSearchLeague_VALUE, Cmd_CSGetLeagueBaseInfoByLeagueID_VALUE);
            Cmd_CSGetLeagueByLeagueID = new TEXAS_CMD("Cmd_CSGetLeagueByLeagueID", Cmd_CSSetLeagueSetting_VALUE, Cmd_CSSetLeagueSetting_VALUE, Cmd_CSGetLeagueByLeagueID_VALUE);
            Cmd_CSGetLeagueInfoByClubID = new TEXAS_CMD("Cmd_CSGetLeagueInfoByClubID", Cmd_CSQuitLeague_VALUE, Cmd_CSQuitLeague_VALUE, Cmd_CSGetLeagueInfoByClubID_VALUE);
            Cmd_CSAddLeagueMaxMember = new TEXAS_CMD("Cmd_CSAddLeagueMaxMember", Cmd_CSGetLeagueBaseInfoByLeagueID_VALUE, Cmd_CSGetLeagueBaseInfoByLeagueID_VALUE, Cmd_CSAddLeagueMaxMember_VALUE);
            Cmd_SCSystemLeagueMsg = new TEXAS_CMD("Cmd_SCSystemLeagueMsg", Cmd_CSGetLeagueByLeagueID_VALUE, Cmd_CSGetLeagueByLeagueID_VALUE, Cmd_SCSystemLeagueMsg_VALUE);
            Cmd_CSGetMyClubsV2 = new TEXAS_CMD("Cmd_CSGetMyClubsV2", Cmd_CSGetLeagueInfoByClubID_VALUE, Cmd_CSGetLeagueInfoByClubID_VALUE, Cmd_CSGetMyClubsV2_VALUE);
            Cmd_CSGetGameRoomLeagueClubs = new TEXAS_CMD("Cmd_CSGetGameRoomLeagueClubs", Cmd_CSAddLeagueMaxMember_VALUE, Cmd_CSAddLeagueMaxMember_VALUE, Cmd_CSGetGameRoomLeagueClubs_VALUE);
            Cmd_CSBuyBuyInV2 = new TEXAS_CMD("Cmd_CSBuyBuyInV2", Cmd_SCSystemLeagueMsg_VALUE, Cmd_SCSystemLeagueMsg_VALUE, Cmd_CSBuyBuyInV2_VALUE);
            Cmd_CSGetFlashPageInfos = new TEXAS_CMD("Cmd_CSGetFlashPageInfos", Cmd_CSGetMyClubsV2_VALUE, Cmd_CSGetMyClubsV2_VALUE, Cmd_CSGetFlashPageInfos_VALUE);
            Cmd_CSGetFrontPageInfoV4 = new TEXAS_CMD("Cmd_CSGetFrontPageInfoV4", Cmd_CSGetGameRoomLeagueClubs_VALUE, Cmd_CSGetGameRoomLeagueClubs_VALUE, Cmd_CSGetFrontPageInfoV4_VALUE);
            Cmd_CSGetBillInfosV2 = new TEXAS_CMD("Cmd_CSGetBillInfosV2", Cmd_CSBuyBuyInV2_VALUE, Cmd_CSBuyBuyInV2_VALUE, Cmd_CSGetBillInfosV2_VALUE);
            Cmd_CSSetGameThinkingInterval = new TEXAS_CMD("Cmd_CSSetGameThinkingInterval", Cmd_CSGetFlashPageInfos_VALUE, Cmd_CSGetFlashPageInfos_VALUE, Cmd_CSSetGameThinkingInterval_VALUE);
            Cmd_CSForceStandup = new TEXAS_CMD("Cmd_CSForceStandup", Cmd_CSGetFrontPageInfoV4_VALUE, Cmd_CSGetFrontPageInfoV4_VALUE, Cmd_CSForceStandup_VALUE);
            Cmd_CSSetStraddle = new TEXAS_CMD("Cmd_CSSetStraddle", Cmd_CSGetBillInfosV2_VALUE, Cmd_CSGetBillInfosV2_VALUE, Cmd_CSSetStraddle_VALUE);
            Cmd_CSGetFestivalMode = new TEXAS_CMD("Cmd_CSGetFestivalMode", Cmd_CSSetGameThinkingInterval_VALUE, Cmd_CSSetGameThinkingInterval_VALUE, Cmd_CSGetFestivalMode_VALUE);
            Cmd_SCRegisterRsp = new TEXAS_CMD("Cmd_SCRegisterRsp", Cmd_CSForceStandup_VALUE, Cmd_CSForceStandup_VALUE, Cmd_SCRegisterRsp_VALUE);
            Cmd_SCUploadPhoneNumberRsp = new TEXAS_CMD("Cmd_SCUploadPhoneNumberRsp", Cmd_CSSetStraddle_VALUE, Cmd_CSSetStraddle_VALUE, Cmd_SCUploadPhoneNumberRsp_VALUE);
            Cmd_SCUploadVerifyCodeRsp = new TEXAS_CMD("Cmd_SCUploadVerifyCodeRsp", Cmd_CSGetFestivalMode_VALUE, Cmd_CSGetFestivalMode_VALUE, Cmd_SCUploadVerifyCodeRsp_VALUE);
            Cmd_SCLoginWeiboRsp = new TEXAS_CMD("Cmd_SCLoginWeiboRsp", 212, 212, Cmd_SCLoginWeiboRsp_VALUE);
            Cmd_SCLoginRsp = new TEXAS_CMD("Cmd_SCLoginRsp", 213, 213, Cmd_SCLoginRsp_VALUE);
            Cmd_SCGetUserInfoRsp = new TEXAS_CMD("Cmd_SCGetUserInfoRsp", 214, 214, Cmd_SCGetUserInfoRsp_VALUE);
            Cmd_SCGetGameInfoRsp = new TEXAS_CMD("Cmd_SCGetGameInfoRsp", 215, 215, Cmd_SCGetGameInfoRsp_VALUE);
            Cmd_SCUploadFriendRelationRsp = new TEXAS_CMD("Cmd_SCUploadFriendRelationRsp", 216, 216, Cmd_SCUploadFriendRelationRsp_VALUE);
            Cmd_SCGetFriendStatusRsp = new TEXAS_CMD("Cmd_SCGetFriendStatusRsp", 217, 217, Cmd_SCGetFriendStatusRsp_VALUE);
            Cmd_SCInviteActionRsp = new TEXAS_CMD("Cmd_SCInviteActionRsp", 218, 218, Cmd_SCInviteActionRsp_VALUE);
            Cmd_SCHelloRsp = new TEXAS_CMD("Cmd_SCHelloRsp", 219, 219, Cmd_SCHelloRsp_VALUE);
            Cmd_SCUpdateRsp = new TEXAS_CMD("Cmd_SCUpdateRsp", 220, 220, Cmd_SCUpdateRsp_VALUE);
            Cmd_SCQuickLoginRsp = new TEXAS_CMD("Cmd_SCQuickLoginRsp", 221, 221, Cmd_SCQuickLoginRsp_VALUE);
            Cmd_SCUploadPhoneBookRsp = new TEXAS_CMD("Cmd_SCUploadPhoneBookRsp", 222, 222, Cmd_SCUploadPhoneBookRsp_VALUE);
            Cmd_SCCreateChatRoomRsp = new TEXAS_CMD("Cmd_SCCreateChatRoomRsp", 223, 223, Cmd_SCCreateChatRoomRsp_VALUE);
            Cmd_SCCreateGameRoomRsp = new TEXAS_CMD("Cmd_SCCreateGameRoomRsp", 224, 224, Cmd_SCCreateGameRoomRsp_VALUE);
            Cmd_SCGetFrontPageInfoRsp = new TEXAS_CMD("Cmd_SCGetFrontPageInfoRsp", 225, 225, Cmd_SCGetFrontPageInfoRsp_VALUE);
            Cmd_SCGetChatRoomInfoByRoomIDRsp = new TEXAS_CMD("Cmd_SCGetChatRoomInfoByRoomIDRsp", 226, 226, Cmd_SCGetChatRoomInfoByRoomIDRsp_VALUE);
            Cmd_SCGetChatRoomInfosByUuidRsp = new TEXAS_CMD("Cmd_SCGetChatRoomInfosByUuidRsp", 227, 227, Cmd_SCGetChatRoomInfosByUuidRsp_VALUE);
            Cmd_SCGetGameRoomInfoRsp = new TEXAS_CMD("Cmd_SCGetGameRoomInfoRsp", 228, 228, Cmd_SCGetGameRoomInfoRsp_VALUE);
            Cmd_SCSendMsgRsp = new TEXAS_CMD("Cmd_SCSendMsgRsp", 229, 229, Cmd_SCSendMsgRsp_VALUE);
            Cmd_CSPushMsgRsp = new TEXAS_CMD("Cmd_CSPushMsgRsp", 230, 230, Cmd_CSPushMsgRsp_VALUE);
            Cmd_CSSystemFriendMsgRsp = new TEXAS_CMD("Cmd_CSSystemFriendMsgRsp", 231, 231, Cmd_CSSystemFriendMsgRsp_VALUE);
            Cmd_CSSystemChatRoomMsgRsp = new TEXAS_CMD("Cmd_CSSystemChatRoomMsgRsp", 232, 232, Cmd_CSSystemChatRoomMsgRsp_VALUE);
            Cmd_CSSystemGameRoomMsgRsp = new TEXAS_CMD("Cmd_CSSystemGameRoomMsgRsp", 233, 233, Cmd_CSSystemGameRoomMsgRsp_VALUE);
            Cmd_SCReconnectRsp = new TEXAS_CMD("Cmd_SCReconnectRsp", 234, 234, Cmd_SCReconnectRsp_VALUE);
            Cmd_SCEnterGameRoomRsp = new TEXAS_CMD("Cmd_SCEnterGameRoomRsp", 235, 235, Cmd_SCEnterGameRoomRsp_VALUE);
            Cmd_SCRemoveFriendRsp = new TEXAS_CMD("Cmd_SCRemoveFriendRsp", 236, 236, Cmd_SCRemoveFriendRsp_VALUE);
            Cmd_SCSearchFriendRsp = new TEXAS_CMD("Cmd_SCSearchFriendRsp", 237, 237, Cmd_SCSearchFriendRsp_VALUE);
            Cmd_SCFeedbackRsp = new TEXAS_CMD("Cmd_SCFeedbackRsp", 238, 238, Cmd_SCFeedbackRsp_VALUE);
            Cmd_SCSetChatRoomUserRsp = new TEXAS_CMD("Cmd_SCSetChatRoomUserRsp", 239, 239, Cmd_SCSetChatRoomUserRsp_VALUE);
            Cmd_SCAddChatRoomUserRsp = new TEXAS_CMD("Cmd_SCAddChatRoomUserRsp", 240, 240, Cmd_SCAddChatRoomUserRsp_VALUE);
            Cmd_SCRemoveChatRoomUserRsp = new TEXAS_CMD("Cmd_SCRemoveChatRoomUserRsp", 241, 241, Cmd_SCRemoveChatRoomUserRsp_VALUE);
            Cmd_SCSetChatRoomInfoRsp = new TEXAS_CMD("Cmd_SCSetChatRoomInfoRsp", 242, 242, Cmd_SCSetChatRoomInfoRsp_VALUE);
            Cmd_SCUploadIconRsp = new TEXAS_CMD("Cmd_SCUploadIconRsp", 243, 243, Cmd_SCUploadIconRsp_VALUE);
            Cmd_SCSetUserInfoRsp = new TEXAS_CMD("Cmd_SCSetUserInfoRsp", 244, 244, Cmd_SCSetUserInfoRsp_VALUE);
            Cmd_SCGameActionRsp = new TEXAS_CMD("Cmd_SCGameActionRsp", 245, 245, Cmd_SCGameActionRsp_VALUE);
            Cmd_CSGameRoomStateChangeRsp = new TEXAS_CMD("Cmd_CSGameRoomStateChangeRsp", 246, 246, Cmd_CSGameRoomStateChangeRsp_VALUE);
            Cmd_SCLeaveChatRoomRsp = new TEXAS_CMD("Cmd_SCLeaveChatRoomRsp", 247, 247, Cmd_SCLeaveChatRoomRsp_VALUE);
            Cmd_SCLeaveGameRoomRsp = new TEXAS_CMD("Cmd_SCLeaveGameRoomRsp", 248, 248, Cmd_SCLeaveGameRoomRsp_VALUE);
            Cmd_SCKickUserGameRoomRsp = new TEXAS_CMD("Cmd_SCKickUserGameRoomRsp", 249, 249, Cmd_SCKickUserGameRoomRsp_VALUE);
            Cmd_SCRemoveChatRoomRsp = new TEXAS_CMD("Cmd_SCRemoveChatRoomRsp", 250, 250, Cmd_SCRemoveChatRoomRsp_VALUE);
            Cmd_SCGetCoinStoreListRsp = new TEXAS_CMD("Cmd_SCGetCoinStoreListRsp", 251, 251, Cmd_SCGetCoinStoreListRsp_VALUE);
            Cmd_SCBuyCoinRsp = new TEXAS_CMD("Cmd_SCBuyCoinRsp", 252, 252, Cmd_SCBuyCoinRsp_VALUE);
            Cmd_SCGetSellingItemListRsp = new TEXAS_CMD("Cmd_SCGetSellingItemListRsp", 253, 253, Cmd_SCGetSellingItemListRsp_VALUE);
            Cmd_SCBuySellingItemRsp = new TEXAS_CMD("Cmd_SCBuySellingItemRsp", 254, 254, Cmd_SCBuySellingItemRsp_VALUE);
            Cmd_SCGetItemListRsp = new TEXAS_CMD("Cmd_SCGetItemListRsp", 255, 255, Cmd_SCGetItemListRsp_VALUE);
            Cmd_SCGetDefaultSettingRsp = new TEXAS_CMD("Cmd_SCGetDefaultSettingRsp", NTLMConstants.FLAG_UNIDENTIFIED_2, NTLMConstants.FLAG_UNIDENTIFIED_2, Cmd_SCGetDefaultSettingRsp_VALUE);
            Cmd_SCSitDownRsp = new TEXAS_CMD("Cmd_SCSitDownRsp", 257, 257, Cmd_SCSitDownRsp_VALUE);
            Cmd_SCStandUpRsp = new TEXAS_CMD("Cmd_SCStandUpRsp", 258, 258, Cmd_SCStandUpRsp_VALUE);
            Cmd_SCBuyBuyInRsp = new TEXAS_CMD("Cmd_SCBuyBuyInRsp", 259, 259, Cmd_SCBuyBuyInRsp_VALUE);
            Cmd_SCGetBillInfosRsp = new TEXAS_CMD("Cmd_SCGetBillInfosRsp", 260, 260, Cmd_SCGetBillInfosRsp_VALUE);
            Cmd_SCSaveFavoriteRsp = new TEXAS_CMD("Cmd_SCSaveFavoriteRsp", 261, 261, Cmd_SCSaveFavoriteRsp_VALUE);
            Cmd_SCGetFavoriteListRsp = new TEXAS_CMD("Cmd_SCGetFavoriteListRsp", 262, 262, Cmd_SCGetFavoriteListRsp_VALUE);
            Cmd_CSSystemMsgRsp = new TEXAS_CMD("Cmd_CSSystemMsgRsp", 263, 263, Cmd_CSSystemMsgRsp_VALUE);
            Cmd_SCRemoveBillRsp = new TEXAS_CMD("Cmd_SCRemoveBillRsp", 264, 264, Cmd_SCRemoveBillRsp_VALUE);
            Cmd_SCRemoveFavoriteRsp = new TEXAS_CMD("Cmd_SCRemoveFavoriteRsp", 265, 265, Cmd_SCRemoveFavoriteRsp_VALUE);
            Cmd_SCLoginRewardRsp = new TEXAS_CMD("Cmd_SCLoginRewardRsp", 266, 266, Cmd_SCLoginRewardRsp_VALUE);
            Cmd_SCGetLoginRewardRsp = new TEXAS_CMD("Cmd_SCGetLoginRewardRsp", 267, 267, Cmd_SCGetLoginRewardRsp_VALUE);
            Cmd_SCShareOutRsp = new TEXAS_CMD("Cmd_SCShareOutRsp", 268, 268, Cmd_SCShareOutRsp_VALUE);
            Cmd_SCStartGameRsp = new TEXAS_CMD("Cmd_SCStartGameRsp", 269, 269, Cmd_SCStartGameRsp_VALUE);
            Cmd_SCLogoutRsp = new TEXAS_CMD("Cmd_SCLogoutRsp", 270, 270, Cmd_SCLogoutRsp_VALUE);
            Cmd_SCGetUserGameInfoInRoomRsp = new TEXAS_CMD("Cmd_SCGetUserGameInfoInRoomRsp", 271, 271, Cmd_SCGetUserGameInfoInRoomRsp_VALUE);
            Cmd_SCResetPwdUploadPhonenumberRsp = new TEXAS_CMD("Cmd_SCResetPwdUploadPhonenumberRsp", 272, 272, Cmd_SCResetPwdUploadPhonenumberRsp_VALUE);
            Cmd_SCResetPwdVerifyCodeRsp = new TEXAS_CMD("Cmd_SCResetPwdVerifyCodeRsp", 273, 273, Cmd_SCResetPwdVerifyCodeRsp_VALUE);
            Cmd_SCGetGameRoomInfoByRoomIDRsp = new TEXAS_CMD("Cmd_SCGetGameRoomInfoByRoomIDRsp", 274, 274, Cmd_SCGetGameRoomInfoByRoomIDRsp_VALUE);
            Cmd_SCSaveFavoriteUrlRsp = new TEXAS_CMD("Cmd_SCSaveFavoriteUrlRsp", 275, 275, Cmd_SCSaveFavoriteUrlRsp_VALUE);
            Cmd_SCRegetVerifyCodeRsp = new TEXAS_CMD("Cmd_SCRegetVerifyCodeRsp", 276, 276, Cmd_SCRegetVerifyCodeRsp_VALUE);
            Cmd_SCSetChatInfoSettingRsp = new TEXAS_CMD("Cmd_SCSetChatInfoSettingRsp", 277, 277, Cmd_SCSetChatInfoSettingRsp_VALUE);
            Cmd_SCSetUserInfoSettingRsp = new TEXAS_CMD("Cmd_SCSetUserInfoSettingRsp", 278, 278, Cmd_SCSetUserInfoSettingRsp_VALUE);
            Cmd_SCSendMsgToAllRsp = new TEXAS_CMD("Cmd_SCSendMsgToAllRsp", 279, 279, Cmd_SCSendMsgToAllRsp_VALUE);
            Cmd_SCAddFriendRsp = new TEXAS_CMD("Cmd_SCAddFriendRsp", 280, 280, Cmd_SCAddFriendRsp_VALUE);
            Cmd_SCUploadChatRoomIconRsp = new TEXAS_CMD("Cmd_SCUploadChatRoomIconRsp", 281, 281, Cmd_SCUploadChatRoomIconRsp_VALUE);
            Cmd_SCGetBillInfoByRoomIDRsp = new TEXAS_CMD("Cmd_SCGetBillInfoByRoomIDRsp", 282, 282, Cmd_SCGetBillInfoByRoomIDRsp_VALUE);
            Cmd_SCCreateOfflineGameRsp = new TEXAS_CMD("Cmd_SCCreateOfflineGameRsp", 283, 283, Cmd_SCCreateOfflineGameRsp_VALUE);
            Cmd_CSSystemOfflineGameRoomMsgRsp = new TEXAS_CMD("Cmd_CSSystemOfflineGameRoomMsgRsp", 284, 284, Cmd_CSSystemOfflineGameRoomMsgRsp_VALUE);
            Cmd_SCJoinOfflineGameRoomRsp = new TEXAS_CMD("Cmd_SCJoinOfflineGameRoomRsp", 285, 285, Cmd_SCJoinOfflineGameRoomRsp_VALUE);
            Cmd_SCUnJoinOfflineGameRoomRsp = new TEXAS_CMD("Cmd_SCUnJoinOfflineGameRoomRsp", 286, 286, Cmd_SCUnJoinOfflineGameRoomRsp_VALUE);
            Cmd_SCOverOfflineGameRoomRsp = new TEXAS_CMD("Cmd_SCOverOfflineGameRoomRsp", 287, 287, Cmd_SCOverOfflineGameRoomRsp_VALUE);
            Cmd_SCCancelOfflineGameRoomRsp = new TEXAS_CMD("Cmd_SCCancelOfflineGameRoomRsp", 288, 288, Cmd_SCCancelOfflineGameRoomRsp_VALUE);
            Cmd_SCChangeOfflineGameRoomRsp = new TEXAS_CMD("Cmd_SCChangeOfflineGameRoomRsp", 289, 289, Cmd_SCChangeOfflineGameRoomRsp_VALUE);
            Cmd_SCGetOfflineOverGameInfoRsp = new TEXAS_CMD("Cmd_SCGetOfflineOverGameInfoRsp", 290, 290, Cmd_SCGetOfflineOverGameInfoRsp_VALUE);
            Cmd_SCUseItemRsp = new TEXAS_CMD("Cmd_SCUseItemRsp", 291, 291, Cmd_SCUseItemRsp_VALUE);
            Cmd_CSUseItemPushMsgRsp = new TEXAS_CMD("Cmd_CSUseItemPushMsgRsp", 292, 292, Cmd_CSUseItemPushMsgRsp_VALUE);
            Cmd_SCAdminAddCoinRsp = new TEXAS_CMD("Cmd_SCAdminAddCoinRsp", 293, 293, Cmd_SCAdminAddCoinRsp_VALUE);
            Cmd_SCCreateClubRsp = new TEXAS_CMD("Cmd_SCCreateClubRsp", 294, 294, Cmd_SCCreateClubRsp_VALUE);
            Cmd_SCEnterClubRsp = new TEXAS_CMD("Cmd_SCEnterClubRsp", 295, 295, Cmd_SCEnterClubRsp_VALUE);
            Cmd_SCClubActionRsp = new TEXAS_CMD("Cmd_SCClubActionRsp", 296, 296, Cmd_SCClubActionRsp_VALUE);
            Cmd_CSSystemClubMsgRsp = new TEXAS_CMD("Cmd_CSSystemClubMsgRsp", 297, 297, Cmd_CSSystemClubMsgRsp_VALUE);
            Cmd_SCSearchClubRsp = new TEXAS_CMD("Cmd_SCSearchClubRsp", 298, 298, Cmd_SCSearchClubRsp_VALUE);
            Cmd_SCGetClubsByLocationRsp = new TEXAS_CMD("Cmd_SCGetClubsByLocationRsp", 299, 299, Cmd_SCGetClubsByLocationRsp_VALUE);
            Cmd_SCGetHotClubsRsp = new TEXAS_CMD("Cmd_SCGetHotClubsRsp", 300, 300, Cmd_SCGetHotClubsRsp_VALUE);
            Cmd_SCSetClubInfoRsp = new TEXAS_CMD("Cmd_SCSetClubInfoRsp", 301, 301, Cmd_SCSetClubInfoRsp_VALUE);
            Cmd_SCSetClubUserLevelRsp = new TEXAS_CMD("Cmd_SCSetClubUserLevelRsp", 302, 302, Cmd_SCSetClubUserLevelRsp_VALUE);
            Cmd_SCUploadClubIConRsp = new TEXAS_CMD("Cmd_SCUploadClubIConRsp", 303, 303, Cmd_SCUploadClubIConRsp_VALUE);
            Cmd_SCUploadClubCoverRsp = new TEXAS_CMD("Cmd_SCUploadClubCoverRsp", 304, 304, Cmd_SCUploadClubCoverRsp_VALUE);
            Cmd_SCGetMyClubsRsp = new TEXAS_CMD("Cmd_SCGetMyClubsRsp", 305, 305, Cmd_SCGetMyClubsRsp_VALUE);
            Cmd_SCSetClubSettingRsp = new TEXAS_CMD("Cmd_SCSetClubSettingRsp", 306, 306, Cmd_SCSetClubSettingRsp_VALUE);
            Cmd_SCQuitClubRsp = new TEXAS_CMD("Cmd_SCQuitClubRsp", 307, 307, Cmd_SCQuitClubRsp_VALUE);
            Cmd_SCSetClubFundRsp = new TEXAS_CMD("Cmd_SCSetClubFundRsp", 308, 308, Cmd_SCSetClubFundRsp_VALUE);
            Cmd_SCGetClubByClubIDRsp = new TEXAS_CMD("Cmd_SCGetClubByClubIDRsp", 309, 309, Cmd_SCGetClubByClubIDRsp_VALUE);
            Cmd_SCGetFundBillInfosRsp = new TEXAS_CMD("Cmd_SCGetFundBillInfosRsp", 310, 310, Cmd_SCGetFundBillInfosRsp_VALUE);
            Cmd_SCUploadSGScoreRsp = new TEXAS_CMD("Cmd_SCUploadSGScoreRsp", 311, 311, Cmd_SCUploadSGScoreRsp_VALUE);
            Cmd_SCDeleteClubCoverRsp = new TEXAS_CMD("Cmd_SCDeleteClubCoverRsp", 312, 312, Cmd_SCDeleteClubCoverRsp_VALUE);
            Cmd_SCGetClubInfoByUuidRsp = new TEXAS_CMD("Cmd_SCGetClubInfoByUuidRsp", 313, 313, Cmd_SCGetClubInfoByUuidRsp_VALUE);
            Cmd_SCUploadUserCoverRsp = new TEXAS_CMD("Cmd_SCUploadUserCoverRsp", 314, 314, Cmd_SCUploadUserCoverRsp_VALUE);
            Cmd_SCDeleteUserCoverRsp = new TEXAS_CMD("Cmd_SCDeleteUserCoverRsp", 315, 315, Cmd_SCDeleteUserCoverRsp_VALUE);
            Cmd_SCGetChatRoomUsersByRoomIDRsp = new TEXAS_CMD("Cmd_SCGetChatRoomUsersByRoomIDRsp", 316, 316, Cmd_SCGetChatRoomUsersByRoomIDRsp_VALUE);
            Cmd_SCGetChatRoomGamesByRoomIDRsp = new TEXAS_CMD("Cmd_SCGetChatRoomGamesByRoomIDRsp", 317, 317, Cmd_SCGetChatRoomGamesByRoomIDRsp_VALUE);
            Cmd_SCGetClubUsersByClubIDRsp = new TEXAS_CMD("Cmd_SCGetClubUsersByClubIDRsp", 318, 318, Cmd_SCGetClubUsersByClubIDRsp_VALUE);
            Cmd_SCGetClubGamesByClubIDRsp = new TEXAS_CMD("Cmd_SCGetClubGamesByClubIDRsp", 319, 319, Cmd_SCGetClubGamesByClubIDRsp_VALUE);
            Cmd_SCGetClubBaseInfoByClubIDRsp = new TEXAS_CMD("Cmd_SCGetClubBaseInfoByClubIDRsp", 320, 320, Cmd_SCGetClubBaseInfoByClubIDRsp_VALUE);
            Cmd_SCGetFrontPageInfoV2Rsp = new TEXAS_CMD("Cmd_SCGetFrontPageInfoV2Rsp", 321, 321, Cmd_SCGetFrontPageInfoV2Rsp_VALUE);
            Cmd_SCGetRecommendClubsRsp = new TEXAS_CMD("Cmd_SCGetRecommendClubsRsp", 322, 322, Cmd_SCGetRecommendClubsRsp_VALUE);
            Cmd_SCUseDelayItemRsp = new TEXAS_CMD("Cmd_SCUseDelayItemRsp", 323, 323, Cmd_SCUseDelayItemRsp_VALUE);
            Cmd_SCGetAllBannerInfoRsp = new TEXAS_CMD("Cmd_SCGetAllBannerInfoRsp", 324, 324, Cmd_SCGetAllBannerInfoRsp_VALUE);
            Cmd_SCSetBannerInfoRsp = new TEXAS_CMD("Cmd_SCSetBannerInfoRsp", 325, 325, Cmd_SCSetBannerInfoRsp_VALUE);
            Cmd_SCGetAllRecommendUserInfoRsp = new TEXAS_CMD("Cmd_SCGetAllRecommendUserInfoRsp", 326, 326, Cmd_SCGetAllRecommendUserInfoRsp_VALUE);
            Cmd_SCSetRecommendUserRsp = new TEXAS_CMD("Cmd_SCSetRecommendUserRsp", 327, 327, Cmd_SCSetRecommendUserRsp_VALUE);
            Cmd_SCSearchUserRsp = new TEXAS_CMD("Cmd_SCSearchUserRsp", 328, 328, Cmd_SCSearchUserRsp_VALUE);
            Cmd_SCShowCardRsp = new TEXAS_CMD("Cmd_SCShowCardRsp", 329, 329, Cmd_SCShowCardRsp_VALUE);
            Cmd_SCGameActionV3Rsp = new TEXAS_CMD("Cmd_SCGameActionV3Rsp", 330, 330, Cmd_SCGameActionV3Rsp_VALUE);
            Cmd_SCCreateQuickGameRoomRsp = new TEXAS_CMD("Cmd_SCCreateQuickGameRoomRsp", 331, 331, Cmd_SCCreateQuickGameRoomRsp_VALUE);
            Cmd_SCEnterQuickGameRoomRsp = new TEXAS_CMD("Cmd_SCEnterQuickGameRoomRsp", 332, 332, Cmd_SCEnterQuickGameRoomRsp_VALUE);
            Cmd_SCStandUpV3Rsp = new TEXAS_CMD("Cmd_SCStandUpV3Rsp", 333, 333, Cmd_SCStandUpV3Rsp_VALUE);
            Cmd_SCStartQuickRoomGameRsp = new TEXAS_CMD("Cmd_SCStartQuickRoomGameRsp", 334, 334, Cmd_SCStartQuickRoomGameRsp_VALUE);
            Cmd_SCGetQuickGameRoomRsp = new TEXAS_CMD("Cmd_SCGetQuickGameRoomRsp", 335, 335, Cmd_SCGetQuickGameRoomRsp_VALUE);
            Cmd_SCGiveMoneyRsp = new TEXAS_CMD("Cmd_SCGiveMoneyRsp", 336, 336, Cmd_SCGiveMoneyRsp_VALUE);
            Cmd_CSGiveMoneyPushMsgRsp = new TEXAS_CMD("Cmd_CSGiveMoneyPushMsgRsp", 337, 337, Cmd_CSGiveMoneyPushMsgRsp_VALUE);
            Cmd_SCQuitQuickGameRoomRsp = new TEXAS_CMD("Cmd_SCQuitQuickGameRoomRsp", 338, 338, Cmd_SCQuitQuickGameRoomRsp_VALUE);
            Cmd_CSSystemQuickGameRoomMsgRsp = new TEXAS_CMD("Cmd_CSSystemQuickGameRoomMsgRsp", 339, 339, Cmd_CSSystemQuickGameRoomMsgRsp_VALUE);
            Cmd_SCGetFrontPageInfoV3Rsp = new TEXAS_CMD("Cmd_SCGetFrontPageInfoV3Rsp", 340, 340, Cmd_SCGetFrontPageInfoV3Rsp_VALUE);
            Cmd_SCGetBannerInfosRsp = new TEXAS_CMD("Cmd_SCGetBannerInfosRsp", 341, 341, Cmd_SCGetBannerInfosRsp_VALUE);
            Cmd_SCAdminAddClubFundRsp = new TEXAS_CMD("Cmd_SCAdminAddClubFundRsp", 342, 342, Cmd_SCAdminAddClubFundRsp_VALUE);
            Cmd_SCGetUserInfoV2Rsp = new TEXAS_CMD("Cmd_SCGetUserInfoV2Rsp", 343, 343, Cmd_SCGetUserInfoV2Rsp_VALUE);
            Cmd_SCGetSystemMsgsRsp = new TEXAS_CMD("Cmd_SCGetSystemMsgsRsp", 344, 344, Cmd_SCGetSystemMsgsRsp_VALUE);
            Cmd_SCGetSystemMsgByIDRsp = new TEXAS_CMD("Cmd_SCGetSystemMsgByIDRsp", 345, 345, Cmd_SCGetSystemMsgByIDRsp_VALUE);
            Cmd_SCGetBenefitsRsp = new TEXAS_CMD("Cmd_SCGetBenefitsRsp", 346, 346, Cmd_SCGetBenefitsRsp_VALUE);
            Cmd_SCGetSystemMsgsByTypeCMSRsp = new TEXAS_CMD("Cmd_SCGetSystemMsgsByTypeCMSRsp", 347, 347, Cmd_SCGetSystemMsgsByTypeCMSRsp_VALUE);
            Cmd_SCGetSystemMsgByIDCMSRsp = new TEXAS_CMD("Cmd_SCGetSystemMsgByIDCMSRsp", 348, 348, Cmd_SCGetSystemMsgByIDCMSRsp_VALUE);
            Cmd_SCSendSystemMsgCMSRsp = new TEXAS_CMD("Cmd_SCSendSystemMsgCMSRsp", 349, 349, Cmd_SCSendSystemMsgCMSRsp_VALUE);
            Cmd_SCAddClubMaxMemberRsp = new TEXAS_CMD("Cmd_SCAddClubMaxMemberRsp", 350, 350, Cmd_SCAddClubMaxMemberRsp_VALUE);
            Cmd_SCAddClubFundRsp = new TEXAS_CMD("Cmd_SCAddClubFundRsp", 351, 351, Cmd_SCAddClubFundRsp_VALUE);
            Cmd_SCGetClubSellingItemsRsp = new TEXAS_CMD("Cmd_SCGetClubSellingItemsRsp", 352, 352, Cmd_SCGetClubSellingItemsRsp_VALUE);
            Cmd_SCBuyNicknameRsp = new TEXAS_CMD("Cmd_SCBuyNicknameRsp", 353, 353, Cmd_SCBuyNicknameRsp_VALUE);
            Cmd_SCCheckNicknameStatusRsp = new TEXAS_CMD("Cmd_SCCheckNicknameStatusRsp", 354, 354, Cmd_SCCheckNicknameStatusRsp_VALUE);
            Cmd_SCResetBuyinRatioRsp = new TEXAS_CMD("Cmd_SCResetBuyinRatioRsp", 355, 355, Cmd_SCResetBuyinRatioRsp_VALUE);
            Cmd_SCGetUserBaseInfoRsp = new TEXAS_CMD("Cmd_SCGetUserBaseInfoRsp", 356, 356, Cmd_SCGetUserBaseInfoRsp_VALUE);
            Cmd_SCSaveFavoriteV2Rsp = new TEXAS_CMD("Cmd_SCSaveFavoriteV2Rsp", 357, 357, Cmd_SCSaveFavoriteV2Rsp_VALUE);
            Cmd_SCGetFavoriteListV2Rsp = new TEXAS_CMD("Cmd_SCGetFavoriteListV2Rsp", 358, 358, Cmd_SCGetFavoriteListV2Rsp_VALUE);
            Cmd_SCGetLastPokerHandResultRsp = new TEXAS_CMD("Cmd_SCGetLastPokerHandResultRsp", 359, 359, Cmd_SCGetLastPokerHandResultRsp_VALUE);
            Cmd_SCGetAllPokerHistoryRsp = new TEXAS_CMD("Cmd_SCGetAllPokerHistoryRsp", 360, 360, Cmd_SCGetAllPokerHistoryRsp_VALUE);
            Cmd_SCRemoveFavoriteV2Rsp = new TEXAS_CMD("Cmd_SCRemoveFavoriteV2Rsp", 361, 361, Cmd_SCRemoveFavoriteV2Rsp_VALUE);
            Cmd_SCRenameFavoriteRsp = new TEXAS_CMD("Cmd_SCRenameFavoriteRsp", 362, 362, Cmd_SCRenameFavoriteRsp_VALUE);
            Cmd_CSBuyinControlMsgRsp = new TEXAS_CMD("Cmd_CSBuyinControlMsgRsp", 363, 363, Cmd_CSBuyinControlMsgRsp_VALUE);
            Cmd_SCBuyinActionRsp = new TEXAS_CMD("Cmd_SCBuyinActionRsp", 364, 364, Cmd_SCBuyinActionRsp_VALUE);
            Cmd_SCSetBuyinControlStateRsp = new TEXAS_CMD("Cmd_SCSetBuyinControlStateRsp", 365, 365, Cmd_SCSetBuyinControlStateRsp_VALUE);
            Cmd_SCPauseGameRsp = new TEXAS_CMD("Cmd_SCPauseGameRsp", 366, 366, Cmd_SCPauseGameRsp_VALUE);
            Cmd_SCGetAllBuyinControlsRsp = new TEXAS_CMD("Cmd_SCGetAllBuyinControlsRsp", 367, 367, Cmd_SCGetAllBuyinControlsRsp_VALUE);
            Cmd_SCRenameFPokerHistoryRsp = new TEXAS_CMD("Cmd_SCRenameFPokerHistoryRsp", 368, 368, Cmd_SCRenameFPokerHistoryRsp_VALUE);
            Cmd_SCCreateSNGGameRoomRsp = new TEXAS_CMD("Cmd_SCCreateSNGGameRoomRsp", 369, 369, Cmd_SCCreateSNGGameRoomRsp_VALUE);
            Cmd_SCSignUpSNGGameRoomRsp = new TEXAS_CMD("Cmd_SCSignUpSNGGameRoomRsp", 370, 370, Cmd_SCSignUpSNGGameRoomRsp_VALUE);
            Cmd_SCWatchSNGGameRoomRsp = new TEXAS_CMD("Cmd_SCWatchSNGGameRoomRsp", 371, 371, Cmd_SCWatchSNGGameRoomRsp_VALUE);
            Cmd_SCLeaveSNGGameRoomRsp = new TEXAS_CMD("Cmd_SCLeaveSNGGameRoomRsp", 372, 372, Cmd_SCLeaveSNGGameRoomRsp_VALUE);
            Cmd_SCCreateQuickSNGGameRoomRsp = new TEXAS_CMD("Cmd_SCCreateQuickSNGGameRoomRsp", 373, 373, Cmd_SCCreateQuickSNGGameRoomRsp_VALUE);
            Cmd_SCPreBuyCoinAndroidRsp = new TEXAS_CMD("Cmd_SCPreBuyCoinAndroidRsp", 374, 374, Cmd_SCPreBuyCoinAndroidRsp_VALUE);
            Cmd_SCBuyCoinAndroidRsp = new TEXAS_CMD("Cmd_SCBuyCoinAndroidRsp", 375, 375, Cmd_SCBuyCoinAndroidRsp_VALUE);
            Cmd_SCReturnGameRsp = new TEXAS_CMD("Cmd_SCReturnGameRsp", 376, 376, Cmd_SCReturnGameRsp_VALUE);
            Cmd_SCStopSNGGameRsp = new TEXAS_CMD("Cmd_SCStopSNGGameRsp", 377, 377, Cmd_SCStopSNGGameRsp_VALUE);
            Cmd_SCLoginThirdPartyRsp = new TEXAS_CMD("Cmd_SCLoginThirdPartyRsp", 378, 378, Cmd_SCLoginThirdPartyRsp_VALUE);
            Cmd_SCHelloGameRsp = new TEXAS_CMD("Cmd_SCHelloGameRsp", 379, 379, Cmd_SCHelloGameRsp_VALUE);
            Cmd_SCBuyInsuranceRsp = new TEXAS_CMD("Cmd_SCBuyInsuranceRsp", 380, 380, Cmd_SCBuyInsuranceRsp_VALUE);
            Cmd_SCCreatorInsuranceSettingRsp = new TEXAS_CMD("Cmd_SCCreatorInsuranceSettingRsp", 381, 381, Cmd_SCCreatorInsuranceSettingRsp_VALUE);
            Cmd_SCUserInsuranceSettingRsp = new TEXAS_CMD("Cmd_SCUserInsuranceSettingRsp", 382, 382, Cmd_SCUserInsuranceSettingRsp_VALUE);
            Cmd_SCBuyInsuranceDelayRsp = new TEXAS_CMD("Cmd_SCBuyInsuranceDelayRsp", 383, 383, Cmd_SCBuyInsuranceDelayRsp_VALUE);
            Cmd_SCForceBBRsp = new TEXAS_CMD("Cmd_SCForceBBRsp", 384, 384, Cmd_SCForceBBRsp_VALUE);
            Cmd_SCGetGameSettingRsp = new TEXAS_CMD("Cmd_SCGetGameSettingRsp", 385, 385, Cmd_SCGetGameSettingRsp_VALUE);
            Cmd_SCSetUserInfoNewRsp = new TEXAS_CMD("Cmd_SCSetUserInfoNewRsp", 386, 386, Cmd_SCSetUserInfoNewRsp_VALUE);
            Cmd_SCRemarkUserNickNameRsp = new TEXAS_CMD("Cmd_SCRemarkUserNickNameRsp", 387, 387, Cmd_SCRemarkUserNickNameRsp_VALUE);
            Cmd_SCGetPokerHandResultByHandIDRsp = new TEXAS_CMD("Cmd_SCGetPokerHandResultByHandIDRsp", 388, 388, Cmd_SCGetPokerHandResultByHandIDRsp_VALUE);
            Cmd_SCShareFavoriteRsp = new TEXAS_CMD("Cmd_SCShareFavoriteRsp", 389, 389, Cmd_SCShareFavoriteRsp_VALUE);
            Cmd_SCUserDelegateRsp = new TEXAS_CMD("Cmd_SCUserDelegateRsp", 390, 390, Cmd_SCUserDelegateRsp_VALUE);
            Cmd_SCKickUserInGameRsp = new TEXAS_CMD("Cmd_SCKickUserInGameRsp", 391, 391, Cmd_SCKickUserInGameRsp_VALUE);
            Cmd_SCUploadAPNTokenRsp = new TEXAS_CMD("Cmd_SCUploadAPNTokenRsp", 392, 392, Cmd_SCUploadAPNTokenRsp_VALUE);
            Cmd_SCCancelGameRsp = new TEXAS_CMD("Cmd_SCCancelGameRsp", 393, 393, Cmd_SCCancelGameRsp_VALUE);
            Cmd_SCShowTableCardsRsp = new TEXAS_CMD("Cmd_SCShowTableCardsRsp", 394, 394, Cmd_SCShowTableCardsRsp_VALUE);
            Cmd_SCReportLocationInfoRsp = new TEXAS_CMD("Cmd_SCReportLocationInfoRsp", 395, 395, Cmd_SCReportLocationInfoRsp_VALUE);
            Cmd_SCCreateLeagueRsp = new TEXAS_CMD("Cmd_SCCreateLeagueRsp", 396, 396, Cmd_SCCreateLeagueRsp_VALUE);
            Cmd_SCEnterLeagueRsp = new TEXAS_CMD("Cmd_SCEnterLeagueRsp", 397, 397, Cmd_SCEnterLeagueRsp_VALUE);
            Cmd_SCLeagueActionRsp = new TEXAS_CMD("Cmd_SCLeagueActionRsp", 398, 398, Cmd_SCLeagueActionRsp_VALUE);
            Cmd_SCSearchLeagueRsp = new TEXAS_CMD("Cmd_SCSearchLeagueRsp", 399, 399, Cmd_SCSearchLeagueRsp_VALUE);
            Cmd_SCSetLeagueSettingRsp = new TEXAS_CMD("Cmd_SCSetLeagueSettingRsp", 400, 400, Cmd_SCSetLeagueSettingRsp_VALUE);
            Cmd_SCQuitLeagueRsp = new TEXAS_CMD("Cmd_SCQuitLeagueRsp", 401, 401, Cmd_SCQuitLeagueRsp_VALUE);
            Cmd_SCGetLeagueBaseInfoByLeagueIDRsp = new TEXAS_CMD("Cmd_SCGetLeagueBaseInfoByLeagueIDRsp", 402, 402, Cmd_SCGetLeagueBaseInfoByLeagueIDRsp_VALUE);
            Cmd_SCGetLeagueByLeagueIDRsp = new TEXAS_CMD("Cmd_SCGetLeagueByLeagueIDRsp", 403, 403, Cmd_SCGetLeagueByLeagueIDRsp_VALUE);
            Cmd_SCGetLeagueInfoByClubIDRsp = new TEXAS_CMD("Cmd_SCGetLeagueInfoByClubIDRsp", 404, 404, Cmd_SCGetLeagueInfoByClubIDRsp_VALUE);
            Cmd_SCAddLeagueMaxMemberRsp = new TEXAS_CMD("Cmd_SCAddLeagueMaxMemberRsp", 405, 405, Cmd_SCAddLeagueMaxMemberRsp_VALUE);
            Cmd_CSSystemLeagueMsgRsp = new TEXAS_CMD("Cmd_CSSystemLeagueMsgRsp", 406, 406, Cmd_CSSystemLeagueMsgRsp_VALUE);
            Cmd_SCGetMyClubsV2Rsp = new TEXAS_CMD("Cmd_SCGetMyClubsV2Rsp", 407, 407, Cmd_SCGetMyClubsV2Rsp_VALUE);
            Cmd_SCGetGameRoomLeagueClubsRsp = new TEXAS_CMD("Cmd_SCGetGameRoomLeagueClubsRsp", 408, 408, Cmd_SCGetGameRoomLeagueClubsRsp_VALUE);
            Cmd_SCBuyBuyInV2Rsp = new TEXAS_CMD("Cmd_SCBuyBuyInV2Rsp", 409, 409, Cmd_SCBuyBuyInV2Rsp_VALUE);
            Cmd_SCGetFlashPageInfosRsp = new TEXAS_CMD("Cmd_SCGetFlashPageInfosRsp", 410, 410, Cmd_SCGetFlashPageInfosRsp_VALUE);
            Cmd_SCGetFrontPageInfoV4Rsp = new TEXAS_CMD("Cmd_SCGetFrontPageInfoV4Rsp", 411, 411, Cmd_SCGetFrontPageInfoV4Rsp_VALUE);
            Cmd_SCGetBillInfosV2Rsp = new TEXAS_CMD("Cmd_SCGetBillInfosV2Rsp", 412, 412, Cmd_SCGetBillInfosV2Rsp_VALUE);
            Cmd_SCSetGameThinkingIntervalRsp = new TEXAS_CMD("Cmd_SCSetGameThinkingIntervalRsp", 413, 413, Cmd_SCSetGameThinkingIntervalRsp_VALUE);
            Cmd_SCForceStandupRsp = new TEXAS_CMD("Cmd_SCForceStandupRsp", 414, 414, Cmd_SCForceStandupRsp_VALUE);
            Cmd_SCSetStraddleRsp = new TEXAS_CMD("Cmd_SCSetStraddleRsp", 415, 415, Cmd_SCSetStraddleRsp_VALUE);
            Cmd_SCGetFestivalModeRsp = new TEXAS_CMD("Cmd_SCGetFestivalModeRsp", 416, 416, Cmd_SCGetFestivalModeRsp_VALUE);
            Cmd_CSMiniGameStart = new TEXAS_CMD("Cmd_CSMiniGameStart", 417, 417, Cmd_CSMiniGameStart_VALUE);
            Cmd_CSMiniGameChange = new TEXAS_CMD("Cmd_CSMiniGameChange", 418, 418, Cmd_CSMiniGameChange_VALUE);
            Cmd_CSMiniGameDouble = new TEXAS_CMD("Cmd_CSMiniGameDouble", 419, 419, Cmd_CSMiniGameDouble_VALUE);
            Cmd_CSMiniGameCheck = new TEXAS_CMD("Cmd_CSMiniGameCheck", 420, 420, Cmd_CSMiniGameCheck_VALUE);
            Cmd_CSMiniGameExit = new TEXAS_CMD("Cmd_CSMiniGameExit", 421, 421, Cmd_CSMiniGameExit_VALUE);
            Cmd_CSMiniGameIni = new TEXAS_CMD("Cmd_CSMiniGameIni", 422, 422, Cmd_CSMiniGameIni_VALUE);
            Cmd_SCMiniGameStartRsp = new TEXAS_CMD("Cmd_SCMiniGameStartRsp", 423, 423, Cmd_SCMiniGameStartRsp_VALUE);
            Cmd_SCMiniGameChangeRsp = new TEXAS_CMD("Cmd_SCMiniGameChangeRsp", 424, 424, Cmd_SCMiniGameChangeRsp_VALUE);
            Cmd_SCMiniGameDoubleRsp = new TEXAS_CMD("Cmd_SCMiniGameDoubleRsp", 425, 425, Cmd_SCMiniGameDoubleRsp_VALUE);
            Cmd_SCMiniGameCheckRsp = new TEXAS_CMD("Cmd_SCMiniGameCheckRsp", 426, 426, Cmd_SCMiniGameCheckRsp_VALUE);
            Cmd_SCMiniGameExitRsp = new TEXAS_CMD("Cmd_SCMiniGameExitRsp", 427, 427, Cmd_SCMiniGameExitRsp_VALUE);
            Cmd_SCMiniGameIniRsp = new TEXAS_CMD("Cmd_SCMiniGameIniRsp", 428, 428, Cmd_SCMiniGameIniRsp_VALUE);
            ENUM$VALUES = new TEXAS_CMD[]{Cmd_CSRegister, Cmd_CSUploadPhoneNumber, Cmd_CSUploadVerifyCode, Cmd_CSLoginWeibo, Cmd_CSLogin, Cmd_CSGetUserInfo, Cmd_CSGetGameInfo, Cmd_CSUploadFriendRelation, Cmd_CSGetFriendStatus, Cmd_CSInviteAction, Cmd_CSHello, Cmd_CSUpdate, Cmd_CSQuickLogin, Cmd_CSUploadPhoneBook, Cmd_CSCreateChatRoom, Cmd_CSCreateGameRoom, Cmd_CSGetFrontPageInfo, Cmd_CSGetChatRoomInfoByRoomID, Cmd_CSGetChatRoomInfosByUuid, Cmd_CSGetGameRoomInfo, Cmd_CSSendMsg, Cmd_SCPushMsg, Cmd_SCSystemFriendMsg, Cmd_SCSystemChatRoomMsg, Cmd_SCSystemGameRoomMsg, Cmd_CSReconnect, Cmd_CSEnterGameRoom, Cmd_CSRemoveFriend, Cmd_CSSearchFriend, Cmd_CSFeedback, Cmd_CSSetChatRoomUser, Cmd_CSAddChatRoomUser, Cmd_CSRemoveChatRoomUser, Cmd_CSSetChatRoomInfo, Cmd_CSUploadIcon, Cmd_CSSetUserInfo, Cmd_CSGameAction, Cmd_SCGameRoomStateChange, Cmd_CSLeaveChatRoom, Cmd_CSLeaveGameRoom, Cmd_CSKickUserGameRoom, Cmd_CSRemoveChatRoom, Cmd_CSGetCoinStoreList, Cmd_CSBuyCoin, Cmd_CSGetSellingItemList, Cmd_CSBuySellingItem, Cmd_CSGetItemList, Cmd_CSGetDefaultSetting, Cmd_CSSitDown, Cmd_CSStandUp, Cmd_CSBuyBuyIn, Cmd_CSGetBillInfos, Cmd_CSSaveFavorite, Cmd_CSGetFavoriteList, Cmd_SCSystemMsg, Cmd_CSRemoveBill, Cmd_CSRemoveFavorite, Cmd_CSLoginReward, Cmd_CSGetLoginReward, Cmd_CSShareOut, Cmd_SCKickOffPush, Cmd_CSStartGame, Cmd_CSLogout, Cmd_CSGetUserGameInfoInRoom, Cmd_CSResetPwdUploadPhonenumber, Cmd_CSResetPwdVerifyCode, Cmd_CSGetGameRoomInfoByRoomID, Cmd_CSSaveFavoriteUrl, Cmd_CSRegetVerifyCode, Cmd_CSSetChatInfoSetting, Cmd_CSSetUserInfoSetting, Cmd_CSSendMsgToAll, Cmd_CSAddFriend, Cmd_CSUploadChatRoomIcon, Cmd_CSGetBillInfoByRoomID, Cmd_CSCreateOfflineGame, Cmd_SCSystemOfflineGameRoomMsg, Cmd_CSJoinOfflineGameRoom, Cmd_CSUnJoinOfflineGameRoom, Cmd_CSOverOfflineGameRoom, Cmd_CSCancelOfflineGameRoom, Cmd_CSChangeOfflineGameRoom, Cmd_CSGetOfflineOverGameInfo, Cmd_CSUseItem, Cmd_SCUseItemPushMsg, Cmd_CSAdminAddCoin, Cmd_CSCreateClub, Cmd_CSEnterClub, Cmd_CSClubAction, Cmd_SCSystemClubMsg, Cmd_CSSearchClub, Cmd_CSGetClubsByLocation, Cmd_CSGetHotClubs, Cmd_CSSetClubInfo, Cmd_CSSetClubUserLevel, Cmd_CSUploadClubICon, Cmd_CSUploadClubCover, Cmd_CSGetMyClubs, Cmd_CSSetClubSetting, Cmd_CSQuitClub, Cmd_CSSetClubFund, Cmd_CSGetClubByClubID, Cmd_CSGetFundBillInfos, Cmd_CSUploadSGScore, Cmd_CSDeleteClubCover, Cmd_CSGetClubInfoByUuid, Cmd_CSUploadUserCover, Cmd_CSDeleteUserCover, Cmd_CSGetChatRoomUsersByRoomID, Cmd_CSGetChatRoomGamesByRoomID, Cmd_CSGetClubUsersByClubID, Cmd_CSGetClubGamesByClubID, Cmd_CSGetClubBaseInfoByClubID, Cmd_CSGetFrontPageInfoV2, Cmd_CSGetRecommendClubs, Cmd_CSUseDelayItem, Cmd_CSGetAllBannerInfo, Cmd_CSSetBannerInfo, Cmd_CSGetAllRecommendUserInfo, Cmd_CSSetRecommendUser, Cmd_CSSearchUser, Cmd_CSShowCard, Cmd_CSGameActionV3, Cmd_CSCreateQuickGameRoom, Cmd_CSEnterQuickGameRoom, Cmd_CSStandUpV3, Cmd_CSStartQuickRoomGame, Cmd_CSGetQuickGameRoom, Cmd_CSGiveMoney, Cmd_SCGiveMoneyPushMsg, Cmd_CSQuitQuickGameRoom, Cmd_SCSystemQuickGameRoomMsg, Cmd_CSGetFrontPageInfoV3, Cmd_CSGetBannerInfos, Cmd_CSAdminAddClubFund, Cmd_CSGetUserInfoV2, Cmd_CSGetSystemMsgs, Cmd_CSGetSystemMsgByID, Cmd_CSGetBenefits, Cmd_CSGetSystemMsgByTypeCMS, Cmd_CSGetSystemMsgByIDCMS, Cmd_CSSendSystemMsgCMS, Cmd_CSAddClubMaxMember, Cmd_CSAddClubFund, Cmd_CSGetClubSellingItems, Cmd_CSBuyNickname, Cmd_CSCheckNicknameStatus, Cmd_CSResetBuyinRatio, Cmd_CSGetUserBaseInfo, Cmd_CSSaveFavoriteV2, Cmd_CSGetFavoriteListV2, Cmd_CSGetLastPokerHandResult, Cmd_CSCSGetAllPokerHistory, Cmd_CSRemoveFavoriteV2, Cmd_CSRenameFavorite, Cmd_SCBuyinControlMsg, Cmd_CSBuyinAction, Cmd_CSSetBuyinControlState, Cmd_CSPauseGame, Cmd_CSGetAllBuyinControls, Cmd_CSRenameFPokerHistory, Cmd_CSCreateSNGGameRoom, Cmd_CSSignUpSNGGameRoom, Cmd_CSWatchSNGGameRoom, Cmd_CSLeaveSNGGameRoom, Cmd_CSCreateQuickSNGGameRoom, Cmd_CSPreBuyCoinAndroid, Cmd_CSBuyCoinAndroid, Cmd_CSReturnGame, Cmd_CSStopSNGGame, Cmd_CSLoginThirdParty, Cmd_CSHelloGame, Cmd_CSBuyInsurance, Cmd_CSCreatorInsuranceSetting, Cmd_CSUserInsuranceSetting, Cmd_CSBuyInsuranceDelay, Cmd_CSForceBB, Cmd_CSGetGameSetting, Cmd_CSSetUserInfoNew, Cmd_CSRemarkUserNickName, Cmd_CSGetPokerHandResultByHandID, Cmd_CSShareFavorite, Cmd_CSUserDelegate, Cmd_CSKickUserInGame, Cmd_CSUploadAPNToken, Cmd_CSCancelGame, Cmd_CSShowTableCards, Cmd_CSReportLocationInfo, Cmd_CSCreateLeague, Cmd_CSEnterLeague, Cmd_CSLeagueAction, Cmd_CSSearchLeague, Cmd_CSSetLeagueSetting, Cmd_CSQuitLeague, Cmd_CSGetLeagueBaseInfoByLeagueID, Cmd_CSGetLeagueByLeagueID, Cmd_CSGetLeagueInfoByClubID, Cmd_CSAddLeagueMaxMember, Cmd_SCSystemLeagueMsg, Cmd_CSGetMyClubsV2, Cmd_CSGetGameRoomLeagueClubs, Cmd_CSBuyBuyInV2, Cmd_CSGetFlashPageInfos, Cmd_CSGetFrontPageInfoV4, Cmd_CSGetBillInfosV2, Cmd_CSSetGameThinkingInterval, Cmd_CSForceStandup, Cmd_CSSetStraddle, Cmd_CSGetFestivalMode, Cmd_SCRegisterRsp, Cmd_SCUploadPhoneNumberRsp, Cmd_SCUploadVerifyCodeRsp, Cmd_SCLoginWeiboRsp, Cmd_SCLoginRsp, Cmd_SCGetUserInfoRsp, Cmd_SCGetGameInfoRsp, Cmd_SCUploadFriendRelationRsp, Cmd_SCGetFriendStatusRsp, Cmd_SCInviteActionRsp, Cmd_SCHelloRsp, Cmd_SCUpdateRsp, Cmd_SCQuickLoginRsp, Cmd_SCUploadPhoneBookRsp, Cmd_SCCreateChatRoomRsp, Cmd_SCCreateGameRoomRsp, Cmd_SCGetFrontPageInfoRsp, Cmd_SCGetChatRoomInfoByRoomIDRsp, Cmd_SCGetChatRoomInfosByUuidRsp, Cmd_SCGetGameRoomInfoRsp, Cmd_SCSendMsgRsp, Cmd_CSPushMsgRsp, Cmd_CSSystemFriendMsgRsp, Cmd_CSSystemChatRoomMsgRsp, Cmd_CSSystemGameRoomMsgRsp, Cmd_SCReconnectRsp, Cmd_SCEnterGameRoomRsp, Cmd_SCRemoveFriendRsp, Cmd_SCSearchFriendRsp, Cmd_SCFeedbackRsp, Cmd_SCSetChatRoomUserRsp, Cmd_SCAddChatRoomUserRsp, Cmd_SCRemoveChatRoomUserRsp, Cmd_SCSetChatRoomInfoRsp, Cmd_SCUploadIconRsp, Cmd_SCSetUserInfoRsp, Cmd_SCGameActionRsp, Cmd_CSGameRoomStateChangeRsp, Cmd_SCLeaveChatRoomRsp, Cmd_SCLeaveGameRoomRsp, Cmd_SCKickUserGameRoomRsp, Cmd_SCRemoveChatRoomRsp, Cmd_SCGetCoinStoreListRsp, Cmd_SCBuyCoinRsp, Cmd_SCGetSellingItemListRsp, Cmd_SCBuySellingItemRsp, Cmd_SCGetItemListRsp, Cmd_SCGetDefaultSettingRsp, Cmd_SCSitDownRsp, Cmd_SCStandUpRsp, Cmd_SCBuyBuyInRsp, Cmd_SCGetBillInfosRsp, Cmd_SCSaveFavoriteRsp, Cmd_SCGetFavoriteListRsp, Cmd_CSSystemMsgRsp, Cmd_SCRemoveBillRsp, Cmd_SCRemoveFavoriteRsp, Cmd_SCLoginRewardRsp, Cmd_SCGetLoginRewardRsp, Cmd_SCShareOutRsp, Cmd_SCStartGameRsp, Cmd_SCLogoutRsp, Cmd_SCGetUserGameInfoInRoomRsp, Cmd_SCResetPwdUploadPhonenumberRsp, Cmd_SCResetPwdVerifyCodeRsp, Cmd_SCGetGameRoomInfoByRoomIDRsp, Cmd_SCSaveFavoriteUrlRsp, Cmd_SCRegetVerifyCodeRsp, Cmd_SCSetChatInfoSettingRsp, Cmd_SCSetUserInfoSettingRsp, Cmd_SCSendMsgToAllRsp, Cmd_SCAddFriendRsp, Cmd_SCUploadChatRoomIconRsp, Cmd_SCGetBillInfoByRoomIDRsp, Cmd_SCCreateOfflineGameRsp, Cmd_CSSystemOfflineGameRoomMsgRsp, Cmd_SCJoinOfflineGameRoomRsp, Cmd_SCUnJoinOfflineGameRoomRsp, Cmd_SCOverOfflineGameRoomRsp, Cmd_SCCancelOfflineGameRoomRsp, Cmd_SCChangeOfflineGameRoomRsp, Cmd_SCGetOfflineOverGameInfoRsp, Cmd_SCUseItemRsp, Cmd_CSUseItemPushMsgRsp, Cmd_SCAdminAddCoinRsp, Cmd_SCCreateClubRsp, Cmd_SCEnterClubRsp, Cmd_SCClubActionRsp, Cmd_CSSystemClubMsgRsp, Cmd_SCSearchClubRsp, Cmd_SCGetClubsByLocationRsp, Cmd_SCGetHotClubsRsp, Cmd_SCSetClubInfoRsp, Cmd_SCSetClubUserLevelRsp, Cmd_SCUploadClubIConRsp, Cmd_SCUploadClubCoverRsp, Cmd_SCGetMyClubsRsp, Cmd_SCSetClubSettingRsp, Cmd_SCQuitClubRsp, Cmd_SCSetClubFundRsp, Cmd_SCGetClubByClubIDRsp, Cmd_SCGetFundBillInfosRsp, Cmd_SCUploadSGScoreRsp, Cmd_SCDeleteClubCoverRsp, Cmd_SCGetClubInfoByUuidRsp, Cmd_SCUploadUserCoverRsp, Cmd_SCDeleteUserCoverRsp, Cmd_SCGetChatRoomUsersByRoomIDRsp, Cmd_SCGetChatRoomGamesByRoomIDRsp, Cmd_SCGetClubUsersByClubIDRsp, Cmd_SCGetClubGamesByClubIDRsp, Cmd_SCGetClubBaseInfoByClubIDRsp, Cmd_SCGetFrontPageInfoV2Rsp, Cmd_SCGetRecommendClubsRsp, Cmd_SCUseDelayItemRsp, Cmd_SCGetAllBannerInfoRsp, Cmd_SCSetBannerInfoRsp, Cmd_SCGetAllRecommendUserInfoRsp, Cmd_SCSetRecommendUserRsp, Cmd_SCSearchUserRsp, Cmd_SCShowCardRsp, Cmd_SCGameActionV3Rsp, Cmd_SCCreateQuickGameRoomRsp, Cmd_SCEnterQuickGameRoomRsp, Cmd_SCStandUpV3Rsp, Cmd_SCStartQuickRoomGameRsp, Cmd_SCGetQuickGameRoomRsp, Cmd_SCGiveMoneyRsp, Cmd_CSGiveMoneyPushMsgRsp, Cmd_SCQuitQuickGameRoomRsp, Cmd_CSSystemQuickGameRoomMsgRsp, Cmd_SCGetFrontPageInfoV3Rsp, Cmd_SCGetBannerInfosRsp, Cmd_SCAdminAddClubFundRsp, Cmd_SCGetUserInfoV2Rsp, Cmd_SCGetSystemMsgsRsp, Cmd_SCGetSystemMsgByIDRsp, Cmd_SCGetBenefitsRsp, Cmd_SCGetSystemMsgsByTypeCMSRsp, Cmd_SCGetSystemMsgByIDCMSRsp, Cmd_SCSendSystemMsgCMSRsp, Cmd_SCAddClubMaxMemberRsp, Cmd_SCAddClubFundRsp, Cmd_SCGetClubSellingItemsRsp, Cmd_SCBuyNicknameRsp, Cmd_SCCheckNicknameStatusRsp, Cmd_SCResetBuyinRatioRsp, Cmd_SCGetUserBaseInfoRsp, Cmd_SCSaveFavoriteV2Rsp, Cmd_SCGetFavoriteListV2Rsp, Cmd_SCGetLastPokerHandResultRsp, Cmd_SCGetAllPokerHistoryRsp, Cmd_SCRemoveFavoriteV2Rsp, Cmd_SCRenameFavoriteRsp, Cmd_CSBuyinControlMsgRsp, Cmd_SCBuyinActionRsp, Cmd_SCSetBuyinControlStateRsp, Cmd_SCPauseGameRsp, Cmd_SCGetAllBuyinControlsRsp, Cmd_SCRenameFPokerHistoryRsp, Cmd_SCCreateSNGGameRoomRsp, Cmd_SCSignUpSNGGameRoomRsp, Cmd_SCWatchSNGGameRoomRsp, Cmd_SCLeaveSNGGameRoomRsp, Cmd_SCCreateQuickSNGGameRoomRsp, Cmd_SCPreBuyCoinAndroidRsp, Cmd_SCBuyCoinAndroidRsp, Cmd_SCReturnGameRsp, Cmd_SCStopSNGGameRsp, Cmd_SCLoginThirdPartyRsp, Cmd_SCHelloGameRsp, Cmd_SCBuyInsuranceRsp, Cmd_SCCreatorInsuranceSettingRsp, Cmd_SCUserInsuranceSettingRsp, Cmd_SCBuyInsuranceDelayRsp, Cmd_SCForceBBRsp, Cmd_SCGetGameSettingRsp, Cmd_SCSetUserInfoNewRsp, Cmd_SCRemarkUserNickNameRsp, Cmd_SCGetPokerHandResultByHandIDRsp, Cmd_SCShareFavoriteRsp, Cmd_SCUserDelegateRsp, Cmd_SCKickUserInGameRsp, Cmd_SCUploadAPNTokenRsp, Cmd_SCCancelGameRsp, Cmd_SCShowTableCardsRsp, Cmd_SCReportLocationInfoRsp, Cmd_SCCreateLeagueRsp, Cmd_SCEnterLeagueRsp, Cmd_SCLeagueActionRsp, Cmd_SCSearchLeagueRsp, Cmd_SCSetLeagueSettingRsp, Cmd_SCQuitLeagueRsp, Cmd_SCGetLeagueBaseInfoByLeagueIDRsp, Cmd_SCGetLeagueByLeagueIDRsp, Cmd_SCGetLeagueInfoByClubIDRsp, Cmd_SCAddLeagueMaxMemberRsp, Cmd_CSSystemLeagueMsgRsp, Cmd_SCGetMyClubsV2Rsp, Cmd_SCGetGameRoomLeagueClubsRsp, Cmd_SCBuyBuyInV2Rsp, Cmd_SCGetFlashPageInfosRsp, Cmd_SCGetFrontPageInfoV4Rsp, Cmd_SCGetBillInfosV2Rsp, Cmd_SCSetGameThinkingIntervalRsp, Cmd_SCForceStandupRsp, Cmd_SCSetStraddleRsp, Cmd_SCGetFestivalModeRsp, Cmd_CSMiniGameStart, Cmd_CSMiniGameChange, Cmd_CSMiniGameDouble, Cmd_CSMiniGameCheck, Cmd_CSMiniGameExit, Cmd_CSMiniGameIni, Cmd_SCMiniGameStartRsp, Cmd_SCMiniGameChangeRsp, Cmd_SCMiniGameDoubleRsp, Cmd_SCMiniGameCheckRsp, Cmd_SCMiniGameExitRsp, Cmd_SCMiniGameIniRsp};
            internalValueMap = new C00821();
            VALUES = values();
        }

        public static TEXAS_CMD valueOf(int i) {
            switch (i) {
                case Cmd_CSRegister_VALUE:
                    return Cmd_CSRegister;
                case Cmd_CSUploadPhoneNumber_VALUE:
                    return Cmd_CSUploadPhoneNumber;
                case Cmd_CSUploadVerifyCode_VALUE:
                    return Cmd_CSUploadVerifyCode;
                case Cmd_CSLoginWeibo_VALUE:
                    return Cmd_CSLoginWeibo;
                case Cmd_CSLogin_VALUE:
                    return Cmd_CSLogin;
                case Cmd_CSGetUserInfo_VALUE:
                    return Cmd_CSGetUserInfo;
                case Cmd_CSGetGameInfo_VALUE:
                    return Cmd_CSGetGameInfo;
                case Cmd_CSUploadFriendRelation_VALUE:
                    return Cmd_CSUploadFriendRelation;
                case Cmd_CSGetFriendStatus_VALUE:
                    return Cmd_CSGetFriendStatus;
                case Cmd_CSInviteAction_VALUE:
                    return Cmd_CSInviteAction;
                case Cmd_CSHello_VALUE:
                    return Cmd_CSHello;
                case Cmd_CSUpdate_VALUE:
                    return Cmd_CSUpdate;
                case Cmd_CSQuickLogin_VALUE:
                    return Cmd_CSQuickLogin;
                case Cmd_CSUploadPhoneBook_VALUE:
                    return Cmd_CSUploadPhoneBook;
                case Cmd_CSCreateChatRoom_VALUE:
                    return Cmd_CSCreateChatRoom;
                case Cmd_CSCreateGameRoom_VALUE:
                    return Cmd_CSCreateGameRoom;
                case Cmd_CSGetFrontPageInfo_VALUE:
                    return Cmd_CSGetFrontPageInfo;
                case Cmd_CSGetChatRoomInfoByRoomID_VALUE:
                    return Cmd_CSGetChatRoomInfoByRoomID;
                case Cmd_CSGetChatRoomInfosByUuid_VALUE:
                    return Cmd_CSGetChatRoomInfosByUuid;
                case Cmd_CSGetGameRoomInfo_VALUE:
                    return Cmd_CSGetGameRoomInfo;
                case Cmd_CSSendMsg_VALUE:
                    return Cmd_CSSendMsg;
                case Cmd_SCPushMsg_VALUE:
                    return Cmd_SCPushMsg;
                case Cmd_SCSystemFriendMsg_VALUE:
                    return Cmd_SCSystemFriendMsg;
                case Cmd_SCSystemChatRoomMsg_VALUE:
                    return Cmd_SCSystemChatRoomMsg;
                case Cmd_SCSystemGameRoomMsg_VALUE:
                    return Cmd_SCSystemGameRoomMsg;
                case Cmd_CSReconnect_VALUE:
                    return Cmd_CSReconnect;
                case Cmd_CSEnterGameRoom_VALUE:
                    return Cmd_CSEnterGameRoom;
                case Cmd_CSRemoveFriend_VALUE:
                    return Cmd_CSRemoveFriend;
                case Cmd_CSSearchFriend_VALUE:
                    return Cmd_CSSearchFriend;
                case Cmd_CSFeedback_VALUE:
                    return Cmd_CSFeedback;
                case Cmd_CSSetChatRoomUser_VALUE:
                    return Cmd_CSSetChatRoomUser;
                case Cmd_CSAddChatRoomUser_VALUE:
                    return Cmd_CSAddChatRoomUser;
                case Cmd_CSRemoveChatRoomUser_VALUE:
                    return Cmd_CSRemoveChatRoomUser;
                case Cmd_CSSetChatRoomInfo_VALUE:
                    return Cmd_CSSetChatRoomInfo;
                case Cmd_CSUploadIcon_VALUE:
                    return Cmd_CSUploadIcon;
                case Cmd_CSSetUserInfo_VALUE:
                    return Cmd_CSSetUserInfo;
                case Cmd_CSGameAction_VALUE:
                    return Cmd_CSGameAction;
                case Cmd_SCGameRoomStateChange_VALUE:
                    return Cmd_SCGameRoomStateChange;
                case Cmd_CSLeaveChatRoom_VALUE:
                    return Cmd_CSLeaveChatRoom;
                case Cmd_CSLeaveGameRoom_VALUE:
                    return Cmd_CSLeaveGameRoom;
                case Cmd_CSKickUserGameRoom_VALUE:
                    return Cmd_CSKickUserGameRoom;
                case Cmd_CSRemoveChatRoom_VALUE:
                    return Cmd_CSRemoveChatRoom;
                case Cmd_CSGetCoinStoreList_VALUE:
                    return Cmd_CSGetCoinStoreList;
                case Cmd_CSBuyCoin_VALUE:
                    return Cmd_CSBuyCoin;
                case Cmd_CSGetSellingItemList_VALUE:
                    return Cmd_CSGetSellingItemList;
                case Cmd_CSBuySellingItem_VALUE:
                    return Cmd_CSBuySellingItem;
                case Cmd_CSGetItemList_VALUE:
                    return Cmd_CSGetItemList;
                case Cmd_CSGetDefaultSetting_VALUE:
                    return Cmd_CSGetDefaultSetting;
                case Cmd_CSSitDown_VALUE:
                    return Cmd_CSSitDown;
                case Cmd_CSStandUp_VALUE:
                    return Cmd_CSStandUp;
                case Cmd_CSBuyBuyIn_VALUE:
                    return Cmd_CSBuyBuyIn;
                case Cmd_CSGetBillInfos_VALUE:
                    return Cmd_CSGetBillInfos;
                case Cmd_CSSaveFavorite_VALUE:
                    return Cmd_CSSaveFavorite;
                case Cmd_CSGetFavoriteList_VALUE:
                    return Cmd_CSGetFavoriteList;
                case Cmd_SCSystemMsg_VALUE:
                    return Cmd_SCSystemMsg;
                case Cmd_CSRemoveBill_VALUE:
                    return Cmd_CSRemoveBill;
                case Cmd_CSRemoveFavorite_VALUE:
                    return Cmd_CSRemoveFavorite;
                case Cmd_CSLoginReward_VALUE:
                    return Cmd_CSLoginReward;
                case Cmd_CSGetLoginReward_VALUE:
                    return Cmd_CSGetLoginReward;
                case Cmd_CSShareOut_VALUE:
                    return Cmd_CSShareOut;
                case Cmd_SCKickOffPush_VALUE:
                    return Cmd_SCKickOffPush;
                case Cmd_CSStartGame_VALUE:
                    return Cmd_CSStartGame;
                case Cmd_CSLogout_VALUE:
                    return Cmd_CSLogout;
                case Cmd_CSGetUserGameInfoInRoom_VALUE:
                    return Cmd_CSGetUserGameInfoInRoom;
                case Cmd_CSResetPwdUploadPhonenumber_VALUE:
                    return Cmd_CSResetPwdUploadPhonenumber;
                case Cmd_CSResetPwdVerifyCode_VALUE:
                    return Cmd_CSResetPwdVerifyCode;
                case Cmd_CSGetGameRoomInfoByRoomID_VALUE:
                    return Cmd_CSGetGameRoomInfoByRoomID;
                case Cmd_CSSaveFavoriteUrl_VALUE:
                    return Cmd_CSSaveFavoriteUrl;
                case Cmd_CSRegetVerifyCode_VALUE:
                    return Cmd_CSRegetVerifyCode;
                case Cmd_CSSetChatInfoSetting_VALUE:
                    return Cmd_CSSetChatInfoSetting;
                case Cmd_CSSetUserInfoSetting_VALUE:
                    return Cmd_CSSetUserInfoSetting;
                case Cmd_CSSendMsgToAll_VALUE:
                    return Cmd_CSSendMsgToAll;
                case Cmd_CSAddFriend_VALUE:
                    return Cmd_CSAddFriend;
                case Cmd_CSUploadChatRoomIcon_VALUE:
                    return Cmd_CSUploadChatRoomIcon;
                case Cmd_CSGetBillInfoByRoomID_VALUE:
                    return Cmd_CSGetBillInfoByRoomID;
                case Cmd_CSCreateOfflineGame_VALUE:
                    return Cmd_CSCreateOfflineGame;
                case Cmd_SCSystemOfflineGameRoomMsg_VALUE:
                    return Cmd_SCSystemOfflineGameRoomMsg;
                case Cmd_CSJoinOfflineGameRoom_VALUE:
                    return Cmd_CSJoinOfflineGameRoom;
                case Cmd_CSUnJoinOfflineGameRoom_VALUE:
                    return Cmd_CSUnJoinOfflineGameRoom;
                case Cmd_CSOverOfflineGameRoom_VALUE:
                    return Cmd_CSOverOfflineGameRoom;
                case Cmd_CSCancelOfflineGameRoom_VALUE:
                    return Cmd_CSCancelOfflineGameRoom;
                case Cmd_CSChangeOfflineGameRoom_VALUE:
                    return Cmd_CSChangeOfflineGameRoom;
                case Cmd_CSGetOfflineOverGameInfo_VALUE:
                    return Cmd_CSGetOfflineOverGameInfo;
                case Cmd_CSUseItem_VALUE:
                    return Cmd_CSUseItem;
                case Cmd_SCUseItemPushMsg_VALUE:
                    return Cmd_SCUseItemPushMsg;
                case Cmd_CSAdminAddCoin_VALUE:
                    return Cmd_CSAdminAddCoin;
                case Cmd_CSCreateClub_VALUE:
                    return Cmd_CSCreateClub;
                case Cmd_CSEnterClub_VALUE:
                    return Cmd_CSEnterClub;
                case Cmd_CSClubAction_VALUE:
                    return Cmd_CSClubAction;
                case Cmd_SCSystemClubMsg_VALUE:
                    return Cmd_SCSystemClubMsg;
                case Cmd_CSSearchClub_VALUE:
                    return Cmd_CSSearchClub;
                case Cmd_CSGetClubsByLocation_VALUE:
                    return Cmd_CSGetClubsByLocation;
                case Cmd_CSGetHotClubs_VALUE:
                    return Cmd_CSGetHotClubs;
                case Cmd_CSSetClubInfo_VALUE:
                    return Cmd_CSSetClubInfo;
                case Cmd_CSSetClubUserLevel_VALUE:
                    return Cmd_CSSetClubUserLevel;
                case Cmd_CSUploadClubICon_VALUE:
                    return Cmd_CSUploadClubICon;
                case Cmd_CSUploadClubCover_VALUE:
                    return Cmd_CSUploadClubCover;
                case Cmd_CSGetMyClubs_VALUE:
                    return Cmd_CSGetMyClubs;
                case Cmd_CSSetClubSetting_VALUE:
                    return Cmd_CSSetClubSetting;
                case Cmd_CSQuitClub_VALUE:
                    return Cmd_CSQuitClub;
                case Cmd_CSSetClubFund_VALUE:
                    return Cmd_CSSetClubFund;
                case Cmd_CSGetClubByClubID_VALUE:
                    return Cmd_CSGetClubByClubID;
                case Cmd_CSGetFundBillInfos_VALUE:
                    return Cmd_CSGetFundBillInfos;
                case Cmd_CSUploadSGScore_VALUE:
                    return Cmd_CSUploadSGScore;
                case Cmd_CSDeleteClubCover_VALUE:
                    return Cmd_CSDeleteClubCover;
                case Cmd_CSGetClubInfoByUuid_VALUE:
                    return Cmd_CSGetClubInfoByUuid;
                case Cmd_CSUploadUserCover_VALUE:
                    return Cmd_CSUploadUserCover;
                case Cmd_CSDeleteUserCover_VALUE:
                    return Cmd_CSDeleteUserCover;
                case Cmd_CSGetChatRoomUsersByRoomID_VALUE:
                    return Cmd_CSGetChatRoomUsersByRoomID;
                case Cmd_CSGetChatRoomGamesByRoomID_VALUE:
                    return Cmd_CSGetChatRoomGamesByRoomID;
                case Cmd_CSGetClubUsersByClubID_VALUE:
                    return Cmd_CSGetClubUsersByClubID;
                case Cmd_CSGetClubGamesByClubID_VALUE:
                    return Cmd_CSGetClubGamesByClubID;
                case Cmd_CSGetClubBaseInfoByClubID_VALUE:
                    return Cmd_CSGetClubBaseInfoByClubID;
                case Cmd_CSGetFrontPageInfoV2_VALUE:
                    return Cmd_CSGetFrontPageInfoV2;
                case Cmd_CSGetRecommendClubs_VALUE:
                    return Cmd_CSGetRecommendClubs;
                case Cmd_CSUseDelayItem_VALUE:
                    return Cmd_CSUseDelayItem;
                case Cmd_CSGetAllBannerInfo_VALUE:
                    return Cmd_CSGetAllBannerInfo;
                case Cmd_CSSetBannerInfo_VALUE:
                    return Cmd_CSSetBannerInfo;
                case Cmd_CSGetAllRecommendUserInfo_VALUE:
                    return Cmd_CSGetAllRecommendUserInfo;
                case Cmd_CSSetRecommendUser_VALUE:
                    return Cmd_CSSetRecommendUser;
                case Cmd_CSSearchUser_VALUE:
                    return Cmd_CSSearchUser;
                case Cmd_CSShowCard_VALUE:
                    return Cmd_CSShowCard;
                case Cmd_CSGameActionV3_VALUE:
                    return Cmd_CSGameActionV3;
                case Cmd_CSCreateQuickGameRoom_VALUE:
                    return Cmd_CSCreateQuickGameRoom;
                case Cmd_CSEnterQuickGameRoom_VALUE:
                    return Cmd_CSEnterQuickGameRoom;
                case Cmd_CSStandUpV3_VALUE:
                    return Cmd_CSStandUpV3;
                case Cmd_CSStartQuickRoomGame_VALUE:
                    return Cmd_CSStartQuickRoomGame;
                case Cmd_CSGetQuickGameRoom_VALUE:
                    return Cmd_CSGetQuickGameRoom;
                case Cmd_CSGiveMoney_VALUE:
                    return Cmd_CSGiveMoney;
                case Cmd_SCGiveMoneyPushMsg_VALUE:
                    return Cmd_SCGiveMoneyPushMsg;
                case Cmd_CSQuitQuickGameRoom_VALUE:
                    return Cmd_CSQuitQuickGameRoom;
                case Cmd_SCSystemQuickGameRoomMsg_VALUE:
                    return Cmd_SCSystemQuickGameRoomMsg;
                case Cmd_CSGetFrontPageInfoV3_VALUE:
                    return Cmd_CSGetFrontPageInfoV3;
                case Cmd_CSGetBannerInfos_VALUE:
                    return Cmd_CSGetBannerInfos;
                case Cmd_CSAdminAddClubFund_VALUE:
                    return Cmd_CSAdminAddClubFund;
                case Cmd_CSGetUserInfoV2_VALUE:
                    return Cmd_CSGetUserInfoV2;
                case Cmd_CSGetSystemMsgs_VALUE:
                    return Cmd_CSGetSystemMsgs;
                case Cmd_CSGetSystemMsgByID_VALUE:
                    return Cmd_CSGetSystemMsgByID;
                case Cmd_CSGetBenefits_VALUE:
                    return Cmd_CSGetBenefits;
                case Cmd_CSGetSystemMsgByTypeCMS_VALUE:
                    return Cmd_CSGetSystemMsgByTypeCMS;
                case Cmd_CSGetSystemMsgByIDCMS_VALUE:
                    return Cmd_CSGetSystemMsgByIDCMS;
                case Cmd_CSSendSystemMsgCMS_VALUE:
                    return Cmd_CSSendSystemMsgCMS;
                case Cmd_CSAddClubMaxMember_VALUE:
                    return Cmd_CSAddClubMaxMember;
                case Cmd_CSAddClubFund_VALUE:
                    return Cmd_CSAddClubFund;
                case Cmd_CSGetClubSellingItems_VALUE:
                    return Cmd_CSGetClubSellingItems;
                case Cmd_CSBuyNickname_VALUE:
                    return Cmd_CSBuyNickname;
                case Cmd_CSCheckNicknameStatus_VALUE:
                    return Cmd_CSCheckNicknameStatus;
                case Cmd_CSResetBuyinRatio_VALUE:
                    return Cmd_CSResetBuyinRatio;
                case Cmd_CSGetUserBaseInfo_VALUE:
                    return Cmd_CSGetUserBaseInfo;
                case Cmd_CSSaveFavoriteV2_VALUE:
                    return Cmd_CSSaveFavoriteV2;
                case Cmd_CSGetFavoriteListV2_VALUE:
                    return Cmd_CSGetFavoriteListV2;
                case Cmd_CSGetLastPokerHandResult_VALUE:
                    return Cmd_CSGetLastPokerHandResult;
                case Cmd_CSCSGetAllPokerHistory_VALUE:
                    return Cmd_CSCSGetAllPokerHistory;
                case Cmd_CSRemoveFavoriteV2_VALUE:
                    return Cmd_CSRemoveFavoriteV2;
                case Cmd_CSRenameFavorite_VALUE:
                    return Cmd_CSRenameFavorite;
                case Cmd_SCBuyinControlMsg_VALUE:
                    return Cmd_SCBuyinControlMsg;
                case Cmd_CSBuyinAction_VALUE:
                    return Cmd_CSBuyinAction;
                case Cmd_CSSetBuyinControlState_VALUE:
                    return Cmd_CSSetBuyinControlState;
                case Cmd_CSPauseGame_VALUE:
                    return Cmd_CSPauseGame;
                case Cmd_CSGetAllBuyinControls_VALUE:
                    return Cmd_CSGetAllBuyinControls;
                case Cmd_CSRenameFPokerHistory_VALUE:
                    return Cmd_CSRenameFPokerHistory;
                case Cmd_CSCreateSNGGameRoom_VALUE:
                    return Cmd_CSCreateSNGGameRoom;
                case Cmd_CSSignUpSNGGameRoom_VALUE:
                    return Cmd_CSSignUpSNGGameRoom;
                case Cmd_CSWatchSNGGameRoom_VALUE:
                    return Cmd_CSWatchSNGGameRoom;
                case Cmd_CSLeaveSNGGameRoom_VALUE:
                    return Cmd_CSLeaveSNGGameRoom;
                case Cmd_CSCreateQuickSNGGameRoom_VALUE:
                    return Cmd_CSCreateQuickSNGGameRoom;
                case Cmd_CSPreBuyCoinAndroid_VALUE:
                    return Cmd_CSPreBuyCoinAndroid;
                case Cmd_CSBuyCoinAndroid_VALUE:
                    return Cmd_CSBuyCoinAndroid;
                case Cmd_CSReturnGame_VALUE:
                    return Cmd_CSReturnGame;
                case Cmd_CSStopSNGGame_VALUE:
                    return Cmd_CSStopSNGGame;
                case Cmd_CSLoginThirdParty_VALUE:
                    return Cmd_CSLoginThirdParty;
                case Cmd_CSHelloGame_VALUE:
                    return Cmd_CSHelloGame;
                case Cmd_CSBuyInsurance_VALUE:
                    return Cmd_CSBuyInsurance;
                case Cmd_CSCreatorInsuranceSetting_VALUE:
                    return Cmd_CSCreatorInsuranceSetting;
                case Cmd_CSUserInsuranceSetting_VALUE:
                    return Cmd_CSUserInsuranceSetting;
                case Cmd_CSBuyInsuranceDelay_VALUE:
                    return Cmd_CSBuyInsuranceDelay;
                case Cmd_CSForceBB_VALUE:
                    return Cmd_CSForceBB;
                case Cmd_CSGetGameSetting_VALUE:
                    return Cmd_CSGetGameSetting;
                case Cmd_CSSetUserInfoNew_VALUE:
                    return Cmd_CSSetUserInfoNew;
                case Cmd_CSRemarkUserNickName_VALUE:
                    return Cmd_CSRemarkUserNickName;
                case Cmd_CSGetPokerHandResultByHandID_VALUE:
                    return Cmd_CSGetPokerHandResultByHandID;
                case Cmd_CSShareFavorite_VALUE:
                    return Cmd_CSShareFavorite;
                case Cmd_CSUserDelegate_VALUE:
                    return Cmd_CSUserDelegate;
                case Cmd_CSKickUserInGame_VALUE:
                    return Cmd_CSKickUserInGame;
                case Cmd_CSUploadAPNToken_VALUE:
                    return Cmd_CSUploadAPNToken;
                case Cmd_CSCancelGame_VALUE:
                    return Cmd_CSCancelGame;
                case Cmd_CSShowTableCards_VALUE:
                    return Cmd_CSShowTableCards;
                case Cmd_CSReportLocationInfo_VALUE:
                    return Cmd_CSReportLocationInfo;
                case Cmd_CSCreateLeague_VALUE:
                    return Cmd_CSCreateLeague;
                case Cmd_CSEnterLeague_VALUE:
                    return Cmd_CSEnterLeague;
                case Cmd_CSLeagueAction_VALUE:
                    return Cmd_CSLeagueAction;
                case Cmd_CSSearchLeague_VALUE:
                    return Cmd_CSSearchLeague;
                case Cmd_CSSetLeagueSetting_VALUE:
                    return Cmd_CSSetLeagueSetting;
                case Cmd_CSQuitLeague_VALUE:
                    return Cmd_CSQuitLeague;
                case Cmd_CSGetLeagueBaseInfoByLeagueID_VALUE:
                    return Cmd_CSGetLeagueBaseInfoByLeagueID;
                case Cmd_CSGetLeagueByLeagueID_VALUE:
                    return Cmd_CSGetLeagueByLeagueID;
                case Cmd_CSGetLeagueInfoByClubID_VALUE:
                    return Cmd_CSGetLeagueInfoByClubID;
                case Cmd_CSAddLeagueMaxMember_VALUE:
                    return Cmd_CSAddLeagueMaxMember;
                case Cmd_SCSystemLeagueMsg_VALUE:
                    return Cmd_SCSystemLeagueMsg;
                case Cmd_CSGetMyClubsV2_VALUE:
                    return Cmd_CSGetMyClubsV2;
                case Cmd_CSGetGameRoomLeagueClubs_VALUE:
                    return Cmd_CSGetGameRoomLeagueClubs;
                case Cmd_CSBuyBuyInV2_VALUE:
                    return Cmd_CSBuyBuyInV2;
                case Cmd_CSGetFlashPageInfos_VALUE:
                    return Cmd_CSGetFlashPageInfos;
                case Cmd_CSGetFrontPageInfoV4_VALUE:
                    return Cmd_CSGetFrontPageInfoV4;
                case Cmd_CSGetBillInfosV2_VALUE:
                    return Cmd_CSGetBillInfosV2;
                case Cmd_CSSetGameThinkingInterval_VALUE:
                    return Cmd_CSSetGameThinkingInterval;
                case Cmd_CSForceStandup_VALUE:
                    return Cmd_CSForceStandup;
                case Cmd_CSSetStraddle_VALUE:
                    return Cmd_CSSetStraddle;
                case Cmd_CSGetFestivalMode_VALUE:
                    return Cmd_CSGetFestivalMode;
                case Cmd_SCRegisterRsp_VALUE:
                    return Cmd_SCRegisterRsp;
                case Cmd_SCUploadPhoneNumberRsp_VALUE:
                    return Cmd_SCUploadPhoneNumberRsp;
                case Cmd_SCUploadVerifyCodeRsp_VALUE:
                    return Cmd_SCUploadVerifyCodeRsp;
                case Cmd_SCLoginWeiboRsp_VALUE:
                    return Cmd_SCLoginWeiboRsp;
                case Cmd_SCLoginRsp_VALUE:
                    return Cmd_SCLoginRsp;
                case Cmd_SCGetUserInfoRsp_VALUE:
                    return Cmd_SCGetUserInfoRsp;
                case Cmd_SCGetGameInfoRsp_VALUE:
                    return Cmd_SCGetGameInfoRsp;
                case Cmd_SCUploadFriendRelationRsp_VALUE:
                    return Cmd_SCUploadFriendRelationRsp;
                case Cmd_SCGetFriendStatusRsp_VALUE:
                    return Cmd_SCGetFriendStatusRsp;
                case Cmd_SCInviteActionRsp_VALUE:
                    return Cmd_SCInviteActionRsp;
                case Cmd_SCHelloRsp_VALUE:
                    return Cmd_SCHelloRsp;
                case Cmd_SCUpdateRsp_VALUE:
                    return Cmd_SCUpdateRsp;
                case Cmd_SCQuickLoginRsp_VALUE:
                    return Cmd_SCQuickLoginRsp;
                case Cmd_SCUploadPhoneBookRsp_VALUE:
                    return Cmd_SCUploadPhoneBookRsp;
                case Cmd_SCCreateChatRoomRsp_VALUE:
                    return Cmd_SCCreateChatRoomRsp;
                case Cmd_SCCreateGameRoomRsp_VALUE:
                    return Cmd_SCCreateGameRoomRsp;
                case Cmd_SCGetFrontPageInfoRsp_VALUE:
                    return Cmd_SCGetFrontPageInfoRsp;
                case Cmd_SCGetChatRoomInfoByRoomIDRsp_VALUE:
                    return Cmd_SCGetChatRoomInfoByRoomIDRsp;
                case Cmd_SCGetChatRoomInfosByUuidRsp_VALUE:
                    return Cmd_SCGetChatRoomInfosByUuidRsp;
                case Cmd_SCGetGameRoomInfoRsp_VALUE:
                    return Cmd_SCGetGameRoomInfoRsp;
                case Cmd_SCSendMsgRsp_VALUE:
                    return Cmd_SCSendMsgRsp;
                case Cmd_CSPushMsgRsp_VALUE:
                    return Cmd_CSPushMsgRsp;
                case Cmd_CSSystemFriendMsgRsp_VALUE:
                    return Cmd_CSSystemFriendMsgRsp;
                case Cmd_CSSystemChatRoomMsgRsp_VALUE:
                    return Cmd_CSSystemChatRoomMsgRsp;
                case Cmd_CSSystemGameRoomMsgRsp_VALUE:
                    return Cmd_CSSystemGameRoomMsgRsp;
                case Cmd_SCReconnectRsp_VALUE:
                    return Cmd_SCReconnectRsp;
                case Cmd_SCEnterGameRoomRsp_VALUE:
                    return Cmd_SCEnterGameRoomRsp;
                case Cmd_SCRemoveFriendRsp_VALUE:
                    return Cmd_SCRemoveFriendRsp;
                case Cmd_SCSearchFriendRsp_VALUE:
                    return Cmd_SCSearchFriendRsp;
                case Cmd_SCFeedbackRsp_VALUE:
                    return Cmd_SCFeedbackRsp;
                case Cmd_SCSetChatRoomUserRsp_VALUE:
                    return Cmd_SCSetChatRoomUserRsp;
                case Cmd_SCAddChatRoomUserRsp_VALUE:
                    return Cmd_SCAddChatRoomUserRsp;
                case Cmd_SCRemoveChatRoomUserRsp_VALUE:
                    return Cmd_SCRemoveChatRoomUserRsp;
                case Cmd_SCSetChatRoomInfoRsp_VALUE:
                    return Cmd_SCSetChatRoomInfoRsp;
                case Cmd_SCUploadIconRsp_VALUE:
                    return Cmd_SCUploadIconRsp;
                case Cmd_SCSetUserInfoRsp_VALUE:
                    return Cmd_SCSetUserInfoRsp;
                case Cmd_SCGameActionRsp_VALUE:
                    return Cmd_SCGameActionRsp;
                case Cmd_CSGameRoomStateChangeRsp_VALUE:
                    return Cmd_CSGameRoomStateChangeRsp;
                case Cmd_SCLeaveChatRoomRsp_VALUE:
                    return Cmd_SCLeaveChatRoomRsp;
                case Cmd_SCLeaveGameRoomRsp_VALUE:
                    return Cmd_SCLeaveGameRoomRsp;
                case Cmd_SCKickUserGameRoomRsp_VALUE:
                    return Cmd_SCKickUserGameRoomRsp;
                case Cmd_SCRemoveChatRoomRsp_VALUE:
                    return Cmd_SCRemoveChatRoomRsp;
                case Cmd_SCGetCoinStoreListRsp_VALUE:
                    return Cmd_SCGetCoinStoreListRsp;
                case Cmd_SCBuyCoinRsp_VALUE:
                    return Cmd_SCBuyCoinRsp;
                case Cmd_SCGetSellingItemListRsp_VALUE:
                    return Cmd_SCGetSellingItemListRsp;
                case Cmd_SCBuySellingItemRsp_VALUE:
                    return Cmd_SCBuySellingItemRsp;
                case Cmd_SCGetItemListRsp_VALUE:
                    return Cmd_SCGetItemListRsp;
                case Cmd_SCGetDefaultSettingRsp_VALUE:
                    return Cmd_SCGetDefaultSettingRsp;
                case Cmd_SCSitDownRsp_VALUE:
                    return Cmd_SCSitDownRsp;
                case Cmd_SCStandUpRsp_VALUE:
                    return Cmd_SCStandUpRsp;
                case Cmd_SCBuyBuyInRsp_VALUE:
                    return Cmd_SCBuyBuyInRsp;
                case Cmd_SCGetBillInfosRsp_VALUE:
                    return Cmd_SCGetBillInfosRsp;
                case Cmd_SCSaveFavoriteRsp_VALUE:
                    return Cmd_SCSaveFavoriteRsp;
                case Cmd_SCGetFavoriteListRsp_VALUE:
                    return Cmd_SCGetFavoriteListRsp;
                case Cmd_CSSystemMsgRsp_VALUE:
                    return Cmd_CSSystemMsgRsp;
                case Cmd_SCRemoveBillRsp_VALUE:
                    return Cmd_SCRemoveBillRsp;
                case Cmd_SCRemoveFavoriteRsp_VALUE:
                    return Cmd_SCRemoveFavoriteRsp;
                case Cmd_SCLoginRewardRsp_VALUE:
                    return Cmd_SCLoginRewardRsp;
                case Cmd_SCGetLoginRewardRsp_VALUE:
                    return Cmd_SCGetLoginRewardRsp;
                case Cmd_SCShareOutRsp_VALUE:
                    return Cmd_SCShareOutRsp;
                case Cmd_SCStartGameRsp_VALUE:
                    return Cmd_SCStartGameRsp;
                case Cmd_SCLogoutRsp_VALUE:
                    return Cmd_SCLogoutRsp;
                case Cmd_SCGetUserGameInfoInRoomRsp_VALUE:
                    return Cmd_SCGetUserGameInfoInRoomRsp;
                case Cmd_SCResetPwdUploadPhonenumberRsp_VALUE:
                    return Cmd_SCResetPwdUploadPhonenumberRsp;
                case Cmd_SCResetPwdVerifyCodeRsp_VALUE:
                    return Cmd_SCResetPwdVerifyCodeRsp;
                case Cmd_SCGetGameRoomInfoByRoomIDRsp_VALUE:
                    return Cmd_SCGetGameRoomInfoByRoomIDRsp;
                case Cmd_SCSaveFavoriteUrlRsp_VALUE:
                    return Cmd_SCSaveFavoriteUrlRsp;
                case Cmd_SCRegetVerifyCodeRsp_VALUE:
                    return Cmd_SCRegetVerifyCodeRsp;
                case Cmd_SCSetChatInfoSettingRsp_VALUE:
                    return Cmd_SCSetChatInfoSettingRsp;
                case Cmd_SCSetUserInfoSettingRsp_VALUE:
                    return Cmd_SCSetUserInfoSettingRsp;
                case Cmd_SCSendMsgToAllRsp_VALUE:
                    return Cmd_SCSendMsgToAllRsp;
                case Cmd_SCAddFriendRsp_VALUE:
                    return Cmd_SCAddFriendRsp;
                case Cmd_SCUploadChatRoomIconRsp_VALUE:
                    return Cmd_SCUploadChatRoomIconRsp;
                case Cmd_SCGetBillInfoByRoomIDRsp_VALUE:
                    return Cmd_SCGetBillInfoByRoomIDRsp;
                case Cmd_SCCreateOfflineGameRsp_VALUE:
                    return Cmd_SCCreateOfflineGameRsp;
                case Cmd_CSSystemOfflineGameRoomMsgRsp_VALUE:
                    return Cmd_CSSystemOfflineGameRoomMsgRsp;
                case Cmd_SCJoinOfflineGameRoomRsp_VALUE:
                    return Cmd_SCJoinOfflineGameRoomRsp;
                case Cmd_SCUnJoinOfflineGameRoomRsp_VALUE:
                    return Cmd_SCUnJoinOfflineGameRoomRsp;
                case Cmd_SCOverOfflineGameRoomRsp_VALUE:
                    return Cmd_SCOverOfflineGameRoomRsp;
                case Cmd_SCCancelOfflineGameRoomRsp_VALUE:
                    return Cmd_SCCancelOfflineGameRoomRsp;
                case Cmd_SCChangeOfflineGameRoomRsp_VALUE:
                    return Cmd_SCChangeOfflineGameRoomRsp;
                case Cmd_SCGetOfflineOverGameInfoRsp_VALUE:
                    return Cmd_SCGetOfflineOverGameInfoRsp;
                case Cmd_SCUseItemRsp_VALUE:
                    return Cmd_SCUseItemRsp;
                case Cmd_CSUseItemPushMsgRsp_VALUE:
                    return Cmd_CSUseItemPushMsgRsp;
                case Cmd_CSMiniGameStart_VALUE:
                    return Cmd_CSMiniGameStart;
                case Cmd_CSMiniGameChange_VALUE:
                    return Cmd_CSMiniGameChange;
                case Cmd_CSMiniGameDouble_VALUE:
                    return Cmd_CSMiniGameDouble;
                case Cmd_CSMiniGameCheck_VALUE:
                    return Cmd_CSMiniGameCheck;
                case Cmd_CSMiniGameExit_VALUE:
                    return Cmd_CSMiniGameExit;
                case Cmd_CSMiniGameIni_VALUE:
                    return Cmd_CSMiniGameIni;
                case Cmd_SCAdminAddCoinRsp_VALUE:
                    return Cmd_SCAdminAddCoinRsp;
                case Cmd_SCCreateClubRsp_VALUE:
                    return Cmd_SCCreateClubRsp;
                case Cmd_SCEnterClubRsp_VALUE:
                    return Cmd_SCEnterClubRsp;
                case Cmd_SCClubActionRsp_VALUE:
                    return Cmd_SCClubActionRsp;
                case Cmd_CSSystemClubMsgRsp_VALUE:
                    return Cmd_CSSystemClubMsgRsp;
                case Cmd_SCSearchClubRsp_VALUE:
                    return Cmd_SCSearchClubRsp;
                case Cmd_SCGetClubsByLocationRsp_VALUE:
                    return Cmd_SCGetClubsByLocationRsp;
                case Cmd_SCGetHotClubsRsp_VALUE:
                    return Cmd_SCGetHotClubsRsp;
                case Cmd_SCSetClubInfoRsp_VALUE:
                    return Cmd_SCSetClubInfoRsp;
                case Cmd_SCSetClubUserLevelRsp_VALUE:
                    return Cmd_SCSetClubUserLevelRsp;
                case Cmd_SCUploadClubIConRsp_VALUE:
                    return Cmd_SCUploadClubIConRsp;
                case Cmd_SCUploadClubCoverRsp_VALUE:
                    return Cmd_SCUploadClubCoverRsp;
                case Cmd_SCGetMyClubsRsp_VALUE:
                    return Cmd_SCGetMyClubsRsp;
                case Cmd_SCSetClubSettingRsp_VALUE:
                    return Cmd_SCSetClubSettingRsp;
                case Cmd_SCQuitClubRsp_VALUE:
                    return Cmd_SCQuitClubRsp;
                case Cmd_SCSetClubFundRsp_VALUE:
                    return Cmd_SCSetClubFundRsp;
                case Cmd_SCGetClubByClubIDRsp_VALUE:
                    return Cmd_SCGetClubByClubIDRsp;
                case Cmd_SCGetFundBillInfosRsp_VALUE:
                    return Cmd_SCGetFundBillInfosRsp;
                case Cmd_SCUploadSGScoreRsp_VALUE:
                    return Cmd_SCUploadSGScoreRsp;
                case Cmd_SCDeleteClubCoverRsp_VALUE:
                    return Cmd_SCDeleteClubCoverRsp;
                case Cmd_SCGetClubInfoByUuidRsp_VALUE:
                    return Cmd_SCGetClubInfoByUuidRsp;
                case Cmd_SCUploadUserCoverRsp_VALUE:
                    return Cmd_SCUploadUserCoverRsp;
                case Cmd_SCDeleteUserCoverRsp_VALUE:
                    return Cmd_SCDeleteUserCoverRsp;
                case Cmd_SCGetChatRoomUsersByRoomIDRsp_VALUE:
                    return Cmd_SCGetChatRoomUsersByRoomIDRsp;
                case Cmd_SCGetChatRoomGamesByRoomIDRsp_VALUE:
                    return Cmd_SCGetChatRoomGamesByRoomIDRsp;
                case Cmd_SCGetClubUsersByClubIDRsp_VALUE:
                    return Cmd_SCGetClubUsersByClubIDRsp;
                case Cmd_SCGetClubGamesByClubIDRsp_VALUE:
                    return Cmd_SCGetClubGamesByClubIDRsp;
                case Cmd_SCGetClubBaseInfoByClubIDRsp_VALUE:
                    return Cmd_SCGetClubBaseInfoByClubIDRsp;
                case Cmd_SCGetFrontPageInfoV2Rsp_VALUE:
                    return Cmd_SCGetFrontPageInfoV2Rsp;
                case Cmd_SCGetRecommendClubsRsp_VALUE:
                    return Cmd_SCGetRecommendClubsRsp;
                case Cmd_SCUseDelayItemRsp_VALUE:
                    return Cmd_SCUseDelayItemRsp;
                case Cmd_SCGetAllBannerInfoRsp_VALUE:
                    return Cmd_SCGetAllBannerInfoRsp;
                case Cmd_SCSetBannerInfoRsp_VALUE:
                    return Cmd_SCSetBannerInfoRsp;
                case Cmd_SCGetAllRecommendUserInfoRsp_VALUE:
                    return Cmd_SCGetAllRecommendUserInfoRsp;
                case Cmd_SCSetRecommendUserRsp_VALUE:
                    return Cmd_SCSetRecommendUserRsp;
                case Cmd_SCSearchUserRsp_VALUE:
                    return Cmd_SCSearchUserRsp;
                case Cmd_SCShowCardRsp_VALUE:
                    return Cmd_SCShowCardRsp;
                case Cmd_SCGameActionV3Rsp_VALUE:
                    return Cmd_SCGameActionV3Rsp;
                case Cmd_SCCreateQuickGameRoomRsp_VALUE:
                    return Cmd_SCCreateQuickGameRoomRsp;
                case Cmd_SCEnterQuickGameRoomRsp_VALUE:
                    return Cmd_SCEnterQuickGameRoomRsp;
                case Cmd_SCStandUpV3Rsp_VALUE:
                    return Cmd_SCStandUpV3Rsp;
                case Cmd_SCStartQuickRoomGameRsp_VALUE:
                    return Cmd_SCStartQuickRoomGameRsp;
                case Cmd_SCGetQuickGameRoomRsp_VALUE:
                    return Cmd_SCGetQuickGameRoomRsp;
                case Cmd_SCGiveMoneyRsp_VALUE:
                    return Cmd_SCGiveMoneyRsp;
                case Cmd_CSGiveMoneyPushMsgRsp_VALUE:
                    return Cmd_CSGiveMoneyPushMsgRsp;
                case Cmd_SCQuitQuickGameRoomRsp_VALUE:
                    return Cmd_SCQuitQuickGameRoomRsp;
                case Cmd_CSSystemQuickGameRoomMsgRsp_VALUE:
                    return Cmd_CSSystemQuickGameRoomMsgRsp;
                case Cmd_SCGetFrontPageInfoV3Rsp_VALUE:
                    return Cmd_SCGetFrontPageInfoV3Rsp;
                case Cmd_SCGetBannerInfosRsp_VALUE:
                    return Cmd_SCGetBannerInfosRsp;
                case Cmd_SCAdminAddClubFundRsp_VALUE:
                    return Cmd_SCAdminAddClubFundRsp;
                case Cmd_SCGetUserInfoV2Rsp_VALUE:
                    return Cmd_SCGetUserInfoV2Rsp;
                case Cmd_SCGetSystemMsgsRsp_VALUE:
                    return Cmd_SCGetSystemMsgsRsp;
                case Cmd_SCGetSystemMsgByIDRsp_VALUE:
                    return Cmd_SCGetSystemMsgByIDRsp;
                case Cmd_SCGetBenefitsRsp_VALUE:
                    return Cmd_SCGetBenefitsRsp;
                case Cmd_SCGetSystemMsgsByTypeCMSRsp_VALUE:
                    return Cmd_SCGetSystemMsgsByTypeCMSRsp;
                case Cmd_SCGetSystemMsgByIDCMSRsp_VALUE:
                    return Cmd_SCGetSystemMsgByIDCMSRsp;
                case Cmd_SCSendSystemMsgCMSRsp_VALUE:
                    return Cmd_SCSendSystemMsgCMSRsp;
                case Cmd_SCAddClubMaxMemberRsp_VALUE:
                    return Cmd_SCAddClubMaxMemberRsp;
                case Cmd_SCAddClubFundRsp_VALUE:
                    return Cmd_SCAddClubFundRsp;
                case Cmd_SCGetClubSellingItemsRsp_VALUE:
                    return Cmd_SCGetClubSellingItemsRsp;
                case Cmd_SCBuyNicknameRsp_VALUE:
                    return Cmd_SCBuyNicknameRsp;
                case Cmd_SCCheckNicknameStatusRsp_VALUE:
                    return Cmd_SCCheckNicknameStatusRsp;
                case Cmd_SCResetBuyinRatioRsp_VALUE:
                    return Cmd_SCResetBuyinRatioRsp;
                case Cmd_SCGetUserBaseInfoRsp_VALUE:
                    return Cmd_SCGetUserBaseInfoRsp;
                case Cmd_SCSaveFavoriteV2Rsp_VALUE:
                    return Cmd_SCSaveFavoriteV2Rsp;
                case Cmd_SCGetFavoriteListV2Rsp_VALUE:
                    return Cmd_SCGetFavoriteListV2Rsp;
                case Cmd_SCGetLastPokerHandResultRsp_VALUE:
                    return Cmd_SCGetLastPokerHandResultRsp;
                case Cmd_SCGetAllPokerHistoryRsp_VALUE:
                    return Cmd_SCGetAllPokerHistoryRsp;
                case Cmd_SCRemoveFavoriteV2Rsp_VALUE:
                    return Cmd_SCRemoveFavoriteV2Rsp;
                case Cmd_SCRenameFavoriteRsp_VALUE:
                    return Cmd_SCRenameFavoriteRsp;
                case Cmd_CSBuyinControlMsgRsp_VALUE:
                    return Cmd_CSBuyinControlMsgRsp;
                case Cmd_SCBuyinActionRsp_VALUE:
                    return Cmd_SCBuyinActionRsp;
                case Cmd_SCSetBuyinControlStateRsp_VALUE:
                    return Cmd_SCSetBuyinControlStateRsp;
                case Cmd_SCPauseGameRsp_VALUE:
                    return Cmd_SCPauseGameRsp;
                case Cmd_SCGetAllBuyinControlsRsp_VALUE:
                    return Cmd_SCGetAllBuyinControlsRsp;
                case Cmd_SCRenameFPokerHistoryRsp_VALUE:
                    return Cmd_SCRenameFPokerHistoryRsp;
                case Cmd_SCCreateSNGGameRoomRsp_VALUE:
                    return Cmd_SCCreateSNGGameRoomRsp;
                case Cmd_SCSignUpSNGGameRoomRsp_VALUE:
                    return Cmd_SCSignUpSNGGameRoomRsp;
                case Cmd_SCWatchSNGGameRoomRsp_VALUE:
                    return Cmd_SCWatchSNGGameRoomRsp;
                case Cmd_SCLeaveSNGGameRoomRsp_VALUE:
                    return Cmd_SCLeaveSNGGameRoomRsp;
                case Cmd_SCCreateQuickSNGGameRoomRsp_VALUE:
                    return Cmd_SCCreateQuickSNGGameRoomRsp;
                case Cmd_SCPreBuyCoinAndroidRsp_VALUE:
                    return Cmd_SCPreBuyCoinAndroidRsp;
                case Cmd_SCBuyCoinAndroidRsp_VALUE:
                    return Cmd_SCBuyCoinAndroidRsp;
                case Cmd_SCReturnGameRsp_VALUE:
                    return Cmd_SCReturnGameRsp;
                case Cmd_SCStopSNGGameRsp_VALUE:
                    return Cmd_SCStopSNGGameRsp;
                case Cmd_SCLoginThirdPartyRsp_VALUE:
                    return Cmd_SCLoginThirdPartyRsp;
                case Cmd_SCHelloGameRsp_VALUE:
                    return Cmd_SCHelloGameRsp;
                case Cmd_SCBuyInsuranceRsp_VALUE:
                    return Cmd_SCBuyInsuranceRsp;
                case Cmd_SCCreatorInsuranceSettingRsp_VALUE:
                    return Cmd_SCCreatorInsuranceSettingRsp;
                case Cmd_SCUserInsuranceSettingRsp_VALUE:
                    return Cmd_SCUserInsuranceSettingRsp;
                case Cmd_SCBuyInsuranceDelayRsp_VALUE:
                    return Cmd_SCBuyInsuranceDelayRsp;
                case Cmd_SCForceBBRsp_VALUE:
                    return Cmd_SCForceBBRsp;
                case Cmd_SCGetGameSettingRsp_VALUE:
                    return Cmd_SCGetGameSettingRsp;
                case Cmd_SCSetUserInfoNewRsp_VALUE:
                    return Cmd_SCSetUserInfoNewRsp;
                case Cmd_SCRemarkUserNickNameRsp_VALUE:
                    return Cmd_SCRemarkUserNickNameRsp;
                case Cmd_SCGetPokerHandResultByHandIDRsp_VALUE:
                    return Cmd_SCGetPokerHandResultByHandIDRsp;
                case Cmd_SCShareFavoriteRsp_VALUE:
                    return Cmd_SCShareFavoriteRsp;
                case Cmd_SCUserDelegateRsp_VALUE:
                    return Cmd_SCUserDelegateRsp;
                case Cmd_SCKickUserInGameRsp_VALUE:
                    return Cmd_SCKickUserInGameRsp;
                case Cmd_SCUploadAPNTokenRsp_VALUE:
                    return Cmd_SCUploadAPNTokenRsp;
                case Cmd_SCCancelGameRsp_VALUE:
                    return Cmd_SCCancelGameRsp;
                case Cmd_SCShowTableCardsRsp_VALUE:
                    return Cmd_SCShowTableCardsRsp;
                case Cmd_SCReportLocationInfoRsp_VALUE:
                    return Cmd_SCReportLocationInfoRsp;
                case Cmd_SCCreateLeagueRsp_VALUE:
                    return Cmd_SCCreateLeagueRsp;
                case Cmd_SCEnterLeagueRsp_VALUE:
                    return Cmd_SCEnterLeagueRsp;
                case Cmd_SCLeagueActionRsp_VALUE:
                    return Cmd_SCLeagueActionRsp;
                case Cmd_SCSearchLeagueRsp_VALUE:
                    return Cmd_SCSearchLeagueRsp;
                case Cmd_SCSetLeagueSettingRsp_VALUE:
                    return Cmd_SCSetLeagueSettingRsp;
                case Cmd_SCQuitLeagueRsp_VALUE:
                    return Cmd_SCQuitLeagueRsp;
                case Cmd_SCGetLeagueBaseInfoByLeagueIDRsp_VALUE:
                    return Cmd_SCGetLeagueBaseInfoByLeagueIDRsp;
                case Cmd_SCGetLeagueByLeagueIDRsp_VALUE:
                    return Cmd_SCGetLeagueByLeagueIDRsp;
                case Cmd_SCGetLeagueInfoByClubIDRsp_VALUE:
                    return Cmd_SCGetLeagueInfoByClubIDRsp;
                case Cmd_SCAddLeagueMaxMemberRsp_VALUE:
                    return Cmd_SCAddLeagueMaxMemberRsp;
                case Cmd_CSSystemLeagueMsgRsp_VALUE:
                    return Cmd_CSSystemLeagueMsgRsp;
                case Cmd_SCGetMyClubsV2Rsp_VALUE:
                    return Cmd_SCGetMyClubsV2Rsp;
                case Cmd_SCGetGameRoomLeagueClubsRsp_VALUE:
                    return Cmd_SCGetGameRoomLeagueClubsRsp;
                case Cmd_SCBuyBuyInV2Rsp_VALUE:
                    return Cmd_SCBuyBuyInV2Rsp;
                case Cmd_SCGetFlashPageInfosRsp_VALUE:
                    return Cmd_SCGetFlashPageInfosRsp;
                case Cmd_SCGetFrontPageInfoV4Rsp_VALUE:
                    return Cmd_SCGetFrontPageInfoV4Rsp;
                case Cmd_SCGetBillInfosV2Rsp_VALUE:
                    return Cmd_SCGetBillInfosV2Rsp;
                case Cmd_SCSetGameThinkingIntervalRsp_VALUE:
                    return Cmd_SCSetGameThinkingIntervalRsp;
                case Cmd_SCForceStandupRsp_VALUE:
                    return Cmd_SCForceStandupRsp;
                case Cmd_SCSetStraddleRsp_VALUE:
                    return Cmd_SCSetStraddleRsp;
                case Cmd_SCGetFestivalModeRsp_VALUE:
                    return Cmd_SCGetFestivalModeRsp;
                case Cmd_SCMiniGameStartRsp_VALUE:
                    return Cmd_SCMiniGameStartRsp;
                case Cmd_SCMiniGameChangeRsp_VALUE:
                    return Cmd_SCMiniGameChangeRsp;
                case Cmd_SCMiniGameDoubleRsp_VALUE:
                    return Cmd_SCMiniGameDoubleRsp;
                case Cmd_SCMiniGameCheckRsp_VALUE:
                    return Cmd_SCMiniGameCheckRsp;
                case Cmd_SCMiniGameExitRsp_VALUE:
                    return Cmd_SCMiniGameExitRsp;
                case Cmd_SCMiniGameIniRsp_VALUE:
                    return Cmd_SCMiniGameIniRsp;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<TEXAS_CMD> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCmd.m0a().getEnumTypes().get(0);
        }

        public static TEXAS_CMD valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static FileDescriptor m0a() {
        return f0a;
    }

    static {
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013TexasPokerCmd.proto\u0012\ntexaspoker*\u00f5`\n\tTEXAS_CMD\u0012\u0012\n\u000eCmd_CSRegister\u0010\u0001\u0012\u001b\n\u0017Cmd_CSUploadPhoneNumber\u0010\u0002\u0012\u001a\n\u0016Cmd_CSUploadVerifyCode\u0010\u0003\u0012\u0014\n\u0010Cmd_CSLoginWeibo\u0010\u0004\u0012\u000f\n\u000bCmd_CSLogin\u0010\u0005\u0012\u0015\n\u0011Cmd_CSGetUserInfo\u0010\u0006\u0012\u0015\n\u0011Cmd_CSGetGameInfo\u0010\u0007\u0012\u001e\n\u001aCmd_CSUploadFriendRelation\u0010\b\u0012\u0019\n\u0015Cmd_CSGetFriendStatus\u0010\t\u0012\u0016\n\u0012Cmd_CSInviteAction\u0010\n\u0012\u000f\n\u000bCmd_CSHello\u0010\u000b\u0012\u0010\n\fCmd_CSUpdate\u0010\f\u0012\u0014\n\u0010Cmd_CSQuickLogin\u0010\r\u0012\u0019\n\u0015Cmd_CSUploadPhoneBook\u0010\u000e\u0012\u0018\n\u0014Cmd_CSCreateChatRoom", "\u0010\u000f\u0012\u0018\n\u0014Cmd_CSCreateGameRoom\u0010\u0010\u0012\u001a\n\u0016Cmd_CSGetFrontPageInfo\u0010\u0011\u0012!\n\u001dCmd_CSGetChatRoomInfoByRoomID\u0010\u0012\u0012 \n\u001cCmd_CSGetChatRoomInfosByUuid\u0010\u0013\u0012\u0019\n\u0015Cmd_CSGetGameRoomInfo\u0010\u0014\u0012\u0011\n\rCmd_CSSendMsg\u0010\u0015\u0012\u0011\n\rCmd_SCPushMsg\u0010\u0016\u0012\u0019\n\u0015Cmd_SCSystemFriendMsg\u0010\u0017\u0012\u001b\n\u0017Cmd_SCSystemChatRoomMsg\u0010\u0018\u0012\u001b\n\u0017Cmd_SCSystemGameRoomMsg\u0010\u0019\u0012\u0013\n\u000fCmd_CSReconnect\u0010\u001a\u0012\u0017\n\u0013Cmd_CSEnterGameRoom\u0010\u001b\u0012\u0016\n\u0012Cmd_CSRemoveFriend\u0010\u001c\u0012\u0016\n\u0012Cmd_CSSearchFriend\u0010\u001d\u0012\u0012\n\u000eCmd_CSFeedback\u0010\u001e\u0012\u0019\n\u0015Cmd_CSS", "etChatRoomUser\u0010\u001f\u0012\u0019\n\u0015Cmd_CSAddChatRoomUser\u0010 \u0012\u001c\n\u0018Cmd_CSRemoveChatRoomUser\u0010!\u0012\u0019\n\u0015Cmd_CSSetChatRoomInfo\u0010\"\u0012\u0014\n\u0010Cmd_CSUploadIcon\u0010#\u0012\u0015\n\u0011Cmd_CSSetUserInfo\u0010$\u0012\u0014\n\u0010Cmd_CSGameAction\u0010%\u0012\u001d\n\u0019Cmd_SCGameRoomStateChange\u0010&\u0012\u0017\n\u0013Cmd_CSLeaveChatRoom\u0010'\u0012\u0017\n\u0013Cmd_CSLeaveGameRoom\u0010(\u0012\u001a\n\u0016Cmd_CSKickUserGameRoom\u0010)\u0012\u0018\n\u0014Cmd_CSRemoveChatRoom\u0010*\u0012\u001a\n\u0016Cmd_CSGetCoinStoreList\u0010+\u0012\u0011\n\rCmd_CSBuyCoin\u0010,\u0012\u001c\n\u0018Cmd_CSGetSellingItemList\u0010-\u0012\u0018\n\u0014Cmd_CSBuySellingI", "tem\u0010.\u0012\u0015\n\u0011Cmd_CSGetItemList\u0010/\u0012\u001b\n\u0017Cmd_CSGetDefaultSetting\u00100\u0012\u0011\n\rCmd_CSSitDown\u00101\u0012\u0011\n\rCmd_CSStandUp\u00102\u0012\u0012\n\u000eCmd_CSBuyBuyIn\u00103\u0012\u0016\n\u0012Cmd_CSGetBillInfos\u00104\u0012\u0016\n\u0012Cmd_CSSaveFavorite\u00105\u0012\u0019\n\u0015Cmd_CSGetFavoriteList\u00106\u0012\u0013\n\u000fCmd_SCSystemMsg\u00107\u0012\u0014\n\u0010Cmd_CSRemoveBill\u00108\u0012\u0018\n\u0014Cmd_CSRemoveFavorite\u00109\u0012\u0015\n\u0011Cmd_CSLoginReward\u0010:\u0012\u0018\n\u0014Cmd_CSGetLoginReward\u0010;\u0012\u0012\n\u000eCmd_CSShareOut\u0010<\u0012\u0015\n\u0011Cmd_SCKickOffPush\u0010=\u0012\u0013\n\u000fCmd_CSStartGame\u0010>\u0012\u0010\n\fCmd_CSLogout\u0010?\u0012\u001f\n\u001bCmd_CS", "GetUserGameInfoInRoom\u0010@\u0012#\n\u001fCmd_CSResetPwdUploadPhonenumber\u0010A\u0012\u001c\n\u0018Cmd_CSResetPwdVerifyCode\u0010B\u0012!\n\u001dCmd_CSGetGameRoomInfoByRoomID\u0010C\u0012\u0019\n\u0015Cmd_CSSaveFavoriteUrl\u0010D\u0012\u0019\n\u0015Cmd_CSRegetVerifyCode\u0010E\u0012\u001c\n\u0018Cmd_CSSetChatInfoSetting\u0010F\u0012\u001c\n\u0018Cmd_CSSetUserInfoSetting\u0010G\u0012\u0016\n\u0012Cmd_CSSendMsgToAll\u0010H\u0012\u0013\n\u000fCmd_CSAddFriend\u0010I\u0012\u001c\n\u0018Cmd_CSUploadChatRoomIcon\u0010J\u0012\u001d\n\u0019Cmd_CSGetBillInfoByRoomID\u0010K\u0012\u001b\n\u0017Cmd_CSCreateOfflineGame\u0010L\u0012\"\n\u001eCmd_SCSystemOfflineGam", "eRoomMsg\u0010M\u0012\u001d\n\u0019Cmd_CSJoinOfflineGameRoom\u0010N\u0012\u001f\n\u001bCmd_CSUnJoinOfflineGameRoom\u0010O\u0012\u001d\n\u0019Cmd_CSOverOfflineGameRoom\u0010P\u0012\u001f\n\u001bCmd_CSCancelOfflineGameRoom\u0010Q\u0012\u001f\n\u001bCmd_CSChangeOfflineGameRoom\u0010R\u0012 \n\u001cCmd_CSGetOfflineOverGameInfo\u0010S\u0012\u0011\n\rCmd_CSUseItem\u0010T\u0012\u0018\n\u0014Cmd_SCUseItemPushMsg\u0010U\u0012\u0016\n\u0012Cmd_CSAdminAddCoin\u0010V\u0012\u0014\n\u0010Cmd_CSCreateClub\u0010W\u0012\u0013\n\u000fCmd_CSEnterClub\u0010X\u0012\u0014\n\u0010Cmd_CSClubAction\u0010Y\u0012\u0017\n\u0013Cmd_SCSystemClubMsg\u0010Z\u0012\u0014\n\u0010Cmd_CSSearchClub\u0010[\u0012\u001c\n\u0018Cmd_CSGetC", "lubsByLocation\u0010\\\u0012\u0015\n\u0011Cmd_CSGetHotClubs\u0010]\u0012\u0015\n\u0011Cmd_CSSetClubInfo\u0010^\u0012\u001a\n\u0016Cmd_CSSetClubUserLevel\u0010_\u0012\u0018\n\u0014Cmd_CSUploadClubICon\u0010`\u0012\u0019\n\u0015Cmd_CSUploadClubCover\u0010a\u0012\u0014\n\u0010Cmd_CSGetMyClubs\u0010b\u0012\u0018\n\u0014Cmd_CSSetClubSetting\u0010c\u0012\u0012\n\u000eCmd_CSQuitClub\u0010d\u0012\u0015\n\u0011Cmd_CSSetClubFund\u0010e\u0012\u0019\n\u0015Cmd_CSGetClubByClubID\u0010f\u0012\u001a\n\u0016Cmd_CSGetFundBillInfos\u0010g\u0012\u0017\n\u0013Cmd_CSUploadSGScore\u0010h\u0012\u0019\n\u0015Cmd_CSDeleteClubCover\u0010i\u0012\u001b\n\u0017Cmd_CSGetClubInfoByUuid\u0010j\u0012\u0019\n\u0015Cmd_CSUploadUserCover\u0010k\u0012\u0019\n", "\u0015Cmd_CSDeleteUserCover\u0010l\u0012\"\n\u001eCmd_CSGetChatRoomUsersByRoomID\u0010m\u0012\"\n\u001eCmd_CSGetChatRoomGamesByRoomID\u0010n\u0012\u001e\n\u001aCmd_CSGetClubUsersByClubID\u0010o\u0012\u001e\n\u001aCmd_CSGetClubGamesByClubID\u0010p\u0012!\n\u001dCmd_CSGetClubBaseInfoByClubID\u0010q\u0012\u001c\n\u0018Cmd_CSGetFrontPageInfoV2\u0010r\u0012\u001b\n\u0017Cmd_CSGetRecommendClubs\u0010s\u0012\u0016\n\u0012Cmd_CSUseDelayItem\u0010t\u0012\u001a\n\u0016Cmd_CSGetAllBannerInfo\u0010u\u0012\u0017\n\u0013Cmd_CSSetBannerInfo\u0010v\u0012!\n\u001dCmd_CSGetAllRecommendUserInfo\u0010w\u0012\u001a\n\u0016Cmd_CSSetRecommendUser\u0010x\u0012\u0014\n\u0010Cm", "d_CSSearchUser\u0010y\u0012\u0012\n\u000eCmd_CSShowCard\u0010z\u0012\u0016\n\u0012Cmd_CSGameActionV3\u0010{\u0012\u001d\n\u0019Cmd_CSCreateQuickGameRoom\u0010|\u0012\u001c\n\u0018Cmd_CSEnterQuickGameRoom\u0010}\u0012\u0013\n\u000fCmd_CSStandUpV3\u0010~\u0012\u001c\n\u0018Cmd_CSStartQuickRoomGame\u0010\u007f\u0012\u001b\n\u0016Cmd_CSGetQuickGameRoom\u0010\u0080\u0001\u0012\u0014\n\u000fCmd_CSGiveMoney\u0010\u0081\u0001\u0012\u001b\n\u0016Cmd_SCGiveMoneyPushMsg\u0010\u0082\u0001\u0012\u001c\n\u0017Cmd_CSQuitQuickGameRoom\u0010\u0083\u0001\u0012!\n\u001cCmd_SCSystemQuickGameRoomMsg\u0010\u0084\u0001\u0012\u001d\n\u0018Cmd_CSGetFrontPageInfoV3\u0010\u0085\u0001\u0012\u0019\n\u0014Cmd_CSGetBannerInfos\u0010\u0086\u0001\u0012\u001b\n\u0016Cmd_CSAdminAddClubFun", "d\u0010\u0087\u0001\u0012\u0018\n\u0013Cmd_CSGetUserInfoV2\u0010\u0089\u0001\u0012\u0018\n\u0013Cmd_CSGetSystemMsgs\u0010\u008a\u0001\u0012\u001b\n\u0016Cmd_CSGetSystemMsgByID\u0010\u008b\u0001\u0012\u0016\n\u0011Cmd_CSGetBenefits\u0010\u008c\u0001\u0012 \n\u001bCmd_CSGetSystemMsgByTypeCMS\u0010\u008d\u0001\u0012\u001e\n\u0019Cmd_CSGetSystemMsgByIDCMS\u0010\u008e\u0001\u0012\u001b\n\u0016Cmd_CSSendSystemMsgCMS\u0010\u008f\u0001\u0012\u001b\n\u0016Cmd_CSAddClubMaxMember\u0010\u0090\u0001\u0012\u0016\n\u0011Cmd_CSAddClubFund\u0010\u0091\u0001\u0012\u001e\n\u0019Cmd_CSGetClubSellingItems\u0010\u0092\u0001\u0012\u0016\n\u0011Cmd_CSBuyNickname\u0010\u0093\u0001\u0012\u001e\n\u0019Cmd_CSCheckNicknameStatus\u0010\u0094\u0001\u0012\u001a\n\u0015Cmd_CSResetBuyinRatio\u0010\u0095\u0001\u0012\u001a\n\u0015Cmd_CSGetUserBaseInfo\u0010\u0096", "\u0001\u0012\u0019\n\u0014Cmd_CSSaveFavoriteV2\u0010\u0097\u0001\u0012\u001c\n\u0017Cmd_CSGetFavoriteListV2\u0010\u0098\u0001\u0012!\n\u001cCmd_CSGetLastPokerHandResult\u0010\u0099\u0001\u0012\u001f\n\u001aCmd_CSCSGetAllPokerHistory\u0010\u009a\u0001\u0012\u001b\n\u0016Cmd_CSRemoveFavoriteV2\u0010\u009b\u0001\u0012\u0019\n\u0014Cmd_CSRenameFavorite\u0010\u009c\u0001\u0012\u001a\n\u0015Cmd_SCBuyinControlMsg\u0010\u009d\u0001\u0012\u0016\n\u0011Cmd_CSBuyinAction\u0010\u009e\u0001\u0012\u001f\n\u001aCmd_CSSetBuyinControlState\u0010\u009f\u0001\u0012\u0014\n\u000fCmd_CSPauseGame\u0010\u00a0\u0001\u0012\u001e\n\u0019Cmd_CSGetAllBuyinControls\u0010\u00a2\u0001\u0012\u001e\n\u0019Cmd_CSRenameFPokerHistory\u0010\u00a3\u0001\u0012\u001c\n\u0017Cmd_CSCreateSNGGameRoom\u0010\u00a4\u0001\u0012\u001c\n\u0017Cmd_CSSignUpS", "NGGameRoom\u0010\u00a5\u0001\u0012\u001b\n\u0016Cmd_CSWatchSNGGameRoom\u0010\u00a6\u0001\u0012\u001b\n\u0016Cmd_CSLeaveSNGGameRoom\u0010\u00a7\u0001\u0012!\n\u001cCmd_CSCreateQuickSNGGameRoom\u0010\u00a8\u0001\u0012\u001c\n\u0017Cmd_CSPreBuyCoinAndroid\u0010\u00a9\u0001\u0012\u0019\n\u0014Cmd_CSBuyCoinAndroid\u0010\u00aa\u0001\u0012\u0015\n\u0010Cmd_CSReturnGame\u0010\u00ab\u0001\u0012\u0016\n\u0011Cmd_CSStopSNGGame\u0010\u00ac\u0001\u0012\u001a\n\u0015Cmd_CSLoginThirdParty\u0010\u00ad\u0001\u0012\u0014\n\u000fCmd_CSHelloGame\u0010\u00ae\u0001\u0012\u0017\n\u0012Cmd_CSBuyInsurance\u0010\u00af\u0001\u0012\"\n\u001dCmd_CSCreatorInsuranceSetting\u0010\u00b0\u0001\u0012\u001f\n\u001aCmd_CSUserInsuranceSetting\u0010\u00b1\u0001\u0012\u001c\n\u0017Cmd_CSBuyInsuranceDelay\u0010\u00b2\u0001\u0012\u0012\n\rCmd_CSForceB", "B\u0010\u00b3\u0001\u0012\u0019\n\u0014Cmd_CSGetGameSetting\u0010\u00b4\u0001\u0012\u0019\n\u0014Cmd_CSSetUserInfoNew\u0010\u00b5\u0001\u0012\u001d\n\u0018Cmd_CSRemarkUserNickName\u0010\u00b6\u0001\u0012%\n Cmd_CSGetPokerHandResultByHandID\u0010\u00b7\u0001\u0012\u0018\n\u0013Cmd_CSShareFavorite\u0010\u00b8\u0001\u0012\u0017\n\u0012Cmd_CSUserDelegate\u0010\u00b9\u0001\u0012\u0019\n\u0014Cmd_CSKickUserInGame\u0010\u00ba\u0001\u0012\u0019\n\u0014Cmd_CSUploadAPNToken\u0010\u00bb\u0001\u0012\u0015\n\u0010Cmd_CSCancelGame\u0010\u00bc\u0001\u0012\u0019\n\u0014Cmd_CSShowTableCards\u0010\u00bd\u0001\u0012\u001d\n\u0018Cmd_CSReportLocationInfo\u0010\u00be\u0001\u0012\u0017\n\u0012Cmd_CSCreateLeague\u0010\u00bf\u0001\u0012\u0016\n\u0011Cmd_CSEnterLeague\u0010\u00c0\u0001\u0012\u0017\n\u0012Cmd_CSLeagueAction\u0010\u00c1\u0001\u0012\u0017\n\u0012Cmd_CSSe", "archLeague\u0010\u00c2\u0001\u0012\u001b\n\u0016Cmd_CSSetLeagueSetting\u0010\u00c3\u0001\u0012\u0015\n\u0010Cmd_CSQuitLeague\u0010\u00c4\u0001\u0012&\n!Cmd_CSGetLeagueBaseInfoByLeagueID\u0010\u00c5\u0001\u0012\u001e\n\u0019Cmd_CSGetLeagueByLeagueID\u0010\u00c6\u0001\u0012 \n\u001bCmd_CSGetLeagueInfoByClubID\u0010\u00c7\u0001\u0012\u001d\n\u0018Cmd_CSAddLeagueMaxMember\u0010\u00c8\u0001\u0012\u001a\n\u0015Cmd_SCSystemLeagueMsg\u0010\u00c9\u0001\u0012\u0017\n\u0012Cmd_CSGetMyClubsV2\u0010\u00ca\u0001\u0012!\n\u001cCmd_CSGetGameRoomLeagueClubs\u0010\u00cb\u0001\u0012\u0015\n\u0010Cmd_CSBuyBuyInV2\u0010\u00cc\u0001\u0012\u001c\n\u0017Cmd_CSGetFlashPageInfos\u0010\u00cd\u0001\u0012\u001d\n\u0018Cmd_CSGetFrontPageInfoV4\u0010\u00ce\u0001\u0012\u0019\n\u0014Cmd_CSGetBillInfosV2\u0010\u00cf", "\u0001\u0012\"\n\u001dCmd_CSSetGameThinkingInterval\u0010\u00d0\u0001\u0012\u0017\n\u0012Cmd_CSForceStandup\u0010\u00d1\u0001\u0012\u0016\n\u0011Cmd_CSSetStraddle\u0010\u00d2\u0001\u0012\u001a\n\u0015Cmd_CSGetFestivalMode\u0010\u00d3\u0001\u0012\u0016\n\u0011Cmd_SCRegisterRsp\u0010\u00e9\u0007\u0012\u001f\n\u001aCmd_SCUploadPhoneNumberRsp\u0010\u00ea\u0007\u0012\u001e\n\u0019Cmd_SCUploadVerifyCodeRsp\u0010\u00eb\u0007\u0012\u0018\n\u0013Cmd_SCLoginWeiboRsp\u0010\u00ec\u0007\u0012\u0013\n\u000eCmd_SCLoginRsp\u0010\u00ed\u0007\u0012\u0019\n\u0014Cmd_SCGetUserInfoRsp\u0010\u00ee\u0007\u0012\u0019\n\u0014Cmd_SCGetGameInfoRsp\u0010\u00ef\u0007\u0012\"\n\u001dCmd_SCUploadFriendRelationRsp\u0010\u00f0\u0007\u0012\u001d\n\u0018Cmd_SCGetFriendStatusRsp\u0010\u00f1\u0007\u0012\u001a\n\u0015Cmd_SCInviteActionRsp\u0010\u00f2\u0007\u0012", "\u0013\n\u000eCmd_SCHelloRsp\u0010\u00f3\u0007\u0012\u0014\n\u000fCmd_SCUpdateRsp\u0010\u00f4\u0007\u0012\u0018\n\u0013Cmd_SCQuickLoginRsp\u0010\u00f5\u0007\u0012\u001d\n\u0018Cmd_SCUploadPhoneBookRsp\u0010\u00f6\u0007\u0012\u001c\n\u0017Cmd_SCCreateChatRoomRsp\u0010\u00f7\u0007\u0012\u001c\n\u0017Cmd_SCCreateGameRoomRsp\u0010\u00f8\u0007\u0012\u001e\n\u0019Cmd_SCGetFrontPageInfoRsp\u0010\u00f9\u0007\u0012%\n Cmd_SCGetChatRoomInfoByRoomIDRsp\u0010\u00fa\u0007\u0012$\n\u001fCmd_SCGetChatRoomInfosByUuidRsp\u0010\u00fb\u0007\u0012\u001d\n\u0018Cmd_SCGetGameRoomInfoRsp\u0010\u00fc\u0007\u0012\u0015\n\u0010Cmd_SCSendMsgRsp\u0010\u00fd\u0007\u0012\u0015\n\u0010Cmd_CSPushMsgRsp\u0010\u00fe\u0007\u0012\u001d\n\u0018Cmd_CSSystemFriendMsgRsp\u0010\u00ff\u0007\u0012\u001f\n\u001aCmd_CSSystemChatRoom", "MsgRsp\u0010\u0080\b\u0012\u001f\n\u001aCmd_CSSystemGameRoomMsgRsp\u0010\u0081\b\u0012\u0017\n\u0012Cmd_SCReconnectRsp\u0010\u0082\b\u0012\u001b\n\u0016Cmd_SCEnterGameRoomRsp\u0010\u0083\b\u0012\u001a\n\u0015Cmd_SCRemoveFriendRsp\u0010\u0084\b\u0012\u001a\n\u0015Cmd_SCSearchFriendRsp\u0010\u0085\b\u0012\u0016\n\u0011Cmd_SCFeedbackRsp\u0010\u0086\b\u0012\u001d\n\u0018Cmd_SCSetChatRoomUserRsp\u0010\u0087\b\u0012\u001d\n\u0018Cmd_SCAddChatRoomUserRsp\u0010\u0088\b\u0012 \n\u001bCmd_SCRemoveChatRoomUserRsp\u0010\u0089\b\u0012\u001d\n\u0018Cmd_SCSetChatRoomInfoRsp\u0010\u008a\b\u0012\u0018\n\u0013Cmd_SCUploadIconRsp\u0010\u008b\b\u0012\u0019\n\u0014Cmd_SCSetUserInfoRsp\u0010\u008c\b\u0012\u0018\n\u0013Cmd_SCGameActionRsp\u0010\u008d\b\u0012!\n\u001cCmd_CSGameRoom", "StateChangeRsp\u0010\u008e\b\u0012\u001b\n\u0016Cmd_SCLeaveChatRoomRsp\u0010\u008f\b\u0012\u001b\n\u0016Cmd_SCLeaveGameRoomRsp\u0010\u0090\b\u0012\u001e\n\u0019Cmd_SCKickUserGameRoomRsp\u0010\u0091\b\u0012\u001c\n\u0017Cmd_SCRemoveChatRoomRsp\u0010\u0092\b\u0012\u001e\n\u0019Cmd_SCGetCoinStoreListRsp\u0010\u0093\b\u0012\u0015\n\u0010Cmd_SCBuyCoinRsp\u0010\u0094\b\u0012 \n\u001bCmd_SCGetSellingItemListRsp\u0010\u0095\b\u0012\u001c\n\u0017Cmd_SCBuySellingItemRsp\u0010\u0096\b\u0012\u0019\n\u0014Cmd_SCGetItemListRsp\u0010\u0097\b\u0012\u001f\n\u001aCmd_SCGetDefaultSettingRsp\u0010\u0098\b\u0012\u0015\n\u0010Cmd_SCSitDownRsp\u0010\u0099\b\u0012\u0015\n\u0010Cmd_SCStandUpRsp\u0010\u009a\b\u0012\u0016\n\u0011Cmd_SCBuyBuyInRsp\u0010\u009b\b\u0012\u001a\n\u0015Cmd_SCGetB", "illInfosRsp\u0010\u009c\b\u0012\u001a\n\u0015Cmd_SCSaveFavoriteRsp\u0010\u009d\b\u0012\u001d\n\u0018Cmd_SCGetFavoriteListRsp\u0010\u009e\b\u0012\u0017\n\u0012Cmd_CSSystemMsgRsp\u0010\u009f\b\u0012\u0018\n\u0013Cmd_SCRemoveBillRsp\u0010\u00a0\b\u0012\u001c\n\u0017Cmd_SCRemoveFavoriteRsp\u0010\u00a1\b\u0012\u0019\n\u0014Cmd_SCLoginRewardRsp\u0010\u00a2\b\u0012\u001c\n\u0017Cmd_SCGetLoginRewardRsp\u0010\u00a3\b\u0012\u0016\n\u0011Cmd_SCShareOutRsp\u0010\u00a4\b\u0012\u0017\n\u0012Cmd_SCStartGameRsp\u0010\u00a6\b\u0012\u0014\n\u000fCmd_SCLogoutRsp\u0010\u00a7\b\u0012#\n\u001eCmd_SCGetUserGameInfoInRoomRsp\u0010\u00a8\b\u0012'\n\"Cmd_SCResetPwdUploadPhonenumberRsp\u0010\u00a9\b\u0012 \n\u001bCmd_SCResetPwdVerifyCodeRsp\u0010\u00aa\b\u0012%\n Cm", "d_SCGetGameRoomInfoByRoomIDRsp\u0010\u00ab\b\u0012\u001d\n\u0018Cmd_SCSaveFavoriteUrlRsp\u0010\u00ac\b\u0012\u001d\n\u0018Cmd_SCRegetVerifyCodeRsp\u0010\u00ad\b\u0012 \n\u001bCmd_SCSetChatInfoSettingRsp\u0010\u00ae\b\u0012 \n\u001bCmd_SCSetUserInfoSettingRsp\u0010\u00af\b\u0012\u001a\n\u0015Cmd_SCSendMsgToAllRsp\u0010\u00b0\b\u0012\u0017\n\u0012Cmd_SCAddFriendRsp\u0010\u00b1\b\u0012 \n\u001bCmd_SCUploadChatRoomIconRsp\u0010\u00b2\b\u0012!\n\u001cCmd_SCGetBillInfoByRoomIDRsp\u0010\u00b3\b\u0012\u001f\n\u001aCmd_SCCreateOfflineGameRsp\u0010\u00b4\b\u0012&\n!Cmd_CSSystemOfflineGameRoomMsgRsp\u0010\u00b5\b\u0012!\n\u001cCmd_SCJoinOfflineGameRoomRsp\u0010\u00b6\b\u0012#\n\u001eCmd", "_SCUnJoinOfflineGameRoomRsp\u0010\u00b7\b\u0012!\n\u001cCmd_SCOverOfflineGameRoomRsp\u0010\u00b8\b\u0012#\n\u001eCmd_SCCancelOfflineGameRoomRsp\u0010\u00b9\b\u0012#\n\u001eCmd_SCChangeOfflineGameRoomRsp\u0010\u00ba\b\u0012$\n\u001fCmd_SCGetOfflineOverGameInfoRsp\u0010\u00bb\b\u0012\u0015\n\u0010Cmd_SCUseItemRsp\u0010\u00bc\b\u0012\u001c\n\u0017Cmd_CSUseItemPushMsgRsp\u0010\u00bd\b\u0012\u001a\n\u0015Cmd_SCAdminAddCoinRsp\u0010\u00e6N\u0012\u0018\n\u0013Cmd_SCCreateClubRsp\u0010\u00e7N\u0012\u0017\n\u0012Cmd_SCEnterClubRsp\u0010\u00e8N\u0012\u0018\n\u0013Cmd_SCClubActionRsp\u0010\u00e9N\u0012\u001b\n\u0016Cmd_CSSystemClubMsgRsp\u0010\u00eaN\u0012\u0018\n\u0013Cmd_SCSearchClubRsp\u0010\u00ebN\u0012 \n\u001bCmd_SC", "GetClubsByLocationRsp\u0010\u00ecN\u0012\u0019\n\u0014Cmd_SCGetHotClubsRsp\u0010\u00edN\u0012\u0019\n\u0014Cmd_SCSetClubInfoRsp\u0010\u00eeN\u0012\u001e\n\u0019Cmd_SCSetClubUserLevelRsp\u0010\u00efN\u0012\u001c\n\u0017Cmd_SCUploadClubIConRsp\u0010\u00f0N\u0012\u001d\n\u0018Cmd_SCUploadClubCoverRsp\u0010\u00f1N\u0012\u0018\n\u0013Cmd_SCGetMyClubsRsp\u0010\u00f2N\u0012\u001c\n\u0017Cmd_SCSetClubSettingRsp\u0010\u00f3N\u0012\u0016\n\u0011Cmd_SCQuitClubRsp\u0010\u00f4N\u0012\u0019\n\u0014Cmd_SCSetClubFundRsp\u0010\u00f5N\u0012\u001d\n\u0018Cmd_SCGetClubByClubIDRsp\u0010\u00f6N\u0012\u001e\n\u0019Cmd_SCGetFundBillInfosRsp\u0010\u00f7N\u0012\u001b\n\u0016Cmd_SCUploadSGScoreRsp\u0010\u00f8N\u0012\u001d\n\u0018Cmd_SCDeleteClubCoverRsp\u0010\u00f9", "N\u0012\u001f\n\u001aCmd_SCGetClubInfoByUuidRsp\u0010\u00faN\u0012\u001d\n\u0018Cmd_SCUploadUserCoverRsp\u0010\u00fbN\u0012\u001d\n\u0018Cmd_SCDeleteUserCoverRsp\u0010\u00fcN\u0012&\n!Cmd_SCGetChatRoomUsersByRoomIDRsp\u0010\u00fdN\u0012&\n!Cmd_SCGetChatRoomGamesByRoomIDRsp\u0010\u00feN\u0012\"\n\u001dCmd_SCGetClubUsersByClubIDRsp\u0010\u00ffN\u0012\"\n\u001dCmd_SCGetClubGamesByClubIDRsp\u0010\u0080O\u0012%\n Cmd_SCGetClubBaseInfoByClubIDRsp\u0010\u0081O\u0012 \n\u001bCmd_SCGetFrontPageInfoV2Rsp\u0010\u0082O\u0012\u001f\n\u001aCmd_SCGetRecommendClubsRsp\u0010\u0083O\u0012\u001a\n\u0015Cmd_SCUseDelayItemRsp\u0010\u0084O\u0012\u001e\n\u0019Cmd_SCGetAllBa", "nnerInfoRsp\u0010\u0085O\u0012\u001b\n\u0016Cmd_SCSetBannerInfoRsp\u0010\u0086O\u0012%\n Cmd_SCGetAllRecommendUserInfoRsp\u0010\u0087O\u0012\u001e\n\u0019Cmd_SCSetRecommendUserRsp\u0010\u0088O\u0012\u0018\n\u0013Cmd_SCSearchUserRsp\u0010\u0089O\u0012\u0016\n\u0011Cmd_SCShowCardRsp\u0010\u008aO\u0012\u001a\n\u0015Cmd_SCGameActionV3Rsp\u0010\u008bO\u0012!\n\u001cCmd_SCCreateQuickGameRoomRsp\u0010\u008cO\u0012 \n\u001bCmd_SCEnterQuickGameRoomRsp\u0010\u008dO\u0012\u0017\n\u0012Cmd_SCStandUpV3Rsp\u0010\u008eO\u0012 \n\u001bCmd_SCStartQuickRoomGameRsp\u0010\u008fO\u0012\u001e\n\u0019Cmd_SCGetQuickGameRoomRsp\u0010\u0090O\u0012\u0017\n\u0012Cmd_SCGiveMoneyRsp\u0010\u0091O\u0012\u001e\n\u0019Cmd_CSGiveMoneyPush", "MsgRsp\u0010\u0092O\u0012\u001f\n\u001aCmd_SCQuitQuickGameRoomRsp\u0010\u0093O\u0012$\n\u001fCmd_CSSystemQuickGameRoomMsgRsp\u0010\u0094O\u0012 \n\u001bCmd_SCGetFrontPageInfoV3Rsp\u0010\u0095O\u0012\u001c\n\u0017Cmd_SCGetBannerInfosRsp\u0010\u0096O\u0012\u001e\n\u0019Cmd_SCAdminAddClubFundRsp\u0010\u0097O\u0012\u001b\n\u0016Cmd_SCGetUserInfoV2Rsp\u0010\u0099O\u0012\u001b\n\u0016Cmd_SCGetSystemMsgsRsp\u0010\u009aO\u0012\u001e\n\u0019Cmd_SCGetSystemMsgByIDRsp\u0010\u009bO\u0012\u0019\n\u0014Cmd_SCGetBenefitsRsp\u0010\u009cO\u0012$\n\u001fCmd_SCGetSystemMsgsByTypeCMSRsp\u0010\u009dO\u0012!\n\u001cCmd_SCGetSystemMsgByIDCMSRsp\u0010\u009eO\u0012\u001e\n\u0019Cmd_SCSendSystemMsgCMSRsp\u0010\u009fO\u0012\u001e", "\n\u0019Cmd_SCAddClubMaxMemberRsp\u0010\u00a0O\u0012\u0019\n\u0014Cmd_SCAddClubFundRsp\u0010\u00a1O\u0012!\n\u001cCmd_SCGetClubSellingItemsRsp\u0010\u00a2O\u0012\u0019\n\u0014Cmd_SCBuyNicknameRsp\u0010\u00a3O\u0012!\n\u001cCmd_SCCheckNicknameStatusRsp\u0010\u00a4O\u0012\u001d\n\u0018Cmd_SCResetBuyinRatioRsp\u0010\u00a5O\u0012\u001d\n\u0018Cmd_SCGetUserBaseInfoRsp\u0010\u00a6O\u0012\u001c\n\u0017Cmd_SCSaveFavoriteV2Rsp\u0010\u00a7O\u0012\u001f\n\u001aCmd_SCGetFavoriteListV2Rsp\u0010\u00a8O\u0012$\n\u001fCmd_SCGetLastPokerHandResultRsp\u0010\u00a9O\u0012 \n\u001bCmd_SCGetAllPokerHistoryRsp\u0010\u00aaO\u0012\u001e\n\u0019Cmd_SCRemoveFavoriteV2Rsp\u0010\u00abO\u0012\u001c\n\u0017Cmd_SCRenameF", "avoriteRsp\u0010\u00acO\u0012\u001d\n\u0018Cmd_CSBuyinControlMsgRsp\u0010\u00adO\u0012\u0019\n\u0014Cmd_SCBuyinActionRsp\u0010\u00aeO\u0012\"\n\u001dCmd_SCSetBuyinControlStateRsp\u0010\u00afO\u0012\u0017\n\u0012Cmd_SCPauseGameRsp\u0010\u00b0O\u0012!\n\u001cCmd_SCGetAllBuyinControlsRsp\u0010\u00b2O\u0012!\n\u001cCmd_SCRenameFPokerHistoryRsp\u0010\u00b3O\u0012\u001f\n\u001aCmd_SCCreateSNGGameRoomRsp\u0010\u00b4O\u0012\u001f\n\u001aCmd_SCSignUpSNGGameRoomRsp\u0010\u00b5O\u0012\u001e\n\u0019Cmd_SCWatchSNGGameRoomRsp\u0010\u00b6O\u0012\u001e\n\u0019Cmd_SCLeaveSNGGameRoomRsp\u0010\u00b7O\u0012$\n\u001fCmd_SCCreateQuickSNGGameRoomRsp\u0010\u00b8O\u0012\u001f\n\u001aCmd_SCPreBuyCoinAndroidRsp", "\u0010\u00b9O\u0012\u001c\n\u0017Cmd_SCBuyCoinAndroidRsp\u0010\u00baO\u0012\u0018\n\u0013Cmd_SCReturnGameRsp\u0010\u00bbO\u0012\u0019\n\u0014Cmd_SCStopSNGGameRsp\u0010\u00bcO\u0012\u001d\n\u0018Cmd_SCLoginThirdPartyRsp\u0010\u00bdO\u0012\u0017\n\u0012Cmd_SCHelloGameRsp\u0010\u00beO\u0012\u001a\n\u0015Cmd_SCBuyInsuranceRsp\u0010\u00bfO\u0012%\n Cmd_SCCreatorInsuranceSettingRsp\u0010\u00c0O\u0012\"\n\u001dCmd_SCUserInsuranceSettingRsp\u0010\u00c1O\u0012\u001f\n\u001aCmd_SCBuyInsuranceDelayRsp\u0010\u00c2O\u0012\u0015\n\u0010Cmd_SCForceBBRsp\u0010\u00c3O\u0012\u001c\n\u0017Cmd_SCGetGameSettingRsp\u0010\u00c4O\u0012\u001c\n\u0017Cmd_SCSetUserInfoNewRsp\u0010\u00c5O\u0012 \n\u001bCmd_SCRemarkUserNickNameRsp\u0010\u00c6O\u0012(\n#C", "md_SCGetPokerHandResultByHandIDRsp\u0010\u00c7O\u0012\u001b\n\u0016Cmd_SCShareFavoriteRsp\u0010\u00c8O\u0012\u001a\n\u0015Cmd_SCUserDelegateRsp\u0010\u00c9O\u0012\u001c\n\u0017Cmd_SCKickUserInGameRsp\u0010\u00caO\u0012\u001c\n\u0017Cmd_SCUploadAPNTokenRsp\u0010\u00cbO\u0012\u0018\n\u0013Cmd_SCCancelGameRsp\u0010\u00ccO\u0012\u001c\n\u0017Cmd_SCShowTableCardsRsp\u0010\u00cdO\u0012 \n\u001bCmd_SCReportLocationInfoRsp\u0010\u00ceO\u0012\u001a\n\u0015Cmd_SCCreateLeagueRsp\u0010\u00cfO\u0012\u0019\n\u0014Cmd_SCEnterLeagueRsp\u0010\u00d0O\u0012\u001a\n\u0015Cmd_SCLeagueActionRsp\u0010\u00d1O\u0012\u001a\n\u0015Cmd_SCSearchLeagueRsp\u0010\u00d2O\u0012\u001e\n\u0019Cmd_SCSetLeagueSettingRsp\u0010\u00d3O\u0012\u0018\n\u0013Cmd_SCQui", "tLeagueRsp\u0010\u00d4O\u0012)\n$Cmd_SCGetLeagueBaseInfoByLeagueIDRsp\u0010\u00d5O\u0012!\n\u001cCmd_SCGetLeagueByLeagueIDRsp\u0010\u00d6O\u0012#\n\u001eCmd_SCGetLeagueInfoByClubIDRsp\u0010\u00d7O\u0012 \n\u001bCmd_SCAddLeagueMaxMemberRsp\u0010\u00d8O\u0012\u001d\n\u0018Cmd_CSSystemLeagueMsgRsp\u0010\u00d9O\u0012\u001a\n\u0015Cmd_SCGetMyClubsV2Rsp\u0010\u00daO\u0012$\n\u001fCmd_SCGetGameRoomLeagueClubsRsp\u0010\u00dbO\u0012\u0018\n\u0013Cmd_SCBuyBuyInV2Rsp\u0010\u00dcO\u0012\u001f\n\u001aCmd_SCGetFlashPageInfosRsp\u0010\u00ddO\u0012 \n\u001bCmd_SCGetFrontPageInfoV4Rsp\u0010\u00deO\u0012\u001c\n\u0017Cmd_SCGetBillInfosV2Rsp\u0010\u00dfO\u0012%\n Cmd_SCSetGameT", "hinkingIntervalRsp\u0010\u00e0O\u0012\u001a\n\u0015Cmd_SCForceStandupRsp\u0010\u00e1O\u0012\u0019\n\u0014Cmd_SCSetStraddleRsp\u0010\u00e2O\u0012\u001d\n\u0018Cmd_SCGetFestivalModeRsp\u0010\u00e3O\u0012\u0018\n\u0013Cmd_CSMiniGameStart\u0010\u00a8F\u0012\u0019\n\u0014Cmd_CSMiniGameChange\u0010\u00a9F\u0012\u0019\n\u0014Cmd_CSMiniGameDouble\u0010\u00aaF\u0012\u0018\n\u0013Cmd_CSMiniGameCheck\u0010\u00abF\u0012\u0017\n\u0012Cmd_CSMiniGameExit\u0010\u00acF\u0012\u0016\n\u0011Cmd_CSMiniGameIni\u0010\u00adF\u0012\u001c\n\u0016Cmd_SCMiniGameStartRsp\u0010\u00b8\u0094\u0001\u0012\u001d\n\u0017Cmd_SCMiniGameChangeRsp\u0010\u00b9\u0094\u0001\u0012\u001d\n\u0017Cmd_SCMiniGameDoubleRsp\u0010\u00ba\u0094\u0001\u0012\u001c\n\u0016Cmd_SCMiniGameCheckRsp\u0010\u00bb\u0094\u0001\u0012\u001b\n\u0015Cmd_SCMiniGa", "meExitRsp\u0010\u00bc\u0094\u0001\u0012\u001a\n\u0014Cmd_SCMiniGameIniRsp\u0010\u00bd\u0094\u0001B&\n\u0015com.texaspoker.momentB\rTexasPokerCmd"}, new FileDescriptor[0], new C00811());
    }
}
