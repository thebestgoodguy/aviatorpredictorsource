.class Lo3/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lu3/p;Ljava/lang/Object;Ln3/d;)Ln3/d;
    .locals 2
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
            "-TT;>;)",
            "Ln3/d<",
            "Lk3/s;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Ln3/d;)Ln3/d;

    move-result-object p2

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/a;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/a;->create(Ljava/lang/Object;Ln3/d;)Ln3/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ln3/d;->getContext()Ln3/g;

    move-result-object v0

    sget-object v1, Ln3/h;->e:Ln3/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lo3/c$a;

    invoke-direct {v0, p2, p0, p1}, Lo3/c$a;-><init>(Ln3/d;Lu3/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lo3/c$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lo3/c$b;-><init>(Ln3/d;Ln3/g;Lu3/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Ln3/d;)Ln3/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln3/d<",
            "-TT;>;)",
            "Ln3/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/jvm/internal/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/d;->intercepted()Ln3/d;

    move-result-object p0

    :goto_1
    return-object p0
.end method
