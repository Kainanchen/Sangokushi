package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.x */
public final class LanguageListAdapter extends BaseAdapter {
    public String f3466a;
    private List<String> f3467b;
    private Context f3468c;

    /* renamed from: com.illuminate.texaspoker.a.x.a */
    public final class LanguageListAdapter {
        public TextView f3463a;
        public ImageView f3464b;
        final /* synthetic */ LanguageListAdapter f3465c;

        public LanguageListAdapter(LanguageListAdapter languageListAdapter) {
            this.f3465c = languageListAdapter;
        }
    }

    public LanguageListAdapter(Context context, List<String> list, String str) {
        this.f3468c = context;
        this.f3467b = list;
        this.f3466a = str;
    }

    public final int getCount() {
        return this.f3467b.size();
    }

    public final Object getItem(int i) {
        return this.f3467b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        LanguageListAdapter languageListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3468c).inflate(2130968832, null);
            languageListAdapter = new LanguageListAdapter(this);
            languageListAdapter.f3463a = (TextView) view.findViewById(2131559413);
            languageListAdapter.f3464b = (ImageView) view.findViewById(2131559414);
            view.setTag(languageListAdapter);
        } else {
            languageListAdapter = (LanguageListAdapter) view.getTag();
        }
        String str = (String) this.f3467b.get(i);
        if (str.equalsIgnoreCase("auto")) {
            languageListAdapter.f3463a.setText(2131165789);
        } else if (str.equalsIgnoreCase("zh_CN")) {
            languageListAdapter.f3463a.setText(2131165987);
        } else if (str.equalsIgnoreCase("zh_TW")) {
            languageListAdapter.f3463a.setText(2131165989);
        } else if (str.equalsIgnoreCase("en")) {
            languageListAdapter.f3463a.setText(2131165988);
        }
        if (this.f3466a.equalsIgnoreCase(str)) {
            languageListAdapter.f3464b.setImageResource(2130903179);
        } else {
            languageListAdapter.f3464b.setImageResource(2130903178);
        }
        return view;
    }
}
