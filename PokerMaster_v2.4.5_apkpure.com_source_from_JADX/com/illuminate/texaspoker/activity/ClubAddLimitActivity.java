package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class ClubAddLimitActivity extends BaseToolBarActivity {
    private static String f3838d;
    private long f3839e;
    private ChatRoom f3840f;
    private int f3841g;
    private long f3842h;
    private int f3843i;
    private int f3844j;
    private TextView f3845k;
    private ImageButton f3846l;
    private ImageButton f3847m;
    private TextView f3848n;
    private TextView f3849o;
    private ImageView f3850p;
    private ImageView f3851q;
    private TextView f3852r;
    private TextView f3853s;
    private TextView f3854t;
    private Button f3855u;

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.1 */
    class C04071 implements OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3827a;

        C04071(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3827a = clubAddLimitActivity;
        }

        public final void onClick(View view) {
            this.f3827a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.2 */
    class C04092 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3829a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.2.1 */
        class C04081 implements DialogInterface.OnClickListener {
            final /* synthetic */ C04092 f3828a;

            C04081(C04092 c04092) {
                this.f3828a = c04092;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f3828a.f3829a.startActivity(new Intent(this.f3828a.f3829a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f3828a.f3829a.startActivity(new Intent(this.f3828a.f3829a, RechargeActivity.class));
                }
            }
        }

        C04092(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3829a = clubAddLimitActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (Config.f6659d == Config.f6657b) {
                this.f3829a.startActivity(new Intent(this.f3829a, RechargeForGoogleActivity.class));
            } else if (Config.f6659d == Config.f6658c) {
                this.f3829a.startActivity(new Intent(this.f3829a, RechargeActivity.class));
            } else {
                new Builder(this.f3829a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C04081(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.3 */
    class C04103 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3830a;

        C04103(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3830a = clubAddLimitActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.4 */
    class C04114 implements OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3831a;

        C04114(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3831a = clubAddLimitActivity;
        }

        public final void onClick(View view) {
            ClubAddLimitActivity.m2880a(this.f3831a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.5 */
    class C04125 implements OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3832a;

        C04125(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3832a = clubAddLimitActivity;
        }

        public final void onClick(View view) {
            ClubAddLimitActivity.m2881b(this.f3832a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.6 */
    class C04136 implements OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3833a;

        C04136(ClubAddLimitActivity clubAddLimitActivity) {
            this.f3833a = clubAddLimitActivity;
        }

        public final void onClick(View view) {
            ClubAddLimitActivity.m2882c(this.f3833a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.7 */
    class C04147 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3834a;

        static {
            fixHelper.fixfunc(new int[]{352, 353});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C04147(ClubAddLimitActivity clubAddLimitActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.8 */
    class C04168 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3836a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.8.1 */
        class C04151 implements DialogInterface.OnClickListener {
            final /* synthetic */ C04168 f3835a;

            C04151(C04168 c04168) {
                this.f3835a = c04168;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f3835a.f3836a.startActivity(new Intent(this.f3835a.f3836a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f3835a.f3836a.startActivity(new Intent(this.f3835a.f3836a, RechargeActivity.class));
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{232, 233});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C04168(ClubAddLimitActivity clubAddLimitActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubAddLimitActivity.9 */
    class C04179 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubAddLimitActivity f3837a;

        static {
            fixHelper.fixfunc(new int[]{57, 58});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C04179(ClubAddLimitActivity clubAddLimitActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static /* synthetic */ void m2881b(ClubAddLimitActivity clubAddLimitActivity) {
        clubAddLimitActivity.f3841g--;
        if (clubAddLimitActivity.f3841g <= 1) {
            clubAddLimitActivity.f3841g = 1;
        }
        clubAddLimitActivity.m2879a();
    }

    static /* synthetic */ void m2882c(ClubAddLimitActivity clubAddLimitActivity) {
        if (clubAddLimitActivity.f3840f.f5734U == null || !clubAddLimitActivity.f3840f.f5734U.booleanValue()) {
            new Builder(clubAddLimitActivity).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C04179(clubAddLimitActivity)).show();
        } else if (clubAddLimitActivity.f3842h > SharedPreferencesManager.m4413q()) {
            new Builder(clubAddLimitActivity).setTitle(2131165514).setMessage(2131165594).setPositiveButton(2131165427, new C04168(clubAddLimitActivity)).setNegativeButton(2131165432, new C04147(clubAddLimitActivity)).show();
        } else {
            clubAddLimitActivity.b = new LoadingDialog(clubAddLimitActivity);
            clubAddLimitActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4078a(clubAddLimitActivity.f3839e, clubAddLimitActivity.f3841g);
        }
    }

    static {
        f3838d = "ClubAddLimitActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968612);
        this.f3839e = getIntent().getExtras().getLong("lClubId");
        this.f3841g = 1;
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04071(this));
        this.f3845k = (TextView) findViewById(2131558547);
        this.f3846l = (ImageButton) findViewById(2131558593);
        this.f3847m = (ImageButton) findViewById(2131558595);
        this.f3848n = (TextView) findViewById(2131558594);
        this.f3846l.setOnClickListener(new C04114(this));
        this.f3847m.setOnClickListener(new C04125(this));
        this.f3849o = (TextView) findViewById(2131558596);
        this.f3850p = (ImageView) findViewById(2131558597);
        this.f3851q = (ImageView) findViewById(2131558554);
        this.f3852r = (TextView) findViewById(2131558598);
        this.f3853s = (TextView) findViewById(2131558557);
        this.f3854t = (TextView) findViewById(2131558558);
        this.f3855u = (Button) findViewById(2131558600);
        this.f3855u.setOnClickListener(new C04136(this));
    }

    protected void onResume() {
        super.onResume();
        m2879a();
        NetworkUtil.m4073a();
        NetworkUtil.m4184p();
    }

    private void m2879a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f3840f = DBManager.m3631a().f5565e.m3590a(this.f3839e, 2);
            int intValue = this.f3840f.f5731R.intValue();
            this.f3844j = SharedPreferencesManager.m4287R();
            if (intValue < this.f3844j) {
                this.f3843i = this.f3840f.f5731R.intValue() + (SharedPreferencesManager.m4286Q() * this.f3841g);
                if (this.f3843i > this.f3844j) {
                    this.f3843i = this.f3844j;
                    this.f3841g = (this.f3843i - this.f3840f.f5731R.intValue()) / SharedPreferencesManager.m4286Q();
                }
            } else {
                this.f3843i = this.f3844j;
            }
            this.f3842h = SharedPreferencesManager.m4285P() * ((long) this.f3841g);
            this.f3845k.setText(SharedPreferencesManager.m4288S());
            this.f3848n.setText(this.f3841g);
            if (this.f3841g == 1) {
                this.f3847m.setEnabled(false);
                this.f3846l.setEnabled(true);
            } else if (this.f3843i >= this.f3844j || intValue == this.f3844j) {
                this.f3846l.setEnabled(false);
                this.f3847m.setEnabled(true);
            } else {
                this.f3846l.setEnabled(true);
                this.f3847m.setEnabled(true);
            }
            if (intValue == this.f3844j) {
                this.f3846l.setEnabled(false);
                this.f3847m.setEnabled(false);
            }
            this.f3849o.setText(String.valueOf(intValue));
            this.f3852r.setText(this.f3843i);
            if (intValue == this.f3844j) {
                this.f3849o.setVisibility(8);
                this.f3850p.setVisibility(8);
                this.f3851q.setVisibility(8);
            } else {
                this.f3849o.setVisibility(0);
                this.f3850p.setVisibility(0);
                this.f3851q.setVisibility(0);
            }
            this.f3854t.setText(this.f3842h);
            this.f3853s.setText(String.format(getResources().getString(2131165405), new Object[]{Utility.m4502g(SharedPreferencesManager.m4413q())}));
            if (this.f3842h > SharedPreferencesManager.m4413q()) {
                this.f3854t.setTextColor(-1811364);
            } else {
                this.f3854t.setTextColor(-1);
            }
            if (intValue == this.f3844j) {
                this.f3855u.setEnabled(false);
            } else {
                this.f3855u.setEnabled(true);
            }
        }
    }

    protected final void m2883a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_SELLING_ITEM_SUCCESS")) {
            m2879a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_SELLING_ITEM_FAULT")) {
            m2879a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CLUB_MAX_MEMBER_SUCCESS")) {
            this.b.dismiss();
            r0 = ((Integer) list.get(0)).intValue();
            m2879a();
            new Builder(this).setTitle(2131165315).setMessage(String.format(getResources().getString(2131165314), new Object[]{Integer.valueOf(r0)})).setPositiveButton(2131165438, 
            /* Method generation error in method: com.illuminate.texaspoker.activity.ClubAddLimitActivity.a(java.lang.String, java.util.List):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006d: INVOKE  (wrap: android.support.v7.app.AlertDialog$Builder
  0x0069: INVOKE  (r0_13 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0060: INVOKE  (r0_12 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x005c: INVOKE  (r1_3 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0056: CONSTRUCTOR  (r1_2 android.support.v7.app.AlertDialog$Builder) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) android.support.v7.app.AlertDialog.Builder.<init>(android.content.Context):void CONSTRUCTOR), (2131165315 int) android.support.v7.app.AlertDialog.Builder.setTitle(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (wrap: java.lang.CharSequence
  0x0050: INVOKE  (r0_11 java.lang.CharSequence) = (wrap: java.lang.String
  0x0043: INVOKE  (r1_1 java.lang.String) = (wrap: android.content.res.Resources
  0x003c: INVOKE  (r1_0 android.content.res.Resources) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) com.illuminate.texaspoker.activity.ClubAddLimitActivity.getResources():android.content.res.Resources type: VIRTUAL), (2131165314 int) android.content.res.Resources.getString(int):java.lang.String type: VIRTUAL), (wrap: java.lang.Object[]
  ?: FILLED_NEW_ARRAY  (r2_3 java.lang.Object[]) = (wrap: java.lang.Integer
  0x004a: INVOKE  (r0_10 java.lang.Integer) = (r0_9 int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC) elemType: java.lang.Object) java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String type: STATIC) android.support.v7.app.AlertDialog.Builder.setMessage(java.lang.CharSequence):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165438 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0066: CONSTRUCTOR  (r1_4 android.content.DialogInterface$OnClickListener) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) com.illuminate.texaspoker.activity.ClubAddLimitActivity.10.<init>(com.illuminate.texaspoker.activity.ClubAddLimitActivity):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL) android.support.v7.app.AlertDialog.Builder.show():android.support.v7.app.AlertDialog type: VIRTUAL in method: com.illuminate.texaspoker.activity.ClubAddLimitActivity.a(java.lang.String, java.util.List):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:202)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:177)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:324)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:116)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:81)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: INVOKE  (r0_13 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0060: INVOKE  (r0_12 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x005c: INVOKE  (r1_3 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0056: CONSTRUCTOR  (r1_2 android.support.v7.app.AlertDialog$Builder) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) android.support.v7.app.AlertDialog.Builder.<init>(android.content.Context):void CONSTRUCTOR), (2131165315 int) android.support.v7.app.AlertDialog.Builder.setTitle(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (wrap: java.lang.CharSequence
  0x0050: INVOKE  (r0_11 java.lang.CharSequence) = (wrap: java.lang.String
  0x0043: INVOKE  (r1_1 java.lang.String) = (wrap: android.content.res.Resources
  0x003c: INVOKE  (r1_0 android.content.res.Resources) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) com.illuminate.texaspoker.activity.ClubAddLimitActivity.getResources():android.content.res.Resources type: VIRTUAL), (2131165314 int) android.content.res.Resources.getString(int):java.lang.String type: VIRTUAL), (wrap: java.lang.Object[]
  ?: FILLED_NEW_ARRAY  (r2_3 java.lang.Object[]) = (wrap: java.lang.Integer
  0x004a: INVOKE  (r0_10 java.lang.Integer) = (r0_9 int) java.lang.Integer.valueOf(int):java.lang.Integer type: STATIC) elemType: java.lang.Object) java.lang.String.format(java.lang.String, java.lang.Object[]):java.lang.String type: STATIC) android.support.v7.app.AlertDialog.Builder.setMessage(java.lang.CharSequence):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165438 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0066: CONSTRUCTOR  (r1_4 android.content.DialogInterface$OnClickListener) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) com.illuminate.texaspoker.activity.ClubAddLimitActivity.10.<init>(com.illuminate.texaspoker.activity.ClubAddLimitActivity):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL in method: com.illuminate.texaspoker.activity.ClubAddLimitActivity.a(java.lang.String, java.util.List):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:84)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:595)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:219)
	... 25 more
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0066: CONSTRUCTOR  (r1_4 android.content.DialogInterface$OnClickListener) = (r6_0 'this' com.illuminate.texaspoker.activity.ClubAddLimitActivity) com.illuminate.texaspoker.activity.ClubAddLimitActivity.10.<init>(com.illuminate.texaspoker.activity.ClubAddLimitActivity):void CONSTRUCTOR in method: com.illuminate.texaspoker.activity.ClubAddLimitActivity.a(java.lang.String, java.util.List):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:638)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:619)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 30 more
Caused by: java.lang.NullPointerException
	at jadx.core.utils.RegionUtils.notEmpty(RegionUtils.java:135)
	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:544)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 35 more
 */

            static /* synthetic */ void m2880a(ClubAddLimitActivity clubAddLimitActivity) {
                if (clubAddLimitActivity.f3843i < clubAddLimitActivity.f3844j) {
                    clubAddLimitActivity.f3841g++;
                }
                clubAddLimitActivity.m2879a();
            }
        }
