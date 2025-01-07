.class public final Lcom/google/android/gms/internal/firebase-auth-api/bm;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final c:Lz/a;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/xn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/a;

    const-string v1, "FirebaseAuthFallback:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FirebaseAuth"

    invoke-direct {v0, v2, v1}, Lz/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    return-void
.end method

.method constructor <init>(Lx0/e;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/e;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->a()Lcom/google/android/gms/internal/firebase-auth-api/pm;

    move-result-object v3

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/ik;

    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/qm;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/qm;-><init>(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/pm;Lcom/google/android/gms/internal/firebase-auth-api/on;Lcom/google/android/gms/internal/firebase-auth-api/km;Lcom/google/android/gms/internal/firebase-auth-api/lm;)V

    invoke-direct {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/ik;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/in;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    return-void
.end method

.method private static g(JZ)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    const-string v0, "App hash will not be appended to the request."

    invoke-virtual {p0, v0, p2}, Lz/a;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return p1
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/firebase-auth-api/oh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/oh;->j0()Lcom/google/android/gms/internal/firebase-auth-api/cq;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/oh;->j0()Lcom/google/android/gms/internal/firebase-auth-api/cq;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->a(Lcom/google/android/gms/internal/firebase-auth-api/cq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/firebase-auth-api/qh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qh;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qh;->j0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qh;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->b(Lcom/google/android/gms/internal/firebase-auth-api/fq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final C(Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->j0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->k0()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final D(Lcom/google/android/gms/internal/firebase-auth-api/uh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uh;->j0()Lcom/google/firebase/auth/j;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uh;->j0()Lcom/google/firebase/auth/j;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->d(Lcom/google/firebase/auth/j;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final E(Lcom/google/android/gms/internal/firebase-auth-api/wh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/wh;->j0()Lcom/google/firebase/auth/n0;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/n0;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nn;->a(Lcom/google/firebase/auth/n0;)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->e(Lcom/google/android/gms/internal/firebase-auth-api/kq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final F(Lcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 8

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->m0()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v7, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->l(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->p0()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->j(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p1, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->i(Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->j0()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->q0()Z

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->k0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->n0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wp;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wp;

    move-result-object p1

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->g(JZ)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/co;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/co;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wp;->d(Lcom/google/android/gms/internal/firebase-auth-api/co;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    move-object v1, v6

    move-object v2, v7

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->k(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;JZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-direct {v1, v0, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/un;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->f(Lcom/google/android/gms/internal/firebase-auth-api/wp;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/ai;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 15

    move-object v0, p0

    invoke-static/range {p1 .. p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->k0()Lcom/google/firebase/auth/s0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/s0;->X()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    move-object/from16 v3, p2

    invoke-direct {v8, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->l(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->p0()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->j(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v2, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->i(Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->j0()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->q0()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->m0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->k0()Lcom/google/firebase/auth/s0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/s0;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->k0()Lcom/google/firebase/auth/s0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/s0;->X()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->l0()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->n0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->o0()Ljava/lang/String;

    move-result-object v14

    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/yp;

    move-result-object v9

    invoke-static {v5, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->g(JZ)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/co;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/co;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->d(Lcom/google/android/gms/internal/firebase-auth-api/co;)V

    :cond_2
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    move-object v3, v1

    move-object v4, v8

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->k(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;JZ)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-direct {v4, v3, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/un;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->g(Lcom/google/android/gms/internal/firebase-auth-api/yp;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/ci;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ci;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ci;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->h(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/ei;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ei;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ei;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->i(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/gi;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->j0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->j(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/ii;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ii;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ii;->j0()Lcom/google/firebase/auth/y0;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ii;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ii;->j0()Lcom/google/firebase/auth/y0;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->k(Ljava/lang/String;Lcom/google/firebase/auth/y0;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/li;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;->j0()Lcom/google/firebase/auth/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/li;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/yo;->c(Lcom/google/firebase/auth/e;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/yo;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->l(Lcom/google/android/gms/internal/firebase-auth-api/yo;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/firebase-auth-api/ag;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ag;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ag;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ag;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->w(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/firebase-auth-api/cg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cg;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cg;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->x(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/firebase-auth-api/eg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->y(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/firebase-auth-api/gg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gg;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->z(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/firebase-auth-api/ig;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ig;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ig;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ig;->j0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ig;->k0()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/firebase-auth-api/lg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lg;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lg;->j0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lg;->k0()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/ng;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ng;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ng;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->C(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final o(Lcom/google/android/gms/internal/firebase-auth-api/pg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pg;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pg;->j0()Lcom/google/firebase/auth/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/n0;->s0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pg;->j0()Lcom/google/firebase/auth/n0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/firebase/auth/n0;->m0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pg;->l0()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/lo;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/lo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pg;->k0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->D(Lcom/google/android/gms/internal/firebase-auth-api/lo;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/rg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rg;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rg;->j0()Lcom/google/firebase/auth/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/n0;->s0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rg;->j0()Lcom/google/firebase/auth/n0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/n0;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/no;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/no;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->E(Lcom/google/android/gms/internal/firebase-auth-api/no;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/tg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tg;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->F(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/vg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vg;->j0()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->G(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/xg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->j0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->k0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final t(Lcom/google/android/gms/internal/firebase-auth-api/zg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zg;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zg;->j0()Lcom/google/android/gms/internal/firebase-auth-api/cq;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zg;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zg;->j0()Lcom/google/android/gms/internal/firebase-auth-api/cq;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->I(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/cq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final u(Lcom/google/android/gms/internal/firebase-auth-api/bh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bh;->j0()Lcom/google/firebase/auth/n0;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/n0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bh;->k0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/nn;->a(Lcom/google/firebase/auth/n0;)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->J(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/kq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final v(Lcom/google/android/gms/internal/firebase-auth-api/dh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dh;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->K(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/firebase-auth-api/fh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->j0()Lcom/google/firebase/auth/e;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->L(Ljava/lang/String;Lcom/google/firebase/auth/e;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final x(Lcom/google/android/gms/internal/firebase-auth-api/hh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 5

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hh;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hh;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hh;->j0()Lcom/google/firebase/auth/e;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hh;->l0()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->M(Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final y(Lcom/google/android/gms/internal/firebase-auth-api/jh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 8

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jh;->j0()Lcom/google/android/gms/internal/firebase-auth-api/pp;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/pp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->l0()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v7, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->l(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->n0()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->j(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p1, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->i(Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->j0()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->o0()Z

    move-result v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->g(JZ)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/co;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/co;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->m0(Lcom/google/android/gms/internal/firebase-auth-api/co;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    move-object v1, v6

    move-object v2, v7

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->k(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;JZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-direct {v1, v0, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/un;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->N(Lcom/google/android/gms/internal/firebase-auth-api/pp;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/firebase-auth-api/mh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mh;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/bm;->c:Lz/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zl;Lz/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->O(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method
