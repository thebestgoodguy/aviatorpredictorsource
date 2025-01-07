.class Lio/grpc/internal/x0$l$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0$l;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/x0$l;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0$l;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->v(Lio/grpc/internal/x0;)Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    iget-object v1, v1, Lio/grpc/internal/x0$l;->a:Lio/grpc/internal/v;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lb3/q;

    move-result-object v0

    invoke-virtual {v0}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v1, Lb3/p;->i:Lb3/p;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->v(Lio/grpc/internal/x0;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/x0$l$c;->e:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->w(Lio/grpc/internal/x0;)V

    :cond_0
    return-void
.end method
