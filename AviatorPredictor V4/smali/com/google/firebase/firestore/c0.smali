.class public Lcom/google/firebase/firestore/c0;
.super Lo0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/c0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo0/h<",
        "Lcom/google/firebase/firestore/d0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/firebase/firestore/d0;

.field private final c:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lo0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/google/firebase/firestore/c0$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo0/h;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/firestore/c0;->a:Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/firestore/d0;->g:Lcom/google/firebase/firestore/d0;

    iput-object v0, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/firestore/c0;->c:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Lo0/c;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/c;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->a(Ljava/util/concurrent/Executor;Lo0/c;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/d<",
            "Lcom/google/firebase/firestore/d0;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public c(Lo0/d;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/d<",
            "Lcom/google/firebase/firestore/d0;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1}, Lo0/h;->c(Lo0/d;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/e;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public e(Lo0/e;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/e;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1}, Lo0/h;->e(Lo0/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/f<",
            "-",
            "Lcom/google/firebase/firestore/d0;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public g(Lo0/f;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/f<",
            "-",
            "Lcom/google/firebase/firestore/d0;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/a<",
            "Lcom/google/firebase/firestore/d0;",
            "TTContinuationResult;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public i(Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/a<",
            "Lcom/google/firebase/firestore/d0;",
            "TTContinuationResult;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1}, Lo0/h;->i(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/a<",
            "Lcom/google/firebase/firestore/d0;",
            "Lo0/h<",
            "TTContinuationResult;>;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1, p2}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public k(Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/a<",
            "Lcom/google/firebase/firestore/d0;",
            "Lo0/h<",
            "TTContinuationResult;>;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0, p1}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/c0;->r()Lcom/google/firebase/firestore/d0;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->n()Z

    move-result v0

    return v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->o()Z

    move-result v0

    return v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->p()Z

    move-result v0

    return v0
.end method

.method public q(Lcom/google/firebase/firestore/f0;)Lcom/google/firebase/firestore/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/f0<",
            "Lcom/google/firebase/firestore/d0;",
            ">;)",
            "Lcom/google/firebase/firestore/c0;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/firestore/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lcom/google/firebase/firestore/c0$a;-><init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/f0;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/c0;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    monitor-exit p1

    return-object p0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public r()Lcom/google/firebase/firestore/d0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->d:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/d0;

    return-object v0
.end method

.method public s(Ljava/lang/Exception;)V
    .locals 11

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v10, Lcom/google/firebase/firestore/d0;

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/d0;->d()I

    move-result v2

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/d0;->g()I

    move-result v3

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/d0;->c()J

    move-result-wide v4

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/d0;->f()J

    move-result-wide v6

    sget-object v9, Lcom/google/firebase/firestore/d0$a;->e:Lcom/google/firebase/firestore/d0$a;

    move-object v1, v10

    move-object v8, p1

    invoke-direct/range {v1 .. v9}, Lcom/google/firebase/firestore/d0;-><init>(IIJJLjava/lang/Exception;Lcom/google/firebase/firestore/d0$a;)V

    iput-object v10, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/c0$a;

    invoke-virtual {v2, v10}, Lcom/google/firebase/firestore/c0$a;->b(Lcom/google/firebase/firestore/d0;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->c:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public t(Lcom/google/firebase/firestore/d0;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/firebase/firestore/d0;->e()Lcom/google/firebase/firestore/d0$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/d0$a;->g:Lcom/google/firebase/firestore/d0$a;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected success, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/d0;->e()Lcom/google/firebase/firestore/d0$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/c0$a;

    iget-object v3, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    invoke-virtual {v2, v3}, Lcom/google/firebase/firestore/c0$a;->b(Lcom/google/firebase/firestore/d0;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->c:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public u(Lcom/google/firebase/firestore/d0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/c0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/firestore/c0;->b:Lcom/google/firebase/firestore/d0;

    iget-object v1, p0, Lcom/google/firebase/firestore/c0;->e:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/c0$a;

    invoke-virtual {v2, p1}, Lcom/google/firebase/firestore/c0$a;->b(Lcom/google/firebase/firestore/d0;)V

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
