.class public final synthetic Lcom/android/billingclient/api/zzaa;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/SkuDetailsResponseListener;


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/zzaa;->a:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    sget-object v1, Lcom/android/billingclient/api/zzbb;->n:Lcom/android/billingclient/api/BillingResult;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->d(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
