.class public Lv2/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lr2/j$c;
.implements Lj2/a;
.implements Lk2/a;


# static fields
.field protected static final i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/firestore/FirebaseFirestore;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Lr2/q;

.field private b:Lr2/b;

.field private c:Lr2/j;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/firestore/t0;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr2/c;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lr2/c$d;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw2/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lv2/t;->i:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr2/q;

    sget-object v1, Lv2/b;->d:Lv2/b;

    invoke-direct {v0, v1}, Lr2/q;-><init>(Lr2/p;)V

    iput-object v0, p0, Lv2/t;->a:Lr2/q;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lv2/t;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv2/t;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv2/t;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv2/t;->g:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv2/t;->h:Ljava/util/Map;

    return-void
.end method

.method private A(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/r;

    invoke-direct {v2, p1, v0}, Lv2/r;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static B(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lv2/t;->i:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestore;

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private C()V
    .locals 2

    iget-object v0, p0, Lv2/t;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private D(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/o;

    invoke-direct {v2, p1, v0}, Lv2/o;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private E(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/n;

    invoke-direct {v2, p1, v0}, Lv2/n;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private F(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/d;

    invoke-direct {v2, p0, p1, v0}, Lv2/d;-><init>(Lv2/t;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private G(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/k;

    invoke-direct {v2, p1, v0}, Lv2/k;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private H(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/m;

    invoke-direct {v2, p1, v0}, Lv2/m;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private I(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/l;

    invoke-direct {v2, p1, v0}, Lv2/l;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method protected static J(Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 1

    sget-object v0, Lv2/t;->i:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private K(Ljava/util/Map;)Lcom/google/firebase/firestore/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/q0;"
        }
    .end annotation

    const-string v0, "source"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v0, "server"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "cache"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/firebase/firestore/q0;->e:Lcom/google/firebase/firestore/q0;

    return-object p1

    :cond_0
    sget-object p1, Lcom/google/firebase/firestore/q0;->g:Lcom/google/firebase/firestore/q0;

    return-object p1

    :cond_1
    sget-object p1, Lcom/google/firebase/firestore/q0;->f:Lcom/google/firebase/firestore/q0;

    return-object p1
.end method

.method private L(Lr2/b;)V
    .locals 3

    iput-object p1, p0, Lv2/t;->b:Lr2/b;

    new-instance v0, Lr2/j;

    iget-object v1, p0, Lv2/t;->a:Lr2/q;

    const-string v2, "plugins.flutter.io/firebase_firestore"

    invoke-direct {v0, p1, v2, v1}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    iput-object v0, p0, Lv2/t;->c:Lr2/j;

    invoke-virtual {v0, p0}, Lr2/j;->e(Lr2/j$c;)V

    invoke-static {v2, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    return-void
.end method

.method private static synthetic M(Ljava/util/Map;Lo0/i;)V
    .locals 13

    const-string v0, "mergeFields"

    const-string v1, "merge"

    :try_start_0
    const-string v2, "writes"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    const-string v3, "firestore"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->j()Lcom/google/firebase/firestore/x0;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    const-string v5, "type"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    const-string v6, "path"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    const-string v7, "data"

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-virtual {p0, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->o(Ljava/lang/String;)Lcom/google/firebase/firestore/h;

    move-result-object v6

    const/4 v8, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v9

    const v10, -0x6a6cd337

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v9, v10, :cond_2

    const v10, 0x14042

    if-eq v9, v10, :cond_1

    const v10, 0x77f979ab

    if-eq v9, v10, :cond_0

    goto :goto_1

    :cond_0
    const-string v9, "DELETE"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v8, 0x0

    goto :goto_1

    :cond_1
    const-string v9, "SET"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v8, 0x2

    goto :goto_1

    :cond_2
    const-string v9, "UPDATE"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v8, 0x1

    :cond_3
    :goto_1
    if-eqz v8, :cond_8

    if-eq v8, v12, :cond_7

    if-eq v8, v11, :cond_4

    goto :goto_0

    :cond_4
    const-string v5, "options"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/firebase/firestore/o0;->c()Lcom/google/firebase/firestore/o0;

    move-result-object v4

    :goto_2
    invoke-virtual {v3, v6, v7, v4}, Lcom/google/firebase/firestore/x0;->d(Lcom/google/firebase/firestore/h;Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lcom/google/firebase/firestore/x0;

    move-result-object v3

    goto/16 :goto_0

    :cond_5
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Lcom/google/firebase/firestore/o0;->d(Ljava/util/List;)Lcom/google/firebase/firestore/o0;

    move-result-object v4

    goto :goto_2

    :cond_6
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v6, v7}, Lcom/google/firebase/firestore/x0;->c(Lcom/google/firebase/firestore/h;Ljava/lang/Object;)Lcom/google/firebase/firestore/x0;

    move-result-object v3

    goto/16 :goto_0

    :cond_7
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-virtual {v3, v6, v7}, Lcom/google/firebase/firestore/x0;->f(Lcom/google/firebase/firestore/h;Ljava/util/Map;)Lcom/google/firebase/firestore/x0;

    move-result-object v3

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v3, v6}, Lcom/google/firebase/firestore/x0;->b(Lcom/google/firebase/firestore/h;)Lcom/google/firebase/firestore/x0;

    move-result-object v3

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v3}, Lcom/google/firebase/firestore/x0;->a()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_3
    return-void
.end method

.method private static synthetic N(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "firestore"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->k()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic O(Lo0/i;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lx0/e;->n(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/e;

    invoke-static {v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->u(Lx0/e;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->L()Lo0/h;

    move-result-object v3

    invoke-static {v3}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {v2}, Lx0/e;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lv2/t;->B(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lv2/t;->h0()V

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private static synthetic P(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "firestore"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->n()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic Q(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "reference"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/h;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/h;->h()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic R(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lv2/t;->K(Ljava/util/Map;)Lcom/google/firebase/firestore/q0;

    move-result-object v0

    const-string v1, "reference"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/firebase/firestore/h;

    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/h;->j(Lcom/google/firebase/firestore/q0;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/i;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic S(Ljava/util/Map;Lo0/i;)V
    .locals 5

    const-string v0, "mergeFields"

    const-string v1, "merge"

    :try_start_0
    const-string v2, "reference"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/firestore/h;

    const-string v3, "data"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    const-string v4, "options"

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/firebase/firestore/o0;->c()Lcom/google/firebase/firestore/o0;

    move-result-object p0

    :goto_0
    invoke-virtual {v2, v3, p0}, Lcom/google/firebase/firestore/h;->t(Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lo0/h;

    move-result-object p0

    goto :goto_1

    :cond_0
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lcom/google/firebase/firestore/o0;->d(Ljava/util/List;)Lcom/google/firebase/firestore/o0;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, Lcom/google/firebase/firestore/h;->s(Ljava/lang/Object;)Lo0/h;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method private static synthetic T(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    const-string v0, "reference"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/h;

    const-string v1, "data"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Map;

    invoke-virtual {v0, p0}, Lcom/google/firebase/firestore/h;->v(Ljava/util/Map;)Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic U(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "firestore"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->p()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic V(Lo0/i;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic W(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lv2/t;->K(Ljava/util/Map;)Lcom/google/firebase/firestore/q0;

    move-result-object v0

    const-string v1, "name"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "firestore"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->w(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/k0;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Named query has not been found. Please check it has been loaded properly via loadBundle()."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/k0;->l(Lcom/google/firebase/firestore/q0;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/m0;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic X(Ljava/lang/String;Lcom/google/firebase/firestore/t0;)V
    .locals 1

    iget-object v0, p0, Lv2/t;->e:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static synthetic Y(Lr2/j$d;Lo0/h;)V
    .locals 2

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lx2/a;->a(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const-string v1, "firebase_firestore"

    invoke-interface {p0, v1, p1, v0}, Lr2/j$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private synthetic Z(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lv2/t;->K(Ljava/util/Map;)Lcom/google/firebase/firestore/q0;

    move-result-object v0

    const-string v1, "query"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/k0;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "An error occurred while parsing query arguments, see native logs for more information. Please report this issue."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/k0;->l(Lcom/google/firebase/firestore/q0;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/m0;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic a0(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "firestore"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->L()Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->r()Lx0/e;

    move-result-object p0

    invoke-virtual {p0}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lv2/t;->B(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static synthetic b(Lv2/t;Ljava/lang/String;Lcom/google/firebase/firestore/t0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv2/t;->X(Ljava/lang/String;Lcom/google/firebase/firestore/t0;)V

    return-void
.end method

.method private synthetic b0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    const-string v0, "reference"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/h;

    const-string v1, "transactionId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lv2/t;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/t0;

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transaction.getDocument(): No transaction handler exists for ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {v1, v0}, Lcom/google/firebase/firestore/t0;->c(Lcom/google/firebase/firestore/h;)Lcom/google/firebase/firestore/i;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic c0(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    const-string v0, "firestore"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0}, Lcom/google/firebase/firestore/FirebaseFirestore;->N()Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private d0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/m0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/g;

    invoke-direct {v2, p0, p1, v0}, Lv2/g;-><init>(Lv2/t;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic e(Lv2/t;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lv2/t;->O(Lo0/i;)V

    return-void
.end method

.method private e0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/m0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/e;

    invoke-direct {v2, p0, p1, v0}, Lv2/e;-><init>(Lv2/t;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private f0(Ljava/lang/String;Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lr2/c;

    iget-object v1, p0, Lv2/t;->b:Lr2/b;

    iget-object v2, p0, Lv2/t;->a:Lr2/q;

    invoke-direct {v0, v1, p1, v2}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    invoke-virtual {v0, p3}, Lr2/c;->d(Lr2/c$d;)V

    iget-object p1, p0, Lv2/t;->f:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lv2/t;->g:Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private g0(Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lv2/t;->f0(Ljava/lang/String;Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic h(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->M(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private h0()V
    .locals 4

    iget-object v0, p0, Lv2/t;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lv2/t;->f:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/c;

    invoke-virtual {v1, v2}, Lr2/c;->d(Lr2/c$d;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv2/t;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lv2/t;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lv2/t;->g:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/c$d;

    invoke-interface {v1, v2}, Lr2/c$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lv2/t;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lv2/t;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method protected static i0(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lv2/t;->i:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestore;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic j(Lo0/i;)V
    .locals 0

    invoke-static {p0}, Lv2/t;->V(Lo0/i;)V

    return-void
.end method

.method private j0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/p;

    invoke-direct {v2, p1, v0}, Lv2/p;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private k0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Lcom/google/firebase/firestore/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/f;

    invoke-direct {v2, p0, p1, v0}, Lv2/f;-><init>(Lv2/t;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic l(Lv2/t;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv2/t;->R(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private l0(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transactionId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "result"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v1, p0, Lv2/t;->h:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/f;

    invoke-interface {v0, p1}, Lw2/f;->c(Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic m(Lv2/t;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv2/t;->Z(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private m0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/q;

    invoke-direct {v2, p1, v0}, Lv2/q;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic n(Lr2/j$d;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->Y(Lr2/j$d;Lo0/h;)V

    return-void
.end method

.method public static synthetic o(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->S(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic p(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->U(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic q(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->T(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic r(Lv2/t;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv2/t;->b0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic s(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->Q(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic t(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->P(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic u(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->a0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic v(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->c0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic w(Lv2/t;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lv2/t;->W(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method public static synthetic x(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lv2/t;->N(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private y(Lk2/c;)V
    .locals 1

    iget-object v0, p0, Lv2/t;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-interface {p1}, Lk2/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private z(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/c;

    invoke-direct {v2, p1, v0}, Lv2/c;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lr2/i;Lr2/j$d;)V
    .locals 3

    iget-object v0, p1, Lr2/i;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "Firestore#enableNetwork"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "Firestore#waitForPendingWrites"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "Firestore#clearPersistence"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "Transaction#get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "Query#get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "Query#snapshots"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "DocumentReference#set"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "DocumentReference#get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "DocumentReference#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "Firestore#terminate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "DocumentReference#delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "LoadBundle#snapshots"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_c
    const-string v1, "Transaction#create"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_d
    const-string v1, "Transaction#storeResult"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_e
    const-string v1, "WriteBatch#commit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_f
    const-string v1, "DocumentReference#snapshots"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_10
    const-string v1, "Firestore#disableNetwork"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_11
    const-string v1, "SnapshotsInSync#setup"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_12
    const-string v1, "Firestore#namedQueryGet"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lr2/j$d;->c()V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->I(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->m0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->A(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->k0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->e0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_5
    new-instance p1, Lw2/h;

    invoke-direct {p1}, Lw2/h;-><init>()V

    const-string v0, "plugins.flutter.io/firebase_firestore/query"

    invoke-direct {p0, v0, p1}, Lv2/t;->g0(Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_6
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->G(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->F(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->H(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->j0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->E(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_b
    new-instance p1, Lw2/e;

    invoke-direct {p1}, Lw2/e;-><init>()V

    const-string v0, "plugins.flutter.io/firebase_firestore/loadBundle"

    invoke-direct {p0, v0, p1}, Lv2/t;->g0(Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_c
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lw2/o;

    new-instance v1, Lv2/j;

    invoke-direct {v1, p0, p1}, Lv2/j;-><init>(Lv2/t;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lw2/o;-><init>(Lw2/o$a;)V

    const-string v1, "plugins.flutter.io/firebase_firestore/transaction"

    invoke-direct {p0, v1, p1, v0}, Lv2/t;->f0(Ljava/lang/String;Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    iget-object v1, p0, Lv2/t;->h:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_d
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->l0(Ljava/util/Map;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_e
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->z(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_f
    new-instance p1, Lw2/b;

    invoke-direct {p1}, Lw2/b;-><init>()V

    const-string v0, "plugins.flutter.io/firebase_firestore/document"

    invoke-direct {p0, v0, p1}, Lv2/t;->g0(Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_10
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->D(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_11
    new-instance p1, Lw2/j;

    invoke-direct {p1}, Lw2/j;-><init>()V

    const-string v0, "plugins.flutter.io/firebase_firestore/snapshotsInSync"

    invoke-direct {p0, v0, p1}, Lv2/t;->g0(Ljava/lang/String;Lr2/c$d;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_12
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lv2/t;->d0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    :goto_1
    new-instance v0, Lv2/i;

    invoke-direct {v0, p2}, Lv2/i;-><init>(Lr2/j$d;)V

    invoke-virtual {p1, v0}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d79de71 -> :sswitch_12
        -0x544ff5b7 -> :sswitch_11
        -0x503952a2 -> :sswitch_10
        -0x4bb1ed44 -> :sswitch_f
        -0x49bb3401 -> :sswitch_e
        -0x47d655e7 -> :sswitch_d
        -0x2ee8b19f -> :sswitch_c
        -0x2e7dfe6c -> :sswitch_b
        -0x273fb6c2 -> :sswitch_a
        -0xdc6d7d7 -> :sswitch_9
        -0x9a603a4 -> :sswitch_8
        0x1f9aca3 -> :sswitch_7
        0x1f9d9af -> :sswitch_6
        0x419d114 -> :sswitch_5
        0xba90cfb -> :sswitch_4
        0xfc46411 -> :sswitch_3
        0x183fb74a -> :sswitch_2
        0x1ec0336f -> :sswitch_1
        0x5d1f68f3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lj2/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lv2/t;->L(Lr2/b;)V

    return-void
.end method

.method public d(Lj2/a$b;)V
    .locals 1

    iget-object p1, p0, Lv2/t;->c:Lr2/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr2/j;->e(Lr2/j$c;)V

    iput-object v0, p0, Lv2/t;->c:Lr2/j;

    invoke-direct {p0}, Lv2/t;->h0()V

    iput-object v0, p0, Lv2/t;->b:Lr2/b;

    return-void
.end method

.method public didReinitializeFirebaseCore()Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lv2/h;

    invoke-direct {v2, p0, v0}, Lv2/h;-><init>(Lv2/t;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 0

    invoke-direct {p0}, Lv2/t;->C()V

    return-void
.end method

.method public g(Lk2/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lv2/t;->y(Lk2/c;)V

    return-void
.end method

.method public getPluginConstantsForFirebaseApp(Lx0/e;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/e;",
            ")",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance p1, Lo0/i;

    invoke-direct {p1}, Lo0/i;-><init>()V

    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lv2/s;

    invoke-direct {v1, p1}, Lv2/s;-><init>(Lo0/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public i(Lk2/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lv2/t;->y(Lk2/c;)V

    return-void
.end method

.method public k()V
    .locals 0

    invoke-direct {p0}, Lv2/t;->C()V

    return-void
.end method
