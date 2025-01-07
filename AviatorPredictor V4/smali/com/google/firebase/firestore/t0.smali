.class public Lcom/google/firebase/firestore/t0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/t0$a;
    }
.end annotation


# instance fields
.field private final a:Li1/g1;

.field private final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method constructor <init>(Li1/g1;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/g1;

    iput-object p1, p0, Lcom/google/firebase/firestore/t0;->a:Li1/g1;

    invoke-static {p2}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p1, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/firestore/t0;Lo0/h;)Lcom/google/firebase/firestore/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/t0;->e(Lo0/h;)Lcom/google/firebase/firestore/i;

    move-result-object p0

    return-object p0
.end method

.method private d(Lcom/google/firebase/firestore/h;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/h;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->a:Li1/g1;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Li1/g1;->j(Ljava/util/List;)Lo0/h;

    move-result-object p1

    sget-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/firestore/s0;

    invoke-direct {v1, p0}, Lcom/google/firebase/firestore/s0;-><init>(Lcom/google/firebase/firestore/t0;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic e(Lo0/h;)Lcom/google/firebase/firestore/i;
    .locals 3

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/s;

    invoke-virtual {p1}, Ll1/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-static {v0, p1, v2, v2}, Lcom/google/firebase/firestore/i;->b(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ll1/s;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p1

    invoke-static {v0, p1, v2}, Lcom/google/firebase/firestore/i;->c(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Z)Lcom/google/firebase/firestore/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "BatchGetDocumentsRequest returned unexpected document type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Ll1/s;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_2
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Mismatch in docs returned from document lookup."

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    throw p1
.end method

.method private h(Lcom/google/firebase/firestore/h;Li1/p1;)Lcom/google/firebase/firestore/t0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->a:Li1/g1;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Li1/g1;->o(Ll1/l;Li1/p1;)V

    return-object p0
.end method


# virtual methods
.method public b(Lcom/google/firebase/firestore/h;)Lcom/google/firebase/firestore/t0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->a:Li1/g1;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Li1/g1;->e(Ll1/l;)V

    return-object p0
.end method

.method public c(Lcom/google/firebase/firestore/h;)Lcom/google/firebase/firestore/i;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/t0;->d(Lcom/google/firebase/firestore/h;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/i;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/firestore/u;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/u;

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public f(Lcom/google/firebase/firestore/h;Ljava/lang/Object;)Lcom/google/firebase/firestore/t0;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/o0;->c:Lcom/google/firebase/firestore/o0;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/firebase/firestore/t0;->g(Lcom/google/firebase/firestore/h;Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lcom/google/firebase/firestore/t0;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/firebase/firestore/h;Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lcom/google/firebase/firestore/t0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    const-string v0, "Provided data must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided options must not be null."

    invoke-static {p3, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/firebase/firestore/o0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/firebase/firestore/o0;->a()Lm1/d;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, Lcom/google/firebase/firestore/v0;->g(Ljava/lang/Object;Lm1/d;)Li1/o1;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p3}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/firebase/firestore/v0;->l(Ljava/lang/Object;)Li1/o1;

    move-result-object p2

    :goto_0
    iget-object p3, p0, Lcom/google/firebase/firestore/t0;->a:Li1/g1;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Li1/g1;->n(Ll1/l;Li1/o1;)V

    return-object p0
.end method

.method public i(Lcom/google/firebase/firestore/h;Ljava/util/Map;)Lcom/google/firebase/firestore/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/h;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/t0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/t0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/firebase/firestore/v0;->n(Ljava/util/Map;)Li1/p1;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/t0;->h(Lcom/google/firebase/firestore/h;Li1/p1;)Lcom/google/firebase/firestore/t0;

    move-result-object p1

    return-object p1
.end method
