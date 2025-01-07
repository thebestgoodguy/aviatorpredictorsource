.class public final Li1/l0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Li1/m;

.field private final b:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Lg1/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lp1/g;

.field private final e:Lh1/g;

.field private final f:Lo1/e0;

.field private g:Lk1/z0;

.field private h:Lk1/f0;

.field private i:Lo1/n0;

.field private j:Li1/b1;

.field private k:Li1/p;

.field private l:Lk1/z3;

.field private m:Lk1/z3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li1/m;Lcom/google/firebase/firestore/v;Lg1/a;Lg1/a;Lp1/g;Lo1/e0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Li1/m;",
            "Lcom/google/firebase/firestore/v;",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;",
            "Lp1/g;",
            "Lo1/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li1/l0;->a:Li1/m;

    iput-object p4, p0, Li1/l0;->b:Lg1/a;

    iput-object p5, p0, Li1/l0;->c:Lg1/a;

    iput-object p6, p0, Li1/l0;->d:Lp1/g;

    iput-object p7, p0, Li1/l0;->f:Lo1/e0;

    new-instance p7, Lh1/g;

    new-instance v0, Lo1/j0;

    invoke-virtual {p2}, Li1/m;->a()Ll1/f;

    move-result-object p2

    invoke-direct {v0, p2}, Lo1/j0;-><init>(Ll1/f;)V

    invoke-direct {p7, v0}, Lh1/g;-><init>(Lo1/j0;)V

    iput-object p7, p0, Li1/l0;->e:Lh1/g;

    new-instance p2, Lo0/i;

    invoke-direct {p2}, Lo0/i;-><init>()V

    new-instance p7, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p7, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Li1/v;

    invoke-direct {v0, p0, p2, p1, p3}, Li1/v;-><init>(Li1/l0;Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V

    invoke-virtual {p6, v0}, Lp1/g;->l(Ljava/lang/Runnable;)V

    new-instance p1, Li1/a0;

    invoke-direct {p1, p0, p7, p2, p6}, Li1/a0;-><init>(Li1/l0;Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;)V

    invoke-virtual {p4, p1}, Lg1/a;->d(Lp1/u;)V

    sget-object p1, Li1/b0;->a:Li1/b0;

    invoke-virtual {p5, p1}, Lg1/a;->d(Lp1/u;)V

    return-void
.end method

.method private synthetic B(Lcom/google/firebase/firestore/j;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->k:Li1/p;

    invoke-virtual {v0, p1}, Li1/p;->e(Lcom/google/firebase/firestore/j;)V

    return-void
.end method

.method private synthetic C()V
    .locals 1

    iget-object v0, p0, Li1/l0;->i:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->q()V

    return-void
.end method

.method private synthetic D()V
    .locals 1

    iget-object v0, p0, Li1/l0;->i:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->s()V

    return-void
.end method

.method private static synthetic E(Lo0/h;)Ll1/i;
    .locals 2

    invoke-virtual {p0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll1/i;

    invoke-interface {p0}, Ll1/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ll1/i;->e()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance p0, Lcom/google/firebase/firestore/u;

    sget-object v0, Lcom/google/firebase/firestore/u$a;->t:Lcom/google/firebase/firestore/u$a;

    const-string v1, "Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)"

    invoke-direct {p0, v1, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    throw p0
.end method

.method private synthetic F(Ll1/l;)Ll1/i;
    .locals 1

    iget-object v0, p0, Li1/l0;->h:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->e0(Ll1/l;)Ll1/i;

    move-result-object p1

    return-object p1
.end method

.method private synthetic G(Li1/x0;)Li1/u1;
    .locals 3

    iget-object v0, p0, Li1/l0;->h:Lk1/f0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lk1/f0;->y(Li1/x0;Z)Lk1/c1;

    move-result-object v0

    new-instance v1, Li1/s1;

    invoke-virtual {v0}, Lk1/c1;->b()Lc1/e;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Li1/s1;-><init>(Li1/x0;Lc1/e;)V

    invoke-virtual {v0}, Lk1/c1;->a()Lc1/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Li1/s1;->g(Lc1/c;)Li1/s1$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Li1/s1;->b(Li1/s1$b;)Li1/t1;

    move-result-object p1

    invoke-virtual {p1}, Li1/t1;->b()Li1/u1;

    move-result-object p1

    return-object p1
.end method

.method private synthetic H(Ljava/lang/String;Lo0/i;)V
    .locals 12

    iget-object v0, p0, Li1/l0;->h:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->F(Ljava/lang/String;)Lh1/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh1/j;->a()Lh1/i;

    move-result-object v0

    invoke-virtual {v0}, Lh1/i;->b()Li1/c1;

    move-result-object v0

    new-instance v11, Li1/x0;

    invoke-virtual {v0}, Li1/c1;->n()Ll1/u;

    move-result-object v2

    invoke-virtual {v0}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Li1/c1;->h()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Li1/c1;->m()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Li1/c1;->j()J

    move-result-wide v6

    invoke-virtual {p1}, Lh1/j;->a()Lh1/i;

    move-result-object p1

    invoke-virtual {p1}, Lh1/i;->a()Li1/x0$a;

    move-result-object v8

    invoke-virtual {v0}, Li1/c1;->p()Li1/i;

    move-result-object v9

    invoke-virtual {v0}, Li1/c1;->f()Li1/i;

    move-result-object v10

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    invoke-virtual {p2, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private synthetic I(Li1/y0;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->k:Li1/p;

    invoke-virtual {v0, p1}, Li1/p;->d(Li1/y0;)I

    return-void
.end method

.method private synthetic J(Lh1/f;Lcom/google/firebase/firestore/c0;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    invoke-virtual {v0, p1, p2}, Li1/b1;->o(Lh1/f;Lcom/google/firebase/firestore/c0;)V

    return-void
.end method

.method private synthetic K(Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V
    .locals 0

    :try_start_0
    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/j;

    invoke-direct {p0, p2, p1, p3}, Li1/l0;->z(Landroid/content/Context;Lg1/j;Lcom/google/firebase/firestore/v;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method private synthetic L(Lg1/j;)V
    .locals 5

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "SyncEngine not yet initialized"

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lg1/j;->a()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "FirestoreClient"

    const-string v2, "Credential changed. Current user: %s"

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    invoke-virtual {v0, p1}, Li1/b1;->l(Lg1/j;)V

    return-void
.end method

.method private synthetic M(Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;Lg1/j;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    invoke-virtual {p1}, Lo0/h;->o()Z

    move-result p1

    xor-int/2addr p1, v1

    new-array p3, v0, [Ljava/lang/Object;

    const-string v0, "Already fulfilled first user task"

    invoke-static {p1, v0, p3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2, p4}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Li1/g0;

    invoke-direct {p1, p0, p4}, Li1/g0;-><init>(Li1/l0;Lg1/j;)V

    invoke-virtual {p3, p1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private static synthetic N(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private synthetic O(Lcom/google/firebase/firestore/j;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->k:Li1/p;

    invoke-virtual {v0, p1}, Li1/p;->h(Lcom/google/firebase/firestore/j;)V

    return-void
.end method

.method private synthetic P(Li1/y0;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->k:Li1/p;

    invoke-virtual {v0, p1}, Li1/p;->g(Li1/y0;)V

    return-void
.end method

.method private synthetic Q()V
    .locals 1

    iget-object v0, p0, Li1/l0;->i:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->N()V

    iget-object v0, p0, Li1/l0;->g:Lk1/z0;

    invoke-virtual {v0}, Lk1/z0;->l()V

    iget-object v0, p0, Li1/l0;->m:Lk1/z3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk1/z3;->b()V

    :cond_0
    iget-object v0, p0, Li1/l0;->l:Lk1/z3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lk1/z3;->b()V

    :cond_1
    return-void
.end method

.method private synthetic R(Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;
    .locals 2

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    iget-object v1, p0, Li1/l0;->d:Lp1/g;

    invoke-virtual {v0, v1, p1, p2}, Li1/b1;->z(Lp1/g;Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic S(Lo0/i;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    invoke-virtual {v0, p1}, Li1/b1;->s(Lo0/i;)V

    return-void
.end method

.method private synthetic T(Ljava/util/List;Lo0/i;)V
    .locals 1

    iget-object v0, p0, Li1/l0;->j:Li1/b1;

    invoke-virtual {v0, p1, p2}, Li1/b1;->B(Ljava/util/List;Lo0/i;)V

    return-void
.end method

.method public static synthetic a(Lo0/h;)Ll1/i;
    .locals 0

    invoke-static {p0}, Li1/l0;->E(Lo0/h;)Ll1/i;

    move-result-object p0

    return-object p0
.end method

.method private a0()V
    .locals 2

    invoke-virtual {p0}, Li1/l0;->A()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The client has already been terminated"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic b(Li1/l0;Li1/y0;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->P(Li1/y0;)V

    return-void
.end method

.method public static synthetic c(Li1/l0;)V
    .locals 0

    invoke-direct {p0}, Li1/l0;->Q()V

    return-void
.end method

.method public static synthetic d(Li1/l0;Ljava/lang/String;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/l0;->H(Ljava/lang/String;Lo0/i;)V

    return-void
.end method

.method public static synthetic e(Li1/l0;Li1/y0;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->I(Li1/y0;)V

    return-void
.end method

.method public static synthetic f(Li1/l0;Lg1/j;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->L(Lg1/j;)V

    return-void
.end method

.method public static synthetic g(Li1/l0;Ljava/util/List;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/l0;->T(Ljava/util/List;Lo0/i;)V

    return-void
.end method

.method public static synthetic h(Li1/l0;Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Li1/l0;->K(Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V

    return-void
.end method

.method public static synthetic i(Li1/l0;Lcom/google/firebase/firestore/j;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->B(Lcom/google/firebase/firestore/j;)V

    return-void
.end method

.method public static synthetic j(Li1/l0;Lh1/f;Lcom/google/firebase/firestore/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/l0;->J(Lh1/f;Lcom/google/firebase/firestore/c0;)V

    return-void
.end method

.method public static synthetic k(Li1/l0;Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/l0;->R(Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Li1/l0;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->S(Lo0/i;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Li1/l0;->N(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic n(Li1/l0;Lcom/google/firebase/firestore/j;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->O(Lcom/google/firebase/firestore/j;)V

    return-void
.end method

.method public static synthetic o(Li1/l0;Li1/x0;)Li1/u1;
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->G(Li1/x0;)Li1/u1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Li1/l0;)V
    .locals 0

    invoke-direct {p0}, Li1/l0;->C()V

    return-void
.end method

.method public static synthetic q(Li1/l0;Ll1/l;)Ll1/i;
    .locals 0

    invoke-direct {p0, p1}, Li1/l0;->F(Ll1/l;)Ll1/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Li1/l0;)V
    .locals 0

    invoke-direct {p0}, Li1/l0;->D()V

    return-void
.end method

.method public static synthetic s(Li1/l0;Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;Lg1/j;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Li1/l0;->M(Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;Lg1/j;)V

    return-void
.end method

.method private z(Landroid/content/Context;Lg1/j;Lcom/google/firebase/firestore/v;)V
    .locals 11

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2}, Lg1/j;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "FirestoreClient"

    const-string v2, "Initializing. user=%s"

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lo1/m;

    iget-object v4, p0, Li1/l0;->a:Li1/m;

    iget-object v5, p0, Li1/l0;->d:Lp1/g;

    iget-object v6, p0, Li1/l0;->b:Lg1/a;

    iget-object v7, p0, Li1/l0;->c:Lg1/a;

    iget-object v9, p0, Li1/l0;->f:Lo1/e0;

    move-object v3, v0

    move-object v8, p1

    invoke-direct/range {v3 .. v9}, Lo1/m;-><init>(Li1/m;Lp1/g;Lg1/a;Lg1/a;Landroid/content/Context;Lo1/e0;)V

    new-instance v1, Li1/j$a;

    iget-object v5, p0, Li1/l0;->d:Lp1/g;

    iget-object v6, p0, Li1/l0;->a:Li1/m;

    const/16 v9, 0x64

    move-object v3, v1

    move-object v4, p1

    move-object v7, v0

    move-object v8, p2

    move-object v10, p3

    invoke-direct/range {v3 .. v10}, Li1/j$a;-><init>(Landroid/content/Context;Lp1/g;Li1/m;Lo1/m;Lg1/j;ILcom/google/firebase/firestore/v;)V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/v;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Li1/a1;

    invoke-direct {p1}, Li1/a1;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Li1/t0;

    invoke-direct {p1}, Li1/t0;-><init>()V

    :goto_0
    invoke-virtual {p1, v1}, Li1/j;->q(Li1/j$a;)V

    invoke-virtual {p1}, Li1/j;->n()Lk1/z0;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->g:Lk1/z0;

    invoke-virtual {p1}, Li1/j;->k()Lk1/z3;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->m:Lk1/z3;

    invoke-virtual {p1}, Li1/j;->m()Lk1/f0;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->h:Lk1/f0;

    invoke-virtual {p1}, Li1/j;->o()Lo1/n0;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->i:Lo1/n0;

    invoke-virtual {p1}, Li1/j;->p()Li1/b1;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->j:Li1/b1;

    invoke-virtual {p1}, Li1/j;->j()Li1/p;

    move-result-object p2

    iput-object p2, p0, Li1/l0;->k:Li1/p;

    invoke-virtual {p1}, Li1/j;->l()Lk1/k;

    move-result-object p1

    iget-object p2, p0, Li1/l0;->m:Lk1/z3;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lk1/z3;->a()V

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lk1/k;->f()Lk1/k$a;

    move-result-object p1

    iput-object p1, p0, Li1/l0;->l:Lk1/z3;

    invoke-interface {p1}, Lk1/z3;->a()V

    :cond_2
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->p()Z

    move-result v0

    return v0
.end method

.method public U(Li1/x0;Li1/p$a;Lcom/google/firebase/firestore/j;)Li1/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Li1/p$a;",
            "Lcom/google/firebase/firestore/j<",
            "Li1/u1;",
            ">;)",
            "Li1/y0;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    new-instance v0, Li1/y0;

    invoke-direct {v0, p1, p2, p3}, Li1/y0;-><init>(Li1/x0;Li1/p$a;Lcom/google/firebase/firestore/j;)V

    iget-object p1, p0, Li1/l0;->d:Lp1/g;

    new-instance p2, Li1/j0;

    invoke-direct {p2, p0, v0}, Li1/j0;-><init>(Li1/l0;Li1/y0;)V

    invoke-virtual {p1, p2}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public V(Ljava/io/InputStream;Lcom/google/firebase/firestore/c0;)V
    .locals 2

    invoke-direct {p0}, Li1/l0;->a0()V

    new-instance v0, Lh1/f;

    iget-object v1, p0, Li1/l0;->e:Lh1/g;

    invoke-direct {v0, v1, p1}, Lh1/f;-><init>(Lh1/g;Ljava/io/InputStream;)V

    iget-object p1, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/h0;

    invoke-direct {v1, p0, v0, p2}, Li1/h0;-><init>(Li1/l0;Lh1/f;Lcom/google/firebase/firestore/c0;)V

    invoke-virtual {p1, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public W(Lcom/google/firebase/firestore/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/j<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Li1/l0;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/f0;

    invoke-direct {v1, p0, p1}, Li1/f0;-><init>(Li1/l0;Lcom/google/firebase/firestore/j;)V

    invoke-virtual {v0, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public X(Li1/y0;)V
    .locals 2

    invoke-virtual {p0}, Li1/l0;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/i0;

    invoke-direct {v1, p0, p1}, Li1/i0;-><init>(Li1/l0;Li1/y0;)V

    invoke-virtual {v0, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public Y()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/l0;->b:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->c()V

    iget-object v0, p0, Li1/l0;->c:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->c()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/s;

    invoke-direct {v1, p0}, Li1/s;-><init>(Li1/l0;)V

    invoke-virtual {v0, v1}, Lp1/g;->n(Ljava/lang/Runnable;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public Z(Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/firestore/u0;",
            "Lp1/t<",
            "Li1/g1;",
            "Lo0/h<",
            "TTResult;>;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Li1/w;

    invoke-direct {v1, p0, p1, p2}, Li1/w;-><init>(Li1/l0;Lcom/google/firebase/firestore/u0;Lp1/t;)V

    invoke-static {v0, v1}, Lp1/g;->g(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public b0()Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Li1/l0;->d:Lp1/g;

    new-instance v2, Li1/u;

    invoke-direct {v2, p0, v0}, Li1/u;-><init>(Li1/l0;Lo0/i;)V

    invoke-virtual {v1, v2}, Lp1/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public c0(Ljava/util/List;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Li1/l0;->d:Lp1/g;

    new-instance v2, Li1/t;

    invoke-direct {v2, p0, p1, v0}, Li1/t;-><init>(Li1/l0;Ljava/util/List;Lo0/i;)V

    invoke-virtual {v1, v2}, Lp1/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/google/firebase/firestore/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/j<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/e0;

    invoke-direct {v1, p0, p1}, Li1/e0;-><init>(Li1/l0;Lcom/google/firebase/firestore/j;)V

    invoke-virtual {v0, v1}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public u()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/c0;

    invoke-direct {v1, p0}, Li1/c0;-><init>(Li1/l0;)V

    invoke-virtual {v0, v1}, Lp1/g;->i(Ljava/lang/Runnable;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public v()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/d0;

    invoke-direct {v1, p0}, Li1/d0;-><init>(Li1/l0;)V

    invoke-virtual {v0, v1}, Lp1/g;->i(Ljava/lang/Runnable;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public w(Ll1/l;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            ")",
            "Lo0/h<",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/y;

    invoke-direct {v1, p0, p1}, Li1/y;-><init>(Li1/l0;Ll1/l;)V

    invoke-virtual {v0, v1}, Lp1/g;->j(Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    sget-object v0, Li1/z;->a:Li1/z;

    invoke-virtual {p1, v0}, Lo0/h;->i(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public x(Li1/x0;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            ")",
            "Lo0/h<",
            "Li1/u1;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    iget-object v0, p0, Li1/l0;->d:Lp1/g;

    new-instance v1, Li1/x;

    invoke-direct {v1, p0, p1}, Li1/x;-><init>(Li1/l0;Li1/x0;)V

    invoke-virtual {v0, v1}, Lp1/g;->j(Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/lang/String;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Li1/x0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/l0;->a0()V

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Li1/l0;->d:Lp1/g;

    new-instance v2, Li1/k0;

    invoke-direct {v2, p0, p1, v0}, Li1/k0;-><init>(Li1/l0;Ljava/lang/String;Lo0/i;)V

    invoke-virtual {v1, v2}, Lp1/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method
