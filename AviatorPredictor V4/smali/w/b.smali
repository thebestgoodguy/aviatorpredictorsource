.class public Lw/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;)Lt/b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lt/i;

    invoke-direct {v0, p0}, Lt/i;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    new-instance v0, Lt/b;

    invoke-direct {v0, p0}, Lt/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
