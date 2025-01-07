.class public final Lk1/t0;
.super Lk1/z0;
.source ""


# instance fields
.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg1/j;",
            "Lk1/r0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg1/j;",
            "Lk1/o0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lk1/q0;

.field private final f:Lk1/v0;

.field private final g:Lk1/n0;

.field private final h:Lk1/u0;

.field private i:Lk1/d1;

.field private j:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk1/z0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/t0;->c:Ljava/util/Map;

    new-instance v0, Lk1/q0;

    invoke-direct {v0}, Lk1/q0;-><init>()V

    iput-object v0, p0, Lk1/t0;->e:Lk1/q0;

    new-instance v0, Lk1/v0;

    invoke-direct {v0, p0}, Lk1/v0;-><init>(Lk1/t0;)V

    iput-object v0, p0, Lk1/t0;->f:Lk1/v0;

    new-instance v0, Lk1/n0;

    invoke-direct {v0}, Lk1/n0;-><init>()V

    iput-object v0, p0, Lk1/t0;->g:Lk1/n0;

    new-instance v0, Lk1/u0;

    invoke-direct {v0}, Lk1/u0;-><init>()V

    iput-object v0, p0, Lk1/t0;->h:Lk1/u0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/t0;->d:Ljava/util/Map;

    return-void
.end method

.method public static n()Lk1/t0;
    .locals 2

    new-instance v0, Lk1/t0;

    invoke-direct {v0}, Lk1/t0;-><init>()V

    new-instance v1, Lk1/p0;

    invoke-direct {v1, v0}, Lk1/p0;-><init>(Lk1/t0;)V

    invoke-direct {v0, v1}, Lk1/t0;->s(Lk1/d1;)V

    return-object v0
.end method

.method private s(Lk1/d1;)V
    .locals 0

    iput-object p1, p0, Lk1/t0;->i:Lk1/d1;

    return-void
.end method


# virtual methods
.method a()Lk1/a;
    .locals 1

    iget-object v0, p0, Lk1/t0;->g:Lk1/n0;

    return-object v0
.end method

.method b(Lg1/j;)Lk1/b;
    .locals 2

    iget-object v0, p0, Lk1/t0;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/o0;

    if-nez v0, :cond_0

    new-instance v0, Lk1/o0;

    invoke-direct {v0}, Lk1/o0;-><init>()V

    iget-object v1, p0, Lk1/t0;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method bridge synthetic c(Lg1/j;)Lk1/l;
    .locals 0

    invoke-virtual {p0, p1}, Lk1/t0;->o(Lg1/j;)Lk1/q0;

    move-result-object p1

    return-object p1
.end method

.method d(Lg1/j;Lk1/l;)Lk1/w0;
    .locals 1

    iget-object p2, p0, Lk1/t0;->c:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk1/r0;

    if-nez p2, :cond_0

    new-instance p2, Lk1/r0;

    invoke-direct {p2, p0, p1}, Lk1/r0;-><init>(Lk1/t0;Lg1/j;)V

    iget-object v0, p0, Lk1/t0;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method e()Lk1/x0;
    .locals 1

    new-instance v0, Lk1/s0;

    invoke-direct {v0}, Lk1/s0;-><init>()V

    return-object v0
.end method

.method f()Lk1/d1;
    .locals 1

    iget-object v0, p0, Lk1/t0;->i:Lk1/d1;

    return-object v0
.end method

.method bridge synthetic g()Lk1/f1;
    .locals 1

    invoke-virtual {p0}, Lk1/t0;->q()Lk1/u0;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic h()Lk1/a4;
    .locals 1

    invoke-virtual {p0}, Lk1/t0;->r()Lk1/v0;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lk1/t0;->j:Z

    return v0
.end method

.method j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lp1/y<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object p1, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p1}, Lk1/d1;->n()V

    :try_start_0
    invoke-interface {p2}, Lp1/y;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p2}, Lk1/d1;->i()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p2}, Lk1/d1;->i()V

    throw p1
.end method

.method k(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p1}, Lk1/d1;->n()V

    :try_start_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p1}, Lk1/d1;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lk1/t0;->i:Lk1/d1;

    invoke-interface {p2}, Lk1/d1;->i()V

    throw p1
.end method

.method public l()V
    .locals 4

    iget-boolean v0, p0, Lk1/t0;->j:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MemoryPersistence shutdown without start"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lk1/t0;->j:Z

    return-void
.end method

.method public m()V
    .locals 4

    iget-boolean v0, p0, Lk1/t0;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "MemoryPersistence double-started!"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lk1/t0;->j:Z

    return-void
.end method

.method o(Lg1/j;)Lk1/q0;
    .locals 0

    iget-object p1, p0, Lk1/t0;->e:Lk1/q0;

    return-object p1
.end method

.method p()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lk1/r0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/t0;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method q()Lk1/u0;
    .locals 1

    iget-object v0, p0, Lk1/t0;->h:Lk1/u0;

    return-object v0
.end method

.method r()Lk1/v0;
    .locals 1

    iget-object v0, p0, Lk1/t0;->f:Lk1/v0;

    return-object v0
.end method
