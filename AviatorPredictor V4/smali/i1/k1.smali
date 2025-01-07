.class public Li1/k1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lp1/g;

.field private b:Lo1/n0;

.field private c:Lp1/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t<",
            "Li1/g1;",
            "Lo0/h<",
            "TTResult;>;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Lp1/r;

.field private f:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/g;Lo1/n0;Lcom/google/firebase/firestore/u0;Lp1/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/g;",
            "Lo1/n0;",
            "Lcom/google/firebase/firestore/u0;",
            "Lp1/t<",
            "Li1/g1;",
            "Lo0/h<",
            "TTResult;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iput-object v0, p0, Li1/k1;->f:Lo0/i;

    iput-object p1, p0, Li1/k1;->a:Lp1/g;

    iput-object p2, p0, Li1/k1;->b:Lo1/n0;

    iput-object p4, p0, Li1/k1;->c:Lp1/t;

    invoke-virtual {p3}, Lcom/google/firebase/firestore/u0;->a()I

    move-result p2

    iput p2, p0, Li1/k1;->d:I

    new-instance p2, Lp1/r;

    sget-object p3, Lp1/g$d;->m:Lp1/g$d;

    invoke-direct {p2, p1, p3}, Lp1/r;-><init>(Lp1/g;Lp1/g$d;)V

    iput-object p2, p0, Li1/k1;->e:Lp1/r;

    return-void
.end method

.method public static synthetic a(Li1/k1;Li1/g1;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/k1;->g(Li1/g1;Lo0/h;)V

    return-void
.end method

.method public static synthetic b(Li1/k1;Lo0/h;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/k1;->f(Lo0/h;Lo0/h;)V

    return-void
.end method

.method public static synthetic c(Li1/k1;)V
    .locals 0

    invoke-direct {p0}, Li1/k1;->h()V

    return-void
.end method

.method private d(Lo0/h;)V
    .locals 1

    iget v0, p0, Li1/k1;->d:I

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Li1/k1;->e(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Li1/k1;->j()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li1/k1;->f:Lo0/i;

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static e(Ljava/lang/Exception;)Z
    .locals 3

    instance-of v0, p0, Lcom/google/firebase/firestore/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/firebase/firestore/u;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/u;->a()Lcom/google/firebase/firestore/u$a;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/firestore/u$a;->p:Lcom/google/firebase/firestore/u$a;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/google/firebase/firestore/u$a;->o:Lcom/google/firebase/firestore/u$a;

    if-eq v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/firestore/u;->a()Lcom/google/firebase/firestore/u$a;

    move-result-object p0

    invoke-static {p0}, Lo1/m;->j(Lcom/google/firebase/firestore/u$a;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private synthetic f(Lo0/h;Lo0/h;)V
    .locals 1

    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Li1/k1;->f:Lo0/i;

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Li1/k1;->d(Lo0/h;)V

    :goto_0
    return-void
.end method

.method private synthetic g(Li1/g1;Lo0/h;)V
    .locals 2

    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Li1/k1;->d(Lo0/h;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li1/g1;->c()Lo0/h;

    move-result-object p1

    iget-object v0, p0, Li1/k1;->a:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Li1/j1;

    invoke-direct {v1, p0, p2}, Li1/j1;-><init>(Li1/k1;Lo0/h;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    :goto_0
    return-void
.end method

.method private synthetic h()V
    .locals 4

    iget-object v0, p0, Li1/k1;->b:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->p()Li1/g1;

    move-result-object v0

    iget-object v1, p0, Li1/k1;->c:Lp1/t;

    invoke-interface {v1, v0}, Lp1/t;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/h;

    iget-object v2, p0, Li1/k1;->a:Lp1/g;

    invoke-virtual {v2}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Li1/i1;

    invoke-direct {v3, p0, v0}, Li1/i1;-><init>(Li1/k1;Li1/g1;)V

    invoke-virtual {v1, v2, v3}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    return-void
.end method

.method private j()V
    .locals 2

    iget v0, p0, Li1/k1;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Li1/k1;->d:I

    iget-object v0, p0, Li1/k1;->e:Lp1/r;

    new-instance v1, Li1/h1;

    invoke-direct {v1, p0}, Li1/h1;-><init>(Li1/k1;)V

    invoke-virtual {v0, v1}, Lp1/r;->b(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public i()Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    invoke-direct {p0}, Li1/k1;->j()V

    iget-object v0, p0, Li1/k1;->f:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method
