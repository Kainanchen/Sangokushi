package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ClubFundLog;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.h */
public final class ClubFundListAdapter extends BaseAdapter {
    private LayoutInflater f3281a;
    private int f3282b;
    private List<ClubFundLog> f3283c;
    private Context f3284d;
    private SimpleDateFormat f3285e;

    /* renamed from: com.illuminate.texaspoker.a.h.a */
    public final class ClubFundListAdapter {
        public TextView f3271a;
        public TextView f3272b;
        public TextView f3273c;
        public View f3274d;
        public LinearLayout f3275e;
        public View f3276f;
        public SimpleDraweeView f3277g;
        public TextView f3278h;
        public TextView f3279i;
        final /* synthetic */ ClubFundListAdapter f3280j;

        public ClubFundListAdapter(ClubFundListAdapter clubFundListAdapter) {
            this.f3280j = clubFundListAdapter;
        }
    }

    public ClubFundListAdapter(Context context, List<ClubFundLog> list) {
        this.f3284d = context;
        this.f3281a = LayoutInflater.from(this.f3284d);
        this.f3283c = list;
        this.f3285e = new SimpleDateFormat(context.getString(2131165232));
        this.f3282b = 0;
    }

    public final int getCount() {
        return this.f3283c.size();
    }

    public final Object getItem(int i) {
        return this.f3283c.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ClubFundListAdapter clubFundListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3284d).inflate(2130968749, null);
            clubFundListAdapter = new ClubFundListAdapter(this);
            clubFundListAdapter.f3271a = (TextView) view.findViewById(2131559043);
            clubFundListAdapter.f3272b = (TextView) view.findViewById(2131559044);
            clubFundListAdapter.f3273c = (TextView) view.findViewById(2131558643);
            clubFundListAdapter.f3274d = view.findViewById(2131559046);
            clubFundListAdapter.f3275e = (LinearLayout) view.findViewById(2131558634);
            clubFundListAdapter.f3276f = view.findViewById(2131559131);
            clubFundListAdapter.f3277g = (SimpleDraweeView) view.findViewById(2131559132);
            clubFundListAdapter.f3278h = (TextView) view.findViewById(2131559133);
            clubFundListAdapter.f3279i = (TextView) view.findViewById(2131559134);
            view.setTag(clubFundListAdapter);
        } else {
            clubFundListAdapter = (ClubFundListAdapter) view.getTag();
        }
        if (!DBManager.m3631a().m3632b()) {
            ClubFundLog clubFundLog = (ClubFundLog) this.f3283c.get(i);
            clubFundListAdapter.f3271a.setText(this.f3285e.format(new Date(clubFundLog.f5788e.longValue())));
            clubFundListAdapter.f3272b.setText(clubFundLog.f5792i);
            clubFundListAdapter.f3275e.removeAllViews();
            if (clubFundLog.f5786c.intValue() == 1) {
                clubFundListAdapter.f3273c.setText("+" + Utility.m4502g(clubFundLog.f5789f.longValue()));
                clubFundListAdapter.f3273c.setTextColor(-73826);
                clubFundListAdapter.f3274d.setVisibility(0);
                clubFundListAdapter.f3276f.setVisibility(4);
            } else if (clubFundLog.f5786c.intValue() == 3) {
                clubFundListAdapter.f3273c.setText("+" + Utility.m4502g(clubFundLog.f5789f.longValue()));
                clubFundListAdapter.f3273c.setTextColor(-73826);
                clubFundListAdapter.f3274d.setVisibility(4);
                clubFundListAdapter.f3276f.setVisibility(0);
                if (!StringUtils.m4462a(clubFundLog.f5791h)) {
                    r2 = DBManager.m3631a().f5563c.m3639a(Long.parseLong(clubFundLog.f5791h.split(",")[0]));
                    if (r2.f5832k.intValue() == 1) {
                        ((GenericDraweeHierarchy) clubFundListAdapter.f3277g.getHierarchy()).m1407a(2130903198);
                    } else {
                        ((GenericDraweeHierarchy) clubFundListAdapter.f3277g.getHierarchy()).m1407a(2130903193);
                    }
                    clubFundListAdapter.f3277g.setImageURI(Uri.parse(r2.f5836o));
                    clubFundListAdapter.f3278h.setText(this.f3284d.getResources().getString(2131165390));
                    clubFundListAdapter.f3278h.setTextColor(-73826);
                    clubFundListAdapter.f3279i.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                }
            } else {
                clubFundListAdapter.f3273c.setText("-" + Utility.m4502g(clubFundLog.f5789f.longValue()));
                clubFundListAdapter.f3273c.setTextColor(-1579033);
                clubFundListAdapter.f3274d.setVisibility(4);
                clubFundListAdapter.f3276f.setVisibility(0);
                if (!StringUtils.m4462a(clubFundLog.f5791h)) {
                    r2 = DBManager.m3631a().f5563c.m3639a(Long.parseLong(clubFundLog.f5791h.split(",")[0]));
                    if (r2.f5832k.intValue() == 1) {
                        ((GenericDraweeHierarchy) clubFundListAdapter.f3277g.getHierarchy()).m1407a(2130903198);
                    } else {
                        ((GenericDraweeHierarchy) clubFundListAdapter.f3277g.getHierarchy()).m1407a(2130903193);
                    }
                    clubFundListAdapter.f3277g.setImageURI(Uri.parse(r2.f5836o));
                    clubFundListAdapter.f3278h.setText(r2.f5838q);
                    clubFundListAdapter.f3278h.setTextColor(-6316386);
                    clubFundListAdapter.f3279i.setText(this.f3284d.getResources().getString(2131165351));
                    clubFundListAdapter.f3279i.setTextColor(-6316386);
                }
            }
        }
        return view;
    }
}
