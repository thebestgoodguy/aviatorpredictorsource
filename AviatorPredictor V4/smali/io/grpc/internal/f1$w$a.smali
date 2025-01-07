.class Lio/grpc/internal/f1$w$a;
.super Lb3/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1$w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    invoke-direct {p0}, Lb3/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    invoke-static {v0}, Lio/grpc/internal/f1$w;->j(Lio/grpc/internal/f1$w;)Ljava/lang/String;

    move-result-object v0

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

    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0, p2}, Lio/grpc/internal/f1;->B(Lio/grpc/internal/f1;Lb3/c;)Ljava/util/concurrent/Executor;

    move-result-object v2

    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Q(Lio/grpc/internal/f1;)Lio/grpc/internal/p$e;

    move-result-object v4

    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->R(Lio/grpc/internal/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->C(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->B()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    :goto_0
    move-object v5, v0

    iget-object v0, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->F(Lio/grpc/internal/f1;)Lio/grpc/internal/m;

    move-result-object v6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/p;-><init>(Lb3/v0;Ljava/util/concurrent/Executor;Lb3/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Lb3/e0;)V

    iget-object p1, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object p1, p1, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->O(Lio/grpc/internal/f1;)Z

    move-result p1

    invoke-virtual {v8, p1}, Lio/grpc/internal/p;->B(Z)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object p2, p2, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p2}, Lio/grpc/internal/f1;->N(Lio/grpc/internal/f1;)Lb3/v;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->A(Lb3/v;)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/f1$w$a;->a:Lio/grpc/internal/f1$w;

    iget-object p2, p2, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p2}, Lio/grpc/internal/f1;->M(Lio/grpc/internal/f1;)Lb3/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->z(Lb3/o;)Lio/grpc/internal/p;

    move-result-object p1

    return-object p1
.end method
