.class public Lcom/google/firebase/firestore/m0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/m0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/google/firebase/firestore/l0;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Lcom/google/firebase/firestore/k0;

.field private final f:Li1/u1;

.field private final g:Lcom/google/firebase/firestore/FirebaseFirestore;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/google/firebase/firestore/e0;

.field private final j:Lcom/google/firebase/firestore/p0;


# direct methods
.method constructor <init>(Lcom/google/firebase/firestore/k0;Li1/u1;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/k0;

    iput-object p1, p0, Lcom/google/firebase/firestore/m0;->e:Lcom/google/firebase/firestore/k0;

    invoke-static {p2}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/u1;

    iput-object p1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-static {p3}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p1, p0, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    new-instance p1, Lcom/google/firebase/firestore/p0;

    invoke-virtual {p2}, Li1/u1;->i()Z

    move-result p3

    invoke-virtual {p2}, Li1/u1;->j()Z

    move-result p2

    invoke-direct {p1, p3, p2}, Lcom/google/firebase/firestore/p0;-><init>(ZZ)V

    iput-object p1, p0, Lcom/google/firebase/firestore/m0;->j:Lcom/google/firebase/firestore/p0;

    return-void
.end method

.method static synthetic i(Lcom/google/firebase/firestore/m0;Ll1/i;)Lcom/google/firebase/firestore/l0;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/m0;->p(Ll1/i;)Lcom/google/firebase/firestore/l0;

    move-result-object p0

    return-object p0
.end method

.method private p(Ll1/i;)Lcom/google/firebase/firestore/l0;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1}, Li1/u1;->j()Z

    move-result v1

    iget-object v2, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v2}, Li1/u1;->f()Lc1/e;

    move-result-object v2

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc1/e;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v0, p1, v1, v2}, Lcom/google/firebase/firestore/l0;->h(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/l0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/firestore/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/m0;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v3, p1, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->e:Lcom/google/firebase/firestore/k0;

    iget-object v3, p1, Lcom/google/firebase/firestore/m0;->e:Lcom/google/firebase/firestore/k0;

    invoke-virtual {v1, v3}, Lcom/google/firebase/firestore/k0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    iget-object v3, p1, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1, v3}, Li1/u1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->j:Lcom/google/firebase/firestore/p0;

    iget-object p1, p1, Lcom/google/firebase/firestore/m0;->j:Lcom/google/firebase/firestore/p0;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/p0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->e:Lcom/google/firebase/firestore/k0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/k0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1}, Li1/u1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->j:Lcom/google/firebase/firestore/p0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/p0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/google/firebase/firestore/l0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/firestore/m0$a;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1}, Li1/u1;->e()Ll1/n;

    move-result-object v1

    invoke-virtual {v1}, Ll1/n;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/firestore/m0$a;-><init>(Lcom/google/firebase/firestore/m0;Ljava/util/Iterator;)V

    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/e0;->e:Lcom/google/firebase/firestore/e0;

    invoke-virtual {p0, v0}, Lcom/google/firebase/firestore/m0;->r(Lcom/google/firebase/firestore/e0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public r(Lcom/google/firebase/firestore/e0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/e0;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/e0;->f:Lcom/google/firebase/firestore/e0;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v0}, Li1/u1;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->i:Lcom/google/firebase/firestore/e0;

    if-eq v0, p1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->g:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-static {v0, p1, v1}, Lcom/google/firebase/firestore/c;->a(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/e0;Li1/u1;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/firestore/m0;->h:Ljava/util/List;

    iput-object p1, p0, Lcom/google/firebase/firestore/m0;->i:Lcom/google/firebase/firestore/e0;

    :cond_3
    iget-object p1, p0, Lcom/google/firebase/firestore/m0;->h:Ljava/util/List;

    return-object p1
.end method

.method public s()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1}, Li1/u1;->e()Ll1/n;

    move-result-object v1

    invoke-virtual {v1}, Ll1/n;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lcom/google/firebase/firestore/m0;->f:Li1/u1;

    invoke-virtual {v1}, Li1/u1;->e()Ll1/n;

    move-result-object v1

    invoke-virtual {v1}, Ll1/n;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/i;

    invoke-direct {p0, v2}, Lcom/google/firebase/firestore/m0;->p(Ll1/i;)Lcom/google/firebase/firestore/l0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public t()Lcom/google/firebase/firestore/p0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/m0;->j:Lcom/google/firebase/firestore/p0;

    return-object v0
.end method
