.class Lio/grpc/internal/f1$w;
.super Lb3/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "w"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/f1$w$g;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lb3/e0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Lb3/d;

.field final synthetic d:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lb3/d;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lio/grpc/internal/f1$w$a;

    invoke-direct {p1, p0}, Lio/grpc/internal/f1$w$a;-><init>(Lio/grpc/internal/f1$w;)V

    iput-object p1, p0, Lio/grpc/internal/f1$w;->c:Lb3/d;

    const-string p1, "authority"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/grpc/internal/f1$w;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Ljava/lang/String;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$w;-><init>(Lio/grpc/internal/f1;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i(Lio/grpc/internal/f1$w;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic j(Lio/grpc/internal/f1$w;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$w;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic k(Lio/grpc/internal/f1$w;Lb3/v0;Lb3/c;)Lb3/g;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$w;->l(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p0

    return-object p0
.end method

.method private l(Lb3/v0;Lb3/c;)Lb3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lb3/c;",
            ")",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lb3/e0;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/grpc/internal/f1$w;->c:Lb3/d;

    invoke-virtual {v0, p1, p2}, Lb3/d;->h(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, v2, Lio/grpc/internal/i1$c;

    if-eqz v0, :cond_2

    check-cast v2, Lio/grpc/internal/i1$c;

    iget-object v0, v2, Lio/grpc/internal/i1$c;->b:Lio/grpc/internal/i1;

    invoke-virtual {v0, p1}, Lio/grpc/internal/i1;->f(Lb3/v0;)Lio/grpc/internal/i1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lio/grpc/internal/i1$b;->g:Lb3/c$a;

    invoke-virtual {p2, v1, v0}, Lb3/c;->p(Lb3/c$a;Ljava/lang/Object;)Lb3/c;

    move-result-object p2

    goto :goto_0

    :cond_2
    new-instance v0, Lio/grpc/internal/f1$o;

    iget-object v3, p0, Lio/grpc/internal/f1$w;->c:Lb3/d;

    iget-object v1, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->W(Lio/grpc/internal/f1;)Ljava/util/concurrent/Executor;

    move-result-object v4

    move-object v1, v0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lio/grpc/internal/f1$o;-><init>(Lb3/e0;Lb3/d;Ljava/util/concurrent/Executor;Lb3/v0;Lb3/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$w;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h(Lb3/v0;Lb3/c;)Lb3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lb3/c;",
            ")",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$w;->l(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$w$d;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$w$d;-><init>(Lio/grpc/internal/f1$w;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$w;->l(Lb3/v0;Lb3/c;)Lb3/g;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->t(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lio/grpc/internal/f1$w$e;

    invoke-direct {p1, p0}, Lio/grpc/internal/f1$w$e;-><init>(Lio/grpc/internal/f1$w;)V

    return-object p1

    :cond_2
    invoke-static {}, Lb3/r;->e()Lb3/r;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/f1$w$g;

    invoke-direct {v1, p0, v0, p1, p2}, Lio/grpc/internal/f1$w$g;-><init>(Lio/grpc/internal/f1$w;Lb3/r;Lb3/v0;Lb3/c;)V

    iget-object p1, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object p1, p1, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance p2, Lio/grpc/internal/f1$w$f;

    invoke-direct {p2, p0, v1}, Lio/grpc/internal/f1$w$f;-><init>(Lio/grpc/internal/f1$w;Lio/grpc/internal/f1$w$g;)V

    invoke-virtual {p1, p2}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-object v1
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/grpc/internal/f1$w;->p(Lb3/e0;)V

    :cond_0
    return-void
.end method

.method n()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$w$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$w$b;-><init>(Lio/grpc/internal/f1$w;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method o()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lb3/j1;

    new-instance v1, Lio/grpc/internal/f1$w$c;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$w$c;-><init>(Lio/grpc/internal/f1$w;)V

    invoke-virtual {v0, v1}, Lb3/j1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method p(Lb3/e0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/e0;

    iget-object v1, p0, Lio/grpc/internal/f1$w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {}, Lio/grpc/internal/f1;->L()Lb3/e0;

    move-result-object p1

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/f1$w$g;

    invoke-virtual {v0}, Lio/grpc/internal/f1$w$g;->p()V

    goto :goto_0

    :cond_0
    return-void
.end method
