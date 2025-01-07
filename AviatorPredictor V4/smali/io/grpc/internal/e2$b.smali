.class Lio/grpc/internal/e2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/e2;->g(Lio/grpc/internal/e2$d;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/e2$c;

.field final synthetic f:Lio/grpc/internal/e2$d;

.field final synthetic g:Ljava/lang/Object;

.field final synthetic h:Lio/grpc/internal/e2;


# direct methods
.method constructor <init>(Lio/grpc/internal/e2;Lio/grpc/internal/e2$c;Lio/grpc/internal/e2$d;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    iput-object p2, p0, Lio/grpc/internal/e2$b;->e:Lio/grpc/internal/e2$c;

    iput-object p3, p0, Lio/grpc/internal/e2$b;->f:Lio/grpc/internal/e2$d;

    iput-object p4, p0, Lio/grpc/internal/e2$b;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/e2$b;->e:Lio/grpc/internal/e2$c;

    iget v1, v1, Lio/grpc/internal/e2$c;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, Lio/grpc/internal/e2$b;->f:Lio/grpc/internal/e2$d;

    iget-object v3, p0, Lio/grpc/internal/e2$b;->g:Ljava/lang/Object;

    invoke-interface {v2, v3}, Lio/grpc/internal/e2$d;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v2, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v2}, Lio/grpc/internal/e2;->a(Lio/grpc/internal/e2;)Ljava/util/IdentityHashMap;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/e2$b;->f:Lio/grpc/internal/e2$d;

    invoke-virtual {v2, v3}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v2}, Lio/grpc/internal/e2;->a(Lio/grpc/internal/e2;)Ljava/util/IdentityHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v2}, Lio/grpc/internal/e2;->b(Lio/grpc/internal/e2;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    iget-object v2, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v2, v1}, Lio/grpc/internal/e2;->c(Lio/grpc/internal/e2;Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v3}, Lio/grpc/internal/e2;->a(Lio/grpc/internal/e2;)Ljava/util/IdentityHashMap;

    move-result-object v3

    iget-object v4, p0, Lio/grpc/internal/e2$b;->f:Lio/grpc/internal/e2$d;

    invoke-virtual {v3, v4}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v3}, Lio/grpc/internal/e2;->a(Lio/grpc/internal/e2;)Ljava/util/IdentityHashMap;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v3}, Lio/grpc/internal/e2;->b(Lio/grpc/internal/e2;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    iget-object v3, p0, Lio/grpc/internal/e2$b;->h:Lio/grpc/internal/e2;

    invoke-static {v3, v1}, Lio/grpc/internal/e2;->c(Lio/grpc/internal/e2;Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    :cond_0
    throw v2

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
