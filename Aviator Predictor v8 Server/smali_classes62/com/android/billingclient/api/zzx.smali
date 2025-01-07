.class public final synthetic Lcom/android/billingclient/api/zzx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/PriceChangeConfirmationListener;

.field public final synthetic b:Lcom/android/billingclient/api/BillingResult;


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/zzx;->a:Lcom/android/billingclient/api/PriceChangeConfirmationListener;

    iget-object v1, p0, Lcom/android/billingclient/api/zzx;->b:Lcom/android/billingclient/api/BillingResult;

    invoke-interface {v0, v1}, Lcom/android/billingclient/api/PriceChangeConfirmationListener;->c(Lcom/android/billingclient/api/BillingResult;)V

    return-void
.end method
