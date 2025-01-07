.class final Lio/grpc/internal/k1$d;
.super Ljava/io/FilterInputStream;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final e:I

.field private final f:Lio/grpc/internal/h2;

.field private g:J

.field private h:J

.field private i:J


# direct methods
.method constructor <init>(Ljava/io/InputStream;ILio/grpc/internal/h2;)V
    .locals 2

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lio/grpc/internal/k1$d;->i:J

    iput p2, p0, Lio/grpc/internal/k1$d;->e:I

    iput-object p3, p0, Lio/grpc/internal/k1$d;->f:Lio/grpc/internal/h2;

    return-void
.end method

.method private a()V
    .locals 5

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    iget-wide v2, p0, Lio/grpc/internal/k1$d;->g:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v4, p0, Lio/grpc/internal/k1$d;->f:Lio/grpc/internal/h2;

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lio/grpc/internal/h2;->f(J)V

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    iput-wide v0, p0, Lio/grpc/internal/k1$d;->g:J

    :cond_0
    return-void
.end method

.method private d()V
    .locals 6

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    iget v2, p0, Lio/grpc/internal/k1$d;->e:I

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-gtz v5, :cond_0

    return-void

    :cond_0
    sget-object v0, Lb3/f1;->o:Lb3/f1;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    const-string v2, "Decompressed gRPC message exceeds maximum size %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1;->d()Lb3/h1;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public declared-synchronized mark(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    iput-wide v0, p0, Lio/grpc/internal/k1$d;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public read()I
    .locals 5

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-wide v1, p0, Lio/grpc/internal/k1$d;->h:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lio/grpc/internal/k1$d;->h:J

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1$d;->d()V

    invoke-direct {p0}, Lio/grpc/internal/k1$d;->a()V

    return v0
.end method

.method public read([BII)I
    .locals 2

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lio/grpc/internal/k1$d;->h:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lio/grpc/internal/k1$d;->h:J

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1$d;->d()V

    invoke-direct {p0}, Lio/grpc/internal/k1$d;->a()V

    return p1
.end method

.method public declared-synchronized reset()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->i:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->i:J

    iput-wide v0, p0, Lio/grpc/internal/k1$d;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Mark not set"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Mark not supported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public skip(J)J
    .locals 2

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    iget-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lio/grpc/internal/k1$d;->h:J

    invoke-direct {p0}, Lio/grpc/internal/k1$d;->d()V

    invoke-direct {p0}, Lio/grpc/internal/k1$d;->a()V

    return-wide p1
.end method
