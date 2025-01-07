package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import defpackage.ad;
import defpackage.k;
import defpackage.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes62.dex */
class BillingClientImpl extends BillingClient {
    private volatile int a;
    private final String b;
    private final Handler c;
    private volatile zzo d;
    private Context e;
    private volatile n f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private ExecutorService t;

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler a() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    static /* synthetic */ zzas a(BillingClientImpl billingClientImpl, String str) {
        k.a("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle a = k.a(billingClientImpl.l, billingClientImpl.s, billingClientImpl.b);
        String str2 = null;
        while (billingClientImpl.j) {
            try {
                Bundle a2 = billingClientImpl.f.a(6, billingClientImpl.e.getPackageName(), str, str2, a);
                BillingResult a3 = zzbi.a(a2, "BillingClient", "getPurchaseHistory()");
                if (a3 != zzbb.l) {
                    return new zzas(a3, null);
                }
                ArrayList<String> stringArrayList = a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int r8 = 0; r8 < stringArrayList2.size(); r8++) {
                    String str3 = stringArrayList2.get(r8);
                    String str4 = stringArrayList3.get(r8);
                    k.a("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(r8))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            k.b("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        k.a("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new zzas(zzbb.j, null);
                    }
                }
                str2 = a2.getString("INAPP_CONTINUATION_TOKEN");
                k.a("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzas(zzbb.l, arrayList);
                }
            } catch (RemoteException e2) {
                k.a("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                return new zzas(zzbb.m, null);
            }
        }
        k.b("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzas(zzbb.q, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final Future a(Callable callable, long j, @Nullable final Runnable runnable, Handler handler) {
        long j2 = (long) (j * 0.95d);
        if (this.t == null) {
            this.t = Executors.newFixedThreadPool(k.a, new zzal(this));
        }
        try {
            final Future submit = this.t.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    k.b("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return submit;
        } catch (Exception e) {
            k.a("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult b() {
        return (this.a == 0 || this.a == 3) ? zzbb.m : zzbb.j;
    }

    static /* synthetic */ zzbh b(BillingClientImpl billingClientImpl, String str) {
        k.a("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle a = k.a(billingClientImpl.l, billingClientImpl.s, billingClientImpl.b);
        String str2 = null;
        do {
            try {
                Bundle b = billingClientImpl.l ? billingClientImpl.f.b(9, billingClientImpl.e.getPackageName(), str, str2, a) : billingClientImpl.f.a(3, billingClientImpl.e.getPackageName(), str, str2);
                BillingResult a2 = zzbi.a(b, "BillingClient", "getPurchase()");
                if (a2 != zzbb.l) {
                    return new zzbh(a2, null);
                }
                ArrayList<String> stringArrayList = b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int r8 = 0; r8 < stringArrayList2.size(); r8++) {
                    String str3 = stringArrayList2.get(r8);
                    String str4 = stringArrayList3.get(r8);
                    k.a("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(r8))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.b())) {
                            k.b("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        k.a("BillingClient", "Got an exception trying to decode the purchase!", e);
                        return new zzbh(zzbb.j, null);
                    }
                }
                str2 = b.getString("INAPP_CONTINUATION_TOKEN");
                k.a("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e2) {
                k.a("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzbh(zzbb.m, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new zzbh(zzbb.l, arrayList);
    }

    final /* synthetic */ Bundle a(int r8, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        return this.f.a(r8, this.e.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle a(String str, Bundle bundle) {
        return this.f.c(8, this.e.getPackageName(), str, "subs", bundle);
    }

    final /* synthetic */ Bundle a(String str, String str2) {
        return this.f.a(3, this.e.getPackageName(), str, str2, (String) null);
    }

    final /* synthetic */ Object a(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.f.a(12, this.e.getPackageName(), bundle, new zzar(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    final /* synthetic */ Object a(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        BillingResult billingResult;
        try {
            Bundle b = this.f.b(9, this.e.getPackageName(), acknowledgePurchaseParams.a(), k.a(acknowledgePurchaseParams, this.b));
            int a = k.a(b, "BillingClient");
            String c = k.c(b, "BillingClient");
            BillingResult.Builder b2 = BillingResult.b();
            b2.a(a);
            b2.a(c);
            billingResult = b2.a();
        } catch (Exception e) {
            k.a("BillingClient", "Error acknowledge purchase!", e);
            billingResult = zzbb.m;
        }
        acknowledgePurchaseResponseListener.a(billingResult);
        return null;
    }

    final /* synthetic */ Object a(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        int a;
        String str;
        String a2 = consumeParams.a();
        try {
            k.a("BillingClient", "Consuming purchase with token: " + a2);
            if (this.l) {
                Bundle c = this.f.c(9, this.e.getPackageName(), a2, k.a(consumeParams, this.l, this.b));
                a = c.getInt("RESPONSE_CODE");
                str = k.c(c, "BillingClient");
            } else {
                a = this.f.a(3, this.e.getPackageName(), a2);
                str = "";
            }
            BillingResult.Builder b = BillingResult.b();
            b.a(a);
            b.a(str);
            BillingResult a3 = b.a();
            if (a == 0) {
                k.a("BillingClient", "Successfully consumed purchase.");
            } else {
                k.b("BillingClient", "Error consuming purchase with token. Response code: " + a);
            }
            consumeResponseListener.a(a3, a2);
            return null;
        } catch (Exception e) {
            k.a("BillingClient", "Error consuming purchase!", e);
            consumeResponseListener.a(zzbb.m, a2);
            return null;
        }
    }

    final /* synthetic */ Object a(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        String b = queryProductDetailsParams.b();
        ad a = queryProductDetailsParams.a();
        int size = a.size();
        int r12 = 0;
        int r4 = 0;
        while (true) {
            str = "Item is unavailable for purchase.";
            if (r4 >= size) {
                str = "";
                break;
            }
            int r9 = r4 + 20;
            ArrayList arrayList2 = new ArrayList(a.subList(r4, r9 > size ? size : r9));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int r7 = 0; r7 < size2; r7++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(r7)).a());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                Bundle a2 = this.f.a(17, this.e.getPackageName(), b, bundle, k.a(this.b, arrayList2, (String) null));
                if (a2 == null) {
                    str2 = "queryProductDetailsAsync got empty product details response.";
                    break;
                }
                if (a2.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = a2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        str2 = "queryProductDetailsAsync got null response list";
                        break;
                    }
                    for (int r5 = 0; r5 < stringArrayList.size(); r5++) {
                        try {
                            ProductDetails productDetails = new ProductDetails(stringArrayList.get(r5));
                            k.a("BillingClient", "Got product details: ".concat(productDetails.toString()));
                            arrayList.add(productDetails);
                        } catch (JSONException e) {
                            k.a("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                            str = "Error trying to decode SkuDetails.";
                            r12 = 6;
                            BillingResult.Builder b2 = BillingResult.b();
                            b2.a(r12);
                            b2.a(str);
                            productDetailsResponseListener.a(b2.a(), arrayList);
                            return null;
                        }
                    }
                    r4 = r9;
                } else {
                    r12 = k.a(a2, "BillingClient");
                    str = k.c(a2, "BillingClient");
                    if (r12 != 0) {
                        k.b("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + r12);
                    } else {
                        k.b("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                    }
                }
            } catch (Exception e2) {
                k.a("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                str = "An internal error occurred.";
            }
        }
        k.b("BillingClient", str2);
        r12 = 4;
        BillingResult.Builder b22 = BillingResult.b();
        b22.a(r12);
        b22.a(str);
        productDetailsResponseListener.a(b22.a(), arrayList);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        defpackage.k.b("BillingClient", r0);
        r0 = null;
        r4 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Object a(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.SkuDetailsResponseListener r25) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.a(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    final /* synthetic */ void a(BillingResult billingResult) {
        if (this.d.b() != null) {
            this.d.b().c(billingResult, null);
        } else {
            this.d.a();
            k.b("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }
}
