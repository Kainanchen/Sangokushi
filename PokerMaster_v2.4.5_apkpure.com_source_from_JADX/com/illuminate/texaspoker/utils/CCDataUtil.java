package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import com.ali.fixHelper;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.service.ForegroundService;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.OddsStructure;
import com.texaspoker.moment.TexasPoker.SNGBlindsStructure;
import org.cocos2dx.lua.AppActivity;

public class CCDataUtil {
    static {
        fixHelper.fixfunc(new int[]{1536, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public static String[] getChatData() {
        return new String[]{RuntimeData.f6672c, SharedPreferencesManager.m4417r(), SharedPreferencesManager.m4413q(), RuntimeData.f6671b};
    }

    public static void stopGame(int i, String str) {
        Utility.m4478a("NOTIFY_CC_STOP_GAME", Integer.valueOf(i), str);
    }

    public static String[] getFriendUserData(long j) {
        int i;
        String[] strArr = new String[5];
        FriendUser a = DBManager.m3631a().f5563c.m3639a(j);
        if (a.f5826e.intValue() == 3) {
            i = 1;
        } else {
            i = 0;
        }
        strArr[0] = String.valueOf(i);
        strArr[1] = a.f5845x;
        strArr[2] = a.f5846y;
        strArr[3] = a.f5847z;
        strArr[4] = a.f5819A;
        return strArr;
    }

    public static String[] getSelfUserData() {
        return new String[]{SharedPreferencesManager.m4375k(), SharedPreferencesManager.m4408p()};
    }

    public static String[] getBuyinRatioData() {
        return new String[]{RuntimeData.f6676g, RuntimeData.f6677h, "1"};
    }

    public static String[] getFavoriteData() {
        return new String[]{String.valueOf(DBManager.m3631a().f5578r.m3691a()), String.valueOf(SharedPreferencesManager.m4434x())};
    }

    public static void setGameEnableVoice(boolean z) {
        RuntimeData.f6670a = z;
    }

    public static int getSoundEffectOnOff() {
        return SharedPreferencesManager.m4425u();
    }

    public static void saveFavoriteV2WithUuid(long j, long j2, long j3) {
        NetworkUtil.m4073a();
        NetworkUtil.m4084a(j, j, j2, j3, null, null);
    }

    public static void setIsIgnoreFoldAlert(int i) {
        SharedPreferencesManager.m4317b(i > 0);
    }

    public static int getIsIgnoreFoldAlert() {
        return SharedPreferencesManager.m4293X() ? 1 : 0;
    }

    public static String[] getUserBaseInfoData(long j) {
        FriendUser a = DBManager.m3631a().f5563c.m3639a(j);
        if (a == null) {
            NetworkUtil.m4073a();
            NetworkUtil.m4097a(j, true);
            return null;
        }
        String[] strArr = new String[5];
        strArr[0] = a.f5842u;
        strArr[1] = a.f5838q;
        if (StringUtils.m4462a(a.f5836o)) {
            strArr[2] = LetterIndexBar.SEARCH_ICON_LETTER;
        } else {
            strArr[2] = a.f5836o;
        }
        strArr[3] = a.f5832k;
        if (StringUtils.m4462a(a.f5841t)) {
            strArr[4] = LetterIndexBar.SEARCH_ICON_LETTER;
            return strArr;
        }
        strArr[4] = a.f5841t;
        return strArr;
    }

    public static float getBatteryLevel() {
        new StringBuilder("ForegroundService.batteryLevel").append(ForegroundService.f6511b);
        return ForegroundService.f6511b;
    }

    public static int getSNGControlBuyinMsgNum() {
        NetworkUtil.m4073a();
        NetworkUtil.m4174k();
        return (int) DBManager.m3631a().f5579s.m3559a();
    }

    public static void goToSNGControlBuyin() {
        Utility.m4478a("NOTIFY_CC_OPEN_BUYIN_ACTIVITY", new Object[0]);
    }

    public static void goToShop(int i) {
        Utility.m4478a("NOTIFY_CC_OPEN_STORE", Integer.valueOf(i));
    }

    public static void shareSng() {
        Utility.m4478a("NOTIFY_CC_OPEN_SHARE", new Object[0]);
    }

    public static String[] getSNGBlindsStructures(long j) {
        int size = RuntimeData.f6681l.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            String str;
            SNGBlindsStructure sNGBlindsStructure = (SNGBlindsStructure) RuntimeData.f6681l.get(i);
            String str2 = Utility.m4508i(sNGBlindsStructure.getLSNGSmallBlinds()) + "/" + Utility.m4508i(sNGBlindsStructure.getLSNGBigBlinds());
            if (sNGBlindsStructure.getLSNGAnte() != 0) {
                str = str2 + "(" + Utility.m4508i(sNGBlindsStructure.getLSNGAnte()) + ")";
            } else {
                str = str2;
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public static String[] getOddsStructure(long j) {
        int size = RuntimeData.f6682m.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = Utility.m4474a("#.#", ((double) ((OddsStructure) RuntimeData.f6682m.get(i)).getIOdds()) / 100.0d);
        }
        return strArr;
    }

    public static long getUuid() {
        return SharedPreferencesManager.m4308b();
    }

    public static int getRemarkStrLength(String str) {
        return StringUtils.m4460a(str);
    }

    public static void cancelCollection(long j, long j2, long j3) {
        NetworkUtil.m4073a();
        NetworkUtil.m4135b(j, j2, j3);
    }

    public static int isCollection(long j, long j2, long j3) {
        if (DBManager.m3631a().f5578r.m3692a(j, j2, j3, false) == null) {
            return 0;
        }
        return 1;
    }

    public static void shareBrand(long j, long j2, long j3) {
        NetworkUtil.m4073a();
        NetworkUtil.m4083a(j, j, j2, j3);
    }

    public static void cancelShare() {
        Utility.m4478a("NOTIFY_CC_CANCEL_SHARE", new Object[0]);
    }

    public static int isOpenShare() {
        if (AppActivity.d == null || !AppActivity.d.isShowing()) {
            return 0;
        }
        return 1;
    }

    public static int isOpenGPS() {
        int i;
        LocationUtil.m4237a();
        if (ContextCompat.checkSelfPermission(BaseApplication.m3548a(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return 1;
        }
        Utility.m4478a("NOTIFY_OPEN_GPS_PERMISSION_APPLY", new Object[0]);
        return 0;
    }

    public static void goToMiniGameGoToPokerMachineInfo() {
        Utility.m4478a("NOTIFY_OPEN_MINI_GAME_HELP", new Object[0]);
    }
}
