package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.illuminate.texaspoker.p058c.SellItem;
import com.illuminate.texaspoker.utils.StringUtils;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: StoreListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ar */
public final class ar extends BaseAdapter {
    public List f2958a;
    private Context f2959b;

    /* renamed from: com.illuminate.texaspoker.a.ar.a */
    public final class StoreListAdapter {
        public ImageView f2951a;
        public ImageView f2952b;
        public TextView f2953c;
        public TextView f2954d;
        public TextView f2955e;
        public TextView f2956f;
        final /* synthetic */ ar f2957g;

        public StoreListAdapter(ar arVar) {
            this.f2957g = arVar;
        }
    }

    public ar(Context context) {
        this.f2959b = context;
    }

    public final int getCount() {
        return this.f2958a.size();
    }

    public final Object getItem(int i) {
        return this.f2958a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        StoreListAdapter storeListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2959b).inflate(2130968831, null);
            storeListAdapter = new StoreListAdapter(this);
            storeListAdapter.f2951a = (ImageView) view.findViewById(2131559408);
            storeListAdapter.f2952b = (ImageView) view.findViewById(2131559409);
            storeListAdapter.f2953c = (TextView) view.findViewById(2131559410);
            storeListAdapter.f2954d = (TextView) view.findViewById(2131559411);
            storeListAdapter.f2955e = (TextView) view.findViewById(2131558547);
            storeListAdapter.f2956f = (TextView) view.findViewById(2131559412);
            view.setTag(storeListAdapter);
        } else {
            storeListAdapter = (StoreListAdapter) view.getTag();
        }
        SellItem sellItem = (SellItem) this.f2958a.get(i);
        if (StringUtils.m4462a(sellItem.f5988h)) {
            storeListAdapter.f2952b.setVisibility(4);
            storeListAdapter.f2953c.setVisibility(4);
        } else {
            storeListAdapter.f2952b.setVisibility(0);
            storeListAdapter.f2953c.setVisibility(0);
            storeListAdapter.f2953c.setText(sellItem.f5988h);
        }
        storeListAdapter.f2955e.setText(sellItem.f5990j);
        switch (sellItem.f5984d.intValue()) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                storeListAdapter.f2956f.setText(sellItem.f5986f);
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                storeListAdapter.f2956f.setText(sellItem.f5986f);
                break;
        }
        storeListAdapter.f2954d.setText(sellItem.f5991k);
        String str = sellItem.f5989i;
        if (str != null && str.length() > 0) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf >= 0 && lastIndexOf < str.length()) {
                str = str.substring(0, lastIndexOf);
            }
        }
        storeListAdapter.f2951a.setImageResource(this.f2959b.getResources().getIdentifier(str, "mipmap", this.f2959b.getApplicationInfo().packageName));
        return view;
    }
}
