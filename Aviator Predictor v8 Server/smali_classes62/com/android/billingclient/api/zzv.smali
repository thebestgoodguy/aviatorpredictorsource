.class public final synthetic Lcom/android/billingclient/api/zzv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/ConsumeResponseListener;

.field public final synthetic b:Lcom/android/billingclient/api/ConsumeParams;


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/zzv;->a:Lcom/android/billingclient/api/ConsumeResponseListener;

    iget-object v1, p0, Lcom/android/billingclient/api/zzv;->b:Lcom/android/billingclient/api/ConsumeParams;

    sget-object v2, Lcom/android/billingclient/api/zzbb;->n:Lcom/android/billingclient/api/BillingResult;

    invoke-virtual {v1}, Lcom/android/billingclient/api/ConsumeParams;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/android/billingclient/api/ConsumeResponseListener;->a(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    return-void
.end method
