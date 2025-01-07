.class public abstract Lio/grpc/internal/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/u1;


# instance fields
.field private final e:Lio/grpc/internal/u1;


# direct methods
.method protected constructor <init>(Lio/grpc/internal/u1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "buf"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/u1;

    iput-object p1, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    return-void
.end method


# virtual methods
.method public J(I)Lio/grpc/internal/u1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->J(I)Lio/grpc/internal/u1;

    move-result-object p1

    return-object p1
.end method

.method public N()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->N()I

    move-result v0

    return v0
.end method

.method public T(Ljava/nio/ByteBuffer;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->T(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    return v0
.end method

.method public d0([BII)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1, p2, p3}, Lio/grpc/internal/u1;->d0([BII)V

    return-void
.end method

.method public m(I)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->m(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->markSupported()Z

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->reset()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/io/OutputStream;I)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1, p2}, Lio/grpc/internal/u1;->u(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->z()V

    return-void
.end method
