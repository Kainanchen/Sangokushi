package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.ap;
import com.illuminate.texaspoker.p055a.aq;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.LocationUtil;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoByRoomIDRsp;
import com.texaspoker.moment.TexasPoker.SNGBlindsStructure;
import com.texaspoker.moment.TexasPoker.UserGameInfoNet;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import net.sqlcipher.database.SQLiteDatabase;
import org.cocos2dx.lua.AppActivity;

public class SngDetailActivity extends BaseToolBarActivity {
    private static String f5187d;
    private TextView f5188A;
    private ListView f5189B;
    private aq f5190C;
    private List<UserGameInfoNet> f5191D;
    private ImageView f5192E;
    private ImageView f5193F;
    private TextView f5194G;
    private TextView f5195H;
    private TextView f5196I;
    private Long f5197e;
    private boolean f5198f;
    private Long f5199g;
    private GameRoom f5200h;
    private SimpleDateFormat f5201i;
    private Timer f5202j;
    private long f5203k;
    private SimpleDraweeView f5204l;
    private TextView f5205m;
    private TextView f5206n;
    private TextView f5207o;
    private TextView f5208p;
    private TextView f5209q;
    private ImageButton f5210r;
    private ImageButton f5211s;
    private ImageView f5212t;
    private TextView f5213u;
    private TextView f5214v;
    private TextView f5215w;
    private TextView f5216x;
    private TextView f5217y;
    private TextView f5218z;

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.15 */
    class AnonymousClass15 extends TimerTask {
        final /* synthetic */ Handler f5174a;
        final /* synthetic */ SngDetailActivity f5175b;

        AnonymousClass15(SngDetailActivity sngDetailActivity, Handler handler) {
            this.f5175b = sngDetailActivity;
            this.f5174a = handler;
        }

        public final void run() {
            this.f5175b.f5203k = 1 + this.f5175b.f5203k;
            if (this.f5175b.f5203k % 5 == 0) {
                NetworkUtil.m4073a();
                NetworkUtil.m4177l(this.f5175b.f5197e.longValue());
            }
            if (this.f5175b.f5200h != null) {
                Message message = new Message();
                message.what = 1;
                this.f5174a.sendMessage(message);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.1 */
    class C08431 implements OnClickListener {
        final /* synthetic */ SngDetailActivity f5177a;

        static {
            fixHelper.fixfunc(new int[]{1312, 1313});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08431(SngDetailActivity sngDetailActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.2 */
    class C08442 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5178a;

        static {
            fixHelper.fixfunc(new int[]{897, 898});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08442(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.3 */
    class C08463 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5180a;

        /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.3.1 */
        class C08451 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08463 f5179a;

            C08451(C08463 c08463) {
                this.f5179a = c08463;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f5179a.f5180a.startActivity(new Intent(this.f5179a.f5180a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f5179a.f5180a.startActivity(new Intent(this.f5179a.f5180a, RechargeActivity.class));
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{914, 915});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08463(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.4 */
    class C08474 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5181a;

        static {
            fixHelper.fixfunc(new int[]{960, 961});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08474(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.5 */
    class C08485 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5182a;

        static {
            fixHelper.fixfunc(new int[]{1064, 1065});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08485(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.6 */
    class C08496 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5183a;

        static {
            fixHelper.fixfunc(new int[]{445, 446});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08496(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.7 */
    class C08507 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5184a;

        static {
            fixHelper.fixfunc(new int[]{562, 563});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08507(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.8 */
    class C08518 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5185a;

        static {
            fixHelper.fixfunc(new int[]{650, 651});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08518(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SngDetailActivity.9 */
    class C08529 implements DialogInterface.OnClickListener {
        final /* synthetic */ SngDetailActivity f5186a;

        static {
            fixHelper.fixfunc(new int[]{753, 754});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08529(SngDetailActivity sngDetailActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static {
        f5187d = "SngDetailActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968667);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08431(this));
        Bundle extras = getIntent().getExtras();
        this.f5197e = Long.valueOf(extras.getLong("lGameRoomId"));
        this.f5198f = extras.getBoolean("fromQuickChat", false);
        this.f5199g = Long.valueOf(extras.getLong("lChatRoomId"));
        this.f5201i = new SimpleDateFormat("(HH:mm:ss)", Locale.ENGLISH);
        this.f5201i.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        this.f5204l = (SimpleDraweeView) findViewById(2131558618);
        this.f5205m = (TextView) findViewById(2131558842);
        this.f5206n = (TextView) findViewById(2131558843);
        this.f5207o = (TextView) findViewById(2131558844);
        this.f5208p = (TextView) findViewById(2131558845);
        this.f5209q = (TextView) findViewById(2131558846);
        this.f5210r = (ImageButton) findViewById(2131558573);
        this.f5210r.setOnClickListener(new OnClickListener() {
            final /* synthetic */ SngDetailActivity f5171a;

            {
                this.f5171a = r1;
            }

            public final void onClick(View view) {
                Context context = this.f5171a;
                context.startActivity(new Intent(context, BuyInMsgActivity.class));
            }
        });
        m3430f();
        this.f5211s = (ImageButton) findViewById(2131558865);
        this.f5211s.setOnClickListener(new OnClickListener() {
            final /* synthetic */ SngDetailActivity f5172a;

            {
                this.f5172a = r1;
            }

            public final void onClick(View view) {
                SngDetailActivity.m3423b(this.f5172a);
            }
        });
        this.f5212t = (ImageView) findViewById(2131558866);
        this.f5213u = (TextView) findViewById(2131558867);
        this.f5214v = (TextView) findViewById(2131558868);
        TimerTask anonymousClass15 = new AnonymousClass15(this, new Handler() {
            final /* synthetic */ SngDetailActivity f5173a;

            {
                this.f5173a = r1;
            }

            public final void handleMessage(Message message) {
                switch (message.what) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        this.f5173a.m3428e();
                    default:
                }
            }
        });
        this.f5202j = new Timer();
        this.f5202j.schedule(anonymousClass15, 0, 1000);
    }

    protected void onResume() {
        super.onResume();
        if (!DBManager.m3631a().m3632b()) {
            this.f5200h = DBManager.m3631a().f5572l.m3656a(this.f5197e.longValue(), this.f5199g.longValue());
            if (this.f5200h != null) {
                m3422a();
                if (!DBManager.m3631a().m3632b()) {
                    int intValue;
                    long a;
                    if (!DBManager.m3631a().m3632b()) {
                        intValue = this.f5200h.f5890n.intValue() - 1;
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        a = Utility.m4469a(intValue);
                        this.f5215w.setText(Utility.m4508i(a) + "+" + Utility.m4508i((long) (((double) a) * 0.1d)));
                        this.f5216x.setText(Utility.m4508i(Utility.m4487c(intValue)));
                        a = (long) Utility.m4482b(intValue);
                        this.f5217y.setText(String.format(getResources().getString(2131165682), new Object[]{Long.valueOf(a / 60)}));
                    }
                    if (!DBManager.m3631a().m3632b()) {
                        intValue = this.f5200h.f5890n.intValue() - 1;
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        a = Utility.m4469a(intValue) * ((long) this.f5200h.f5891o.intValue());
                        CharSequence g = Utility.m4502g(a);
                        this.f5218z.setText(g);
                        switch (this.f5200h.f5891o.intValue()) {
                            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                this.f5192E.setVisibility(4);
                                this.f5193F.setVisibility(4);
                                this.f5195H.setVisibility(4);
                                this.f5196I.setVisibility(4);
                                this.f5194G.setText(g);
                                intValue = 1;
                                break;
                            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                intValue = 2;
                                this.f5192E.setVisibility(0);
                                this.f5193F.setVisibility(4);
                                this.f5195H.setVisibility(0);
                                this.f5196I.setVisibility(4);
                                this.f5194G.setText(Utility.m4502g((long) (((double) a) * 0.6d)));
                                this.f5195H.setText(Utility.m4502g((long) (((double) a) * 0.4d)));
                                break;
                            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                                intValue = 3;
                                this.f5192E.setVisibility(0);
                                this.f5193F.setVisibility(0);
                                this.f5195H.setVisibility(0);
                                this.f5196I.setVisibility(0);
                                this.f5194G.setText(Utility.m4502g((long) (((double) a) * 0.5d)));
                                this.f5195H.setText(Utility.m4502g((long) (((double) a) * 0.4d)));
                                this.f5196I.setText(Utility.m4502g((long) (((double) a) * 0.2d)));
                                break;
                            default:
                                this.f5192E.setVisibility(4);
                                this.f5193F.setVisibility(4);
                                this.f5195H.setVisibility(4);
                                this.f5196I.setVisibility(4);
                                this.f5194G.setText(g);
                                intValue = 1;
                                break;
                        }
                        this.f5188A.setText(String.valueOf(intValue));
                    }
                }
                m3428e();
                m3426d();
                NetworkUtil.m4073a();
                NetworkUtil.m4174k();
                NetworkUtil.m4073a();
                NetworkUtil.m4177l(this.f5197e.longValue());
                return;
            }
            finish();
        }
    }

    protected void onStop() {
        super.onStop();
        if (this.f5202j != null) {
            this.f5202j.cancel();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 3) {
            return;
        }
        if (iArr[0] == 0) {
            LocationUtil.m4237a().f6664a.stopLocation();
            LocationUtil.m4237a().f6664a.startLocation();
            return;
        }
        new Builder(this).setTitle(2131165473).setMessage(2131165458).setPositiveButton(2131165472, new DialogInterface.OnClickListener() {
            final /* synthetic */ SngDetailActivity f5169a;

            {
                this.f5169a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
                intent.setData(Uri.parse("package:" + this.f5169a.getPackageName()));
                this.f5169a.startActivity(intent);
            }
        }).setNegativeButton(2131165432, new C08529(this)).show();
    }

    private void m3422a() {
        if (!DBManager.m3631a().m3632b()) {
            int intValue;
            FriendUser a = this.f5200h.m3736a();
            if (a.f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) this.f5204l.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f5204l.getHierarchy()).m1407a(2130903193);
            }
            this.f5204l.setImageURI(Uri.parse(a.f5836o));
            this.f5205m.setText(this.f5200h.f5864D);
            CharSequence charSequence = this.f5200h.f5861A;
            if (charSequence == null) {
                charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            if (StringUtils.m4462a(charSequence)) {
                this.f5206n.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                this.f5207o.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                CharSequence format;
                intValue = this.f5200h.f5886j.intValue();
                if (intValue == 1) {
                    format = String.format(getResources().getString(2131165456), new Object[]{charSequence});
                    charSequence = String.format(getResources().getString(2131165482), new Object[]{getResources().getString(2131165872)});
                } else if (intValue == 2) {
                    format = String.format(getResources().getString(2131165456), new Object[]{charSequence});
                    charSequence = String.format(getResources().getString(2131165482), new Object[]{getResources().getString(2131165871)});
                } else {
                    format = String.format(getResources().getString(2131165456), new Object[]{charSequence});
                    charSequence = String.format(getResources().getString(2131165482), new Object[]{getResources().getString(2131165873)});
                }
                this.f5206n.setText(format);
                this.f5207o.setText(charSequence);
            }
            this.f5208p.setText(this.f5200h.f5892p + "/" + this.f5200h.f5891o);
            intValue = this.f5200h.f5890n.intValue();
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            if (intValue == 1) {
                str = getResources().getString(2131165698);
            } else if (intValue == 2) {
                str = getResources().getString(2131165695);
            } else if (intValue == 3) {
                str = getResources().getString(2131165691);
            } else if (intValue == 4) {
                str = getResources().getString(2131165684);
            }
            charSequence = "SNG " + str;
            if (this.f5200h.f5883g.booleanValue()) {
                charSequence = charSequence + " " + String.format(getResources().getString(2131165426), new Object[]{getResources().getString(2131165910)});
            }
            this.f5209q.setText(charSequence);
        }
    }

    private void m3426d() {
        if (!DBManager.m3631a().m3632b()) {
            if (DBManager.m3631a().f5579s.m3559a() <= 0) {
                this.f5210r.setVisibility(8);
                LayoutParams layoutParams = (LayoutParams) this.f5210r.getLayoutParams();
                layoutParams.rightMargin = (int) (-getResources().getDimension(2131230827));
                this.f5210r.setLayoutParams(layoutParams);
            } else if (((LayoutParams) this.f5210r.getLayoutParams()).rightMargin != 0) {
                this.f5210r.setVisibility(0);
                Animation translateAnimation = new TranslateAnimation(0.0f, -getResources().getDimension(2131230827), 0.0f, 0.0f);
                translateAnimation.setDuration(500);
                translateAnimation.setAnimationListener(new AnimationListener() {
                    final /* synthetic */ SngDetailActivity f5170a;

                    {
                        this.f5170a = r1;
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        LayoutParams layoutParams = (LayoutParams) this.f5170a.f5210r.getLayoutParams();
                        layoutParams.rightMargin = 0;
                        this.f5170a.f5210r.setLayoutParams(layoutParams);
                        this.f5170a.f5210r.setAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f));
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }
                });
                this.f5210r.startAnimation(translateAnimation);
            }
        }
    }

    private void m3428e() {
        long j = 0;
        if (!DBManager.m3631a().m3632b()) {
            if (this.f5200h.f5880d.booleanValue()) {
                if (this.f5200h.f5881e.booleanValue()) {
                    this.f5213u.setText(2131165272);
                    this.f5214v.setVisibility(8);
                    this.f5212t.setVisibility(8);
                    this.f5211s.setEnabled(true);
                    return;
                }
                this.f5213u.setText(2131165277);
                this.f5214v.setVisibility(8);
                this.f5212t.setVisibility(8);
                this.f5211s.setEnabled(true);
            } else if (this.f5200h.f5882f.booleanValue()) {
                this.f5213u.setText(2131165278);
                this.f5214v.setVisibility(8);
                this.f5212t.setVisibility(8);
                this.f5211s.setEnabled(false);
            } else if (this.f5200h.f5881e.booleanValue()) {
                this.f5213u.setText(2131165272);
                this.f5214v.setVisibility(8);
                this.f5212t.setVisibility(8);
                this.f5211s.setEnabled(true);
            } else {
                this.f5213u.setText(2131165276);
                this.f5214v.setVisibility(0);
                this.f5212t.setVisibility(0);
                this.f5211s.setEnabled(true);
                long longValue = (this.f5200h.f5893q.longValue() + ((long) (this.f5200h.f5901y.intValue() * PointerIconCompat.TYPE_DEFAULT))) - (System.currentTimeMillis() + RuntimeData.f6671b);
                if (longValue >= 0) {
                    j = longValue;
                }
                this.f5214v.setText(this.f5201i.format(Long.valueOf(j)));
            }
        }
    }

    private void m3430f() {
        int i;
        Object obj;
        TabHost tabHost = (TabHost) findViewById(16908306);
        tabHost.setup();
        tabHost.getTabWidget().setDividerDrawable(null);
        tabHost.addTab(tabHost.newTabSpec("ruleIndicator").setIndicator(m3420a(2131165912)).setContent(2131558848));
        tabHost.addTab(tabHost.newTabSpec("playerIndicator").setIndicator(m3420a(2131165913)).setContent(2131558852));
        tabHost.addTab(tabHost.newTabSpec("bonusIndicator").setIndicator(m3420a(2131165914)).setContent(2131558854));
        tabHost.addTab(tabHost.newTabSpec("blindIndicator").setIndicator(m3420a(2131165915)).setContent(2131558863));
        this.f5215w = (TextView) findViewById(2131558849);
        this.f5216x = (TextView) findViewById(2131558850);
        this.f5217y = (TextView) findViewById(2131558851);
        this.f5191D = new ArrayList();
        this.f5189B = (ListView) findViewById(2131558853);
        this.f5190C = new aq(this, this.f5191D);
        this.f5189B.setAdapter(this.f5190C);
        this.f5218z = (TextView) findViewById(2131558855);
        this.f5188A = (TextView) findViewById(2131558856);
        findViewById(2131558857);
        this.f5192E = (ImageView) findViewById(2131558858);
        this.f5193F = (ImageView) findViewById(2131558859);
        this.f5194G = (TextView) findViewById(2131558860);
        this.f5195H = (TextView) findViewById(2131558861);
        this.f5196I = (TextView) findViewById(2131558862);
        int size = RuntimeData.f6681l.size();
        if (size % 2 == 0) {
            i = size / 2;
        } else {
            i = (size / 2) + 1;
        }
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            SNGBlindsStructure sNGBlindsStructure = (SNGBlindsStructure) RuntimeData.f6681l.get(i2);
            if (i2 < i) {
                obj = new SNGBlindsStructure[2];
                obj[0] = sNGBlindsStructure;
                arrayList.add(obj);
            } else {
                ((SNGBlindsStructure[]) arrayList.get(i2 - i))[1] = sNGBlindsStructure;
            }
        }
        ListView listView = (ListView) findViewById(2131558864);
        obj = new ap(this, arrayList);
        listView.setAdapter(obj);
        obj.notifyDataSetChanged();
    }

    private View m3420a(int i) {
        View inflate = LayoutInflater.from(this).inflate(2130968825, null);
        ((TextView) inflate.findViewById(2131559005)).setText(i);
        return inflate;
    }

    protected final void m3432a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GetGameRoomInfoByRoomID_Success")) {
            SCGetGameRoomInfoByRoomIDRsp sCGetGameRoomInfoByRoomIDRsp = (SCGetGameRoomInfoByRoomIDRsp) list.get(0);
            if (sCGetGameRoomInfoByRoomIDRsp.getStGameRoomInfo().getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                this.f5200h = DBManager.m3631a().f5572l.m3656a(sCGetGameRoomInfoByRoomIDRsp.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId(), sCGetGameRoomInfoByRoomIDRsp.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLFromRoomID());
                GameRoomInfo stGameRoomInfo = sCGetGameRoomInfoByRoomIDRsp.getStGameRoomInfo();
                if (!DBManager.m3631a().m3632b()) {
                    this.f5191D.clear();
                    for (UserGameInfoNet userGameInfoNet : stGameRoomInfo.getVUserGameInfosList()) {
                        if (userGameInfoNet.getStUserInfo().getUuid() > 0) {
                            this.f5191D.add(userGameInfoNet);
                        }
                    }
                    this.f5190C.notifyDataSetChanged();
                }
            }
            m3422a();
        } else if (str.equalsIgnoreCase("NOTIFY_GetGameRoomInfoByRoomID_Failed")) {
            r0 = ((Integer) list.get(0)).intValue();
            if (this.f5202j != null) {
                this.f5202j.cancel();
            }
            new Builder(this).setTitle(2131165514).setMessage(r0).setCancelable(false).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ SngDetailActivity f5176a;

                {
                    this.f5176a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f5176a.finish();
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            r1 = DBManager.m3631a().f5572l.m3656a(r2, ((Long) list.get(2)).longValue());
            if (StringUtils.m4462a(r1.f5863C)) {
                RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                RuntimeData.f6672c = r1.f5863C;
            }
            RuntimeData.f6674e = r2;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_SIGN_UP_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.g);
            startActivity(r1);
            overridePendingTransition(0, 0);
            if (this.b != null) {
                this.b.dismiss();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_INVITE_WAITTING")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4177l(this.f5197e.longValue());
            this.b.dismiss();
            m2732a(2130903589, 2131165306, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM__FAULT")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4177l(this.f5197e.longValue());
            int intValue = ((Integer) list.get(0)).intValue();
            ERROR_CODE_TYPE error_code_type = (ERROR_CODE_TYPE) list.get(1);
            this.b.dismiss();
            if (error_code_type == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_ENOUGH_COIN) {
                new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165427, new C08463(this)).setNegativeButton(2131165432, new C08442(this)).show();
            } else if (error_code_type == ERROR_CODE_TYPE.ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY) {
                new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165428, new C08485(this)).setNegativeButton(2131165432, new C08474(this)).show();
            } else if (error_code_type == ERROR_CODE_TYPE.ERROR_CODE_TYPE_CLUB_NO_USER) {
                new Builder(this).setTitle(2131165514).setMessage(2131165402).setPositiveButton(2131165438, new C08496(this)).show();
            } else if (error_code_type == ERROR_CODE_TYPE.ERROR_CODE_TYPE_GPS_CHECK_ERROR || error_code_type == ERROR_CODE_TYPE.ERROR_CODE_TYPE_IP_CHECK_ERROR) {
                new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C08507(this)).show();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            r1 = DBManager.m3631a().f5572l.m3656a(r2, ((Long) list.get(2)).longValue());
            if (StringUtils.m4462a(r1.f5863C)) {
                RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                RuntimeData.f6672c = r1.f5863C;
            }
            RuntimeData.f6674e = r2;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.g);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C08518(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS")) {
            m3426d();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinControlMsg")) {
            m3426d();
        } else if (str.equalsIgnoreCase("NOTIFY_TO_REFRESH_VIEW_AFTER_DENNY")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4177l(this.f5197e.longValue());
        }
    }

    static /* synthetic */ void m3423b(SngDetailActivity sngDetailActivity) {
        if (sngDetailActivity.f5200h.f5880d.booleanValue()) {
            sngDetailActivity.b = new LoadingDialog(sngDetailActivity);
            sngDetailActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(sngDetailActivity.f5197e.longValue());
        } else if (!sngDetailActivity.f5200h.f5882f.booleanValue()) {
            if (sngDetailActivity.f5200h.f5881e.booleanValue()) {
                sngDetailActivity.b = new LoadingDialog(sngDetailActivity);
                sngDetailActivity.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4171i(sngDetailActivity.f5197e.longValue());
            } else if (sngDetailActivity.f5200h.f5868H == null || !sngDetailActivity.f5200h.f5868H.booleanValue()) {
                sngDetailActivity.b = new LoadingDialog(sngDetailActivity);
                sngDetailActivity.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4173j(sngDetailActivity.f5197e.longValue());
            } else if (ContextCompat.checkSelfPermission(sngDetailActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.requestPermissions(sngDetailActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 3);
            } else {
                sngDetailActivity.b = new LoadingDialog(sngDetailActivity);
                sngDetailActivity.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4173j(sngDetailActivity.f5197e.longValue());
            }
        }
    }
}
