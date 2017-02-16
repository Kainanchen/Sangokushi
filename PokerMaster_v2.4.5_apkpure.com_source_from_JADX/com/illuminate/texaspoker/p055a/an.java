package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.illuminate.texaspoker.p059d.Country;
import java.util.List;

/* compiled from: SelectCountryListAdapter */
/* renamed from: com.illuminate.texaspoker.a.an */
public final class an extends BaseAdapter {
    private LayoutInflater f2930a;
    private List<Country> f2931b;
    private Context f2932c;

    /* renamed from: com.illuminate.texaspoker.a.an.a */
    public final class SelectCountryListAdapter {
        public TextView f2927a;
        public TextView f2928b;
        final /* synthetic */ an f2929c;

        public SelectCountryListAdapter(an anVar) {
            this.f2929c = anVar;
        }
    }

    public an(Context context, List<Country> list) {
        this.f2932c = context;
        this.f2930a = LayoutInflater.from(this.f2932c);
        this.f2931b = list;
    }

    public final int getCount() {
        return this.f2931b.size();
    }

    public final Object getItem(int i) {
        return this.f2931b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SelectCountryListAdapter selectCountryListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2932c).inflate(2130968818, null);
            selectCountryListAdapter = new SelectCountryListAdapter(this);
            selectCountryListAdapter.f2927a = (TextView) view.findViewById(2131558724);
            selectCountryListAdapter.f2928b = (TextView) view.findViewById(2131559346);
            view.setTag(selectCountryListAdapter);
        } else {
            selectCountryListAdapter = (SelectCountryListAdapter) view.getTag();
        }
        Country country = (Country) this.f2931b.get(i);
        selectCountryListAdapter.f2927a.setText(country.f6039a);
        selectCountryListAdapter.f2928b.setText("+" + country.f6041c);
        return view;
    }
}
