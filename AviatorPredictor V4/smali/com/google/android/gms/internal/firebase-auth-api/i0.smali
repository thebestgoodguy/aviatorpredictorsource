.class final Lcom/google/android/gms/internal/firebase-auth-api/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/q0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/e0;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/zr;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/i1;Lcom/google/android/gms/internal/firebase-auth-api/zr;Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->h(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->a:Lcom/google/android/gms/internal/firebase-auth-api/e0;

    return-void
.end method

.method static k(Lcom/google/android/gms/internal/firebase-auth-api/i1;Lcom/google/android/gms/internal/firebase-auth-api/zr;Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/i0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/i0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/i0;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/i1;Lcom/google/android/gms/internal/firebase-auth-api/zr;Lcom/google/android/gms/internal/firebase-auth-api/e0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->m(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/ur;)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->a:Lcom/google/android/gms/internal/firebase-auth-api/e0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e0;->l()Lcom/google/android/gms/internal/firebase-auth-api/d0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/d0;->i()Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/s0;->f(Lcom/google/android/gms/internal/firebase-auth-api/i1;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/s0;->e(Lcom/google/android/gms/internal/firebase-auth-api/zr;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/firebase-auth-api/uq;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/ks;

    iget-object p3, p2, Lcom/google/android/gms/internal/firebase-auth-api/ks;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/j1;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/j1;->c()Lcom/google/android/gms/internal/firebase-auth-api/j1;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/j1;->e()Lcom/google/android/gms/internal/firebase-auth-api/j1;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/firebase-auth-api/ks;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/j1;

    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/is;

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->c:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/p0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->b:Lcom/google/android/gms/internal/firebase-auth-api/i1;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->d:Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/ds;

    move-result-object v3

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->c()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_b

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->e()I

    move-result v4

    const/16 v6, 0xb

    if-eq v4, v6, :cond_3

    and-int/lit8 v5, v4, 0x7

    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->a:Lcom/google/android/gms/internal/firebase-auth-api/e0;

    ushr-int/lit8 v4, v4, 0x3

    invoke-virtual {v1, p3, v5, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->c(Lcom/google/android/gms/internal/firebase-auth-api/yr;Lcom/google/android/gms/internal/firebase-auth-api/e0;I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v1, p2, v4, p3, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->f(Lcom/google/android/gms/internal/firebase-auth-api/p0;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/yr;Lcom/google/android/gms/internal/firebase-auth-api/ds;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->p(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/p0;)Z

    move-result v4

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->C()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-nez v4, :cond_0

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, v6

    :cond_4
    :goto_2
    :try_start_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->c()I

    move-result v8

    if-ne v8, v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->e()I

    move-result v8

    const/16 v9, 0x10

    if-ne v8, v9, :cond_6

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->p()I

    move-result v4

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/i0;->a:Lcom/google/android/gms/internal/firebase-auth-api/e0;

    invoke-virtual {v1, p3, v6, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->c(Lcom/google/android/gms/internal/firebase-auth-api/yr;Lcom/google/android/gms/internal/firebase-auth-api/e0;I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_6
    const/16 v9, 0x1a

    if-ne v8, v9, :cond_8

    if-eqz v6, :cond_7

    invoke-virtual {v1, p2, v6, p3, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->f(Lcom/google/android/gms/internal/firebase-auth-api/p0;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/yr;Lcom/google/android/gms/internal/firebase-auth-api/ds;)V

    goto :goto_2

    :cond_7
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->n()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v7

    goto :goto_2

    :cond_8
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->C()Z

    move-result v8

    if-nez v8, :cond_4

    :goto_3
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->e()I

    move-result v5

    const/16 v8, 0xc

    if-ne v5, v8, :cond_a

    if-eqz v7, :cond_0

    if-eqz v6, :cond_9

    invoke-virtual {v1, v7, v6, p3, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->g(Lcom/google/android/gms/internal/firebase-auth-api/hr;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/yr;Lcom/google/android/gms/internal/firebase-auth-api/ds;)V

    goto :goto_0

    :cond_9
    invoke-virtual {v0, v2, v4, v7}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->k(Ljava/lang/Object;ILcom/google/android/gms/internal/firebase-auth-api/hr;)V

    goto :goto_0

    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->b()Lcom/google/android/gms/internal/firebase-auth-api/h;

    move-result-object p2

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
.end method
