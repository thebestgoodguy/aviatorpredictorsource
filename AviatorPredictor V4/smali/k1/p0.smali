.class Lk1/p0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/d1;


# instance fields
.field private a:Lk1/e1;

.field private final b:Lk1/t0;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lk1/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/p0;->b:Lk1/t0;

    return-void
.end method

.method private b(Ll1/l;)Z
    .locals 2

    iget-object v0, p0, Lk1/p0;->b:Lk1/t0;

    invoke-virtual {v0}, Lk1/t0;->r()Lk1/v0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk1/v0;->k(Ll1/l;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lk1/p0;->c(Ll1/l;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lk1/p0;->a:Lk1/e1;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lk1/e1;->c(Ll1/l;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private c(Ll1/l;)Z
    .locals 2

    iget-object v0, p0, Lk1/p0;->b:Lk1/t0;

    invoke-virtual {v0}, Lk1/t0;->p()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/r0;

    invoke-virtual {v1, p1}, Lk1/r0;->m(Ll1/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a(Ll1/l;)V
    .locals 1

    iget-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Lk1/b4;)V
    .locals 4

    iget-object v0, p0, Lk1/p0;->b:Lk1/t0;

    invoke-virtual {v0}, Lk1/t0;->r()Lk1/v0;

    move-result-object v0

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lk1/v0;->b(I)Lc1/e;

    move-result-object v1

    invoke-virtual {v1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    iget-object v3, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lk1/v0;->l(Lk1/b4;)V

    return-void
.end method

.method public f(Ll1/l;)V
    .locals 1

    iget-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public i()V
    .locals 5

    iget-object v0, p0, Lk1/p0;->b:Lk1/t0;

    invoke-virtual {v0}, Lk1/t0;->q()Lk1/u0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-direct {p0, v3}, Lk1/p0;->b(Ll1/l;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lk1/u0;->removeAll(Ljava/util/Collection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    return-void
.end method

.method public j(Lk1/e1;)V
    .locals 0

    iput-object p1, p0, Lk1/p0;->a:Lk1/e1;

    return-void
.end method

.method public k(Ll1/l;)V
    .locals 1

    iget-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n()V
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    return-void
.end method

.method public p(Ll1/l;)V
    .locals 1

    invoke-direct {p0, p1}, Lk1/p0;->b(Ll1/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk1/p0;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method
