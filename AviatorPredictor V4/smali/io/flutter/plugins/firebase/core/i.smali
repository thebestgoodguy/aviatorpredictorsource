.class public Lio/flutter/plugins/firebase/core/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj2/a;
.implements Lio/flutter/plugins/firebase/core/l$d;
.implements Lio/flutter/plugins/firebase/core/l$b;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/firebase/core/i;->b:Z

    return-void
.end method

.method private A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo0/i<",
            "TT;>;",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/firebase/core/h;

    invoke-direct {v0, p2}, Lio/flutter/plugins/firebase/core/h;-><init>(Lio/flutter/plugins/firebase/core/l$h;)V

    invoke-virtual {p1, v0}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/firebase/core/i;->y(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/firebase/core/i;->u(Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/core/i;->v(Lo0/i;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/firebase/core/l$h;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/core/i;->w(Lio/flutter/plugins/firebase/core/l$h;Lo0/h;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/core/i;->s(Ljava/lang/String;Lo0/i;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/core/i;->x(Lo0/i;)V

    return-void
.end method

.method public static synthetic o(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/firebase/core/i;->z(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V

    return-void
.end method

.method public static synthetic p(Lio/flutter/plugins/firebase/core/i;Lx0/e;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/core/i;->t(Lx0/e;Lo0/i;)V

    return-void
.end method

.method private q(Lx0/e;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/e;",
            ")",
            "Lo0/h<",
            "Lio/flutter/plugins/firebase/core/l$g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/d;

    invoke-direct {v2, p0, p1, v0}, Lio/flutter/plugins/firebase/core/d;-><init>(Lio/flutter/plugins/firebase/core/i;Lx0/e;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method private r(Lx0/m;)Lio/flutter/plugins/firebase/core/l$f;
    .locals 2

    new-instance v0, Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/core/l$f$a;-><init>()V

    invoke-virtual {p1}, Lx0/m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->b(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-virtual {p1}, Lx0/m;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->c(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-virtual {p1}, Lx0/m;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lx0/m;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->e(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    :cond_0
    invoke-virtual {p1}, Lx0/m;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lx0/m;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->f(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    :cond_1
    invoke-virtual {p1}, Lx0/m;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->d(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-virtual {p1}, Lx0/m;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$f$a;->g(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-virtual {p1}, Lx0/m;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/firebase/core/l$f$a;->h(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$f$a;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/core/l$f$a;->a()Lio/flutter/plugins/firebase/core/l$f;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic s(Ljava/lang/String;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-static {p0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {p0}, Lx0/e;->j()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    const/4 p0, 0x0

    :try_start_2
    invoke-virtual {p1, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p0

    invoke-virtual {p1, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic t(Lx0/e;Lo0/i;)V
    .locals 2

    :try_start_0
    new-instance v0, Lio/flutter/plugins/firebase/core/l$g$a;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/core/l$g$a;-><init>()V

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g$a;->c(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$g$a;

    invoke-virtual {p1}, Lx0/e;->r()Lx0/m;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/flutter/plugins/firebase/core/i;->r(Lx0/m;)Lio/flutter/plugins/firebase/core/l$f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g$a;->d(Lio/flutter/plugins/firebase/core/l$f;)Lio/flutter/plugins/firebase/core/l$g$a;

    invoke-virtual {p1}, Lx0/e;->x()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g$a;->b(Ljava/lang/Boolean;)Lio/flutter/plugins/firebase/core/l$g$a;

    invoke-static {p1}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->getPluginConstantsForFirebaseApp(Lx0/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/firebase/core/l$g$a;->e(Ljava/util/Map;)Lio/flutter/plugins/firebase/core/l$g$a;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/core/l$g$a;->a()Lio/flutter/plugins/firebase/core/l$g;

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

.method private synthetic u(Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V
    .locals 2

    :try_start_0
    new-instance v0, Lx0/m$b;

    invoke-direct {v0}, Lx0/m$b;-><init>()V

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->b(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->c(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->d(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->f(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->g(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/m$b;->h(Ljava/lang/String;)Lx0/m$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/core/l$f;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx0/m$b;->e(Ljava/lang/String;)Lx0/m$b;

    move-result-object p1

    invoke-virtual {p1}, Lx0/m$b;->a()Lx0/m;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Landroid/os/Looper;->prepare()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    iget-object v0, p0, Lio/flutter/plugins/firebase/core/i;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lx0/e;->w(Landroid/content/Context;Lx0/m;Ljava/lang/String;)Lx0/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/core/i;->q(Lx0/e;)Lo0/h;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/firebase/core/l$g;

    invoke-virtual {p3, p1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {p3, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic v(Lo0/i;)V
    .locals 3

    :try_start_0
    iget-boolean v0, p0, Lio/flutter/plugins/firebase/core/i;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/firebase/core/i;->b:Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->didReinitializeFirebaseCore()Lo0/h;

    move-result-object v0

    invoke-static {v0}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/core/i;->a:Landroid/content/Context;

    invoke-static {v0}, Lx0/e;->n(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/e;

    invoke-direct {p0, v2}, Lio/flutter/plugins/firebase/core/i;->q(Lx0/e;)Lo0/h;

    move-result-object v2

    invoke-static {v2}, Lo0/k;->a(Lo0/h;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/firebase/core/l$g;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method private static synthetic w(Lio/flutter/plugins/firebase/core/l$h;Lo0/h;)V
    .locals 1

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/core/l$h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/core/l$h;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic x(Lo0/i;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/core/i;->a:Landroid/content/Context;

    invoke-static {v0}, Lx0/m;->a(Landroid/content/Context;)Lx0/m;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0, v0}, Lio/flutter/plugins/firebase/core/i;->r(Lx0/m;)Lio/flutter/plugins/firebase/core/l$f;

    move-result-object v0

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

.method private static synthetic y(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-static {p0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lx0/e;->F(Ljava/lang/Boolean;)V

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p2, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic z(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V
    .locals 0

    :try_start_0
    invoke-static {p0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lx0/e;->E(Z)V

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Lo0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p2, p0}, Lo0/i;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/e;

    invoke-direct {v2, p1, p2, v0}, Lio/flutter/plugins/firebase/core/e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p3}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lio/flutter/plugins/firebase/core/l$f;Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/firebase/core/l$f;",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Lio/flutter/plugins/firebase/core/l$g;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/a;

    invoke-direct {v2, p0, p2, p1, v0}, Lio/flutter/plugins/firebase/core/a;-><init>(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p3}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method

.method public c(Lj2/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object v0

    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/t;->h(Lr2/b;Lio/flutter/plugins/firebase/core/l$d;)V

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object v0

    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/p;->h(Lr2/b;Lio/flutter/plugins/firebase/core/l$b;)V

    invoke-virtual {p1}, Lj2/a$b;->a()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/i;->a:Landroid/content/Context;

    return-void
.end method

.method public d(Lj2/a$b;)V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/firebase/core/i;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object v1

    invoke-static {v1, v0}, Lio/flutter/plugins/firebase/core/t;->h(Lr2/b;Lio/flutter/plugins/firebase/core/l$d;)V

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object p1

    invoke-static {p1, v0}, Lio/flutter/plugins/firebase/core/p;->h(Lr2/b;Lio/flutter/plugins/firebase/core/l$b;)V

    return-void
.end method

.method public e(Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Ljava/util/List<",
            "Lio/flutter/plugins/firebase/core/l$g;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/b;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/firebase/core/b;-><init>(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method

.method public f(Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Lio/flutter/plugins/firebase/core/l$f;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/c;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/firebase/core/c;-><init>(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/f;

    invoke-direct {v2, p1, p2, v0}, Lio/flutter/plugins/firebase/core/f;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p3}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method

.method public h(Ljava/lang/String;Lio/flutter/plugins/firebase/core/l$h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/firebase/core/l$h<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/core/g;

    invoke-direct {v2, p1, v0}, Lio/flutter/plugins/firebase/core/g;-><init>(Ljava/lang/String;Lo0/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/firebase/core/i;->A(Lo0/i;Lio/flutter/plugins/firebase/core/l$h;)V

    return-void
.end method
