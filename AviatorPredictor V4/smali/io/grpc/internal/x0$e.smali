.class Lio/grpc/internal/x0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->f(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;Lb3/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    iput-object p2, p0, Lio/grpc/internal/x0$e;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lb3/q;

    move-result-object v0

    invoke-virtual {v0}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v1, Lb3/p;->i:Lb3/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    iget-object v2, p0, Lio/grpc/internal/x0$e;->e:Lb3/f1;

    invoke-static {v0, v2}, Lio/grpc/internal/x0;->u(Lio/grpc/internal/x0;Lb3/f1;)Lb3/f1;

    iget-object v0, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->j(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v0

    iget-object v2, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v2}, Lio/grpc/internal/x0;->l(Lio/grpc/internal/x0;)Lio/grpc/internal/v;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lio/grpc/internal/x0;->k(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    iget-object v3, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v3, v4}, Lio/grpc/internal/x0;->m(Lio/grpc/internal/x0;Lio/grpc/internal/v;)Lio/grpc/internal/v;

    iget-object v3, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v3, v1}, Lio/grpc/internal/x0;->E(Lio/grpc/internal/x0;Lb3/p;)V

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/internal/x0$k;->f()V

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->v(Lio/grpc/internal/x0;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->w(Lio/grpc/internal/x0;)V

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->H(Lio/grpc/internal/x0;)V

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->n(Lio/grpc/internal/x0;)Lb3/j1$c;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->n(Lio/grpc/internal/x0;)Lb3/j1$c;

    move-result-object v1

    invoke-virtual {v1}, Lb3/j1$c;->a()V

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->p(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v1

    iget-object v3, p0, Lio/grpc/internal/x0$e;->e:Lb3/f1;

    invoke-interface {v1, v3}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v4}, Lio/grpc/internal/x0;->o(Lio/grpc/internal/x0;Lb3/j1$c;)Lb3/j1$c;

    iget-object v1, p0, Lio/grpc/internal/x0$e;->f:Lio/grpc/internal/x0;

    invoke-static {v1, v4}, Lio/grpc/internal/x0;->q(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    :cond_2
    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/grpc/internal/x0$e;->e:Lb3/f1;

    invoke-interface {v0, v1}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    :cond_3
    if-eqz v2, :cond_4

    iget-object v0, p0, Lio/grpc/internal/x0$e;->e:Lb3/f1;

    invoke-interface {v2, v0}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    :cond_4
    return-void
.end method
