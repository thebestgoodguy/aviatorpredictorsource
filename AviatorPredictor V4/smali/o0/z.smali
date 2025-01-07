.class final Lo0/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lo0/h;

.field final synthetic f:Lo0/a0;


# direct methods
.method constructor <init>(Lo0/a0;Lo0/h;)V
    .locals 0

    iput-object p1, p0, Lo0/z;->f:Lo0/a0;

    iput-object p2, p0, Lo0/z;->e:Lo0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lo0/z;->f:Lo0/a0;

    invoke-static {v0}, Lo0/a0;->c(Lo0/a0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/z;->f:Lo0/a0;

    invoke-static {v1}, Lo0/a0;->b(Lo0/a0;)Lo0/f;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lo0/a0;->b(Lo0/a0;)Lo0/f;

    move-result-object v1

    iget-object v2, p0, Lo0/z;->e:Lo0/h;

    invoke-virtual {v2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lo0/f;->d(Ljava/lang/Object;)V

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
