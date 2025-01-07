.class public Lcom/google/firebase/firestore/FirebaseFirestore;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/FirebaseFirestore$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ll1/f;

.field private final c:Ljava/lang/String;

.field private final d:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Lg1/j;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lp1/g;

.field private final g:Lx0/e;

.field private final h:Lcom/google/firebase/firestore/v0;

.field private final i:Lcom/google/firebase/firestore/FirebaseFirestore$a;

.field private j:Le1/a;

.field private k:Lcom/google/firebase/firestore/v;

.field private volatile l:Li1/l0;

.field private final m:Lo1/e0;


# direct methods
.method constructor <init>(Landroid/content/Context;Ll1/f;Ljava/lang/String;Lg1/a;Lg1/a;Lp1/g;Lx0/e;Lcom/google/firebase/firestore/FirebaseFirestore$a;Lo1/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ll1/f;",
            "Ljava/lang/String;",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;",
            "Lp1/g;",
            "Lx0/e;",
            "Lcom/google/firebase/firestore/FirebaseFirestore$a;",
            "Lo1/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Landroid/content/Context;

    invoke-static {p2}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/f;

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/f;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    new-instance p1, Lcom/google/firebase/firestore/v0;

    invoke-direct {p1, p2}, Lcom/google/firebase/firestore/v0;-><init>(Ll1/f;)V

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lcom/google/firebase/firestore/v0;

    invoke-static {p3}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ljava/lang/String;

    invoke-static {p4}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/a;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Lg1/a;

    invoke-static {p5}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/a;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->e:Lg1/a;

    invoke-static {p6}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/g;

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Lp1/g;

    iput-object p7, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Lx0/e;

    iput-object p8, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->i:Lcom/google/firebase/firestore/FirebaseFirestore$a;

    iput-object p9, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->m:Lo1/e0;

    new-instance p1, Lcom/google/firebase/firestore/v$b;

    invoke-direct {p1}, Lcom/google/firebase/firestore/v$b;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/firestore/v$b;->e()Lcom/google/firebase/firestore/v;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    return-void
.end method

.method private synthetic A(Lo0/i;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0}, Li1/l0;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/firebase/firestore/u;

    const-string v1, "Persistence cannot be cleared while the firestore instance is running."

    sget-object v2, Lcom/google/firebase/firestore/u$a;->o:Lcom/google/firebase/firestore/u$a;

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    iget-object v2, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lk1/u2;->s(Landroid/content/Context;Ll1/f;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/firebase/firestore/u; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private synthetic B(Lo0/h;)Lcom/google/firebase/firestore/k0;
    .locals 1

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/x0;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/k0;

    invoke-direct {v0, p1, p0}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic C(Lcom/google/firebase/firestore/t0$a;Li1/g1;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/t0;

    invoke-direct {v0, p2, p0}, Lcom/google/firebase/firestore/t0;-><init>(Li1/g1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-interface {p1, v0}, Lcom/google/firebase/firestore/t0$a;->a(Lcom/google/firebase/firestore/t0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private synthetic D(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/t0$a;Li1/g1;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/r;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/firebase/firestore/r;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/t0$a;Li1/g1;)V

    invoke-static {p1, v0}, Lo0/k;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private G(Lcom/google/firebase/firestore/v;Le1/a;)Lcom/google/firebase/firestore/v;
    .locals 0

    return-object p1
.end method

.method static H(Landroid/content/Context;Lx0/e;Lr1/a;Lr1/a;Ljava/lang/String;Lcom/google/firebase/firestore/FirebaseFirestore$a;Lo1/e0;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx0/e;",
            "Lr1/a<",
            "La1/b;",
            ">;",
            "Lr1/a<",
            "Lz0/b;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/firebase/firestore/FirebaseFirestore$a;",
            "Lo1/e0;",
            ")",
            "Lcom/google/firebase/firestore/FirebaseFirestore;"
        }
    .end annotation

    invoke-virtual {p1}, Lx0/e;->r()Lx0/m;

    move-result-object v0

    invoke-virtual {v0}, Lx0/m;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v1, p4

    invoke-static {v0, p4}, Ll1/f;->g(Ljava/lang/String;Ljava/lang/String;)Ll1/f;

    move-result-object v3

    new-instance v7, Lp1/g;

    invoke-direct {v7}, Lp1/g;-><init>()V

    new-instance v5, Lg1/i;

    move-object v0, p2

    invoke-direct {v5, p2}, Lg1/i;-><init>(Lr1/a;)V

    new-instance v6, Lg1/e;

    move-object v0, p3

    invoke-direct {v6, p3}, Lg1/e;-><init>(Lr1/a;)V

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    move-object v1, v0

    move-object v2, p0

    move-object v8, p1

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v1 .. v10}, Lcom/google/firebase/firestore/FirebaseFirestore;-><init>(Landroid/content/Context;Ll1/f;Ljava/lang/String;Lg1/a;Lg1/a;Lp1/g;Lx0/e;Lcom/google/firebase/firestore/FirebaseFirestore$a;Lo1/e0;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FirebaseOptions.getProjectId() cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private J(Lcom/google/firebase/firestore/u0;Lcom/google/firebase/firestore/t0$a;Ljava/util/concurrent/Executor;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/firestore/u0;",
            "Lcom/google/firebase/firestore/t0$a<",
            "TResultT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lo0/h<",
            "TResultT;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/t;

    invoke-direct {v0, p0, p3, p2}, Lcom/google/firebase/firestore/t;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/t0$a;)V

    iget-object p2, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {p2, p1, v0}, Li1/l0;->Z(Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Lcom/google/firebase/firestore/FirebaseFirestore;Lo0/h;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->B(Lo0/h;)Lcom/google/firebase/firestore/k0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;Ljava/lang/Void;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->y(Ljava/lang/Runnable;Ljava/lang/Void;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public static synthetic c(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/t0$a;Li1/g1;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/FirebaseFirestore;->D(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/t0$a;Li1/g1;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/firebase/firestore/FirebaseFirestore;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->A(Lo0/i;)V

    return-void
.end method

.method public static synthetic e(Lcom/google/firebase/firestore/FirebaseFirestore;Li1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->z(Li1/h;)V

    return-void
.end method

.method public static synthetic f(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/t0$a;Li1/g1;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->C(Lcom/google/firebase/firestore/t0$a;Li1/g1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private h(Ljava/util/concurrent/Executor;Landroid/app/Activity;Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/o;

    invoke-direct {v0, p3}, Lcom/google/firebase/firestore/o;-><init>(Ljava/lang/Runnable;)V

    new-instance p3, Li1/h;

    invoke-direct {p3, p1, v0}, Li1/h;-><init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/j;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {p1, p3}, Li1/l0;->t(Lcom/google/firebase/firestore/j;)V

    new-instance p1, Lcom/google/firebase/firestore/p;

    invoke-direct {p1, p0, p3}, Lcom/google/firebase/firestore/p;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Li1/h;)V

    invoke-static {p2, p1}, Li1/d;->c(Landroid/app/Activity;Lcom/google/firebase/firestore/a0;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method private q()V
    .locals 10

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    new-instance v4, Li1/m;

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    iget-object v2, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    invoke-virtual {v3}, Lcom/google/firebase/firestore/v;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    invoke-virtual {v5}, Lcom/google/firebase/firestore/v;->d()Z

    move-result v5

    invoke-direct {v4, v1, v2, v3, v5}, Li1/m;-><init>(Ll1/f;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v1, Li1/l0;

    iget-object v3, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    iget-object v6, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Lg1/a;

    iget-object v7, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->e:Lg1/a;

    iget-object v8, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Lp1/g;

    iget-object v9, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->m:Lo1/e0;

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Li1/l0;-><init>(Landroid/content/Context;Li1/m;Lcom/google/firebase/firestore/v;Lg1/a;Lg1/a;Lp1/g;Lo1/e0;)V

    iput-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static setClientLanguage(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {p0}, Lo1/u;->p(Ljava/lang/String;)V

    return-void
.end method

.method public static u(Lx0/e;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    const-string v0, "(default)"

    invoke-static {p0, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->v(Lx0/e;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p0

    return-object p0
.end method

.method private static v(Lx0/e;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    const-string v0, "Provided FirebaseApp must not be null."

    invoke-static {p0, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lcom/google/firebase/firestore/w;

    invoke-virtual {p0, v0}, Lx0/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/w;

    const-string v0, "Firestore component is not present."

    invoke-static {p0, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/w;->c(Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic y(Ljava/lang/Runnable;Ljava/lang/Void;Lcom/google/firebase/firestore/u;)V
    .locals 1

    const/4 p1, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "snapshots-in-sync listeners should never get errors."

    invoke-static {p2, v0, p1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private synthetic z(Li1/h;)V
    .locals 1

    invoke-virtual {p1}, Li1/h;->d()V

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0, p1}, Li1/l0;->W(Lcom/google/firebase/firestore/j;)V

    return-void
.end method


# virtual methods
.method public E(Ljava/io/InputStream;)Lcom/google/firebase/firestore/c0;
    .locals 2

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/c0;

    invoke-direct {v0}, Lcom/google/firebase/firestore/c0;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v1, p1, v0}, Li1/l0;->V(Ljava/io/InputStream;Lcom/google/firebase/firestore/c0;)V

    return-object v0
.end method

.method public F([B)Lcom/google/firebase/firestore/c0;
    .locals 1

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->E(Ljava/io/InputStream;)Lcom/google/firebase/firestore/c0;

    move-result-object p1

    return-object p1
.end method

.method public I(Lcom/google/firebase/firestore/u0;Lcom/google/firebase/firestore/t0$a;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/firestore/u0;",
            "Lcom/google/firebase/firestore/t0$a<",
            "TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "Provided transaction update function must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Li1/g1;->g()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->J(Lcom/google/firebase/firestore/u0;Lcom/google/firebase/firestore/t0$a;Ljava/util/concurrent/Executor;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public K(Lcom/google/firebase/firestore/v;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Le1/a;

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->G(Lcom/google/firebase/firestore/v;Le1/a;)Lcom/google/firebase/firestore/v;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    monitor-enter v0

    :try_start_0
    const-string v1, "Provided settings must not be null."

    invoke-static {p1, v1}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/v;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Lcom/google/firebase/firestore/v;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public L()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->i:Lcom/google/firebase/firestore/FirebaseFirestore$a;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v1

    invoke-virtual {v1}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore$a;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0}, Li1/l0;->Y()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method M(Lcom/google/firebase/firestore/h;)V
    .locals 1

    const-string v0, "Provided DocumentReference must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->k()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p1

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Provided document reference is from a different Cloud Firestore instance."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public N()Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0}, Li1/l0;->b0()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;
    .locals 1

    sget-object v0, Lp1/p;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->i(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->h(Ljava/util/concurrent/Executor;Landroid/app/Activity;Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public j()Lcom/google/firebase/firestore/x0;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/x0;

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/x0;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public k()Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Lp1/g;

    new-instance v2, Lcom/google/firebase/firestore/q;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/firestore/q;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lo0/i;)V

    invoke-virtual {v1, v2}, Lp1/g;->m(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/String;)Lcom/google/firebase/firestore/b;
    .locals 1

    const-string v0, "Provided collection path must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/b;

    invoke-static {p1}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lcom/google/firebase/firestore/b;-><init>(Ll1/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public m(Ljava/lang/String;)Lcom/google/firebase/firestore/k0;
    .locals 3

    const-string v0, "Provided collection ID must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    new-instance v0, Lcom/google/firebase/firestore/k0;

    new-instance v1, Li1/x0;

    sget-object v2, Ll1/u;->f:Ll1/u;

    invoke-direct {v1, v2, p1}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Invalid collectionId \'%s\'. Collection IDs must not contain \'/\'."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n()Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0}, Li1/l0;->u()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/String;)Lcom/google/firebase/firestore/h;
    .locals 1

    const-string v0, "Provided document path must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    invoke-static {p1}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/google/firebase/firestore/h;->i(Ll1/u;Lcom/google/firebase/firestore/FirebaseFirestore;)Lcom/google/firebase/firestore/h;

    move-result-object p1

    return-object p1
.end method

.method public p()Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0}, Li1/l0;->v()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public r()Lx0/e;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Lx0/e;

    return-object v0
.end method

.method s()Li1/l0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    return-object v0
.end method

.method t()Ll1/f;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Ll1/f;

    return-object v0
.end method

.method public w(Ljava/lang/String;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/k0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->q()V

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Li1/l0;

    invoke-virtual {v0, p1}, Li1/l0;->y(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/s;

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/s;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-virtual {p1, v0}, Lo0/h;->i(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method x()Lcom/google/firebase/firestore/v0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lcom/google/firebase/firestore/v0;

    return-object v0
.end method
