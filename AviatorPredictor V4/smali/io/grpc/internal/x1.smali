.class final Lio/grpc/internal/x1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/x1$b;,
        Lio/grpc/internal/x1$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/lang/Runnable;

.field private final d:Lq0/n;

.field private e:J

.field private f:Z

.field private g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lq0/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/x1;->c:Ljava/lang/Runnable;

    iput-object p2, p0, Lio/grpc/internal/x1;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lio/grpc/internal/x1;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lio/grpc/internal/x1;->d:Lq0/n;

    invoke-virtual {p4}, Lq0/n;->g()Lq0/n;

    return-void
.end method

.method static synthetic a(Lio/grpc/internal/x1;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x1;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic b(Lio/grpc/internal/x1;)Z
    .locals 0

    iget-boolean p0, p0, Lio/grpc/internal/x1;->f:Z

    return p0
.end method

.method static synthetic c(Lio/grpc/internal/x1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/grpc/internal/x1;->f:Z

    return p1
.end method

.method static synthetic d(Lio/grpc/internal/x1;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    return-object p1
.end method

.method static synthetic e(Lio/grpc/internal/x1;)J
    .locals 2

    invoke-direct {p0}, Lio/grpc/internal/x1;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic f(Lio/grpc/internal/x1;)J
    .locals 2

    iget-wide v0, p0, Lio/grpc/internal/x1;->e:J

    return-wide v0
.end method

.method static synthetic g(Lio/grpc/internal/x1;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x1;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic h(Lio/grpc/internal/x1;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x1;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method private j()J
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x1;->d:Lq0/n;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lq0/n;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method i(Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/grpc/internal/x1;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method k(JLjava/util/concurrent/TimeUnit;)V
    .locals 6

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-direct {p0}, Lio/grpc/internal/x1;->j()J

    move-result-wide v0

    add-long/2addr v0, p1

    const/4 p3, 0x1

    iput-boolean p3, p0, Lio/grpc/internal/x1;->f:Z

    iget-wide v2, p0, Lio/grpc/internal/x1;->e:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x0

    cmp-long p3, v2, v4

    if-ltz p3, :cond_0

    iget-object p3, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    if-nez p3, :cond_2

    :cond_0
    iget-object p3, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p3, :cond_1

    const/4 v2, 0x0

    invoke-interface {p3, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object p3, p0, Lio/grpc/internal/x1;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lio/grpc/internal/x1$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/grpc/internal/x1$c;-><init>(Lio/grpc/internal/x1;Lio/grpc/internal/x1$a;)V

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p3, v2, p1, p2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/x1;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_2
    iput-wide v0, p0, Lio/grpc/internal/x1;->e:J

    return-void
.end method
