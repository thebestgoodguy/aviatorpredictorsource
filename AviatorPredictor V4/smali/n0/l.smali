.class public final Ln0/l;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln0/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final e:I

.field private final f:Ls/a;

.field private final g:Lw/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/m;

    invoke-direct {v0}, Ln0/m;-><init>()V

    sput-object v0, Ln0/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILs/a;Lw/r0;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Ln0/l;->e:I

    iput-object p2, p0, Ln0/l;->f:Ls/a;

    iput-object p3, p0, Ln0/l;->g:Lw/r0;

    return-void
.end method


# virtual methods
.method public final j0()Ls/a;
    .locals 1

    iget-object v0, p0, Ln0/l;->f:Ls/a;

    return-object v0
.end method

.method public final k0()Lw/r0;
    .locals 1

    iget-object v0, p0, Ln0/l;->g:Lw/r0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Ln0/l;->e:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-object v1, p0, Ln0/l;->f:Ls/a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Ln0/l;->g:Lw/r0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
