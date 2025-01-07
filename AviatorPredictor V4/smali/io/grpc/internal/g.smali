.class final Lio/grpc/internal/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/k1$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/g$d;
    }
.end annotation


# instance fields
.field private final a:Lio/grpc/internal/g$d;

.field private final b:Lio/grpc/internal/k1$b;

.field private final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/grpc/internal/k1$b;Lio/grpc/internal/g$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/g;->c:Ljava/util/Queue;

    const-string v0, "listener"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/k1$b;

    iput-object p1, p0, Lio/grpc/internal/g;->b:Lio/grpc/internal/k1$b;

    const-string p1, "transportExecutor"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/g$d;

    iput-object p1, p0, Lio/grpc/internal/g;->a:Lio/grpc/internal/g$d;

    return-void
.end method

.method static synthetic e(Lio/grpc/internal/g;)Lio/grpc/internal/k1$b;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/g;->b:Lio/grpc/internal/k1$b;

    return-object p0
.end method


# virtual methods
.method public a(Lio/grpc/internal/j2$a;)V
    .locals 2

    :goto_0
    invoke-interface {p1}, Lio/grpc/internal/j2$a;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/grpc/internal/g;->c:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g;->a:Lio/grpc/internal/g$d;

    new-instance v1, Lio/grpc/internal/g$c;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/g$c;-><init>(Lio/grpc/internal/g;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lio/grpc/internal/g$d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g;->a:Lio/grpc/internal/g$d;

    new-instance v1, Lio/grpc/internal/g$b;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/g$b;-><init>(Lio/grpc/internal/g;Z)V

    invoke-interface {v0, v1}, Lio/grpc/internal/g$d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(I)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g;->a:Lio/grpc/internal/g$d;

    new-instance v1, Lio/grpc/internal/g$a;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/g$a;-><init>(Lio/grpc/internal/g;I)V

    invoke-interface {v0, v1}, Lio/grpc/internal/g$d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method
