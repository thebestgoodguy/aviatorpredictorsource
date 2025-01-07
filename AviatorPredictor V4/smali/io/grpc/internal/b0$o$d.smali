.class Lio/grpc/internal/b0$o$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/b0$o;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/r$a;

.field final synthetic g:Lb3/u0;

.field final synthetic h:Lio/grpc/internal/b0$o;


# direct methods
.method constructor <init>(Lio/grpc/internal/b0$o;Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/b0$o$d;->h:Lio/grpc/internal/b0$o;

    iput-object p2, p0, Lio/grpc/internal/b0$o$d;->e:Lb3/f1;

    iput-object p3, p0, Lio/grpc/internal/b0$o$d;->f:Lio/grpc/internal/r$a;

    iput-object p4, p0, Lio/grpc/internal/b0$o$d;->g:Lb3/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/b0$o$d;->h:Lio/grpc/internal/b0$o;

    invoke-static {v0}, Lio/grpc/internal/b0$o;->e(Lio/grpc/internal/b0$o;)Lio/grpc/internal/r;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/b0$o$d;->e:Lb3/f1;

    iget-object v2, p0, Lio/grpc/internal/b0$o$d;->f:Lio/grpc/internal/r$a;

    iget-object v3, p0, Lio/grpc/internal/b0$o$d;->g:Lb3/u0;

    invoke-interface {v0, v1, v2, v3}, Lio/grpc/internal/r;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void
.end method
