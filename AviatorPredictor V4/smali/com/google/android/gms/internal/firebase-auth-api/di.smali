.class public final Lcom/google/android/gms/internal/firebase-auth-api/di;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 6

    invoke-static {p1}, Lx/b;->u(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_2

    invoke-static {p1}, Lx/b;->n(Landroid/os/Parcel;)I

    move-result v3

    invoke-static {v3}, Lx/b;->k(I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    invoke-static {p1, v3}, Lx/b;->t(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v3}, Lx/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {p1, v3}, Lx/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Lx/b;->j(Landroid/os/Parcel;I)V

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/ci;

    invoke-direct {p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ci;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/internal/firebase-auth-api/ci;

    return-object p1
.end method
