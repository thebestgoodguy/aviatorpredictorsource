.class final Lo0/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lo0/h;

.field final synthetic f:Lo0/q;


# direct methods
.method constructor <init>(Lo0/q;Lo0/h;)V
    .locals 0

    iput-object p1, p0, Lo0/p;->f:Lo0/q;

    iput-object p2, p0, Lo0/p;->e:Lo0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo0/p;->e:Lo0/h;

    invoke-virtual {v0}, Lo0/h;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v0}, Lo0/q;->c(Lo0/q;)Lo0/f0;

    move-result-object v0

    invoke-virtual {v0}, Lo0/f0;->s()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v0}, Lo0/q;->b(Lo0/q;)Lo0/a;

    move-result-object v0

    iget-object v1, p0, Lo0/p;->e:Lo0/h;

    invoke-interface {v0, v1}, Lo0/a;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lo0/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v1}, Lo0/q;->c(Lo0/q;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo0/f0;->r(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v1}, Lo0/q;->c(Lo0/q;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v1}, Lo0/q;->c(Lo0/q;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lo0/p;->f:Lo0/q;

    invoke-static {v1}, Lo0/q;->c(Lo0/q;)Lo0/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void
.end method
