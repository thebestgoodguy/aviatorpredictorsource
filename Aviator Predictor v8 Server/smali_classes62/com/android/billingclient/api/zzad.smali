.class public final synthetic Lcom/android/billingclient/api/zzad;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/PurchasesResponseListener;


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/zzad;->a:Lcom/android/billingclient/api/PurchasesResponseListener;

    sget-object v1, Lcom/android/billingclient/api/zzbb;->n:Lcom/android/billingclient/api/BillingResult;

    invoke-static {}, Lad;->d()Lad;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/PurchasesResponseListener;->b(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
