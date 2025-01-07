.class public final Lo1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/t0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/n0$c;
    }
.end annotation


# instance fields
.field private final a:Lo1/n0$c;

.field private final b:Lk1/f0;

.field private final c:Lo1/m;

.field private final d:Lo1/k;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lk1/b4;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lo1/h0;

.field private g:Z

.field private final h:Lo1/u0;

.field private final i:Lo1/v0;

.field private j:Lo1/t0;

.field private final k:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lm1/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo1/n0$c;Lk1/f0;Lo1/m;Lp1/g;Lo1/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/n0;->g:Z

    iput-object p1, p0, Lo1/n0;->a:Lo1/n0$c;

    iput-object p2, p0, Lo1/n0;->b:Lk1/f0;

    iput-object p3, p0, Lo1/n0;->c:Lo1/m;

    iput-object p5, p0, Lo1/n0;->d:Lo1/k;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lo1/n0;->e:Ljava/util/Map;

    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p2, p0, Lo1/n0;->k:Ljava/util/Deque;

    new-instance p2, Lo1/h0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lo1/l0;

    invoke-direct {v0, p1}, Lo1/l0;-><init>(Lo1/n0$c;)V

    invoke-direct {p2, p4, v0}, Lo1/h0;-><init>(Lp1/g;Lo1/h0$a;)V

    iput-object p2, p0, Lo1/n0;->f:Lo1/h0;

    new-instance p1, Lo1/n0$a;

    invoke-direct {p1, p0}, Lo1/n0$a;-><init>(Lo1/n0;)V

    invoke-virtual {p3, p1}, Lo1/m;->e(Lo1/u0$a;)Lo1/u0;

    move-result-object p1

    iput-object p1, p0, Lo1/n0;->h:Lo1/u0;

    new-instance p1, Lo1/n0$b;

    invoke-direct {p1, p0}, Lo1/n0$b;-><init>(Lo1/n0;)V

    invoke-virtual {p3, p1}, Lo1/m;->f(Lo1/v0$a;)Lo1/v0;

    move-result-object p1

    iput-object p1, p0, Lo1/n0;->i:Lo1/v0;

    new-instance p1, Lo1/m0;

    invoke-direct {p1, p0, p4}, Lo1/m0;-><init>(Lo1/n0;Lp1/g;)V

    invoke-interface {p5, p1}, Lo1/k;->a(Lp1/n;)V

    return-void
.end method

.method private A(Lb3/f1;)V
    .locals 3

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo1/n0;->M()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Write stream was stopped gracefully while still needed."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lo1/n0;->y(Lb3/f1;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lo1/n0;->z(Lb3/f1;)V

    :cond_2
    :goto_0
    invoke-direct {p0}, Lo1/n0;->M()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lo1/n0;->Q()V

    :cond_3
    return-void
.end method

.method private B()V
    .locals 3

    iget-object v0, p0, Lo1/n0;->b:Lk1/f0;

    iget-object v1, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v1}, Lo1/v0;->y()Lcom/google/protobuf/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk1/f0;->h0(Lcom/google/protobuf/j;)V

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/g;

    iget-object v2, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v1}, Lm1/g;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lo1/v0;->D(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private C(Ll1/w;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/w;",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/g;

    iget-object v1, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v1}, Lo1/v0;->y()Lcom/google/protobuf/j;

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Lm1/h;->a(Lm1/g;Ll1/w;Ljava/util/List;Lcom/google/protobuf/j;)Lm1/h;

    move-result-object p1

    iget-object p2, p0, Lo1/n0;->a:Lo1/n0$c;

    invoke-interface {p2, p1}, Lo1/n0$c;->f(Lm1/h;)V

    invoke-virtual {p0}, Lo1/n0;->t()V

    return-void
.end method

.method private synthetic D(Lo1/k$a;)V
    .locals 2

    sget-object v0, Lo1/k$a;->f:Lo1/k$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    invoke-virtual {v0}, Lo1/h0;->c()Li1/v0;

    move-result-object v0

    sget-object v1, Li1/v0;->f:Li1/v0;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lo1/k$a;->e:Lo1/k$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lo1/n0;->f:Lo1/h0;

    invoke-virtual {p1}, Lo1/h0;->c()Li1/v0;

    move-result-object p1

    sget-object v0, Li1/v0;->g:Li1/v0;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "RemoteStore"

    const-string v1, "Restarting streams for network reachability change."

    invoke-static {v0, v1, p1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lo1/n0;->I()V

    return-void
.end method

.method private synthetic E(Lp1/g;Lo1/k$a;)V
    .locals 1

    new-instance v0, Lo1/k0;

    invoke-direct {v0, p0, p2}, Lo1/k0;-><init>(Lo1/n0;Lo1/k$a;)V

    invoke-virtual {p1, v0}, Lp1/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method private G(Lo1/s0$d;)V
    .locals 4

    invoke-virtual {p1}, Lo1/s0$d;->a()Lb3/f1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Processing target error without a cause"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lo1/s0$d;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lo1/n0;->j:Lo1/t0;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lo1/t0;->n(I)V

    iget-object v2, p0, Lo1/n0;->a:Lo1/n0$c;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lo1/s0$d;->a()Lb3/f1;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lo1/n0$c;->e(ILb3/f1;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private H(Ll1/w;)V
    .locals 9

    sget-object v0, Ll1/w;->f:Ll1/w;

    invoke-virtual {p1, v0}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Can\'t raise event for unknown SnapshotVersion"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    invoke-virtual {v0, p1}, Lo1/t0;->b(Ll1/w;)Lo1/i0;

    move-result-object v0

    invoke-virtual {v0}, Lo1/i0;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/q0;

    invoke-virtual {v3}, Lo1/q0;->e()Lcom/google/protobuf/j;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/protobuf/j;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk1/b4;

    if-eqz v4, :cond_0

    iget-object v5, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3}, Lo1/q0;->e()Lcom/google/protobuf/j;

    move-result-object v3

    invoke-virtual {v4, v3, p1}, Lk1/b4;->i(Lcom/google/protobuf/j;Ll1/w;)Lk1/b4;

    move-result-object v3

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lo1/i0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v1, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/b4;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v5, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    invoke-virtual {v1}, Lk1/b4;->e()Ll1/w;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Lk1/b4;->i(Lcom/google/protobuf/j;Ll1/w;)Lk1/b4;

    move-result-object v5

    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v4}, Lo1/n0;->J(I)V

    new-instance v8, Lk1/b4;

    invoke-virtual {v1}, Lk1/b4;->f()Li1/c1;

    move-result-object v3

    invoke-virtual {v1}, Lk1/b4;->d()J

    move-result-wide v5

    sget-object v7, Lk1/b1;->f:Lk1/b1;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lk1/b4;-><init>(Li1/c1;IJLk1/b1;)V

    invoke-direct {p0, v8}, Lo1/n0;->K(Lk1/b4;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lo1/n0;->a:Lo1/n0$c;

    invoke-interface {p1, v0}, Lo1/n0$c;->d(Lo1/i0;)V

    return-void
.end method

.method private I()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/n0;->g:Z

    invoke-direct {p0}, Lo1/n0;->r()V

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v1, Li1/v0;->e:Li1/v0;

    invoke-virtual {v0, v1}, Lo1/h0;->i(Li1/v0;)V

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->l()V

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->l()V

    invoke-virtual {p0}, Lo1/n0;->s()V

    return-void
.end method

.method private J(I)V
    .locals 1

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    invoke-virtual {v0, p1}, Lo1/t0;->l(I)V

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0, p1}, Lo1/u0;->z(I)V

    return-void
.end method

.method private K(Lk1/b4;)V
    .locals 2

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo1/t0;->l(I)V

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0, p1}, Lo1/u0;->A(Lk1/b4;)V

    return-void
.end method

.method private L()Z
    .locals 1

    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private M()Z
    .locals 1

    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private P()V
    .locals 3

    invoke-direct {p0}, Lo1/n0;->L()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWatchStream() called when shouldStartWatchStream() is false."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lo1/t0;

    invoke-direct {v0, p0}, Lo1/t0;-><init>(Lo1/t0$b;)V

    iput-object v0, p0, Lo1/n0;->j:Lo1/t0;

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->u()V

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    invoke-virtual {v0}, Lo1/h0;->e()V

    return-void
.end method

.method private Q()V
    .locals 3

    invoke-direct {p0}, Lo1/n0;->M()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWriteStream() called when shouldStartWriteStream() is false."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->u()V

    return-void
.end method

.method public static synthetic c(Lo1/n0;Lp1/g;Lo1/k$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo1/n0;->E(Lp1/g;Lo1/k$a;)V

    return-void
.end method

.method public static synthetic d(Lo1/n0;Lo1/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/n0;->D(Lo1/k$a;)V

    return-void
.end method

.method static synthetic e(Lo1/n0;)V
    .locals 0

    invoke-direct {p0}, Lo1/n0;->x()V

    return-void
.end method

.method static synthetic f(Lo1/n0;Ll1/w;Lo1/s0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo1/n0;->v(Ll1/w;Lo1/s0;)V

    return-void
.end method

.method static synthetic g(Lo1/n0;Lb3/f1;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/n0;->w(Lb3/f1;)V

    return-void
.end method

.method static synthetic h(Lo1/n0;)Lo1/v0;
    .locals 0

    iget-object p0, p0, Lo1/n0;->i:Lo1/v0;

    return-object p0
.end method

.method static synthetic i(Lo1/n0;)V
    .locals 0

    invoke-direct {p0}, Lo1/n0;->B()V

    return-void
.end method

.method static synthetic j(Lo1/n0;Ll1/w;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo1/n0;->C(Ll1/w;Ljava/util/List;)V

    return-void
.end method

.method static synthetic k(Lo1/n0;Lb3/f1;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/n0;->A(Lb3/f1;)V

    return-void
.end method

.method private l(Lm1/g;)V
    .locals 3

    invoke-direct {p0}, Lo1/n0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addToWritePipeline called when pipeline is full"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {p1}, Lm1/g;->h()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo1/v0;->D(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private m()Z
    .locals 2

    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private o()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lo1/n0;->j:Lo1/t0;

    return-void
.end method

.method private r()V
    .locals 3

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->v()V

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->v()V

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "RemoteStore"

    const-string v2, "Stopping write stream with %d pending writes"

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    :cond_0
    invoke-direct {p0}, Lo1/n0;->o()V

    return-void
.end method

.method private v(Ll1/w;Lo1/s0;)V
    .locals 5

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v1, Li1/v0;->f:Li1/v0;

    invoke-virtual {v0, v1}, Lo1/h0;->i(Li1/v0;)V

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WatchStream and WatchStreamAggregator should both be non-null"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    instance-of v0, p2, Lo1/s0$d;

    if-eqz v0, :cond_1

    move-object v2, p2

    check-cast v2, Lo1/s0$d;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lo1/s0$d;->b()Lo1/s0$e;

    move-result-object v3

    sget-object v4, Lo1/s0$e;->g:Lo1/s0$e;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lo1/s0$d;->a()Lb3/f1;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v2}, Lo1/n0;->G(Lo1/s0$d;)V

    goto :goto_3

    :cond_2
    instance-of v2, p2, Lo1/s0$b;

    if-eqz v2, :cond_3

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    check-cast p2, Lo1/s0$b;

    invoke-virtual {v0, p2}, Lo1/t0;->g(Lo1/s0$b;)V

    goto :goto_2

    :cond_3
    instance-of v2, p2, Lo1/s0$c;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    check-cast p2, Lo1/s0$c;

    invoke-virtual {v0, p2}, Lo1/t0;->h(Lo1/s0$c;)V

    goto :goto_2

    :cond_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Expected watchChange to be an instance of WatchTargetChange"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->j:Lo1/t0;

    check-cast p2, Lo1/s0$d;

    invoke-virtual {v0, p2}, Lo1/t0;->i(Lo1/s0$d;)V

    :goto_2
    sget-object p2, Ll1/w;->f:Ll1/w;

    invoke-virtual {p1, p2}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lo1/n0;->b:Lk1/f0;

    invoke-virtual {p2}, Lk1/f0;->C()Ll1/w;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll1/w;->d(Ll1/w;)I

    move-result p2

    if-ltz p2, :cond_5

    invoke-direct {p0, p1}, Lo1/n0;->H(Ll1/w;)V

    :cond_5
    :goto_3
    return-void
.end method

.method private w(Lb3/f1;)V
    .locals 3

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo1/n0;->L()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Watch stream was stopped gracefully while still needed."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lo1/n0;->o()V

    invoke-direct {p0}, Lo1/n0;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    invoke-virtual {v0, p1}, Lo1/h0;->d(Lb3/f1;)V

    invoke-direct {p0}, Lo1/n0;->P()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v0, Li1/v0;->e:Li1/v0;

    invoke-virtual {p1, v0}, Lo1/h0;->i(Li1/v0;)V

    :goto_0
    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/b4;

    invoke-direct {p0, v1}, Lo1/n0;->K(Lk1/b4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private y(Lb3/f1;)V
    .locals 3

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handling write error with status OK."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lo1/m;->k(Lb3/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/g;

    iget-object v1, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v1}, Lo1/v0;->l()V

    iget-object v1, p0, Lo1/n0;->a:Lo1/n0$c;

    invoke-virtual {v0}, Lm1/g;->e()I

    move-result v0

    invoke-interface {v1, v0, p1}, Lo1/n0$c;->c(ILb3/f1;)V

    invoke-virtual {p0}, Lo1/n0;->t()V

    :cond_0
    return-void
.end method

.method private z(Lb3/f1;)V
    .locals 5

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Handling write error with status OK."

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lo1/m;->i(Lb3/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/v0;->y()Lcom/google/protobuf/j;

    move-result-object v0

    invoke-static {v0}, Lp1/g0;->y(Lcom/google/protobuf/j;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    const-string p1, "RemoteStore"

    const-string v0, "RemoteStore error before completed handshake; resetting stream token %s: %s"

    invoke-static {p1, v0, v3}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lo1/n0;->i:Lo1/v0;

    sget-object v0, Lo1/v0;->v:Lcom/google/protobuf/j;

    invoke-virtual {p1, v0}, Lo1/v0;->B(Lcom/google/protobuf/j;)V

    iget-object p1, p0, Lo1/n0;->b:Lk1/f0;

    invoke-virtual {p1, v0}, Lk1/f0;->h0(Lcom/google/protobuf/j;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public F(Lk1/b4;)V
    .locals 2

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lo1/n0;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lo1/n0;->P()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lo1/n0;->K(Lk1/b4;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public N()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "RemoteStore"

    const-string v3, "Shutting down"

    invoke-static {v2, v3, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lo1/n0;->d:Lo1/k;

    invoke-interface {v1}, Lo1/k;->shutdown()V

    iput-boolean v0, p0, Lo1/n0;->g:Z

    invoke-direct {p0}, Lo1/n0;->r()V

    iget-object v0, p0, Lo1/n0;->c:Lo1/m;

    invoke-virtual {v0}, Lo1/m;->n()V

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v1, Li1/v0;->e:Li1/v0;

    invoke-virtual {v0, v1}, Lo1/h0;->i(Li1/v0;)V

    return-void
.end method

.method public O()V
    .locals 0

    invoke-virtual {p0}, Lo1/n0;->s()V

    return-void
.end method

.method public R(I)V
    .locals 4

    iget-object v0, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/b4;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "stopListening called on target no currently watched: %d"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {v0}, Lo1/u0;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lo1/n0;->J(I)V

    :cond_1
    iget-object p1, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {p1}, Lo1/u0;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lo1/n0;->h:Lo1/u0;

    invoke-virtual {p1}, Lo1/c;->q()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v0, Li1/v0;->e:Li1/v0;

    invoke-virtual {p1, v0}, Lo1/h0;->i(Li1/v0;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(I)Lk1/b4;
    .locals 1

    iget-object v0, p0, Lo1/n0;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/b4;

    return-object p1
.end method

.method public b(I)Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo1/n0;->a:Lo1/n0$c;

    invoke-interface {v0, p1}, Lo1/n0$c;->b(I)Lc1/e;

    move-result-object p1

    return-object p1
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lo1/n0;->g:Z

    return v0
.end method

.method public p()Li1/g1;
    .locals 2

    new-instance v0, Li1/g1;

    iget-object v1, p0, Lo1/n0;->c:Lo1/m;

    invoke-direct {v0, v1}, Li1/g1;-><init>(Lo1/m;)V

    return-object v0
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/n0;->g:Z

    invoke-direct {p0}, Lo1/n0;->r()V

    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v1, Li1/v0;->g:Li1/v0;

    invoke-virtual {v0, v1}, Lo1/h0;->i(Li1/v0;)V

    return-void
.end method

.method public s()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo1/n0;->g:Z

    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    iget-object v1, p0, Lo1/n0;->b:Lk1/f0;

    invoke-virtual {v1}, Lk1/f0;->D()Lcom/google/protobuf/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/v0;->B(Lcom/google/protobuf/j;)V

    invoke-direct {p0}, Lo1/n0;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo1/n0;->P()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/n0;->f:Lo1/h0;

    sget-object v1, Li1/v0;->e:Li1/v0;

    invoke-virtual {v0, v1}, Lo1/h0;->i(Li1/v0;)V

    :goto_0
    invoke-virtual {p0}, Lo1/n0;->t()V

    :cond_1
    return-void
.end method

.method public t()V
    .locals 2

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/g;

    goto :goto_1

    :goto_0
    invoke-direct {p0}, Lo1/n0;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lo1/n0;->b:Lk1/f0;

    invoke-virtual {v1, v0}, Lk1/f0;->G(I)Lm1/g;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo1/n0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo1/n0;->i:Lo1/v0;

    invoke-virtual {v0}, Lo1/c;->q()V

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0}, Lo1/n0;->l(Lm1/g;)V

    :goto_1
    invoke-virtual {v0}, Lm1/g;->e()I

    move-result v0

    goto :goto_0

    :cond_2
    :goto_2
    invoke-direct {p0}, Lo1/n0;->M()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lo1/n0;->Q()V

    :cond_3
    return-void
.end method

.method public u()V
    .locals 3

    invoke-virtual {p0}, Lo1/n0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "RemoteStore"

    const-string v2, "Restarting streams for new credential."

    invoke-static {v1, v2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lo1/n0;->I()V

    :cond_0
    return-void
.end method
