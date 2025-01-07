.class abstract Lio/grpc/internal/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/v;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/f1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->a(Lb3/f1;)V

    return-void
.end method

.method protected abstract b()Lio/grpc/internal/v;
.end method

.method public c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/v0<",
            "**>;",
            "Lb3/u0;",
            "Lb3/c;",
            "[",
            "Lb3/k;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/grpc/internal/s;->c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;

    move-result-object p1

    return-object p1
.end method

.method public d()Lb3/h0;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0}, Lb3/l0;->d()Lb3/h0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->e(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;

    move-result-object p1

    return-object p1
.end method

.method public f(Lb3/f1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->f(Lb3/f1;)V

    return-void
.end method

.method public g(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/grpc/internal/s;->g(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lio/grpc/internal/j0;->b()Lio/grpc/internal/v;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
