.class public Lu2/r0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lr2/j$c;
.implements Lj2/a;
.implements Lk2/a;
.implements Lu2/t0$d;
.implements Lu2/t0$b;


# static fields
.field static final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/google/firebase/auth/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lr2/b;

.field private b:Lr2/j;

.field private c:Landroid/app/Activity;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lr2/c;",
            "Lr2/c$d;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/g0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/k0;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/j0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lu2/r0;->h:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/r0;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/r0;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/r0;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/r0;->g:Ljava/util/Map;

    return-void
.end method

.method public static synthetic A(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->c1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic A0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    const-string v1, "forceRefresh"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    const-string v2, "tokenOnly"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/z;->k0(Z)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/b0;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "token"

    invoke-virtual {v0}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0, v0}, Lu2/r0;->q1(Lcom/google/firebase/auth/b0;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private A1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/p0;

    invoke-direct {v2, p0, p1, v0}, Lu2/p0;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic B(Lu2/r0;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lu2/r0;->x0(Lo0/i;)V

    return-void
.end method

.method private static synthetic B0(Lx0/e;Lo0/i;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->m()Lcom/google/firebase/auth/z;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->o()Ljava/lang/String;

    move-result-object p0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

    move-result-object v1

    :goto_0
    if-eqz p0, :cond_1

    const-string v2, "APP_LANGUAGE_CODE"

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v1, :cond_2

    const-string p0, "APP_CURRENT_USER"

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private B1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/m;

    invoke-direct {v2, p0, p1, v0}, Lu2/m;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic C(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->P0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic C0(Lu2/t0$i;Lo0/h;)V
    .locals 2

    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/auth/k0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lu2/r0;->f:Ljava/util/Map;

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lu2/t0$g$a;

    invoke-direct {p2}, Lu2/t0$g$a;-><init>()V

    invoke-virtual {p2, v0}, Lu2/t0$g$a;->b(Ljava/lang/String;)Lu2/t0$g$a;

    move-result-object p2

    invoke-virtual {p2}, Lu2/t0$g$a;->a()Lu2/t0$g;

    move-result-object p2

    invoke-interface {p1, p2}, Lu2/t0$i;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p2

    invoke-interface {p1, p2}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private C1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/c;

    invoke-direct {v2, p1, v0}, Lu2/c;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic D(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->z0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic D0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    invoke-direct {p0, p1}, Lu2/r0;->l0(Ljava/util/Map;)Lcom/google/firebase/auth/h;

    move-result-object p1

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    invoke-static {}, Lu2/s0;->d()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->q0(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p1}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "User has already been linked to the given provider."

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lu2/s0;->a()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_2
    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private D1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/i;

    invoke-direct {v2, p0, p1, v0}, Lu2/i;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic E(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->L0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic E0(Lr2/j$d;Lo0/h;)V
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

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Lu2/r0;->o0(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "firebase_auth"

    invoke-interface {p0, v1, v0, p1}, Lr2/j$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private E1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/x;

    invoke-direct {v2, p0, p1, v0}, Lu2/x;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic F(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->s0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic F0(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    invoke-direct {p0, p1}, Lu2/r0;->l0(Ljava/util/Map;)Lcom/google/firebase/auth/h;

    move-result-object p1

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    invoke-static {}, Lu2/s0;->d()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->r0(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p1}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

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

.method private F1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/l;

    invoke-direct {v2, p0, p1, v0}, Lu2/l;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic G(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->t0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic G0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    new-instance v0, Lu2/b;

    invoke-direct {v0, p1}, Lu2/b;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "plugins.flutter.io/firebase_auth/auth-state/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p1

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lr2/c;

    iget-object v2, p0, Lu2/r0;->a:Lr2/b;

    invoke-direct {v1, v2, p1}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lr2/c;->d(Lr2/c$d;)V

    iget-object v2, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method private G1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/b0;

    invoke-direct {v2, p0, p1, v0}, Lu2/b0;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic H(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->R0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic H0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    new-instance v0, Lu2/c1;

    invoke-direct {v0, p1}, Lu2/c1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "plugins.flutter.io/firebase_auth/id-token/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p1

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lr2/c;

    iget-object v2, p0, Lu2/r0;->a:Lr2/b;

    invoke-direct {v1, v2, p1}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lr2/c;->d(Lr2/c$d;)V

    iget-object v2, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method private H1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/t;

    invoke-direct {v2, p0, p1, v0}, Lu2/t;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic I(Lcom/google/firebase/auth/n0;)V
    .locals 0

    invoke-static {p0}, Lu2/r0;->f1(Lcom/google/firebase/auth/n0;)V

    return-void
.end method

.method private synthetic I0(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->s0()Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object p1

    invoke-static {p1}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

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

.method private I1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/s;

    invoke-direct {v2, p0, p1, v0}, Lu2/s;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic J(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->N0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic J0(Lu2/t0$i;Lo0/h;)V
    .locals 1

    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p2}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Lu2/t0$i;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p2

    invoke-interface {p1, p2}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private J1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/m0;

    invoke-direct {v2, p1, v0}, Lu2/m0;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic K(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->D0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic K0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v1, "actionCodeSettings"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->t0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->h0(Ljava/util/Map;)Lcom/google/firebase/auth/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->u0(Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private K1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/d;

    invoke-direct {v2, p0, p1, v0}, Lu2/d;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic L(Lu2/r0;Lu2/t0$i;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->C0(Lu2/t0$i;Lo0/h;)V

    return-void
.end method

.method private synthetic L0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "actionCodeSettings"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->s(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->h0(Ljava/util/Map;)Lcom/google/firebase/auth/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/FirebaseAuth;->t(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v2}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private L1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/p;

    invoke-direct {v2, p0, p1, v0}, Lu2/p;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic M(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->Y0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic M0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "actionCodeSettings"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->h0(Ljava/util/Map;)Lcom/google/firebase/auth/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/FirebaseAuth;->u(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    const/4 p1, 0x0

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

.method private M1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/r;

    invoke-direct {v2, p0, p1, v0}, Lu2/r;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic N(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->I0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic N0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "languageCode"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->E()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->v(Ljava/lang/String;)V

    :goto_0
    new-instance p1, Lu2/r0$a;

    invoke-direct {p1, p0, v0}, Lu2/r0$a;-><init>(Lu2/r0;Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private N1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/a0;

    invoke-direct {v2, p0, p1, v0}, Lu2/a0;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic O(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->e1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic O0(Ljava/util/Map;Lo0/i;)V
    .locals 5

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "appVerificationDisabledForTesting"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    const-string v2, "forceRecaptchaFlow"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    const-string v3, "phoneNumber"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "smsCode"

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->n()Lcom/google/firebase/auth/v;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v4, v1}, Lcom/google/firebase/auth/v;->b(Z)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->n()Lcom/google/firebase/auth/v;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/firebase/auth/v;->a(Z)V

    :cond_1
    if-eqz v3, :cond_2

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->n()Lcom/google/firebase/auth/v;

    move-result-object v0

    invoke-virtual {v0, v3, p0}, Lcom/google/firebase/auth/v;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
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

.method private O1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/f;

    invoke-direct {v2, p0, p1, v0}, Lu2/f;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic P(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->Z0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic P0(Ljava/util/Map;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->x()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p1}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

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

.method private P1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/n;

    invoke-direct {v2, p1, v0}, Lu2/n;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic Q(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->U0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic Q0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "signInProvider"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/auth/m0;->b(Ljava/lang/String;)Lcom/google/firebase/auth/m0$a;

    move-result-object v1

    iget-object v2, p0, Lu2/r0;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Lcom/google/firebase/auth/m0$a;->a()Lcom/google/firebase/auth/m0;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->D(Landroid/app/Activity;Lcom/google/firebase/auth/n;)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i;

    invoke-direct {p0, v0}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/auth/t;

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2, v0}, Lu2/r0;->q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private Q1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/h;

    invoke-direct {v2, p0, p1, v0}, Lu2/h;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic R(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->T0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic R0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-direct {p0, p1}, Lu2/r0;->l0(Ljava/util/Map;)Lcom/google/firebase/auth/h;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->y(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i;

    invoke-direct {p0, v0}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lu2/s0;->d()Lu2/s0;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/auth/t;

    if-eqz v1, :cond_1

    invoke-direct {p0, p1, p2, v0}, Lu2/r0;->q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private R1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/l0;

    invoke-direct {v2, p1, v0}, Lu2/l0;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic S(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->A0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic S0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "token"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->z(Ljava/lang/String;)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i;

    invoke-direct {p0, v0}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/auth/t;

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2, v0}, Lu2/r0;->q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private S1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/e;

    invoke-direct {v2, p0, p1, v0}, Lu2/e;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic T(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->v0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic T0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "password"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->A(Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i;

    invoke-direct {p0, v0}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/auth/t;

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2, v0}, Lu2/r0;->q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static synthetic U(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->K0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic U0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "emailLink"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->B(Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/i;

    invoke-direct {p0, v0}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/google/firebase/auth/t;

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2, v0}, Lu2/r0;->q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static synthetic V(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->Q0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic V0(Ljava/util/Map;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->C()V

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

.method public static synthetic W(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->V0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic W0(Lu2/t0$i;Lo0/h;)V
    .locals 1

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lu2/t0$i;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-interface {p0, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic X(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->w0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic X0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v1, "providerId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->v0(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p1}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    invoke-static {}, Lu2/s0;->e()Lu2/s0;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public static synthetic Y(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->a1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic Y0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v1, "newEmail"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->w0(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->s0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-static {v0}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

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

.method public static synthetic Z(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->u0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic Z0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v1, "newPassword"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->x0(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->s0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-static {v0}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

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

.method public static synthetic a0(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->S0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic a1(Ljava/util/Map;Lo0/i;)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lu2/r0;->l0(Ljava/util/Map;)Lcom/google/firebase/auth/h;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/n0;

    if-nez p1, :cond_1

    invoke-static {}, Lu2/s0;->d()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/z;->y0(Lcom/google/firebase/auth/n0;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->s0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-static {v0}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

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

.method private b0(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/j0;

    invoke-direct {v2, p1, v0}, Lu2/j0;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic b1(Ljava/util/Map;Lo0/i;)V
    .locals 5

    const-string v0, "photoURL"

    const-string v1, "displayName"

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v3, "profile"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    new-instance v3, Lcom/google/firebase/auth/y0$a;

    invoke-direct {v3}, Lcom/google/firebase/auth/y0$a;-><init>()V

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Lcom/google/firebase/auth/y0$a;->b(Ljava/lang/String;)Lcom/google/firebase/auth/y0$a;

    :cond_1
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/firebase/auth/y0$a;->c(Landroid/net/Uri;)Lcom/google/firebase/auth/y0$a;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Lcom/google/firebase/auth/y0$a;->c(Landroid/net/Uri;)Lcom/google/firebase/auth/y0$a;

    :cond_3
    :goto_0
    invoke-virtual {v3}, Lcom/google/firebase/auth/y0$a;->a()Lcom/google/firebase/auth/y0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/firebase/auth/z;->z0(Lcom/google/firebase/auth/y0;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/firebase/auth/z;->s0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-static {v2}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private c0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/k;

    invoke-direct {v2, p0, p1, v0}, Lu2/k;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic c1(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "host"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "port"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Lcom/google/firebase/auth/FirebaseAuth;->F(Ljava/lang/String;I)V

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
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/n0;

    invoke-direct {v2, p1, v0}, Lu2/n0;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic d1(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object v1

    invoke-virtual {p2, v1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :cond_0
    const-string v1, "newEmail"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "actionCodeSettings"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/z;->A0(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->h0(Ljava/util/Map;)Lcom/google/firebase/auth/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/z;->B0(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    invoke-virtual {p2, v2}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/v;

    invoke-direct {v2, p0, p1, v0}, Lu2/v;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic e1(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "email"

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->G(Ljava/lang/String;)Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private f0(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/z;

    invoke-direct {v2, p0, p1, v0}, Lu2/z;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic f1(Lcom/google/firebase/auth/n0;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    sget-object v1, Lu2/r0;->h:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/y;

    invoke-direct {v2, p1, v0}, Lu2/y;-><init>(Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private synthetic g1(Ljava/util/Map;Lo0/i;)V
    .locals 9

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "plugins.flutter.io/firebase_auth/phone/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lr2/c;

    iget-object v2, p0, Lu2/r0;->a:Lr2/b;

    invoke-direct {v1, v2, v0}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;)V

    const-string v2, "multiFactorSessionId"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, p0, Lu2/r0;->f:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/k0;

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    const-string v2, "multiFactorInfo"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v4, p0, Lu2/r0;->g:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lu2/r0;->g:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/firebase/auth/j0;

    invoke-virtual {v6}, Lcom/google/firebase/auth/j0;->j0()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/firebase/auth/i0;

    invoke-virtual {v7}, Lcom/google/firebase/auth/i0;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    instance-of v8, v7, Lcom/google/firebase/auth/s0;

    if-eqz v8, :cond_2

    move-object v3, v7

    check-cast v3, Lcom/google/firebase/auth/s0;

    goto :goto_1

    :cond_3
    move-object v6, v3

    new-instance v8, Lu2/d1;

    invoke-direct {p0}, Lu2/r0;->i0()Landroid/app/Activity;

    move-result-object v3

    sget-object v7, Lu2/k0;->a:Lu2/k0;

    move-object v2, v8

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lu2/d1;-><init>(Landroid/app/Activity;Ljava/util/Map;Lcom/google/firebase/auth/k0;Lcom/google/firebase/auth/s0;Lu2/d1$b;)V

    invoke-virtual {v1, v8}, Lr2/c;->d(Lr2/c$d;)V

    iget-object p1, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {p1, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method private h0(Ljava/util/Map;)Lcom/google/firebase/auth/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/auth/e;"
        }
    .end annotation

    invoke-static {}, Lcom/google/firebase/auth/e;->p0()Lcom/google/firebase/auth/e$a;

    move-result-object v0

    const-string v1, "url"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/e$a;->f(Ljava/lang/String;)Lcom/google/firebase/auth/e$a;

    const-string v1, "dynamicLinkDomain"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/e$a;->c(Ljava/lang/String;)Lcom/google/firebase/auth/e$a;

    :cond_0
    const-string v1, "handleCodeInApp"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/e$a;->d(Z)Lcom/google/firebase/auth/e$a;

    :cond_1
    const-string v1, "android"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const/4 v2, 0x0

    const-string v3, "installApp"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_2
    const/4 v3, 0x0

    const-string v4, "minimumVersion"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_3
    const-string v4, "packageName"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/firebase/auth/e$a;->b(Ljava/lang/String;ZLjava/lang/String;)Lcom/google/firebase/auth/e$a;

    :cond_4
    const-string v1, "iOS"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v1, "bundleId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/e$a;->e(Ljava/lang/String;)Lcom/google/firebase/auth/e$a;

    :cond_5
    invoke-virtual {v0}, Lcom/google/firebase/auth/e$a;->a()Lcom/google/firebase/auth/e;

    move-result-object p1

    return-object p1
.end method

.method private h1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/o;

    invoke-direct {v2, p0, p1, v0}, Lu2/o;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private i0()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lu2/r0;->c:Landroid/app/Activity;

    return-object v0
.end method

.method private i1(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/i0;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1}, Lu2/r0;->j1(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/t0$f;

    invoke-virtual {v1}, Lu2/t0$f;->g()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private j0(Ljava/lang/String;)Lcom/google/firebase/auth/g0;
    .locals 3

    invoke-direct {p0, p1}, Lu2/r0;->m0(Ljava/lang/String;)Lcom/google/firebase/auth/z;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lu2/r0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lu2/r0;->e:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lu2/r0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->m0()Lcom/google/firebase/auth/g0;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/g0;

    return-object p1

    :cond_2
    new-instance p1, Lt1/a;

    const-string v0, "No user is signed in"

    invoke-direct {p1, v0}, Lt1/a;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private j1(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/i0;",
            ">;)",
            "Ljava/util/List<",
            "Lu2/t0$f;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/i0;

    instance-of v2, v1, Lcom/google/firebase/auth/s0;

    if-eqz v2, :cond_0

    new-instance v2, Lu2/t0$f$a;

    invoke-direct {v2}, Lu2/t0$f$a;-><init>()V

    move-object v3, v1

    check-cast v3, Lcom/google/firebase/auth/s0;

    invoke-virtual {v3}, Lcom/google/firebase/auth/s0;->X()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu2/t0$f$a;->e(Ljava/lang/String;)Lu2/t0$f$a;

    move-result-object v2

    goto :goto_1

    :cond_0
    new-instance v2, Lu2/t0$f$a;

    invoke-direct {v2}, Lu2/t0$f$a;-><init>()V

    :goto_1
    invoke-virtual {v1}, Lcom/google/firebase/auth/i0;->R()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu2/t0$f$a;->b(Ljava/lang/String;)Lu2/t0$f$a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/firebase/auth/i0;->j0()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu2/t0$f$a;->c(Ljava/lang/Double;)Lu2/t0$f$a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/firebase/auth/i0;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu2/t0$f$a;->f(Ljava/lang/String;)Lu2/t0$f$a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/firebase/auth/i0;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lu2/t0$f$a;->d(Ljava/lang/String;)Lu2/t0$f$a;

    move-result-object v1

    invoke-virtual {v1}, Lu2/t0$f$a;->a()Lu2/t0$f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method static k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/auth/FirebaseAuth;"
        }
    .end annotation

    const-string v0, "appName"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "tenantId"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->w(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private k1(Lcom/google/firebase/auth/d;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/d;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Lcom/google/firebase/auth/d;->a()I

    move-result v2

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "operation"

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_2

    const/4 v8, 0x4

    if-eq v2, v8, :cond_3

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1

    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1

    :cond_2
    const/4 v8, 0x3

    :cond_3
    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1

    :cond_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1

    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_1
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/d;->b()Lcom/google/firebase/auth/b;

    move-result-object p1

    const/4 v7, 0x0

    const-string v8, "previousEmail"

    const-string v9, "email"

    if-eqz p1, :cond_6

    if-eq v2, v6, :cond_7

    :cond_6
    if-nez v2, :cond_8

    :cond_7
    invoke-virtual {p1}, Lcom/google/firebase/auth/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v9, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    if-ne v2, v3, :cond_9

    invoke-interface {v1, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_9
    if-eq v2, v5, :cond_a

    if-ne v2, v4, :cond_b

    :cond_a
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/firebase/auth/a;

    invoke-virtual {p1}, Lcom/google/firebase/auth/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v8, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    :goto_3
    const-string p1, "data"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private l0(Ljava/util/Map;)Lcom/google/firebase/auth/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/auth/h;"
        }
    .end annotation

    const-string v0, "credential"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "token"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v0, Lu2/r0;->h:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/h;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Lu2/s0;->d()Lu2/s0;

    move-result-object p1

    throw p1

    :cond_1
    const-string v0, "signInMethod"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "secret"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "idToken"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "accessToken"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "rawNonce"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    const-string v7, "emailLink"

    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x7

    goto :goto_0

    :sswitch_1
    const-string v6, "github.com"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x6

    goto :goto_0

    :sswitch_2
    const-string v6, "password"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x5

    goto :goto_0

    :sswitch_3
    const-string v6, "phone"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v5, 0x4

    goto :goto_0

    :sswitch_4
    const-string v6, "oauth"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_5
    const-string v6, "facebook.com"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_6
    const-string v6, "google.com"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v5, 0x1

    goto :goto_0

    :sswitch_7
    const-string v6, "twitter.com"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v5, 0x0

    :goto_0
    const-string v0, "email"

    packed-switch v5, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/firebase/auth/k;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lcom/google/firebase/auth/d0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/google/firebase/auth/k;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_3
    const-string v0, "verificationId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "smsCode"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/firebase/auth/p0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/n0;

    move-result-object p1

    return-object p1

    :pswitch_4
    const-string v0, "providerId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/auth/m0;->d(Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;

    move-result-object p1

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v3}, Lcom/google/firebase/auth/m0$b;->b(Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v4, :cond_a

    invoke-virtual {p1, v2}, Lcom/google/firebase/auth/m0$b;->c(Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;

    goto :goto_1

    :cond_a
    invoke-virtual {p1, v2, v4}, Lcom/google/firebase/auth/m0$b;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;

    :goto_1
    invoke-virtual {p1}, Lcom/google/firebase/auth/m0$b;->a()Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Lcom/google/firebase/auth/m;->a(Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {v2, v3}, Lcom/google/firebase/auth/f0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v1}, Lcom/google/firebase/auth/w0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6d185c7a -> :sswitch_7
        -0x5b91fbb4 -> :sswitch_6
        -0x15becda7 -> :sswitch_5
        0x64a0e97 -> :sswitch_4
        0x65b3d6e -> :sswitch_3
        0x4889ba9b -> :sswitch_2
        0x7650dcf6 -> :sswitch_1
        0x7e5f41b6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method private l1(Lcom/google/firebase/auth/g;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/g;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Lcom/google/firebase/auth/g;->H()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isNewUser"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/g;->s()Ljava/util/Map;

    move-result-object v1

    const-string v2, "profile"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/g;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "providerId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/g;->y()Ljava/lang/String;

    move-result-object p1

    const-string v1, "username"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic m(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->O0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private m0(Ljava/lang/String;)Lcom/google/firebase/auth/z;
    .locals 0

    invoke-static {p1}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->m()Lcom/google/firebase/auth/z;

    move-result-object p1

    return-object p1
.end method

.method static m1(Lcom/google/firebase/auth/h;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/h;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    sget-object v1, Lu2/r0;->h:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/auth/h;->j0()Ljava/lang/String;

    move-result-object v2

    const-string v3, "providerId"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/h;->k0()Ljava/lang/String;

    move-result-object p0

    const-string v2, "signInMethod"

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "token"

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public static synthetic n(Lu2/r0;Lu2/t0$i;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->J0(Lu2/t0$i;Lo0/h;)V

    return-void
.end method

.method private n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/auth/z;"
        }
    .end annotation

    const-string v0, "appName"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->m()Lcom/google/firebase/auth/z;

    move-result-object p1

    return-object p1
.end method

.method private n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/i;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->f0()Lcom/google/firebase/auth/g;

    move-result-object v1

    invoke-direct {p0, v1}, Lu2/r0;->l1(Lcom/google/firebase/auth/g;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "additionalUserInfo"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->r()Lcom/google/firebase/auth/h;

    move-result-object v1

    invoke-static {v1}, Lu2/r0;->m1(Lcom/google/firebase/auth/h;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "authCredential"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->k()Lcom/google/firebase/auth/z;

    move-result-object p1

    invoke-static {p1}, Lu2/r0;->o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "user"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic o(Lx0/e;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->B0(Lx0/e;Lo0/i;)V

    return-void
.end method

.method static o0(Ljava/lang/Exception;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    instance-of v2, p0, Lcom/google/firebase/auth/q;

    if-eqz v2, :cond_1

    new-instance v1, Lu2/s0;

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lu2/s0;-><init>(Ljava/lang/Exception;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Lcom/google/firebase/auth/q;

    if-eqz v2, :cond_3

    new-instance v1, Lu2/s0;

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/q;

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    :goto_0
    invoke-direct {v1, v2, v3}, Lu2/s0;-><init>(Ljava/lang/Exception;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    instance-of v2, p0, Lu2/s0;

    if-eqz v2, :cond_4

    move-object v1, p0

    check-cast v1, Lu2/s0;

    :cond_4
    :goto_1
    const-string v2, "additionalData"

    const-string v3, "message"

    const-string v4, "code"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lu2/s0;->c()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lu2/s0;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lu2/s0;->b()Ljava/util/Map;

    move-result-object p0

    :goto_2
    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_5
    instance-of v1, p0, Lx0/l;

    if-nez v1, :cond_c

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lx0/l;

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    instance-of v1, p0, Lx0/b;

    if-nez v1, :cond_b

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lx0/b;

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    instance-of v1, p0, Lx0/n;

    if-nez v1, :cond_a

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lx0/n;

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Cannot create PhoneAuthCredential without either verificationProof"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_9

    const-string p0, "invalid-verification-id"

    invoke-interface {v0, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "The verification ID used to create the phone auth credential is invalid."

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :cond_9
    return-object v0

    :cond_a
    :goto_3
    const-string p0, "too-many-requests"

    invoke-interface {v0, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "We have blocked all requests from this device due to unusual activity. Try again later."

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :cond_b
    :goto_4
    const-string p0, "api-not-available"

    invoke-interface {v0, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "The requested API is not available."

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    goto :goto_2

    :cond_c
    :goto_5
    const-string p0, "network-request-failed"

    invoke-interface {v0, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "A network error (such as timeout, interrupted connection or unreachable host) has occurred."

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    goto/16 :goto_2
.end method

.method static o1(Lcom/google/firebase/auth/z;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/z;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->R()Ljava/lang/String;

    move-result-object v2

    const-string v3, "displayName"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->n()Ljava/lang/String;

    move-result-object v2

    const-string v3, "email"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->F()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "emailVerified"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->p0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "isAnonymous"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->l0()Lcom/google/firebase/auth/a0;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->l0()Lcom/google/firebase/auth/a0;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/firebase/auth/a0;->c0()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "creationTime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->l0()Lcom/google/firebase/auth/a0;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/firebase/auth/a0;->S()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "lastSignInTime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v2, "metadata"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->X()Ljava/lang/String;

    move-result-object v1

    const-string v2, "phoneNumber"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->l()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lu2/r0;->p1(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "photoURL"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->n0()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lu2/r0;->s1(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    const-string v2, "providerData"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "refreshToken"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->o0()Ljava/lang/String;

    move-result-object p0

    const-string v1, "tenantId"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic p(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->F0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private p0(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/u;

    invoke-direct {v2, p0, p1, v0}, Lu2/u;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private static p1(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, ""

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static synthetic q(Lu2/t0$i;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->y0(Lu2/t0$i;Lo0/h;)V

    return-void
.end method

.method private q0(Ljava/util/Map;Lo0/i;Ljava/lang/Exception;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lo0/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    invoke-virtual {p3}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    check-cast p3, Lcom/google/firebase/auth/t;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p3}, Lcom/google/firebase/auth/t;->b()Lcom/google/firebase/auth/j0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/j0;->j0()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/firebase/auth/j0;->k0()Lcom/google/firebase/auth/k0;

    move-result-object v3

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lu2/r0;->f:Ljava/util/Map;

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lu2/r0;->g:Ljava/util/Map;

    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v2}, Lu2/r0;->i1(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p1

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    const-string v2, "appName"

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "multiFactorHints"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "multiFactorSessionId"

    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "multiFactorResolverId"

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lu2/s0;

    invoke-virtual {p3}, Lcom/google/firebase/auth/q;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, v1, p3, v0}, Lu2/s0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method private q1(Lcom/google/firebase/auth/b0;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/b0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "authTimestamp"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->b()Ljava/util/Map;

    move-result-object v1

    const-string v2, "claims"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->c()J

    move-result-wide v1

    mul-long v1, v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "expirationTimestamp"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->d()J

    move-result-wide v1

    mul-long v1, v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "issuedAtTimestamp"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "signInProvider"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "signInSecondFactor"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object p1

    const-string v1, "token"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic r(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->M0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private r0(Lr2/b;)V
    .locals 2

    const-string v0, "plugins.flutter.io/firebase_auth"

    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    new-instance v1, Lr2/j;

    invoke-direct {v1, p1, v0}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;)V

    iput-object v1, p0, Lu2/r0;->b:Lr2/j;

    invoke-virtual {v1, p0}, Lr2/j;->e(Lr2/j$c;)V

    invoke-static {p1, p0}, Lu2/a1;->j(Lr2/b;Lu2/t0$d;)V

    invoke-static {p1, p0}, Lu2/v0;->d(Lr2/b;Lu2/t0$b;)V

    iput-object p1, p0, Lu2/r0;->a:Lr2/b;

    return-void
.end method

.method private static r1(Lcom/google/firebase/auth/x0;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/x0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->R()Ljava/lang/String;

    move-result-object v1

    const-string v2, "displayName"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->n()Ljava/lang/String;

    move-result-object v1

    const-string v2, "email"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->X()Ljava/lang/String;

    move-result-object v1

    const-string v2, "phoneNumber"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->l()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lu2/r0;->p1(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "photoURL"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "providerId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/firebase/auth/x0;->e()Ljava/lang/String;

    move-result-object p0

    const-string v1, "uid"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic s(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->G0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic s0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->c(Ljava/lang/String;)Lo0/h;

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

.method private static s1(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/x0;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/x0;

    invoke-interface {v1}, Lcom/google/firebase/auth/x0;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "firebase"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lu2/r0;->r1(Lcom/google/firebase/auth/x0;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static synthetic t(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->X0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic t0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->d(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/d;

    invoke-direct {p0, p1}, Lu2/r0;->k1(Lcom/google/firebase/auth/d;)Ljava/util/Map;

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

.method private t1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/o0;

    invoke-direct {v2, p0, p1, v0}, Lu2/o0;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic u(Lr2/j$d;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->E0(Lr2/j$d;Lo0/h;)V

    return-void
.end method

.method private static synthetic u0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "code"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "newPassword"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lcom/google/firebase/auth/FirebaseAuth;->i(Ljava/lang/String;Ljava/lang/String;)Lo0/h;

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

.method private u1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/q0;

    invoke-direct {v2, p0, p1, v0}, Lu2/q0;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic v(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->g1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic v0(Ljava/util/Map;Lo0/i;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "password"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/FirebaseAuth;->j(Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    invoke-direct {p0, p1}, Lu2/r0;->n1(Lcom/google/firebase/auth/i;)Ljava/util/Map;

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

.method private v1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/g;

    invoke-direct {v2, p0, p1, v0}, Lu2/g;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic w(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->b1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic w0(Ljava/util/Map;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->n0(Ljava/util/Map;)Lcom/google/firebase/auth/z;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lu2/s0;->f()Lu2/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->j0()Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    const/4 p1, 0x0

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

.method private w1(Ljava/util/Map;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/q;

    invoke-direct {v2, p0, p1, v0}, Lu2/q;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic x(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->H0(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private synthetic x0(Lo0/i;)V
    .locals 1

    :try_start_0
    invoke-direct {p0}, Lu2/r0;->x1()V

    sget-object v0, Lu2/r0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private x1()V
    .locals 4

    iget-object v0, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/c;

    iget-object v2, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr2/c$d;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lr2/c$d;->a(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lr2/c;->d(Lr2/c$d;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu2/r0;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public static synthetic y(Lu2/t0$i;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/r0;->W0(Lu2/t0$i;Lo0/h;)V

    return-void
.end method

.method private static synthetic y0(Lu2/t0$i;Lo0/h;)V
    .locals 1

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lu2/t0$i;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-interface {p0, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private y1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/w;

    invoke-direct {v2, p0, p1, v0}, Lu2/w;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic z(Lu2/r0;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/r0;->d1(Ljava/util/Map;Lo0/i;)V

    return-void
.end method

.method private static synthetic z0(Ljava/util/Map;Lo0/i;)V
    .locals 2

    :try_start_0
    invoke-static {p0}, Lu2/r0;->k0(Ljava/util/Map;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const-string v1, "email"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->k(Ljava/lang/String;)Lo0/h;

    move-result-object p0

    invoke-static {p0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/auth/u0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "providers"

    invoke-interface {p0}, Lcom/google/firebase/auth/u0;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private z1(Ljava/util/Map;)Lo0/h;
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

    new-instance v2, Lu2/j;

    invoke-direct {v2, p0, p1, v0}, Lu2/j;-><init>(Lu2/r0;Ljava/util/Map;Lo0/i;)V

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
    const-string v1, "User#updateEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x20

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "Auth#verifyPasswordResetCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x1f

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "Auth#setSettings"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x1e

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "Auth#registerIdTokenListener"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x1d

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "Auth#useEmulator"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0x1c

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "Auth#applyActionCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0x1b

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "Auth#checkActionCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0x1a

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "Auth#signInWithAuthProvider"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0x19

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "Auth#registerAuthStateListener"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0x18

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "Auth#confirmPasswordReset"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0x17

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "Auth#signInAnonymously"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x16

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "User#updateProfile"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x15

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "User#unlink"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v2, 0x14

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "User#reload"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "Auth#createUserWithEmailAndPassword"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "Auth#verifyPhoneNumber"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "User#delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "User#sendEmailVerification"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "Auth#sendPasswordResetEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "User#getIdToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "Auth#signInWithCustomToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "Auth#signInWithEmailAndPassword"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "Auth#fetchSignInMethodsForEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "Auth#signInWithCredential"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "User#linkWithCredential"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "Auth#sendSignInLinkToEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_0

    :cond_19
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_1a
    const-string v1, "User#updatePassword"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_1b
    const-string v1, "User#updatePhoneNumber"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1c
    const-string v1, "Auth#signOut"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1d
    const-string v1, "User#reauthenticateUserWithCredential"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1e
    const-string v1, "Auth#setLanguageCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1f
    const-string v1, "Auth#signInWithEmailLink"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_20
    const-string v1, "User#verifyBeforeUpdateEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lr2/j$d;->c()V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->L1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->R1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->C1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->v1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->P1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->b0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->c0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->E1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->u1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->d0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->D1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->O1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->K1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->w1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->e0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->S1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->f0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->y1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_12
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->z1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_13
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->p0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_14
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->G1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_15
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->H1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_16
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->g0(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_17
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->F1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_18
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->h1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_19
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->A1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1a
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->M1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1b
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->N1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1c
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->J1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1d
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->t1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1e
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->B1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_1f
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->I1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    goto :goto_1

    :pswitch_20
    invoke-virtual {p1}, Lr2/i;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lu2/r0;->Q1(Ljava/util/Map;)Lo0/h;

    move-result-object p1

    :goto_1
    new-instance v0, Lu2/e0;

    invoke-direct {v0, p2}, Lu2/e0;-><init>(Lr2/j$d;)V

    invoke-virtual {p1, v0}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a9b84bd -> :sswitch_20
        -0x6a23744d -> :sswitch_1f
        -0x687711d4 -> :sswitch_1e
        -0x646e2958 -> :sswitch_1d
        -0x6209af6a -> :sswitch_1c
        -0x5f41b8ca -> :sswitch_1b
        -0x5d848de4 -> :sswitch_1a
        -0x5b2d13be -> :sswitch_19
        -0x568ae411 -> :sswitch_18
        -0x50902206 -> :sswitch_17
        -0x4d08f0fc -> :sswitch_16
        -0x4956fc47 -> :sswitch_15
        -0x3d3d843b -> :sswitch_14
        -0x31be8f00 -> :sswitch_13
        -0x296d9cb5 -> :sswitch_12
        -0x28cf5169 -> :sswitch_11
        -0x25ec6ebd -> :sswitch_10
        -0x17a4a1dd -> :sswitch_f
        -0x11528f22 -> :sswitch_e
        -0xe0872cf -> :sswitch_d
        -0x86b2a55 -> :sswitch_c
        -0x748a1f8 -> :sswitch_b
        0x6f7239d -> :sswitch_a
        0x10c8c86f -> :sswitch_9
        0x1e31e03f -> :sswitch_8
        0x29ed389c -> :sswitch_7
        0x331ec3b0 -> :sswitch_6
        0x37b81a96 -> :sswitch_5
        0x3e56e781 -> :sswitch_4
        0x5a197194 -> :sswitch_3
        0x6e69dc6a -> :sswitch_2
        0x7471be4d -> :sswitch_1
        0x7f82abbb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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

.method public b(Ljava/lang/String;Lu2/t0$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lu2/t0$i<",
            "Lu2/t0$g;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->j0(Ljava/lang/String;)Lcom/google/firebase/auth/g0;

    move-result-object p1
    :try_end_0
    .catch Lt1/a; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/g0;->c()Lo0/h;

    move-result-object p1

    new-instance v0, Lu2/g0;

    invoke-direct {v0, p0, p2}, Lu2/g0;-><init>(Lu2/r0;Lu2/t0$i;)V

    invoke-virtual {p1, v0}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Lj2/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lu2/r0;->r0(Lr2/b;)V

    return-void
.end method

.method public d(Lj2/a$b;)V
    .locals 2

    iget-object v0, p0, Lu2/r0;->b:Lr2/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr2/j;->e(Lr2/j$c;)V

    iput-object v1, p0, Lu2/r0;->b:Lr2/j;

    iput-object v1, p0, Lu2/r0;->a:Lr2/b;

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object v0

    invoke-static {v0, v1}, Lu2/a1;->j(Lr2/b;Lu2/t0$d;)V

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object p1

    invoke-static {p1, v1}, Lu2/v0;->d(Lr2/b;Lu2/t0$b;)V

    invoke-direct {p0}, Lu2/r0;->x1()V

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

    new-instance v2, Lu2/c0;

    invoke-direct {v2, p0, v0}, Lu2/c0;-><init>(Lu2/r0;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Lu2/t0$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lu2/t0$i<",
            "Ljava/util/List<",
            "Lu2/t0$f;",
            ">;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->j0(Ljava/lang/String;)Lcom/google/firebase/auth/g0;

    move-result-object p1
    :try_end_0
    .catch Lt1/a; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/g0;->b()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lu2/r0;->j1(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Lu2/t0$i;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu2/r0;->c:Landroid/app/Activity;

    return-void
.end method

.method public g(Lk2/c;)V
    .locals 0

    invoke-interface {p1}, Lk2/c;->d()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lu2/r0;->c:Landroid/app/Activity;

    return-void
.end method

.method public getPluginConstantsForFirebaseApp(Lx0/e;)Lo0/h;
    .locals 3
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

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu2/d0;

    invoke-direct {v2, p1, v0}, Lu2/d0;-><init>(Lx0/e;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;Lu2/t0$h;Lu2/t0$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lu2/t0$h;",
            "Lu2/t0$i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lu2/r0;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/j0;

    invoke-virtual {p2}, Lu2/t0$h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lu2/t0$h;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/google/firebase/auth/p0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/n0;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/auth/r0;->a(Lcom/google/firebase/auth/n0;)Lcom/google/firebase/auth/q0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/auth/j0;->l0(Lcom/google/firebase/auth/h0;)Lo0/h;

    move-result-object p1

    new-instance p2, Lu2/f0;

    invoke-direct {p2, p0, p3}, Lu2/f0;-><init>(Lu2/r0;Lu2/t0$i;)V

    invoke-virtual {p1, p2}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void
.end method

.method public i(Lk2/c;)V
    .locals 0

    invoke-interface {p1}, Lk2/c;->d()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lu2/r0;->c:Landroid/app/Activity;

    return-void
.end method

.method public j(Ljava/lang/String;Lu2/t0$h;Ljava/lang/String;Lu2/t0$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lu2/t0$h;",
            "Ljava/lang/String;",
            "Lu2/t0$i<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->j0(Ljava/lang/String;)Lcom/google/firebase/auth/g0;

    move-result-object p1
    :try_end_0
    .catch Lt1/a; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p2}, Lu2/t0$h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lu2/t0$h;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/google/firebase/auth/p0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/n0;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/auth/r0;->a(Lcom/google/firebase/auth/n0;)Lcom/google/firebase/auth/q0;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/google/firebase/auth/g0;->a(Lcom/google/firebase/auth/h0;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    new-instance p2, Lu2/h0;

    invoke-direct {p2, p4}, Lu2/h0;-><init>(Lu2/t0$i;)V

    invoke-virtual {p1, p2}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p4, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lu2/r0;->c:Landroid/app/Activity;

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Lu2/t0$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lu2/t0$i<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lu2/r0;->j0(Ljava/lang/String;)Lcom/google/firebase/auth/g0;

    move-result-object p1
    :try_end_0
    .catch Lt1/a; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1, p2}, Lcom/google/firebase/auth/g0;->d(Ljava/lang/String;)Lo0/h;

    move-result-object p1

    new-instance p2, Lu2/i0;

    invoke-direct {p2, p3}, Lu2/i0;-><init>(Lu2/t0$i;)V

    invoke-virtual {p1, p2}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    :catch_0
    move-exception p1

    invoke-interface {p3, p1}, Lu2/t0$i;->b(Ljava/lang/Throwable;)V

    return-void
.end method
