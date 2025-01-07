.class final Lcom/android/billingclient/api/zzn;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field private final a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

.field private final b:Lcom/android/billingclient/api/zzbe;

.field private final c:Lcom/android/billingclient/api/zzc;


# direct methods
.method static bridge synthetic a(Lcom/android/billingclient/api/zzn;)Lcom/android/billingclient/api/zzbe;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/zzn;->b:Lcom/android/billingclient/api/zzbe;

    const/4 p0, 0x0

    return-object p0
.end method

.method static bridge synthetic b(Lcom/android/billingclient/api/zzn;)Lcom/android/billingclient/api/PurchasesUpdatedListener;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    return-object p0
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string p1, "BillingBroadcastManager"

    invoke-static {p2, p1}, Lk;->b(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lk;->a(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    invoke-interface {p2, v0, p1}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :cond_0
    const-string v2, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingResult;->a()I

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    invoke-static {}, Lad;->d()Lad;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/android/billingclient/api/zzn;->c:Lcom/android/billingclient/api/zzc;

    if-nez v0, :cond_2

    const-string p2, "AlternativeBillingListener is null."

    invoke-static {p1, p2}, Lk;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    sget-object p2, Lcom/android/billingclient/api/zzbb;->j:Lcom/android/billingclient/api/BillingResult;

    invoke-static {}, Lad;->d()Lad;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :cond_2
    if-nez p2, :cond_3

    const-string p2, "Bundle is null."

    invoke-static {p1, p2}, Lk;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    sget-object p2, Lcom/android/billingclient/api/zzbb;->j:Lcom/android/billingclient/api/BillingResult;

    invoke-static {}, Lad;->d()Lad;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :cond_3
    const-string v0, "ALTERNATIVE_BILLING_USER_CHOICE_DATA"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "products"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_5

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_4

    new-instance v5, Lcom/android/billingclient/api/zze;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Lcom/android/billingclient/api/zze;-><init>(Lorg/json/JSONObject;Lcom/android/billingclient/api/zzd;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->c:Lcom/android/billingclient/api/zzc;

    invoke-interface {p1}, Lcom/android/billingclient/api/zzc;->a()V

    return-void

    :catch_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const-string p2, "Error when parsing invalid alternative choice data: [%s]"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lk;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    sget-object p2, Lcom/android/billingclient/api/zzbb;->j:Lcom/android/billingclient/api/BillingResult;

    invoke-static {}, Lad;->d()Lad;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :cond_6
    const-string p2, "Couldn\'t find alternative billing user choice data in bundle."

    invoke-static {p1, p2}, Lk;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/zzn;->a:Lcom/android/billingclient/api/PurchasesUpdatedListener;

    sget-object p2, Lcom/android/billingclient/api/zzbb;->j:Lcom/android/billingclient/api/BillingResult;

    invoke-static {}, Lad;->d()Lad;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/android/billingclient/api/PurchasesUpdatedListener;->c(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    :cond_7
    return-void
.end method
