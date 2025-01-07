.class Lio/grpc/internal/f1$w$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$w;->h(Lb3/v0;Lb3/c;)Lb3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$w$g;

.field final synthetic f:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;Lio/grpc/internal/f1$w$g;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    iput-object p2, p0, Lio/grpc/internal/f1$w$f;->e:Lio/grpc/internal/f1$w$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    invoke-static {v0}, Lio/grpc/internal/f1$w;->i(Lio/grpc/internal/f1$w;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->T(Lio/grpc/internal/f1;Ljava/util/Collection;)Ljava/util/Collection;

    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v1, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    invoke-static {v0}, Lio/grpc/internal/f1;->U(Lio/grpc/internal/f1;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->f:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$w$f;->e:Lio/grpc/internal/f1$w$g;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/f1$w$f;->e:Lio/grpc/internal/f1$w$g;

    invoke-virtual {v0}, Lio/grpc/internal/f1$w$g;->p()V

    :goto_0
    return-void
.end method
