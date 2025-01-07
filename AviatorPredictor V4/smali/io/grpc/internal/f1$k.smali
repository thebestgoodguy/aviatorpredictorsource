.class Lio/grpc/internal/f1$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;-><init>(Lio/grpc/internal/g1;Lio/grpc/internal/t;Lio/grpc/internal/k$a;Lio/grpc/internal/o1;Lq0/p;Ljava/util/List;Lio/grpc/internal/k2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$k;->e:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$k;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->E(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$r;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/f1$r;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
