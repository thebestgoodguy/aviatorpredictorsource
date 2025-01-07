.class final synthetic Lb4/u1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lb4/p1;)Lb4/x;
    .locals 1

    new-instance v0, Lb4/s1;

    invoke-direct {v0, p0}, Lb4/s1;-><init>(Lb4/p1;)V

    return-object v0
.end method

.method public static synthetic b(Lb4/p1;ILjava/lang/Object;)Lb4/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lb4/t1;->a(Lb4/p1;)Lb4/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ln3/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lb4/p1;->a:Lb4/p1$b;

    invoke-interface {p0, v0}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object p0

    check-cast p0, Lb4/p1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lb4/p1;->r(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-void
.end method

.method public static final d(Lb4/p1;)V
    .locals 1

    invoke-interface {p0}, Lb4/p1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lb4/p1;->l()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final e(Ln3/g;)V
    .locals 1

    sget-object v0, Lb4/p1;->a:Lb4/p1$b;

    invoke-interface {p0, v0}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object p0

    check-cast p0, Lb4/p1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lb4/t1;->d(Lb4/p1;)V

    :goto_0
    return-void
.end method
