package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: PokerHistoryListAdapter */
/* renamed from: com.illuminate.texaspoker.a.aj */
public final class aj extends BaseAdapter {
    private List<PokerHistory> f2908a;
    private Context f2909b;

    /* renamed from: com.illuminate.texaspoker.a.aj.a */
    public final class PokerHistoryListAdapter {
        public ImageView f2890a;
        public ImageView f2891b;
        public TextView f2892c;
        public TextView f2893d;
        public TextView f2894e;
        public TextView f2895f;
        public TextView f2896g;
        final /* synthetic */ aj f2897h;

        static {
            fixHelper.fixfunc(new int[]{1729, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native PokerHistoryListAdapter(aj ajVar);
    }

    /* renamed from: com.illuminate.texaspoker.a.aj.b */
    public final class PokerHistoryListAdapter {
        public ImageView f2898a;
        public ImageView f2899b;
        public ImageView f2900c;
        public ImageView f2901d;
        public TextView f2902e;
        public TextView f2903f;
        public TextView f2904g;
        public TextView f2905h;
        public TextView f2906i;
        final /* synthetic */ aj f2907j;

        static {
            fixHelper.fixfunc(new int[]{1539, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native PokerHistoryListAdapter(aj ajVar);
    }

    public aj(Context context, List<PokerHistory> list) {
        this.f2909b = context;
        this.f2908a = list;
    }

    public final int getCount() {
        return this.f2908a.size();
    }

    public final Object getItem(int i) {
        return this.f2908a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getItemViewType(int i) {
        if (((PokerHistory) this.f2908a.get(i)).f5962h.booleanValue()) {
            return 1;
        }
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2130903493;
        PokerHistory pokerHistory;
        int i3;
        String i4;
        String i5;
        switch (getItemViewType(i)) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                PokerHistoryListAdapter pokerHistoryListAdapter;
                if (view == null) {
                    view = LayoutInflater.from(this.f2909b).inflate(2130968812, null);
                    pokerHistoryListAdapter = new PokerHistoryListAdapter(this);
                    pokerHistoryListAdapter.f2890a = (ImageView) view.findViewById(2131559216);
                    pokerHistoryListAdapter.f2891b = (ImageView) view.findViewById(2131559217);
                    pokerHistoryListAdapter.f2892c = (TextView) view.findViewById(2131559218);
                    pokerHistoryListAdapter.f2894e = (TextView) view.findViewById(2131559219);
                    pokerHistoryListAdapter.f2893d = (TextView) view.findViewById(2131559096);
                    pokerHistoryListAdapter.f2895f = (TextView) view.findViewById(2131559337);
                    pokerHistoryListAdapter.f2896g = (TextView) view.findViewById(2131559338);
                    view.setTag(pokerHistoryListAdapter);
                } else {
                    pokerHistoryListAdapter = (PokerHistoryListAdapter) view.getTag();
                }
                pokerHistory = (PokerHistory) this.f2908a.get(i);
                if (pokerHistory.f5958d == null || pokerHistory.f5958d.intValue() < 0 || pokerHistory.f5958d.intValue() > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5958d);
                }
                pokerHistoryListAdapter.f2890a.setImageResource(i3);
                if (pokerHistory.f5959e != null && pokerHistory.f5959e.intValue() >= 0 && pokerHistory.f5959e.intValue() <= 51) {
                    i2 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5959e);
                }
                pokerHistoryListAdapter.f2891b.setImageResource(i2);
                if (StringUtils.m4462a(pokerHistory.f5954C)) {
                    pokerHistoryListAdapter.f2892c.setText(pokerHistory.f5975u);
                } else {
                    pokerHistoryListAdapter.f2892c.setText(Html.fromHtml(pokerHistory.f5954C));
                }
                if (pokerHistory.f5966l.longValue() > 0) {
                    pokerHistoryListAdapter.f2893d.setText("+" + Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter.f2893d.setTextColor(-2543568);
                } else if (pokerHistory.f5966l.longValue() < 0) {
                    pokerHistoryListAdapter.f2893d.setText(Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter.f2893d.setTextColor(-5395027);
                } else {
                    pokerHistoryListAdapter.f2893d.setText(Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter.f2893d.setTextColor(-14519546);
                }
                i4 = Utility.m4508i(pokerHistory.f5972r.longValue());
                i5 = Utility.m4508i(pokerHistory.f5964j.longValue());
                if (pokerHistory.f5979y == null || pokerHistory.f5979y.intValue() == 0) {
                    pokerHistoryListAdapter.f2894e.setText(i4 + "/" + i5);
                } else {
                    pokerHistoryListAdapter.f2894e.setText(i4 + "/" + i5 + "(" + pokerHistory.f5979y + ")");
                }
                pokerHistoryListAdapter.f2895f.setText(String.format(this.f2909b.getResources().getString(2131165830), new Object[]{Utility.m4502g(pokerHistory.f5980z.longValue())}));
                pokerHistoryListAdapter.f2896g.setText(String.format(this.f2909b.getResources().getString(2131165826), new Object[]{pokerHistory.f5967m}));
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                PokerHistoryListAdapter pokerHistoryListAdapter2;
                if (view == null) {
                    view = LayoutInflater.from(this.f2909b).inflate(2130968813, null);
                    pokerHistoryListAdapter2 = new PokerHistoryListAdapter(this);
                    pokerHistoryListAdapter2.f2898a = (ImageView) view.findViewById(2131559216);
                    pokerHistoryListAdapter2.f2899b = (ImageView) view.findViewById(2131559217);
                    pokerHistoryListAdapter2.f2900c = (ImageView) view.findViewById(2131559223);
                    pokerHistoryListAdapter2.f2901d = (ImageView) view.findViewById(2131559224);
                    pokerHistoryListAdapter2.f2902e = (TextView) view.findViewById(2131559218);
                    pokerHistoryListAdapter2.f2904g = (TextView) view.findViewById(2131559219);
                    pokerHistoryListAdapter2.f2903f = (TextView) view.findViewById(2131559096);
                    pokerHistoryListAdapter2.f2905h = (TextView) view.findViewById(2131559337);
                    pokerHistoryListAdapter2.f2906i = (TextView) view.findViewById(2131559338);
                    view.setTag(pokerHistoryListAdapter2);
                } else {
                    pokerHistoryListAdapter2 = (PokerHistoryListAdapter) view.getTag();
                }
                pokerHistory = (PokerHistory) this.f2908a.get(i);
                if (pokerHistory.f5958d == null || pokerHistory.f5958d.intValue() < 0 || pokerHistory.f5958d.intValue() > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5958d);
                }
                pokerHistoryListAdapter2.f2898a.setImageResource(i3);
                if (pokerHistory.f5959e == null || pokerHistory.f5959e.intValue() < 0 || pokerHistory.f5959e.intValue() > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5959e);
                }
                pokerHistoryListAdapter2.f2899b.setImageResource(i3);
                if (pokerHistory.f5960f == null || pokerHistory.f5960f.intValue() < 0 || pokerHistory.f5960f.intValue() > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5960f);
                }
                pokerHistoryListAdapter2.f2900c.setImageResource(i3);
                if (pokerHistory.f5961g != null && pokerHistory.f5961g.intValue() >= 0 && pokerHistory.f5961g.intValue() <= 51) {
                    i2 = Utility.m4468a(this.f2909b, "poker_" + pokerHistory.f5961g);
                }
                pokerHistoryListAdapter2.f2901d.setImageResource(i2);
                if (StringUtils.m4462a(pokerHistory.f5954C)) {
                    pokerHistoryListAdapter2.f2902e.setText(pokerHistory.f5975u);
                } else {
                    pokerHistoryListAdapter2.f2902e.setText(Html.fromHtml(pokerHistory.f5954C));
                }
                if (pokerHistory.f5966l.longValue() > 0) {
                    pokerHistoryListAdapter2.f2903f.setText("+" + Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter2.f2903f.setTextColor(-2543568);
                } else if (pokerHistory.f5966l.longValue() < 0) {
                    pokerHistoryListAdapter2.f2903f.setText(Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter2.f2903f.setTextColor(-5395027);
                } else {
                    pokerHistoryListAdapter2.f2903f.setText(Utility.m4502g(pokerHistory.f5966l.longValue()));
                    pokerHistoryListAdapter2.f2903f.setTextColor(-14519546);
                }
                i4 = Utility.m4508i(pokerHistory.f5972r.longValue());
                i5 = Utility.m4508i(pokerHistory.f5964j.longValue());
                if (pokerHistory.f5979y == null || pokerHistory.f5979y.intValue() == 0) {
                    pokerHistoryListAdapter2.f2904g.setText(i4 + "/" + i5);
                } else {
                    pokerHistoryListAdapter2.f2904g.setText(i4 + "/" + i5 + "(" + pokerHistory.f5979y + ")");
                }
                pokerHistoryListAdapter2.f2905h.setText(String.format(this.f2909b.getResources().getString(2131165830), new Object[]{Utility.m4502g(pokerHistory.f5980z.longValue())}));
                pokerHistoryListAdapter2.f2906i.setText(String.format(this.f2909b.getResources().getString(2131165826), new Object[]{pokerHistory.f5967m}));
                break;
        }
        return view;
    }
}
