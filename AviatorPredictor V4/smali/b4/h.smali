.class final synthetic Lb4/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lb4/m0;Ln3/g;Lb4/o0;Lu3/p;)Lb4/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/m0;",
            "Ln3/g;",
            "Lb4/o0;",
            "Lu3/p<",
            "-",
            "Lb4/m0;",
            "-",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lb4/p1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb4/f0;->c(Lb4/m0;Ln3/g;)Ln3/g;

    move-result-object p0

    invoke-virtual {p2}, Lb4/o0;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lb4/y1;

    invoke-direct {p1, p0, p3}, Lb4/y1;-><init>(Ln3/g;Lu3/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lb4/e2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lb4/e2;-><init>(Ln3/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lb4/a;->w0(Lb4/o0;Ljava/lang/Object;Lu3/p;)V

    return-object p1
.end method

.method public static synthetic b(Lb4/m0;Ln3/g;Lb4/o0;Lu3/p;ILjava/lang/Object;)Lb4/p1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Ln3/h;->e:Ln3/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lb4/o0;->e:Lb4/o0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lb4/g;->a(Lb4/m0;Ln3/g;Lb4/o0;Lu3/p;)Lb4/p1;

    move-result-object p0

    return-object p0
.end method
