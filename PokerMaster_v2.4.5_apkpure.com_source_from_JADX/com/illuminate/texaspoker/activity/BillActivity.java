package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.at;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.UserBill;
import com.illuminate.texaspoker.p059d.ClubIncome;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BillActivity extends BaseToolBarActivity {
    private static String f3584d;
    private String f3585A;
    private String f3586B;
    private long f3587C;
    private long f3588D;
    private long f3589E;
    private long f3590F;
    private long f3591G;
    private long f3592H;
    private ListView f3593I;
    private at f3594J;
    private View f3595K;
    private ImageView f3596L;
    private View f3597M;
    private Button f3598N;
    private TextView f3599O;
    private TextView f3600P;
    private SimpleDraweeView f3601Q;
    private FriendUser f3602R;
    private FriendUser f3603S;
    private FriendUser f3604T;
    private TextView f3605U;
    private TextView f3606V;
    private TextView f3607W;
    private SimpleDraweeView f3608X;
    private SimpleDraweeView f3609Y;
    private SimpleDraweeView f3610Z;
    private BillInfoNet f3611e;
    private boolean f3612f;
    private long f3613g;
    private List<Object> f3614h;
    private Map<Long, ClubIncome> f3615i;
    private int f3616j;
    private long f3617k;
    private String f3618l;
    private boolean f3619m;
    private long f3620n;
    private String f3621o;
    private int f3622p;
    private long f3623q;
    private String f3624r;
    private String f3625s;
    private int f3626t;
    private int f3627u;
    private long f3628v;
    private long f3629w;
    private long f3630x;
    private int f3631y;
    private String f3632z;

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.12 */
    class AnonymousClass12 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3561a;
        final /* synthetic */ BillActivity f3562b;

        AnonymousClass12(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3562b = billActivity;
            this.f3561a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3562b.f3595K, this.f3562b.f3597M, this.f3562b.f3614h, this.f3562b.f3592H, this.f3562b.f3622p, 0, this.f3562b.f3616j);
            this.f3561a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.13 */
    class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3563a;
        final /* synthetic */ BillActivity f3564b;

        AnonymousClass13(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3564b = billActivity;
            this.f3563a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3564b.f3595K, this.f3564b.f3597M, this.f3564b.f3614h, this.f3564b.f3592H, this.f3564b.f3622p, 1, this.f3564b.f3616j);
            this.f3563a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.14 */
    class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3565a;
        final /* synthetic */ BillActivity f3566b;

        AnonymousClass14(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3566b = billActivity;
            this.f3565a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3566b.f3595K, this.f3566b.f3597M, this.f3566b.f3614h, this.f3566b.f3592H, this.f3566b.f3622p, -2, this.f3566b.f3616j);
            this.f3565a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.15 */
    class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3567a;
        final /* synthetic */ BillActivity f3568b;

        AnonymousClass15(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3568b = billActivity;
            this.f3567a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3568b.f3595K, this.f3568b.f3597M, this.f3568b.f3614h, this.f3568b.f3592H, this.f3568b.f3622p, -1, this.f3568b.f3616j);
            this.f3567a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.16 */
    class AnonymousClass16 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3569a;
        final /* synthetic */ BillActivity f3570b;

        AnonymousClass16(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3570b = billActivity;
            this.f3569a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3570b.f3595K, this.f3570b.f3597M, this.f3570b.f3614h, this.f3570b.f3592H, this.f3570b.f3622p, -3, this.f3570b.f3616j);
            this.f3569a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.17 */
    class AnonymousClass17 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f3571a;
        final /* synthetic */ BillActivity f3572b;

        AnonymousClass17(BillActivity billActivity, ShareSocialDialog shareSocialDialog) {
            this.f3572b = billActivity;
            this.f3571a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4256a(this.f3572b.f3595K, this.f3572b.f3597M, this.f3572b.f3614h, this.f3572b.f3592H, this.f3572b.f3622p, -4, this.f3572b.f3616j);
            this.f3571a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.1 */
    class C03541 implements OnClickListener {
        final /* synthetic */ BillActivity f3575a;

        C03541(BillActivity billActivity) {
            this.f3575a = billActivity;
        }

        public final void onClick(View view) {
            this.f3575a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.2 */
    class C03552 implements Comparator<Object> {
        final /* synthetic */ BillActivity f3576a;

        C03552(BillActivity billActivity) {
            this.f3576a = billActivity;
        }

        public final int compare(Object obj, Object obj2) {
            UserBillInfoNet userBillInfoNet = (UserBillInfoNet) obj;
            UserBillInfoNet userBillInfoNet2 = (UserBillInfoNet) obj2;
            if (userBillInfoNet.getLRemainBuyStacks() - userBillInfoNet.getLTotalBuyStacks() > userBillInfoNet2.getLRemainBuyStacks() - userBillInfoNet2.getLTotalBuyStacks()) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.3 */
    class C03563 implements Comparator<ClubIncome> {
        final /* synthetic */ BillActivity f3577a;

        C03563(BillActivity billActivity) {
            this.f3577a = billActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            if (((ClubIncome) obj).f6030c.longValue() > ((ClubIncome) obj2).f6030c.longValue()) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.4 */
    class C03574 implements OnItemClickListener {
        final /* synthetic */ BillActivity f3578a;

        C03574(BillActivity billActivity) {
            this.f3578a = billActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (!(this.f3578a.f3614h.get(i - 1) instanceof Long)) {
                return;
            }
            if (this.f3578a.f3611e == null) {
                Intent intent = new Intent(this.f3578a, InsuranceDetailActivity.class);
                intent.putExtra("billId", this.f3578a.f3613g);
                this.f3578a.startActivityForResult(intent, 0);
                return;
            }
            intent = new Intent(this.f3578a, InsuranceDetailActivity.class);
            intent.putExtra("billInfoNet", this.f3578a.f3611e);
            this.f3578a.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.5 */
    class C03585 implements OnClickListener {
        final /* synthetic */ BillActivity f3579a;

        C03585(BillActivity billActivity) {
            this.f3579a = billActivity;
        }

        public final void onClick(View view) {
            BillActivity.m2759i(this.f3579a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.6 */
    class C03596 implements OnClickListener {
        final /* synthetic */ BillActivity f3580a;

        C03596(BillActivity billActivity) {
            this.f3580a = billActivity;
        }

        public final void onClick(View view) {
            BillActivity.m2760j(this.f3580a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.7 */
    class C03607 implements OnClickListener {
        final /* synthetic */ BillActivity f3581a;

        C03607(BillActivity billActivity) {
            this.f3581a = billActivity;
        }

        public final void onClick(View view) {
            BillActivity.m2750a(this.f3581a, this.f3581a.f3604T);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.8 */
    class C03618 implements OnClickListener {
        final /* synthetic */ BillActivity f3582a;

        C03618(BillActivity billActivity) {
            this.f3582a = billActivity;
        }

        public final void onClick(View view) {
            BillActivity.m2750a(this.f3582a, this.f3582a.f3602R);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillActivity.9 */
    class C03629 implements OnClickListener {
        final /* synthetic */ BillActivity f3583a;

        C03629(BillActivity billActivity) {
            this.f3583a = billActivity;
        }

        public final void onClick(View view) {
            BillActivity.m2750a(this.f3583a, this.f3583a.f3603S);
        }
    }

    public BillActivity() {
        this.f3616j = 0;
        this.f3631y = 0;
        this.f3589E = -1;
        this.f3590F = -1;
        this.f3591G = -1;
        this.f3592H = 0;
    }

    static {
        f3584d = "BillActivity";
    }

    protected void onCreate(Bundle bundle) {
        CharSequence format;
        super.onCreate(bundle);
        setContentView(2130968606);
        this.f3614h = new ArrayList();
        m2754d();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C03541(this));
        setTitle(this.f3621o);
        this.f3593I = (ListView) findViewById(2131558523);
        this.f3594J = new at(this, this.f3614h, this.f3622p);
        this.f3593I.setAdapter(this.f3594J);
        this.f3593I.setOnItemClickListener(new C03574(this));
        this.f3595K = View.inflate(this, 2130968728, null);
        this.f3596L = (ImageView) this.f3595K.findViewById(2131559020);
        if (this.f3622p == 5 || this.f3622p == 6) {
            this.f3596L.setImageResource(2130903550);
        } else {
            this.f3596L.setImageResource(2130903549);
        }
        this.f3593I.addHeaderView(this.f3595K, null, false);
        this.f3597M = this.f3595K.findViewById(2131558744);
        View findViewById = this.f3595K.findViewById(2131559021);
        if (this.f3622p == 4 || this.f3622p == 5 || this.f3622p == 6) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
        if (this.f3612f) {
            this.f3597M.setVisibility(8);
        } else {
            this.f3597M.setVisibility(0);
        }
        ((Button) this.f3595K.findViewById(2131559019)).setOnClickListener(new C03585(this));
        this.f3598N = (Button) this.f3595K.findViewById(2131559022);
        this.f3598N.setOnClickListener(new C03596(this));
        this.f3599O = (TextView) this.f3595K.findViewById(2131559023);
        this.f3600P = (TextView) this.f3595K.findViewById(2131558929);
        this.f3601Q = (SimpleDraweeView) this.f3595K.findViewById(2131559026);
        ((TextView) this.f3595K.findViewById(2131559027)).setText(new SimpleDateFormat(getString(2131165232)).format(new Date(this.f3628v)));
        TextView textView = (TextView) this.f3595K.findViewById(2131558846);
        if (this.f3622p == 4) {
            format = String.format(getResources().getString(2131165861), new Object[]{Integer.valueOf(this.f3627u)});
        } else if (this.f3622p == 5 || this.f3622p == 6) {
            format = String.format(getResources().getString(2131165860), new Object[]{Integer.valueOf(this.f3627u)});
        } else {
            format = String.format(getResources().getString(2131165859), new Object[]{Integer.valueOf(this.f3627u)});
        }
        if (this.f3622p == 3 || this.f3622p == 6) {
            Drawable drawable = getResources().getDrawable(2130903383);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setCompoundDrawablePadding(10);
        } else {
            textView.setCompoundDrawables(null, null, null, null);
        }
        textView.setText(format);
        ((TextView) this.f3595K.findViewById(2131558842)).setText(this.f3621o);
        textView = (TextView) this.f3595K.findViewById(2131559030);
        format = Utility.m4508i(this.f3629w) + "/" + Utility.m4508i(this.f3630x);
        if (this.f3631y != 0) {
            format = format + "(" + Utility.m4508i((long) this.f3631y) + ")";
        }
        textView.setText(format);
        ((TextView) this.f3595K.findViewById(2131558843)).setText(this.f3632z);
        ((TextView) this.f3595K.findViewById(2131558844)).setText(this.f3585A);
        ((TextView) this.f3595K.findViewById(2131559029)).setText(this.f3586B);
        ((TextView) this.f3595K.findViewById(2131558527)).setText(this.f3587C);
        ((TextView) this.f3595K.findViewById(2131558998)).setText(Utility.m4502g(this.f3588D));
        this.f3605U = (TextView) this.f3595K.findViewById(2131559031);
        this.f3606V = (TextView) this.f3595K.findViewById(2131559034);
        this.f3607W = (TextView) this.f3595K.findViewById(2131559037);
        this.f3608X = (SimpleDraweeView) this.f3595K.findViewById(2131559032);
        ((Button) this.f3595K.findViewById(2131559033)).setOnClickListener(new C03607(this));
        this.f3609Y = (SimpleDraweeView) this.f3595K.findViewById(2131559035);
        ((Button) this.f3595K.findViewById(2131559036)).setOnClickListener(new C03618(this));
        this.f3610Z = (SimpleDraweeView) this.f3595K.findViewById(2131559038);
        ((Button) this.f3595K.findViewById(2131559039)).setOnClickListener(new C03629(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f3612f) {
            getMenuInflater().inflate(2131689473, menu);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559424) {
            return super.onOptionsItemSelected(menuItem);
        }
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(this);
        shareSocialDialog.f7078a = new AnonymousClass12(this, shareSocialDialog);
        shareSocialDialog.f7079b = new AnonymousClass13(this, shareSocialDialog);
        shareSocialDialog.f7080c = new AnonymousClass14(this, shareSocialDialog);
        shareSocialDialog.f7081d = new AnonymousClass15(this, shareSocialDialog);
        shareSocialDialog.f7082e = new AnonymousClass16(this, shareSocialDialog);
        shareSocialDialog.f7083f = new AnonymousClass17(this, shareSocialDialog);
        shareSocialDialog.show();
        return true;
    }

    public void finish() {
        if (!this.f3612f) {
            setResult(0, null);
        }
        super.finish();
    }

    protected void onResume() {
        super.onResume();
        m2749a();
    }

    private void m2749a() {
        if (!DBManager.m3631a().m3632b()) {
            String str;
            String str2;
            CharSequence charSequence;
            int i;
            Object obj;
            if (SharedPreferencesManager.m4396n() != 1) {
                this.f3600P.setText(">");
                this.f3599O.setTextColor(-73826);
            } else {
                this.f3600P.setText(2131165905);
                this.f3599O.setTextColor(-9477266);
            }
            if (this.f3626t == 1) {
                ((GenericDraweeHierarchy) this.f3601Q.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3601Q.getHierarchy()).m1407a(2130903193);
            }
            this.f3601Q.setImageURI(Uri.parse(this.f3624r));
            this.f3602R = DBManager.m3631a().f5563c.m3639a(this.f3591G);
            if (this.f3602R == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3591G != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3591G, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3602R.f5838q;
                str = this.f3602R.f5836o;
                i = this.f3602R.f5832k.intValue();
            }
            this.f3606V.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3609Y.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3609Y.getHierarchy()).m1407a(2130903193);
            }
            this.f3609Y.setImageURI(Uri.parse(str));
            this.f3603S = DBManager.m3631a().f5563c.m3639a(this.f3590F);
            if (this.f3603S == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3590F != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3590F, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3603S.f5838q;
                str = this.f3603S.f5836o;
                i = this.f3603S.f5832k.intValue();
            }
            this.f3607W.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3610Z.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3610Z.getHierarchy()).m1407a(2130903193);
            }
            this.f3610Z.setImageURI(Uri.parse(str));
            this.f3604T = DBManager.m3631a().f5563c.m3639a(this.f3589E);
            if (this.f3604T == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3589E != -1) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(this.f3589E, true);
                    charSequence = str;
                    str = str2;
                    i = 1;
                } else {
                    obj = str;
                    str = str2;
                    i = 1;
                }
            } else {
                charSequence = this.f3604T.f5838q;
                str = this.f3604T.f5836o;
                i = this.f3604T.f5832k.intValue();
            }
            this.f3605U.setText(charSequence);
            if (i == 1) {
                ((GenericDraweeHierarchy) this.f3608X.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3608X.getHierarchy()).m1407a(2130903193);
            }
            this.f3608X.setImageURI(Uri.parse(str));
            if (this.f3619m) {
                this.f3594J.f2996b = true;
            }
            this.f3594J.f2995a = this.f3616j;
            this.f3594J.notifyDataSetChanged();
        }
    }

    private void m2754d() {
        Bundle extras = getIntent().getExtras();
        this.f3611e = (BillInfoNet) extras.getSerializable("billInfoNet");
        this.f3615i = new HashMap();
        long longValue;
        long longValue2;
        long longValue3;
        ClubIncome clubIncome;
        Collection arrayList;
        if (this.f3611e == null) {
            this.f3613g = extras.getLong("billId");
            this.f3612f = extras.getBoolean("fromShare");
            Bill a = DBManager.m3631a().f5570j.m3554a(this.f3613g, this.f3612f);
            if (a.f5634R == null) {
                this.f3617k = 0;
            } else {
                this.f3617k = a.f5634R.longValue();
            }
            this.f3618l = a.f5635S;
            if (a.f5635S == null) {
                this.f3618l = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                this.f3618l = a.f5635S;
            }
            if (a.f5633Q.booleanValue()) {
                this.f3619m = a.f5633Q.booleanValue();
            } else {
                this.f3619m = false;
            }
            if (!this.f3612f && a.f5631O.longValue() == SharedPreferencesManager.m4308b()) {
                this.f3619m = true;
            }
            if (this.f3617k > 0) {
                this.f3625s = a.f5637U;
                if (StringUtils.m4462a(this.f3625s)) {
                    this.f3625s = a.m3715i().f5838q;
                }
                this.f3624r = a.f5636T;
                if (StringUtils.m4462a(this.f3624r)) {
                    this.f3624r = a.m3715i().f5836o;
                }
            } else {
                this.f3625s = a.m3715i().f5838q;
                this.f3623q = a.m3715i().f5842u.longValue();
                this.f3624r = a.m3715i().f5836o;
            }
            this.f3626t = a.m3715i().f5832k.intValue();
            this.f3622p = a.f5644c.intValue();
            Object<UserBill> a2 = DBManager.m3631a().f5571k.m3705a(this.f3613g, this.f3612f);
            Collections.sort(a2, new Comparator<UserBill>() {
                final /* synthetic */ BillActivity f3573a;

                {
                    this.f3573a = r1;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    UserBill userBill = (UserBill) obj;
                    UserBill userBill2 = (UserBill) obj2;
                    if (userBill.f6006c.longValue() - userBill.f6007d.longValue() > userBill2.f6006c.longValue() - userBill2.f6007d.longValue()) {
                        return -1;
                    }
                    return 1;
                }
            });
            this.f3614h.clear();
            if (this.f3622p == 3 || this.f3622p == 6) {
                this.f3592H = a.f5625I.longValue();
                this.f3614h.add(a.f5625I);
            }
            this.f3614h.addAll(a2);
            UserBill userBill = null;
            UserBill userBill2 = null;
            UserBill userBill3 = null;
            for (UserBill userBill4 : a2) {
                longValue = userBill4.f6006c.longValue() - userBill4.f6007d.longValue();
                if (longValue > 0) {
                    this.f3620n += longValue;
                }
                if (userBill3 == null) {
                    userBill3 = userBill4;
                } else {
                    longValue2 = userBill3.f6006c.longValue() - userBill3.f6007d.longValue();
                    if (longValue2 < longValue) {
                        userBill3 = userBill4;
                    } else if (longValue2 == longValue && userBill3.f6009f.longValue() > userBill4.f6009f.longValue()) {
                        userBill3 = userBill4;
                    }
                }
                if (userBill2 == null) {
                    userBill2 = userBill4;
                } else {
                    longValue2 = userBill2.f6006c.longValue() - userBill2.f6007d.longValue();
                    if (longValue2 > longValue) {
                        userBill2 = userBill4;
                    } else if (longValue2 == longValue && userBill2.f6009f.longValue() > userBill4.f6009f.longValue()) {
                        userBill2 = userBill4;
                    }
                }
                if (userBill == null) {
                    userBill = userBill4;
                } else {
                    longValue2 = userBill.f6007d.longValue();
                    longValue3 = userBill4.f6007d.longValue();
                    if (longValue3 > longValue2) {
                        userBill = userBill4;
                    } else if (longValue3 == longValue2 && userBill.f6009f.longValue() > userBill4.f6009f.longValue()) {
                        userBill = userBill4;
                    }
                }
                clubIncome = (ClubIncome) this.f3615i.get(userBill4.f6014k);
                if (clubIncome == null) {
                    clubIncome = new ClubIncome();
                    clubIncome.f6030c = Long.valueOf(longValue);
                    clubIncome.f6028a = userBill4.f6014k;
                    clubIncome.f6029b = userBill4.f6015l;
                    this.f3615i.put(userBill4.f6014k, clubIncome);
                } else {
                    clubIncome.f6030c = Long.valueOf(longValue + clubIncome.f6030c.longValue());
                }
            }
            if (a.f5634R != null && a.f5634R.longValue() > 0 && a.f5633Q != null && a.f5633Q.booleanValue()) {
                arrayList = new ArrayList();
                for (Entry value : this.f3615i.entrySet()) {
                    arrayList.add(value.getValue());
                }
                Collections.sort(arrayList, new Comparator<ClubIncome>() {
                    final /* synthetic */ BillActivity f3574a;

                    {
                        this.f3574a = r1;
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        if (((ClubIncome) obj).f6030c.longValue() > ((ClubIncome) obj2).f6030c.longValue()) {
                            return -1;
                        }
                        return 1;
                    }
                });
                this.f3614h.addAll(0, arrayList);
                this.f3616j = this.f3615i.size();
            }
            this.f3621o = a.f5629M;
            if (a.f5654m == null || a.f5654m.intValue() == 0 || a.f5654m.intValue() == -1) {
                this.f3627u = 9;
            } else {
                this.f3627u = a.f5654m.intValue();
            }
            this.f3628v = a.f5626J.longValue();
            this.f3629w = a.f5662u.longValue();
            this.f3630x = a.f5663v.longValue();
            if (a.f5656o != null) {
                this.f3631y = a.f5656o.intValue();
            } else {
                this.f3631y = 0;
            }
            if (a.f5645d.intValue() == 1) {
                this.f3632z = this.f3625s + " \u2022 ";
                this.f3585A = a.f5630N;
            } else if (a.f5645d.intValue() != 2) {
                this.f3632z = a.m3715i().f5838q + " \u2022 ";
                this.f3585A = getResources().getString(2131165567);
            } else if (StringUtils.m4462a(a.f5630N)) {
                this.f3632z = this.f3625s;
                this.f3585A = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                this.f3632z = this.f3625s + " \u2022 ";
                this.f3585A = a.f5630N;
            }
            this.f3586B = Utility.m4471a(a.f5627K.longValue());
            this.f3587C = a.f5660s.longValue();
            this.f3588D = a.f5661t.longValue();
            if (userBill2 != null) {
                this.f3589E = userBill2.f6009f.longValue();
            }
            if (userBill != null) {
                this.f3590F = userBill.f6009f.longValue();
            }
            if (userBill3 != null) {
                this.f3591G = userBill3.f6009f.longValue();
                return;
            }
            return;
        }
        this.f3612f = false;
        List<UserBillInfoNet> vUserBillInfosList = this.f3611e.getStNormalBillInfoNet().getVUserBillInfosList();
        this.f3622p = this.f3611e.getEGameRoomType().getNumber();
        this.f3617k = this.f3611e.getStNormalBillInfoNet().getLLeagueID();
        this.f3618l = this.f3611e.getStNormalBillInfoNet().getSLeagueName();
        if (this.f3611e.getBClubManager() == 1) {
            this.f3619m = true;
        } else {
            this.f3619m = false;
            if (!this.f3612f && this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid() == SharedPreferencesManager.m4308b()) {
                this.f3619m = true;
            }
        }
        this.f3614h.clear();
        Long valueOf = Long.valueOf(0);
        Long l = valueOf;
        for (UserBillInfoNet userBillInfoNet : vUserBillInfosList) {
            if (userBillInfoNet.getUuid() == 1000) {
                valueOf = Long.valueOf(userBillInfoNet.getLInsuranceGetStacks());
                this.f3592H = valueOf.longValue();
                l = valueOf;
            } else if (userBillInfoNet.getLTotalBuyStacks() != 0) {
                this.f3614h.add(userBillInfoNet);
            }
        }
        Collections.sort(this.f3614h, new C03552(this));
        UserBillInfoNet userBillInfoNet2 = null;
        UserBillInfoNet userBillInfoNet3 = null;
        Object obj = l;
        UserBillInfoNet userBillInfoNet4 = null;
        for (UserBillInfoNet userBillInfoNet5 : this.f3614h) {
            if (userBillInfoNet5.getUuid() == 1000) {
                l = Long.valueOf(userBillInfoNet5.getLInsuranceGetStacks());
                this.f3592H = l.longValue();
                obj = l;
            } else {
                longValue = userBillInfoNet5.getLRemainBuyStacks() - userBillInfoNet5.getLTotalBuyStacks();
                if (longValue > 0) {
                    this.f3620n += longValue;
                }
                if (userBillInfoNet3 == null) {
                    userBillInfoNet3 = userBillInfoNet5;
                } else {
                    longValue2 = userBillInfoNet3.getLRemainBuyStacks() - userBillInfoNet3.getLTotalBuyStacks();
                    if (longValue2 < longValue) {
                        userBillInfoNet3 = userBillInfoNet5;
                    } else if (longValue2 == longValue && userBillInfoNet3.getUuid() > userBillInfoNet5.getUuid()) {
                        userBillInfoNet3 = userBillInfoNet5;
                    }
                }
                if (userBillInfoNet4 == null) {
                    userBillInfoNet4 = userBillInfoNet5;
                } else {
                    longValue2 = userBillInfoNet4.getLRemainBuyStacks() - userBillInfoNet4.getLTotalBuyStacks();
                    if (longValue2 > longValue) {
                        userBillInfoNet4 = userBillInfoNet5;
                    } else if (longValue2 == longValue && userBillInfoNet4.getUuid() > userBillInfoNet5.getUuid()) {
                        userBillInfoNet4 = userBillInfoNet5;
                    }
                }
                if (userBillInfoNet2 == null) {
                    userBillInfoNet2 = userBillInfoNet5;
                } else {
                    longValue2 = userBillInfoNet2.getLTotalBuyStacks();
                    longValue3 = userBillInfoNet5.getLTotalBuyStacks();
                    if (longValue3 > longValue2) {
                        userBillInfoNet2 = userBillInfoNet5;
                    } else if (longValue3 == longValue2 && userBillInfoNet2.getUuid() > userBillInfoNet5.getUuid()) {
                        userBillInfoNet2 = userBillInfoNet5;
                    }
                }
                clubIncome = (ClubIncome) this.f3615i.get(Long.valueOf(userBillInfoNet5.getLClubID()));
                if (clubIncome == null) {
                    clubIncome = new ClubIncome();
                    clubIncome.f6030c = Long.valueOf(longValue);
                    clubIncome.f6028a = Long.valueOf(userBillInfoNet5.getLClubID());
                    clubIncome.f6029b = userBillInfoNet5.getSClubName();
                    this.f3615i.put(Long.valueOf(userBillInfoNet5.getLClubID()), clubIncome);
                } else {
                    clubIncome.f6030c = Long.valueOf(longValue + clubIncome.f6030c.longValue());
                }
            }
        }
        if (this.f3622p == 6 || this.f3622p == 3) {
            this.f3614h.add(0, obj);
        }
        if (this.f3611e.getStNormalBillInfoNet().getLLeagueID() > 0 && this.f3611e.getBClubManager() == 1) {
            arrayList = new ArrayList();
            for (Entry value2 : this.f3615i.entrySet()) {
                arrayList.add(value2.getValue());
            }
            Collections.sort(arrayList, new C03563(this));
            this.f3614h.addAll(0, arrayList);
            this.f3616j = this.f3615i.size();
        }
        this.f3621o = this.f3611e.getStNormalBillInfoNet().getSPlayName();
        this.f3623q = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid();
        if (this.f3617k > 0) {
            this.f3624r = this.f3611e.getSFromClubUrl();
            if (StringUtils.m4462a(this.f3624r)) {
                this.f3624r = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
            }
            this.f3625s = this.f3611e.getSFromClubCreatorName();
            if (StringUtils.m4462a(this.f3625s)) {
                this.f3625s = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
            }
        } else {
            this.f3624r = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
            this.f3625s = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
        }
        this.f3626t = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getIGender();
        if (this.f3611e.getStNormalBillInfoNet().getIGameRoomUserMaxNums() == 0 || this.f3611e.getStNormalBillInfoNet().getIGameRoomUserMaxNums() == -1) {
            this.f3627u = 9;
        } else {
            this.f3627u = this.f3611e.getStNormalBillInfoNet().getIGameRoomUserMaxNums();
        }
        this.f3628v = this.f3611e.getStNormalBillInfoNet().getLCreateTime();
        this.f3629w = this.f3611e.getStNormalBillInfoNet().getLSmallBlind();
        this.f3630x = this.f3611e.getStNormalBillInfoNet().getLBigBlind();
        this.f3631y = this.f3611e.getStNormalBillInfoNet().getIAnte();
        if (this.f3611e.getStNormalBillInfoNet().getECreateRoomType() == CREATE_ROOM_TYPE.CAHT_ROOM) {
            this.f3632z = this.f3625s + " \u2022 ";
            this.f3585A = this.f3611e.getStNormalBillInfoNet().getSFromText();
        } else if (this.f3611e.getStNormalBillInfoNet().getECreateRoomType() != CREATE_ROOM_TYPE.CLUB_ROOM) {
            this.f3632z = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick() + " \u2022 ";
            this.f3585A = getResources().getString(2131165567);
        } else if (this.f3617k <= 0) {
            this.f3632z = this.f3625s + " \u2022 ";
            this.f3585A = this.f3611e.getStNormalBillInfoNet().getSFromText();
        } else if (StringUtils.m4462a(this.f3611e.getSFromClubName())) {
            this.f3632z = this.f3611e.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick() + " \u2022 ";
            this.f3585A = this.f3611e.getStNormalBillInfoNet().getSFromText();
        } else {
            this.f3632z = this.f3625s + " \u2022 ";
            this.f3585A = this.f3611e.getSFromClubName();
        }
        this.f3586B = Utility.m4471a(this.f3611e.getStNormalBillInfoNet().getLDuration());
        this.f3587C = this.f3611e.getStNormalBillInfoNet().getLTotalGameNum();
        this.f3588D = this.f3611e.getStNormalBillInfoNet().getLTotalBuyin();
        if (userBillInfoNet4 != null) {
            this.f3589E = userBillInfoNet4.getUuid();
        }
        if (userBillInfoNet2 != null) {
            this.f3590F = userBillInfoNet2.getUuid();
        }
        if (userBillInfoNet3 != null) {
            this.f3591G = userBillInfoNet3.getUuid();
        }
    }

    protected final void m2764a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2749a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m2749a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_USERBASEINFO_SUCCESS")) {
            m2749a();
        }
    }

    static /* synthetic */ void m2759i(BillActivity billActivity) {
        Intent intent = new Intent(billActivity, GamePokerHistoryListActivity.class);
        intent.putExtra("lGameRoomId", billActivity.f3613g);
        billActivity.startActivity(intent);
    }

    static /* synthetic */ void m2760j(BillActivity billActivity) {
        if (SharedPreferencesManager.m4396n() == 1) {
            new Builder(billActivity).setTitle(2131165514).setMessage(2131165929).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ BillActivity f3560a;

                {
                    this.f3560a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f3560a.startActivity(new Intent(this.f3560a, StoreActivity.class));
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ BillActivity f3559a;

                {
                    this.f3559a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (billActivity.f3611e == null) {
            r0 = new Intent(billActivity, BillRecordActivity.class);
            r0.putExtra("billId", billActivity.f3613g);
            billActivity.startActivity(r0);
        } else {
            r0 = new Intent(billActivity, BillRecordActivity.class);
            r0.putExtra("billInfoNet", billActivity.f3611e);
            billActivity.startActivity(r0);
        }
    }

    static /* synthetic */ void m2750a(BillActivity billActivity, FriendUser friendUser) {
        if (friendUser != null && friendUser.f5842u.longValue() != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(billActivity, FriendInfoActivity.class);
            intent.putExtra("friendUuid", friendUser.f5842u);
            billActivity.startActivity(intent);
        }
    }
}
