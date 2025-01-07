.class public final La1/j;
.super Lcom/google/firebase/auth/k0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La1/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/k;

    invoke-direct {v0}, La1/k;-><init>()V

    sput-object v0, La1/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/k0;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/k0;-><init>()V

    iput-object p1, p0, La1/j;->e:Ljava/lang/String;

    iput-object p2, p0, La1/j;->f:Ljava/lang/String;

    iput-object p3, p0, La1/j;->g:Ljava/util/List;

    return-void
.end method

.method public static j0(Ljava/lang/String;)La1/j;
    .locals 1

    invoke-static {p0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, La1/j;

    invoke-direct {v0}, La1/j;-><init>()V

    iput-object p0, v0, La1/j;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static k0(Ljava/util/List;Ljava/lang/String;)La1/j;
    .locals 3

    invoke-static {p0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, La1/j;

    invoke-direct {v0}, La1/j;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, La1/j;->g:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/i0;

    instance-of v2, v1, Lcom/google/firebase/auth/s0;

    if-eqz v2, :cond_0

    iget-object v2, v0, La1/j;->g:Ljava/util/List;

    check-cast v1, Lcom/google/firebase/auth/s0;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object p1, v0, La1/j;->f:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final l0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/j;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final m0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/j;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final n0()Z
    .locals 1

    iget-object v0, p0, La1/j;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, La1/j;->e:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, La1/j;->f:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, La1/j;->g:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Lx/c;->q(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
