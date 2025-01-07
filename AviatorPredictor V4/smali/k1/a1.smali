.class public Lk1/a1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lk1/n;

.field private b:Lk1/l;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Iterable;Li1/x0;Ll1/q$a;)Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ll1/i;",
            ">;",
            "Li1/x0;",
            "Ll1/q$a;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/a1;->a:Lk1/n;

    invoke-virtual {v0, p2, p3}, Lk1/n;->h(Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll1/i;

    invoke-interface {p3}, Ll1/i;->getKey()Ll1/l;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object p2

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private b(Li1/x0;Lc1/c;)Lc1/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;)",
            "Lc1/e<",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc1/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Li1/x0;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc1/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p2}, Lc1/c;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/i;

    invoke-virtual {p1, v1}, Li1/x0;->v(Ll1/i;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private c(Li1/x0;)Lc1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp1/v;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Li1/x0;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "QueryEngine"

    const-string v2, "Using full collection scan to execute query: %s"

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lk1/a1;->a:Lk1/n;

    sget-object v1, Ll1/q$a;->e:Ll1/q$a;

    invoke-virtual {v0, p1, v1}, Lk1/n;->h(Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private f(Li1/x0;ILc1/e;Ll1/w;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "I",
            "Lc1/e<",
            "Ll1/i;",
            ">;",
            "Ll1/w;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, Li1/x0;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p3}, Lc1/e;->size()I

    move-result v0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Li1/x0;->l()Li1/x0$a;

    move-result-object p1

    sget-object p2, Li1/x0$a;->e:Li1/x0$a;

    if-ne p1, p2, :cond_2

    invoke-virtual {p3}, Lc1/e;->i()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lc1/e;->p()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Ll1/i;

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-interface {p1}, Ll1/i;->c()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-interface {p1}, Ll1/i;->j()Ll1/w;

    move-result-object p1

    invoke-virtual {p1, p4}, Ll1/w;->d(Ll1/w;)I

    move-result p1

    if-lez p1, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    return v1
.end method

.method private g(Li1/x0;)Lc1/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Li1/x0;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Li1/x0;->D()Li1/c1;

    move-result-object v0

    iget-object v2, p0, Lk1/a1;->b:Lk1/l;

    invoke-interface {v2, v0}, Lk1/l;->e(Li1/c1;)Lk1/l$a;

    move-result-object v2

    sget-object v3, Lk1/l$a;->e:Lk1/l$a;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Li1/x0;->p()Z

    move-result v1

    const-wide/16 v3, -0x1

    if-eqz v1, :cond_2

    sget-object v1, Lk1/l$a;->f:Lk1/l$a;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    invoke-virtual {p1, v3, v4}, Li1/x0;->t(J)Li1/x0;

    move-result-object p1

    invoke-direct {p0, p1}, Lk1/a1;->g(Li1/x0;)Lc1/c;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lk1/a1;->b:Lk1/l;

    invoke-interface {v1, v0}, Lk1/l;->g(Li1/c1;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "index manager must return results for partial and full indexes."

    invoke-static {v5, v6, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lk1/a1;->a:Lk1/n;

    invoke-virtual {v2, v1}, Lk1/n;->d(Ljava/lang/Iterable;)Lc1/c;

    move-result-object v2

    iget-object v5, p0, Lk1/a1;->b:Lk1/l;

    invoke-interface {v5, v0}, Lk1/l;->d(Li1/c1;)Ll1/q$a;

    move-result-object v0

    invoke-direct {p0, p1, v2}, Lk1/a1;->b(Li1/x0;Lc1/c;)Lc1/e;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Ll1/q$a;->q()Ll1/w;

    move-result-object v5

    invoke-direct {p0, p1, v1, v2, v5}, Lk1/a1;->f(Li1/x0;ILc1/e;Ll1/w;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-direct {p0, v2, p1, v0}, Lk1/a1;->a(Ljava/lang/Iterable;Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private h(Li1/x0;Lc1/e;Ll1/w;)Lc1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Lc1/e<",
            "Ll1/l;",
            ">;",
            "Ll1/w;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Li1/x0;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Ll1/w;->f:Ll1/w;

    invoke-virtual {p3, v0}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Lk1/a1;->a:Lk1/n;

    invoke-virtual {v0, p2}, Lk1/n;->d(Ljava/lang/Iterable;)Lc1/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lk1/a1;->b(Li1/x0;Lc1/c;)Lc1/e;

    move-result-object v0

    invoke-virtual {p2}, Lc1/e;->size()I

    move-result p2

    invoke-direct {p0, p1, p2, v0, p3}, Lk1/a1;->f(Li1/x0;ILc1/e;Ll1/w;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v1

    :cond_2
    invoke-static {}, Lp1/v;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p3}, Ll1/w;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Li1/x0;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    const-string v1, "QueryEngine"

    const-string v2, "Re-using previous result from %s to execute query: %s"

    invoke-static {v1, v2, p2}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    const/4 p2, -0x1

    invoke-static {p3, p2}, Ll1/q$a;->i(Ll1/w;I)Ll1/q$a;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lk1/a1;->a(Ljava/lang/Iterable;Li1/x0;Ll1/q$a;)Lc1/c;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d(Li1/x0;Ll1/w;Lc1/e;)Lc1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Ll1/w;",
            "Lc1/e<",
            "Ll1/l;",
            ">;)",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lk1/a1;->c:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() not called"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lk1/a1;->g(Li1/x0;)Lc1/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1, p3, p2}, Lk1/a1;->h(Li1/x0;Lc1/e;Ll1/w;)Lc1/c;

    move-result-object p2

    if-eqz p2, :cond_1

    return-object p2

    :cond_1
    invoke-direct {p0, p1}, Lk1/a1;->c(Li1/x0;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Lk1/n;Lk1/l;)V
    .locals 0

    iput-object p1, p0, Lk1/a1;->a:Lk1/n;

    iput-object p2, p0, Lk1/a1;->b:Lk1/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk1/a1;->c:Z

    return-void
.end method
