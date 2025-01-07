.class public final Lcom/google/android/gms/internal/firebase-auth-api/yl;
.super Lcom/google/android/gms/internal/firebase-auth-api/fn;
.source ""


# direct methods
.method public constructor <init>(Lx0/e;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bm;-><init>(Lx0/e;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a:Lcom/google/android/gms/internal/firebase-auth-api/bm;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/fn;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static o(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/uo;)La1/m1;
    .locals 6

    invoke-static {p0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, La1/i1;

    const-string v2, "firebase"

    invoke-direct {v1, p1, v2}, La1/i1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/uo;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->A0()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    new-instance v3, La1/i1;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/firebase-auth-api/hp;

    invoke-direct {v3, v4}, La1/i1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/hp;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, La1/m1;

    invoke-direct {v1, p0, v0}, La1/m1;-><init>(Lx0/e;Ljava/util/List;)V

    new-instance p0, La1/o1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->k0()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j0()J

    move-result-wide v4

    invoke-direct {p0, v2, v3, v4, v5}, La1/o1;-><init>(JJ)V

    invoke-virtual {v1, p0}, La1/m1;->S0(La1/o1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->C0()Z

    move-result p0

    invoke-virtual {v1, p0}, La1/m1;->R0(Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->m0()Lcom/google/firebase/auth/n1;

    move-result-object p0

    invoke-virtual {v1, p0}, La1/m1;->Q0(Lcom/google/firebase/auth/n1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->z0()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, La1/e0;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, La1/m1;->K0(Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public final A(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/yk;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/yk;-><init>(Lcom/google/firebase/auth/h;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/j;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zk;-><init>(Lcom/google/firebase/auth/j;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/al;

    invoke-direct {v0, p3, p4, p5}, Lcom/google/android/gms/internal/firebase-auth-api/al;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p6}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p6}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bl;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/bl;-><init>(Lcom/google/firebase/auth/n0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final E(Lx0/e;Lcom/google/firebase/auth/z;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/cl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cl;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final F(Lx0/e;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dl;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/dl;-><init>(Ljava/lang/String;Lcom/google/firebase/auth/e;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final G(Lx0/e;Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/google/firebase/auth/e;->w0(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/el;

    const-string v1, "sendPasswordResetEmail"

    invoke-direct {v0, p2, p3, p4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/el;-><init>(Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lx0/e;Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;
    .locals 2

    const/4 v0, 0x6

    invoke-virtual {p3, v0}, Lcom/google/firebase/auth/e;->w0(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/el;

    const-string v1, "sendSignInLinkToEmail"

    invoke-direct {v0, p2, p3, p4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/el;-><init>(Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final I(Lx0/e;La1/v0;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fl;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/fl;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final J(Lx0/e;Lcom/google/firebase/auth/h;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/gl;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/gl;-><init>(Lcom/google/firebase/auth/h;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lx0/e;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/il;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/il;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jl;

    invoke-direct {v0, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/jl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lx0/e;Lcom/google/firebase/auth/j;La1/v0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/kl;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/kl;-><init>(Lcom/google/firebase/auth/j;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lx0/e;Lcom/google/firebase/auth/n0;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ll;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ll;-><init>(Lcom/google/firebase/auth/n0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final e(La1/j;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/p0$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lo0/h;
    .locals 12

    new-instance v11, Lcom/google/android/gms/internal/firebase-auth-api/ml;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/ml;-><init>(La1/j;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Z)V

    move-object v0, p2

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-virtual {v11, v1, v3, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->h(Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    move-object v0, p0

    invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object v1

    return-object v1
.end method

.method public final f(La1/j;Lcom/google/firebase/auth/s0;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/p0$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lo0/h;
    .locals 12

    new-instance v11, Lcom/google/android/gms/internal/firebase-auth-api/nl;

    invoke-virtual {p1}, La1/j;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v0, v11

    move-object v1, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/nl;-><init>(Lcom/google/firebase/auth/s0;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2}, Lcom/google/firebase/auth/s0;->e()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-virtual {v11, v1, v3, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->h(Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    move-object v0, p0

    invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object v1

    return-object v1
.end method

.method public final g(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ol;

    invoke-virtual {p2}, Lcom/google/firebase/auth/z;->H0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ol;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/z;->I0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/firebase/auth/z;->p0()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x4278

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x4889ba9b

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const-string v0, "password"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ql;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ql;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p3, Lcom/google/android/gms/internal/firebase-auth-api/pl;

    invoke-direct {p3}, Lcom/google/android/gms/internal/firebase-auth-api/pl;-><init>()V

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/rl;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/rl;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sl;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/sl;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;La1/o0;)Lo0/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tl;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/tl;-><init>(Lcom/google/firebase/auth/n0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/y0;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ul;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ul;-><init>(Lcom/google/firebase/auth/y0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p3, v0}, Lcom/google/firebase/auth/e;->w0(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/vl;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/vl;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/e;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/wl;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/pp;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xl;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xl;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/pp;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p3, p4, p5, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->h(Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    return-void
.end method

.method public final q(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/kk;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/kk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/mk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/nk;

    invoke-direct {v0, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/nk;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ok;

    invoke-direct {v0, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/ok;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lcom/google/firebase/auth/z;La1/q;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/pk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pk;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final v(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qk;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/qk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lx0/e;Lcom/google/firebase/auth/q0;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/rk;

    invoke-virtual {p3}, Lcom/google/firebase/auth/z;->H0()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/rk;-><init>(Lcom/google/firebase/auth/q0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/q0;Ljava/lang/String;La1/v0;)Lo0/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sk;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/sk;-><init>(Lcom/google/firebase/auth/q0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/tk;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;La1/o0;)Lo0/h;
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/z;->I0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/google/firebase/auth/h;->j0()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x4277

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    instance-of v0, p3, Lcom/google/firebase/auth/j;

    if-eqz v0, :cond_3

    check-cast p3, Lcom/google/firebase/auth/j;

    invoke-virtual {p3}, Lcom/google/firebase/auth/j;->r0()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/uk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/uk;-><init>(Lcom/google/firebase/auth/j;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/xk;-><init>(Lcom/google/firebase/auth/j;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p3, Lcom/google/firebase/auth/n0;

    if-eqz v0, :cond_4

    check-cast p3, Lcom/google/firebase/auth/n0;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->c()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/wk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wk;-><init>(Lcom/google/firebase/auth/n0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/vk;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/vk;-><init>(Lcom/google/firebase/auth/h;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a(Lcom/google/android/gms/internal/firebase-auth-api/en;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
