.class public Li1/t0;
.super Li1/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/t0$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li1/j;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Li1/j$a;)Lo1/k;
    .locals 0

    invoke-virtual {p0, p1}, Li1/t0;->r(Li1/j$a;)Lo1/j;

    move-result-object p1

    return-object p1
.end method

.method protected b(Li1/j$a;)Li1/p;
    .locals 1

    new-instance p1, Li1/p;

    invoke-virtual {p0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-direct {p1, v0}, Li1/p;-><init>(Li1/b1;)V

    return-object p1
.end method

.method protected c(Li1/j$a;)Lk1/z3;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected d(Li1/j$a;)Lk1/k;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected e(Li1/j$a;)Lk1/f0;
    .locals 3

    new-instance v0, Lk1/f0;

    invoke-virtual {p0}, Li1/j;->n()Lk1/z0;

    move-result-object v1

    new-instance v2, Lk1/a1;

    invoke-direct {v2}, Lk1/a1;-><init>()V

    invoke-virtual {p1}, Li1/j$a;->e()Lg1/j;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lk1/f0;-><init>(Lk1/z0;Lk1/a1;Lg1/j;)V

    return-object v0
.end method

.method protected f(Li1/j$a;)Lk1/z0;
    .locals 0

    invoke-static {}, Lk1/t0;->n()Lk1/t0;

    move-result-object p1

    return-object p1
.end method

.method protected g(Li1/j$a;)Lo1/n0;
    .locals 7

    new-instance v6, Lo1/n0;

    new-instance v1, Li1/t0$b;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Li1/t0$b;-><init>(Li1/t0;Li1/t0$a;)V

    invoke-virtual {p0}, Li1/j;->m()Lk1/f0;

    move-result-object v2

    invoke-virtual {p1}, Li1/j$a;->d()Lo1/m;

    move-result-object v3

    invoke-virtual {p1}, Li1/j$a;->a()Lp1/g;

    move-result-object v4

    invoke-virtual {p0}, Li1/j;->i()Lo1/k;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo1/n0;-><init>(Lo1/n0$c;Lk1/f0;Lo1/m;Lp1/g;Lo1/k;)V

    return-object v6
.end method

.method protected h(Li1/j$a;)Li1/b1;
    .locals 4

    new-instance v0, Li1/b1;

    invoke-virtual {p0}, Li1/j;->m()Lk1/f0;

    move-result-object v1

    invoke-virtual {p0}, Li1/j;->o()Lo1/n0;

    move-result-object v2

    invoke-virtual {p1}, Li1/j$a;->e()Lg1/j;

    move-result-object v3

    invoke-virtual {p1}, Li1/j$a;->f()I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Li1/b1;-><init>(Lk1/f0;Lo1/n0;Lg1/j;I)V

    return-object v0
.end method

.method protected r(Li1/j$a;)Lo1/j;
    .locals 1

    new-instance v0, Lo1/j;

    invoke-virtual {p1}, Li1/j$a;->b()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lo1/j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
