.class final Lk1/y1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/l;


# static fields
.field private static final k:Ljava/lang/String; = "y1"

.field private static final l:[B


# instance fields
.field private final a:Lk1/u2;

.field private final b:Lk1/o;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li1/c1;",
            "Ljava/util/List<",
            "Li1/c1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lk1/q0$a;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ll1/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ll1/q;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:I

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lk1/y1;->l:[B

    return-void
.end method

.method constructor <init>(Lk1/u2;Lk1/o;Lg1/j;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/y1;->d:Ljava/util/Map;

    new-instance v0, Lk1/q0$a;

    invoke-direct {v0}, Lk1/q0$a;-><init>()V

    iput-object v0, p0, Lk1/y1;->e:Lk1/q0$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/y1;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/PriorityQueue;

    sget-object v1, Lk1/q1;->e:Lk1/q1;

    const/16 v2, 0xa

    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v0, p0, Lk1/y1;->g:Ljava/util/Queue;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v0, -0x1

    iput v0, p0, Lk1/y1;->i:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lk1/y1;->j:J

    iput-object p1, p0, Lk1/y1;->a:Lk1/u2;

    iput-object p2, p0, Lk1/y1;->b:Lk1/o;

    invoke-virtual {p3}, Lg1/j;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lg1/j;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lk1/y1;->c:Ljava/lang/String;

    return-void
.end method

.method private A(IILjava/util/List;[Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;[",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")[",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    div-int v0, p1, v0

    mul-int/lit8 v1, p1, 0x5

    const/4 v2, 0x0

    if-eqz p6, :cond_1

    array-length v3, p6

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    add-int/2addr v1, v3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v3, p1, :cond_3

    add-int/lit8 v5, v4, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v4

    add-int/lit8 v4, v5, 0x1

    iget-object v6, p0, Lk1/y1;->c:Ljava/lang/String;

    aput-object v6, v1, v5

    add-int/lit8 v5, v4, 0x1

    if-eqz p3, :cond_2

    div-int v6, v3, v0

    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx1/x;

    invoke-direct {p0, v6}, Lk1/y1;->x(Lx1/x;)[B

    move-result-object v6

    goto :goto_3

    :cond_2
    sget-object v6, Lk1/y1;->l:[B

    :goto_3
    aput-object v6, v1, v4

    add-int/lit8 v4, v5, 0x1

    rem-int v6, v3, v0

    aget-object v7, p4, v6

    aput-object v7, v1, v5

    add-int/lit8 v5, v4, 0x1

    aget-object v6, p5, v6

    aput-object v6, v1, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_2

    :cond_3
    if-eqz p6, :cond_4

    array-length p1, p6

    :goto_4
    if-ge v2, p1, :cond_4

    aget-object p2, p6, v2

    add-int/lit8 p3, v4, 0x1

    aput-object p2, v1, v4

    add-int/lit8 v2, v2, 0x1

    move v4, p3

    goto :goto_4

    :cond_4
    return-object v1
.end method

.method private B(Li1/c1;ILjava/util/List;[Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/c1;",
            "I",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;[",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")[",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v6, p8

    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    move-object v4, p4

    array-length v1, v4

    move-object v5, p6

    array-length v2, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    mul-int v1, v1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT document_key, directional_value FROM index_entries "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "WHERE index_id = ? AND uid = ? "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "AND array_value = ? "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "AND directional_value "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, p5

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ? "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, p7

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " UNION "

    invoke-static {v0, v1, v2}, Lp1/g0;->x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-eqz v6, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SELECT document_key, directional_value FROM ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v0, ") WHERE directional_value NOT IN ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v6

    const-string v3, "?"

    const-string v7, ", "

    invoke-static {v3, v0, v7}, Lp1/g0;->x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object v7, v0

    :goto_1
    move-object v0, p0

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lk1/y1;->A(IILjava/util/List;[Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private C(Ljava/util/List;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj1/d;",
            ">;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/d;

    invoke-virtual {v2}, Lj1/d;->c()[B

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private D(Ll1/l;Ll1/q;)Ljava/util/SortedSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            "Ll1/q;",
            ")",
            "Ljava/util/SortedSet<",
            "Lj1/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    iget-object v1, p0, Lk1/y1;->a:Lk1/u2;

    const-string v2, "SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?"

    invoke-virtual {v1, v2}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Ll1/q;->f()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Ll1/l;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lk1/y1;->c:Ljava/lang/String;

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v1

    new-instance v2, Lk1/u1;

    invoke-direct {v2, v0, p2, p1}, Lk1/u1;-><init>(Ljava/util/SortedSet;Ll1/q;Ll1/l;)V

    invoke-virtual {v1, v2}, Lk1/u2$d;->e(Lp1/n;)I

    return-object v0
.end method

.method private E(Li1/c1;)Ll1/q;
    .locals 5

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ll1/x;

    invoke-direct {v0, p1}, Ll1/x;-><init>(Li1/c1;)V

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li1/c1;->n()Ll1/u;

    move-result-object p1

    invoke-virtual {p1}, Ll1/e;->n()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lk1/y1;->F(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return-object v2

    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/q;

    invoke-virtual {v0, v1}, Ll1/x;->d(Ll1/q;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ll1/q;->h()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2}, Ll1/q;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v3, v4, :cond_2

    :cond_3
    move-object v2, v1

    goto :goto_1

    :cond_4
    return-object v2
.end method

.method private G(Ljava/util/Collection;)Ll1/q$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ll1/q;",
            ">;)",
            "Ll1/q$a;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Found empty index group when looking for least recent index offset."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/q;

    invoke-virtual {v0}, Ll1/q;->g()Ll1/q$b;

    move-result-object v0

    invoke-virtual {v0}, Ll1/q$b;->c()Ll1/q$a;

    move-result-object v0

    invoke-virtual {v0}, Ll1/q$a;->p()I

    move-result v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/q;

    invoke-virtual {v2}, Ll1/q;->g()Ll1/q$b;

    move-result-object v2

    invoke-virtual {v2}, Ll1/q$b;->c()Ll1/q$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll1/q$a;->g(Ll1/q$a;)I

    move-result v3

    if-gez v3, :cond_0

    move-object v0, v2

    :cond_0
    invoke-virtual {v2}, Ll1/q$a;->p()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ll1/q$a;->q()Ll1/w;

    move-result-object p1

    invoke-virtual {v0}, Ll1/q$a;->n()Ll1/l;

    move-result-object v0

    invoke-static {p1, v0, v1}, Ll1/q$a;->h(Ll1/w;Ll1/l;I)Ll1/q$a;

    move-result-object p1

    return-object p1
.end method

.method private H(Li1/c1;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/c1;",
            ")",
            "Ljava/util/List<",
            "Li1/c1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/y1;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/y1;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Li1/l;

    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object v2

    sget-object v3, Li1/l$a;->f:Li1/l$a;

    invoke-direct {v1, v2, v3}, Li1/l;-><init>(Ljava/util/List;Li1/l$a;)V

    invoke-static {v1}, Lp1/w;->h(Li1/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li1/r;

    new-instance v12, Li1/c1;

    invoke-virtual {p1}, Li1/c1;->n()Ll1/u;

    move-result-object v4

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Li1/r;->b()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p1}, Li1/c1;->m()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Li1/c1;->j()J

    move-result-wide v8

    invoke-virtual {p1}, Li1/c1;->p()Li1/i;

    move-result-object v10

    invoke-virtual {p1}, Li1/c1;->f()Li1/i;

    move-result-object v11

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, Li1/c1;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/i;Li1/i;)V

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lk1/y1;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private I(Li1/c1;Ll1/r;)Z
    .locals 2

    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/r;

    instance-of v1, v0, Li1/q;

    if-eqz v1, :cond_0

    check-cast v0, Li1/q;

    invoke-virtual {v0}, Li1/q;->g()Ll1/r;

    move-result-object v1

    invoke-virtual {v1, p2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Li1/q;->h()Li1/q$b;

    move-result-object v0

    sget-object v1, Li1/q$b;->n:Li1/q$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Li1/q$b;->o:Li1/q$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private static synthetic J(Ljava/util/ArrayList;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk1/f;->b(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic K(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic L(Ljava/util/SortedSet;Ll1/q;Ll1/l;Landroid/database/Cursor;)V
    .locals 2

    invoke-virtual {p1}, Ll1/q;->f()I

    move-result p1

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p3

    invoke-static {p1, p2, v0, p3}, Lj1/e;->g(ILl1/l;[B[B)Lj1/e;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic M(Ll1/q;Ll1/q;)I
    .locals 4

    invoke-virtual {p0}, Ll1/q;->g()Ll1/q$b;

    move-result-object v0

    invoke-virtual {v0}, Ll1/q$b;->d()J

    move-result-wide v0

    invoke-virtual {p1}, Ll1/q;->g()Ll1/q$b;

    move-result-object v2

    invoke-virtual {v2}, Ll1/q$b;->d()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll1/q;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ll1/q;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method private static synthetic N(Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 8

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    new-instance v3, Ll1/w;

    new-instance v4, Lx0/o;

    const/4 v5, 0x2

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    const/4 v7, 0x3

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-direct {v4, v5, v6, v7}, Lx0/o;-><init>(JI)V

    invoke-direct {v3, v4}, Ll1/w;-><init>(Lx0/o;)V

    const/4 v4, 0x4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lk1/f;->b(Ljava/lang/String;)Ll1/u;

    move-result-object v4

    invoke-static {v4}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object v4

    const/4 v5, 0x5

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v2, v3, v4, p1}, Ll1/q$b;->b(JLl1/w;Ll1/l;I)Ll1/q$b;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private synthetic O(Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lk1/y1;->b:Lk1/o;

    const/4 v4, 0x2

    invoke-interface {p2, v4}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2

    invoke-static {p2}, Lv1/a;->V([B)Lv1/a;

    move-result-object p2

    invoke-virtual {v3, p2}, Lk1/o;->c(Lv1/a;)Ljava/util/List;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/q$b;

    goto :goto_0

    :cond_0
    sget-object p1, Ll1/q;->a:Ll1/q$b;

    :goto_0
    invoke-static {v1, v2, p2, p1}, Ll1/q;->b(ILjava/lang/String;Ljava/util/List;Ll1/q$b;)Ll1/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lk1/y1;->R(Ll1/q;)V
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to decode index: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private synthetic P(Ll1/i;Lj1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y1;->s(Ll1/i;Lj1/e;)V

    return-void
.end method

.method private synthetic Q(Ll1/i;Lj1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y1;->u(Ll1/i;Lj1/e;)V

    return-void
.end method

.method private R(Ll1/q;)V
    .locals 4

    iget-object v0, p0, Lk1/y1;->f:Ljava/util/Map;

    invoke-virtual {p1}, Ll1/q;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lk1/y1;->f:Ljava/util/Map;

    invoke-virtual {p1}, Ll1/q;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Ll1/q;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/q;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lk1/y1;->g:Ljava/util/Queue;

    invoke-interface {v2, v1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Ll1/q;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lk1/y1;->g:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lk1/y1;->i:I

    invoke-virtual {p1}, Ll1/q;->f()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lk1/y1;->i:I

    iget-wide v0, p0, Lk1/y1;->j:J

    invoke-virtual {p1}, Ll1/q;->g()Ll1/q$b;

    move-result-object p1

    invoke-virtual {p1}, Ll1/q$b;->d()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lk1/y1;->j:J

    return-void
.end method

.method private S(Ll1/i;Ljava/util/SortedSet;Ljava/util/SortedSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/i;",
            "Ljava/util/SortedSet<",
            "Lj1/e;",
            ">;",
            "Ljava/util/SortedSet<",
            "Lj1/e;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lk1/y1;->k:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Updating index entries for document \'%s\'"

    invoke-static {v0, v2, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lk1/x1;

    invoke-direct {v0, p0, p1}, Lk1/x1;-><init>(Lk1/y1;Ll1/i;)V

    new-instance v1, Lk1/w1;

    invoke-direct {v1, p0, p1}, Lk1/w1;-><init>(Lk1/y1;Ll1/i;)V

    invoke-static {p2, p3, v0, v1}, Lp1/g0;->q(Ljava/util/SortedSet;Ljava/util/SortedSet;Lp1/n;Lp1/n;)V

    return-void
.end method

.method public static synthetic k(Lk1/y1;Ll1/i;Lj1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y1;->Q(Ll1/i;Lj1/e;)V

    return-void
.end method

.method public static synthetic l(Lk1/y1;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y1;->O(Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic m(Ljava/util/ArrayList;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/y1;->J(Ljava/util/ArrayList;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic n(Ll1/q;Ll1/q;)I
    .locals 0

    invoke-static {p0, p1}, Lk1/y1;->M(Ll1/q;Ll1/q;)I

    move-result p0

    return p0
.end method

.method public static synthetic o(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/y1;->K(Ljava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic p(Lk1/y1;Ll1/i;Lj1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y1;->P(Ll1/i;Lj1/e;)V

    return-void
.end method

.method public static synthetic q(Ljava/util/SortedSet;Ll1/q;Ll1/l;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lk1/y1;->L(Ljava/util/SortedSet;Ll1/q;Ll1/l;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic r(Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/y1;->N(Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private s(Ll1/i;Lj1/e;)V
    .locals 4

    iget-object v0, p0, Lk1/y1;->a:Lk1/u2;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2}, Lj1/e;->n()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lk1/y1;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lj1/e;->h()[B

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lj1/e;->i()[B

    move-result-object p2

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p1}, Ll1/l;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    const-string p1, "INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private t(Ll1/i;Ll1/q;)Ljava/util/SortedSet;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/i;",
            "Ll1/q;",
            ")",
            "Ljava/util/SortedSet<",
            "Lj1/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-direct {p0, p2, p1}, Lk1/y1;->w(Ll1/q;Ll1/i;)[B

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Ll1/q;->c()Ll1/q$c;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll1/q$c;->h()Ll1/r;

    move-result-object v2

    invoke-interface {p1, v2}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object v2

    invoke-static {v2}, Ll1/y;->t(Lx1/x;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lx1/x;->f0()Lx1/a;

    move-result-object v2

    invoke-virtual {v2}, Lx1/a;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/x;

    invoke-virtual {p2}, Ll1/q;->f()I

    move-result v4

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v5

    invoke-direct {p0, v3}, Lk1/y1;->x(Lx1/x;)[B

    move-result-object v3

    invoke-static {v4, v5, v3, v1}, Lj1/e;->g(ILl1/l;[B[B)Lj1/e;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ll1/q;->f()I

    move-result p2

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [B

    invoke-static {p2, p1, v2, v1}, Lj1/e;->g(ILl1/l;[B[B)Lj1/e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method private u(Ll1/i;Lj1/e;)V
    .locals 4

    iget-object v0, p0, Lk1/y1;->a:Lk1/u2;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2}, Lj1/e;->n()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lk1/y1;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lj1/e;->h()[B

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lj1/e;->i()[B

    move-result-object p2

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p1}, Ll1/l;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    const-string p1, "DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private v(Ll1/q;Li1/c1;Li1/i;)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p3}, Li1/i;->b()Ljava/util/List;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lk1/y1;->y(Ll1/q;Li1/c1;Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private w(Ll1/q;Ll1/i;)[B
    .locals 4

    new-instance v0, Lj1/d;

    invoke-direct {v0}, Lj1/d;-><init>()V

    invoke-virtual {p1}, Ll1/q;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/q$c;

    invoke-virtual {v1}, Ll1/q$c;->h()Ll1/r;

    move-result-object v2

    invoke-interface {p2, v2}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v1}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj1/d;->b(Ll1/q$c$a;)Lj1/b;

    move-result-object v1

    sget-object v3, Lj1/c;->a:Lj1/c;

    invoke-virtual {v3, v2, v1}, Lj1/c;->e(Lx1/x;Lj1/b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lj1/d;->c()[B

    move-result-object p1

    return-object p1
.end method

.method private x(Lx1/x;)[B
    .locals 3

    new-instance v0, Lj1/d;

    invoke-direct {v0}, Lj1/d;-><init>()V

    sget-object v1, Lj1/c;->a:Lj1/c;

    sget-object v2, Ll1/q$c$a;->e:Ll1/q$c$a;

    invoke-virtual {v0, v2}, Lj1/d;->b(Ll1/q$c$a;)Lj1/b;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lj1/c;->e(Lx1/x;Lj1/b;)V

    invoke-virtual {v0}, Lj1/d;->c()[B

    move-result-object p1

    return-object p1
.end method

.method private y(Ll1/q;Li1/c1;Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/q;",
            "Li1/c1;",
            "Ljava/util/Collection<",
            "Lx1/x;",
            ">;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lj1/d;

    invoke-direct {v1}, Lj1/d;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-virtual {p1}, Ll1/q;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/q$c;

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/x;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj1/d;

    invoke-virtual {v1}, Ll1/q$c;->h()Ll1/r;

    move-result-object v5

    invoke-direct {p0, p2, v5}, Lk1/y1;->I(Li1/c1;Ll1/r;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v2}, Ll1/y;->t(Lx1/x;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-direct {p0, v0, v1, v2}, Lk1/y1;->z(Ljava/util/List;Ll1/q$c;Lx1/x;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object v5

    invoke-virtual {v4, v5}, Lj1/d;->b(Ll1/q$c$a;)Lj1/b;

    move-result-object v4

    sget-object v5, Lj1/c;->a:Lj1/c;

    invoke-virtual {v5, v2, v4}, Lj1/c;->e(Lx1/x;Lj1/b;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v0}, Lk1/y1;->C(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private z(Ljava/util/List;Ll1/q$c;Lx1/x;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj1/d;",
            ">;",
            "Ll1/q$c;",
            "Lx1/x;",
            ")",
            "Ljava/util/List<",
            "Lj1/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p3}, Lx1/x;->f0()Lx1/a;

    move-result-object p3

    invoke-virtual {p3}, Lx1/a;->k()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/d;

    new-instance v4, Lj1/d;

    invoke-direct {v4}, Lj1/d;-><init>()V

    invoke-virtual {v3}, Lj1/d;->c()[B

    move-result-object v3

    invoke-virtual {v4, v3}, Lj1/d;->d([B)V

    sget-object v3, Lj1/c;->a:Lj1/c;

    invoke-virtual {p2}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object v5

    invoke-virtual {v4, v5}, Lj1/d;->b(Ll1/q$c$a;)Lj1/b;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lj1/c;->e(Lx1/x;Lj1/b;)V

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public F(Ljava/lang/String;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection<",
            "Ll1/q;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lk1/y1;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public a()V
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lk1/y1;->a:Lk1/u2;

    const-string v2, "SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?"

    invoke-virtual {v1, v2}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lk1/y1;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v1

    new-instance v3, Lk1/t1;

    invoke-direct {v3, v0}, Lk1/t1;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v3}, Lk1/u2$d;->e(Lp1/n;)I

    iget-object v1, p0, Lk1/y1;->a:Lk1/u2;

    const-string v3, "SELECT index_id, collection_group, index_proto FROM index_configuration"

    invoke-virtual {v1, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    new-instance v3, Lk1/v1;

    invoke-direct {v3, p0, v0}, Lk1/v1;-><init>(Lk1/y1;Ljava/util/Map;)V

    invoke-virtual {v1, v3}, Lk1/u2$d;->e(Lp1/n;)I

    iput-boolean v2, p0, Lk1/y1;->h:Z

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ll1/u;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "IndexManager not started"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lk1/y1;->a:Lk1/u2;

    const-string v3, "SELECT parent FROM collection_parents WHERE collection_id = ?"

    invoke-virtual {v2, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v2, v3}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object p1

    new-instance v1, Lk1/r1;

    invoke-direct {v1, v0}, Lk1/r1;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1, v1}, Lk1/u2$d;->e(Lp1/n;)I

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ll1/q$a;
    .locals 3

    invoke-virtual {p0, p1}, Lk1/y1;->F(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "minOffset was called for collection without indexes"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lk1/y1;->G(Ljava/util/Collection;)Ll1/q$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Li1/c1;)Ll1/q$a;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1}, Lk1/y1;->H(Li1/c1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/c1;

    invoke-direct {p0, v1}, Lk1/y1;->E(Li1/c1;)Ll1/q;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lk1/y1;->G(Ljava/util/Collection;)Ll1/q$a;

    move-result-object p1

    return-object p1
.end method

.method public e(Li1/c1;)Lk1/l$a;
    .locals 5

    sget-object v0, Lk1/l$a;->g:Lk1/l$a;

    invoke-direct {p0, p1}, Lk1/y1;->H(Li1/c1;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/c1;

    invoke-direct {p0, v3}, Lk1/y1;->E(Li1/c1;)Ll1/q;

    move-result-object v4

    if-nez v4, :cond_1

    sget-object v0, Lk1/l$a;->e:Lk1/l$a;

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Ll1/q;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3}, Li1/c1;->o()I

    move-result v3

    if-ge v4, v3, :cond_0

    sget-object v0, Lk1/l$a;->f:Lk1/l$a;

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Li1/c1;->r()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_3

    sget-object p1, Lk1/l$a;->g:Lk1/l$a;

    if-ne v0, p1, :cond_3

    sget-object p1, Lk1/l$a;->f:Lk1/l$a;

    return-object p1

    :cond_3
    return-object v0
.end method

.method public f(Lc1/c;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lc1/c;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    invoke-virtual {v1}, Ll1/l;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lk1/y1;->F(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/q;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/l;

    invoke-direct {p0, v3, v2}, Lk1/y1;->D(Ll1/l;Ll1/q;)Ljava/util/SortedSet;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/i;

    invoke-direct {p0, v4, v2}, Lk1/y1;->t(Ll1/i;Ll1/q;)Ljava/util/SortedSet;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/i;

    invoke-direct {p0, v4, v3, v2}, Lk1/y1;->S(Ll1/i;Ljava/util/SortedSet;Ljava/util/SortedSet;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public g(Li1/c1;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/c1;",
            ")",
            "Ljava/util/List<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    move-object/from16 v9, p0

    iget-boolean v0, v9, Lk1/y1;->h:Z

    const/4 v10, 0x0

    new-array v1, v10, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-direct/range {p0 .. p1}, Lk1/y1;->H(Li1/c1;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v14, 0x1

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Li1/c1;

    invoke-direct {v9, v1}, Lk1/y1;->E(Li1/c1;)Ll1/q;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v1, v0}, Li1/c1;->a(Ll1/q;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v0}, Li1/c1;->l(Ll1/q;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v0}, Li1/c1;->k(Ll1/q;)Li1/i;

    move-result-object v4

    invoke-virtual {v1, v0}, Li1/c1;->q(Ll1/q;)Li1/i;

    move-result-object v5

    invoke-static {}, Lp1/v;->c()Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, Lk1/y1;->k:Ljava/lang/String;

    const/4 v7, 0x5

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v10

    aput-object v1, v7, v14

    const/4 v8, 0x2

    aput-object v3, v7, v8

    const/4 v8, 0x3

    aput-object v4, v7, v8

    const/4 v8, 0x4

    aput-object v5, v7, v8

    const-string v8, "Using index \'%s\' to execute \'%s\' (Arrays: %s, Lower bound: %s, Upper bound: %s)"

    invoke-static {v6, v8, v7}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-direct {v9, v0, v1, v4}, Lk1/y1;->v(Ll1/q;Li1/c1;Li1/i;)[Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4}, Li1/i;->c()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, ">="

    goto :goto_1

    :cond_2
    const-string v4, ">"

    :goto_1
    move-object v7, v4

    invoke-direct {v9, v0, v1, v5}, Lk1/y1;->v(Ll1/q;Li1/c1;Li1/i;)[Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5}, Li1/i;->c()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "<="

    goto :goto_2

    :cond_3
    const-string v4, "<"

    :goto_2
    move-object v15, v4

    invoke-direct {v9, v0, v1, v2}, Lk1/y1;->y(Ll1/q;Li1/c1;Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v16

    invoke-virtual {v0}, Ll1/q;->f()I

    move-result v2

    move-object/from16 v0, p0

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v15

    move-object/from16 v8, v16

    invoke-direct/range {v0 .. v8}, Lk1/y1;->B(Li1/c1;ILjava/util/List;[Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    aget-object v1, v0, v10

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    array-length v0, v0

    invoke-interface {v1, v14, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " UNION "

    invoke-static {v1, v11}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ORDER BY directional_value, document_key "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Li1/c1;->i()Li1/w0$a;

    move-result-object v1

    sget-object v2, Li1/w0$a;->f:Li1/w0$a;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "asc "

    goto :goto_3

    :cond_5
    const-string v1, "desc "

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT DISTINCT document_key FROM ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Li1/c1;->r()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " LIMIT "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Li1/c1;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_6
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x3e8

    if-ge v1, v2, :cond_7

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    new-array v2, v10, [Ljava/lang/Object;

    const-string v3, "Cannot perform query with more than 999 bind elements"

    invoke-static {v1, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v9, Lk1/y1;->a:Lk1/u2;

    invoke-virtual {v1, v0}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    invoke-interface {v12}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lk1/s1;

    invoke-direct {v2, v1}, Lk1/s1;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lk1/u2$d;->e(Lp1/n;)I

    sget-object v0, Lk1/y1;->k:Ljava/lang/String;

    new-array v2, v14, [Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v10

    const-string v3, "Index scan returned %s documents"

    invoke-static {v0, v3, v2}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public h(Ljava/lang/String;Ll1/q$a;)V
    .locals 7

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "IndexManager not started"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-wide v2, p0, Lk1/y1;->j:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lk1/y1;->j:J

    invoke-virtual {p0, p1}, Lk1/y1;->F(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/q;

    invoke-virtual {v0}, Ll1/q;->f()I

    move-result v2

    invoke-virtual {v0}, Ll1/q;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll1/q;->h()Ljava/util/List;

    move-result-object v4

    iget-wide v5, p0, Lk1/y1;->j:J

    invoke-static {v5, v6, p2}, Ll1/q$b;->a(JLl1/q$a;)Ll1/q$b;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Ll1/q;->b(ILjava/lang/String;Ljava/util/List;Ll1/q$b;)Ll1/q;

    move-result-object v2

    iget-object v3, p0, Lk1/y1;->a:Lk1/u2;

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Ll1/q;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    iget-object v5, p0, Lk1/y1;->c:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v0, 0x2

    iget-wide v5, p0, Lk1/y1;->j:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x3

    invoke-virtual {p2}, Ll1/q$a;->q()Ll1/w;

    move-result-object v5

    invoke-virtual {v5}, Ll1/w;->g()Lx0/o;

    move-result-object v5

    invoke-virtual {v5}, Lx0/o;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x4

    invoke-virtual {p2}, Ll1/q$a;->q()Ll1/w;

    move-result-object v5

    invoke-virtual {v5}, Ll1/w;->g()Lx0/o;

    move-result-object v5

    invoke-virtual {v5}, Lx0/o;->g()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x5

    invoke-virtual {p2}, Ll1/q$a;->n()Ll1/l;

    move-result-object v5

    invoke-virtual {v5}, Ll1/l;->t()Ll1/u;

    move-result-object v5

    invoke-static {v5}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    const/4 v0, 0x6

    invoke-virtual {p2}, Ll1/q$a;->p()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    const-string v0, "REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)"

    invoke-virtual {v3, v0, v4}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v2}, Lk1/y1;->R(Ll1/q;)V

    goto/16 :goto_0

    :cond_0
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexManager not started"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lk1/y1;->g:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll1/q;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public j(Ll1/u;)V
    .locals 6

    iget-boolean v0, p0, Lk1/y1;->h:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "IndexManager not started"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result v0

    const/4 v2, 0x2

    rem-int/2addr v0, v2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v4, v1, [Ljava/lang/Object;

    const-string v5, "Expected a collection path."

    invoke-static {v0, v5, v4}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lk1/y1;->e:Lk1/q0$a;

    invoke-virtual {v0, p1}, Lk1/q0$a;->a(Ll1/u;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll1/e;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll1/e;->u()Ll1/e;

    move-result-object p1

    check-cast p1, Ll1/u;

    iget-object v4, p0, Lk1/y1;->a:Lk1/u2;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    const-string p1, "INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"

    invoke-virtual {v4, p1, v2}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
