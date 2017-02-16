package com.illuminate.texaspoker.utils;

import android.net.ConnectivityManager;
import android.os.Build;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.google.protobuf.ByteString;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.p058c.UserBill;
import com.illuminate.texaspoker.p059d.ContactUser;
import com.illuminate.texaspoker.p060e.p061a.HttpManager;
import com.illuminate.texaspoker.p060e.p061a.ProtoBufHttpRequest;
import com.illuminate.texaspoker.p060e.p062b.PushManager;
import com.illuminate.texaspoker.tea.TEAUtil;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPoker.CSAddChatRoomUser;
import com.texaspoker.moment.TexasPoker.CSBuyinAction;
import com.texaspoker.moment.TexasPoker.CSBuyinControlMsgRsp;
import com.texaspoker.moment.TexasPoker.CSCreateChatRoom;
import com.texaspoker.moment.TexasPoker.CSCreateGameRoom;
import com.texaspoker.moment.TexasPoker.CSCreateQuickGameRoom;
import com.texaspoker.moment.TexasPoker.CSCreateQuickSNGGameRoom;
import com.texaspoker.moment.TexasPoker.CSCreateSNGGameRoom;
import com.texaspoker.moment.TexasPoker.CSEnterGameRoom;
import com.texaspoker.moment.TexasPoker.CSEnterQuickGameRoom;
import com.texaspoker.moment.TexasPoker.CSGetAllBuyinControls;
import com.texaspoker.moment.TexasPoker.CSGetChatRoomGamesByRoomID;
import com.texaspoker.moment.TexasPoker.CSGetChatRoomUsersByRoomID;
import com.texaspoker.moment.TexasPoker.CSGetFrontPageInfo;
import com.texaspoker.moment.TexasPoker.CSGetFrontPageInfoV4;
import com.texaspoker.moment.TexasPoker.CSGetGameRoomInfoByRoomID;
import com.texaspoker.moment.TexasPoker.CSGetQuickGameRoom;
import com.texaspoker.moment.TexasPoker.CSHello;
import com.texaspoker.moment.TexasPoker.CSHelloGame;
import com.texaspoker.moment.TexasPoker.CSLeaveChatRoom;
import com.texaspoker.moment.TexasPoker.CSLogin;
import com.texaspoker.moment.TexasPoker.CSLoginThirdParty;
import com.texaspoker.moment.TexasPoker.CSLogout;
import com.texaspoker.moment.TexasPoker.CSPushMsgRsp;
import com.texaspoker.moment.TexasPoker.CSQuickLogin;
import com.texaspoker.moment.TexasPoker.CSQuitQuickGameRoom;
import com.texaspoker.moment.TexasPoker.CSReconnect;
import com.texaspoker.moment.TexasPoker.CSReconnect.Builder;
import com.texaspoker.moment.TexasPoker.CSRegetVerifyCode;
import com.texaspoker.moment.TexasPoker.CSRegister;
import com.texaspoker.moment.TexasPoker.CSRemoveChatRoomUser;
import com.texaspoker.moment.TexasPoker.CSResetPwdUploadPhonenumber;
import com.texaspoker.moment.TexasPoker.CSResetPwdVerifyCode;
import com.texaspoker.moment.TexasPoker.CSSendMsg;
import com.texaspoker.moment.TexasPoker.CSSetChatInfoSetting;
import com.texaspoker.moment.TexasPoker.CSSetChatRoomInfo;
import com.texaspoker.moment.TexasPoker.CSSignUpSNGGameRoom;
import com.texaspoker.moment.TexasPoker.CSStartQuickRoomGame;
import com.texaspoker.moment.TexasPoker.CSSystemChatRoomMsgRsp;
import com.texaspoker.moment.TexasPoker.CSSystemClubMsgRsp;
import com.texaspoker.moment.TexasPoker.CSSystemGameRoomMsgRsp;
import com.texaspoker.moment.TexasPoker.CSSystemQuickGameRoomMsRspg;
import com.texaspoker.moment.TexasPoker.CSUploadAPNToken;
import com.texaspoker.moment.TexasPoker.CSUploadChatRoomIcon;
import com.texaspoker.moment.TexasPoker.CSUploadVerifyCode;
import com.texaspoker.moment.TexasPoker.CSUseItemPushMsgRsp;
import com.texaspoker.moment.TexasPoker.CSWatchSNGGameRoom;
import com.texaspoker.moment.TexasPoker.GAME_ROOM_SENIOR_TYPE;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.DEVICE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ID_TYPE;
import com.texaspoker.moment.TexasPokerCommon.LANGUAGE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.Package;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.SharePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.VIP_TYPE;
import com.texaspoker.moment.TexasPokerHarbour.CSReportLocationInfo;
import com.texaspoker.moment.TexasPokerHttp.CSFeedback;
import com.texaspoker.moment.TexasPokerHttp.CSGetAllPokerHistory;
import com.texaspoker.moment.TexasPokerHttp.CSGetBannerInfos;
import com.texaspoker.moment.TexasPokerHttp.CSGetBenefits;
import com.texaspoker.moment.TexasPokerHttp.CSGetFavoriteListV2;
import com.texaspoker.moment.TexasPokerHttp.CSGetFestivalMode;
import com.texaspoker.moment.TexasPokerHttp.CSGetFlashPageInfos;
import com.texaspoker.moment.TexasPokerHttp.CSGetSystemMsgByID;
import com.texaspoker.moment.TexasPokerHttp.CSGetSystemMsgs;
import com.texaspoker.moment.TexasPokerHttp.CSRemoveFavoriteV2;
import com.texaspoker.moment.TexasPokerHttp.CSRenameFavorite;
import com.texaspoker.moment.TexasPokerHttp.CSSaveFavoriteV2;
import com.texaspoker.moment.TexasPokerHttp.CSShareFavorite;
import com.texaspoker.moment.TexasPokerHttp.CSUpdate;
import com.texaspoker.moment.TexasPokerHttp.SAVE_FAVORITE_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.CSGetBillInfosV2;
import com.texaspoker.moment.TexasPokerHttpBill.NormalBillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.SNGBillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.ShareBillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_ACT;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_USER_LEVEL;
import com.texaspoker.moment.TexasPokerHttpClub.CSAddClubFund;
import com.texaspoker.moment.TexasPokerHttpClub.CSAddClubMaxMember;
import com.texaspoker.moment.TexasPokerHttpClub.CSClubAction;
import com.texaspoker.moment.TexasPokerHttpClub.CSCreateClub;
import com.texaspoker.moment.TexasPokerHttpClub.CSDeleteClubCover;
import com.texaspoker.moment.TexasPokerHttpClub.CSEnterClub;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubBaseInfoByClubID;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubByClubID;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubGamesByClubID;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubInfoByUuid;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubSellingItems;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetClubsByLocation;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetFundBillInfos;
import com.texaspoker.moment.TexasPokerHttpClub.CSGetMyClubsV2;
import com.texaspoker.moment.TexasPokerHttpClub.CSQuitClub;
import com.texaspoker.moment.TexasPokerHttpClub.CSSearchClub;
import com.texaspoker.moment.TexasPokerHttpClub.CSSetClubFund;
import com.texaspoker.moment.TexasPokerHttpClub.CSSetClubInfo;
import com.texaspoker.moment.TexasPokerHttpClub.CSSetClubSetting;
import com.texaspoker.moment.TexasPokerHttpClub.CSSetClubUserLevel;
import com.texaspoker.moment.TexasPokerHttpClub.CSUploadClubCover;
import com.texaspoker.moment.TexasPokerHttpClub.CSUploadClubICon;
import com.texaspoker.moment.TexasPokerHttpLeague.CSCreateLeague;
import com.texaspoker.moment.TexasPokerHttpLeague.CSEnterLeague;
import com.texaspoker.moment.TexasPokerHttpLeague.CSGetLeagueByLeagueID;
import com.texaspoker.moment.TexasPokerHttpLeague.CSGetLeagueInfoByClubID;
import com.texaspoker.moment.TexasPokerHttpLeague.CSLeagueAction;
import com.texaspoker.moment.TexasPokerHttpLeague.CSQuitLeague;
import com.texaspoker.moment.TexasPokerHttpLeague.CSSearchLeague;
import com.texaspoker.moment.TexasPokerHttpLeague.CSSetLeagueSetting;
import com.texaspoker.moment.TexasPokerHttpLeague.CSSystemLeagueMsgRsp;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_ACT;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_SEARCH_TYPE;
import com.texaspoker.moment.TexasPokerHttpTransaction.CSBuyCoinAndroid;
import com.texaspoker.moment.TexasPokerHttpTransaction.CSBuySellingItem;
import com.texaspoker.moment.TexasPokerHttpTransaction.CSGetCoinStoreList;
import com.texaspoker.moment.TexasPokerHttpTransaction.CSGetSellingItemList;
import com.texaspoker.moment.TexasPokerHttpTransaction.CSPreBuyCoinAndroid;
import com.texaspoker.moment.TexasPokerHttpUser.CSBuyNickname;
import com.texaspoker.moment.TexasPokerHttpUser.CSCheckNicknameStatus;
import com.texaspoker.moment.TexasPokerHttpUser.CSDeleteUserCover;
import com.texaspoker.moment.TexasPokerHttpUser.CSGetFriendStatus;
import com.texaspoker.moment.TexasPokerHttpUser.CSGetLoginReward;
import com.texaspoker.moment.TexasPokerHttpUser.CSGetUserBaseInfo;
import com.texaspoker.moment.TexasPokerHttpUser.CSGetUserInfoV2;
import com.texaspoker.moment.TexasPokerHttpUser.CSInviteAction;
import com.texaspoker.moment.TexasPokerHttpUser.CSRemarkUserNickName;
import com.texaspoker.moment.TexasPokerHttpUser.CSRemoveFriend;
import com.texaspoker.moment.TexasPokerHttpUser.CSSearchFriend;
import com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfo;
import com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfoNew;
import com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfoSetting;
import com.texaspoker.moment.TexasPokerHttpUser.CSSystemFriendMsgRsp;
import com.texaspoker.moment.TexasPokerHttpUser.CSUploadFriendRelation;
import com.texaspoker.moment.TexasPokerHttpUser.CSUploadIcon;
import com.texaspoker.moment.TexasPokerHttpUser.CSUploadUserCover;
import com.texaspoker.moment.TexasPokerHttpUser.MSG_ACT;
import com.texaspoker.moment.TexasPokerHttpUser.SEARCH_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_ACTION_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_FRIEND_RELATION_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import com.texaspoker.moment.TexasPokerHttpUser.UploadUserInfoNet;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.cocos2dx.lua.AppActivity;

public class NetworkUtil {
    public static long f6566a;
    private static long f6567b;
    private static NetworkUtil f6568c;

    static {
        f6567b = 0;
        f6566a = 0;
    }

    public static NetworkUtil m4073a() {
        if (f6568c == null) {
            f6568c = new NetworkUtil();
        }
        return f6568c;
    }

    public static boolean m4143b() {
        if (BaseApplication.m3548a() == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) BaseApplication.m3548a().getSystemService("connectivity");
        return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) ? false : true;
    }

    public static void gameTcpAction(int i, byte[] bArr) {
        ByteString copyFrom = ByteString.copyFrom(bArr);
        TEXAS_CMD valueOf = TEXAS_CMD.valueOf(i);
        new StringBuilder("TEXAS_CMD=").append(valueOf);
        long b = SharedPreferencesManager.m4308b();
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, copyFrom, valueOf, j));
    }

    public static void gameHttpAction(int i, byte[] bArr) {
        ByteString copyFrom = ByteString.copyFrom(bArr);
        TEXAS_CMD valueOf = TEXAS_CMD.valueOf(i);
        new StringBuilder("TEXAS_CMD=").append(valueOf);
        long b = SharedPreferencesManager.m4308b();
        long j = f6567b + 1;
        f6567b = j;
        Package a = TCPUtil.m4465a(b, copyFrom, valueOf, j);
        if (valueOf == TEXAS_CMD.Cmd_CSMiniGameStart || valueOf == TEXAS_CMD.Cmd_CSMiniGameChange || valueOf == TEXAS_CMD.Cmd_CSMiniGameDouble || valueOf == TEXAS_CMD.Cmd_CSMiniGameCheck || valueOf == TEXAS_CMD.Cmd_CSMiniGameExit || valueOf == TEXAS_CMD.Cmd_CSMiniGameIni) {
            HttpManager a2 = HttpManager.m3919a();
            if (a != null) {
                TEXAS_CMD eCmd = a.getECmd();
                new StringBuilder("req cmd = ").append(eCmd);
                RetryPolicy defaultRetryPolicy = new DefaultRetryPolicy(Constants.ERRORCODE_UNKNOWN, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                Request protoBufHttpRequest = new ProtoBufHttpRequest(a.toByteArray(), HttpManager.f6481c, new HttpManager.HttpManager(a2, defaultRetryPolicy, eCmd), "https://aurigamini.pokermate.net:8446/minigame", (byte) 0);
                protoBufHttpRequest.setRetryPolicy(defaultRetryPolicy);
                protoBufHttpRequest.toString();
                HttpManager.f6479a.m3920a(protoBufHttpRequest);
                return;
            }
            return;
        }
        HttpManager.m3919a().m3921a(a);
    }

    public static void m4144c() {
        if (!StringUtils.m4462a(SharedPreferencesManager.aa())) {
            Builder newBuilder = CSReconnect.newBuilder();
            newBuilder.setUuid(SharedPreferencesManager.m4308b());
            newBuilder.setStrIosToken(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder.setStrSSOToken(DeviceUtils.m4236c() + "_" + Build.SERIAL);
            newBuilder.setStrPhoneType("Android");
            newBuilder.setStrSysVersion(DeviceUtils.m4234a());
            newBuilder.setStrScreenSize(DeviceUtils.m4235b());
            newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
            if (Utility.m4480a()) {
                newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
            } else if (Utility.m4485b()) {
                newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
            } else {
                newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
            }
            byte[] f = Utility.m4501f(SharedPreferencesManager.aa());
            if (f != null) {
                try {
                    newBuilder.setSAccessToken(new String(TEAUtil.m4068a().decode(null, f, BaseApplication.m3548a()), GameManager.DEFAULT_CHARSET));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                newBuilder.setSAccessToken(LetterIndexBar.SEARCH_ICON_LETTER);
            }
            CSReconnect build = newBuilder.build();
            newBuilder.clear();
            long b = SharedPreferencesManager.m4308b();
            ByteString toByteString = build.toByteString();
            TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSReconnect;
            long j = f6567b + 1;
            f6567b = j;
            PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
        }
    }

    public static void m4155d() {
        CSHello.Builder newBuilder = CSHello.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSHello build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSHello;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4077a(long j) {
        CSHelloGame.Builder newBuilder = CSHelloGame.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGameRoomID(j);
        CSHelloGame build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSHelloGame;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4161e() {
        CSQuickLogin.Builder newBuilder = CSQuickLogin.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setStrIosToken(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrSSOToken(DeviceUtils.m4236c() + "_" + Build.SERIAL);
        newBuilder.setStrPhoneType("Android");
        newBuilder.setStrSysVersion(DeviceUtils.m4234a());
        newBuilder.setStrScreenSize(DeviceUtils.m4235b());
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        CSQuickLogin build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSQuickLogin;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4122a(String str, String str2, String str3) {
        CSLogin.Builder newBuilder = CSLogin.newBuilder();
        String a = Utility.m4473a(str2);
        newBuilder.setStrID(str);
        newBuilder.setStrPWD(a);
        newBuilder.setStrIosToken(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrSSOToken(DeviceUtils.m4236c() + "_" + Build.SERIAL);
        newBuilder.setStrSysVersion(DeviceUtils.m4234a());
        newBuilder.setStrPhoneType("Android");
        newBuilder.setStrScreenSize(DeviceUtils.m4235b());
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setSCountryCode(str3);
        CSLogin build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSLogin;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static UserBaseInfoNet m4130b(String str, String str2, String str3) {
        UserBaseInfoNet.Builder newBuilder = UserBaseInfoNet.newBuilder();
        newBuilder.setUuid(-1);
        newBuilder.setEType(ID_TYPE.ID_TYPE_PHONE);
        newBuilder.setStrNick(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrCover(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrPhoneNumber(str);
        newBuilder.setStrID(str);
        newBuilder.setIGender(1);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setSCountryCode(str3);
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        UserBaseInfoNet build = newBuilder.build();
        newBuilder.clear();
        CSRegister.Builder newBuilder2 = CSRegister.newBuilder();
        newBuilder2.setPwd(Utility.m4473a(str2));
        newBuilder2.setStUserBaseInfo(build);
        CSRegister build2 = newBuilder2.build();
        newBuilder2.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build2.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRegister;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
        return build;
    }

    public static void m4153c(String str, String str2, String str3) {
        UserBaseInfoNet.Builder newBuilder = UserBaseInfoNet.newBuilder();
        newBuilder.setUuid(-1);
        newBuilder.setEType(ID_TYPE.ID_TYPE_PHONE);
        newBuilder.setStrNick(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrCover(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrPhoneNumber(str2);
        newBuilder.setStrID(str2);
        newBuilder.setSCountryCode(str3);
        newBuilder.setIGender(1);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setSCountryCode(str3);
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        UserBaseInfoNet build = newBuilder.build();
        newBuilder.clear();
        CSUploadVerifyCode.Builder newBuilder2 = CSUploadVerifyCode.newBuilder();
        newBuilder2.setSVeryifyCode(str);
        newBuilder2.setStUserBaseInfo(build);
        newBuilder2.setStrIosToken(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder2.setStrSSOToken(DeviceUtils.m4236c() + "_" + Build.SERIAL);
        newBuilder2.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        if (Utility.m4480a()) {
            newBuilder2.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder2.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder2.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder2.setBRegister(1);
        CSUploadVerifyCode build2 = newBuilder2.build();
        newBuilder2.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build2.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadVerifyCode;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4120a(String str, String str2) {
        CSRegetVerifyCode.Builder newBuilder = CSRegetVerifyCode.newBuilder();
        newBuilder.setSPhoneNumber(str);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setSCountryCode(str2);
        CSRegetVerifyCode build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRegetVerifyCode;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4140b(String str, String str2) {
        CSResetPwdUploadPhonenumber.Builder newBuilder = CSResetPwdUploadPhonenumber.newBuilder();
        newBuilder.setSPhoneNumber(str);
        newBuilder.setSCountryCode(str2);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        CSResetPwdUploadPhonenumber build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSResetPwdUploadPhonenumber;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4123a(String str, String str2, String str3, String str4) {
        CSResetPwdVerifyCode.Builder newBuilder = CSResetPwdVerifyCode.newBuilder();
        newBuilder.setSPhoneNumber(str3);
        newBuilder.setSVeryifyCode(str);
        newBuilder.setSCountryCode(str4);
        newBuilder.setSNewPassword(Utility.m4473a(str2));
        CSResetPwdVerifyCode build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSResetPwdVerifyCode;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4126a(byte[] bArr) {
        CSUploadIcon.Builder newBuilder = CSUploadIcon.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setVIconDatas(ByteString.copyFrom(bArr));
        CSUploadIcon build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadIcon;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4121a(String str, String str2, int i) {
        CSLoginThirdParty.Builder newBuilder = CSLoginThirdParty.newBuilder();
        newBuilder.setEIDType(ID_TYPE.ID_TYPE_FACEBOOK);
        newBuilder.setStrID(str);
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        newBuilder.setStrIosToken(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setStrSSOToken(DeviceUtils.m4236c() + "_" + Build.SERIAL);
        newBuilder.setStrSysVersion(DeviceUtils.m4234a());
        newBuilder.setStrPhoneType("Android");
        newBuilder.setStrScreenSize(DeviceUtils.m4235b());
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setIGender(i);
        newBuilder.setStrNick(str2);
        CSLoginThirdParty build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSLoginThirdParty;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4075a(int i, String str) {
        CSSetUserInfo.Builder newBuilder = CSSetUserInfo.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSNickname(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setIGender(i);
        newBuilder.setSIconUrl(SharedPreferencesManager.m4375k());
        newBuilder.setSPhhoneNumber(SharedPreferencesManager.m4403o());
        newBuilder.setSDesc(str);
        CSSetUserInfo build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetUserInfo;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4111a(String str, int i) {
        CSSetUserInfoNew.Builder newBuilder = CSSetUserInfoNew.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        if (str == null) {
            newBuilder.setSNickname(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            newBuilder.setSNickname(str);
        }
        newBuilder.setIGender(i);
        newBuilder.setSIconUrl(SharedPreferencesManager.m4375k());
        newBuilder.setSPhhoneNumber(SharedPreferencesManager.m4403o());
        newBuilder.setSDesc(LetterIndexBar.SEARCH_ICON_LETTER);
        CSSetUserInfoNew build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetUserInfoNew;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4164f() {
        CSLogout.Builder newBuilder = CSLogout.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSLogout build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSLogout;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4109a(CSSystemFriendMsgRsp.Builder builder) {
        CSSystemFriendMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemFriendMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4166g() {
        CSGetFrontPageInfo.Builder newBuilder = CSGetFrontPageInfo.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetFrontPageInfo build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFrontPageInfo;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4168h() {
        CSGetQuickGameRoom.Builder newBuilder = CSGetQuickGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetQuickGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetQuickGameRoom;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4170i() {
        CSGetFrontPageInfoV4.Builder newBuilder = CSGetFrontPageInfoV4.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIOffset(0);
        newBuilder.setINum(0);
        CSGetFrontPageInfoV4 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFrontPageInfoV4;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4115a(String str, long j, long j2, long j3, long j4, GAME_ROOM_SENIOR_TYPE game_room_senior_type, int i, int i2, boolean z, int i3, int i4, boolean z2, GAME_ROOM_TYPE game_room_type, boolean z3, boolean z4) {
        CSCreateQuickGameRoom.Builder newBuilder = CSCreateQuickGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSRoomName(str);
        newBuilder.setLSmallBlinds(j);
        newBuilder.setLBigBlinds(j2);
        newBuilder.setLBuyIn(j3);
        newBuilder.setBBuyIn(1);
        newBuilder.setLDuration(j4);
        newBuilder.setEGameRoomSeniorType(game_room_senior_type);
        newBuilder.setIMaxBuyinRatio(i);
        newBuilder.setIMinBuyinRatio(i2);
        newBuilder.setIAnte(i4);
        newBuilder.setBInsurance(z2 ? 1 : 0);
        newBuilder.setEGameRoomType(game_room_type);
        if (z4) {
            newBuilder.setBIPLimit(1);
        } else {
            newBuilder.setBIPLimit(0);
        }
        if (z3) {
            newBuilder.setBGPSLimit(1);
        } else {
            newBuilder.setBGPSLimit(0);
        }
        if (z) {
            newBuilder.setBBuyinControl(1);
        } else {
            newBuilder.setBBuyinControl(0);
        }
        newBuilder.setIGameRoomUserMaxNums(i3);
        CSCreateQuickGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateQuickGameRoom;
        long j5 = f6567b + 1;
        f6567b = j5;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j5));
    }

    public static void m4118a(String str, SNG_ROOM_TYPE sng_room_type, CREATE_ROOM_TYPE create_room_type, int i, boolean z, boolean z2, boolean z3) {
        CSCreateQuickSNGGameRoom.Builder newBuilder = CSCreateQuickSNGGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setStrRoomName(str);
        newBuilder.setBPrivateRoom(0);
        newBuilder.setESNGRoomType(sng_room_type);
        newBuilder.setECreateRoomType(create_room_type);
        newBuilder.setIGameRoomUserMaxNums(i);
        if (z3) {
            newBuilder.setBIPLimit(1);
        } else {
            newBuilder.setBIPLimit(0);
        }
        if (z2) {
            newBuilder.setBGPSLimit(1);
        } else {
            newBuilder.setBGPSLimit(0);
        }
        if (z) {
            newBuilder.setBBuyinControl(1);
        } else {
            newBuilder.setBBuyinControl(0);
        }
        CSCreateQuickSNGGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateQuickSNGGameRoom;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4095a(long j, String str, long j2, long j3, long j4, long j5, GAME_ROOM_TYPE game_room_type, CREATE_ROOM_TYPE create_room_type, GAME_ROOM_SENIOR_TYPE game_room_senior_type, int i, int i2, boolean z, int i3, int i4, boolean z2, boolean z3, boolean z4, long j6) {
        CSCreateGameRoom.Builder newBuilder = CSCreateGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSRoomName(str);
        newBuilder.setLSmallBlinds(j2);
        newBuilder.setLBigBlinds(j3);
        newBuilder.setLBuyIn(j4);
        newBuilder.setLDuration(j5);
        newBuilder.setLFromRoomID(j);
        newBuilder.setBPrivateRoom(0);
        newBuilder.setBBuyIn(1);
        newBuilder.setEGameRoomType(game_room_type);
        newBuilder.setECreateRoomType(create_room_type);
        newBuilder.setEGameRoomSeniorType(game_room_senior_type);
        newBuilder.setIMaxBuyinRatio(i);
        newBuilder.setIMinBuyinRatio(i2);
        newBuilder.setBBuyinControl(z ? 1 : 0);
        newBuilder.setIGameRoomUserMaxNums(i3);
        newBuilder.setIAnte(i4);
        newBuilder.setBInsurance(z2 ? 1 : 0);
        if (z4) {
            newBuilder.setBIPLimit(1);
        } else {
            newBuilder.setBIPLimit(0);
        }
        if (z3) {
            newBuilder.setBGPSLimit(1);
        } else {
            newBuilder.setBGPSLimit(0);
        }
        if (j6 != -1) {
            newBuilder.setLLeagueID(j6);
        }
        CSCreateGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateGameRoom;
        long j7 = f6567b + 1;
        f6567b = j7;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j7));
    }

    public static void m4119a(String str, SNG_ROOM_TYPE sng_room_type, CREATE_ROOM_TYPE create_room_type, long j, int i, boolean z, boolean z2, boolean z3, long j2) {
        CSCreateSNGGameRoom.Builder newBuilder = CSCreateSNGGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setStrRoomName(str);
        newBuilder.setBPrivateRoom(0);
        newBuilder.setESNGRoomType(sng_room_type);
        newBuilder.setECreateRoomType(create_room_type);
        newBuilder.setLFromRoomID(j);
        newBuilder.setIGameRoomUserMaxNums(i);
        if (z) {
            newBuilder.setBBuyinControl(1);
        } else {
            newBuilder.setBBuyinControl(0);
        }
        if (z3) {
            newBuilder.setBIPLimit(1);
        } else {
            newBuilder.setBIPLimit(0);
        }
        if (z2) {
            newBuilder.setBGPSLimit(1);
        } else {
            newBuilder.setBGPSLimit(0);
        }
        if (j2 != -1) {
            newBuilder.setLLeagueID(j2);
        }
        CSCreateSNGGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateSNGGameRoom;
        long j3 = f6567b + 1;
        f6567b = j3;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4103a(CSPushMsgRsp.Builder builder) {
        builder.setUuid(SharedPreferencesManager.m4308b());
        CSPushMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSPushMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4124a(List<PushMsg> list) {
        CSPushMsgRsp.Builder newBuilder = CSPushMsgRsp.newBuilder();
        for (PushMsg lMsgID : list) {
            newBuilder.addVMsgIds(lMsgID.getLMsgID());
        }
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSPushMsgRsp build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSPushMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4132b(long j) {
        CSGetClubGamesByClubID.Builder newBuilder = CSGetClubGamesByClubID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSGetClubGamesByClubID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubGamesByClubID;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4146c(long j) {
        CSGetChatRoomGamesByRoomID.Builder newBuilder = CSGetChatRoomGamesByRoomID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSGetChatRoomGamesByRoomID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetChatRoomGamesByRoomID;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4079a(long j, int i, CHAT_MESSAGE_TYPE chat_message_type, String str, long j2, byte[] bArr, long j3) {
        m4080a(j, i, chat_message_type, str, j2, bArr, j3, null);
    }

    private static void m4080a(long j, int i, CHAT_MESSAGE_TYPE chat_message_type, String str, long j2, byte[] bArr, long j3, List<String> list) {
        long parseLong;
        CSSendMsg.Builder newBuilder = CSSendMsg.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLTalkwith(j);
        newBuilder.setETalkType(CHAT_TYPE.valueOf(i));
        newBuilder.setEChatMessageType(chat_message_type);
        newBuilder.setSMsg(str);
        newBuilder.setLMsgId(j2);
        if (bArr != null) {
            newBuilder.setVVoiceDatas(ByteString.copyFrom(bArr));
        }
        newBuilder.setLDuration(j3);
        if (chat_message_type == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL) {
            parseLong = Long.parseLong(str);
            Bill a = DBManager.m3631a().f5570j.m3554a(parseLong, true);
            ShareBillInfoNet.Builder newBuilder2 = ShareBillInfoNet.newBuilder();
            newBuilder2.setLShareUuid(SharedPreferencesManager.m4308b());
            BillInfoNet.Builder newBuilder3 = BillInfoNet.newBuilder();
            newBuilder3.setEGameRoomType(GAME_ROOM_TYPE.valueOf(a.f5644c.intValue()));
            UserBaseInfoNet.Builder newBuilder4;
            UserBillInfoNet build;
            if (a.f5644c.intValue() != 2) {
                NormalBillInfoNet.Builder newBuilder5 = NormalBillInfoNet.newBuilder();
                newBuilder5.setLBillID(parseLong);
                newBuilder5.setSPlayName(a.f5629M);
                newBuilder4 = UserBaseInfoNet.newBuilder();
                newBuilder4.setUuid(a.m3715i().f5842u.longValue());
                newBuilder4.setEType(ID_TYPE.valueOf(a.m3715i().f5828g.intValue()));
                newBuilder4.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
                newBuilder4.setStrCover(a.m3715i().f5836o);
                newBuilder4.setStrNick(a.m3715i().f5838q);
                newBuilder4.setStrPhoneNumber(LetterIndexBar.SEARCH_ICON_LETTER);
                newBuilder4.setEVipType(VIP_TYPE.valueOf(a.m3715i().f5830i.intValue()));
                newBuilder4.setIGender(a.m3715i().f5832k.intValue());
                newBuilder4.setLLoginTime(a.m3715i().f5843v.longValue());
                newBuilder4.setStrDesc(a.m3715i().f5835n);
                newBuilder5.setStCreateUserBaseInfo(newBuilder4.build());
                newBuilder5.setLCreateTime(a.f5626J.longValue());
                newBuilder5.setLDuration(a.f5627K.longValue());
                newBuilder5.setLSmallBlind(a.f5662u.longValue());
                newBuilder5.setLBigBlind(a.f5663v.longValue());
                newBuilder5.setLBuyin(a.f5666y.longValue());
                newBuilder5.setLTotalBuyin(a.f5661t.longValue());
                newBuilder5.setLMaxPot(a.f5665x.longValue());
                newBuilder5.setLTotalGameNum(a.f5660s.longValue());
                if (StringUtils.m4462a(a.f5630N)) {
                    newBuilder5.setSFromText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    newBuilder5.setSFromText(a.f5630N);
                }
                newBuilder5.setIGameRoomUserMaxNums(a.f5654m.intValue());
                newBuilder5.setSLeagueName(a.f5635S);
                newBuilder5.setLLeagueID(a.f5634R.longValue());
                if (a.f5634R != null && a.f5634R.longValue() > 0) {
                    if (!StringUtils.m4462a(a.f5636T)) {
                        newBuilder3.setSFromClubUrl(a.f5636T);
                    }
                    if (!StringUtils.m4462a(a.f5630N)) {
                        newBuilder3.setSFromClubName(a.f5630N);
                    }
                    if (!StringUtils.m4462a(a.f5637U)) {
                        newBuilder3.setSFromClubCreatorName(a.f5637U);
                    }
                }
                if (a.f5656o == null) {
                    newBuilder5.setIAnte(0);
                } else {
                    newBuilder5.setIAnte(a.f5656o.intValue());
                }
                if (a.f5644c.intValue() == 3 && a.f5644c.intValue() == 6) {
                    newBuilder5.setBInsurance(1);
                } else {
                    newBuilder5.setBInsurance(0);
                }
                for (UserBill userBill : DBManager.m3631a().f5571k.m3705a(parseLong, true)) {
                    UserBillInfoNet.Builder newBuilder6 = UserBillInfoNet.newBuilder();
                    newBuilder6.setLTotalBuyStacks(userBill.f6007d.longValue());
                    newBuilder6.setLRemainBuyStacks(userBill.f6006c.longValue());
                    newBuilder6.setUuid(userBill.f6009f.longValue());
                    if (userBill.f6011h != null) {
                        newBuilder6.setLInsuranceGetStacks(userBill.f6011h.longValue());
                    } else {
                        newBuilder6.setLInsuranceGetStacks(0);
                    }
                    if (userBill.f6012i != null) {
                        newBuilder6.setLInsuranceBuyin(userBill.f6012i.longValue());
                    } else {
                        newBuilder6.setLInsuranceBuyin(0);
                    }
                    build = newBuilder6.build();
                    newBuilder6.clear();
                    newBuilder5.addVUserBillInfos(build);
                }
                if (a.f5644c.intValue() == 3 || a.f5644c.intValue() == 6) {
                    UserBillInfoNet.Builder newBuilder7 = UserBillInfoNet.newBuilder();
                    newBuilder7.setUuid(1000);
                    newBuilder7.setLInsuranceGetStacks(a.f5625I.longValue());
                    UserBillInfoNet build2 = newBuilder7.build();
                    newBuilder7.clear();
                    newBuilder5.addVUserBillInfos(build2);
                }
                newBuilder3.setStNormalBillInfoNet(newBuilder5.build());
            } else {
                SNGBillInfoNet.Builder newBuilder8 = SNGBillInfoNet.newBuilder();
                newBuilder8.setLBillID(parseLong);
                newBuilder8.setSPlayName(a.f5629M);
                newBuilder8.setESNGRoomType(SNG_ROOM_TYPE.valueOf(a.f5655n.intValue()));
                newBuilder4 = UserBaseInfoNet.newBuilder();
                newBuilder4.setUuid(a.m3715i().f5842u.longValue());
                newBuilder4.setEType(ID_TYPE.valueOf(a.m3715i().f5828g.intValue()));
                newBuilder4.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
                newBuilder4.setStrCover(a.m3715i().f5836o);
                newBuilder4.setStrNick(a.m3715i().f5838q);
                newBuilder4.setStrPhoneNumber(LetterIndexBar.SEARCH_ICON_LETTER);
                newBuilder4.setEVipType(VIP_TYPE.valueOf(a.m3715i().f5830i.intValue()));
                newBuilder4.setIGender(a.m3715i().f5832k.intValue());
                newBuilder4.setLLoginTime(a.m3715i().f5843v.longValue());
                newBuilder4.setStrDesc(a.m3715i().f5835n);
                newBuilder8.setStCreateUserBaseInfo(newBuilder4.build());
                newBuilder8.setLCreateTime(a.f5626J.longValue());
                if (StringUtils.m4462a(a.f5630N)) {
                    newBuilder8.setSFromText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    newBuilder8.setSFromText(a.f5630N);
                }
                newBuilder8.setECreateRoomType(CREATE_ROOM_TYPE.valueOf(a.f5645d.intValue()));
                newBuilder8.setLFromRoomID(a.f5667z.longValue());
                if (a.f5651j.booleanValue()) {
                    newBuilder8.setBPrivateRoom(1);
                } else {
                    newBuilder8.setBPrivateRoom(0);
                }
                newBuilder8.setLOriginalStacks(a.f5652k.longValue());
                newBuilder8.setIBlindInterval(a.f5653l.intValue());
                newBuilder8.setIGameRoomUserMaxNums(a.f5654m.intValue());
                newBuilder8.setSLeagueName(a.f5635S);
                newBuilder8.setLLeagueID(a.f5634R.longValue());
                for (UserBill userBill2 : DBManager.m3631a().f5571k.m3705a(parseLong, true)) {
                    UserBillInfoNet.Builder newBuilder9 = UserBillInfoNet.newBuilder();
                    newBuilder9.setLTotalBuyStacks(userBill2.f6007d.longValue());
                    newBuilder9.setLRemainBuyStacks(userBill2.f6006c.longValue());
                    newBuilder9.setUuid(userBill2.f6009f.longValue());
                    newBuilder9.setISngRank(userBill2.f6010g.longValue());
                    build = newBuilder9.build();
                    newBuilder9.clear();
                    newBuilder8.addVUserBillInfos(build);
                }
                newBuilder3.setStSNGBillInfoNet(newBuilder8.build());
            }
            newBuilder2.setStBillInfo(newBuilder3.build());
            newBuilder.setStShareBillInfo(newBuilder2.build());
        } else if (chat_message_type == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_POKER_HISTORY) {
            String[] split = str.split("-");
            PokerHistory a2 = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
            SharePokerHistoryInfo.Builder newBuilder10 = SharePokerHistoryInfo.newBuilder();
            newBuilder10.setLShareUuid(SharedPreferencesManager.m4308b());
            FavoritePokerHistoryInfo.Builder newBuilder11 = FavoritePokerHistoryInfo.newBuilder();
            newBuilder11.setLFavoriteUuid(a2.f5970p.longValue());
            newBuilder11.setSFavoriteName(a2.f5975u);
            PokerHistoryInfo.Builder newBuilder12 = PokerHistoryInfo.newBuilder();
            newBuilder12.setLSaveUuid(a2.f5970p.longValue());
            newBuilder12.setLRoomID(a2.f5968n.longValue());
            newBuilder12.setLHandID(a2.f5967m.longValue());
            newBuilder12.setSPokerHistoryName(a2.f5975u);
            newBuilder12.setSPokerHistoryRoomName(a2.f5976v);
            newBuilder12.setLTime(a2.f5969o.longValue());
            newBuilder12.setLSmallBlind(a2.f5972r.longValue());
            newBuilder12.setLBigBlind(a2.f5964j.longValue());
            if (a2.f5956b.booleanValue()) {
                newBuilder12.setBInGame(1);
            } else {
                newBuilder12.setBInGame(0);
            }
            newBuilder12.setLGetPopularity(a2.f5966l.longValue());
            newBuilder12.setSPokerHistoryUrl(a2.f5978x);
            newBuilder12.setSPokerHistoryShareUrl(a2.f5977w);
            newBuilder12.setIGameType(a2.f5963i.intValue());
            newBuilder12.addVHandCards(a2.f5958d.intValue());
            newBuilder12.addVHandCards(a2.f5959e.intValue());
            newBuilder12.setLMaxPot(a2.f5980z.longValue());
            if (a2.f5952A == null) {
                newBuilder12.setIType(0);
            } else {
                newBuilder12.setIType(a2.f5952A.intValue());
            }
            if (a2.f5954C == null) {
                newBuilder12.setSPokerDesc(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                newBuilder12.setSPokerDesc(a2.f5954C);
            }
            if (a2.f5953B == null) {
                newBuilder12.setLWinUuid(0);
            } else {
                newBuilder12.setLWinUuid(a2.f5953B.longValue());
            }
            if (a2.f5962h != null && a2.f5962h.booleanValue()) {
                newBuilder12.addVHandCards(a2.f5960f.intValue());
                newBuilder12.addVHandCards(a2.f5961g.intValue());
            }
            if (a2.f5979y == null && a2.f5979y.intValue() == 0) {
                newBuilder12.setIAnte(0);
            } else {
                newBuilder12.setIAnte(a2.f5979y.intValue());
            }
            newBuilder11.setStPokerHistoryInfo(newBuilder12.build());
            newBuilder10.setStFavoritePokerHistoryInfo(newBuilder11.build());
            newBuilder.setStSharePokerHistoryInfo(newBuilder10.build());
        } else if (chat_message_type == CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE) {
            newBuilder.addAllVExtras(list);
        }
        CSSendMsg build3 = newBuilder.build();
        newBuilder.clear();
        parseLong = SharedPreferencesManager.m4308b();
        ByteString toByteString = build3.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSendMsg;
        long j4 = f6567b + 1;
        f6567b = j4;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(parseLong, toByteString, texas_cmd, j4));
    }

    public static void m4089a(long j, Bill bill, CHAT_TYPE chat_type) {
        CSSendMsg.Builder newBuilder = CSSendMsg.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLTalkwith(j);
        newBuilder.setETalkType(chat_type);
        newBuilder.setEChatMessageType(CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL);
        ShareBillInfoNet.Builder newBuilder2 = ShareBillInfoNet.newBuilder();
        newBuilder2.setLShareUuid(SharedPreferencesManager.m4308b());
        BillInfoNet.Builder newBuilder3 = BillInfoNet.newBuilder();
        newBuilder3.setEGameRoomType(GAME_ROOM_TYPE.valueOf(bill.f5644c.intValue()));
        UserBaseInfoNet.Builder newBuilder4;
        UserBillInfoNet.Builder newBuilder5;
        UserBillInfoNet build;
        if (bill.f5644c.intValue() != 2) {
            NormalBillInfoNet.Builder newBuilder6 = NormalBillInfoNet.newBuilder();
            newBuilder6.setLBillID(bill.f5643b.longValue());
            newBuilder6.setSPlayName(bill.f5629M);
            newBuilder4 = UserBaseInfoNet.newBuilder();
            newBuilder4.setUuid(bill.f5631O.longValue());
            newBuilder4.setEType(ID_TYPE.valueOf(bill.m3715i().f5828g.intValue()));
            newBuilder4.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder4.setStrCover(bill.m3715i().f5836o);
            newBuilder4.setStrNick(bill.m3715i().f5838q);
            newBuilder4.setStrPhoneNumber(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder4.setEVipType(VIP_TYPE.valueOf(bill.m3715i().f5830i.intValue()));
            newBuilder4.setIGender(bill.m3715i().f5832k.intValue());
            newBuilder4.setLLoginTime(bill.m3715i().f5843v.longValue());
            newBuilder4.setStrDesc(bill.m3715i().f5835n);
            newBuilder6.setStCreateUserBaseInfo(newBuilder4.build());
            newBuilder6.setLCreateTime(bill.f5626J.longValue());
            newBuilder6.setLDuration(bill.f5627K.longValue());
            newBuilder6.setLSmallBlind(bill.f5662u.longValue());
            newBuilder6.setLBigBlind(bill.f5663v.longValue());
            newBuilder6.setLBuyin(bill.f5666y.longValue());
            newBuilder6.setLTotalBuyin(bill.f5661t.longValue());
            newBuilder6.setLTotalGameNum(bill.f5660s.longValue());
            newBuilder6.setLMaxPot(bill.f5665x.longValue());
            if (StringUtils.m4462a(bill.f5630N)) {
                newBuilder6.setSFromText(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                newBuilder6.setSFromText(bill.f5630N);
            }
            newBuilder6.setECreateRoomType(CREATE_ROOM_TYPE.valueOf(bill.f5645d.intValue()));
            newBuilder6.setLFromRoomID(bill.f5667z.longValue());
            newBuilder6.setIGameRoomUserMaxNums(bill.f5654m.intValue());
            newBuilder6.setSLeagueName(bill.f5635S);
            newBuilder6.setLLeagueID(bill.f5634R.longValue());
            if (bill.f5634R != null && bill.f5634R.longValue() > 0) {
                if (!StringUtils.m4462a(bill.f5636T)) {
                    newBuilder3.setSFromClubUrl(bill.f5636T);
                }
                if (!StringUtils.m4462a(bill.f5630N)) {
                    newBuilder3.setSFromClubName(bill.f5630N);
                }
                if (!StringUtils.m4462a(bill.f5637U)) {
                    newBuilder3.setSFromClubCreatorName(bill.f5637U);
                }
            }
            if (bill.f5656o == null) {
                newBuilder6.setIAnte(0);
            } else {
                newBuilder6.setIAnte(bill.f5656o.intValue());
            }
            if (bill.f5644c.intValue() == 3 && bill.f5644c.intValue() == 6) {
                newBuilder6.setBInsurance(1);
            } else {
                newBuilder6.setBInsurance(0);
            }
            for (UserBill userBill : DBManager.m3631a().f5571k.m3705a(bill.f5643b.longValue(), false)) {
                newBuilder5 = UserBillInfoNet.newBuilder();
                newBuilder5.setLTotalBuyStacks(userBill.f6007d.longValue());
                newBuilder5.setLRemainBuyStacks(userBill.f6006c.longValue());
                newBuilder5.setUuid(userBill.f6009f.longValue());
                if (userBill.f6011h != null) {
                    newBuilder5.setLInsuranceGetStacks(userBill.f6011h.longValue());
                } else {
                    newBuilder5.setLInsuranceGetStacks(0);
                }
                if (userBill.f6012i != null) {
                    newBuilder5.setLInsuranceBuyin(userBill.f6012i.longValue());
                } else {
                    newBuilder5.setLInsuranceBuyin(0);
                }
                build = newBuilder5.build();
                newBuilder5.clear();
                newBuilder6.addVUserBillInfos(build);
            }
            if (bill.f5644c.intValue() == 3 || bill.f5644c.intValue() == 6) {
                UserBillInfoNet.Builder newBuilder7 = UserBillInfoNet.newBuilder();
                newBuilder7.setUuid(1000);
                newBuilder7.setLInsuranceGetStacks(bill.f5625I.longValue());
                UserBillInfoNet build2 = newBuilder7.build();
                newBuilder7.clear();
                newBuilder6.addVUserBillInfos(build2);
            }
            newBuilder3.setStNormalBillInfoNet(newBuilder6.build());
        } else {
            SNGBillInfoNet.Builder newBuilder8 = SNGBillInfoNet.newBuilder();
            newBuilder8.setLBillID(bill.f5643b.longValue());
            newBuilder8.setSPlayName(bill.f5629M);
            newBuilder8.setESNGRoomType(SNG_ROOM_TYPE.valueOf(bill.f5655n.intValue()));
            newBuilder4 = UserBaseInfoNet.newBuilder();
            newBuilder4.setUuid(bill.f5631O.longValue());
            newBuilder4.setEType(ID_TYPE.valueOf(bill.m3715i().f5828g.intValue()));
            newBuilder4.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder4.setStrCover(bill.m3715i().f5836o);
            newBuilder4.setStrNick(bill.m3715i().f5838q);
            newBuilder4.setStrPhoneNumber(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder4.setEVipType(VIP_TYPE.valueOf(bill.m3715i().f5830i.intValue()));
            newBuilder4.setIGender(bill.m3715i().f5832k.intValue());
            newBuilder4.setLLoginTime(bill.m3715i().f5843v.longValue());
            newBuilder4.setStrDesc(bill.m3715i().f5835n);
            newBuilder8.setStCreateUserBaseInfo(newBuilder4.build());
            newBuilder8.setLCreateTime(bill.f5626J.longValue());
            if (StringUtils.m4462a(bill.f5630N)) {
                newBuilder8.setSFromText(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                newBuilder8.setSFromText(bill.f5630N);
            }
            newBuilder8.setECreateRoomType(CREATE_ROOM_TYPE.valueOf(bill.f5645d.intValue()));
            newBuilder8.setLFromRoomID(bill.f5667z.longValue());
            newBuilder8.setLOriginalStacks(bill.f5652k.longValue());
            newBuilder8.setIBlindInterval(bill.f5653l.intValue());
            newBuilder8.setIGameRoomUserMaxNums(bill.f5654m.intValue());
            newBuilder8.setSLeagueName(bill.f5635S);
            newBuilder8.setLLeagueID(bill.f5634R.longValue());
            for (UserBill userBill2 : DBManager.m3631a().f5571k.m3705a(bill.f5643b.longValue(), false)) {
                newBuilder5 = UserBillInfoNet.newBuilder();
                newBuilder5.setLTotalBuyStacks(userBill2.f6007d.longValue());
                newBuilder5.setLRemainBuyStacks(userBill2.f6006c.longValue());
                newBuilder5.setUuid(userBill2.f6009f.longValue());
                newBuilder5.setISngRank(userBill2.f6010g.longValue());
                build = newBuilder5.build();
                newBuilder5.clear();
                newBuilder8.addVUserBillInfos(build);
            }
            newBuilder3.setStSNGBillInfoNet(newBuilder8.build());
        }
        newBuilder2.setStBillInfo(newBuilder3.build());
        newBuilder.setStShareBillInfo(newBuilder2.build());
        long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
        newBuilder.setLMsgId(currentTimeMillis);
        CSSendMsg build3 = newBuilder.build();
        newBuilder.clear();
        int number = chat_type.getNumber();
        if (chat_type == CHAT_TYPE.CHAT_TYPE_CLUB) {
            number = 2;
        }
        DBManager.m3631a().f5566f.m3568a(build3.getLTalkwith(), currentTimeMillis, number, build3.getEChatMessageType().getNumber(), bill.f5643b, 0);
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build3.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSendMsg;
        currentTimeMillis = f6567b + 1;
        f6567b = currentTimeMillis;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, currentTimeMillis));
    }

    public static void m4092a(long j, BillInfoNet billInfoNet, CHAT_TYPE chat_type) {
        long j2;
        CSSendMsg.Builder newBuilder = CSSendMsg.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLTalkwith(j);
        newBuilder.setETalkType(chat_type);
        newBuilder.setEChatMessageType(CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_BILL);
        ShareBillInfoNet.Builder newBuilder2 = ShareBillInfoNet.newBuilder();
        newBuilder2.setLShareUuid(SharedPreferencesManager.m4308b());
        BillInfoNet.Builder newBuilder3 = BillInfoNet.newBuilder();
        newBuilder3.setEGameRoomType(billInfoNet.getEGameRoomType());
        long lBillID;
        UserBaseInfoNet.Builder newBuilder4;
        UserBillInfoNet.Builder newBuilder5;
        UserBillInfoNet build;
        if (billInfoNet.getEGameRoomType() != GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            newBuilder3.setSFromClubUrl(billInfoNet.getSFromClubUrl());
            newBuilder3.setSFromClubName(billInfoNet.getSFromClubName());
            NormalBillInfoNet.Builder newBuilder6 = NormalBillInfoNet.newBuilder();
            newBuilder6.setLBillID(billInfoNet.getStNormalBillInfoNet().getLBillID());
            newBuilder6.setSPlayName(billInfoNet.getStNormalBillInfoNet().getSPlayName());
            newBuilder6.setBInsurance(billInfoNet.getStNormalBillInfoNet().getBInsurance());
            lBillID = billInfoNet.getStNormalBillInfoNet().getLBillID();
            newBuilder4 = UserBaseInfoNet.newBuilder();
            newBuilder4.setUuid(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid());
            newBuilder4.setEType(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getEType());
            newBuilder4.setStrID(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrID());
            newBuilder4.setStrCover(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrCover());
            newBuilder4.setStrNick(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick());
            newBuilder4.setStrPhoneNumber(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrPhoneNumber());
            newBuilder4.setEVipType(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getEVipType());
            newBuilder4.setIGender(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getIGender());
            newBuilder4.setLLoginTime(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getLLoginTime());
            newBuilder4.setStrDesc(billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrDesc());
            newBuilder6.setStCreateUserBaseInfo(newBuilder4.build());
            newBuilder6.setLCreateTime(billInfoNet.getStNormalBillInfoNet().getLCreateTime());
            newBuilder6.setLDuration(billInfoNet.getStNormalBillInfoNet().getLDuration());
            newBuilder6.setLSmallBlind(billInfoNet.getStNormalBillInfoNet().getLSmallBlind());
            newBuilder6.setLBigBlind(billInfoNet.getStNormalBillInfoNet().getLBigBlind());
            newBuilder6.setLBuyin(billInfoNet.getStNormalBillInfoNet().getLBuyin());
            newBuilder6.setLTotalBuyin(billInfoNet.getStNormalBillInfoNet().getLTotalBuyin());
            newBuilder6.setLTotalGameNum(billInfoNet.getStNormalBillInfoNet().getLTotalGameNum());
            newBuilder6.setLMaxPot(billInfoNet.getStNormalBillInfoNet().getLMaxPot());
            newBuilder6.setSFromText(billInfoNet.getStNormalBillInfoNet().getSFromText());
            newBuilder6.setECreateRoomType(billInfoNet.getStNormalBillInfoNet().getECreateRoomType());
            newBuilder6.setLFromRoomID(billInfoNet.getStNormalBillInfoNet().getLFromRoomID());
            newBuilder6.setIGameRoomUserMaxNums(billInfoNet.getStNormalBillInfoNet().getIGameRoomUserMaxNums());
            newBuilder6.setSLeagueName(billInfoNet.getStNormalBillInfoNet().getSLeagueName());
            newBuilder6.setLLeagueID(billInfoNet.getStNormalBillInfoNet().getLLeagueID());
            for (UserBillInfoNet build2 : billInfoNet.getStNormalBillInfoNet().getVUserBillInfosList()) {
                newBuilder5 = UserBillInfoNet.newBuilder();
                newBuilder5.setLTotalBuyStacks(build2.getLTotalBuyStacks());
                newBuilder5.setLRemainBuyStacks(build2.getLRemainBuyStacks());
                newBuilder5.setUuid(build2.getUuid());
                newBuilder5.setLInsuranceBuyin(build2.getLInsuranceBuyin());
                newBuilder5.setLInsuranceGetStacks(build2.getLInsuranceGetStacks());
                build2 = newBuilder5.build();
                newBuilder5.clear();
                newBuilder6.addVUserBillInfos(build2);
            }
            newBuilder3.setStNormalBillInfoNet(newBuilder6);
            j2 = lBillID;
        } else {
            SNGBillInfoNet.Builder newBuilder7 = SNGBillInfoNet.newBuilder();
            newBuilder7.setLBillID(billInfoNet.getStSNGBillInfoNet().getLBillID());
            newBuilder7.setSPlayName(billInfoNet.getStSNGBillInfoNet().getSPlayName());
            newBuilder7.setESNGRoomType(billInfoNet.getStSNGBillInfoNet().getESNGRoomType());
            lBillID = billInfoNet.getStSNGBillInfoNet().getLBillID();
            newBuilder4 = UserBaseInfoNet.newBuilder();
            newBuilder4.setUuid(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getUuid());
            newBuilder4.setEType(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getEType());
            newBuilder4.setStrID(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrID());
            newBuilder4.setStrCover(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrCover());
            newBuilder4.setStrNick(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrNick());
            newBuilder4.setStrPhoneNumber(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrPhoneNumber());
            newBuilder4.setEVipType(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getEVipType());
            newBuilder4.setIGender(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getIGender());
            newBuilder4.setLLoginTime(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getLLoginTime());
            newBuilder4.setStrDesc(billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrDesc());
            newBuilder7.setStCreateUserBaseInfo(newBuilder4.build());
            newBuilder7.setLCreateTime(billInfoNet.getStSNGBillInfoNet().getLCreateTime());
            newBuilder7.setSFromText(billInfoNet.getStSNGBillInfoNet().getSFromText());
            newBuilder7.setECreateRoomType(billInfoNet.getStSNGBillInfoNet().getECreateRoomType());
            newBuilder7.setLFromRoomID(billInfoNet.getStSNGBillInfoNet().getLFromRoomID());
            newBuilder7.setBPrivateRoom(billInfoNet.getStSNGBillInfoNet().getBPrivateRoom());
            newBuilder7.setLOriginalStacks(billInfoNet.getStSNGBillInfoNet().getLOriginalStacks());
            newBuilder7.setIBlindInterval(billInfoNet.getStSNGBillInfoNet().getIBlindInterval());
            newBuilder7.setIGameRoomUserMaxNums(billInfoNet.getStSNGBillInfoNet().getIGameRoomUserMaxNums());
            newBuilder7.setSLeagueName(billInfoNet.getStSNGBillInfoNet().getSLeagueName());
            newBuilder7.setLLeagueID(billInfoNet.getStSNGBillInfoNet().getLLeagueID());
            for (UserBillInfoNet build22 : billInfoNet.getStSNGBillInfoNet().getVUserBillInfosList()) {
                newBuilder5 = UserBillInfoNet.newBuilder();
                newBuilder5.setLTotalBuyStacks(build22.getLTotalBuyStacks());
                newBuilder5.setLRemainBuyStacks(build22.getLRemainBuyStacks());
                newBuilder5.setUuid(build22.getUuid());
                newBuilder5.setISngRank(build22.getISngRank());
                build22 = newBuilder5.build();
                newBuilder5.clear();
                newBuilder7.addVUserBillInfos(build22);
            }
            newBuilder3.setStSNGBillInfoNet(newBuilder7.build());
            j2 = lBillID;
        }
        newBuilder2.setStBillInfo(newBuilder3.build());
        newBuilder.setStShareBillInfo(newBuilder2.build());
        long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
        newBuilder.setLMsgId(currentTimeMillis);
        CSSendMsg build3 = newBuilder.build();
        newBuilder.clear();
        int number = chat_type.getNumber();
        if (chat_type == CHAT_TYPE.CHAT_TYPE_CLUB) {
            number = 2;
        }
        DBManager.m3631a().f5566f.m3568a(build3.getLTalkwith(), currentTimeMillis, number, build3.getEChatMessageType().getNumber(), String.valueOf(j2), 0);
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build3.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSendMsg;
        currentTimeMillis = f6567b + 1;
        f6567b = currentTimeMillis;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, currentTimeMillis));
    }

    public static void m4090a(long j, PokerHistory pokerHistory, CHAT_TYPE chat_type) {
        CSSendMsg.Builder newBuilder = CSSendMsg.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLTalkwith(j);
        newBuilder.setETalkType(chat_type);
        newBuilder.setEChatMessageType(CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_POKER_HISTORY);
        SharePokerHistoryInfo.Builder newBuilder2 = SharePokerHistoryInfo.newBuilder();
        newBuilder2.setLShareUuid(pokerHistory.f5970p.longValue());
        FavoritePokerHistoryInfo.Builder newBuilder3 = FavoritePokerHistoryInfo.newBuilder();
        newBuilder3.setLFavoriteUuid(pokerHistory.f5970p.longValue());
        newBuilder3.setSFavoriteName(pokerHistory.f5975u);
        PokerHistoryInfo.Builder newBuilder4 = PokerHistoryInfo.newBuilder();
        newBuilder4.setLSaveUuid(pokerHistory.f5970p.longValue());
        newBuilder4.setLRoomID(pokerHistory.f5968n.longValue());
        newBuilder4.setLHandID(pokerHistory.f5967m.longValue());
        newBuilder4.setSPokerHistoryName(pokerHistory.f5975u);
        newBuilder4.setSPokerHistoryRoomName(pokerHistory.f5976v);
        newBuilder4.setLTime(pokerHistory.f5969o.longValue());
        newBuilder4.setLSmallBlind(pokerHistory.f5972r.longValue());
        newBuilder4.setLBigBlind(pokerHistory.f5964j.longValue());
        if (pokerHistory.f5956b.booleanValue()) {
            newBuilder4.setBInGame(1);
        } else {
            newBuilder4.setBInGame(0);
        }
        newBuilder4.setLGetPopularity(pokerHistory.f5966l.longValue());
        newBuilder4.setSPokerHistoryUrl(pokerHistory.f5978x);
        newBuilder4.setSPokerHistoryShareUrl(pokerHistory.f5977w);
        newBuilder4.setIGameType(pokerHistory.f5963i.intValue());
        newBuilder4.addVHandCards(pokerHistory.f5958d.intValue());
        newBuilder4.addVHandCards(pokerHistory.f5959e.intValue());
        newBuilder4.setLMaxPot(pokerHistory.f5980z.longValue());
        if (pokerHistory.f5952A == null) {
            newBuilder4.setIType(0);
        } else {
            newBuilder4.setIType(pokerHistory.f5952A.intValue());
        }
        if (pokerHistory.f5954C == null) {
            newBuilder4.setSPokerDesc(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            newBuilder4.setSPokerDesc(pokerHistory.f5954C);
        }
        if (pokerHistory.f5953B == null) {
            newBuilder4.setLWinUuid(0);
        } else {
            newBuilder4.setLWinUuid(pokerHistory.f5953B.longValue());
        }
        if (pokerHistory.f5962h != null && pokerHistory.f5962h.booleanValue()) {
            newBuilder4.addVHandCards(pokerHistory.f5960f.intValue());
            newBuilder4.addVHandCards(pokerHistory.f5961g.intValue());
        }
        if (pokerHistory.f5979y != null) {
            newBuilder4.setIAnte(pokerHistory.f5979y.intValue());
        }
        newBuilder3.setStPokerHistoryInfo(newBuilder4.build());
        newBuilder2.setStFavoritePokerHistoryInfo(newBuilder3);
        newBuilder.setStSharePokerHistoryInfo(newBuilder2);
        long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
        newBuilder.setLMsgId(currentTimeMillis);
        CSSendMsg build = newBuilder.build();
        newBuilder.clear();
        int number = chat_type.getNumber();
        if (chat_type == CHAT_TYPE.CHAT_TYPE_CLUB) {
            number = 2;
        }
        DBManager.m3631a().f5566f.m3568a(build.getLTalkwith(), currentTimeMillis, number, build.getEChatMessageType().getNumber(), pokerHistory.f5970p + "-" + pokerHistory.f5968n + "-" + pokerHistory.f5967m, 0);
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSendMsg;
        currentTimeMillis = f6567b + 1;
        f6567b = currentTimeMillis;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, currentTimeMillis));
    }

    public static void m4117a(String str, long j, List<String> list) {
        int i;
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        if (DBManager.m3631a().f5565e.m3590a(j, 2).f5715B.booleanValue()) {
            i = 3;
        } else {
            i = 2;
        }
        m4080a(j, i, CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_GAME_CREATE, str, currentTimeMillis, null, 0, list);
        DBManager.m3631a().f5566f.m3575a(DBManager.m3631a().f5566f.m3568a(j, currentTimeMillis, 2, 5, str, 0), (List) list);
    }

    public static void m4128a(byte[] bArr, long j) {
        CSSendMsg.Builder newBuilder = CSSendMsg.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLTalkwith(AppActivity.c);
        newBuilder.setETalkType(CHAT_TYPE.CHAT_TYPE_GROUP);
        newBuilder.setEChatMessageType(CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE);
        newBuilder.setVVoiceDatas(ByteString.copyFrom(bArr));
        newBuilder.setLDuration(j);
        newBuilder.setLMsgId(System.currentTimeMillis() + RuntimeData.f6671b);
        CSSendMsg build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSendMsg;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4101a(MapList<Long, FriendUser> mapList) {
        CSCreateChatRoom.Builder newBuilder = CSCreateChatRoom.newBuilder();
        for (Object a : mapList.f6665a) {
            FriendUser friendUser = (FriendUser) mapList.m4240a(a);
            UserBaseInfoNet.Builder newBuilder2 = UserBaseInfoNet.newBuilder();
            newBuilder2.setUuid(friendUser.f5842u.longValue());
            newBuilder2.setEType(ID_TYPE.valueOf(friendUser.f5828g.intValue()));
            newBuilder2.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder2.setStrCover(friendUser.f5836o);
            newBuilder2.setStrNick(friendUser.f5838q);
            UserBaseInfoNet build = newBuilder2.build();
            newBuilder2.clear();
            newBuilder.addVUserBaseInfos(build);
        }
        UserBaseInfoNet.Builder newBuilder3 = UserBaseInfoNet.newBuilder();
        newBuilder3.setUuid(SharedPreferencesManager.m4308b());
        newBuilder3.setEType(ID_TYPE.valueOf(SharedPreferencesManager.m4389m()));
        newBuilder3.setStrID(SharedPreferencesManager.m4369j());
        newBuilder3.setStrCover(SharedPreferencesManager.m4375k());
        newBuilder3.setStrNick(SharedPreferencesManager.m4361i());
        UserBaseInfoNet build2 = newBuilder3.build();
        newBuilder3.clear();
        newBuilder.addVUserBaseInfos(build2);
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setNMaxMembers(20);
        newBuilder.setSRoomName(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder.setNCurMembers(mapList.m4238a());
        newBuilder.setLCreateUser(SharedPreferencesManager.m4308b());
        newBuilder.setIRoomType(0);
        newBuilder.setNOwnerInvite(0);
        newBuilder.setNOwnerCreate(0);
        CSCreateChatRoom build3 = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build3.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateChatRoom;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4102a(MapList<Long, FriendUser> mapList, long j) {
        CSAddChatRoomUser.Builder newBuilder = CSAddChatRoomUser.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        for (Object a : mapList.f6665a) {
            FriendUser friendUser = (FriendUser) mapList.m4240a(a);
            UserBaseInfoNet.Builder newBuilder2 = UserBaseInfoNet.newBuilder();
            newBuilder2.setUuid(friendUser.f5842u.longValue());
            newBuilder2.setEType(ID_TYPE.valueOf(friendUser.f5828g.intValue()));
            newBuilder2.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder2.setStrCover(friendUser.f5836o);
            newBuilder2.setStrNick(friendUser.f5838q);
            UserBaseInfoNet build = newBuilder2.build();
            newBuilder2.clear();
            newBuilder.addVUserBaseInfos(build);
        }
        CSAddChatRoomUser build2 = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build2.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSAddChatRoomUser;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4105a(CSSystemClubMsgRsp.Builder builder) {
        CSSystemClubMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemClubMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4091a(long j, CHAT_TYPE chat_type, boolean z, boolean z2) {
        CSSetChatInfoSetting.Builder newBuilder = CSSetChatInfoSetting.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setEChatType(chat_type);
        if (chat_type == CHAT_TYPE.CHAT_TYPE_SINGLE) {
            newBuilder.setChatUuid(j);
        } else {
            newBuilder.setLRoomID(j);
        }
        if (z) {
            newBuilder.setIMute(0);
        } else {
            newBuilder.setIMute(1);
        }
        if (z2) {
            newBuilder.setIVibrate(0);
        } else {
            newBuilder.setIVibrate(1);
        }
        CSSetChatInfoSetting build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetChatInfoSetting;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4114a(String str, long j, int i, int i2) {
        CSSetChatRoomInfo.Builder newBuilder = CSSetChatRoomInfo.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        newBuilder.setSRoomName(str);
        newBuilder.setNOwnerInvite(i2);
        newBuilder.setNOwnerCreate(i);
        CSSetChatRoomInfo build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetChatRoomInfo;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4157d(long j) {
        CSLeaveChatRoom.Builder newBuilder = CSLeaveChatRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSLeaveChatRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSLeaveChatRoom;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4162e(long j) {
        CSGetChatRoomUsersByRoomID.Builder newBuilder = CSGetChatRoomUsersByRoomID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSGetChatRoomUsersByRoomID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetChatRoomUsersByRoomID;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4100a(FriendUser friendUser, long j) {
        CSRemoveChatRoomUser.Builder newBuilder = CSRemoveChatRoomUser.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        UserBaseInfoNet.Builder newBuilder2 = UserBaseInfoNet.newBuilder();
        newBuilder2.setUuid(friendUser.f5842u.longValue());
        newBuilder2.setEType(ID_TYPE.valueOf(friendUser.f5828g.intValue()));
        newBuilder2.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder2.setStrNick(friendUser.f5838q);
        newBuilder2.setStrCover(friendUser.f5836o);
        UserBaseInfoNet build = newBuilder2.build();
        newBuilder2.clear();
        newBuilder.addVUserBaseInfos(build);
        CSRemoveChatRoomUser build2 = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build2.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRemoveChatRoomUser;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4142b(byte[] bArr, long j) {
        CSUploadChatRoomIcon.Builder newBuilder = CSUploadChatRoomIcon.newBuilder();
        newBuilder.setLRoomID(j);
        newBuilder.setVIconDatas(ByteString.copyFrom(bArr));
        CSUploadChatRoomIcon build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadChatRoomIcon;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4172j() {
        CSCheckNicknameStatus.Builder newBuilder = CSCheckNicknameStatus.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSCheckNicknameStatus build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCheckNicknameStatus;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4110a(String str) {
        CSBuyNickname.Builder newBuilder = CSBuyNickname.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSNickname(str);
        CSBuyNickname build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSBuyNickname;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4165f(long j) {
        CSStartQuickRoomGame.Builder newBuilder = CSStartQuickRoomGame.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSStartQuickRoomGame build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSStartQuickRoomGame;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4167g(long j) {
        CSQuitQuickGameRoom.Builder newBuilder = CSQuitQuickGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSQuitQuickGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSQuitQuickGameRoom;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4107a(CSSystemQuickGameRoomMsRspg.Builder builder) {
        CSSystemQuickGameRoomMsRspg build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemQuickGameRoomMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4138b(String str) {
        CSEnterQuickGameRoom.Builder newBuilder = CSEnterQuickGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSCryptCode(str);
        CSEnterQuickGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSEnterQuickGameRoom;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4169h(long j) {
        CSEnterGameRoom.Builder newBuilder = CSEnterGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGameRoomID(j);
        CSEnterGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSEnterGameRoom;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4104a(CSSystemChatRoomMsgRsp.Builder builder) {
        CSSystemChatRoomMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemChatRoomMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4106a(CSSystemGameRoomMsgRsp.Builder builder) {
        CSSystemGameRoomMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemGameRoomMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4171i(long j) {
        CSWatchSNGGameRoom.Builder newBuilder = CSWatchSNGGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGameRoomID(j);
        CSWatchSNGGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSWatchSNGGameRoom;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4173j(long j) {
        CSSignUpSNGGameRoom.Builder newBuilder = CSSignUpSNGGameRoom.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGameRoomID(j);
        CSSignUpSNGGameRoom build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSignUpSNGGameRoom;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4175k(long j) {
        CSBuyinControlMsgRsp.Builder newBuilder = CSBuyinControlMsgRsp.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLMsgId(j);
        CSBuyinControlMsgRsp build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSBuyinControlMsgRsp;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4086a(long j, long j2, BUYIN_CONTROL_TYPE buyin_control_type) {
        CSBuyinAction.Builder newBuilder = CSBuyinAction.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLBuyinActionID(0);
        newBuilder.setLActionUuid(j);
        newBuilder.setLGameRoomID(j2);
        newBuilder.setEBuyinControlMessageType(buyin_control_type);
        CSBuyinAction build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSBuyinAction;
        long j3 = f6567b + 1;
        f6567b = j3;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4174k() {
        CSGetAllBuyinControls.Builder newBuilder = CSGetAllBuyinControls.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGameRoomID(0);
        CSGetAllBuyinControls build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetAllBuyinControls;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4141b(List<Long> list) {
        CSUseItemPushMsgRsp.Builder newBuilder = CSUseItemPushMsgRsp.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.addAllVMsgIds(list);
        CSUseItemPushMsgRsp build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUseItemPushMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4177l(long j) {
        CSGetGameRoomInfoByRoomID.Builder newBuilder = CSGetGameRoomInfoByRoomID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLRoomID(j);
        CSGetGameRoomInfoByRoomID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetGameRoomInfoByRoomID;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4151c(String str) {
        CSUploadAPNToken.Builder newBuilder = CSUploadAPNToken.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        newBuilder.setStrAndroidXingeAPNToken(str);
        CSUploadAPNToken build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadAPNToken;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4176l() {
        CSGetBannerInfos.Builder newBuilder = CSGetBannerInfos.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIOffset(0);
        newBuilder.setINum(0);
        CSGetBannerInfos build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetBannerInfos;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4178m() {
        CSUpdate.Builder newBuilder = CSUpdate.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIMobleSystem(0);
        newBuilder.setISysVersion(240500);
        newBuilder.setStrMobileVersion("Android " + DeviceUtils.m4234a());
        newBuilder.setStrMobileScreen(DeviceUtils.m4235b());
        newBuilder.setIAuto(0);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        newBuilder.setEDeviceType(DEVICE_TYPE.DEVICE_TYPE_ANDROID);
        if (Config.f6659d == Config.f6657b) {
            newBuilder.setIChannel(1);
        } else if (Config.f6659d == Config.f6658c) {
            newBuilder.setIChannel(2);
        }
        CSUpdate build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUpdate;
        long j = f6567b + 1;
        f6567b = j;
        Package a = TCPUtil.m4465a(b, toByteString, texas_cmd, j);
        HttpManager a2 = HttpManager.m3919a();
        if (a != null) {
            new StringBuilder("req cmd = ").append(a.getECmd());
            Request protoBufHttpRequest = new ProtoBufHttpRequest(a.toByteArray(), HttpManager.f6481c, new HttpManager.HttpManager(a2), "https://update.pokermate.net:8444/TexaspokerUpdateService/appprotocol", (byte) 0);
            protoBufHttpRequest.setRetryPolicy(new DefaultRetryPolicy(Constants.ERRORCODE_UNKNOWN, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            protoBufHttpRequest.toString();
            HttpManager.f6479a.m3920a(protoBufHttpRequest);
        }
    }

    public static void m4180n() {
        CSGetFriendStatus.Builder newBuilder = CSGetFriendStatus.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setEStatus(USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND);
        CSGetFriendStatus build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFriendStatus;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4127a(byte[] bArr, int i) {
        CSUploadUserCover.Builder newBuilder = CSUploadUserCover.newBuilder();
        ByteString copyFrom = ByteString.copyFrom(bArr);
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setVIconDatas(copyFrom);
        newBuilder.setIPos(i);
        CSUploadUserCover build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadUserCover;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4074a(int i) {
        CSDeleteUserCover.Builder newBuilder = CSDeleteUserCover.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIPos(i);
        CSDeleteUserCover build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSDeleteUserCover;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4125a(List<ContactUser> list, UPLOAD_FRIEND_RELATION_TYPE upload_friend_relation_type) {
        long b = SharedPreferencesManager.m4308b();
        CSUploadFriendRelation.Builder newBuilder = CSUploadFriendRelation.newBuilder();
        newBuilder.setUuid(b);
        newBuilder.setEUploadType(upload_friend_relation_type);
        for (ContactUser contactUser : list) {
            UploadUserInfoNet.Builder newBuilder2 = UploadUserInfoNet.newBuilder();
            newBuilder2.setStrIDMD5(contactUser.f6035b);
            if (upload_friend_relation_type == UPLOAD_FRIEND_RELATION_TYPE.UPLOAD_FRIEND_RELATION_PHONE) {
                newBuilder2.setEType(ID_TYPE.ID_TYPE_PHONE);
            } else if (upload_friend_relation_type == UPLOAD_FRIEND_RELATION_TYPE.UPLOAD_FRIEND_RELATION_FACEBOOK) {
                newBuilder2.setEType(ID_TYPE.ID_TYPE_FACEBOOK);
            }
            newBuilder2.setEUploadActionType(UPLOAD_ACTION_TYPE.UPLOAD_ACTION_TYPE_ADD);
            UploadUserInfoNet build = newBuilder2.build();
            newBuilder2.clear();
            newBuilder.addVFriendsInfo(build);
        }
        CSUploadFriendRelation build2 = newBuilder.build();
        newBuilder.clear();
        b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build2.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadFriendRelation;
        long j = f6567b + 1;
        f6567b = j;
        Package a = TCPUtil.m4465a(b, toByteString, texas_cmd, j);
        HttpManager a2 = HttpManager.m3919a();
        if (a != null) {
            TEXAS_CMD eCmd = a.getECmd();
            new StringBuilder("req cmd = ").append(eCmd);
            Request protoBufHttpRequest = new ProtoBufHttpRequest(a.toByteArray(), HttpManager.f6481c, new HttpManager.HttpManager(a2, eCmd), HttpManager.f6480b);
            protoBufHttpRequest.setRetryPolicy(new DefaultRetryPolicy(60000, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            protoBufHttpRequest.toString();
            HttpManager.f6479a.m3920a(protoBufHttpRequest);
        }
    }

    public static void m4160d(String str) {
        CSSearchFriend.Builder newBuilder = CSSearchFriend.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setESearchType(SEARCH_TYPE.NICKNAME_SEARCH_TYPE);
        newBuilder.setSSearchWord(str);
        CSSearchFriend build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSearchFriend;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4099a(long j, boolean z, boolean z2, boolean z3) {
        CSSetUserInfoSetting.Builder newBuilder = CSSetUserInfoSetting.newBuilder();
        newBuilder.setUuid(j);
        if (z) {
            newBuilder.setIMute(0);
        } else {
            newBuilder.setIMute(1);
        }
        if (z2) {
            newBuilder.setIVibrate(0);
        } else {
            newBuilder.setIVibrate(1);
        }
        if (z3) {
            newBuilder.setIFriendInviteMute(1);
        } else {
            newBuilder.setIFriendInviteMute(0);
        }
        CSSetUserInfoSetting build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetUserInfoSetting;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4093a(long j, MSG_ACT msg_act, String str) {
        CSInviteAction.Builder newBuilder = CSInviteAction.newBuilder();
        newBuilder.setEPartyAct(msg_act);
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setFrienduuid(j);
        newBuilder.setSHint(str);
        CSInviteAction build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSInviteAction;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4182o() {
        CSGetSellingItemList.Builder newBuilder = CSGetSellingItemList.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIGetType(0);
        CSGetSellingItemList build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetSellingItemList;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4131b(int i) {
        CSBuySellingItem.Builder newBuilder = CSBuySellingItem.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setISellingItemID(i);
        CSBuySellingItem build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSBuySellingItem;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4145c(int i) {
        CSGetSystemMsgs.Builder newBuilder = CSGetSystemMsgs.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIOffset(i);
        newBuilder.setINum(20);
        CSGetSystemMsgs build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetSystemMsgs;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4152c(String str, String str2) {
        CSCreateClub.Builder newBuilder = CSCreateClub.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSClubName(str);
        newBuilder.setSClubLocation(str2);
        CSCreateClub build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateClub;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4112a(String str, int i, CLUB_SEARCH_TYPE club_search_type) {
        CSSearchClub.Builder newBuilder = CSSearchClub.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSKeyWord(str);
        newBuilder.setIOffset(i);
        newBuilder.setINum(20);
        newBuilder.setEClubSearchType(club_search_type);
        CSSearchClub build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSearchClub;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4139b(String str, int i) {
        CSGetClubsByLocation.Builder newBuilder = CSGetClubsByLocation.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setSClubLocation(str);
        newBuilder.setIOffset(i);
        newBuilder.setINum(20);
        CSGetClubsByLocation build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubsByLocation;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4179m(long j) {
        CSGetClubBaseInfoByClubID.Builder newBuilder = CSGetClubBaseInfoByClubID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSGetClubBaseInfoByClubID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubBaseInfoByClubID;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4094a(long j, String str) {
        CSEnterClub.Builder newBuilder = CSEnterClub.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setSHint(str);
        CSEnterClub build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSEnterClub;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4087a(long j, long j2, CLUB_ACT club_act) {
        CSClubAction.Builder newBuilder = CSClubAction.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setLActionedID(j2);
        newBuilder.setEClubAct(club_act);
        CSClubAction build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSClubAction;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4181n(long j) {
        CSGetClubByClubID.Builder newBuilder = CSGetClubByClubID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSGetClubByClubID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubByClubID;
        long j2 = f6567b + 1;
        f6567b = j2;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4098a(long j, boolean z, boolean z2) {
        CSSetClubSetting.Builder newBuilder = CSSetClubSetting.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        if (z) {
            newBuilder.setBClubMsgMute(0);
        } else {
            newBuilder.setBClubMsgMute(1);
        }
        if (z2) {
            newBuilder.setIManagerCreate(1);
        } else {
            newBuilder.setIManagerCreate(0);
        }
        newBuilder.setBVerify(-1);
        CSSetClubSetting build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetClubSetting;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4183o(long j) {
        CSQuitClub.Builder newBuilder = CSQuitClub.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSQuitClub build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSQuitClub;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4088a(long j, long j2, CLUB_USER_LEVEL club_user_level) {
        CSSetClubUserLevel.Builder newBuilder = CSSetClubUserLevel.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setLClubUserUuid(j2);
        newBuilder.setEClubUserLevel(club_user_level);
        CSSetClubUserLevel build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetClubUserLevel;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4184p() {
        CSGetClubSellingItems.Builder newBuilder = CSGetClubSellingItems.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetClubSellingItems build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubSellingItems;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4078a(long j, int i) {
        CSAddClubMaxMember.Builder newBuilder = CSAddClubMaxMember.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setINum(i);
        CSAddClubMaxMember build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSAddClubMaxMember;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4185p(long j) {
        CSGetFundBillInfos.Builder newBuilder = CSGetFundBillInfos.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSGetFundBillInfos build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFundBillInfos;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4082a(long j, long j2, long j3) {
        CSSetClubFund.Builder newBuilder = CSSetClubFund.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setLClubUserUuid(j2);
        newBuilder.setLFund(j3);
        CSSetClubFund build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetClubFund;
        long j4 = f6567b + 1;
        f6567b = j4;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j4));
    }

    public static void m4133b(long j, int i) {
        CSAddClubFund.Builder newBuilder = CSAddClubFund.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setIItemID(1);
        newBuilder.setIItemNum(i);
        CSAddClubFund build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSAddClubFund;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4154c(byte[] bArr, long j) {
        CSUploadClubICon.Builder newBuilder = CSUploadClubICon.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setVIconDatas(ByteString.copyFrom(bArr));
        newBuilder.setLClubID(j);
        CSUploadClubICon build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadClubICon;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4129a(byte[] bArr, long j, int i) {
        CSUploadClubCover.Builder newBuilder = CSUploadClubCover.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setVIconDatas(ByteString.copyFrom(bArr));
        newBuilder.setLClubID(j);
        newBuilder.setIPos(i);
        CSUploadClubCover build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSUploadClubCover;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4147c(long j, int i) {
        CSDeleteClubCover.Builder newBuilder = CSDeleteClubCover.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setIPos(i);
        CSDeleteClubCover build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSDeleteClubCover;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4096a(long j, String str, String str2) {
        CSSetClubInfo.Builder newBuilder = CSSetClubInfo.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setSClubName(str);
        newBuilder.setSDesc(str2);
        CSSetClubInfo build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetClubInfo;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4187q(long j) {
        CSGetClubInfoByUuid.Builder newBuilder = CSGetClubInfoByUuid.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGetUuid(j);
        CSGetClubInfoByUuid build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetClubInfoByUuid;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4189r(long j) {
        CSRemoveFriend.Builder newBuilder = CSRemoveFriend.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setFriendUuid(j);
        CSRemoveFriend build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRemoveFriend;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4113a(String str, long j) {
        CSFeedback.Builder newBuilder = CSFeedback.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIMobleSystem(0);
        newBuilder.setISysVersion(240500);
        newBuilder.setSContent(str);
        newBuilder.setLFeedbackID(j);
        CSFeedback build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSFeedback;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4191s(long j) {
        CSGetSystemMsgByID.Builder newBuilder = CSGetSystemMsgByID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLSystemMsgID(j);
        CSGetSystemMsgByID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetSystemMsgByID;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4193t(long j) {
        CSGetBenefits.Builder newBuilder = CSGetBenefits.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLSystemMsgID(j);
        CSGetBenefits build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetBenefits;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4186q() {
        CSGetFavoriteListV2.Builder newBuilder = CSGetFavoriteListV2.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetFavoriteListV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFavoriteListV2;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4135b(long j, long j2, long j3) {
        CSRemoveFavoriteV2.Builder newBuilder = CSRemoveFavoriteV2.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLSaveUserUuid(j);
        newBuilder.setLRoomID(j2);
        newBuilder.setLHandID(j3);
        CSRemoveFavoriteV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRemoveFavoriteV2;
        long j4 = f6567b + 1;
        f6567b = j4;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j4));
    }

    public static void m4081a(long j, long j2) {
        CSGetAllPokerHistory.Builder newBuilder = CSGetAllPokerHistory.newBuilder();
        newBuilder.setUuid(j);
        newBuilder.setLGameRoomID(j2);
        CSGetAllPokerHistory build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCSGetAllPokerHistory;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4084a(long j, long j2, long j3, long j4, String str, String str2) {
        CSSaveFavoriteV2.Builder newBuilder = CSSaveFavoriteV2.newBuilder();
        newBuilder.setUuid(j);
        newBuilder.setLSaveUserUuid(j2);
        newBuilder.setLRoomID(j3);
        newBuilder.setLHandID(j4);
        if (StringUtils.m4462a((CharSequence) str)) {
            newBuilder.setSFavoriteUrl(LetterIndexBar.SEARCH_ICON_LETTER);
            newBuilder.setESaveFavoriteType(SAVE_FAVORITE_TYPE.SAVE_FAVORITE_TYPE_ID);
        } else {
            newBuilder.setSFavoriteUrl(str);
            newBuilder.setESaveFavoriteType(SAVE_FAVORITE_TYPE.SAVE_FAVORITE_TYPE_URL);
        }
        if (!StringUtils.m4462a((CharSequence) str2)) {
            newBuilder.setSFavoriteName(str2);
        }
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        CSSaveFavoriteV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSaveFavoriteV2;
        long j5 = f6567b + 1;
        f6567b = j5;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j5));
    }

    public static void m4116a(String str, long j, long j2, long j3, String str2) {
        CSRenameFavorite.Builder newBuilder = CSRenameFavorite.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLSaveUserUuid(j);
        newBuilder.setLRoomID(j2);
        newBuilder.setLHandID(j3);
        newBuilder.setSFavoriteName(str);
        if (StringUtils.m4462a((CharSequence) str2)) {
            newBuilder.setESaveFavoriteType(SAVE_FAVORITE_TYPE.SAVE_FAVORITE_TYPE_ID);
            newBuilder.setSFavoriteUrl(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            newBuilder.setESaveFavoriteType(SAVE_FAVORITE_TYPE.SAVE_FAVORITE_TYPE_URL);
            newBuilder.setSFavoriteUrl(str2);
        }
        CSRenameFavorite build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRenameFavorite;
        long j4 = f6567b + 1;
        f6567b = j4;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j4));
    }

    public static void m4097a(long j, boolean z) {
        CSGetUserBaseInfo.Builder newBuilder = CSGetUserBaseInfo.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLGetUuid(j);
        if (z) {
            newBuilder.setBRemark(1);
        } else {
            newBuilder.setBRemark(0);
        }
        CSGetUserBaseInfo build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetUserBaseInfo;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4134b(long j, long j2) {
        CSGetBillInfosV2.Builder newBuilder = CSGetBillInfosV2.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLNewestTime(j);
        newBuilder.setINum(10);
        newBuilder.setLClubID(j2);
        CSGetBillInfosV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetBillInfosV2;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4156d(int i) {
        CSPreBuyCoinAndroid.Builder newBuilder = CSPreBuyCoinAndroid.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setICoinStoreItemID(i);
        newBuilder.setIMobleSystem(0);
        CSPreBuyCoinAndroid build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSPreBuyCoinAndroid;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4188r() {
        CSGetLoginReward.Builder newBuilder = CSGetLoginReward.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetLoginReward build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetLoginReward;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4190s() {
        CSGetCoinStoreList.Builder newBuilder = CSGetCoinStoreList.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIMobleSystem(0);
        CSGetCoinStoreList build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetCoinStoreList;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4136b(long j, String str) {
        CSRemarkUserNickName.Builder newBuilder = CSRemarkUserNickName.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setRemarkUuid(j);
        newBuilder.setSRemarContent(str);
        CSRemarkUserNickName build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSRemarkUserNickName;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4137b(long j, boolean z) {
        CSGetUserInfoV2.Builder newBuilder = CSGetUserInfoV2.newBuilder();
        newBuilder.setLGetUuid(j);
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(0);
        if (z) {
            newBuilder.setBRemark(1);
        } else {
            newBuilder.setBRemark(0);
        }
        CSGetUserInfoV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetUserInfoV2;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4192t() {
        CSGetMyClubsV2.Builder newBuilder = CSGetMyClubsV2.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetMyClubsV2 build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetMyClubsV2;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4083a(long j, long j2, long j3, long j4) {
        CSShareFavorite.Builder newBuilder = CSShareFavorite.newBuilder();
        newBuilder.setUuid(j);
        newBuilder.setLSaveUserUuid(j2);
        newBuilder.setLRoomID(j3);
        newBuilder.setLHandID(j4);
        newBuilder.setESaveFavoriteType(SAVE_FAVORITE_TYPE.SAVE_FAVORITE_TYPE_ID);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        CSShareFavorite build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSShareFavorite;
        long j5 = f6567b + 1;
        f6567b = j5;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j5));
    }

    public static void m4076a(int i, String str, String str2) {
        CSBuyCoinAndroid.Builder newBuilder = CSBuyCoinAndroid.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setICoinStoreItemID(i);
        newBuilder.setSPurchaseData(str);
        newBuilder.setSPurchaseSignature(str2);
        CSBuyCoinAndroid build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSBuyCoinAndroid;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4148c(long j, long j2) {
        if (SharedPreferencesManager.m4308b() != -1) {
            CSReportLocationInfo.Builder newBuilder = CSReportLocationInfo.newBuilder();
            newBuilder.setUuid(SharedPreferencesManager.m4308b());
            newBuilder.setLLat(j);
            newBuilder.setLLon(j2);
            CSReportLocationInfo build = newBuilder.build();
            newBuilder.clear();
            long b = SharedPreferencesManager.m4308b();
            ByteString toByteString = build.toByteString();
            TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSReportLocationInfo;
            long j3 = f6567b + 1;
            f6567b = j3;
            Package a = TCPUtil.m4465a(b, toByteString, texas_cmd, j3);
            HttpManager a2 = HttpManager.m3919a();
            if (a != null) {
                new StringBuilder("req cmd = ").append(a.getECmd());
                Request protoBufHttpRequest = new ProtoBufHttpRequest(a.toByteArray(), HttpManager.f6481c, new HttpManager.HttpManager(a2), "http://aurigalbs.pokermate.net:8445/texaspokerlocation/appprotocol", (byte) 0);
                protoBufHttpRequest.setRetryPolicy(new DefaultRetryPolicy(Constants.ERRORCODE_UNKNOWN, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                protoBufHttpRequest.toString();
                HttpManager.f6479a.m3920a(protoBufHttpRequest);
            }
        }
    }

    public static void m4195u(long j) {
        CSGetLeagueInfoByClubID.Builder newBuilder = CSGetLeagueInfoByClubID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        CSGetLeagueInfoByClubID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetLeagueInfoByClubID;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4149c(long j, String str) {
        CSCreateLeague.Builder newBuilder = CSCreateLeague.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setSLeagueName(str);
        CSCreateLeague build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSCreateLeague;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4159d(long j, String str) {
        CSSearchLeague.Builder newBuilder = CSSearchLeague.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setSKeyWord(str);
        newBuilder.setEClubSearchType(LEAGUE_SEARCH_TYPE.LEAGUE_ID_SEARCH);
        CSSearchLeague build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSearchLeague;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4158d(long j, long j2) {
        CSEnterLeague.Builder newBuilder = CSEnterLeague.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j);
        newBuilder.setLLeagueID(j2);
        CSEnterLeague build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSEnterLeague;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4108a(CSSystemLeagueMsgRsp.Builder builder) {
        CSSystemLeagueMsgRsp build = builder.build();
        builder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSystemLeagueMsgRsp;
        long j = f6567b + 1;
        f6567b = j;
        PushManager.m3930a().m3931a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4085a(long j, long j2, long j3, LEAGUE_ACT league_act) {
        CSLeagueAction.Builder newBuilder = CSLeagueAction.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLClubID(j2);
        newBuilder.setLLeagueID(j);
        newBuilder.setLActionedClubdID(j3);
        newBuilder.setELeagueAct(league_act);
        CSLeagueAction build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSLeagueAction;
        long j4 = f6567b + 1;
        f6567b = j4;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j4));
    }

    public static void m4150c(long j, boolean z) {
        CSSetLeagueSetting.Builder newBuilder = CSSetLeagueSetting.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLLeagueID(j);
        if (z) {
            newBuilder.setBLeagueMute(1);
        } else {
            newBuilder.setBLeagueMute(0);
        }
        CSSetLeagueSetting build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSSetLeagueSetting;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4163e(long j, long j2) {
        CSQuitLeague.Builder newBuilder = CSQuitLeague.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLLeagueID(j);
        newBuilder.setLClubID(j2);
        CSQuitLeague build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSQuitLeague;
        long j3 = f6567b + 1;
        f6567b = j3;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j3));
    }

    public static void m4197v(long j) {
        CSGetLeagueByLeagueID.Builder newBuilder = CSGetLeagueByLeagueID.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setLLeagueID(j);
        CSGetLeagueByLeagueID build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetLeagueByLeagueID;
        long j2 = f6567b + 1;
        f6567b = j2;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j2));
    }

    public static void m4194u() {
        CSGetFlashPageInfos.Builder newBuilder = CSGetFlashPageInfos.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        newBuilder.setIScreenWidth(720);
        newBuilder.setIScreenHeight(1280);
        if (Utility.m4480a()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_SIMPLIFIED_CHINESE);
        } else if (Utility.m4485b()) {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_TRADITIONAL_CHINESE);
        } else {
            newBuilder.setELanguageType(LANGUAGE_TYPE.LANGUAGE_TYPE_ENGLISH);
        }
        CSGetFlashPageInfos build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFlashPageInfos;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }

    public static void m4196v() {
        CSGetFestivalMode.Builder newBuilder = CSGetFestivalMode.newBuilder();
        newBuilder.setUuid(SharedPreferencesManager.m4308b());
        CSGetFestivalMode build = newBuilder.build();
        newBuilder.clear();
        long b = SharedPreferencesManager.m4308b();
        ByteString toByteString = build.toByteString();
        TEXAS_CMD texas_cmd = TEXAS_CMD.Cmd_CSGetFestivalMode;
        long j = f6567b + 1;
        f6567b = j;
        HttpManager.m3919a().m3921a(TCPUtil.m4465a(b, toByteString, texas_cmd, j));
    }
}
