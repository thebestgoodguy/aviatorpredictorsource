.class final Lio/grpc/internal/f1$u;
.super Lb3/n0$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "u"
.end annotation


# instance fields
.field a:Lio/grpc/internal/j$b;

.field b:Z

.field c:Z

.field final synthetic d:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lb3/n0$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$u;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lb3/n0$b;)Lb3/n0$h;
    .locals 0

    invoke-virtual {p0, p1}, Lio/grpc/internal/f1$u;->f(Lb3/n0$b;)Lio/grpc/internal/e;

    move-result-object p1

    return-object p1
.end method

.method public b()Lb3/f;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->G(Lio/grpc/internal/f1;)Lb3/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Lb3/j1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    return-object v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    invoke-virtual {v0}, Lb3/j1;->d()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/f1$u;->b:Z

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$u$a;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$u$a;-><init>(Lio/grpc/internal/f1$u;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Lb3/p;Lb3/n0$i;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    invoke-virtual {v0}, Lb3/j1;->d()V

    const-string v0, "newState"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "newPicker"

    invoke-static {p2, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$u$b;

    invoke-direct {v1, p0, p2, p1}, Lio/grpc/internal/f1$u$b;-><init>(Lio/grpc/internal/f1$u;Lb3/n0$i;Lb3/p;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Lb3/n0$b;)Lio/grpc/internal/e;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    invoke-virtual {v0}, Lb3/j1;->d()V

    iget-object v0, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->a0(Lio/grpc/internal/f1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Channel is being terminated"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    new-instance v0, Lio/grpc/internal/f1$z;

    iget-object v1, p0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-direct {v0, v1, p1, p0}, Lio/grpc/internal/f1$z;-><init>(Lio/grpc/internal/f1;Lb3/n0$b;Lio/grpc/internal/f1$u;)V

    return-object v0
.end method
