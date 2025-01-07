.class Lk1/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lk1/f1;

.field private final b:Lk1/w0;

.field private final c:Lk1/b;

.field private final d:Lk1/l;


# direct methods
.method constructor <init>(Lk1/f1;Lk1/w0;Lk1/b;Lk1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/n;->a:Lk1/f1;

    iput-object p2, p0, Lk1/n;->b:Lk1/w0;

    iput-object p3, p0, Lk1/n;->c:Lk1/b;

    iput-object p4, p0, Lk1/n;->d:Lk1/l;

    return-void
.end method

.method private a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lm1/k;",
            ">;",
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lk1/y0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/s;

    invoke-virtual {v3}, Ll1/s;->getKey()Ll1/l;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm1/k;

    invoke-virtual {v3}, Ll1/s;->getKey()Ll1/l;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lm1/k;->d()Lm1/f;

    move-result-object v5

    instance-of v5, v5, Lm1/l;

    if-eqz v5, :cond_2

    :cond_1
    invoke-virtual {v3}, Ll1/s;->getKey()Ll1/l;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ll1/s;->getKey()Ll1/l;

    move-result-object v5

    invoke-virtual {v4}, Lm1/k;->d()Lm1/f;

    move-result-object v6

    invoke-virtual {v6}, Lm1/f;->e()Lm1/d;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lm1/k;->d()Lm1/f;

    move-result-object v5

    invoke-virtual {v4}, Lm1/k;->d()Lm1/f;

    move-result-object v4

    invoke-virtual {v4}, Lm1/f;->e()Lm1/d;

    move-result-object v4

    invoke-static {}, Lx0/o;->n()Lx0/o;

    move-result-object v6

    invoke-virtual {v5, v3, v4, v6}, Lm1/f;->a(Ll1/s;Lm1/d;Lx0/o;)Lm1/d;

    goto :goto_0

    :cond_3
    invoke-direct {p0, v0}, Lk1/n;->m(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    new-instance v2, Lk1/y0;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/i;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm1/d;

    invoke-direct {v2, v3, p3}, Lk1/y0;-><init>(Ll1/i;Lm1/d;)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    return-object p2
.end method

.method private b(Ll1/l;Lm1/k;)Ll1/s;
    .locals 0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lm1/k;->d()Lm1/f;

    move-result-object p2

    instance-of p2, p2, Lm1/l;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll1/s;->q(Ll1/l;)Ll1/s;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p2, p0, Lk1/n;->a:Lk1/f1;

    invoke-interface {p2, p1}, Lk1/f1;->c(Ll1/l;)Ll1/s;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private e(Li1/x0;Ll1/q$a;)Lc1/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Ll1/q$a;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Li1/x0;->n()Ll1/u;

    move-result-object v0

    invoke-virtual {v0}, Ll1/e;->q()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Currently we only support collection group queries at the root."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Li1/x0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v1

    iget-object v2, p0, Lk1/n;->d:Lk1/l;

    invoke-interface {v2, v0}, Lk1/l;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/u;

    invoke-virtual {v3, v0}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object v3

    check-cast v3, Ll1/u;

    invoke-virtual {p1, v3}, Li1/x0;->a(Ll1/u;)Li1/x0;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Lk1/n;->f(Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object v3

    invoke-virtual {v3}, Lc1/c;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll1/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/i;

    invoke-virtual {v1, v5, v4}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private f(Li1/x0;Ll1/q$a;)Lc1/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Ll1/q$a;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/n;->a:Lk1/f1;

    invoke-virtual {p1}, Li1/x0;->n()Ll1/u;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lk1/f1;->e(Ll1/u;Ll1/q$a;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lk1/n;->c:Lk1/b;

    invoke-virtual {p1}, Li1/x0;->n()Ll1/u;

    move-result-object v2

    invoke-virtual {p2}, Ll1/q$a;->p()I

    move-result p2

    invoke-interface {v1, v2, p2}, Lk1/b;->d(Ll1/u;I)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-static {v2}, Ll1/s;->q(Ll1/l;)Ll1/s;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/k;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lm1/k;->d()Lm1/f;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/s;

    sget-object v5, Lm1/d;->b:Lm1/d;

    invoke-static {}, Lx0/o;->n()Lx0/o;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lm1/f;->a(Ll1/s;Lm1/d;Lx0/o;)Lm1/d;

    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/i;

    invoke-virtual {p1, v3}, Li1/x0;->v(Ll1/i;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/i;

    invoke-virtual {v1, v3, v2}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method private g(Ll1/u;)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/u;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v0

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk1/n;->c(Ll1/l;)Ll1/i;

    move-result-object p1

    invoke-interface {p1}, Ll1/i;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private l(Ljava/util/Map;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lm1/k;",
            ">;",
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lk1/n;->c:Lk1/b;

    invoke-interface {p2, v0}, Lk1/b;->b(Ljava/util/SortedSet;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method private m(Ljava/util/Map;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lm1/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/n;->b:Lk1/w0;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Lk1/w0;->h(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/g;

    invoke-virtual {v3}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll1/l;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/s;

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm1/d;

    goto :goto_1

    :cond_2
    sget-object v7, Lm1/d;->b:Lm1/d;

    :goto_1
    invoke-virtual {v3, v6, v7}, Lm1/g;->b(Ll1/s;Lm1/d;)Lm1/d;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lm1/g;->e()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2, v7, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/NavigableMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/l;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll1/s;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm1/d;

    invoke-static {v7, v8}, Lm1/f;->c(Ll1/s;Lm1/d;)Lm1/f;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iget-object v5, p0, Lk1/n;->c:Lk1/b;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v5, v3, v4}, Lk1/b;->e(ILjava/util/Map;)V

    goto :goto_2

    :cond_8
    return-object v1
.end method


# virtual methods
.method c(Ll1/l;)Ll1/i;
    .locals 3

    iget-object v0, p0, Lk1/n;->c:Lk1/b;

    invoke-interface {v0, p1}, Lk1/b;->a(Ll1/l;)Lm1/k;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lk1/n;->b(Ll1/l;Lm1/k;)Ll1/s;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm1/k;->d()Lm1/f;

    move-result-object v0

    sget-object v1, Lm1/d;->b:Lm1/d;

    invoke-static {}, Lx0/o;->n()Lx0/o;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lm1/f;->a(Ll1/s;Lm1/d;Lx0/o;)Lm1/d;

    :cond_0
    return-object p1
.end method

.method d(Ljava/lang/Iterable;)Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ll1/l;",
            ">;)",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/n;->a:Lk1/f1;

    invoke-interface {v0, p1}, Lk1/f1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0, p1, v0}, Lk1/n;->i(Ljava/util/Map;Ljava/util/Set;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method h(Li1/x0;Ll1/q$a;)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Ll1/q$a;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Li1/x0;->n()Ll1/u;

    move-result-object v0

    invoke-virtual {p1}, Li1/x0;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lk1/n;->g(Ll1/u;)Lc1/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Li1/x0;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Lk1/n;->e(Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1, p2}, Lk1/n;->f(Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method i(Ljava/util/Map;Ljava/util/Set;)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;",
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;)",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk1/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v1

    invoke-direct {p0, p1, v0, p2}, Lk1/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk1/y0;

    invoke-virtual {p2}, Lk1/y0;->a()Ll1/i;

    move-result-object p2

    invoke-virtual {v1, v0, p2}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method j(Ljava/lang/String;Ll1/q$a;I)Lk1/m;
    .locals 4

    iget-object v0, p0, Lk1/n;->a:Lk1/f1;

    invoke-interface {v0, p1, p2, p3}, Lk1/f1;->b(Ljava/lang/String;Ll1/q$a;I)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    sub-int v1, p3, v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lk1/n;->c:Lk1/b;

    invoke-virtual {p2}, Ll1/q$a;->p()I

    move-result p2

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    sub-int/2addr p3, v2

    invoke-interface {v1, p1, p2, p3}, Lk1/b;->f(Ljava/lang/String;II)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_0
    const/4 p2, -0x1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/k;

    invoke-virtual {v1}, Lm1/k;->b()Ll1/l;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lm1/k;->b()Ll1/l;

    move-result-object v2

    invoke-virtual {v1}, Lm1/k;->b()Ll1/l;

    move-result-object v3

    invoke-direct {p0, v3, v1}, Lk1/n;->b(Ll1/l;Lm1/k;)Ll1/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, Lm1/k;->c()I

    move-result v1

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Lk1/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p0, v0, p1, p3}, Lk1/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2, p1}, Lk1/m;->a(ILjava/util/Map;)Lk1/m;

    move-result-object p1

    return-object p1
.end method

.method k(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lk1/y0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk1/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lk1/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method n(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/n;->a:Lk1/f1;

    invoke-interface {v0, p1}, Lk1/f1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lk1/n;->m(Ljava/util/Map;)Ljava/util/Map;

    return-void
.end method
