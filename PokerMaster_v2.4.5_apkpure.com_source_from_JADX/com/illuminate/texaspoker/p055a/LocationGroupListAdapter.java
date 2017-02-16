package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.illuminate.texaspoker.p059d.City;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.Location;
import com.illuminate.texaspoker.p059d.State;
import com.illuminate.texaspoker.utils.MapList;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.z */
public final class LocationGroupListAdapter extends BaseExpandableListAdapter implements SectionIndexer {
    private MapList<String, List<Location>> f3491a;
    private Context f3492b;
    private boolean f3493c;

    /* renamed from: com.illuminate.texaspoker.a.z.a */
    public final class LocationGroupListAdapter {
        public TextView f3486a;
        final /* synthetic */ LocationGroupListAdapter f3487b;

        public LocationGroupListAdapter(LocationGroupListAdapter locationGroupListAdapter) {
            this.f3487b = locationGroupListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.z.b */
    public final class LocationGroupListAdapter {
        public TextView f3488a;
        public ImageView f3489b;
        final /* synthetic */ LocationGroupListAdapter f3490c;

        public LocationGroupListAdapter(LocationGroupListAdapter locationGroupListAdapter) {
            this.f3490c = locationGroupListAdapter;
        }
    }

    public LocationGroupListAdapter(Context context, MapList<String, List<Location>> mapList) {
        this.f3492b = context;
        this.f3491a = mapList;
        this.f3493c = false;
    }

    public final int getGroupCount() {
        return this.f3491a.m4238a();
    }

    public final int getChildrenCount(int i) {
        return ((List) this.f3491a.m4239a(i)).size();
    }

    public final Object getGroup(int i) {
        return this.f3491a.m4239a(i);
    }

    public final Object getChild(int i, int i2) {
        return ((List) this.f3491a.m4239a(i)).get(i2);
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
        LocationGroupListAdapter locationGroupListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3492b).inflate(2130968797, null);
            locationGroupListAdapter = new LocationGroupListAdapter(this);
            locationGroupListAdapter.f3486a = (TextView) view.findViewById(2131559139);
            view.setTag(locationGroupListAdapter);
        } else {
            locationGroupListAdapter = (LocationGroupListAdapter) view.getTag();
        }
        locationGroupListAdapter.f3486a.setText((String) this.f3491a.f6665a.get(i));
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        LocationGroupListAdapter locationGroupListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3492b).inflate(2130968789, null);
            locationGroupListAdapter = new LocationGroupListAdapter(this);
            locationGroupListAdapter.f3488a = (TextView) view.findViewById(2131559252);
            locationGroupListAdapter.f3489b = (ImageView) view.findViewById(2131559253);
            view.setTag(locationGroupListAdapter);
        } else {
            locationGroupListAdapter = (LocationGroupListAdapter) view.getTag();
        }
        Location location = (Location) ((List) this.f3491a.m4239a(i)).get(i2);
        locationGroupListAdapter.f3488a.setText(location.f6024d);
        if (location instanceof CountryRegion) {
            if (((CountryRegion) location).f6042a.size() == 0) {
                locationGroupListAdapter.f3489b.setVisibility(4);
            } else {
                locationGroupListAdapter.f3489b.setVisibility(0);
            }
        } else if (location instanceof State) {
            if (((State) location).f6051b.size() == 0 || !this.f3493c) {
                locationGroupListAdapter.f3489b.setVisibility(4);
            } else {
                locationGroupListAdapter.f3489b.setVisibility(0);
            }
        } else if (location instanceof City) {
            locationGroupListAdapter.f3489b.setVisibility(4);
        }
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final Object[] getSections() {
        return null;
    }

    public final int getPositionForSection(int i) {
        for (int i2 = 0; i2 < this.f3491a.m4238a(); i2++) {
            if (((String) this.f3491a.f6665a.get(i2)).charAt(0) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int getSectionForPosition(int i) {
        return i;
    }
}
