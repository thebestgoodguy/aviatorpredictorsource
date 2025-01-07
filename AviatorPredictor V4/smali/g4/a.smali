.class public final Lg4/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final synthetic a(Ln3/d;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lg4/a;->b(Ln3/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final b(Ln3/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lk3/m;->e:Lk3/m$a;

    invoke-static {p1}, Lk3/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lk3/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ln3/d;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final c(Ln3/d;Ln3/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;",
            "Ln3/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lo3/b;->b(Ln3/d;)Ln3/d;

    move-result-object p0

    sget-object v0, Lk3/m;->e:Lk3/m$a;

    sget-object v0, Lk3/s;->a:Lk3/s;

    invoke-static {v0}, Lk3/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/g;->c(Ln3/d;Ljava/lang/Object;Lu3/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lg4/a;->a(Ln3/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lu3/p;Ljava/lang/Object;Ln3/d;Lu3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/p<",
            "-TR;-",
            "Ln3/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Ln3/d<",
            "-TT;>;",
            "Lu3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lo3/b;->a(Lu3/p;Ljava/lang/Object;Ln3/d;)Ln3/d;

    move-result-object p0

    invoke-static {p0}, Lo3/b;->b(Ln3/d;)Ln3/d;

    move-result-object p0

    sget-object p1, Lk3/m;->e:Lk3/m$a;

    sget-object p1, Lk3/s;->a:Lk3/s;

    invoke-static {p1}, Lk3/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/g;->b(Ln3/d;Ljava/lang/Object;Lu3/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lg4/a;->a(Ln3/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic e(Lu3/p;Ljava/lang/Object;Ln3/d;Lu3/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lg4/a;->d(Lu3/p;Ljava/lang/Object;Ln3/d;Lu3/l;)V

    return-void
.end method
