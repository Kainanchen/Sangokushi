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
import com.illuminate.texaspoker.p058c.ClubAlbum;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.a */
public final class AlbumAdapter extends BaseAdapter {
    private Context f2799a;
    private List f2800b;

    /* renamed from: com.illuminate.texaspoker.a.a.a */
    public final class AlbumAdapter {
        public SimpleDraweeView f2797a;
        final /* synthetic */ AlbumAdapter f2798b;

        static {
            fixHelper.fixfunc(new int[]{3026, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native AlbumAdapter(AlbumAdapter albumAdapter);
    }

    public AlbumAdapter(Context context, List list) {
        this.f2799a = context;
        this.f2800b = list;
    }

    public final int getCount() {
        return this.f2800b.size();
    }

    public final Object getItem(int i) {
        return this.f2800b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AlbumAdapter albumAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2799a).inflate(2130968721, null);
            albumAdapter = new AlbumAdapter(this);
            albumAdapter.f2797a = (SimpleDraweeView) view.findViewById(2131559013);
            view.setTag(albumAdapter);
        } else {
            albumAdapter = (AlbumAdapter) view.getTag();
        }
        Object obj = this.f2800b.get(i);
        if (obj instanceof FriendAlbum) {
            albumAdapter.f2797a.setImageURI(Uri.parse(((FriendAlbum) obj).f5818e));
            ((GenericDraweeHierarchy) albumAdapter.f2797a.getHierarchy()).m1407a(2130903243);
        } else if (obj instanceof ClubAlbum) {
            albumAdapter.f2797a.setImageURI(Uri.parse(((ClubAlbum) obj).f5783e));
            ((GenericDraweeHierarchy) albumAdapter.f2797a.getHierarchy()).m1407a(2130903243);
        } else {
            ((GenericDraweeHierarchy) albumAdapter.f2797a.getHierarchy()).m1407a(2130837588);
            albumAdapter.f2797a.setImageURI(Uri.parse("res://com.illuminate.texaspoker/2130837588"));
        }
        return view;
    }
}
