.class final Lio/grpc/internal/f1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->l(Lb3/p;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/Runnable;

.field final synthetic f:Lb3/p;

.field final synthetic g:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Ljava/lang/Runnable;Lb3/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$d;->g:Lio/grpc/internal/f1;

    iput-object p2, p0, Lio/grpc/internal/f1$d;->e:Ljava/lang/Runnable;

    iput-object p3, p0, Lio/grpc/internal/f1$d;->f:Lb3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/f1$d;->g:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Y(Lio/grpc/internal/f1;)Lio/grpc/internal/w;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$d;->e:Ljava/lang/Runnable;

    iget-object v2, p0, Lio/grpc/internal/f1$d;->g:Lio/grpc/internal/f1;

    invoke-static {v2}, Lio/grpc/internal/f1;->W(Lio/grpc/internal/f1;)Ljava/util/concurrent/Executor;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/f1$d;->f:Lb3/p;

    invoke-virtual {v0, v1, v2, v3}, Lio/grpc/internal/w;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;Lb3/p;)V

    return-void
.end method
