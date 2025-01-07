.class public final Li1/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b1$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/p$a;,
        Li1/p$b;
    }
.end annotation


# instance fields
.field private final a:Li1/b1;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li1/x0;",
            "Li1/p$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/firestore/j<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Li1/v0;


# direct methods
.method public constructor <init>(Li1/b1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Li1/p;->c:Ljava/util/Set;

    sget-object v0, Li1/v0;->e:Li1/v0;

    iput-object v0, p0, Li1/p;->d:Li1/v0;

    iput-object p1, p0, Li1/p;->a:Li1/b1;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li1/p;->b:Ljava/util/Map;

    invoke-virtual {p1, p0}, Li1/b1;->w(Li1/b1$c;)V

    return-void
.end method

.method private f()V
    .locals 3

    iget-object v0, p0, Li1/p;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/j;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v2}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Li1/v0;)V
    .locals 4

    iput-object p1, p0, Li1/p;->d:Li1/v0;

    iget-object v0, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/p$b;

    invoke-static {v2}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/y0;

    invoke-virtual {v3, p1}, Li1/y0;->c(Li1/v0;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-direct {p0}, Li1/p;->f()V

    :cond_3
    return-void
.end method

.method public b(Li1/x0;Lb3/f1;)V
    .locals 3

    iget-object v0, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/p$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/y0;

    invoke-static {p2}, Lp1/g0;->r(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Li1/y0;->b(Lcom/google/firebase/firestore/u;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li1/u1;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/u1;

    invoke-virtual {v1}, Li1/u1;->h()Li1/x0;

    move-result-object v2

    iget-object v3, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/p$b;

    if-eqz v2, :cond_0

    invoke-static {v2}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/y0;

    invoke-virtual {v4, v1}, Li1/y0;->d(Li1/u1;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2, v1}, Li1/p$b;->c(Li1/p$b;Li1/u1;)Li1/u1;

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_4

    invoke-direct {p0}, Li1/p;->f()V

    :cond_4
    return-void
.end method

.method public d(Li1/y0;)I
    .locals 6

    invoke-virtual {p1}, Li1/y0;->a()Li1/x0;

    move-result-object v0

    iget-object v1, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/p$b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    new-instance v1, Li1/p$b;

    invoke-direct {v1}, Li1/p$b;-><init>()V

    iget-object v5, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {v1}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Li1/p;->d:Li1/v0;

    invoke-virtual {p1, v5}, Li1/y0;->c(Li1/v0;)Z

    move-result v5

    xor-int/2addr v2, v5

    new-array v3, v3, [Ljava/lang/Object;

    const-string v5, "onOnlineStateChanged() shouldn\'t raise an event for brand-new listeners."

    invoke-static {v2, v5, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Li1/p$b;->b(Li1/p$b;)Li1/u1;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Li1/p$b;->b(Li1/p$b;)Li1/u1;

    move-result-object v2

    invoke-virtual {p1, v2}, Li1/y0;->d(Li1/u1;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Li1/p;->f()V

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Li1/p;->a:Li1/b1;

    invoke-virtual {p1, v0}, Li1/b1;->n(Li1/x0;)I

    move-result p1

    invoke-static {v1, p1}, Li1/p$b;->e(Li1/p$b;I)I

    :cond_3
    invoke-static {v1}, Li1/p$b;->d(Li1/p$b;)I

    move-result p1

    return p1
.end method

.method public e(Lcom/google/firebase/firestore/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/j<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/p;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public g(Li1/y0;)V
    .locals 3

    invoke-virtual {p1}, Li1/y0;->a()Li1/x0;

    move-result-object v0

    iget-object v1, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/p$b;

    if-eqz v1, :cond_0

    invoke-static {v1}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {v1}, Li1/p$b;->a(Li1/p$b;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Li1/p;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li1/p;->a:Li1/b1;

    invoke-virtual {p1, v0}, Li1/b1;->x(Li1/x0;)V

    :cond_1
    return-void
.end method

.method public h(Lcom/google/firebase/firestore/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/j<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/p;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
