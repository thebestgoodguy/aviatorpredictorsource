.class public final Lf0/e;
.super Lf0/c;
.source ""

# interfaces
.implements Lf0/f;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"

    invoke-direct {p0, p1, v0}, Lf0/c;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final l(Lf0/h;)V
    .locals 1

    invoke-virtual {p0}, Lf0/c;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lf0/d;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lf0/c;->f(ILandroid/os/Parcel;)V

    return-void
.end method
