package com.illuminate.texaspoker.utils;

import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.util.TypedValue;
import com.illuminate.texaspoker.application.BaseApplication;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* renamed from: com.illuminate.texaspoker.utils.i */
public final class SharedPreferencesManager {
    private static String f6699A;
    private static String f6700B;
    private static String f6701C;
    private static String f6702D;
    private static String f6703E;
    private static String f6704F;
    private static String f6705G;
    private static String f6706H;
    private static String f6707I;
    private static String f6708J;
    private static String f6709K;
    private static String f6710L;
    private static String f6711M;
    private static String f6712N;
    private static String f6713O;
    private static String f6714P;
    private static String f6715Q;
    private static String f6716R;
    private static String f6717S;
    private static String f6718T;
    private static String f6719U;
    private static String f6720V;
    private static String f6721W;
    private static String f6722X;
    private static String f6723Y;
    private static String f6724Z;
    private static String f6725a;
    private static String aA;
    private static String aB;
    private static String aC;
    private static String aD;
    private static String aE;
    private static String aF;
    private static String aG;
    private static String aH;
    private static String aI;
    private static String aJ;
    private static String aK;
    private static String aL;
    private static String aM;
    private static String aN;
    private static String aO;
    private static String aP;
    private static String aQ;
    private static String aR;
    private static String aS;
    private static String aT;
    private static String aU;
    private static String aV;
    private static String aW;
    private static String aX;
    private static String aY;
    private static String aZ;
    private static String aa;
    private static String ab;
    private static String ac;
    private static String ad;
    private static String ae;
    private static String af;
    private static String ag;
    private static String ah;
    private static String ai;
    private static String aj;
    private static String ak;
    private static String al;
    private static String am;
    private static String an;
    private static String ao;
    private static String ap;
    private static String aq;
    private static String ar;
    private static String as;
    private static String at;
    private static String au;
    private static String av;
    private static String aw;
    private static String ax;
    private static String ay;
    private static String az;
    private static String f6726b;
    private static String ba;
    private static String bb;
    private static String bc;
    private static String bd;
    private static String be;
    private static String bf;
    private static String bg;
    private static String bh;
    private static String bi;
    private static String bj;
    private static String bk;
    private static String bl;
    private static String bm;
    private static String bn;
    private static String bo;
    private static String f6727c;
    private static String f6728d;
    private static String f6729e;
    private static String f6730f;
    private static String f6731g;
    private static String f6732h;
    private static String f6733i;
    private static String f6734j;
    private static String f6735k;
    private static String f6736l;
    private static String f6737m;
    private static String f6738n;
    private static String f6739o;
    private static String f6740p;
    private static String f6741q;
    private static String f6742r;
    private static String f6743s;
    private static String f6744t;
    private static String f6745u;
    private static String f6746v;
    private static String f6747w;
    private static String f6748x;
    private static String f6749y;
    private static String f6750z;

    static {
        f6725a = "USER_HAS_NEW_VERSION";
        f6726b = "USER_DATA";
        f6727c = "USER_UUID";
        f6728d = "USER_IS_KICK";
        f6729e = "USER_IS_EXPIRED";
        f6730f = "USER_NICKNAME";
        f6731g = "USER_STR_ID";
        f6732h = "USER_STR_COVER";
        f6733i = "USER_STR_BIG_COVER";
        f6734j = "USER_E_TYPE";
        f6735k = "USER_VIP_TYPE";
        f6736l = "USER_PHONE_NUMBER";
        f6737m = "USER_GENDER";
        f6738n = "USER_DIAMOND";
        f6739o = "USER_GOLD_COIN";
        f6740p = "USER_DESCRIPTION";
        f6741q = "USER_MSG_SOUND_EFFECT";
        f6742r = "USER_SOUND_EFFECT";
        f6743s = "USER_VIBRATION_EFFECT";
        f6744t = "USER_INVITE_MUTE";
        f6745u = "USER_MAX_FAVORITE_COUNT";
        f6746v = "USER_MAX_ClUB";
        f6747w = "USER_UPDATE_TIPS_DATE";
        f6748x = "USER_LUA_UPDATE_TIPS_DATE";
        f6749y = "USER_GUIDE_FLAG2";
        f6750z = "USER_VIP_LIMIT_TIME";
        f6699A = "USER_TOTAL_GAME_COUNT";
        f6700B = "USER_VPIP_COUNT";
        f6701C = "USER_TOTAL_HAND_COUNT";
        f6702D = "USER_TOTAL_WIN_COUNT";
        f6703E = "USER_TOTAL_BUYIN";
        f6704F = "USER_TOTAL_GAIN";
        f6705G = "USER_AVG_WIN";
        f6706H = "USER_AVG_LOSS";
        f6707I = "USER_RANK";
        f6708J = "USER_REG_DAYS";
        f6709K = "USER_AWARD_DATE";
        f6710L = "USER_NEW_BILL_COUNT";
        f6711M = "USER_TAB_NEW_BILL_COUNT";
        f6712N = "USER_KEYBOARD_HEIGHT";
        f6713O = "USER_I_SENIOR_GAME_ROOM_COST";
        f6714P = "USER_CLUB_LIMIT_DIAMOND_COST";
        f6715Q = "USER_CLUB_PER_ADD_MEMBER";
        f6716R = "USER_CLUB_MAX_ADD_MEMBER";
        f6717S = "USER_CLUB_LIMIT_DESC";
        f6718T = "USER_CLUB_CHARGE_DESC";
        f6719U = "USER_CLUB_CHARGE_DIAMOND_COST";
        f6720V = "USER_CLUB_CHARGE_COIN";
        f6721W = "USER_GAME_ROOM_TYPE";
        f6722X = "USER_EDIT_NAME_DIAMOND";
        f6723Y = "USER_FORCE_DROP";
        f6724Z = "USER_OPEN_INSURANCE";
        aa = "USER_ENCRYPT_KEY";
        ab = "USER_ACCESS_TOKEN_KEY";
        ac = "USER_LANGUAGE";
        ad = "USER_XG_PUSH_TOKEN";
        ae = "USER_GAME_NAME";
        af = "USER_QUICK_GAME_NAME";
        ag = "USER_NORMAL_GAME_MEMBER_COUNT";
        ah = "USER_NORMAL_GAME_BLIND";
        ai = "USER_NORMAL_GAME_ANTE";
        aj = "USER_NORMAL_GAME_BUY_IN_CONTROLLER";
        ak = "USER_NORMAL_GAME_INSURANCE";
        al = "USER_NORMAL_GAME_DURATION";
        am = "USER_NORMAL_GAME_GPS_CONTROLLER";
        an = "USER_NORMAL_GAME_IP_CONTROLLER";
        ao = "USER_NORMAL_GAME_LEAGUE_ID";
        ap = "USER_QUICK_NORMAL_GAME_MEMBER_COUNT";
        aq = "USER_QUICK_NORMAL_GAME_BLIND";
        ar = "USER_QUICK_NORMAL_GAME_ANTE";
        as = "USER_QUICK_NORMAL_GAME_BUY_IN_CONTROLLER";
        at = "USER_QUICK_NORMAL_GAME_INSURANCE";
        au = "USER_QUICK_NORMAL_GAME_DURATION";
        av = "USER_QUICK_NORMAL_GAME_GPS_CONTROLLER";
        aw = "USER_QUICK_NORMAL_GAME_IP_CONTROLLER";
        ax = "USER_SNG_GAME_MEMBER_COUNT";
        ay = "USER_SNG_GAME_TYPE";
        az = "USER_SNG_GAME_BUY_IN_CONTROLLER";
        aA = "USER_SNG_GAME_GPS_CONTROLLER";
        aB = "USER_SNG_GAME_IP_CONTROLLER";
        aC = "USER_QUICK_SNG_GAME_MEMBER_COUNT";
        aD = "USER_QUICK_SNG_GAME_TYPE";
        aE = "USER_QUICK_SNG_GAME_BUY_IN_CONTROLLER";
        aF = "USER_QUICK_SNG_GAME_GPS_CONTROLLER";
        aG = "USER_QUICK_SNG_GAME_IP_CONTROLLER";
        aH = "USER_SIX_GAME_MEMBER_COUNT";
        aI = "USER_SIX_GAME_BLIND";
        aJ = "USER_SIX_GAME_ANTE";
        aK = "USER_SIX_GAME_BUY_IN_CONTROLLER";
        aL = "USER_SIX_GAME_INSURANCE";
        aM = "USER_SIX_GAME_DURATION";
        aN = "USER_SIX_GAME_GPS_CONTROLLER";
        aO = "USER_SIX_GAME_IP_CONTROLLER";
        aP = "USER_SIX_GAME_LEAGUE_ID";
        aQ = "USER_QUICK_SIX_GAME_MEMBER_COUNT";
        aR = "USER_QUICK_SIX_GAME_BLIND";
        aS = "USER_QUICK_SIX_GAME_ANTE";
        aT = "USER_QUICK_SIX_GAME_BUY_IN_CONTROLLER";
        aU = "USER_QUICK_SIX_GAME_INSURANCE";
        aV = "USER_QUICK_SIX_GAME_DURATION";
        aW = "USER_QUICK_SIX_GAME_GPS_CONTROLLER";
        aX = "USER_QUICK_SIX_GAME_IP_CONTROLLER";
        aY = "USER_OMAHA_GAME_MEMBER_COUNT";
        aZ = "USER_OMAHA_GAME_BLIND";
        ba = "USER_OMAHA_GAME_ANTE";
        bb = "USER_OMAHA_GAME_BUY_IN_CONTROLLER";
        bc = "USER_OMAHA_GAME_INSURANCE";
        bd = "USER_OMAHA_GAME_DURATION";
        be = "USER_OMAHA_GAME_GPS_CONTROLLER";
        bf = "USER_OMAHA_GAME_IP_CONTROLLER";
        bg = "USER_OMAHA_GAME_LEAGUE_ID";
        bh = "USER_QUICK_OMAHA_GAME_MEMBER_COUNT";
        bi = "USER_QUICK_OMAHA_GAME_BLIND";
        bj = "USER_QUICK_OMAHA_GAME_ANTE";
        bk = "USER_QUICK_OMAHA_GAME_BUY_IN_CONTROLLER";
        bl = "USER_QUICK_OMAHA_GAME_INSURANCE";
        bm = "USER_QUICK_OMAHA_GAME_DURATION";
        bn = "USER_QUICK_OMAHA_GAME_GPS_CONTROLLER";
        bo = "USER_QUICK_OMAHA_GAME_IP_CONTROLLER";
    }

    public static void m4300a() {
        BaseApplication.m3548a().getSharedPreferences(f6726b, 0).edit().clear().commit();
        SharedPreferencesManager.m4316b(f6749y, true);
    }

    private static long m4382l(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getLong(str, 0);
    }

    private static long m4298a(String str, long j) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getLong(str, j);
    }

    private static void m4314b(String str, long j) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6726b, 0).edit();
        edit.putLong(str, j);
        edit.commit();
    }

    private static int m4390m(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getInt(str, 0);
    }

    private static int m4297a(String str, int i) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getInt(str, i);
    }

    private static int m4397n(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getInt(str, 1);
    }

    private static void m4313b(String str, int i) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6726b, 0).edit();
        edit.putInt(str, i);
        edit.commit();
    }

    private static String m4404o(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getString(str, LetterIndexBar.SEARCH_ICON_LETTER);
    }

    private static String m4299a(String str, String str2) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getString(str, str2);
    }

    private static void m4315b(String str, String str2) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6726b, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    private static boolean m4411p(String str) {
        return BaseApplication.m3548a().getSharedPreferences(f6726b, 0).getBoolean(str, false);
    }

    private static void m4316b(String str, boolean z) {
        Editor edit = BaseApplication.m3548a().getSharedPreferences(f6726b, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static long m4308b() {
        long l = SharedPreferencesManager.m4382l(f6727c);
        if (l == 0) {
            return -1;
        }
        return l;
    }

    public static void m4303a(long j) {
        SharedPreferencesManager.m4314b(f6727c, j);
    }

    public static void m4306a(boolean z) {
        SharedPreferencesManager.m4316b(f6725a, z);
    }

    public static boolean m4325c() {
        return SharedPreferencesManager.m4411p(f6728d);
    }

    public static void m4327d() {
        SharedPreferencesManager.m4316b(f6728d, true);
    }

    public static boolean m4339e() {
        return SharedPreferencesManager.m4411p(f6729e);
    }

    public static void m4341f() {
        SharedPreferencesManager.m4316b(f6729e, true);
    }

    public static boolean m4353g() {
        return SharedPreferencesManager.m4411p(f6749y);
    }

    public static void m4354h() {
        SharedPreferencesManager.m4316b(f6749y, true);
    }

    public static String m4361i() {
        return SharedPreferencesManager.m4404o(f6730f);
    }

    public static void m4304a(String str) {
        SharedPreferencesManager.m4315b(f6730f, str);
    }

    public static String m4369j() {
        return SharedPreferencesManager.m4404o(f6731g);
    }

    public static void m4312b(String str) {
        SharedPreferencesManager.m4315b(f6731g, str);
    }

    public static String m4375k() {
        return SharedPreferencesManager.m4404o(f6732h);
    }

    public static void m4322c(String str) {
        SharedPreferencesManager.m4315b(f6732h, str);
    }

    public static String m4383l() {
        return SharedPreferencesManager.m4404o(f6733i);
    }

    public static void m4331d(String str) {
        SharedPreferencesManager.m4315b(f6733i, str);
    }

    public static int m4389m() {
        return SharedPreferencesManager.m4390m(f6734j);
    }

    public static void m4301a(int i) {
        SharedPreferencesManager.m4313b(f6734j, i);
    }

    public static int m4396n() {
        return SharedPreferencesManager.m4390m(f6735k);
    }

    public static void m4309b(int i) {
        SharedPreferencesManager.m4313b(f6735k, i);
    }

    public static String m4403o() {
        return SharedPreferencesManager.m4404o(f6736l);
    }

    public static void m4337e(String str) {
        SharedPreferencesManager.m4315b(f6736l, str);
    }

    public static int m4408p() {
        return SharedPreferencesManager.m4397n(f6737m);
    }

    public static void m4319c(int i) {
        SharedPreferencesManager.m4313b(f6737m, i);
    }

    public static long m4413q() {
        return SharedPreferencesManager.m4382l(f6738n);
    }

    public static void m4311b(long j) {
        SharedPreferencesManager.m4314b(f6738n, j);
    }

    public static long m4417r() {
        return SharedPreferencesManager.m4382l(f6739o);
    }

    public static void m4321c(long j) {
        SharedPreferencesManager.m4314b(f6739o, j);
    }

    public static String m4420s() {
        return SharedPreferencesManager.m4404o(f6740p);
    }

    public static void m4345f(String str) {
        SharedPreferencesManager.m4315b(f6740p, str);
    }

    public static int m4422t() {
        return SharedPreferencesManager.m4397n(f6741q);
    }

    public static void m4328d(int i) {
        SharedPreferencesManager.m4313b(f6741q, i);
    }

    public static int m4425u() {
        return SharedPreferencesManager.m4397n(f6742r);
    }

    public static void m4334e(int i) {
        SharedPreferencesManager.m4313b(f6742r, i);
    }

    public static int m4428v() {
        return SharedPreferencesManager.m4397n(f6743s);
    }

    public static void m4342f(int i) {
        SharedPreferencesManager.m4313b(f6743s, i);
    }

    public static int m4431w() {
        return SharedPreferencesManager.m4397n(f6744t);
    }

    public static void m4348g(int i) {
        SharedPreferencesManager.m4313b(f6744t, i);
    }

    public static int m4434x() {
        return SharedPreferencesManager.m4390m(f6745u);
    }

    public static void m4355h(int i) {
        SharedPreferencesManager.m4313b(f6745u, i);
    }

    public static int m4436y() {
        return SharedPreferencesManager.m4390m(f6746v);
    }

    public static void m4362i(int i) {
        SharedPreferencesManager.m4313b(f6746v, i);
    }

    public static long m4439z() {
        return SharedPreferencesManager.m4382l(f6747w);
    }

    public static void m4330d(long j) {
        SharedPreferencesManager.m4314b(f6747w, j);
    }

    public static long m4265A() {
        return SharedPreferencesManager.m4382l(f6750z);
    }

    public static void m4336e(long j) {
        SharedPreferencesManager.m4314b(f6750z, j);
    }

    public static long m4266B() {
        return SharedPreferencesManager.m4382l(f6699A);
    }

    public static void m4344f(long j) {
        SharedPreferencesManager.m4314b(f6699A, j);
    }

    public static long m4268C() {
        return SharedPreferencesManager.m4382l(f6700B);
    }

    public static void m4350g(long j) {
        SharedPreferencesManager.m4314b(f6700B, j);
    }

    public static long m4271D() {
        return SharedPreferencesManager.m4382l(f6701C);
    }

    public static void m4357h(long j) {
        SharedPreferencesManager.m4314b(f6701C, j);
    }

    public static long m4272E() {
        return SharedPreferencesManager.m4382l(f6702D);
    }

    public static void m4364i(long j) {
        SharedPreferencesManager.m4314b(f6702D, j);
    }

    public static long m4274F() {
        return SharedPreferencesManager.m4382l(f6703E);
    }

    public static void m4372j(long j) {
        SharedPreferencesManager.m4314b(f6703E, j);
    }

    public static long m4276G() {
        return SharedPreferencesManager.m4382l(f6704F);
    }

    public static void m4378k(long j) {
        SharedPreferencesManager.m4314b(f6704F, j);
    }

    public static long m4277H() {
        return SharedPreferencesManager.m4382l(f6705G);
    }

    public static void m4386l(long j) {
        SharedPreferencesManager.m4314b(f6705G, j);
    }

    public static long m4278I() {
        return SharedPreferencesManager.m4382l(f6706H);
    }

    public static void m4394m(long j) {
        SharedPreferencesManager.m4314b(f6706H, j);
    }

    public static long m4279J() {
        return SharedPreferencesManager.m4382l(f6707I);
    }

    public static void m4401n(long j) {
        SharedPreferencesManager.m4314b(f6707I, j);
    }

    public static long m4280K() {
        return SharedPreferencesManager.m4382l(f6708J);
    }

    public static void m4406o(long j) {
        SharedPreferencesManager.m4314b(f6708J, j);
    }

    public static long m4281L() {
        return SharedPreferencesManager.m4382l(f6709K);
    }

    public static void m4410p(long j) {
        SharedPreferencesManager.m4314b(f6709K, j);
    }

    public static int m4282M() {
        return SharedPreferencesManager.m4390m(f6710L);
    }

    public static void m4370j(int i) {
        SharedPreferencesManager.m4313b(f6710L, i);
    }

    public static int m4283N() {
        return SharedPreferencesManager.m4390m(f6711M);
    }

    public static void m4376k(int i) {
        SharedPreferencesManager.m4313b(f6711M, i);
    }

    public static int m4296a(Resources resources) {
        int m = SharedPreferencesManager.m4390m(f6712N);
        if (m == 0) {
            return (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics());
        }
        return m;
    }

    public static void m4384l(int i) {
        SharedPreferencesManager.m4313b(f6712N, i);
    }

    public static int m4284O() {
        return SharedPreferencesManager.m4390m(f6713O);
    }

    public static void m4392m(int i) {
        SharedPreferencesManager.m4313b(f6713O, i);
    }

    public static long m4285P() {
        return SharedPreferencesManager.m4298a(f6714P, 3280);
    }

    public static void m4414q(long j) {
        SharedPreferencesManager.m4314b(f6714P, j);
    }

    public static int m4286Q() {
        return SharedPreferencesManager.m4297a(f6715Q, 10);
    }

    public static void m4399n(int i) {
        SharedPreferencesManager.m4313b(f6715Q, i);
    }

    public static int m4287R() {
        return SharedPreferencesManager.m4297a(f6716R, 80);
    }

    public static void m4405o(int i) {
        SharedPreferencesManager.m4313b(f6716R, i);
    }

    public static String m4288S() {
        return SharedPreferencesManager.m4299a(f6717S, BaseApplication.m3548a().getResources().getString(2131165312));
    }

    public static void m4351g(String str) {
        SharedPreferencesManager.m4315b(f6717S, str);
    }

    public static String m4289T() {
        return SharedPreferencesManager.m4299a(f6718T, BaseApplication.m3548a().getResources().getString(2131165332));
    }

    public static void m4358h(String str) {
        SharedPreferencesManager.m4315b(f6718T, str);
    }

    public static long m4290U() {
        return SharedPreferencesManager.m4298a(f6719U, 3280);
    }

    public static void m4418r(long j) {
        SharedPreferencesManager.m4314b(f6719U, j);
    }

    public static long m4291V() {
        return SharedPreferencesManager.m4298a(f6720V, 36800);
    }

    public static void m4421s(long j) {
        SharedPreferencesManager.m4314b(f6720V, j);
    }

    public static void m4409p(int i) {
        SharedPreferencesManager.m4313b(f6721W, i);
    }

    public static long m4292W() {
        return SharedPreferencesManager.m4298a(f6722X, 300);
    }

    public static void m4424t(long j) {
        SharedPreferencesManager.m4314b(f6722X, j);
    }

    public static boolean m4293X() {
        return SharedPreferencesManager.m4411p(f6723Y);
    }

    public static void m4317b(boolean z) {
        SharedPreferencesManager.m4316b(f6723Y, z);
    }

    public static boolean m4294Y() {
        return SharedPreferencesManager.m4411p(f6724Z);
    }

    public static void m4323c(boolean z) {
        SharedPreferencesManager.m4316b(f6724Z, z);
    }

    public static String m4295Z() {
        return SharedPreferencesManager.m4299a(aa, null);
    }

    public static void m4365i(String str) {
        SharedPreferencesManager.m4315b(aa, str);
    }

    public static String aa() {
        return SharedPreferencesManager.m4299a(ab, null);
    }

    public static void m4373j(String str) {
        SharedPreferencesManager.m4315b(ab, str);
    }

    public static String m4326d(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4404o(af);
        }
        return SharedPreferencesManager.m4404o(ae);
    }

    public static void m4305a(String str, boolean z) {
        if (z) {
            SharedPreferencesManager.m4315b(af, str);
        } else {
            SharedPreferencesManager.m4315b(ae, str);
        }
    }

    public static int m4333e(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(ap);
        }
        return SharedPreferencesManager.m4390m(ag);
    }

    public static void m4302a(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(ap, i);
        } else {
            SharedPreferencesManager.m4313b(ag, i);
        }
    }

    public static int m4340f(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aq);
        }
        return SharedPreferencesManager.m4390m(ah);
    }

    public static void m4310b(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aq, i);
        } else {
            SharedPreferencesManager.m4313b(ah, i);
        }
    }

    public static int m4347g(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(ar);
        }
        return SharedPreferencesManager.m4390m(ai);
    }

    public static void m4320c(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(ar, i);
        } else {
            SharedPreferencesManager.m4313b(ai, i);
        }
    }

    public static boolean m4360h(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(as);
        }
        return SharedPreferencesManager.m4411p(aj);
    }

    public static void m4307a(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(as, z);
        } else {
            SharedPreferencesManager.m4316b(aj, z);
        }
    }

    public static boolean m4367i(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(at);
        }
        return SharedPreferencesManager.m4411p(ak);
    }

    public static void m4318b(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(at, z);
        } else {
            SharedPreferencesManager.m4316b(ak, z);
        }
    }

    public static int m4368j(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(au);
        }
        return SharedPreferencesManager.m4390m(al);
    }

    public static void m4329d(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(au, i);
        } else {
            SharedPreferencesManager.m4313b(al, i);
        }
    }

    public static boolean m4381k(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(av);
        }
        return SharedPreferencesManager.m4411p(am);
    }

    public static void m4324c(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(av, z);
        } else {
            SharedPreferencesManager.m4316b(am, z);
        }
    }

    public static boolean m4388l(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aw);
        }
        return SharedPreferencesManager.m4411p(an);
    }

    public static void m4332d(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aw, z);
        } else {
            SharedPreferencesManager.m4316b(an, z);
        }
    }

    public static long ab() {
        return SharedPreferencesManager.m4382l(ao);
    }

    public static void m4426u(long j) {
        SharedPreferencesManager.m4314b(ao, j);
    }

    public static String ac() {
        return SharedPreferencesManager.m4404o(ac);
    }

    public static void m4379k(String str) {
        SharedPreferencesManager.m4315b(ac, str);
    }

    public static int m4391m(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aC);
        }
        return SharedPreferencesManager.m4390m(ax);
    }

    public static void m4335e(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aC, i);
        } else {
            SharedPreferencesManager.m4313b(ax, i);
        }
    }

    public static int m4398n(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aD);
        }
        return SharedPreferencesManager.m4390m(ay);
    }

    public static void m4343f(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aD, i);
        } else {
            SharedPreferencesManager.m4313b(ay, i);
        }
    }

    public static boolean m4407o(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aE);
        }
        return SharedPreferencesManager.m4411p(az);
    }

    public static void m4338e(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aE, z);
        } else {
            SharedPreferencesManager.m4316b(az, z);
        }
    }

    public static boolean m4412p(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aF);
        }
        return SharedPreferencesManager.m4411p(aA);
    }

    public static void m4346f(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aF, z);
        } else {
            SharedPreferencesManager.m4316b(aA, z);
        }
    }

    public static boolean m4415q(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aG);
        }
        return SharedPreferencesManager.m4411p(aB);
    }

    public static void m4352g(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aG, z);
        } else {
            SharedPreferencesManager.m4316b(aB, z);
        }
    }

    public static int m4416r(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aQ);
        }
        return SharedPreferencesManager.m4390m(aH);
    }

    public static void m4349g(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aQ, i);
        } else {
            SharedPreferencesManager.m4313b(aH, i);
        }
    }

    public static int m4419s(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aR);
        }
        return SharedPreferencesManager.m4390m(aI);
    }

    public static void m4356h(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aR, i);
        } else {
            SharedPreferencesManager.m4313b(aI, i);
        }
    }

    public static int m4423t(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aS);
        }
        return SharedPreferencesManager.m4390m(aJ);
    }

    public static void m4363i(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aS, i);
        } else {
            SharedPreferencesManager.m4313b(aJ, i);
        }
    }

    public static boolean m4427u(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aT);
        }
        return SharedPreferencesManager.m4411p(aK);
    }

    public static void m4359h(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aT, z);
        } else {
            SharedPreferencesManager.m4316b(aK, z);
        }
    }

    public static int m4429v(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(aV);
        }
        return SharedPreferencesManager.m4390m(aM);
    }

    public static void m4371j(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(aV, i);
        } else {
            SharedPreferencesManager.m4313b(aM, i);
        }
    }

    public static boolean m4433w(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aW);
        }
        return SharedPreferencesManager.m4411p(aN);
    }

    public static void m4366i(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aW, z);
        } else {
            SharedPreferencesManager.m4316b(aN, z);
        }
    }

    public static boolean m4435x(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(aX);
        }
        return SharedPreferencesManager.m4411p(aO);
    }

    public static void m4374j(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(aX, z);
        } else {
            SharedPreferencesManager.m4316b(aO, z);
        }
    }

    public static long ad() {
        return SharedPreferencesManager.m4382l(aP);
    }

    public static void m4430v(long j) {
        SharedPreferencesManager.m4314b(aP, j);
    }

    public static int m4437y(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(bh);
        }
        return SharedPreferencesManager.m4390m(aY);
    }

    public static void m4377k(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(bh, i);
        } else {
            SharedPreferencesManager.m4313b(aY, i);
        }
    }

    public static int m4438z(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(bi);
        }
        return SharedPreferencesManager.m4390m(aZ);
    }

    public static void m4385l(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(bi, i);
        } else {
            SharedPreferencesManager.m4313b(aZ, i);
        }
    }

    public static int m4264A(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(bj);
        }
        return SharedPreferencesManager.m4390m(ba);
    }

    public static void m4393m(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(bj, i);
        } else {
            SharedPreferencesManager.m4313b(ba, i);
        }
    }

    public static boolean m4267B(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(bk);
        }
        return SharedPreferencesManager.m4411p(bb);
    }

    public static void m4380k(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(bk, z);
        } else {
            SharedPreferencesManager.m4316b(bb, z);
        }
    }

    public static boolean m4269C(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(bl);
        }
        return SharedPreferencesManager.m4411p(bc);
    }

    public static void m4387l(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(bl, z);
        } else {
            SharedPreferencesManager.m4316b(bc, z);
        }
    }

    public static int m4270D(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4390m(bm);
        }
        return SharedPreferencesManager.m4390m(bd);
    }

    public static void m4400n(int i, boolean z) {
        if (z) {
            SharedPreferencesManager.m4313b(bm, i);
        } else {
            SharedPreferencesManager.m4313b(bd, i);
        }
    }

    public static boolean m4273E(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(bn);
        }
        return SharedPreferencesManager.m4411p(be);
    }

    public static void m4395m(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(bn, z);
        } else {
            SharedPreferencesManager.m4316b(be, z);
        }
    }

    public static boolean m4275F(boolean z) {
        if (z) {
            return SharedPreferencesManager.m4411p(bo);
        }
        return SharedPreferencesManager.m4411p(bf);
    }

    public static void m4402n(boolean z, boolean z2) {
        if (z2) {
            SharedPreferencesManager.m4316b(bo, z);
        } else {
            SharedPreferencesManager.m4316b(bf, z);
        }
    }

    public static long ae() {
        return SharedPreferencesManager.m4382l(bg);
    }

    public static void m4432w(long j) {
        SharedPreferencesManager.m4314b(bg, j);
    }
}
