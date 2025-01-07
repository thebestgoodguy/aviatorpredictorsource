.class public final Lb4/i2;
.super Lkotlinx/coroutines/internal/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private h:Ln3/g;

.field private i:Ljava/lang/Object;


# virtual methods
.method protected t0(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lb4/i2;->h:Ln3/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lb4/i2;->i:Ljava/lang/Object;

    invoke-static {v0, v2}, Lkotlinx/coroutines/internal/c0;->a(Ln3/g;Ljava/lang/Object;)V

    iput-object v1, p0, Lb4/i2;->h:Ln3/g;

    iput-object v1, p0, Lb4/i2;->i:Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-static {p1, v0}, Lb4/d0;->a(Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-interface {v0}, Ln3/d;->getContext()Ln3/g;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlinx/coroutines/internal/c0;->c(Ln3/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/internal/c0;->a:Lkotlinx/coroutines/internal/y;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v2, v3}, Lb4/f0;->e(Ln3/d;Ln3/g;Ljava/lang/Object;)Lb4/i2;

    move-result-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/w;->g:Ln3/d;

    invoke-interface {v0, p1}, Ln3/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lk3/s;->a:Lk3/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lb4/i2;->y0()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/c0;->a(Ln3/g;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lb4/i2;->y0()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/c0;->a(Ln3/g;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final y0()Z
    .locals 1

    iget-object v0, p0, Lb4/i2;->h:Ln3/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lb4/i2;->h:Ln3/g;

    iput-object v0, p0, Lb4/i2;->i:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public final z0(Ln3/g;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb4/i2;->h:Ln3/g;

    iput-object p2, p0, Lb4/i2;->i:Ljava/lang/Object;

    return-void
.end method
