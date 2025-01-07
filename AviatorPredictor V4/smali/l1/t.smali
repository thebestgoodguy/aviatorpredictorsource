.class public final Ll1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private e:Lx1/x;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    invoke-static {}, Lx1/r;->V()Lx1/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/x$b;->N(Lx1/r;)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-direct {p0, v0}, Ll1/t;-><init>(Lx1/x;)V

    return-void
.end method

.method public constructor <init>(Lx1/x;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll1/t;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->p:Lx1/x$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "ObjectValues should be backed by a MapValue"

    invoke-static {v0, v4, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Ll1/v;->c(Lx1/x;)Z

    move-result v0

    xor-int/2addr v0, v2

    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "ServerTimestamps should not be used as an ObjectValue"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Ll1/t;->e:Lx1/x;

    return-void
.end method

.method private a(Ll1/r;Ljava/util/Map;)Lx1/r;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/r;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lx1/r;"
        }
    .end annotation

    iget-object v0, p0, Ll1/t;->e:Lx1/x;

    invoke-direct {p0, v0, p1}, Ll1/t;->f(Lx1/x;Ll1/r;)Lx1/x;

    move-result-object v0

    invoke-static {v0}, Ll1/y;->w(Lx1/x;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lx1/x;->m0()Lx1/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->S()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/r$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Lx1/r;->d0()Lx1/r$b;

    move-result-object v0

    :goto_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/Map;

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    invoke-virtual {p1, v4}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object v5

    check-cast v5, Ll1/r;

    check-cast v3, Ljava/util/Map;

    invoke-direct {p0, v5, v3}, Ll1/t;->a(Ll1/r;Ljava/util/Map;)Lx1/r;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lx1/x$b;->N(Lx1/r;)Lx1/x$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v2

    check-cast v2, Lx1/x;

    invoke-virtual {v0, v4, v2}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    :goto_2
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    instance-of v5, v3, Lx1/x;

    if-eqz v5, :cond_3

    check-cast v3, Lx1/x;

    invoke-virtual {v0, v4, v3}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v4}, Lx1/r$b;->B(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    new-array v3, v1, [Ljava/lang/Object;

    const-string v5, "Expected entry to be a Map, a Value or null"

    invoke-static {v2, v5, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lx1/r$b;->F(Ljava/lang/String;)Lx1/r$b;

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/r;

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    return-object p1
.end method

.method private b()Lx1/x;
    .locals 3

    iget-object v0, p0, Ll1/t;->f:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ll1/r;->g:Ll1/r;

    iget-object v2, p0, Ll1/t;->f:Ljava/util/Map;

    invoke-direct {p0, v1, v2}, Ll1/t;->a(Ll1/r;Ljava/util/Map;)Lx1/r;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lx1/x$b;->N(Lx1/r;)Lx1/x$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v1

    check-cast v1, Lx1/x;

    iput-object v1, p0, Ll1/t;->e:Lx1/x;

    iget-object v1, p0, Ll1/t;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ll1/t;->e:Lx1/x;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private e(Lx1/r;)Lm1/d;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll1/r;->y(Ljava/lang/String;)Ll1/r;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/x;

    invoke-static {v3}, Ll1/y;->w(Lx1/x;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-virtual {v1}, Lx1/x;->m0()Lx1/r;

    move-result-object v1

    invoke-direct {p0, v1}, Ll1/t;->e(Lx1/r;)Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/r;

    invoke-virtual {v2, v3}, Ll1/e;->g(Ll1/e;)Ll1/e;

    move-result-object v3

    check-cast v3, Ll1/r;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lm1/d;->b(Ljava/util/Set;)Lm1/d;

    move-result-object p1

    return-object p1
.end method

.method private f(Lx1/x;Ll1/r;)Lx1/x;
    .locals 3

    invoke-virtual {p2}, Ll1/e;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Ll1/e;->s()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lx1/x;->m0()Lx1/r;

    move-result-object p1

    if-ge v0, v1, :cond_2

    invoke-virtual {p2, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Lx1/r;->Y(Ljava/lang/String;Lx1/x;)Lx1/x;

    move-result-object p1

    invoke-static {p1}, Ll1/y;->w(Lx1/x;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ll1/e;->n()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Lx1/r;->Y(Ljava/lang/String;Lx1/x;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public static g(Ljava/util/Map;)Ll1/t;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;)",
            "Ll1/t;"
        }
    .end annotation

    new-instance v0, Ll1/t;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v1

    invoke-static {}, Lx1/r;->d0()Lx1/r$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lx1/r$b;->D(Ljava/util/Map;)Lx1/r$b;

    move-result-object p0

    invoke-virtual {v1, p0}, Lx1/x$b;->L(Lx1/r$b;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    invoke-direct {v0, p0}, Ll1/t;-><init>(Lx1/x;)V

    return-object v0
.end method

.method private n(Ll1/r;Lx1/x;)V
    .locals 6

    iget-object v0, p0, Ll1/t;->f:Ljava/util/Map;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ll1/e;->s()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_0

    check-cast v3, Ljava/util/Map;

    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_0
    instance-of v4, v3, Lx1/x;

    if-eqz v4, :cond_1

    check-cast v3, Lx1/x;

    invoke-virtual {v3}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v4

    sget-object v5, Lx1/x$c;->p:Lx1/x$c;

    if-ne v4, v5, :cond_1

    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v3}, Lx1/x;->m0()Lx1/r;

    move-result-object v3

    invoke-virtual {v3}, Lx1/r;->X()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v4

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ll1/e;->n()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()Ll1/t;
    .locals 2

    new-instance v0, Ll1/t;

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v1

    invoke-direct {v0, v1}, Ll1/t;-><init>(Lx1/x;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll1/t;->c()Ll1/t;

    move-result-object v0

    return-object v0
.end method

.method public d(Ll1/r;)V
    .locals 3

    invoke-virtual {p1}, Ll1/e;->q()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cannot delete field for empty path on ObjectValue"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ll1/t;->n(Ll1/r;Lx1/x;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ll1/t;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v0

    check-cast p1, Ll1/t;

    invoke-direct {p1}, Ll1/t;->b()Lx1/x;

    move-result-object p1

    invoke-static {v0, p1}, Ll1/y;->q(Lx1/x;Lx1/x;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public h(Ll1/r;)Lx1/x;
    .locals 1

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ll1/t;->f(Lx1/x;Ll1/r;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->hashCode()I

    move-result v0

    return v0
.end method

.method public j()Lm1/d;
    .locals 1

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v0

    invoke-virtual {v0}, Lx1/x;->m0()Lx1/r;

    move-result-object v0

    invoke-direct {p0, v0}, Ll1/t;->e(Lx1/r;)Lm1/d;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v0

    invoke-virtual {v0}, Lx1/x;->m0()Lx1/r;

    move-result-object v0

    invoke-virtual {v0}, Lx1/r;->X()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public l(Ll1/r;Lx1/x;)V
    .locals 3

    invoke-virtual {p1}, Ll1/e;->q()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cannot set field for empty path on ObjectValue"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Ll1/t;->n(Ll1/r;Lx1/x;)V

    return-void
.end method

.method public m(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/r;",
            "Lx1/x;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/r;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Ll1/t;->d(Ll1/r;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-virtual {p0, v1, v0}, Ll1/t;->l(Ll1/r;Lx1/x;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ObjectValue{internalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ll1/t;->b()Lx1/x;

    move-result-object v1

    invoke-static {v1}, Ll1/y;->b(Lx1/x;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
