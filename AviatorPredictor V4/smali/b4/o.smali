.class public final Lb4/o;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ln3/d;)Lb4/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln3/d<",
            "-TT;>;)",
            "Lb4/m<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/f;

    if-nez v0, :cond_0

    new-instance v0, Lb4/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lb4/m;-><init>(Ln3/d;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/f;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/f;->k()Lb4/m;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lb4/m;->G()Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lb4/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lb4/m;-><init>(Ln3/d;I)V

    :cond_3
    return-object v0
.end method
