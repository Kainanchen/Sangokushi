package com.illuminate.texaspoker.view;

import a.does.not.Exists2;
import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.an;
import com.illuminate.texaspoker.p059d.Country;
import com.illuminate.texaspoker.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.view.c */
public final class SelectCountryListDialog extends Dialog {
    private Context f7068a;
    private SelectCountryListDialog f7069b;
    private List<Country> f7070c;
    private List<Country> f7071d;
    private EditText f7072e;
    private ListView f7073f;
    private an f7074g;
    private Button f7075h;

    /* renamed from: com.illuminate.texaspoker.view.c.a */
    public interface SelectCountryListDialog {
        void m3100a(Country country);
    }

    /* renamed from: com.illuminate.texaspoker.view.c.1 */
    class SelectCountryListDialog implements TextWatcher {
        final /* synthetic */ SelectCountryListDialog f7064a;

        static {
            fixHelper.fixfunc(new int[]{2818, 2819, 2820, 2821});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native SelectCountryListDialog(SelectCountryListDialog selectCountryListDialog);

        public final native void afterTextChanged(Editable editable);

        public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

        public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: com.illuminate.texaspoker.view.c.2 */
    class SelectCountryListDialog implements OnKeyListener {
        final /* synthetic */ SelectCountryListDialog f7065a;

        static {
            fixHelper.fixfunc(new int[]{2710, 2711});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native SelectCountryListDialog(SelectCountryListDialog selectCountryListDialog);

        public final native boolean onKey(View view, int i, KeyEvent keyEvent);
    }

    /* renamed from: com.illuminate.texaspoker.view.c.3 */
    class SelectCountryListDialog implements OnItemClickListener {
        final /* synthetic */ SelectCountryListDialog f7066a;

        static {
            fixHelper.fixfunc(new int[]{3418, 3419});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native SelectCountryListDialog(SelectCountryListDialog selectCountryListDialog);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: com.illuminate.texaspoker.view.c.4 */
    class SelectCountryListDialog implements OnClickListener {
        final /* synthetic */ SelectCountryListDialog f7067a;

        static {
            fixHelper.fixfunc(new int[]{3293, 3294});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native SelectCountryListDialog(SelectCountryListDialog selectCountryListDialog);

        public final native void onClick(View view);
    }

    public SelectCountryListDialog(Context context, List<Country> list, SelectCountryListDialog selectCountryListDialog) {
        super(context, 2131296473);
        this.f7068a = context;
        this.f7069b = selectCountryListDialog;
        this.f7070c = list;
        this.f7071d = new ArrayList();
        this.f7071d.addAll(list);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f7068a).inflate(2130968760, null);
        setContentView(inflate);
        this.f7072e = (EditText) inflate.findViewById(2131559155);
        this.f7072e.addTextChangedListener(new SelectCountryListDialog(this));
        this.f7072e.setOnKeyListener(new SelectCountryListDialog(this));
        this.f7073f = (ListView) findViewById(2131559156);
        this.f7074g = new an(getContext(), this.f7071d);
        this.f7073f.setAdapter(this.f7074g);
        this.f7073f.setOnItemClickListener(new SelectCountryListDialog(this));
        this.f7075h = (Button) inflate.findViewById(2131559157);
        this.f7075h.setOnClickListener(new SelectCountryListDialog(this));
    }

    static /* synthetic */ void m4570a(SelectCountryListDialog selectCountryListDialog, String str) {
        selectCountryListDialog.f7071d.clear();
        if (StringUtils.m4462a((CharSequence) str)) {
            selectCountryListDialog.f7071d.addAll(selectCountryListDialog.f7070c);
        } else {
            for (Country country : selectCountryListDialog.f7070c) {
                if (country.f6039a.toUpperCase().contains(str.toUpperCase())) {
                    selectCountryListDialog.f7071d.add(country);
                }
            }
        }
        selectCountryListDialog.f7074g.notifyDataSetChanged();
    }
}
