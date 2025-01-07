.class Lio/grpc/internal/x0$l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0$l;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/x0$l;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0$l;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->z(Lio/grpc/internal/x0;Lio/grpc/internal/k;)Lio/grpc/internal/k;

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->t(Lio/grpc/internal/x0;)Lb3/f1;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->j(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Unexpected non-null activeTransport"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v1, v0, Lio/grpc/internal/x0$l;->a:Lio/grpc/internal/v;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->t(Lio/grpc/internal/x0;)Lb3/f1;

    move-result-object v0

    invoke-interface {v1, v0}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->l(Lio/grpc/internal/x0;)Lio/grpc/internal/v;

    move-result-object v0

    iget-object v2, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v3, v2, Lio/grpc/internal/x0$l;->a:Lio/grpc/internal/v;

    if-ne v0, v3, :cond_2

    iget-object v0, v2, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0, v3}, Lio/grpc/internal/x0;->k(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->m(Lio/grpc/internal/x0;Lio/grpc/internal/v;)Lio/grpc/internal/v;

    iget-object v0, p0, Lio/grpc/internal/x0$l$a;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    sget-object v1, Lb3/p;->f:Lb3/p;

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->E(Lio/grpc/internal/x0;Lb3/p;)V

    :cond_2
    :goto_1
    return-void
.end method
