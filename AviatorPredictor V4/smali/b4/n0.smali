.class public final Lb4/n0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ln3/g;)Lb4/m0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/e;

    sget-object v1, Lb4/p1;->a:Lb4/p1$b;

    invoke-interface {p0, v1}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lb4/t1;->b(Lb4/p1;ILjava/lang/Object;)Lb4/x;

    move-result-object v1

    invoke-interface {p0, v1}, Ln3/g;->plus(Ln3/g;)Ln3/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/e;-><init>(Ln3/g;)V

    return-object v0
.end method
