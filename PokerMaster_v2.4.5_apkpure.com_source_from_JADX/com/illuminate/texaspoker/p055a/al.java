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
import java.util.Map;

/* compiled from: RechargeForGoogleListAdapter */
/* renamed from: com.illuminate.texaspoker.a.al */
public final class al extends BaseAdapter {
    private Map<String, String> f2919a;
    private Context f2920b;

    /* renamed from: com.illuminate.texaspoker.a.al.a */
    public final class RechargeForGoogleListAdapter {
        public SimpleDraweeView f2914a;
        public TextView f2915b;
        public TextView f2916c;
        public TextView f2917d;
        final /* synthetic */ al f2918e;

        public RechargeForGoogleListAdapter(al alVar) {
            this.f2918e = alVar;
        }
    }

    public al(Context context, Map<String, String> map) {
        this.f2920b = context;
        this.f2919a = map;
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
        RechargeForGoogleListAdapter rechargeForGoogleListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2920b).inflate(2130968761, null);
            RechargeForGoogleListAdapter rechargeForGoogleListAdapter2 = new RechargeForGoogleListAdapter(this);
            rechargeForGoogleListAdapter2.f2914a = (SimpleDraweeView) view.findViewById(2131558923);
            rechargeForGoogleListAdapter2.f2915b = (TextView) view.findViewById(2131558924);
            rechargeForGoogleListAdapter2.f2916c = (TextView) view.findViewById(2131559160);
            rechargeForGoogleListAdapter2.f2917d = (TextView) view.findViewById(2131559161);
            view.setTag(rechargeForGoogleListAdapter2);
            rechargeForGoogleListAdapter = rechargeForGoogleListAdapter2;
        } else {
            rechargeForGoogleListAdapter = (RechargeForGoogleListAdapter) view.getTag();
        }
        CoinStoreItemInfo coinStoreItemInfo = (CoinStoreItemInfo) RuntimeData.f6680k.get(i);
        if (StringUtils.m4462a(coinStoreItemInfo.getSCoinStoreItemIcon())) {
            rechargeForGoogleListAdapter.f2914a.setImageURI(Uri.parse("res://com.illuminate.texaspoker/2130903578"));
        } else {
            rechargeForGoogleListAdapter.f2914a.setImageURI(Uri.parse(coinStoreItemInfo.getSCoinStoreItemIcon()));
        }
        rechargeForGoogleListAdapter.f2915b.setText(coinStoreItemInfo.getSCoinStoreItemName());
        rechargeForGoogleListAdapter.f2916c.setText(coinStoreItemInfo.getSCoinStoreItemDescription());
        CharSequence charSequence = (String) this.f2919a.get(coinStoreItemInfo.getSProductID());
        if (StringUtils.m4462a(charSequence)) {
            rechargeForGoogleListAdapter.f2917d.setText(coinStoreItemInfo.getSDisplayPrice());
        } else {
            rechargeForGoogleListAdapter.f2917d.setText(charSequence);
        }
        return view;
    }
}
