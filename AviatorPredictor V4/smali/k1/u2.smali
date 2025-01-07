.class public final Lk1/u2;
.super Lk1/z0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/u2$b;,
        Lk1/u2$d;,
        Lk1/u2$c;
    }
.end annotation


# instance fields
.field private final c:Lk1/u2$c;

.field private final d:Lk1/o;

.field private final e:Lk1/y3;

.field private final f:Lk1/i1;

.field private final g:Lk1/z2;

.field private final h:Lk1/c2;

.field private final i:Landroid/database/sqlite/SQLiteTransactionListener;

.field private j:Landroid/database/sqlite/SQLiteDatabase;

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ll1/f;Lk1/o;Lk1/l0$b;)V
    .locals 1

    new-instance v0, Lk1/u2$c;

    invoke-static {p2, p3}, Lk1/u2;->t(Ljava/lang/String;Ll1/f;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-direct {v0, p1, p4, p2, p3}, Lk1/u2$c;-><init>(Landroid/content/Context;Lk1/o;Ljava/lang/String;Lk1/u2$a;)V

    invoke-direct {p0, p4, p5, v0}, Lk1/u2;-><init>(Lk1/o;Lk1/l0$b;Lk1/u2$c;)V

    return-void
.end method

.method public constructor <init>(Lk1/o;Lk1/l0$b;Lk1/u2$c;)V
    .locals 1

    invoke-direct {p0}, Lk1/z0;-><init>()V

    new-instance v0, Lk1/u2$a;

    invoke-direct {v0, p0}, Lk1/u2$a;-><init>(Lk1/u2;)V

    iput-object v0, p0, Lk1/u2;->i:Landroid/database/sqlite/SQLiteTransactionListener;

    iput-object p3, p0, Lk1/u2;->c:Lk1/u2$c;

    iput-object p1, p0, Lk1/u2;->d:Lk1/o;

    new-instance p3, Lk1/y3;

    invoke-direct {p3, p0, p1}, Lk1/y3;-><init>(Lk1/u2;Lk1/o;)V

    iput-object p3, p0, Lk1/u2;->e:Lk1/y3;

    new-instance p3, Lk1/i1;

    invoke-direct {p3, p0, p1}, Lk1/i1;-><init>(Lk1/u2;Lk1/o;)V

    iput-object p3, p0, Lk1/u2;->f:Lk1/i1;

    new-instance p3, Lk1/z2;

    invoke-direct {p3, p0, p1}, Lk1/z2;-><init>(Lk1/u2;Lk1/o;)V

    iput-object p3, p0, Lk1/u2;->g:Lk1/z2;

    new-instance p1, Lk1/c2;

    invoke-direct {p1, p0, p2}, Lk1/c2;-><init>(Lk1/u2;Lk1/l0$b;)V

    iput-object p1, p0, Lk1/u2;->h:Lk1/c2;

    return-void
.end method

.method private static synthetic B(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic C(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lk1/u2;->C(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroid/database/Cursor;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lk1/u2;->B(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lk1/u2;)Lk1/c2;
    .locals 0

    iget-object p0, p0, Lk1/u2;->h:Lk1/c2;

    return-object p0
.end method

.method static synthetic q(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lk1/u2;->r(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V

    return-void
.end method

.method private static r(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_6

    aget-object v2, p1, v1

    if-nez v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    goto :goto_2

    :cond_0
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v3, v2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    goto :goto_2

    :cond_1
    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    add-int/lit8 v3, v1, 0x1

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v4, v2

    :goto_1
    invoke-virtual {p0, v3, v4, v5}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    goto :goto_2

    :cond_2
    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_3

    add-int/lit8 v3, v1, 0x1

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_1

    :cond_3
    instance-of v3, v2, Ljava/lang/Double;

    if-eqz v3, :cond_4

    add-int/lit8 v3, v1, 0x1

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {p0, v3, v4, v5}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    goto :goto_2

    :cond_4
    instance-of v3, v2, [B

    if-eqz v3, :cond_5

    add-int/lit8 v3, v1, 0x1

    check-cast v2, [B

    invoke-virtual {p0, v3, v2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    aput-object v2, p0, v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x1

    aput-object p1, p0, v0

    const-string p1, "Unknown argument %s of type %s"

    invoke-static {p1, p0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :cond_6
    return-void
.end method

.method public static s(Landroid/content/Context;Ll1/f;Ljava/lang/String;)V
    .locals 1

    invoke-static {p2, p1}, Lk1/u2;->t(Ljava/lang/String;Ll1/f;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "-journal"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-wal"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/io/File;

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v0}, Lp1/s;->a(Ljava/io/File;)V

    invoke-static {p0}, Lp1/s;->a(Ljava/io/File;)V

    invoke-static {p1}, Lp1/s;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/firebase/firestore/u;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to clear persistence."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p2, Lcom/google/firebase/firestore/u$a;->h:Lcom/google/firebase/firestore/u$a;

    invoke-direct {p1, p0, p2}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    throw p1
.end method

.method public static t(Ljava/lang/String;Ll1/f;)Ljava/lang/String;
    .locals 4

    const-string v0, "."

    const-string v1, "utf-8"

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "firestore."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll1/f;->k()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll1/f;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method private x()J
    .locals 2

    const-string v0, "PRAGMA page_count"

    invoke-virtual {p0, v0}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    sget-object v1, Lk1/t2;->a:Lk1/t2;

    invoke-virtual {v0, v1}, Lk1/u2$d;->d(Lp1/t;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private y()J
    .locals 2

    const-string v0, "PRAGMA page_size"

    invoke-virtual {p0, v0}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v0

    sget-object v1, Lk1/s2;->a:Lk1/s2;

    invoke-virtual {v0, v1}, Lk1/u2$d;->d(Lp1/t;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method A()Lk1/y3;
    .locals 1

    iget-object v0, p0, Lk1/u2;->e:Lk1/y3;

    return-object v0
.end method

.method D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    .locals 1

    iget-object v0, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    return-object p1
.end method

.method E(Ljava/lang/String;)Lk1/u2$d;
    .locals 2

    new-instance v0, Lk1/u2$d;

    iget-object v1, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {v0, v1, p1}, Lk1/u2$d;-><init>(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    return-object v0
.end method

.method a()Lk1/a;
    .locals 1

    iget-object v0, p0, Lk1/u2;->f:Lk1/i1;

    return-object v0
.end method

.method b(Lg1/j;)Lk1/b;
    .locals 2

    new-instance v0, Lk1/p1;

    iget-object v1, p0, Lk1/u2;->d:Lk1/o;

    invoke-direct {v0, p0, v1, p1}, Lk1/p1;-><init>(Lk1/u2;Lk1/o;Lg1/j;)V

    return-object v0
.end method

.method c(Lg1/j;)Lk1/l;
    .locals 2

    new-instance v0, Lk1/y1;

    iget-object v1, p0, Lk1/u2;->d:Lk1/o;

    invoke-direct {v0, p0, v1, p1}, Lk1/y1;-><init>(Lk1/u2;Lk1/o;Lg1/j;)V

    return-object v0
.end method

.method d(Lg1/j;Lk1/l;)Lk1/w0;
    .locals 2

    new-instance v0, Lk1/n2;

    iget-object v1, p0, Lk1/u2;->d:Lk1/o;

    invoke-direct {v0, p0, v1, p1, p2}, Lk1/n2;-><init>(Lk1/u2;Lk1/o;Lg1/j;Lk1/l;)V

    return-object v0
.end method

.method e()Lk1/x0;
    .locals 1

    new-instance v0, Lk1/r2;

    invoke-direct {v0, p0}, Lk1/r2;-><init>(Lk1/u2;)V

    return-object v0
.end method

.method public bridge synthetic f()Lk1/d1;
    .locals 1

    invoke-virtual {p0}, Lk1/u2;->z()Lk1/c2;

    move-result-object v0

    return-object v0
.end method

.method g()Lk1/f1;
    .locals 1

    iget-object v0, p0, Lk1/u2;->g:Lk1/z2;

    return-object v0
.end method

.method bridge synthetic h()Lk1/a4;
    .locals 1

    invoke-virtual {p0}, Lk1/u2;->A()Lk1/y3;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lk1/u2;->k:Z

    return v0
.end method

.method j(Ljava/lang/String;Lp1/y;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lp1/y<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lk1/z0;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Starting transaction: %s"

    invoke-static {v0, p1, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v0, p0, Lk1/u2;->i:Landroid/database/sqlite/SQLiteTransactionListener;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    :try_start_0
    invoke-interface {p2}, Lp1/y;->get()Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method

.method k(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    sget-object v0, Lk1/z0;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Starting transaction: %s"

    invoke-static {v0, p1, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v0, p0, Lk1/u2;->i:Landroid/database/sqlite/SQLiteTransactionListener;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    :try_start_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    iget-object p1, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method

.method public l()V
    .locals 4

    iget-boolean v0, p0, Lk1/u2;->k:Z

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SQLitePersistence shutdown without start!"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lk1/u2;->k:Z

    iget-object v0, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method public m()V
    .locals 4

    iget-boolean v0, p0, Lk1/u2;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "SQLitePersistence double-started!"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lk1/u2;->k:Z

    :try_start_0
    iget-object v0, p0, Lk1/u2;->c:Lk1/u2$c;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lk1/u2;->e:Lk1/y3;

    invoke-virtual {v0}, Lk1/y3;->B()V

    iget-object v0, p0, Lk1/u2;->h:Lk1/c2;

    iget-object v1, p0, Lk1/u2;->e:Lk1/y3;

    invoke-virtual {v1}, Lk1/y3;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lk1/c2;->z(J)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to gain exclusive lock to the Cloud Firestore client\'s offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method varargs u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I
    .locals 0

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V

    invoke-static {p1, p2}, Lk1/u2;->r(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result p1

    return p1
.end method

.method varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lk1/u2;->j:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method w()J
    .locals 4

    invoke-direct {p0}, Lk1/u2;->x()J

    move-result-wide v0

    invoke-direct {p0}, Lk1/u2;->y()J

    move-result-wide v2

    mul-long v0, v0, v2

    return-wide v0
.end method

.method public z()Lk1/c2;
    .locals 1

    iget-object v0, p0, Lk1/u2;->h:Lk1/c2;

    return-object v0
.end method
