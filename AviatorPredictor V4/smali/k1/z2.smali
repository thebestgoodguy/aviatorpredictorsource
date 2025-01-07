.class final Lk1/z2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/f1;


# instance fields
.field private final a:Lk1/u2;

.field private final b:Lk1/o;

.field private c:Lk1/l;


# direct methods
.method constructor <init>(Lk1/u2;Lk1/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/z2;->a:Lk1/u2;

    iput-object p2, p0, Lk1/z2;->b:Lk1/o;

    return-void
.end method

.method public static synthetic g(Lk1/z2;Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/z2;->m(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic h(Lk1/z2;Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/z2;->l(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic i(Lk1/z2;[BIILjava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk1/z2;->n([BIILjava/util/Map;)V

    return-void
.end method

.method private j([BII)Ll1/s;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lk1/z2;->b:Lk1/o;

    invoke-static {p1}, Ln1/a;->e0([B)Ln1/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk1/o;->d(Ln1/a;)Ll1/s;

    move-result-object p1

    new-instance v0, Ll1/w;

    new-instance v1, Lx0/o;

    int-to-long v2, p2

    invoke-direct {v1, v2, v3, p3}, Lx0/o;-><init>(JI)V

    invoke-direct {v0, v1}, Ll1/w;-><init>(Lx0/o;)V

    invoke-virtual {p1, v0}, Ll1/s;->v(Ll1/w;)Ll1/s;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    const-string p1, "MaybeDocument failed to parse: %s"

    invoke-static {p1, p2}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private k(Ljava/util/List;Ll1/q$a;I)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll1/u;",
            ">;",
            "Ll1/q$a;",
            "I)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Ll1/q$a;->q()Ll1/w;

    move-result-object v0

    invoke-virtual {v0}, Ll1/w;->g()Lx0/o;

    move-result-object v0

    invoke-virtual {p2}, Ll1/q$a;->n()Ll1/l;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "

    const-string v3, " UNION "

    invoke-static {v2, v1, v3}, Lp1/g0;->x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x9

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll1/u;

    invoke-static {v4}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    aput-object v5, v2, v3

    add-int/lit8 v3, v6, 0x1

    invoke-static {v5}, Lk1/f;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v6

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v4}, Ll1/e;->s()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v5, 0x1

    invoke-virtual {v0}, Lx0/o;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v5

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0}, Lx0/o;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v3

    add-int/lit8 v3, v4, 0x1

    invoke-virtual {v0}, Lx0/o;->g()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0}, Lx0/o;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v3

    add-int/lit8 v3, v4, 0x1

    invoke-virtual {v0}, Lx0/o;->g()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p2}, Ll1/l;->t()Ll1/u;

    move-result-object v5

    invoke-static {v5}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    move v3, v4

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    new-instance p1, Lp1/m;

    invoke-direct {p1}, Lp1/m;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iget-object p3, p0, Lk1/z2;->a:Lk1/u2;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object p3

    invoke-virtual {p3, v2}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object p3

    new-instance v0, Lk1/x2;

    invoke-direct {v0, p0, p1, p2}, Lk1/x2;-><init>(Lk1/z2;Lp1/m;Ljava/util/Map;)V

    invoke-virtual {p3, v0}, Lk1/u2$d;->e(Lp1/n;)I

    invoke-virtual {p1}, Lp1/m;->b()V

    return-object p2
.end method

.method private synthetic l(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/z2;->o(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private synthetic m(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/z2;->o(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private synthetic n([BIILjava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/z2;->j([BII)Ll1/s;

    move-result-object p1

    monitor-enter p4

    :try_start_0
    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p2

    invoke-interface {p4, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p4

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private o(Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/m;",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    const/4 v0, 0x1

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v0, 0x2

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-interface {p3}, Landroid/database/Cursor;->isLast()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lp1/p;->b:Ljava/util/concurrent/Executor;

    :cond_0
    new-instance p3, Lk1/w2;

    move-object v1, p3

    move-object v2, p0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lk1/w2;-><init>(Lk1/z2;[BIILjava/util/Map;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Lk1/l;)V
    .locals 0

    iput-object p1, p0, Lk1/z2;->c:Lk1/l;

    return-void
.end method

.method public b(Ljava/lang/String;Ll1/q$a;I)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ll1/q$a;",
            "I)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/z2;->c:Lk1/l;

    invoke-interface {v0, p1}, Lk1/l;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/u;

    invoke-virtual {v2, p1}, Ll1/e;->d(Ljava/lang/String;)Ll1/e;

    move-result-object v2

    check-cast v2, Ll1/u;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x9

    const/16 v0, 0x384

    if-ge p1, v0, :cond_2

    invoke-direct {p0, v1, p2, p3}, Lk1/z2;->k(Ljava/util/List;Ll1/q$a;I)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v3, v0, 0x64

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-interface {v1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lk1/z2;->k(Ljava/util/List;Ll1/q$a;I)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    move v0, v3

    goto :goto_1

    :cond_3
    sget-object p2, Ll1/q$a;->f:Ljava/util/Comparator;

    invoke-static {p1, p3, p2}, Lp1/g0;->s(Ljava/util/Map;ILjava/util/Comparator;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public c(Ll1/l;)Ll1/s;
    .locals 1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk1/z2;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/s;

    return-object p1
.end method

.method public d(Ll1/s;Ll1/w;)V
    .locals 7

    sget-object v0, Ll1/w;->f:Ll1/w;

    invoke-virtual {p2, v0}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Cannot add document to the RemoteDocumentCache with a read time of zero"

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v0

    invoke-virtual {p2}, Ll1/w;->g()Lx0/o;

    move-result-object p2

    iget-object v3, p0, Lk1/z2;->b:Lk1/o;

    invoke-virtual {v3, p1}, Lk1/o;->l(Ll1/i;)Ln1/a;

    move-result-object v3

    iget-object v4, p0, Lk1/z2;->a:Lk1/u2;

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ll1/l;->t()Ll1/u;

    move-result-object v6

    invoke-static {v6}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v0}, Ll1/l;->t()Ll1/u;

    move-result-object v0

    invoke-virtual {v0}, Ll1/e;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    const/4 v0, 0x2

    invoke-virtual {p2}, Lx0/o;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    const/4 v0, 0x3

    invoke-virtual {p2}, Lx0/o;->g()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v5, v0

    const/4 p2, 0x4

    invoke-interface {v3}, Lcom/google/protobuf/v0;->a()[B

    move-result-object v0

    aput-object v0, v5, p2

    const-string p2, "INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)"

    invoke-virtual {v4, p2, v5}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lk1/z2;->c:Lk1/l;

    invoke-virtual {p1}, Ll1/s;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p1}, Ll1/l;->r()Ll1/u;

    move-result-object p1

    invoke-interface {p2, p1}, Lk1/l;->j(Ll1/u;)V

    return-void
.end method

.method public e(Ll1/u;Ll1/q$a;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/u;",
            "Ll1/q$a;",
            ")",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const v0, 0x7fffffff

    invoke-direct {p0, p1, p2, v0}, Lk1/z2;->k(Ljava/util/List;Ll1/q$a;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ll1/l;",
            ">;)",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-virtual {v2}, Ll1/l;->t()Ll1/u;

    move-result-object v3

    invoke-static {v3}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ll1/s;->q(Ll1/l;)Ll1/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Lk1/u2$b;

    iget-object v2, p0, Lk1/z2;->a:Lk1/u2;

    const-string v3, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN ("

    const-string v4, ") ORDER BY path"

    invoke-direct {p1, v2, v3, v1, v4}, Lk1/u2$b;-><init>(Lk1/u2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    new-instance v1, Lp1/m;

    invoke-direct {v1}, Lp1/m;-><init>()V

    :goto_1
    invoke-virtual {p1}, Lk1/u2$b;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lk1/u2$b;->e()Lk1/u2$d;

    move-result-object v2

    new-instance v3, Lk1/y2;

    invoke-direct {v3, p0, v1, v0}, Lk1/y2;-><init>(Lk1/z2;Lp1/m;Ljava/util/Map;)V

    invoke-virtual {v2, v3}, Lk1/u2$d;->e(Lp1/n;)I

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/m;->b()V

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-virtual {v2}, Ll1/l;->t()Ll1/u;

    move-result-object v3

    invoke-static {v3}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Ll1/w;->f:Ll1/w;

    invoke-static {v2, v3}, Ll1/s;->r(Ll1/l;Ll1/w;)Ll1/s;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance p1, Lk1/u2$b;

    iget-object v2, p0, Lk1/z2;->a:Lk1/u2;

    const-string v3, "DELETE FROM remote_documents WHERE path IN ("

    const-string v4, ")"

    invoke-direct {p1, v2, v3, v0, v4}, Lk1/u2$b;-><init>(Lk1/u2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Lk1/u2$b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lk1/u2$b;->a()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lk1/z2;->c:Lk1/l;

    invoke-interface {p1, v1}, Lk1/l;->f(Lc1/c;)V

    return-void
.end method
