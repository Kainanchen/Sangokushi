package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import java.util.List;

/* compiled from: QuickUserAdapter */
/* renamed from: com.illuminate.texaspoker.a.ak */
public final class ak extends BaseAdapter {
    private Context f2912a;
    private List<ChatUser> f2913b;

    /* renamed from: com.illuminate.texaspoker.a.ak.a */
    public final class QuickUserAdapter {
        public SimpleDraweeView f2910a;
        final /* synthetic */ ak f2911b;

        public QuickUserAdapter(ak akVar) {
            this.f2911b = akVar;
        }
    }

    public ak(Context context, List<ChatUser> list) {
        this.f2912a = context;
        this.f2913b = list;
    }

    public final int getCount() {
        return this.f2913b.size();
    }

    public final Object getItem(int i) {
        return this.f2913b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        QuickUserAdapter quickUserAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2912a).inflate(2130968817, null);
            quickUserAdapter = new QuickUserAdapter(this);
            quickUserAdapter.f2910a = (SimpleDraweeView) view.findViewById(2131558674);
            view.setTag(quickUserAdapter);
        } else {
            quickUserAdapter = (QuickUserAdapter) view.getTag();
        }
        FriendUser a = ((ChatUser) this.f2913b.get(i)).m3728a();
        if (a.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) quickUserAdapter.f2910a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) quickUserAdapter.f2910a.getHierarchy()).m1407a(2130903193);
        }
        quickUserAdapter.f2910a.setImageURI(Uri.parse(a.f5836o));
        return view;
    }
}
