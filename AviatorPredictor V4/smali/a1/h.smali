.class public final La1/h;
.super Lcom/google/firebase/auth/j0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La1/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Ljava/util/List;

.field private final f:La1/j;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/google/firebase/auth/n1;

.field private final i:La1/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/i;

    invoke-direct {v0}, La1/i;-><init>()V

    sput-object v0, La1/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;La1/j;Ljava/lang/String;Lcom/google/firebase/auth/n1;La1/m1;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/firebase/auth/j0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La1/h;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i0;

    instance-of v1, v0, Lcom/google/firebase/auth/s0;

    if-eqz v1, :cond_0

    iget-object v1, p0, La1/h;->e:Ljava/util/List;

    check-cast v0, Lcom/google/firebase/auth/s0;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/j;

    iput-object p1, p0, La1/h;->f:La1/j;

    invoke-static {p3}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La1/h;->g:Ljava/lang/String;

    iput-object p4, p0, La1/h;->h:Lcom/google/firebase/auth/n1;

    iput-object p5, p0, La1/h;->i:La1/m1;

    return-void
.end method

.method static bridge synthetic m0(La1/h;)Lcom/google/firebase/auth/n1;
    .locals 0

    iget-object p0, p0, La1/h;->h:Lcom/google/firebase/auth/n1;

    return-object p0
.end method


# virtual methods
.method public final j0()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/i0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La1/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/s0;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final k0()Lcom/google/firebase/auth/k0;
    .locals 1

    iget-object v0, p0, La1/h;->f:La1/j;

    return-object v0
.end method

.method public final l0(Lcom/google/firebase/auth/h0;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/h0;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/h;->g:Ljava/lang/String;

    invoke-static {v0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    iget-object v1, p0, La1/h;->f:La1/j;

    iget-object v2, p0, La1/h;->i:La1/m1;

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->a0(Lcom/google/firebase/auth/h0;La1/j;Lcom/google/firebase/auth/z;)Lo0/h;

    move-result-object p1

    new-instance v0, La1/g;

    invoke-direct {v0, p0}, La1/g;-><init>(La1/h;)V

    invoke-virtual {p1, v0}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La1/h;->e:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lx/c;->q(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La1/h;->f:La1/j;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/h;->g:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La1/h;->h:Lcom/google/firebase/auth/n1;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/h;->i:La1/m1;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
