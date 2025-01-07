.class public final Lcom/google/firebase/firestore/v0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/f;


# direct methods
.method public constructor <init>(Ll1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    return-void
.end method

.method private a(Ljava/lang/Object;Li1/n1;)Ll1/t;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    const-string v1, "Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was "

    if-nez v0, :cond_1

    invoke-static {p1}, Lp1/o;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/firebase/firestore/v0;->d(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object p2

    invoke-virtual {p2}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v2, Lx1/x$c;->p:Lx1/x$c;

    if-ne v0, v2, :cond_0

    new-instance p1, Ll1/t;

    invoke-direct {p1, p2}, Ll1/t;-><init>(Lx1/x;)V

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "of type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lp1/g0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "an array"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Li1/m1;

    sget-object v1, Li1/q1;->h:Li1/q1;

    invoke-direct {v0, v1}, Li1/m1;-><init>(Li1/q1;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Li1/m1;->f()Li1/n1;

    move-result-object v4

    invoke-virtual {v4, v2}, Li1/n1;->c(I)Li1/n1;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Lcom/google/firebase/firestore/v0;->b(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private d(Ljava/lang/Object;Li1/n1;)Lx1/x;
    .locals 2

    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->f(Ljava/util/Map;Li1/n1;)Lx1/x;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/google/firebase/firestore/m;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/firebase/firestore/m;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->k(Lcom/google/firebase/firestore/m;Li1/n1;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object v0

    invoke-virtual {p2, v0}, Li1/n1;->a(Ll1/r;)V

    :cond_2
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Li1/n1;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Li1/n1;->g()Li1/q1;

    move-result-object v0

    sget-object v1, Li1/q1;->i:Li1/q1;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "Nested arrays are not supported"

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->e(Ljava/util/List;Li1/n1;)Lx1/x;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->j(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method private e(Ljava/util/List;Li1/n1;)Lx1/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Li1/n1;",
            ")",
            "Lx1/x;"
        }
    .end annotation

    invoke-static {}, Lx1/a;->d0()Lx1/a$b;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v1}, Li1/n1;->c(I)Li1/n1;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/google/firebase/firestore/v0;->d(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v2

    sget-object v3, Lcom/google/protobuf/e1;->f:Lcom/google/protobuf/e1;

    invoke-virtual {v2, v3}, Lx1/x$b;->O(Lcom/google/protobuf/e1;)Lx1/x$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v2

    check-cast v2, Lx1/x;

    :cond_0
    invoke-virtual {v0, v2}, Lx1/a$b;->D(Lx1/x;)Lx1/a$b;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx1/x$b;->D(Lx1/a$b;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1
.end method

.method private f(Ljava/util/Map;Li1/n1;)Lx1/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Li1/n1;",
            ")",
            "Lx1/x;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/e;->q()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->a(Ll1/r;)V

    :cond_0
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    invoke-static {}, Lx1/r;->V()Lx1/r;

    move-result-object p2

    invoke-virtual {p1, p2}, Lx1/x$b;->N(Lx1/r;)Lx1/x$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_1
    invoke-static {}, Lx1/r;->d0()Lx1/r$b;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v2}, Li1/n1;->d(Ljava/lang/String;)Li1/n1;

    move-result-object v3

    invoke-direct {p0, v1, v3}, Lcom/google/firebase/firestore/v0;->d(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v2, v1}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "Non-String Map key (%s) is not allowed"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_4
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lx1/x$b;->L(Lx1/r$b;)Lx1/x$b;

    move-result-object p1

    goto :goto_0
.end method

.method private j(Ljava/lang/Object;Li1/n1;)Lx1/x;
    .locals 6

    if-nez p1, :cond_0

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p1

    sget-object p2, Lcom/google/protobuf/e1;->f:Lcom/google/protobuf/e1;

    invoke-virtual {p1, p2}, Lx1/x$b;->O(Lcom/google/protobuf/e1;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Lx1/x$b;->J(J)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_2

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lx1/x$b;->J(J)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_3

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lx1/x$b;->H(D)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_4

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lx1/x$b;->H(D)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2, p1}, Lx1/x$b;->F(Z)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_5
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Lx1/x$b;->Q(Ljava/lang/String;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_6
    instance-of v0, p1, Ljava/util/Date;

    if-eqz v0, :cond_7

    new-instance p2, Lx0/o;

    check-cast p1, Ljava/util/Date;

    invoke-direct {p2, p1}, Lx0/o;-><init>(Ljava/util/Date;)V

    invoke-direct {p0, p2}, Lcom/google/firebase/firestore/v0;->m(Lx0/o;)Lx1/x;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p1, Lx0/o;

    if-eqz v0, :cond_8

    check-cast p1, Lx0/o;

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/v0;->m(Lx0/o;)Lx1/x;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p1, Lcom/google/firebase/firestore/y;

    if-eqz v0, :cond_9

    check-cast p1, Lcom/google/firebase/firestore/y;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    invoke-static {}, Lb2/a;->Z()Lb2/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/y;->g()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb2/a$b;->B(D)Lb2/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/firestore/y;->h()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb2/a$b;->D(D)Lb2/a$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx1/x$b;->I(Lb2/a$b;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_9
    instance-of v0, p1, Lcom/google/firebase/firestore/a;

    if-eqz v0, :cond_a

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    check-cast p1, Lcom/google/firebase/firestore/a;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/a;->i()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx1/x$b;->G(Lcom/google/protobuf/j;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_a
    instance-of v0, p1, Lcom/google/firebase/firestore/h;

    if-eqz v0, :cond_d

    check-cast p1, Lcom/google/firebase/firestore/h;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->k()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->k()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v0

    iget-object v5, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    invoke-virtual {v0, v5}, Ll1/f;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_0

    :cond_b
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {v0}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v5

    aput-object v5, p1, v3

    invoke-virtual {v0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v2

    iget-object v0, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    invoke-virtual {v0}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    iget-object v0, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    invoke-virtual {v0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v4

    const-string v0, "Document reference is for database %s/%s but should be for database %s/%s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_c
    :goto_0
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p2

    new-array v0, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    invoke-virtual {v4}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    iget-object v3, p0, Lcom/google/firebase/firestore/v0;->a:Ll1/f;

    invoke-virtual {v3}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->m()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "projects/%s/databases/%s/documents/%s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx1/x$b;->P(Ljava/lang/String;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_e

    const-string p1, "Arrays are not supported; use a List instead"

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lp1/g0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method private k(Lcom/google/firebase/firestore/m;Li1/n1;)V
    .locals 3

    invoke-virtual {p2}, Li1/n1;->j()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object v0

    if-eqz v0, :cond_8

    instance-of v0, p1, Lcom/google/firebase/firestore/m$c;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Li1/n1;->g()Li1/q1;

    move-result-object p1

    sget-object v0, Li1/q1;->f:Li1/q1;

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->a(Ll1/r;)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Li1/n1;->g()Li1/q1;

    move-result-object p1

    sget-object v0, Li1/q1;->g:Li1/q1;

    if-ne p1, v0, :cond_2

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "FieldValue.delete() at the top level should have already been handled."

    invoke-static {v1, v0, p1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "FieldValue.delete() can only appear at the top level of your update data"

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_2
    const-string p1, "FieldValue.delete() can only be used with update() and set() with SetOptions.merge()"

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3
    instance-of v0, p1, Lcom/google/firebase/firestore/m$e;

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    invoke-static {}, Lm1/n;->d()Lm1/n;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, p1, v0}, Li1/n1;->b(Ll1/r;Lm1/p;)V

    goto :goto_3

    :cond_4
    instance-of v0, p1, Lcom/google/firebase/firestore/m$b;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/google/firebase/firestore/m$b;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m$b;->h()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/v0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lm1/a$b;

    invoke-direct {v0, p1}, Lm1/a$b;-><init>(Ljava/util/List;)V

    :goto_2
    invoke-virtual {p2}, Li1/n1;->h()Ll1/r;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lcom/google/firebase/firestore/m$a;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/google/firebase/firestore/m$a;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m$a;->h()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/v0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lm1/a$a;

    invoke-direct {v0, p1}, Lm1/a$a;-><init>(Ljava/util/List;)V

    goto :goto_2

    :cond_6
    instance-of v0, p1, Lcom/google/firebase/firestore/m$d;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/google/firebase/firestore/m$d;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m$d;->h()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/v0;->h(Ljava/lang/Object;)Lx1/x;

    move-result-object p1

    new-instance v0, Lm1/j;

    invoke-direct {v0, p1}, Lm1/j;-><init>(Lx1/x;)V

    goto :goto_2

    :goto_3
    return-void

    :cond_7
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lp1/g0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v2

    const-string p1, "Unknown FieldValue type: %s"

    invoke-static {p1, p2}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_8
    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m;->d()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "%s() is not currently supported inside arrays"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_9
    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/m;->d()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "%s() can only be used with set() and update()"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Li1/n1;->f(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method private m(Lx0/o;)Lx1/x;
    .locals 5

    invoke-virtual {p1}, Lx0/o;->g()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    mul-int/lit16 v0, v0, 0x3e8

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/t1;->Z()Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {p1}, Lx0/o;->i()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/t1$b;->D(J)Lcom/google/protobuf/t1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/protobuf/t1$b;->B(I)Lcom/google/protobuf/t1$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx1/x$b;->R(Lcom/google/protobuf/t1$b;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Object;Li1/n1;)Lx1/x;
    .locals 0

    invoke-static {p1}, Lp1/o;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->d(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Object;Lm1/d;)Li1/o1;
    .locals 4

    new-instance v0, Li1/m1;

    sget-object v1, Li1/q1;->f:Li1/q1;

    invoke-direct {v0, v1}, Li1/m1;-><init>(Li1/q1;)V

    invoke-virtual {v0}, Li1/m1;->f()Li1/n1;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/v0;->a(Ljava/lang/Object;Li1/n1;)Ll1/t;

    move-result-object p1

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lm1/d;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/r;

    invoke-virtual {v0, v2}, Li1/m1;->d(Ll1/r;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Field \'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll1/e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' is specified in your field mask but not in your input data."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Li1/m1;->h(Ll1/t;Lm1/d;)Li1/o1;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0, p1}, Li1/m1;->g(Ll1/t;)Li1/o1;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Object;)Lx1/x;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/firestore/v0;->i(Ljava/lang/Object;Z)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Object;Z)Lx1/x;
    .locals 4

    new-instance v0, Li1/m1;

    if-eqz p2, :cond_0

    sget-object p2, Li1/q1;->i:Li1/q1;

    goto :goto_0

    :cond_0
    sget-object p2, Li1/q1;->h:Li1/q1;

    :goto_0
    invoke-direct {v0, p2}, Li1/m1;-><init>(Li1/q1;)V

    invoke-virtual {v0}, Li1/m1;->f()Li1/n1;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/firestore/v0;->b(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-array v2, p2, [Ljava/lang/Object;

    const-string v3, "Parsed data should not be null."

    invoke-static {v1, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Li1/m1;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v1, "Field transforms should have been disallowed."

    invoke-static {v0, v1, p2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public l(Ljava/lang/Object;)Li1/o1;
    .locals 2

    new-instance v0, Li1/m1;

    sget-object v1, Li1/q1;->e:Li1/q1;

    invoke-direct {v0, v1}, Li1/m1;-><init>(Li1/q1;)V

    invoke-virtual {v0}, Li1/m1;->f()Li1/n1;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/google/firebase/firestore/v0;->a(Ljava/lang/Object;Li1/n1;)Ll1/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Li1/m1;->i(Ll1/t;)Li1/o1;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/util/Map;)Li1/p1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Li1/p1;"
        }
    .end annotation

    const-string v0, "Provided update data must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Li1/m1;

    sget-object v1, Li1/q1;->g:Li1/q1;

    invoke-direct {v0, v1}, Li1/m1;-><init>(Li1/q1;)V

    invoke-virtual {v0}, Li1/m1;->f()Li1/n1;

    move-result-object v1

    new-instance v2, Ll1/t;

    invoke-direct {v2}, Ll1/t;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/google/firebase/firestore/l;->b(Ljava/lang/String;)Lcom/google/firebase/firestore/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/firebase/firestore/l;->c()Ll1/r;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lcom/google/firebase/firestore/m$c;

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Li1/n1;->a(Ll1/r;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v4}, Li1/n1;->e(Ll1/r;)Li1/n1;

    move-result-object v5

    invoke-virtual {p0, v3, v5}, Lcom/google/firebase/firestore/v0;->b(Ljava/lang/Object;Li1/n1;)Lx1/x;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v4}, Li1/n1;->a(Ll1/r;)V

    invoke-virtual {v2, v4, v3}, Ll1/t;->l(Ll1/r;Lx1/x;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Li1/m1;->j(Ll1/t;)Li1/p1;

    move-result-object p1

    return-object p1
.end method
