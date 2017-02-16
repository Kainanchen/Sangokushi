package com.illuminate.texaspoker.utils.p056a;

import a.does.not.Exists2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import com.ali.fixHelper;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.illuminate.texaspoker.utils.a.d */
public final class IabHelper {
    boolean f6621a;
    String f6622b;
    public boolean f6623c;
    public boolean f6624d;
    public boolean f6625e;
    boolean f6626f;
    String f6627g;
    public Context f6628h;
    public IInAppBillingService f6629i;
    public ServiceConnection f6630j;
    public int f6631k;
    public String f6632l;
    String f6633m;
    public IabHelper f6634n;

    /* renamed from: com.illuminate.texaspoker.utils.a.d.b */
    public interface IabHelper {
        void m3353a();
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.e */
    public interface IabHelper {
        void m3355a(IabResult iabResult, Inventory inventory);
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.c */
    public interface IabHelper {
        void m3357a(IabResult iabResult, Purchase purchase);
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.a */
    public interface IabHelper {
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.d */
    public interface IabHelper {
        void m3359a(IabResult iabResult);
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.1 */
    class IabHelper implements ServiceConnection {
        final /* synthetic */ IabHelper f6602a;
        final /* synthetic */ IabHelper f6603b;

        public IabHelper(IabHelper iabHelper, IabHelper iabHelper2) {
            this.f6603b = iabHelper;
            this.f6602a = iabHelper2;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f6603b.f6629i = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!this.f6603b.f6624d) {
                this.f6603b.f6629i = Stub.asInterface(iBinder);
                if (this.f6603b.f6629i != null) {
                    String packageName = this.f6603b.f6628h.getPackageName();
                    try {
                        int isBillingSupported = this.f6603b.f6629i.isBillingSupported(3, packageName, "inapp");
                        if (isBillingSupported != 0) {
                            if (this.f6602a != null) {
                                this.f6602a.m3359a(new IabResult(isBillingSupported, "Error checking for billing v3 support."));
                            }
                            this.f6603b.f6625e = false;
                            return;
                        }
                        if (this.f6603b.f6629i.isBillingSupported(3, packageName, "subs") == 0) {
                            this.f6603b.f6625e = true;
                        }
                        this.f6603b.f6623c = true;
                        if (this.f6602a != null) {
                            this.f6602a.m3359a(new IabResult(0, "Setup successful."));
                        }
                    } catch (RemoteException e) {
                        if (this.f6602a != null) {
                            this.f6602a.m3359a(new IabResult(-1001, "RemoteException while setting up in-app billing."));
                        }
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.2 */
    class IabHelper implements Runnable {
        final /* synthetic */ boolean f6607a;
        final /* synthetic */ List f6608b;
        final /* synthetic */ IabHelper f6609c;
        final /* synthetic */ Handler f6610d;
        final /* synthetic */ IabHelper f6611e;

        /* renamed from: com.illuminate.texaspoker.utils.a.d.2.1 */
        class IabHelper implements Runnable {
            final /* synthetic */ IabResult f6604a;
            final /* synthetic */ Inventory f6605b;
            final /* synthetic */ IabHelper f6606c;

            static {
                fixHelper.fixfunc(new int[]{1350, 1351});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native IabHelper(IabHelper iabHelper, IabResult iabResult, Inventory inventory);

            public final native void run();
        }

        public IabHelper(IabHelper iabHelper, List list, IabHelper iabHelper2, Handler handler) {
            this.f6611e = iabHelper;
            this.f6607a = true;
            this.f6608b = list;
            this.f6609c = iabHelper2;
            this.f6610d = handler;
        }

        public final void run() {
            IabResult iabResult = new IabResult(0, "Inventory refresh successful.");
            Inventory inventory = null;
            try {
                inventory = this.f6611e.m4218a(this.f6607a, this.f6608b);
            } catch (IabException e) {
                iabResult = e.f6601a;
            }
            this.f6611e.m4223b();
            if (!this.f6611e.f6624d && this.f6609c != null) {
                this.f6610d.post(new IabHelper(this, iabResult, inventory));
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.utils.a.d.3 */
    class IabHelper implements Runnable {
        final /* synthetic */ List f6616a;
        final /* synthetic */ IabHelper f6617b;
        final /* synthetic */ Handler f6618c;
        final /* synthetic */ IabHelper f6619d;
        final /* synthetic */ IabHelper f6620e;

        /* renamed from: com.illuminate.texaspoker.utils.a.d.3.1 */
        class IabHelper implements Runnable {
            final /* synthetic */ List f6612a;
            final /* synthetic */ IabHelper f6613b;

            IabHelper(IabHelper iabHelper, List list) {
                this.f6613b = iabHelper;
                this.f6612a = list;
            }

            public final void run() {
                this.f6613b.f6616a.get(0);
                this.f6612a.get(0);
            }
        }

        /* renamed from: com.illuminate.texaspoker.utils.a.d.3.2 */
        class IabHelper implements Runnable {
            final /* synthetic */ List f6614a;
            final /* synthetic */ IabHelper f6615b;

            IabHelper(IabHelper iabHelper, List list) {
                this.f6615b = iabHelper;
                this.f6614a = list;
            }

            public final void run() {
                this.f6615b.f6619d.m3353a();
            }
        }

        IabHelper(IabHelper iabHelper, List list, IabHelper iabHelper2, Handler handler, IabHelper iabHelper3) {
            this.f6620e = iabHelper;
            this.f6616a = list;
            this.f6617b = iabHelper2;
            this.f6618c = handler;
            this.f6619d = iabHelper3;
        }

        public final void run() {
            List arrayList = new ArrayList();
            for (Purchase purchase : this.f6616a) {
                try {
                    IabHelper iabHelper = this.f6620e;
                    iabHelper.m4219a();
                    iabHelper.m4220a("consume");
                    if (purchase.f6639a.equals("inapp")) {
                        String str = purchase.f6646h;
                        String str2 = purchase.f6642d;
                        if (str == null || str.equals(LetterIndexBar.SEARCH_ICON_LETTER)) {
                            iabHelper.m4225c("Can't consume " + str2 + ". No token.");
                            throw new IabException(-1007, "PurchaseInfo is missing token for sku: " + str2 + " " + purchase);
                        }
                        new StringBuilder("Consuming sku: ").append(str2).append(", token: ").append(str);
                        int consumePurchase = iabHelper.f6629i.consumePurchase(3, iabHelper.f6628h.getPackageName(), str);
                        if (consumePurchase != 0) {
                            new StringBuilder("Error consuming consuming sku ").append(str2).append(". ").append(IabHelper.m4215a(consumePurchase));
                            throw new IabException(consumePurchase, "Error consuming sku " + str2);
                        }
                        arrayList.add(new IabResult(0, "Successful consume of sku " + purchase.f6642d));
                    } else {
                        throw new IabException(-1010, "Items of type '" + purchase.f6639a + "' can't be consumed.");
                    }
                } catch (Exception e) {
                    throw new IabException(-1001, "Remote exception while consuming. PurchaseInfo: " + purchase, e);
                } catch (IabException e2) {
                    arrayList.add(e2.f6601a);
                }
            }
            this.f6620e.m4223b();
            if (!(this.f6620e.f6624d || this.f6617b == null)) {
                this.f6618c.post(new IabHelper(this, arrayList));
            }
            if (!this.f6620e.f6624d && this.f6619d != null) {
                this.f6618c.post(new IabHelper(this, arrayList));
            }
        }
    }

    public IabHelper(Context context, String str) {
        this.f6621a = false;
        this.f6622b = "IabHelper";
        this.f6623c = false;
        this.f6624d = false;
        this.f6625e = false;
        this.f6626f = false;
        this.f6627g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f6633m = null;
        this.f6628h = context.getApplicationContext();
        this.f6633m = str;
    }

    public final void m4219a() {
        if (this.f6624d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public final boolean m4222a(int i, int i2, Intent intent) {
        IabResult iabResult;
        if (i != this.f6631k) {
            return false;
        }
        m4219a();
        m4220a("handleActivityResult");
        m4223b();
        if (intent == null) {
            m4225c("Null data in IAB activity result.");
            iabResult = new IabResult(-1002, "Null data in IAB result");
            if (this.f6634n != null) {
                this.f6634n.m3357a(iabResult, null);
            }
            return true;
        }
        int i3;
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            m4225c("Intent with no response code, assuming OK (known issue)");
            i3 = 0;
        } else if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            i3 = (int) ((Long) obj).longValue();
        } else {
            m4225c("Unexpected type for intent response code.");
            m4225c(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && i3 == 0) {
            new StringBuilder("Extras: ").append(intent.getExtras());
            new StringBuilder("Expected item type: ").append(this.f6632l);
            if (stringExtra == null || stringExtra2 == null) {
                m4225c("BUG: either purchaseData or dataSignature is null.");
                new StringBuilder("Extras: ").append(intent.getExtras().toString());
                iabResult = new IabResult(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.f6634n != null) {
                    this.f6634n.m3357a(iabResult, null);
                }
                return true;
            }
            try {
                Purchase purchase = new Purchase(this.f6632l, stringExtra, stringExtra2);
                String str = purchase.f6642d;
                if (!Security.m4232a(this.f6633m, stringExtra, stringExtra2)) {
                    m4225c("Purchase signature verification FAILED for sku " + str);
                    IabResult iabResult2 = new IabResult(-1003, "Signature verification failed for sku " + str);
                    if (this.f6634n != null) {
                        this.f6634n.m3357a(iabResult2, purchase);
                    }
                    return true;
                } else if (this.f6634n != null) {
                    this.f6634n.m3357a(new IabResult(0, "Success"), purchase);
                }
            } catch (JSONException e) {
                m4225c("Failed to parse purchase data.");
                e.printStackTrace();
                iabResult = new IabResult(-1002, "Failed to parse purchase data.");
                if (this.f6634n != null) {
                    this.f6634n.m3357a(iabResult, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            new StringBuilder("Result code was OK but in-app billing response was not OK: ").append(IabHelper.m4215a(i3));
            if (this.f6634n != null) {
                this.f6634n.m3357a(new IabResult(i3, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            new StringBuilder("Purchase canceled - Response: ").append(IabHelper.m4215a(i3));
            iabResult = new IabResult(-1005, "User canceled.");
            if (this.f6634n != null) {
                this.f6634n.m3357a(iabResult, null);
            }
        } else {
            m4225c("Purchase failed. Result code: " + Integer.toString(i2) + ". Response: " + IabHelper.m4215a(i3));
            iabResult = new IabResult(-1006, "Unknown purchase response.");
            if (this.f6634n != null) {
                this.f6634n.m3357a(iabResult, null);
            }
        }
        return true;
    }

    public final Inventory m4218a(boolean z, List<String> list) {
        m4219a();
        m4220a("queryInventory");
        try {
            Inventory inventory = new Inventory();
            int a = m4213a(inventory, "inapp");
            if (a != 0) {
                throw new IabException(a, "Error refreshing inventory (querying owned items).");
            }
            if (z) {
                a = m4214a("inapp", inventory, (List) list);
                if (a != 0) {
                    throw new IabException(a, "Error refreshing inventory (querying prices of items).");
                }
            }
            if (this.f6625e) {
                a = m4213a(inventory, "subs");
                if (a != 0) {
                    throw new IabException(a, "Error refreshing inventory (querying owned subscriptions).");
                } else if (z) {
                    a = m4214a("subs", inventory, (List) list);
                    if (a != 0) {
                        throw new IabException(a, "Error refreshing inventory (querying prices of subscriptions).");
                    }
                }
            }
            return inventory;
        } catch (Exception e) {
            throw new IabException(-1001, "Remote exception while refreshing inventory.", e);
        } catch (Exception e2) {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        }
    }

    public static String m4215a(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= NotificationManagerCompat.IMPORTANCE_UNSPECIFIED) {
            int i2 = -1000 - i;
            if (i2 < 0 || i2 >= split2.length) {
                return String.valueOf(i) + ":Unknown IAB Helper Error";
            }
            return split2[i2];
        } else if (i < 0 || i >= split.length) {
            return String.valueOf(i) + ":Unknown";
        } else {
            return split[i];
        }
    }

    public final void m4220a(String str) {
        if (!this.f6623c) {
            m4225c("Illegal state for operation (" + str + "): IAB helper is not set up.");
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
        }
    }

    public final int m4217a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        m4225c("Unexpected type for bundle response code.");
        m4225c(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
    }

    public final void m4224b(String str) {
        if (this.f6626f) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.f6627g + ") is in progress.");
        }
        this.f6627g = str;
        this.f6626f = true;
    }

    public final void m4223b() {
        new StringBuilder("Ending async operation: ").append(this.f6627g);
        this.f6627g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f6626f = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m4213a(com.illuminate.texaspoker.utils.p056a.Inventory r11, java.lang.String r12) {
        /*
        r10 = this;
        r3 = 0;
        r0 = new java.lang.StringBuilder;
        r1 = "Package name: ";
        r0.<init>(r1);
        r1 = r10.f6628h;
        r1 = r1.getPackageName();
        r0.append(r1);
        r0 = 0;
        r1 = r0;
        r0 = r3;
    L_0x0014:
        r2 = r10.f6629i;
        r4 = 3;
        r5 = r10.f6628h;
        r5 = r5.getPackageName();
        r5 = r2.getPurchases(r4, r5, r12, r1);
        r1 = r10.m4217a(r5);
        r2 = new java.lang.StringBuilder;
        r4 = "Owned items response: ";
        r2.<init>(r4);
        r4 = java.lang.String.valueOf(r1);
        r2.append(r4);
        if (r1 == 0) goto L_0x0045;
    L_0x0035:
        r0 = new java.lang.StringBuilder;
        r2 = "getPurchases() failed: ";
        r0.<init>(r2);
        r2 = com.illuminate.texaspoker.utils.p056a.IabHelper.m4215a(r1);
        r0.append(r2);
        r3 = r1;
    L_0x0044:
        return r3;
    L_0x0045:
        r1 = "INAPP_PURCHASE_ITEM_LIST";
        r1 = r5.containsKey(r1);
        if (r1 == 0) goto L_0x005d;
    L_0x004d:
        r1 = "INAPP_PURCHASE_DATA_LIST";
        r1 = r5.containsKey(r1);
        if (r1 == 0) goto L_0x005d;
    L_0x0055:
        r1 = "INAPP_DATA_SIGNATURE_LIST";
        r1 = r5.containsKey(r1);
        if (r1 != 0) goto L_0x0065;
    L_0x005d:
        r0 = "Bundle returned from getPurchases() doesn't contain required fields.";
        r10.m4225c(r0);
        r3 = -1002; // 0xfffffffffffffc16 float:NaN double:NaN;
        goto L_0x0044;
    L_0x0065:
        r1 = "INAPP_PURCHASE_ITEM_LIST";
        r6 = r5.getStringArrayList(r1);
        r1 = "INAPP_PURCHASE_DATA_LIST";
        r7 = r5.getStringArrayList(r1);
        r1 = "INAPP_DATA_SIGNATURE_LIST";
        r8 = r5.getStringArrayList(r1);
        r2 = r3;
        r4 = r0;
    L_0x0079:
        r0 = r7.size();
        if (r2 >= r0) goto L_0x00bc;
    L_0x007f:
        r0 = r7.get(r2);
        r0 = (java.lang.String) r0;
        r1 = r8.get(r2);
        r1 = (java.lang.String) r1;
        r6.get(r2);
        r9 = r10.f6633m;
        r9 = com.illuminate.texaspoker.utils.p056a.Security.m4232a(r9, r0, r1);
        if (r9 == 0) goto L_0x00b5;
    L_0x0096:
        r9 = new com.illuminate.texaspoker.utils.a.g;
        r9.<init>(r12, r0, r1);
        r0 = r9.f6646h;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a8;
    L_0x00a3:
        r0 = "BUG: empty/null token!";
        r10.m4216d(r0);
    L_0x00a8:
        r0 = r11.f6638b;
        r1 = r9.f6642d;
        r0.put(r1, r9);
        r1 = r4;
    L_0x00b0:
        r0 = r2 + 1;
        r2 = r0;
        r4 = r1;
        goto L_0x0079;
    L_0x00b5:
        r0 = "Purchase signature verification **FAILED**. Not adding item.";
        r10.m4216d(r0);
        r1 = 1;
        goto L_0x00b0;
    L_0x00bc:
        r0 = "INAPP_CONTINUATION_TOKEN";
        r0 = r5.getString(r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x00ce;
    L_0x00c8:
        if (r4 == 0) goto L_0x0044;
    L_0x00ca:
        r3 = -1003; // 0xfffffffffffffc15 float:NaN double:NaN;
        goto L_0x0044;
    L_0x00ce:
        r1 = r0;
        r0 = r4;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.utils.a.d.a(com.illuminate.texaspoker.utils.a.f, java.lang.String):int");
    }

    private int m4214a(String str, Inventory inventory, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(inventory.m4230c(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        bundle = this.f6629i.getSkuDetails(3, this.f6628h.getPackageName(), str, bundle);
        if (bundle.containsKey("DETAILS_LIST")) {
            Iterator it = bundle.getStringArrayList("DETAILS_LIST").iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = new SkuDetails(str, (String) it.next());
                new StringBuilder("Got sku details: ").append(skuDetails);
                inventory.f6637a.put(skuDetails.f6650b, skuDetails);
            }
            return 0;
        }
        int a = m4217a(bundle);
        if (a != 0) {
            new StringBuilder("getSkuDetails() failed: ").append(IabHelper.m4215a(a));
            return a;
        }
        m4225c("getSkuDetails() returned a bundle with neither an error nor a detail list.");
        return -1002;
    }

    public final void m4221a(List<Purchase> list, IabHelper iabHelper, IabHelper iabHelper2) {
        Handler handler = new Handler();
        m4224b("consume");
        new Thread(new IabHelper(this, list, iabHelper, handler, iabHelper2)).start();
    }

    public final void m4225c(String str) {
        Log.e(this.f6622b, "In-app billing error: " + str);
    }

    private void m4216d(String str) {
        Log.w(this.f6622b, "In-app billing warning: " + str);
    }
}
