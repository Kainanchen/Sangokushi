package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p059d.ClubInsurance;
import com.illuminate.texaspoker.p059d.InsuranceDetail;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.w */
public final class InsuranceDetailExpandableListAdapter extends BaseExpandableListAdapter {
    private Context f3461a;
    private List<ClubInsurance> f3462b;

    /* renamed from: com.illuminate.texaspoker.a.w.a */
    public final class InsuranceDetailExpandableListAdapter {
        public TextView f3454a;
        final /* synthetic */ InsuranceDetailExpandableListAdapter f3455b;

        public InsuranceDetailExpandableListAdapter(InsuranceDetailExpandableListAdapter insuranceDetailExpandableListAdapter) {
            this.f3455b = insuranceDetailExpandableListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.w.b */
    public final class InsuranceDetailExpandableListAdapter {
        public SimpleDraweeView f3456a;
        public TextView f3457b;
        public TextView f3458c;
        public View f3459d;
        final /* synthetic */ InsuranceDetailExpandableListAdapter f3460e;

        public InsuranceDetailExpandableListAdapter(InsuranceDetailExpandableListAdapter insuranceDetailExpandableListAdapter) {
            this.f3460e = insuranceDetailExpandableListAdapter;
        }
    }

    public InsuranceDetailExpandableListAdapter(Context context, List<ClubInsurance> list) {
        this.f3461a = context;
        this.f3462b = list;
    }

    public final int getGroupCount() {
        return this.f3462b.size();
    }

    public final int getChildrenCount(int i) {
        return ((ClubInsurance) this.f3462b.get(i)).f6033c.size();
    }

    public final Object getGroup(int i) {
        return (ClubInsurance) this.f3462b.get(i);
    }

    public final Object getChild(int i, int i2) {
        return ((ClubInsurance) this.f3462b.get(i)).f6033c.get(i2);
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
        InsuranceDetailExpandableListAdapter insuranceDetailExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3461a).inflate(2130968781, null);
            insuranceDetailExpandableListAdapter = new InsuranceDetailExpandableListAdapter(this);
            insuranceDetailExpandableListAdapter.f3454a = (TextView) view.findViewById(2131559139);
            view.setTag(insuranceDetailExpandableListAdapter);
        } else {
            insuranceDetailExpandableListAdapter = (InsuranceDetailExpandableListAdapter) view.getTag();
        }
        insuranceDetailExpandableListAdapter.f3454a.setText(((ClubInsurance) this.f3462b.get(i)).f6032b);
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        InsuranceDetailExpandableListAdapter insuranceDetailExpandableListAdapter;
        String str;
        int i3;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (view == null) {
            view = LayoutInflater.from(this.f3461a).inflate(2130968783, null);
            InsuranceDetailExpandableListAdapter insuranceDetailExpandableListAdapter2 = new InsuranceDetailExpandableListAdapter(this);
            insuranceDetailExpandableListAdapter2.f3456a = (SimpleDraweeView) view.findViewById(2131559242);
            insuranceDetailExpandableListAdapter2.f3457b = (TextView) view.findViewById(2131559243);
            insuranceDetailExpandableListAdapter2.f3458c = (TextView) view.findViewById(2131559050);
            insuranceDetailExpandableListAdapter2.f3459d = view.findViewById(2131558847);
            view.setTag(insuranceDetailExpandableListAdapter2);
            insuranceDetailExpandableListAdapter = insuranceDetailExpandableListAdapter2;
        } else {
            insuranceDetailExpandableListAdapter = (InsuranceDetailExpandableListAdapter) view.getTag();
        }
        if (i2 == 0) {
            insuranceDetailExpandableListAdapter.f3459d.setVisibility(8);
        } else {
            insuranceDetailExpandableListAdapter.f3459d.setVisibility(0);
        }
        InsuranceDetail insuranceDetail = (InsuranceDetail) ((ClubInsurance) this.f3462b.get(i)).f6033c.get(i2);
        long j = insuranceDetail.f6048a;
        FriendUser friendUser = null;
        if (!DBManager.m3631a().m3632b()) {
            friendUser = DBManager.m3631a().f5563c.m3639a(j);
        }
        String str2;
        if (friendUser != null) {
            str = friendUser.f5836o;
            int intValue = friendUser.f5832k.intValue();
            str2 = friendUser.f5838q;
            i3 = intValue;
            charSequence = str2;
        } else {
            str = LetterIndexBar.SEARCH_ICON_LETTER;
            String str3 = LetterIndexBar.SEARCH_ICON_LETTER;
            NetworkUtil.m4073a();
            NetworkUtil.m4097a(j, true);
            str2 = str3;
            i3 = 1;
            Object obj = str2;
        }
        if (i3 == 1) {
            ((GenericDraweeHierarchy) insuranceDetailExpandableListAdapter.f3456a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) insuranceDetailExpandableListAdapter.f3456a.getHierarchy()).m1407a(2130903193);
        }
        insuranceDetailExpandableListAdapter.f3456a.setImageURI(Uri.parse(str));
        insuranceDetailExpandableListAdapter.f3457b.setText(charSequence);
        if (insuranceDetail.f6049b > 0) {
            charSequence2 = "+" + Utility.m4502g(insuranceDetail.f6049b);
            insuranceDetailExpandableListAdapter.f3458c.setTextColor(-2543568);
        } else if (insuranceDetail.f6049b < 0) {
            charSequence2 = Utility.m4502g(insuranceDetail.f6049b);
            insuranceDetailExpandableListAdapter.f3458c.setTextColor(-14519546);
        } else {
            charSequence2 = Utility.m4502g(insuranceDetail.f6049b);
            insuranceDetailExpandableListAdapter.f3458c.setTextColor(-9474450);
        }
        insuranceDetailExpandableListAdapter.f3458c.setText(charSequence2);
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
