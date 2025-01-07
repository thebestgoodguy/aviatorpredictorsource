.class public abstract Ld4/a;
.super Ld4/c;
.source ""

# interfaces
.implements Ld4/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld4/a$c;,
        Ld4/a$a;,
        Ld4/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ld4/c<",
        "TE;>;",
        "Ld4/f<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lu3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld4/c;-><init>(Lu3/l;)V

    return-void
.end method

.method public static final synthetic n(Ld4/a;Ld4/o;)Z
    .locals 0

    invoke-direct {p0, p1}, Ld4/a;->p(Ld4/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Ld4/a;Lb4/k;Ld4/o;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld4/a;->w(Lb4/k;Ld4/o;)V

    return-void
.end method

.method private final p(Ld4/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld4/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ld4/a;->q(Ld4/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ld4/a;->u()V

    :cond_0
    return p1
.end method

.method private final w(Lb4/k;Ld4/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/k<",
            "*>;",
            "Ld4/o<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Ld4/a$c;

    invoke-direct {v0, p0, p2}, Ld4/a$c;-><init>(Ld4/a;Ld4/o;)V

    invoke-interface {p1, v0}, Lb4/k;->f(Lu3/l;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ld4/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld4/g<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ld4/a$a;

    invoke-direct {v0, p0}, Ld4/a$a;-><init>(Ld4/a;)V

    return-object v0
.end method

.method protected l()Ld4/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld4/q<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, Ld4/c;->l()Ld4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Ld4/j;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ld4/a;->t()V

    :cond_0
    return-object v0
.end method

.method protected q(Ld4/o;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld4/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ld4/a;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ld4/c;->e()Lkotlinx/coroutines/internal/l;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/n;->q()Lkotlinx/coroutines/internal/n;

    move-result-object v3

    instance-of v4, v3, Ld4/s;

    xor-int/2addr v4, v2

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p1, v0}, Lkotlinx/coroutines/internal/n;->j(Lkotlinx/coroutines/internal/n;Lkotlinx/coroutines/internal/n;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ld4/c;->e()Lkotlinx/coroutines/internal/l;

    move-result-object v0

    new-instance v3, Ld4/a$d;

    invoke-direct {v3, p1, p0}, Ld4/a$d;-><init>(Lkotlinx/coroutines/internal/n;Ld4/a;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/n;->q()Lkotlinx/coroutines/internal/n;

    move-result-object v4

    instance-of v5, v4, Ld4/s;

    xor-int/2addr v5, v2

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, p1, v0, v3}, Lkotlinx/coroutines/internal/n;->x(Lkotlinx/coroutines/internal/n;Lkotlinx/coroutines/internal/n;Lkotlinx/coroutines/internal/n$a;)I

    move-result v4

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v1, 0x1

    :cond_5
    :goto_2
    return v1
.end method

.method protected abstract r()Z
.end method

.method protected abstract s()Z
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method protected u()V
    .locals 0

    return-void
.end method

.method protected v()Ljava/lang/Object;
    .locals 3

    :goto_0
    invoke-virtual {p0}, Ld4/c;->m()Ld4/s;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld4/b;->d:Lkotlinx/coroutines/internal/y;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld4/s;->A(Lkotlinx/coroutines/internal/n$b;)Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lb4/q0;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lb4/n;->a:Lkotlinx/coroutines/internal/y;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    :goto_2
    invoke-virtual {v0}, Ld4/s;->y()V

    invoke-virtual {v0}, Ld4/s;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-virtual {v0}, Ld4/s;->B()V

    goto :goto_0
.end method
