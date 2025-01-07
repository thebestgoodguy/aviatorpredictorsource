.class public final Lo1/j0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/f;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/j0;->a:Ll1/f;

    invoke-static {p1}, Lo1/j0;->Y(Ll1/f;)Ll1/u;

    move-result-object p1

    invoke-virtual {p1}, Ll1/u;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lo1/j0;->b:Ljava/lang/String;

    return-void
.end method

.method private E(Lm1/d;)Lx1/k;
    .locals 2

    invoke-static {}, Lx1/k;->a0()Lx1/k$b;

    move-result-object v0

    invoke-virtual {p1}, Lm1/d;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/r;

    invoke-virtual {v1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/k$b;->B(Ljava/lang/String;)Lx1/k$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/k;

    return-object p1
.end method

.method private G(Li1/q$b;)Lx1/t$f$b;
    .locals 2

    sget-object v0, Lo1/j0$a;->i:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unknown operator %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    sget-object p1, Lx1/t$f$b;->p:Lx1/t$f$b;

    return-object p1

    :pswitch_1
    sget-object p1, Lx1/t$f$b;->o:Lx1/t$f$b;

    return-object p1

    :pswitch_2
    sget-object p1, Lx1/t$f$b;->n:Lx1/t$f$b;

    return-object p1

    :pswitch_3
    sget-object p1, Lx1/t$f$b;->m:Lx1/t$f$b;

    return-object p1

    :pswitch_4
    sget-object p1, Lx1/t$f$b;->j:Lx1/t$f$b;

    return-object p1

    :pswitch_5
    sget-object p1, Lx1/t$f$b;->i:Lx1/t$f$b;

    return-object p1

    :pswitch_6
    sget-object p1, Lx1/t$f$b;->l:Lx1/t$f$b;

    return-object p1

    :pswitch_7
    sget-object p1, Lx1/t$f$b;->k:Lx1/t$f$b;

    return-object p1

    :pswitch_8
    sget-object p1, Lx1/t$f$b;->h:Lx1/t$f$b;

    return-object p1

    :pswitch_9
    sget-object p1, Lx1/t$f$b;->g:Lx1/t$f$b;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private H(Ll1/r;)Lx1/t$g;
    .locals 1

    invoke-static {}, Lx1/t$g;->X()Lx1/t$g$a;

    move-result-object v0

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/t$g$a;->B(Ljava/lang/String;)Lx1/t$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/t$g;

    return-object p1
.end method

.method private I(Lm1/e;)Lx1/m$c;
    .locals 2

    invoke-virtual {p1}, Lm1/e;->b()Lm1/p;

    move-result-object v0

    instance-of v1, v0, Lm1/n;

    if-eqz v1, :cond_0

    invoke-static {}, Lx1/m$c;->f0()Lx1/m$c$a;

    move-result-object v0

    invoke-virtual {p1}, Lm1/e;->a()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/m$c$a;->D(Ljava/lang/String;)Lx1/m$c$a;

    move-result-object p1

    sget-object v0, Lx1/m$c$b;->g:Lx1/m$c$b;

    invoke-virtual {p1, v0}, Lx1/m$c$a;->G(Lx1/m$c$b;)Lx1/m$c$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/m$c;

    return-object p1

    :cond_0
    instance-of v1, v0, Lm1/a$b;

    if-eqz v1, :cond_1

    check-cast v0, Lm1/a$b;

    invoke-static {}, Lx1/m$c;->f0()Lx1/m$c$a;

    move-result-object v1

    invoke-virtual {p1}, Lm1/e;->a()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx1/m$c$a;->D(Ljava/lang/String;)Lx1/m$c$a;

    move-result-object p1

    invoke-static {}, Lx1/a;->d0()Lx1/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lm1/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx1/a$b;->B(Ljava/lang/Iterable;)Lx1/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m$c$a;->B(Lx1/a$b;)Lx1/m$c$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lm1/a$a;

    if-eqz v1, :cond_2

    check-cast v0, Lm1/a$a;

    invoke-static {}, Lx1/m$c;->f0()Lx1/m$c$a;

    move-result-object v1

    invoke-virtual {p1}, Lm1/e;->a()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx1/m$c$a;->D(Ljava/lang/String;)Lx1/m$c$a;

    move-result-object p1

    invoke-static {}, Lx1/a;->d0()Lx1/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lm1/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx1/a$b;->B(Ljava/lang/Iterable;)Lx1/a$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m$c$a;->F(Lx1/a$b;)Lx1/m$c$a;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lm1/j;

    if-eqz v1, :cond_3

    check-cast v0, Lm1/j;

    invoke-static {}, Lx1/m$c;->f0()Lx1/m$c$a;

    move-result-object v1

    invoke-virtual {p1}, Lm1/e;->a()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx1/m$c$a;->D(Ljava/lang/String;)Lx1/m$c$a;

    move-result-object p1

    invoke-virtual {v0}, Lm1/j;->d()Lx1/x;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m$c$a;->E(Lx1/x;)Lx1/m$c$a;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const-string v0, "Unknown transform: %s"

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private K(Ljava/util/List;)Lx1/t$h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li1/r;",
            ">;)",
            "Lx1/t$h;"
        }
    .end annotation

    new-instance v0, Li1/l;

    sget-object v1, Li1/l$a;->f:Li1/l$a;

    invoke-direct {v0, p1, v1}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    invoke-virtual {p0, v0}, Lo1/j0;->J(Li1/r;)Lx1/t$h;

    move-result-object p1

    return-object p1
.end method

.method private M(Lk1/b1;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lo1/j0$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    const-string p1, "limbo-document"

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unrecognized query purpose: %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "existence-filter-mismatch"

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private P(Li1/w0;)Lx1/t$i;
    .locals 3

    invoke-static {}, Lx1/t$i;->Y()Lx1/t$i$a;

    move-result-object v0

    invoke-virtual {p1}, Li1/w0;->b()Li1/w0$a;

    move-result-object v1

    sget-object v2, Li1/w0$a;->f:Li1/w0$a;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lx1/t$e;->g:Lx1/t$e;

    goto :goto_0

    :cond_0
    sget-object v1, Lx1/t$e;->h:Lx1/t$e;

    :goto_0
    invoke-virtual {v0, v1}, Lx1/t$i$a;->B(Lx1/t$e;)Lx1/t$i$a;

    invoke-virtual {p1}, Li1/w0;->c()Ll1/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->H(Ll1/r;)Lx1/t$g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/t$i$a;->D(Lx1/t$g;)Lx1/t$i$a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/t$i;

    return-object p1
.end method

.method private Q(Lm1/m;)Lx1/s;
    .locals 4

    invoke-virtual {p1}, Lm1/m;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Can\'t serialize an empty precondition"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lx1/s;->a0()Lx1/s$b;

    move-result-object v0

    invoke-virtual {p1}, Lm1/m;->c()Ll1/w;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lm1/m;->c()Ll1/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->X(Ll1/w;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/s$b;->D(Lcom/google/protobuf/t1;)Lx1/s$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/s;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lm1/m;->b()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lm1/m;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lx1/s$b;->B(Z)Lx1/s$b;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "Unknown Precondition"

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private R(Ll1/u;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo1/j0;->a:Ll1/f;

    invoke-direct {p0, v0, p1}, Lo1/j0;->T(Ll1/f;Ll1/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private T(Ll1/f;Ll1/u;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lo1/j0;->Y(Ll1/f;)Ll1/u;

    move-result-object p1

    const-string v0, "documents"

    invoke-virtual {p1, v0}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object p1

    check-cast p1, Ll1/u;

    invoke-virtual {p1, p2}, Ll1/e;->g(Ll1/e;)Ll1/e;

    move-result-object p1

    check-cast p1, Ll1/u;

    invoke-virtual {p1}, Ll1/u;->h()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static Y(Ll1/f;)Ll1/u;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "projects"

    aput-object v2, v0, v1

    invoke-virtual {p0}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    const-string v2, "databases"

    aput-object v2, v0, v1

    invoke-virtual {p0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll1/u;->w(Ljava/util/List;)Ll1/u;

    move-result-object p0

    return-object p0
.end method

.method private static Z(Ll1/u;)Ll1/u;
    .locals 4

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le v0, v3, :cond_0

    invoke-virtual {p0, v3}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "documents"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const-string v2, "Tried to deserialize invalid key %s"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ll1/e;->t(I)Ll1/e;

    move-result-object p0

    check-cast p0, Ll1/u;

    return-object p0
.end method

.method private a0(La2/a;)Lb3/f1;
    .locals 1

    invoke-virtual {p1}, La2/a;->U()I

    move-result v0

    invoke-static {v0}, Lb3/f1;->h(I)Lb3/f1;

    move-result-object v0

    invoke-virtual {p1}, La2/a;->W()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    return-object p1
.end method

.method private static c0(Ll1/u;)Z
    .locals 3

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v1}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "projects"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "databases"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private d(Lx1/k;)Lm1/d;
    .locals 4

    invoke-virtual {p1}, Lx1/k;->Z()I

    move-result v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Lx1/k;->Y(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm1/d;->b(Ljava/util/Set;)Lm1/d;

    move-result-object p1

    return-object p1
.end method

.method private g(Lx1/t$f$b;)Li1/q$b;
    .locals 2

    sget-object v0, Lo1/j0$a;->j:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unhandled FieldFilter.operator %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    sget-object p1, Li1/q$b;->o:Li1/q$b;

    return-object p1

    :pswitch_1
    sget-object p1, Li1/q$b;->m:Li1/q$b;

    return-object p1

    :pswitch_2
    sget-object p1, Li1/q$b;->n:Li1/q$b;

    return-object p1

    :pswitch_3
    sget-object p1, Li1/q$b;->l:Li1/q$b;

    return-object p1

    :pswitch_4
    sget-object p1, Li1/q$b;->j:Li1/q$b;

    return-object p1

    :pswitch_5
    sget-object p1, Li1/q$b;->k:Li1/q$b;

    return-object p1

    :pswitch_6
    sget-object p1, Li1/q$b;->i:Li1/q$b;

    return-object p1

    :pswitch_7
    sget-object p1, Li1/q$b;->h:Li1/q$b;

    return-object p1

    :pswitch_8
    sget-object p1, Li1/q$b;->g:Li1/q$b;

    return-object p1

    :pswitch_9
    sget-object p1, Li1/q$b;->f:Li1/q$b;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private h(Lx1/m$c;)Lm1/e;
    .locals 4

    sget-object v0, Lo1/j0$a;->c:[I

    invoke-virtual {p1}, Lx1/m$c;->e0()Lx1/m$c$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    new-instance v0, Lm1/e;

    invoke-virtual {p1}, Lx1/m$c;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v1

    new-instance v2, Lm1/j;

    invoke-virtual {p1}, Lx1/m$c;->b0()Lx1/x;

    move-result-object p1

    invoke-direct {v2, p1}, Lm1/j;-><init>(Lx1/x;)V

    invoke-direct {v0, v1, v2}, Lm1/e;-><init>(Ll1/r;Lm1/p;)V

    return-object v0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Unknown FieldTransform proto: %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    new-instance v0, Lm1/e;

    invoke-virtual {p1}, Lx1/m$c;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v1

    new-instance v2, Lm1/a$a;

    invoke-virtual {p1}, Lx1/m$c;->c0()Lx1/a;

    move-result-object p1

    invoke-virtual {p1}, Lx1/a;->k()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Lm1/a$a;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Lm1/e;-><init>(Ll1/r;Lm1/p;)V

    return-object v0

    :cond_2
    new-instance v0, Lm1/e;

    invoke-virtual {p1}, Lx1/m$c;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v1

    new-instance v2, Lm1/a$b;

    invoke-virtual {p1}, Lx1/m$c;->Z()Lx1/a;

    move-result-object p1

    invoke-virtual {p1}, Lx1/a;->k()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Lm1/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Lm1/e;-><init>(Ll1/r;Lm1/p;)V

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lx1/m$c;->d0()Lx1/m$c$b;

    move-result-object v0

    sget-object v3, Lx1/m$c$b;->g:Lx1/m$c$b;

    if-ne v0, v3, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lx1/m$c;->d0()Lx1/m$c$b;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Unknown transform setToServerValue: %s"

    invoke-static {v0, v1, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lm1/e;

    invoke-virtual {p1}, Lx1/m$c;->a0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object p1

    invoke-static {}, Lm1/n;->d()Lm1/n;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm1/e;-><init>(Ll1/r;Lm1/p;)V

    return-object v0
.end method

.method private j(Lx1/t$h;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/t$h;",
            ")",
            "Ljava/util/List<",
            "Li1/r;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lo1/j0;->i(Lx1/t$h;)Li1/r;

    move-result-object p1

    instance-of v0, p1, Li1/l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li1/l;

    invoke-virtual {v0}, Li1/l;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Li1/l;->b()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private k(Lx1/d;)Ll1/s;
    .locals 5

    invoke-virtual {p1}, Lx1/d;->Y()Lx1/d$c;

    move-result-object v0

    sget-object v1, Lx1/d$c;->f:Lx1/d$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize a found document from a missing document."

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx1/d;->V()Lx1/h;

    move-result-object v0

    invoke-virtual {v0}, Lx1/h;->a0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v0

    invoke-virtual {p1}, Lx1/d;->V()Lx1/h;

    move-result-object v2

    invoke-virtual {v2}, Lx1/h;->Y()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Ll1/t;->g(Ljava/util/Map;)Ll1/t;

    move-result-object v2

    invoke-virtual {p1}, Lx1/d;->V()Lx1/h;

    move-result-object p1

    invoke-virtual {p1}, Lx1/h;->b0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    sget-object v3, Ll1/w;->f:Ll1/w;

    invoke-virtual {p1, v3}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "Got a document response with no snapshot version"

    invoke-static {v3, v4, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0, p1, v2}, Ll1/s;->p(Ll1/l;Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p1

    return-object p1
.end method

.method private n(Lx1/d;)Ll1/s;
    .locals 4

    invoke-virtual {p1}, Lx1/d;->Y()Lx1/d$c;

    move-result-object v0

    sget-object v1, Lx1/d$c;->g:Lx1/d$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize a missing document from a found document."

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx1/d;->W()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v0

    invoke-virtual {p1}, Lx1/d;->X()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    sget-object v2, Ll1/w;->f:Ll1/w;

    invoke-virtual {p1, v2}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Got a no document response with no snapshot version"

    invoke-static {v2, v3, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0, p1}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object p1

    return-object p1
.end method

.method private q(Lx1/t$i;)Li1/w0;
    .locals 4

    invoke-virtual {p1}, Lx1/t$i;->X()Lx1/t$g;

    move-result-object v0

    invoke-virtual {v0}, Lx1/t$g;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v0

    sget-object v1, Lo1/j0$a;->k:[I

    invoke-virtual {p1}, Lx1/t$i;->W()Lx1/t$e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    sget-object p1, Li1/w0$a;->g:Li1/w0$a;

    goto :goto_0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lx1/t$i;->W()Lx1/t$e;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized direction %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Li1/w0$a;->f:Li1/w0$a;

    :goto_0
    invoke-static {p1, v0}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object p1

    return-object p1
.end method

.method private r(Lx1/s;)Lm1/m;
    .locals 2

    sget-object v0, Lo1/j0$a;->b:[I

    invoke-virtual {p1}, Lx1/s;->W()Lx1/s$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    sget-object p1, Lm1/m;->c:Lm1/m;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unknown precondition"

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lx1/s;->Y()Z

    move-result p1

    invoke-static {p1}, Lm1/m;->a(Z)Lm1/m;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lx1/s;->Z()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    invoke-static {p1}, Lm1/m;->f(Ll1/w;)Lm1/m;

    move-result-object p1

    return-object p1
.end method

.method private s(Ljava/lang/String;)Ll1/u;
    .locals 2

    invoke-direct {p0, p1}, Lo1/j0;->v(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p1, Ll1/u;->f:Ll1/u;

    return-object p1

    :cond_0
    invoke-static {p1}, Lo1/j0;->Z(Ll1/u;)Ll1/u;

    move-result-object p1

    return-object p1
.end method

.method private v(Ljava/lang/String;)Ll1/u;
    .locals 3

    invoke-static {p1}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-static {p1}, Lo1/j0;->c0(Ll1/u;)Z

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "Tried to deserialize invalid key %s"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method private x(Lx1/t$k;)Li1/r;
    .locals 4

    invoke-virtual {p1}, Lx1/t$k;->X()Lx1/t$g;

    move-result-object v0

    invoke-virtual {v0}, Lx1/t$g;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v0

    sget-object v1, Lo1/j0$a;->h:[I

    invoke-virtual {p1}, Lx1/t$k;->Y()Lx1/t$k$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    sget-object p1, Li1/q$b;->i:Li1/q$b;

    :goto_0
    sget-object v1, Ll1/y;->b:Lx1/x;

    :goto_1
    invoke-static {v0, p1, v1}, Li1/q;->f(Ll1/r;Li1/q$b;Lx1/x;)Li1/q;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lx1/t$k;->Y()Lx1/t$k$b;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized UnaryFilter.operator %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Li1/q$b;->i:Li1/q$b;

    :goto_2
    sget-object v1, Ll1/y;->a:Lx1/x;

    goto :goto_1

    :cond_2
    sget-object p1, Li1/q$b;->h:Li1/q$b;

    goto :goto_0

    :cond_3
    sget-object p1, Li1/q$b;->h:Li1/q$b;

    goto :goto_2
.end method


# virtual methods
.method public A(Lx1/q;)Lo1/s0;
    .locals 8

    sget-object v0, Lo1/j0$a;->m:[I

    invoke-virtual {p1}, Lx1/q;->Z()Lx1/q$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v0, v6, :cond_4

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lx1/q;->Y()Lx1/n;

    move-result-object p1

    new-instance v0, Lo1/n;

    invoke-virtual {p1}, Lx1/n;->U()I

    move-result v1

    invoke-direct {v0, v1}, Lo1/n;-><init>(I)V

    invoke-virtual {p1}, Lx1/n;->W()I

    move-result p1

    new-instance v1, Lo1/s0$c;

    invoke-direct {v1, p1, v0}, Lo1/s0$c;-><init>(ILo1/n;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown change type set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lx1/q;->X()Lx1/l;

    move-result-object p1

    invoke-virtual {p1}, Lx1/l;->W()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lx1/l;->V()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    new-instance v2, Lo1/s0$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3, v0, p1, v1}, Lo1/s0$b;-><init>(Ljava/util/List;Ljava/util/List;Ll1/l;Ll1/s;)V

    :goto_0
    move-object v1, v2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p1}, Lx1/q;->W()Lx1/j;

    move-result-object p1

    invoke-virtual {p1}, Lx1/j;->X()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lx1/j;->V()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v1

    invoke-virtual {p1}, Lx1/j;->W()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    invoke-static {v1, p1}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object p1

    new-instance v1, Lo1/s0$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3, p1}, Lo1/s0$b;-><init>(Ljava/util/List;Ljava/util/List;Ll1/l;Ll1/s;)V

    goto/16 :goto_2

    :cond_3
    invoke-virtual {p1}, Lx1/q;->V()Lx1/i;

    move-result-object p1

    invoke-virtual {p1}, Lx1/i;->X()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lx1/i;->W()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lx1/i;->V()Lx1/h;

    move-result-object v2

    invoke-virtual {v2}, Lx1/h;->a0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v2

    invoke-virtual {p1}, Lx1/i;->V()Lx1/h;

    move-result-object v3

    invoke-virtual {v3}, Lx1/h;->b0()Lcom/google/protobuf/t1;

    move-result-object v3

    invoke-virtual {p0, v3}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v3

    sget-object v4, Ll1/w;->f:Ll1/w;

    invoke-virtual {v3, v4}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v6

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Got a document change without an update time"

    invoke-static {v4, v6, v5}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx1/i;->V()Lx1/h;

    move-result-object p1

    invoke-virtual {p1}, Lx1/h;->Y()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll1/t;->g(Ljava/util/Map;)Ll1/t;

    move-result-object p1

    invoke-static {v2, v3, p1}, Ll1/s;->p(Ll1/l;Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p1

    new-instance v2, Lo1/s0$b;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3, p1}, Lo1/s0$b;-><init>(Ljava/util/List;Ljava/util/List;Ll1/l;Ll1/s;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lx1/q;->a0()Lx1/v;

    move-result-object p1

    sget-object v0, Lo1/j0$a;->l:[I

    invoke-virtual {p1}, Lx1/v;->Y()Lx1/v$c;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v0, v0, v7

    if-eq v0, v6, :cond_9

    if-eq v0, v5, :cond_8

    if-eq v0, v4, :cond_7

    if-eq v0, v3, :cond_6

    if-ne v0, v2, :cond_5

    sget-object v0, Lo1/s0$e;->i:Lo1/s0$e;

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown target change type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    sget-object v0, Lo1/s0$e;->h:Lo1/s0$e;

    goto :goto_1

    :cond_7
    sget-object v0, Lo1/s0$e;->g:Lo1/s0$e;

    invoke-virtual {p1}, Lx1/v;->U()La2/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lo1/j0;->a0(La2/a;)Lb3/f1;

    move-result-object v1

    goto :goto_1

    :cond_8
    sget-object v0, Lo1/s0$e;->f:Lo1/s0$e;

    goto :goto_1

    :cond_9
    sget-object v0, Lo1/s0$e;->e:Lo1/s0$e;

    :goto_1
    new-instance v2, Lo1/s0$d;

    invoke-virtual {p1}, Lx1/v;->a0()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lx1/v;->X()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-direct {v2, v0, v3, p1, v1}, Lo1/s0$d;-><init>(Lo1/s0$e;Ljava/util/List;Lcom/google/protobuf/j;Lb3/f1;)V

    goto/16 :goto_0

    :goto_2
    return-object v1
.end method

.method B(Li1/l;)Lx1/t$h;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Li1/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/r;

    invoke-virtual {p0, v2}, Lo1/j0;->J(Li1/r;)Lx1/t$h;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Lx1/t$h;

    return-object p1

    :cond_1
    invoke-static {}, Lx1/t$d;->b0()Lx1/t$d$a;

    move-result-object v1

    invoke-virtual {p1}, Li1/l;->h()Li1/l$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->C(Li1/l$a;)Lx1/t$d$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx1/t$d$a;->D(Lx1/t$d$b;)Lx1/t$d$a;

    invoke-virtual {v1, v0}, Lx1/t$d$a;->B(Ljava/lang/Iterable;)Lx1/t$d$a;

    invoke-static {}, Lx1/t$h;->c0()Lx1/t$h$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lx1/t$h$a;->B(Lx1/t$d$a;)Lx1/t$h$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    goto :goto_1
.end method

.method C(Li1/l$a;)Lx1/t$d$b;
    .locals 1

    sget-object v0, Lo1/j0$a;->e:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lx1/t$d$b;->f:Lx1/t$d$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unrecognized composite filter type."

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Lx1/t$d$b;->g:Lx1/t$d$b;

    return-object p1
.end method

.method public D(Ll1/l;Ll1/t;)Lx1/h;
    .locals 1

    invoke-static {}, Lx1/h;->e0()Lx1/h$b;

    move-result-object v0

    invoke-virtual {p0, p1}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/h$b;->D(Ljava/lang/String;)Lx1/h$b;

    invoke-virtual {p2}, Ll1/t;->k()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/h$b;->B(Ljava/util/Map;)Lx1/h$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/h;

    return-object p1
.end method

.method public F(Li1/c1;)Lx1/u$c;
    .locals 1

    invoke-static {}, Lx1/u$c;->a0()Lx1/u$c$a;

    move-result-object v0

    invoke-virtual {p1}, Li1/c1;->n()Ll1/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->R(Ll1/u;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/u$c$a;->B(Ljava/lang/String;)Lx1/u$c$a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/u$c;

    return-object p1
.end method

.method J(Li1/r;)Lx1/t$h;
    .locals 2

    instance-of v0, p1, Li1/q;

    if-eqz v0, :cond_0

    check-cast p1, Li1/q;

    invoke-virtual {p0, p1}, Lo1/j0;->W(Li1/q;)Lx1/t$h;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Li1/l;

    if-eqz v0, :cond_1

    check-cast p1, Li1/l;

    invoke-virtual {p0, p1}, Lo1/j0;->B(Li1/l;)Lx1/t$h;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized filter type %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public L(Ll1/l;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo1/j0;->a:Ll1/f;

    invoke-virtual {p1}, Ll1/l;->t()Ll1/u;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lo1/j0;->T(Ll1/f;Ll1/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public N(Lk1/b4;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/b4;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lk1/b4;->b()Lk1/b1;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->M(Lk1/b1;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "goog-listen-tags"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public O(Lm1/f;)Lx1/y;
    .locals 3

    invoke-static {}, Lx1/y;->o0()Lx1/y$b;

    move-result-object v0

    instance-of v1, p1, Lm1/o;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lm1/f;->g()Ll1/l;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lm1/o;

    invoke-virtual {v2}, Lm1/o;->o()Ll1/t;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lo1/j0;->D(Ll1/l;Ll1/t;)Lx1/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/y$b;->F(Lx1/h;)Lx1/y$b;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lm1/l;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lm1/f;->g()Ll1/l;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lm1/l;

    invoke-virtual {v2}, Lm1/l;->q()Ll1/t;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lo1/j0;->D(Ll1/l;Ll1/t;)Lx1/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/y$b;->F(Lx1/h;)Lx1/y$b;

    invoke-virtual {p1}, Lm1/f;->e()Lm1/d;

    move-result-object v1

    invoke-direct {p0, v1}, Lo1/j0;->E(Lm1/d;)Lx1/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/y$b;->G(Lx1/k;)Lx1/y$b;

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lm1/c;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lm1/f;->g()Ll1/l;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/y$b;->E(Ljava/lang/String;)Lx1/y$b;

    goto :goto_0

    :cond_2
    instance-of v1, p1, Lm1/q;

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lm1/f;->g()Ll1/l;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/y$b;->H(Ljava/lang/String;)Lx1/y$b;

    :goto_0
    invoke-virtual {p1}, Lm1/f;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-direct {p0, v2}, Lo1/j0;->I(Lm1/e;)Lx1/m$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lx1/y$b;->B(Lx1/m$c;)Lx1/y$b;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lm1/f;->h()Lm1/m;

    move-result-object v1

    invoke-virtual {v1}, Lm1/m;->d()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lm1/f;->h()Lm1/m;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->Q(Lm1/m;)Lx1/s;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/y$b;->D(Lx1/s;)Lx1/y$b;

    :cond_4
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/y;

    return-object p1

    :cond_5
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "unknown mutation type %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public S(Li1/c1;)Lx1/u$d;
    .locals 7

    invoke-static {}, Lx1/u$d;->Z()Lx1/u$d$a;

    move-result-object v0

    invoke-static {}, Lx1/t;->r0()Lx1/t$b;

    move-result-object v1

    invoke-virtual {p1}, Li1/c1;->n()Ll1/u;

    move-result-object v2

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ll1/e;->s()I

    move-result v3

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Collection Group queries should be within a document path or root."

    invoke-static {v3, v6, v5}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v2}, Lo1/j0;->R(Ll1/u;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lx1/u$d$a;->B(Ljava/lang/String;)Lx1/u$d$a;

    invoke-static {}, Lx1/t$c;->Y()Lx1/t$c$a;

    move-result-object v2

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lx1/t$c$a;->D(Ljava/lang/String;)Lx1/t$c$a;

    invoke-virtual {v2, v4}, Lx1/t$c$a;->B(Z)Lx1/t$c$a;

    invoke-virtual {v1, v2}, Lx1/t$b;->B(Lx1/t$c$a;)Lx1/t$b;

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Ll1/e;->s()I

    move-result v3

    rem-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Document queries with filters are not supported."

    invoke-static {v3, v6, v5}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll1/e;->u()Ll1/e;

    move-result-object v3

    check-cast v3, Ll1/u;

    invoke-direct {p0, v3}, Lo1/j0;->R(Ll1/u;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lx1/u$d$a;->B(Ljava/lang/String;)Lx1/u$d$a;

    invoke-static {}, Lx1/t$c;->Y()Lx1/t$c$a;

    move-result-object v3

    invoke-virtual {v2}, Ll1/e;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lx1/t$c$a;->D(Ljava/lang/String;)Lx1/t$c$a;

    invoke-virtual {v1, v3}, Lx1/t$b;->B(Lx1/t$c$a;)Lx1/t$b;

    :goto_2
    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lo1/j0;->K(Ljava/util/List;)Lx1/t$h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx1/t$b;->H(Lx1/t$h;)Lx1/t$b;

    :cond_3
    invoke-virtual {p1}, Li1/c1;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/w0;

    invoke-direct {p0, v3}, Lo1/j0;->P(Li1/w0;)Lx1/t$i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lx1/t$b;->D(Lx1/t$i;)Lx1/t$b;

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Li1/c1;->r()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/google/protobuf/b0;->X()Lcom/google/protobuf/b0$b;

    move-result-object v2

    invoke-virtual {p1}, Li1/c1;->j()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v2, v3}, Lcom/google/protobuf/b0$b;->B(I)Lcom/google/protobuf/b0$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx1/t$b;->F(Lcom/google/protobuf/b0$b;)Lx1/t$b;

    :cond_5
    invoke-virtual {p1}, Li1/c1;->p()Li1/i;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {}, Lx1/g;->a0()Lx1/g$b;

    move-result-object v2

    invoke-virtual {p1}, Li1/c1;->p()Li1/i;

    move-result-object v3

    invoke-virtual {v3}, Li1/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lx1/g$b;->B(Ljava/lang/Iterable;)Lx1/g$b;

    invoke-virtual {p1}, Li1/c1;->p()Li1/i;

    move-result-object v3

    invoke-virtual {v3}, Li1/i;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Lx1/g$b;->D(Z)Lx1/g$b;

    invoke-virtual {v1, v2}, Lx1/t$b;->G(Lx1/g$b;)Lx1/t$b;

    :cond_6
    invoke-virtual {p1}, Li1/c1;->f()Li1/i;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {}, Lx1/g;->a0()Lx1/g$b;

    move-result-object v2

    invoke-virtual {p1}, Li1/c1;->f()Li1/i;

    move-result-object v3

    invoke-virtual {v3}, Li1/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lx1/g$b;->B(Ljava/lang/Iterable;)Lx1/g$b;

    invoke-virtual {p1}, Li1/c1;->f()Li1/i;

    move-result-object p1

    invoke-virtual {p1}, Li1/i;->c()Z

    move-result p1

    xor-int/2addr p1, v4

    invoke-virtual {v2, p1}, Lx1/g$b;->D(Z)Lx1/g$b;

    invoke-virtual {v1, v2}, Lx1/t$b;->E(Lx1/g$b;)Lx1/t$b;

    :cond_7
    invoke-virtual {v0, v1}, Lx1/u$d$a;->D(Lx1/t$b;)Lx1/u$d$a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/u$d;

    return-object p1
.end method

.method public U(Lk1/b4;)Lx1/u;
    .locals 3

    invoke-static {}, Lx1/u;->Z()Lx1/u$b;

    move-result-object v0

    invoke-virtual {p1}, Lk1/b4;->f()Li1/c1;

    move-result-object v1

    invoke-virtual {v1}, Li1/c1;->s()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lo1/j0;->F(Li1/c1;)Lx1/u$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/u$b;->B(Lx1/u$c;)Lx1/u$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lo1/j0;->S(Li1/c1;)Lx1/u$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/u$b;->D(Lx1/u$d;)Lx1/u$b;

    :goto_0
    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lx1/u$b;->G(I)Lx1/u$b;

    invoke-virtual {p1}, Lk1/b4;->c()Lcom/google/protobuf/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/j;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lk1/b4;->e()Ll1/w;

    move-result-object v1

    sget-object v2, Ll1/w;->f:Ll1/w;

    invoke-virtual {v1, v2}, Ll1/w;->d(Ll1/w;)I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Lk1/b4;->e()Ll1/w;

    move-result-object p1

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/u$b;->E(Lcom/google/protobuf/t1;)Lx1/u$b;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lk1/b4;->c()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/u$b;->F(Lcom/google/protobuf/j;)Lx1/u$b;

    :goto_1
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/u;

    return-object p1
.end method

.method public V(Lx0/o;)Lcom/google/protobuf/t1;
    .locals 3

    invoke-static {}, Lcom/google/protobuf/t1;->Z()Lcom/google/protobuf/t1$b;

    move-result-object v0

    invoke-virtual {p1}, Lx0/o;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/t1$b;->D(J)Lcom/google/protobuf/t1$b;

    invoke-virtual {p1}, Lx0/o;->g()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/t1$b;->B(I)Lcom/google/protobuf/t1$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/t1;

    return-object p1
.end method

.method W(Li1/q;)Lx1/t$h;
    .locals 3

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object v0

    sget-object v1, Li1/q$b;->h:Li1/q$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object v0

    sget-object v2, Li1/q$b;->i:Li1/q$b;

    if-ne v0, v2, :cond_4

    :cond_0
    invoke-static {}, Lx1/t$k;->Z()Lx1/t$k$a;

    move-result-object v0

    invoke-virtual {p1}, Li1/q;->g()Ll1/r;

    move-result-object v2

    invoke-direct {p0, v2}, Lo1/j0;->H(Ll1/r;)Lx1/t$g;

    move-result-object v2

    invoke-virtual {v0, v2}, Lx1/t$k$a;->B(Lx1/t$g;)Lx1/t$k$a;

    invoke-virtual {p1}, Li1/q;->i()Lx1/x;

    move-result-object v2

    invoke-static {v2}, Ll1/y;->y(Lx1/x;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object p1

    if-ne p1, v1, :cond_1

    sget-object p1, Lx1/t$k$b;->g:Lx1/t$k$b;

    goto :goto_0

    :cond_1
    sget-object p1, Lx1/t$k$b;->i:Lx1/t$k$b;

    :goto_0
    invoke-virtual {v0, p1}, Lx1/t$k$a;->D(Lx1/t$k$b;)Lx1/t$k$a;

    invoke-static {}, Lx1/t$h;->c0()Lx1/t$h$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx1/t$h$a;->E(Lx1/t$k$a;)Lx1/t$h$a;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/t$h;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Li1/q;->i()Lx1/x;

    move-result-object v2

    invoke-static {v2}, Ll1/y;->z(Lx1/x;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object p1

    if-ne p1, v1, :cond_3

    sget-object p1, Lx1/t$k$b;->h:Lx1/t$k$b;

    goto :goto_0

    :cond_3
    sget-object p1, Lx1/t$k$b;->j:Lx1/t$k$b;

    goto :goto_0

    :cond_4
    invoke-static {}, Lx1/t$f;->b0()Lx1/t$f$a;

    move-result-object v0

    invoke-virtual {p1}, Li1/q;->g()Ll1/r;

    move-result-object v1

    invoke-direct {p0, v1}, Lo1/j0;->H(Ll1/r;)Lx1/t$g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/t$f$a;->B(Lx1/t$g;)Lx1/t$f$a;

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lo1/j0;->G(Li1/q$b;)Lx1/t$f$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/t$f$a;->D(Lx1/t$f$b;)Lx1/t$f$a;

    invoke-virtual {p1}, Li1/q;->i()Lx1/x;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx1/t$f$a;->E(Lx1/x;)Lx1/t$f$a;

    invoke-static {}, Lx1/t$h;->c0()Lx1/t$h$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx1/t$h$a;->D(Lx1/t$f$a;)Lx1/t$h$a;

    move-result-object p1

    goto :goto_1
.end method

.method public X(Ll1/w;)Lcom/google/protobuf/t1;
    .locals 0

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->V(Lx0/o;)Lcom/google/protobuf/t1;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo1/j0;->b:Ljava/lang/String;

    return-object v0
.end method

.method b(Lx1/t$d;)Li1/l;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lx1/t$d;->Z()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/t$h;

    invoke-virtual {p0, v2}, Lo1/j0;->i(Lx1/t$h;)Li1/r;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Li1/l;

    invoke-virtual {p1}, Lx1/t$d;->a0()Lx1/t$d$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->c(Lx1/t$d$b;)Li1/l$a;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object v1
.end method

.method public b0(Ll1/u;)Z
    .locals 3

    invoke-static {p1}, Lo1/j0;->c0(Ll1/u;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lo1/j0;->a:Ll1/f;

    invoke-virtual {v2}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lo1/j0;->a:Ll1/f;

    invoke-virtual {v0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method c(Lx1/t$d$b;)Li1/l$a;
    .locals 1

    sget-object v0, Lo1/j0$a;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Li1/l$a;->g:Li1/l$a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Only AND and OR composite filter types are supported."

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Li1/l$a;->f:Li1/l$a;

    return-object p1
.end method

.method public e(Lx1/u$c;)Li1/c1;
    .locals 4

    invoke-virtual {p1}, Lx1/u$c;->Z()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v1

    const-string v0, "DocumentsTarget contained other than 1 document %d"

    invoke-static {v3, v0, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lx1/u$c;->Y(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->s(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-static {p1}, Li1/x0;->b(Ll1/u;)Li1/x0;

    move-result-object p1

    invoke-virtual {p1}, Li1/x0;->D()Li1/c1;

    move-result-object p1

    return-object p1
.end method

.method f(Lx1/t$f;)Li1/q;
    .locals 2

    invoke-virtual {p1}, Lx1/t$f;->Y()Lx1/t$g;

    move-result-object v0

    invoke-virtual {v0}, Lx1/t$g;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll1/r;->x(Ljava/lang/String;)Ll1/r;

    move-result-object v0

    invoke-virtual {p1}, Lx1/t$f;->Z()Lx1/t$f$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lo1/j0;->g(Lx1/t$f$b;)Li1/q$b;

    move-result-object v1

    invoke-virtual {p1}, Lx1/t$f;->a0()Lx1/x;

    move-result-object p1

    invoke-static {v0, v1, p1}, Li1/q;->f(Ll1/r;Li1/q$b;Lx1/x;)Li1/q;

    move-result-object p1

    return-object p1
.end method

.method i(Lx1/t$h;)Li1/r;
    .locals 3

    sget-object v0, Lo1/j0$a;->g:[I

    invoke-virtual {p1}, Lx1/t$h;->a0()Lx1/t$h$b;

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

    invoke-virtual {p1}, Lx1/t$h;->b0()Lx1/t$k;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->x(Lx1/t$k;)Li1/r;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lx1/t$h;->a0()Lx1/t$h$b;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized Filter.filterType %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lx1/t$h;->Z()Lx1/t$f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->f(Lx1/t$f;)Li1/q;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lx1/t$h;->X()Lx1/t$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->b(Lx1/t$d;)Li1/l;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;)Ll1/l;
    .locals 4

    invoke-direct {p0, p1}, Lo1/j0;->v(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo1/j0;->a:Ll1/f;

    invoke-virtual {v1}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize key from different project."

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lo1/j0;->a:Ll1/f;

    invoke-virtual {v2}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Tried to deserialize key from different database."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lo1/j0;->Z(Ll1/u;)Ll1/u;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    return-object p1
.end method

.method public m(Lx1/d;)Ll1/s;
    .locals 3

    invoke-virtual {p1}, Lx1/d;->Y()Lx1/d$c;

    move-result-object v0

    sget-object v1, Lx1/d$c;->f:Lx1/d$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lo1/j0;->k(Lx1/d;)Ll1/s;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lx1/d;->Y()Lx1/d$c;

    move-result-object v0

    sget-object v1, Lx1/d$c;->g:Lx1/d$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lo1/j0;->n(Lx1/d;)Ll1/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown result case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lx1/d;->Y()Lx1/d$c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o(Lx1/y;)Lm1/f;
    .locals 7

    invoke-virtual {p1}, Lx1/y;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lx1/y;->c0()Lx1/s;

    move-result-object v0

    invoke-direct {p0, v0}, Lo1/j0;->r(Lx1/s;)Lm1/m;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm1/m;->c:Lm1/m;

    :goto_0
    move-object v5, v0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lx1/y;->i0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m$c;

    invoke-direct {p0, v1}, Lo1/j0;->h(Lx1/m$c;)Lm1/e;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v0, Lo1/j0$a;->a:[I

    invoke-virtual {p1}, Lx1/y;->e0()Lx1/y$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    new-instance v0, Lm1/q;

    invoke-virtual {p1}, Lx1/y;->j0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    invoke-direct {v0, p1, v5}, Lm1/q;-><init>(Ll1/l;Lm1/m;)V

    return-object v0

    :cond_2
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lx1/y;->e0()Lx1/y$c;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unknown mutation operation: %d"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_3
    new-instance v0, Lm1/c;

    invoke-virtual {p1}, Lx1/y;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    invoke-direct {v0, p1, v5}, Lm1/c;-><init>(Ll1/l;Lm1/m;)V

    return-object v0

    :cond_4
    invoke-virtual {p1}, Lx1/y;->n0()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lm1/l;

    invoke-virtual {p1}, Lx1/y;->g0()Lx1/h;

    move-result-object v1

    invoke-virtual {v1}, Lx1/h;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v2

    invoke-virtual {p1}, Lx1/y;->g0()Lx1/h;

    move-result-object v1

    invoke-virtual {v1}, Lx1/h;->Y()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Ll1/t;->g(Ljava/util/Map;)Ll1/t;

    move-result-object v3

    invoke-virtual {p1}, Lx1/y;->h0()Lx1/k;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->d(Lx1/k;)Lm1/d;

    move-result-object v4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lm1/l;-><init>(Ll1/l;Ll1/t;Lm1/d;Lm1/m;Ljava/util/List;)V

    return-object v0

    :cond_5
    new-instance v0, Lm1/o;

    invoke-virtual {p1}, Lx1/y;->g0()Lx1/h;

    move-result-object v1

    invoke-virtual {v1}, Lx1/h;->a0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo1/j0;->l(Ljava/lang/String;)Ll1/l;

    move-result-object v1

    invoke-virtual {p1}, Lx1/y;->g0()Lx1/h;

    move-result-object p1

    invoke-virtual {p1}, Lx1/h;->Y()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll1/t;->g(Ljava/util/Map;)Ll1/t;

    move-result-object p1

    invoke-direct {v0, v1, p1, v5, v6}, Lm1/o;-><init>(Ll1/l;Ll1/t;Lm1/m;Ljava/util/List;)V

    return-object v0
.end method

.method public p(Lx1/b0;Ll1/w;)Lm1/i;
    .locals 4

    invoke-virtual {p1}, Lx1/b0;->W()Lcom/google/protobuf/t1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v0

    sget-object v1, Ll1/w;->f:Ll1/w;

    invoke-virtual {v1, v0}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    invoke-virtual {p1}, Lx1/b0;->V()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, Lx1/b0;->U(I)Lx1/x;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Lm1/i;

    invoke-direct {p1, p2, v1}, Lm1/i;-><init>(Ll1/w;Ljava/util/List;)V

    return-object p1
.end method

.method public t(Ljava/lang/String;Lx1/t;)Li1/c1;
    .locals 13

    invoke-direct {p0, p1}, Lo1/j0;->s(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-virtual {p2}, Lx1/t;->h0()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v0, :cond_2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "StructuredQuery.from with more than one collection is not supported."

    invoke-static {v0, v5, v4}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Lx1/t;->g0(I)Lx1/t$c;

    move-result-object v0

    invoke-virtual {v0}, Lx1/t$c;->W()Z

    move-result v4

    invoke-virtual {v0}, Lx1/t$c;->X()Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_1

    move-object v5, p1

    move-object v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object p1

    check-cast p1, Ll1/u;

    :cond_2
    move-object v5, p1

    move-object v6, v1

    :goto_1
    invoke-virtual {p2}, Lx1/t;->q0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Lx1/t;->m0()Lx1/t$h;

    move-result-object p1

    invoke-direct {p0, p1}, Lo1/j0;->j(Lx1/t$h;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_2
    move-object v7, p1

    invoke-virtual {p2}, Lx1/t;->k0()I

    move-result p1

    if-lez p1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v2, p1, :cond_4

    invoke-virtual {p2, v2}, Lx1/t;->j0(I)Lx1/t$i;

    move-result-object v4

    invoke-direct {p0, v4}, Lo1/j0;->q(Lx1/t$i;)Li1/w0;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    move-object v8, v0

    goto :goto_4

    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    move-object v8, p1

    :goto_4
    const-wide/16 v9, -0x1

    invoke-virtual {p2}, Lx1/t;->o0()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Lx1/t;->i0()Lcom/google/protobuf/b0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/b0;->W()I

    move-result p1

    int-to-long v9, p1

    :cond_6
    invoke-virtual {p2}, Lx1/t;->p0()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Li1/i;

    invoke-virtual {p2}, Lx1/t;->l0()Lx1/g;

    move-result-object v0

    invoke-virtual {v0}, Lx1/g;->k()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lx1/t;->l0()Lx1/g;

    move-result-object v2

    invoke-virtual {v2}, Lx1/g;->Y()Z

    move-result v2

    invoke-direct {p1, v0, v2}, Li1/i;-><init>(Ljava/util/List;Z)V

    move-object v11, p1

    goto :goto_5

    :cond_7
    move-object v11, v1

    :goto_5
    invoke-virtual {p2}, Lx1/t;->n0()Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance v1, Li1/i;

    invoke-virtual {p2}, Lx1/t;->f0()Lx1/g;

    move-result-object p1

    invoke-virtual {p1}, Lx1/g;->k()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lx1/t;->f0()Lx1/g;

    move-result-object p2

    invoke-virtual {p2}, Lx1/g;->Y()Z

    move-result p2

    xor-int/2addr p2, v3

    invoke-direct {v1, p1, p2}, Li1/i;-><init>(Ljava/util/List;Z)V

    :cond_8
    move-object v12, v1

    new-instance p1, Li1/c1;

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, Li1/c1;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/i;Li1/i;)V

    return-object p1
.end method

.method public u(Lx1/u$d;)Li1/c1;
    .locals 1

    invoke-virtual {p1}, Lx1/u$d;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lx1/u$d;->Y()Lx1/t;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lo1/j0;->t(Ljava/lang/String;Lx1/t;)Li1/c1;

    move-result-object p1

    return-object p1
.end method

.method public w(Lcom/google/protobuf/t1;)Lx0/o;
    .locals 3

    new-instance v0, Lx0/o;

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->X()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lx0/o;-><init>(JI)V

    return-object v0
.end method

.method public y(Lcom/google/protobuf/t1;)Ll1/w;
    .locals 5

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->X()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ll1/w;->f:Ll1/w;

    return-object p1

    :cond_0
    new-instance v0, Ll1/w;

    invoke-virtual {p0, p1}, Lo1/j0;->w(Lcom/google/protobuf/t1;)Lx0/o;

    move-result-object p1

    invoke-direct {v0, p1}, Ll1/w;-><init>(Lx0/o;)V

    return-object v0
.end method

.method public z(Lx1/q;)Ll1/w;
    .locals 2

    invoke-virtual {p1}, Lx1/q;->Z()Lx1/q$c;

    move-result-object v0

    sget-object v1, Lx1/q$c;->f:Lx1/q$c;

    if-eq v0, v1, :cond_0

    sget-object p1, Ll1/w;->f:Ll1/w;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lx1/q;->a0()Lx1/v;

    move-result-object v0

    invoke-virtual {v0}, Lx1/v;->Z()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ll1/w;->f:Ll1/w;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lx1/q;->a0()Lx1/v;

    move-result-object p1

    invoke-virtual {p1}, Lx1/v;->W()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object p1

    return-object p1
.end method
