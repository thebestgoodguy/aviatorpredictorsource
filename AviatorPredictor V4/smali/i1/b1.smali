.class public Li1/b1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/n0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/b1$c;,
        Li1/b1$b;
    }
.end annotation


# static fields
.field private static final o:Ljava/lang/String; = "b1"


# instance fields
.field private final a:Lk1/f0;

.field private final b:Lo1/n0;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li1/x0;",
            "Li1/z0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Li1/x0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:I

.field private final f:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Li1/b1$b;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lk1/e1;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg1/j;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lo0/i<",
            "Ljava/lang/Void;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lo0/i<",
            "Ljava/lang/Void;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final l:Li1/d1;

.field private m:Lg1/j;

.field private n:Li1/b1$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk1/f0;Lo1/n0;Lg1/j;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/b1;->a:Lk1/f0;

    iput-object p2, p0, Li1/b1;->b:Lo1/n0;

    iput p4, p0, Li1/b1;->e:I

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->c:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->g:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->h:Ljava/util/Map;

    new-instance p1, Lk1/e1;

    invoke-direct {p1}, Lk1/e1;-><init>()V

    iput-object p1, p0, Li1/b1;->i:Lk1/e1;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->j:Ljava/util/Map;

    invoke-static {}, Li1/d1;->a()Li1/d1;

    move-result-object p1

    iput-object p1, p0, Li1/b1;->l:Li1/d1;

    iput-object p3, p0, Li1/b1;->m:Lg1/j;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li1/b1;->k:Ljava/util/Map;

    return-void
.end method

.method private A(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li1/q0;",
            ">;I)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/q0;

    sget-object v1, Li1/b1$a;->a:[I

    invoke-virtual {v0}, Li1/q0;->b()Li1/q0$a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v1, v3, :cond_1

    sget-object v1, Li1/b1;->o:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Li1/q0;->a()Ll1/l;

    move-result-object v3

    aput-object v3, v2, v4

    const-string v3, "Document no longer in limbo: %s"

    invoke-static {v1, v3, v2}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Li1/q0;->a()Ll1/l;

    move-result-object v0

    iget-object v1, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {v1, v0, p2}, Lk1/e1;->f(Ll1/l;I)V

    iget-object v1, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {v1, v0}, Lk1/e1;->c(Ll1/l;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Li1/b1;->u(Ll1/l;)V

    goto :goto_0

    :cond_1
    new-array p1, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Li1/q0;->b()Li1/q0$a;

    move-result-object p2

    aput-object p2, p1, v4

    const-string p2, "Unknown limbo change type: %s"

    invoke-static {p2, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_2
    iget-object v1, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {v0}, Li1/q0;->a()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lk1/e1;->a(Ll1/l;I)V

    invoke-direct {p0, v0}, Li1/b1;->y(Li1/q0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private g(ILo0/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lo0/i<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/b1;->j:Ljava/util/Map;

    iget-object v1, p0, Li1/b1;->m:Lg1/j;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Li1/b1;->j:Ljava/util/Map;

    iget-object v2, p0, Li1/b1;->m:Lg1/j;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Li1/b1;->n:Li1/b1$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    const-string p1, "Trying to call %s before setting callback"

    invoke-static {v0, p1, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private i(Lc1/c;Lo1/i0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;",
            "Lo1/i0;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/z0;

    invoke-virtual {v3}, Li1/z0;->c()Li1/s1;

    move-result-object v4

    invoke-virtual {v4, p1}, Li1/s1;->g(Lc1/c;)Li1/s1$b;

    move-result-object v5

    invoke-virtual {v5}, Li1/s1$b;->b()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v3}, Li1/z0;->a()Li1/x0;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Lk1/f0;->y(Li1/x0;Z)Lk1/c1;

    move-result-object v6

    invoke-virtual {v6}, Lk1/c1;->a()Lc1/c;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Li1/s1;->h(Lc1/c;Li1/s1$b;)Li1/s1$b;

    move-result-object v5

    :cond_1
    if-nez p2, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lo1/i0;->d()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3}, Li1/z0;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo1/q0;

    :goto_1
    invoke-virtual {v3}, Li1/z0;->c()Li1/s1;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Li1/s1;->c(Li1/s1$b;Lo1/q0;)Li1/t1;

    move-result-object v4

    invoke-virtual {v4}, Li1/t1;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, Li1/z0;->b()I

    move-result v6

    invoke-direct {p0, v5, v6}, Li1/b1;->A(Ljava/util/List;I)V

    invoke-virtual {v4}, Li1/t1;->b()Li1/u1;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Li1/t1;->b()Li1/u1;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Li1/z0;->b()I

    move-result v3

    invoke-virtual {v4}, Li1/t1;->b()Li1/u1;

    move-result-object v4

    invoke-static {v3, v4}, Lk1/g0;->a(ILi1/u1;)Lk1/g0;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object p1, p0, Li1/b1;->n:Li1/b1$c;

    invoke-interface {p1, v0}, Li1/b1$c;->c(Ljava/util/List;)V

    iget-object p1, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {p1, v1}, Lk1/f0;->c0(Ljava/util/List;)V

    return-void
.end method

.method private j(Lb3/f1;)Z
    .locals 3

    invoke-virtual {p1}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object v0

    invoke-virtual {p1}, Lb3/f1;->n()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb3/f1;->n()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    sget-object v1, Lb3/f1$b;->p:Lb3/f1$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    const-string v1, "requires an index"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    sget-object p1, Lb3/f1$b;->n:Lb3/f1$b;

    if-ne v0, p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private k()V
    .locals 6

    iget-object v0, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/i;

    new-instance v3, Lcom/google/firebase/firestore/u;

    sget-object v4, Lcom/google/firebase/firestore/u$a;->g:Lcom/google/firebase/firestore/u$a;

    const-string v5, "\'waitForPendingWrites\' task is cancelled due to User change."

    invoke-direct {v3, v5, v4}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    invoke-virtual {v2, v3}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private m(Li1/x0;I)Li1/u1;
    .locals 5

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lk1/f0;->y(Li1/x0;Z)Lk1/c1;

    move-result-object v0

    sget-object v2, Li1/u1$a;->e:Li1/u1$a;

    iget-object v2, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/x0;

    iget-object v4, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/z0;

    invoke-virtual {v2}, Li1/z0;->c()Li1/s1;

    move-result-object v2

    invoke-virtual {v2}, Li1/s1;->i()Li1/u1$a;

    move-result-object v2

    sget-object v4, Li1/u1$a;->g:Li1/u1$a;

    if-ne v2, v4, :cond_0

    const/4 v3, 0x1

    :cond_0
    invoke-static {v3}, Lo1/q0;->a(Z)Lo1/q0;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Li1/s1;

    invoke-virtual {v0}, Lk1/c1;->b()Lc1/e;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Li1/s1;-><init>(Li1/x0;Lc1/e;)V

    invoke-virtual {v0}, Lk1/c1;->a()Lc1/c;

    move-result-object v0

    invoke-virtual {v3, v0}, Li1/s1;->g(Lc1/c;)Li1/s1$b;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Li1/s1;->c(Li1/s1$b;Lo1/q0;)Li1/t1;

    move-result-object v0

    invoke-virtual {v0}, Li1/t1;->a()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Li1/b1;->A(Ljava/util/List;I)V

    new-instance v2, Li1/z0;

    invoke-direct {v2, p1, p2, v3}, Li1/z0;-><init>(Li1/x0;ILi1/s1;)V

    iget-object v3, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Li1/t1;->b()Li1/u1;

    move-result-object p1

    return-object p1
.end method

.method private varargs p(Lb3/f1;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0, p1}, Li1/b1;->j(Lb3/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const/4 p2, 0x1

    aput-object p1, p3, p2

    const-string p1, "Firestore"

    const-string p2, "%s: %s"

    invoke-static {p1, p2, p3}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private q(ILb3/f1;)V
    .locals 2

    iget-object v0, p0, Li1/b1;->j:Ljava/util/Map;

    iget-object v1, p0, Li1/b1;->m:Lg1/j;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/i;

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    invoke-static {p2}, Lp1/g0;->r(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p2

    invoke-virtual {v1, p2}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Lo0/i;->c(Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private r()V
    .locals 9

    :goto_0
    iget-object v0, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Li1/b1;->e:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v0, p0, Li1/b1;->l:Li1/d1;

    invoke-virtual {v0}, Li1/d1;->c()I

    move-result v4

    iget-object v0, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Li1/b1$b;

    invoke-direct {v3, v1}, Li1/b1$b;-><init>(Ll1/l;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li1/b1;->b:Lo1/n0;

    new-instance v8, Lk1/b4;

    invoke-virtual {v1}, Ll1/l;->t()Ll1/u;

    move-result-object v1

    invoke-static {v1}, Li1/x0;->b(Ll1/u;)Li1/x0;

    move-result-object v1

    invoke-virtual {v1}, Li1/x0;->D()Li1/c1;

    move-result-object v3

    const-wide/16 v5, -0x1

    sget-object v7, Lk1/b1;->g:Lk1/b1;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lk1/b4;-><init>(Li1/c1;IJLk1/b1;)V

    invoke-virtual {v0, v8}, Lo1/n0;->F(Lk1/b4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private t(ILb3/f1;)V
    .locals 4

    iget-object v0, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/x0;

    iget-object v2, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lb3/f1;->o()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Li1/b1;->n:Li1/b1$c;

    invoke-interface {v2, v1, p2}, Li1/b1$c;->b(Li1/x0;Lb3/f1;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "Listen for %s failed"

    invoke-direct {p0, p2, v1, v2}, Li1/b1;->p(Lb3/f1;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {p2, p1}, Lk1/e1;->d(I)Lc1/e;

    move-result-object p2

    iget-object v0, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {v0, p1}, Lk1/e1;->h(I)Lc1/e;

    invoke-virtual {p2}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll1/l;

    iget-object v0, p0, Li1/b1;->i:Lk1/e1;

    invoke-virtual {v0, p2}, Lk1/e1;->c(Ll1/l;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p2}, Li1/b1;->u(Ll1/l;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method private u(Ll1/l;)V
    .locals 3

    iget-object v0, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lo1/n0;->R(I)V

    iget-object v1, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Li1/b1;->r()V

    :cond_0
    return-void
.end method

.method private v(I)V
    .locals 3

    iget-object v0, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/i;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private y(Li1/q0;)V
    .locals 3

    invoke-virtual {p1}, Li1/q0;->a()Ll1/l;

    move-result-object p1

    iget-object v0, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Li1/b1;->o:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "New document in limbo: %s"

    invoke-static {v0, v2, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/b1;->f:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Li1/b1;->r()V

    :cond_0
    return-void
.end method


# virtual methods
.method public B(Ljava/util/List;Lo0/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;",
            "Lo0/i<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "writeMutations"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->m0(Ljava/util/List;)Lk1/m;

    move-result-object p1

    invoke-virtual {p1}, Lk1/m;->b()I

    move-result v0

    invoke-direct {p0, v0, p2}, Li1/b1;->g(ILo0/i;)V

    invoke-virtual {p1}, Lk1/m;->c()Lc1/c;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    iget-object p1, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {p1}, Lo1/n0;->t()V

    return-void
.end method

.method public a(Li1/v0;)V
    .locals 6

    const-string v0, "handleOnlineStateChange"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Li1/b1;->c:Ljava/util/Map;

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

    move-result-object v2

    check-cast v2, Li1/z0;

    invoke-virtual {v2}, Li1/z0;->c()Li1/s1;

    move-result-object v2

    invoke-virtual {v2, p1}, Li1/s1;->d(Li1/v0;)Li1/t1;

    move-result-object v2

    invoke-virtual {v2}, Li1/t1;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "OnlineState should not affect limbo documents."

    invoke-static {v3, v5, v4}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Li1/t1;->b()Li1/u1;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Li1/t1;->b()Li1/u1;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Li1/b1;->n:Li1/b1$c;

    invoke-interface {v1, v0}, Li1/b1$c;->c(Ljava/util/List;)V

    iget-object v0, p0, Li1/b1;->n:Li1/b1$c;

    invoke-interface {v0, p1}, Li1/b1$c;->a(Li1/v0;)V

    return-void
.end method

.method public b(I)Lc1/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/b1$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Li1/b1$b;->a(Li1/b1$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object p1

    invoke-static {v0}, Li1/b1$b;->c(Li1/b1$b;)Ll1/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v0

    iget-object v1, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/x0;

    iget-object v2, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/z0;

    invoke-virtual {v1}, Li1/z0;->c()Li1/s1;

    move-result-object v1

    invoke-virtual {v1}, Li1/s1;->j()Lc1/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc1/e;->t(Lc1/e;)Lc1/e;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public c(ILb3/f1;)V
    .locals 4

    const-string v0, "handleRejectedWrite"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->f0(I)Lc1/c;

    move-result-object v0

    invoke-virtual {v0}, Lc1/c;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0}, Lc1/c;->s()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-virtual {v3}, Ll1/l;->t()Ll1/u;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Write failed at %s"

    invoke-direct {p0, p2, v2, v1}, Li1/b1;->p(Lb3/f1;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Li1/b1;->q(ILb3/f1;)V

    invoke-direct {p0, p1}, Li1/b1;->v(I)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    return-void
.end method

.method public d(Lo1/i0;)V
    .locals 8

    const-string v0, "handleRemoteEvent"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    invoke-virtual {p1}, Lo1/i0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo1/q0;

    iget-object v3, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/b1$b;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lo1/q0;->b()Lc1/e;

    move-result-object v3

    invoke-virtual {v3}, Lc1/e;->size()I

    move-result v3

    invoke-virtual {v1}, Lo1/q0;->c()Lc1/e;

    move-result-object v4

    invoke-virtual {v4}, Lc1/e;->size()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v1}, Lo1/q0;->d()Lc1/e;

    move-result-object v4

    invoke-virtual {v4}, Lc1/e;->size()I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-gt v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    new-array v6, v5, [Ljava/lang/Object;

    const-string v7, "Limbo resolution for single document contains multiple changes."

    invoke-static {v3, v7, v6}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo1/q0;->b()Lc1/e;

    move-result-object v3

    invoke-virtual {v3}, Lc1/e;->size()I

    move-result v3

    if-lez v3, :cond_2

    invoke-static {v2, v4}, Li1/b1$b;->b(Li1/b1$b;Z)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lo1/q0;->c()Lc1/e;

    move-result-object v3

    invoke-virtual {v3}, Lc1/e;->size()I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {v2}, Li1/b1$b;->a(Li1/b1$b;)Z

    move-result v1

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "Received change for limbo target document without add."

    invoke-static {v1, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lo1/q0;->d()Lc1/e;

    move-result-object v1

    invoke-virtual {v1}, Lc1/e;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {v2}, Li1/b1$b;->a(Li1/b1$b;)Z

    move-result v1

    new-array v3, v5, [Ljava/lang/Object;

    const-string v4, "Received remove for limbo target document without add."

    invoke-static {v1, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v2, v5}, Li1/b1$b;->b(Li1/b1$b;Z)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->v(Lo1/i0;)Lc1/c;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    return-void
.end method

.method public e(ILb3/f1;)V
    .locals 7

    const-string v0, "handleRejectedListen"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    iget-object v0, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/b1$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Li1/b1$b;->c(Li1/b1$b;)Ll1/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p2, p0, Li1/b1;->g:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Li1/b1;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Li1/b1;->r()V

    sget-object v2, Ll1/w;->f:Ll1/w;

    invoke-static {v0, v2}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    new-instance p1, Lo1/i0;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v4

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lo1/i0;-><init>(Ll1/w;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/Set;)V

    invoke-virtual {p0, p1}, Li1/b1;->d(Lo1/i0;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->g0(I)V

    invoke-direct {p0, p1, p2}, Li1/b1;->t(ILb3/f1;)V

    :goto_1
    return-void
.end method

.method public f(Lm1/h;)V
    .locals 2

    const-string v0, "handleSuccessfulWrite"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v0

    invoke-virtual {v0}, Lm1/g;->e()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Li1/b1;->q(ILb3/f1;)V

    invoke-virtual {p1}, Lm1/h;->b()Lm1/g;

    move-result-object v0

    invoke-virtual {v0}, Lm1/g;->e()I

    move-result v0

    invoke-direct {p0, v0}, Li1/b1;->v(I)V

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->t(Lm1/h;)Lc1/c;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    return-void
.end method

.method public l(Lg1/j;)V
    .locals 1

    iget-object v0, p0, Li1/b1;->m:Lg1/j;

    invoke-virtual {v0, p1}, Lg1/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-object p1, p0, Li1/b1;->m:Lg1/j;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Li1/b1;->k()V

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0, p1}, Lk1/f0;->I(Lg1/j;)Lc1/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    :cond_0
    iget-object p1, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {p1}, Lo1/n0;->u()V

    return-void
.end method

.method public n(Li1/x0;)I
    .locals 3

    const-string v0, "listen"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    iget-object v0, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "We already listen to query: %s"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {p1}, Li1/x0;->D()Li1/c1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk1/f0;->u(Li1/c1;)Lk1/b4;

    move-result-object v0

    iget-object v1, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {v1, v0}, Lo1/n0;->F(Lk1/b4;)V

    invoke-virtual {v0}, Lk1/b4;->g()I

    move-result v1

    invoke-direct {p0, p1, v1}, Li1/b1;->m(Li1/x0;I)Li1/u1;

    move-result-object p1

    iget-object v1, p0, Li1/b1;->n:Li1/b1$c;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Li1/b1$c;->c(Ljava/util/List;)V

    invoke-virtual {v0}, Lk1/b4;->g()I

    move-result p1

    return p1
.end method

.method public o(Lh1/f;Lcom/google/firebase/firestore/c0;)V
    .locals 11

    const-string v0, "Exception while closing bundle"

    const-string v1, "SyncEngine"

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {p1}, Lh1/f;->d()Lh1/e;

    move-result-object v4

    iget-object v5, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v5, v4}, Lk1/f0;->J(Lh1/e;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lcom/google/firebase/firestore/d0;->b(Lh1/e;)Lcom/google/firebase/firestore/d0;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/google/firebase/firestore/c0;->t(Lcom/google/firebase/firestore/d0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1}, Lh1/f;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-array p2, v3, [Ljava/lang/Object;

    aput-object p1, p2, v2

    invoke-static {v1, v0, p2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    :try_start_2
    invoke-static {v4}, Lcom/google/firebase/firestore/d0;->a(Lh1/e;)Lcom/google/firebase/firestore/d0;

    move-result-object v5

    invoke-virtual {p2, v5}, Lcom/google/firebase/firestore/c0;->u(Lcom/google/firebase/firestore/d0;)V

    new-instance v5, Lh1/d;

    iget-object v6, p0, Li1/b1;->a:Lk1/f0;

    invoke-direct {v5, v6, v4}, Lh1/d;-><init>(Lh1/a;Lh1/e;)V

    const-wide/16 v6, 0x0

    :goto_1
    invoke-virtual {p1}, Lh1/f;->f()Lh1/c;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {p1}, Lh1/f;->e()J

    move-result-wide v9

    sub-long v6, v9, v6

    invoke-virtual {v5, v8, v6, v7}, Lh1/d;->a(Lh1/c;J)Lcom/google/firebase/firestore/d0;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {p2, v6}, Lcom/google/firebase/firestore/c0;->u(Lcom/google/firebase/firestore/d0;)V

    :cond_1
    move-wide v6, v9

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lh1/d;->b()Lc1/c;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {p0, v5, v6}, Li1/b1;->i(Lc1/c;Lo1/i0;)V

    iget-object v5, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v5, v4}, Lk1/f0;->b(Lh1/e;)V

    invoke-static {v4}, Lcom/google/firebase/firestore/d0;->b(Lh1/e;)Lcom/google/firebase/firestore/d0;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/google/firebase/firestore/c0;->t(Lcom/google/firebase/firestore/d0;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1}, Lh1/f;->b()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    new-array p2, v3, [Ljava/lang/Object;

    aput-object p1, p2, v2

    invoke-static {v1, v0, p2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :catch_2
    move-exception v4

    :try_start_4
    const-string v5, "Firestore"

    const-string v6, "Loading bundle failed : %s"

    new-array v7, v3, [Ljava/lang/Object;

    aput-object v4, v7, v2

    invoke-static {v5, v6, v7}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v5, Lcom/google/firebase/firestore/u;

    const-string v6, "Bundle failed to load"

    sget-object v7, Lcom/google/firebase/firestore/u$a;->i:Lcom/google/firebase/firestore/u$a;

    invoke-direct {v5, v6, v7, v4}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;Ljava/lang/Throwable;)V

    invoke-virtual {p2, v5}, Lcom/google/firebase/firestore/c0;->s(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {p1}, Lh1/f;->b()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_2

    :catch_3
    move-exception p1

    new-array p2, v3, [Ljava/lang/Object;

    aput-object p1, p2, v2

    invoke-static {v1, v0, p2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-void

    :goto_3
    :try_start_6
    invoke-virtual {p1}, Lh1/f;->b()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    invoke-static {v1, v0, v3}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_4
    throw p2
.end method

.method public s(Lo0/i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/i<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Li1/b1;->o:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The network is disabled. The task returned by \'awaitPendingWrites()\' will not complete until the network is enabled."

    invoke-static {v0, v2, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {v0}, Lk1/f0;->z()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v1, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Li1/b1;->k:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public w(Li1/b1$c;)V
    .locals 0

    iput-object p1, p0, Li1/b1;->n:Li1/b1$c;

    return-void
.end method

.method x(Li1/x0;)V
    .locals 4

    const-string v0, "stopListening"

    invoke-direct {p0, v0}, Li1/b1;->h(Ljava/lang/String;)V

    iget-object v0, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/z0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Trying to stop listening to a query not found"

    invoke-static {v2, v3, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Li1/b1;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Li1/z0;->b()I

    move-result v0

    iget-object v1, p0, Li1/b1;->d:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Li1/b1;->a:Lk1/f0;

    invoke-virtual {p1, v0}, Lk1/f0;->g0(I)V

    iget-object p1, p0, Li1/b1;->b:Lo1/n0;

    invoke-virtual {p1, v0}, Lo1/n0;->R(I)V

    sget-object p1, Lb3/f1;->f:Lb3/f1;

    invoke-direct {p0, v0, p1}, Li1/b1;->t(ILb3/f1;)V

    :cond_1
    return-void
.end method

.method public z(Lp1/g;Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lp1/g;",
            "Lcom/google/firebase/firestore/u0;",
            "Lp1/t<",
            "Li1/g1;",
            "Lo0/h<",
            "TTResult;>;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Li1/k1;

    iget-object v1, p0, Li1/b1;->b:Lo1/n0;

    invoke-direct {v0, p1, v1, p2, p3}, Li1/k1;-><init>(Lp1/g;Lo1/n0;Lcom/google/firebase/firestore/u0;Lp1/t;)V

    invoke-virtual {v0}, Li1/k1;->i()Lo0/h;

    move-result-object p1

    return-object p1
.end method
