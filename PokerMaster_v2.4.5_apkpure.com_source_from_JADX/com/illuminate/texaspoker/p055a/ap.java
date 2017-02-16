package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.SNGBlindsStructure;
import java.util.List;

/* compiled from: SngBlindListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ap */
public final class ap extends BaseAdapter {
    private List<SNGBlindsStructure[]> f2942a;
    private Context f2943b;
    private long f2944c;

    /* renamed from: com.illuminate.texaspoker.a.ap.a */
    public final class SngBlindListAdapter {
        public TextView f2937a;
        public TextView f2938b;
        public TextView f2939c;
        public TextView f2940d;
        final /* synthetic */ ap f2941e;

        public SngBlindListAdapter(ap apVar) {
            this.f2941e = apVar;
        }
    }

    public ap(Context context, List<SNGBlindsStructure[]> list) {
        this.f2943b = context;
        this.f2942a = list;
        this.f2944c = (long) list.size();
    }

    public final int getCount() {
        return this.f2942a.size();
    }

    public final Object getItem(int i) {
        return this.f2942a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SngBlindListAdapter sngBlindListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2943b).inflate(2130968823, null);
            sngBlindListAdapter = new SngBlindListAdapter(this);
            sngBlindListAdapter.f2937a = (TextView) view.findViewById(2131559382);
            sngBlindListAdapter.f2938b = (TextView) view.findViewById(2131559383);
            sngBlindListAdapter.f2939c = (TextView) view.findViewById(2131559384);
            sngBlindListAdapter.f2940d = (TextView) view.findViewById(2131559385);
            view.setTag(sngBlindListAdapter);
        } else {
            sngBlindListAdapter = (SngBlindListAdapter) view.getTag();
        }
        SNGBlindsStructure[] sNGBlindsStructureArr = (SNGBlindsStructure[]) this.f2942a.get(i);
        SNGBlindsStructure sNGBlindsStructure = sNGBlindsStructureArr[0];
        SNGBlindsStructure sNGBlindsStructure2 = sNGBlindsStructureArr[1];
        sngBlindListAdapter.f2937a.setText((i + 1));
        CharSequence charSequence = Utility.m4508i(sNGBlindsStructure.getLSNGSmallBlinds()) + "/" + Utility.m4508i(sNGBlindsStructure.getLSNGBigBlinds());
        if (sNGBlindsStructure.getLSNGAnte() != 0) {
            charSequence = charSequence + "(" + Utility.m4508i(sNGBlindsStructure.getLSNGAnte()) + ")";
        }
        sngBlindListAdapter.f2938b.setText(charSequence);
        if (sNGBlindsStructure2 != null) {
            sngBlindListAdapter.f2939c.setText(((this.f2944c + ((long) i)) + 1));
            charSequence = Utility.m4508i(sNGBlindsStructure2.getLSNGSmallBlinds()) + "/" + Utility.m4508i(sNGBlindsStructure2.getLSNGBigBlinds());
            if (sNGBlindsStructure2.getLSNGAnte() != 0) {
                charSequence = charSequence + "(" + Utility.m4508i(sNGBlindsStructure2.getLSNGAnte()) + ")";
            }
            sngBlindListAdapter.f2940d.setText(charSequence);
        } else {
            sngBlindListAdapter.f2939c.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            sngBlindListAdapter.f2940d.setText(LetterIndexBar.SEARCH_ICON_LETTER);
        }
        return view;
    }
}
