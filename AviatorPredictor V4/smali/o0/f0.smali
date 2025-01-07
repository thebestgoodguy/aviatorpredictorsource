.class final Lo0/f0;
.super Lo0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lo0/h<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lo0/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/c0<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private volatile d:Z

.field private e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo0/h;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    new-instance v0, Lo0/c0;

    invoke-direct {v0}, Lo0/c0;-><init>()V

    iput-object v0, p0, Lo0/f0;->b:Lo0/c0;

    return-void
.end method

.method private final v()V
    .locals 2

    iget-boolean v0, p0, Lo0/f0;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lw/r;->l(ZLjava/lang/Object;)V

    return-void
.end method

.method private final w()V
    .locals 2

    iget-boolean v0, p0, Lo0/f0;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final x()V
    .locals 1

    iget-boolean v0, p0, Lo0/f0;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lo0/b;->a(Lo0/h;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method private final y()V
    .locals 2

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {v0, p0}, Lo0/c0;->b(Lo0/h;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lo0/c;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/c;",
            ")",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v1, Lo0/u;

    invoke-direct {v1, p1, p2}, Lo0/u;-><init>(Ljava/util/concurrent/Executor;Lo0/c;)V

    invoke-virtual {v0, v1}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object p0
.end method

.method public final b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/d<",
            "TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v1, Lo0/w;

    invoke-direct {v1, p1, p2}, Lo0/w;-><init>(Ljava/util/concurrent/Executor;Lo0/d;)V

    invoke-virtual {v0, v1}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object p0
.end method

.method public final c(Lo0/d;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/d<",
            "TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v2, Lo0/w;

    invoke-direct {v2, v0, p1}, Lo0/w;-><init>(Ljava/util/concurrent/Executor;Lo0/d;)V

    invoke-virtual {v1, v2}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/e;",
            ")",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v1, Lo0/y;

    invoke-direct {v1, p1, p2}, Lo0/y;-><init>(Ljava/util/concurrent/Executor;Lo0/e;)V

    invoke-virtual {v0, v1}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object p0
.end method

.method public final e(Lo0/e;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/e;",
            ")",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lo0/f0;->d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;

    return-object p0
.end method

.method public final f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/f<",
            "-TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v1, Lo0/a0;

    invoke-direct {v1, p1, p2}, Lo0/a0;-><init>(Ljava/util/concurrent/Executor;Lo0/f;)V

    invoke-virtual {v0, v1}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object p0
.end method

.method public final g(Lo0/f;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/f<",
            "-TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lo0/f0;->f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;

    return-object p0
.end method

.method public final h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/a<",
            "TTResult;TTContinuationResult;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    iget-object v1, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v2, Lo0/q;

    invoke-direct {v2, p1, p2, v0}, Lo0/q;-><init>(Ljava/util/concurrent/Executor;Lo0/a;Lo0/f0;)V

    invoke-virtual {v1, v2}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object v0
.end method

.method public final i(Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/a<",
            "TTResult;TTContinuationResult;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/a<",
            "TTResult;",
            "Lo0/h<",
            "TTContinuationResult;>;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    iget-object v1, p0, Lo0/f0;->b:Lo0/c0;

    new-instance v2, Lo0/s;

    invoke-direct {v2, p1, p2, v0}, Lo0/s;-><init>(Ljava/util/concurrent/Executor;Lo0/a;Lo0/f0;)V

    invoke-virtual {v1, v2}, Lo0/c0;->a(Lo0/b0;)V

    invoke-direct {p0}, Lo0/f0;->y()V

    return-object v0
.end method

.method public final k(Lo0/a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/a<",
            "TTResult;",
            "Lo0/h<",
            "TTContinuationResult;>;>;)",
            "Lo0/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final l()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/f0;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lo0/f0;->v()V

    invoke-direct {p0}, Lo0/f0;->w()V

    iget-object v1, p0, Lo0/f0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lo0/f0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v2, Lo0/g;

    invoke-direct {v2, v1}, Lo0/g;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lo0/f0;->d:Z

    return v0
.end method

.method public final o()Z
    .locals 2

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final p()Z
    .locals 3

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lo0/f0;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lo0/f0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final q(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lo0/f0;->x()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo0/f0;->c:Z

    iput-object p1, p0, Lo0/f0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {p1, p0}, Lo0/c0;->b(Lo0/h;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lo0/f0;->x()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo0/f0;->c:Z

    iput-object p1, p0, Lo0/f0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {p1, p0}, Lo0/c0;->b(Lo0/h;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final s()Z
    .locals 2

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lo0/f0;->c:Z

    iput-boolean v1, p0, Lo0/f0;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {v0, p0}, Lo0/c0;->b(Lo0/h;)V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final t(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lo0/f0;->c:Z

    iput-object p1, p0, Lo0/f0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {p1, p0}, Lo0/c0;->b(Lo0/h;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final u(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lo0/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lo0/f0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lo0/f0;->c:Z

    iput-object p1, p0, Lo0/f0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo0/f0;->b:Lo0/c0;

    invoke-virtual {p1, p0}, Lo0/c0;->b(Lo0/h;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
