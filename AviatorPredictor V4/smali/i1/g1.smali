.class public Li1/g1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final g:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:Lo1/m;

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ll1/l;",
            "Ll1/w;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lm1/f;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Lcom/google/firebase/firestore/u;

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Li1/g1;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Li1/g1;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Lo1/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li1/g1;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li1/g1;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Li1/g1;->f:Ljava/util/Set;

    iput-object p1, p0, Li1/g1;->a:Lo1/m;

    return-void
.end method

.method public static synthetic a(Lo0/h;)Lo0/h;
    .locals 0

    invoke-static {p0}, Li1/g1;->h(Lo0/h;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li1/g1;Lo0/h;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1}, Li1/g1;->i(Lo0/h;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method private static d()Ljava/util/concurrent/Executor;
    .locals 9

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v8, 0x1

    int-to-long v3, v8

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v2, 0x5

    move-object v0, v7

    move v1, v2

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    invoke-virtual {v7, v8}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    return-object v7
.end method

.method private f()V
    .locals 3

    iget-boolean v0, p0, Li1/g1;->d:Z

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "A transaction object cannot be used after its update callback has been invoked."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static g()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Li1/g1;->g:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method private static synthetic h(Lo0/h;)Lo0/h;
    .locals 1

    invoke-virtual {p0}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method private synthetic i(Lo0/h;)Lo0/h;
    .locals 2

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

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

    check-cast v1, Ll1/s;

    invoke-direct {p0, v1}, Li1/g1;->m(Ll1/s;)V

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method private k(Ll1/l;)Lm1/m;
    .locals 2

    iget-object v0, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/w;

    iget-object v1, p0, Li1/g1;->f:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm1/m;->f(Ll1/w;)Lm1/m;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm1/m;->c:Lm1/m;

    return-object p1
.end method

.method private l(Ll1/l;)Lm1/m;
    .locals 2

    iget-object v0, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/w;

    iget-object v1, p0, Li1/g1;->f:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    sget-object p1, Ll1/w;->f:Ll1/w;

    invoke-virtual {v0, p1}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {v0}, Lm1/m;->f(Ll1/w;)Lm1/m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/firebase/firestore/u;

    sget-object v0, Lcom/google/firebase/firestore/u$a;->i:Lcom/google/firebase/firestore/u$a;

    const-string v1, "Can\'t update a document that doesn\'t exist."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    throw p1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p1}, Lm1/m;->a(Z)Lm1/m;

    move-result-object p1

    return-object p1
.end method

.method private m(Ll1/s;)V
    .locals 3

    invoke-virtual {p1}, Ll1/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll1/s;->j()Ll1/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll1/s;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ll1/w;->f:Ll1/w;

    :goto_0
    iget-object v1, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/w;

    invoke-virtual {p1}, Ll1/s;->j()Ll1/w;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/google/firebase/firestore/u;

    sget-object v0, Lcom/google/firebase/firestore/u$a;->p:Lcom/google/firebase/firestore/u$a;

    const-string v1, "Document version changed between two reads."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    throw p1

    :cond_2
    iget-object v1, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected document type in transaction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private p(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Li1/g1;->f()V

    iget-object v0, p0, Li1/g1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public c()Lo0/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Li1/g1;->f()V

    iget-object v0, p0, Li1/g1;->e:Lcom/google/firebase/firestore/u;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Li1/g1;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Li1/g1;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/f;

    invoke-virtual {v2}, Lm1/f;->g()Ll1/l;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    iget-object v2, p0, Li1/g1;->c:Ljava/util/ArrayList;

    new-instance v3, Lm1/q;

    invoke-direct {p0, v1}, Li1/g1;->k(Ll1/l;)Lm1/m;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lm1/q;-><init>(Ll1/l;Lm1/m;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Li1/g1;->d:Z

    iget-object v0, p0, Li1/g1;->a:Lo1/m;

    iget-object v1, p0, Li1/g1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo1/m;->d(Ljava/util/List;)Lo0/h;

    move-result-object v0

    sget-object v1, Lp1/p;->b:Ljava/util/concurrent/Executor;

    sget-object v2, Li1/f1;->a:Li1/f1;

    invoke-virtual {v0, v1, v2}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public e(Ll1/l;)V
    .locals 2

    new-instance v0, Lm1/c;

    invoke-direct {p0, p1}, Li1/g1;->k(Ll1/l;)Lm1/m;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm1/c;-><init>(Ll1/l;Lm1/m;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Li1/g1;->p(Ljava/util/List;)V

    iget-object v0, p0, Li1/g1;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(Ljava/util/List;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll1/l;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/List<",
            "Ll1/s;",
            ">;>;"
        }
    .end annotation

    invoke-direct {p0}, Li1/g1;->f()V

    iget-object v0, p0, Li1/g1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/firebase/firestore/u;

    sget-object v0, Lcom/google/firebase/firestore/u$a;->i:Lcom/google/firebase/firestore/u$a;

    const-string v1, "Firestore transactions require all reads to be executed before all writes."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Li1/g1;->a:Lo1/m;

    invoke-virtual {v0, p1}, Lo1/m;->m(Ljava/util/List;)Lo0/h;

    move-result-object p1

    sget-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/e1;

    invoke-direct {v1, p0}, Li1/e1;-><init>(Li1/g1;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public n(Ll1/l;Li1/o1;)V
    .locals 1

    invoke-direct {p0, p1}, Li1/g1;->k(Ll1/l;)Lm1/m;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Li1/o1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p2}, Li1/g1;->p(Ljava/util/List;)V

    iget-object p2, p0, Li1/g1;->f:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public o(Ll1/l;Li1/p1;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Li1/g1;->l(Ll1/l;)Lm1/m;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Li1/p1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p2}, Li1/g1;->p(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/firebase/firestore/u; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    iput-object p2, p0, Li1/g1;->e:Lcom/google/firebase/firestore/u;

    :goto_0
    iget-object p2, p0, Li1/g1;->f:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
