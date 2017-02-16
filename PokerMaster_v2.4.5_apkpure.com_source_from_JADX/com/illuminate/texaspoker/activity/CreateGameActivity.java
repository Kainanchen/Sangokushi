package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.NormalGameSettingView;
import com.illuminate.texaspoker.view.OmahaGameSettingView;
import com.illuminate.texaspoker.view.SixGameSettingView;
import com.illuminate.texaspoker.view.SngGameSettingView;
import com.texaspoker.moment.TexasPoker.GAME_ROOM_SENIOR_TYPE;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class CreateGameActivity extends BaseMainActivity {
    private static String f4284d;
    RadioGroup f4285c;
    private int f4286e;
    private long f4287f;
    private boolean f4288g;
    private ChatRoom f4289h;
    private boolean f4290i;
    private boolean f4291j;
    private EditText f4292k;
    private NormalGameSettingView f4293l;
    private SngGameSettingView f4294m;
    private SixGameSettingView f4295n;
    private OmahaGameSettingView f4296o;
    private boolean f4297p;

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.1 */
    class C05461 implements OnClickListener {
        final /* synthetic */ CreateGameActivity f4274a;

        C05461(CreateGameActivity createGameActivity) {
            this.f4274a = createGameActivity;
        }

        public final void onClick(View view) {
            this.f4274a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.2 */
    class C05472 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateGameActivity f4275a;

        C05472(CreateGameActivity createGameActivity) {
            this.f4275a = createGameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.3 */
    class C05493 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateGameActivity f4277a;

        /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.3.1 */
        class C05481 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05493 f4276a;

            C05481(C05493 c05493) {
                this.f4276a = c05493;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f4276a.f4277a.startActivity(new Intent(this.f4276a.f4277a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f4276a.f4277a.startActivity(new Intent(this.f4276a.f4277a, RechargeActivity.class));
                }
            }
        }

        C05493(CreateGameActivity createGameActivity) {
            this.f4277a = createGameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (Config.f6659d == Config.f6657b) {
                this.f4277a.startActivity(new Intent(this.f4277a, RechargeForGoogleActivity.class));
            } else if (Config.f6659d == Config.f6658c) {
                this.f4277a.startActivity(new Intent(this.f4277a, RechargeActivity.class));
            } else {
                new Builder(this.f4277a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C05481(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.4 */
    class C05504 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateGameActivity f4278a;

        C05504(CreateGameActivity createGameActivity) {
            this.f4278a = createGameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.5 */
    class C05515 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateGameActivity f4279a;

        C05515(CreateGameActivity createGameActivity) {
            this.f4279a = createGameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4279a.startActivity(new Intent(this.f4279a, StoreActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.6 */
    class C05526 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateGameActivity f4280a;

        C05526(CreateGameActivity createGameActivity) {
            this.f4280a = createGameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.7 */
    class C05537 implements OnClickListener {
        final /* synthetic */ CreateGameActivity f4281a;

        C05537(CreateGameActivity createGameActivity) {
            this.f4281a = createGameActivity;
        }

        public final void onClick(View view) {
            this.f4281a.m3013a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.8 */
    class C05548 implements OnGlobalLayoutListener {
        final /* synthetic */ CreateGameActivity f4282a;

        C05548(CreateGameActivity createGameActivity) {
            this.f4282a = createGameActivity;
        }

        public final void onGlobalLayout() {
            this.f4282a.m3016b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateGameActivity.9 */
    class C05559 implements OnCheckedChangeListener {
        final /* synthetic */ CreateGameActivity f4283a;

        C05559(CreateGameActivity createGameActivity) {
            this.f4283a = createGameActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == 2131558694) {
                this.f4283a.f4286e = 1;
                this.f4283a.f4293l.setVisibility(0);
                this.f4283a.f4294m.setVisibility(8);
                this.f4283a.f4295n.setVisibility(8);
                this.f4283a.f4296o.setVisibility(8);
                NormalGameSettingView a = this.f4283a.f4293l;
                if (SharedPreferencesManager.m4294Y()) {
                    a.f6846c.setVisibility(0);
                } else {
                    a.f6846c.setVisibility(8);
                }
            } else if (i == 2131558696) {
                this.f4283a.f4286e = 3;
                this.f4283a.f4295n.setVisibility(0);
                this.f4283a.f4293l.setVisibility(8);
                this.f4283a.f4294m.setVisibility(8);
                this.f4283a.f4296o.setVisibility(8);
            } else if (i == 2131558697) {
                this.f4283a.f4286e = 4;
                this.f4283a.f4296o.setVisibility(0);
                this.f4283a.f4295n.setVisibility(8);
                this.f4283a.f4293l.setVisibility(8);
                this.f4283a.f4294m.setVisibility(8);
                OmahaGameSettingView d = this.f4283a.f4296o;
                if (!SharedPreferencesManager.m4294Y() || d.f6898p.getGameUserCount() > 6) {
                    d.f6887e.setVisibility(8);
                } else {
                    d.f6887e.setVisibility(0);
                }
            } else {
                this.f4283a.f4286e = 2;
                this.f4283a.f4294m.setVisibility(0);
                this.f4283a.f4293l.setVisibility(8);
                this.f4283a.f4295n.setVisibility(8);
                this.f4283a.f4296o.setVisibility(8);
            }
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2973, 2974, 2975, 2976, 2977, 2978, 2979, 2980, 2981, 2982});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3043a(List<Object> list);

    private native boolean m3044a(String str);

    private native void m3049c();

    private native void m3051d();

    private native void m3053e();

    protected final native void m3056a(String str, List<Object> list);

    public native void finish();

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    static void __clinit__() {
        f4284d = "CreateQuickGameActivity";
    }

    private static int m3045b(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return 5;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 20;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 30;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return 40;
            default:
                return 10;
        }
    }

    private static long m3047c(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return 3600;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 5400;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return 7200;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 9000;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return 10800;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                return 14400;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                return 18000;
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                return 21600;
            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                return 36000;
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                return 43200;
            default:
                return 1800;
        }
    }

    static /* synthetic */ void m3055g(CreateGameActivity createGameActivity) {
        if (!createGameActivity.f4288g || !createGameActivity.f4290i) {
            new Builder(createGameActivity).setTitle(2131165514).setMessage(2131165694).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ CreateGameActivity f4271a;

                {
                    this.f4271a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (createGameActivity.f4291j) {
            GAME_ROOM_SENIOR_TYPE game_room_senior_type;
            long e;
            long j;
            int b;
            int b2;
            boolean isChecked;
            boolean isChecked2;
            boolean isChecked3;
            boolean isChecked4;
            int gameUserCount;
            GAME_ROOM_TYPE game_room_type;
            if (createGameActivity.f4286e == 1) {
                r3 = createGameActivity.f4292k.getText().toString().trim();
                if (createGameActivity.m3044a(r3)) {
                    game_room_senior_type = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                    createGameActivity.b = new LoadingDialog(createGameActivity);
                    createGameActivity.b.show();
                    e = Utility.m4495e(createGameActivity.f4293l.f6844a.getProgress());
                    j = e * 200;
                    b = m3045b(createGameActivity.f4293l.f6848e.getLeftCursorIndex());
                    b2 = m3045b(createGameActivity.f4293l.f6848e.getRightCursorIndex());
                    r10 = m3047c(createGameActivity.f4293l.f6847d.getProgress());
                    isChecked = createGameActivity.f4293l.f6849f.isChecked();
                    isChecked2 = createGameActivity.f4293l.f6851h.isChecked();
                    isChecked3 = createGameActivity.f4293l.f6852i.isChecked();
                    isChecked4 = createGameActivity.f4293l.f6850g.isChecked();
                    gameUserCount = createGameActivity.f4293l.f6853j.getGameUserCount();
                    r17 = (int) createGameActivity.f4293l.f6845b.getAnte();
                    if (isChecked4) {
                        game_room_type = GAME_ROOM_TYPE.GAME_ROOM_NORMAL_INSURANCE;
                    } else {
                        game_room_type = GAME_ROOM_TYPE.GAME_ROOM_NORMAL;
                    }
                    if (createGameActivity.f4297p) {
                        r10 = 30;
                    }
                    NetworkUtil.m4073a();
                    NetworkUtil.m4115a(r3, e, 2 * e, j, r10, game_room_senior_type, b2, b, isChecked, gameUserCount, r17, isChecked4, game_room_type, isChecked2, isChecked3);
                }
            } else if (createGameActivity.f4286e == 3) {
                r3 = createGameActivity.f4292k.getText().toString().trim();
                if (createGameActivity.m3044a(r3)) {
                    game_room_senior_type = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                    createGameActivity.b = new LoadingDialog(createGameActivity);
                    createGameActivity.b.show();
                    e = Utility.m4495e(createGameActivity.f4295n.f6988c.getProgress());
                    j = e * 200;
                    b = m3045b(createGameActivity.f4295n.f6991f.getLeftCursorIndex());
                    b2 = m3045b(createGameActivity.f4295n.f6991f.getRightCursorIndex());
                    r10 = m3047c(createGameActivity.f4295n.f6990e.getProgress());
                    isChecked = createGameActivity.f4295n.f6996k.isChecked();
                    isChecked2 = createGameActivity.f4295n.f6997l.isChecked();
                    isChecked3 = createGameActivity.f4295n.f6998m.isChecked();
                    gameUserCount = createGameActivity.f4295n.f6999n.getGameUserCount();
                    r17 = (int) createGameActivity.f4295n.f6989d.getAnte();
                    game_room_type = GAME_ROOM_TYPE.GAME_ROOM_SIX;
                    if (createGameActivity.f4297p) {
                        r10 = 30;
                    }
                    NetworkUtil.m4073a();
                    NetworkUtil.m4115a(r3, e, 2 * e, j, r10, game_room_senior_type, b2, b, isChecked, gameUserCount, r17, false, game_room_type, isChecked2, isChecked3);
                }
            } else if (createGameActivity.f4286e == 4) {
                r3 = createGameActivity.f4292k.getText().toString().trim();
                if (createGameActivity.m3044a(r3)) {
                    game_room_senior_type = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                    createGameActivity.b = new LoadingDialog(createGameActivity);
                    createGameActivity.b.show();
                    e = Utility.m4495e(createGameActivity.f4296o.f6885c.getProgress());
                    j = e * 200;
                    b = m3045b(createGameActivity.f4296o.f6889g.getLeftCursorIndex());
                    b2 = m3045b(createGameActivity.f4296o.f6889g.getRightCursorIndex());
                    r10 = m3047c(createGameActivity.f4296o.f6888f.getProgress());
                    isChecked = createGameActivity.f4296o.f6894l.isChecked();
                    isChecked2 = createGameActivity.f4296o.f6896n.isChecked();
                    isChecked3 = createGameActivity.f4296o.f6897o.isChecked();
                    gameUserCount = createGameActivity.f4296o.f6898p.getGameUserCount();
                    r17 = (int) createGameActivity.f4296o.f6886d.getAnte();
                    if (createGameActivity.f4297p) {
                        r10 = 30;
                    }
                    if (!SharedPreferencesManager.m4294Y() || gameUserCount > 6) {
                        isChecked4 = false;
                    } else {
                        isChecked4 = createGameActivity.f4296o.f6895m.isChecked();
                    }
                    if (isChecked4) {
                        game_room_type = GAME_ROOM_TYPE.GAME_ROOM_OMAHA_INSURANCE;
                    } else {
                        game_room_type = GAME_ROOM_TYPE.GAME_ROOM_OMAHA;
                    }
                    NetworkUtil.m4073a();
                    NetworkUtil.m4115a(r3, e, 2 * e, j, r10, game_room_senior_type, b2, b, isChecked, gameUserCount, r17, isChecked4, game_room_type, isChecked2, isChecked3);
                }
            } else {
                String trim = createGameActivity.f4292k.getText().toString().trim();
                if (createGameActivity.m3044a(trim)) {
                    SNG_ROOM_TYPE valueOf = SNG_ROOM_TYPE.valueOf(createGameActivity.f4294m.f7019d.getProgress() + 1);
                    createGameActivity.b = new LoadingDialog(createGameActivity);
                    createGameActivity.b.show();
                    int gameUserCount2 = createGameActivity.f4294m.f7029n.getGameUserCount();
                    boolean isChecked5 = createGameActivity.f4294m.f7026k.isChecked();
                    boolean isChecked6 = createGameActivity.f4294m.f7027l.isChecked();
                    boolean isChecked7 = createGameActivity.f4294m.f7028m.isChecked();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4118a(trim, valueOf, CREATE_ROOM_TYPE.QUICK_GAME_ROOM, gameUserCount2, isChecked5, isChecked6, isChecked7);
                }
            }
        } else if (createGameActivity.f4286e == 1) {
            r5 = createGameActivity.f4292k.getText().toString().trim();
            if (createGameActivity.m3044a(r5)) {
                r25 = -1;
                if (createGameActivity.f4293l.f6856m != null) {
                    for (CheckBox checkBox : createGameActivity.f4293l.f6856m) {
                        if (checkBox.isChecked()) {
                            r25 = ((Long) checkBox.getTag()).longValue();
                            break;
                        }
                    }
                }
                if (r25 != -1) {
                    r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NORMAL;
                    r2 = 1;
                    if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
                        r2 = null;
                    }
                    if (r2 != null) {
                        createGameActivity.m3051d();
                        return;
                    }
                }
                r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                createGameActivity.b = new LoadingDialog(createGameActivity);
                createGameActivity.b.show();
                r6 = Utility.m4495e(createGameActivity.f4293l.f6844a.getProgress());
                r10 = r6 * 200;
                if (createGameActivity.f4289h.f5715B.booleanValue()) {
                    r15 = CREATE_ROOM_TYPE.CLUB_ROOM;
                } else {
                    r15 = CREATE_ROOM_TYPE.CAHT_ROOM;
                }
                r18 = m3045b(createGameActivity.f4293l.f6848e.getLeftCursorIndex());
                r17 = m3045b(createGameActivity.f4293l.f6848e.getRightCursorIndex());
                r12 = m3047c(createGameActivity.f4293l.f6847d.getProgress());
                r19 = createGameActivity.f4293l.f6849f.isChecked();
                r22 = createGameActivity.f4293l.f6850g.isChecked();
                r23 = createGameActivity.f4293l.f6851h.isChecked();
                r24 = createGameActivity.f4293l.f6852i.isChecked();
                if (r22) {
                    r14 = GAME_ROOM_TYPE.GAME_ROOM_NORMAL_INSURANCE;
                } else {
                    r14 = GAME_ROOM_TYPE.GAME_ROOM_NORMAL;
                }
                r20 = createGameActivity.f4293l.f6853j.getGameUserCount();
                r21 = (int) createGameActivity.f4293l.f6845b.getAnte();
                if (createGameActivity.f4297p) {
                    r12 = 30;
                }
                NetworkUtil.m4073a();
                NetworkUtil.m4095a(createGameActivity.f4287f, r5, r6, 2 * r6, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
            }
        } else if (createGameActivity.f4286e == 3) {
            r5 = createGameActivity.f4292k.getText().toString().trim();
            if (createGameActivity.m3044a(r5)) {
                r25 = -1;
                if (createGameActivity.f4295n.f7002q != null) {
                    for (CheckBox checkBox2 : createGameActivity.f4295n.f7002q) {
                        if (checkBox2.isChecked()) {
                            r25 = ((Long) checkBox2.getTag()).longValue();
                            break;
                        }
                    }
                }
                if (r25 != -1) {
                    r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NORMAL;
                    r2 = 1;
                    if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
                        r2 = null;
                    }
                    if (r2 != null) {
                        createGameActivity.m3051d();
                        return;
                    }
                }
                r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                createGameActivity.b = new LoadingDialog(createGameActivity);
                createGameActivity.b.show();
                r6 = Utility.m4495e(createGameActivity.f4295n.f6988c.getProgress());
                r10 = r6 * 200;
                if (createGameActivity.f4289h.f5715B.booleanValue()) {
                    r15 = CREATE_ROOM_TYPE.CLUB_ROOM;
                } else {
                    r15 = CREATE_ROOM_TYPE.CAHT_ROOM;
                }
                r18 = m3045b(createGameActivity.f4295n.f6991f.getLeftCursorIndex());
                r17 = m3045b(createGameActivity.f4295n.f6991f.getRightCursorIndex());
                r12 = m3047c(createGameActivity.f4295n.f6990e.getProgress());
                r19 = createGameActivity.f4295n.f6996k.isChecked();
                r23 = createGameActivity.f4295n.f6997l.isChecked();
                r24 = createGameActivity.f4295n.f6998m.isChecked();
                r14 = GAME_ROOM_TYPE.GAME_ROOM_SIX;
                r20 = createGameActivity.f4295n.f6999n.getGameUserCount();
                r21 = (int) createGameActivity.f4295n.f6989d.getAnte();
                if (createGameActivity.f4297p) {
                    r12 = 30;
                }
                NetworkUtil.m4073a();
                NetworkUtil.m4095a(createGameActivity.f4287f, r5, r6, 2 * r6, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, false, r23, r24, r25);
            }
        } else if (createGameActivity.f4286e == 4) {
            r5 = createGameActivity.f4292k.getText().toString().trim();
            if (createGameActivity.m3044a(r5)) {
                r25 = -1;
                if (createGameActivity.f4296o.f6901s != null) {
                    for (CheckBox checkBox22 : createGameActivity.f4296o.f6901s) {
                        if (checkBox22.isChecked()) {
                            r25 = ((Long) checkBox22.getTag()).longValue();
                            break;
                        }
                    }
                }
                if (r25 != -1) {
                    r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NORMAL;
                    r2 = 1;
                    if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
                        r2 = null;
                    }
                    if (r2 != null) {
                        createGameActivity.m3051d();
                        return;
                    }
                }
                r16 = GAME_ROOM_SENIOR_TYPE.GAME_ROOM_SENIOR_TYPE_NO;
                createGameActivity.b = new LoadingDialog(createGameActivity);
                createGameActivity.b.show();
                r6 = Utility.m4495e(createGameActivity.f4296o.f6885c.getProgress());
                r10 = r6 * 200;
                if (createGameActivity.f4289h.f5715B.booleanValue()) {
                    r15 = CREATE_ROOM_TYPE.CLUB_ROOM;
                } else {
                    r15 = CREATE_ROOM_TYPE.CAHT_ROOM;
                }
                r18 = m3045b(createGameActivity.f4296o.f6889g.getLeftCursorIndex());
                r17 = m3045b(createGameActivity.f4296o.f6889g.getRightCursorIndex());
                r12 = m3047c(createGameActivity.f4296o.f6888f.getProgress());
                r19 = createGameActivity.f4296o.f6894l.isChecked();
                r23 = createGameActivity.f4296o.f6896n.isChecked();
                r24 = createGameActivity.f4296o.f6897o.isChecked();
                r20 = createGameActivity.f4296o.f6898p.getGameUserCount();
                r21 = (int) createGameActivity.f4296o.f6886d.getAnte();
                if (createGameActivity.f4297p) {
                    r12 = 30;
                }
                if (!SharedPreferencesManager.m4294Y() || r20 > 6) {
                    r22 = false;
                } else {
                    r22 = createGameActivity.f4296o.f6895m.isChecked();
                }
                if (r22) {
                    r14 = GAME_ROOM_TYPE.GAME_ROOM_OMAHA_INSURANCE;
                } else {
                    r14 = GAME_ROOM_TYPE.GAME_ROOM_OMAHA;
                }
                NetworkUtil.m4073a();
                NetworkUtil.m4095a(createGameActivity.f4287f, r5, r6, 2 * r6, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
            }
        } else {
            r3 = createGameActivity.f4292k.getText().toString().trim();
            if (createGameActivity.m3044a(r3)) {
                CREATE_ROOM_TYPE create_room_type;
                r12 = -1;
                if (createGameActivity.f4294m.f7032q != null) {
                    for (CheckBox checkBox222 : createGameActivity.f4294m.f7032q) {
                        if (checkBox222.isChecked()) {
                            r12 = ((Long) checkBox222.getTag()).longValue();
                            break;
                        }
                    }
                }
                if (r12 != -1) {
                    r2 = 1;
                    if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
                        r2 = null;
                    }
                    if (r2 != null) {
                        createGameActivity.m3051d();
                        return;
                    }
                }
                SNG_ROOM_TYPE valueOf2 = SNG_ROOM_TYPE.valueOf(createGameActivity.f4294m.f7019d.getProgress() + 1);
                createGameActivity.b = new LoadingDialog(createGameActivity);
                createGameActivity.b.show();
                int gameUserCount3 = createGameActivity.f4294m.f7029n.getGameUserCount();
                if (createGameActivity.f4289h.f5715B.booleanValue()) {
                    create_room_type = CREATE_ROOM_TYPE.CLUB_ROOM;
                } else {
                    create_room_type = CREATE_ROOM_TYPE.CAHT_ROOM;
                }
                boolean isChecked8 = createGameActivity.f4294m.f7026k.isChecked();
                boolean isChecked9 = createGameActivity.f4294m.f7027l.isChecked();
                boolean isChecked10 = createGameActivity.f4294m.f7028m.isChecked();
                NetworkUtil.m4073a();
                NetworkUtil.m4119a(r3, valueOf2, create_room_type, createGameActivity.f4287f, gameUserCount3, isChecked8, isChecked9, isChecked10, r12);
            }
        }
    }
}
