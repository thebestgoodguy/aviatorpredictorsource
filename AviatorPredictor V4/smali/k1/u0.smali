.class final Lk1/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/f1;


# instance fields
.field private a:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lk1/l;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v0

    iput-object v0, p0, Lk1/u0;->a:Lc1/c;

    return-void
.end method


# virtual methods
.method public a(Lk1/l;)V
    .locals 0

    iput-object p1, p0, Lk1/u0;->b:Lk1/l;

    return-void
.end method

.method public b(Ljava/lang/String;Ll1/q$a;I)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ll1/q$a;",
            "I)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getAll(String, IndexOffset, int) is not supported."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ll1/l;)Ll1/s;
    .locals 1

    iget-object v0, p0, Lk1/u0;->a:Lc1/c;

    invoke-virtual {v0, p1}, Lc1/c;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll1/i;->a()Ll1/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll1/s;->q(Ll1/l;)Ll1/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public d(Ll1/s;Ll1/w;)V
    .locals 5

    iget-object v0, p0, Lk1/u0;->b:Lk1/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "setIndexManager() not called"

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ll1/w;->f:Ll1/w;

    invoke-virtual {p2, v0}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Cannot add document to the RemoteDocumentCache with a read time of zero"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lk1/u0;->a:Lc1/c;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v1

    invoke-virtual {p1}, Ll1/s;->a()Ll1/s;

    move-result-object v2

    invoke-virtual {v2, p2}, Ll1/s;->v(Ll1/w;)Ll1/s;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object p2

    iput-object p2, p0, Lk1/u0;->a:Lc1/c;

    iget-object p2, p0, Lk1/u0;->b:Lk1/l;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p1}, Ll1/l;->r()Ll1/u;

    move-result-object p1

    invoke-interface {p2, p1}, Lk1/l;->j(Ll1/u;)V

    return-void
.end method

.method public e(Ll1/u;Ll1/q$a;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/u;",
            "Ll1/q$a;",
            ")",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, ""

    invoke-virtual {p1, v1}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object v1

    check-cast v1, Ll1/u;

    invoke-static {v1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object v1

    iget-object v2, p0, Lk1/u0;->a:Lc1/c;

    invoke-virtual {v2, v1}, Lc1/c;->u(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/i;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-virtual {v2}, Ll1/l;->t()Ll1/u;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll1/e;->r(Ll1/e;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ll1/l;->t()Ll1/u;

    move-result-object v2

    invoke-virtual {v2}, Ll1/e;->s()I

    move-result v2

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    if-le v2, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Ll1/q$a;->k(Ll1/i;)Ll1/q$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Ll1/q$a;->g(Ll1/q$a;)I

    move-result v2

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    invoke-interface {v3}, Ll1/i;->a()Ll1/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public f(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ll1/l;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    invoke-virtual {p0, v1}, Lk1/u0;->c(Ll1/l;)Ll1/s;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/u0;->b:Lk1/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setIndexManager() not called"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    iget-object v2, p0, Lk1/u0;->a:Lc1/c;

    invoke-virtual {v2, v1}, Lc1/c;->v(Ljava/lang/Object;)Lc1/c;

    move-result-object v2

    iput-object v2, p0, Lk1/u0;->a:Lc1/c;

    sget-object v2, Ll1/w;->f:Ll1/w;

    invoke-static {v1, v2}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lk1/u0;->b:Lk1/l;

    invoke-interface {p1, v0}, Lk1/l;->f(Lc1/c;)V

    return-void
.end method
