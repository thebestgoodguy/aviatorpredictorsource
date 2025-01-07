.class public abstract Lm1/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/l;

.field private final b:Lm1/m;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm1/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ll1/l;Lm1/m;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lm1/f;-><init>(Ll1/l;Lm1/m;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Ll1/l;Lm1/m;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            "Lm1/m;",
            "Ljava/util/List<",
            "Lm1/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/f;->a:Ll1/l;

    iput-object p2, p0, Lm1/f;->b:Lm1/m;

    iput-object p3, p0, Lm1/f;->c:Ljava/util/List;

    return-void
.end method

.method public static c(Ll1/s;Lm1/d;)Lm1/f;
    .locals 6

    invoke-virtual {p0}, Ll1/s;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lm1/d;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    if-nez p1, :cond_2

    invoke-virtual {p0}, Ll1/s;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lm1/c;

    invoke-virtual {p0}, Ll1/s;->getKey()Ll1/l;

    move-result-object p0

    sget-object v0, Lm1/m;->c:Lm1/m;

    invoke-direct {p1, p0, v0}, Lm1/c;-><init>(Ll1/l;Lm1/m;)V

    return-object p1

    :cond_1
    new-instance p1, Lm1/o;

    invoke-virtual {p0}, Ll1/s;->getKey()Ll1/l;

    move-result-object v0

    invoke-virtual {p0}, Ll1/s;->k()Ll1/t;

    move-result-object p0

    sget-object v1, Lm1/m;->c:Lm1/m;

    invoke-direct {p1, v0, p0, v1}, Lm1/o;-><init>(Ll1/l;Ll1/t;Lm1/m;)V

    return-object p1

    :cond_2
    invoke-virtual {p0}, Ll1/s;->k()Ll1/t;

    move-result-object v0

    new-instance v1, Ll1/t;

    invoke-direct {v1}, Ll1/t;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lm1/d;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/r;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v0, v3}, Ll1/t;->h(Ll1/r;)Lx1/x;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, Ll1/e;->s()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_4

    invoke-virtual {v3}, Ll1/e;->u()Ll1/e;

    move-result-object v3

    check-cast v3, Ll1/r;

    :cond_4
    invoke-virtual {v0, v3}, Ll1/t;->h(Ll1/r;)Lx1/x;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ll1/t;->l(Ll1/r;Lx1/x;)V

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    new-instance p1, Lm1/l;

    invoke-virtual {p0}, Ll1/s;->getKey()Ll1/l;

    move-result-object p0

    invoke-static {v2}, Lm1/d;->b(Ljava/util/Set;)Lm1/d;

    move-result-object v0

    sget-object v2, Lm1/m;->c:Lm1/m;

    invoke-direct {p1, p0, v1, v0, v2}, Lm1/l;-><init>(Ll1/l;Ll1/t;Lm1/d;Lm1/m;)V

    return-object p1

    :cond_6
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract a(Ll1/s;Lm1/d;Lx0/o;)Lm1/d;
.end method

.method public abstract b(Ll1/s;Lm1/i;)V
.end method

.method public d(Ll1/i;)Ll1/t;
    .locals 5

    iget-object v0, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->a()Ll1/r;

    move-result-object v3

    invoke-interface {p1, v3}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object v3

    invoke-virtual {v2}, Lm1/e;->b()Lm1/p;

    move-result-object v4

    invoke-interface {v4, v3}, Lm1/p;->c(Lx1/x;)Lx1/x;

    move-result-object v3

    if-eqz v3, :cond_0

    if-nez v1, :cond_1

    new-instance v1, Ll1/t;

    invoke-direct {v1}, Ll1/t;-><init>()V

    :cond_1
    invoke-virtual {v2}, Lm1/e;->a()Ll1/r;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Ll1/t;->l(Ll1/r;Lx1/x;)V

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public abstract e()Lm1/d;
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm1/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/f;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()Ll1/l;
    .locals 1

    iget-object v0, p0, Lm1/f;->a:Ll1/l;

    return-object v0
.end method

.method public h()Lm1/m;
    .locals 1

    iget-object v0, p0, Lm1/f;->b:Lm1/m;

    return-object v0
.end method

.method i(Lm1/f;)Z
    .locals 2

    iget-object v0, p0, Lm1/f;->a:Ll1/l;

    iget-object v1, p1, Lm1/f;->a:Ll1/l;

    invoke-virtual {v0, v1}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/f;->b:Lm1/m;

    iget-object p1, p1, Lm1/f;->b:Lm1/m;

    invoke-virtual {v0, p1}, Lm1/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method j()I
    .locals 2

    invoke-virtual {p0}, Lm1/f;->g()Ll1/l;

    move-result-object v0

    invoke-virtual {v0}, Ll1/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm1/f;->b:Lm1/m;

    invoke-virtual {v1}, Lm1/m;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method k()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/f;->a:Ll1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", precondition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/f;->b:Lm1/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected l(Lx0/o;Ll1/s;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/o;",
            "Ll1/s;",
            ")",
            "Ljava/util/Map<",
            "Ll1/r;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->b()Lm1/p;

    move-result-object v3

    invoke-virtual {v2}, Lm1/e;->a()Ll1/r;

    move-result-object v4

    invoke-virtual {p2, v4}, Ll1/s;->f(Ll1/r;)Lx1/x;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->a()Ll1/r;

    move-result-object v2

    invoke-interface {v3, v4, p1}, Lm1/p;->a(Lx1/x;Lx0/o;)Lx1/x;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected m(Ll1/s;Ljava/util/List;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/s;",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/r;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    iget-object v5, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    const-string v3, "server transform count (%d) should match field transform count (%d)"

    invoke-static {v1, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_1

    iget-object v1, p0, Lm1/f;->c:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    invoke-virtual {v1}, Lm1/e;->b()Lm1/p;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->a()Ll1/r;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll1/s;->f(Ll1/r;)Lx1/x;

    move-result-object v3

    invoke-virtual {v1}, Lm1/e;->a()Ll1/r;

    move-result-object v1

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx1/x;

    invoke-interface {v2, v3, v5}, Lm1/p;->b(Lx1/x;Lx1/x;)Lx1/x;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method n(Ll1/s;)V
    .locals 2

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p0}, Lm1/f;->g()Ll1/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Can only apply a mutation to a document with the same key"

    invoke-static {p1, v1, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
