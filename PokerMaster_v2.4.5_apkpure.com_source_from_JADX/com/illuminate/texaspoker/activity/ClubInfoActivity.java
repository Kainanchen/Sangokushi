package com.illuminate.texaspoker.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.p051j.p053b.ShareContent.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p054c.ShareDialog;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.LeagueClubDao.Properties;
import com.illuminate.texaspoker.p055a.AlbumPagerAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.LeagueClubDBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.ClubAlbum;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.ImageUtility;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.a.a.d.g;
import org.a.a.d.i;

public class ClubInfoActivity extends BaseToolBarActivity {
    private static String f4000d;
    private TextView f4001A;
    private TextView f4002B;
    private Button f4003C;
    private LinearLayout f4004D;
    private ImageButton f4005E;
    private View f4006F;
    private ImageButton f4007G;
    private TextView f4008H;
    private TextView f4009I;
    private ImageButton f4010J;
    private Switch f4011K;
    private Switch f4012L;
    private ImageButton f4013M;
    private ImageButton f4014N;
    private TextView f4015O;
    private ImageView f4016P;
    private LayoutInflater f4017e;
    private long f4018f;
    private boolean f4019g;
    private boolean f4020h;
    private ChatRoom f4021i;
    private SimpleDateFormat f4022j;
    private List f4023k;
    private List<String> f4024l;
    private List<String> f4025m;
    private int f4026n;
    private int f4027o;
    private AlbumPagerAdapter f4028p;
    private List<ImageView> f4029q;
    private int f4030r;
    private ViewPager f4031s;
    private ViewGroup f4032t;
    private SimpleDraweeView f4033u;
    private TextView f4034v;
    private TextView f4035w;
    private TextView f4036x;
    private SimpleDraweeView f4037y;
    private TextView f4038z;

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3967a;
        final /* synthetic */ ClubInfoActivity f3968b;

        AnonymousClass10(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3968b = clubInfoActivity;
            this.f3967a = shareSocialDialog;
        }

        public final void onClick(View view) {
            Bitmap a;
            String format = String.format(this.f3968b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3968b.f4021i.f5755p, this.f3968b.f4021i.f5742c});
            String str = this.f3968b.f4021i.f5755p + "@" + this.f3968b.getResources().getString(2131165230);
            Uri parse = Uri.parse(this.f3968b.f4021i.f5760u);
            if (Utility.m4481a(parse)) {
                Bitmap decodeFile = BitmapFactory.decodeFile(Utility.m4483b(parse).getAbsolutePath());
                a = Utility.m4470a(decodeFile);
                decodeFile.recycle();
            } else {
                a = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903183);
            }
            ShareUtil.m4248a().m4260a("http://page.pokermate.net/download", str, format, 0, a);
            a.recycle();
            this.f3967a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3969a;
        final /* synthetic */ ClubInfoActivity f3970b;

        AnonymousClass11(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3970b = clubInfoActivity;
            this.f3969a = shareSocialDialog;
        }

        public final void onClick(View view) {
            Bitmap a;
            String format = String.format(this.f3970b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3970b.f4021i.f5755p, this.f3970b.f4021i.f5742c});
            Uri parse = Uri.parse(this.f3970b.f4021i.f5760u);
            if (Utility.m4481a(parse)) {
                Bitmap decodeFile = BitmapFactory.decodeFile(Utility.m4483b(parse).getAbsolutePath());
                a = Utility.m4470a(decodeFile);
                decodeFile.recycle();
            } else {
                a = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903183);
            }
            ShareUtil.m4248a().m4260a("http://page.pokermate.net/download", format, format, 1, a);
            a.recycle();
            this.f3969a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.13 */
    class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3972a;
        final /* synthetic */ ClubInfoActivity f3973b;

        AnonymousClass13(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3973b = clubInfoActivity;
            this.f3972a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String format = String.format(this.f3973b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3973b.f4021i.f5755p, this.f3973b.f4021i.f5742c});
            String str = this.f3973b.getResources().getString(2131165230) + " - " + this.f3973b.getResources().getString(2131165504);
            if (ShareDialog.m2557a(ShareLinkContent.class)) {
                ShareContent shareLinkContent = new ShareLinkContent.ShareLinkContent();
                shareLinkContent.f2576a = Uri.parse("http://page.pokermate.net/download");
                ShareLinkContent.ShareLinkContent shareLinkContent2 = (ShareLinkContent.ShareLinkContent) shareLinkContent;
                shareLinkContent2.f2586i = format;
                shareLinkContent2.f2584g = str;
                shareLinkContent2.f2585h = Uri.parse("http://upyun.pokermate.net/web/images/ic_launcher.png");
                new ShareDialog(this.f3973b).m2567a(shareLinkContent2.m2500a(), ShareDialog.ShareDialog.AUTOMATIC);
            } else {
                this.f3973b.m2732a(2130903246, 2131165466, 1);
            }
            this.f3972a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.14 */
    class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3974a;
        final /* synthetic */ ClubInfoActivity f3975b;

        AnonymousClass14(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3975b = clubInfoActivity;
            this.f3974a = shareSocialDialog;
        }

        public final void onClick(View view) {
            Bitmap a;
            String str = this.f3975b.getResources().getString(2131165230) + " - " + this.f3975b.getResources().getString(2131165504);
            String format = String.format(this.f3975b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3975b.f4021i.f5755p, this.f3975b.f4021i.f5742c});
            Uri parse = Uri.parse(this.f3975b.f4021i.f5760u);
            if (Utility.m4481a(parse)) {
                Bitmap decodeFile = BitmapFactory.decodeFile(Utility.m4483b(parse).getAbsolutePath());
                a = Utility.m4470a(decodeFile);
                decodeFile.recycle();
            } else {
                a = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903183);
            }
            ShareUtil.m4248a().m4261a("http://page.pokermate.net/download", str, format, a);
            this.f3974a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.15 */
    class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3976a;
        final /* synthetic */ ClubInfoActivity f3977b;

        AnonymousClass15(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3977b = clubInfoActivity;
            this.f3976a = shareSocialDialog;
        }

        public final void onClick(View view) {
            Parcelable parse;
            String str = this.f3977b.f4021i.f5755p + "@" + this.f3977b.getResources().getString(2131165230);
            String str2 = str + "\n" + String.format(this.f3977b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3977b.f4021i.f5755p, this.f3977b.f4021i.f5742c}) + "\nhttp://page.pokermate.net/download";
            Uri parse2 = Uri.parse(this.f3977b.f4021i.f5760u);
            Bitmap decodeFile;
            if (Utility.m4481a(parse2)) {
                decodeFile = BitmapFactory.decodeFile(Utility.m4483b(parse2).getAbsolutePath());
                parse = Uri.parse(ImageUtility.m4072b(decodeFile));
                decodeFile.recycle();
            } else {
                decodeFile = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903183);
                parse = Uri.parse(ImageUtility.m4072b(decodeFile));
                decodeFile.recycle();
            }
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str2);
                intent.putExtra("android.intent.extra.STREAM", parse);
                intent.setType("image/*");
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.setPackage("com.whatsapp");
                BaseApplication.m3548a().startActivity(intent);
            } catch (ActivityNotFoundException e) {
                this.f3977b.m2732a(2130903246, 2131165470, 1);
            }
            this.f3976a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.16 */
    class AnonymousClass16 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3978a;
        final /* synthetic */ ClubInfoActivity f3979b;

        AnonymousClass16(ClubInfoActivity clubInfoActivity, ShareSocialDialog shareSocialDialog) {
            this.f3979b = clubInfoActivity;
            this.f3978a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = (this.f3979b.f4021i.f5755p + "@" + this.f3979b.getResources().getString(2131165230)) + "-" + String.format(this.f3979b.getResources().getString(2131165490), new Object[]{SharedPreferencesManager.m4361i(), this.f3979b.f4021i.f5755p, this.f3979b.f4021i.f5742c}) + " http://page.pokermate.net/download";
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.setData(Uri.parse("line://msg/text/" + str));
                BaseApplication.m3548a().startActivity(intent);
            } catch (ActivityNotFoundException e) {
                this.f3979b.m2732a(2130903246, 2131165467, 1);
            }
            this.f3978a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.1 */
    class C04561 implements OnClickListener {
        final /* synthetic */ ClubInfoActivity f3983a;

        C04561(ClubInfoActivity clubInfoActivity) {
            this.f3983a = clubInfoActivity;
        }

        public final void onClick(View view) {
            this.f3983a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.2 */
    class C04572 implements OnClickListener {
        final /* synthetic */ ClubInfoActivity f3992a;

        C04572(ClubInfoActivity clubInfoActivity) {
            this.f3992a = clubInfoActivity;
        }

        public final void onClick(View view) {
            new Builder(this.f3992a).setTitle(2131165514).setMessage(2131165253).setPositiveButton(2131165435, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubInfoActivity f3981a;

                {
                    this.f3981a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    DBManager.m3631a().f5566f.m3574a(this.f3981a.f4021i.f5741b.longValue(), 2, false);
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubInfoActivity f3980a;

                {
                    this.f3980a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.3 */
    class C04583 implements OnClickListener {
        final /* synthetic */ ClubInfoActivity f3993a;

        C04583(ClubInfoActivity clubInfoActivity) {
            this.f3993a = clubInfoActivity;
        }

        public final void onClick(View view) {
            ClubInfoActivity.m2934i(this.f3993a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.4 */
    class C04594 implements OnClickListener {
        final /* synthetic */ ClubInfoActivity f3994a;

        C04594(ClubInfoActivity clubInfoActivity) {
            this.f3994a = clubInfoActivity;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f3994a, ClubLeagueListActivity.class);
            intent.putExtra("lClubId", this.f3994a.f4018f);
            this.f3994a.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.5 */
    class C04605 implements OnPageChangeListener {
        final /* synthetic */ ClubInfoActivity f3995a;

        C04605(ClubInfoActivity clubInfoActivity) {
            this.f3995a = clubInfoActivity;
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f3995a.m2923a(i);
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.6 */
    class C04616 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubInfoActivity f3996a;

        C04616(ClubInfoActivity clubInfoActivity) {
            this.f3996a = clubInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.7 */
    class C04627 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubInfoActivity f3997a;

        C04627(ClubInfoActivity clubInfoActivity) {
            this.f3997a = clubInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ClubInfoActivity.m2936k(this.f3997a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.8 */
    class C04638 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubInfoActivity f3998a;

        C04638(ClubInfoActivity clubInfoActivity) {
            this.f3998a = clubInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubInfoActivity.9 */
    class C04649 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubInfoActivity f3999a;

        C04649(ClubInfoActivity clubInfoActivity) {
            this.f3999a = clubInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4000d = "ClubInfoActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968618);
        this.f4018f = getIntent().getExtras().getLong("clubId");
        this.f4017e = LayoutInflater.from(this);
        this.f4022j = new SimpleDateFormat(getString(2131165520));
        this.f4030r = 0;
        this.f4023k = new ArrayList();
        this.f4029q = new ArrayList();
        this.f4024l = new ArrayList();
        this.f4025m = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04561(this));
        this.f4031s = (ViewPager) findViewById(2131558607);
        LayoutParams layoutParams = (LayoutParams) this.f4031s.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        this.f4027o = (i * 3) / 4;
        this.f4026n = i;
        layoutParams.height = this.f4027o;
        layoutParams.width = this.f4026n;
        this.f4031s.setLayoutParams(layoutParams);
        this.f4028p = new AlbumPagerAdapter(this, this.f4026n, this.f4024l, this.f4025m, BigImageActivity.f3543e, this.f4018f);
        this.f4031s.setAdapter(this.f4028p);
        this.f4031s.addOnPageChangeListener(new C04605(this));
        this.f4032t = (ViewGroup) findViewById(2131558609);
        this.f4033u = (SimpleDraweeView) findViewById(2131558610);
        ((Button) findViewById(2131558611)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3971a;

            {
                this.f3971a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2924a(this.f3971a);
            }
        });
        this.f4034v = (TextView) findViewById(2131558613);
        this.f4035w = (TextView) findViewById(2131558615);
        this.f4036x = (TextView) findViewById(2131558616);
        this.f4037y = (SimpleDraweeView) findViewById(2131558618);
        ((Button) findViewById(2131558619)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3985a;

            {
                this.f3985a = r1;
            }

            public final void onClick(View view) {
            }
        });
        this.f4004D = (LinearLayout) findViewById(2131558634);
        ((ImageButton) findViewById(2131558632)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3986a;

            {
                this.f3986a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2926b(this.f3986a);
            }
        });
        this.f4038z = (TextView) findViewById(2131558620);
        this.f4001A = (TextView) findViewById(2131558622);
        this.f4002B = (TextView) findViewById(2131558623);
        this.f4005E = (ImageButton) findViewById(2131558631);
        this.f4005E.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3987a;

            {
                this.f3987a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2927c(this.f3987a);
            }
        });
        this.f4006F = findViewById(2131558640);
        this.f4008H = (TextView) findViewById(2131558643);
        this.f4007G = (ImageButton) findViewById(2131558641);
        this.f4007G.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3988a;

            {
                this.f3988a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2929d(this.f3988a);
            }
        });
        this.f4009I = (TextView) findViewById(2131558645);
        this.f4010J = (ImageButton) findViewById(2131558646);
        this.f4010J.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3989a;

            {
                this.f3989a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2930e(this.f3989a);
            }
        });
        this.f4011K = (Switch) findViewById(2131558648);
        this.f4011K.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3990a;

            {
                this.f3990a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2931f(this.f3990a);
            }
        });
        this.f4012L = (Switch) findViewById(2131558650);
        this.f4012L.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubInfoActivity f3991a;

            {
                this.f3991a = r1;
            }

            public final void onClick(View view) {
                ClubInfoActivity.m2932g(this.f3991a);
            }
        });
        this.f4013M = (ImageButton) findViewById(2131558651);
        this.f4013M.setOnClickListener(new C04572(this));
        this.f4003C = (Button) findViewById(2131558624);
        this.f4003C.setOnClickListener(new C04583(this));
        this.f4014N = (ImageButton) findViewById(2131558636);
        this.f4014N.setOnClickListener(new C04594(this));
        this.f4015O = (TextView) findViewById(2131558638);
        this.f4016P = (ImageView) findViewById(2131558639);
    }

    protected void onResume() {
        super.onResume();
        m2922a();
        NetworkUtil.m4073a();
        NetworkUtil.m4181n(this.f4018f);
        NetworkUtil.m4073a();
        NetworkUtil.m4195u(this.f4018f);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (this.f4021i != null && this.f4021i.f5734U != null && this.f4021i.f5734U.booleanValue()) {
            getMenuInflater().inflate(2131689476, menu);
        } else if (!this.f4020h) {
            getMenuInflater().inflate(2131689475, menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559427) {
            Intent intent = new Intent(this, ClubSettingsActivity.class);
            intent.putExtra("lClubId", this.f4021i.f5741b);
            startActivity(intent);
            return true;
        } else if (itemId != 2131559426) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m2928d();
            return true;
        }
    }

    private void m2922a() {
        if (!DBManager.m3631a().m3632b()) {
            ImageView imageView;
            this.f4021i = DBManager.m3631a().f5565e.m3590a(this.f4018f, 2);
            this.f4020h = false;
            if (this.f4021i.f5717D == null) {
                this.f4019g = false;
            } else {
                this.f4019g = this.f4021i.f5717D.booleanValue();
            }
            if (this.f4019g) {
                this.f4020h = true;
            } else {
                this.f4020h = false;
            }
            setTitle(this.f4021i.f5755p);
            this.f4023k.clear();
            this.f4024l.clear();
            this.f4025m.clear();
            this.f4023k.addAll(DBManager.m3631a().f5567g.m3618a(this.f4018f));
            if (this.f4023k.size() == 0) {
                this.f4023k.add(LetterIndexBar.SEARCH_ICON_LETTER);
            }
            this.f4029q.clear();
            this.f4032t.removeAllViews();
            for (int i = 0; i < this.f4023k.size(); i++) {
                Object obj = this.f4023k.get(i);
                if (obj instanceof String) {
                    this.f4024l.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    this.f4025m.add(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    ClubAlbum clubAlbum = (ClubAlbum) obj;
                    this.f4024l.add(clubAlbum.f5783e);
                    this.f4025m.add(clubAlbum.f5782d);
                }
                View inflate = LayoutInflater.from(this).inflate(2130968722, null);
                imageView = (ImageView) inflate.findViewById(2131559014);
                imageView.setEnabled(false);
                imageView.setTag(Integer.valueOf(i));
                this.f4029q.add(imageView);
                this.f4032t.addView(inflate);
            }
            this.f4028p.notifyDataSetChanged();
            if (this.f4023k.size() - 1 < this.f4030r) {
                this.f4030r = this.f4023k.size() - 1;
                this.f4031s.setCurrentItem(this.f4030r);
            }
            m2923a(this.f4030r);
            this.f4033u.setImageURI(Uri.parse(this.f4021i.f5760u));
            this.f4034v.setText(this.f4021i.f5755p);
            this.f4035w.setText(this.f4021i.f5729P + "/" + this.f4021i.f5731R);
            this.f4036x.setText(Utility.m4506h(this.f4021i.f5765z));
            if (this.f4021i.m3726a().f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) this.f4037y.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f4037y.getHierarchy()).m1407a(2130903193);
            }
            this.f4037y.setImageURI(Uri.parse(this.f4021i.m3726a().f5836o));
            this.f4038z.setText(this.f4021i.m3726a().f5838q);
            if (DBManager.m3631a().f5575o.m3624a(this.f4021i.f5742c.longValue()) + DBManager.m3631a().f5582v.m3680a(this.f4021i.f5742c.longValue()) > 0) {
                this.f4005E.setImageResource(2130837622);
            } else {
                this.f4005E.setImageResource(2130837621);
            }
            if (this.f4021i.f5734U == null || !this.f4021i.f5734U.booleanValue()) {
                this.f4005E.setVisibility(8);
            } else {
                this.f4005E.setVisibility(0);
            }
            this.f4004D.removeAllViews();
            int width = (int) (((float) this.f4004D.getWidth()) / Utility.m4467a((Context) this, 50.0f));
            int i2 = 0;
            for (ChatUser chatUser : DBManager.m3631a().f5569i.m3610a(this.f4018f)) {
                View inflate2 = this.f4017e.inflate(2130968755, null);
                this.f4004D.addView(inflate2);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate2.findViewById(2131559135);
                if (chatUser.m3728a().f5832k.intValue() == 1) {
                    ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m1407a(2130903193);
                }
                simpleDraweeView.setImageURI(Uri.parse(chatUser.m3728a().f5836o));
                imageView = (ImageView) inflate2.findViewById(2131559137);
                if (chatUser.f5767b == null || chatUser.f5767b.intValue() == 2) {
                    imageView.setVisibility(8);
                } else if (chatUser.f5767b.intValue() == 1) {
                    imageView.setImageResource(2130903163);
                    imageView.setVisibility(0);
                } else if (chatUser.f5767b.intValue() == 3) {
                    imageView.setImageResource(2130903162);
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                int i3 = i2 + 1;
                if (i3 >= width) {
                    break;
                }
                i2 = i3;
            }
            if (this.f4021i.f5734U == null || !this.f4021i.f5734U.booleanValue()) {
                this.f4006F.setVisibility(8);
            } else {
                this.f4006F.setVisibility(0);
            }
            this.f4008H.setText(Utility.m4502g(this.f4021i.f5752m.longValue()));
            this.f4001A.setText(this.f4021i.f5764y);
            this.f4009I.setText(this.f4021i.f5741b);
            if (this.f4021i.f5734U == null || !this.f4021i.f5734U.booleanValue()) {
                this.f4011K.setEnabled(false);
            } else {
                this.f4011K.setEnabled(true);
            }
            if (this.f4021i.f5719F.booleanValue()) {
                this.f4012L.setChecked(true);
            } else {
                this.f4012L.setChecked(false);
            }
            if (this.f4021i.f5735V == null || !this.f4021i.f5735V.booleanValue()) {
                this.f4011K.setChecked(false);
            } else {
                this.f4011K.setChecked(true);
            }
            String format = this.f4022j.format(new Date(this.f4021i.f5746g.longValue()));
            this.f4002B.setText(String.format(getResources().getString(2131165338), new Object[]{format}));
            if (this.f4020h) {
                this.f4003C.setText(2131165267);
                this.f4003C.setBackgroundResource(2130837664);
            } else {
                this.f4003C.setText(2131165318);
                this.f4003C.setBackgroundResource(2130837657);
            }
            if (this.f4021i.f5734U == null || !this.f4021i.f5734U.booleanValue()) {
                this.f4014N.setEnabled(false);
                this.f4016P.setVisibility(8);
            } else {
                this.f4014N.setEnabled(true);
                this.f4016P.setVisibility(0);
            }
            List a = DBManager.m3631a().f5581u.m3671a(this.f4018f);
            if (a.size() == 1) {
                this.f4015O.setText(((LeagueClub) a.get(0)).m3738a().f5906d);
            } else {
                this.f4015O.setText(String.format(getResources().getString(2131165367), new Object[]{Integer.valueOf(a.size())}));
            }
            invalidateOptionsMenu();
        }
    }

    private void m2923a(int i) {
        if (i >= 0 && i <= this.f4029q.size() - 1) {
            ((ImageView) this.f4029q.get(this.f4030r)).setEnabled(false);
            ((ImageView) this.f4029q.get(i)).setEnabled(true);
            this.f4030r = i;
        }
    }

    private void m2928d() {
        new Builder(this).setMessage(2131165408).setPositiveButton(2131165438, new C04627(this)).setNegativeButton(2131165432, new C04616(this)).show();
    }

    protected final void m2938a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2922a();
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_CHATROOM_SUCCESS")) {
            this.b.dismiss();
            BaseApplication.f5509b.m3212d();
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("returnTo", -1);
            startActivity(intent);
            overridePendingTransition(2131034127, 2131034127);
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_CHATROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubInfoActivity f3982a;

                {
                    this.f3982a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_SETTING_SUCCESS")) {
            m2922a();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_SETTING_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            m2922a();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubInfoActivity f3984a;

                {
                    this.f3984a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2922a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2922a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m2922a();
        }
    }

    static /* synthetic */ void m2924a(ClubInfoActivity clubInfoActivity) {
        Intent intent = new Intent(clubInfoActivity, BigImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3544f);
        bundle.putString(BigImageActivity.f3547i, clubInfoActivity.f4021i.f5760u);
        bundle.putString(BigImageActivity.f3548j, clubInfoActivity.f4021i.f5761v);
        bundle.putLong(BigImageActivity.f3550l, clubInfoActivity.f4021i.f5741b.longValue());
        intent.putExtras(bundle);
        clubInfoActivity.startActivity(intent);
        clubInfoActivity.overridePendingTransition(17432576, 17432577);
    }

    static /* synthetic */ void m2926b(ClubInfoActivity clubInfoActivity) {
        Intent intent = new Intent(clubInfoActivity, ClubUserManagerActivity.class);
        intent.putExtra("lClubId", clubInfoActivity.f4021i.f5741b);
        clubInfoActivity.startActivity(intent);
    }

    static /* synthetic */ void m2927c(ClubInfoActivity clubInfoActivity) {
        DBManager.m3631a().f5575o.m3629c(clubInfoActivity.f4021i.f5741b.longValue());
        DBManager.m3631a().f5582v.m3685c(clubInfoActivity.f4021i.f5741b.longValue());
        Intent intent = new Intent(clubInfoActivity, ClubMessageActivity.class);
        intent.putExtra("lClubId", clubInfoActivity.f4021i.f5741b);
        clubInfoActivity.startActivity(intent);
    }

    static /* synthetic */ void m2929d(ClubInfoActivity clubInfoActivity) {
        Intent intent = new Intent(clubInfoActivity, ClubFundActivity.class);
        intent.putExtra("lClubId", clubInfoActivity.f4021i.f5741b);
        clubInfoActivity.startActivity(intent);
    }

    static /* synthetic */ void m2930e(ClubInfoActivity clubInfoActivity) {
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(clubInfoActivity);
        shareSocialDialog.f7078a = new AnonymousClass10(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.f7079b = new AnonymousClass11(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.f7080c = new AnonymousClass13(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.f7081d = new AnonymousClass14(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.f7082e = new AnonymousClass15(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.f7083f = new AnonymousClass16(clubInfoActivity, shareSocialDialog);
        shareSocialDialog.show();
    }

    static /* synthetic */ void m2931f(ClubInfoActivity clubInfoActivity) {
        if (clubInfoActivity.f4019g) {
            NetworkUtil.m4073a();
            NetworkUtil.m4098a(clubInfoActivity.f4018f, clubInfoActivity.f4012L.isChecked(), clubInfoActivity.f4011K.isChecked());
        }
    }

    static /* synthetic */ void m2932g(ClubInfoActivity clubInfoActivity) {
        if (clubInfoActivity.f4019g) {
            NetworkUtil.m4073a();
            NetworkUtil.m4098a(clubInfoActivity.f4018f, clubInfoActivity.f4012L.isChecked(), clubInfoActivity.f4011K.isChecked());
        }
    }

    static /* synthetic */ void m2934i(ClubInfoActivity clubInfoActivity) {
        if (clubInfoActivity.f4020h) {
            clubInfoActivity.m2928d();
            return;
        }
        Intent intent = new Intent(clubInfoActivity, SendEnterClubActivity.class);
        intent.putExtra("lClubId", clubInfoActivity.f4018f);
        clubInfoActivity.startActivity(intent);
    }

    static /* synthetic */ void m2936k(ClubInfoActivity clubInfoActivity) {
        if (SharedPreferencesManager.m4308b() == clubInfoActivity.f4021i.f5748i.longValue()) {
            long intValue = (long) clubInfoActivity.f4021i.f5729P.intValue();
            LeagueClubDBManager leagueClubDBManager = DBManager.m3631a().f5581u;
            long j = clubInfoActivity.f4018f;
            g a = g.a(leagueClubDBManager.f5597a.f6437L);
            a.a(Properties.f6321c.a(Long.valueOf(j)), new i[0]);
            long longValue = Long.valueOf(a.b()).longValue();
            if (intValue > 1) {
                new Builder(clubInfoActivity).setTitle(2131165514).setMessage(2131165343).setPositiveButton(2131165438, new C04638(clubInfoActivity)).show();
                return;
            } else if (longValue > 0) {
                new Builder(clubInfoActivity).setTitle(2131165514).setMessage(2131165344).setPositiveButton(2131165438, new C04649(clubInfoActivity)).show();
                return;
            } else {
                clubInfoActivity.b = new LoadingDialog(clubInfoActivity);
                clubInfoActivity.b.show();
                if (clubInfoActivity.f4020h) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4183o(clubInfoActivity.f4018f);
                    return;
                }
                DBManager.m3631a().f5565e.m3602b(clubInfoActivity.f4018f);
                clubInfoActivity.b.dismiss();
                BaseApplication.f5509b.m3212d();
                Intent intent = new Intent(clubInfoActivity, MainActivity.class);
                intent.setFlags(67108864);
                intent.putExtra("returnTo", -1);
                clubInfoActivity.startActivity(intent);
                clubInfoActivity.overridePendingTransition(2131034127, 2131034127);
                return;
            }
        }
        clubInfoActivity.b = new LoadingDialog(clubInfoActivity);
        clubInfoActivity.b.show();
        if (clubInfoActivity.f4020h) {
            NetworkUtil.m4073a();
            NetworkUtil.m4183o(clubInfoActivity.f4018f);
            return;
        }
        DBManager.m3631a().f5565e.m3602b(clubInfoActivity.f4018f);
        clubInfoActivity.b.dismiss();
        BaseApplication.f5509b.m3212d();
        intent = new Intent(clubInfoActivity, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("returnTo", -1);
        clubInfoActivity.startActivity(intent);
        clubInfoActivity.overridePendingTransition(2131034127, 2131034127);
    }
}
