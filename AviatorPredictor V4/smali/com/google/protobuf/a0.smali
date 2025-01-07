.class public abstract Lcom/google/protobuf/a0;
.super Lcom/google/protobuf/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/a0$b;,
        Lcom/google/protobuf/a0$e;,
        Lcom/google/protobuf/a0$d;,
        Lcom/google/protobuf/a0$c;,
        Lcom/google/protobuf/a0$a;,
        Lcom/google/protobuf/a0$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/a0<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/protobuf/a0$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/protobuf/a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/a0<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected memoizedSerializedSize:I

.field protected unknownFields:Lcom/google/protobuf/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/protobuf/a0;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a;-><init>()V

    invoke-static {}, Lcom/google/protobuf/w1;->c()Lcom/google/protobuf/w1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/a0;->unknownFields:Lcom/google/protobuf/w1;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    return-void
.end method

.method protected static A()Lcom/google/protobuf/d0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/protobuf/d0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/protobuf/j1;->q()Lcom/google/protobuf/j1;

    move-result-object v0

    return-object v0
.end method

.method static B(Ljava/lang/Class;)Lcom/google/protobuf/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/protobuf/a0;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/google/protobuf/z1;->l(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->D()Lcom/google/protobuf/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/protobuf/a0;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method static varargs E(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static final F(Lcom/google/protobuf/a0;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->e:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/n1;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/protobuf/a0$f;->f:Lcom/google/protobuf/a0$f;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Lcom/google/protobuf/a0;->x(Lcom/google/protobuf/a0$f;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/d0$i<",
            "TE;>;)",
            "Lcom/google/protobuf/d0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Lcom/google/protobuf/d0$i;->k(I)Lcom/google/protobuf/d0$i;

    move-result-object p0

    return-object p0
.end method

.method protected static J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/protobuf/k1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/k1;-><init>(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static L(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;)Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;",
            "Lcom/google/protobuf/j;",
            ")TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/protobuf/r;->b()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/a0;->M(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/protobuf/a0;->s(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0;

    move-result-object p0

    return-object p0
.end method

.method protected static M(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;",
            "Lcom/google/protobuf/j;",
            "Lcom/google/protobuf/r;",
            ")TT;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/protobuf/a0;->O(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/protobuf/a0;->s(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0;

    move-result-object p0

    return-object p0
.end method

.method protected static N(Lcom/google/protobuf/a0;[B)Lcom/google/protobuf/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;[B)TT;"
        }
    .end annotation

    array-length v0, p1

    invoke-static {}, Lcom/google/protobuf/r;->b()Lcom/google/protobuf/r;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/protobuf/a0;->Q(Lcom/google/protobuf/a0;[BIILcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/protobuf/a0;->s(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0;

    move-result-object p0

    return-object p0
.end method

.method private static O(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;",
            "Lcom/google/protobuf/j;",
            "Lcom/google/protobuf/r;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/j;->H()Lcom/google/protobuf/k;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/protobuf/a0;->P(Lcom/google/protobuf/a0;Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/k;->a(I)V
    :try_end_1
    .catch Lcom/google/protobuf/e0; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Lcom/google/protobuf/e0; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p0

    throw p0
.end method

.method static P(Lcom/google/protobuf/a0;Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;",
            "Lcom/google/protobuf/k;",
            "Lcom/google/protobuf/r;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->h:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/a0;

    :try_start_0
    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/protobuf/l;->S(Lcom/google/protobuf/k;)Lcom/google/protobuf/l;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lcom/google/protobuf/n1;->c(Ljava/lang/Object;Lcom/google/protobuf/l1;Lcom/google/protobuf/r;)V

    invoke-interface {v0, p0}, Lcom/google/protobuf/n1;->i(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/protobuf/e0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/e0;

    throw p0

    :cond_0
    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/protobuf/e0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/e0;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/protobuf/e0;

    invoke-direct {p2, p1}, Lcom/google/protobuf/e0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/protobuf/e0;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/protobuf/e0;

    invoke-direct {p2, p1}, Lcom/google/protobuf/e0;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0
.end method

.method static Q(Lcom/google/protobuf/a0;[BIILcom/google/protobuf/r;)Lcom/google/protobuf/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;[BII",
            "Lcom/google/protobuf/r;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->h:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/a0;

    :try_start_0
    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v6

    add-int v4, p2, p3

    new-instance v5, Lcom/google/protobuf/f$b;

    invoke-direct {v5, p4}, Lcom/google/protobuf/f$b;-><init>(Lcom/google/protobuf/r;)V

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/protobuf/n1;->e(Ljava/lang/Object;[BIILcom/google/protobuf/f$b;)V

    invoke-interface {v6, p0}, Lcom/google/protobuf/n1;->i(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/google/protobuf/e0;->m()Lcom/google/protobuf/e0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/protobuf/e0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/e0;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/protobuf/e0;

    invoke-direct {p2, p1}, Lcom/google/protobuf/e0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/protobuf/e0;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/protobuf/e0;

    invoke-direct {p2, p1}, Lcom/google/protobuf/e0;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0
.end method

.method protected static R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static s(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/protobuf/a0<",
            "TT;*>;>(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/a;->p()Lcom/google/protobuf/u1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/u1;->a()Lcom/google/protobuf/e0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/e0;->k(Lcom/google/protobuf/v0;)Lcom/google/protobuf/e0;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method protected static z()Lcom/google/protobuf/d0$g;
    .locals 1

    invoke-static {}, Lcom/google/protobuf/c0;->t()Lcom/google/protobuf/c0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final D()Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->j:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0;

    return-object v0
.end method

.method protected G()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/n1;->i(Ljava/lang/Object;)V

    return-void
.end method

.method public final I()Lcom/google/protobuf/a0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->i:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0$a;

    return-object v0
.end method

.method public final S()Lcom/google/protobuf/a0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->i:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0$a;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/a0$a;->z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    return-object v0
.end method

.method public b()I
    .locals 2

    iget v0, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/n1;->f(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    :cond_0
    iget v0, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    return v0
.end method

.method public bridge synthetic c()Lcom/google/protobuf/v0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->I()Lcom/google/protobuf/a0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/protobuf/v0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->D()Lcom/google/protobuf/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/protobuf/v0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->S()Lcom/google/protobuf/a0$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    check-cast p1, Lcom/google/protobuf/a0;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/n1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final h()Lcom/google/protobuf/f1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/f1<",
            "TMessageType;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->k:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/f1;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/n1;->j(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/protobuf/a0;->F(Lcom/google/protobuf/a0;Z)Z

    move-result v0

    return v0
.end method

.method public l(Lcom/google/protobuf/m;)V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/protobuf/n;->P(Lcom/google/protobuf/m;)Lcom/google/protobuf/n;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/n1;->h(Ljava/lang/Object;Lcom/google/protobuf/c2;)V

    return-void
.end method

.method m()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    return v0
.end method

.method q(I)V
    .locals 0

    iput p1, p0, Lcom/google/protobuf/a0;->memoizedSerializedSize:I

    return-void
.end method

.method r()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/protobuf/a0$f;->g:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/protobuf/x0;->e(Lcom/google/protobuf/v0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final u()Lcom/google/protobuf/a0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Lcom/google/protobuf/a0<",
            "TMessageType;TBuilderType;>;BuilderType:",
            "Lcom/google/protobuf/a0$a<",
            "TMessageType;TBuilderType;>;>()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/protobuf/a0$f;->i:Lcom/google/protobuf/a0$f;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0$a;

    return-object v0
.end method

.method protected final v(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Lcom/google/protobuf/a0<",
            "TMessageType;TBuilderType;>;BuilderType:",
            "Lcom/google/protobuf/a0$a<",
            "TMessageType;TBuilderType;>;>(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/a0$a;->z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    move-result-object p1

    return-object p1
.end method

.method protected w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/protobuf/a0;->y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected x(Lcom/google/protobuf/a0$f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/a0;->y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
