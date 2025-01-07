.class public abstract Lw/j$a;
.super Lh0/b;
.source ""

# interfaces
.implements Lw/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public static f(Landroid/os/IBinder;)Lw/j;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lw/j;

    if-eqz v1, :cond_1

    check-cast v0, Lw/j;

    return-object v0

    :cond_1
    new-instance v0, Lw/r1;

    invoke-direct {v0, p0}, Lw/r1;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
