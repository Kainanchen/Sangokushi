package com.illuminate.texaspoker.view;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.refreshlayout.GameUserCountSeekBar;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class SngGameSettingView extends LinearLayout {
    public TextView f7016a;
    public TextView f7017b;
    public TextView f7018c;
    public GameSngTimeSeekBar f7019d;
    public TextView f7020e;
    public TextView f7021f;
    public TextView f7022g;
    public ImageView f7023h;
    public ImageView f7024i;
    public TextView f7025j;
    public CheckBox f7026k;
    public CheckBox f7027l;
    public CheckBox f7028m;
    public GameUserCountSeekBar f7029n;
    public View f7030o;
    public LinearLayout f7031p;
    public List<CheckBox> f7032q;
    private Context f7033r;
    private TextView f7034s;
    private TextView f7035t;
    private TextView f7036u;
    private TextView f7037v;

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.1 */
    class C09571 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f7004a;
        final /* synthetic */ SngGameSettingView f7005b;

        public C09571(SngGameSettingView sngGameSettingView, boolean z) {
            this.f7005b = sngGameSettingView;
            this.f7004a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f7005b.f7029n.setSelectedColor(i);
            SharedPreferencesManager.m4335e(this.f7005b.f7029n.getGameUserCount(), this.f7004a);
            if (i == 0) {
                this.f7005b.f7021f.setVisibility(4);
                this.f7005b.f7022g.setVisibility(4);
                this.f7005b.f7023h.setVisibility(4);
                this.f7005b.f7024i.setVisibility(4);
            } else if (i == 1) {
                this.f7005b.f7021f.setVisibility(0);
                this.f7005b.f7022g.setVisibility(4);
                this.f7005b.f7023h.setVisibility(0);
                this.f7005b.f7024i.setVisibility(4);
            } else {
                this.f7005b.f7021f.setVisibility(0);
                this.f7005b.f7022g.setVisibility(0);
                this.f7005b.f7023h.setVisibility(0);
                this.f7005b.f7024i.setVisibility(0);
            }
            this.f7005b.m4565a();
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.2 */
    class C09582 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f7006a;
        final /* synthetic */ SngGameSettingView f7007b;

        public C09582(SngGameSettingView sngGameSettingView, boolean z) {
            this.f7007b = sngGameSettingView;
            this.f7006a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f7007b.m4565a();
            this.f7007b.f7019d.setSelectedColor(i);
            SharedPreferencesManager.m4343f(i, this.f7006a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.3 */
    class C09593 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f7008a;
        final /* synthetic */ SngGameSettingView f7009b;

        public C09593(SngGameSettingView sngGameSettingView, boolean z) {
            this.f7009b = sngGameSettingView;
            this.f7008a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4338e(z, this.f7008a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.4 */
    class C09604 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f7010a;
        final /* synthetic */ SngGameSettingView f7011b;

        public C09604(SngGameSettingView sngGameSettingView, boolean z) {
            this.f7011b = sngGameSettingView;
            this.f7010a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4346f(z, this.f7010a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.5 */
    class C09615 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f7012a;
        final /* synthetic */ SngGameSettingView f7013b;

        public C09615(SngGameSettingView sngGameSettingView, boolean z) {
            this.f7013b = sngGameSettingView;
            this.f7012a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4352g(z, this.f7012a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.6 */
    class C09626 implements OnCheckedChangeListener {
        final /* synthetic */ SngGameSettingView f7014a;

        public C09626(SngGameSettingView sngGameSettingView) {
            this.f7014a = sngGameSettingView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                for (CheckBox tag : this.f7014a.f7032q) {
                    if (!tag.getTag().equals(compoundButton.getTag())) {
                        compoundButton.setChecked(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SngGameSettingView.7 */
    class C09637 implements OnClickListener {
        final /* synthetic */ SngGameSettingView f7015a;

        C09637(SngGameSettingView sngGameSettingView) {
            this.f7015a = sngGameSettingView;
        }

        public final void onClick(View view) {
            new SngChipListDialog(this.f7015a.f7033r).show();
        }
    }

    public SngGameSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7033r = context;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(2130968827, this);
        this.f7029n = (GameUserCountSeekBar) findViewById(2131559392);
        this.f7029n.setIsSng(true);
        this.f7016a = (TextView) findViewById(2131559060);
        this.f7017b = (TextView) findViewById(2131558850);
        this.f7018c = (TextView) findViewById(2131558851);
        this.f7019d = (GameSngTimeSeekBar) findViewById(2131559391);
        this.f7020e = (TextView) findViewById(2131558860);
        this.f7021f = (TextView) findViewById(2131558861);
        this.f7022g = (TextView) findViewById(2131558862);
        this.f7023h = (ImageView) findViewById(2131558858);
        this.f7024i = (ImageView) findViewById(2131558859);
        this.f7025j = (TextView) findViewById(2131559397);
        ImageButton imageButton = (ImageButton) findViewById(2131559399);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C09637(this));
        }
        this.f7026k = (CheckBox) findViewById(2131559393);
        this.f7027l = (CheckBox) findViewById(2131559394);
        this.f7028m = (CheckBox) findViewById(2131559395);
        this.f7034s = (TextView) findViewById(2131559404);
        this.f7035t = (TextView) findViewById(2131559405);
        this.f7036u = (TextView) findViewById(2131559402);
        this.f7037v = (TextView) findViewById(2131559403);
        this.f7030o = findViewById(2131559400);
        this.f7031p = (LinearLayout) findViewById(2131559401);
    }

    public final void m4566a(boolean z, long j) {
        int i = 9;
        int m = SharedPreferencesManager.m4391m(z);
        if (m == 0) {
            SharedPreferencesManager.m4335e(9, z);
        } else {
            i = m;
        }
        this.f7029n.setProgress(i);
        if (this.f7029n.getProgress() == 0) {
            this.f7021f.setVisibility(4);
            this.f7022g.setVisibility(4);
            this.f7023h.setVisibility(4);
            this.f7024i.setVisibility(4);
        } else if (this.f7029n.getProgress() == 1) {
            this.f7021f.setVisibility(0);
            this.f7022g.setVisibility(4);
            this.f7023h.setVisibility(0);
            this.f7024i.setVisibility(4);
        } else {
            this.f7021f.setVisibility(0);
            this.f7022g.setVisibility(0);
            this.f7023h.setVisibility(0);
            this.f7024i.setVisibility(0);
        }
        this.f7029n.setOnSeekBarChangeListener(new C09571(this, z));
        this.f7019d.setOnSeekBarChangeListener(new C09582(this, z));
        this.f7026k.setOnCheckedChangeListener(new C09593(this, z));
        this.f7027l.setOnCheckedChangeListener(new C09604(this, z));
        this.f7028m.setOnCheckedChangeListener(new C09615(this, z));
        this.f7019d.setProgress(SharedPreferencesManager.m4398n(z));
        this.f7019d.setSelectedColor(SharedPreferencesManager.m4398n(z));
        this.f7026k.setChecked(SharedPreferencesManager.m4407o(z));
        this.f7027l.setChecked(SharedPreferencesManager.m4412p(z));
        this.f7028m.setChecked(SharedPreferencesManager.m4415q(z));
        if (!z) {
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(j, 2);
            if (a.f5715B.booleanValue()) {
                if (a.f5734U == null || !a.f5734U.booleanValue()) {
                    this.f7030o.setVisibility(8);
                    return;
                }
                LayoutInflater from = LayoutInflater.from(getContext());
                this.f7032q = new ArrayList();
                List<LeagueClub> a2 = DBManager.m3631a().f5581u.m3671a(j);
                if (a2.size() != 0) {
                    for (LeagueClub leagueClub : a2) {
                        View inflate = from.inflate(2130968777, null);
                        CheckBox checkBox = (CheckBox) inflate.findViewById(2131559225);
                        ((TextView) inflate.findViewById(2131558705)).setText(leagueClub.m3738a().f5906d);
                        checkBox.setTag(leagueClub.f5914b);
                        checkBox.setOnCheckedChangeListener(new C09626(this));
                        this.f7032q.add(checkBox);
                        this.f7031p.addView(inflate);
                    }
                }
                this.f7030o.setVisibility(8);
                return;
            }
        }
        this.f7030o.setVisibility(8);
    }

    public final void m4565a() {
        int i;
        long j;
        int i2;
        float f;
        float f2 = 0.0f;
        this.f7029n.setIsSng(true);
        int gameUserCount = this.f7029n.getGameUserCount();
        if (this.f7019d.getProgress() == 0) {
            i = 200;
            j = 2000;
            i2 = 180;
        } else if (this.f7019d.getProgress() == 1) {
            i = 500;
            j = 4000;
            i2 = 300;
        } else if (this.f7019d.getProgress() == 2) {
            i = PointerIconCompat.TYPE_DEFAULT;
            j = 4000;
            i2 = 600;
        } else {
            i = 2000;
            j = 8000;
            i2 = 600;
        }
        this.f7016a.setText(Utility.m4502g((long) i));
        this.f7017b.setText(Utility.m4502g(j));
        this.f7018c.setText(String.format(getResources().getString(2131165682), new Object[]{Integer.valueOf(i2 / 60)}));
        j = (long) (gameUserCount * i);
        float f3 = (float) j;
        switch (gameUserCount) {
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                break;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                f = 0.6f;
                break;
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                f = 0.5f;
                break;
            default:
                f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                break;
        }
        this.f7020e.setText(Utility.m4502g((long) (f * f3)));
        f3 = (float) j;
        switch (gameUserCount) {
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                f = 0.0f;
                break;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                f = 0.4f;
                break;
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                f = 0.3f;
                break;
            default:
                f = 0.0f;
                break;
        }
        this.f7021f.setText(Utility.m4502g((long) (f * f3)));
        f = (float) j;
        switch (gameUserCount) {
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                f2 = 0.2f;
                break;
        }
        this.f7022g.setText(Utility.m4502g((long) (f * f2)));
        this.f7025j.setText(Utility.m4502g(SharedPreferencesManager.m4417r()));
        if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
            this.f7034s.setTextColor(-10717052);
            this.f7035t.setTextColor(-73826);
            this.f7036u.setTextColor(-10717052);
            this.f7037v.setTextColor(-73826);
        } else {
            this.f7034s.setTextColor(-1811364);
            this.f7035t.setTextColor(-1811364);
            this.f7036u.setTextColor(-1811364);
            this.f7037v.setTextColor(-1811364);
        }
        this.f7035t.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
        this.f7037v.setText(Utility.m4502g((long) SharedPreferencesManager.m4284O()));
    }
}
