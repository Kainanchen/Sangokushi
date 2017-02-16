package com.illuminate.texaspoker.view;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.RangeSeekBar.C0929c;
import com.illuminate.texaspoker.view.refreshlayout.GameUserCountSeekBar;
import java.util.List;

public class NormalGameSettingView extends LinearLayout {
    public SeekBar f6844a;
    public GameAnteSeekBar f6845b;
    public View f6846c;
    public GameTimeSeekBar f6847d;
    public RangeSeekBar f6848e;
    public CheckBox f6849f;
    public CheckBox f6850g;
    public CheckBox f6851h;
    public CheckBox f6852i;
    public GameUserCountSeekBar f6853j;
    public View f6854k;
    public LinearLayout f6855l;
    public List<CheckBox> f6856m;
    private Context f6857n;
    private TextView f6858o;
    private TextView f6859p;
    private TextView f6860q;
    private TextView f6861r;
    private TextView f6862s;
    private TextView f6863t;

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.10 */
    class AnonymousClass10 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6825a;
        final /* synthetic */ NormalGameSettingView f6826b;

        static {
            fixHelper.fixfunc(new int[]{1810, 1811, 1812, 1813});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native AnonymousClass10(NormalGameSettingView normalGameSettingView, boolean z);

        public final native void onProgressChanged(SeekBar seekBar, int i, boolean z);

        public final native void onStartTrackingTouch(SeekBar seekBar);

        public final native void onStopTrackingTouch(SeekBar seekBar);
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.1 */
    class C09271 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6828a;
        final /* synthetic */ NormalGameSettingView f6829b;

        public C09271(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6829b = normalGameSettingView;
            this.f6828a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6829b.m4547a();
            SharedPreferencesManager.m4310b(i, this.f6828a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.2 */
    class C09282 implements OnClickListener {
        final /* synthetic */ NormalGameSettingView f6830a;

        C09282(NormalGameSettingView normalGameSettingView) {
            this.f6830a = normalGameSettingView;
        }

        public final void onClick(View view) {
            String str;
            if (Utility.m4480a()) {
                str = "http://upyun.pokermate.net/web/cn/insurance_instruction.html";
            } else if (Utility.m4485b()) {
                str = "http://upyun.pokermate.net/web/tw/insurance_instruction.html";
            } else {
                str = "http://upyun.pokermate.net/web/en/insurance_instruction.html";
            }
            new WebViewDialog(this.f6830a.f6857n, str).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.3 */
    class C09303 implements C0929c {
        final /* synthetic */ NormalGameSettingView f6831a;

        C09303(NormalGameSettingView normalGameSettingView) {
            this.f6831a = normalGameSettingView;
        }

        public final void m4545a() {
            this.f6831a.m4547a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.4 */
    class C09314 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6832a;
        final /* synthetic */ NormalGameSettingView f6833b;

        public C09314(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6833b = normalGameSettingView;
            this.f6832a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6833b.f6845b.setSelectedColor(i);
            SharedPreferencesManager.m4320c(i, this.f6832a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.5 */
    class C09325 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6834a;
        final /* synthetic */ NormalGameSettingView f6835b;

        public C09325(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6835b = normalGameSettingView;
            this.f6834a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6835b.f6853j.setSelectedColor(i);
            SharedPreferencesManager.m4302a(this.f6835b.f6853j.getGameUserCount(), this.f6834a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.6 */
    class C09336 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6836a;
        final /* synthetic */ NormalGameSettingView f6837b;

        public C09336(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6837b = normalGameSettingView;
            this.f6836a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4307a(z, this.f6836a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.7 */
    class C09347 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6838a;
        final /* synthetic */ NormalGameSettingView f6839b;

        public C09347(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6839b = normalGameSettingView;
            this.f6838a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4318b(z, this.f6838a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.8 */
    class C09358 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6840a;
        final /* synthetic */ NormalGameSettingView f6841b;

        public C09358(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6841b = normalGameSettingView;
            this.f6840a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4324c(z, this.f6840a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.NormalGameSettingView.9 */
    class C09369 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6842a;
        final /* synthetic */ NormalGameSettingView f6843b;

        public C09369(NormalGameSettingView normalGameSettingView, boolean z) {
            this.f6843b = normalGameSettingView;
            this.f6842a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4332d(z, this.f6842a);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2556, 2557, 2558});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native NormalGameSettingView(Context context, AttributeSet attributeSet);

    public final native void m4547a();

    protected native void onFinishInflate();
}
