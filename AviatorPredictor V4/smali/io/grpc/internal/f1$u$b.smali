.class final Lio/grpc/internal/f1$u$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$u;->e(Lb3/p;Lb3/n0$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lb3/n0$i;

.field final synthetic f:Lb3/p;

.field final synthetic g:Lio/grpc/internal/f1$u;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$u;Lb3/n0$i;Lb3/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$u$b;->g:Lio/grpc/internal/f1$u;

    iput-object p2, p0, Lio/grpc/internal/f1$u$b;->e:Lb3/n0$i;

    iput-object p3, p0, Lio/grpc/internal/f1$u$b;->f:Lb3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/f1$u$b;->g:Lio/grpc/internal/f1$u;

    iget-object v1, v0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->z0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$u;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$u$b;->g:Lio/grpc/internal/f1$u;

    iget-object v0, v0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v1, p0, Lio/grpc/internal/f1$u$b;->e:Lb3/n0$i;

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->c0(Lio/grpc/internal/f1;Lb3/n0$i;)V

    iget-object v0, p0, Lio/grpc/internal/f1$u$b;->f:Lb3/p;

    sget-object v1, Lb3/p;->i:Lb3/p;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$u$b;->g:Lio/grpc/internal/f1$u;

    iget-object v0, v0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->G(Lio/grpc/internal/f1;)Lb3/f;

    move-result-object v0

    sget-object v1, Lb3/f$a;->f:Lb3/f$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lio/grpc/internal/f1$u$b;->f:Lb3/p;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lio/grpc/internal/f1$u$b;->e:Lb3/n0$i;

    aput-object v4, v2, v3

    const-string v3, "Entering {0} state with picker: {1}"

    invoke-virtual {v0, v1, v3, v2}, Lb3/f;->b(Lb3/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$u$b;->g:Lio/grpc/internal/f1$u;

    iget-object v0, v0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Y(Lio/grpc/internal/f1;)Lio/grpc/internal/w;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$u$b;->f:Lb3/p;

    invoke-virtual {v0, v1}, Lio/grpc/internal/w;->b(Lb3/p;)V

    :cond_1
    return-void
.end method
