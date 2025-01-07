.class final Ld3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/a$d;
    }
.end annotation


# instance fields
.field private final e:Ljava/lang/Object;

.field private final f:Lh4/c;

.field private final g:Lio/grpc/internal/c2;

.field private final h:Ld3/b$a;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lh4/m;

.field private m:Ljava/net/Socket;


# direct methods
.method private constructor <init>(Lio/grpc/internal/c2;Ld3/b$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ld3/a;->e:Ljava/lang/Object;

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    iput-object v0, p0, Ld3/a;->f:Lh4/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld3/a;->i:Z

    iput-boolean v0, p0, Ld3/a;->j:Z

    iput-boolean v0, p0, Ld3/a;->k:Z

    const-string v0, "executor"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/c2;

    iput-object p1, p0, Ld3/a;->g:Lio/grpc/internal/c2;

    const-string p1, "exceptionHandler"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/b$a;

    iput-object p1, p0, Ld3/a;->h:Ld3/b$a;

    return-void
.end method

.method static synthetic a(Ld3/a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld3/a;->e:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Ld3/a;)Lh4/c;
    .locals 0

    iget-object p0, p0, Ld3/a;->f:Lh4/c;

    return-object p0
.end method

.method static synthetic e(Ld3/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Ld3/a;->i:Z

    return p1
.end method

.method static synthetic h(Ld3/a;)Lh4/m;
    .locals 0

    iget-object p0, p0, Ld3/a;->l:Lh4/m;

    return-object p0
.end method

.method static synthetic i(Ld3/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Ld3/a;->j:Z

    return p1
.end method

.method static synthetic k(Ld3/a;)Ld3/b$a;
    .locals 0

    iget-object p0, p0, Ld3/a;->h:Ld3/b$a;

    return-object p0
.end method

.method static synthetic l(Ld3/a;)Ljava/net/Socket;
    .locals 0

    iget-object p0, p0, Ld3/a;->m:Ljava/net/Socket;

    return-object p0
.end method

.method static r(Lio/grpc/internal/c2;Ld3/b$a;)Ld3/a;
    .locals 1

    new-instance v0, Ld3/a;

    invoke-direct {v0, p0, p1}, Ld3/a;-><init>(Lio/grpc/internal/c2;Ld3/b$a;)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, Ld3/a;->k:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/a;->k:Z

    iget-object v0, p0, Ld3/a;->g:Lio/grpc/internal/c2;

    new-instance v1, Ld3/a$c;

    invoke-direct {v1, p0}, Ld3/a$c;-><init>(Ld3/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public flush()V
    .locals 2

    iget-boolean v0, p0, Ld3/a;->k:Z

    if-nez v0, :cond_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lj3/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ld3/a;->e:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Ld3/a;->j:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_2
    iput-boolean v1, p0, Ld3/a;->j:Z

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Ld3/a;->g:Lio/grpc/internal/c2;

    new-instance v1, Ld3/a$b;

    invoke-direct {v1, p0}, Ld3/a$b;-><init>(Ld3/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    const-string v1, "AsyncSink.flush"

    invoke-static {v1}, Lj3/c;->h(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method n(Lh4/m;Ljava/net/Socket;)V
    .locals 2

    iget-object v0, p0, Ld3/a;->l:Lh4/m;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "AsyncSink\'s becomeConnected should only be called once."

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "sink"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh4/m;

    iput-object p1, p0, Ld3/a;->l:Lh4/m;

    const-string p1, "socket"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/Socket;

    iput-object p1, p0, Ld3/a;->m:Ljava/net/Socket;

    return-void
.end method

.method public w(Lh4/c;J)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Ld3/a;->k:Z

    if-nez v0, :cond_2

    const-string v0, "AsyncSink.write"

    invoke-static {v0}, Lj3/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ld3/a;->e:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Ld3/a;->f:Lh4/c;

    invoke-virtual {v1, p1, p2, p3}, Lh4/c;->w(Lh4/c;J)V

    iget-boolean p1, p0, Ld3/a;->i:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ld3/a;->j:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ld3/a;->f:Lh4/c;

    invoke-virtual {p1}, Lh4/c;->h()J

    move-result-wide p1

    const-wide/16 v1, 0x0

    cmp-long p3, p1, v1

    if-gtz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ld3/a;->i:Z

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object p1, p0, Ld3/a;->g:Lio/grpc/internal/c2;

    new-instance p2, Ld3/a$a;

    invoke-direct {p2, p0}, Ld3/a$a;-><init>(Ld3/a;)V

    invoke-virtual {p1, p2}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    const-string p2, "AsyncSink.write"

    invoke-static {p2}, Lj3/c;->h(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
