package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class ClubChargeFundActivity extends BaseToolBarActivity {
    private static String f3925d;
    private long f3926e;
    private ChatRoom f3927f;
    private int f3928g;
    private String f3929h;
    private TextView f3930i;
    private ImageButton f3931j;
    private TextView f3932k;
    private ImageButton f3933l;
    private TextView f3934m;
    private TextView f3935n;
    private Button f3936o;
    private TextView f3937p;
    private TextView f3938q;

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.1 */
    class C04331 implements OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3915a;

        C04331(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3915a = clubChargeFundActivity;
        }

        public final void onClick(View view) {
            this.f3915a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.2 */
    class C04342 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3916a;

        C04342(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3916a = clubChargeFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f3916a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.3 */
    class C04353 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3917a;

        C04353(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3917a = clubChargeFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.4 */
    class C04374 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3919a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.4.1 */
        class C04361 implements DialogInterface.OnClickListener {
            final /* synthetic */ C04374 f3918a;

            C04361(C04374 c04374) {
                this.f3918a = c04374;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f3918a.f3919a.startActivity(new Intent(this.f3918a.f3919a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f3918a.f3919a.startActivity(new Intent(this.f3918a.f3919a, RechargeActivity.class));
                }
            }
        }

        C04374(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3919a = clubChargeFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (Config.f6659d == Config.f6657b) {
                this.f3919a.startActivity(new Intent(this.f3919a, RechargeForGoogleActivity.class));
            } else if (Config.f6659d == Config.f6658c) {
                this.f3919a.startActivity(new Intent(this.f3919a, RechargeActivity.class));
            } else {
                new Builder(this.f3919a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C04361(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.5 */
    class C04385 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3920a;

        C04385(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3920a = clubChargeFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.6 */
    class C04396 implements OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3921a;

        C04396(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3921a = clubChargeFundActivity;
        }

        public final void onClick(View view) {
            ClubChargeFundActivity.m2905a(this.f3921a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.7 */
    class C04407 implements OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3922a;

        C04407(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3922a = clubChargeFundActivity;
        }

        public final void onClick(View view) {
            ClubChargeFundActivity.m2906b(this.f3922a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.8 */
    class C04418 implements OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3923a;

        C04418(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3923a = clubChargeFundActivity;
        }

        public final void onClick(View view) {
            ClubChargeFundActivity.m2907c(this.f3923a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.9 */
    class C04429 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubChargeFundActivity f3924a;

        C04429(ClubChargeFundActivity clubChargeFundActivity) {
            this.f3924a = clubChargeFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f3924a.finish();
        }
    }

    static /* synthetic */ void m2906b(ClubChargeFundActivity clubChargeFundActivity) {
        clubChargeFundActivity.f3928g--;
        if (clubChargeFundActivity.f3928g <= 1) {
            clubChargeFundActivity.f3928g = 1;
        }
        clubChargeFundActivity.m2904a();
    }

    static /* synthetic */ void m2907c(ClubChargeFundActivity clubChargeFundActivity) {
        if (clubChargeFundActivity.f3927f.f5734U == null || !clubChargeFundActivity.f3927f.f5734U.booleanValue()) {
            new Builder(clubChargeFundActivity).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C04429(clubChargeFundActivity)).show();
        } else if (SharedPreferencesManager.m4290U() > SharedPreferencesManager.m4413q()) {
            new Builder(clubChargeFundActivity).setTitle(2131165514).setMessage(2131165594).setPositiveButton(2131165427, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubChargeFundActivity f3912a;

                /* renamed from: com.illuminate.texaspoker.activity.ClubChargeFundActivity.11.1 */
                class C04321 implements DialogInterface.OnClickListener {
                    final /* synthetic */ AnonymousClass11 f3911a;

                    C04321(AnonymousClass11 anonymousClass11) {
                        this.f3911a = anonymousClass11;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            this.f3911a.f3912a.startActivity(new Intent(this.f3911a.f3912a, RechargeForGoogleActivity.class));
                        } else if (i == 1) {
                            this.f3911a.f3912a.startActivity(new Intent(this.f3911a.f3912a, RechargeActivity.class));
                        }
                    }
                }

                {
                    this.f3912a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (Config.f6659d == Config.f6657b) {
                        this.f3912a.startActivity(new Intent(this.f3912a, RechargeForGoogleActivity.class));
                    } else if (Config.f6659d == Config.f6658c) {
                        this.f3912a.startActivity(new Intent(this.f3912a, RechargeActivity.class));
                    } else {
                        new Builder(this.f3912a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C04321(this)).show();
                    }
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubChargeFundActivity f3910a;

                {
                    this.f3910a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else {
            String g = Utility.m4502g(SharedPreferencesManager.m4291V() * ((long) clubChargeFundActivity.f3928g));
            new Builder(clubChargeFundActivity).setTitle(2131165514).setMessage(String.format(clubChargeFundActivity.getResources().getString(2131165323), new Object[]{clubChargeFundActivity.f3927f.f5755p, g})).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubChargeFundActivity f3914a;

                {
                    this.f3914a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f3914a.b = new LoadingDialog(this.f3914a);
                    this.f3914a.b.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4133b(this.f3914a.f3926e, this.f3914a.f3928g);
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubChargeFundActivity f3913a;

                {
                    this.f3913a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    static {
        f3925d = "SendFundActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968609);
        this.f3926e = getIntent().getExtras().getLong("lClubId");
        this.f3928g = 1;
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04331(this));
        this.f3930i = (TextView) findViewById(2131558547);
        this.f3931j = (ImageButton) findViewById(2131558549);
        this.f3931j.setOnClickListener(new C04396(this));
        this.f3932k = (TextView) findViewById(2131558550);
        this.f3933l = (ImageButton) findViewById(2131558551);
        this.f3933l.setOnClickListener(new C04407(this));
        this.f3934m = (TextView) findViewById(2131558553);
        this.f3935n = (TextView) findViewById(2131558555);
        this.f3938q = (TextView) findViewById(2131558557);
        this.f3937p = (TextView) findViewById(2131558558);
        this.f3936o = (Button) findViewById(2131558559);
        this.f3936o.setOnClickListener(new C04418(this));
    }

    protected void onResume() {
        super.onResume();
        m2904a();
        NetworkUtil.m4073a();
        NetworkUtil.m4184p();
    }

    private void m2904a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f3930i.setText(SharedPreferencesManager.m4289T());
            this.f3927f = DBManager.m3631a().f5565e.m3590a(this.f3926e, 2);
            this.f3932k.setText(this.f3928g);
            if (this.f3928g == 1) {
                this.f3933l.setEnabled(false);
                this.f3931j.setEnabled(true);
            } else if (this.f3928g >= 99) {
                this.f3931j.setEnabled(false);
                this.f3933l.setEnabled(true);
            } else {
                this.f3931j.setEnabled(true);
                this.f3933l.setEnabled(true);
            }
            this.f3934m.setText(Utility.m4502g(this.f3927f.f5752m.longValue()));
            this.f3929h = Utility.m4502g(this.f3927f.f5752m.longValue() + (SharedPreferencesManager.m4291V() * ((long) this.f3928g)));
            this.f3935n.setText(this.f3929h);
            long U = SharedPreferencesManager.m4290U() * ((long) this.f3928g);
            this.f3937p.setText(Utility.m4502g(U));
            this.f3938q.setText(String.format(getResources().getString(2131165405), new Object[]{Utility.m4502g(SharedPreferencesManager.m4413q())}));
            if (U > SharedPreferencesManager.m4413q()) {
                this.f3937p.setTextColor(-1811364);
                this.f3931j.setEnabled(false);
                return;
            }
            this.f3937p.setTextColor(-1);
            this.f3931j.setEnabled(true);
        }
    }

    protected final void m2910a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2904a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_SELLING_ITEM_SUCCESS")) {
            m2904a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_SELLING_ITEM_FAULT")) {
            m2904a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CLUB_FUND_SUCCESS")) {
            this.b.dismiss();
            m2904a();
            new Builder(this).setTitle(2131165327).setMessage(2131165326).setPositiveButton(2131165438, new C04342(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CLUB_FUND_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            if (intValue == 2131165594) {
                new Builder(this).setTitle(2131165514).setMessage(2131165594).setPositiveButton(2131165427, new C04374(this)).setNegativeButton(2131165432, new C04353(this)).show();
            } else {
                new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C04385(this)).show();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2904a();
        }
    }

    static /* synthetic */ void m2905a(ClubChargeFundActivity clubChargeFundActivity) {
        if (clubChargeFundActivity.f3928g < 99) {
            clubChargeFundActivity.f3928g++;
        }
        clubChargeFundActivity.m2904a();
    }
}
