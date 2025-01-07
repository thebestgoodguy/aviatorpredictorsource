.class public final Lw/f1;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/f1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field e:Landroid/os/Bundle;

.field f:[Ls/c;

.field g:I

.field h:Lw/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/g1;

    invoke-direct {v0}, Lw/g1;-><init>()V

    sput-object v0, Lw/f1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;[Ls/c;ILw/e;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lw/f1;->e:Landroid/os/Bundle;

    iput-object p2, p0, Lw/f1;->f:[Ls/c;

    iput p3, p0, Lw/f1;->g:I

    iput-object p4, p0, Lw/f1;->h:Lw/e;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lw/f1;->e:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lx/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lw/f1;->f:[Ls/c;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Lw/f1;->g:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lw/f1;->h:Lw/e;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
