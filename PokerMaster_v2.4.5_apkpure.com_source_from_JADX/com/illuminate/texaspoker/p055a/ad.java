package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;

/* compiled from: MyClubExpandableListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ad */
public final class ad extends BaseExpandableListAdapter {
    private Context f2833a;
    private MapList<String, List<ChatRoom>> f2834b;
    private List<String> f2835c;

    /* renamed from: com.illuminate.texaspoker.a.ad.1 */
    class MyClubExpandableListAdapter implements OnClickListener {
        final /* synthetic */ ChatRoom f2822a;
        final /* synthetic */ ad f2823b;

        static {
            fixHelper.fixfunc(new int[]{1133, 1134});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native MyClubExpandableListAdapter(ad adVar, ChatRoom chatRoom);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.ad.a */
    public final class MyClubExpandableListAdapter {
        public SimpleDraweeView f2824a;
        public TextView f2825b;
        public TextView f2826c;
        public TextView f2827d;
        public TextView f2828e;
        public ImageButton f2829f;
        final /* synthetic */ ad f2830g;

        public MyClubExpandableListAdapter(ad adVar) {
            this.f2830g = adVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ad.b */
    public final class MyClubExpandableListAdapter {
        public TextView f2831a;
        final /* synthetic */ ad f2832b;

        public MyClubExpandableListAdapter(ad adVar) {
            this.f2832b = adVar;
        }
    }

    public ad(Context context, MapList<String, List<ChatRoom>> mapList, List<String> list) {
        this.f2833a = context;
        this.f2834b = mapList;
        this.f2835c = list;
    }

    public final int getGroupCount() {
        return this.f2834b.m4238a();
    }

    public final int getChildrenCount(int i) {
        return ((List) this.f2834b.m4239a(i)).size();
    }

    public final Object getGroup(int i) {
        return this.f2834b.m4239a(i);
    }

    public final Object getChild(int i, int i2) {
        return ((List) this.f2834b.m4239a(i)).get(i2);
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
        MyClubExpandableListAdapter myClubExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2833a).inflate(2130968797, null);
            myClubExpandableListAdapter = new MyClubExpandableListAdapter(this);
            myClubExpandableListAdapter.f2831a = (TextView) view.findViewById(2131559139);
            view.setTag(myClubExpandableListAdapter);
        } else {
            myClubExpandableListAdapter = (MyClubExpandableListAdapter) view.getTag();
        }
        myClubExpandableListAdapter.f2831a.setText((String) this.f2835c.get(i));
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        MyClubExpandableListAdapter myClubExpandableListAdapter;
        long j;
        if (view == null) {
            view = LayoutInflater.from(this.f2833a).inflate(2130968796, null);
            myClubExpandableListAdapter = new MyClubExpandableListAdapter(this);
            myClubExpandableListAdapter.f2824a = (SimpleDraweeView) view.findViewById(2131558674);
            myClubExpandableListAdapter.f2825b = (TextView) view.findViewById(2131558613);
            myClubExpandableListAdapter.f2826c = (TextView) view.findViewById(2131558615);
            myClubExpandableListAdapter.f2827d = (TextView) view.findViewById(2131558616);
            myClubExpandableListAdapter.f2828e = (TextView) view.findViewById(2131559275);
            myClubExpandableListAdapter.f2829f = (ImageButton) view.findViewById(2131558631);
            view.setTag(myClubExpandableListAdapter);
        } else {
            myClubExpandableListAdapter = (MyClubExpandableListAdapter) view.getTag();
        }
        ChatRoom chatRoom = (ChatRoom) ((List) this.f2834b.m4239a(i)).get(i2);
        myClubExpandableListAdapter.f2824a.setImageURI(Uri.parse(chatRoom.f5760u));
        myClubExpandableListAdapter.f2825b.setText(chatRoom.f5755p);
        myClubExpandableListAdapter.f2826c.setText(chatRoom.f5729P + "/" + chatRoom.f5731R);
        myClubExpandableListAdapter.f2827d.setText(Utility.m4506h(chatRoom.f5765z));
        myClubExpandableListAdapter.f2828e.setText(chatRoom.f5764y);
        if (DBManager.m3631a().m3632b()) {
            j = 0;
        } else {
            j = DBManager.m3631a().f5575o.m3624a(chatRoom.f5742c.longValue());
            long a = DBManager.m3631a().f5582v.m3680a(chatRoom.f5742c.longValue());
            DBManager.m3631a().f5582v.m3683b(chatRoom.f5742c.longValue());
            j += a;
        }
        if (j > 0) {
            myClubExpandableListAdapter.f2829f.setImageResource(2130837622);
        } else {
            myClubExpandableListAdapter.f2829f.setImageResource(2130837621);
        }
        if (chatRoom.f5734U == null || !chatRoom.f5734U.booleanValue()) {
            myClubExpandableListAdapter.f2829f.setVisibility(8);
        } else {
            myClubExpandableListAdapter.f2829f.setVisibility(0);
        }
        myClubExpandableListAdapter.f2829f.setOnClickListener(new MyClubExpandableListAdapter(this, chatRoom));
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
