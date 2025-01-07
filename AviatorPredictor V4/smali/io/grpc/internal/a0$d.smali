.class Lio/grpc/internal/a0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/a0;->f(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/a0;


# direct methods
.method constructor <init>(Lio/grpc/internal/a0;Lb3/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/a0$d;->f:Lio/grpc/internal/a0;

    iput-object p2, p0, Lio/grpc/internal/a0$d;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/a0$d;->f:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->b(Lio/grpc/internal/a0;)Lio/grpc/internal/j1$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/a0$d;->e:Lb3/f1;

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->c(Lb3/f1;)V

    return-void
.end method
