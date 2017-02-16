package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.illuminate.texaspoker.p058c.LeagueClub;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.j */
public final class ClubLeagueExpandableListAdapter extends BaseExpandableListAdapter {
    private Context f3305a;
    private List<Integer> f3306b;
    private List<LeagueClub> f3307c;
    private List<LeagueClub> f3308d;

    /* renamed from: com.illuminate.texaspoker.a.j.a */
    public final class ClubLeagueExpandableListAdapter {
        public TextView f3300a;
        final /* synthetic */ ClubLeagueExpandableListAdapter f3301b;

        public ClubLeagueExpandableListAdapter(ClubLeagueExpandableListAdapter clubLeagueExpandableListAdapter) {
            this.f3301b = clubLeagueExpandableListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.j.b */
    public final class ClubLeagueExpandableListAdapter {
        public TextView f3302a;
        public TextView f3303b;
        final /* synthetic */ ClubLeagueExpandableListAdapter f3304c;

        public ClubLeagueExpandableListAdapter(ClubLeagueExpandableListAdapter clubLeagueExpandableListAdapter) {
            this.f3304c = clubLeagueExpandableListAdapter;
        }
    }

    public ClubLeagueExpandableListAdapter(Context context, List<Integer> list, List<LeagueClub> list2, List<LeagueClub> list3) {
        this.f3305a = context;
        this.f3306b = list;
        this.f3307c = list2;
        this.f3308d = list3;
    }

    public final int getGroupCount() {
        return this.f3306b.size();
    }

    public final int getChildrenCount(int i) {
        if (((Integer) this.f3306b.get(i)).intValue() == 0) {
            return this.f3307c.size();
        }
        return this.f3308d.size();
    }

    public final Object getGroup(int i) {
        if (((Integer) this.f3306b.get(i)).intValue() == 0) {
            return this.f3307c;
        }
        return this.f3308d;
    }

    public final Object getChild(int i, int i2) {
        if (((Integer) this.f3306b.get(i)).intValue() == 0) {
            return this.f3307c.get(i2);
        }
        return this.f3308d.get(i2);
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        ClubLeagueExpandableListAdapter clubLeagueExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3305a).inflate(2130968754, null);
            clubLeagueExpandableListAdapter = new ClubLeagueExpandableListAdapter(this);
            clubLeagueExpandableListAdapter.f3300a = (TextView) view.findViewById(2131559139);
            view.setTag(clubLeagueExpandableListAdapter);
        } else {
            clubLeagueExpandableListAdapter = (ClubLeagueExpandableListAdapter) view.getTag();
        }
        if (((Integer) this.f3306b.get(i)).intValue() == 0) {
            clubLeagueExpandableListAdapter.f3300a.setText(2131165369);
        } else {
            clubLeagueExpandableListAdapter.f3300a.setText(2131165376);
        }
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        ClubLeagueExpandableListAdapter clubLeagueExpandableListAdapter;
        LeagueClub leagueClub;
        if (view == null) {
            view = LayoutInflater.from(this.f3305a).inflate(2130968753, null);
            clubLeagueExpandableListAdapter = new ClubLeagueExpandableListAdapter(this);
            clubLeagueExpandableListAdapter.f3302a = (TextView) view.findViewById(2131558705);
            clubLeagueExpandableListAdapter.f3303b = (TextView) view.findViewById(2131558752);
            view.setTag(clubLeagueExpandableListAdapter);
        } else {
            clubLeagueExpandableListAdapter = (ClubLeagueExpandableListAdapter) view.getTag();
        }
        if (((Integer) this.f3306b.get(i)).intValue() == 0) {
            leagueClub = (LeagueClub) this.f3307c.get(i2);
        } else {
            leagueClub = (LeagueClub) this.f3308d.get(i2);
        }
        clubLeagueExpandableListAdapter.f3302a.setText(leagueClub.m3738a().f5906d);
        clubLeagueExpandableListAdapter.f3303b.setText(leagueClub.m3738a().f5904b);
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
