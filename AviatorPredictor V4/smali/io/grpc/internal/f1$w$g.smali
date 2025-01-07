.class final Lio/grpc/internal/f1$w$g;
.super Lio/grpc/internal/z;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1$w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/f1$w$g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lio/grpc/internal/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final l:Lb3/r;

.field final m:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field final n:Lb3/c;

.field final synthetic o:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;Lb3/r;Lb3/v0;Lb3/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/r;",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lb3/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$w$g;->o:Lio/grpc/internal/f1$w;

    iget-object v0, p1, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0, p4}, Lio/grpc/internal/f1;->B(Lio/grpc/internal/f1;Lb3/c;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object p1, p1, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->V(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$y;

    move-result-object p1

    invoke-virtual {p4}, Lb3/c;->d()Lb3/t;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lio/grpc/internal/z;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lb3/t;)V

    iput-object p2, p0, Lio/grpc/internal/f1$w$g;->l:Lb3/r;

    iput-object p3, p0, Lio/grpc/internal/f1$w$g;->m:Lb3/v0;

    iput-object p4, p0, Lio/grpc/internal/f1$w$g;->n:Lb3/c;

    return-void
.end method


# virtual methods
.method protected i()V
    .locals 2

    invoke-super {p0}, Lio/grpc/internal/z;->i()V

    iget-object v0, p0, Lio/grpc/internal/f1$w$g;->o:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$w$g$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$w$g$b;-><init>(Lio/grpc/internal/f1$w$g;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method p()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w$g;->o:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v1, p0, Lio/grpc/internal/f1$w$g;->n:Lb3/c;

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->B(Lio/grpc/internal/f1;Lb3/c;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/f1$w$g$a;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$w$g$a;-><init>(Lio/grpc/internal/f1$w$g;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
