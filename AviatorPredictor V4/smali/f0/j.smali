.class public final Lf0/j;
.super Lw/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw/g<",
        "Lf0/f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lw/d;Lu/c;Lu/h;)V
    .locals 7

    const/16 v3, 0x7e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lw/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILw/d;Lu/c;Lu/h;)V

    return-void
.end method


# virtual methods
.method protected final D()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START"

    return-object v0
.end method

.method public final p()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method protected final synthetic r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lf0/f;

    if-eqz v1, :cond_1

    check-cast v0, Lf0/f;

    return-object v0

    :cond_1
    new-instance v0, Lf0/e;

    invoke-direct {v0, p1}, Lf0/e;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final u()[Ls/c;
    .locals 1

    sget-object v0, Lf0/b;->d:[Ls/c;

    return-object v0
.end method
