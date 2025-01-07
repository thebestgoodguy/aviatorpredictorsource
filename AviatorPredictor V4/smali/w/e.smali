.class public Lw/e;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lw/t;

.field private final f:Z

.field private final g:Z

.field private final h:[I

.field private final i:I

.field private final j:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/h1;

    invoke-direct {v0}, Lw/h1;-><init>()V

    sput-object v0, Lw/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lw/t;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lw/e;->e:Lw/t;

    iput-boolean p2, p0, Lw/e;->f:Z

    iput-boolean p3, p0, Lw/e;->g:Z

    iput-object p4, p0, Lw/e;->h:[I

    iput p5, p0, Lw/e;->i:I

    iput-object p6, p0, Lw/e;->j:[I

    return-void
.end method


# virtual methods
.method public j0()I
    .locals 1

    iget v0, p0, Lw/e;->i:I

    return v0
.end method

.method public k0()[I
    .locals 1

    iget-object v0, p0, Lw/e;->h:[I

    return-object v0
.end method

.method public l0()[I
    .locals 1

    iget-object v0, p0, Lw/e;->j:[I

    return-object v0
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lw/e;->f:Z

    return v0
.end method

.method public n0()Z
    .locals 1

    iget-boolean v0, p0, Lw/e;->g:Z

    return v0
.end method

.method public final o0()Lw/t;
    .locals 1

    iget-object v0, p0, Lw/e;->e:Lw/t;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lw/e;->e:Lw/t;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw/e;->m0()Z

    move-result p2

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw/e;->n0()Z

    move-result p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw/e;->k0()[I

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Lx/c;->i(Landroid/os/Parcel;I[IZ)V

    invoke-virtual {p0}, Lw/e;->j0()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lx/c;->h(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw/e;->l0()[I

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Lx/c;->i(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
