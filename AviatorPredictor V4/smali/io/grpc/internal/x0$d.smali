.class Lio/grpc/internal/x0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->U(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/util/List;

.field final synthetic f:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    iput-object p2, p0, Lio/grpc/internal/x0$d;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->a()Ljava/net/SocketAddress;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/x0$d;->e:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/grpc/internal/x0$k;->h(Ljava/util/List;)V

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    iget-object v2, p0, Lio/grpc/internal/x0$d;->e:Ljava/util/List;

    invoke-static {v1, v2}, Lio/grpc/internal/x0;->J(Lio/grpc/internal/x0;Ljava/util/List;)Ljava/util/List;

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lb3/q;

    move-result-object v1

    invoke-virtual {v1}, Lb3/q;->c()Lb3/p;

    move-result-object v1

    sget-object v2, Lb3/p;->f:Lb3/p;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lb3/q;

    move-result-object v1

    invoke-virtual {v1}, Lb3/q;->c()Lb3/p;

    move-result-object v1

    sget-object v4, Lb3/p;->e:Lb3/p;

    if-ne v1, v4, :cond_2

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/grpc/internal/x0$k;->g(Ljava/net/SocketAddress;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lb3/q;

    move-result-object v0

    invoke-virtual {v0}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->j(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v3}, Lio/grpc/internal/x0;->k(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/internal/x0$k;->f()V

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    sget-object v2, Lb3/p;->h:Lb3/p;

    invoke-static {v1, v2}, Lio/grpc/internal/x0;->E(Lio/grpc/internal/x0;Lb3/p;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->l(Lio/grpc/internal/x0;)Lio/grpc/internal/v;

    move-result-object v0

    sget-object v1, Lb3/f1;->u:Lb3/f1;

    const-string v2, "InternalSubchannel closed pending transport due to address change"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0, v3}, Lio/grpc/internal/x0;->m(Lio/grpc/internal/x0;Lio/grpc/internal/v;)Lio/grpc/internal/v;

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->f()V

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->F(Lio/grpc/internal/x0;)V

    :cond_2
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_4

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->n(Lio/grpc/internal/x0;)Lb3/j1$c;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->p(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v1

    sget-object v2, Lb3/f1;->u:Lb3/f1;

    const-string v4, "InternalSubchannel closed transport early due to address change"

    invoke-virtual {v2, v4}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->n(Lio/grpc/internal/x0;)Lb3/j1$c;

    move-result-object v1

    invoke-virtual {v1}, Lb3/j1$c;->a()V

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v3}, Lio/grpc/internal/x0;->o(Lio/grpc/internal/x0;Lb3/j1$c;)Lb3/j1$c;

    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v3}, Lio/grpc/internal/x0;->q(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    :cond_3
    iget-object v1, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v0}, Lio/grpc/internal/x0;->q(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    iget-object v0, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->s(Lio/grpc/internal/x0;)Lb3/j1;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/x0$d$a;

    invoke-direct {v2, p0}, Lio/grpc/internal/x0$d$a;-><init>(Lio/grpc/internal/x0$d;)V

    const-wide/16 v3, 0x5

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lio/grpc/internal/x0$d;->f:Lio/grpc/internal/x0;

    invoke-static {v6}, Lio/grpc/internal/x0;->r(Lio/grpc/internal/x0;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lb3/j1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lb3/j1$c;

    move-result-object v1

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->o(Lio/grpc/internal/x0;Lb3/j1$c;)Lb3/j1$c;

    :cond_4
    return-void
.end method
