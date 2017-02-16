package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.utils.RuntimeData;

/* renamed from: com.illuminate.texaspoker.a.p */
public final class ExpressionAdapter extends BaseAdapter {
    private Context f3374a;

    /* renamed from: com.illuminate.texaspoker.a.p.a */
    public final class ExpressionAdapter {
        public ImageView f3372a;
        final /* synthetic */ ExpressionAdapter f3373b;

        public ExpressionAdapter(ExpressionAdapter expressionAdapter) {
            this.f3373b = expressionAdapter;
        }
    }

    public ExpressionAdapter(Context context) {
        this.f3374a = context;
    }

    public final int getCount() {
        return RuntimeData.f6692w.size();
    }

    public final Object getItem(int i) {
        return RuntimeData.f6692w.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ExpressionAdapter expressionAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3374a).inflate(2130968764, null);
            expressionAdapter = new ExpressionAdapter(this);
            expressionAdapter.f3372a = (ImageView) view.findViewById(2131559162);
            view.setTag(expressionAdapter);
        } else {
            expressionAdapter = (ExpressionAdapter) view.getTag();
        }
        Expression expression = (Expression) RuntimeData.f6692w.get(i);
        if (expression.f6047d != 0) {
            expressionAdapter.f3372a.setImageResource(expression.f6047d);
        } else {
            expressionAdapter.f3372a.setImageResource(2130837687);
        }
        return view;
    }
}
