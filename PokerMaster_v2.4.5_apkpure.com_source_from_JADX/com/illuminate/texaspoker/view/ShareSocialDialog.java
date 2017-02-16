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

/* renamed from: com.illuminate.texaspoker.view.d */
public final class ShareSocialDialog extends Dialog {
    public OnClickListener f7078a;
    public OnClickListener f7079b;
    public OnClickListener f7080c;
    public OnClickListener f7081d;
    public OnClickListener f7082e;
    public OnClickListener f7083f;
    private Context f7084g;

    /* renamed from: com.illuminate.texaspoker.view.d.1 */
    class ShareSocialDialog implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f7076a;

        ShareSocialDialog(ShareSocialDialog shareSocialDialog) {
            this.f7076a = shareSocialDialog;
        }

        public final void onClick(View view) {
            this.f7076a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.d.2 */
    class ShareSocialDialog implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f7077a;

        ShareSocialDialog(ShareSocialDialog shareSocialDialog) {
            this.f7077a = shareSocialDialog;
        }

        public final void onClick(View view) {
            this.f7077a.dismiss();
        }
    }

    public ShareSocialDialog(Context context) {
        super(context, 2131296473);
        this.f7084g = context;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        View inflate = LayoutInflater.from(this.f7084g).inflate(2130968829, null);
        setContentView(inflate);
        setCancelable(true);
        inflate.findViewById(2131559348).setOnClickListener(new ShareSocialDialog(this));
        ((ImageButton) inflate.findViewById(2131559350)).setOnClickListener(this.f7078a);
        ((ImageButton) inflate.findViewById(2131559351)).setOnClickListener(this.f7079b);
        ((ImageButton) inflate.findViewById(2131559352)).setOnClickListener(this.f7080c);
        ((ImageButton) inflate.findViewById(2131559353)).setOnClickListener(this.f7081d);
        ((ImageButton) inflate.findViewById(2131559355)).setOnClickListener(this.f7082e);
        ((ImageButton) inflate.findViewById(2131559356)).setOnClickListener(this.f7083f);
        ((ImageButton) inflate.findViewById(2131559365)).setOnClickListener(new ShareSocialDialog(this));
    }
}
