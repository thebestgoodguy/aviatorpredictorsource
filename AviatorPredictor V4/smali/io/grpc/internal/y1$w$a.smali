.class Lio/grpc/internal/y1$w$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1$w;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/y1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1$w;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v0, v0, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->Q(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v1

    iget v1, v1, Lio/grpc/internal/y1$z;->e:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lio/grpc/internal/y1;->S(Lio/grpc/internal/y1;IZ)Lio/grpc/internal/y1$b0;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->T(Lio/grpc/internal/y1;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->e:Lio/grpc/internal/y1$u;

    invoke-virtual {v3}, Lio/grpc/internal/y1$u;->a()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->Q(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v5

    invoke-virtual {v5, v0}, Lio/grpc/internal/y1$z;->a(Lio/grpc/internal/y1$b0;)Lio/grpc/internal/y1$z;

    move-result-object v5

    invoke-static {v3, v5}, Lio/grpc/internal/y1;->R(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Lio/grpc/internal/y1$z;

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->Q(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v5

    invoke-static {v3, v5}, Lio/grpc/internal/y1;->U(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->V(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$c0;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->V(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$c0;

    move-result-object v3

    invoke-virtual {v3}, Lio/grpc/internal/y1$c0;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    new-instance v4, Lio/grpc/internal/y1$u;

    invoke-static {v3}, Lio/grpc/internal/y1;->T(Lio/grpc/internal/y1;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/grpc/internal/y1$u;-><init>(Ljava/lang/Object;)V

    :goto_0
    invoke-static {v3, v4}, Lio/grpc/internal/y1;->W(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)Lio/grpc/internal/y1$u;

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->Q(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v5

    invoke-virtual {v5}, Lio/grpc/internal/y1$z;->d()Lio/grpc/internal/y1$z;

    move-result-object v5

    invoke-static {v3, v5}, Lio/grpc/internal/y1;->R(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Lio/grpc/internal/y1$z;

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    goto :goto_0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    iget-object v0, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    sget-object v1, Lb3/f1;->g:Lb3/f1;

    const-string v2, "Unneeded hedging"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/grpc/internal/q;->c(Lb3/f1;)V

    return-void

    :cond_3
    if-eqz v4, :cond_4

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->s(Lio/grpc/internal/y1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/y1$w;

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-direct {v2, v3, v4}, Lio/grpc/internal/y1$w;-><init>(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)V

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->X(Lio/grpc/internal/y1;)Lio/grpc/internal/s0;

    move-result-object v3

    iget-wide v5, v3, Lio/grpc/internal/s0;->b:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v5, v6, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    invoke-virtual {v4, v1}, Lio/grpc/internal/y1$u;->c(Ljava/util/concurrent/Future;)V

    :cond_4
    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->e:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->f:Lio/grpc/internal/y1;

    invoke-static {v1, v0}, Lio/grpc/internal/y1;->u(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
