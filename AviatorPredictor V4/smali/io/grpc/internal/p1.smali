.class final Lio/grpc/internal/p1;
.super Lb3/q0;
.source ""

# interfaces
.implements Lb3/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb3/q0;",
        "Lb3/g0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:Ljava/util/logging/Logger;


# instance fields
.field private a:Lio/grpc/internal/x0;

.field private final b:Lb3/h0;

.field private final c:Ljava/lang/String;

.field private final d:Lio/grpc/internal/a0;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Ljava/util/concurrent/ScheduledExecutorService;

.field private final g:Ljava/util/concurrent/CountDownLatch;

.field private volatile h:Z

.field private final i:Lio/grpc/internal/m;

.field private final j:Lio/grpc/internal/p$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lio/grpc/internal/p1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p1;->k:Ljava/util/logging/Logger;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lb3/h0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->b:Lb3/h0;

    return-object v0
.end method

.method public h(Lb3/v0;Lb3/c;)Lb3/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TRequestT;TResponseT;>;",
            "Lb3/c;",
            ")",
            "Lb3/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    new-instance v8, Lio/grpc/internal/p;

    invoke-virtual {p2}, Lb3/c;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/p1;->e:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lb3/c;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    :goto_0
    move-object v2, v0

    iget-object v4, p0, Lio/grpc/internal/p1;->j:Lio/grpc/internal/p$e;

    iget-object v5, p0, Lio/grpc/internal/p1;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v6, p0, Lio/grpc/internal/p1;->i:Lio/grpc/internal/m;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/p;-><init>(Lb3/v0;Ljava/util/concurrent/Executor;Lb3/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Lb3/e0;)V

    return-object v8
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->g:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public k(Z)Lb3/p;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/p1;->a:Lio/grpc/internal/x0;

    if-nez p1, :cond_0

    sget-object p1, Lb3/p;->h:Lb3/p;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lio/grpc/internal/x0;->M()Lb3/p;

    move-result-object p1

    return-object p1
.end method

.method public m()Lb3/q0;
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/p1;->h:Z

    iget-object v0, p0, Lio/grpc/internal/p1;->d:Lio/grpc/internal/a0;

    sget-object v1, Lb3/f1;->u:Lb3/f1;

    const-string v2, "OobChannel.shutdown() called"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/grpc/internal/a0;->f(Lb3/f1;)V

    return-object p0
.end method

.method public n()Lb3/q0;
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/p1;->h:Z

    iget-object v0, p0, Lio/grpc/internal/p1;->d:Lio/grpc/internal/a0;

    sget-object v1, Lb3/f1;->u:Lb3/f1;

    const-string v2, "OobChannel.shutdownNow() called"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/grpc/internal/a0;->a(Lb3/f1;)V

    return-object p0
.end method

.method o()Lio/grpc/internal/x0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/p1;->a:Lio/grpc/internal/x0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/p1;->b:Lb3/h0;

    invoke-virtual {v1}, Lb3/h0;->d()J

    move-result-wide v1

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Lq0/h$b;->c(Ljava/lang/String;J)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/p1;->c:Ljava/lang/String;

    const-string v2, "authority"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
