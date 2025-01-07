.class public Lp1/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/g$c;,
        Lp1/g$b;,
        Lp1/g$d;
    }
.end annotation


# instance fields
.field private final a:Lp1/g$c;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp1/g$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp1/g$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp1/g;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp1/g;->b:Ljava/util/ArrayList;

    new-instance v0, Lp1/g$c;

    invoke-direct {v0, p0}, Lp1/g$c;-><init>(Lp1/g;)V

    iput-object v0, p0, Lp1/g;->a:Lp1/g$c;

    return-void
.end method

.method public static synthetic a(Lo0/i;Lo0/h;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lp1/g;->q(Lo0/i;Lo0/h;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Lp1/g;->s(Ljava/lang/Runnable;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lp1/g;->r(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lp1/g;->t(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic e(Lp1/g;)Lp1/g$c;
    .locals 0

    iget-object p0, p0, Lp1/g;->a:Lp1/g$c;

    return-object p0
.end method

.method static synthetic f(Lp1/g;Lp1/g$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lp1/g;->v(Lp1/g$b;)V

    return-void
.end method

.method public static g(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "Lo0/h<",
            "TTResult;>;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    new-instance v1, Lp1/d;

    invoke-direct {v1, p1, p0, v0}, Lp1/d;-><init>(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method private h(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;
    .locals 9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long v5, v0, p2

    new-instance v0, Lp1/g$b;

    const/4 v8, 0x0

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v7, p4

    invoke-direct/range {v2 .. v8}, Lp1/g$b;-><init>(Lp1/g;Lp1/g$d;JLjava/lang/Runnable;Lp1/g$a;)V

    invoke-static {v0, p2, p3}, Lp1/g$b;->b(Lp1/g$b;J)V

    return-object v0
.end method

.method private static synthetic q(Lo0/i;Lo0/h;)Ljava/lang/Void;
    .locals 1

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic r(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V
    .locals 1

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/h;

    new-instance v0, Lp1/f;

    invoke-direct {v0, p2}, Lp1/f;-><init>(Lo0/i;)V

    invoke-virtual {p0, p1, v0}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unhandled throwable in callTask."

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p2, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic s(Ljava/lang/Runnable;)Ljava/lang/Void;
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic t(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p0, Ljava/lang/OutOfMemoryError;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "Firestore (24.2.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data."

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/OutOfMemoryError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Internal error in Cloud Firestore (24.2.1)."

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private v(Lp1/g$b;)V
    .locals 2

    iget-object v0, p0, Lp1/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Delayed task not found."

    invoke-static {p1, v1, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public i(Ljava/lang/Runnable;)Lo0/h;
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

    new-instance v0, Lp1/e;

    invoke-direct {v0, p1}, Lp1/e;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lp1/g;->j(Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/concurrent/Callable;)Lo0/h;
    .locals 1
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

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v0, p1}, Lp1/g$c;->f(Lp1/g$c;Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public k(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;
    .locals 1

    iget-object v0, p0, Lp1/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lp1/g;->h(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;

    move-result-object p1

    iget-object p2, p0, Lp1/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public l(Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lp1/g;->i(Ljava/lang/Runnable;)Lo0/h;

    return-void
.end method

.method public m(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    invoke-virtual {v0, p1}, Lp1/g$c;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n(Ljava/lang/Runnable;)Lo0/h;
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

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v0, p1}, Lp1/g$c;->g(Lp1/g$c;Ljava/lang/Runnable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public o()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v0}, Lp1/g$c;->h(Lp1/g$c;)Z

    move-result v0

    return v0
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v0}, Lp1/g$c;->i(Lp1/g$c;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lp1/c;

    invoke-direct {v1, p1}, Lp1/c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w()V
    .locals 5

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v1}, Lp1/g$c;->e(Lp1/g$c;)Ljava/lang/Thread;

    move-result-object v1

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v3}, Lp1/g$c;->e(Lp1/g$c;)Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lp1/g;->a:Lp1/g$c;

    invoke-static {v3}, Lp1/g$c;->e(Lp1/g$c;)Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d"

    invoke-static {v0, v1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object v0

    throw v0
.end method
