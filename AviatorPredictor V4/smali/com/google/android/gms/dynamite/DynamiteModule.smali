.class public final Lcom/google/android/gms/dynamite/DynamiteModule;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;,
        Lcom/google/android/gms/dynamite/DynamiteModule$a;,
        Lcom/google/android/gms/dynamite/DynamiteModule$b;
    }
.end annotation


# static fields
.field public static final b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field public static final c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field public static final d:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field public static final e:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field public static final f:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field public static final g:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field private static h:Ljava/lang/Boolean; = null

.field private static i:Ljava/lang/String; = null

.field private static j:Z = false

.field private static k:I = -0x1

.field private static final l:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/google/android/gms/dynamite/k;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final n:Lcom/google/android/gms/dynamite/DynamiteModule$b$a;

.field public static final o:Lcom/google/android/gms/dynamite/DynamiteModule$b;

.field private static p:Lcom/google/android/gms/dynamite/m;

.field private static q:Lcom/google/android/gms/dynamite/n;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    new-instance v0, Lcom/google/android/gms/dynamite/b;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    new-instance v0, Lcom/google/android/gms/dynamite/c;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->n:Lcom/google/android/gms/dynamite/DynamiteModule$b$a;

    new-instance v0, Lcom/google/android/gms/dynamite/d;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/e;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/f;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->d:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/g;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->e:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/h;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->f:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/i;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->g:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    new-instance v0, Lcom/google/android/gms/dynamite/j;

    invoke-direct {v0}, Lcom/google/android/gms/dynamite/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->o:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/dynamite/DynamiteModule;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 5

    const-string v0, "DynamiteModule"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3d

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "com.google.android.gms.dynamite.descriptors."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ModuleDescriptor"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-string v2, "MODULE_ID"

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const-string v3, "MODULE_VERSION"

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p1}, Lw/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x33

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Module descriptor id \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' didn\'t match expected id \'"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Failed to load module descriptor class: "

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x2d

    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "Local module descriptor class for "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return v1
.end method

.method public static c(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-class v4, Lcom/google/android/gms/dynamite/DynamiteModule;

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/dynamite/k;

    new-instance v6, Lcom/google/android/gms/dynamite/k;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lcom/google/android/gms/dynamite/k;-><init>(Le0/c;)V

    invoke-virtual {v0, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    sget-object v8, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    sget-object v13, Lcom/google/android/gms/dynamite/DynamiteModule;->n:Lcom/google/android/gms/dynamite/DynamiteModule$b$a;

    invoke-interface {v2, v1, v3, v13}, Lcom/google/android/gms/dynamite/DynamiteModule$b;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/dynamite/DynamiteModule$b$a;)Lcom/google/android/gms/dynamite/DynamiteModule$b$b;

    move-result-object v13

    const-string v14, "DynamiteModule"

    iget v15, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->a:I

    iget v7, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->b:I

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int/lit8 v17, v17, 0x44

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v18

    add-int v11, v17, v18

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v11, "Considering local module "

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ":"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " and remote module "

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ":"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v14, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v7, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->c:I

    if-eqz v7, :cond_18

    const/4 v11, -0x1

    if-ne v7, v11, :cond_0

    iget v7, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->a:I

    if-eqz v7, :cond_18

    const/4 v7, -0x1

    :cond_0
    const/4 v12, 0x1

    if-ne v7, v12, :cond_1

    iget v14, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->b:I

    if-eqz v14, :cond_18

    :cond_1
    if-ne v7, v11, :cond_4

    invoke-static {v1, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->f(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const-wide/16 v2, 0x0

    cmp-long v4, v9, v2

    if-nez v4, :cond_2

    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_0

    :cond_2
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v1

    :cond_4
    if-ne v7, v12, :cond_17

    :try_start_1
    iget v14, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    monitor-enter v4
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    sget-object v15, Lcom/google/android/gms/dynamite/DynamiteModule;->h:Ljava/lang/Boolean;

    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v15, :cond_12

    :try_start_4
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const/4 v12, 0x2

    if-eqz v15, :cond_a

    const-string v15, "DynamiteModule"

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v18

    add-int/lit8 v11, v18, 0x33

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v11, "Selected remote version of "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ", version >= "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    monitor-enter v4
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    sget-object v7, Lcom/google/android/gms/dynamite/DynamiteModule;->q:Lcom/google/android/gms/dynamite/n;

    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v7, :cond_9

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/dynamite/k;

    if-eqz v11, :cond_8

    iget-object v15, v11, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v15, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    iget-object v11, v11, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    monitor-enter v4
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    sget v2, Lcom/google/android/gms/dynamite/DynamiteModule;->k:I

    if-lt v2, v12, :cond_5

    const/4 v12, 0x1

    goto :goto_1

    :cond_5
    const/4 v12, 0x0

    :goto_1
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "DynamiteModule"

    const-string v4, "Dynamite loader version >= 2, using loadModule2NoCrashUtils"

    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v15}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v2

    invoke-static {v11}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    invoke-virtual {v7, v2, v3, v14, v4}, Lcom/google/android/gms/dynamite/n;->w(Ld0/a;Ljava/lang/String;ILd0/a;)Ld0/a;

    move-result-object v2

    goto :goto_2

    :cond_6
    const-string v2, "DynamiteModule"

    const-string v4, "Dynamite loader version < 2, falling back to loadModule2"

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v15}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v2

    invoke-static {v11}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    invoke-virtual {v7, v2, v3, v14, v4}, Lcom/google/android/gms/dynamite/n;->h(Ld0/a;Ljava/lang/String;ILd0/a;)Ld0/a;

    move-result-object v2

    :goto_2
    invoke-static {v2}, Ld0/b;->h(Ld0/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-eqz v2, :cond_7

    new-instance v4, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-direct {v4, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V

    goto/16 :goto_4

    :cond_7
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Failed to get module context"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_0
    move-exception v0

    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v0

    :cond_8
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "No result cursor"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0

    :cond_9
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "DynamiteLoaderV2 was not cached."

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_1
    move-exception v0

    :try_start_b
    monitor-exit v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw v0

    :cond_a
    const-string v2, "DynamiteModule"

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x33

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Selected remote version of "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", version >= "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/dynamite/DynamiteModule;->i(Landroid/content/Context;)Lcom/google/android/gms/dynamite/m;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/google/android/gms/dynamite/m;->h()I

    move-result v4

    const/4 v7, 0x3

    if-lt v4, v7, :cond_c

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/dynamite/k;

    if-eqz v4, :cond_b

    invoke-static/range {p0 .. p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v7

    iget-object v4, v4, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    invoke-static {v4}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    invoke-virtual {v2, v7, v3, v14, v4}, Lcom/google/android/gms/dynamite/m;->z(Ld0/a;Ljava/lang/String;ILd0/a;)Ld0/a;

    move-result-object v2

    goto :goto_3

    :cond_b
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "No cached result cursor holder"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0

    :cond_c
    if-ne v4, v12, :cond_d

    const-string v4, "DynamiteModule"

    const-string v7, "IDynamite loader version = 2"

    invoke-static {v4, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p0 .. p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    invoke-virtual {v2, v4, v3, v14}, Lcom/google/android/gms/dynamite/m;->A(Ld0/a;Ljava/lang/String;I)Ld0/a;

    move-result-object v2

    goto :goto_3

    :cond_d
    const-string v4, "DynamiteModule"

    const-string v7, "Dynamite loader version < 2, falling back to createModuleContext"

    invoke-static {v4, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p0 .. p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    invoke-virtual {v2, v4, v3, v14}, Lcom/google/android/gms/dynamite/m;->y(Ld0/a;Ljava/lang/String;I)Ld0/a;

    move-result-object v2

    :goto_3
    invoke-static {v2}, Ld0/b;->h(Ld0/a;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_10

    new-instance v4, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-static {v2}, Ld0/b;->h(Ld0/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-direct {v4, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :goto_4
    const-wide/16 v1, 0x0

    cmp-long v3, v9, v1

    if-nez v3, :cond_e

    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_5

    :cond_e
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_5
    iget-object v1, v6, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_f

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_f
    invoke-virtual {v0, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v4

    :cond_10
    :try_start_d
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Failed to load remote module."

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Failed to create IDynamiteLoader."

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0

    :cond_12
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Failed to determine which loading route to use."

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0
    :try_end_d
    .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_d} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catchall_2
    move-exception v0

    :try_start_e
    monitor-exit v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :try_start_f
    throw v0
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_10
    invoke-static {v1, v0}, Lb0/e;->a(Landroid/content/Context;Ljava/lang/Throwable;)Z

    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v4, "Failed to load remote module."

    const/4 v7, 0x0

    invoke-direct {v2, v4, v0, v7}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le0/d;)V

    throw v2

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v4, "Failed to load remote module."

    const/4 v7, 0x0

    invoke-direct {v2, v4, v0, v7}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le0/d;)V

    throw v2
    :try_end_10
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catch_2
    move-exception v0

    :try_start_11
    const-string v2, "DynamiteModule"

    const-string v4, "Failed to load remote module: "

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_13

    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_13
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v4, v7

    :goto_6
    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget v2, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->a:I

    if-eqz v2, :cond_16

    new-instance v4, Lcom/google/android/gms/dynamite/l;

    const/4 v7, 0x0

    invoke-direct {v4, v2, v7}, Lcom/google/android/gms/dynamite/l;-><init>(II)V

    move-object/from16 v2, p1

    invoke-interface {v2, v1, v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule$b;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/dynamite/DynamiteModule$b$a;)Lcom/google/android/gms/dynamite/DynamiteModule$b$b;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->c:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_16

    invoke-static {v1, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->f(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    const-wide/16 v1, 0x0

    cmp-long v3, v9, v1

    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    if-nez v3, :cond_14

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_7

    :cond_14
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_7
    iget-object v1, v6, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_15

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_15
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0

    :cond_16
    :try_start_12
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Remote load failed. No local fallback found."

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le0/d;)V

    throw v1

    :cond_17
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "VersionPolicy returned invalid code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0

    :cond_18
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    iget v1, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->a:I

    iget v2, v13, Lcom/google/android/gms/dynamite/DynamiteModule$b$b;->b:I

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x5c

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "No acceptable module "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " found. Local version is "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " and remote version is "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    :catchall_4
    move-exception v0

    const-wide/16 v1, 0x0

    cmp-long v3, v9, v1

    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    if-nez v3, :cond_19

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_8

    :cond_19
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_8
    iget-object v1, v6, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_1a

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1a
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    throw v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 9

    :try_start_0
    const-class v0, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->h:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const/4 v2, 0x0

    if-nez v1, :cond_8

    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-class v3, Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v3, "sClassLoader"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v3

    monitor-enter v3
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ClassLoader;

    if-eqz v4, :cond_1

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-ne v4, v1, :cond_0

    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_4

    :cond_0
    :try_start_4
    invoke-static {v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->g(Ljava/lang/ClassLoader;)V
    :try_end_4
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    :try_start_5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_4

    :cond_1
    sget-boolean v4, Lcom/google/android/gms/dynamite/DynamiteModule;->j:Z

    if-nez v4, :cond_7

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    :try_start_6
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v5

    sget-object v6, Lcom/google/android/gms/dynamite/DynamiteModule;->i:Ljava/lang/String;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {}, Le0/b;->a()Ljava/lang/ClassLoader;

    move-result-object v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v6, v7, :cond_5

    new-instance v6, Ldalvik/system/DelegateLastClassLoader;

    sget-object v7, Lcom/google/android/gms/dynamite/DynamiteModule;->i:Ljava/lang/String;

    invoke-static {v7}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ldalvik/system/DelegateLastClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    goto :goto_1

    :cond_5
    new-instance v6, Lcom/google/android/gms/dynamite/a;

    sget-object v7, Lcom/google/android/gms/dynamite/DynamiteModule;->i:Ljava/lang/String;

    invoke-static {v7}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lcom/google/android/gms/dynamite/a;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    :goto_1
    invoke-static {v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->g(Ljava/lang/ClassLoader;)V

    invoke-virtual {v1, v2, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->h:Ljava/lang/Boolean;
    :try_end_6
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    return v5

    :cond_6
    :goto_2
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    return v5

    :catch_1
    :try_start_b
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :goto_4
    monitor-exit v3

    goto :goto_6

    :catchall_0
    move-exception v1

    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    throw v1
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v1

    :goto_5
    :try_start_d
    const-string v3, "DynamiteModule"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x1e

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Failed to load module via V2: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_6
    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->h:Ljava/lang/Boolean;

    :cond_8
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :try_start_e
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    :try_start_f
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p0
    :try_end_f
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    return p0

    :catch_5
    move-exception p1

    :try_start_10
    const-string p2, "DynamiteModule"

    const-string v0, "Failed to retrieve remote module version: "

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_7

    :cond_9
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_7
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_a
    invoke-static {p0}, Lcom/google/android/gms/dynamite/DynamiteModule;->i(Landroid/content/Context;)Lcom/google/android/gms/dynamite/m;

    move-result-object v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    if-nez v3, :cond_b

    goto/16 :goto_d

    :cond_b
    :try_start_11
    invoke-virtual {v3}, Lcom/google/android/gms/dynamite/m;->h()I

    move-result v0

    const/4 v4, 0x3

    if-lt v0, v4, :cond_11

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/dynamite/k;

    if-eqz v0, :cond_c

    iget-object v0, v0, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-eqz v0, :cond_c

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    goto/16 :goto_d

    :cond_c
    invoke-static {p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v4

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    move-object v5, p1

    move v6, p2

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/dynamite/m;->B(Ld0/a;Ljava/lang/String;ZJ)Ld0/a;

    move-result-object p1

    invoke-static {p1}, Ld0/b;->h(Ld0/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/database/Cursor;
    :try_end_11
    .catch Landroid/os/RemoteException; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz p1, :cond_10

    :try_start_12
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-nez p2, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    if-lez p2, :cond_e

    invoke-static {p1}, Lcom/google/android/gms/dynamite/DynamiteModule;->h(Landroid/database/Cursor;)Z

    move-result v0
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    if-eqz v0, :cond_e

    goto :goto_8

    :cond_e
    move-object v2, p1

    :goto_8
    if-eqz v2, :cond_f

    :try_start_13
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    :cond_f
    move v1, p2

    goto :goto_d

    :cond_10
    :goto_9
    :try_start_14
    const-string p2, "DynamiteModule"

    const-string v0, "Failed to retrieve remote module version."

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_14
    .catch Landroid/os/RemoteException; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz p1, :cond_14

    :try_start_15
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    goto :goto_d

    :catchall_1
    move-exception p2

    move-object v2, p1

    goto :goto_e

    :catch_6
    move-exception p2

    move-object v2, p1

    goto :goto_b

    :cond_11
    const/4 v4, 0x2

    if-ne v0, v4, :cond_12

    :try_start_16
    const-string v0, "DynamiteModule"

    const-string v4, "IDynamite loader version = 2, no high precision latency measurement."

    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v0

    invoke-virtual {v3, v0, p1, p2}, Lcom/google/android/gms/dynamite/m;->x(Ld0/a;Ljava/lang/String;Z)I

    move-result v1

    goto :goto_d

    :cond_12
    const-string v0, "DynamiteModule"

    const-string v4, "IDynamite loader version < 2, falling back to getModuleVersion2"

    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Ld0/b;->w(Ljava/lang/Object;)Ld0/a;

    move-result-object v0

    invoke-virtual {v3, v0, p1, p2}, Lcom/google/android/gms/dynamite/m;->w(Ld0/a;Ljava/lang/String;Z)I

    move-result v1
    :try_end_16
    .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    goto :goto_d

    :goto_a
    move-object p2, p1

    goto :goto_e

    :catch_7
    move-exception p1

    move-object p2, p1

    :goto_b
    :try_start_17
    const-string p1, "DynamiteModule"

    const-string v0, "Failed to retrieve remote module version: "

    invoke-virtual {p2}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_c

    :cond_13
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_c
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    if-eqz v2, :cond_14

    :try_start_18
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_14
    :goto_d
    return v1

    :catchall_2
    move-exception p1

    goto :goto_a

    :goto_e
    if-eqz v2, :cond_15

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_15
    throw p2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    :catchall_3
    move-exception p1

    :try_start_19
    monitor-exit v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    :try_start_1a
    throw p1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    :catchall_4
    move-exception p1

    invoke-static {p0, p1}, Lb0/e;->a(Landroid/content/Context;Ljava/lang/Throwable;)Z

    throw p1
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->m:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string p0, "api_force_staging"

    const-string v4, "api"

    const/4 v9, 0x1

    if-eq v9, p2, :cond_0

    move-object p0, v4

    :cond_0
    new-instance p2, Landroid/net/Uri$Builder;

    invoke-direct {p2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v4, "content"

    invoke-virtual {p2, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p2

    const-string v4, "com.google.android.gms.chimera"

    invoke-virtual {p2, v4}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    const-string p1, "requestStartTime"

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p0, :cond_7

    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    if-lez p2, :cond_4

    const-class v1, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v2, 0x2

    :try_start_2
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->i:Ljava/lang/String;

    const-string v2, "loaderVersion"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_1

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    sput v2, Lcom/google/android/gms/dynamite/DynamiteModule;->k:I

    :cond_1
    const-string v2, "disableStandaloneDynamiteLoader"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_3

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    :goto_0
    sput-boolean v9, Lcom/google/android/gms/dynamite/DynamiteModule;->j:Z

    move p1, v9

    :cond_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {p0}, Lcom/google/android/gms/dynamite/DynamiteModule;->h(Landroid/database/Cursor;)Z

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_4

    move-object p0, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_4
    :goto_1
    if-nez p1, :cond_6

    if-eqz p0, :cond_5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    :cond_5
    return p2

    :cond_6
    :try_start_6
    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string p2, "forcing fallback to container DynamiteLoader impl"

    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_7
    const-string p1, "DynamiteModule"

    const-string p2, "Failed to retrieve remote module version."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string p2, "Failed to connect to dynamite module ContentResolver."

    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Le0/d;)V

    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_1
    move-exception p0

    move-object p1, p0

    goto :goto_3

    :catch_1
    move-exception p0

    move-object p1, p0

    move-object p0, v0

    :goto_2
    :try_start_7
    instance-of p2, p1, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    if-eqz p2, :cond_8

    throw p1

    :cond_8
    new-instance p2, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v1, "V2 version check failed"

    invoke-direct {p2, v1, p1, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le0/d;)V

    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_3
    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_9
    throw p1
.end method

.method private static f(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Selected local version of "

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v0, "DynamiteModule"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lcom/google/android/gms/dynamite/DynamiteModule;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/dynamite/DynamiteModule;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static g(Ljava/lang/ClassLoader;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"

    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "com.google.android.gms.dynamite.IDynamiteLoaderV2"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lcom/google/android/gms/dynamite/n;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/google/android/gms/dynamite/n;

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/dynamite/n;

    invoke-direct {v1, p0}, Lcom/google/android/gms/dynamite/n;-><init>(Landroid/os/IBinder;)V

    :goto_0
    sput-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->q:Lcom/google/android/gms/dynamite/n;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    :goto_1
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v2, "Failed to instantiate dynamite loader"

    invoke-direct {v1, v2, p0, v0}, Lcom/google/android/gms/dynamite/DynamiteModule$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le0/d;)V

    throw v1
.end method

.method private static h(Landroid/database/Cursor;)Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/dynamite/k;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    if-nez v1, :cond_0

    iput-object p0, v0, Lcom/google/android/gms/dynamite/k;->a:Landroid/database/Cursor;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static i(Landroid/content/Context;)Lcom/google/android/gms/dynamite/m;
    .locals 5

    const-class v0, Lcom/google/android/gms/dynamite/DynamiteModule;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->p:Lcom/google/android/gms/dynamite/m;

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :cond_0
    const/4 v1, 0x0

    :try_start_1
    const-string v2, "com.google.android.gms"

    const/4 v3, 0x3

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v2, "com.google.android.gms.chimera.container.DynamiteLoaderImpl"

    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_1

    move-object v2, v1

    goto :goto_0

    :cond_1
    const-string v2, "com.google.android.gms.dynamite.IDynamiteLoader"

    invoke-interface {p0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/dynamite/m;

    if-eqz v3, :cond_2

    check-cast v2, Lcom/google/android/gms/dynamite/m;

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/google/android/gms/dynamite/m;

    invoke-direct {v2, p0}, Lcom/google/android/gms/dynamite/m;-><init>(Landroid/os/IBinder;)V

    :goto_0
    if-eqz v2, :cond_4

    sput-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->p:Lcom/google/android/gms/dynamite/m;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-object v2

    :catch_0
    move-exception p0

    const-string v2, "DynamiteModule"

    const-string v3, "Failed to load IDynamiteLoader from GmsCore: "

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/dynamite/DynamiteModule;->a:Landroid/content/Context;

    return-object v0
.end method
