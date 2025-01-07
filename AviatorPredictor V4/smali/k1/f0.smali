.class public final Lk1/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/f0$b;,
        Lk1/f0$c;
    }
.end annotation


# static fields
.field private static final n:J


# instance fields
.field private final a:Lk1/z0;

.field private b:Lk1/l;

.field private c:Lk1/w0;

.field private d:Lk1/b;

.field private final e:Lk1/f1;

.field private f:Lk1/n;

.field private final g:Lk1/a1;

.field private final h:Lk1/e1;

.field private final i:Lk1/a4;

.field private final j:Lk1/a;

.field private final k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lk1/b4;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li1/c1;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Li1/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lk1/f0;->n:J

    return-void
.end method

.method public constructor <init>(Lk1/z0;Lk1/a1;Lg1/j;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lk1/z0;->i()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalStore was passed an unstarted persistence implementation"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lk1/f0;->a:Lk1/z0;

    iput-object p2, p0, Lk1/f0;->g:Lk1/a1;

    invoke-virtual {p1}, Lk1/z0;->h()Lk1/a4;

    move-result-object p2

    iput-object p2, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {p1}, Lk1/z0;->a()Lk1/a;

    move-result-object v0

    iput-object v0, p0, Lk1/f0;->j:Lk1/a;

    invoke-interface {p2}, Lk1/a4;->j()I

    move-result p2

    invoke-static {p2}, Li1/d1;->b(I)Li1/d1;

    move-result-object p2

    iput-object p2, p0, Lk1/f0;->m:Li1/d1;

    invoke-virtual {p1}, Lk1/z0;->g()Lk1/f1;

    move-result-object p2

    iput-object p2, p0, Lk1/f0;->e:Lk1/f1;

    new-instance p2, Lk1/e1;

    invoke-direct {p2}, Lk1/e1;-><init>()V

    iput-object p2, p0, Lk1/f0;->h:Lk1/e1;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/f0;->l:Ljava/util/Map;

    invoke-virtual {p1}, Lk1/z0;->f()Lk1/d1;

    move-result-object p1

    invoke-interface {p1, p2}, Lk1/d1;->j(Lk1/e1;)V

    invoke-direct {p0, p3}, Lk1/f0;->K(Lg1/j;)V

    return-void
.end method

.method private B(Lm1/h;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/h;",
            ")",
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lm1/h;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1}, Lm1/h;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/i;

    invoke-virtual {v2}, Lm1/i;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v2

    invoke-virtual {v2}, Lm1/g;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/f;

    invoke-virtual {v2}, Lm1/f;->g()Ll1/l;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private K(Lg1/j;)V
    .locals 4

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v0, p1}, Lk1/z0;->c(Lg1/j;)Lk1/l;

    move-result-object v0

    iput-object v0, p0, Lk1/f0;->b:Lk1/l;

    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v1, p1, v0}, Lk1/z0;->d(Lg1/j;Lk1/l;)Lk1/w0;

    move-result-object v0

    iput-object v0, p0, Lk1/f0;->c:Lk1/w0;

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v0, p1}, Lk1/z0;->b(Lg1/j;)Lk1/b;

    move-result-object p1

    iput-object p1, p0, Lk1/f0;->d:Lk1/b;

    new-instance v0, Lk1/n;

    iget-object v1, p0, Lk1/f0;->e:Lk1/f1;

    iget-object v2, p0, Lk1/f0;->c:Lk1/w0;

    iget-object v3, p0, Lk1/f0;->b:Lk1/l;

    invoke-direct {v0, v1, v2, p1, v3}, Lk1/n;-><init>(Lk1/f1;Lk1/w0;Lk1/b;Lk1/l;)V

    iput-object v0, p0, Lk1/f0;->f:Lk1/n;

    iget-object p1, p0, Lk1/f0;->e:Lk1/f1;

    iget-object v0, p0, Lk1/f0;->b:Lk1/l;

    invoke-interface {p1, v0}, Lk1/f1;->a(Lk1/l;)V

    iget-object p1, p0, Lk1/f0;->g:Lk1/a1;

    iget-object v0, p0, Lk1/f0;->f:Lk1/n;

    iget-object v1, p0, Lk1/f0;->b:Lk1/l;

    invoke-virtual {p1, v0, v1}, Lk1/a1;->e(Lk1/n;Lk1/l;)V

    return-void
.end method

.method private synthetic L(Lm1/h;)Lc1/c;
    .locals 3

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v0

    iget-object v1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-virtual {p1}, Lm1/h;->f()Lcom/google/protobuf/j;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lk1/w0;->l(Lm1/g;Lcom/google/protobuf/j;)V

    invoke-direct {p0, p1}, Lk1/f0;->w(Lm1/h;)V

    iget-object v1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v1}, Lk1/w0;->c()V

    iget-object v1, p0, Lk1/f0;->d:Lk1/b;

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v2

    invoke-virtual {v2}, Lm1/g;->e()I

    move-result v2

    invoke-interface {v1, v2}, Lk1/b;->c(I)V

    iget-object v1, p0, Lk1/f0;->f:Lk1/n;

    invoke-direct {p0, p1}, Lk1/f0;->B(Lm1/h;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v1, p1}, Lk1/n;->n(Ljava/util/Set;)V

    iget-object p1, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {v0}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk1/n;->d(Ljava/lang/Iterable;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic M(Lk1/f0$b;Li1/c1;)V
    .locals 7

    iget-object v0, p0, Lk1/f0;->m:Li1/d1;

    invoke-virtual {v0}, Li1/d1;->c()I

    move-result v3

    iput v3, p1, Lk1/f0$b;->b:I

    new-instance v0, Lk1/b4;

    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v1}, Lk1/z0;->f()Lk1/d1;

    move-result-object v1

    invoke-interface {v1}, Lk1/d1;->h()J

    move-result-wide v4

    sget-object v6, Lk1/b1;->e:Lk1/b1;

    move-object v1, v0

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Lk1/b4;-><init>(Li1/c1;IJLk1/b1;)V

    iput-object v0, p1, Lk1/f0$b;->a:Lk1/b4;

    iget-object p1, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {p1, v0}, Lk1/a4;->i(Lk1/b4;)V

    return-void
.end method

.method private synthetic N(Lc1/c;Lk1/b4;)Lc1/c;
    .locals 5

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lc1/c;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/s;

    invoke-virtual {v2}, Ll1/s;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    :cond_0
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {p2}, Lk1/b4;->g()I

    move-result v2

    invoke-interface {p1, v2}, Lk1/a4;->f(I)V

    iget-object p1, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {p2}, Lk1/b4;->g()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lk1/a4;->d(Lc1/e;I)V

    invoke-direct {p0, v1}, Lk1/f0;->d0(Ljava/util/Map;)Lk1/f0$c;

    move-result-object p1

    invoke-static {p1}, Lk1/f0$c;->a(Lk1/f0$c;)Ljava/util/Map;

    move-result-object p2

    iget-object v0, p0, Lk1/f0;->f:Lk1/n;

    invoke-static {p1}, Lk1/f0$c;->b(Lk1/f0$c;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lk1/n;->i(Ljava/util/Map;Ljava/util/Set;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic O(Lo1/i0;Ll1/w;)Lc1/c;
    .locals 9

    invoke-virtual {p1}, Lo1/i0;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v1}, Lk1/z0;->f()Lk1/d1;

    move-result-object v1

    invoke-interface {v1}, Lk1/d1;->h()J

    move-result-wide v1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/q0;

    iget-object v5, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk1/b4;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v6, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {v3}, Lo1/q0;->d()Lc1/e;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Lk1/a4;->g(Lc1/e;I)V

    iget-object v6, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {v3}, Lo1/q0;->b()Lc1/e;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Lk1/a4;->d(Lc1/e;I)V

    invoke-virtual {v5, v1, v2}, Lk1/b4;->j(J)Lk1/b4;

    move-result-object v6

    invoke-virtual {p1}, Lo1/i0;->e()Ljava/util/Set;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    sget-object v8, Ll1/w;->f:Ll1/w;

    invoke-virtual {v6, v7, v8}, Lk1/b4;->i(Lcom/google/protobuf/j;Ll1/w;)Lk1/b4;

    move-result-object v6

    invoke-virtual {v6, v8}, Lk1/b4;->h(Ll1/w;)Lk1/b4;

    move-result-object v6

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lo1/q0;->e()Lcom/google/protobuf/j;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/protobuf/j;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v3}, Lo1/q0;->e()Lcom/google/protobuf/j;

    move-result-object v7

    invoke-virtual {p1}, Lo1/i0;->c()Ll1/w;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lk1/b4;->i(Lcom/google/protobuf/j;Ll1/w;)Lk1/b4;

    move-result-object v6

    :cond_3
    :goto_1
    iget-object v7, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v7, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-static {v5, v6, v3}, Lk1/f0;->i0(Lk1/b4;Lk1/b4;Lo1/q0;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v3, v6}, Lk1/a4;->a(Lk1/b4;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lo1/i0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lo1/i0;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v3}, Lk1/z0;->f()Lk1/d1;

    move-result-object v3

    invoke-interface {v3, v2}, Lk1/d1;->p(Ll1/l;)V

    goto :goto_2

    :cond_6
    invoke-direct {p0, v0}, Lk1/f0;->d0(Ljava/util/Map;)Lk1/f0$c;

    move-result-object p1

    invoke-static {p1}, Lk1/f0$c;->a(Lk1/f0$c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v1}, Lk1/a4;->c()Ll1/w;

    move-result-object v1

    sget-object v2, Ll1/w;->f:Ll1/w;

    invoke-virtual {p2, v2}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p2, v1}, Ll1/w;->d(Ll1/w;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    :goto_3
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p2, v5, v4

    aput-object v1, v5, v3

    const-string v1, "Watch stream reverted to previous snapshot?? (%s < %s)"

    invoke-static {v2, v1, v5}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v1, p2}, Lk1/a4;->e(Ll1/w;)V

    :cond_8
    iget-object p2, p0, Lk1/f0;->f:Lk1/n;

    invoke-static {p1}, Lk1/f0$c;->b(Lk1/f0$c;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lk1/n;->i(Ljava/util/Map;Ljava/util/Set;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic P(Lk1/l0;)Lk1/l0$c;
    .locals 1

    iget-object v0, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Lk1/l0;->f(Landroid/util/SparseArray;)Lk1/l0$c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic Q(Ljava/lang/String;)Lh1/j;
    .locals 1

    iget-object v0, p0, Lk1/f0;->j:Lk1/a;

    invoke-interface {v0, p1}, Lk1/a;->c(Ljava/lang/String;)Lh1/j;

    move-result-object p1

    return-object p1
.end method

.method private synthetic R(Lh1/e;)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lk1/f0;->j:Lk1/a;

    invoke-virtual {p1}, Lh1/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lk1/a;->a(Ljava/lang/String;)Lh1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh1/e;->b()Ll1/w;

    move-result-object v0

    invoke-virtual {p1}, Lh1/e;->b()Ll1/w;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll1/w;->d(Ll1/w;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic S(Ljava/util/List;)V
    .locals 6

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/g0;

    invoke-virtual {v0}, Lk1/g0;->d()I

    move-result v1

    iget-object v2, p0, Lk1/f0;->h:Lk1/e1;

    invoke-virtual {v0}, Lk1/g0;->b()Lc1/e;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lk1/e1;->b(Lc1/e;I)V

    invoke-virtual {v0}, Lk1/g0;->c()Lc1/e;

    move-result-object v2

    invoke-virtual {v2}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/l;

    iget-object v5, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v5}, Lk1/z0;->f()Lk1/d1;

    move-result-object v5

    invoke-interface {v5, v4}, Lk1/d1;->f(Ll1/l;)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lk1/f0;->h:Lk1/e1;

    invoke-virtual {v3, v2, v1}, Lk1/e1;->g(Lc1/e;I)V

    invoke-virtual {v0}, Lk1/g0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/b4;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    const-string v3, "Can\'t set limbo-free snapshot version for unknown target: %s"

    invoke-static {v4, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lk1/b4;->e()Ll1/w;

    move-result-object v2

    invoke-virtual {v0, v2}, Lk1/b4;->h(Ll1/w;)Lk1/b4;

    move-result-object v0

    iget-object v2, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private synthetic T(I)Lc1/c;
    .locals 4

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0, p1}, Lk1/w0;->k(I)Lm1/g;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Attempt to reject nonexistent batch!"

    invoke-static {v2, v3, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v1, v0}, Lk1/w0;->e(Lm1/g;)V

    iget-object v1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v1}, Lk1/w0;->c()V

    iget-object v1, p0, Lk1/f0;->d:Lk1/b;

    invoke-interface {v1, p1}, Lk1/b;->c(I)V

    iget-object p1, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {v0}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v1}, Lk1/n;->n(Ljava/util/Set;)V

    iget-object p1, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {v0}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk1/n;->d(Ljava/lang/Iterable;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic U(I)V
    .locals 5

    iget-object v0, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/b4;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const-string v2, "Tried to release nonexistent target: %s"

    invoke-static {v3, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lk1/f0;->h:Lk1/e1;

    invoke-virtual {v1, p1}, Lk1/e1;->h(I)Lc1/e;

    move-result-object v1

    invoke-virtual {v1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    iget-object v3, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v3}, Lk1/z0;->f()Lk1/d1;

    move-result-object v3

    invoke-interface {v3, v2}, Lk1/d1;->f(Ll1/l;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v1}, Lk1/z0;->f()Lk1/d1;

    move-result-object v1

    invoke-interface {v1, v0}, Lk1/d1;->d(Lk1/b4;)V

    iget-object v1, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object p1, p0, Lk1/f0;->l:Ljava/util/Map;

    invoke-virtual {v0}, Lk1/b4;->f()Li1/c1;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private synthetic V(Lh1/e;)V
    .locals 1

    iget-object v0, p0, Lk1/f0;->j:Lk1/a;

    invoke-interface {v0, p1}, Lk1/a;->b(Lh1/e;)V

    return-void
.end method

.method private synthetic W(Lh1/j;Lk1/b4;ILc1/e;)V
    .locals 2

    invoke-virtual {p1}, Lh1/j;->c()Ll1/w;

    move-result-object v0

    invoke-virtual {p2}, Lk1/b4;->e()Ll1/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/w;->d(Ll1/w;)I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    invoke-virtual {p1}, Lh1/j;->c()Ll1/w;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lk1/b4;->i(Lcom/google/protobuf/j;Ll1/w;)Lk1/b4;

    move-result-object p2

    iget-object v0, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p3, p2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    iget-object v0, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v0, p2}, Lk1/a4;->a(Lk1/b4;)V

    iget-object p2, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {p2, p3}, Lk1/a4;->f(I)V

    iget-object p2, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {p2, p4, p3}, Lk1/a4;->d(Lc1/e;I)V

    :cond_0
    iget-object p2, p0, Lk1/f0;->j:Lk1/a;

    invoke-interface {p2, p1}, Lk1/a;->d(Lh1/j;)V

    return-void
.end method

.method private synthetic X(Lcom/google/protobuf/j;)V
    .locals 1

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0, p1}, Lk1/w0;->i(Lcom/google/protobuf/j;)V

    return-void
.end method

.method private synthetic Y()V
    .locals 1

    iget-object v0, p0, Lk1/f0;->b:Lk1/l;

    invoke-interface {v0}, Lk1/l;->a()V

    return-void
.end method

.method private synthetic Z()V
    .locals 1

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0}, Lk1/w0;->a()V

    return-void
.end method

.method private synthetic a0(Ljava/util/Set;Ljava/util/List;Lx0/o;)Lk1/m;
    .locals 8

    iget-object v0, p0, Lk1/f0;->e:Lk1/f1;

    invoke-interface {v0, p1}, Lk1/f1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    check-cast v3, Ll1/s;

    invoke-virtual {v3}, Ll1/s;->o()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {v1, p1}, Lk1/n;->k(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/f;

    invoke-virtual {v3}, Lm1/f;->g()Ll1/l;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk1/y0;

    invoke-virtual {v4}, Lk1/y0;->a()Ll1/i;

    move-result-object v4

    invoke-virtual {v3, v4}, Lm1/f;->d(Ll1/i;)Ll1/t;

    move-result-object v4

    if-eqz v4, :cond_2

    new-instance v5, Lm1/l;

    invoke-virtual {v3}, Lm1/f;->g()Ll1/l;

    move-result-object v3

    invoke-virtual {v4}, Ll1/t;->j()Lm1/d;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v7}, Lm1/m;->a(Z)Lm1/m;

    move-result-object v7

    invoke-direct {v5, v3, v4, v6, v7}, Lm1/l;-><init>(Ll1/l;Ll1/t;Lm1/d;Lm1/m;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v2, p3, v1, p2}, Lk1/w0;->d(Lx0/o;Ljava/util/List;Ljava/util/List;)Lm1/g;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lm1/g;->a(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p3

    iget-object v0, p0, Lk1/f0;->d:Lk1/b;

    invoke-virtual {p2}, Lm1/g;->e()I

    move-result v1

    invoke-interface {v0, v1, p3}, Lk1/b;->e(ILjava/util/Map;)V

    invoke-virtual {p2}, Lm1/g;->e()I

    move-result p2

    invoke-static {p2, p1}, Lk1/m;->a(ILjava/util/Map;)Lk1/m;

    move-result-object p1

    return-object p1
.end method

.method private static b0(Ljava/lang/String;)Li1/c1;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "__bundle__/docs/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p0

    invoke-static {p0}, Li1/x0;->b(Ll1/u;)Li1/x0;

    move-result-object p0

    invoke-virtual {p0}, Li1/x0;->D()Li1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lk1/f0;)V
    .locals 0

    invoke-direct {p0}, Lk1/f0;->Z()V

    return-void
.end method

.method private d0(Ljava/util/Map;)Lk1/f0$c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;)",
            "Lk1/f0$c;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Lk1/f0;->e:Lk1/f1;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v3, v4}, Lk1/f1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll1/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/s;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/s;

    invoke-virtual {v4}, Ll1/s;->b()Z

    move-result v7

    invoke-virtual {v6}, Ll1/s;->b()Z

    move-result v8

    if-eq v7, v8, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v4}, Ll1/s;->e()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Ll1/s;->j()Ll1/w;

    move-result-object v7

    sget-object v8, Ll1/w;->f:Ll1/w;

    invoke-virtual {v7, v8}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Ll1/s;->getKey()Ll1/l;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Ll1/s;->o()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v7, :cond_3

    invoke-virtual {v4}, Ll1/s;->j()Ll1/w;

    move-result-object v7

    invoke-virtual {v6}, Ll1/s;->j()Ll1/w;

    move-result-object v10

    invoke-virtual {v7, v10}, Ll1/w;->d(Ll1/w;)I

    move-result v7

    if-gtz v7, :cond_3

    invoke-virtual {v4}, Ll1/s;->j()Ll1/w;

    move-result-object v7

    invoke-virtual {v6}, Ll1/s;->j()Ll1/w;

    move-result-object v10

    invoke-virtual {v7, v10}, Ll1/w;->d(Ll1/w;)I

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Ll1/s;->c()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v8

    invoke-virtual {v6}, Ll1/s;->j()Ll1/w;

    move-result-object v5

    aput-object v5, v7, v9

    const/4 v5, 0x2

    invoke-virtual {v4}, Ll1/s;->j()Ll1/w;

    move-result-object v4

    aput-object v4, v7, v5

    const-string v4, "LocalStore"

    const-string v5, "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s"

    invoke-static {v4, v5, v7}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    :goto_2
    sget-object v6, Ll1/w;->f:Ll1/w;

    invoke-virtual {v4}, Ll1/s;->d()Ll1/w;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v9

    new-array v7, v8, [Ljava/lang/Object;

    const-string v8, "Cannot add a document when the remote version is zero"

    invoke-static {v6, v8, v7}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v6, p0, Lk1/f0;->e:Lk1/f1;

    invoke-virtual {v4}, Ll1/s;->d()Ll1/w;

    move-result-object v7

    invoke-interface {v6, v4, v7}, Lk1/f1;->d(Ll1/s;Ll1/w;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lk1/f0;->e:Lk1/f1;

    invoke-interface {p1, v1}, Lk1/f1;->removeAll(Ljava/util/Collection;)V

    new-instance p1, Lk1/f0$c;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v2, v1}, Lk1/f0$c;-><init>(Ljava/util/Map;Ljava/util/Set;Lk1/f0$a;)V

    return-object p1
.end method

.method public static synthetic e(Lk1/f0;Lh1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->V(Lh1/e;)V

    return-void
.end method

.method public static synthetic f(Lk1/f0;)V
    .locals 0

    invoke-direct {p0}, Lk1/f0;->Y()V

    return-void
.end method

.method public static synthetic g(Lk1/f0;Lh1/j;Lk1/b4;ILc1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk1/f0;->W(Lh1/j;Lk1/b4;ILc1/e;)V

    return-void
.end method

.method public static synthetic h(Lk1/f0;I)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->U(I)V

    return-void
.end method

.method public static synthetic i(Lk1/f0;Lk1/l0;)Lk1/l0$c;
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->P(Lk1/l0;)Lk1/l0$c;

    move-result-object p0

    return-object p0
.end method

.method private static i0(Lk1/b4;Lk1/b4;Lo1/q0;)Z
    .locals 4

    invoke-virtual {p0}, Lk1/b4;->c()Lcom/google/protobuf/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/j;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lk1/b4;->e()Ll1/w;

    move-result-object p1

    invoke-virtual {p1}, Ll1/w;->g()Lx0/o;

    move-result-object p1

    invoke-virtual {p1}, Lx0/o;->i()J

    move-result-wide v2

    invoke-virtual {p0}, Lk1/b4;->e()Ll1/w;

    move-result-object p0

    invoke-virtual {p0}, Ll1/w;->g()Lx0/o;

    move-result-object p0

    invoke-virtual {p0}, Lx0/o;->i()J

    move-result-wide p0

    sub-long/2addr v2, p0

    sget-wide p0, Lk1/f0;->n:J

    cmp-long v0, v2, p0

    if-ltz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p2}, Lo1/q0;->b()Lc1/e;

    move-result-object p0

    invoke-virtual {p0}, Lc1/e;->size()I

    move-result p0

    invoke-virtual {p2}, Lo1/q0;->c()Lc1/e;

    move-result-object p1

    invoke-virtual {p1}, Lc1/e;->size()I

    move-result p1

    add-int/2addr p0, p1

    invoke-virtual {p2}, Lo1/q0;->d()Lc1/e;

    move-result-object p1

    invoke-virtual {p1}, Lc1/e;->size()I

    move-result p1

    add-int/2addr p0, p1

    if-lez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static synthetic j(Lk1/f0;Lcom/google/protobuf/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->X(Lcom/google/protobuf/j;)V

    return-void
.end method

.method public static synthetic k(Lk1/f0;Lc1/c;Lk1/b4;)Lc1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/f0;->N(Lc1/c;Lk1/b4;)Lc1/c;

    move-result-object p0

    return-object p0
.end method

.method private k0()V
    .locals 3

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/w;

    invoke-direct {v1, p0}, Lk1/w;-><init>(Lk1/f0;)V

    const-string v2, "Start IndexManager"

    invoke-virtual {v0, v2, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic l(Lk1/f0;Lk1/f0$b;Li1/c1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/f0;->M(Lk1/f0$b;Li1/c1;)V

    return-void
.end method

.method private l0()V
    .locals 3

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/p;

    invoke-direct {v1, p0}, Lk1/p;-><init>(Lk1/f0;)V

    const-string v2, "Start MutationQueue"

    invoke-virtual {v0, v2, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic m(Lk1/f0;Lh1/e;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->R(Lh1/e;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lk1/f0;Ljava/util/Set;Ljava/util/List;Lx0/o;)Lk1/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/f0;->a0(Ljava/util/Set;Ljava/util/List;Lx0/o;)Lk1/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lk1/f0;Ljava/lang/String;)Lh1/j;
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->Q(Ljava/lang/String;)Lh1/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lk1/f0;Lm1/h;)Lc1/c;
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->L(Lm1/h;)Lc1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lk1/f0;Lo1/i0;Ll1/w;)Lc1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/f0;->O(Lo1/i0;Ll1/w;)Lc1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lk1/f0;I)Lc1/c;
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->T(I)Lc1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lk1/f0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/f0;->S(Ljava/util/List;)V

    return-void
.end method

.method private w(Lm1/h;)V
    .locals 7

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v0

    invoke-virtual {v0}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    iget-object v3, p0, Lk1/f0;->e:Lk1/f1;

    invoke-interface {v3, v2}, Lk1/f1;->c(Ll1/l;)Ll1/s;

    move-result-object v3

    invoke-virtual {p1}, Lm1/h;->d()Lc1/c;

    move-result-object v4

    invoke-virtual {v4, v2}, Lc1/c;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/w;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v6, "docVersions should contain every doc in the write."

    invoke-static {v5, v6, v4}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll1/s;->j()Ll1/w;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll1/w;->d(Ll1/w;)I

    move-result v2

    if-gez v2, :cond_0

    invoke-virtual {v0, v3, p1}, Lm1/g;->c(Ll1/s;Lm1/h;)V

    invoke-virtual {v3}, Ll1/s;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk1/f0;->e:Lk1/f1;

    invoke-virtual {p1}, Lm1/h;->c()Ll1/w;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lk1/f1;->d(Ll1/s;Ll1/w;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {p1, v0}, Lk1/w0;->e(Lm1/g;)V

    return-void
.end method


# virtual methods
.method public A()Lk1/l;
    .locals 1

    iget-object v0, p0, Lk1/f0;->b:Lk1/l;

    return-object v0
.end method

.method public C()Ll1/w;
    .locals 1

    iget-object v0, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v0}, Lk1/a4;->c()Ll1/w;

    move-result-object v0

    return-object v0
.end method

.method public D()Lcom/google/protobuf/j;
    .locals 1

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0}, Lk1/w0;->b()Lcom/google/protobuf/j;

    move-result-object v0

    return-object v0
.end method

.method public E()Lk1/n;
    .locals 1

    iget-object v0, p0, Lk1/f0;->f:Lk1/n;

    return-object v0
.end method

.method public F(Ljava/lang/String;)Lh1/j;
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/r;

    invoke-direct {v1, p0, p1}, Lk1/r;-><init>(Lk1/f0;Ljava/lang/String;)V

    const-string p1, "Get named query"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh1/j;

    return-object p1
.end method

.method public G(I)Lm1/g;
    .locals 1

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0, p1}, Lk1/w0;->f(I)Lm1/g;

    move-result-object p1

    return-object p1
.end method

.method H(Li1/c1;)Lk1/b4;
    .locals 1

    iget-object v0, p0, Lk1/f0;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/b4;

    return-object p1

    :cond_0
    iget-object v0, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v0, p1}, Lk1/a4;->h(Li1/c1;)Lk1/b4;

    move-result-object p1

    return-object p1
.end method

.method public I(Lg1/j;)Lc1/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/j;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0}, Lk1/w0;->j()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1}, Lk1/f0;->K(Lg1/j;)V

    invoke-direct {p0}, Lk1/f0;->k0()V

    invoke-direct {p0}, Lk1/f0;->l0()V

    iget-object p1, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {p1}, Lk1/w0;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/util/List;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/g;

    invoke-virtual {v2}, Lm1/g;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/f;

    invoke-virtual {v3}, Lm1/f;->g()Ll1/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {p1, v1}, Lk1/n;->d(Ljava/lang/Iterable;)Lc1/c;

    move-result-object p1

    return-object p1
.end method

.method public J(Lh1/e;)Z
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/q;

    invoke-direct {v1, p0, p1}, Lk1/q;-><init>(Lk1/f0;Lh1/e;)V

    const-string p1, "Has newer bundle"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public a(Lc1/c;Ljava/lang/String;)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/s;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lk1/f0;->b0(Ljava/lang/String;)Li1/c1;

    move-result-object p2

    invoke-virtual {p0, p2}, Lk1/f0;->u(Li1/c1;)Lk1/b4;

    move-result-object p2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/e0;

    invoke-direct {v1, p0, p1, p2}, Lk1/e0;-><init>(Lk1/f0;Lc1/c;Lk1/b4;)V

    const-string p1, "Apply bundle documents"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/c;

    return-object p1
.end method

.method public b(Lh1/e;)V
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/z;

    invoke-direct {v1, p0, p1}, Lk1/z;-><init>(Lk1/f0;Lh1/e;)V

    const-string p1, "Save bundle"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lh1/j;Lc1/e;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/j;",
            "Lc1/e<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lh1/j;->a()Lh1/i;

    move-result-object v0

    invoke-virtual {v0}, Lh1/i;->b()Li1/c1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk1/f0;->u(Li1/c1;)Lk1/b4;

    move-result-object v4

    invoke-virtual {v4}, Lk1/b4;->g()I

    move-result v5

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v7, Lk1/a0;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lk1/a0;-><init>(Lk1/f0;Lh1/j;Lk1/b4;ILc1/e;)V

    const-string p1, "Saved named query"

    invoke-virtual {v0, p1, v7}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk1/g0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/b0;

    invoke-direct {v1, p0, p1}, Lk1/b0;-><init>(Lk1/f0;Ljava/util/List;)V

    const-string p1, "notifyLocalViewChanges"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public e0(Ll1/l;)Ll1/i;
    .locals 1

    iget-object v0, p0, Lk1/f0;->f:Lk1/n;

    invoke-virtual {v0, p1}, Lk1/n;->c(Ll1/l;)Ll1/i;

    move-result-object p1

    return-object p1
.end method

.method public f0(I)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/d0;

    invoke-direct {v1, p0, p1}, Lk1/d0;-><init>(Lk1/f0;I)V

    const-string p1, "Reject batch"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/c;

    return-object p1
.end method

.method public g0(I)V
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/x;

    invoke-direct {v1, p0, p1}, Lk1/x;-><init>(Lk1/f0;I)V

    const-string p1, "Release target"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public h0(Lcom/google/protobuf/j;)V
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/y;

    invoke-direct {v1, p0, p1}, Lk1/y;-><init>(Lk1/f0;Lcom/google/protobuf/j;)V

    const-string p1, "Set stream token"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public j0()V
    .locals 1

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    invoke-virtual {v0}, Lk1/z0;->e()Lk1/x0;

    move-result-object v0

    invoke-interface {v0}, Lk1/x0;->run()V

    invoke-direct {p0}, Lk1/f0;->k0()V

    invoke-direct {p0}, Lk1/f0;->l0()V

    return-void
.end method

.method public m0(Ljava/util/List;)Lk1/m;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;)",
            "Lk1/m;"
        }
    .end annotation

    invoke-static {}, Lx0/o;->n()Lx0/o;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/f;

    invoke-virtual {v3}, Lm1/f;->g()Ll1/l;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v3, Lk1/s;

    invoke-direct {v3, p0, v1, p1, v0}, Lk1/s;-><init>(Lk1/f0;Ljava/util/Set;Ljava/util/List;Lx0/o;)V

    const-string p1, "Locally write mutations"

    invoke-virtual {v2, p1, v3}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/m;

    return-object p1
.end method

.method public t(Lm1/h;)Lc1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/h;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/u;

    invoke-direct {v1, p0, p1}, Lk1/u;-><init>(Lk1/f0;Lm1/h;)V

    const-string p1, "Acknowledge batch"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/c;

    return-object p1
.end method

.method public u(Li1/c1;)Lk1/b4;
    .locals 4

    iget-object v0, p0, Lk1/f0;->i:Lk1/a4;

    invoke-interface {v0, p1}, Lk1/a4;->h(Li1/c1;)Lk1/b4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk1/b4;->g()I

    move-result v1

    goto :goto_0

    :cond_0
    new-instance v0, Lk1/f0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk1/f0$b;-><init>(Lk1/f0$a;)V

    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v2, Lk1/c0;

    invoke-direct {v2, p0, v0, p1}, Lk1/c0;-><init>(Lk1/f0;Lk1/f0$b;Li1/c1;)V

    const-string v3, "Allocate target"

    invoke-virtual {v1, v3, v2}, Lk1/z0;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    iget v1, v0, Lk1/f0$b;->b:I

    iget-object v0, v0, Lk1/f0$b;->a:Lk1/b4;

    :goto_0
    iget-object v2, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lk1/f0;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v2, p0, Lk1/f0;->l:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public v(Lo1/i0;)Lc1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/i0;",
            ")",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lo1/i0;->c()Ll1/w;

    move-result-object v0

    iget-object v1, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v2, Lk1/v;

    invoke-direct {v2, p0, p1, v0}, Lk1/v;-><init>(Lk1/f0;Lo1/i0;Ll1/w;)V

    const-string p1, "Apply remote event"

    invoke-virtual {v1, p1, v2}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc1/c;

    return-object p1
.end method

.method public x(Lk1/l0;)Lk1/l0$c;
    .locals 2

    iget-object v0, p0, Lk1/f0;->a:Lk1/z0;

    new-instance v1, Lk1/t;

    invoke-direct {v1, p0, p1}, Lk1/t;-><init>(Lk1/f0;Lk1/l0;)V

    const-string p1, "Collect garbage"

    invoke-virtual {v0, p1, v1}, Lk1/z0;->j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/l0$c;

    return-object p1
.end method

.method public y(Li1/x0;Z)Lk1/c1;
    .locals 4

    invoke-virtual {p1}, Li1/x0;->D()Li1/c1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk1/f0;->H(Li1/c1;)Lk1/b4;

    move-result-object v0

    sget-object v1, Ll1/w;->f:Ll1/w;

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk1/b4;->a()Ll1/w;

    move-result-object v2

    iget-object v3, p0, Lk1/f0;->i:Lk1/a4;

    invoke-virtual {v0}, Lk1/b4;->g()I

    move-result v0

    invoke-interface {v3, v0}, Lk1/a4;->b(I)Lc1/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    move-object v2, v1

    :goto_0
    iget-object v3, p0, Lk1/f0;->g:Lk1/a1;

    if-eqz p2, :cond_1

    move-object v1, v2

    :cond_1
    invoke-virtual {v3, p1, v1, v0}, Lk1/a1;->d(Li1/x0;Ll1/w;Lc1/e;)Lc1/c;

    move-result-object p1

    new-instance p2, Lk1/c1;

    invoke-direct {p2, p1, v0}, Lk1/c1;-><init>(Lc1/c;Lc1/e;)V

    return-object p2
.end method

.method public z()I
    .locals 1

    iget-object v0, p0, Lk1/f0;->c:Lk1/w0;

    invoke-interface {v0}, Lk1/w0;->g()I

    move-result v0

    return v0
.end method
