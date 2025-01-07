.class public final Lo0/k;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lo0/h;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/h<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-static {}, Lw/r;->g()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lo0/h;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lo0/k;->g(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lo0/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo0/m;-><init>(Lo0/l;)V

    invoke-static {p0, v0}, Lo0/k;->h(Lo0/h;Lo0/n;)V

    invoke-virtual {v0}, Lo0/m;->a()V

    invoke-static {p0}, Lo0/k;->g(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    new-instance v1, Lo0/g0;

    invoke-direct {v1, v0, p1}, Lo0/g0;-><init>(Lo0/f0;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Exception;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    invoke-virtual {v0, p0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    invoke-virtual {v0, p0}, Lo0/f0;->r(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Ljava/util/Collection;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lo0/h<",
            "*>;>;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/h;

    const-string v2, "null tasks are not accepted"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lo0/f0;

    invoke-direct {v0}, Lo0/f0;-><init>()V

    new-instance v1, Lo0/o;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Lo0/o;-><init>(ILo0/f0;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/h;

    invoke-static {v2, v1}, Lo0/k;->h(Lo0/h;Lo0/n;)V

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    invoke-static {p0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static varargs f([Lo0/h;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lo0/h<",
            "*>;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->e(Ljava/util/Collection;)Lo0/h;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lo0/h;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/h<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-virtual {p0}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lo0/h;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static h(Lo0/h;Lo0/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/h<",
            "TT;>;",
            "Lo0/n<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lo0/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lo0/h;->f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;

    invoke-virtual {p0, v0, p1}, Lo0/h;->d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;

    invoke-virtual {p0, v0, p1}, Lo0/h;->a(Ljava/util/concurrent/Executor;Lo0/c;)Lo0/h;

    return-void
.end method
