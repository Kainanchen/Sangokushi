package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.BillListAdapter;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView.C0372a;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosV2Rsp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BillShareActivity extends BaseToolBarActivity {
    private static String f3667d;
    private SimpleDateFormat f3668e;
    private long f3669f;
    private List<Object> f3670g;
    private Map<String, String> f3671h;
    private BillListAdapter f3672i;
    private RefreshListView f3673j;
    private View f3674k;
    private View f3675l;
    private RefreshDefaultLayout f3676m;

    /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.1 */
    class C03641 implements OnClickListener {
        final /* synthetic */ BillShareActivity f3650a;

        C03641(BillShareActivity billShareActivity) {
            this.f3650a = billShareActivity;
        }

        public final void onClick(View view) {
            this.f3650a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.2 */
    class C03662 implements DialogInterface.OnClickListener {
        final /* synthetic */ BillInfoNet f3652a;
        final /* synthetic */ BillShareActivity f3653b;

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.2.1 */
        class C03651 extends ArrayList {
            final /* synthetic */ C03662 f3651a;

            C03651(C03662 c03662) {
                this.f3651a = c03662;
                add(this.f3651a.f3652a);
            }
        }

        C03662(BillShareActivity billShareActivity, BillInfoNet billInfoNet) {
            this.f3653b = billShareActivity;
            this.f3652a = billInfoNet;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("bill", new C03651(this));
            this.f3653b.setResult(ChatRoomActivity.f3781h, intent);
            this.f3653b.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.3 */
    class C03693 implements RefreshHandler {
        final /* synthetic */ BillShareActivity f3656a;

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.3.1 */
        class C03671 implements Runnable {
            final /* synthetic */ C03693 f3654a;

            C03671(C03693 c03693) {
                this.f3654a = c03693;
            }

            public final void run() {
                BillShareActivity.m2773a();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.3.2 */
        class C03682 implements Runnable {
            final /* synthetic */ C03693 f3655a;

            C03682(C03693 c03693) {
                this.f3655a = c03693;
            }

            public final void run() {
                if (this.f3655a.f3656a.f3676m.m4589a()) {
                    this.f3655a.f3656a.f3676m.m4590b();
                }
            }
        }

        C03693(BillShareActivity billShareActivity) {
            this.f3656a = billShareActivity;
        }

        public final void m2768a() {
            new Handler().post(new C03671(this));
            new Handler().postDelayed(new C03682(this), 20000);
        }

        public final boolean m2769a(View view) {
            return RefreshDefaultHandler.m4596b(view);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.4 */
    class C03734 implements C0372a {
        final /* synthetic */ BillShareActivity f3659a;

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.4.1 */
        class C03701 implements Runnable {
            final /* synthetic */ C03734 f3657a;

            static {
                fixHelper.fixfunc(new int[]{922, 923});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03701(C03734 c03734);

            public final native void run();
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.4.2 */
        class C03712 implements Runnable {
            final /* synthetic */ C03734 f3658a;

            static {
                fixHelper.fixfunc(new int[]{899, 900});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03712(C03734 c03734);

            public final native void run();
        }

        C03734(BillShareActivity billShareActivity) {
            this.f3659a = billShareActivity;
        }

        public final void m2771a() {
            new Handler().post(new C03701(this));
            new Handler().postDelayed(new C03712(this), 20000);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.5 */
    class C03745 implements OnItemClickListener {
        final /* synthetic */ BillShareActivity f3660a;

        C03745(BillShareActivity billShareActivity) {
            this.f3660a = billShareActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj = ((Object[]) this.f3660a.f3670g.get(i))[2];
            if (obj instanceof Bill) {
                new Builder(this.f3660a).setTitle(2131165514).setMessage(2131165517).setPositiveButton(2131165438, new C03789(this.f3660a, (Bill) obj)).setNegativeButton(2131165432, new C03778(this.f3660a)).show();
                return;
            }
            new Builder(this.f3660a).setTitle(2131165514).setMessage(2131165517).setPositiveButton(2131165438, new C03662(this.f3660a, (BillInfoNet) obj)).setNegativeButton(2131165432, 
            /* Method generation error in method: com.illuminate.texaspoker.activity.BillShareActivity.5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity), (wrap: com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet
  0x001d: CHECK_CAST  (r0_7 com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) = (r0_5 'obj' java.lang.Object) com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) com.illuminate.texaspoker.activity.BillShareActivity.a(com.illuminate.texaspoker.activity.BillShareActivity, com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet):void type: STATIC in method: com.illuminate.texaspoker.activity.BillShareActivity.5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:202)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:177)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:324)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:116)
	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:239)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:116)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:81)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: INVOKE  (wrap: android.support.v7.app.AlertDialog$Builder
  0x0027: INVOKE  (r0_4 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x001b: INVOKE  (r0_3 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x000f: INVOKE  (r0_2 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0008: INVOKE  (r0_1 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0002: CONSTRUCTOR  (r0_0 android.support.v7.app.AlertDialog$Builder) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity) android.support.v7.app.AlertDialog.Builder.<init>(android.content.Context):void CONSTRUCTOR), (2131165514 int) android.support.v7.app.AlertDialog.Builder.setTitle(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165517 int) android.support.v7.app.AlertDialog.Builder.setMessage(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165438 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0018: CONSTRUCTOR  (r2_0 android.content.DialogInterface$OnClickListener) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity), (wrap: com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet
  0x001d: CHECK_CAST  (r0_7 com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) = (r0_5 'obj' java.lang.Object) com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) com.illuminate.texaspoker.activity.BillShareActivity.2.<init>(com.illuminate.texaspoker.activity.BillShareActivity, com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165432 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0024: CONSTRUCTOR  (r2_1 android.content.DialogInterface$OnClickListener) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity) com.illuminate.texaspoker.activity.BillShareActivity.10.<init>(com.illuminate.texaspoker.activity.BillShareActivity):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL) android.support.v7.app.AlertDialog.Builder.show():android.support.v7.app.AlertDialog type: VIRTUAL in method: com.illuminate.texaspoker.activity.BillShareActivity.5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:721)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:580)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:219)
	... 23 more
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: INVOKE  (r0_4 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x001b: INVOKE  (r0_3 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x000f: INVOKE  (r0_2 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0008: INVOKE  (r0_1 android.support.v7.app.AlertDialog$Builder) = (wrap: android.support.v7.app.AlertDialog$Builder
  0x0002: CONSTRUCTOR  (r0_0 android.support.v7.app.AlertDialog$Builder) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity) android.support.v7.app.AlertDialog.Builder.<init>(android.content.Context):void CONSTRUCTOR), (2131165514 int) android.support.v7.app.AlertDialog.Builder.setTitle(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165517 int) android.support.v7.app.AlertDialog.Builder.setMessage(int):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165438 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0018: CONSTRUCTOR  (r2_0 android.content.DialogInterface$OnClickListener) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity), (wrap: com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet
  0x001d: CHECK_CAST  (r0_7 com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) = (r0_5 'obj' java.lang.Object) com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet) com.illuminate.texaspoker.activity.BillShareActivity.2.<init>(com.illuminate.texaspoker.activity.BillShareActivity, com.texaspoker.moment.TexasPokerHttpBill$BillInfoNet):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL), (2131165432 int), (wrap: android.content.DialogInterface$OnClickListener
  0x0024: CONSTRUCTOR  (r2_1 android.content.DialogInterface$OnClickListener) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity) com.illuminate.texaspoker.activity.BillShareActivity.10.<init>(com.illuminate.texaspoker.activity.BillShareActivity):void CONSTRUCTOR) android.support.v7.app.AlertDialog.Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener):android.support.v7.app.AlertDialog$Builder type: VIRTUAL in method: com.illuminate.texaspoker.activity.BillShareActivity.5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:84)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:595)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 27 more
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r2_1 android.content.DialogInterface$OnClickListener) = (wrap: com.illuminate.texaspoker.activity.BillShareActivity
  0x001f: IGET  (r1_3 com.illuminate.texaspoker.activity.BillShareActivity) = (r2_0 'this' com.illuminate.texaspoker.activity.BillShareActivity$5) com.illuminate.texaspoker.activity.BillShareActivity.5.a com.illuminate.texaspoker.activity.BillShareActivity) com.illuminate.texaspoker.activity.BillShareActivity.10.<init>(com.illuminate.texaspoker.activity.BillShareActivity):void CONSTRUCTOR in method: com.illuminate.texaspoker.activity.BillShareActivity.5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:638)
	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:619)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:342)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 32 more
Caused by: java.lang.NullPointerException
	at jadx.core.utils.RegionUtils.notEmpty(RegionUtils.java:135)
	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:544)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 37 more
 */
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.6 */
        class C03756 implements Runnable {
            final /* synthetic */ BillShareActivity f3661a;

            C03756(BillShareActivity billShareActivity) {
                this.f3661a = billShareActivity;
            }

            public final void run() {
                this.f3661a.m2781d();
                this.f3661a.f3676m.m4590b();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.7 */
        class C03767 implements Runnable {
            final /* synthetic */ SCGetBillInfosV2Rsp f3662a;
            final /* synthetic */ BillShareActivity f3663b;

            C03767(BillShareActivity billShareActivity, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp) {
                this.f3663b = billShareActivity;
                this.f3662a = sCGetBillInfosV2Rsp;
            }

            public final void run() {
                this.f3663b.m2777a(this.f3662a);
                this.f3663b.f3673j.m4595a();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.8 */
        class C03778 implements DialogInterface.OnClickListener {
            final /* synthetic */ BillShareActivity f3664a;

            C03778(BillShareActivity billShareActivity) {
                this.f3664a = billShareActivity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.BillShareActivity.9 */
        class C03789 implements DialogInterface.OnClickListener {
            final /* synthetic */ Bill f3665a;
            final /* synthetic */ BillShareActivity f3666b;

            C03789(BillShareActivity billShareActivity, Bill bill) {
                this.f3666b = billShareActivity;
                this.f3665a = bill;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putLong("bill_id", this.f3665a.f5643b.longValue());
                intent.putExtras(bundle);
                this.f3666b.setResult(ChatRoomActivity.f3780g, intent);
                this.f3666b.finish();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{218, 219, 220, 221, 222, 223, 224});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native void m2777a(SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp);

        private native void m2781d();

        protected final native void m2783a(String str, List<Object> list);

        protected native void onCreate(Bundle bundle);

        protected native void onResume();

        protected native void onStop();

        static void __clinit__() {
            f3667d = "BillShareActivity";
        }

        static /* synthetic */ void m2773a() {
            NetworkUtil.m4073a();
            NetworkUtil.m4134b(0, 0);
        }

        static /* synthetic */ void m2778b(BillShareActivity billShareActivity) {
            NetworkUtil.m4073a();
            NetworkUtil.m4134b(billShareActivity.f3669f, 0);
        }
    }
