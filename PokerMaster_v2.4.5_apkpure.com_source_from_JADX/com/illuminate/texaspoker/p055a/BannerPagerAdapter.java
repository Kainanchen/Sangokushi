package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.WebActivity;
import com.illuminate.texaspoker.p058c.Banner;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.a.c */
public final class BannerPagerAdapter extends PagerAdapter implements OnPageChangeListener {
    private List<Banner> f3014a;
    private Context f3015b;
    private LayoutInflater f3016c;
    private ViewPager f3017d;

    /* renamed from: com.illuminate.texaspoker.a.c.1 */
    class BannerPagerAdapter extends Handler {
        final /* synthetic */ BannerPagerAdapter f3009a;

        BannerPagerAdapter(BannerPagerAdapter bannerPagerAdapter) {
            this.f3009a = bannerPagerAdapter;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    int count = this.f3009a.getCount();
                    if (this.f3009a.f3014a != null && count > 2) {
                        this.f3009a.f3017d.setCurrentItem(this.f3009a.f3017d.getCurrentItem() + 1, true);
                    }
                default:
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.c.2 */
    class BannerPagerAdapter extends TimerTask {
        final /* synthetic */ Handler f3010a;
        final /* synthetic */ BannerPagerAdapter f3011b;

        BannerPagerAdapter(BannerPagerAdapter bannerPagerAdapter, Handler handler) {
            this.f3011b = bannerPagerAdapter;
            this.f3010a = handler;
        }

        public final void run() {
            Message message = new Message();
            message.what = 1;
            this.f3010a.sendMessage(message);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.c.3 */
    class BannerPagerAdapter implements OnClickListener {
        final /* synthetic */ Banner f3012a;
        final /* synthetic */ BannerPagerAdapter f3013b;

        BannerPagerAdapter(BannerPagerAdapter bannerPagerAdapter, Banner banner) {
            this.f3013b = bannerPagerAdapter;
            this.f3012a = banner;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f3013b.f3015b, WebActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(ParamKey.URL, this.f3012a.f5616d);
            bundle.putInt("titleId", 2131165447);
            intent.putExtras(bundle);
            this.f3013b.f3015b.startActivity(intent);
        }
    }

    public BannerPagerAdapter(Context context, List<Banner> list, ViewPager viewPager) {
        this.f3016c = LayoutInflater.from(context);
        this.f3014a = list;
        this.f3015b = context;
        this.f3017d = viewPager;
        new Timer().schedule(new BannerPagerAdapter(this, new BannerPagerAdapter(this)), 0, 10000);
    }

    public final int getCount() {
        if (this.f3014a.size() > 1) {
            return this.f3014a.size() + 2;
        }
        return this.f3014a.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Banner banner;
        View inflate = this.f3016c.inflate(2130968724, null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(2131559016);
        if (i == 0 && getCount() > 3) {
            banner = (Banner) this.f3014a.get(this.f3014a.size() - 1);
        } else if (i == getCount() - 1 && getCount() > 3) {
            banner = (Banner) this.f3014a.get(0);
        } else if (getCount() > 3) {
            banner = (Banner) this.f3014a.get(i - 1);
        } else {
            banner = (Banner) this.f3014a.get(i);
        }
        simpleDraweeView.setImageURI(Uri.parse(banner.f5615c));
        viewGroup.addView(inflate);
        simpleDraweeView.setOnClickListener(new BannerPagerAdapter(this, banner));
        return inflate;
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 0 && getCount() > 3) {
            if (this.f3017d.getCurrentItem() <= 0) {
                this.f3017d.setCurrentItem(this.f3014a.size(), false);
            } else if (this.f3017d.getCurrentItem() > this.f3014a.size()) {
                this.f3017d.setCurrentItem(1, false);
            }
        }
    }
}
