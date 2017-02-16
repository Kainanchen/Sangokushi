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
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.StringUtils;
import java.util.List;

/* compiled from: MyGroupListAdapter */
/* renamed from: com.illuminate.texaspoker.a.af */
public final class af extends BaseAdapter {
    private List<ChatRoom> f2848a;
    private Context f2849b;

    /* renamed from: com.illuminate.texaspoker.a.af.a */
    public final class MyGroupListAdapter {
        public SimpleDraweeView f2845a;
        public TextView f2846b;
        final /* synthetic */ af f2847c;

        static {
            fixHelper.fixfunc(new int[]{2612, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native MyGroupListAdapter(af afVar);
    }

    public af(Context context, List<ChatRoom> list) {
        this.f2849b = context;
        this.f2848a = list;
    }

    public final int getCount() {
        return this.f2848a.size();
    }

    public final Object getItem(int i) {
        return this.f2848a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        MyGroupListAdapter myGroupListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2849b).inflate(2130968802, null);
            myGroupListAdapter = new MyGroupListAdapter(this);
            myGroupListAdapter.f2845a = (SimpleDraweeView) view.findViewById(2131558674);
            myGroupListAdapter.f2846b = (TextView) view.findViewById(2131558706);
            view.setTag(myGroupListAdapter);
        } else {
            myGroupListAdapter = (MyGroupListAdapter) view.getTag();
        }
        ChatRoom chatRoom = (ChatRoom) this.f2848a.get(i);
        myGroupListAdapter.f2845a.setImageURI(Uri.parse(chatRoom.f5760u));
        if (!StringUtils.m4462a(chatRoom.f5755p)) {
            myGroupListAdapter.f2846b.setText(chatRoom.f5755p);
        } else if (StringUtils.m4462a(chatRoom.f5757r)) {
            myGroupListAdapter.f2846b.setText(2131165268);
        } else {
            myGroupListAdapter.f2846b.setText(chatRoom.f5757r);
        }
        return view;
    }
}
