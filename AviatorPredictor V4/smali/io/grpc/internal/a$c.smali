.class public abstract Lio/grpc/internal/a$c;
.super Lio/grpc/internal/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "c"
.end annotation


# instance fields
.field private final i:Lio/grpc/internal/h2;

.field private j:Z

.field private k:Lio/grpc/internal/r;

.field private l:Z

.field private m:Lb3/v;

.field private n:Z

.field private o:Ljava/lang/Runnable;

.field private volatile p:Z

.field private q:Z

.field private r:Z


# direct methods
.method protected constructor <init>(ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/grpc/internal/d$a;-><init>(ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V

    invoke-static {}, Lb3/v;->c()Lb3/v;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/a$c;->m:Lb3/v;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/grpc/internal/a$c;->n:Z

    const-string p1, "statsTraceCtx"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/h2;

    iput-object p1, p0, Lio/grpc/internal/a$c;->i:Lio/grpc/internal/h2;

    return-void
.end method

.method static synthetic A(Lio/grpc/internal/a$c;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/a$c;->L()V

    return-void
.end method

.method static synthetic B(Lio/grpc/internal/a$c;Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/grpc/internal/a$c;->C(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void
.end method

.method private C(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
    .locals 1

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/a$c;->j:Z

    iget-object v0, p0, Lio/grpc/internal/a$c;->i:Lio/grpc/internal/h2;

    invoke-virtual {v0, p1}, Lio/grpc/internal/h2;->m(Lb3/f1;)V

    invoke-virtual {p0}, Lio/grpc/internal/a$c;->H()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    invoke-virtual {p0}, Lio/grpc/internal/d$a;->l()Lio/grpc/internal/n2;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lio/grpc/internal/d$a;->l()Lio/grpc/internal/n2;

    move-result-object p2

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result p1

    invoke-virtual {p2, p1}, Lio/grpc/internal/n2;->f(Z)V

    :cond_0
    return-void
.end method

.method private I(Lb3/v;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/a$c;->k:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already called start"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "decompressorRegistry"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/v;

    iput-object p1, p0, Lio/grpc/internal/a$c;->m:Lb3/v;

    return-void
.end method

.method private J(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/grpc/internal/a$c;->l:Z

    return-void
.end method

.method private final L()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/a$c;->p:Z

    return-void
.end method

.method static synthetic y(Lio/grpc/internal/a$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/a$c;->J(Z)V

    return-void
.end method

.method static synthetic z(Lio/grpc/internal/a$c;Lb3/v;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/a$c;->I(Lb3/v;)V

    return-void
.end method


# virtual methods
.method protected D(Lio/grpc/internal/u1;)V
    .locals 4

    const-string v0, "frame"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v1, p0, Lio/grpc/internal/a$c;->q:Z

    if-eqz v1, :cond_0

    invoke-static {}, Lio/grpc/internal/a;->w()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v3, "Received data on closed stream"

    invoke-virtual {v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, p1}, Lio/grpc/internal/d$a;->k(Lio/grpc/internal/u1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    :cond_1
    throw v1
.end method

.method protected E(Lb3/u0;)V
    .locals 5

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->q:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Received headers on closed stream"

    invoke-static {v0, v2}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/a$c;->i:Lio/grpc/internal/h2;

    invoke-virtual {v0}, Lio/grpc/internal/h2;->a()V

    sget-object v0, Lio/grpc/internal/q0;->f:Lb3/u0$g;

    invoke-virtual {p1, v0}, Lb3/u0;->g(Lb3/u0$g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-boolean v2, p0, Lio/grpc/internal/a$c;->l:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    const-string v2, "gzip"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Lio/grpc/internal/r0;

    invoke-direct {v0}, Lio/grpc/internal/r0;-><init>()V

    invoke-virtual {p0, v0}, Lio/grpc/internal/d$a;->w(Lio/grpc/internal/r0;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "identity"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    const-string v0, "Can\'t find full stream decompressor for %s"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/f1;->d()Lb3/h1;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/grpc/internal/k1$b;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v2, Lio/grpc/internal/q0;->d:Lb3/u0$g;

    invoke-virtual {p1, v2}, Lb3/u0;->g(Lb3/u0$g;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v4, p0, Lio/grpc/internal/a$c;->m:Lb3/v;

    invoke-virtual {v4, v2}, Lb3/v;->e(Ljava/lang/String;)Lb3/u;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    new-array v0, v1, [Ljava/lang/Object;

    aput-object v2, v0, v3

    const-string v1, "Can\'t find decompressor for %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/f1;->d()Lb3/h1;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/grpc/internal/k1$b;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    sget-object v1, Lb3/l$b;->a:Lb3/l;

    if-eq v4, v1, :cond_4

    if-eqz v0, :cond_3

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "Full stream and gRPC message encoding cannot both be set"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/f1;->d()Lb3/h1;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/grpc/internal/k1$b;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-virtual {p0, v4}, Lio/grpc/internal/d$a;->v(Lb3/u;)V

    :cond_4
    invoke-virtual {p0}, Lio/grpc/internal/a$c;->H()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/r;->c(Lb3/u0;)V

    return-void
.end method

.method protected F(Lb3/u0;Lb3/f1;)V
    .locals 4

    const-string v0, "status"

    invoke-static {p2, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "trailers"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/grpc/internal/a;->w()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v1

    const/4 p2, 0x1

    aput-object p1, v3, p2

    const-string p1, "Received trailers on closed stream:\n {1}\n {2}"

    invoke-virtual {v0, v2, p1, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/a$c;->i:Lio/grpc/internal/h2;

    invoke-virtual {v0, p1}, Lio/grpc/internal/h2;->b(Lb3/u0;)V

    invoke-virtual {p0, p2, v1, p1}, Lio/grpc/internal/a$c;->N(Lb3/f1;ZLb3/u0;)V

    return-void
.end method

.method protected final G()Z
    .locals 1

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->p:Z

    return v0
.end method

.method protected final H()Lio/grpc/internal/r;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/a$c;->k:Lio/grpc/internal/r;

    return-object v0
.end method

.method public final K(Lio/grpc/internal/r;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/a$c;->k:Lio/grpc/internal/r;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already called setListener"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "listener"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/r;

    iput-object p1, p0, Lio/grpc/internal/a$c;->k:Lio/grpc/internal/r;

    return-void
.end method

.method public final M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "trailers"

    invoke-static {p4, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->q:Z

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/a$c;->q:Z

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    iput-boolean v0, p0, Lio/grpc/internal/a$c;->r:Z

    invoke-virtual {p0}, Lio/grpc/internal/d$a;->s()V

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->n:Z

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    iput-object p3, p0, Lio/grpc/internal/a$c;->o:Ljava/lang/Runnable;

    invoke-direct {p0, p1, p2, p4}, Lio/grpc/internal/a$c;->C(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lio/grpc/internal/a$c$a;

    invoke-direct {v0, p0, p1, p2, p4}, Lio/grpc/internal/a$c$a;-><init>(Lio/grpc/internal/a$c;Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    iput-object v0, p0, Lio/grpc/internal/a$c;->o:Ljava/lang/Runnable;

    invoke-virtual {p0, p3}, Lio/grpc/internal/d$a;->j(Z)V

    :goto_0
    return-void
.end method

.method public final N(Lb3/f1;ZLb3/u0;)V
    .locals 1

    sget-object v0, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    invoke-virtual {p0, p1, v0, p2, p3}, Lio/grpc/internal/a$c;->M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    iget-boolean v0, p0, Lio/grpc/internal/a$c;->q:Z

    const-string v1, "status should have been reported on deframer closed"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/a$c;->n:Z

    iget-boolean v1, p0, Lio/grpc/internal/a$c;->r:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    const-string v1, "Encountered end-of-stream mid-frame"

    invoke-virtual {p1, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    new-instance v1, Lb3/u0;

    invoke-direct {v1}, Lb3/u0;-><init>()V

    invoke-virtual {p0, p1, v0, v1}, Lio/grpc/internal/a$c;->N(Lb3/f1;ZLb3/u0;)V

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/a$c;->o:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/grpc/internal/a$c;->o:Ljava/lang/Runnable;

    :cond_1
    return-void
.end method

.method protected bridge synthetic n()Lio/grpc/internal/j2;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/a$c;->H()Lio/grpc/internal/r;

    move-result-object v0

    return-object v0
.end method
