.class final Lio/grpc/internal/f1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$f;->e:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$f;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->t(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$f;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$u;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$f;->e:Lio/grpc/internal/f1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->H(Lio/grpc/internal/f1;Z)V

    iget-object v0, p0, Lio/grpc/internal/f1$f;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->o(Lio/grpc/internal/f1;)V

    :cond_1
    :goto_0
    return-void
.end method
