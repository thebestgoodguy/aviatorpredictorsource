.class final Lk1/y3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/a4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/y3$b;,
        Lk1/y3$c;
    }
.end annotation


# instance fields
.field private final a:Lk1/u2;

.field private final b:Lk1/o;

.field private c:I

.field private d:J

.field private e:Ll1/w;

.field private f:J


# direct methods
.method constructor <init>(Lk1/u2;Lk1/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ll1/w;->f:Ll1/w;

    iput-object v0, p0, Lk1/y3;->e:Ll1/w;

    iput-object p1, p0, Lk1/y3;->a:Lk1/u2;

    iput-object p2, p0, Lk1/y3;->b:Lk1/o;

    return-void
.end method

.method private A(Lk1/b4;)V
    .locals 7

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v0

    invoke-virtual {p1}, Lk1/b4;->f()Li1/c1;

    move-result-object v1

    invoke-virtual {v1}, Li1/c1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lk1/b4;->e()Ll1/w;

    move-result-object v2

    invoke-virtual {v2}, Ll1/w;->g()Lx0/o;

    move-result-object v2

    iget-object v3, p0, Lk1/y3;->b:Lk1/o;

    invoke-virtual {v3, p1}, Lk1/o;->p(Lk1/b4;)Ln1/c;

    move-result-object v3

    iget-object v4, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v5, 0x7

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    invoke-virtual {v2}, Lx0/o;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    invoke-virtual {v2}, Lx0/o;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    invoke-virtual {p1}, Lk1/b4;->c()Lcom/google/protobuf/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/j;->N()[B

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v0, 0x5

    aput-object p1, v5, v0

    invoke-virtual {v3}, Lcom/google/protobuf/a;->a()[B

    move-result-object p1

    const/4 v0, 0x6

    aput-object p1, v5, v0

    const-string p1, "INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)"

    invoke-virtual {v4, p1, v5}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private C(Lk1/b4;)Z
    .locals 7

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v0

    iget v1, p0, Lk1/y3;->c:I

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v0

    iput v0, p0, Lk1/y3;->c:I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v3

    iget-wide v5, p0, Lk1/y3;->d:J

    cmp-long v1, v3, v5

    if-lez v1, :cond_1

    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lk1/y3;->d:J

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    return v2
.end method

.method private D()V
    .locals 4

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lk1/y3;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lk1/y3;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lk1/y3;->e:Ll1/w;

    invoke-virtual {v2}, Ll1/w;->g()Lx0/o;

    move-result-object v2

    invoke-virtual {v2}, Lx0/o;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lk1/y3;->e:Ll1/w;

    invoke-virtual {v2}, Ll1/w;->g()Lx0/o;

    move-result-object v2

    invoke-virtual {v2}, Lx0/o;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-wide v2, p0, Lk1/y3;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?"

    invoke-virtual {v0, v2, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lk1/y3$b;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/y3;->u(Lk1/y3$b;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic l(Lk1/y3;Li1/c1;Lk1/y3$c;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/y3;->v(Li1/c1;Lk1/y3$c;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic m(Lk1/y3;Lp1/n;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk1/y3;->t(Lp1/n;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic n(Lk1/y3;Landroid/util/SparseArray;[ILandroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk1/y3;->w(Landroid/util/SparseArray;[ILandroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic o(Lk1/y3;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/y3;->x(Landroid/database/Cursor;)V

    return-void
.end method

.method private p([B)Lk1/b4;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lk1/y3;->b:Lk1/o;

    invoke-static {p1}, Ln1/c;->m0([B)Ln1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk1/o;->h(Ln1/c;)Lk1/b4;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "TargetData failed to parse: %s"

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private synthetic t(Lp1/n;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2

    invoke-direct {p0, p2}, Lk1/y3;->p([B)Lk1/b4;

    move-result-object p2

    invoke-interface {p1, p2}, Lp1/n;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic u(Lk1/y3$b;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk1/f;->b(Ljava/lang/String;)Ll1/u;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p1

    iget-object v0, p0, Lk1/y3$b;->a:Lc1/e;

    invoke-virtual {v0, p1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object p1

    iput-object p1, p0, Lk1/y3$b;->a:Lc1/e;

    return-void
.end method

.method private synthetic v(Li1/c1;Lk1/y3$c;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p3

    invoke-direct {p0, p3}, Lk1/y3;->p([B)Lk1/b4;

    move-result-object p3

    invoke-virtual {p3}, Lk1/b4;->f()Li1/c1;

    move-result-object v0

    invoke-virtual {p1, v0}, Li1/c1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object p3, p2, Lk1/y3$c;->a:Lk1/b4;

    :cond_0
    return-void
.end method

.method private synthetic w(Landroid/util/SparseArray;[ILandroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-direct {p0, p3}, Lk1/y3;->z(I)V

    aget p1, p2, v0

    add-int/lit8 p1, p1, 0x1

    aput p1, p2, v0

    :cond_0
    return-void
.end method

.method private synthetic x(Landroid/database/Cursor;)V
    .locals 5

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lk1/y3;->c:I

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lk1/y3;->d:J

    new-instance v0, Ll1/w;

    new-instance v1, Lx0/o;

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const/4 v4, 0x3

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lx0/o;-><init>(JI)V

    invoke-direct {v0, v1}, Ll1/w;-><init>(Lx0/o;)V

    iput-object v0, p0, Lk1/y3;->e:Ll1/w;

    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lk1/y3;->f:J

    return-void
.end method

.method private z(I)V
    .locals 4

    invoke-virtual {p0, p1}, Lk1/y3;->f(I)V

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "DELETE FROM targets WHERE target_id = ?"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-wide v0, p0, Lk1/y3;->f:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lk1/y3;->f:J

    return-void
.end method


# virtual methods
.method B()V
    .locals 3

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const-string v1, "SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1"

    invoke-virtual {v0, v1}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    new-instance v1, Lk1/u3;

    invoke-direct {v1, p0}, Lk1/u3;-><init>(Lk1/y3;)V

    invoke-virtual {v0, v1}, Lk1/u2$d;->c(Lp1/n;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "Missing target_globals entry"

    invoke-static {v2, v1, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lk1/b4;)V
    .locals 0

    invoke-direct {p0, p1}, Lk1/y3;->A(Lk1/b4;)V

    invoke-direct {p0, p1}, Lk1/y3;->C(Lk1/b4;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lk1/y3;->D()V

    :cond_0
    return-void
.end method

.method public b(I)Lc1/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    new-instance v0, Lk1/y3$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk1/y3$b;-><init>(Lk1/y3$a;)V

    iget-object v1, p0, Lk1/y3;->a:Lk1/u2;

    const-string v2, "SELECT path FROM target_documents WHERE target_id = ?"

    invoke-virtual {v1, v2}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object p1

    new-instance v1, Lk1/t3;

    invoke-direct {v1, v0}, Lk1/t3;-><init>(Lk1/y3$b;)V

    invoke-virtual {p1, v1}, Lk1/u2$d;->e(Lp1/n;)I

    iget-object p1, v0, Lk1/y3$b;->a:Lc1/e;

    return-object p1
.end method

.method public c()Ll1/w;
    .locals 1

    iget-object v0, p0, Lk1/y3;->e:Ll1/w;

    return-object v0
.end method

.method public d(Lc1/e;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "Ll1/l;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const-string v1, "INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)"

    invoke-virtual {v0, v1}, Lk1/u2;->D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    iget-object v1, p0, Lk1/y3;->a:Lk1/u2;

    invoke-virtual {v1}, Lk1/u2;->z()Lk1/c2;

    move-result-object v1

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

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

    iget-object v4, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    invoke-virtual {v4, v0, v5}, Lk1/u2;->u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    invoke-interface {v1, v2}, Lk1/d1;->a(Ll1/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Ll1/w;)V
    .locals 0

    iput-object p1, p0, Lk1/y3;->e:Ll1/w;

    invoke-direct {p0}, Lk1/y3;->D()V

    return-void
.end method

.method public f(I)V
    .locals 3

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "DELETE FROM target_documents WHERE target_id = ?"

    invoke-virtual {v0, p1, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public g(Lc1/e;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "Ll1/l;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const-string v1, "DELETE FROM target_documents WHERE target_id = ? AND path = ?"

    invoke-virtual {v0, v1}, Lk1/u2;->D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    iget-object v1, p0, Lk1/y3;->a:Lk1/u2;

    invoke-virtual {v1}, Lk1/u2;->z()Lk1/c2;

    move-result-object v1

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

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

    iget-object v4, p0, Lk1/y3;->a:Lk1/u2;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    invoke-virtual {v4, v0, v5}, Lk1/u2;->u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    invoke-interface {v1, v2}, Lk1/d1;->f(Ll1/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Li1/c1;)Lk1/b4;
    .locals 5

    invoke-virtual {p1}, Li1/c1;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lk1/y3$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lk1/y3$c;-><init>(Lk1/y3$a;)V

    iget-object v2, p0, Lk1/y3;->a:Lk1/u2;

    const-string v3, "SELECT target_proto FROM targets WHERE canonical_id = ?"

    invoke-virtual {v2, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v2, v3}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v0

    new-instance v2, Lk1/w3;

    invoke-direct {v2, p0, p1, v1}, Lk1/w3;-><init>(Lk1/y3;Li1/c1;Lk1/y3$c;)V

    invoke-virtual {v0, v2}, Lk1/u2$d;->e(Lp1/n;)I

    iget-object p1, v1, Lk1/y3$c;->a:Lk1/b4;

    return-object p1
.end method

.method public i(Lk1/b4;)V
    .locals 4

    invoke-direct {p0, p1}, Lk1/y3;->A(Lk1/b4;)V

    invoke-direct {p0, p1}, Lk1/y3;->C(Lk1/b4;)Z

    iget-wide v0, p0, Lk1/y3;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lk1/y3;->f:J

    invoke-direct {p0}, Lk1/y3;->D()V

    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lk1/y3;->c:I

    return v0
.end method

.method public q(Lp1/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/n<",
            "Lk1/b4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/y3;->a:Lk1/u2;

    const-string v1, "SELECT target_proto FROM targets"

    invoke-virtual {v0, v1}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    new-instance v1, Lk1/x3;

    invoke-direct {v1, p0, p1}, Lk1/x3;-><init>(Lk1/y3;Lp1/n;)V

    invoke-virtual {v0, v1}, Lk1/u2$d;->e(Lp1/n;)I

    return-void
.end method

.method public r()J
    .locals 2

    iget-wide v0, p0, Lk1/y3;->d:J

    return-wide v0
.end method

.method public s()J
    .locals 2

    iget-wide v0, p0, Lk1/y3;->f:J

    return-wide v0
.end method

.method y(JLandroid/util/SparseArray;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/util/SparseArray<",
            "*>;)I"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [I

    iget-object v2, p0, Lk1/y3;->a:Lk1/u2;

    const-string v3, "SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?"

    invoke-virtual {v2, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v0, p2

    invoke-virtual {v2, v0}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object p1

    new-instance v0, Lk1/v3;

    invoke-direct {v0, p0, p3, v1}, Lk1/v3;-><init>(Lk1/y3;Landroid/util/SparseArray;[I)V

    invoke-virtual {p1, v0}, Lk1/u2$d;->e(Lp1/n;)I

    invoke-direct {p0}, Lk1/y3;->D()V

    aget p1, v1, p2

    return p1
.end method
