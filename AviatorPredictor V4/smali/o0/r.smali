.class final Lo0/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lo0/h;

.field final synthetic f:Lo0/s;


# direct methods
.method constructor <init>(Lo0/s;Lo0/h;)V
    .locals 0

    iput-object p1, p0, Lo0/r;->f:Lo0/s;

    iput-object p2, p0, Lo0/r;->e:Lo0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lo0/r;->f:Lo0/s;

    invoke-static {v0}, Lo0/s;->e(Lo0/s;)Lo0/a;

    move-result-object v0

    iget-object v1, p0, Lo0/r;->e:Lo0/h;

    invoke-interface {v0, v1}, Lo0/a;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/h;
    :try_end_0
    .catch Lo0/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo0/r;->f:Lo0/s;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo0/s;->c(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v1, Lo0/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lo0/r;->f:Lo0/s;

    invoke-virtual {v0, v1, v2}, Lo0/h;->f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;

    iget-object v2, p0, Lo0/r;->f:Lo0/s;

    invoke-virtual {v0, v1, v2}, Lo0/h;->d(Ljava/util/concurrent/Executor;Lo0/e;)Lo0/h;

    iget-object v2, p0, Lo0/r;->f:Lo0/s;

    invoke-virtual {v0, v1, v2}, Lo0/h;->a(Ljava/util/concurrent/Executor;Lo0/c;)Lo0/h;

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lo0/r;->f:Lo0/s;

    invoke-static {v1}, Lo0/s;->f(Lo0/s;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo0/r;->f:Lo0/s;

    invoke-static {v1}, Lo0/s;->f(Lo0/s;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lo0/r;->f:Lo0/s;

    invoke-static {v1}, Lo0/s;->f(Lo0/s;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void
.end method
