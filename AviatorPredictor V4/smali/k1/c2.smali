.class Lk1/c2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/d1;
.implements Lk1/h0;


# instance fields
.field private final a:Lk1/u2;

.field private b:Li1/r0;

.field private c:J

.field private final d:Lk1/l0;

.field private e:Lk1/e1;


# direct methods
.method constructor <init>(Lk1/u2;Lk1/l0$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lk1/c2;->c:J

    iput-object p1, p0, Lk1/c2;->a:Lk1/u2;

    new-instance p1, Lk1/l0;

    invoke-direct {p1, p0, p2}, Lk1/l0;-><init>(Lk1/h0;Lk1/l0$b;)V

    iput-object p1, p0, Lk1/c2;->d:Lk1/l0;

    return-void
.end method

.method private A(Ll1/l;)V
    .locals 4

    invoke-virtual {p1}, Ll1/l;->t()Ll1/u;

    move-result-object p1

    invoke-static {p1}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0}, Lk1/c2;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lk1/c2;[ILjava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/c2;->w([ILjava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic r(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lk1/c2;->v(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lp1/n;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/c2;->u(Lp1/n;Landroid/database/Cursor;)V

    return-void
.end method

.method private t(Ll1/l;)Z
    .locals 1

    iget-object v0, p0, Lk1/c2;->e:Lk1/e1;

    invoke-virtual {v0, p1}, Lk1/e1;->c(Ll1/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lk1/c2;->x(Ll1/l;)Z

    move-result p1

    return p1
.end method

.method private static synthetic u(Lp1/n;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/n;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic v(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private synthetic w([ILjava/util/List;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lk1/f;->b(Ljava/lang/String;)Ll1/u;

    move-result-object p3

    invoke-static {p3}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p3

    invoke-direct {p0, p3}, Lk1/c2;->t(Ll1/l;)Z

    move-result v1

    if-nez v1, :cond_0

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p3}, Lk1/c2;->y(Ll1/l;)V

    :cond_0
    return-void
.end method

.method private x(Ll1/l;)Z
    .locals 4

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    const-string v1, "SELECT 1 FROM document_mutations WHERE path = ?"

    invoke-virtual {v0, v1}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ll1/l;->t()Ll1/u;

    move-result-object p1

    invoke-static {p1}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v2}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object p1

    invoke-virtual {p1}, Lk1/u2$d;->f()Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method

.method private y(Ll1/l;)V
    .locals 3

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ll1/l;->t()Ll1/u;

    move-result-object p1

    invoke-static {p1}, Lk1/f;->c(Ll1/e;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "DELETE FROM target_documents WHERE path = ? AND target_id = 0"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ll1/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/c2;->A(Ll1/l;)V

    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()J
    .locals 4

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->A()Lk1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lk1/y3;->s()J

    move-result-wide v0

    iget-object v2, p0, Lk1/c2;->a:Lk1/u2;

    const-string v3, "SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)"

    invoke-virtual {v2, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v2

    sget-object v3, Lk1/b2;->a:Lk1/b2;

    invoke-virtual {v2, v3}, Lk1/u2$d;->d(Lp1/t;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public d(Lk1/b4;)V
    .locals 2

    invoke-virtual {p0}, Lk1/c2;->h()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lk1/b4;->j(J)Lk1/b4;

    move-result-object p1

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->A()Lk1/y3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk1/y3;->a(Lk1/b4;)V

    return-void
.end method

.method public e(JLandroid/util/SparseArray;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/util/SparseArray<",
            "*>;)I"
        }
    .end annotation

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->A()Lk1/y3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lk1/y3;->y(JLandroid/util/SparseArray;)I

    move-result p1

    return p1
.end method

.method public f(Ll1/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/c2;->A(Ll1/l;)V

    return-void
.end method

.method public g(J)I
    .locals 8

    const/4 v0, 0x1

    new-array v1, v0, [I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/4 v3, 0x1

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v3, p0, Lk1/c2;->a:Lk1/u2;

    const-string v5, "select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?"

    invoke-virtual {v3, v5}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v3

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v4

    const/16 v6, 0x64

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v0

    invoke-virtual {v3, v5}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v3

    new-instance v5, Lk1/z1;

    invoke-direct {v5, p0, v1, v2}, Lk1/z1;-><init>(Lk1/c2;[ILjava/util/List;)V

    invoke-virtual {v3, v5}, Lk1/u2$d;->e(Lp1/n;)I

    move-result v3

    if-ne v3, v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {p1}, Lk1/u2;->g()Lk1/f1;

    move-result-object p1

    invoke-interface {p1, v2}, Lk1/f1;->removeAll(Ljava/util/Collection;)V

    aget p1, v1, v4

    return p1
.end method

.method public h()J
    .locals 6

    iget-wide v0, p0, Lk1/c2;->c:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Attempting to get a sequence number outside of a transaction"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-wide v0, p0, Lk1/c2;->c:J

    return-wide v0
.end method

.method public i()V
    .locals 6

    iget-wide v0, p0, Lk1/c2;->c:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Committing a transaction without having started one"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-wide v3, p0, Lk1/c2;->c:J

    return-void
.end method

.method public j(Lk1/e1;)V
    .locals 0

    iput-object p1, p0, Lk1/c2;->e:Lk1/e1;

    return-void
.end method

.method public k(Ll1/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/c2;->A(Ll1/l;)V

    return-void
.end method

.method public l()Lk1/l0;
    .locals 1

    iget-object v0, p0, Lk1/c2;->d:Lk1/l0;

    return-object v0
.end method

.method public m(Lp1/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/n<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    const-string v1, "select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0"

    invoke-virtual {v0, v1}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    new-instance v1, Lk1/a2;

    invoke-direct {v1, p1}, Lk1/a2;-><init>(Lp1/n;)V

    invoke-virtual {v0, v1}, Lk1/u2$d;->e(Lp1/n;)I

    return-void
.end method

.method public n()V
    .locals 6

    iget-wide v0, p0, Lk1/c2;->c:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Starting a transaction without committing the previous one"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lk1/c2;->b:Li1/r0;

    invoke-virtual {v0}, Li1/r0;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lk1/c2;->c:J

    return-void
.end method

.method public o(Lp1/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/n<",
            "Lk1/b4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/c2;->a:Lk1/u2;

    invoke-virtual {v0}, Lk1/u2;->A()Lk1/y3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk1/y3;->q(Lp1/n;)V

    return-void
.end method

.method public p(Ll1/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/c2;->A(Ll1/l;)V

    return-void
.end method

.method z(J)V
    .locals 1

    new-instance v0, Li1/r0;

    invoke-direct {v0, p1, p2}, Li1/r0;-><init>(J)V

    iput-object v0, p0, Lk1/c2;->b:Li1/r0;

    return-void
.end method
