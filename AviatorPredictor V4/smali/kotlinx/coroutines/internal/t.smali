.class public final Lkotlinx/coroutines/internal/t;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lu3/l;Ljava/lang/Object;Ln3/g;)Lu3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;TE;",
            "Ln3/g;",
            ")",
            "Lu3/l<",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/t$a;

    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/internal/t$a;-><init>(Lu3/l;Ljava/lang/Object;Ln3/g;)V

    return-object v0
.end method

.method public static final b(Lu3/l;Ljava/lang/Object;Ln3/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;TE;",
            "Ln3/g;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lkotlinx/coroutines/internal/t;->c(Lu3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/g0;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lb4/i0;->a(Ln3/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lu3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;TE;",
            "Lkotlinx/coroutines/internal/g0;",
            ")",
            "Lkotlinx/coroutines/internal/g0;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, Lu3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p2, p0}, Lk3/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    return-object p2

    :cond_0
    new-instance p2, Lkotlinx/coroutines/internal/g0;

    const-string v0, "Exception in undelivered element handler for "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lkotlinx/coroutines/internal/g0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public static synthetic d(Lu3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/g0;ILjava/lang/Object;)Lkotlinx/coroutines/internal/g0;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/internal/t;->c(Lu3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/g0;)Lkotlinx/coroutines/internal/g0;

    move-result-object p0

    return-object p0
.end method
