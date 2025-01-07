.class public Li1/a1;
.super Li1/t0;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li1/t0;-><init>()V

    return-void
.end method


# virtual methods
.method protected c(Li1/j$a;)Lk1/z3;
    .locals 2

    invoke-virtual {p0}, Li1/j;->n()Lk1/z0;

    move-result-object v0

    check-cast v0, Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->z()Lk1/c2;

    move-result-object v0

    invoke-interface {v0}, Lk1/h0;->l()Lk1/l0;

    move-result-object v0

    invoke-virtual {p1}, Li1/j$a;->a()Lp1/g;

    move-result-object p1

    invoke-virtual {p0}, Li1/j;->m()Lk1/f0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lk1/l0;->j(Lp1/g;Lk1/f0;)Lk1/l0$a;

    move-result-object p1

    return-object p1
.end method

.method protected d(Li1/j$a;)Lk1/k;
    .locals 3

    new-instance v0, Lk1/k;

    invoke-virtual {p0}, Li1/j;->n()Lk1/z0;

    move-result-object v1

    invoke-virtual {p1}, Li1/j$a;->a()Lp1/g;

    move-result-object p1

    invoke-virtual {p0}, Li1/j;->m()Lk1/f0;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lk1/k;-><init>(Lk1/z0;Lp1/g;Lk1/f0;)V

    return-object v0
.end method

.method protected f(Li1/j$a;)Lk1/z0;
    .locals 7

    new-instance v4, Lk1/o;

    new-instance v0, Lo1/j0;

    invoke-virtual {p1}, Li1/j$a;->c()Li1/m;

    move-result-object v1

    invoke-virtual {v1}, Li1/m;->a()Ll1/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lo1/j0;-><init>(Ll1/f;)V

    invoke-direct {v4, v0}, Lk1/o;-><init>(Lo1/j0;)V

    invoke-virtual {p1}, Li1/j$a;->g()Lcom/google/firebase/firestore/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/v;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lk1/l0$b;->a(J)Lk1/l0$b;

    move-result-object v5

    new-instance v6, Lk1/u2;

    invoke-virtual {p1}, Li1/j$a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Li1/j$a;->c()Li1/m;

    move-result-object v0

    invoke-virtual {v0}, Li1/m;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Li1/j$a;->c()Li1/m;

    move-result-object p1

    invoke-virtual {p1}, Li1/m;->a()Ll1/f;

    move-result-object v3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lk1/u2;-><init>(Landroid/content/Context;Ljava/lang/String;Ll1/f;Lk1/o;Lk1/l0$b;)V

    return-object v6
.end method
