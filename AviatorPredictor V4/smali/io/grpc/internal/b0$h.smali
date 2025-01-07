.class Lio/grpc/internal/b0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/b0;->g(Lb3/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/t;

.field final synthetic f:Lio/grpc/internal/b0;


# direct methods
.method constructor <init>(Lio/grpc/internal/b0;Lb3/t;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/b0$h;->f:Lio/grpc/internal/b0;

    iput-object p2, p0, Lio/grpc/internal/b0$h;->e:Lb3/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/b0$h;->f:Lio/grpc/internal/b0;

    invoke-static {v0}, Lio/grpc/internal/b0;->o(Lio/grpc/internal/b0;)Lio/grpc/internal/q;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/b0$h;->e:Lb3/t;

    invoke-interface {v0, v1}, Lio/grpc/internal/q;->g(Lb3/t;)V

    return-void
.end method
