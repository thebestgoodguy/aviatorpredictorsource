.class abstract Lio/grpc/internal/l0;
.super Lb3/q0;
.source ""


# instance fields
.field private final a:Lb3/q0;


# direct methods
.method constructor <init>(Lb3/q0;)V
    .locals 0

    invoke-direct {p0}, Lb3/q0;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0}, Lb3/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lb3/v0;Lb3/c;)Lb3/g;
    .locals 1
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

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0, p1, p2}, Lb3/d;->h(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p1

    return-object p1
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0, p1, p2, p3}, Lb3/q0;->i(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0}, Lb3/q0;->j()V

    return-void
.end method

.method public k(Z)Lb3/p;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0, p1}, Lb3/q0;->k(Z)Lb3/p;

    move-result-object p1

    return-object p1
.end method

.method public l(Lb3/p;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0, p1, p2}, Lb3/q0;->l(Lb3/p;Ljava/lang/Runnable;)V

    return-void
.end method

.method public m()Lb3/q0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0}, Lb3/q0;->m()Lb3/q0;

    move-result-object v0

    return-object v0
.end method

.method public n()Lb3/q0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    invoke-virtual {v0}, Lb3/q0;->n()Lb3/q0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/l0;->a:Lb3/q0;

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
