.class public final Ln0/g;
.super Lg0/a;
.source ""


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lg0/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final w(Ln0/j;Ln0/f;)V
    .locals 1

    invoke-virtual {p0}, Lg0/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lg0/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lg0/c;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lg0/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method
