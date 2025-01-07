.class Lio/grpc/internal/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/b0$o;
    }
.end annotation


# instance fields
.field private volatile a:Z

.field private b:Lio/grpc/internal/r;

.field private c:Lio/grpc/internal/q;

.field private d:Lb3/f1;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lio/grpc/internal/b0$o;

.field private g:J

.field private h:J

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    return-void
.end method

.method static synthetic o(Lio/grpc/internal/b0;)Lio/grpc/internal/q;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    return-object p0
.end method

.method static synthetic r(Lio/grpc/internal/b0;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/b0;->t()V

    return-void
.end method

.method private s(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private t()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    iget-object v0, p0, Lio/grpc/internal/b0;->f:Lio/grpc/internal/b0$o;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/b0$o;->g()V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    iput-object v0, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private u(Lio/grpc/internal/r;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->i(Lio/grpc/internal/r;)V

    return-void
.end method

.method private w(Lio/grpc/internal/q;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "realStream already set to %s"

    invoke-static {v1, v2, v0}, Lq0/l;->w(ZLjava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lio/grpc/internal/b0;->h:J

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$g;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$g;-><init>(Lio/grpc/internal/b0;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lb3/n;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "compressor"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$c;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$c;-><init>(Lio/grpc/internal/b0;Lb3/n;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lb3/f1;)V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "May only be called after start"

    invoke-static {v0, v3}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "reason"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    if-nez v0, :cond_1

    sget-object v0, Lio/grpc/internal/n1;->a:Lio/grpc/internal/n1;

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->w(Lio/grpc/internal/q;)V

    iput-object p1, p0, Lio/grpc/internal/b0;->d:Lb3/f1;

    const/4 v1, 0x0

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    new-instance v0, Lio/grpc/internal/b0$m;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/b0$m;-><init>(Lio/grpc/internal/b0;Lb3/f1;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->s(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lio/grpc/internal/b0;->t()V

    invoke-virtual {p0, p1}, Lio/grpc/internal/b0;->v(Lb3/f1;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    sget-object v1, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    new-instance v2, Lb3/u0;

    invoke-direct {v2}, Lb3/u0;-><init>()V

    invoke-interface {v0, p1, v1, v2}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d(I)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->d(I)V

    goto :goto_1

    :cond_1
    new-instance v0, Lio/grpc/internal/b0$a;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/b0$a;-><init>(Lio/grpc/internal/b0;I)V

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->s(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public e(I)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$f;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$f;-><init>(Lio/grpc/internal/b0;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0}, Lio/grpc/internal/i2;->f()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public flush()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0}, Lio/grpc/internal/i2;->flush()V

    goto :goto_1

    :cond_1
    new-instance v0, Lio/grpc/internal/b0$l;

    invoke-direct {v0, p0}, Lio/grpc/internal/b0$l;-><init>(Lio/grpc/internal/b0;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->s(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public g(Lb3/t;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$h;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$h;-><init>(Lio/grpc/internal/b0;Lb3/t;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Ljava/io/InputStream;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->h(Ljava/io/InputStream;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lio/grpc/internal/b0$k;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/b0$k;-><init>(Lio/grpc/internal/b0;Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->s(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public i(Lio/grpc/internal/r;)V
    .locals 4

    const-string v0, "listener"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "already started"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/b0;->d:Lb3/f1;

    iget-boolean v1, p0, Lio/grpc/internal/b0;->a:Z

    if-nez v1, :cond_1

    new-instance v2, Lio/grpc/internal/b0$o;

    invoke-direct {v2, p1}, Lio/grpc/internal/b0$o;-><init>(Lio/grpc/internal/r;)V

    iput-object v2, p0, Lio/grpc/internal/b0;->f:Lio/grpc/internal/b0$o;

    move-object p1, v2

    :cond_1
    iput-object p1, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, p0, Lio/grpc/internal/b0;->g:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    sget-object v1, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    new-instance v2, Lb3/u0;

    invoke-direct {v2}, Lb3/u0;-><init>()V

    invoke-interface {p1, v0, v1, v2}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    invoke-direct {p0, p1}, Lio/grpc/internal/b0;->u(Lio/grpc/internal/r;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "authority"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$j;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$j;-><init>(Lio/grpc/internal/b0;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Lb3/v;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "decompressorRegistry"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$e;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$e;-><init>(Lio/grpc/internal/b0;Lb3/v;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l(Lio/grpc/internal/w0;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    if-eqz v0, :cond_1

    const-string v0, "buffered_nanos"

    iget-wide v1, p0, Lio/grpc/internal/b0;->h:J

    iget-wide v3, p0, Lio/grpc/internal/b0;->g:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->l(Lio/grpc/internal/w0;)V

    goto :goto_0

    :cond_1
    const-string v0, "buffered_nanos"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, p0, Lio/grpc/internal/b0;->g:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/grpc/internal/w0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/w0;

    const-string v0, "waiting_for_connection"

    invoke-virtual {p1, v0}, Lio/grpc/internal/w0;->a(Ljava/lang/Object;)Lio/grpc/internal/w0;

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/b0$b;-><init>(Lio/grpc/internal/b0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    new-instance v0, Lio/grpc/internal/b0$n;

    invoke-direct {v0, p0}, Lio/grpc/internal/b0$n;-><init>(Lio/grpc/internal/b0;)V

    invoke-direct {p0, v0}, Lio/grpc/internal/b0;->s(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q(Z)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/b0;->i:Ljava/util/List;

    new-instance v1, Lio/grpc/internal/b0$d;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/b0$d;-><init>(Lio/grpc/internal/b0;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected v(Lb3/f1;)V
    .locals 0

    return-void
.end method

.method final x(Lio/grpc/internal/q;)Ljava/lang/Runnable;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/b0;->c:Lio/grpc/internal/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    const-string v0, "stream"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/q;

    invoke-direct {p0, p1}, Lio/grpc/internal/b0;->w(Lio/grpc/internal/q;)V

    iget-object p1, p0, Lio/grpc/internal/b0;->b:Lio/grpc/internal/r;

    if-nez p1, :cond_1

    iput-object v1, p0, Lio/grpc/internal/b0;->e:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/b0;->a:Z

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-direct {p0, p1}, Lio/grpc/internal/b0;->u(Lio/grpc/internal/r;)V

    new-instance p1, Lio/grpc/internal/b0$i;

    invoke-direct {p1, p0}, Lio/grpc/internal/b0$i;-><init>(Lio/grpc/internal/b0;)V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
