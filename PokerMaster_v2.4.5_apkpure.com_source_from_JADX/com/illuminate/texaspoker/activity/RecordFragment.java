package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog.Builder;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.BillListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.RecordWinProgress;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView.C0372a;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosV2Rsp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.illuminate.texaspoker.activity.i */
public final class RecordFragment extends BaseFragment {
    private Map<String, String> f5473A;
    private View f5474B;
    private RefreshListView f5475C;
    private RefreshDefaultLayout f5476D;
    private BillListAdapter f5477E;
    private View f5478F;
    private TextView f5479G;
    private boolean f5480c;
    private int f5481d;
    private View f5482e;
    private TabHost f5483f;
    private ImageView f5484g;
    private TextView f5485h;
    private TextView f5486i;
    private TextView f5487j;
    private RecordWinProgress f5488k;
    private TextView f5489l;
    private TextView f5490m;
    private TextView f5491n;
    private TextView f5492o;
    private View f5493p;
    private TextView f5494q;
    private TextView f5495r;
    private TextView f5496s;
    private TextView f5497t;
    private TextView f5498u;
    private TextView f5499v;
    private View f5500w;
    private SimpleDateFormat f5501x;
    private long f5502y;
    private List<Object> f5503z;

    /* renamed from: com.illuminate.texaspoker.activity.i.1 */
    class RecordFragment implements OnTabChangeListener {
        final /* synthetic */ RecordFragment f5459a;

        static {
            fixHelper.fixfunc(new int[]{2198, 2199});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onTabChanged(String str);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.2 */
    class RecordFragment implements Runnable {
        final /* synthetic */ SCGetBillInfosV2Rsp f5460a;
        final /* synthetic */ RecordFragment f5461b;

        static {
            fixHelper.fixfunc(new int[]{2119, 2120});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp);

        public final native void run();
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.3 */
    class RecordFragment implements OnClickListener {
        final /* synthetic */ RecordFragment f5462a;

        static {
            fixHelper.fixfunc(new int[]{244, 245});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.4 */
    class RecordFragment implements OnClickListener {
        final /* synthetic */ RecordFragment f5463a;

        static {
            fixHelper.fixfunc(new int[]{421, 422});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.5 */
    class RecordFragment implements RefreshHandler {
        final /* synthetic */ RecordFragment f5466a;

        /* renamed from: com.illuminate.texaspoker.activity.i.5.1 */
        class RecordFragment implements Runnable {
            final /* synthetic */ RecordFragment f5464a;

            RecordFragment(RecordFragment recordFragment) {
                this.f5464a = recordFragment;
            }

            public final void run() {
                RecordFragment.m3534b();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.i.5.2 */
        class RecordFragment implements Runnable {
            final /* synthetic */ RecordFragment f5465a;

            RecordFragment(RecordFragment recordFragment) {
                this.f5465a = recordFragment;
            }

            public final void run() {
                if (this.f5465a.f5466a.f5476D.m4589a()) {
                    this.f5465a.f5466a.f5476D.m4590b();
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{45, 46, 47});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void m3525a();

        public final native boolean m3526a(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.6 */
    class RecordFragment implements C0372a {
        final /* synthetic */ RecordFragment f5469a;

        /* renamed from: com.illuminate.texaspoker.activity.i.6.1 */
        class RecordFragment implements Runnable {
            final /* synthetic */ RecordFragment f5467a;

            RecordFragment(RecordFragment recordFragment) {
                this.f5467a = recordFragment;
            }

            public final void run() {
                RecordFragment.m3540f(this.f5467a.f5469a);
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.i.6.2 */
        class RecordFragment implements Runnable {
            final /* synthetic */ RecordFragment f5468a;

            RecordFragment(RecordFragment recordFragment) {
                this.f5468a = recordFragment;
            }

            public final void run() {
                if (this.f5468a.f5469a.f5475C.f7135a) {
                    this.f5468a.f5469a.f5475C.m4595a();
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{95, 96});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void m3527a();
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.7 */
    class RecordFragment implements OnItemClickListener {
        final /* synthetic */ RecordFragment f5470a;

        static {
            fixHelper.fixfunc(new int[]{654, 655});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.8 */
    class RecordFragment implements DialogInterface.OnClickListener {
        final /* synthetic */ RecordFragment f5471a;

        static {
            fixHelper.fixfunc(new int[]{823, 824});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.i.9 */
    class RecordFragment implements DialogInterface.OnClickListener {
        final /* synthetic */ RecordFragment f5472a;

        static {
            fixHelper.fixfunc(new int[]{558, 559});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native RecordFragment(RecordFragment recordFragment);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static /* synthetic */ void m3530a(RecordFragment recordFragment, long j, int i) {
        if (i == 2) {
            Intent intent = new Intent(recordFragment.getContext(), BillSngActivity.class);
            intent.putExtra("billId", j);
            intent.putExtra("fromShare", false);
            recordFragment.startActivityForResult(intent, 0);
            return;
        }
        intent = new Intent(recordFragment.getContext(), BillActivity.class);
        intent.putExtra("billId", j);
        intent.putExtra("fromShare", false);
        recordFragment.startActivityForResult(intent, 0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5480c = false;
        this.f5501x = new SimpleDateFormat(getString(2131165244));
        this.f5503z = new ArrayList();
        this.f5473A = new HashMap();
        this.f5482e = layoutInflater.inflate(2130968687, null);
        this.f5483f = (TabHost) this.f5482e.findViewById(16908306);
        this.f5483f.setup();
        this.f5483f.getTabWidget().setDividerDrawable(null);
        this.f5483f.addTab(this.f5483f.newTabSpec("dataIndicator").setIndicator(m3528a(2131165867)).setContent(2131558967));
        this.f5483f.addTab(this.f5483f.newTabSpec("billIndicator").setIndicator(m3528a(2131165862)).setContent(2131558968));
        this.f5483f.setOnTabChangedListener(new RecordFragment(this));
        ((Button) this.f5482e.findViewById(2131558993)).setOnClickListener(new RecordFragment(this));
        this.f5486i = (TextView) this.f5482e.findViewById(2131558732);
        this.f5487j = (TextView) this.f5482e.findViewById(2131558524);
        this.f5488k = (RecordWinProgress) this.f5482e.findViewById(2131558525);
        this.f5489l = (TextView) this.f5482e.findViewById(2131558526);
        this.f5490m = (TextView) this.f5482e.findViewById(2131558527);
        ((Button) this.f5482e.findViewById(2131558994)).setOnClickListener(new RecordFragment(this));
        this.f5491n = (TextView) this.f5482e.findViewById(2131558996);
        this.f5492o = (TextView) this.f5482e.findViewById(2131558929);
        this.f5493p = this.f5482e.findViewById(2131558997);
        this.f5494q = (TextView) this.f5482e.findViewById(2131558998);
        this.f5495r = (TextView) this.f5482e.findViewById(2131558999);
        this.f5496s = (TextView) this.f5482e.findViewById(2131559000);
        this.f5497t = (TextView) this.f5482e.findViewById(2131559001);
        this.f5498u = (TextView) this.f5482e.findViewById(2131559002);
        this.f5499v = (TextView) this.f5482e.findViewById(2131559003);
        this.f5500w = this.f5482e.findViewById(2131559004);
        this.f5478F = this.f5482e.findViewById(2131558540);
        this.f5474B = this.f5482e.findViewById(2131558543);
        this.f5475C = (RefreshListView) this.f5482e.findViewById(2131558545);
        this.f5477E = new BillListAdapter(getContext());
        this.f5477E.f3032a = this.f5503z;
        this.f5475C.setAdapter(this.f5477E);
        this.f5476D = (RefreshDefaultLayout) this.f5482e.findViewById(2131558544);
        this.f5476D.setPtrHandler(new RecordFragment(this));
        this.f5475C.setOnLoadMoreListener(new RecordFragment(this));
        this.f5475C.setOnItemClickListener(new RecordFragment(this));
        View inflate = View.inflate(getContext(), 2130968727, null);
        this.f5479G = (TextView) inflate.findViewById(2131559018);
        this.f5475C.addHeaderView(inflate, null, false);
        return this.f5482e;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.b) {
            try {
                if (!this.f5480c) {
                    m3536c();
                    m3537d();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
                    NetworkUtil.m4073a();
                    NetworkUtil.m4134b(0, 0);
                }
                this.f5480c = false;
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        try {
            if (!this.f5480c) {
                m3536c();
                m3537d();
                NetworkUtil.m4073a();
                NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
                NetworkUtil.m4073a();
                NetworkUtil.m4134b(0, 0);
            }
            this.f5480c = false;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f5480c = true;
    }

    private void m3536c() {
        if (!DBManager.m3631a().m3632b()) {
            double d;
            double d2;
            double d3;
            long j;
            String g;
            Object format;
            int indexOf;
            CharSequence spannableString;
            ForegroundColorSpan foregroundColorSpan;
            long C = SharedPreferencesManager.m4268C();
            long B = SharedPreferencesManager.m4266B();
            long E = SharedPreferencesManager.m4272E();
            long D = SharedPreferencesManager.m4271D();
            long F = SharedPreferencesManager.m4274F();
            long G = SharedPreferencesManager.m4276G();
            long J = SharedPreferencesManager.m4279J();
            long H = SharedPreferencesManager.m4277H();
            long I = SharedPreferencesManager.m4278I();
            long K = SharedPreferencesManager.m4280K();
            this.f5481d = SharedPreferencesManager.m4396n();
            double d4 = 0.0d;
            if (D != 0) {
                d4 = ((double) C) / ((double) D);
                if (d4 >= 1.0d) {
                    d = 1.0d;
                    d4 = 0.0d;
                    if (C != 0) {
                        d4 = ((double) E) / ((double) C);
                        if (d4 >= 1.0d) {
                            d2 = 1.0d;
                            if (F == 0) {
                                d3 = ((double) G) / ((double) F);
                            } else {
                                d3 = 0.0d;
                            }
                            j = 0;
                            if (K != 0) {
                                j = (long) (((double) D) / ((double) K));
                                if (j >= 1) {
                                    j = 1;
                                }
                            }
                            g = Utility.m4502g(B);
                            format = String.format(getResources().getString(2131165899), new Object[]{g});
                            indexOf = format.indexOf(g);
                            spannableString = new SpannableString(format);
                            foregroundColorSpan = new ForegroundColorSpan(-6316386);
                            spannableString.setSpan(r26, 0, format.length(), 33);
                            spannableString.setSpan(new ForegroundColorSpan(-73826), indexOf, g.length() + indexOf, 33);
                            spannableString.setSpan(new RelativeSizeSpan(2.57f), indexOf, g.length() + indexOf, 33);
                            this.f5486i.setText(spannableString);
                            this.f5487j.setText(((int) (100.0d * d)) + "%");
                            this.f5489l.setText(((int) (100.0d * d2)) + "%");
                            this.f5490m.setText(String.valueOf(D));
                            this.f5488k.m4560a((float) d, (float) (d2 * d));
                            if (this.f5481d == 1) {
                                this.f5491n.setTextColor(-73826);
                                this.f5492o.setText(">");
                                this.f5500w.setVisibility(8);
                                this.f5493p.setVisibility(0);
                                this.f5494q.setText(Utility.m4502g(F));
                                this.f5495r.setText(((int) (d3 * 100.0d)) + "%");
                                this.f5496s.setText(String.valueOf(J));
                                this.f5497t.setText(String.valueOf(H));
                                this.f5498u.setText(String.valueOf(I));
                                this.f5499v.setText(String.valueOf(j));
                            }
                            this.f5491n.setTextColor(-6316386);
                            this.f5492o.setText(2131165905);
                            this.f5500w.setVisibility(0);
                            this.f5493p.setVisibility(8);
                            return;
                        }
                    }
                    d2 = d4;
                    if (F == 0) {
                        d3 = 0.0d;
                    } else {
                        d3 = ((double) G) / ((double) F);
                    }
                    j = 0;
                    if (K != 0) {
                        j = (long) (((double) D) / ((double) K));
                        if (j >= 1) {
                            j = 1;
                        }
                    }
                    g = Utility.m4502g(B);
                    format = String.format(getResources().getString(2131165899), new Object[]{g});
                    indexOf = format.indexOf(g);
                    spannableString = new SpannableString(format);
                    foregroundColorSpan = new ForegroundColorSpan(-6316386);
                    spannableString.setSpan(r26, 0, format.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(-73826), indexOf, g.length() + indexOf, 33);
                    spannableString.setSpan(new RelativeSizeSpan(2.57f), indexOf, g.length() + indexOf, 33);
                    this.f5486i.setText(spannableString);
                    this.f5487j.setText(((int) (100.0d * d)) + "%");
                    this.f5489l.setText(((int) (100.0d * d2)) + "%");
                    this.f5490m.setText(String.valueOf(D));
                    this.f5488k.m4560a((float) d, (float) (d2 * d));
                    if (this.f5481d == 1) {
                        this.f5491n.setTextColor(-6316386);
                        this.f5492o.setText(2131165905);
                        this.f5500w.setVisibility(0);
                        this.f5493p.setVisibility(8);
                        return;
                    }
                    this.f5491n.setTextColor(-73826);
                    this.f5492o.setText(">");
                    this.f5500w.setVisibility(8);
                    this.f5493p.setVisibility(0);
                    this.f5494q.setText(Utility.m4502g(F));
                    this.f5495r.setText(((int) (d3 * 100.0d)) + "%");
                    this.f5496s.setText(String.valueOf(J));
                    this.f5497t.setText(String.valueOf(H));
                    this.f5498u.setText(String.valueOf(I));
                    this.f5499v.setText(String.valueOf(j));
                }
            }
            d = d4;
            d4 = 0.0d;
            if (C != 0) {
                d4 = ((double) E) / ((double) C);
                if (d4 >= 1.0d) {
                    d2 = 1.0d;
                    if (F == 0) {
                        d3 = ((double) G) / ((double) F);
                    } else {
                        d3 = 0.0d;
                    }
                    j = 0;
                    if (K != 0) {
                        j = (long) (((double) D) / ((double) K));
                        if (j >= 1) {
                            j = 1;
                        }
                    }
                    g = Utility.m4502g(B);
                    format = String.format(getResources().getString(2131165899), new Object[]{g});
                    indexOf = format.indexOf(g);
                    spannableString = new SpannableString(format);
                    foregroundColorSpan = new ForegroundColorSpan(-6316386);
                    spannableString.setSpan(r26, 0, format.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(-73826), indexOf, g.length() + indexOf, 33);
                    spannableString.setSpan(new RelativeSizeSpan(2.57f), indexOf, g.length() + indexOf, 33);
                    this.f5486i.setText(spannableString);
                    this.f5487j.setText(((int) (100.0d * d)) + "%");
                    this.f5489l.setText(((int) (100.0d * d2)) + "%");
                    this.f5490m.setText(String.valueOf(D));
                    this.f5488k.m4560a((float) d, (float) (d2 * d));
                    if (this.f5481d == 1) {
                        this.f5491n.setTextColor(-73826);
                        this.f5492o.setText(">");
                        this.f5500w.setVisibility(8);
                        this.f5493p.setVisibility(0);
                        this.f5494q.setText(Utility.m4502g(F));
                        this.f5495r.setText(((int) (d3 * 100.0d)) + "%");
                        this.f5496s.setText(String.valueOf(J));
                        this.f5497t.setText(String.valueOf(H));
                        this.f5498u.setText(String.valueOf(I));
                        this.f5499v.setText(String.valueOf(j));
                    }
                    this.f5491n.setTextColor(-6316386);
                    this.f5492o.setText(2131165905);
                    this.f5500w.setVisibility(0);
                    this.f5493p.setVisibility(8);
                    return;
                }
            }
            d2 = d4;
            if (F == 0) {
                d3 = 0.0d;
            } else {
                d3 = ((double) G) / ((double) F);
            }
            j = 0;
            if (K != 0) {
                j = (long) (((double) D) / ((double) K));
                if (j >= 1) {
                    j = 1;
                }
            }
            g = Utility.m4502g(B);
            format = String.format(getResources().getString(2131165899), new Object[]{g});
            indexOf = format.indexOf(g);
            spannableString = new SpannableString(format);
            foregroundColorSpan = new ForegroundColorSpan(-6316386);
            spannableString.setSpan(r26, 0, format.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(-73826), indexOf, g.length() + indexOf, 33);
            spannableString.setSpan(new RelativeSizeSpan(2.57f), indexOf, g.length() + indexOf, 33);
            this.f5486i.setText(spannableString);
            this.f5487j.setText(((int) (100.0d * d)) + "%");
            this.f5489l.setText(((int) (100.0d * d2)) + "%");
            this.f5490m.setText(String.valueOf(D));
            this.f5488k.m4560a((float) d, (float) (d2 * d));
            if (this.f5481d == 1) {
                this.f5491n.setTextColor(-6316386);
                this.f5492o.setText(2131165905);
                this.f5500w.setVisibility(0);
                this.f5493p.setVisibility(8);
                return;
            }
            this.f5491n.setTextColor(-73826);
            this.f5492o.setText(">");
            this.f5500w.setVisibility(8);
            this.f5493p.setVisibility(0);
            this.f5494q.setText(Utility.m4502g(F));
            this.f5495r.setText(((int) (d3 * 100.0d)) + "%");
            this.f5496s.setText(String.valueOf(J));
            this.f5497t.setText(String.valueOf(H));
            this.f5498u.setText(String.valueOf(I));
            this.f5499v.setText(String.valueOf(j));
        }
    }

    private void m3537d() {
        if (!DBManager.m3631a().m3632b()) {
            SharedPreferencesManager.m4376k(0);
            if (this.f5483f.getCurrentTab() != 0) {
                this.f5485h.setVisibility(4);
                this.f5484g.setVisibility(4);
                SharedPreferencesManager.m4370j(0);
            } else if (SharedPreferencesManager.m4282M() == 0) {
                this.f5485h.setVisibility(4);
                this.f5484g.setVisibility(4);
            } else {
                this.f5485h.setVisibility(0);
                this.f5484g.setVisibility(0);
            }
            long G = SharedPreferencesManager.m4276G();
            CharSequence g = Utility.m4502g(G);
            if (G == 0) {
                this.f5479G.setText(g);
                this.f5479G.setTextColor(-6316386);
            } else if (G > 0) {
                this.f5479G.setText("+" + g);
                this.f5479G.setTextColor(-2543568);
            } else {
                this.f5479G.setText(g);
                this.f5479G.setTextColor(-14519546);
            }
            this.f5503z.clear();
            this.f5473A.clear();
            for (Bill bill : DBManager.m3631a().f5570j.m3556a()) {
                String f = Utility.m4499f(bill.f5626J.longValue());
                if (this.f5473A.containsKey(f)) {
                    this.f5503z.add(new Object[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER, bill});
                } else {
                    this.f5473A.put(f, f);
                    if (f.equals(getResources().getString(2131165511)) || f.equals(getResources().getString(2131165509))) {
                        this.f5503z.add(new Object[]{f, LetterIndexBar.SEARCH_ICON_LETTER, bill});
                    } else {
                        String format = this.f5501x.format(new Date(bill.f5626J.longValue()));
                        this.f5503z.add(new Object[]{f, format, bill});
                    }
                }
                this.f5502y = bill.f5643b.longValue();
            }
            if (this.f5503z.size() > 0) {
                this.f5474B.setVisibility(0);
                this.f5478F.setVisibility(4);
            } else {
                this.f5474B.setVisibility(4);
                this.f5478F.setVisibility(0);
            }
            this.f5477E.notifyDataSetChanged();
        }
    }

    private View m3528a(int i) {
        View inflate = LayoutInflater.from(getActivity()).inflate(2130968713, null);
        ((TextView) inflate.findViewById(2131559005)).setText(i);
        ImageView imageView = (ImageView) inflate.findViewById(2131559007);
        TextView textView = (TextView) inflate.findViewById(2131559008);
        if (i == 2131165862) {
            this.f5484g = imageView;
            this.f5485h = textView;
        }
        return inflate;
    }

    public final void m3544a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_RECORD")) {
            m3536c();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f5477E.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_BILL")) {
            new Handler().postDelayed(
            /* Method generation error in method: com.illuminate.texaspoker.activity.i.a(java.lang.String, java.util.List):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  (wrap: android.os.Handler
  0x0030: CONSTRUCTOR  (r0_9 android.os.Handler) =  android.os.Handler.<init>():void CONSTRUCTOR), (wrap: java.lang.Runnable
  0x0035: CONSTRUCTOR  (r1_0 java.lang.Runnable) = (r6_0 'this' com.illuminate.texaspoker.activity.i) com.illuminate.texaspoker.activity.i.10.<init>(com.illuminate.texaspoker.activity.i):void CONSTRUCTOR), (500 long) android.os.Handler.postDelayed(java.lang.Runnable, long):boolean type: VIRTUAL in method: com.illuminate.texaspoker.activity.i.a(java.lang.String, java.util.List):void
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
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: CONSTRUCTOR  (r1_0 java.lang.Runnable) = (r6_0 'this' com.illuminate.texaspoker.activity.i) com.illuminate.texaspoker.activity.i.10.<init>(com.illuminate.texaspoker.activity.i):void CONSTRUCTOR in method: com.illuminate.texaspoker.activity.i.a(java.lang.String, java.util.List):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:638)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:619)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:219)
	... 25 more
Caused by: java.lang.NullPointerException
	at jadx.core.utils.RegionUtils.notEmpty(RegionUtils.java:135)
	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:544)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 30 more
 */

            static /* synthetic */ void m3538d(RecordFragment recordFragment) {
                if (recordFragment.f5481d != 1) {
                    recordFragment.startActivity(new Intent(recordFragment.getContext(), ClubRecordActivity.class));
                } else {
                    new Builder(recordFragment.getContext()).setTitle(2131165514).setMessage(2131165929).setPositiveButton(2131165795, new RecordFragment(recordFragment)).setNegativeButton(2131165432, new RecordFragment(recordFragment)).show();
                }
            }

            static /* synthetic */ void m3534b() {
                NetworkUtil.m4073a();
                NetworkUtil.m4134b(0, 0);
            }

            static /* synthetic */ void m3540f(RecordFragment recordFragment) {
                NetworkUtil.m4073a();
                NetworkUtil.m4134b(recordFragment.f5502y, 0);
            }

            static /* synthetic */ void m3531a(RecordFragment recordFragment, BillInfoNet billInfoNet) {
                if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                    Intent intent = new Intent(recordFragment.getContext(), BillSngActivity.class);
                    intent.putExtra("billInfoNet", billInfoNet);
                    recordFragment.startActivityForResult(intent, 0);
                    return;
                }
                intent = new Intent(recordFragment.getContext(), BillActivity.class);
                intent.putExtra("billInfoNet", billInfoNet);
                recordFragment.startActivityForResult(intent, 0);
            }

            static /* synthetic */ void m3532a(RecordFragment recordFragment, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp) {
                for (BillInfoNet billInfoNet : sCGetBillInfosV2Rsp.getStBillInfoNetList()) {
                    long lCreateTime;
                    long lBillID;
                    if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                        lCreateTime = billInfoNet.getStSNGBillInfoNet().getLCreateTime();
                        lBillID = billInfoNet.getStSNGBillInfoNet().getLBillID();
                    } else {
                        lCreateTime = billInfoNet.getStNormalBillInfoNet().getLCreateTime();
                        lBillID = billInfoNet.getStNormalBillInfoNet().getLBillID();
                    }
                    String f = Utility.m4499f(lCreateTime);
                    if (recordFragment.f5473A.containsKey(f)) {
                        recordFragment.f5503z.add(new Object[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER, billInfoNet});
                    } else {
                        recordFragment.f5473A.put(f, f);
                        if (f.equals(recordFragment.getResources().getString(2131165511)) || f.equals(recordFragment.getResources().getString(2131165509))) {
                            recordFragment.f5503z.add(new Object[]{f, LetterIndexBar.SEARCH_ICON_LETTER, billInfoNet});
                        } else {
                            String format = recordFragment.f5501x.format(new Date(lCreateTime));
                            recordFragment.f5503z.add(new Object[]{f, format, billInfoNet});
                        }
                    }
                    recordFragment.f5502y = lBillID;
                    recordFragment.f5477E.notifyDataSetChanged();
                }
            }
        }
