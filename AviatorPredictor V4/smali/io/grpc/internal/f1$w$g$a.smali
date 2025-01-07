.class Lio/grpc/internal/f1$w$g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$w$g;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$w$g;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w$g;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    iget-object v0, v0, Lio/grpc/internal/f1$w$g;->l:Lb3/r;

    invoke-virtual {v0}, Lb3/r;->b()Lb3/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    iget-object v2, v1, Lio/grpc/internal/f1$w$g;->o:Lio/grpc/internal/f1$w;

    iget-object v3, v1, Lio/grpc/internal/f1$w$g;->m:Lb3/v0;

    iget-object v1, v1, Lio/grpc/internal/f1$w$g;->n:Lb3/c;

    invoke-static {v2, v3, v1}, Lio/grpc/internal/f1$w;->k(Lio/grpc/internal/f1$w;Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    iget-object v2, v2, Lio/grpc/internal/f1$w$g;->l:Lb3/r;

    invoke-virtual {v2, v0}, Lb3/r;->f(Lb3/r;)V

    iget-object v0, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    invoke-virtual {v0, v1}, Lio/grpc/internal/z;->n(Lb3/g;)V

    iget-object v0, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    iget-object v1, v0, Lio/grpc/internal/f1$w$g;->o:Lio/grpc/internal/f1$w;

    iget-object v1, v1, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v1, v1, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v2, Lio/grpc/internal/f1$w$g$b;

    invoke-direct {v2, v0}, Lio/grpc/internal/f1$w$g$b;-><init>(Lio/grpc/internal/f1$w$g;)V

    invoke-virtual {v1, v2}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/grpc/internal/f1$w$g$a;->e:Lio/grpc/internal/f1$w$g;

    iget-object v2, v2, Lio/grpc/internal/f1$w$g;->l:Lb3/r;

    invoke-virtual {v2, v0}, Lb3/r;->f(Lb3/r;)V

    throw v1
.end method
