.class public final Lk1/o;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lo1/j0;


# direct methods
.method public constructor <init>(Lo1/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/o;->a:Lo1/j0;

    return-void
.end method

.method private b(Lx1/h;Z)Ll1/s;
    .locals 3

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lx1/h;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lx1/h;->b0()Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v1

    invoke-virtual {p1}, Lx1/h;->Y()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll1/t;->g(Ljava/util/Map;)Ll1/t;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll1/s;->p(Ll1/l;Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ll1/s;->t()Ll1/s;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private g(Ln1/b;Z)Ll1/s;
    .locals 2

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/b;->X()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/b;->Y()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    invoke-static {v0, p1}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ll1/s;->t()Ll1/s;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private i(Ln1/d;)Ll1/s;
    .locals 2

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/d;->X()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/d;->Y()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    invoke-static {v0, p1}, Ll1/s;->s(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object p1

    return-object p1
.end method

.method private k(Ll1/i;)Lx1/h;
    .locals 3

    invoke-static {}, Lx1/h;->e0()Lx1/h$b;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/h$b;->D(Ljava/lang/String;)Lx1/h$b;

    invoke-interface {p1}, Ll1/i;->k()Ll1/t;

    move-result-object v1

    invoke-virtual {v1}, Ll1/t;->k()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/h$b;->B(Ljava/util/Map;)Lx1/h$b;

    invoke-interface {p1}, Ll1/i;->j()Ll1/w;

    move-result-object p1

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/h$b;->E(Lcom/google/protobuf/t1;)Lx1/h$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/h;

    return-object p1
.end method

.method private o(Ll1/i;)Ln1/b;
    .locals 3

    invoke-static {}, Ln1/b;->Z()Ln1/b$b;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/b$b;->B(Ljava/lang/String;)Ln1/b$b;

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-interface {p1}, Ll1/i;->j()Ll1/w;

    move-result-object p1

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln1/b$b;->D(Lcom/google/protobuf/t1;)Ln1/b$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Ln1/b;

    return-object p1
.end method

.method private q(Ll1/i;)Ln1/d;
    .locals 3

    invoke-static {}, Ln1/d;->Z()Ln1/d$b;

    move-result-object v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/d$b;->B(Ljava/lang/String;)Ln1/d$b;

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-interface {p1}, Ll1/i;->j()Ll1/w;

    move-result-object p1

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln1/d$b;->D(Lcom/google/protobuf/t1;)Ln1/d$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Ln1/d;

    return-object p1
.end method


# virtual methods
.method public a(Lw1/a;)Lh1/i;
    .locals 3

    invoke-virtual {p1}, Lw1/a;->X()Lw1/a$c;

    move-result-object v0

    sget-object v1, Lw1/a$c;->f:Lw1/a$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Li1/x0$a;->e:Li1/x0$a;

    goto :goto_0

    :cond_0
    sget-object v0, Li1/x0$a;->f:Li1/x0$a;

    :goto_0
    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lw1/a;->Y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lw1/a;->Z()Lx1/t;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lo1/j0;->t(Ljava/lang/String;Lx1/t;)Li1/c1;

    move-result-object p1

    new-instance v1, Lh1/i;

    invoke-direct {v1, p1, v0}, Lh1/i;-><init>(Li1/c1;Li1/x0$a;)V

    return-object v1
.end method

.method public c(Lv1/a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/a;",
            ")",
            "Ljava/util/List<",
            "Ll1/q$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lv1/a;->U()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv1/a$c;

    invoke-virtual {v1}, Lv1/a$c;->U()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v2

    invoke-virtual {v1}, Lv1/a$c;->W()Lv1/a$c$c;

    move-result-object v3

    sget-object v4, Lv1/a$c$c;->g:Lv1/a$c$c;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v1, Ll1/q$c$a;->g:Ll1/q$c$a;

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lv1/a$c;->V()Lv1/a$c$b;

    move-result-object v1

    sget-object v3, Lv1/a$c$b;->g:Lv1/a$c$b;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ll1/q$c$a;->e:Ll1/q$c$a;

    goto :goto_1

    :cond_1
    sget-object v1, Ll1/q$c$a;->f:Ll1/q$c$a;

    :goto_1
    invoke-static {v2, v1}, Ll1/q$c;->g(Ll1/r;Ll1/q$c$a;)Ll1/q$c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method d(Ln1/a;)Ll1/s;
    .locals 3

    sget-object v0, Lk1/o$a;->a:[I

    invoke-virtual {p1}, Ln1/a;->Z()Ln1/a$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Ln1/a;->c0()Ln1/d;

    move-result-object p1

    invoke-direct {p0, p1}, Lk1/o;->i(Ln1/d;)Ll1/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unknown MaybeDocument %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Ln1/a;->b0()Ln1/b;

    move-result-object v0

    invoke-virtual {p1}, Ln1/a;->a0()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lk1/o;->g(Ln1/b;Z)Ll1/s;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ln1/a;->Y()Lx1/h;

    move-result-object v0

    invoke-virtual {p1}, Ln1/a;->a0()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lk1/o;->b(Lx1/h;Z)Ll1/s;

    move-result-object p1

    return-object p1
.end method

.method public e(Lx1/y;)Lm1/f;
    .locals 1

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v0, p1}, Lo1/j0;->o(Lx1/y;)Lm1/f;

    move-result-object p1

    return-object p1
.end method

.method f(Ln1/e;)Lm1/g;
    .locals 11

    invoke-virtual {p1}, Ln1/e;->e0()I

    move-result v0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/e;->f0()Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->w(Lcom/google/protobuf/t1;)Lx0/o;

    move-result-object v1

    invoke-virtual {p1}, Ln1/e;->d0()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    iget-object v6, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1, v5}, Ln1/e;->c0(I)Lx1/y;

    move-result-object v7

    invoke-virtual {v6, v7}, Lo1/j0;->o(Lx1/y;)Lm1/f;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ln1/e;->h0()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p1}, Ln1/e;->h0()I

    move-result v6

    if-ge v5, v6, :cond_4

    invoke-virtual {p1, v5}, Ln1/e;->g0(I)Lx1/y;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {p1}, Ln1/e;->h0()I

    move-result v8

    const/4 v9, 0x1

    if-ge v7, v8, :cond_1

    invoke-virtual {p1, v7}, Ln1/e;->g0(I)Lx1/y;

    move-result-object v8

    invoke-virtual {v8}, Lx1/y;->l0()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_3

    invoke-virtual {p1, v5}, Ln1/e;->g0(I)Lx1/y;

    move-result-object v5

    invoke-virtual {v5}, Lx1/y;->m0()Z

    move-result v5

    new-array v8, v4, [Ljava/lang/Object;

    const-string v10, "TransformMutation should be preceded by a patch or set mutation"

    invoke-static {v5, v10, v8}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v6}, Lx1/y;->p0(Lx1/y;)Lx1/y$b;

    move-result-object v5

    invoke-virtual {p1, v7}, Ln1/e;->g0(I)Lx1/y;

    move-result-object v6

    invoke-virtual {v6}, Lx1/y;->f0()Lx1/m;

    move-result-object v6

    invoke-virtual {v6}, Lx1/m;->V()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lx1/m$c;

    invoke-virtual {v5, v8}, Lx1/y$b;->B(Lx1/m$c;)Lx1/y$b;

    goto :goto_3

    :cond_2
    iget-object v6, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v5}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v5

    check-cast v5, Lx1/y;

    invoke-virtual {v6, v5}, Lo1/j0;->o(Lx1/y;)Lm1/f;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_4

    :cond_3
    iget-object v7, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v7, v6}, Lo1/j0;->o(Lx1/y;)Lm1/f;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/2addr v5, v9

    goto :goto_1

    :cond_4
    new-instance p1, Lm1/g;

    invoke-direct {p1, v0, v1, v3, v2}, Lm1/g;-><init>(ILx0/o;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method h(Ln1/c;)Lk1/b4;
    .locals 9

    invoke-virtual {p1}, Ln1/c;->j0()I

    move-result v2

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/c;->i0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v6

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/c;->e0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v7

    invoke-virtual {p1}, Ln1/c;->h0()Lcom/google/protobuf/j;

    move-result-object v8

    invoke-virtual {p1}, Ln1/c;->f0()J

    move-result-wide v3

    sget-object v0, Lk1/o$a;->b:[I

    invoke-virtual {p1}, Ln1/c;->k0()Ln1/c$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v5, 0x2

    if-ne v0, v5, :cond_0

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/c;->g0()Lx1/u$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo1/j0;->u(Lx1/u$d;)Li1/c1;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ln1/c;->k0()Ln1/c$c;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unknown targetType %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Ln1/c;->d0()Lx1/u$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo1/j0;->e(Lx1/u$c;)Li1/c1;

    move-result-object p1

    :goto_0
    move-object v1, p1

    new-instance p1, Lk1/b4;

    sget-object v5, Lk1/b1;->e:Lk1/b1;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lk1/b4;-><init>(Li1/c1;IJLk1/b1;Ll1/w;Ll1/w;Lcom/google/protobuf/j;)V

    return-object p1
.end method

.method public j(Lh1/i;)Lw1/a;
    .locals 3

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lh1/i;->b()Li1/c1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->S(Li1/c1;)Lx1/u$d;

    move-result-object v0

    invoke-static {}, Lw1/a;->a0()Lw1/a$b;

    move-result-object v1

    invoke-virtual {p1}, Lh1/i;->a()Li1/x0$a;

    move-result-object p1

    sget-object v2, Li1/x0$a;->e:Li1/x0$a;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lw1/a$c;->f:Lw1/a$c;

    goto :goto_0

    :cond_0
    sget-object p1, Lw1/a$c;->g:Lw1/a$c;

    :goto_0
    invoke-virtual {v1, p1}, Lw1/a$b;->B(Lw1/a$c;)Lw1/a$b;

    invoke-virtual {v0}, Lx1/u$d;->X()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw1/a$b;->D(Ljava/lang/String;)Lw1/a$b;

    invoke-virtual {v0}, Lx1/u$d;->Y()Lx1/t;

    move-result-object p1

    invoke-virtual {v1, p1}, Lw1/a$b;->E(Lx1/t;)Lw1/a$b;

    invoke-virtual {v1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lw1/a;

    return-object p1
.end method

.method l(Ll1/i;)Ln1/a;
    .locals 2

    invoke-static {}, Ln1/a;->d0()Ln1/a$b;

    move-result-object v0

    invoke-interface {p1}, Ll1/i;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lk1/o;->o(Ll1/i;)Ln1/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/a$b;->E(Ln1/b;)Ln1/a$b;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ll1/i;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lk1/o;->k(Ll1/i;)Lx1/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/a$b;->B(Lx1/h;)Ln1/a$b;

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ll1/i;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Lk1/o;->q(Ll1/i;)Ln1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/a$b;->F(Ln1/d;)Ln1/a$b;

    :goto_0
    invoke-interface {p1}, Ll1/i;->g()Z

    move-result p1

    invoke-virtual {v0, p1}, Ln1/a$b;->D(Z)Ln1/a$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Ln1/a;

    return-object p1

    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Cannot encode invalid document %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public m(Lm1/f;)Lx1/y;
    .locals 1

    iget-object v0, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v0, p1}, Lo1/j0;->O(Lm1/f;)Lx1/y;

    move-result-object p1

    return-object p1
.end method

.method n(Lm1/g;)Ln1/e;
    .locals 4

    invoke-static {}, Ln1/e;->i0()Ln1/e$b;

    move-result-object v0

    invoke-virtual {p1}, Lm1/g;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ln1/e$b;->E(I)Ln1/e$b;

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lm1/g;->g()Lx0/o;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/e$b;->F(Lcom/google/protobuf/t1;)Ln1/e$b;

    invoke-virtual {p1}, Lm1/g;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/f;

    iget-object v3, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v3, v2}, Lo1/j0;->O(Lm1/f;)Lx1/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln1/e$b;->B(Lx1/y;)Ln1/e$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm1/g;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/f;

    iget-object v2, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v2, v1}, Lo1/j0;->O(Lm1/f;)Lx1/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/e$b;->D(Lx1/y;)Ln1/e$b;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Ln1/e;

    return-object p1
.end method

.method p(Lk1/b4;)Ln1/c;
    .locals 4

    sget-object v0, Lk1/b1;->e:Lk1/b1;

    invoke-virtual {p1}, Lk1/b4;->b()Lk1/b1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p1}, Lk1/b4;->b()Lk1/b1;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v0, "Only queries with purpose %s may be stored, got %s"

    invoke-static {v1, v0, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ln1/c;->l0()Ln1/c$b;

    move-result-object v0

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ln1/c$b;->J(I)Ln1/c$b;

    move-result-object v1

    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ln1/c$b;->F(J)Ln1/c$b;

    move-result-object v1

    iget-object v2, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lk1/b4;->a()Ll1/w;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo1/j0;->X(Ll1/w;)Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln1/c$b;->E(Lcom/google/protobuf/t1;)Ln1/c$b;

    move-result-object v1

    iget-object v2, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {p1}, Lk1/b4;->e()Ll1/w;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo1/j0;->X(Ll1/w;)Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln1/c$b;->I(Lcom/google/protobuf/t1;)Ln1/c$b;

    move-result-object v1

    invoke-virtual {p1}, Lk1/b4;->c()Lcom/google/protobuf/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln1/c$b;->H(Lcom/google/protobuf/j;)Ln1/c$b;

    invoke-virtual {p1}, Lk1/b4;->f()Li1/c1;

    move-result-object p1

    invoke-virtual {p1}, Li1/c1;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->F(Li1/c1;)Lx1/u$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln1/c$b;->D(Lx1/u$c;)Ln1/c$b;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lk1/o;->a:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->S(Li1/c1;)Lx1/u$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln1/c$b;->G(Lx1/u$d;)Ln1/c$b;

    :goto_0
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Ln1/c;

    return-object p1
.end method
