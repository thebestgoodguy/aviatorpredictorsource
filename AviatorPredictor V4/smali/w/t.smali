.class public Lw/t;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:I

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/y0;

    invoke-direct {v0}, Lw/y0;-><init>()V

    sput-object v0, Lw/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Lw/t;->e:I

    iput-boolean p2, p0, Lw/t;->f:Z

    iput-boolean p3, p0, Lw/t;->g:Z

    iput p4, p0, Lw/t;->h:I

    iput p5, p0, Lw/t;->i:I

    return-void
.end method


# virtual methods
.method public j0()I
    .locals 1

    iget v0, p0, Lw/t;->h:I

    return v0
.end method

.method public k0()I
    .locals 1

    iget v0, p0, Lw/t;->i:I

    return v0
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lw/t;->f:Z

    return v0
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lw/t;->g:Z

    return v0
.end method

.method public n0()I
    .locals 1

    iget v0, p0, Lw/t;->e:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lw/t;->n0()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lx/c;->h(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw/t;->l0()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw/t;->m0()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw/t;->j0()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lx/c;->h(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw/t;->k0()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lx/c;->h(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
