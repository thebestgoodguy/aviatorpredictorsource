.class public final Ly/e;
.super Lw/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw/g<",
        "Ly/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final I:Lw/y;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lw/d;Lw/y;Lu/c;Lu/h;)V
    .locals 7

    const/16 v3, 0x10e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lw/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILw/d;Lu/c;Lu/h;)V

    iput-object p4, p0, Ly/e;->I:Lw/y;

    return-void
.end method


# virtual methods
.method protected final D()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.telemetry.service.START"

    return-object v0
.end method

.method protected final H()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final p()I
    .locals 1

    const v0, 0xc1fa340

    return v0
.end method

.method protected final synthetic r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ly/a;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Ly/a;

    goto :goto_0

    :cond_1
    new-instance v0, Ly/a;

    invoke-direct {v0, p1}, Ly/a;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final u()[Ls/c;
    .locals 1

    sget-object v0, Lg0/d;->b:[Ls/c;

    return-object v0
.end method

.method protected final z()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ly/e;->I:Lw/y;

    invoke-virtual {v0}, Lw/y;->d()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
