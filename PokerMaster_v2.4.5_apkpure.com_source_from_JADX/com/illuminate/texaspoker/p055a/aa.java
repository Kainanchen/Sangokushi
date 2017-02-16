package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.illuminate.texaspoker.p059d.City;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.Location;
import com.illuminate.texaspoker.p059d.State;
import java.util.List;

/* compiled from: LocationListAdapter */
/* renamed from: com.illuminate.texaspoker.a.aa */
public final class aa extends BaseAdapter {
    private List<Location> f2804a;
    private Context f2805b;
    private boolean f2806c;

    /* renamed from: com.illuminate.texaspoker.a.aa.a */
    public final class LocationListAdapter {
        public TextView f2801a;
        public ImageView f2802b;
        final /* synthetic */ aa f2803c;

        public LocationListAdapter(aa aaVar) {
            this.f2803c = aaVar;
        }
    }

    public aa(Context context, List<Location> list, boolean z) {
        this.f2805b = context;
        this.f2804a = list;
        this.f2806c = z;
    }

    public final int getCount() {
        return this.f2804a.size();
    }

    public final Object getItem(int i) {
        return this.f2804a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        LocationListAdapter locationListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2805b).inflate(2130968789, null);
            locationListAdapter = new LocationListAdapter(this);
            locationListAdapter.f2801a = (TextView) view.findViewById(2131559252);
            locationListAdapter.f2802b = (ImageView) view.findViewById(2131559253);
            view.setTag(locationListAdapter);
        } else {
            locationListAdapter = (LocationListAdapter) view.getTag();
        }
        Location location = (Location) this.f2804a.get(i);
        locationListAdapter.f2801a.setText(location.f6024d);
        if (location instanceof CountryRegion) {
            if (((CountryRegion) location).f6042a.size() == 0) {
                locationListAdapter.f2802b.setVisibility(4);
            } else {
                locationListAdapter.f2802b.setVisibility(0);
            }
        } else if (location instanceof State) {
            if (((State) location).f6051b.size() == 0 || !this.f2806c) {
                locationListAdapter.f2802b.setVisibility(4);
            } else {
                locationListAdapter.f2802b.setVisibility(0);
            }
        } else if (location instanceof City) {
            locationListAdapter.f2802b.setVisibility(4);
        }
        return view;
    }
}
