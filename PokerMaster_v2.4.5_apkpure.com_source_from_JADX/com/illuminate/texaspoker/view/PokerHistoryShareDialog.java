package com.illuminate.texaspoker.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageButton;

/* renamed from: com.illuminate.texaspoker.view.b */
public final class PokerHistoryShareDialog extends Dialog {
    public OnClickListener f7047a;
    public OnClickListener f7048b;
    public OnClickListener f7049c;
    public OnClickListener f7050d;
    public OnClickListener f7051e;
    public OnClickListener f7052f;
    public OnClickListener f7053g;
    public OnClickListener f7054h;
    public OnClickListener f7055i;
    public OnClickListener f7056j;
    public int f7057k;
    public int f7058l;
    public int f7059m;
    private Context f7060n;
    private View f7061o;
    private View f7062p;
    private View f7063q;

    /* renamed from: com.illuminate.texaspoker.view.b.1 */
    class PokerHistoryShareDialog implements OnClickListener {
        final /* synthetic */ PokerHistoryShareDialog f7045a;

        PokerHistoryShareDialog(PokerHistoryShareDialog pokerHistoryShareDialog) {
            this.f7045a = pokerHistoryShareDialog;
        }

        public final void onClick(View view) {
            this.f7045a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.b.2 */
    class PokerHistoryShareDialog implements OnClickListener {
        final /* synthetic */ PokerHistoryShareDialog f7046a;

        PokerHistoryShareDialog(PokerHistoryShareDialog pokerHistoryShareDialog) {
            this.f7046a = pokerHistoryShareDialog;
        }

        public final void onClick(View view) {
            this.f7046a.dismiss();
        }
    }

    public PokerHistoryShareDialog(Context context) {
        super(context, 2131296473);
        this.f7060n = context;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        View inflate = LayoutInflater.from(this.f7060n).inflate(2130968821, null);
        setContentView(inflate);
        setCancelable(true);
        inflate.findViewById(2131559348).setOnClickListener(new PokerHistoryShareDialog(this));
        this.f7063q = inflate.findViewById(2131559363);
        this.f7062p = inflate.findViewById(2131559360);
        this.f7061o = inflate.findViewById(2131559358);
        this.f7063q.setVisibility(this.f7059m);
        this.f7061o.setVisibility(this.f7057k);
        this.f7062p.setVisibility(this.f7058l);
        ((ImageButton) inflate.findViewById(2131559350)).setOnClickListener(this.f7047a);
        ((ImageButton) inflate.findViewById(2131559351)).setOnClickListener(this.f7048b);
        ((ImageButton) inflate.findViewById(2131559352)).setOnClickListener(this.f7049c);
        ((ImageButton) inflate.findViewById(2131559353)).setOnClickListener(this.f7050d);
        ((ImageButton) inflate.findViewById(2131559357)).setOnClickListener(this.f7051e);
        ((ImageButton) inflate.findViewById(2131559359)).setOnClickListener(this.f7052f);
        ((ImageButton) inflate.findViewById(2131559361)).setOnClickListener(this.f7053g);
        ((ImageButton) inflate.findViewById(2131559364)).setOnClickListener(this.f7054h);
        ((ImageButton) inflate.findViewById(2131559355)).setOnClickListener(this.f7055i);
        ((ImageButton) inflate.findViewById(2131559356)).setOnClickListener(this.f7056j);
        ((ImageButton) inflate.findViewById(2131559365)).setOnClickListener(new PokerHistoryShareDialog(this));
    }
}
