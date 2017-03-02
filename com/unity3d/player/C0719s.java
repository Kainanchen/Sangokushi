package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.zkunity.app.ResourceIDs;

/* renamed from: com.unity3d.player.s */
public final class C0719s extends Dialog implements TextWatcher, OnClickListener {
    private static int f2315c;
    private static int f2316d;
    private Context f2317a;
    private UnityPlayer f2318b;

    /* renamed from: com.unity3d.player.s.1 */
    class C07161 implements OnFocusChangeListener {
        final /* synthetic */ C0719s f2312a;

        C07161(C0719s c0719s) {
            this.f2312a = c0719s;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f2312a.getWindow().setSoftInputMode(5);
            }
        }
    }

    /* renamed from: com.unity3d.player.s.2 */
    class C07172 extends EditText {
        final /* synthetic */ C0719s f2313a;

        C07172(C0719s c0719s, Context context) {
            this.f2313a = c0719s;
            super(context);
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return i != 84 ? super.onKeyPreIme(i, keyEvent) : true;
            } else {
                this.f2313a.m2617a(this.f2313a.m2613a(), true);
                return true;
            }
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z) {
                ((InputMethodManager) this.f2313a.f2317a.getSystemService("input_method")).showSoftInput(this, 0);
            }
        }
    }

    /* renamed from: com.unity3d.player.s.3 */
    class C07183 implements OnEditorActionListener {
        final /* synthetic */ C0719s f2314a;

        C07183(C0719s c0719s) {
            this.f2314a = c0719s;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                this.f2314a.m2617a(this.f2314a.m2613a(), false);
            }
            return false;
        }
    }

    static {
        f2315c = 1627389952;
        f2316d = -1;
    }

    public C0719s(Context context, UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, String str2) {
        super(context);
        this.f2317a = null;
        this.f2318b = null;
        this.f2317a = context;
        this.f2318b = unityPlayer;
        getWindow().setGravity(80);
        getWindow().requestFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(createSoftInputView());
        getWindow().setLayout(-1, -2);
        getWindow().clearFlags(2);
        EditText editText = (EditText) findViewById(1057292289);
        Button button = (Button) findViewById(1057292290);
        m2615a(editText, str, i, z, z2, z3, str2);
        button.setOnClickListener(this);
        editText.setOnFocusChangeListener(new C07161(this));
    }

    private static int m2612a(int i, boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z2 ? AccessibilityEventCompat.TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY : 0) | (z ? WXMediaMessage.THUMB_LENGTH_LIMIT : 0);
        if (z3) {
            i2 = AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        }
        i2 |= i3;
        return (i < 0 || i > 7) ? i2 : i2 | new int[]{1, 16385, 12290, 17, 2, 3, 97, 33}[i];
    }

    private String m2613a() {
        EditText editText = (EditText) findViewById(1057292289);
        return editText == null ? null : editText.getText().toString().trim();
    }

    private void m2615a(EditText editText, String str, int i, boolean z, boolean z2, boolean z3, String str2) {
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(f2315c);
        editText.setInputType(C0719s.m2612a(i, z, z2, z3));
        editText.addTextChangedListener(this);
        editText.setClickable(true);
        if (!z2) {
            editText.selectAll();
        }
    }

    private void m2617a(String str, boolean z) {
        Selection.removeSelection(((EditText) findViewById(1057292289)).getEditableText());
        this.f2318b.reportSoftInputStr(str, 1, z);
    }

    public final void m2619a(String str) {
        EditText editText = (EditText) findViewById(1057292289);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    public final void afterTextChanged(Editable editable) {
        this.f2318b.reportSoftInputStr(editable.toString(), 0, false);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    protected final View createSoftInputView() {
        View relativeLayout = new RelativeLayout(this.f2317a);
        relativeLayout.setLayoutParams(new LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(f2316d);
        View c07172 = new C07172(this, this.f2317a);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(0, 1057292290);
        c07172.setLayoutParams(layoutParams);
        c07172.setId(1057292289);
        relativeLayout.addView(c07172);
        c07172 = new Button(this.f2317a);
        c07172.setText(this.f2317a.getResources().getIdentifier("ok", ResourceIDs.STRING_ID, "android"));
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        c07172.setLayoutParams(layoutParams);
        c07172.setId(1057292290);
        c07172.setBackgroundColor(0);
        relativeLayout.addView(c07172);
        ((EditText) relativeLayout.findViewById(1057292289)).setOnEditorActionListener(new C07183(this));
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    public final void onBackPressed() {
        m2617a(m2613a(), true);
    }

    public final void onClick(View view) {
        m2617a(m2613a(), false);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
