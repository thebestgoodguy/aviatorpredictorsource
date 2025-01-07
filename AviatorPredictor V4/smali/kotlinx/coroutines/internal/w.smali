.class public Lkotlinx/coroutines/internal/w;
.super Lb4/a;
.source ""

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb4/a<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/e;"
    }
.end annotation


# instance fields
.field public final g:Ln3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/d<",
            "TT;>;"
        }
    .end annotation
.end field


# virtual methods
.method protected final U()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected t0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-static {p1, v0}, Lb4/d0;->a(Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ln3/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method protected x(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-static {v0}, Lo3/b;->b(Ln3/d;)Ln3/d;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-static {p1, v1}, Lb4/d0;->a(Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lkotlinx/coroutines/internal/g;->c(Ln3/d;Ljava/lang/Object;Lu3/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final x0()Lb4/p1;
    .locals 1

    invoke-virtual {p0}, Lb4/w1;->O()Lb4/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lb4/r;->getParent()Lb4/p1;

    move-result-object v0

    :goto_0
    return-object v0
.end method
