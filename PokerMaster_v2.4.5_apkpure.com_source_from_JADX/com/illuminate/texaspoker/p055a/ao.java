package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.MapList;

/* compiled from: SelectedFriendAdapter */
/* renamed from: com.illuminate.texaspoker.a.ao */
public final class ao extends BaseAdapter {
    private Context f2935a;
    private MapList<Long, FriendUser> f2936b;

    /* renamed from: com.illuminate.texaspoker.a.ao.a */
    public final class SelectedFriendAdapter {
        public SimpleDraweeView f2933a;
        final /* synthetic */ ao f2934b;

        static {
            fixHelper.fixfunc(new int[]{3421, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native SelectedFriendAdapter(ao aoVar);
    }

    public ao(Context context, MapList<Long, FriendUser> mapList) {
        this.f2935a = context;
        this.f2936b = mapList;
    }

    public final int getCount() {
        return this.f2936b.m4238a();
    }

    public final Object getItem(int i) {
        return this.f2936b.m4239a(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SelectedFriendAdapter selectedFriendAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2935a).inflate(2130968820, null);
            SelectedFriendAdapter selectedFriendAdapter2 = new SelectedFriendAdapter(this);
            selectedFriendAdapter2.f2933a = (SimpleDraweeView) view.findViewById(2131558674);
            view.setTag(selectedFriendAdapter2);
            selectedFriendAdapter = selectedFriendAdapter2;
        } else {
            selectedFriendAdapter = (SelectedFriendAdapter) view.getTag();
        }
        FriendUser friendUser = (FriendUser) this.f2936b.m4239a(i);
        if (friendUser.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) selectedFriendAdapter.f2933a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) selectedFriendAdapter.f2933a.getHierarchy()).m1407a(2130903193);
        }
        selectedFriendAdapter.f2933a.setImageURI(Uri.parse(friendUser.f5836o));
        return view;
    }
}
