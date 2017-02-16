package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.GuidePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends BaseActivity implements OnPageChangeListener {
    private static final int[] f4543i;
    boolean f4544c;
    private List<View> f4545d;
    private ViewPager f4546e;
    private GuidePagerAdapter f4547f;
    private ImageView[] f4548g;
    private int f4549h;

    /* renamed from: com.illuminate.texaspoker.activity.GuideActivity.1 */
    class C06411 implements OnClickListener {
        final /* synthetic */ GuideActivity f4542a;

        static {
            fixHelper.fixfunc(new int[]{3437, 3438});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06411(GuideActivity guideActivity);

        public final native void onClick(View view);
    }

    static {
        f4543i = new int[]{2130903374, 2130903375, 2130903376};
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968643);
        this.f4544c = getIntent().getExtras().getBoolean("fromLogin");
        this.f4549h = 0;
        this.f4545d = new ArrayList();
        for (int i = 0; i < f4543i.length; i++) {
            View inflate = LayoutInflater.from(this).inflate(2130968780, null);
            ((ImageView) inflate.findViewById(2131559239)).setImageResource(f4543i[i]);
            Button button = (Button) inflate.findViewById(2131559240);
            if (i == 2) {
                button.setVisibility(0);
                button.setOnClickListener(new C06411(this));
            } else {
                button.setVisibility(4);
            }
            this.f4545d.add(inflate);
        }
        this.f4546e = (ViewPager) findViewById(2131558742);
        this.f4547f = new GuidePagerAdapter(this.f4545d);
        this.f4546e.setAdapter(this.f4547f);
        this.f4546e.addOnPageChangeListener(this);
        m3157a();
    }

    private void m3157a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558743);
        this.f4548g = new ImageView[f4543i.length];
        for (int i = 0; i < f4543i.length; i++) {
            this.f4548g[i] = (ImageView) linearLayout.getChildAt(i);
            this.f4548g[i].setEnabled(false);
            this.f4548g[i].setTag(Integer.valueOf(i));
        }
        this.f4549h = 0;
        this.f4548g[this.f4549h].setEnabled(true);
    }

    public final void m3159a(String str, List<Object> list) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void m3158b() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3158b();
    }

    protected void onResume() {
        super.onResume();
        m3158b();
    }

    public void onPageSelected(int i) {
        if (i >= 0 && i <= f4543i.length - 1 && this.f4549h != i) {
            this.f4548g[i].setEnabled(true);
            this.f4548g[this.f4549h].setEnabled(false);
            this.f4549h = i;
        }
    }
}
