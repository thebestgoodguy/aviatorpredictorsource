.class abstract Lio/grpc/internal/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/q;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->a(I)V

    return-void
.end method

.method public b(Lb3/n;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->b(Lb3/n;)V

    return-void
.end method

.method public c(Lb3/f1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->c(Lb3/f1;)V

    return-void
.end method

.method public d(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->d(I)V

    return-void
.end method

.method public e(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->e(I)V

    return-void
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->f()Z

    move-result v0

    return v0
.end method

.method public flush()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->flush()V

    return-void
.end method

.method public g(Lb3/t;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->g(Lb3/t;)V

    return-void
.end method

.method public h(Ljava/io/InputStream;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->h(Ljava/io/InputStream;)V

    return-void
.end method

.method public i(Lio/grpc/internal/r;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->i(Lio/grpc/internal/r;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->j(Ljava/lang/String;)V

    return-void
.end method

.method public k(Lb3/v;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->k(Lb3/v;)V

    return-void
.end method

.method public l(Lio/grpc/internal/w0;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->l(Lio/grpc/internal/w0;)V

    return-void
.end method

.method public m()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->m()V

    return-void
.end method

.method public n()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/q;->n()V

    return-void
.end method

.method protected abstract o()Lio/grpc/internal/q;
.end method

.method public q(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->q(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lio/grpc/internal/h0;->o()Lio/grpc/internal/q;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
