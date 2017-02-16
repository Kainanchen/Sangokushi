package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p055a.ChatMsgListAdapter;
import com.illuminate.texaspoker.p055a.ExpressionAdapter;
import com.illuminate.texaspoker.p055a.ak;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.illuminate.texaspoker.view.HorizontalListView;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.BuyinControlMsg;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.cocos2dx.lua.AppActivity;

public class QuickChatRoomActivity extends BaseToolBarActivity implements SensorEventListener {
    private static int ak;
    private static int al;
    private static String an;
    private static String f4954f;
    private static String f4955r;
    private Button f4956A;
    private Button f4957B;
    private EditText f4958C;
    private ImageButton f4959D;
    private View f4960E;
    private GridView f4961F;
    private ExpressionAdapter f4962G;
    private View f4963H;
    private View f4964I;
    private ImageView f4965J;
    private View f4966K;
    private PowerManager f4967L;
    private WakeLock f4968M;
    private AudioManager f4969N;
    private SensorManager f4970O;
    private Sensor f4971P;
    private float f4972Q;
    private View f4973R;
    private ImageView f4974S;
    private ImageButton f4975T;
    private TextView f4976U;
    private TextView f4977V;
    private TextView f4978W;
    private TextView f4979X;
    private TextView f4980Y;
    private TextView f4981Z;
    private ImageButton aa;
    private TextView ab;
    private HorizontalListView ac;
    private TextView ad;
    private ak ae;
    private List<ChatUser> af;
    private ImageButton ag;
    private Menu ah;
    private boolean ai;
    private Handler aj;
    private MediaRecorder am;
    private File ao;
    private int ap;
    private long aq;
    private Timer ar;
    private Timer as;
    private double at;
    private Handler au;
    long f4982d;
    long f4983e;
    private Toolbar f4984g;
    private int f4985h;
    private boolean f4986i;
    private boolean f4987j;
    private boolean f4988k;
    private long f4989l;
    private int f4990m;
    private int f4991n;
    private int f4992o;
    private int f4993p;
    private boolean f4994q;
    private Pattern f4995s;
    private MapList<Long, ChatMsg> f4996t;
    private ChatRoom f4997u;
    private ChatMsgListAdapter f4998v;
    private ListView f4999w;
    private View f5000x;
    private ImageButton f5001y;
    private ImageButton f5002z;

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.1 */
    class C07601 implements OnClickListener {
        final /* synthetic */ QuickChatRoomActivity f4894a;

        C07601(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4894a = quickChatRoomActivity;
        }

        public final void onClick(View view) {
            this.f4894a.m3348b();
            this.f4894a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.2 */
    class C07612 implements DialogInterface.OnClickListener {
        final /* synthetic */ QuickChatRoomActivity f4905a;

        C07612(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4905a = quickChatRoomActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4905a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.39 */
    class AnonymousClass39 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4915a;
        final /* synthetic */ QuickChatRoomActivity f4916b;

        AnonymousClass39(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4916b = quickChatRoomActivity;
            this.f4915a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4916b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4916b.f4997u.f5744e.longValue());
            if (!(this.f4916b.f4997u.f5725L == null || this.f4916b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4916b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4916b.f4997u.f5762w, this.f4916b.f4997u.f5755p, this.f4916b.f4997u.f5746g.longValue(), str, String.format(this.f4916b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4916b.f4997u.f5753n.longValue() / 60)}), this.f4916b.f4997u.m3726a().f5836o, this.f4916b.f4991n, this.f4916b.f4997u.m3726a().f5832k.intValue(), 0);
            this.f4915a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.3 */
    class C07623 implements AnimationListener {
        final /* synthetic */ QuickChatRoomActivity f4917a;

        C07623(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4917a = quickChatRoomActivity;
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            LayoutParams layoutParams = (LayoutParams) this.f4917a.ag.getLayoutParams();
            layoutParams.rightMargin = 0;
            this.f4917a.ag.setLayoutParams(layoutParams);
            this.f4917a.ag.setAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f));
        }

        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.40 */
    class AnonymousClass40 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4918a;
        final /* synthetic */ QuickChatRoomActivity f4919b;

        AnonymousClass40(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4919b = quickChatRoomActivity;
            this.f4918a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4919b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4919b.f4997u.f5744e.longValue());
            if (!(this.f4919b.f4997u.f5725L == null || this.f4919b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4919b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4919b.f4997u.f5762w, this.f4919b.f4997u.f5755p, this.f4919b.f4997u.f5746g.longValue(), str, String.format(this.f4919b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4919b.f4997u.f5753n.longValue() / 60)}), this.f4919b.f4997u.m3726a().f5836o, this.f4919b.f4991n, this.f4919b.f4997u.m3726a().f5832k.intValue(), 1);
            this.f4918a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.41 */
    class AnonymousClass41 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4920a;
        final /* synthetic */ QuickChatRoomActivity f4921b;

        AnonymousClass41(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4921b = quickChatRoomActivity;
            this.f4920a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4921b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4921b.f4997u.f5744e.longValue());
            if (!(this.f4921b.f4997u.f5725L == null || this.f4921b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4921b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4921b.f4997u.f5762w, this.f4921b.f4997u.f5755p, this.f4921b.f4997u.f5746g.longValue(), str, String.format(this.f4921b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4921b.f4997u.f5753n.longValue() / 60)}), this.f4921b.f4997u.m3726a().f5836o, this.f4921b.f4991n, this.f4921b.f4997u.m3726a().f5832k.intValue(), -2);
            this.f4920a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.42 */
    class AnonymousClass42 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4922a;
        final /* synthetic */ QuickChatRoomActivity f4923b;

        AnonymousClass42(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4923b = quickChatRoomActivity;
            this.f4922a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4923b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4923b.f4997u.f5744e.longValue());
            if (!(this.f4923b.f4997u.f5725L == null || this.f4923b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4923b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4923b.f4997u.f5762w, this.f4923b.f4997u.f5755p, this.f4923b.f4997u.f5746g.longValue(), str, String.format(this.f4923b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4923b.f4997u.f5753n.longValue() / 60)}), this.f4923b.f4997u.m3726a().f5836o, this.f4923b.f4991n, this.f4923b.f4997u.m3726a().f5832k.intValue(), -1);
            this.f4922a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.43 */
    class AnonymousClass43 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4924a;
        final /* synthetic */ QuickChatRoomActivity f4925b;

        AnonymousClass43(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4925b = quickChatRoomActivity;
            this.f4924a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4925b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4925b.f4997u.f5744e.longValue());
            if (!(this.f4925b.f4997u.f5725L == null || this.f4925b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4925b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4925b.f4997u.f5762w, this.f4925b.f4997u.f5755p, this.f4925b.f4997u.f5746g.longValue(), str, String.format(this.f4925b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4925b.f4997u.f5753n.longValue() / 60)}), this.f4925b.f4997u.m3726a().f5836o, this.f4925b.f4991n, this.f4925b.f4997u.m3726a().f5832k.intValue(), -3);
            this.f4924a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.44 */
    class AnonymousClass44 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4926a;
        final /* synthetic */ QuickChatRoomActivity f4927b;

        AnonymousClass44(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4927b = quickChatRoomActivity;
            this.f4926a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String str = Utility.m4508i(this.f4927b.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4927b.f4997u.f5744e.longValue());
            if (!(this.f4927b.f4997u.f5725L == null || this.f4927b.f4997u.f5725L.intValue() == 0)) {
                str = str + "(" + Utility.m4508i((long) this.f4927b.f4997u.f5725L.intValue()) + ")";
            }
            ShareUtil.m4248a().m4259a(this.f4927b.f4997u.f5762w, this.f4927b.f4997u.f5755p, this.f4927b.f4997u.f5746g.longValue(), str, String.format(this.f4927b.getResources().getString(2131165275), new Object[]{Long.valueOf(this.f4927b.f4997u.f5753n.longValue() / 60)}), this.f4927b.f4997u.m3726a().f5836o, this.f4927b.f4991n, this.f4927b.f4997u.m3726a().f5832k.intValue(), -4);
            this.f4926a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.45 */
    class AnonymousClass45 implements OnClickListener {
        final /* synthetic */ GameRoom f4928a;
        final /* synthetic */ QuickChatRoomActivity f4929b;

        AnonymousClass45(QuickChatRoomActivity quickChatRoomActivity, GameRoom gameRoom) {
            this.f4929b = quickChatRoomActivity;
            this.f4928a = gameRoom;
        }

        public final void onClick(View view) {
            QuickChatRoomActivity.m3300a(this.f4929b, this.f4928a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.46 */
    class AnonymousClass46 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4930a;
        final /* synthetic */ QuickChatRoomActivity f4931b;

        AnonymousClass46(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4931b = quickChatRoomActivity;
            this.f4930a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4931b.f4997u.f5762w, this.f4931b.f4997u.f5755p, this.f4931b.f4992o, this.f4931b.f4993p, this.f4931b.f4997u.m3726a().f5836o, this.f4931b.f4997u.m3726a().f5832k.intValue(), 0);
            this.f4930a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.47 */
    class AnonymousClass47 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4932a;
        final /* synthetic */ QuickChatRoomActivity f4933b;

        AnonymousClass47(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4933b = quickChatRoomActivity;
            this.f4932a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4933b.f4997u.f5762w, this.f4933b.f4997u.f5755p, this.f4933b.f4992o, this.f4933b.f4993p, this.f4933b.f4997u.m3726a().f5836o, this.f4933b.f4997u.m3726a().f5832k.intValue(), 1);
            this.f4932a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.48 */
    class AnonymousClass48 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4934a;
        final /* synthetic */ QuickChatRoomActivity f4935b;

        AnonymousClass48(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4935b = quickChatRoomActivity;
            this.f4934a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4935b.f4997u.f5762w, this.f4935b.f4997u.f5755p, this.f4935b.f4992o, this.f4935b.f4993p, this.f4935b.f4997u.m3726a().f5836o, this.f4935b.f4997u.m3726a().f5832k.intValue(), -2);
            this.f4934a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.49 */
    class AnonymousClass49 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4936a;
        final /* synthetic */ QuickChatRoomActivity f4937b;

        AnonymousClass49(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4937b = quickChatRoomActivity;
            this.f4936a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4937b.f4997u.f5762w, this.f4937b.f4997u.f5755p, this.f4937b.f4992o, this.f4937b.f4993p, this.f4937b.f4997u.m3726a().f5836o, this.f4937b.f4997u.m3726a().f5832k.intValue(), -1);
            this.f4936a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.4 */
    class C07634 implements OnTouchListener {
        final /* synthetic */ QuickChatRoomActivity f4938a;

        C07634(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4938a = quickChatRoomActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f4938a.f4994q) {
                this.f4938a.f4994q = false;
            }
            this.f4938a.f5000x.setVisibility(8);
            this.f4938a.m3348b();
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.50 */
    class AnonymousClass50 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4940a;
        final /* synthetic */ QuickChatRoomActivity f4941b;

        AnonymousClass50(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4941b = quickChatRoomActivity;
            this.f4940a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4941b.f4997u.f5762w, this.f4941b.f4997u.f5755p, this.f4941b.f4992o, this.f4941b.f4993p, this.f4941b.f4997u.m3726a().f5836o, this.f4941b.f4997u.m3726a().f5832k.intValue(), -3);
            this.f4940a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.51 */
    class AnonymousClass51 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4942a;
        final /* synthetic */ QuickChatRoomActivity f4943b;

        AnonymousClass51(QuickChatRoomActivity quickChatRoomActivity, ShareSocialDialog shareSocialDialog) {
            this.f4943b = quickChatRoomActivity;
            this.f4942a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4258a(this.f4943b.f4997u.f5762w, this.f4943b.f4997u.f5755p, this.f4943b.f4992o, this.f4943b.f4993p, this.f4943b.f4997u.m3726a().f5836o, this.f4943b.f4997u.m3726a().f5832k.intValue(), -4);
            this.f4942a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.55 */
    class AnonymousClass55 implements OnClickListener {
        final /* synthetic */ GameRoom f4947a;
        final /* synthetic */ QuickChatRoomActivity f4948b;

        AnonymousClass55(QuickChatRoomActivity quickChatRoomActivity, GameRoom gameRoom) {
            this.f4948b = quickChatRoomActivity;
            this.f4947a = gameRoom;
        }

        public final void onClick(View view) {
            QuickChatRoomActivity.m3300a(this.f4948b, this.f4947a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.5 */
    class C07655 implements OnScrollListener {
        final /* synthetic */ QuickChatRoomActivity f4949a;

        /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.5.1 */
        class C07641 implements Runnable {
            final /* synthetic */ C07655 f4939a;

            C07641(C07655 c07655) {
                this.f4939a = c07655;
            }

            public final void run() {
                QuickChatRoomActivity.m3331m(this.f4939a.f4949a);
            }
        }

        C07655(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4949a = quickChatRoomActivity;
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if ((i == 0 || i == 2) && this.f4949a.f4986i && !this.f4949a.f4988k && ((ChatMsg) this.f4949a.f4996t.m4239a(0)) != null) {
                this.f4949a.f4988k = true;
                this.f4949a.f4996t.m4244b(Long.valueOf(-1), null);
                this.f4949a.f4998v.notifyDataSetChanged();
                this.f4949a.f4999w.smoothScrollToPosition(0);
                this.f4949a.f4999w.postDelayed(new C07641(this), 500);
            }
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!this.f4949a.f4987j && this.f4949a.f4999w.getLastVisiblePosition() == this.f4949a.f4996t.m4238a() - 1) {
                this.f4949a.f4987j = true;
            } else if (i == 0 && this.f4949a.f4987j && !this.f4949a.f4988k) {
                this.f4949a.f4986i = true;
            } else {
                this.f4949a.f4986i = false;
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.6 */
    class C07666 implements OnClickListener {
        final /* synthetic */ QuickChatRoomActivity f4950a;

        C07666(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4950a = quickChatRoomActivity;
        }

        public final void onClick(View view) {
            QuickChatRoomActivity.m3336p(this.f4950a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.7 */
    class C07677 implements OnClickListener {
        final /* synthetic */ QuickChatRoomActivity f4951a;

        C07677(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4951a = quickChatRoomActivity;
        }

        public final void onClick(View view) {
            Context context = this.f4951a;
            context.startActivity(new Intent(context, BuyInMsgActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.8 */
    class C07688 implements OnGlobalLayoutListener {
        final /* synthetic */ QuickChatRoomActivity f4952a;

        C07688(QuickChatRoomActivity quickChatRoomActivity) {
            this.f4952a = quickChatRoomActivity;
        }

        public final void onGlobalLayout() {
            this.f4952a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.9 */
    class C07699 implements OnClickListener {
        final /* synthetic */ QuickChatRoomActivity f4953a;

        static {
            fixHelper.fixfunc(new int[]{2121, 2122});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07699(QuickChatRoomActivity quickChatRoomActivity);

        public final native void onClick(View view);
    }

    public QuickChatRoomActivity() {
        this.ai = false;
        this.aj = new Handler() {
            final /* synthetic */ QuickChatRoomActivity f4900a;

            {
                this.f4900a = r1;
            }

            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    this.f4900a.ad.setVisibility(8);
                }
                super.handleMessage(message);
            }
        };
        this.at = 0.0d;
        this.au = new Handler() {
            final /* synthetic */ QuickChatRoomActivity f4903a;

            {
                this.f4903a = r1;
            }

            public final void handleMessage(Message message) {
                if (message.what == QuickChatRoomActivity.ak) {
                    if (this.f4903a.ap == 300) {
                        this.f4903a.m3311c(false);
                        this.f4903a.m3332n();
                    } else {
                        this.f4903a.ap = this.f4903a.ap + 1;
                    }
                } else if (message.what == QuickChatRoomActivity.al) {
                    QuickChatRoomActivity.m3289C(this.f4903a);
                }
                super.handleMessage(message);
            }
        };
    }

    static /* synthetic */ void m3289C(QuickChatRoomActivity quickChatRoomActivity) {
        if (quickChatRoomActivity.am != null) {
            double maxAmplitude = ((double) quickChatRoomActivity.am.getMaxAmplitude()) / 1.0d;
            quickChatRoomActivity.at += maxAmplitude;
            if (maxAmplitude > 1.0d) {
                maxAmplitude = Math.log10(maxAmplitude) * 20.0d;
            } else {
                maxAmplitude = 0.0d;
            }
            if (maxAmplitude >= 0.0d && maxAmplitude < 20.0d) {
                quickChatRoomActivity.f4965J.setImageBitmap(null);
            } else if (maxAmplitude >= 20.0d && maxAmplitude < 40.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903616);
            } else if (maxAmplitude >= 40.0d && maxAmplitude < 60.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903617);
            } else if (maxAmplitude >= 60.0d && maxAmplitude < 80.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903618);
            } else if (maxAmplitude >= 80.0d && maxAmplitude < 100.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903619);
            } else if (maxAmplitude >= 100.0d && maxAmplitude < 120.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903620);
            } else if (maxAmplitude >= 120.0d && maxAmplitude < 140.0d) {
                quickChatRoomActivity.f4965J.setImageResource(2130903621);
            }
        }
    }

    static /* synthetic */ void m3298a(QuickChatRoomActivity quickChatRoomActivity, int i) {
        int selectionStart = quickChatRoomActivity.f4958C.getSelectionStart();
        int selectionEnd = quickChatRoomActivity.f4958C.getSelectionEnd();
        if (i + 1 != RuntimeData.f6692w.size()) {
            Object obj;
            CharSequence text = quickChatRoomActivity.f4958C.getText();
            text.delete(selectionStart, selectionEnd);
            Expression expression = (Expression) RuntimeData.f6692w.get(i);
            if (Utility.m4480a()) {
                obj = expression.f6045b;
            } else if (Utility.m4485b()) {
                r1 = expression.f6046c;
            } else {
                r1 = expression.f6044a;
            }
            text.insert(selectionStart, obj);
            CharSequence spannableStringBuilder = new SpannableStringBuilder(text);
            Matcher matcher = quickChatRoomActivity.f4995s.matcher(text);
            while (matcher.find()) {
                expression = (Expression) RuntimeData.f6691v.get(matcher.group());
                if (expression != null) {
                    spannableStringBuilder.setSpan(new ImageSpan(quickChatRoomActivity, BitmapFactory.decodeResource(quickChatRoomActivity.getResources(), expression.f6047d), 0), matcher.start(), matcher.end(), 33);
                }
            }
            quickChatRoomActivity.f4958C.setText(spannableStringBuilder);
            quickChatRoomActivity.f4958C.setSelection(obj.length() + selectionStart);
        } else if (selectionStart == selectionEnd) {
            quickChatRoomActivity.f4958C.onKeyDown(67, new KeyEvent(0, 67));
        } else {
            quickChatRoomActivity.f4958C.getText().delete(selectionStart, selectionEnd);
        }
    }

    static /* synthetic */ void m3337q(QuickChatRoomActivity quickChatRoomActivity) {
        quickChatRoomActivity.f5001y.setVisibility(4);
        quickChatRoomActivity.f5002z.setVisibility(0);
        quickChatRoomActivity.f4957B.setVisibility(0);
        quickChatRoomActivity.f4960E.setVisibility(4);
        quickChatRoomActivity.f4958C.setVisibility(8);
        quickChatRoomActivity.f4959D.setVisibility(4);
        quickChatRoomActivity.f4956A.setVisibility(4);
        quickChatRoomActivity.f4958C.clearFocus();
        quickChatRoomActivity.f4994q = false;
        quickChatRoomActivity.f4959D.setBackgroundResource(2130837605);
        quickChatRoomActivity.f5000x.setVisibility(8);
        quickChatRoomActivity.m3348b();
    }

    static /* synthetic */ void m3338r(QuickChatRoomActivity quickChatRoomActivity) {
        quickChatRoomActivity.f5002z.setVisibility(4);
        quickChatRoomActivity.f5001y.setVisibility(0);
        quickChatRoomActivity.f4957B.setVisibility(4);
        quickChatRoomActivity.f4958C.setVisibility(0);
        quickChatRoomActivity.f4960E.setVisibility(0);
        quickChatRoomActivity.f4959D.setVisibility(0);
        quickChatRoomActivity.f4956A.setVisibility(0);
        quickChatRoomActivity.f4958C.requestFocus();
        quickChatRoomActivity.m3327k();
        quickChatRoomActivity.m3324j();
    }

    static /* synthetic */ void m3342v(QuickChatRoomActivity quickChatRoomActivity) {
        quickChatRoomActivity.f4958C.requestFocus();
        if (quickChatRoomActivity.f4994q) {
            quickChatRoomActivity.f4994q = false;
            quickChatRoomActivity.f4959D.setBackgroundResource(2130837605);
            quickChatRoomActivity.f4961F.setVisibility(4);
            quickChatRoomActivity.m3329l();
            quickChatRoomActivity.f5000x.setVisibility(8);
            quickChatRoomActivity.m3327k();
            quickChatRoomActivity.m3330m();
            return;
        }
        quickChatRoomActivity.f4994q = true;
        quickChatRoomActivity.f4959D.setBackgroundResource(2130903075);
        quickChatRoomActivity.f4961F.setVisibility(0);
        quickChatRoomActivity.f5000x.getLayoutParams().height = SharedPreferencesManager.m4296a(quickChatRoomActivity.getResources());
        if (quickChatRoomActivity.m2735c() != 0) {
            quickChatRoomActivity.m3329l();
            quickChatRoomActivity.m3348b();
            quickChatRoomActivity.f5000x.setVisibility(0);
            quickChatRoomActivity.m3330m();
        } else {
            quickChatRoomActivity.f5000x.setVisibility(0);
            quickChatRoomActivity.f5000x.postDelayed(new Runnable() {
                final /* synthetic */ QuickChatRoomActivity f4893a;

                {
                    this.f4893a = r1;
                }

                public final void run() {
                    this.f4893a.m3308b(false);
                }
            }, 200);
        }
        quickChatRoomActivity.f4973R.setVisibility(8);
    }

    static {
        f4954f = "ChatRoomActivity";
        f4955r = "\\[[a-zA-Z0-9\\-\\\\!\\u4e00-\\u9fa5]+\\]";
        ak = 1;
        al = 2;
        an = VoiceFileUtility.f6576a + "voice_temp";
    }

    protected void onCreate(Bundle bundle) {
        this.af = new ArrayList();
        this.f4987j = false;
        this.f4988k = false;
        this.f4994q = false;
        Bundle extras = getIntent().getExtras();
        this.f4989l = extras.getLong("lChatRoomId");
        this.f4990m = extras.getInt("eTalkType");
        this.f4991n = extras.getInt("eGameRoomType", 1);
        this.f4997u = DBManager.m3631a().f5565e.m3590a(this.f4989l, this.f4990m);
        this.f4995s = Pattern.compile(f4955r);
        if (this.f4990m == 1) {
            this.f4985h = 2131165304;
        } else {
            this.f4985h = 2131165291;
        }
        this.f4997u = DBManager.m3631a().f5565e.m3590a(this.f4989l, this.f4990m);
        super.onCreate(bundle);
        setContentView(2130968658);
        this.f4984g = (Toolbar) findViewById(2131558769);
        setSupportActionBar(this.f4984g);
        this.f4984g.setTitleTextAppearance(this, 2131296567);
        this.f4984g.setNavigationIcon(2130837591);
        this.f4984g.setNavigationOnClickListener(new C07601(this));
        this.f4967L = (PowerManager) getSystemService("power");
        this.f4969N = (AudioManager) getSystemService("audio");
        this.f4970O = (SensorManager) getSystemService("sensor");
        this.f4971P = this.f4970O.getDefaultSensor(8);
        findViewById(2131558561).getViewTreeObserver().addOnGlobalLayoutListener(new C07688(this));
        this.f5001y = (ImageButton) findViewById(2131558883);
        this.f5001y.setOnClickListener(new C07699(this));
        this.f5002z = (ImageButton) findViewById(2131558889);
        this.f5002z.setOnClickListener(new OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4883a;

            {
                this.f4883a = r1;
            }

            public final void onClick(View view) {
                QuickChatRoomActivity.m3338r(this.f4883a);
            }
        });
        this.f4959D = (ImageButton) findViewById(2131558885);
        this.f4956A = (Button) findViewById(2131558886);
        this.f4956A.setOnClickListener(new OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4884a;

            {
                this.f4884a = r1;
            }

            public final void onClick(View view) {
                QuickChatRoomActivity.m3339s(this.f4884a);
            }
        });
        this.f4958C = (EditText) findViewById(2131558882);
        this.f4958C.setOnFocusChangeListener(new OnFocusChangeListener() {
            final /* synthetic */ QuickChatRoomActivity f4886a;

            {
                this.f4886a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                QuickChatRoomActivity.m3306b(this.f4886a, z);
            }
        });
        this.f4958C.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ QuickChatRoomActivity f4887a;

            {
                this.f4887a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                this.f4887a.m3324j();
            }
        });
        this.f4958C.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ QuickChatRoomActivity f4889a;

            /* renamed from: com.illuminate.texaspoker.activity.QuickChatRoomActivity.15.1 */
            class C07591 implements Runnable {
                final /* synthetic */ AnonymousClass15 f4888a;

                C07591(AnonymousClass15 anonymousClass15) {
                    this.f4888a = anonymousClass15;
                }

                public final void run() {
                    this.f4888a.f4889a.m3308b(false);
                }
            }

            {
                this.f4889a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f4889a.m3327k();
                if (this.f4889a.f4994q) {
                    QuickChatRoomActivity.m3342v(this.f4889a);
                }
                if (this.f4889a.m2735c() == 0) {
                    this.f4889a.f4958C.postDelayed(new C07591(this), 400);
                }
                return false;
            }
        });
        this.f4960E = findViewById(2131558887);
        this.f4957B = (Button) findViewById(2131558888);
        this.f4957B.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ QuickChatRoomActivity f4890a;

            {
                this.f4890a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                QuickChatRoomActivity.m3299a(this.f4890a, motionEvent);
                return false;
            }
        });
        this.f5000x = findViewById(2131558582);
        this.f4961F = (GridView) findViewById(2131558583);
        this.f4959D.setOnClickListener(new OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4891a;

            {
                this.f4891a = r1;
            }

            public final void onClick(View view) {
                QuickChatRoomActivity.m3342v(this.f4891a);
            }
        });
        this.f4962G = new ExpressionAdapter(this);
        this.f4961F.setAdapter(this.f4962G);
        this.f4961F.setOnItemClickListener(new OnItemClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4892a;

            {
                this.f4892a = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                QuickChatRoomActivity.m3298a(this.f4892a, i);
            }
        });
        m3323i();
        this.f4963H = findViewById(2131558589);
        this.f4964I = findViewById(2131558590);
        this.f4965J = (ImageView) findViewById(2131558591);
        this.f4966K = findViewById(2131558592);
        this.f4973R = findViewById(2131559344);
        this.f4973R.setVisibility(0);
        this.f4974S = (ImageView) findViewById(2131559193);
        this.f4975T = (ImageButton) findViewById(2131559194);
        this.f4975T.setVisibility(0);
        this.f4975T.setOnClickListener(new C07666(this));
        this.f4976U = (TextView) findViewById(2131559195);
        this.f4976U.setVisibility(0);
        this.f4977V = (TextView) findViewById(2131558842);
        this.f4978W = (TextView) findViewById(2131559196);
        this.f4979X = (TextView) findViewById(2131559197);
        this.f4980Y = (TextView) findViewById(2131559198);
        this.f4981Z = (TextView) findViewById(2131559199);
        this.aa = (ImageButton) findViewById(2131559200);
        this.ab = (TextView) findViewById(2131559201);
        this.ac = (HorizontalListView) findViewById(2131559345);
        this.ae = new ak(this, this.af);
        this.ac.setAdapter(this.ae);
        this.ad = (TextView) findViewById(2131558802);
        this.ag = (ImageButton) findViewById(2131558573);
        this.ag.setOnClickListener(new C07677(this));
        m3308b(false);
    }

    public void finish() {
        BaseApplication.f5509b.m3212d();
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("returnTo", -1);
        startActivity(intent);
        overridePendingTransition(2131034127, 2131034127);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f4997u.f5748i.longValue() == SharedPreferencesManager.m4308b()) {
            getMenuInflater().inflate(2131689499, menu);
        } else {
            getMenuInflater().inflate(2131689498, menu);
        }
        this.ah = menu;
        if (this.f4991n == 2) {
            m3314e();
        }
        return true;
    }

    private void m3314e() {
        GameRoom a = DBManager.m3631a().f5572l.m3656a(this.f4997u.f5750k.longValue(), this.f4989l);
        if (this.ah == null) {
            return;
        }
        if (a == null || !a.f5882f.booleanValue()) {
            this.ah.getItem(0).setEnabled(true);
        } else {
            this.ah.getItem(0).setEnabled(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559451) {
            m3334o();
            return true;
        } else if (itemId != 2131559452) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m3334o();
            return true;
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f4972Q = sensorEvent.values[0];
        if (this.f4972Q == this.f4971P.getMaximumRange()) {
            this.f4969N.setSpeakerphoneOn(true);
            this.f4969N.setMode(0);
            if (this.f4968M != null && this.f4968M.isHeld()) {
                this.f4968M.release();
                this.f4968M = null;
                this.ai = false;
            }
        } else if (this.f4998v != null && this.f4998v.m2709b()) {
            this.f4968M = this.f4967L.newWakeLock(32, getClass().getCanonicalName());
            this.ai = true;
            this.f4968M.acquire();
            this.f4969N.setSpeakerphoneOn(false);
            this.f4969N.setMode(3);
            this.f4998v.m2710c();
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    protected void onStop() {
        super.onStop();
        if (!this.ai && !DBManager.m3631a().m3632b()) {
            DBManager.m3631a().f5566f.m3580c(this.f4989l, this.f4990m);
        }
    }

    protected void onPause() {
        super.onPause();
        if (!this.ai) {
            this.f4970O.unregisterListener(this);
            if (!DBManager.m3631a().m3632b()) {
                this.f4998v.m2708a();
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.f4970O.registerListener(this, this.f4971P, 3);
        m3317f();
        m3318g();
        NetworkUtil.m4073a();
        NetworkUtil.m4174k();
    }

    private void m3317f() {
        if (this.f4991n == 1 || this.f4991n == 3) {
            this.f4984g.setTitle(getResources().getString(2131165845));
        } else if (this.f4991n == 2) {
            this.f4984g.setTitle(getResources().getString(2131165850));
        } else if (this.f4991n == 4) {
            this.f4984g.setTitle(getResources().getString(2131165838));
        } else if (this.f4991n == 5 || this.f4991n == 6) {
            this.f4984g.setTitle(getResources().getString(2131165846));
        }
        if (!DBManager.m3631a().m3632b()) {
            this.f4997u = DBManager.m3631a().f5565e.m3590a(this.f4989l, this.f4990m);
            if (this.f4997u == null) {
                new Builder(this).setTitle(2131165514).setMessage(2131165849).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                    final /* synthetic */ QuickChatRoomActivity f4885a;

                    {
                        this.f4885a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f4885a.finish();
                    }
                }).setCancelable(false).show();
                return;
            }
            if (DBManager.m3631a().f5566f.m3576b(this.f4989l, this.f4990m) == 0) {
                this.f4996t.m4243b();
            }
            m3320h();
            m3302a(false);
            DBManager.m3631a().f5566f.m3580c(this.f4989l, this.f4990m);
            this.af.clear();
            this.af.addAll(DBManager.m3631a().f5569i.m3610a(this.f4989l));
            this.ae.notifyDataSetChanged();
            if (this.f4997u != null) {
                Drawable drawable;
                this.f4991n = this.f4997u.f5722I.intValue();
                if (this.f4991n != 2) {
                    if (this.f4991n == 4) {
                        this.f4974S.setBackgroundResource(2130837698);
                    } else if (this.f4991n == 5 || this.f4991n == 6) {
                        this.f4974S.setBackgroundResource(2130837697);
                    } else {
                        this.f4974S.setBackgroundResource(2130837696);
                    }
                    if (this.f4997u.f5748i.longValue() == SharedPreferencesManager.m4308b()) {
                        this.aa.setVisibility(0);
                        this.ab.setText(2131165273);
                        this.aa.setOnClickListener(new OnClickListener() {
                            final /* synthetic */ QuickChatRoomActivity f4898a;

                            {
                                this.f4898a = r1;
                            }

                            public final void onClick(View view) {
                                new Builder(this.f4898a).setTitle(2131165514).setMessage(2131165851).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                                    final /* synthetic */ QuickChatRoomActivity f4914a;

                                    {
                                        this.f4914a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        this.f4914a.b = new LoadingDialog(this.f4914a);
                                        this.f4914a.b.show();
                                        NetworkUtil.m4073a();
                                        NetworkUtil.m4165f(this.f4914a.f4989l);
                                    }
                                }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                                    final /* synthetic */ QuickChatRoomActivity f4913a;

                                    {
                                        this.f4913a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                    }
                                }).show();
                            }
                        });
                        this.f4974S.setOnClickListener(new OnClickListener() {
                            final /* synthetic */ QuickChatRoomActivity f4910a;

                            {
                                this.f4910a = r1;
                            }

                            public final void onClick(View view) {
                                new Builder(this.f4910a).setTitle(2131165514).setMessage(2131165851).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                                    final /* synthetic */ QuickChatRoomActivity f4914a;

                                    {
                                        this.f4914a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        this.f4914a.b = new LoadingDialog(this.f4914a);
                                        this.f4914a.b.show();
                                        NetworkUtil.m4073a();
                                        NetworkUtil.m4165f(this.f4914a.f4989l);
                                    }
                                }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                                    final /* synthetic */ QuickChatRoomActivity f4913a;

                                    {
                                        this.f4913a = r1;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                    }
                                }).show();
                            }
                        });
                    } else {
                        this.aa.setVisibility(4);
                        this.ab.setVisibility(4);
                        this.f4974S.setEnabled(false);
                    }
                    this.f4979X.setVisibility(4);
                    this.f4981Z.setVisibility(4);
                    drawable = getResources().getDrawable(2130903286);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4978W.setCompoundDrawables(drawable, null, null, null);
                    drawable = getResources().getDrawable(2130903258);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4980Y.setCompoundDrawables(drawable, null, null, null);
                    this.f4978W.setText(Utility.m4471a(this.f4997u.f5753n.longValue()));
                    CharSequence charSequence = Utility.m4508i(this.f4997u.f5743d.longValue()) + "/" + Utility.m4508i(this.f4997u.f5744e.longValue());
                    if (!(this.f4997u.f5725L == null || this.f4997u.f5725L.intValue() == 0)) {
                        charSequence = charSequence + "(" + Utility.m4508i((long) this.f4997u.f5725L.intValue()) + ")";
                    }
                    this.f4980Y.setText(charSequence);
                    long longValue = this.f4997u.f5750k.longValue();
                    if (longValue != 0) {
                        this.b = new LoadingDialog(this);
                        this.b.show();
                        NetworkUtil.m4073a();
                        NetworkUtil.m4169h(longValue);
                    }
                } else {
                    this.f4974S.setBackgroundResource(2130837699);
                    drawable = getResources().getDrawable(2130903268);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4978W.setCompoundDrawables(drawable, null, null, null);
                    drawable = getResources().getDrawable(2130903261);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4979X.setCompoundDrawables(drawable, null, null, null);
                    drawable = getResources().getDrawable(2130903277);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4980Y.setCompoundDrawables(drawable, null, null, null);
                    drawable = getResources().getDrawable(2130903258);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4981Z.setCompoundDrawables(drawable, null, null, null);
                    GameRoom a = DBManager.m3631a().f5572l.m3656a(this.f4997u.f5750k.longValue(), this.f4989l);
                    this.f4993p = a.f5891o.intValue();
                    this.f4978W.setText(a.f5892p + "/" + a.f5891o);
                    this.f4992o = a.f5890n.intValue() - 1;
                    if (this.f4992o < 0) {
                        this.f4992o = 0;
                    }
                    long a2 = Utility.m4469a(this.f4992o);
                    this.f4979X.setText(Utility.m4508i(a2) + "+" + Utility.m4508i((long) (((double) a2) * 0.1d)));
                    a2 = (long) Utility.m4482b(this.f4992o);
                    this.f4980Y.setText(String.format(getResources().getString(2131165682), new Object[]{Long.valueOf(a2 / 60)}));
                    this.f4981Z.setText(Utility.m4508i(Utility.m4487c(this.f4992o)));
                    this.f4974S.setOnClickListener(new AnonymousClass45(this, a));
                    if (a.f5880d.booleanValue()) {
                        if (a.f5881e.booleanValue()) {
                            this.ab.setText(2131165272);
                            this.aa.setOnClickListener(new OnClickListener() {
                                final /* synthetic */ QuickChatRoomActivity f4944a;

                                {
                                    this.f4944a = r1;
                                }

                                public final void onClick(View view) {
                                    QuickChatRoomActivity.m3305b(this.f4944a);
                                }
                            });
                        } else {
                            this.ab.setText(2131165277);
                            this.aa.setOnClickListener(new OnClickListener() {
                                final /* synthetic */ QuickChatRoomActivity f4945a;

                                {
                                    this.f4945a = r1;
                                }

                                public final void onClick(View view) {
                                    QuickChatRoomActivity.m3305b(this.f4945a);
                                }
                            });
                        }
                        this.aa.setEnabled(true);
                    } else if (a.f5882f.booleanValue()) {
                        this.ab.setText(2131165279);
                        this.aa.setEnabled(false);
                    } else {
                        if (a.f5881e.booleanValue()) {
                            this.ab.setText(2131165272);
                            this.aa.setOnClickListener(new OnClickListener() {
                                final /* synthetic */ QuickChatRoomActivity f4946a;

                                {
                                    this.f4946a = r1;
                                }

                                public final void onClick(View view) {
                                    QuickChatRoomActivity.m3305b(this.f4946a);
                                }
                            });
                        } else {
                            this.ab.setText(2131165276);
                            this.aa.setOnClickListener(new AnonymousClass55(this, a));
                        }
                        this.aa.setEnabled(true);
                    }
                    m3314e();
                }
                this.f4977V.setText(this.f4997u.f5755p);
                if (this.f4991n == 3 || this.f4991n == 6) {
                    drawable = getResources().getDrawable(2130903383);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f4977V.setCompoundDrawables(null, null, drawable, null);
                } else {
                    this.f4977V.setCompoundDrawables(null, null, null, null);
                }
                this.f4976U.setText(this.f4997u.f5762w);
                return;
            }
            new Builder(this).setTitle(2131165514).setMessage(2131165849).setPositiveButton(2131165438, new C07612(this)).setCancelable(false).show();
        }
    }

    private void m3318g() {
        if (!DBManager.m3631a().m3632b()) {
            if (DBManager.m3631a().f5579s.m3559a() <= 0) {
                this.ag.setVisibility(8);
                LayoutParams layoutParams = (LayoutParams) this.ag.getLayoutParams();
                layoutParams.rightMargin = (int) (-getResources().getDimension(2131230827));
                this.ag.setLayoutParams(layoutParams);
            } else if (((LayoutParams) this.ag.getLayoutParams()).rightMargin != 0) {
                this.ag.setVisibility(0);
                Animation translateAnimation = new TranslateAnimation(0.0f, -getResources().getDimension(2131230827), 0.0f, 0.0f);
                translateAnimation.setDuration(500);
                translateAnimation.setAnimationListener(new C07623(this));
                this.ag.startAnimation(translateAnimation);
            }
        }
    }

    private void m3320h() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4998v.notifyDataSetChanged();
        }
    }

    private void m3302a(boolean z) {
        if (!DBManager.m3631a().m3632b()) {
            List b = DBManager.m3631a().f5566f.m3577b(this.f4989l, this.f4982d, this.f4990m);
            int size = b.size();
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    ChatMsg chatMsg = (ChatMsg) b.get(i);
                    this.f4996t.m4241a(chatMsg.f5689b, chatMsg);
                    if (i == size - 1) {
                        this.f4982d = chatMsg.f5703p.longValue();
                    }
                }
                m3320h();
                if (z) {
                    m3308b(true);
                    return;
                }
                int lastVisiblePosition = this.f4999w.getLastVisiblePosition();
                if (lastVisiblePosition == -1) {
                    lastVisiblePosition = this.f4996t.m4238a();
                }
                if (this.f4996t.m4238a() - lastVisiblePosition < 5) {
                    m3308b(true);
                }
            }
        }
    }

    private void m3323i() {
        this.f4999w = (ListView) findViewById(2131558579);
        this.f4999w.setOnTouchListener(new C07634(this));
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        this.f4996t = new MapList();
        List<ChatMsg> c = DBManager.m3631a().f5566f.m3579c(this.f4989l, currentTimeMillis, this.f4990m);
        if (c.size() != 0) {
            this.f4982d = ((ChatMsg) c.get(c.size() - 1)).f5703p.longValue();
            this.f4983e = ((ChatMsg) c.get(0)).f5703p.longValue();
        } else {
            this.f4983e = currentTimeMillis;
            this.f4982d = currentTimeMillis;
        }
        for (ChatMsg chatMsg : c) {
            this.f4996t.m4241a(chatMsg.f5689b, chatMsg);
        }
        this.f4998v = new ChatMsgListAdapter(this, this.f4989l, this.f4990m, false);
        this.f4998v.f3262e = this.f4996t;
        this.f4999w.setAdapter(this.f4998v);
        this.f4999w.setOnScrollListener(new C07655(this));
    }

    private void m3308b(boolean z) {
        if (z) {
            this.f4999w.smoothScrollToPosition(this.f4998v.getCount() - 1);
        } else {
            this.f4999w.setSelection(this.f4998v.getCount() - 1);
        }
    }

    private void m3324j() {
        CharSequence obj = this.f4958C.getText().toString();
        ViewGroup.LayoutParams layoutParams = this.f4956A.getLayoutParams();
        if (StringUtils.m4462a(obj)) {
            layoutParams.width = 0;
        } else {
            layoutParams.width = (int) getResources().getDimension(2131230828);
        }
        this.f4956A.setLayoutParams(layoutParams);
    }

    private void m3327k() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.f4958C, 1);
        this.f4973R.setVisibility(8);
    }

    protected final void m3348b() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f4958C.getWindowToken(), 0);
        this.f4973R.setVisibility(0);
    }

    private void m3329l() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4999w.getLayoutParams();
        layoutParams.height = this.f4999w.getHeight();
        layoutParams.weight = 0.0f;
    }

    private void m3330m() {
        this.f4958C.postDelayed(new Runnable() {
            final /* synthetic */ QuickChatRoomActivity f4895a;

            {
                this.f4895a = r1;
            }

            public final void run() {
                ((LinearLayout.LayoutParams) this.f4895a.f4999w.getLayoutParams()).weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.f4895a.m3308b(true);
            }
        }, 200);
    }

    protected final void m3347a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_MSG")) {
            DBManager.m3631a().f5566f.m3580c(this.f4989l, this.f4990m);
            if (!DBManager.m3631a().m3632b()) {
                m3302a(false);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m3317f();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3317f();
        } else if (str.equalsIgnoreCase("NOTIFY_RFRESH_USER_INFO")) {
            m3317f();
            m3302a(false);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4998v.notifyDataSetChanged();
            this.ae.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_SEND_MSG_SUCCES")) {
            r2 = ((Long) list.get(0)).longValue();
            ChatMsg chatMsg = (ChatMsg) this.f4996t.m4240a(Long.valueOf(r2));
            if (chatMsg != null) {
                chatMsg.f5707t = Integer.valueOf(DBManager.f5540C);
                Timer timer = (Timer) this.f4998v.f3258a.get(Long.valueOf(r2));
                if (timer != null) {
                    timer.cancel();
                    this.f4998v.f3258a.remove(Long.valueOf(r2));
                }
                this.f4998v.notifyDataSetChanged();
                m3308b(true);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = this.f4997u.f5762w;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_ENTER_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.h);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_FAULT")) {
            m3301a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_START_QUICK_GAME")) {
            r2 = ((Long) list.get(0)).longValue();
            long longValue = ((Long) list.get(1)).longValue();
            if (this.b != null) {
                this.b.dismiss();
            }
            if (r2 == this.f4989l) {
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4169h(longValue);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_START_QUICK_GAME_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ QuickChatRoomActivity f4897a;

                {
                    this.f4897a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_QUIT_QUICK_GAME_ROOM_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_QUIT_QUICK_GAME_ROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ QuickChatRoomActivity f4899a;

                {
                    this.f4899a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_QUICK_USER")) {
            if (!DBManager.m3631a().m3632b()) {
                r2 = ((Long) list.get(0)).longValue();
                long longValue2 = ((Long) list.get(1)).longValue();
                boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
                if (r2 == this.f4989l) {
                    Object format;
                    FriendUser a = DBManager.m3631a().f5563c.m3639a(longValue2);
                    if (booleanValue) {
                        format = String.format(getResources().getString(2131165842), new Object[]{a.f5838q});
                    } else {
                        format = String.format(getResources().getString(2131165848), new Object[]{a.f5838q});
                    }
                    CharSequence spannableString = new SpannableString(format);
                    spannableString.setSpan(new ForegroundColorSpan(-2795183), 0, a.f5838q.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), a.f5838q.length(), format.length(), 33);
                    this.ad.setText(spannableString);
                    this.ad.setVisibility(0);
                    new Timer().schedule(new TimerTask() {
                        final /* synthetic */ QuickChatRoomActivity f4901a;

                        {
                            this.f4901a = r1;
                        }

                        public final void run() {
                            Message message = new Message();
                            message.what = 1;
                            this.f4901a.aj.sendMessage(message);
                        }
                    }, 3000);
                }
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_QUICK_ROOM")) {
            m3307b((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_QUICK_USER_TABLE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.af.clear();
                this.af.addAll(DBManager.m3631a().f5569i.m3610a(this.f4989l));
                this.ae.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = this.f4997u.f5762w;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.h);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT")) {
            m3301a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = this.f4997u.f5762w;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_SIGN_UP_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.h);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM__FAULT")) {
            m3301a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinControlMsg")) {
            if (((BuyinControlMsg) list.get(0)).getEBuyinControlMessageTypeDeny() != BUYIN_CONTROL_MESSAGE_TYPE.BUYIN_CONTROL_MESSAGE_TYPE_SNG_CANCEL) {
                m3317f();
                m3318g();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS")) {
            m3318g();
        } else if (str.equalsIgnoreCase("NOTIFY_TO_REFRESH_VIEW_AFTER_DENNY")) {
            if (this.f4991n == 2) {
                NetworkUtil.m4073a();
                NetworkUtil.m4168h();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_INVITE_WAITTING")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4168h();
            this.b.dismiss();
            m2732a(2130903589, 2131165306, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
        }
    }

    private void m3301a(List<Object> list) {
        int intValue = ((Integer) list.get(0)).intValue();
        this.b.dismiss();
        new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4896a;

            {
                this.f4896a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).show();
    }

    private void m3307b(List<Object> list) {
        for (Long longValue : (List) list.get(0)) {
            if (longValue.longValue() == this.f4989l) {
                new Builder(this).setTitle(2131165514).setMessage(2131165849).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                    final /* synthetic */ QuickChatRoomActivity f4902a;

                    {
                        this.f4902a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f4902a.finish();
                    }
                }).setCancelable(false).show();
                return;
            }
        }
    }

    private void m3332n() {
        if (this.ar != null) {
            this.f4957B.setText(2131165292);
            this.f4957B.setBackgroundResource(2130903124);
            this.f4963H.setVisibility(8);
            this.f4965J.setImageBitmap(null);
            this.ar.cancel();
            this.ar.purge();
            this.ar = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1 && iArr[0] != 0) {
            m3332n();
            new Builder(this).setTitle(2131165514).setMessage(2131165461).setPositiveButton(2131165472, new DialogInterface.OnClickListener() {
                final /* synthetic */ QuickChatRoomActivity f4907a;

                {
                    this.f4907a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
                    intent.setData(Uri.parse("package:" + this.f4907a.getPackageName()));
                    this.f4907a.startActivity(intent);
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ QuickChatRoomActivity f4906a;

                {
                    this.f4906a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    private void m3311c(boolean z) {
        if (this.am != null) {
            long ceil = (long) Math.ceil((double) (((float) (System.currentTimeMillis() - this.aq)) / 1000.0f));
            if (ceil == 0) {
                ceil = 1;
            }
            if (this.as != null) {
                this.as.cancel();
                this.as.purge();
            }
            this.am.stop();
            this.am.reset();
            this.am.release();
            if (!z) {
                if (this.at != 0.0d) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.ao);
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
                        int i = this.f4990m;
                        NetworkUtil.m4073a();
                        NetworkUtil.m4079a(this.f4989l, i, CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE, LetterIndexBar.SEARCH_ICON_LETTER, currentTimeMillis, bArr, ceil);
                        String str = currentTimeMillis + ".amr";
                        long j = currentTimeMillis;
                        DBManager.m3631a().f5566f.m3568a(this.f4989l, j, this.f4990m, 2, str, ceil);
                        VoiceFileUtility.m4201a(this.f4989l, currentTimeMillis, bArr, this.f4990m);
                        m3302a(false);
                        m3308b(false);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.ao.delete();
                    new Builder(this).setTitle(2131165478).setMessage(2131165477).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                        final /* synthetic */ QuickChatRoomActivity f4909a;

                        {
                            this.f4909a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
                }
            }
            this.am = null;
        }
    }

    private void m3334o() {
        CharSequence string;
        if (this.f4997u.f5748i.longValue() == SharedPreferencesManager.m4308b()) {
            string = getString(2131165841);
        } else {
            string = getString(2131165847);
        }
        new Builder(this).setTitle(2131165514).setMessage(string).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4912a;

            {
                this.f4912a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f4912a.b = new LoadingDialog(this.f4912a);
                this.f4912a.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4167g(this.f4912a.f4989l);
            }
        }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
            final /* synthetic */ QuickChatRoomActivity f4911a;

            {
                this.f4911a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).show();
    }

    static /* synthetic */ void m3300a(QuickChatRoomActivity quickChatRoomActivity, GameRoom gameRoom) {
        Intent intent = new Intent(quickChatRoomActivity, SngDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong("lGameRoomId", gameRoom.f5897u.longValue());
        bundle.putBoolean("fromQuickChat", true);
        bundle.putLong("lChatRoomId", gameRoom.f5900x.longValue());
        intent.putExtras(bundle);
        quickChatRoomActivity.startActivity(intent);
    }

    static /* synthetic */ void m3305b(QuickChatRoomActivity quickChatRoomActivity) {
        quickChatRoomActivity.b = new LoadingDialog(quickChatRoomActivity);
        quickChatRoomActivity.b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4171i(quickChatRoomActivity.f4997u.f5750k.longValue());
    }

    static /* synthetic */ void m3331m(QuickChatRoomActivity quickChatRoomActivity) {
        List<ChatMsg> c = DBManager.m3631a().f5566f.m3579c(quickChatRoomActivity.f4989l, quickChatRoomActivity.f4983e, quickChatRoomActivity.f4990m);
        if (c.size() != 0) {
            quickChatRoomActivity.f4983e = ((ChatMsg) c.get(0)).f5703p.longValue();
            ChatMsg chatMsg = (ChatMsg) c.get(c.size() - 1);
            Collections.reverse(c);
            quickChatRoomActivity.f4996t.m4245c(Long.valueOf(-1));
            for (ChatMsg chatMsg2 : c) {
                quickChatRoomActivity.f4996t.m4244b(chatMsg2.f5689b, chatMsg2);
            }
            quickChatRoomActivity.f4998v.notifyDataSetChanged();
            quickChatRoomActivity.f4999w.setSelection(quickChatRoomActivity.f4996t.m4242b(chatMsg.f5689b));
        } else {
            quickChatRoomActivity.f4996t.m4245c(Long.valueOf(-1));
            quickChatRoomActivity.f4998v.notifyDataSetChanged();
        }
        quickChatRoomActivity.f4988k = false;
    }

    static /* synthetic */ void m3336p(QuickChatRoomActivity quickChatRoomActivity) {
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(quickChatRoomActivity);
        if (quickChatRoomActivity.f4991n != 2) {
            shareSocialDialog.f7078a = new AnonymousClass39(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7079b = new AnonymousClass40(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7080c = new AnonymousClass41(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7081d = new AnonymousClass42(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7082e = new AnonymousClass43(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7083f = new AnonymousClass44(quickChatRoomActivity, shareSocialDialog);
        } else {
            shareSocialDialog.f7078a = new AnonymousClass46(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7079b = new AnonymousClass47(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7080c = new AnonymousClass48(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7081d = new AnonymousClass49(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7082e = new AnonymousClass50(quickChatRoomActivity, shareSocialDialog);
            shareSocialDialog.f7083f = new AnonymousClass51(quickChatRoomActivity, shareSocialDialog);
        }
        shareSocialDialog.show();
    }

    static /* synthetic */ boolean m3339s(QuickChatRoomActivity quickChatRoomActivity) {
        String obj = quickChatRoomActivity.f4958C.getText().toString();
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        int i = quickChatRoomActivity.f4990m;
        NetworkUtil.m4073a();
        NetworkUtil.m4079a(quickChatRoomActivity.f4989l, i, CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT, obj, currentTimeMillis, null, 0);
        DBManager.m3631a().f5566f.m3568a(quickChatRoomActivity.f4989l, currentTimeMillis, quickChatRoomActivity.f4990m, 1, obj, 0);
        quickChatRoomActivity.f4958C.setText(LetterIndexBar.SEARCH_ICON_LETTER);
        quickChatRoomActivity.m3302a(true);
        return false;
    }

    static /* synthetic */ void m3306b(QuickChatRoomActivity quickChatRoomActivity, boolean z) {
        if (z) {
            quickChatRoomActivity.f4960E.setBackgroundColor(-938427);
            return;
        }
        quickChatRoomActivity.f4960E.setBackgroundColor(-5855578);
        quickChatRoomActivity.m3348b();
    }

    static /* synthetic */ void m3299a(QuickChatRoomActivity quickChatRoomActivity, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            quickChatRoomActivity.f4957B.setText(2131165294);
            quickChatRoomActivity.f4957B.setBackgroundResource(2130903125);
            quickChatRoomActivity.f4963H.setVisibility(0);
            quickChatRoomActivity.f4964I.setVisibility(0);
            quickChatRoomActivity.f4966K.setVisibility(8);
            quickChatRoomActivity.ap = 1;
            TimerTask anonymousClass29 = new TimerTask() {
                final /* synthetic */ QuickChatRoomActivity f4904a;

                {
                    this.f4904a = r1;
                }

                public final void run() {
                    Message message = new Message();
                    message.what = QuickChatRoomActivity.ak;
                    this.f4904a.au.sendMessage(message);
                }
            };
            quickChatRoomActivity.ar = new Timer();
            quickChatRoomActivity.ar.schedule(anonymousClass29, 0, 100);
            if (ContextCompat.checkSelfPermission(quickChatRoomActivity, "android.permission.RECORD_AUDIO") != 0) {
                ActivityCompat.requestPermissions(quickChatRoomActivity, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                return;
            }
            try {
                File file = new File(VoiceFileUtility.f6576a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                quickChatRoomActivity.at = 0.0d;
                quickChatRoomActivity.ao = new File(an);
                quickChatRoomActivity.ao.delete();
                quickChatRoomActivity.am = new MediaRecorder();
                quickChatRoomActivity.am.setAudioSource(1);
                quickChatRoomActivity.am.setOutputFormat(3);
                quickChatRoomActivity.am.setAudioEncoder(1);
                quickChatRoomActivity.am.setAudioChannels(1);
                quickChatRoomActivity.am.setAudioSamplingRate(8000);
                quickChatRoomActivity.am.setOutputFile(an);
                quickChatRoomActivity.am.prepare();
                quickChatRoomActivity.am.start();
                quickChatRoomActivity.aq = System.currentTimeMillis();
            } catch (Throwable e) {
                Log.e(f4954f, e.getMessage(), e);
                e.printStackTrace();
            }
            anonymousClass29 = new TimerTask() {
                final /* synthetic */ QuickChatRoomActivity f4908a;

                {
                    this.f4908a = r1;
                }

                public final void run() {
                    Message message = new Message();
                    message.what = QuickChatRoomActivity.al;
                    this.f4908a.au.sendMessage(message);
                }
            };
            quickChatRoomActivity.as = new Timer();
            quickChatRoomActivity.as.schedule(anonymousClass29, 0, 100);
        } else if (motionEvent.getAction() == 1) {
            if (motionEvent.getY() < -300.0f) {
                quickChatRoomActivity.m3311c(true);
            } else if (quickChatRoomActivity.ap > 10) {
                quickChatRoomActivity.m3311c(false);
            } else {
                quickChatRoomActivity.m3311c(true);
                if (ContextCompat.checkSelfPermission(quickChatRoomActivity, "android.permission.RECORD_AUDIO") == 0) {
                    quickChatRoomActivity.m2732a(2130903246, 2131165308, 0);
                }
            }
            quickChatRoomActivity.m3332n();
        } else if (motionEvent.getAction() == 2) {
            if (motionEvent.getY() < -300.0f) {
                quickChatRoomActivity.f4964I.setVisibility(8);
                quickChatRoomActivity.f4966K.setVisibility(0);
                return;
            }
            quickChatRoomActivity.f4964I.setVisibility(0);
            quickChatRoomActivity.f4966K.setVisibility(8);
        } else if (motionEvent.getAction() == 3) {
            quickChatRoomActivity.m3311c(true);
            quickChatRoomActivity.m3332n();
        }
    }
}
