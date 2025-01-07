.class public Lcom/google/firebase/firestore/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/l;

.field private final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method constructor <init>(Ll1/l;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/l;

    iput-object p1, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    iput-object p2, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/firestore/h;Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/h;->p(Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public static synthetic b(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/i;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/firestore/h;->r(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/i;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public static synthetic c(Lcom/google/firebase/firestore/h;Lo0/h;)Lcom/google/firebase/firestore/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/h;->q(Lo0/h;)Lcom/google/firebase/firestore/i;

    move-result-object p0

    return-object p0
.end method

.method private f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Li1/p$a;",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/i;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/firestore/e;

    invoke-direct {v0, p0, p4}, Lcom/google/firebase/firestore/e;-><init>(Lcom/google/firebase/firestore/h;Lcom/google/firebase/firestore/j;)V

    new-instance p4, Li1/h;

    invoke-direct {p4, p1, v0}, Li1/h;-><init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/j;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/h;->g()Li1/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p4}, Li1/l0;->U(Li1/x0;Li1/p$a;Lcom/google/firebase/firestore/j;)Li1/y0;

    move-result-object p1

    new-instance p2, Li1/s0;

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    invoke-direct {p2, v0, p1, p4}, Li1/s0;-><init>(Li1/l0;Li1/y0;Li1/h;)V

    invoke-static {p3, p2}, Li1/d;->c(Landroid/app/Activity;Lcom/google/firebase/firestore/a0;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method private g()Li1/x0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {v0}, Ll1/l;->t()Ll1/u;

    move-result-object v0

    invoke-static {v0}, Li1/x0;->b(Ll1/u;)Li1/x0;

    move-result-object v0

    return-object v0
.end method

.method static i(Ll1/u;Lcom/google/firebase/firestore/FirebaseFirestore;)Lcom/google/firebase/firestore/h;
    .locals 2

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/h;

    invoke-static {p0}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/firestore/h;-><init>(Ll1/l;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid document reference. Document references must have an even number of segments, but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll1/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " has "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private n(Lcom/google/firebase/firestore/q0;)Lo0/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q0;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    new-instance v1, Lo0/i;

    invoke-direct {v1}, Lo0/i;-><init>()V

    new-instance v2, Li1/p$a;

    invoke-direct {v2}, Li1/p$a;-><init>()V

    const/4 v3, 0x1

    iput-boolean v3, v2, Li1/p$a;->a:Z

    iput-boolean v3, v2, Li1/p$a;->b:Z

    iput-boolean v3, v2, Li1/p$a;->c:Z

    sget-object v3, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/firebase/firestore/f;

    invoke-direct {v4, v0, v1, p1}, Lcom/google/firebase/firestore/f;-><init>(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;)V

    const/4 p1, 0x0

    invoke-direct {p0, v3, v2, p1, v4}, Lcom/google/firebase/firestore/h;->f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static o(Lcom/google/firebase/firestore/e0;)Li1/p$a;
    .locals 5

    new-instance v0, Li1/p$a;

    invoke-direct {v0}, Li1/p$a;-><init>()V

    sget-object v1, Lcom/google/firebase/firestore/e0;->f:Lcom/google/firebase/firestore/e0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, v0, Li1/p$a;->a:Z

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, v0, Li1/p$a;->b:Z

    iput-boolean v3, v0, Li1/p$a;->c:Z

    return-object v0
.end method

.method private synthetic p(Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-interface {p1, v0, p3}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void

    :cond_0
    const/4 p3, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "Got event without value or error set"

    invoke-static {v2, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Li1/u1;->e()Ll1/n;

    move-result-object v2

    invoke-virtual {v2}, Ll1/n;->size()I

    move-result v2

    if-gt v2, p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Too many documents returned on a document query"

    invoke-static {p3, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Li1/u1;->e()Ll1/n;

    move-result-object p3

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {p3, v1}, Ll1/n;->r(Ll1/l;)Ll1/i;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p2}, Li1/u1;->f()Lc1/e;

    move-result-object v1

    invoke-interface {p3}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc1/e;->contains(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p2}, Li1/u1;->j()Z

    move-result p2

    invoke-static {v2, p3, p2, v1}, Lcom/google/firebase/firestore/i;->b(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/i;

    move-result-object p2

    goto :goto_2

    :cond_3
    iget-object p3, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {p2}, Li1/u1;->j()Z

    move-result p2

    invoke-static {p3, v1, p2}, Lcom/google/firebase/firestore/i;->c(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Z)Lcom/google/firebase/firestore/i;

    move-result-object p2

    :goto_2
    invoke-interface {p1, p2, v0}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private synthetic q(Lo0/h;)Lcom/google/firebase/firestore/i;
    .locals 6

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ll1/i;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ll1/i;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_0
    new-instance p1, Lcom/google/firebase/firestore/i;

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v2, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    const/4 v4, 0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/firestore/i;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Ll1/i;ZZ)V

    return-object p1
.end method

.method private static synthetic r(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/i;Lcom/google/firebase/firestore/u;)V
    .locals 1

    const-string v0, "Failed to register a listener for a single document"

    if-eqz p4, :cond_0

    invoke-virtual {p0, p4}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const/4 p4, 0x0

    :try_start_0
    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/a0;

    invoke-interface {p1}, Lcom/google/firebase/firestore/a0;->remove()V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/i;->a()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p3}, Lcom/google/firebase/firestore/i;->f()Lcom/google/firebase/firestore/p0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/p0;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/firebase/firestore/u;

    const-string p2, "Failed to get document because the client is offline."

    sget-object p3, Lcom/google/firebase/firestore/u$a;->t:Lcom/google/firebase/firestore/u$a;

    invoke-direct {p1, p2, p3}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    :goto_0
    invoke-virtual {p0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lcom/google/firebase/firestore/i;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p3}, Lcom/google/firebase/firestore/i;->f()Lcom/google/firebase/firestore/p0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/p0;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/google/firebase/firestore/q0;->f:Lcom/google/firebase/firestore/q0;

    if-ne p2, p1, :cond_2

    new-instance p1, Lcom/google/firebase/firestore/u;

    const-string p2, "Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)"

    sget-object p3, Lcom/google/firebase/firestore/u$a;->t:Lcom/google/firebase/firestore/u$a;

    invoke-direct {p1, p2, p3}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p3}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lp1/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lp1/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private u(Li1/p1;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/p1;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    const/4 v2, 0x1

    invoke-static {v2}, Lm1/m;->a(Z)Lm1/m;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Li1/p1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Li1/l0;->c0(Ljava/util/List;)Lo0/h;

    move-result-object p1

    sget-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    invoke-static {}, Lp1/g0;->A()Lo0/a;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d(Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/e0;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/i;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    sget-object v0, Lp1/p;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/firebase/firestore/h;->e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/firestore/e0;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/i;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    const-string v0, "Provided executor must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided MetadataChanges value must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided EventListener must not be null."

    invoke-static {p3, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/firebase/firestore/h;->o(Lcom/google/firebase/firestore/e0;)Li1/p$a;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/firebase/firestore/h;->f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/firestore/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/h;

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    iget-object v3, p1, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {v1, v3}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object p1, p1, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()Lo0/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    new-instance v1, Lm1/c;

    iget-object v2, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    sget-object v3, Lm1/m;->c:Lm1/m;

    invoke-direct {v1, v2, v3}, Lm1/c;-><init>(Ll1/l;Lm1/m;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Li1/l0;->c0(Ljava/util/List;)Lo0/h;

    move-result-object v0

    sget-object v1, Lp1/p;->b:Ljava/util/concurrent/Executor;

    invoke-static {}, Lp1/g0;->A()Lo0/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {v0}, Ll1/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j(Lcom/google/firebase/firestore/q0;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q0;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/q0;->g:Lcom/google/firebase/firestore/q0;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {p1, v0}, Li1/l0;->w(Ll1/l;)Lo0/h;

    move-result-object p1

    sget-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/firestore/g;

    invoke-direct {v1, p0}, Lcom/google/firebase/firestore/g;-><init>(Lcom/google/firebase/firestore/h;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/h;->n(Lcom/google/firebase/firestore/q0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public k()Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-object v0
.end method

.method l()Ll1/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    invoke-virtual {v0}, Ll1/l;->t()Ll1/u;

    move-result-object v0

    invoke-virtual {v0}, Ll1/u;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/Object;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/o0;->c:Lcom/google/firebase/firestore/o0;

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/firestore/h;->t(Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/firebase/firestore/o0;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Provided data must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided options must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/o0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/firebase/firestore/o0;->a()Lm1/d;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/firestore/v0;->g(Ljava/lang/Object;Lm1/d;)Li1/o1;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/firebase/firestore/v0;->l(Ljava/lang/Object;)Li1/o1;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object p2

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->a:Ll1/l;

    sget-object v1, Lm1/m;->c:Lm1/m;

    invoke-virtual {p1, v0, v1}, Li1/o1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/l0;->c0(Ljava/util/List;)Lo0/h;

    move-result-object p1

    sget-object p2, Lp1/p;->b:Ljava/util/concurrent/Executor;

    invoke-static {}, Lp1/g0;->A()Lo0/a;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/util/Map;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/h;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/v0;->n(Ljava/util/Map;)Li1/p1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/h;->u(Li1/p1;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
