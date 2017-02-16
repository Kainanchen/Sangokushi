package com.illuminate.texaspoker.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.RangeSeekBar.C0929c;
import com.illuminate.texaspoker.view.refreshlayout.GameUserCountSeekBar;
import java.util.ArrayList;
import java.util.List;

public class OmahaGameSettingView extends LinearLayout {
    public TextView f6883a;
    public TextView f6884b;
    public SeekBar f6885c;
    public GameAnteSeekBar f6886d;
    public View f6887e;
    public GameTimeSeekBar f6888f;
    public RangeSeekBar f6889g;
    public TextView f6890h;
    public TextView f6891i;
    public TextView f6892j;
    public TextView f6893k;
    public CheckBox f6894l;
    public CheckBox f6895m;
    public CheckBox f6896n;
    public CheckBox f6897o;
    public GameUserCountSeekBar f6898p;
    public View f6899q;
    public LinearLayout f6900r;
    public List<CheckBox> f6901s;
    private Context f6902t;

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.10 */
    class AnonymousClass10 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6864a;
        final /* synthetic */ OmahaGameSettingView f6865b;

        public AnonymousClass10(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6865b = omahaGameSettingView;
            this.f6864a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4402n(z, this.f6864a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.1 */
    class C09371 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6867a;
        final /* synthetic */ OmahaGameSettingView f6868b;

        public C09371(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6868b = omahaGameSettingView;
            this.f6867a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6868b.m4551a();
            SharedPreferencesManager.m4385l(i, this.f6867a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.2 */
    class C09382 implements OnClickListener {
        final /* synthetic */ OmahaGameSettingView f6869a;

        C09382(OmahaGameSettingView omahaGameSettingView) {
            this.f6869a = omahaGameSettingView;
        }

        public final void onClick(View view) {
            String str;
            if (Utility.m4480a()) {
                str = "http://upyun.pokermate.net/web/cn/omaha_insurance_instruction.html";
            } else if (Utility.m4485b()) {
                str = "http://upyun.pokermate.net/web/tw/omaha_insurance_instruction.html";
            } else {
                str = "http://upyun.pokermate.net/web/en/omaha_insurance_instruction.html";
            }
            new WebViewDialog(this.f6869a.f6902t, str).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.3 */
    class C09393 implements C0929c {
        final /* synthetic */ OmahaGameSettingView f6870a;

        C09393(OmahaGameSettingView omahaGameSettingView) {
            this.f6870a = omahaGameSettingView;
        }

        public final void m4548a() {
            this.f6870a.m4551a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.4 */
    class C09404 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6871a;
        final /* synthetic */ OmahaGameSettingView f6872b;

        public C09404(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6872b = omahaGameSettingView;
            this.f6871a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6872b.f6886d.setSelectedColor(i);
            SharedPreferencesManager.m4393m(i, this.f6871a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.5 */
    class C09415 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6873a;
        final /* synthetic */ OmahaGameSettingView f6874b;

        public C09415(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6874b = omahaGameSettingView;
            this.f6873a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6874b.f6898p.setSelectedColor(i);
            SharedPreferencesManager.m4377k(this.f6874b.f6898p.getGameUserCount(), this.f6873a);
            if (!SharedPreferencesManager.m4294Y() || this.f6874b.f6898p.getGameUserCount() > 6) {
                this.f6874b.f6887e.setVisibility(8);
            } else {
                this.f6874b.f6887e.setVisibility(0);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.6 */
    class C09426 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6875a;
        final /* synthetic */ OmahaGameSettingView f6876b;

        public C09426(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6876b = omahaGameSettingView;
            this.f6875a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6876b.f6888f.setSelectedColor(i);
            SharedPreferencesManager.m4400n(i, this.f6875a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.7 */
    class C09437 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6877a;
        final /* synthetic */ OmahaGameSettingView f6878b;

        public C09437(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6878b = omahaGameSettingView;
            this.f6877a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4380k(z, this.f6877a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.8 */
    class C09448 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6879a;
        final /* synthetic */ OmahaGameSettingView f6880b;

        public C09448(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6880b = omahaGameSettingView;
            this.f6879a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4387l(z, this.f6879a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.OmahaGameSettingView.9 */
    class C09459 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6881a;
        final /* synthetic */ OmahaGameSettingView f6882b;

        public C09459(OmahaGameSettingView omahaGameSettingView, boolean z) {
            this.f6882b = omahaGameSettingView;
            this.f6881a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4395m(z, this.f6881a);
        }
    }

    public OmahaGameSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6902t = context;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(2130968807, this);
        this.f6883a = (TextView) findViewById(2131559307);
        this.f6884b = (TextView) findViewById(2131559308);
        this.f6885c = (SeekBar) findViewById(2131559309);
        if (VERSION.SDK_INT >= 21 && this.f6885c != null) {
            this.f6885c.setSplitTrack(false);
        }
        this.f6886d = (GameAnteSeekBar) findViewById(2131559311);
        this.f6886d.setBigBlind(Utility.m4495e(this.f6885c.getProgress()) * 2);
        this.f6898p = (GameUserCountSeekBar) findViewById(2131559310);
        this.f6898p.setIsSng(false);
        this.f6894l = (CheckBox) findViewById(2131559314);
        this.f6896n = (CheckBox) findViewById(2131559318);
        this.f6897o = (CheckBox) findViewById(2131559319);
        this.f6887e = findViewById(2131559315);
        if (!SharedPreferencesManager.m4294Y() || this.f6898p.getGameUserCount() > 6) {
            this.f6887e.setVisibility(8);
        } else {
            this.f6887e.setVisibility(0);
        }
        ImageButton imageButton = (ImageButton) findViewById(2131559316);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C09382(this));
        }
        this.f6895m = (CheckBox) findViewById(2131559317);
        this.f6899q = findViewById(2131559320);
        this.f6900r = (LinearLayout) findViewById(2131559321);
        this.f6888f = (GameTimeSeekBar) findViewById(2131559312);
        this.f6889g = (RangeSeekBar) findViewById(2131559313);
        if (this.f6889g != null) {
            this.f6889g.setLeftSelection(1);
            this.f6889g.setRightSelection(4);
        }
        this.f6889g.setOnCursorStopListener(new C09393(this));
        this.f6890h = (TextView) findViewById(2131559324);
        this.f6891i = (TextView) findViewById(2131559325);
        this.f6892j = (TextView) findViewById(2131559322);
        this.f6893k = (TextView) findViewById(2131559323);
    }

    public final void m4552a(boolean z, long j) {
        int i = 6;
        this.f6885c.setProgress(SharedPreferencesManager.m4438z(z));
        this.f6885c.setOnSeekBarChangeListener(new C09371(this, z));
        this.f6886d.setProgress(SharedPreferencesManager.m4264A(z));
        this.f6886d.setOnSeekBarChangeListener(new C09404(this, z));
        int y = SharedPreferencesManager.m4437y(z);
        if (y == 0) {
            SharedPreferencesManager.m4377k(6, z);
        } else {
            i = y;
        }
        this.f6898p.setProgress(i);
        this.f6898p.setOnSeekBarChangeListener(new C09415(this, z));
        this.f6888f.setOnSeekBarChangeListener(new C09426(this, z));
        this.f6894l.setOnCheckedChangeListener(new C09437(this, z));
        this.f6895m.setOnCheckedChangeListener(new C09448(this, z));
        this.f6896n.setOnCheckedChangeListener(new C09459(this, z));
        this.f6897o.setOnCheckedChangeListener(new AnonymousClass10(this, z));
        this.f6894l.setChecked(SharedPreferencesManager.m4267B(z));
        this.f6895m.setChecked(SharedPreferencesManager.m4269C(z));
        this.f6888f.setProgress(SharedPreferencesManager.m4270D(z));
        this.f6896n.setChecked(SharedPreferencesManager.m4273E(z));
        this.f6897o.setChecked(SharedPreferencesManager.m4275F(z));
        if (!z) {
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(j, 2);
            if (a.f5715B.booleanValue()) {
                if (a.f5734U == null || !a.f5734U.booleanValue()) {
                    this.f6899q.setVisibility(8);
                    return;
                }
                LayoutInflater from = LayoutInflater.from(getContext());
                this.f6901s = new ArrayList();
                List<LeagueClub> a2 = DBManager.m3631a().f5581u.m3671a(j);
                if (a2.size() != 0) {
                    for (LeagueClub leagueClub : a2) {
                        View inflate = from.inflate(2130968777, null);
                        CheckBox checkBox = (CheckBox) inflate.findViewById(2131559225);
                        ((TextView) inflate.findViewById(2131558705)).setText(leagueClub.m3738a().f5906d);
                        checkBox.setTag(leagueClub.f5914b);
                        checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                            final /* synthetic */ OmahaGameSettingView f6866a;

                            {
                                this.f6866a = r1;
                            }

                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                if (z) {
                                    for (CheckBox checkBox : this.f6866a.f6901s) {
                                        if (!checkBox.getTag().equals(compoundButton.getTag())) {
                                            checkBox.setChecked(false);
                                        }
                                    }
                                    SharedPreferencesManager.m4432w(((Long) compoundButton.getTag()).longValue());
                                    return;
                                }
                                SharedPreferencesManager.m4432w(0);
                            }
                        });
                        if (leagueClub.f5914b.longValue() == SharedPreferencesManager.ae()) {
                            checkBox.setChecked(true);
                        }
                        this.f6901s.add(checkBox);
                        this.f6900r.addView(inflate);
                    }
                    this.f6899q.setVisibility(0);
                    return;
                }
            }
        }
        this.f6899q.setVisibility(8);
    }

    public final void m4551a() {
        int progress = this.f6885c.getProgress();
        long e = Utility.m4495e(progress);
        CharSequence d = Utility.m4491d(progress);
        this.f6886d.setBigBlind(2 * e);
        this.f6898p.setIsSng(false);
        this.f6883a.setText(d);
        this.f6884b.setText(Utility.m4502g(e * 200));
        if (((long) SharedPreferencesManager.m4284O()) <= SharedPreferencesManager.m4413q()) {
            this.f6890h.setTextColor(-10717052);
            this.f6891i.setTextColor(-73826);
            this.f6892j.setTextColor(-10717052);
            this.f6893k.setTextColor(-73826);
        } else {
            this.f6890h.setTextColor(-1811364);
            this.f6891i.setTextColor(-1811364);
            this.f6892j.setTextColor(-1811364);
            this.f6893k.setTextColor(-1811364);
        }
        this.f6891i.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
        this.f6893k.setText(Utility.m4502g((long) SharedPreferencesManager.m4284O()));
    }
}
