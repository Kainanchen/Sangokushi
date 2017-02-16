package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;

/* compiled from: MyFriendExpandableListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ae */
public final class ae extends BaseExpandableListAdapter implements SectionIndexer {
    public MapList<String, List<FriendUser>> f2843a;
    private Context f2844b;

    /* renamed from: com.illuminate.texaspoker.a.ae.a */
    public final class MyFriendExpandableListAdapter {
        public TextView f2836a;
        final /* synthetic */ ae f2837b;

        static {
            fixHelper.fixfunc(new int[]{1070, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native MyFriendExpandableListAdapter(ae aeVar);
    }

    /* renamed from: com.illuminate.texaspoker.a.ae.b */
    public final class MyFriendExpandableListAdapter {
        public SimpleDraweeView f2838a;
        public TextView f2839b;
        public TextView f2840c;
        public TextView f2841d;
        final /* synthetic */ ae f2842e;

        static {
            fixHelper.fixfunc(new int[]{1126, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native MyFriendExpandableListAdapter(ae aeVar);
    }

    public ae(Context context) {
        this.f2844b = context;
    }

    public final int getGroupCount() {
        return this.f2843a.m4238a();
    }

    public final int getChildrenCount(int i) {
        return ((List) this.f2843a.m4239a(i)).size();
    }

    public final Object getGroup(int i) {
        return this.f2843a.m4239a(i);
    }

    public final Object getChild(int i, int i2) {
        return ((List) this.f2843a.m4239a(i)).get(i2);
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
        MyFriendExpandableListAdapter myFriendExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2844b).inflate(2130968801, null);
            myFriendExpandableListAdapter = new MyFriendExpandableListAdapter(this);
            myFriendExpandableListAdapter.f2836a = (TextView) view.findViewById(2131559139);
            view.setTag(myFriendExpandableListAdapter);
        } else {
            myFriendExpandableListAdapter = (MyFriendExpandableListAdapter) view.getTag();
        }
        myFriendExpandableListAdapter.f2836a.setText((String) this.f2843a.f6665a.get(i));
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        MyFriendExpandableListAdapter myFriendExpandableListAdapter;
        CharSequence charSequence;
        if (view == null) {
            view = LayoutInflater.from(this.f2844b).inflate(2130968800, null);
            MyFriendExpandableListAdapter myFriendExpandableListAdapter2 = new MyFriendExpandableListAdapter(this);
            myFriendExpandableListAdapter2.f2838a = (SimpleDraweeView) view.findViewById(2131558674);
            myFriendExpandableListAdapter2.f2839b = (TextView) view.findViewById(2131558840);
            myFriendExpandableListAdapter2.f2840c = (TextView) view.findViewById(2131559180);
            myFriendExpandableListAdapter2.f2841d = (TextView) view.findViewById(2131559153);
            view.setTag(myFriendExpandableListAdapter2);
            myFriendExpandableListAdapter = myFriendExpandableListAdapter2;
        } else {
            myFriendExpandableListAdapter = (MyFriendExpandableListAdapter) view.getTag();
        }
        FriendUser friendUser = (FriendUser) ((List) this.f2843a.m4239a(i)).get(i2);
        if (friendUser.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) myFriendExpandableListAdapter.f2838a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) myFriendExpandableListAdapter.f2838a.getHierarchy()).m1407a(2130903193);
        }
        myFriendExpandableListAdapter.f2838a.setImageURI(Uri.parse(friendUser.f5836o));
        myFriendExpandableListAdapter.f2839b.setText(friendUser.f5838q);
        if (StringUtils.m4462a(friendUser.f5835n)) {
            myFriendExpandableListAdapter.f2840c.setVisibility(8);
        } else {
            myFriendExpandableListAdapter.f2840c.setVisibility(0);
            myFriendExpandableListAdapter.f2840c.setText(friendUser.f5835n);
        }
        if (friendUser.f5843v == null) {
            charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
        } else {
            charSequence = Utility.m4496e(friendUser.f5843v.longValue());
        }
        myFriendExpandableListAdapter.f2841d.setText(charSequence);
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final Object[] getSections() {
        return null;
    }

    public final int getPositionForSection(int i) {
        for (int i2 = 0; i2 < this.f2843a.m4238a(); i2++) {
            if (((String) this.f2843a.f6665a.get(i2)).charAt(0) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int getSectionForPosition(int i) {
        return i;
    }
}
