package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.a.g.AnonymousClass10;
import com.illuminate.texaspoker.a.g.AnonymousClass11;
import com.illuminate.texaspoker.a.g.AnonymousClass12;
import com.illuminate.texaspoker.a.g.AnonymousClass13;
import com.illuminate.texaspoker.a.g.AnonymousClass14;
import com.illuminate.texaspoker.a.g.AnonymousClass15;
import com.illuminate.texaspoker.a.g.AnonymousClass16;
import com.illuminate.texaspoker.a.g.AnonymousClass17;
import com.illuminate.texaspoker.a.g.AnonymousClass18;
import com.illuminate.texaspoker.a.g.AnonymousClass19;
import com.illuminate.texaspoker.a.g.AnonymousClass20;
import com.illuminate.texaspoker.a.g.AnonymousClass21;
import com.illuminate.texaspoker.a.g.AnonymousClass22;
import com.illuminate.texaspoker.a.g.AnonymousClass23;
import com.illuminate.texaspoker.a.g.AnonymousClass24;
import com.illuminate.texaspoker.a.g.AnonymousClass25;
import com.illuminate.texaspoker.a.g.AnonymousClass26;
import com.illuminate.texaspoker.a.g.AnonymousClass27;
import com.illuminate.texaspoker.a.g.AnonymousClass29;
import com.illuminate.texaspoker.a.g.AnonymousClass30;
import com.illuminate.texaspoker.a.g.AnonymousClass32;
import com.illuminate.texaspoker.a.g.AnonymousClass33;
import com.illuminate.texaspoker.a.g.AnonymousClass34;
import com.illuminate.texaspoker.a.g.AnonymousClass35;
import com.illuminate.texaspoker.a.g.AnonymousClass36;
import com.illuminate.texaspoker.a.g.AnonymousClass37;
import com.illuminate.texaspoker.a.g.AnonymousClass38;
import com.illuminate.texaspoker.a.g.AnonymousClass39;
import com.illuminate.texaspoker.activity.BillActivity;
import com.illuminate.texaspoker.activity.BillSngActivity;
import com.illuminate.texaspoker.activity.ChatRoomActivity;
import com.illuminate.texaspoker.activity.FriendInfoActivity;
import com.illuminate.texaspoker.activity.PlayPokerHistoryActivity;
import com.illuminate.texaspoker.dao.ChatMsgDao;
import com.illuminate.texaspoker.dao.ChatMsgDao.Properties;
import com.illuminate.texaspoker.p057b.ChatMsgDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sqlcipher.database.SQLiteDatabase;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.a.g */
public final class ChatMsgListAdapter extends BaseAdapter {
    private static String f3257g;
    public Map<Long, Timer> f3258a;
    public long f3259b;
    public int f3260c;
    public boolean f3261d;
    public MapList<Long, ChatMsg> f3262e;
    private SimpleDateFormat f3263f;
    private Pattern f3264h;
    private Context f3265i;
    private int f3266j;
    private int f3267k;
    private long f3268l;
    private MediaPlayer f3269m;
    private Handler f3270n;

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.10 */
    class AnonymousClass10 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3067a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3068b;

        AnonymousClass10(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3068b = chatMsgListAdapter;
            this.f3067a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3068b, this.f3067a, false);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.11 */
    class AnonymousClass11 extends TimerTask {
        final /* synthetic */ ChatMsg f3069a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3070b;

        AnonymousClass11(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3070b = chatMsgListAdapter;
            this.f3069a = chatMsg;
        }

        public final void run() {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2694a(this.f3070b, this.f3069a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.12 */
    class AnonymousClass12 implements OnClickListener {
        final /* synthetic */ ChatMsg f3071a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3072b;

        AnonymousClass12(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3072b = chatMsgListAdapter;
            this.f3071a = chatMsg;
        }

        public final void onClick(View view) {
            new Builder(this.f3072b.f3265i).setTitle(2131165295).setMessage(LetterIndexBar.SEARCH_ICON_LETTER).setPositiveButton(2131165480, new AnonymousClass32(this.f3072b, this.f3071a)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3112a;

                {
                    this.f3112a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.13 */
    class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ ChatMsg f3073a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3074b;

        AnonymousClass13(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3074b = chatMsgListAdapter;
            this.f3073a = chatMsg;
        }

        public final void onClick(View view) {
            new Builder(this.f3074b.f3265i).setTitle(2131165295).setMessage(LetterIndexBar.SEARCH_ICON_LETTER).setPositiveButton(2131165480, new AnonymousClass32(this.f3072b, this.f3073a)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3112a;

                {
                    this.f3112a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.14 */
    class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ FriendUser f3075a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3076b;

        AnonymousClass14(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, FriendUser friendUser) {
            this.f3076b = chatMsgListAdapter;
            this.f3075a = friendUser;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2692a(this.f3076b, this.f3075a.f5842u.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.15 */
    class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ PokerHistory f3077a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3078b;

        AnonymousClass15(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, PokerHistory pokerHistory) {
            this.f3078b = chatMsgListAdapter;
            this.f3077a = pokerHistory;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2696a(this.f3078b, this.f3077a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.16 */
    class AnonymousClass16 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3079a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3080b;

        AnonymousClass16(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3080b = chatMsgListAdapter;
            this.f3079a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3080b, this.f3079a, false);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.17 */
    class AnonymousClass17 implements OnClickListener {
        final /* synthetic */ FriendUser f3081a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3082b;

        AnonymousClass17(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, FriendUser friendUser) {
            this.f3082b = chatMsgListAdapter;
            this.f3081a = friendUser;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2692a(this.f3082b, this.f3081a.f5842u.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.18 */
    class AnonymousClass18 implements OnClickListener {
        final /* synthetic */ PokerHistory f3083a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3084b;

        AnonymousClass18(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, PokerHistory pokerHistory) {
            this.f3084b = chatMsgListAdapter;
            this.f3083a = pokerHistory;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2696a(this.f3084b, this.f3083a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.19 */
    class AnonymousClass19 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3085a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3086b;

        AnonymousClass19(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3086b = chatMsgListAdapter;
            this.f3085a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3086b, this.f3085a, false);
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.1 */
    class ChatMsgListAdapter extends TimerTask {
        final /* synthetic */ ChatMsg f3087a;
        final /* synthetic */ ChatMsgListAdapter f3088b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3088b = chatMsgListAdapter;
            this.f3087a = chatMsg;
        }

        public final void run() {
            ChatMsgListAdapter.m2694a(this.f3088b, this.f3087a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.20 */
    class AnonymousClass20 implements OnClickListener {
        final /* synthetic */ ChatMsg f3089a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3090b;

        AnonymousClass20(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3090b = chatMsgListAdapter;
            this.f3089a = chatMsg;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2700b(this.f3090b, this.f3089a.f5689b.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.21 */
    class AnonymousClass21 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3091a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3092b;

        AnonymousClass21(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3092b = chatMsgListAdapter;
            this.f3091a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3092b, this.f3091a, false);
            return true;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.22 */
    class AnonymousClass22 extends TimerTask {
        final /* synthetic */ ChatMsg f3093a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3094b;

        AnonymousClass22(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3094b = chatMsgListAdapter;
            this.f3093a = chatMsg;
        }

        public final void run() {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2694a(this.f3094b, this.f3093a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.23 */
    class AnonymousClass23 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3095a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3096b;

        AnonymousClass23(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3096b = chatMsgListAdapter;
            this.f3095a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3096b, this.f3095a, true);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.24 */
    class AnonymousClass24 implements OnClickListener {
        final /* synthetic */ ChatMsg f3097a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3098b;

        AnonymousClass24(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3098b = chatMsgListAdapter;
            this.f3097a = chatMsg;
        }

        public final void onClick(View view) {
            new Builder(this.f3098b.f3265i).setTitle(2131165295).setMessage(LetterIndexBar.SEARCH_ICON_LETTER).setPositiveButton(2131165480, new AnonymousClass32(this.f3072b, this.f3097a)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3112a;

                {
                    this.f3112a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.25 */
    class AnonymousClass25 implements OnClickListener {
        final /* synthetic */ FriendUser f3099a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3100b;

        AnonymousClass25(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, FriendUser friendUser) {
            this.f3100b = chatMsgListAdapter;
            this.f3099a = friendUser;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2692a(this.f3100b, this.f3099a.f5842u.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.26 */
    class AnonymousClass26 implements OnClickListener {
        final /* synthetic */ ChatMsg f3101a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3102b;

        AnonymousClass26(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3102b = chatMsgListAdapter;
            this.f3101a = chatMsg;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2700b(this.f3102b, this.f3101a.f5689b.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.27 */
    class AnonymousClass27 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3103a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3104b;

        AnonymousClass27(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3104b = chatMsgListAdapter;
            this.f3103a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3104b, this.f3103a, false);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.29 */
    class AnonymousClass29 implements DialogInterface.OnClickListener {
        final /* synthetic */ ChatMsg f3106a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3107b;

        AnonymousClass29(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3107b = chatMsgListAdapter;
            this.f3106a = chatMsg;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                ((ClipboardManager) this.f3107b.f3265i.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("msgContent", this.f3106a.f5690c));
            } else {
                com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2704c(this.f3107b, this.f3106a);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.2 */
    class ChatMsgListAdapter implements OnClickListener {
        final /* synthetic */ FriendUser f3108a;
        final /* synthetic */ ChatMsgListAdapter f3109b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, FriendUser friendUser) {
            this.f3109b = chatMsgListAdapter;
            this.f3108a = friendUser;
        }

        public final void onClick(View view) {
            ChatMsgListAdapter.m2692a(this.f3109b, this.f3108a.f5842u.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.30 */
    class AnonymousClass30 implements DialogInterface.OnClickListener {
        final /* synthetic */ ChatMsg f3110a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3111b;

        AnonymousClass30(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3111b = chatMsgListAdapter;
            this.f3110a = chatMsg;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2704c(this.f3111b, this.f3110a);
            }
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.32 */
    class AnonymousClass32 implements DialogInterface.OnClickListener {
        final /* synthetic */ ChatMsg f3113a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3114b;

        AnonymousClass32(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3114b = chatMsgListAdapter;
            this.f3113a = chatMsg;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2707d(this.f3114b, this.f3113a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.33 */
    class AnonymousClass33 implements OnCompletionListener {
        final /* synthetic */ FileInputStream f3115a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3116b;

        AnonymousClass33(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, FileInputStream fileInputStream) {
            this.f3116b = chatMsgListAdapter;
            this.f3115a = fileInputStream;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
            try {
                this.f3115a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f3116b.f3269m = null;
            this.f3116b.f3268l = -1;
            VoiceFileUtility.m4202a(this.f3116b.f3265i, "res/social_sound/play_completed.mp3");
            this.f3116b.notifyDataSetChanged();
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.34 */
    class AnonymousClass34 implements OnClickListener {
        final /* synthetic */ FriendUser f3117a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3118b;

        AnonymousClass34(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, FriendUser friendUser) {
            this.f3118b = chatMsgListAdapter;
            this.f3117a = friendUser;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2692a(this.f3118b, this.f3117a.f5842u.longValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.35 */
    class AnonymousClass35 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3119a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3120b;

        AnonymousClass35(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3120b = chatMsgListAdapter;
            this.f3119a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3120b, this.f3119a, true);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.36 */
    class AnonymousClass36 implements OnClickListener {
        final /* synthetic */ long f3121a;
        final /* synthetic */ Bill f3122b;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3123c;

        AnonymousClass36(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, long j, Bill bill) {
            this.f3123c = chatMsgListAdapter;
            this.f3121a = j;
            this.f3122b = bill;
        }

        public final void onClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2693a(this.f3123c, this.f3121a, this.f3122b.f5644c.intValue());
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.37 */
    class AnonymousClass37 implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3124a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3125b;

        AnonymousClass37(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3125b = chatMsgListAdapter;
            this.f3124a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2695a(this.f3125b, this.f3124a, false);
            return false;
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.38 */
    class AnonymousClass38 extends TimerTask {
        final /* synthetic */ ChatMsg f3126a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3127b;

        AnonymousClass38(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3127b = chatMsgListAdapter;
            this.f3126a = chatMsg;
        }

        public final void run() {
            com.illuminate.texaspoker.p055a.ChatMsgListAdapter.m2694a(this.f3127b, this.f3126a);
        }
    }

    /* compiled from: ChatMsgListAdapter */
    /* renamed from: com.illuminate.texaspoker.a.g.39 */
    class AnonymousClass39 implements OnClickListener {
        final /* synthetic */ ChatMsg f3128a;
        final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3129b;

        AnonymousClass39(com.illuminate.texaspoker.p055a.ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3129b = chatMsgListAdapter;
            this.f3128a = chatMsg;
        }

        public final void onClick(View view) {
            new Builder(this.f3129b.f3265i).setTitle(2131165295).setMessage(LetterIndexBar.SEARCH_ICON_LETTER).setPositiveButton(2131165480, new AnonymousClass32(this.f3072b, this.f3128a)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3112a;

                {
                    this.f3112a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.3 */
    class ChatMsgListAdapter implements OnClickListener {
        final /* synthetic */ long f3130a;
        final /* synthetic */ Bill f3131b;
        final /* synthetic */ ChatMsgListAdapter f3132c;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, long j, Bill bill) {
            this.f3132c = chatMsgListAdapter;
            this.f3130a = j;
            this.f3131b = bill;
        }

        public final void onClick(View view) {
            ChatMsgListAdapter.m2693a(this.f3132c, this.f3130a, this.f3131b.f5644c.intValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.4 */
    class ChatMsgListAdapter implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3133a;
        final /* synthetic */ ChatMsgListAdapter f3134b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3134b = chatMsgListAdapter;
            this.f3133a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            ChatMsgListAdapter.m2695a(this.f3134b, this.f3133a, false);
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.5 */
    class ChatMsgListAdapter implements OnClickListener {
        final /* synthetic */ PokerHistory f3135a;
        final /* synthetic */ ChatMsgListAdapter f3136b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, PokerHistory pokerHistory) {
            this.f3136b = chatMsgListAdapter;
            this.f3135a = pokerHistory;
        }

        public final void onClick(View view) {
            ChatMsgListAdapter.m2696a(this.f3136b, this.f3135a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.6 */
    class ChatMsgListAdapter implements OnLongClickListener {
        final /* synthetic */ ChatMsg f3137a;
        final /* synthetic */ ChatMsgListAdapter f3138b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3138b = chatMsgListAdapter;
            this.f3137a = chatMsg;
        }

        public final boolean onLongClick(View view) {
            ChatMsgListAdapter.m2695a(this.f3138b, this.f3137a, false);
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.7 */
    class ChatMsgListAdapter extends TimerTask {
        final /* synthetic */ ChatMsg f3139a;
        final /* synthetic */ ChatMsgListAdapter f3140b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3140b = chatMsgListAdapter;
            this.f3139a = chatMsg;
        }

        public final void run() {
            ChatMsgListAdapter.m2694a(this.f3140b, this.f3139a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.8 */
    class ChatMsgListAdapter implements OnClickListener {
        final /* synthetic */ ChatMsg f3141a;
        final /* synthetic */ ChatMsgListAdapter f3142b;

        ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
            this.f3142b = chatMsgListAdapter;
            this.f3141a = chatMsg;
        }

        public final void onClick(View view) {
            new Builder(this.f3142b.f3265i).setTitle(2131165295).setMessage(LetterIndexBar.SEARCH_ICON_LETTER).setPositiveButton(2131165480, new AnonymousClass32(this.f3072b, this.f3141a)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3112a;

                {
                    this.f3112a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.9 */
    class ChatMsgListAdapter implements OnClickListener {
        final /* synthetic */ PokerHistory f3143a;
        final /* synthetic */ ChatMsgListAdapter f3144b;

        static {
            fixHelper.fixfunc(new int[]{652, 653});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, PokerHistory pokerHistory);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.a */
    private class ChatMsgListAdapter extends ClickableSpan {
        final /* synthetic */ ChatMsgListAdapter f3148a;
        private String f3149b;

        /* renamed from: com.illuminate.texaspoker.a.g.a.1 */
        class ChatMsgListAdapter implements DialogInterface.OnClickListener {
            final /* synthetic */ View f3146a;
            final /* synthetic */ ChatMsgListAdapter f3147b;

            /* renamed from: com.illuminate.texaspoker.a.g.a.1.1 */
            class ChatMsgListAdapter implements DialogInterface.OnClickListener {
                final /* synthetic */ ChatMsgListAdapter f3145a;

                ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
                    this.f3145a = chatMsgListAdapter;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        Context context = this.f3145a.f3146a.getContext();
                        Intent intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/person");
                        intent.setType("vnd.android.cursor.dir/contact");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                        intent.putExtra("phone_type", 2);
                        intent.putExtra("phone", this.f3145a.f3147b.f3149b.substring(4, this.f3145a.f3147b.f3149b.length()));
                        context.startActivity(intent);
                        return;
                    }
                    context = this.f3145a.f3146a.getContext();
                    intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                    intent.setType("vnd.android.cursor.item/person");
                    intent.setType("vnd.android.cursor.item/contact");
                    intent.setType("vnd.android.cursor.item/raw_contact");
                    intent.putExtra("phone_type", 2);
                    intent.putExtra("phone", this.f3145a.f3147b.f3149b.substring(4, this.f3145a.f3147b.f3149b.length()));
                    context.startActivity(intent);
                }
            }

            ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, View view) {
                this.f3147b = chatMsgListAdapter;
                this.f3146a = view;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Uri parse = Uri.parse(this.f3147b.f3149b);
                    Context context = this.f3146a.getContext();
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.w("ChatMsgListAdapter", "Actvity was not found for intent, " + intent.toString());
                    }
                } else if (i == 1) {
                    ((ClipboardManager) this.f3147b.f3148a.f3265i.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("msgContent", this.f3147b.f3149b.substring(4, this.f3147b.f3149b.length())));
                } else {
                    new Builder(this.f3147b.f3148a.f3265i).setItems(2131492873, new ChatMsgListAdapter(this)).show();
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{2725, 2726, 2727});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter, String str);

        public final native void onClick(View view);

        public final native void updateDrawState(TextPaint textPaint);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.b */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3150a;
        public Button f3151b;
        public TextView f3152c;
        public ImageButton f3153d;
        public TextView f3154e;
        public ImageView f3155f;
        public TextView f3156g;
        public TextView f3157h;
        final /* synthetic */ ChatMsgListAdapter f3158i;

        static {
            fixHelper.fixfunc(new int[]{3367, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.c */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3159a;
        public Button f3160b;
        public TextView f3161c;
        public ImageButton f3162d;
        public TextView f3163e;
        public ImageView f3164f;
        public TextView f3165g;
        public ImageView f3166h;
        public TextView f3167i;
        public TextView f3168j;
        public TextView f3169k;
        final /* synthetic */ ChatMsgListAdapter f3170l;

        static {
            fixHelper.fixfunc(new int[]{3424, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.d */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3171a;
        public Button f3172b;
        public TextView f3173c;
        public ImageButton f3174d;
        public TextView f3175e;
        public ImageView f3176f;
        public TextView f3177g;
        public ImageView f3178h;
        public TextView f3179i;
        public ImageView f3180j;
        public TextView f3181k;
        public ImageView f3182l;
        public TextView f3183m;
        public TextView f3184n;
        public TextView f3185o;
        final /* synthetic */ ChatMsgListAdapter f3186p;

        static {
            fixHelper.fixfunc(new int[]{3439, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.e */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3187a;
        public Button f3188b;
        public TextView f3189c;
        public TextView f3190d;
        final /* synthetic */ ChatMsgListAdapter f3191e;

        static {
            fixHelper.fixfunc(new int[]{3511, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.f */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3192a;
        public Button f3193b;
        public TextView f3194c;
        public ImageButton f3195d;
        public ImageView f3196e;
        public ImageView f3197f;
        public TextView f3198g;
        final /* synthetic */ ChatMsgListAdapter f3199h;

        static {
            fixHelper.fixfunc(new int[]{2989, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.g */
    public final class ChatMsgListAdapter {
        public TextView f3200a;
        final /* synthetic */ ChatMsgListAdapter f3201b;

        static {
            fixHelper.fixfunc(new int[]{3027, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.h */
    public final class ChatMsgListAdapter {
        public ProgressBar f3202a;
        final /* synthetic */ ChatMsgListAdapter f3203b;

        static {
            fixHelper.fixfunc(new int[]{3063, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.i */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3204a;
        public ImageButton f3205b;
        public TextView f3206c;
        public ImageView f3207d;
        public TextView f3208e;
        public TextView f3209f;
        public ImageButton f3210g;
        public ProgressBar f3211h;
        final /* synthetic */ ChatMsgListAdapter f3212i;

        static {
            fixHelper.fixfunc(new int[]{3170, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter);
    }

    /* renamed from: com.illuminate.texaspoker.a.g.j */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3213a;
        public ImageButton f3214b;
        public TextView f3215c;
        public ImageView f3216d;
        public TextView f3217e;
        public ImageView f3218f;
        public TextView f3219g;
        public TextView f3220h;
        public TextView f3221i;
        public ImageButton f3222j;
        public ProgressBar f3223k;
        final /* synthetic */ ChatMsgListAdapter f3224l;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3224l = chatMsgListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.k */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3225a;
        public ImageButton f3226b;
        public TextView f3227c;
        public ImageView f3228d;
        public TextView f3229e;
        public ImageView f3230f;
        public TextView f3231g;
        public ImageView f3232h;
        public TextView f3233i;
        public ImageView f3234j;
        public TextView f3235k;
        public TextView f3236l;
        public TextView f3237m;
        public ImageButton f3238n;
        public ProgressBar f3239o;
        final /* synthetic */ ChatMsgListAdapter f3240p;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3240p = chatMsgListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.l */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3241a;
        public TextView f3242b;
        public ImageButton f3243c;
        public ProgressBar f3244d;
        final /* synthetic */ ChatMsgListAdapter f3245e;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3245e = chatMsgListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.m */
    public final class ChatMsgListAdapter {
        public SimpleDraweeView f3246a;
        public ImageButton f3247b;
        public ImageView f3248c;
        public ImageButton f3249d;
        public TextView f3250e;
        public ProgressBar f3251f;
        final /* synthetic */ ChatMsgListAdapter f3252g;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3252g = chatMsgListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.n */
    public final class ChatMsgListAdapter {
        public TextView f3253a;
        final /* synthetic */ ChatMsgListAdapter f3254b;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3254b = chatMsgListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.g.o */
    public final class ChatMsgListAdapter {
        public TextView f3255a;
        final /* synthetic */ ChatMsgListAdapter f3256b;

        public ChatMsgListAdapter(ChatMsgListAdapter chatMsgListAdapter) {
            this.f3256b = chatMsgListAdapter;
        }
    }

    static /* synthetic */ void m2693a(ChatMsgListAdapter chatMsgListAdapter, long j, int i) {
        if (i == 2) {
            Intent intent = new Intent(chatMsgListAdapter.f3265i, BillSngActivity.class);
            intent.putExtra("billId", j);
            intent.putExtra("fromShare", true);
            chatMsgListAdapter.f3265i.startActivity(intent);
            return;
        }
        intent = new Intent(chatMsgListAdapter.f3265i, BillActivity.class);
        intent.putExtra("billId", j);
        intent.putExtra("fromShare", true);
        chatMsgListAdapter.f3265i.startActivity(intent);
    }

    static /* synthetic */ void m2700b(ChatMsgListAdapter chatMsgListAdapter, long j) {
        if (!new File(VoiceFileUtility.m4205b(chatMsgListAdapter.f3259b, j, chatMsgListAdapter.f3260c)).exists()) {
            return;
        }
        if (chatMsgListAdapter.f3268l != -1) {
            if (chatMsgListAdapter.f3269m != null) {
                if (chatMsgListAdapter.f3269m.isPlaying()) {
                    chatMsgListAdapter.f3269m.stop();
                }
                chatMsgListAdapter.f3269m.release();
                chatMsgListAdapter.f3269m = null;
            }
            if (chatMsgListAdapter.f3268l != j) {
                chatMsgListAdapter.f3268l = j;
                chatMsgListAdapter.m2706d();
            } else {
                chatMsgListAdapter.f3268l = -1;
            }
            chatMsgListAdapter.notifyDataSetChanged();
            return;
        }
        chatMsgListAdapter.f3268l = j;
        chatMsgListAdapter.m2706d();
    }

    static {
        f3257g = "\\[[a-zA-Z0-9\\-\\\\!\\u4e00-\\u9fa5]+\\]";
    }

    public ChatMsgListAdapter(Context context, long j, int i, boolean z) {
        this.f3258a = new HashMap();
        this.f3270n = new Handler() {
            final /* synthetic */ com.illuminate.texaspoker.p055a.ChatMsgListAdapter f3105a;

            {
                this.f3105a = r1;
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case SQLiteDatabase.OPEN_READWRITE /*0*/:
                        this.f3105a.notifyDataSetChanged();
                    default:
                }
            }
        };
        this.f3265i = context;
        this.f3259b = j;
        this.f3260c = i;
        this.f3261d = z;
        this.f3268l = -1;
        this.f3263f = new SimpleDateFormat(context.getString(2131165232));
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f3266j = displayMetrics.widthPixels - ((int) Utility.m4467a(this.f3265i, 107.0f));
        this.f3267k = (int) Utility.m4467a(this.f3265i, 70.0f);
        this.f3264h = Pattern.compile(f3257g);
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final int getCount() {
        return this.f3262e.m4238a();
    }

    public final Object getItem(int i) {
        return this.f3262e.m4239a(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getItemViewType(int i) {
        ChatMsg chatMsg = (ChatMsg) this.f3262e.m4239a(i);
        if (chatMsg == null) {
            return 11;
        }
        int intValue = chatMsg.f5704q.intValue();
        if (intValue == DBManager.f5554x) {
            return 0;
        }
        if (intValue == DBManager.f5555y) {
            return 1;
        }
        if (intValue == 5) {
            return 2;
        }
        String[] split;
        PokerHistory a;
        if (chatMsg.f5701n.longValue() == SharedPreferencesManager.m4308b()) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return 4;
                }
                if (intValue == 3) {
                    return 5;
                }
                if (intValue == 12) {
                    split = chatMsg.f5690c.split("-");
                    a = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
                    if (a.f5962h == null || !a.f5962h.booleanValue()) {
                        return 6;
                    }
                    return 12;
                }
            }
            return 3;
        } else if (intValue == 1) {
            return 7;
        } else {
            if (intValue == 2) {
                return 8;
            }
            if (intValue == 3) {
                return 9;
            }
            if (intValue != 12) {
                return 7;
            }
            split = chatMsg.f5690c.split("-");
            a = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
            if (a.f5962h == null || !a.f5962h.booleanValue()) {
                return 10;
            }
            return 13;
        }
    }

    public final int getViewTypeCount() {
        return 14;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ChatMsg chatMsg = (ChatMsg) this.f3262e.m4239a(i);
        Timer timer;
        long parseLong;
        Bill a;
        Drawable drawable;
        CharSequence charSequence;
        int intValue;
        String[] split;
        PokerHistory a2;
        FriendUser e;
        switch (getItemViewType(i)) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                ChatMsgListAdapter chatMsgListAdapter;
                if (view == null) {
                    ChatMsgListAdapter chatMsgListAdapter2 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968747, null);
                    chatMsgListAdapter2.f3255a = (TextView) view.findViewById(2131559109);
                    view.setTag(chatMsgListAdapter2);
                    chatMsgListAdapter = chatMsgListAdapter2;
                } else {
                    chatMsgListAdapter = (ChatMsgListAdapter) view.getTag();
                }
                chatMsgListAdapter.f3255a.setText(Utility.m4489c(chatMsg.m3723c().longValue()));
                return view;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                ChatMsgListAdapter chatMsgListAdapter3;
                if (view == null) {
                    ChatMsgListAdapter chatMsgListAdapter4 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968747, null);
                    chatMsgListAdapter4.f3253a = (TextView) view.findViewById(2131559109);
                    view.setTag(chatMsgListAdapter4);
                    chatMsgListAdapter3 = chatMsgListAdapter4;
                } else {
                    chatMsgListAdapter3 = (ChatMsgListAdapter) view.getTag();
                }
                chatMsgListAdapter3.f3253a.setText(chatMsg.m3722b());
                return view;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return m2705d(view, chatMsg);
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                ChatMsgListAdapter chatMsgListAdapter5;
                if (view == null) {
                    ChatMsgListAdapter chatMsgListAdapter6 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968745, null);
                    chatMsgListAdapter6.f3241a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter6.f3242b = (TextView) view.findViewById(2131559104);
                    chatMsgListAdapter6.f3243c = (ImageButton) view.findViewById(2131558815);
                    chatMsgListAdapter6.f3244d = (ProgressBar) view.findViewById(2131559128);
                    chatMsgListAdapter6.f3242b.setMovementMethod(LinkMovementMethod.getInstance());
                    view.setTag(chatMsgListAdapter6);
                    chatMsgListAdapter5 = chatMsgListAdapter6;
                } else {
                    chatMsgListAdapter5 = (ChatMsgListAdapter) view.getTag();
                }
                if (SharedPreferencesManager.m4408p() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter5.f3241a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter5.f3241a.getHierarchy()).m1407a(2130903193);
                }
                chatMsgListAdapter5.f3241a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
                CharSequence a3 = m2690a(chatMsg.m3722b());
                chatMsgListAdapter5.f3242b.setAutoLinkMask(5);
                chatMsgListAdapter5.f3242b.setText(a3);
                Spannable spannable = (Spannable) chatMsgListAdapter5.f3242b.getText();
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, a3.length(), URLSpan.class);
                CharSequence spannableStringBuilder = new SpannableStringBuilder(a3);
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new ChatMsgListAdapter(this, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
                }
                chatMsgListAdapter5.f3242b.setAutoLinkMask(0);
                chatMsgListAdapter5.f3242b.setText(spannableStringBuilder);
                if (chatMsg.m3724d().intValue() == DBManager.f5542E) {
                    if ((System.currentTimeMillis() + RuntimeData.f6671b) - chatMsg.m3721a().longValue() > 40000) {
                        chatMsgListAdapter5.f3243c.setVisibility(0);
                        chatMsgListAdapter5.f3244d.setVisibility(4);
                    } else {
                        if (((Timer) this.f3258a.get(chatMsg.m3721a())) == null) {
                            timer = new Timer();
                            timer.schedule(new ChatMsgListAdapter(this, chatMsg), 40000);
                            this.f3258a.put(chatMsg.m3721a(), timer);
                        }
                        chatMsgListAdapter5.f3243c.setVisibility(4);
                        chatMsgListAdapter5.f3244d.setVisibility(0);
                    }
                } else if (chatMsg.m3724d().intValue() == DBManager.f5543F) {
                    chatMsgListAdapter5.f3243c.setVisibility(0);
                    chatMsgListAdapter5.f3244d.setVisibility(4);
                } else {
                    chatMsgListAdapter5.f3243c.setVisibility(4);
                    chatMsgListAdapter5.f3244d.setVisibility(4);
                }
                chatMsgListAdapter5.f3243c.setOnClickListener(new AnonymousClass12(this, chatMsg));
                chatMsgListAdapter5.f3242b.setOnLongClickListener(new AnonymousClass23(this, chatMsg));
                return view;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return m2699b(view, chatMsg);
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                ChatMsgListAdapter chatMsgListAdapter7;
                if (view == null) {
                    chatMsgListAdapter7 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968742, null);
                    chatMsgListAdapter7.f3204a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter7.f3205b = (ImageButton) view.findViewById(2131559084);
                    chatMsgListAdapter7.f3206c = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter7.f3208e = (TextView) view.findViewById(2131559087);
                    chatMsgListAdapter7.f3209f = (TextView) view.findViewById(2131559088);
                    chatMsgListAdapter7.f3207d = (ImageView) view.findViewById(2131559085);
                    chatMsgListAdapter7.f3210g = (ImageButton) view.findViewById(2131558815);
                    chatMsgListAdapter7.f3211h = (ProgressBar) view.findViewById(2131559128);
                    view.setTag(chatMsgListAdapter7);
                } else {
                    chatMsgListAdapter7 = (ChatMsgListAdapter) view.getTag();
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                chatMsg.m3725e();
                if (SharedPreferencesManager.m4408p() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter7.f3204a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter7.f3204a.getHierarchy()).m1407a(2130903193);
                }
                chatMsgListAdapter7.f3204a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
                parseLong = Long.parseLong(chatMsg.m3722b());
                a = DBManager.m3631a().f5570j.m3554a(parseLong, true);
                chatMsgListAdapter7.f3205b.setOnClickListener(new AnonymousClass36(this, parseLong, a));
                chatMsgListAdapter7.f3206c.setText(a.m3714h());
                if (a.m3706a().intValue() != 2) {
                    if (a.m3706a().intValue() == 4) {
                        chatMsgListAdapter7.f3207d.setImageResource(2130903116);
                    } else if (a.m3706a().intValue() == 5 || a.m3706a().intValue() == 6) {
                        chatMsgListAdapter7.f3207d.setImageResource(2130903105);
                    } else {
                        chatMsgListAdapter7.f3207d.setImageResource(2130903104);
                    }
                    drawable = this.f3265i.getResources().getDrawable(2130903096);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter7.f3208e.setCompoundDrawables(drawable, null, null, null);
                    drawable = this.f3265i.getResources().getDrawable(2130903092);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter7.f3209f.setCompoundDrawables(drawable, null, null, null);
                    chatMsgListAdapter7.f3208e.setText(this.f3263f.format(new Date(a.m3713g().longValue())));
                    charSequence = Utility.m4508i(a.m3711e().longValue()) + "/" + Utility.m4508i(a.m3712f().longValue());
                    if (!(a.m3710d() == null || a.m3710d().intValue() == 0)) {
                        charSequence = charSequence + "(" + Utility.m4508i((long) a.m3710d().intValue()) + ")";
                    }
                    chatMsgListAdapter7.f3209f.setText(charSequence);
                } else {
                    chatMsgListAdapter7.f3207d.setImageResource(2130903118);
                    drawable = this.f3265i.getResources().getDrawable(2130903094);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter7.f3208e.setCompoundDrawables(drawable, null, null, null);
                    drawable = this.f3265i.getResources().getDrawable(2130903093);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter7.f3209f.setCompoundDrawables(drawable, null, null, null);
                    intValue = a.m3708b().intValue();
                    chatMsgListAdapter7.f3208e.setText(String.format(this.f3265i.getString(2131165274), new Object[]{Integer.valueOf(intValue)}));
                    charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
                    if (a.m3709c().intValue() == 1) {
                        charSequence = this.f3265i.getString(2131165698);
                    } else if (a.m3709c().intValue() == 2) {
                        charSequence = this.f3265i.getString(2131165695);
                    } else if (a.m3709c().intValue() == 3) {
                        charSequence = this.f3265i.getString(2131165691);
                    } else if (a.m3709c().intValue() == 4) {
                        charSequence = this.f3265i.getString(2131165684);
                    }
                    chatMsgListAdapter7.f3209f.setText(charSequence);
                }
                chatMsgListAdapter7.f3205b.setOnLongClickListener(new AnonymousClass37(this, chatMsg));
                if (chatMsg.m3724d().intValue() == DBManager.f5542E) {
                    if ((System.currentTimeMillis() + RuntimeData.f6671b) - chatMsg.m3721a().longValue() > 40000) {
                        chatMsgListAdapter7.f3210g.setVisibility(0);
                        chatMsgListAdapter7.f3211h.setVisibility(4);
                    } else {
                        if (((Timer) this.f3258a.get(chatMsg.m3721a())) == null) {
                            timer = new Timer();
                            timer.schedule(new AnonymousClass38(this, chatMsg), 40000);
                            this.f3258a.put(chatMsg.m3721a(), timer);
                        }
                        chatMsgListAdapter7.f3210g.setVisibility(4);
                        chatMsgListAdapter7.f3211h.setVisibility(0);
                    }
                } else if (chatMsg.m3724d().intValue() == DBManager.f5543F) {
                    chatMsgListAdapter7.f3210g.setVisibility(0);
                    chatMsgListAdapter7.f3211h.setVisibility(4);
                } else {
                    chatMsgListAdapter7.f3210g.setVisibility(4);
                    chatMsgListAdapter7.f3211h.setVisibility(4);
                }
                chatMsgListAdapter7.f3210g.setOnClickListener(new AnonymousClass39(this, chatMsg));
                return view;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                ChatMsgListAdapter chatMsgListAdapter8;
                split = chatMsg.m3722b().split("-");
                a2 = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
                if (view == null) {
                    chatMsgListAdapter8 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968743, null);
                    chatMsgListAdapter8.f3213a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter8.f3214b = (ImageButton) view.findViewById(2131559090);
                    chatMsgListAdapter8.f3215c = (TextView) view.findViewById(2131559092);
                    chatMsgListAdapter8.f3216d = (ImageView) view.findViewById(2131559091);
                    chatMsgListAdapter8.f3217e = (TextView) view.findViewById(2131559094);
                    chatMsgListAdapter8.f3218f = (ImageView) view.findViewById(2131559093);
                    chatMsgListAdapter8.f3219g = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter8.f3220h = (TextView) view.findViewById(2131559096);
                    chatMsgListAdapter8.f3221i = (TextView) view.findViewById(2131559051);
                    chatMsgListAdapter8.f3222j = (ImageButton) view.findViewById(2131558815);
                    chatMsgListAdapter8.f3223k = (ProgressBar) view.findViewById(2131559128);
                    view.setTag(chatMsgListAdapter8);
                } else {
                    chatMsgListAdapter8 = (ChatMsgListAdapter) view.getTag();
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                chatMsg.m3725e();
                if (SharedPreferencesManager.m4408p() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter8.f3213a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter8.f3213a.getHierarchy()).m1407a(2130903193);
                }
                chatMsgListAdapter8.f3213a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
                chatMsgListAdapter8.f3219g.setText(a2.m3746h());
                if (a2.m3739a() == null || a2.m3739a().intValue() < 0 || a2.m3739a().intValue() > 51) {
                    chatMsgListAdapter8.f3216d.setImageResource(2130903085);
                    chatMsgListAdapter8.f3215c.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter8.f3216d.setImageResource(m2697b(a2.m3739a().intValue()));
                    chatMsgListAdapter8.f3215c.setText(ChatMsgListAdapter.m2691a(a2.m3739a().intValue()));
                }
                if (a2.m3740b() == null || a2.m3740b().intValue() < 0 || a2.m3740b().intValue() > 51) {
                    chatMsgListAdapter8.f3218f.setImageResource(2130903085);
                    chatMsgListAdapter8.f3217e.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter8.f3218f.setImageResource(m2697b(a2.m3740b().intValue()));
                    chatMsgListAdapter8.f3217e.setText(ChatMsgListAdapter.m2691a(a2.m3740b().intValue()));
                }
                charSequence = Utility.m4508i(a2.m3745g().longValue()) + "/" + Utility.m4508i(a2.m3743e().longValue());
                if (!(a2.m3747i() == null || a2.m3747i().intValue() == 0)) {
                    charSequence = charSequence + "(" + a2.m3747i() + ")";
                }
                chatMsgListAdapter8.f3221i.setText(charSequence);
                if (a2.m3744f().longValue() > 0) {
                    chatMsgListAdapter8.f3220h.setText("+" + Utility.m4502g(a2.m3744f().longValue()));
                } else {
                    chatMsgListAdapter8.f3220h.setText(Utility.m4502g(a2.m3744f().longValue()));
                }
                chatMsgListAdapter8.f3214b.setOnClickListener(new ChatMsgListAdapter(this, a2));
                chatMsgListAdapter8.f3214b.setOnLongClickListener(new ChatMsgListAdapter(this, chatMsg));
                if (chatMsg.m3724d().intValue() == DBManager.f5542E) {
                    if ((System.currentTimeMillis() + RuntimeData.f6671b) - chatMsg.m3721a().longValue() > 40000) {
                        chatMsgListAdapter8.f3222j.setVisibility(0);
                        chatMsgListAdapter8.f3223k.setVisibility(4);
                    } else {
                        if (((Timer) this.f3258a.get(chatMsg.m3721a())) == null) {
                            timer = new Timer();
                            timer.schedule(new ChatMsgListAdapter(this, chatMsg), 40000);
                            this.f3258a.put(chatMsg.m3721a(), timer);
                        }
                        chatMsgListAdapter8.f3222j.setVisibility(4);
                        chatMsgListAdapter8.f3223k.setVisibility(0);
                    }
                } else if (chatMsg.m3724d().intValue() == DBManager.f5543F) {
                    chatMsgListAdapter8.f3222j.setVisibility(0);
                    chatMsgListAdapter8.f3223k.setVisibility(4);
                } else {
                    chatMsgListAdapter8.f3222j.setVisibility(4);
                    chatMsgListAdapter8.f3223k.setVisibility(4);
                }
                chatMsgListAdapter8.f3222j.setOnClickListener(new ChatMsgListAdapter(this, chatMsg));
                return view;
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                return m2689a(view, chatMsg);
            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                return m2703c(view, chatMsg);
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                ChatMsgListAdapter chatMsgListAdapter9;
                if (view == null) {
                    chatMsgListAdapter9 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968733, null);
                    chatMsgListAdapter9.f3150a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter9.f3151b = (Button) view.findViewById(2131558619);
                    chatMsgListAdapter9.f3152c = (TextView) view.findViewById(2131558840);
                    chatMsgListAdapter9.f3153d = (ImageButton) view.findViewById(2131559084);
                    chatMsgListAdapter9.f3154e = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter9.f3156g = (TextView) view.findViewById(2131559087);
                    chatMsgListAdapter9.f3157h = (TextView) view.findViewById(2131559088);
                    chatMsgListAdapter9.f3155f = (ImageView) view.findViewById(2131559085);
                    view.setTag(chatMsgListAdapter9);
                } else {
                    chatMsgListAdapter9 = (ChatMsgListAdapter) view.getTag();
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                FriendUser e2 = chatMsg.m3725e();
                if (e2.m3733a().intValue() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter9.f3150a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter9.f3150a.getHierarchy()).m1407a(2130903193);
                }
                chatMsgListAdapter9.f3150a.setImageURI(Uri.parse(e2.m3734b()));
                chatMsgListAdapter9.f3151b.setOnClickListener(new ChatMsgListAdapter(this, e2));
                chatMsgListAdapter9.f3152c.setText(chatMsg.m3725e().m3735c());
                parseLong = Long.parseLong(chatMsg.m3722b());
                a = DBManager.m3631a().f5570j.m3554a(parseLong, true);
                chatMsgListAdapter9.f3153d.setOnClickListener(new ChatMsgListAdapter(this, parseLong, a));
                chatMsgListAdapter9.f3154e.setText(a.m3714h());
                if (a.m3706a().intValue() != 2) {
                    if (a.m3706a().intValue() == 4) {
                        chatMsgListAdapter9.f3155f.setImageResource(2130903116);
                    } else if (a.m3706a().intValue() == 5 || a.m3706a().intValue() == 6) {
                        chatMsgListAdapter9.f3155f.setImageResource(2130903105);
                    } else {
                        chatMsgListAdapter9.f3155f.setImageResource(2130903104);
                    }
                    drawable = this.f3265i.getResources().getDrawable(2130903096);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter9.f3156g.setCompoundDrawables(drawable, null, null, null);
                    drawable = this.f3265i.getResources().getDrawable(2130903092);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter9.f3157h.setCompoundDrawables(drawable, null, null, null);
                    chatMsgListAdapter9.f3156g.setText(this.f3263f.format(new Date(a.m3713g().longValue())));
                    charSequence = Utility.m4508i(a.m3711e().longValue()) + "/" + Utility.m4508i(a.m3712f().longValue());
                    if (!(a.m3710d() == null || a.m3710d().intValue() == 0)) {
                        charSequence = charSequence + "(" + Utility.m4508i((long) a.m3710d().intValue()) + ")";
                    }
                    chatMsgListAdapter9.f3157h.setText(charSequence);
                } else {
                    chatMsgListAdapter9.f3155f.setImageResource(2130903118);
                    drawable = this.f3265i.getResources().getDrawable(2130903094);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter9.f3156g.setCompoundDrawables(drawable, null, null, null);
                    drawable = this.f3265i.getResources().getDrawable(2130903093);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    chatMsgListAdapter9.f3157h.setCompoundDrawables(drawable, null, null, null);
                    intValue = a.m3708b().intValue();
                    chatMsgListAdapter9.f3156g.setText(String.format(this.f3265i.getString(2131165274), new Object[]{Integer.valueOf(intValue)}));
                    charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
                    if (a.m3709c().intValue() == 1) {
                        charSequence = this.f3265i.getString(2131165698);
                    } else if (a.m3709c().intValue() == 2) {
                        charSequence = this.f3265i.getString(2131165695);
                    } else if (a.m3709c().intValue() == 3) {
                        charSequence = this.f3265i.getString(2131165691);
                    } else if (a.m3709c().intValue() == 4) {
                        charSequence = this.f3265i.getString(2131165684);
                    }
                    chatMsgListAdapter9.f3157h.setText(charSequence);
                }
                chatMsgListAdapter9.f3153d.setOnLongClickListener(new ChatMsgListAdapter(this, chatMsg));
                return view;
            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                ChatMsgListAdapter chatMsgListAdapter10;
                split = chatMsg.m3722b().split("-");
                a2 = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
                if (view == null) {
                    chatMsgListAdapter10 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968734, null);
                    chatMsgListAdapter10.f3159a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter10.f3160b = (Button) view.findViewById(2131558619);
                    chatMsgListAdapter10.f3162d = (ImageButton) view.findViewById(2131559090);
                    chatMsgListAdapter10.f3163e = (TextView) view.findViewById(2131559092);
                    chatMsgListAdapter10.f3164f = (ImageView) view.findViewById(2131559091);
                    chatMsgListAdapter10.f3165g = (TextView) view.findViewById(2131559094);
                    chatMsgListAdapter10.f3166h = (ImageView) view.findViewById(2131559093);
                    chatMsgListAdapter10.f3167i = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter10.f3168j = (TextView) view.findViewById(2131559096);
                    chatMsgListAdapter10.f3169k = (TextView) view.findViewById(2131559051);
                    chatMsgListAdapter10.f3161c = (TextView) view.findViewById(2131558840);
                    view.setTag(chatMsgListAdapter10);
                } else {
                    chatMsgListAdapter10 = (ChatMsgListAdapter) view.getTag();
                }
                e = chatMsg.m3725e();
                if (e.m3733a().intValue() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter10.f3159a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter10.f3159a.getHierarchy()).m1407a(2130903193);
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                chatMsgListAdapter10.f3159a.setImageURI(Uri.parse(e.m3734b()));
                chatMsgListAdapter10.f3167i.setText(a2.m3746h());
                if (a2.m3739a() == null || a2.m3739a().intValue() < 0 || a2.m3739a().intValue() > 51) {
                    chatMsgListAdapter10.f3164f.setImageResource(2130903085);
                    chatMsgListAdapter10.f3163e.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter10.f3164f.setImageResource(m2697b(a2.m3739a().intValue()));
                    chatMsgListAdapter10.f3163e.setText(ChatMsgListAdapter.m2691a(a2.m3739a().intValue()));
                }
                if (a2.m3740b() == null || a2.m3740b().intValue() < 0 || a2.m3740b().intValue() > 51) {
                    chatMsgListAdapter10.f3166h.setImageResource(2130903085);
                    chatMsgListAdapter10.f3165g.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter10.f3166h.setImageResource(m2697b(a2.m3740b().intValue()));
                    chatMsgListAdapter10.f3165g.setText(ChatMsgListAdapter.m2691a(a2.m3740b().intValue()));
                }
                charSequence = Utility.m4508i(a2.m3745g().longValue()) + "/" + Utility.m4508i(a2.m3743e().longValue());
                if (!(a2.m3747i() == null || a2.m3747i().intValue() == 0)) {
                    charSequence = charSequence + "(" + a2.m3747i() + ")";
                }
                chatMsgListAdapter10.f3169k.setText(charSequence);
                if (a2.m3744f().longValue() > 0) {
                    chatMsgListAdapter10.f3168j.setText("+" + Utility.m4502g(a2.m3744f().longValue()));
                } else {
                    chatMsgListAdapter10.f3168j.setText(Utility.m4502g(a2.m3744f().longValue()));
                }
                chatMsgListAdapter10.f3160b.setOnClickListener(new AnonymousClass14(this, e));
                chatMsgListAdapter10.f3161c.setText(chatMsg.m3725e().m3735c());
                chatMsgListAdapter10.f3162d.setOnClickListener(new AnonymousClass15(this, a2));
                chatMsgListAdapter10.f3162d.setOnLongClickListener(new AnonymousClass16(this, chatMsg));
                return view;
            case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
                if (view == null) {
                    ChatMsgListAdapter chatMsgListAdapter11 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968741, null);
                    chatMsgListAdapter11.f3202a = (ProgressBar) view.findViewById(2131559126);
                    view.setTag(chatMsgListAdapter11);
                    return view;
                }
                view.getTag();
                return view;
            case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                ChatMsgListAdapter chatMsgListAdapter12;
                split = chatMsg.m3722b().split("-");
                a2 = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
                if (view == null) {
                    chatMsgListAdapter12 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968744, null);
                    chatMsgListAdapter12.f3225a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter12.f3226b = (ImageButton) view.findViewById(2131559090);
                    chatMsgListAdapter12.f3227c = (TextView) view.findViewById(2131559092);
                    chatMsgListAdapter12.f3228d = (ImageView) view.findViewById(2131559091);
                    chatMsgListAdapter12.f3229e = (TextView) view.findViewById(2131559094);
                    chatMsgListAdapter12.f3230f = (ImageView) view.findViewById(2131559093);
                    chatMsgListAdapter12.f3231g = (TextView) view.findViewById(2131559099);
                    chatMsgListAdapter12.f3232h = (ImageView) view.findViewById(2131559098);
                    chatMsgListAdapter12.f3233i = (TextView) view.findViewById(2131559101);
                    chatMsgListAdapter12.f3234j = (ImageView) view.findViewById(2131559100);
                    chatMsgListAdapter12.f3235k = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter12.f3236l = (TextView) view.findViewById(2131559096);
                    chatMsgListAdapter12.f3237m = (TextView) view.findViewById(2131559051);
                    chatMsgListAdapter12.f3238n = (ImageButton) view.findViewById(2131558815);
                    chatMsgListAdapter12.f3239o = (ProgressBar) view.findViewById(2131559128);
                    view.setTag(chatMsgListAdapter12);
                } else {
                    chatMsgListAdapter12 = (ChatMsgListAdapter) view.getTag();
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                chatMsg.m3725e();
                if (SharedPreferencesManager.m4408p() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter12.f3225a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter12.f3225a.getHierarchy()).m1407a(2130903193);
                }
                chatMsgListAdapter12.f3225a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
                chatMsgListAdapter12.f3235k.setText(a2.m3746h());
                if (a2.m3739a() == null || a2.m3739a().intValue() < 0 || a2.m3739a().intValue() > 51) {
                    chatMsgListAdapter12.f3228d.setImageResource(2130903085);
                    chatMsgListAdapter12.f3227c.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter12.f3228d.setImageResource(m2697b(a2.m3739a().intValue()));
                    chatMsgListAdapter12.f3227c.setText(ChatMsgListAdapter.m2691a(a2.m3739a().intValue()));
                }
                if (a2.m3740b() == null || a2.m3740b().intValue() < 0 || a2.m3740b().intValue() > 51) {
                    chatMsgListAdapter12.f3230f.setImageResource(2130903085);
                    chatMsgListAdapter12.f3229e.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter12.f3230f.setImageResource(m2697b(a2.m3740b().intValue()));
                    chatMsgListAdapter12.f3229e.setText(ChatMsgListAdapter.m2691a(a2.m3740b().intValue()));
                }
                if (a2.m3741c() == null || a2.m3741c().intValue() < 0 || a2.m3741c().intValue() > 51) {
                    chatMsgListAdapter12.f3232h.setImageResource(2130903085);
                    chatMsgListAdapter12.f3231g.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter12.f3232h.setImageResource(m2697b(a2.m3741c().intValue()));
                    chatMsgListAdapter12.f3231g.setText(ChatMsgListAdapter.m2691a(a2.m3741c().intValue()));
                }
                if (a2.m3742d() == null || a2.m3742d().intValue() < 0 || a2.m3742d().intValue() > 51) {
                    chatMsgListAdapter12.f3234j.setImageResource(2130903085);
                    chatMsgListAdapter12.f3233i.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter12.f3234j.setImageResource(m2697b(a2.m3742d().intValue()));
                    chatMsgListAdapter12.f3233i.setText(ChatMsgListAdapter.m2691a(a2.m3742d().intValue()));
                }
                charSequence = Utility.m4508i(a2.m3745g().longValue()) + "/" + Utility.m4508i(a2.m3743e().longValue());
                if (!(a2.m3747i() == null || a2.m3747i().intValue() == 0)) {
                    charSequence = charSequence + "(" + a2.m3747i() + ")";
                }
                chatMsgListAdapter12.f3237m.setText(charSequence);
                if (a2.m3744f().longValue() > 0) {
                    chatMsgListAdapter12.f3236l.setText("+" + Utility.m4502g(a2.m3744f().longValue()));
                } else {
                    chatMsgListAdapter12.f3236l.setText(Utility.m4502g(a2.m3744f().longValue()));
                }
                chatMsgListAdapter12.f3226b.setOnClickListener(new ChatMsgListAdapter(this, a2));
                chatMsgListAdapter12.f3226b.setOnLongClickListener(new AnonymousClass10(this, chatMsg));
                if (chatMsg.m3724d().intValue() == DBManager.f5542E) {
                    if ((System.currentTimeMillis() + RuntimeData.f6671b) - chatMsg.m3721a().longValue() > 40000) {
                        chatMsgListAdapter12.f3238n.setVisibility(0);
                        chatMsgListAdapter12.f3239o.setVisibility(4);
                    } else {
                        if (((Timer) this.f3258a.get(chatMsg.m3721a())) == null) {
                            timer = new Timer();
                            timer.schedule(new AnonymousClass11(this, chatMsg), 40000);
                            this.f3258a.put(chatMsg.m3721a(), timer);
                        }
                        chatMsgListAdapter12.f3238n.setVisibility(4);
                        chatMsgListAdapter12.f3239o.setVisibility(0);
                    }
                } else if (chatMsg.m3724d().intValue() == DBManager.f5543F) {
                    chatMsgListAdapter12.f3238n.setVisibility(0);
                    chatMsgListAdapter12.f3239o.setVisibility(4);
                } else {
                    chatMsgListAdapter12.f3238n.setVisibility(4);
                    chatMsgListAdapter12.f3239o.setVisibility(4);
                }
                chatMsgListAdapter12.f3238n.setOnClickListener(new AnonymousClass13(this, chatMsg));
                return view;
            case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                ChatMsgListAdapter chatMsgListAdapter13;
                split = chatMsg.m3722b().split("-");
                a2 = DBManager.m3631a().f5578r.m3692a(Long.parseLong(split[0]), Long.parseLong(split[1]), Long.parseLong(split[2]), true);
                if (view == null) {
                    chatMsgListAdapter13 = new ChatMsgListAdapter(this);
                    view = LayoutInflater.from(this.f3265i).inflate(2130968735, null);
                    chatMsgListAdapter13.f3171a = (SimpleDraweeView) view.findViewById(2131558674);
                    chatMsgListAdapter13.f3172b = (Button) view.findViewById(2131558619);
                    chatMsgListAdapter13.f3174d = (ImageButton) view.findViewById(2131559090);
                    chatMsgListAdapter13.f3175e = (TextView) view.findViewById(2131559092);
                    chatMsgListAdapter13.f3176f = (ImageView) view.findViewById(2131559091);
                    chatMsgListAdapter13.f3177g = (TextView) view.findViewById(2131559094);
                    chatMsgListAdapter13.f3178h = (ImageView) view.findViewById(2131559093);
                    chatMsgListAdapter13.f3179i = (TextView) view.findViewById(2131559099);
                    chatMsgListAdapter13.f3180j = (ImageView) view.findViewById(2131559098);
                    chatMsgListAdapter13.f3181k = (TextView) view.findViewById(2131559101);
                    chatMsgListAdapter13.f3182l = (ImageView) view.findViewById(2131559100);
                    chatMsgListAdapter13.f3183m = (TextView) view.findViewById(2131558709);
                    chatMsgListAdapter13.f3184n = (TextView) view.findViewById(2131559096);
                    chatMsgListAdapter13.f3185o = (TextView) view.findViewById(2131559051);
                    chatMsgListAdapter13.f3173c = (TextView) view.findViewById(2131558840);
                    view.setTag(chatMsgListAdapter13);
                } else {
                    chatMsgListAdapter13 = (ChatMsgListAdapter) view.getTag();
                }
                e = chatMsg.m3725e();
                if (e.m3733a().intValue() == 1) {
                    ((GenericDraweeHierarchy) chatMsgListAdapter13.f3171a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) chatMsgListAdapter13.f3171a.getHierarchy()).m1407a(2130903193);
                }
                if (DBManager.m3631a().m3632b()) {
                    return view;
                }
                chatMsgListAdapter13.f3171a.setImageURI(Uri.parse(e.m3734b()));
                chatMsgListAdapter13.f3183m.setText(a2.m3746h());
                if (a2.m3739a() == null || a2.m3739a().intValue() < 0 || a2.m3739a().intValue() > 51) {
                    chatMsgListAdapter13.f3176f.setImageResource(2130903085);
                    chatMsgListAdapter13.f3175e.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter13.f3176f.setImageResource(m2697b(a2.m3739a().intValue()));
                    chatMsgListAdapter13.f3175e.setText(ChatMsgListAdapter.m2691a(a2.m3739a().intValue()));
                }
                if (a2.m3740b() == null || a2.m3740b().intValue() < 0 || a2.m3740b().intValue() > 51) {
                    chatMsgListAdapter13.f3178h.setImageResource(2130903085);
                    chatMsgListAdapter13.f3177g.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter13.f3178h.setImageResource(m2697b(a2.m3740b().intValue()));
                    chatMsgListAdapter13.f3177g.setText(ChatMsgListAdapter.m2691a(a2.m3740b().intValue()));
                }
                if (a2.m3741c() == null || a2.m3741c().intValue() < 0 || a2.m3741c().intValue() > 51) {
                    chatMsgListAdapter13.f3180j.setImageResource(2130903085);
                    chatMsgListAdapter13.f3179i.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter13.f3180j.setImageResource(m2697b(a2.m3741c().intValue()));
                    chatMsgListAdapter13.f3179i.setText(ChatMsgListAdapter.m2691a(a2.m3741c().intValue()));
                }
                if (a2.m3742d() == null || a2.m3742d().intValue() < 0 || a2.m3742d().intValue() > 51) {
                    chatMsgListAdapter13.f3182l.setImageResource(2130903085);
                    chatMsgListAdapter13.f3181k.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    chatMsgListAdapter13.f3182l.setImageResource(m2697b(a2.m3742d().intValue()));
                    chatMsgListAdapter13.f3181k.setText(ChatMsgListAdapter.m2691a(a2.m3742d().intValue()));
                }
                charSequence = Utility.m4508i(a2.m3745g().longValue()) + "/" + Utility.m4508i(a2.m3743e().longValue());
                if (!(a2.m3747i() == null || a2.m3747i().intValue() == 0)) {
                    charSequence = charSequence + "(" + a2.m3747i() + ")";
                }
                chatMsgListAdapter13.f3185o.setText(charSequence);
                if (a2.m3744f().longValue() > 0) {
                    chatMsgListAdapter13.f3184n.setText("+" + Utility.m4502g(a2.m3744f().longValue()));
                } else {
                    chatMsgListAdapter13.f3184n.setText(Utility.m4502g(a2.m3744f().longValue()));
                }
                chatMsgListAdapter13.f3172b.setOnClickListener(new AnonymousClass17(this, e));
                chatMsgListAdapter13.f3173c.setText(chatMsg.m3725e().m3735c());
                chatMsgListAdapter13.f3174d.setOnClickListener(new AnonymousClass18(this, a2));
                chatMsgListAdapter13.f3174d.setOnLongClickListener(new AnonymousClass19(this, chatMsg));
                return view;
            default:
                return view;
        }
    }

    private View m2689a(View view, ChatMsg chatMsg) {
        ChatMsgListAdapter chatMsgListAdapter;
        if (view == null) {
            ChatMsgListAdapter chatMsgListAdapter2 = new ChatMsgListAdapter(this);
            view = LayoutInflater.from(this.f3265i).inflate(2130968736, null);
            chatMsgListAdapter2.f3187a = (SimpleDraweeView) view.findViewById(2131558674);
            chatMsgListAdapter2.f3188b = (Button) view.findViewById(2131558619);
            chatMsgListAdapter2.f3190d = (TextView) view.findViewById(2131559104);
            chatMsgListAdapter2.f3189c = (TextView) view.findViewById(2131558840);
            chatMsgListAdapter2.f3190d.setMovementMethod(LinkMovementMethod.getInstance());
            view.setTag(chatMsgListAdapter2);
            chatMsgListAdapter = chatMsgListAdapter2;
        } else {
            chatMsgListAdapter = (ChatMsgListAdapter) view.getTag();
        }
        FriendUser e = chatMsg.m3725e();
        if (e.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3187a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3187a.getHierarchy()).m1407a(2130903193);
        }
        chatMsgListAdapter.f3187a.setImageURI(Uri.parse(e.f5836o));
        chatMsgListAdapter.f3188b.setOnClickListener(new AnonymousClass34(this, e));
        chatMsgListAdapter.f3189c.setText(chatMsg.m3725e().f5838q);
        CharSequence a = m2690a(chatMsg.f5690c);
        chatMsgListAdapter.f3190d.setAutoLinkMask(5);
        chatMsgListAdapter.f3190d.setText(a);
        Spannable spannable = (Spannable) chatMsgListAdapter.f3190d.getText();
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, a.length(), URLSpan.class);
        CharSequence spannableStringBuilder = new SpannableStringBuilder(a);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new ChatMsgListAdapter(this, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        chatMsgListAdapter.f3190d.setAutoLinkMask(0);
        chatMsgListAdapter.f3190d.setText(spannableStringBuilder);
        chatMsgListAdapter.f3190d.setOnLongClickListener(new AnonymousClass35(this, chatMsg));
        return view;
    }

    private View m2699b(View view, ChatMsg chatMsg) {
        ChatMsgListAdapter chatMsgListAdapter;
        int i;
        if (view == null) {
            chatMsgListAdapter = new ChatMsgListAdapter(this);
            view = LayoutInflater.from(this.f3265i).inflate(2130968746, null);
            chatMsgListAdapter.f3246a = (SimpleDraweeView) view.findViewById(2131558674);
            chatMsgListAdapter.f3247b = (ImageButton) view.findViewById(2131559105);
            chatMsgListAdapter.f3248c = (ImageView) view.findViewById(2131559106);
            chatMsgListAdapter.f3250e = (TextView) view.findViewById(2131559108);
            chatMsgListAdapter.f3249d = (ImageButton) view.findViewById(2131558815);
            chatMsgListAdapter.f3251f = (ProgressBar) view.findViewById(2131559128);
            view.setTag(chatMsgListAdapter);
        } else {
            chatMsgListAdapter = (ChatMsgListAdapter) view.getTag();
        }
        chatMsg.m3725e();
        if (SharedPreferencesManager.m4408p() == 1) {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3246a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3246a.getHierarchy()).m1407a(2130903193);
        }
        chatMsgListAdapter.f3246a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
        int longValue = (int) ((((double) chatMsg.f5702o.longValue()) / 60.0d) * ((double) this.f3266j));
        if (longValue > this.f3266j) {
            i = this.f3266j;
        } else if (longValue < this.f3267k) {
            i = this.f3267k;
        } else {
            i = longValue;
        }
        LayoutParams layoutParams = (LayoutParams) chatMsgListAdapter.f3247b.getLayoutParams();
        layoutParams.width = i;
        chatMsgListAdapter.f3247b.setLayoutParams(layoutParams);
        if (this.f3268l == chatMsg.f5689b.longValue()) {
            chatMsgListAdapter.f3248c.setImageResource(2130837736);
            ((AnimationDrawable) chatMsgListAdapter.f3248c.getDrawable()).start();
        } else {
            if (chatMsgListAdapter.f3248c.getAnimation() != null) {
                chatMsgListAdapter.f3248c.clearAnimation();
            }
            chatMsgListAdapter.f3248c.setImageResource(2130903570);
        }
        chatMsgListAdapter.f3247b.setOnClickListener(new AnonymousClass20(this, chatMsg));
        chatMsgListAdapter.f3247b.setOnLongClickListener(new AnonymousClass21(this, chatMsg));
        chatMsgListAdapter.f3250e.setText(chatMsg.f5702o + "\u2033");
        if (chatMsg.f5707t.intValue() == DBManager.f5542E) {
            if ((System.currentTimeMillis() + RuntimeData.f6671b) - chatMsg.f5689b.longValue() > 40000) {
                chatMsgListAdapter.f3249d.setVisibility(0);
                chatMsgListAdapter.f3251f.setVisibility(8);
            } else {
                if (((Timer) this.f3258a.get(chatMsg.f5689b)) == null) {
                    Timer timer = new Timer();
                    timer.schedule(new AnonymousClass22(this, chatMsg), 40000);
                    this.f3258a.put(chatMsg.f5689b, timer);
                }
                chatMsgListAdapter.f3249d.setVisibility(8);
                chatMsgListAdapter.f3251f.setVisibility(0);
            }
        } else if (chatMsg.f5707t.intValue() == DBManager.f5543F) {
            chatMsgListAdapter.f3249d.setVisibility(0);
            chatMsgListAdapter.f3251f.setVisibility(8);
        } else {
            chatMsgListAdapter.f3249d.setVisibility(8);
            chatMsgListAdapter.f3251f.setVisibility(8);
        }
        chatMsgListAdapter.f3249d.setOnClickListener(new AnonymousClass24(this, chatMsg));
        return view;
    }

    private View m2703c(View view, ChatMsg chatMsg) {
        ChatMsgListAdapter chatMsgListAdapter;
        int i;
        if (view == null) {
            chatMsgListAdapter = new ChatMsgListAdapter(this);
            view = LayoutInflater.from(this.f3265i).inflate(2130968737, null);
            chatMsgListAdapter.f3192a = (SimpleDraweeView) view.findViewById(2131558674);
            chatMsgListAdapter.f3193b = (Button) view.findViewById(2131558619);
            chatMsgListAdapter.f3195d = (ImageButton) view.findViewById(2131559105);
            chatMsgListAdapter.f3196e = (ImageView) view.findViewById(2131559106);
            chatMsgListAdapter.f3197f = (ImageView) view.findViewById(2131559107);
            chatMsgListAdapter.f3198g = (TextView) view.findViewById(2131559108);
            chatMsgListAdapter.f3194c = (TextView) view.findViewById(2131558840);
            view.setTag(chatMsgListAdapter);
        } else {
            chatMsgListAdapter = (ChatMsgListAdapter) view.getTag();
        }
        FriendUser e = chatMsg.m3725e();
        if (SharedPreferencesManager.m4408p() == 1) {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3192a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) chatMsgListAdapter.f3192a.getHierarchy()).m1407a(2130903193);
        }
        chatMsgListAdapter.f3192a.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
        chatMsgListAdapter.f3193b.setOnClickListener(new AnonymousClass25(this, e));
        chatMsgListAdapter.f3194c.setText(chatMsg.m3725e().f5838q);
        int longValue = (int) ((((double) chatMsg.f5702o.longValue()) / 60.0d) * ((double) this.f3266j));
        if (longValue > this.f3266j) {
            i = this.f3266j;
        } else if (longValue < this.f3267k) {
            i = this.f3267k;
        } else {
            i = longValue;
        }
        LayoutParams layoutParams = (LayoutParams) chatMsgListAdapter.f3195d.getLayoutParams();
        layoutParams.width = i;
        chatMsgListAdapter.f3195d.setLayoutParams(layoutParams);
        if (this.f3268l == chatMsg.f5689b.longValue()) {
            chatMsgListAdapter.f3196e.setImageResource(2130837735);
            ((AnimationDrawable) chatMsgListAdapter.f3196e.getDrawable()).start();
        } else {
            if (chatMsgListAdapter.f3196e.getAnimation() != null) {
                chatMsgListAdapter.f3196e.clearAnimation();
            }
            chatMsgListAdapter.f3196e.setImageResource(2130903565);
        }
        chatMsgListAdapter.f3195d.setOnClickListener(new AnonymousClass26(this, chatMsg));
        chatMsgListAdapter.f3195d.setOnLongClickListener(new AnonymousClass27(this, chatMsg));
        chatMsgListAdapter.f3198g.setText(chatMsg.f5702o + "\u2033");
        if (chatMsg.f5706s.intValue() == DBManager.f5547J) {
            chatMsgListAdapter.f3197f.setVisibility(0);
        } else {
            chatMsgListAdapter.f3197f.setVisibility(4);
        }
        return view;
    }

    private View m2705d(View view, ChatMsg chatMsg) {
        ChatMsgListAdapter chatMsgListAdapter;
        if (view == null) {
            ChatMsgListAdapter chatMsgListAdapter2 = new ChatMsgListAdapter(this);
            view = LayoutInflater.from(this.f3265i).inflate(2130968738, null);
            chatMsgListAdapter2.f3200a = (TextView) view.findViewById(2131559109);
            view.setTag(chatMsgListAdapter2);
            chatMsgListAdapter = chatMsgListAdapter2;
        } else {
            chatMsgListAdapter = (ChatMsgListAdapter) view.getTag();
        }
        String str = chatMsg.f5708u;
        String str2 = chatMsg.f5710w;
        String str3 = chatMsg.f5709v;
        int i = (str.equalsIgnoreCase("normal") || str.equalsIgnoreCase("NormalInsurance")) ? 2130903270 : str.equalsIgnoreCase("Six") ? 2130903282 : (str.equalsIgnoreCase("Omaha") || str.equalsIgnoreCase("OmahaInsurance")) ? 2130903272 : str.equalsIgnoreCase("sng") ? 2130903285 : 0;
        Drawable drawable = this.f3265i.getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        chatMsgListAdapter.f3200a.setCompoundDrawables(drawable, null, null, null);
        str = String.format(this.f3265i.getResources().getString(2131165271), new Object[]{str3, str2});
        CharSequence spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, str.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(-5695700), 0, str3.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(-5695700), str.indexOf(str2), str.length(), 33);
        chatMsgListAdapter.f3200a.setText(spannableString);
        return view;
    }

    private CharSequence m2690a(CharSequence charSequence) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Matcher matcher = this.f3264h.matcher(charSequence);
        while (matcher.find()) {
            Expression expression = (Expression) RuntimeData.f6691v.get(matcher.group());
            if (expression != null) {
                spannableStringBuilder.setSpan(new ImageSpan(this.f3265i, BitmapFactory.decodeResource(this.f3265i.getResources(), expression.f6047d), 0), matcher.start(), matcher.end(), 33);
            }
        }
        return spannableStringBuilder;
    }

    private static String m2691a(int i) {
        int i2 = i % 13;
        if (i2 > 0 && i2 < 10) {
            return (i2 + 1);
        }
        if (i2 == 10) {
            return "J";
        }
        if (i2 == 11) {
            return "Q";
        }
        if (i2 == 12) {
            return "K";
        }
        return "A";
    }

    private int m2697b(int i) {
        if (i < 13) {
            return Utility.m4468a(this.f3265i, "chat_room_history_heitao");
        }
        if (i >= 13 && i < 26) {
            return Utility.m4468a(this.f3265i, "chat_room_history_hongtao");
        }
        if (i >= 26 && i < 39) {
            return Utility.m4468a(this.f3265i, "chat_room_history_meihua");
        }
        if (i < 39 || i >= 52) {
            return 0;
        }
        return Utility.m4468a(this.f3265i, "chat_room_history_fangkuai");
    }

    private void m2706d() {
        File file = new File(VoiceFileUtility.m4205b(this.f3259b, this.f3268l, this.f3260c));
        ChatMsgDBManager chatMsgDBManager = DBManager.m3631a().f5566f;
        int i = DBManager.f5548K;
        long j = this.f3268l;
        long j2 = this.f3259b;
        int i2 = this.f3260c;
        ChatMsgDao chatMsgDao = chatMsgDBManager.f5523a.f6469z;
        g a = g.a(chatMsgDao);
        a.a(Properties.f6130l.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6120b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6136r.a(Integer.valueOf(i2)), new i[0]);
        ChatMsg chatMsg = (ChatMsg) a.a().c();
        chatMsg.f5706s = Integer.valueOf(i);
        chatMsgDao.d(chatMsg);
        notifyDataSetChanged();
        if (this.f3269m == null) {
            this.f3269m = new MediaPlayer();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.f3269m.setDataSource(fileInputStream.getFD());
            this.f3269m.setAudioStreamType(3);
            this.f3269m.setOnCompletionListener(new AnonymousClass33(this, fileInputStream));
            this.f3269m.prepare();
            this.f3269m.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void m2708a() {
        if (this.f3269m != null) {
            if (this.f3269m.isPlaying()) {
                this.f3269m.stop();
            }
            this.f3269m.release();
            this.f3269m = null;
            this.f3268l = -1;
        }
    }

    public final boolean m2709b() {
        if (this.f3269m != null) {
            return this.f3269m.isPlaying();
        }
        return false;
    }

    public final void m2710c() {
        if (this.f3269m != null) {
            if (this.f3269m.isPlaying()) {
                this.f3269m.stop();
            }
            this.f3269m.release();
            this.f3269m = null;
        }
        m2706d();
    }

    static /* synthetic */ void m2694a(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
        ((Timer) chatMsgListAdapter.f3258a.get(chatMsg.f5689b)).cancel();
        chatMsgListAdapter.f3258a.remove(chatMsg.f5689b);
        DBManager.m3631a().f5566f.m3572a(DBManager.f5543F, chatMsg.f5689b.longValue(), chatMsg.f5699l.longValue(), chatMsg.f5705r.intValue());
        chatMsg.f5707t = Integer.valueOf(DBManager.f5543F);
        chatMsgListAdapter.f3270n.sendMessage(new Message());
    }

    static /* synthetic */ void m2695a(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg, boolean z) {
        if (z) {
            new Builder(chatMsgListAdapter.f3265i).setItems(2131492868, new AnonymousClass29(chatMsgListAdapter, chatMsg)).show();
        } else {
            new Builder(chatMsgListAdapter.f3265i).setItems(2131492867, new AnonymousClass30(chatMsgListAdapter, chatMsg)).show();
        }
    }

    static /* synthetic */ void m2692a(ChatMsgListAdapter chatMsgListAdapter, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(chatMsgListAdapter.f3265i, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            chatMsgListAdapter.f3265i.startActivity(intent);
        }
    }

    static /* synthetic */ void m2696a(ChatMsgListAdapter chatMsgListAdapter, PokerHistory pokerHistory) {
        Intent intent = new Intent(chatMsgListAdapter.f3265i, PlayPokerHistoryActivity.class);
        intent.putExtra("from", PlayPokerHistoryActivity.f4814e);
        intent.putExtra("pokerHistoryShareUrl", pokerHistory.f5977w);
        intent.putExtra("pokerHistoryUrl", pokerHistory.f5978x);
        intent.putExtra("lSaveUuid", pokerHistory.f5970p);
        intent.putExtra("lRoomId", pokerHistory.f5968n);
        intent.putExtra("lHandId", pokerHistory.f5967m);
        intent.putExtra("isOmaha", pokerHistory.f5962h);
        if (pokerHistory.f5958d == null) {
            intent.putExtra("iPoker1", -1);
        } else {
            intent.putExtra("iPoker1", pokerHistory.f5958d);
        }
        if (pokerHistory.f5959e == null) {
            intent.putExtra("iPoker2", -1);
        } else {
            intent.putExtra("iPoker2", pokerHistory.f5959e);
        }
        if (pokerHistory.f5960f == null) {
            intent.putExtra("iPoker3", -1);
        } else {
            intent.putExtra("iPoker3", pokerHistory.f5960f);
        }
        if (pokerHistory.f5961g == null) {
            intent.putExtra("iPoker4", -1);
        } else {
            intent.putExtra("iPoker4", pokerHistory.f5961g);
        }
        chatMsgListAdapter.f3265i.startActivity(intent);
    }

    static /* synthetic */ void m2704c(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
        int b = chatMsgListAdapter.f3262e.m4242b(chatMsg.f5689b);
        if (b - 1 >= 0) {
            ChatMsg chatMsg2 = (ChatMsg) chatMsgListAdapter.f3262e.m4239a(b - 1);
            if (b + 1 <= chatMsgListAdapter.f3262e.m4238a() - 1 || b == chatMsgListAdapter.f3262e.m4238a() - 1) {
                if (b != chatMsgListAdapter.f3262e.m4238a() - 1) {
                    ChatMsg chatMsg3 = (ChatMsg) chatMsgListAdapter.f3262e.m4239a(b + 1);
                    if (chatMsg2.f5704q.intValue() == DBManager.f5554x && chatMsg3.f5704q.intValue() == DBManager.f5554x) {
                        chatMsgListAdapter.f3262e.m4245c(chatMsg2.f5689b);
                        if (!DBManager.m3631a().m3632b()) {
                            DBManager.m3631a().f5566f.m3581d(chatMsg2.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
                        }
                    }
                } else if (chatMsg2.f5704q.intValue() == DBManager.f5554x) {
                    chatMsgListAdapter.f3262e.m4245c(chatMsg2.f5689b);
                    if (!DBManager.m3631a().m3632b()) {
                        DBManager.m3631a().f5566f.m3581d(chatMsg2.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
                    }
                }
            }
        }
        chatMsgListAdapter.f3262e.m4245c(chatMsg.f5689b);
        if (!DBManager.m3631a().m3632b()) {
            DBManager.m3631a().f5566f.m3581d(chatMsg.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
        }
        chatMsgListAdapter.notifyDataSetChanged();
    }

    static /* synthetic */ void m2707d(ChatMsgListAdapter chatMsgListAdapter, ChatMsg chatMsg) {
        long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
        String str = chatMsg.f5690c;
        byte[] bArr = null;
        if (chatMsg.f5704q.intValue() == 2) {
            byte[] c = VoiceFileUtility.m4208c(chatMsgListAdapter.f3259b, chatMsg.f5689b.longValue(), chatMsgListAdapter.f3260c);
            VoiceFileUtility.m4201a(chatMsgListAdapter.f3259b, currentTimeMillis, c, chatMsgListAdapter.f3260c);
            bArr = c;
        }
        if (chatMsgListAdapter.f3260c == 2) {
            if (chatMsgListAdapter.f3261d) {
                chatMsgListAdapter.f3260c = 3;
            } else {
                chatMsgListAdapter.f3260c = 2;
            }
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4079a(chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c, CHAT_MESSAGE_TYPE.valueOf(chatMsg.f5704q.intValue()), str, currentTimeMillis, bArr, chatMsg.f5702o.longValue());
        int b = chatMsgListAdapter.f3262e.m4242b(chatMsg.f5689b);
        if (b - 1 >= 0) {
            ChatMsg chatMsg2 = (ChatMsg) chatMsgListAdapter.f3262e.m4239a(b - 1);
            if (b + 1 <= chatMsgListAdapter.f3262e.m4238a() - 1 || b == chatMsgListAdapter.f3262e.m4238a() - 1) {
                if (b != chatMsgListAdapter.f3262e.m4238a() - 1) {
                    ChatMsg chatMsg3 = (ChatMsg) chatMsgListAdapter.f3262e.m4239a(b + 1);
                    if (chatMsg2.f5704q.intValue() == DBManager.f5554x && chatMsg3.f5704q.intValue() == DBManager.f5554x) {
                        chatMsgListAdapter.f3262e.m4245c(chatMsg2.f5689b);
                        DBManager.m3631a().f5566f.m3581d(chatMsg2.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
                    }
                } else if (chatMsg2.f5704q.intValue() == DBManager.f5554x) {
                    chatMsgListAdapter.f3262e.m4245c(chatMsg2.f5689b);
                    DBManager.m3631a().f5566f.m3581d(chatMsg2.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
                }
            }
        }
        chatMsgListAdapter.f3262e.m4245c(chatMsg.f5689b);
        DBManager.m3631a().f5566f.m3581d(chatMsg.f5689b.longValue(), chatMsgListAdapter.f3259b, chatMsgListAdapter.f3260c);
        DBManager.m3631a().f5566f.m3570a(chatMsg, currentTimeMillis, str);
        ((ChatRoomActivity) chatMsgListAdapter.f3265i).m2877a(true);
    }
}
