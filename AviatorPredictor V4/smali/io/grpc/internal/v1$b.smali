.class final Lio/grpc/internal/v1$b;
.super Ljava/io/InputStream;
.source ""

# interfaces
.implements Lb3/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private e:Lio/grpc/internal/u1;


# direct methods
.method public constructor <init>(Lio/grpc/internal/u1;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/u1;

    iput-object p1, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    return-void
.end method


# virtual methods
.method public available()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->close()V

    return-void
.end method

.method public mark(I)V
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {p1}, Lio/grpc/internal/u1;->z()V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->N()I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0, p1, p2, p3}, Lio/grpc/internal/u1;->d0([BII)V

    return p3
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->reset()V

    return-void
.end method

.method public skip(J)J
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    iget-object p1, p0, Lio/grpc/internal/v1$b;->e:Lio/grpc/internal/u1;

    invoke-interface {p1, p2}, Lio/grpc/internal/u1;->m(I)V

    int-to-long p1, p2

    return-wide p1
.end method
