.class final Lio/grpc/internal/f1$w$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$w;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$b;->e:Lio/grpc/internal/f1$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w$b;->e:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$w$b;->e:Lio/grpc/internal/f1$w;

    invoke-static {v0}, Lio/grpc/internal/f1$w;->i(Lio/grpc/internal/f1$w;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$w$b;->e:Lio/grpc/internal/f1$w;

    invoke-static {v0}, Lio/grpc/internal/f1$w;->i(Lio/grpc/internal/f1$w;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$w$b;->e:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->D(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$a0;

    move-result-object v0

    sget-object v1, Lio/grpc/internal/f1;->q0:Lb3/f1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/f1$a0;->b(Lb3/f1;)V

    :cond_1
    return-void
.end method
