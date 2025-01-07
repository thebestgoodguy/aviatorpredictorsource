.class public Li1/y0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Li1/x0;

.field private final b:Li1/p$a;

.field private final c:Lcom/google/firebase/firestore/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/firestore/j<",
            "Li1/u1;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Li1/v0;

.field private f:Li1/u1;


# direct methods
.method public constructor <init>(Li1/x0;Li1/p$a;Lcom/google/firebase/firestore/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/x0;",
            "Li1/p$a;",
            "Lcom/google/firebase/firestore/j<",
            "Li1/u1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Li1/y0;->d:Z

    sget-object v0, Li1/v0;->e:Li1/v0;

    iput-object v0, p0, Li1/y0;->e:Li1/v0;

    iput-object p1, p0, Li1/y0;->a:Li1/x0;

    iput-object p3, p0, Li1/y0;->c:Lcom/google/firebase/firestore/j;

    iput-object p2, p0, Li1/y0;->b:Li1/p$a;

    return-void
.end method

.method private e(Li1/u1;)V
    .locals 5

    iget-boolean v0, p0, Li1/y0;->d:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Trying to raise initial event for second time"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Li1/u1;->h()Li1/x0;

    move-result-object v0

    invoke-virtual {p1}, Li1/u1;->e()Ll1/n;

    move-result-object v2

    invoke-virtual {p1}, Li1/u1;->f()Lc1/e;

    move-result-object v3

    invoke-virtual {p1}, Li1/u1;->j()Z

    move-result v4

    invoke-virtual {p1}, Li1/u1;->b()Z

    move-result p1

    invoke-static {v0, v2, v3, v4, p1}, Li1/u1;->c(Li1/x0;Ll1/n;Lc1/e;ZZ)Li1/u1;

    move-result-object p1

    iput-boolean v1, p0, Li1/y0;->d:Z

    iget-object v0, p0, Li1/y0;->c:Lcom/google/firebase/firestore/j;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private f(Li1/u1;)Z
    .locals 4

    invoke-virtual {p1}, Li1/u1;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Li1/y0;->f:Li1/u1;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li1/u1;->i()Z

    move-result v0

    invoke-virtual {p1}, Li1/u1;->i()Z

    move-result v3

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Li1/u1;->a()Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    :goto_1
    iget-object p1, p0, Li1/y0;->b:Li1/p$a;

    iget-boolean p1, p1, Li1/p$a;->b:Z

    return p1
.end method

.method private g(Li1/u1;Li1/v0;)Z
    .locals 5

    iget-boolean v0, p0, Li1/y0;->d:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Determining whether to raise first event but already had first event."

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Li1/u1;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Li1/v0;->g:Li1/v0;

    invoke-virtual {p2, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p0, Li1/y0;->b:Li1/p$a;

    iget-boolean v4, v4, Li1/p$a;->c:Z

    if-eqz v4, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Li1/u1;->j()Z

    move-result p1

    new-array p2, v2, [Ljava/lang/Object;

    const-string v0, "Waiting for sync, but snapshot is not from cache"

    invoke-static {p1, v0, p2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_1
    invoke-virtual {p1}, Li1/u1;->e()Ll1/n;

    move-result-object p1

    invoke-virtual {p1}, Ll1/n;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p2, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method


# virtual methods
.method public a()Li1/x0;
    .locals 1

    iget-object v0, p0, Li1/y0;->a:Li1/x0;

    return-object v0
.end method

.method public b(Lcom/google/firebase/firestore/u;)V
    .locals 2

    iget-object v0, p0, Li1/y0;->c:Lcom/google/firebase/firestore/j;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public c(Li1/v0;)Z
    .locals 2

    iput-object p1, p0, Li1/y0;->e:Li1/v0;

    iget-object v0, p0, Li1/y0;->f:Li1/u1;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Li1/y0;->d:Z

    if-nez v1, :cond_0

    invoke-direct {p0, v0, p1}, Li1/y0;->g(Li1/u1;Li1/v0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li1/y0;->f:Li1/u1;

    invoke-direct {p0, p1}, Li1/y0;->e(Li1/u1;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Li1/u1;)Z
    .locals 12

    invoke-virtual {p1}, Li1/u1;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li1/u1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "We got a new snapshot with no changes?"

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/y0;->b:Li1/p$a;

    iget-boolean v0, v0, Li1/p$a;->a:Z

    if-nez v0, :cond_4

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Li1/u1;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/n;

    invoke-virtual {v3}, Li1/n;->c()Li1/n$a;

    move-result-object v4

    sget-object v5, Li1/n$a;->h:Li1/n$a;

    if-eq v4, v5, :cond_2

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v0, Li1/u1;

    invoke-virtual {p1}, Li1/u1;->h()Li1/x0;

    move-result-object v4

    invoke-virtual {p1}, Li1/u1;->e()Ll1/n;

    move-result-object v5

    invoke-virtual {p1}, Li1/u1;->g()Ll1/n;

    move-result-object v6

    invoke-virtual {p1}, Li1/u1;->j()Z

    move-result v8

    invoke-virtual {p1}, Li1/u1;->f()Lc1/e;

    move-result-object v9

    invoke-virtual {p1}, Li1/u1;->a()Z

    move-result v10

    const/4 v11, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Li1/u1;-><init>(Li1/x0;Ll1/n;Ll1/n;Ljava/util/List;ZLc1/e;ZZ)V

    move-object p1, v0

    :cond_4
    iget-boolean v0, p0, Li1/y0;->d:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Li1/y0;->e:Li1/v0;

    invoke-direct {p0, p1, v0}, Li1/y0;->g(Li1/u1;Li1/v0;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, Li1/y0;->e(Li1/u1;)V

    goto :goto_3

    :cond_5
    invoke-direct {p0, p1}, Li1/y0;->f(Li1/u1;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Li1/y0;->c:Lcom/google/firebase/firestore/j;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    :goto_3
    const/4 v1, 0x1

    :cond_6
    iput-object p1, p0, Li1/y0;->f:Li1/u1;

    return v1
.end method
