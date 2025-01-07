.class public Lk1/r2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/x0;


# instance fields
.field private final a:Lk1/u2;


# direct methods
.method public constructor <init>(Lk1/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/r2;->a:Lk1/u2;

    return-void
.end method

.method public static synthetic a(Ljava/util/Set;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/r2;->h(Ljava/util/Set;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic b([Ljava/lang/Boolean;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/r2;->i([Ljava/lang/Boolean;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic c(Lk1/r2;)V
    .locals 0

    invoke-direct {p0}, Lk1/r2;->g()V

    return-void
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Lk1/r2;->a:Lk1/u2;

    new-instance v1, Lk1/o2;

    invoke-direct {v1, p0}, Lk1/o2;-><init>(Lk1/r2;)V

    const-string v2, "build overlays"

    invoke-virtual {v0, v2, v1}, Lk1/u2;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method private e()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lk1/r2;->a:Lk1/u2;

    const-string v2, "SELECT DISTINCT uid FROM mutation_queues"

    invoke-virtual {v1, v2}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    new-instance v2, Lk1/p2;

    invoke-direct {v2, v0}, Lk1/p2;-><init>(Ljava/util/Set;)V

    invoke-virtual {v1, v2}, Lk1/u2$d;->e(Lp1/n;)I

    return-object v0
.end method

.method private synthetic g()V
    .locals 8

    invoke-virtual {p0}, Lk1/r2;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lk1/r2;->e()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lk1/r2;->a:Lk1/u2;

    invoke-virtual {v1}, Lk1/u2;->g()Lk1/f1;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lg1/j;

    invoke-direct {v3, v2}, Lg1/j;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lk1/r2;->a:Lk1/u2;

    invoke-virtual {v2, v3}, Lk1/u2;->c(Lg1/j;)Lk1/l;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lk1/u2;->d(Lg1/j;Lk1/l;)Lk1/w0;

    move-result-object v2

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2}, Lk1/w0;->j()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm1/g;

    invoke-virtual {v6}, Lm1/g;->f()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lk1/r2;->a:Lk1/u2;

    invoke-virtual {v5, v3}, Lk1/u2;->b(Lg1/j;)Lk1/b;

    move-result-object v5

    new-instance v6, Lk1/n;

    iget-object v7, p0, Lk1/r2;->a:Lk1/u2;

    invoke-virtual {v7, v3}, Lk1/u2;->c(Lg1/j;)Lk1/l;

    move-result-object v3

    invoke-direct {v6, v1, v2, v5, v3}, Lk1/n;-><init>(Lk1/f1;Lk1/w0;Lk1/b;Lk1/l;)V

    invoke-virtual {v6, v4}, Lk1/n;->n(Ljava/util/Set;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lk1/r2;->j()V

    return-void
.end method

.method private static synthetic h(Ljava/util/Set;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic i([Ljava/lang/Boolean;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lk1/z0;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object p1, p0, v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    aput-object p0, p1, v0

    const-string p0, "SQLitePersistence.DataMigration failed to parse: %s"

    invoke-static {p0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private j()V
    .locals 4

    iget-object v0, p0, Lk1/r2;->a:Lk1/u2;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lk1/z0;->b:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "DELETE FROM data_migrations WHERE migration_name = ?"

    invoke-virtual {v0, v2, v1}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method f()Z
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lk1/r2;->a:Lk1/u2;

    const-string v3, "SELECT migration_name FROM data_migrations"

    invoke-virtual {v1, v3}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    new-instance v3, Lk1/q2;

    invoke-direct {v3, v0}, Lk1/q2;-><init>([Ljava/lang/Boolean;)V

    invoke-virtual {v1, v3}, Lk1/u2$d;->e(Lp1/n;)I

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public run()V
    .locals 0

    invoke-direct {p0}, Lk1/r2;->d()V

    return-void
.end method
