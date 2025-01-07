.class public Lb4/w1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb4/p1;
.implements Lb4/t;
.implements Lb4/d2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/w1$b;,
        Lb4/w1$a;
    }
.end annotation


# static fields
.field private static final synthetic e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lb4/w1;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, Lb4/x1;->c()Lb4/z0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lb4/x1;->d()Lb4/z0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb4/w1;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lb4/w1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb4/k1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lb4/w1$b;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lb4/w1$b;

    invoke-virtual {v1}, Lb4/w1$b;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lb4/z;

    invoke-direct {p0, p1}, Lb4/w1;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lb4/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/e;)V

    invoke-direct {p0, v0, v1}, Lb4/w1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1
.end method

.method private final B(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lb4/w1;->U()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lb4/w1;->O()Lb4/r;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lb4/b2;->e:Lb4/b2;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lb4/r;->i(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final E(Lb4/k1;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lb4/w1;->O()Lb4/r;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lb4/y0;->d()V

    sget-object v0, Lb4/b2;->e:Lb4/b2;

    invoke-virtual {p0, v0}, Lb4/w1;->i0(Lb4/r;)V

    :goto_0
    instance-of v0, p2, Lb4/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lb4/z;

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p2, Lb4/z;->a:Ljava/lang/Throwable;

    :goto_2
    instance-of p2, p1, Lb4/v1;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lb4/v1;

    invoke-virtual {p2, v1}, Lb4/b0;->y(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    new-instance v0, Lb4/c0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lb4/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lb4/w1;->R(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_3
    invoke-interface {p1}, Lb4/k1;->f()Lb4/a2;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-direct {p0, p1, v1}, Lb4/w1;->b0(Lb4/a2;Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method private final F(Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-direct {p0, p2}, Lb4/w1;->Z(Lkotlinx/coroutines/internal/n;)Lb4/s;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-direct {p0, p1, p2, p3}, Lb4/w1;->s0(Lb4/w1$b;Lb4/s;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-void

    :cond_3
    invoke-direct {p0, p1, p3}, Lb4/w1;->H(Lb4/w1$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb4/w1;->x(Ljava/lang/Object;)V

    return-void
.end method

.method private final G(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lb4/q1;

    invoke-static {p0}, Lb4/w1;->g(Lb4/w1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lb4/d2;

    invoke-interface {p1}, Lb4/d2;->i()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final H(Lb4/w1$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lb4/w1$b;->i()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    :goto_2
    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lb4/w1$b;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_3
    instance-of v0, p2, Lb4/z;

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Lb4/z;

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    if-nez v0, :cond_8

    move-object v0, v3

    goto :goto_5

    :cond_8
    iget-object v0, v0, Lb4/z;->a:Ljava/lang/Throwable;

    :goto_5
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lb4/w1$b;->g()Z

    move-result v4

    invoke-virtual {p1, v0}, Lb4/w1$b;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, p1, v5}, Lb4/w1;->K(Lb4/w1$b;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-direct {p0, v6, v5}, Lb4/w1;->w(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    monitor-exit p1

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    if-ne v6, v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance p2, Lb4/z;

    const/4 v0, 0x2

    invoke-direct {p2, v6, v2, v0, v3}, Lb4/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/e;)V

    :goto_6
    if-eqz v6, :cond_e

    invoke-direct {p0, v6}, Lb4/w1;->B(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0, v6}, Lb4/w1;->Q(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_7

    :cond_c
    const/4 v1, 0x0

    :cond_d
    :goto_7
    if-eqz v1, :cond_e

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lb4/z;

    invoke-virtual {v0}, Lb4/z;->b()Z

    :cond_e
    if-nez v4, :cond_f

    invoke-virtual {p0, v6}, Lb4/w1;->c0(Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {p0, p2}, Lb4/w1;->d0(Ljava/lang/Object;)V

    sget-object v0, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lb4/x1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {}, Lb4/q0;->a()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_10

    goto :goto_8

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_11
    :goto_8
    invoke-direct {p0, p1, p2}, Lb4/w1;->E(Lb4/k1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private final I(Lb4/k1;)Lb4/s;
    .locals 2

    instance-of v0, p1, Lb4/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lb4/s;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    invoke-interface {p1}, Lb4/k1;->f()Lb4/a2;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1}, Lb4/w1;->Z(Lkotlinx/coroutines/internal/n;)Lb4/s;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    return-object v1
.end method

.method private final J(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lb4/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lb4/z;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p1, Lb4/z;->a:Ljava/lang/Throwable;

    :goto_1
    return-object v1
.end method

.method private final K(Lb4/w1$b;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/w1$b;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lb4/w1$b;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lb4/q1;

    invoke-static {p0}, Lb4/w1;->g(Lb4/w1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_3
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method private final N(Lb4/k1;)Lb4/a2;
    .locals 1

    invoke-interface {p1}, Lb4/k1;->f()Lb4/a2;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lb4/z0;

    if-eqz v0, :cond_0

    new-instance v0, Lb4/a2;

    invoke-direct {v0}, Lb4/a2;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lb4/v1;

    if-eqz v0, :cond_1

    check-cast p1, Lb4/v1;

    invoke-direct {p0, p1}, Lb4/w1;->g0(Lb4/v1;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "State should have list: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final V(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lb4/w1$b;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lb4/w1$b;

    invoke-virtual {v3}, Lb4/w1$b;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lb4/x1;->f()Lkotlinx/coroutines/internal/y;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lb4/w1$b;

    invoke-virtual {v3}, Lb4/w1$b;->g()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, Lb4/w1;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lb4/w1$b;

    invoke-virtual {p1, v1}, Lb4/w1$b;->a(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lb4/w1$b;

    invoke-virtual {p1}, Lb4/w1$b;->d()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    check-cast v2, Lb4/w1$b;

    invoke-virtual {v2}, Lb4/w1$b;->f()Lb4/a2;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lb4/w1;->a0(Lb4/a2;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lb4/k1;

    if-eqz v3, :cond_c

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, Lb4/w1;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lb4/k1;

    invoke-interface {v3}, Lb4/k1;->e()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, Lb4/w1;->p0(Lb4/k1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lb4/z;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lb4/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/e;)V

    invoke-direct {p0, v2, v3}, Lb4/w1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object v4

    if-eq v3, v4, :cond_b

    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v2

    if-ne v3, v2, :cond_a

    goto/16 :goto_0

    :cond_a
    return-object v3

    :cond_b
    const-string p1, "Cannot happen in "

    invoke-static {p1, v2}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static {}, Lb4/x1;->f()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1
.end method

.method private final X(Lu3/l;Z)Lb4/v1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;Z)",
            "Lb4/v1;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lb4/r1;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lb4/r1;

    :cond_0
    if-nez v0, :cond_6

    new-instance v0, Lb4/n1;

    invoke-direct {v0, p1}, Lb4/n1;-><init>(Lu3/l;)V

    goto :goto_3

    :cond_1
    instance-of p2, p1, Lb4/v1;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lb4/v1;

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p2, Lb4/r1;

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    :goto_1
    move-object v0, p2

    :goto_2
    if-nez v0, :cond_6

    new-instance v0, Lb4/o1;

    invoke-direct {v0, p1}, Lb4/o1;-><init>(Lu3/l;)V

    :cond_6
    :goto_3
    invoke-virtual {v0, p0}, Lb4/v1;->A(Lb4/w1;)V

    return-object v0
.end method

.method private final Z(Lkotlinx/coroutines/internal/n;)Lb4/s;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->q()Lkotlinx/coroutines/internal/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->p()Lkotlinx/coroutines/internal/n;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lb4/s;

    if-eqz v0, :cond_2

    check-cast p1, Lb4/s;

    return-object p1

    :cond_2
    instance-of v0, p1, Lb4/a2;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final a0(Lb4/a2;Ljava/lang/Throwable;)V
    .locals 7

    invoke-virtual {p0, p2}, Lb4/w1;->c0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/n;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    instance-of v3, v0, Lb4/r1;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lb4/v1;

    :try_start_0
    invoke-virtual {v3, p2}, Lb4/b0;->y(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    :cond_0
    invoke-static {v2, v4}, Lk3/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    new-instance v2, Lb4/c0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lb4/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/n;->p()Lkotlinx/coroutines/internal/n;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v2}, Lb4/w1;->R(Ljava/lang/Throwable;)V

    :goto_3
    invoke-direct {p0, p2}, Lb4/w1;->B(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final b0(Lb4/a2;Ljava/lang/Throwable;)V
    .locals 7

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/n;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    instance-of v3, v0, Lb4/v1;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lb4/v1;

    :try_start_0
    invoke-virtual {v3, p2}, Lb4/b0;->y(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    :cond_0
    invoke-static {v2, v4}, Lk3/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    new-instance v2, Lb4/c0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lb4/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/n;->p()Lkotlinx/coroutines/internal/n;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v2}, Lb4/w1;->R(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method private final f0(Lb4/z0;)V
    .locals 2

    new-instance v0, Lb4/a2;

    invoke-direct {v0}, Lb4/a2;-><init>()V

    invoke-virtual {p1}, Lb4/z0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lb4/j1;

    invoke-direct {v1, v0}, Lb4/j1;-><init>(Lb4/a2;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static final synthetic g(Lb4/w1;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lb4/w1;->C()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final g0(Lb4/v1;)V
    .locals 2

    new-instance v0, Lb4/a2;

    invoke-direct {v0}, Lb4/a2;-><init>()V

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/internal/n;->k(Lkotlinx/coroutines/internal/n;)Z

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->p()Lkotlinx/coroutines/internal/n;

    move-result-object v0

    sget-object v1, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final j0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lb4/z0;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lb4/z0;

    invoke-virtual {v0}, Lb4/z0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lb4/x1;->c()Lb4/z0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lb4/w1;->e0()V

    return v2

    :cond_2
    instance-of v0, p1, Lb4/j1;

    if-eqz v0, :cond_4

    sget-object v0, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lb4/j1;

    invoke-virtual {v3}, Lb4/j1;->f()Lb4/a2;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lb4/w1;->e0()V

    return v2

    :cond_4
    return v3
.end method

.method private final k0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lb4/w1$b;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lb4/w1$b;

    invoke-virtual {p1}, Lb4/w1$b;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb4/w1$b;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lb4/k1;

    if-eqz v0, :cond_3

    check-cast p1, Lb4/k1;

    invoke-interface {p1}, Lb4/k1;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lb4/z;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public static synthetic m0(Lb4/w1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lb4/w1;->l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final o0(Lb4/k1;Ljava/lang/Object;)Z
    .locals 4

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    instance-of v0, p1, Lb4/z0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lb4/v1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_2
    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p2, Lb4/z;

    xor-int/2addr v0, v2

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    :goto_3
    sget-object v0, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lb4/x1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb4/w1;->c0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lb4/w1;->d0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lb4/w1;->E(Lb4/k1;Ljava/lang/Object;)V

    return v2
.end method

.method private final p0(Lb4/k1;Ljava/lang/Throwable;)Z
    .locals 5

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    instance-of v0, p1, Lb4/w1$b;

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lb4/k1;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lb4/w1;->N(Lb4/k1;)Lb4/a2;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_4

    return v2

    :cond_4
    new-instance v3, Lb4/w1$b;

    invoke-direct {v3, v0, v2, p2}, Lb4/w1$b;-><init>(Lb4/a2;ZLjava/lang/Throwable;)V

    sget-object v4, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v3}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    invoke-direct {p0, v0, p2}, Lb4/w1;->a0(Lb4/a2;Ljava/lang/Throwable;)V

    return v1
.end method

.method public static final synthetic q(Lb4/w1;Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb4/w1;->F(Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V

    return-void
.end method

.method private final q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lb4/k1;

    if-nez v0, :cond_0

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lb4/z0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lb4/v1;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lb4/s;

    if-nez v0, :cond_3

    instance-of v0, p2, Lb4/z;

    if-nez v0, :cond_3

    check-cast p1, Lb4/k1;

    invoke-direct {p0, p1, p2}, Lb4/w1;->o0(Lb4/k1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lb4/k1;

    invoke-direct {p0, p1, p2}, Lb4/w1;->r0(Lb4/k1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final r0(Lb4/k1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-direct {p0, p1}, Lb4/w1;->N(Lb4/k1;)Lb4/a2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lb4/w1$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lb4/w1$b;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Lb4/w1$b;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Lb4/w1$b;-><init>(Lb4/a2;ZLjava/lang/Throwable;)V

    :cond_2
    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lb4/w1$b;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v3, 0x1

    :try_start_1
    invoke-virtual {v1, v3}, Lb4/w1$b;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v4, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v1}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-static {}, Lb4/q0;->a()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v1}, Lb4/w1$b;->i()Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_1
    invoke-virtual {v1}, Lb4/w1$b;->g()Z

    move-result v4

    instance-of v5, p2, Lb4/z;

    if-eqz v5, :cond_7

    move-object v5, p2

    check-cast v5, Lb4/z;

    goto :goto_2

    :cond_7
    move-object v5, v2

    :goto_2
    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    iget-object v5, v5, Lb4/z;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Lb4/w1$b;->a(Ljava/lang/Throwable;)V

    :goto_3
    invoke-virtual {v1}, Lb4/w1$b;->d()Ljava/lang/Throwable;

    move-result-object v5

    xor-int/2addr v3, v4

    if-eqz v3, :cond_9

    move-object v2, v5

    :cond_9
    sget-object v3, Lk3/s;->a:Lk3/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-nez v2, :cond_a

    goto :goto_4

    :cond_a
    invoke-direct {p0, v0, v2}, Lb4/w1;->a0(Lb4/a2;Ljava/lang/Throwable;)V

    :goto_4
    invoke-direct {p0, p1}, Lb4/w1;->I(Lb4/k1;)Lb4/s;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-direct {p0, v1, p1, p2}, Lb4/w1;->s0(Lb4/w1$b;Lb4/s;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Lb4/x1;->b:Lkotlinx/coroutines/internal/y;

    return-object p1

    :cond_b
    invoke-direct {p0, v1, p2}, Lb4/w1;->H(Lb4/w1$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method private final s0(Lb4/w1$b;Lb4/s;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lb4/s;->i:Lb4/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lb4/w1$a;

    invoke-direct {v3, p0, p1, p2, p3}, Lb4/w1$a;-><init>(Lb4/w1;Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lb4/p1$a;->d(Lb4/p1;ZZLu3/l;ILjava/lang/Object;)Lb4/y0;

    move-result-object v0

    sget-object v1, Lb4/b2;->e:Lb4/b2;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, Lb4/w1;->Z(Lkotlinx/coroutines/internal/n;)Lb4/s;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method private final u(Ljava/lang/Object;Lb4/a2;Lb4/v1;)Z
    .locals 2

    new-instance v0, Lb4/w1$c;

    invoke-direct {v0, p3, p0, p1}, Lb4/w1$c;-><init>(Lkotlinx/coroutines/internal/n;Lb4/w1;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/n;->q()Lkotlinx/coroutines/internal/n;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lkotlinx/coroutines/internal/n;->x(Lkotlinx/coroutines/internal/n;Lkotlinx/coroutines/internal/n;Lkotlinx/coroutines/internal/n$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final w(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {}, Lb4/q0;->d()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lkotlinx/coroutines/internal/x;->n(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {}, Lb4/q0;->d()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lkotlinx/coroutines/internal/x;->n(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v2

    :goto_2
    if-eq v2, p1, :cond_2

    if-eq v2, v1, :cond_2

    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p1, v2}, Lk3/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public D(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lb4/w1;->y(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lb4/w1;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public M()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O()Lb4/r;
    .locals 1

    iget-object v0, p0, Lb4/w1;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lb4/r;

    return-object v0
.end method

.method public final P()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lb4/w1;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/u;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/u;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected Q(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public R(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method protected final S(Lb4/p1;)V
    .locals 1

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb4/w1;->O()Lb4/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    sget-object p1, Lb4/b2;->e:Lb4/b2;

    invoke-virtual {p0, p1}, Lb4/w1;->i0(Lb4/r;)V

    return-void

    :cond_3
    invoke-interface {p1}, Lb4/p1;->a()Z

    invoke-interface {p1, p0}, Lb4/p1;->v(Lb4/t;)Lb4/r;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb4/w1;->i0(Lb4/r;)V

    invoke-virtual {p0}, Lb4/w1;->T()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lb4/y0;->d()V

    sget-object p1, Lb4/b2;->e:Lb4/b2;

    invoke-virtual {p0, p1}, Lb4/w1;->i0(Lb4/r;)V

    :cond_4
    return-void
.end method

.method public final T()Z
    .locals 1

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lb4/k1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final W(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :goto_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lb4/w1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lb4/x1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lb4/w1;->J(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lb4/w1;->j0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected c0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method protected d0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 2

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb4/k1;

    if-eqz v1, :cond_0

    check-cast v0, Lb4/k1;

    invoke-interface {v0}, Lb4/k1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected e0()V
    .locals 0

    return-void
.end method

.method public fold(Ljava/lang/Object;Lu3/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lu3/p<",
            "-TR;-",
            "Ln3/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lb4/p1$a;->b(Lb4/p1;Ljava/lang/Object;Lu3/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ln3/g$c;)Ln3/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ln3/g$b;",
            ">(",
            "Ln3/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb4/p1$a;->c(Lb4/p1;Ln3/g$c;)Ln3/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Ln3/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln3/g$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lb4/p1;->a:Lb4/p1$b;

    return-object v0
.end method

.method public final h(ZZLu3/l;)Lb4/y0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lu3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;)",
            "Lb4/y0;"
        }
    .end annotation

    invoke-direct {p0, p3, p1}, Lb4/w1;->X(Lu3/l;Z)Lb4/v1;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lb4/z0;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lb4/z0;

    invoke-virtual {v2}, Lb4/z0;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-direct {p0, v2}, Lb4/w1;->f0(Lb4/z0;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lb4/k1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lb4/k1;

    invoke-interface {v2}, Lb4/k1;->f()Lb4/a2;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lb4/v1;

    invoke-direct {p0, v1}, Lb4/w1;->g0(Lb4/v1;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lb4/b2;->e:Lb4/b2;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lb4/w1$b;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lb4/w1$b;

    invoke-virtual {v3}, Lb4/w1$b;->d()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lb4/s;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lb4/w1$b;

    invoke-virtual {v5}, Lb4/w1$b;->h()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lb4/w1;->u(Ljava/lang/Object;Lb4/a2;Lb4/v1;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Lk3/s;->a:Lk3/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lu3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-direct {p0, v1, v2, v0}, Lb4/w1;->u(Ljava/lang/Object;Lb4/a2;Lb4/v1;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lb4/z;

    if-eqz p1, :cond_c

    check-cast v1, Lb4/z;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-nez v1, :cond_d

    goto :goto_3

    :cond_d
    iget-object v3, v1, Lb4/z;->a:Ljava/lang/Throwable;

    :goto_3
    invoke-interface {p3, v3}, Lu3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lb4/b2;->e:Lb4/b2;

    return-object p1
.end method

.method public final h0(Lb4/v1;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb4/v1;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lb4/w1;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lb4/x1;->c()Lb4/z0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lb4/l;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lb4/k1;

    if-eqz v1, :cond_3

    check-cast v0, Lb4/k1;

    invoke-interface {v0}, Lb4/k1;->f()Lb4/a2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/n;->u()Z

    :cond_3
    return-void
.end method

.method public i()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb4/w1$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lb4/w1$b;

    invoke-virtual {v1}, Lb4/w1$b;->d()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lb4/z;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lb4/z;

    iget-object v1, v1, Lb4/z;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lb4/k1;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lb4/q1;

    invoke-direct {p0, v0}, Lb4/w1;->k0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-static {v3, v0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    :cond_3
    return-object v2

    :cond_4
    const-string v1, "Cannot be cancelling child in this state: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final i0(Lb4/r;)V
    .locals 0

    iput-object p1, p0, Lb4/w1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public final l()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lb4/w1$b;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lb4/w1$b;

    invoke-virtual {v0}, Lb4/w1$b;->d()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " is cancelling"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lb4/w1;->l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v2, p0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    instance-of v1, v0, Lb4/k1;

    if-nez v1, :cond_3

    instance-of v1, v0, Lb4/z;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lb4/z;

    iget-object v0, v0, Lb4/z;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lb4/w1;->m0(Lb4/w1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lb4/q1;

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    :goto_0
    return-object v0

    :cond_3
    invoke-static {v2, p0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected final l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lb4/q1;

    if-nez p2, :cond_1

    invoke-static {p0}, Lb4/w1;->g(Lb4/w1;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    :cond_2
    return-object v0
.end method

.method public minusKey(Ln3/g$c;)Ln3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/g$c<",
            "*>;)",
            "Ln3/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb4/p1$a;->e(Lb4/p1;Ln3/g$c;)Ln3/g;

    move-result-object p1

    return-object p1
.end method

.method public final n0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lb4/w1;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb4/w1;->P()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lb4/w1;->k0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public plus(Ln3/g;)Ln3/g;
    .locals 0

    invoke-static {p0, p1}, Lb4/p1$a;->f(Lb4/p1;Ln3/g;)Ln3/g;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lb4/q1;

    invoke-static {p0}, Lb4/w1;->g(Lb4/w1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lb4/q1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lb4/p1;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lb4/w1;->z(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final t(Lb4/d2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb4/w1;->y(Ljava/lang/Object;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lb4/w1;->n0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lb4/r0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Lb4/t;)Lb4/r;
    .locals 6

    new-instance v3, Lb4/s;

    invoke-direct {v3, p1}, Lb4/s;-><init>(Lb4/t;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lb4/p1$a;->d(Lb4/p1;ZZLu3/l;ILjava/lang/Object;)Lb4/y0;

    move-result-object p1

    check-cast p1, Lb4/r;

    return-object p1
.end method

.method protected x(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final y(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object v0

    invoke-virtual {p0}, Lb4/w1;->M()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lb4/w1;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lb4/x1;->b:Lkotlinx/coroutines/internal/y;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lb4/w1;->V(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lb4/x1;->a()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lb4/x1;->b:Lkotlinx/coroutines/internal/y;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lb4/x1;->f()Lkotlinx/coroutines/internal/y;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lb4/w1;->x(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public z(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb4/w1;->y(Ljava/lang/Object;)Z

    return-void
.end method
