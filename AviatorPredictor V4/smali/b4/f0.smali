.class public final Lb4/f0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "kotlinx.coroutines.scheduler"

    invoke-static {v0}, Lkotlinx/coroutines/internal/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xddf

    if-eq v1, v2, :cond_0

    const v2, 0x1ad6f

    if-ne v1, v2, :cond_2

    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const-string v1, "on"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_1
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "System property \'kotlinx.coroutines.scheduler\' has unrecognized value \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    :goto_1
    sput-boolean v0, Lb4/f0;->a:Z

    return-void
.end method

.method public static final a()Lb4/g0;
    .locals 1

    sget-boolean v0, Lb4/f0;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->l:Lkotlinx/coroutines/scheduling/b;

    goto :goto_0

    :cond_0
    sget-object v0, Lb4/w;->g:Lb4/w;

    :goto_0
    return-object v0
.end method

.method public static final b(Ln3/g;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lb4/q0;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lb4/k0;->f:Lb4/k0$a;

    invoke-interface {p0, v0}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object v0

    check-cast v0, Lb4/k0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lb4/l0;->f:Lb4/l0$a;

    invoke-interface {p0, v1}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object p0

    check-cast p0, Lb4/l0;

    const-string v1, "coroutine"

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lb4/l0;->F()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, p0

    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x23

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lb4/k0;->F()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lb4/m0;Ln3/g;)Ln3/g;
    .locals 2

    invoke-interface {p0}, Lb4/m0;->c()Ln3/g;

    move-result-object p0

    invoke-interface {p0, p1}, Ln3/g;->plus(Ln3/g;)Ln3/g;

    move-result-object p0

    invoke-static {}, Lb4/q0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lb4/k0;

    invoke-static {}, Lb4/q0;->b()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lb4/k0;-><init>(J)V

    invoke-interface {p0, p1}, Ln3/g;->plus(Ln3/g;)Ln3/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    invoke-static {}, Lb4/x0;->a()Lb4/g0;

    move-result-object v0

    if-eq p0, v0, :cond_1

    sget-object v0, Ln3/e;->d:Ln3/e$b;

    invoke-interface {p0, v0}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, Lb4/x0;->a()Lb4/g0;

    move-result-object p0

    invoke-interface {p1, p0}, Ln3/g;->plus(Ln3/g;)Ln3/g;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final d(Lkotlin/coroutines/jvm/internal/e;)Lb4/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/jvm/internal/e;",
            ")",
            "Lb4/i2<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lb4/t0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lb4/i2;

    if-eqz v0, :cond_0

    check-cast p0, Lb4/i2;

    return-object p0
.end method

.method public static final e(Ln3/d;Ln3/g;Ljava/lang/Object;)Lb4/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "*>;",
            "Ln3/g;",
            "Ljava/lang/Object;",
            ")",
            "Lb4/i2<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lb4/j2;->e:Lb4/j2;

    invoke-interface {p1, v0}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    invoke-static {p0}, Lb4/f0;->d(Lkotlin/coroutines/jvm/internal/e;)Lb4/i2;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lb4/i2;->z0(Ln3/g;Ljava/lang/Object;)V

    :goto_1
    return-object p0
.end method
