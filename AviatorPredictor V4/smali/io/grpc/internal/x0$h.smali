.class Lio/grpc/internal/x0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->a(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;Lb3/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$h;->f:Lio/grpc/internal/x0;

    iput-object p2, p0, Lio/grpc/internal/x0$h;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/grpc/internal/x0$h;->f:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->v(Lio/grpc/internal/x0;)Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/j1;

    iget-object v2, p0, Lio/grpc/internal/x0$h;->e:Lb3/f1;

    invoke-interface {v1, v2}, Lio/grpc/internal/j1;->a(Lb3/f1;)V

    goto :goto_0

    :cond_0
    return-void
.end method
