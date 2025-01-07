.class Lp1/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/g$c$b;
    }
.end annotation


# instance fields
.field private final e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private f:Z

.field private final g:Ljava/lang/Thread;

.field final synthetic h:Lp1/g;


# direct methods
.method constructor <init>(Lp1/g;)V
    .locals 4

    iput-object p1, p0, Lp1/g$c;->h:Lp1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/g$c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp1/g$c$b;-><init>(Lp1/g$c;Lp1/g$a;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    iput-object v1, p0, Lp1/g$c;->g:Ljava/lang/Thread;

    const-string v2, "FirestoreWorker"

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    new-instance v3, Lp1/j;

    invoke-direct {v3, p0}, Lp1/j;-><init>(Lp1/g$c;)V

    invoke-virtual {v1, v3}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    new-instance v1, Lp1/g$c$a;

    invoke-direct {v1, p0, v2, v0, p1}, Lp1/g$c$a;-><init>(Lp1/g$c;ILjava/util/concurrent/ThreadFactory;Lp1/g;)V

    iput-object v1, p0, Lp1/g$c;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp1/g$c;->f:Z

    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Lp1/g$c;->n(Ljava/lang/Runnable;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/g$c;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp1/g$c;->p(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lo0/i;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-static {p0, p1}, Lp1/g$c;->o(Lo0/i;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method static synthetic d(Lp1/g$c;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lp1/g$c;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lp1/g$c;)Ljava/lang/Thread;
    .locals 0

    iget-object p0, p0, Lp1/g$c;->g:Ljava/lang/Thread;

    return-object p0
.end method

.method static synthetic f(Lp1/g$c;Ljava/util/concurrent/Callable;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1}, Lp1/g$c;->k(Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lp1/g$c;Ljava/lang/Runnable;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1}, Lp1/g$c;->j(Ljava/lang/Runnable;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lp1/g$c;)Z
    .locals 0

    invoke-direct {p0}, Lp1/g$c;->m()Z

    move-result p0

    return p0
.end method

.method static synthetic i(Lp1/g$c;)V
    .locals 0

    invoke-direct {p0}, Lp1/g$c;->q()V

    return-void
.end method

.method private declared-synchronized j(Ljava/lang/Runnable;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lp1/g$c;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lo0/i;

    invoke-direct {p1}, Lo0/i;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance v0, Lp1/k;

    invoke-direct {v0, p1}, Lp1/k;-><init>(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0}, Lp1/g$c;->k(Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp1/g$c;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private k(Ljava/util/concurrent/Callable;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lo0/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    :try_start_0
    new-instance v1, Lp1/i;

    invoke-direct {v1, v0, p1}, Lp1/i;-><init>(Lo0/i;Ljava/util/concurrent/Callable;)V

    invoke-virtual {p0, v1}, Lp1/g$c;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-class p1, Lp1/g;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Refused to enqueue task after panic"

    invoke-static {p1, v2, v1}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private declared-synchronized m()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lp1/g$c;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static synthetic n(Ljava/lang/Runnable;)Ljava/lang/Void;
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic o(Lo0/i;Ljava/util/concurrent/Callable;)V
    .locals 0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p0
.end method

.method private synthetic p(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lp1/g$c;->h:Lp1/g;

    invoke-virtual {p1, p2}, Lp1/g;->u(Ljava/lang/Throwable;)V

    return-void
.end method

.method private q()V
    .locals 1

    iget-object v0, p0, Lp1/g$c;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    return-void
.end method

.method private declared-synchronized schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lp1/g$c;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/g$c;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lp1/g$c;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/g$c;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public l(Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lp1/g$c;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-class p1, Lp1/g;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Refused to enqueue task after panic"

    invoke-static {p1, v1, v0}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
