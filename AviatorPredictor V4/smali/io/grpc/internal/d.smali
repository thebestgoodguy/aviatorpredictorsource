.class public abstract Lio/grpc/internal/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/i2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lb3/n;)V
    .locals 2

    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    const-string v1, "compressor"

    invoke-static {p1, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/n;

    invoke-interface {v0, p1}, Lio/grpc/internal/o0;->b(Lb3/n;)Lio/grpc/internal/o0;

    return-void
.end method

.method public final d(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->u()Lio/grpc/internal/d$a;

    move-result-object v0

    invoke-static {v0, p1}, Lio/grpc/internal/d$a;->f(Lio/grpc/internal/d$a;I)V

    return-void
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->u()Lio/grpc/internal/d$a;

    move-result-object v0

    invoke-static {v0}, Lio/grpc/internal/d$a;->g(Lio/grpc/internal/d$a;)Z

    move-result v0

    return v0
.end method

.method public final flush()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/o0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/o0;->flush()V

    :cond_0
    return-void
.end method

.method public final h(Ljava/io/InputStream;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/o0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/o0;->d(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-static {p1}, Lio/grpc/internal/q0;->e(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {p1}, Lio/grpc/internal/q0;->e(Ljava/io/Closeable;)V

    throw v0
.end method

.method public m()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->u()Lio/grpc/internal/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/d$a;->t()V

    return-void
.end method

.method protected final r()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->s()Lio/grpc/internal/o0;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/o0;->close()V

    return-void
.end method

.method protected abstract s()Lio/grpc/internal/o0;
.end method

.method protected final t(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/d;->u()Lio/grpc/internal/d$a;

    move-result-object v0

    invoke-static {v0, p1}, Lio/grpc/internal/d$a;->h(Lio/grpc/internal/d$a;I)V

    return-void
.end method

.method protected abstract u()Lio/grpc/internal/d$a;
.end method
