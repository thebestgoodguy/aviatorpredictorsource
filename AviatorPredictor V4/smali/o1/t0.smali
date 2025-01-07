.class public Lo1/t0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/t0$b;
    }
.end annotation


# instance fields
.field private final a:Lo1/t0$b;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lo1/r0;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo1/t0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo1/t0;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo1/t0;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo1/t0;->e:Ljava/util/Set;

    iput-object p1, p0, Lo1/t0;->a:Lo1/t0$b;

    return-void
.end method

.method private a(ILl1/s;)V
    .locals 3

    invoke-direct {p0, p1}, Lo1/t0;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Ll1/s;->getKey()Ll1/l;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo1/t0;->p(ILl1/l;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Li1/n$a;->g:Li1/n$a;

    goto :goto_0

    :cond_1
    sget-object v0, Li1/n$a;->f:Li1/n$a;

    :goto_0
    invoke-direct {p0, p1}, Lo1/t0;->d(I)Lo1/r0;

    move-result-object v1

    invoke-virtual {p2}, Ll1/s;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lo1/r0;->a(Ll1/l;Li1/n$a;)V

    iget-object v0, p0, Lo1/t0;->c:Ljava/util/Map;

    invoke-virtual {p2}, Ll1/s;->getKey()Ll1/l;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ll1/s;->getKey()Ll1/l;

    move-result-object p2

    invoke-direct {p0, p2}, Lo1/t0;->c(Ll1/l;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c(Ll1/l;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo1/t0;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lo1/t0;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private d(I)Lo1/r0;
    .locals 2

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/r0;

    if-nez v0, :cond_0

    new-instance v0, Lo1/r0;

    invoke-direct {v0}, Lo1/r0;-><init>()V

    iget-object v1, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private e(I)I
    .locals 2

    invoke-direct {p0, p1}, Lo1/t0;->d(I)Lo1/r0;

    move-result-object v0

    invoke-virtual {v0}, Lo1/r0;->j()Lo1/q0;

    move-result-object v0

    iget-object v1, p0, Lo1/t0;->a:Lo1/t0$b;

    invoke-interface {v1, p1}, Lo1/t0$b;->b(I)Lc1/e;

    move-result-object p1

    invoke-virtual {p1}, Lc1/e;->size()I

    move-result p1

    invoke-virtual {v0}, Lo1/q0;->b()Lc1/e;

    move-result-object v1

    invoke-virtual {v1}, Lc1/e;->size()I

    move-result v1

    add-int/2addr p1, v1

    invoke-virtual {v0}, Lo1/q0;->d()Lc1/e;

    move-result-object v0

    invoke-virtual {v0}, Lc1/e;->size()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method private f(Lo1/s0$d;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/s0$d;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lo1/s0$d;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {p0, v2}, Lo1/t0;->j(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private j(I)Z
    .locals 0

    invoke-direct {p0, p1}, Lo1/t0;->k(I)Lk1/b4;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k(I)Lk1/b4;
    .locals 2

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo1/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/t0;->a:Lo1/t0$b;

    invoke-interface {v0, p1}, Lo1/t0$b;->a(I)Lk1/b4;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private m(ILl1/l;Ll1/s;)V
    .locals 2

    invoke-direct {p0, p1}, Lo1/t0;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lo1/t0;->d(I)Lo1/r0;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo1/t0;->p(ILl1/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Li1/n$a;->e:Li1/n$a;

    invoke-virtual {v0, p2, v1}, Lo1/r0;->a(Ll1/l;Li1/n$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p2}, Lo1/r0;->i(Ll1/l;)V

    :goto_0
    invoke-direct {p0, p2}, Lo1/t0;->c(Ll1/l;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_2

    iget-object p1, p0, Lo1/t0;->c:Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private o(I)V
    .locals 3

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/r0;

    invoke-virtual {v0}, Lo1/r0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Should only reset active targets"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lo1/r0;

    invoke-direct {v2}, Lo1/r0;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo1/t0;->a:Lo1/t0$b;

    invoke-interface {v0, p1}, Lo1/t0$b;->b(I)Lc1/e;

    move-result-object v0

    invoke-virtual {v0}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2}, Lo1/t0;->m(ILl1/l;Ll1/s;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private p(ILl1/l;)Z
    .locals 1

    iget-object v0, p0, Lo1/t0;->a:Lo1/t0$b;

    invoke-interface {v0, p1}, Lo1/t0$b;->b(I)Lc1/e;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc1/e;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public b(Ll1/w;)Lo1/i0;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo1/r0;

    invoke-direct {p0, v3}, Lo1/t0;->k(I)Lk1/b4;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lo1/r0;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lk1/b4;->f()Li1/c1;

    move-result-object v5

    invoke-virtual {v5}, Li1/c1;->s()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lk1/b4;->f()Li1/c1;

    move-result-object v4

    invoke-virtual {v4}, Li1/c1;->n()Ll1/u;

    move-result-object v4

    invoke-static {v4}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object v4

    iget-object v5, p0, Lo1/t0;->c:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    invoke-direct {p0, v3, v4}, Lo1/t0;->p(ILl1/l;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v4, p1}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object v5

    invoke-direct {p0, v3, v4, v5}, Lo1/t0;->m(ILl1/l;Ll1/s;)V

    :cond_1
    invoke-virtual {v2}, Lo1/r0;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2}, Lo1/r0;->j()Lo1/q0;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lo1/r0;->b()V

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lo1/t0;->d:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/l;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    const/4 v5, 0x1

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-direct {p0, v6}, Lo1/t0;->k(I)Lk1/b4;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lk1/b4;->b()Lk1/b1;

    move-result-object v6

    sget-object v7, Lk1/b1;->g:Lk1/b1;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    const/4 v5, 0x0

    :cond_5
    if-eqz v5, :cond_3

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v2, p0, Lo1/t0;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/s;

    invoke-virtual {v3, p1}, Ll1/s;->v(Ll1/w;)Ll1/s;

    goto :goto_2

    :cond_7
    new-instance v2, Lo1/i0;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    iget-object v0, p0, Lo1/t0;->e:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v7

    iget-object v0, p0, Lo1/t0;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v9

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lo1/i0;-><init>(Ll1/w;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/Set;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lo1/t0;->c:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lo1/t0;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lo1/t0;->e:Ljava/util/Set;

    return-object v2
.end method

.method public g(Lo1/s0$b;)V
    .locals 5

    invoke-virtual {p1}, Lo1/s0$b;->b()Ll1/s;

    move-result-object v0

    invoke-virtual {p1}, Lo1/s0$b;->a()Ll1/l;

    move-result-object v1

    invoke-virtual {p1}, Lo1/s0$b;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll1/s;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0, v3, v0}, Lo1/t0;->a(ILl1/s;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, v3, v1, v0}, Lo1/t0;->m(ILl1/l;Ll1/s;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo1/s0$b;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lo1/s0$b;->b()Ll1/s;

    move-result-object v3

    invoke-direct {p0, v2, v1, v3}, Lo1/t0;->m(ILl1/l;Ll1/s;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public h(Lo1/s0$c;)V
    .locals 5

    invoke-virtual {p1}, Lo1/s0$c;->b()I

    move-result v0

    invoke-virtual {p1}, Lo1/s0$c;->a()Lo1/n;

    move-result-object p1

    invoke-virtual {p1}, Lo1/n;->a()I

    move-result p1

    invoke-direct {p0, v0}, Lo1/t0;->k(I)Lk1/b4;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lk1/b4;->f()Li1/c1;

    move-result-object v1

    invoke-virtual {v1}, Li1/c1;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez p1, :cond_0

    invoke-virtual {v1}, Li1/c1;->n()Ll1/u;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    sget-object v1, Ll1/w;->f:Ll1/w;

    invoke-static {p1, v1}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lo1/t0;->m(ILl1/l;Ll1/s;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    const-string p1, "Single document existence filter with count: %d"

    invoke-static {v2, p1, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Lo1/t0;->e(I)I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, p1

    cmp-long p1, v1, v3

    if-eqz p1, :cond_3

    invoke-direct {p0, v0}, Lo1/t0;->o(I)V

    iget-object p1, p0, Lo1/t0;->e:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public i(Lo1/s0$d;)V
    .locals 7

    invoke-direct {p0, p1}, Lo1/t0;->f(Lo1/s0$d;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lo1/t0;->d(I)Lo1/r0;

    move-result-object v2

    sget-object v3, Lo1/t0$a;->a:[I

    invoke-virtual {p1}, Lo1/s0$d;->b()Lo1/s0$e;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v5, 0x2

    if-eq v3, v5, :cond_6

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-eq v3, v5, :cond_3

    const/4 v5, 0x4

    if-eq v3, v5, :cond_2

    const/4 v5, 0x5

    if-ne v3, v5, :cond_1

    invoke-direct {p0, v1}, Lo1/t0;->j(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v1}, Lo1/t0;->o(I)V

    goto :goto_2

    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo1/s0$d;->b()Lo1/s0$e;

    move-result-object p1

    aput-object p1, v0, v6

    const-string p1, "Unknown target watch change state: %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_2
    invoke-direct {p0, v1}, Lo1/t0;->j(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lo1/r0;->f()V

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lo1/r0;->h()V

    invoke-virtual {v2}, Lo1/r0;->e()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0, v1}, Lo1/t0;->n(I)V

    :cond_4
    invoke-virtual {p1}, Lo1/s0$d;->a()Lb3/f1;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    new-array v1, v6, [Ljava/lang/Object;

    const-string v2, "WatchChangeAggregator does not handle errored targets"

    invoke-static {v4, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Lo1/r0;->h()V

    invoke-virtual {v2}, Lo1/r0;->e()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v2}, Lo1/r0;->b()V

    goto :goto_2

    :cond_7
    invoke-direct {p0, v1}, Lo1/t0;->j(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lo1/s0$d;->c()Lcom/google/protobuf/j;

    move-result-object v1

    invoke-virtual {v2, v1}, Lo1/r0;->k(Lcom/google/protobuf/j;)V

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method l(I)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/t0;->d(I)Lo1/r0;

    move-result-object p1

    invoke-virtual {p1}, Lo1/r0;->g()V

    return-void
.end method

.method n(I)V
    .locals 1

    iget-object v0, p0, Lo1/t0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
