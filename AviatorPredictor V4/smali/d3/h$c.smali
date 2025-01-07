.class Ld3/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/h;->e(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Ld3/h;


# direct methods
.method constructor <init>(Ld3/h;)V
    .locals 0

    iput-object p1, p0, Ld3/h$c;->e:Ld3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ld3/h$c;->e:Ld3/h;

    iget-object v0, v0, Ld3/h;->V:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object v0, p0, Ld3/h$c;->e:Ld3/h;

    new-instance v1, Ld3/h$f;

    invoke-static {v0}, Ld3/h;->K(Ld3/h;)Lf3/b;

    move-result-object v2

    iget-object v3, p0, Ld3/h$c;->e:Ld3/h;

    invoke-static {v3}, Ld3/h;->L(Ld3/h;)Ld3/i;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Ld3/h$f;-><init>(Ld3/h;Lf3/b;Ld3/i;)V

    invoke-static {v0, v1}, Ld3/h;->J(Ld3/h;Ld3/h$f;)Ld3/h$f;

    iget-object v0, p0, Ld3/h$c;->e:Ld3/h;

    invoke-static {v0}, Ld3/h;->M(Ld3/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Ld3/h$c;->e:Ld3/h;

    invoke-static {v1}, Ld3/h;->I(Ld3/h;)Ld3/h$f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Ld3/h$c;->e:Ld3/h;

    invoke-static {v0}, Ld3/h;->i(Ld3/h;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h$c;->e:Ld3/h;

    const v2, 0x7fffffff

    invoke-static {v1, v2}, Ld3/h;->N(Ld3/h;I)I

    iget-object v1, p0, Ld3/h$c;->e:Ld3/h;

    invoke-static {v1}, Ld3/h;->O(Ld3/h;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ld3/h$c;->e:Ld3/h;

    iget-object v0, v0, Ld3/h;->W:Lv0/d;

    const/4 v0, 0x0

    throw v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
