.class Lio/grpc/internal/y1$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1;->c(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/y1;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1;Lb3/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$q;->f:Lio/grpc/internal/y1;

    iput-object p2, p0, Lio/grpc/internal/y1$q;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/y1$q;->f:Lio/grpc/internal/y1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/grpc/internal/y1;->t(Lio/grpc/internal/y1;Z)Z

    iget-object v0, p0, Lio/grpc/internal/y1$q;->f:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->D(Lio/grpc/internal/y1;)Lio/grpc/internal/r;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/y1$q;->e:Lb3/f1;

    sget-object v2, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    new-instance v3, Lb3/u0;

    invoke-direct {v3}, Lb3/u0;-><init>()V

    invoke-interface {v0, v1, v2, v3}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void
.end method
