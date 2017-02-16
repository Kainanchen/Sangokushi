package com.illuminate.texaspoker.view;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.RangeSeekBar.C0929c;
import com.illuminate.texaspoker.view.refreshlayout.GameUserCountSeekBar;
import java.util.List;

public class SixGameSettingView extends LinearLayout {
    public TextView f6986a;
    public TextView f6987b;
    public SeekBar f6988c;
    public GameAnteSeekBar f6989d;
    public GameTimeSeekBar f6990e;
    public RangeSeekBar f6991f;
    public TextView f6992g;
    public TextView f6993h;
    public TextView f6994i;
    public TextView f6995j;
    public CheckBox f6996k;
    public CheckBox f6997l;
    public CheckBox f6998m;
    public GameUserCountSeekBar f6999n;
    public View f7000o;
    public LinearLayout f7001p;
    public List<CheckBox> f7002q;
    private Context f7003r;

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.1 */
    class C09481 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6970a;
        final /* synthetic */ SixGameSettingView f6971b;

        public C09481(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6971b = sixGameSettingView;
            this.f6970a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6971b.m4562a();
            SharedPreferencesManager.m4356h(i, this.f6970a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.2 */
    class C09492 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6972a;
        final /* synthetic */ SixGameSettingView f6973b;

        public C09492(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6973b = sixGameSettingView;
            this.f6972a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6973b.f6989d.setSelectedColor(i);
            SharedPreferencesManager.m4363i(i, this.f6972a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.3 */
    class C09503 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6974a;
        final /* synthetic */ SixGameSettingView f6975b;

        public C09503(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6975b = sixGameSettingView;
            this.f6974a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6975b.f6999n.setSelectedColor(i);
            SharedPreferencesManager.m4349g(this.f6975b.f6999n.getGameUserCount(), this.f6974a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.4 */
    class C09514 implements OnSeekBarChangeListener {
        final /* synthetic */ boolean f6976a;
        final /* synthetic */ SixGameSettingView f6977b;

        public C09514(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6977b = sixGameSettingView;
            this.f6976a = z;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f6977b.f6990e.setSelectedColor(i);
            SharedPreferencesManager.m4371j(i, this.f6976a);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.5 */
    class C09525 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6978a;
        final /* synthetic */ SixGameSettingView f6979b;

        public C09525(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6979b = sixGameSettingView;
            this.f6978a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4359h(z, this.f6978a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.6 */
    class C09536 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6980a;
        final /* synthetic */ SixGameSettingView f6981b;

        public C09536(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6981b = sixGameSettingView;
            this.f6980a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4366i(z, this.f6980a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.7 */
    class C09547 implements OnCheckedChangeListener {
        final /* synthetic */ boolean f6982a;
        final /* synthetic */ SixGameSettingView f6983b;

        public C09547(SixGameSettingView sixGameSettingView, boolean z) {
            this.f6983b = sixGameSettingView;
            this.f6982a = z;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferencesManager.m4374j(z, this.f6982a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.8 */
    class C09558 implements OnCheckedChangeListener {
        final /* synthetic */ SixGameSettingView f6984a;

        public C09558(SixGameSettingView sixGameSettingView) {
            this.f6984a = sixGameSettingView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                for (CheckBox tag : this.f6984a.f7002q) {
                    if (!tag.getTag().equals(compoundButton.getTag())) {
                        compoundButton.setChecked(false);
                    }
                }
                SharedPreferencesManager.m4430v(((Long) compoundButton.getTag()).longValue());
                return;
            }
            SharedPreferencesManager.m4430v(0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.SixGameSettingView.9 */
    class C09569 implements C0929c {
        final /* synthetic */ SixGameSettingView f6985a;

        C09569(SixGameSettingView sixGameSettingView) {
            this.f6985a = sixGameSettingView;
        }

        public final void m4561a() {
            this.f6985a.m4562a();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1530, 1531, 1532, 1533});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native SixGameSettingView(Context context, AttributeSet attributeSet);

    public final native void m4562a();

    public final native void m4563a(boolean z, long j);

    protected native void onFinishInflate();
}
