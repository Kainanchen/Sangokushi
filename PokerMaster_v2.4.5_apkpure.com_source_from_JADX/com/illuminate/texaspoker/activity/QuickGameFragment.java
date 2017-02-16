package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.util.List;
import org.cocos2dx.lua.AppActivity;

/* renamed from: com.illuminate.texaspoker.activity.h */
public final class QuickGameFragment extends BaseFragment {
    private LoadingDialog f5453c;
    private View f5454d;
    private EditText f5455e;
    private Button f5456f;
    private Button f5457g;

    /* renamed from: com.illuminate.texaspoker.activity.h.1 */
    class QuickGameFragment implements OnGlobalLayoutListener {
        final /* synthetic */ QuickGameFragment f5446a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5446a = quickGameFragment;
        }

        public final void onGlobalLayout() {
            this.f5446a.m3480a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.2 */
    class QuickGameFragment implements OnClickListener {
        final /* synthetic */ QuickGameFragment f5447a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5447a = quickGameFragment;
        }

        public final void onClick(View view) {
            QuickGameFragment.m3518a(this.f5447a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.3 */
    class QuickGameFragment implements TextWatcher {
        final /* synthetic */ QuickGameFragment f5448a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5448a = quickGameFragment;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            QuickGameFragment.m3520b(this.f5448a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.4 */
    class QuickGameFragment implements OnClickListener {
        final /* synthetic */ QuickGameFragment f5449a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5449a = quickGameFragment;
        }

        public final void onClick(View view) {
            if (this.f5449a.f5455e.isFocused()) {
                QuickGameFragment.m3518a(this.f5449a);
            }
            QuickGameFragment.m3522d(this.f5449a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.5 */
    class QuickGameFragment implements OnClickListener {
        final /* synthetic */ QuickGameFragment f5450a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5450a = quickGameFragment;
        }

        public final void onClick(View view) {
            if (this.f5450a.f5455e.isFocused()) {
                QuickGameFragment.m3518a(this.f5450a);
            }
            QuickGameFragment.m3523e(this.f5450a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.6 */
    class QuickGameFragment implements DialogInterface.OnClickListener {
        final /* synthetic */ QuickGameFragment f5451a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5451a = quickGameFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.h.7 */
    class QuickGameFragment implements DialogInterface.OnClickListener {
        final /* synthetic */ QuickGameFragment f5452a;

        QuickGameFragment(QuickGameFragment quickGameFragment) {
            this.f5452a = quickGameFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5454d = layoutInflater.inflate(2130968686, null);
        this.f5454d.getViewTreeObserver().addOnGlobalLayoutListener(new QuickGameFragment(this));
        this.f5454d.findViewById(2131558960).setOnClickListener(new QuickGameFragment(this));
        this.f5455e = (EditText) this.f5454d.findViewById(2131558963);
        this.f5455e.addTextChangedListener(new QuickGameFragment(this));
        this.f5456f = (Button) this.f5454d.findViewById(2131558964);
        this.f5456f.setOnClickListener(new QuickGameFragment(this));
        this.f5457g = (Button) this.f5454d.findViewById(2131558966);
        this.f5457g.setOnClickListener(new QuickGameFragment(this));
        return this.f5454d;
    }

    public final void m3524a(String str, List<Object> list) {
        Intent intent;
        if (str.equalsIgnoreCase("NOTIFY_ENTER_QUICK_GAME_ROOM_SUCCESS")) {
            this.f5455e.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            this.f5453c.dismiss();
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(((Long) list.get(0)).longValue(), 2);
            if (a != null) {
                RuntimeData.f6672c = a.f5762w;
            }
            GameRoom a2 = DBManager.m3631a().f5572l.m3656a(a.f5750k.longValue(), a.f5741b.longValue());
            BaseApplication.f5509b.m3212d();
            Bundle bundle;
            if (a.f5722I.intValue() != 2) {
                if (a.f5723J.intValue() == 1) {
                    intent = new Intent(getContext(), QuickChatRoomActivity.class);
                    bundle = new Bundle();
                    bundle.putInt("eTalkType", a.f5724K.intValue());
                    bundle.putLong("lChatRoomId", a.f5741b.longValue());
                    bundle.putInt("eGameRoomType", a.f5722I.intValue());
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else if (a.f5723J.intValue() == 2) {
                    NetworkUtil.m4073a();
                    NetworkUtil.m4169h(a.f5750k.longValue());
                }
            } else if (a2.f5880d.booleanValue()) {
                NetworkUtil.m4073a();
                NetworkUtil.m4171i(a2.f5897u.longValue());
            } else {
                intent = new Intent(getContext(), QuickChatRoomActivity.class);
                bundle = new Bundle();
                bundle.putInt("eTalkType", a.f5724K.intValue());
                bundle.putLong("lChatRoomId", a.f5741b.longValue());
                bundle.putInt("eGameRoomType", a.f5722I.intValue());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_QUICK_GAME_ROOM_FAULT")) {
            m3519a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
            if (BaseApplication.f5509b.f4666c == 2) {
                long longValue = ((Long) list.get(0)).longValue();
                byte[] bArr = (byte[]) list.get(1);
                RuntimeData.f6672c = DBManager.m3631a().f5572l.m3656a(longValue, ((Long) list.get(2)).longValue()).f5863C;
                RuntimeData.f6674e = longValue;
                intent = new Intent(getContext(), AppActivity.class);
                intent.putExtra("gameType", AppActivity.k);
                intent.putExtra("responseData", bArr);
                intent.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
                intent.putExtra("lGameRoomId", longValue);
                intent.setFlags(67108864);
                intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                intent.putExtra("returnTo", AppActivity.h);
                startActivity(intent);
                getActivity().finish();
                getActivity().overridePendingTransition(0, 0);
                this.f5453c.dismiss();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT")) {
            m3519a((List) list);
        }
    }

    private void m3519a(List<Object> list) {
        int intValue = ((Integer) list.get(0)).intValue();
        this.f5453c.dismiss();
        new Builder(getContext()).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new QuickGameFragment(this)).show();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public final void onResume() {
        super.onResume();
    }

    static /* synthetic */ void m3518a(QuickGameFragment quickGameFragment) {
        InputMethodManager inputMethodManager = (InputMethodManager) quickGameFragment.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(quickGameFragment.f5454d.getApplicationWindowToken(), 0);
        }
    }

    static /* synthetic */ void m3520b(QuickGameFragment quickGameFragment) {
        if (StringUtils.m4462a(quickGameFragment.f5455e.getText().toString().trim())) {
            quickGameFragment.f5456f.setEnabled(false);
        } else {
            quickGameFragment.f5456f.setEnabled(true);
        }
    }

    static /* synthetic */ void m3522d(QuickGameFragment quickGameFragment) {
        String trim = quickGameFragment.f5455e.getText().toString().trim();
        if (StringUtils.m4462a((CharSequence) trim) || trim.length() != 6) {
            new Builder(quickGameFragment.getContext()).setTitle(2131165514).setMessage(2131165844).setPositiveButton(2131165438, new QuickGameFragment(quickGameFragment)).show();
            return;
        }
        quickGameFragment.f5453c = new LoadingDialog(quickGameFragment.getContext());
        quickGameFragment.f5453c.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4138b(trim);
    }

    static /* synthetic */ void m3523e(QuickGameFragment quickGameFragment) {
        Intent intent = new Intent(quickGameFragment.getActivity(), CreateGameActivity.class);
        intent.putExtra("lChatRoomId", -1);
        quickGameFragment.startActivity(intent);
        quickGameFragment.getActivity().overridePendingTransition(2131034124, 0);
    }
}
