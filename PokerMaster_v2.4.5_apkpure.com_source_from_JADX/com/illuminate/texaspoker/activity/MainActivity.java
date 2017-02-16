package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.BuyinControlMsg;
import java.util.List;

public class MainActivity extends BaseMainActivity {
    private static String f4665d;
    public int f4666c;
    private boolean f4667e;
    private int[] f4668f;
    private int[] f4669g;
    private Class[] f4670h;
    private List<C0686a> f4671i;
    private Toolbar f4672j;
    private FragmentTabHost f4673k;
    private ViewPager f4674l;
    private MomentsFragment f4675m;
    private List<Fragment> f4676n;
    private int f4677o;

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.1 */
    class C06791 implements OnClickListener {
        final /* synthetic */ MainActivity f4653a;

        C06791(MainActivity mainActivity) {
            this.f4653a = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.2 */
    class C06802 implements OnTabChangeListener {
        final /* synthetic */ MainActivity f4654a;

        C06802(MainActivity mainActivity) {
            this.f4654a = mainActivity;
        }

        public final void onTabChanged(String str) {
            this.f4654a.f4666c = this.f4654a.f4673k.getCurrentTab();
            this.f4654a.f4674l.setCurrentItem(this.f4654a.f4673k.getCurrentTab(), false);
            this.f4654a.m3207f();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.3 */
    class C06813 implements View.OnClickListener {
        final /* synthetic */ MainActivity f4655a;

        C06813(MainActivity mainActivity) {
            this.f4655a = mainActivity;
        }

        public final void onClick(View view) {
            this.f4655a.f4666c = 2;
            this.f4655a.f4673k.setCurrentTab(2);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.4 */
    class C06824 implements OnPageChangeListener {
        final /* synthetic */ MainActivity f4656a;

        C06824(MainActivity mainActivity) {
            this.f4656a = mainActivity;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f4656a.m3013a();
        }

        public final void onPageSelected(int i) {
            this.f4656a.f4666c = i;
            if (this.f4656a.f4667e) {
                this.f4656a.f4673k.setCurrentTab(i);
            }
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.5 */
    class C06835 implements OnClickListener {
        final /* synthetic */ MainActivity f4657a;

        C06835(MainActivity mainActivity) {
            this.f4657a = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.6 */
    class C06846 implements OnClickListener {
        final /* synthetic */ BuyinControlMsg f4658a;
        final /* synthetic */ MainActivity f4659b;

        C06846(MainActivity mainActivity, BuyinControlMsg buyinControlMsg) {
            this.f4659b = mainActivity;
            this.f4658a = buyinControlMsg;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(this.f4658a.getStGameRoomInfo().getStSNGGameRoomBaseInfo().getLGameRoomId());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.7 */
    class C06857 implements OnClickListener {
        final /* synthetic */ MainActivity f4660a;

        C06857(MainActivity mainActivity) {
            this.f4660a = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MainActivity.a */
    private class C0686a {
        View f4661a;
        View f4662b;
        TextView f4663c;
        final /* synthetic */ MainActivity f4664d;

        private C0686a(MainActivity mainActivity) {
            this.f4664d = mainActivity;
        }

        public final void m3202a(long j, boolean z) {
            if (z) {
                this.f4662b.setVisibility(4);
                this.f4663c.setVisibility(4);
                this.f4661a.setVisibility(0);
                return;
            }
            this.f4661a.setVisibility(4);
            if (j > 0) {
                if (j > 99) {
                    this.f4663c.setText("\u22c5\u22c5\u22c5");
                } else {
                    this.f4663c.setText(String.valueOf(j));
                }
                this.f4662b.setVisibility(0);
                this.f4663c.setVisibility(0);
                return;
            }
            this.f4663c.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            this.f4662b.setVisibility(4);
            this.f4663c.setVisibility(4);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{3621, 3622, 3623, 3624, 3625, 3626, 3627, 3628, 3629, 3630, 3631, 3632, 3633, 3634, 3635, 3636});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3207f();

    private native void m3208g();

    private native void m3209h();

    public final native void m3210a(String str, List<Object> list);

    public final native void m3211c();

    public final native void m3212d();

    public final native void m3213e();

    protected native void onCreate(Bundle bundle);

    public native boolean onCreateOptionsMenu(Menu menu);

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    protected native void onNewIntent(Intent intent);

    public native boolean onOptionsItemSelected(MenuItem menuItem);

    protected native void onPause();

    protected native void onResume();

    public native void startActivity(Intent intent);

    static void __clinit__() {
        f4665d = "MainActivity";
    }
}
