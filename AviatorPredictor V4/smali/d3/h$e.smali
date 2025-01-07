.class Ld3/h$e;
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

    iput-object p1, p0, Ld3/h$e;->e:Ld3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ld3/h$e;->e:Ld3/h;

    invoke-static {v0}, Ld3/h;->M(Ld3/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Ld3/h$e;->e:Ld3/h;

    invoke-static {v1}, Ld3/h;->I(Ld3/h;)Ld3/h$f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Ld3/h$e;->e:Ld3/h;

    invoke-static {v0}, Ld3/h;->i(Ld3/h;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h$e;->e:Ld3/h;

    const v2, 0x7fffffff

    invoke-static {v1, v2}, Ld3/h;->N(Ld3/h;I)I

    iget-object v1, p0, Ld3/h$e;->e:Ld3/h;

    invoke-static {v1}, Ld3/h;->O(Ld3/h;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
