.class Lio/grpc/internal/d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/d$a;->u(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lj3/b;

.field final synthetic f:I

.field final synthetic g:Lio/grpc/internal/d$a;


# direct methods
.method constructor <init>(Lio/grpc/internal/d$a;Lj3/b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/d$a$a;->g:Lio/grpc/internal/d$a;

    iput-object p2, p0, Lio/grpc/internal/d$a$a;->e:Lj3/b;

    iput p3, p0, Lio/grpc/internal/d$a$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "AbstractStream.request"

    invoke-static {v0}, Lj3/c;->f(Ljava/lang/String;)V

    iget-object v1, p0, Lio/grpc/internal/d$a$a;->e:Lj3/b;

    invoke-static {v1}, Lj3/c;->d(Lj3/b;)V

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/d$a$a;->g:Lio/grpc/internal/d$a;

    invoke-static {v1}, Lio/grpc/internal/d$a;->i(Lio/grpc/internal/d$a;)Lio/grpc/internal/y;

    move-result-object v1

    iget v2, p0, Lio/grpc/internal/d$a$a;->f:I

    invoke-interface {v1, v2}, Lio/grpc/internal/y;->d(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, Lio/grpc/internal/d$a$a;->g:Lio/grpc/internal/d$a;

    invoke-interface {v2, v1}, Lio/grpc/internal/k1$b;->b(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-static {v0}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception v1

    invoke-static {v0}, Lj3/c;->h(Ljava/lang/String;)V

    throw v1
.end method
