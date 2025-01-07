.class public final Lw/r0;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/r0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final e:I

.field final f:Landroid/os/IBinder;

.field private final g:Ls/a;

.field private final h:Z

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/s0;

    invoke-direct {v0}, Lw/s0;-><init>()V

    sput-object v0, Lw/r0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Ls/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Lw/r0;->e:I

    iput-object p2, p0, Lw/r0;->f:Landroid/os/IBinder;

    iput-object p3, p0, Lw/r0;->g:Ls/a;

    iput-boolean p4, p0, Lw/r0;->h:Z

    iput-boolean p5, p0, Lw/r0;->i:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lw/r0;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lw/r0;

    iget-object v2, p0, Lw/r0;->g:Ls/a;

    iget-object v3, p1, Lw/r0;->g:Ls/a;

    invoke-virtual {v2, v3}, Ls/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lw/r0;->k0()Lw/j;

    move-result-object v2

    invoke-virtual {p1}, Lw/r0;->k0()Lw/j;

    move-result-object p1

    invoke-static {v2, p1}, Lw/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final j0()Ls/a;
    .locals 1

    iget-object v0, p0, Lw/r0;->g:Ls/a;

    return-object v0
.end method

.method public final k0()Lw/j;
    .locals 1

    iget-object v0, p0, Lw/r0;->f:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lw/j$a;->f(Landroid/os/IBinder;)Lw/j;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lw/r0;->e:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lw/r0;->f:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lx/c;->g(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lw/r0;->g:Ls/a;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean p2, p0, Lw/r0;->h:Z

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Lw/r0;->i:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
