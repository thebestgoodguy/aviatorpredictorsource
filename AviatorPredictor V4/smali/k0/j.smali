.class public final Lk0/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lk0/i;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    invoke-static {p1}, Lx/b;->u(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-wide v6, v2

    move-object v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_4

    invoke-static {p1}, Lx/b;->n(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Lx/b;->k(I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-static {p1, v1}, Lx/b;->t(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lx/b;->l(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lx/b;->p(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_0

    :cond_2
    sget-object v2, Lk0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Lx/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, [Lk0/a;

    goto :goto_0

    :cond_3
    invoke-static {p1, v1}, Lx/b;->q(Landroid/os/Parcel;I)J

    move-result-wide v6

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Lx/b;->j(Landroid/os/Parcel;I)V

    new-instance p1, Lk0/i;

    move-object v5, p1

    invoke-direct/range {v5 .. v10}, Lk0/i;-><init>(J[Lk0/a;IZ)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lk0/i;

    return-object p1
.end method
