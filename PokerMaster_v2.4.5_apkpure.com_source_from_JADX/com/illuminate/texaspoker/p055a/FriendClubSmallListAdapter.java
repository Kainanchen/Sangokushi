package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.r */
public final class FriendClubSmallListAdapter extends BaseAdapter {
    public boolean f3393a;
    private Context f3394b;
    private long f3395c;
    private List<ChatUser> f3396d;

    /* renamed from: com.illuminate.texaspoker.a.r.a */
    public final class FriendClubSmallListAdapter {
        public SimpleDraweeView f3388a;
        public TextView f3389b;
        public TextView f3390c;
        public TextView f3391d;
        final /* synthetic */ FriendClubSmallListAdapter f3392e;

        public FriendClubSmallListAdapter(FriendClubSmallListAdapter friendClubSmallListAdapter) {
            this.f3392e = friendClubSmallListAdapter;
        }
    }

    public FriendClubSmallListAdapter(Context context, List<ChatUser> list, long j) {
        this.f3394b = context;
        this.f3396d = list;
        this.f3393a = false;
        this.f3395c = j;
    }

    public final int getCount() {
        return this.f3396d.size();
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        FriendClubSmallListAdapter friendClubSmallListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3394b).inflate(2130968766, null);
            friendClubSmallListAdapter = new FriendClubSmallListAdapter(this);
            friendClubSmallListAdapter.f3388a = (SimpleDraweeView) view.findViewById(2131558674);
            friendClubSmallListAdapter.f3389b = (TextView) view.findViewById(2131558613);
            friendClubSmallListAdapter.f3390c = (TextView) view.findViewById(2131558615);
            friendClubSmallListAdapter.f3391d = (TextView) view.findViewById(2131558616);
            view.setTag(friendClubSmallListAdapter);
        } else {
            friendClubSmallListAdapter = (FriendClubSmallListAdapter) view.getTag();
        }
        ChatRoom b = ((ChatUser) this.f3396d.get(i)).m3731b();
        friendClubSmallListAdapter.f3388a.setImageURI(Uri.parse(b.f5760u));
        friendClubSmallListAdapter.f3389b.setText(b.f5755p);
        if (b.f5748i.longValue() == this.f3395c) {
            Drawable drawable = ContextCompat.getDrawable(this.f3394b, 2130903137);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            friendClubSmallListAdapter.f3389b.setCompoundDrawables(null, null, drawable, null);
        } else {
            friendClubSmallListAdapter.f3389b.setCompoundDrawables(null, null, null, null);
        }
        friendClubSmallListAdapter.f3390c.setText(b.f5729P + "/" + b.f5731R);
        friendClubSmallListAdapter.f3391d.setText(Utility.m4506h(b.f5765z));
        return view;
    }
}
