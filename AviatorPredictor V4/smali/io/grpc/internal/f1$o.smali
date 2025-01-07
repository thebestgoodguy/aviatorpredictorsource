.class final Lio/grpc/internal/f1$o;
.super Lb3/z;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lb3/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field private final a:Lb3/e0;

.field private final b:Lb3/d;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field private final e:Lb3/r;

.field private f:Lb3/c;

.field private g:Lb3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lb3/e0;Lb3/d;Ljava/util/concurrent/Executor;Lb3/v0;Lb3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/e0;",
            "Lb3/d;",
            "Ljava/util/concurrent/Executor;",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lb3/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lb3/z;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/f1$o;->a:Lb3/e0;

    iput-object p2, p0, Lio/grpc/internal/f1$o;->b:Lb3/d;

    iput-object p4, p0, Lio/grpc/internal/f1$o;->d:Lb3/v0;

    invoke-virtual {p5}, Lb3/c;->e()Ljava/util/concurrent/Executor;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lb3/c;->e()Ljava/util/concurrent/Executor;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Lio/grpc/internal/f1$o;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p5, p3}, Lb3/c;->m(Ljava/util/concurrent/Executor;)Lb3/c;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    invoke-static {}, Lb3/r;->e()Lb3/r;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$o;->e:Lb3/r;

    return-void
.end method

.method static synthetic g(Lio/grpc/internal/f1$o;)Lb3/r;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$o;->e:Lb3/r;

    return-object p0
.end method

.method private h(Lb3/g$a;Lb3/f1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/g$a<",
            "TRespT;>;",
            "Lb3/f1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/grpc/internal/f1$o$a;

    invoke-direct {v1, p0, p1, p2}, Lio/grpc/internal/f1$o$a;-><init>(Lio/grpc/internal/f1$o;Lb3/g$a;Lb3/f1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$o;->g:Lb3/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lb3/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public e(Lb3/g$a;Lb3/u0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/g$a<",
            "TRespT;>;",
            "Lb3/u0;",
            ")V"
        }
    .end annotation

    new-instance v0, Lio/grpc/internal/s1;

    iget-object v1, p0, Lio/grpc/internal/f1$o;->d:Lb3/v0;

    iget-object v2, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    invoke-direct {v0, v1, p2, v2}, Lio/grpc/internal/s1;-><init>(Lb3/v0;Lb3/u0;Lb3/c;)V

    iget-object v1, p0, Lio/grpc/internal/f1$o;->a:Lb3/e0;

    invoke-virtual {v1, v0}, Lb3/e0;->a(Lb3/n0$f;)Lb3/e0$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/e0$b;->c()Lb3/f1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/f1;->o()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, p1, v1}, Lio/grpc/internal/f1$o;->h(Lb3/g$a;Lb3/f1;)V

    invoke-static {}, Lio/grpc/internal/f1;->X()Lb3/g;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$o;->g:Lb3/g;

    return-void

    :cond_0
    invoke-virtual {v0}, Lb3/e0$b;->b()Lb3/h;

    move-result-object v1

    invoke-virtual {v0}, Lb3/e0$b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/i1;

    iget-object v2, p0, Lio/grpc/internal/f1$o;->d:Lb3/v0;

    invoke-virtual {v0, v2}, Lio/grpc/internal/i1;->f(Lb3/v0;)Lio/grpc/internal/i1$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    sget-object v3, Lio/grpc/internal/i1$b;->g:Lb3/c$a;

    invoke-virtual {v2, v3, v0}, Lb3/c;->p(Lb3/c$a;Ljava/lang/Object;)Lb3/c;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/grpc/internal/f1$o;->d:Lb3/v0;

    iget-object v2, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    iget-object v3, p0, Lio/grpc/internal/f1$o;->b:Lb3/d;

    invoke-interface {v1, v0, v2, v3}, Lb3/h;->a(Lb3/v0;Lb3/c;Lb3/d;)Lb3/g;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/grpc/internal/f1$o;->b:Lb3/d;

    iget-object v1, p0, Lio/grpc/internal/f1$o;->d:Lb3/v0;

    iget-object v2, p0, Lio/grpc/internal/f1$o;->f:Lb3/c;

    invoke-virtual {v0, v1, v2}, Lb3/d;->h(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lio/grpc/internal/f1$o;->g:Lb3/g;

    iget-object v0, p0, Lio/grpc/internal/f1$o;->g:Lb3/g;

    invoke-virtual {v0, p1, p2}, Lb3/g;->e(Lb3/g$a;Lb3/u0;)V

    return-void
.end method

.method protected f()Lb3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$o;->g:Lb3/g;

    return-object v0
.end method
