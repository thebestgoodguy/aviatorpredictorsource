.class abstract Lio/grpc/internal/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/r;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/grpc/internal/j2$a;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/i0;->e()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j2;->a(Lio/grpc/internal/j2$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/i0;->e()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/j2;->b()V

    return-void
.end method

.method public c(Lb3/u0;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/i0;->e()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/r;->c(Lb3/u0;)V

    return-void
.end method

.method public d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/i0;->e()Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void
.end method

.method protected abstract e()Lio/grpc/internal/r;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lio/grpc/internal/i0;->e()Lio/grpc/internal/r;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
