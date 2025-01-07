.class public final Ly/a;
.super Lg0/a;
.source ""


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-direct {p0, p1, v0}, Lg0/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final w(Lw/v;)V
    .locals 1

    invoke-virtual {p0}, Lg0/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lg0/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lg0/a;->h(ILandroid/os/Parcel;)V

    return-void
.end method
