.class public Lo1/d0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static h:Lp1/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/y<",
            "Lb3/r0<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/h<",
            "Lb3/q0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lp1/g;

.field private c:Lb3/c;

.field private d:Lp1/g$b;

.field private final e:Landroid/content/Context;

.field private final f:Li1/m;

.field private final g:Lb3/b;


# direct methods
.method constructor <init>(Lp1/g;Landroid/content/Context;Li1/m;Lb3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/d0;->b:Lp1/g;

    iput-object p2, p0, Lo1/d0;->e:Landroid/content/Context;

    iput-object p3, p0, Lo1/d0;->f:Li1/m;

    iput-object p4, p0, Lo1/d0;->g:Lb3/b;

    invoke-direct {p0}, Lo1/d0;->k()V

    return-void
.end method

.method public static synthetic a(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->p(Lb3/q0;)V

    return-void
.end method

.method public static synthetic b(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->q(Lb3/q0;)V

    return-void
.end method

.method public static synthetic c(Lo1/d0;Lb3/v0;Lo0/h;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo1/d0;->l(Lb3/v0;Lo0/h;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lo1/d0;)Lb3/q0;
    .locals 0

    invoke-direct {p0}, Lo1/d0;->n()Lb3/q0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->o(Lb3/q0;)V

    return-void
.end method

.method public static synthetic f(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->m(Lb3/q0;)V

    return-void
.end method

.method public static synthetic g(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->r(Lb3/q0;)V

    return-void
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Lo1/d0;->d:Lp1/g$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "GrpcCallProvider"

    const-string v2, "Clearing the connectivityAttemptTimer"

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/d0;->d:Lp1/g$b;

    invoke-virtual {v0}, Lp1/g$b;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lo1/d0;->d:Lp1/g$b;

    :cond_0
    return-void
.end method

.method private j(Landroid/content/Context;Li1/m;)Lb3/q0;
    .locals 3

    :try_start_0
    invoke-static {p1}, Ll0/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ls/f; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ls/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "GrpcCallProvider"

    const-string v2, "Failed to update ssl context: %s"

    invoke-static {v0, v2, v1}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    sget-object v0, Lo1/d0;->h:Lp1/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp1/y;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb3/r0;

    goto :goto_2

    :cond_0
    invoke-virtual {p2}, Li1/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lb3/r0;->b(Ljava/lang/String;)Lb3/r0;

    move-result-object v0

    invoke-virtual {p2}, Li1/m;->d()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v0}, Lb3/r0;->d()Lb3/r0;

    :cond_1
    move-object p2, v0

    :goto_2
    const-wide/16 v0, 0x1e

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lb3/r0;->c(JLjava/util/concurrent/TimeUnit;)Lb3/r0;

    invoke-static {p2}, Lc3/a;->k(Lb3/r0;)Lc3/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc3/a;->i(Landroid/content/Context;)Lc3/a;

    move-result-object p1

    invoke-virtual {p1}, Lc3/a;->a()Lb3/q0;

    move-result-object p1

    return-object p1
.end method

.method private k()V
    .locals 2

    sget-object v0, Lp1/p;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lo1/b0;

    invoke-direct {v1, p0}, Lo1/b0;-><init>(Lo1/d0;)V

    invoke-static {v0, v1}, Lo0/k;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object v0

    iput-object v0, p0, Lo1/d0;->a:Lo0/h;

    return-void
.end method

.method private synthetic l(Lb3/v0;Lo0/h;)Lo0/h;
    .locals 1

    invoke-virtual {p2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb3/q0;

    iget-object v0, p0, Lo1/d0;->c:Lb3/c;

    invoke-virtual {p2, p1, v0}, Lb3/d;->h(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->s(Lb3/q0;)V

    return-void
.end method

.method private synthetic n()Lb3/q0;
    .locals 4

    iget-object v0, p0, Lo1/d0;->e:Landroid/content/Context;

    iget-object v1, p0, Lo1/d0;->f:Li1/m;

    invoke-direct {p0, v0, v1}, Lo1/d0;->j(Landroid/content/Context;Li1/m;)Lb3/q0;

    move-result-object v0

    iget-object v1, p0, Lo1/d0;->b:Lp1/g;

    new-instance v2, Lo1/z;

    invoke-direct {v2, p0, v0}, Lo1/z;-><init>(Lo1/d0;Lb3/q0;)V

    invoke-virtual {v1, v2}, Lp1/g;->l(Ljava/lang/Runnable;)V

    invoke-static {v0}, Lx1/o;->e(Lb3/d;)Lx1/o$b;

    move-result-object v1

    iget-object v2, p0, Lo1/d0;->g:Lb3/b;

    invoke-virtual {v1, v2}, Lh3/b;->c(Lb3/b;)Lh3/b;

    move-result-object v1

    check-cast v1, Lx1/o$b;

    iget-object v2, p0, Lo1/d0;->b:Lp1/g;

    invoke-virtual {v2}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lh3/b;->d(Ljava/util/concurrent/Executor;)Lh3/b;

    move-result-object v1

    check-cast v1, Lx1/o$b;

    invoke-virtual {v1}, Lh3/b;->b()Lb3/c;

    move-result-object v1

    iput-object v1, p0, Lo1/d0;->c:Lb3/c;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GrpcCallProvider"

    const-string v3, "Channel successfully reset."

    invoke-static {v2, v3, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method private synthetic o(Lb3/q0;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "GrpcCallProvider"

    const-string v2, "connectivityAttemptTimer elapsed. Resetting the channel."

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lo1/d0;->h()V

    invoke-direct {p0, p1}, Lo1/d0;->t(Lb3/q0;)V

    return-void
.end method

.method private synthetic p(Lb3/q0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/d0;->s(Lb3/q0;)V

    return-void
.end method

.method private synthetic q(Lb3/q0;)V
    .locals 2

    iget-object v0, p0, Lo1/d0;->b:Lp1/g;

    new-instance v1, Lo1/w;

    invoke-direct {v1, p0, p1}, Lo1/w;-><init>(Lo1/d0;Lb3/q0;)V

    invoke-virtual {v0, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic r(Lb3/q0;)V
    .locals 0

    invoke-virtual {p1}, Lb3/q0;->n()Lb3/q0;

    invoke-direct {p0}, Lo1/d0;->k()V

    return-void
.end method

.method private s(Lb3/q0;)V
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb3/q0;->k(Z)Lb3/p;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current gRPC connectivity state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "GrpcCallProvider"

    invoke-static {v4, v1, v3}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lo1/d0;->h()V

    sget-object v1, Lb3/p;->e:Lb3/p;

    if-ne v0, v1, :cond_0

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Setting the connectivityAttemptTimer"

    invoke-static {v4, v2, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lo1/d0;->b:Lp1/g;

    sget-object v2, Lp1/g$d;->n:Lp1/g$d;

    const-wide/16 v3, 0x3a98

    new-instance v5, Lo1/y;

    invoke-direct {v5, p0, p1}, Lo1/y;-><init>(Lo1/d0;Lb3/q0;)V

    invoke-virtual {v1, v2, v3, v4, v5}, Lp1/g;->k(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;

    move-result-object v1

    iput-object v1, p0, Lo1/d0;->d:Lp1/g$b;

    :cond_0
    new-instance v1, Lo1/x;

    invoke-direct {v1, p0, p1}, Lo1/x;-><init>(Lo1/d0;Lb3/q0;)V

    invoke-virtual {p1, v0, v1}, Lb3/q0;->l(Lb3/p;Ljava/lang/Runnable;)V

    return-void
.end method

.method private t(Lb3/q0;)V
    .locals 2

    iget-object v0, p0, Lo1/d0;->b:Lp1/g;

    new-instance v1, Lo1/a0;

    invoke-direct {v1, p0, p1}, Lo1/a0;-><init>(Lo1/d0;Lb3/q0;)V

    invoke-virtual {v0, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method i(Lb3/v0;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;)",
            "Lo0/h<",
            "Lb3/g<",
            "TReqT;TRespT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lo1/d0;->a:Lo0/h;

    iget-object v1, p0, Lo1/d0;->b:Lp1/g;

    invoke-virtual {v1}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lo1/c0;

    invoke-direct {v2, p0, p1}, Lo1/c0;-><init>(Lo1/d0;Lb3/v0;)V

    invoke-virtual {v0, v1, v2}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method u()V
    .locals 7

    const-class v0, Lo1/u;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lo1/d0;->a:Lo0/h;

    invoke-static {v2}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/q0;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v2}, Lb3/q0;->m()Lb3/q0;

    const-wide/16 v3, 0x1

    :try_start_1
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lb3/q0;->i(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown."

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v6}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Lb3/q0;->n()Lb3/q0;

    const-wide/16 v3, 0x3c

    invoke-virtual {v2, v3, v4, v5}, Lb3/q0;->i(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Unable to forcefully shutdown the gRPC ManagedChannel."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {v2}, Lb3/q0;->n()Lb3/q0;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Interrupted while shutting down the gRPC Managed Channel"

    invoke-static {v0, v2, v1}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    :goto_0
    return-void

    :catch_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Interrupted while retrieving the gRPC Managed Channel"

    invoke-static {v0, v2, v1}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :catch_2
    move-exception v2

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v1

    const-string v1, "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s"

    invoke-static {v0, v1, v3}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
