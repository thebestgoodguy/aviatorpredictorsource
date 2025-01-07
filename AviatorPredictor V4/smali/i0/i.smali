.class public final Li0/i;
.super Li0/a;
.source ""

# interfaces
.implements Li0/h;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.safetynet.internal.ISafetyNetService"

    invoke-direct {p0, p1, v0}, Li0/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final s(Li0/f;[BLjava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Li0/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Li0/c;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Li0/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method
