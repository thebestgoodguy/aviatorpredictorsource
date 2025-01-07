.class final Lio/grpc/internal/c2$d;
.super Lio/grpc/internal/c2$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/grpc/internal/c2$b;-><init>(Lio/grpc/internal/c2$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/c2$a;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/c2$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/grpc/internal/c2;II)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lio/grpc/internal/c2;->a(Lio/grpc/internal/c2;)I

    move-result v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lio/grpc/internal/c2;->b(Lio/grpc/internal/c2;I)I

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Lio/grpc/internal/c2;I)V
    .locals 0

    monitor-enter p1

    :try_start_0
    invoke-static {p1, p2}, Lio/grpc/internal/c2;->b(Lio/grpc/internal/c2;I)I

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
