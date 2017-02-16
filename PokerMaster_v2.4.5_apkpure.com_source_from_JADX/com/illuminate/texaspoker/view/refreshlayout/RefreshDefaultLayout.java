package com.illuminate.texaspoker.view.refreshlayout;

import android.content.Context;
import android.util.AttributeSet;

public class RefreshDefaultLayout extends RefreshLayout {
    private RefreshDefaultHeader f7134d;

    public RefreshDefaultLayout(Context context) {
        super(context);
        m4593e();
    }

    public RefreshDefaultLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4593e();
    }

    public RefreshDefaultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4593e();
    }

    private void m4593e() {
        this.f7134d = new RefreshDefaultHeader(getContext());
        setHeaderView(this.f7134d);
        RefreshUIHandler refreshUIHandler = this.f7134d;
        RefreshUIHandlerHolder refreshUIHandlerHolder = this.f7114b;
        if (refreshUIHandler != null && refreshUIHandlerHolder != null) {
            if (refreshUIHandlerHolder.f7160a == null) {
                refreshUIHandlerHolder.f7160a = refreshUIHandler;
                return;
            }
            while (true) {
                Object obj;
                if (refreshUIHandlerHolder.f7160a == null || refreshUIHandlerHolder.f7160a != refreshUIHandler) {
                    obj = null;
                } else {
                    obj = 1;
                }
                if (obj != null) {
                    return;
                }
                if (refreshUIHandlerHolder.f7161b != null) {
                    refreshUIHandlerHolder = refreshUIHandlerHolder.f7161b;
                } else {
                    RefreshUIHandlerHolder refreshUIHandlerHolder2 = new RefreshUIHandlerHolder();
                    refreshUIHandlerHolder2.f7160a = refreshUIHandler;
                    refreshUIHandlerHolder.f7161b = refreshUIHandlerHolder2;
                    return;
                }
            }
        }
    }

    public RefreshDefaultHeader getHeader() {
        return this.f7134d;
    }
}
