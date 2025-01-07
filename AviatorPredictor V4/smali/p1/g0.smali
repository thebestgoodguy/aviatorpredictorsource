.class public Lp1/g0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/util/Random;

.field private static final b:Lo0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/a<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lp1/g0;->a:Ljava/util/Random;

    sget-object v0, Lp1/f0;->a:Lp1/f0;

    sput-object v0, Lp1/g0;->b:Lo0/a;

    return-void
.end method

.method public static A()Lo0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/a<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lp1/g0;->b:Lo0/a;

    return-object v0
.end method

.method public static synthetic a(Ljava/lang/RuntimeException;)V
    .locals 0

    invoke-static {p0}, Lp1/g0;->t(Ljava/lang/RuntimeException;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    invoke-static {p0, p1}, Lp1/g0;->u(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Ljava/util/Comparator;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lp1/g0;->v(Ljava/util/Comparator;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lo0/h;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Lp1/g0;->w(Lo0/h;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/util/Iterator;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static f()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "TT;>;>()",
            "Ljava/util/Comparator<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lp1/e0;->e:Lp1/e0;

    return-object v0
.end method

.method public static g(ZZ)I
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static h([B[B)I
    .locals 4

    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    aget-byte v3, p1, v1

    and-int/lit16 v3, v3, 0xff

    if-ge v2, v3, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le v2, v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method public static i(Lcom/google/protobuf/j;Lcom/google/protobuf/j;)I
    .locals 4

    invoke-virtual {p0}, Lcom/google/protobuf/j;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/protobuf/j;->r(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {p1, v1}, Lcom/google/protobuf/j;->r(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    if-ge v2, v3, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le v2, v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/j;->size()I

    move-result p0

    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result p1

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method public static j(DD)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp0/a;->c(DD)I

    move-result p0

    return p0
.end method

.method public static k(II)I
    .locals 0

    if-ge p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static l(JJ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp0/a;->a(JJ)I

    move-result p0

    return p0
.end method

.method public static m(DJ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp0/a;->b(DJ)I

    move-result p0

    return p0
.end method

.method private static n(Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 1

    instance-of v0, p0, Lb3/g1;

    if-eqz v0, :cond_0

    check-cast p0, Lb3/g1;

    invoke-virtual {p0}, Lb3/g1;->a()Lb3/f1;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lp1/g0;->r(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lb3/h1;

    if-eqz v0, :cond_1

    check-cast p0, Lb3/h1;

    invoke-virtual {p0}, Lb3/h1;->a()Lb3/f1;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static o(Ljava/lang/RuntimeException;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, p0}, Lp1/b0;-><init>(Ljava/lang/RuntimeException;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static p(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Lp1/n;Lp1/n;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;",
            "Ljava/util/Iterator<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "-TT;>;",
            "Lp1/n<",
            "TT;>;",
            "Lp1/n<",
            "TT;>;)V"
        }
    .end annotation

    :cond_0
    invoke-static {p0}, Lp1/g0;->e(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {p1}, Lp1/g0;->e(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    return-void

    :cond_2
    :goto_2
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    invoke-interface {p2, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_3

    goto :goto_4

    :cond_3
    if-lez v4, :cond_6

    goto :goto_3

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v2, 0x1

    :cond_6
    const/4 v3, 0x0

    :goto_4
    if-eqz v2, :cond_7

    invoke-interface {p3, v1}, Lp1/n;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_7
    if-eqz v3, :cond_0

    invoke-interface {p4, v0}, Lp1/n;->accept(Ljava/lang/Object;)V

    invoke-static {p0}, Lp1/g0;->e(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1
.end method

.method public static q(Ljava/util/SortedSet;Ljava/util/SortedSet;Lp1/n;Lp1/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "TT;>;>(",
            "Ljava/util/SortedSet<",
            "TT;>;",
            "Ljava/util/SortedSet<",
            "TT;>;",
            "Lp1/n<",
            "TT;>;",
            "Lp1/n<",
            "TT;>;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lp1/d0;->e:Lp1/d0;

    :goto_0
    invoke-static {v0, p1, p0, p2, p3}, Lp1/g0;->p(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Lp1/n;Lp1/n;)V

    return-void
.end method

.method public static r(Lb3/f1;)Lcom/google/firebase/firestore/u;
    .locals 3

    invoke-virtual {p0}, Lb3/f1;->c()Lb3/g1;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/firestore/u;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object p0

    invoke-virtual {p0}, Lb3/f1$b;->h()I

    move-result p0

    invoke-static {p0}, Lcom/google/firebase/firestore/u$a;->g(I)Lcom/google/firebase/firestore/u$a;

    move-result-object p0

    invoke-direct {v1, v2, p0, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static s(Ljava/util/Map;ILjava/util/Comparator;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;I",
            "Ljava/util/Comparator<",
            "TV;>;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-gt v0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p0, Lp1/c0;

    invoke-direct {p0, p2}, Lp1/c0;-><init>(Ljava/util/Comparator;)V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private static synthetic t(Ljava/lang/RuntimeException;)V
    .locals 0

    throw p0
.end method

.method private static synthetic u(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static synthetic v(Ljava/util/Comparator;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I
    .locals 0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static synthetic w(Lo0/h;)Ljava/lang/Void;
    .locals 3

    invoke-virtual {p0}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    invoke-static {p0}, Lp1/g0;->n(Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object p0

    instance-of v0, p0, Lcom/google/firebase/firestore/u;

    if-eqz v0, :cond_1

    throw p0

    :cond_1
    new-instance v0, Lcom/google/firebase/firestore/u;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/firestore/u$a;->h:Lcom/google/firebase/firestore/u$a;

    invoke-direct {v0, v1, v2, p0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static y(Lcom/google/protobuf/j;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lcom/google/protobuf/j;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lcom/google/protobuf/j;->r(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    ushr-int/lit8 v4, v3, 0x4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    invoke-static {v3, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static z(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method
