.class final Lo0/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lo0/h;

.field final synthetic f:Lo0/y;


# direct methods
.method constructor <init>(Lo0/y;Lo0/h;)V
    .locals 0

    iput-object p1, p0, Lo0/x;->f:Lo0/y;

    iput-object p2, p0, Lo0/x;->e:Lo0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lo0/x;->f:Lo0/y;

    invoke-static {v0}, Lo0/y;->c(Lo0/y;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/x;->f:Lo0/y;

    invoke-static {v1}, Lo0/y;->b(Lo0/y;)Lo0/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lo0/y;->b(Lo0/y;)Lo0/e;

    move-result-object v1

    iget-object v2, p0, Lo0/x;->e:Lo0/h;

    invoke-virtual {v2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-interface {v1, v2}, Lo0/e;->c(Ljava/lang/Exception;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
