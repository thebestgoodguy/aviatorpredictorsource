.class final Lcom/android/billingclient/api/zzah;
.super Landroid/os/ResultReceiver;


# instance fields
.field final synthetic a:Lcom/android/billingclient/api/PriceChangeConfirmationListener;


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->b()Lcom/android/billingclient/api/BillingResult$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingResult$Builder;->a(I)Lcom/android/billingclient/api/BillingResult$Builder;

    const-string p1, "BillingClient"

    invoke-static {p2, p1}, Lk;->c(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingResult$Builder;->a(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$Builder;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingResult$Builder;->a()Lcom/android/billingclient/api/BillingResult;

    move-result-object p1

    iget-object p2, p0, Lcom/android/billingclient/api/zzah;->a:Lcom/android/billingclient/api/PriceChangeConfirmationListener;

    invoke-interface {p2, p1}, Lcom/android/billingclient/api/PriceChangeConfirmationListener;->c(Lcom/android/billingclient/api/BillingResult;)V

    return-void
.end method
