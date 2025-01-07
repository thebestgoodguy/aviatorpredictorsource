.class public final Lg1/e;
.super Lg1/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg1/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lp1/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lz0/b;

.field private c:Z

.field private final d:Lz0/a;


# direct methods
.method public constructor <init>(Lr1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/a<",
            "Lz0/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg1/a;-><init>()V

    new-instance v0, Lg1/d;

    invoke-direct {v0, p0}, Lg1/d;-><init>(Lg1/e;)V

    iput-object v0, p0, Lg1/e;->d:Lz0/a;

    new-instance v0, Lg1/c;

    invoke-direct {v0, p0}, Lg1/c;-><init>(Lg1/e;)V

    invoke-interface {p1, v0}, Lr1/a;->a(Lr1/a$a;)V

    return-void
.end method

.method public static synthetic e(Lo0/h;)Lo0/h;
    .locals 0

    invoke-static {p0}, Lg1/e;->g(Lo0/h;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg1/e;Lr1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg1/e;->h(Lr1/b;)V

    return-void
.end method

.method private static synthetic g(Lo0/h;)Lo0/h;
    .locals 1

    invoke-virtual {p0}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly0/a;

    invoke-virtual {p0}, Ly0/a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method private synthetic h(Lr1/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/b;

    iput-object p1, p0, Lg1/e;->b:Lz0/b;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lg1/e;->d:Lz0/a;

    invoke-interface {p1, v0}, Lz0/b;->a(Lz0/a;)V

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public declared-synchronized a()Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg1/e;->b:Lz0/b;

    if-nez v0, :cond_0

    new-instance v0, Lx0/b;

    const-string v1, "AppCheck is not available"

    invoke-direct {v0, v1}, Lx0/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lg1/e;->c:Z

    invoke-interface {v0, v1}, Lz0/b;->b(Z)Lo0/h;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lg1/e;->c:Z

    sget-object v1, Lp1/p;->b:Ljava/util/concurrent/Executor;

    sget-object v2, Lg1/b;->a:Lg1/b;

    invoke-virtual {v0, v1, v2}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lg1/e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lg1/e;->a:Lp1/u;

    iget-object v0, p0, Lg1/e;->b:Lz0/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg1/e;->d:Lz0/a;

    invoke-interface {v0, v1}, Lz0/b;->c(Lz0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(Lp1/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/u<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lg1/e;->a:Lp1/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
