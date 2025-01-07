.class final Lcom/android/billingclient/api/zzo;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/android/billingclient/api/zzn;


# virtual methods
.method final a()Lcom/android/billingclient/api/zzbe;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/zzo;->a:Lcom/android/billingclient/api/zzn;

    invoke-static {v0}, Lcom/android/billingclient/api/zzn;->a(Lcom/android/billingclient/api/zzn;)Lcom/android/billingclient/api/zzbe;

    const/4 v0, 0x0

    return-object v0
.end method

.method final b()Lcom/android/billingclient/api/PurchasesUpdatedListener;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/zzo;->a:Lcom/android/billingclient/api/zzn;

    invoke-static {v0}, Lcom/android/billingclient/api/zzn;->b(Lcom/android/billingclient/api/zzn;)Lcom/android/billingclient/api/PurchasesUpdatedListener;

    move-result-object v0

    return-object v0
.end method
