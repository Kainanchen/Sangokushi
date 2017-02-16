package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.at;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import java.util.List;

public class BillSngActivity extends BaseToolBarActivity {
    private static String f3696d;
    private SimpleDraweeView f3697A;
    private FriendUser f3698B;
    private FriendUser f3699C;
    private FriendUser f3700D;
    private TextView f3701E;
    private TextView f3702F;
    private TextView f3703G;
    private SimpleDraweeView f3704H;
    private SimpleDraweeView f3705I;
    private SimpleDraweeView f3706J;
    private BillInfoNet f3707e;
    private boolean f3708f;
    private long f3709g;
    private List<Object> f3710h;
    private String f3711i;
    private int f3712j;
    private long f3713k;
    private String f3714l;
    private int f3715m;
    private String f3716n;
    private long f3717o;
    private int f3718p;
    private int f3719q;
    private String f3720r;
    private String f3721s;
    private long f3722t;
    private long f3723u;
    private long f3724v;
    private ListView f3725w;
    private at f3726x;
    private View f3727y;
    private View f3728z;

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3677a;
        final /* synthetic */ BillSngActivity f3678b;

        AnonymousClass10(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3678b = billSngActivity;
            this.f3677a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3678b.f3727y, this.f3678b.f3728z, this.f3678b.f3710h, 0, this.f3678b.f3712j, -3, 0);
            this.f3677a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3679a;
        final /* synthetic */ BillSngActivity f3680b;

        AnonymousClass11(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3680b = billSngActivity;
            this.f3679a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3680b.f3727y, this.f3680b.f3728z, this.f3680b.f3710h, 0, this.f3680b.f3712j, -4, 0);
            this.f3679a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.1 */
    class C03791 implements OnClickListener {
        final /* synthetic */ BillSngActivity f3683a;

        C03791(BillSngActivity billSngActivity) {
            this.f3683a = billSngActivity;
        }

        public final void onClick(View view) {
            this.f3683a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.2 */
    class C03802 implements OnClickListener {
        final /* synthetic */ BillSngActivity f3684a;

        C03802(BillSngActivity billSngActivity) {
            this.f3684a = billSngActivity;
        }

        public final void onClick(View view) {
            BillSngActivity.m2790e(this.f3684a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.3 */
    class C03813 implements OnClickListener {
        final /* synthetic */ BillSngActivity f3685a;

        C03813(BillSngActivity billSngActivity) {
            this.f3685a = billSngActivity;
        }

        public final void onClick(View view) {
            BillSngActivity.m2786a(this.f3685a, this.f3685a.f3698B);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.4 */
    class C03824 implements OnClickListener {
        final /* synthetic */ BillSngActivity f3686a;

        C03824(BillSngActivity billSngActivity) {
            this.f3686a = billSngActivity;
        }

        public final void onClick(View view) {
            BillSngActivity.m2786a(this.f3686a, this.f3686a.f3699C);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.5 */
    class C03835 implements OnClickListener {
        final /* synthetic */ BillSngActivity f3687a;

        C03835(BillSngActivity billSngActivity) {
            this.f3687a = billSngActivity;
        }

        public final void onClick(View view) {
            BillSngActivity.m2786a(this.f3687a, this.f3687a.f3700D);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.6 */
    class C03846 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3688a;
        final /* synthetic */ BillSngActivity f3689b;

        C03846(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3689b = billSngActivity;
            this.f3688a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3689b.f3727y, this.f3689b.f3728z, this.f3689b.f3710h, 0, this.f3689b.f3712j, 0, 0);
            this.f3688a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.7 */
    class C03857 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3690a;
        final /* synthetic */ BillSngActivity f3691b;

        C03857(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3691b = billSngActivity;
            this.f3690a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3691b.f3727y, this.f3691b.f3728z, this.f3691b.f3710h, 0, this.f3691b.f3712j, 1, 0);
            this.f3690a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.8 */
    class C03868 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3692a;
        final /* synthetic */ BillSngActivity f3693b;

        C03868(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3693b = billSngActivity;
            this.f3692a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3693b.f3727y, this.f3693b.f3728z, this.f3693b.f3710h, 0, this.f3693b.f3712j, -2, 0);
            this.f3692a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillSngActivity.9 */
    class C03879 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3694a;
        final /* synthetic */ BillSngActivity f3695b;

        C03879(BillSngActivity billSngActivity, ShareSocialDialog shareSocialDialog) {
            this.f3695b = billSngActivity;
            this.f3694a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3695b.f3727y, this.f3695b.f3728z, this.f3695b.f3710h, 0, this.f3695b.f3712j, -1, 0);
            this.f3694a.dismiss();
        }
    }

    public BillSngActivity() {
        this.f3722t = -1;
        this.f3723u = -1;
        this.f3724v = -1;
    }

    static {
        f3696d = "BillSngActivity";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r14) {
        /*
        r13 = this;
        super.onCreate(r14);
        r0 = 2130968606; // 0x7f04001e float:1.754587E38 double:1.0528383806E-314;
        r13.setContentView(r0);
        r0 = r13.getIntent();
        r1 = r0.getExtras();
        r0 = "billInfoNet";
        r0 = r1.getSerializable(r0);
        r0 = (com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet) r0;
        r13.f3707e = r0;
        r0 = r13.f3707e;
        if (r0 != 0) goto L_0x03f9;
    L_0x001f:
        r0 = "billId";
        r2 = r1.getLong(r0);
        r13.f3709g = r2;
        r0 = "fromShare";
        r0 = r1.getBoolean(r0);
        r13.f3708f = r0;
        r0 = com.illuminate.texaspoker.p057b.DBManager.m3631a();
        r0 = r0.f5570j;
        r2 = r13.f3709g;
        r1 = r13.f3708f;
        r4 = r0.m3554a(r2, r1);
        r0 = r4.f5644c;
        r0 = r0.intValue();
        r13.f3712j = r0;
        r0 = com.illuminate.texaspoker.p057b.DBManager.m3631a();
        r0 = r0.f5571k;
        r2 = r13.f3709g;
        r1 = r13.f3708f;
        r5 = r0.m3705a(r2, r1);
        r0 = new com.illuminate.texaspoker.activity.BillSngActivity$12;
        r0.<init>(r13);
        java.util.Collections.sort(r5, r0);
        r0 = new java.util.ArrayList;
        r0.<init>(r5);
        r13.f3710h = r0;
        r2 = 0;
        r1 = 0;
        r0 = 0;
        r6 = r5.iterator();
        r3 = r2;
        r2 = r1;
        r1 = r0;
    L_0x006c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00e4;
    L_0x0072:
        r0 = r6.next();
        r0 = (com.illuminate.texaspoker.p058c.UserBill) r0;
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 1;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x0085;
    L_0x0084:
        r3 = r0;
    L_0x0085:
        r7 = r5.size();
        switch(r7) {
            case 2: goto L_0x00c7;
            case 6: goto L_0x00ac;
            case 9: goto L_0x0091;
            default: goto L_0x008c;
        };
    L_0x008c:
        r0 = r1;
        r1 = r2;
    L_0x008e:
        r2 = r1;
        r1 = r0;
        goto L_0x006c;
    L_0x0091:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 9;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x009e;
    L_0x009d:
        r1 = r0;
    L_0x009e:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 4;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x008c;
    L_0x00aa:
        r2 = r0;
        goto L_0x006c;
    L_0x00ac:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 6;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x00b9;
    L_0x00b8:
        r1 = r0;
    L_0x00b9:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 3;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x008c;
    L_0x00c5:
        r2 = r0;
        goto L_0x006c;
    L_0x00c7:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 2;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x00d4;
    L_0x00d3:
        r1 = r0;
    L_0x00d4:
        r7 = r0.f6010g;
        r8 = r7.longValue();
        r10 = 2;
        r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r7 != 0) goto L_0x008c;
    L_0x00e0:
        r12 = r1;
        r1 = r0;
        r0 = r12;
        goto L_0x008e;
    L_0x00e4:
        r0 = r4.f5629M;
        r13.f3711i = r0;
        r0 = r4.m3715i();
        r0 = r0.f5842u;
        r6 = r0.longValue();
        r13.f3713k = r6;
        r0 = r4.m3715i();
        r0 = r0.f5836o;
        r13.f3714l = r0;
        r0 = r4.m3715i();
        r0 = r0.f5832k;
        r0 = r0.intValue();
        r13.f3715m = r0;
        r0 = r4.m3715i();
        r0 = r0.f5838q;
        r13.f3716n = r0;
        r0 = r4.f5626J;
        r6 = r0.longValue();
        r13.f3717o = r6;
        r0 = r4.f5655n;
        r0 = r0.intValue();
        r13.f3718p = r0;
        r0 = r4.f5654m;
        r0 = r0.intValue();
        r13.f3719q = r0;
        r0 = r4.f5645d;
        r0 = r0.intValue();
        r5 = 1;
        if (r0 != r5) goto L_0x0384;
    L_0x0131:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = r13.f3716n;
        r0 = r0.append(r5);
        r5 = " \u2022 ";
        r0 = r0.append(r5);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r4.f5630N;
        r13.f3721s = r0;
    L_0x014c:
        if (r3 == 0) goto L_0x0156;
    L_0x014e:
        r0 = r3.f6009f;
        r4 = r0.longValue();
        r13.f3722t = r4;
    L_0x0156:
        if (r2 == 0) goto L_0x0160;
    L_0x0158:
        r0 = r2.f6009f;
        r2 = r0.longValue();
        r13.f3723u = r2;
    L_0x0160:
        if (r1 == 0) goto L_0x016a;
    L_0x0162:
        r0 = r1.f6009f;
        r0 = r0.longValue();
        r13.f3724v = r0;
    L_0x016a:
        r0 = 2131558769; // 0x7f0d0171 float:1.8742863E38 double:1.05312996E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r13.setSupportActionBar(r0);
        r1 = 2131296567; // 0x7f090137 float:1.8211054E38 double:1.053000415E-314;
        r0.setTitleTextAppearance(r13, r1);
        r1 = 2130837591; // 0x7f020057 float:1.728014E38 double:1.0527736506E-314;
        r0.setNavigationIcon(r1);
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$1;
        r1.<init>(r13);
        r0.setNavigationOnClickListener(r1);
        r0 = r13.f3711i;
        r13.setTitle(r0);
        r0 = 2131558523; // 0x7f0d007b float:1.8742364E38 double:1.0531298383E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r13.f3725w = r0;
        r0 = new com.illuminate.texaspoker.a.at;
        r1 = r13.f3710h;
        r2 = r13.f3712j;
        r0.<init>(r13, r1, r2);
        r13.f3726x = r0;
        r0 = r13.f3725w;
        r1 = r13.f3726x;
        r0.setAdapter(r1);
        r0 = 2130968730; // 0x7f04009a float:1.7546122E38 double:1.052838442E-314;
        r1 = 0;
        r0 = android.view.View.inflate(r13, r0, r1);
        r13.f3727y = r0;
        r0 = r13.f3725w;
        r1 = r13.f3727y;
        r2 = 0;
        r3 = 0;
        r0.addHeaderView(r1, r2, r3);
        r0 = r13.f3727y;
        r1 = 2131559053; // 0x7f0d028d float:1.874344E38 double:1.0531301E-314;
        r0 = r0.findViewById(r1);
        r13.f3728z = r0;
        r0 = r13.f3708f;
        if (r0 == 0) goto L_0x05d2;
    L_0x01ce:
        r0 = r13.f3728z;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01d5:
        r0 = r13.f3727y;
        r1 = 2131559054; // 0x7f0d028e float:1.8743441E38 double:1.0531301007E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.Button) r0;
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$2;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = r13.f3727y;
        r1 = 2131559055; // 0x7f0d028f float:1.8743443E38 double:1.053130101E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.facebook.drawee.view.SimpleDraweeView) r0;
        r13.f3697A = r0;
        r0 = r13.f3727y;
        r1 = 2131559056; // 0x7f0d0290 float:1.8743445E38 double:1.0531301017E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = new java.text.SimpleDateFormat;
        r2 = 2131165232; // 0x7f070030 float:1.7944675E38 double:1.0529355267E-314;
        r2 = r13.getString(r2);
        r1.<init>(r2);
        r2 = new java.util.Date;
        r4 = r13.f3717o;
        r2.<init>(r4);
        r1 = r1.format(r2);
        r0.setText(r1);
        r0 = r13.f3727y;
        r1 = 2131559057; // 0x7f0d0291 float:1.8743447E38 double:1.053130102E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = "";
        r2 = r13.f3718p;
        r3 = 1;
        if (r2 != r3) goto L_0x05da;
    L_0x022c:
        r1 = 2131165241; // 0x7f070039 float:1.7944694E38 double:1.052935531E-314;
        r1 = r13.getString(r1);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r13.f3719q;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
    L_0x0243:
        r0.setText(r1);
        r0 = r13.f3727y;
        r1 = 2131559059; // 0x7f0d0293 float:1.8743451E38 double:1.053130103E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = r13.f3720r;
        r0.setText(r1);
        r0 = r13.f3727y;
        r1 = 2131558844; // 0x7f0d01bc float:1.8743015E38 double:1.053129997E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = r13.f3721s;
        r0.setText(r1);
        r0 = r13.f3727y;
        r1 = 2131559058; // 0x7f0d0292 float:1.874345E38 double:1.0531301026E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r1 = r13.f3711i;
        r0.setText(r1);
        r0 = r13.f3718p;
        r0 = r0 + -1;
        if (r0 >= 0) goto L_0x0634;
    L_0x027c:
        r0 = 0;
        r1 = r0;
    L_0x027e:
        r2 = com.illuminate.texaspoker.utils.Utility.m4469a(r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = com.illuminate.texaspoker.utils.Utility.m4508i(r2);
        r0 = r0.append(r4);
        r4 = "+";
        r0 = r0.append(r4);
        r2 = (double) r2;
        r4 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r2 = r2 * r4;
        r2 = (long) r2;
        r2 = com.illuminate.texaspoker.utils.Utility.m4508i(r2);
        r0 = r0.append(r2);
        r2 = r0.toString();
        r0 = r13.f3727y;
        r3 = 2131559060; // 0x7f0d0294 float:1.8743453E38 double:1.0531301036E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.TextView) r0;
        r0.setText(r2);
        r0 = r13.f3727y;
        r2 = 2131558850; // 0x7f0d01c2 float:1.8743027E38 double:1.05313E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r2 = com.illuminate.texaspoker.utils.Utility.m4487c(r1);
        r2 = com.illuminate.texaspoker.utils.Utility.m4508i(r2);
        r0.setText(r2);
        r0 = r13.f3727y;
        r2 = 2131558851; // 0x7f0d01c3 float:1.874303E38 double:1.0531300004E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r1 = com.illuminate.texaspoker.utils.Utility.m4482b(r1);
        r2 = (long) r1;
        r1 = r13.getResources();
        r4 = 2131165682; // 0x7f0701f2 float:1.7945588E38 double:1.052935749E-314;
        r1 = r1.getString(r4);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = 60;
        r2 = r2 / r6;
        r2 = java.lang.Long.valueOf(r2);
        r4[r5] = r2;
        r1 = java.lang.String.format(r1, r4);
        r0.setText(r1);
        r0 = r13.f3727y;
        r1 = 2131559068; // 0x7f0d029c float:1.874347E38 double:1.0531301076E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r13.f3701E = r0;
        r0 = r13.f3727y;
        r1 = 2131559063; // 0x7f0d0297 float:1.874346E38 double:1.053130105E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r13.f3702F = r0;
        r0 = r13.f3727y;
        r1 = 2131559073; // 0x7f0d02a1 float:1.874348E38 double:1.05313011E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r13.f3703G = r0;
        r0 = r13.f3727y;
        r1 = 2131559064; // 0x7f0d0298 float:1.8743461E38 double:1.0531301056E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.facebook.drawee.view.SimpleDraweeView) r0;
        r13.f3704H = r0;
        r0 = r13.f3727y;
        r1 = 2131559065; // 0x7f0d0299 float:1.8743464E38 double:1.053130106E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.Button) r0;
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$3;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = r13.f3727y;
        r1 = 2131559069; // 0x7f0d029d float:1.8743472E38 double:1.053130108E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.facebook.drawee.view.SimpleDraweeView) r0;
        r13.f3705I = r0;
        r0 = r13.f3727y;
        r1 = 2131559070; // 0x7f0d029e float:1.8743474E38 double:1.0531301086E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.Button) r0;
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$4;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = r13.f3727y;
        r1 = 2131559074; // 0x7f0d02a2 float:1.8743482E38 double:1.0531301105E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.facebook.drawee.view.SimpleDraweeView) r0;
        r13.f3706J = r0;
        r0 = r13.f3727y;
        r1 = 2131559075; // 0x7f0d02a3 float:1.8743484E38 double:1.053130111E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.Button) r0;
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$5;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        return;
    L_0x0384:
        r0 = r4.f5645d;
        r0 = r0.intValue();
        r5 = 2;
        if (r0 != r5) goto L_0x03cf;
    L_0x038d:
        r0 = r4.f5630N;
        r0 = com.illuminate.texaspoker.utils.StringUtils.m4462a(r0);
        if (r0 != 0) goto L_0x03b2;
    L_0x0395:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = r13.f3716n;
        r0 = r0.append(r5);
        r5 = " \u2022 ";
        r0 = r0.append(r5);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r4.f5630N;
        r13.f3721s = r0;
        goto L_0x014c;
    L_0x03b2:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r13.f3716n;
        r0 = r0.append(r4);
        r4 = " \u2022 ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = "";
        r13.f3721s = r0;
        goto L_0x014c;
    L_0x03cf:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r4.m3715i();
        r4 = r4.f5838q;
        r0 = r0.append(r4);
        r4 = " \u2022 ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r13.getResources();
        r4 = 2131165567; // 0x7f07017f float:1.7945355E38 double:1.0529356923E-314;
        r0 = r0.getString(r4);
        r13.f3721s = r0;
        goto L_0x014c;
    L_0x03f9:
        r0 = 0;
        r13.f3708f = r0;
        r0 = r13.f3707e;
        r0 = r0.getEGameRoomType();
        r0 = r0.getNumber();
        r13.f3712j = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r4 = r0.getVUserBillInfosList();
        r0 = new java.util.ArrayList;
        r0.<init>(r4);
        r13.f3710h = r0;
        r0 = r13.f3710h;
        r1 = new com.illuminate.texaspoker.activity.BillSngActivity$13;
        r1.<init>(r13);
        java.util.Collections.sort(r0, r1);
        r1 = 0;
        r2 = 0;
        r0 = 0;
        r5 = r4.iterator();
        r3 = r2;
        r2 = r1;
        r1 = r0;
    L_0x042d:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0497;
    L_0x0433:
        r0 = r5.next();
        r0 = (com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet) r0;
        r6 = r0.getISngRank();
        r8 = 1;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x0444;
    L_0x0443:
        r2 = r0;
    L_0x0444:
        r6 = r4.size();
        switch(r6) {
            case 2: goto L_0x047e;
            case 6: goto L_0x0467;
            case 9: goto L_0x0450;
            default: goto L_0x044b;
        };
    L_0x044b:
        r0 = r1;
        r1 = r3;
    L_0x044d:
        r3 = r1;
        r1 = r0;
        goto L_0x042d;
    L_0x0450:
        r6 = r0.getISngRank();
        r8 = 9;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x045b;
    L_0x045a:
        r1 = r0;
    L_0x045b:
        r6 = r0.getISngRank();
        r8 = 4;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x044b;
    L_0x0465:
        r3 = r0;
        goto L_0x042d;
    L_0x0467:
        r6 = r0.getISngRank();
        r8 = 6;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x0472;
    L_0x0471:
        r1 = r0;
    L_0x0472:
        r6 = r0.getISngRank();
        r8 = 3;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x044b;
    L_0x047c:
        r3 = r0;
        goto L_0x042d;
    L_0x047e:
        r6 = r0.getISngRank();
        r8 = 2;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x0489;
    L_0x0488:
        r1 = r0;
    L_0x0489:
        r6 = r0.getISngRank();
        r8 = 2;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 != 0) goto L_0x044b;
    L_0x0493:
        r12 = r1;
        r1 = r0;
        r0 = r12;
        goto L_0x044d;
    L_0x0497:
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getSPlayName();
        r13.f3711i = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getStCreateUserBaseInfo();
        r4 = r0.getUuid();
        r13.f3713k = r4;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getStCreateUserBaseInfo();
        r0 = r0.getStrSmallCover();
        r13.f3714l = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getStCreateUserBaseInfo();
        r0 = r0.getIGender();
        r13.f3715m = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getStCreateUserBaseInfo();
        r0 = r0.getStrNick();
        r13.f3716n = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r4 = r0.getLCreateTime();
        r13.f3717o = r4;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getESNGRoomType();
        r0 = r0.getNumber();
        r13.f3718p = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getIGameRoomUserMaxNums();
        r13.f3719q = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getECreateRoomType();
        r4 = com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE.CAHT_ROOM;
        if (r0 != r4) goto L_0x0562;
    L_0x0519:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r13.f3707e;
        r4 = r4.getStSNGBillInfoNet();
        r4 = r4.getStCreateUserBaseInfo();
        r4 = r4.getStrNick();
        r0 = r0.append(r4);
        r4 = " \u2022 ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getSFromText();
        r13.f3721s = r0;
    L_0x0548:
        if (r2 == 0) goto L_0x0550;
    L_0x054a:
        r4 = r2.getUuid();
        r13.f3722t = r4;
    L_0x0550:
        if (r3 == 0) goto L_0x0558;
    L_0x0552:
        r2 = r3.getUuid();
        r13.f3723u = r2;
    L_0x0558:
        if (r1 == 0) goto L_0x016a;
    L_0x055a:
        r0 = r1.getUuid();
        r13.f3724v = r0;
        goto L_0x016a;
    L_0x0562:
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getECreateRoomType();
        r4 = com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE.CLUB_ROOM;
        if (r0 != r4) goto L_0x05a0;
    L_0x0570:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r13.f3707e;
        r4 = r4.getStSNGBillInfoNet();
        r4 = r4.getStCreateUserBaseInfo();
        r4 = r4.getStrNick();
        r0 = r0.append(r4);
        r4 = " \u2022 ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r13.f3707e;
        r0 = r0.getStSNGBillInfoNet();
        r0 = r0.getSFromText();
        r13.f3721s = r0;
        goto L_0x0548;
    L_0x05a0:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r13.f3707e;
        r4 = r4.getStSNGBillInfoNet();
        r4 = r4.getStCreateUserBaseInfo();
        r4 = r4.getStrNick();
        r0 = r0.append(r4);
        r4 = " \u2022 ";
        r0 = r0.append(r4);
        r0 = r0.toString();
        r13.f3720r = r0;
        r0 = r13.getResources();
        r4 = 2131165567; // 0x7f07017f float:1.7945355E38 double:1.0529356923E-314;
        r0 = r0.getString(r4);
        r13.f3721s = r0;
        goto L_0x0548;
    L_0x05d2:
        r0 = r13.f3728z;
        r1 = 0;
        r0.setVisibility(r1);
        goto L_0x01d5;
    L_0x05da:
        r2 = r13.f3718p;
        r3 = 2;
        if (r2 != r3) goto L_0x05f8;
    L_0x05df:
        r1 = 2131165240; // 0x7f070038 float:1.7944692E38 double:1.0529355307E-314;
        r1 = r13.getString(r1);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r13.f3719q;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        goto L_0x0243;
    L_0x05f8:
        r2 = r13.f3718p;
        r3 = 3;
        if (r2 != r3) goto L_0x0616;
    L_0x05fd:
        r1 = 2131165239; // 0x7f070037 float:1.794469E38 double:1.05293553E-314;
        r1 = r13.getString(r1);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r13.f3719q;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        goto L_0x0243;
    L_0x0616:
        r2 = r13.f3718p;
        r3 = 4;
        if (r2 != r3) goto L_0x0243;
    L_0x061b:
        r1 = 2131165233; // 0x7f070031 float:1.7944677E38 double:1.052935527E-314;
        r1 = r13.getString(r1);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r13.f3719q;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        goto L_0x0243;
    L_0x0634:
        r1 = r0;
        goto L_0x027e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.activity.BillSngActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f3708f) {
            getMenuInflater().inflate(2131689473, menu);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559424) {
            return super.onOptionsItemSelected(menuItem);
        }
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(this);
        shareSocialDialog.f7078a = new C03846(this, shareSocialDialog);
        shareSocialDialog.f7079b = new C03857(this, shareSocialDialog);
        shareSocialDialog.f7080c = new C03868(this, shareSocialDialog);
        shareSocialDialog.f7081d = new C03879(this, shareSocialDialog);
        shareSocialDialog.f7082e = new AnonymousClass10(this, shareSocialDialog);
        shareSocialDialog.f7083f = new AnonymousClass11(this, shareSocialDialog);
        shareSocialDialog.show();
        return true;
    }

    public void finish() {
        if (!this.f3708f) {
            setResult(0, null);
        }
        super.finish();
    }

    protected void onResume() {
        super.onResume();
        m2785a();
    }

    private void m2785a() {
        if (!DBManager.m3631a().m3632b()) {
            String str;
            String str2;
            CharSequence charSequence;
            int i;
            Object obj;
            if (this.f3715m == 1) {
                ((GenericDraweeHierarchy) this.f3697A.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3697A.getHierarchy()).m1407a(2130903193);
            }
            this.f3697A.setImageURI(Uri.parse(this.f3714l));
            this.f3698B = DBManager.m3631a().f5563c.m3639a(this.f3723u);
            if (this.f3698B == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3723u != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3723u, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3698B.f5838q;
                str = this.f3698B.f5836o;
                i = this.f3698B.f5832k.intValue();
            }
            this.f3702F.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3704H.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3704H.getHierarchy()).m1407a(2130903193);
            }
            this.f3704H.setImageURI(Uri.parse(str));
            this.f3699C = DBManager.m3631a().f5563c.m3639a(this.f3722t);
            if (this.f3699C == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3722t != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3722t, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3699C.f5838q;
                str = this.f3699C.f5836o;
                i = this.f3699C.f5832k.intValue();
            }
            this.f3701E.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3705I.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3705I.getHierarchy()).m1407a(2130903193);
            }
            this.f3705I.setImageURI(Uri.parse(str));
            this.f3700D = DBManager.m3631a().f5563c.m3639a(this.f3724v);
            if (this.f3700D == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3724v != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3724v, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3700D.f5838q;
                str = this.f3700D.f5836o;
                i = this.f3700D.f5832k.intValue();
            }
            this.f3703G.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3706J.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3706J.getHierarchy()).m1407a(2130903193);
            }
            this.f3706J.setImageURI(Uri.parse(str));
            this.f3726x.notifyDataSetChanged();
        }
    }

    protected final void m2794a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2785a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m2785a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_USERBASEINFO_SUCCESS")) {
            m2785a();
        }
    }

    static /* synthetic */ void m2790e(BillSngActivity billSngActivity) {
        Intent intent = new Intent(billSngActivity, GamePokerHistoryListActivity.class);
        intent.putExtra("lGameRoomId", billSngActivity.f3709g);
        billSngActivity.startActivity(intent);
    }

    static /* synthetic */ void m2786a(BillSngActivity billSngActivity, FriendUser friendUser) {
        if (friendUser != null && friendUser.f5842u.longValue() != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(billSngActivity, FriendInfoActivity.class);
            intent.putExtra("friendUuid", friendUser.f5842u);
            billSngActivity.startActivity(intent);
        }
    }
}
