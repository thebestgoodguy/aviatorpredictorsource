.class public final Lio/grpc/internal/j$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:Lb3/n0$d;

.field private b:Lb3/n0;

.field private c:Lb3/o0;

.field final synthetic d:Lio/grpc/internal/j;


# direct methods
.method constructor <init>(Lio/grpc/internal/j;Lb3/n0$d;)V
    .locals 2

    iput-object p1, p0, Lio/grpc/internal/j$b;->d:Lio/grpc/internal/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    invoke-static {p1}, Lio/grpc/internal/j;->b(Lio/grpc/internal/j;)Lb3/p0;

    move-result-object v0

    invoke-static {p1}, Lio/grpc/internal/j;->a(Lio/grpc/internal/j;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/p0;->d(Ljava/lang/String;)Lb3/o0;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/j$b;->c:Lb3/o0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lb3/n0$c;->a(Lb3/n0$d;)Lb3/n0;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find policy \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lio/grpc/internal/j;->a(Lio/grpc/internal/j;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a()Lb3/n0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    return-object v0
.end method

.method b(Lb3/f1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j$b;->a()Lb3/n0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb3/n0;->b(Lb3/f1;)V

    return-void
.end method

.method c()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j$b;->a()Lb3/n0;

    move-result-object v0

    invoke-virtual {v0}, Lb3/n0;->d()V

    return-void
.end method

.method d()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    invoke-virtual {v0}, Lb3/n0;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    return-void
.end method

.method e(Lb3/n0$g;)Lb3/f1;
    .locals 9

    invoke-virtual {p1}, Lb3/n0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lb3/n0$g;->b()Lb3/a;

    move-result-object v1

    invoke-virtual {p1}, Lb3/n0$g;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/grpc/internal/d2$b;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    :try_start_0
    iget-object v2, p0, Lio/grpc/internal/j$b;->d:Lio/grpc/internal/j;

    invoke-static {v2}, Lio/grpc/internal/j;->a(Lio/grpc/internal/j;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "using default policy"

    invoke-static {v2, v4, v5}, Lio/grpc/internal/j;->c(Lio/grpc/internal/j;Ljava/lang/String;Ljava/lang/String;)Lb3/o0;

    move-result-object v2
    :try_end_0
    .catch Lio/grpc/internal/j$f; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v4, Lio/grpc/internal/d2$b;

    invoke-direct {v4, v2, v3}, Lio/grpc/internal/d2$b;-><init>(Lb3/o0;Ljava/lang/Object;)V

    move-object v2, v4

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lb3/f1;->t:Lb3/f1;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    sget-object v1, Lb3/p;->g:Lb3/p;

    new-instance v2, Lio/grpc/internal/j$d;

    invoke-direct {v2, p1}, Lio/grpc/internal/j$d;-><init>(Lb3/f1;)V

    invoke-virtual {v0, v1, v2}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    iget-object p1, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    invoke-virtual {p1}, Lb3/n0;->e()V

    iput-object v3, p0, Lio/grpc/internal/j$b;->c:Lb3/o0;

    new-instance p1, Lio/grpc/internal/j$e;

    invoke-direct {p1, v3}, Lio/grpc/internal/j$e;-><init>(Lio/grpc/internal/j$a;)V

    iput-object p1, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    sget-object p1, Lb3/f1;->f:Lb3/f1;

    return-object p1

    :cond_0
    :goto_0
    iget-object v4, p0, Lio/grpc/internal/j$b;->c:Lb3/o0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v2, Lio/grpc/internal/d2$b;->a:Lb3/o0;

    invoke-virtual {v4}, Lb3/o0;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lio/grpc/internal/j$b;->c:Lb3/o0;

    invoke-virtual {v7}, Lb3/o0;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    iget-object v4, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    sget-object v7, Lb3/p;->e:Lb3/p;

    new-instance v8, Lio/grpc/internal/j$c;

    invoke-direct {v8, v3}, Lio/grpc/internal/j$c;-><init>(Lio/grpc/internal/j$a;)V

    invoke-virtual {v4, v7, v8}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    iget-object v3, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    invoke-virtual {v3}, Lb3/n0;->e()V

    iget-object v3, v2, Lio/grpc/internal/d2$b;->a:Lb3/o0;

    iput-object v3, p0, Lio/grpc/internal/j$b;->c:Lb3/o0;

    iget-object v4, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    iget-object v7, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    invoke-virtual {v3, v7}, Lb3/n0$c;->a(Lb3/n0$d;)Lb3/n0;

    move-result-object v3

    iput-object v3, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    iget-object v3, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    invoke-virtual {v3}, Lb3/n0$d;->b()Lb3/f;

    move-result-object v3

    sget-object v7, Lb3/f$a;->f:Lb3/f$a;

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v6

    iget-object v4, p0, Lio/grpc/internal/j$b;->b:Lb3/n0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v5

    const-string v4, "Load balancer changed from {0} to {1}"

    invoke-virtual {v3, v7, v4, v8}, Lb3/f;->b(Lb3/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v3, v2, Lio/grpc/internal/d2$b;->b:Ljava/lang/Object;

    if-eqz v3, :cond_3

    iget-object v4, p0, Lio/grpc/internal/j$b;->a:Lb3/n0$d;

    invoke-virtual {v4}, Lb3/n0$d;->b()Lb3/f;

    move-result-object v4

    sget-object v7, Lb3/f$a;->e:Lb3/f$a;

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v2, v2, Lio/grpc/internal/d2$b;->b:Ljava/lang/Object;

    aput-object v2, v5, v6

    const-string v2, "Load-balancing config: {0}"

    invoke-virtual {v4, v7, v2, v5}, Lb3/f;->b(Lb3/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {p0}, Lio/grpc/internal/j$b;->a()Lb3/n0;

    move-result-object v2

    invoke-virtual {p1}, Lb3/n0$g;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lb3/n0;->a()Z

    move-result v4

    if-nez v4, :cond_4

    sget-object p1, Lb3/f1;->u:Lb3/f1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NameResolver returned no usable address. addrs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", attrs="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lb3/n0$g;->d()Lb3/n0$g$a;

    move-result-object v0

    invoke-virtual {p1}, Lb3/n0$g;->a()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb3/n0$g$a;->b(Ljava/util/List;)Lb3/n0$g$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lb3/n0$g$a;->c(Lb3/a;)Lb3/n0$g$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lb3/n0$g$a;->d(Ljava/lang/Object;)Lb3/n0$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lb3/n0$g$a;->a()Lb3/n0$g;

    move-result-object p1

    invoke-virtual {v2, p1}, Lb3/n0;->c(Lb3/n0$g;)V

    sget-object p1, Lb3/f1;->f:Lb3/f1;

    return-object p1
.end method
