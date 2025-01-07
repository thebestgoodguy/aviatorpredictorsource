.class public final Lcom/android/billingclient/api/QueryProductDetailsParams;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/android/billingclient/api/zzj;
.end annotation


# instance fields
.field private final a:Lad;


# virtual methods
.method public final a()Lad;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/QueryProductDetailsParams;->a:Lad;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/QueryProductDetailsParams;->a:Lad;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lad;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;

    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
