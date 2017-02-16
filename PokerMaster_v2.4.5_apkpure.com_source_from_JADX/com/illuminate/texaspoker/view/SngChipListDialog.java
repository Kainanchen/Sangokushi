package com.illuminate.texaspoker.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import com.illuminate.texaspoker.p055a.ap;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.texaspoker.moment.TexasPoker.SNGBlindsStructure;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.view.e */
public final class SngChipListDialog extends Dialog {
    private Context f7087a;

    /* renamed from: com.illuminate.texaspoker.view.e.1 */
    class SngChipListDialog implements OnClickListener {
        final /* synthetic */ SngChipListDialog f7085a;

        SngChipListDialog(SngChipListDialog sngChipListDialog) {
            this.f7085a = sngChipListDialog;
        }

        public final void onClick(View view) {
            this.f7085a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.e.2 */
    class SngChipListDialog implements OnClickListener {
        final /* synthetic */ SngChipListDialog f7086a;

        SngChipListDialog(SngChipListDialog sngChipListDialog) {
            this.f7086a = sngChipListDialog;
        }

        public final void onClick(View view) {
            this.f7086a.dismiss();
        }
    }

    public SngChipListDialog(Context context) {
        super(context, 2131296473);
        this.f7087a = context;
    }

    protected final void onCreate(Bundle bundle) {
        int i;
        Object obj;
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f7087a).inflate(2130968824, null);
        setContentView(inflate);
        inflate.setOnClickListener(new SngChipListDialog(this));
        int size = RuntimeData.f6681l.size();
        if (size % 2 == 0) {
            i = size / 2;
        } else {
            i = (size / 2) + 1;
        }
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            SNGBlindsStructure sNGBlindsStructure = (SNGBlindsStructure) RuntimeData.f6681l.get(i2);
            if (i2 < i) {
                obj = new SNGBlindsStructure[2];
                obj[0] = sNGBlindsStructure;
                arrayList.add(obj);
            } else {
                ((SNGBlindsStructure[]) arrayList.get(i2 - i))[1] = sNGBlindsStructure;
            }
        }
        ListView listView = (ListView) inflate.findViewById(2131558864);
        obj = new ap(this.f7087a, arrayList);
        listView.setAdapter(obj);
        obj.notifyDataSetChanged();
        ((ImageButton) inflate.findViewById(2131559335)).setOnClickListener(new SngChipListDialog(this));
    }
}
