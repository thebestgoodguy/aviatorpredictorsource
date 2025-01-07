.class public Lp1/w;
.super Ljava/lang/Object;
.source ""


# direct methods
.method protected static a(Li1/r;)Li1/r;
    .locals 7

    invoke-static {p0}, Lp1/w;->f(Li1/r;)V

    invoke-static {p0}, Lp1/w;->l(Li1/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    check-cast p0, Li1/l;

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li1/r;

    invoke-static {p0}, Lp1/w;->a(Li1/r;)Li1/r;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Li1/l;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/r;

    invoke-static {v4}, Lp1/w;->a(Li1/r;)Li1/r;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/r;

    instance-of v5, v4, Li1/q;

    if-eqz v5, :cond_6

    :cond_5
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    instance-of v5, v4, Li1/l;

    if-eqz v5, :cond_4

    check-cast v4, Li1/l;

    invoke-virtual {v4}, Li1/l;->h()Li1/l$a;

    move-result-object v5

    invoke-virtual {p0}, Li1/l;->h()Li1/l$a;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Li1/l;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_8

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li1/r;

    return-object p0

    :cond_8
    new-instance v1, Li1/l;

    invoke-virtual {p0}, Li1/l;->h()Li1/l$a;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object v1
.end method

.method private static b(Li1/l;Li1/l;)Li1/r;
    .locals 3

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Found an empty composite filter"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Li1/l;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li1/l;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li1/l;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Li1/l;->n(Ljava/util/List;)Li1/l;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Li1/l;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p0

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    invoke-virtual {p0}, Li1/l;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object p0, p1

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/r;

    invoke-static {v1, p0}, Lp1/w;->e(Li1/r;Li1/r;)Li1/r;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance p0, Li1/l;

    sget-object v0, Li1/l$a;->g:Li1/l$a;

    invoke-direct {p0, p1, v0}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object p0
.end method

.method private static c(Li1/q;Li1/l;)Li1/r;
    .locals 2

    invoke-virtual {p1}, Li1/l;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Li1/l;->n(Ljava/util/List;)Li1/l;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Li1/l;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/r;

    invoke-static {p0, v1}, Lp1/w;->e(Li1/r;Li1/r;)Li1/r;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Li1/l;

    sget-object p1, Li1/l$a;->g:Li1/l$a;

    invoke-direct {p0, v0, p1}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object p0
.end method

.method private static d(Li1/q;Li1/q;)Li1/r;
    .locals 3

    new-instance v0, Li1/l;

    const/4 v1, 0x2

    new-array v1, v1, [Li1/r;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sget-object p1, Li1/l$a;->f:Li1/l$a;

    invoke-direct {v0, p0, p1}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object v0
.end method

.method protected static e(Li1/r;Li1/r;)Li1/r;
    .locals 2

    invoke-static {p0}, Lp1/w;->f(Li1/r;)V

    invoke-static {p1}, Lp1/w;->f(Li1/r;)V

    instance-of v0, p0, Li1/q;

    if-eqz v0, :cond_0

    instance-of v1, p1, Li1/q;

    if-eqz v1, :cond_0

    check-cast p0, Li1/q;

    check-cast p1, Li1/q;

    invoke-static {p0, p1}, Lp1/w;->d(Li1/q;Li1/q;)Li1/r;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v0, p1, Li1/l;

    if-eqz v0, :cond_1

    check-cast p0, Li1/q;

    check-cast p1, Li1/l;

    invoke-static {p0, p1}, Lp1/w;->c(Li1/q;Li1/l;)Li1/r;

    move-result-object p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Li1/l;

    if-eqz v0, :cond_2

    instance-of v0, p1, Li1/q;

    if-eqz v0, :cond_2

    check-cast p1, Li1/q;

    check-cast p0, Li1/l;

    invoke-static {p1, p0}, Lp1/w;->c(Li1/q;Li1/l;)Li1/r;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p0, Li1/l;

    check-cast p1, Li1/l;

    invoke-static {p0, p1}, Lp1/w;->b(Li1/l;Li1/l;)Li1/r;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lp1/w;->a(Li1/r;)Li1/r;

    move-result-object p0

    return-object p0
.end method

.method private static f(Li1/r;)V
    .locals 2

    instance-of v0, p0, Li1/q;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of p0, p0, Li1/l;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "Only field filters and composite filters are accepted."

    invoke-static {p0, v1, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected static g(Li1/r;)Li1/r;
    .locals 5

    invoke-static {p0}, Lp1/w;->f(Li1/r;)V

    instance-of v0, p0, Li1/q;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    move-object v0, p0

    check-cast v0, Li1/l;

    invoke-virtual {v0}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Li1/r;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li1/r;

    invoke-static {p0}, Lp1/w;->g(Li1/r;)Li1/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/r;

    invoke-static {v4}, Lp1/w;->g(Li1/r;)Li1/r;

    move-result-object v4

    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Li1/l;

    invoke-virtual {v0}, Li1/l;->h()Li1/l$a;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    invoke-static {v1}, Lp1/w;->a(Li1/r;)Li1/r;

    move-result-object p0

    invoke-static {p0}, Lp1/w;->j(Li1/r;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    instance-of v0, p0, Li1/l;

    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "field filters are already in DNF form."

    invoke-static {v0, v4, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    check-cast p0, Li1/l;

    invoke-virtual {p0}, Li1/l;->i()Z

    move-result v0

    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "Disjunction of filters all of which are already in DNF form is itself in DNF form."

    invoke-static {v0, v4, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "Single-filter composite filters are already in DNF form."

    invoke-static {v0, v4, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/r;

    :goto_2
    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_5

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/r;

    invoke-static {v0, v1}, Lp1/w;->e(Li1/r;Li1/r;)Li1/r;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-object v0
.end method

.method public static h(Li1/l;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/l;",
            ")",
            "Ljava/util/List<",
            "Li1/r;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lp1/w;->g(Li1/r;)Li1/r;

    move-result-object p0

    invoke-static {p0}, Lp1/w;->j(Li1/r;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeDistributedNormalForm did not result in disjunctive normal form"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0}, Lp1/w;->l(Li1/r;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lp1/w;->k(Li1/r;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Li1/r;->b()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static i(Li1/r;)Z
    .locals 3

    instance-of v0, p0, Li1/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Li1/l;

    invoke-virtual {p0}, Li1/l;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Li1/l;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/r;

    invoke-static {v0}, Lp1/w;->l(Li1/r;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Lp1/w;->k(Li1/r;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static j(Li1/r;)Z
    .locals 1

    invoke-static {p0}, Lp1/w;->l(Li1/r;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lp1/w;->k(Li1/r;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lp1/w;->i(Li1/r;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static k(Li1/r;)Z
    .locals 1

    instance-of v0, p0, Li1/l;

    if-eqz v0, :cond_0

    check-cast p0, Li1/l;

    invoke-virtual {p0}, Li1/l;->l()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static l(Li1/r;)Z
    .locals 0

    instance-of p0, p0, Li1/q;

    return p0
.end method
