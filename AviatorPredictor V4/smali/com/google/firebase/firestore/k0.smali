.class public Lcom/google/firebase/firestore/k0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/k0$b;
    }
.end annotation


# instance fields
.field final a:Li1/x0;

.field final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method constructor <init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/x0;

    iput-object p1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-static {p2}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method private C(Ljava/lang/Object;Li1/q$b;)V
    .locals 2

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0xa

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Query. \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' filters support a maximum of 10 elements in the value array."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Query. A non-empty array is required for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' filters."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private D()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->l()Li1/x0$a;

    move-result-object v0

    sget-object v1, Li1/x0$a;->f:Li1/x0$a;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "limitToLast() queries require specifying at least one orderBy() clause"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private E(Li1/x0;Li1/q;)V
    .locals 3

    invoke-virtual {p2}, Li1/q;->h()Li1/q$b;

    move-result-object v0

    invoke-virtual {p2}, Li1/q;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Li1/x0;->q()Ll1/r;

    move-result-object v1

    invoke-virtual {p2}, Li1/q;->g()Ll1/r;

    move-result-object p2

    if-eqz v1, :cond_1

    invoke-virtual {v1, p2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p2}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v1

    const-string p2, "All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on \'%s\' and \'%s\'"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Li1/x0;->j()Ll1/r;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v1, p2}, Lcom/google/firebase/firestore/k0;->H(Ll1/r;Ll1/r;)V

    :cond_2
    invoke-virtual {p1}, Li1/x0;->i()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0}, Lcom/google/firebase/firestore/k0;->h(Li1/q$b;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/k0;->k(Ljava/util/List;Ljava/util/List;)Li1/q$b;

    move-result-object p1

    if-eqz p1, :cond_4

    if-ne p1, v0, :cond_3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Query. You cannot use more than one \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' filter."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. You cannot use \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' filters with \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' filters."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    return-void
.end method

.method private F(Li1/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {p1}, Li1/r;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/q;

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/firestore/k0;->E(Li1/x0;Li1/q;)V

    invoke-virtual {v0, v1}, Li1/x0;->e(Li1/r;)Li1/x0;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private G(Ll1/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->q()Ll1/r;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1}, Li1/x0;->j()Ll1/r;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/firestore/k0;->H(Ll1/r;Ll1/r;)V

    :cond_0
    return-void
.end method

.method private H(Ll1/r;Ll1/r;)V
    .locals 3

    invoke-virtual {p1, p2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 p2, 0x2

    invoke-virtual {p1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, p2

    const-string p1, "Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field \'%s\' and so you must also have \'%s\' as your first orderBy() field, but your first orderBy() is currently on field \'%s\' instead."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/firestore/k0;->r(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/firestore/k0;Lo0/h;)Lcom/google/firebase/firestore/m0;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->q(Lo0/h;)Lcom/google/firebase/firestore/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/firestore/k0;Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/k0;->p(Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Li1/p$a;",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/m0;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/k0;->D()V

    new-instance v0, Lcom/google/firebase/firestore/h0;

    invoke-direct {v0, p0, p4}, Lcom/google/firebase/firestore/h0;-><init>(Lcom/google/firebase/firestore/k0;Lcom/google/firebase/firestore/j;)V

    new-instance p4, Li1/h;

    invoke-direct {p4, p1, v0}, Li1/h;-><init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/j;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {p1, v0, p2, p4}, Li1/l0;->U(Li1/x0;Li1/p$a;Lcom/google/firebase/firestore/j;)Li1/y0;

    move-result-object p1

    new-instance p2, Li1/s0;

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    invoke-direct {p2, v0, p1, p4}, Li1/s0;-><init>(Li1/l0;Li1/y0;Li1/h;)V

    invoke-static {p3, p2}, Li1/d;->c(Landroid/app/Activity;Lcom/google/firebase/firestore/a0;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method private g(Ljava/lang/String;[Ljava/lang/Object;Z)Li1/i;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->h()Ljava/util/List;

    move-result-object v0

    array-length v1, p2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-gt v1, v2, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_5

    aget-object v3, p2, v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/w0;

    invoke-virtual {v4}, Li1/w0;->c()Ll1/r;

    move-result-object v4

    sget-object v5, Ll1/r;->f:Ll1/r;

    invoke-virtual {v4, v5}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v4}, Li1/x0;->r()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "() must be a plain document ID, but \'"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' contains a slash."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_1
    iget-object v4, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v4}, Li1/x0;->n()Ll1/u;

    move-result-object v4

    invoke-static {v3}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll1/e;->g(Ll1/e;)Ll1/e;

    move-result-object v3

    check-cast v3, Ll1/u;

    invoke-static {v3}, Ll1/l;->v(Ll1/u;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v4

    invoke-static {v4, v3}, Ll1/y;->F(Ll1/f;Ll1/l;)Lx1/x;

    move-result-object v3

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "() must result in a valid document path, but \'"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not because it contains an odd number of segments."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid query. Expected a string for document ID in "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(), but got "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    iget-object v4, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/firebase/firestore/v0;->h(Ljava/lang/Object;)Lx1/x;

    move-result-object v3

    :goto_2
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    new-instance p1, Li1/i;

    invoke-direct {p1, v1, p3}, Li1/i;-><init>(Ljava/util/List;Z)V

    return-object p1

    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Too many arguments provided to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private h(Li1/q$b;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/q$b;",
            ")",
            "Ljava/util/List<",
            "Li1/q$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/firestore/k0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v3, 0x3

    if-eq p1, v1, :cond_3

    if-eq p1, v3, :cond_2

    const/4 v4, 0x4

    if-eq p1, v4, :cond_1

    const/4 v5, 0x5

    if-eq p1, v5, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    new-array p1, v5, [Li1/q$b;

    sget-object v5, Li1/q$b;->l:Li1/q$b;

    aput-object v5, p1, v0

    sget-object v0, Li1/q$b;->m:Li1/q$b;

    aput-object v0, p1, v2

    sget-object v0, Li1/q$b;->n:Li1/q$b;

    aput-object v0, p1, v1

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    aput-object v0, p1, v3

    sget-object v0, Li1/q$b;->i:Li1/q$b;

    aput-object v0, p1, v4

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    new-array p1, v4, [Li1/q$b;

    sget-object v4, Li1/q$b;->l:Li1/q$b;

    aput-object v4, p1, v0

    sget-object v0, Li1/q$b;->m:Li1/q$b;

    aput-object v0, p1, v2

    sget-object v0, Li1/q$b;->n:Li1/q$b;

    aput-object v0, p1, v1

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    aput-object v0, p1, v3

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    new-array p1, v3, [Li1/q$b;

    sget-object v3, Li1/q$b;->m:Li1/q$b;

    aput-object v3, p1, v0

    sget-object v0, Li1/q$b;->n:Li1/q$b;

    aput-object v0, p1, v2

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    aput-object v0, p1, v1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_3
    new-array p1, v3, [Li1/q$b;

    sget-object v3, Li1/q$b;->l:Li1/q$b;

    aput-object v3, p1, v0

    sget-object v0, Li1/q$b;->m:Li1/q$b;

    aput-object v0, p1, v2

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    aput-object v0, p1, v1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    new-array p1, v1, [Li1/q$b;

    sget-object v1, Li1/q$b;->i:Li1/q$b;

    aput-object v1, p1, v0

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    aput-object v0, p1, v2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private k(Ljava/util/List;Ljava/util/List;)Li1/q$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li1/r;",
            ">;",
            "Ljava/util/List<",
            "Li1/q$b;",
            ">;)",
            "Li1/q$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/r;

    invoke-virtual {v0}, Li1/r;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/q;

    invoke-virtual {v1}, Li1/q;->h()Li1/q$b;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Li1/q;->h()Li1/q$b;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private n(Lcom/google/firebase/firestore/q0;)Lo0/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q0;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/m0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    new-instance v1, Lo0/i;

    invoke-direct {v1}, Lo0/i;-><init>()V

    new-instance v2, Li1/p$a;

    invoke-direct {v2}, Li1/p$a;-><init>()V

    const/4 v3, 0x1

    iput-boolean v3, v2, Li1/p$a;->a:Z

    iput-boolean v3, v2, Li1/p$a;->b:Z

    iput-boolean v3, v2, Li1/p$a;->c:Z

    sget-object v3, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/firebase/firestore/i0;

    invoke-direct {v4, v0, v1, p1}, Lcom/google/firebase/firestore/i0;-><init>(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;)V

    const/4 p1, 0x0

    invoke-direct {p0, v3, v2, p1, v4}, Lcom/google/firebase/firestore/k0;->f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static o(Lcom/google/firebase/firestore/e0;)Li1/p$a;
    .locals 5

    new-instance v0, Li1/p$a;

    invoke-direct {v0}, Li1/p$a;-><init>()V

    sget-object v1, Lcom/google/firebase/firestore/e0;->f:Lcom/google/firebase/firestore/e0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, v0, Li1/p$a;->a:Z

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, v0, Li1/p$a;->b:Z

    iput-boolean v3, v0, Li1/p$a;->c:Z

    return-object v0
.end method

.method private synthetic p(Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-interface {p1, v0, p3}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void

    :cond_0
    const/4 p3, 0x0

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-array p3, p3, [Ljava/lang/Object;

    const-string v2, "Got event without value or error set"

    invoke-static {v1, v2, p3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance p3, Lcom/google/firebase/firestore/m0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {p3, p0, p2, v1}, Lcom/google/firebase/firestore/m0;-><init>(Lcom/google/firebase/firestore/k0;Li1/u1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-interface {p1, p3, v0}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private synthetic q(Lo0/h;)Lcom/google/firebase/firestore/m0;
    .locals 4

    new-instance v0, Lcom/google/firebase/firestore/m0;

    new-instance v1, Lcom/google/firebase/firestore/k0;

    iget-object v2, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    iget-object v3, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/u1;

    iget-object v2, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, v1, p1, v2}, Lcom/google/firebase/firestore/m0;-><init>(Lcom/google/firebase/firestore/k0;Li1/u1;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method private static synthetic r(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V
    .locals 1

    const-string v0, "Failed to register a listener for a query result"

    if-eqz p4, :cond_0

    invoke-virtual {p0, p4}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const/4 p4, 0x0

    :try_start_0
    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/a0;

    invoke-interface {p1}, Lcom/google/firebase/firestore/a0;->remove()V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/m0;->t()Lcom/google/firebase/firestore/p0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/p0;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/firebase/firestore/q0;->f:Lcom/google/firebase/firestore/q0;

    if-ne p2, p1, :cond_1

    new-instance p1, Lcom/google/firebase/firestore/u;

    const-string p2, "Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)"

    sget-object p3, Lcom/google/firebase/firestore/u$a;->t:Lcom/google/firebase/firestore/u$a;

    invoke-direct {p1, p2, p3}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    invoke-virtual {p0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p3}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lp1/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    new-array p1, p4, [Ljava/lang/Object;

    invoke-static {p0, v0, p1}, Lp1/b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private v(Ll1/r;Lcom/google/firebase/firestore/k0$b;)Lcom/google/firebase/firestore/k0;
    .locals 2

    const-string v0, "Provided direction must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->o()Li1/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->g()Li1/i;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->G(Ll1/r;)V

    sget-object v0, Lcom/google/firebase/firestore/k0$b;->e:Lcom/google/firebase/firestore/k0$b;

    if-ne p2, v0, :cond_0

    sget-object p2, Li1/w0$a;->f:Li1/w0$a;

    goto :goto_0

    :cond_0
    sget-object p2, Li1/w0$a;->g:Li1/w0$a;

    :goto_0
    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-static {p2, p1}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object p1

    invoke-virtual {v1, p1}, Li1/x0;->B(Li1/w0;)Li1/x0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private w(Lcom/google/firebase/firestore/n$a;)Li1/r;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/firestore/n$a;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/firestore/n;

    invoke-direct {p0, v2}, Lcom/google/firebase/firestore/k0;->z(Lcom/google/firebase/firestore/n;)Li1/r;

    move-result-object v2

    invoke-virtual {v2}, Li1/r;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li1/r;

    return-object p1

    :cond_2
    new-instance v1, Li1/l;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/n$a;->l()Li1/l$a;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    return-object v1
.end method

.method private x(Ljava/lang/Object;)Lx1/x;
    .locals 3

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->r()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' contains a \'/\' character."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->n()Ll1/u;

    move-result-object v0

    invoke-static {p1}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll1/e;->g(Ll1/e;)Ll1/e;

    move-result-object p1

    check-cast p1, Ll1/u;

    invoke-static {p1}, Ll1/l;->v(Ll1/u;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/firestore/k0;->m()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v0

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    :goto_1
    invoke-static {v0, p1}, Ll1/y;->F(Ll1/f;Ll1/l;)Lx1/x;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' is not because it has an odd number of segments ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v0, p1, Lcom/google/firebase/firestore/h;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/google/firebase/firestore/h;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/k0;->m()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lp1/g0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private y(Lcom/google/firebase/firestore/n$b;)Li1/q;
    .locals 4

    invoke-virtual {p1}, Lcom/google/firebase/firestore/n$b;->k()Lcom/google/firebase/firestore/l;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/n$b;->l()Li1/q$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/n$b;->m()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Provided field path must not be null."

    invoke-static {v0, v2}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Provided op must not be null."

    invoke-static {v1, v2}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/l;->c()Ll1/r;

    move-result-object v2

    invoke-virtual {v2}, Ll1/r;->z()Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Li1/q$b;->l:Li1/q$b;

    if-eq v1, v2, :cond_3

    sget-object v2, Li1/q$b;->m:Li1/q$b;

    if-eq v1, v2, :cond_3

    sget-object v2, Li1/q$b;->n:Li1/q$b;

    if-eq v1, v2, :cond_1

    sget-object v2, Li1/q$b;->o:Li1/q$b;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->x(Ljava/lang/Object;)Lx1/x;

    move-result-object p1

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/k0;->C(Ljava/lang/Object;Li1/q$b;)V

    invoke-static {}, Lx1/a;->d0()Lx1/a$b;

    move-result-object v2

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/google/firebase/firestore/k0;->x(Ljava/lang/Object;)Lx1/x;

    move-result-object v3

    invoke-virtual {v2, v3}, Lx1/a$b;->D(Lx1/x;)Lx1/a$b;

    goto :goto_1

    :cond_2
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lx1/x$b;->D(Lx1/a$b;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    goto :goto_4

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid query. You can\'t perform \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' queries on FieldPath.documentId()."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object v2, Li1/q$b;->n:Li1/q$b;

    if-eq v1, v2, :cond_5

    sget-object v3, Li1/q$b;->o:Li1/q$b;

    if-eq v1, v3, :cond_5

    sget-object v3, Li1/q$b;->m:Li1/q$b;

    if-ne v1, v3, :cond_6

    :cond_5
    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/k0;->C(Ljava/lang/Object;Li1/q$b;)V

    :cond_6
    iget-object v3, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v3

    if-eq v1, v2, :cond_8

    sget-object v2, Li1/q$b;->o:Li1/q$b;

    if-ne v1, v2, :cond_7

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v2, 0x1

    :goto_3
    invoke-virtual {v3, p1, v2}, Lcom/google/firebase/firestore/v0;->i(Ljava/lang/Object;Z)Lx1/x;

    move-result-object p1

    :goto_4
    invoke-virtual {v0}, Lcom/google/firebase/firestore/l;->c()Ll1/r;

    move-result-object v0

    invoke-static {v0, v1, p1}, Li1/q;->f(Ll1/r;Li1/q$b;Lx1/x;)Li1/q;

    move-result-object p1

    return-object p1
.end method

.method private z(Lcom/google/firebase/firestore/n;)Li1/r;
    .locals 4

    instance-of v0, p1, Lcom/google/firebase/firestore/n$b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of v2, p1, Lcom/google/firebase/firestore/n$a;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter."

    invoke-static {v2, v3, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/firebase/firestore/n$b;

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->y(Lcom/google/firebase/firestore/n$b;)Li1/q;

    move-result-object p1

    return-object p1

    :cond_2
    check-cast p1, Lcom/google/firebase/firestore/n$a;

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->w(Lcom/google/firebase/firestore/n$a;)Li1/r;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public varargs A([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 2

    const-string v0, "startAfter"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/k0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Li1/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1}, Li1/x0;->C(Li1/i;)Li1/x0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public varargs B([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 2

    const-string v0, "startAt"

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/k0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Li1/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1}, Li1/x0;->C(Li1/i;)Li1/x0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->z(Lcom/google/firebase/firestore/n;)Li1/r;

    move-result-object p1

    invoke-virtual {p1}, Li1/r;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->F(Li1/r;)V

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1}, Li1/x0;->e(Li1/r;)Li1/x0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public J(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->a(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public K(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/l;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/k0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->b(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public L(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->c(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public M(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->d(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public N(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->e(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public O(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/l;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/k0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->f(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public P(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->g(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->h(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public R(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 0

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->i(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/l;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/k0;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/n;->j(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/k0;->I(Lcom/google/firebase/firestore/n;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/e0;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/m0;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    sget-object v0, Lp1/p;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/firebase/firestore/k0;->e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/firestore/e0;",
            "Lcom/google/firebase/firestore/j<",
            "Lcom/google/firebase/firestore/m0;",
            ">;)",
            "Lcom/google/firebase/firestore/a0;"
        }
    .end annotation

    const-string v0, "Provided executor must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided MetadataChanges value must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided EventListener must not be null."

    invoke-static {p3, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/firebase/firestore/k0;->o(Lcom/google/firebase/firestore/e0;)Li1/p$a;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/firebase/firestore/k0;->f(Ljava/util/concurrent/Executor;Li1/p$a;Landroid/app/Activity;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/firebase/firestore/k0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    iget-object v3, p1, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, v3}, Li1/x0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object p1, p1, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v0}, Li1/x0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public varargs i([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 2

    const-string v0, "endAt"

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/k0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Li1/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1}, Li1/x0;->d(Li1/i;)Li1/x0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public varargs j([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;
    .locals 2

    const-string v0, "endBefore"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/firebase/firestore/k0;->g(Ljava/lang/String;[Ljava/lang/Object;Z)Li1/i;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1}, Li1/x0;->d(Li1/i;)Li1/x0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method public l(Lcom/google/firebase/firestore/q0;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/q0;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/m0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/k0;->D()V

    sget-object v0, Lcom/google/firebase/firestore/q0;->g:Lcom/google/firebase/firestore/q0;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {p1, v0}, Li1/l0;->x(Li1/x0;)Lo0/h;

    move-result-object p1

    sget-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/firestore/j0;

    invoke-direct {v1, p0}, Lcom/google/firebase/firestore/j0;-><init>(Lcom/google/firebase/firestore/k0;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/k0;->n(Lcom/google/firebase/firestore/q0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public m()Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-object v0
.end method

.method public s(J)Lcom/google/firebase/firestore/k0;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1, p2}, Li1/x0;->t(J)Li1/x0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. Query limit ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is invalid. Limit must be positive."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t(J)Lcom/google/firebase/firestore/k0;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/k0;

    iget-object v1, p0, Lcom/google/firebase/firestore/k0;->a:Li1/x0;

    invoke-virtual {v1, p1, p2}, Li1/x0;->u(J)Li1/x0;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/firestore/k0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/firestore/k0;-><init>(Li1/x0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Query. Query limitToLast ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is invalid. Limit must be positive."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u(Lcom/google/firebase/firestore/l;Lcom/google/firebase/firestore/k0$b;)Lcom/google/firebase/firestore/k0;
    .locals 1

    const-string v0, "Provided field path must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/l;->c()Ll1/r;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/k0;->v(Ll1/r;Lcom/google/firebase/firestore/k0$b;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1
.end method
