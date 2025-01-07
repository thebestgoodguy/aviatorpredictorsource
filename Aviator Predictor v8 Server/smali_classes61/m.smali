.class public abstract Lm;
.super Lr;

# interfaces
.implements Ln;


# direct methods
.method public static a(Landroid/os/IBinder;)Ln;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ln;

    if-eqz v1, :cond_1

    check-cast v0, Ln;

    return-object v0

    :cond_1
    new-instance v0, Ll;

    invoke-direct {v0, p0}, Ll;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
