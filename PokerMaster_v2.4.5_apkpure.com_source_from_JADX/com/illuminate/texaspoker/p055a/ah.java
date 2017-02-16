package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.MapList;
import java.util.List;

/* compiled from: NewGroupExpandableListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ah */
public final class ah extends BaseExpandableListAdapter implements SectionIndexer {
    private Context f2870a;
    private MapList<String, List<FriendUser>> f2871b;
    private MapList<Long, FriendUser> f2872c;
    private MapList<Long, FriendUser> f2873d;

    /* renamed from: com.illuminate.texaspoker.a.ah.a */
    public final class NewGroupExpandableListAdapter {
        public TextView f2864a;
        final /* synthetic */ ah f2865b;

        public NewGroupExpandableListAdapter(ah ahVar) {
            this.f2865b = ahVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ah.b */
    public final class NewGroupExpandableListAdapter {
        public SimpleDraweeView f2866a;
        public TextView f2867b;
        public ImageView f2868c;
        final /* synthetic */ ah f2869d;

        public NewGroupExpandableListAdapter(ah ahVar) {
            this.f2869d = ahVar;
        }
    }

    public ah(Context context, MapList<String, List<FriendUser>> mapList, MapList<Long, FriendUser> mapList2, MapList<Long, FriendUser> mapList3) {
        this.f2870a = context;
        this.f2871b = mapList;
        this.f2872c = mapList2;
        this.f2873d = mapList3;
    }

    public final int getGroupCount() {
        return this.f2871b.m4238a();
    }

    public final int getChildrenCount(int i) {
        return ((List) this.f2871b.m4239a(i)).size();
    }

    public final Object getGroup(int i) {
        return this.f2871b.m4239a(i);
    }

    public final Object getChild(int i, int i2) {
        return ((List) this.f2871b.m4239a(i)).get(i2);
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
        NewGroupExpandableListAdapter newGroupExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2870a).inflate(2130968801, null);
            newGroupExpandableListAdapter = new NewGroupExpandableListAdapter(this);
            newGroupExpandableListAdapter.f2864a = (TextView) view.findViewById(2131559139);
            view.setTag(newGroupExpandableListAdapter);
        } else {
            newGroupExpandableListAdapter = (NewGroupExpandableListAdapter) view.getTag();
        }
        newGroupExpandableListAdapter.f2864a.setText((String) this.f2871b.f6665a.get(i));
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        NewGroupExpandableListAdapter newGroupExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2870a).inflate(2130968819, null);
            NewGroupExpandableListAdapter newGroupExpandableListAdapter2 = new NewGroupExpandableListAdapter(this);
            newGroupExpandableListAdapter2.f2866a = (SimpleDraweeView) view.findViewById(2131558674);
            newGroupExpandableListAdapter2.f2867b = (TextView) view.findViewById(2131558840);
            newGroupExpandableListAdapter2.f2868c = (ImageView) view.findViewById(2131559347);
            view.setTag(newGroupExpandableListAdapter2);
            newGroupExpandableListAdapter = newGroupExpandableListAdapter2;
        } else {
            newGroupExpandableListAdapter = (NewGroupExpandableListAdapter) view.getTag();
        }
        FriendUser friendUser = (FriendUser) ((List) this.f2871b.m4239a(i)).get(i2);
        if (friendUser.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) newGroupExpandableListAdapter.f2866a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) newGroupExpandableListAdapter.f2866a.getHierarchy()).m1407a(2130903193);
        }
        newGroupExpandableListAdapter.f2866a.setImageURI(Uri.parse(friendUser.f5836o));
        newGroupExpandableListAdapter.f2867b.setText(friendUser.f5838q);
        if (this.f2872c.m4240a(friendUser.f5842u) != null) {
            newGroupExpandableListAdapter.f2868c.setImageResource(2130903177);
        } else if (this.f2873d.m4240a(friendUser.f5842u) == null) {
            newGroupExpandableListAdapter.f2868c.setImageResource(2130903178);
        } else {
            newGroupExpandableListAdapter.f2868c.setImageResource(2130903179);
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
        for (int i2 = 0; i2 < this.f2871b.m4238a(); i2++) {
            if (((String) this.f2871b.f6665a.get(i2)).charAt(0) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int getSectionForPosition(int i) {
        return i;
    }
}
