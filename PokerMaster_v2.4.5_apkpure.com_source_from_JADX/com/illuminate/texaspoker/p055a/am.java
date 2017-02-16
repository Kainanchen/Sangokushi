package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.texaspoker.moment.TexasPokerHttpTransaction.CoinStoreItemInfo;

/* compiled from: RechargeListAdapter */
/* renamed from: com.illuminate.texaspoker.a.am */
public final class am extends BaseAdapter {
    private Context f2926a;

    /* renamed from: com.illuminate.texaspoker.a.am.a */
    public final class RechargeListAdapter {
        public SimpleDraweeView f2921a;
        public TextView f2922b;
        public TextView f2923c;
        public TextView f2924d;
        final /* synthetic */ am f2925e;

        public RechargeListAdapter(am amVar) {
            this.f2925e = amVar;
        }
    }

    public am(Context context) {
        this.f2926a = context;
    }

    public final int getCount() {
        return RuntimeData.f6680k.size();
    }

    public final Object getItem(int i) {
        return RuntimeData.f6680k.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        RechargeListAdapter rechargeListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2926a).inflate(2130968761, null);
            rechargeListAdapter = new RechargeListAdapter(this);
            rechargeListAdapter.f2921a = (SimpleDraweeView) view.findViewById(2131558923);
            rechargeListAdapter.f2922b = (TextView) view.findViewById(2131558924);
            rechargeListAdapter.f2923c = (TextView) view.findViewById(2131559160);
            rechargeListAdapter.f2924d = (TextView) view.findViewById(2131559161);
            view.setTag(rechargeListAdapter);
        } else {
            rechargeListAdapter = (RechargeListAdapter) view.getTag();
        }
        CoinStoreItemInfo coinStoreItemInfo = (CoinStoreItemInfo) RuntimeData.f6680k.get(i);
        if (StringUtils.m4462a(coinStoreItemInfo.getSCoinStoreItemIcon())) {
            rechargeListAdapter.f2921a.setImageURI(Uri.parse("res://com.illuminate.texaspoker/2130903578"));
        } else {
            rechargeListAdapter.f2921a.setImageURI(Uri.parse(coinStoreItemInfo.getSCoinStoreItemIcon()));
        }
        rechargeListAdapter.f2922b.setText(coinStoreItemInfo.getSCoinStoreItemName());
        rechargeListAdapter.f2923c.setText(coinStoreItemInfo.getSCoinStoreItemDescription());
        rechargeListAdapter.f2924d.setText(coinStoreItemInfo.getSDisplayPrice());
        return view;
    }
}
