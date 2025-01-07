.class final Li3/a;
.super Lb3/n0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li3/a$d;,
        Li3/a$b;,
        Li3/a$c;,
        Li3/a$e;
    }
.end annotation


# static fields
.field static final g:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Li3/a$d<",
            "Lb3/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final h:Lb3/f1;


# instance fields
.field private final b:Lb3/n0$d;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lb3/x;",
            "Lb3/n0$h;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Random;

.field private e:Lb3/p;

.field private f:Li3/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "state-info"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Li3/a;->g:Lb3/a$c;

    sget-object v0, Lb3/f1;->f:Lb3/f1;

    const-string v1, "no subchannels ready"

    invoke-virtual {v0, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    sput-object v0, Li3/a;->h:Lb3/f1;

    return-void
.end method

.method constructor <init>(Lb3/n0$d;)V
    .locals 2

    invoke-direct {p0}, Lb3/n0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li3/a;->c:Ljava/util/Map;

    new-instance v0, Li3/a$b;

    sget-object v1, Li3/a;->h:Lb3/f1;

    invoke-direct {v0, v1}, Li3/a$b;-><init>(Lb3/f1;)V

    iput-object v0, p0, Li3/a;->f:Li3/a$e;

    const-string v0, "helper"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/n0$d;

    iput-object p1, p0, Li3/a;->b:Lb3/n0$d;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Li3/a;->d:Ljava/util/Random;

    return-void
.end method

.method static synthetic f(Li3/a;Lb3/n0$h;Lb3/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li3/a;->k(Lb3/n0$h;Lb3/q;)V

    return-void
.end method

.method private static g(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lb3/n0$h;",
            ">;)",
            "Ljava/util/List<",
            "Lb3/n0$h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/n0$h;

    invoke-static {v1}, Li3/a;->j(Lb3/n0$h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static h(Lb3/n0$h;)Li3/a$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/n0$h;",
            ")",
            "Li3/a$d<",
            "Lb3/q;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lb3/n0$h;->c()Lb3/a;

    move-result-object p0

    sget-object v0, Li3/a;->g:Lb3/a$c;

    invoke-virtual {p0, v0}, Lb3/a;->b(Lb3/a$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li3/a$d;

    const-string v0, "STATE_INFO"

    invoke-static {p0, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li3/a$d;

    return-object p0
.end method

.method static j(Lb3/n0$h;)Z
    .locals 1

    invoke-static {p0}, Li3/a;->h(Lb3/n0$h;)Li3/a$d;

    move-result-object p0

    iget-object p0, p0, Li3/a$d;->a:Ljava/lang/Object;

    check-cast p0, Lb3/q;

    invoke-virtual {p0}, Lb3/q;->c()Lb3/p;

    move-result-object p0

    sget-object v0, Lb3/p;->f:Lb3/p;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private k(Lb3/n0$h;Lb3/q;)V
    .locals 3

    iget-object v0, p0, Li3/a;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lb3/n0$h;->a()Lb3/x;

    move-result-object v1

    invoke-static {v1}, Li3/a;->n(Lb3/x;)Lb3/x;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v1, Lb3/p;->g:Lb3/p;

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v2, Lb3/p;->h:Lb3/p;

    if-ne v0, v2, :cond_2

    :cond_1
    iget-object v0, p0, Li3/a;->b:Lb3/n0$d;

    invoke-virtual {v0}, Lb3/n0$d;->d()V

    :cond_2
    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v2, Lb3/p;->h:Lb3/p;

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lb3/n0$h;->e()V

    :cond_3
    invoke-static {p1}, Li3/a;->h(Lb3/n0$h;)Li3/a$d;

    move-result-object p1

    iget-object v0, p1, Li3/a$d;->a:Ljava/lang/Object;

    check-cast v0, Lb3/q;

    invoke-virtual {v0}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v1, Lb3/p;->e:Lb3/p;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-void

    :cond_5
    iput-object p2, p1, Li3/a$d;->a:Ljava/lang/Object;

    invoke-direct {p0}, Li3/a;->p()V

    return-void
.end method

.method private static l(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TT;>;",
            "Ljava/util/Set<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private m(Lb3/n0$h;)V
    .locals 1

    invoke-virtual {p1}, Lb3/n0$h;->f()V

    invoke-static {p1}, Li3/a;->h(Lb3/n0$h;)Li3/a$d;

    move-result-object p1

    sget-object v0, Lb3/p;->i:Lb3/p;

    invoke-static {v0}, Lb3/q;->a(Lb3/p;)Lb3/q;

    move-result-object v0

    iput-object v0, p1, Li3/a$d;->a:Ljava/lang/Object;

    return-void
.end method

.method private static n(Lb3/x;)Lb3/x;
    .locals 1

    new-instance v0, Lb3/x;

    invoke-virtual {p0}, Lb3/x;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lb3/x;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static o(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb3/x;",
            ">;)",
            "Ljava/util/Map<",
            "Lb3/x;",
            "Lb3/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/x;

    invoke-static {v1}, Li3/a;->n(Lb3/x;)Lb3/x;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private p()V
    .locals 6

    invoke-virtual {p0}, Li3/a;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Li3/a;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x0

    sget-object v1, Li3/a;->h:Lb3/f1;

    invoke-virtual {p0}, Li3/a;->i()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/n0$h;

    invoke-static {v3}, Li3/a;->h(Lb3/n0$h;)Li3/a$d;

    move-result-object v3

    iget-object v3, v3, Li3/a$d;->a:Ljava/lang/Object;

    check-cast v3, Lb3/q;

    invoke-virtual {v3}, Lb3/q;->c()Lb3/p;

    move-result-object v4

    sget-object v5, Lb3/p;->e:Lb3/p;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Lb3/q;->c()Lb3/p;

    move-result-object v4

    sget-object v5, Lb3/p;->h:Lb3/p;

    if-ne v4, v5, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    sget-object v4, Li3/a;->h:Lb3/f1;

    if-eq v1, v4, :cond_3

    invoke-virtual {v1}, Lb3/f1;->o()Z

    move-result v4

    if-nez v4, :cond_0

    :cond_3
    invoke-virtual {v3}, Lb3/q;->d()Lb3/f1;

    move-result-object v1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    sget-object v0, Lb3/p;->e:Lb3/p;

    goto :goto_1

    :cond_5
    sget-object v0, Lb3/p;->g:Lb3/p;

    :goto_1
    new-instance v2, Li3/a$b;

    invoke-direct {v2, v1}, Li3/a$b;-><init>(Lb3/f1;)V

    invoke-direct {p0, v0, v2}, Li3/a;->q(Lb3/p;Li3/a$e;)V

    goto :goto_2

    :cond_6
    iget-object v1, p0, Li3/a;->d:Ljava/util/Random;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    sget-object v2, Lb3/p;->f:Lb3/p;

    new-instance v3, Li3/a$c;

    invoke-direct {v3, v0, v1}, Li3/a$c;-><init>(Ljava/util/List;I)V

    invoke-direct {p0, v2, v3}, Li3/a;->q(Lb3/p;Li3/a$e;)V

    :goto_2
    return-void
.end method

.method private q(Lb3/p;Li3/a$e;)V
    .locals 1

    iget-object v0, p0, Li3/a;->e:Lb3/p;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Li3/a;->f:Li3/a$e;

    invoke-virtual {p2, v0}, Li3/a$e;->c(Li3/a$e;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Li3/a;->b:Lb3/n0$d;

    invoke-virtual {v0, p1, p2}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    iput-object p1, p0, Li3/a;->e:Lb3/p;

    iput-object p2, p0, Li3/a;->f:Li3/a$e;

    :cond_1
    return-void
.end method


# virtual methods
.method public b(Lb3/f1;)V
    .locals 2

    iget-object v0, p0, Li3/a;->e:Lb3/p;

    sget-object v1, Lb3/p;->f:Lb3/p;

    if-eq v0, v1, :cond_0

    sget-object v0, Lb3/p;->g:Lb3/p;

    new-instance v1, Li3/a$b;

    invoke-direct {v1, p1}, Li3/a$b;-><init>(Lb3/f1;)V

    invoke-direct {p0, v0, v1}, Li3/a;->q(Lb3/p;Li3/a$e;)V

    :cond_0
    return-void
.end method

.method public c(Lb3/n0$g;)V
    .locals 7

    invoke-virtual {p1}, Lb3/n0$g;->a()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Li3/a;->o(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Li3/a;->l(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/x;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/x;

    iget-object v3, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/n0$h;

    if-eqz v3, :cond_0

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Lb3/n0$h;->h(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lb3/a;->c()Lb3/a$b;

    move-result-object v3

    sget-object v4, Li3/a;->g:Lb3/a$c;

    new-instance v5, Li3/a$d;

    sget-object v6, Lb3/p;->h:Lb3/p;

    invoke-static {v6}, Lb3/q;->a(Lb3/p;)Lb3/q;

    move-result-object v6

    invoke-direct {v5, v6}, Li3/a$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v3

    iget-object v4, p0, Li3/a;->b:Lb3/n0$d;

    invoke-static {}, Lb3/n0$b;->c()Lb3/n0$b$a;

    move-result-object v5

    invoke-virtual {v5, v1}, Lb3/n0$b$a;->d(Lb3/x;)Lb3/n0$b$a;

    move-result-object v1

    invoke-virtual {v3}, Lb3/a$b;->a()Lb3/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb3/n0$b$a;->f(Lb3/a;)Lb3/n0$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lb3/n0$b$a;->b()Lb3/n0$b;

    move-result-object v1

    invoke-virtual {v4, v1}, Lb3/n0$d;->a(Lb3/n0$b;)Lb3/n0$h;

    move-result-object v1

    const-string v3, "subchannel"

    invoke-static {v1, v3}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/n0$h;

    new-instance v3, Li3/a$a;

    invoke-direct {v3, p0, v1}, Li3/a$a;-><init>(Li3/a;Lb3/n0$h;)V

    invoke-virtual {v1, v3}, Lb3/n0$h;->g(Lb3/n0$j;)V

    iget-object v3, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lb3/n0$h;->e()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/x;

    iget-object v2, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/n0$h;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Li3/a;->p()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/n0$h;

    invoke-direct {p0, v0}, Li3/a;->m(Lb3/n0$h;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public e()V
    .locals 2

    invoke-virtual {p0}, Li3/a;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/n0$h;

    invoke-direct {p0, v1}, Li3/a;->m(Lb3/n0$h;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lb3/n0$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li3/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
