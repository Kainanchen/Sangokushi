package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.texaspoker.moment.TexasPoker.UserGameInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import java.util.List;

/* compiled from: SngDetailPlayerListAdapter */
/* renamed from: com.illuminate.texaspoker.a.aq */
public final class aq extends BaseAdapter {
    private List<UserGameInfoNet> f2949a;
    private Context f2950b;

    /* renamed from: com.illuminate.texaspoker.a.aq.a */
    public final class SngDetailPlayerListAdapter {
        public TextView f2945a;
        public SimpleDraweeView f2946b;
        public TextView f2947c;
        final /* synthetic */ aq f2948d;

        static {
            fixHelper.fixfunc(new int[]{1726, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native SngDetailPlayerListAdapter(aq aqVar);
    }

    public aq(Context context, List<UserGameInfoNet> list) {
        this.f2950b = context;
        this.f2949a = list;
    }

    public final int getCount() {
        return this.f2949a.size();
    }

    public final Object getItem(int i) {
        return this.f2949a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SngDetailPlayerListAdapter sngDetailPlayerListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2950b).inflate(2130968826, null);
            sngDetailPlayerListAdapter = new SngDetailPlayerListAdapter(this);
            sngDetailPlayerListAdapter.f2945a = (TextView) view.findViewById(2131559388);
            sngDetailPlayerListAdapter.f2946b = (SimpleDraweeView) view.findViewById(2131559389);
            sngDetailPlayerListAdapter.f2947c = (TextView) view.findViewById(2131559390);
            view.setTag(sngDetailPlayerListAdapter);
        } else {
            sngDetailPlayerListAdapter = (SngDetailPlayerListAdapter) view.getTag();
        }
        UserBaseInfoNet stUserInfo = ((UserGameInfoNet) this.f2949a.get(i)).getStUserInfo();
        sngDetailPlayerListAdapter.f2945a.setText((i + 1));
        if (stUserInfo.getIGender() == 1) {
            ((GenericDraweeHierarchy) sngDetailPlayerListAdapter.f2946b.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) sngDetailPlayerListAdapter.f2946b.getHierarchy()).m1407a(2130903193);
        }
        sngDetailPlayerListAdapter.f2946b.setImageURI(Uri.parse(stUserInfo.getStrSmallCover()));
        sngDetailPlayerListAdapter.f2947c.setText(stUserInfo.getStrNick());
        return view;
    }
}
