package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.ali.fixHelper;
import com.facebook.drawee.p024a.p025a.Fresco;
import com.facebook.drawee.p024a.p025a.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.b */
public final class AlbumPagerAdapter extends PagerAdapter {
    private Context f3002a;
    private int f3003b;
    private int f3004c;
    private long f3005d;
    private boolean f3006e;
    private List<String> f3007f;
    private List<String> f3008g;

    /* renamed from: com.illuminate.texaspoker.a.b.1 */
    class AlbumPagerAdapter implements OnClickListener {
        final /* synthetic */ int f3000a;
        final /* synthetic */ AlbumPagerAdapter f3001b;

        static {
            fixHelper.fixfunc(new int[]{599, 600});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native AlbumPagerAdapter(AlbumPagerAdapter albumPagerAdapter, int i);

        public final native void onClick(View view);
    }

    public AlbumPagerAdapter(Context context, int i, List<String> list, List<String> list2, int i2, long j) {
        this.f3002a = context;
        this.f3003b = i;
        this.f3007f = list;
        this.f3008g = list2;
        this.f3004c = i2;
        this.f3005d = j;
        this.f3006e = true;
    }

    public final int getCount() {
        return this.f3007f.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f3002a).inflate(2130968725, null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(2131559013);
        LayoutParams layoutParams = (LayoutParams) simpleDraweeView.getLayoutParams();
        layoutParams.height = this.f3003b;
        layoutParams.width = this.f3003b;
        simpleDraweeView.setLayoutParams(layoutParams);
        simpleDraweeView.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.m1211a().m1270b((Object) ImageRequest.m2328a((String) this.f3007f.get(i)))).m1268a((Object) ImageRequest.m2328a((String) this.f3008g.get(i)))).m1267a(simpleDraweeView.getController())).m1272c());
        viewGroup.addView(inflate);
        simpleDraweeView.setOnClickListener(new AlbumPagerAdapter(this, i));
        return inflate;
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
