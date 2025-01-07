.class public Lio/flutter/embedding/engine/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/a$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/embedding/engine/FlutterJNI;

.field private final b:Lp2/a;

.field private final c:Lf2/a;

.field private final d:Lio/flutter/embedding/engine/c;

.field private final e:Ls2/a;

.field private final f:Lq2/a;

.field private final g:Lq2/b;

.field private final h:Lq2/e;

.field private final i:Lq2/f;

.field private final j:Lq2/g;

.field private final k:Lq2/h;

.field private final l:Lq2/l;

.field private final m:Lq2/i;

.field private final n:Lq2/m;

.field private final o:Lq2/n;

.field private final p:Lq2/o;

.field private final q:Lq2/p;

.field private final r:Lio/flutter/plugin/platform/n;

.field private final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/flutter/embedding/engine/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Lio/flutter/embedding/engine/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh2/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/n;[Ljava/lang/String;ZZ)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    new-instance v0, Lio/flutter/embedding/engine/a$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/a$a;-><init>(Lio/flutter/embedding/engine/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :goto_0
    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object v1

    if-nez p3, :cond_0

    invoke-virtual {v1}, Le2/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object p3

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    new-instance v2, Lf2/a;

    invoke-direct {v2, p3, v0}, Lf2/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Lio/flutter/embedding/engine/a;->c:Lf2/a;

    invoke-virtual {v2}, Lf2/a;->l()V

    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object v0

    invoke-virtual {v0}, Le2/a;->a()Lg2/a;

    move-result-object v0

    new-instance v3, Lq2/a;

    invoke-direct {v3, v2, p3}, Lq2/a;-><init>(Lf2/a;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->f:Lq2/a;

    new-instance v3, Lq2/b;

    invoke-direct {v3, v2}, Lq2/b;-><init>(Lf2/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->g:Lq2/b;

    new-instance v4, Lq2/e;

    invoke-direct {v4, v2}, Lq2/e;-><init>(Lf2/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->h:Lq2/e;

    new-instance v4, Lq2/f;

    invoke-direct {v4, v2}, Lq2/f;-><init>(Lf2/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->i:Lq2/f;

    new-instance v5, Lq2/g;

    invoke-direct {v5, v2}, Lq2/g;-><init>(Lf2/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->j:Lq2/g;

    new-instance v5, Lq2/h;

    invoke-direct {v5, v2}, Lq2/h;-><init>(Lf2/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->k:Lq2/h;

    new-instance v5, Lq2/i;

    invoke-direct {v5, v2}, Lq2/i;-><init>(Lf2/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->m:Lq2/i;

    new-instance v5, Lq2/l;

    invoke-direct {v5, v2, p7}, Lq2/l;-><init>(Lf2/a;Z)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->l:Lq2/l;

    new-instance p7, Lq2/m;

    invoke-direct {p7, v2}, Lq2/m;-><init>(Lf2/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->n:Lq2/m;

    new-instance p7, Lq2/n;

    invoke-direct {p7, v2}, Lq2/n;-><init>(Lf2/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->o:Lq2/n;

    new-instance p7, Lq2/o;

    invoke-direct {p7, v2}, Lq2/o;-><init>(Lf2/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->p:Lq2/o;

    new-instance p7, Lq2/p;

    invoke-direct {p7, v2}, Lq2/p;-><init>(Lf2/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->q:Lq2/p;

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lg2/a;->a(Lq2/b;)V

    :cond_1
    new-instance p7, Ls2/a;

    invoke-direct {p7, p1, v4}, Ls2/a;-><init>(Landroid/content/Context;Lq2/f;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->e:Ls2/a;

    if-nez p2, :cond_2

    invoke-virtual {v1}, Le2/a;->c()Lh2/d;

    move-result-object p2

    :cond_2
    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lh2/d;->i(Landroid/content/Context;)V

    invoke-virtual {p2, p1, p5}, Lh2/d;->e(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_3
    iget-object p5, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    invoke-virtual {p3, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/n;)V

    invoke-virtual {p3, p7}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Ls2/a;)V

    invoke-virtual {v1}, Le2/a;->a()Lg2/a;

    move-result-object p5

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lg2/a;)V

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p5

    if-nez p5, :cond_4

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->d()V

    :cond_4
    new-instance p5, Lp2/a;

    invoke-direct {p5, p3}, Lp2/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p5, p0, Lio/flutter/embedding/engine/a;->b:Lp2/a;

    iput-object p4, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/n;

    invoke-virtual {p4}, Lio/flutter/plugin/platform/n;->T()V

    new-instance p3, Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4, p0, p2}, Lio/flutter/embedding/engine/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lh2/d;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p7, p1}, Ls2/a;->d(Landroid/content/res/Configuration;)V

    if-eqz p6, :cond_5

    invoke-virtual {p2}, Lh2/d;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lo2/a;->a(Lio/flutter/embedding/engine/a;)V

    :cond_5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;ZZ)V
    .locals 8

    new-instance v4, Lio/flutter/plugin/platform/n;

    invoke-direct {v4}, Lio/flutter/plugin/platform/n;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lh2/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/n;[Ljava/lang/String;ZZ)V

    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/engine/a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/n;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/n;

    return-object p0
.end method

.method static synthetic c(Lio/flutter/embedding/engine/a;)Lq2/l;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->l:Lq2/l;

    return-object p0
.end method

.method private d()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Attaching to JNI."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private v()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public e()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/a$b;

    invoke-interface {v1}, Lio/flutter/embedding/engine/a$b;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/c;->l()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/n;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/n;->V()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lf2/a;

    invoke-virtual {v0}, Lf2/a;->m()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lg2/a;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object v0

    invoke-virtual {v0}, Le2/a;->a()Lg2/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object v0

    invoke-virtual {v0}, Le2/a;->a()Lg2/a;

    move-result-object v0

    invoke-interface {v0}, Lg2/a;->c()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->g:Lq2/b;

    invoke-virtual {v0, v1}, Lq2/b;->c(Lg2/a;)V

    :cond_1
    return-void
.end method

.method public f()Lq2/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->f:Lq2/a;

    return-object v0
.end method

.method public g()Lk2/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public h()Lf2/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lf2/a;

    return-object v0
.end method

.method public i()Lq2/e;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->h:Lq2/e;

    return-object v0
.end method

.method public j()Ls2/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->e:Ls2/a;

    return-object v0
.end method

.method public k()Lq2/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->j:Lq2/g;

    return-object v0
.end method

.method public l()Lq2/h;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->k:Lq2/h;

    return-object v0
.end method

.method public m()Lq2/i;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->m:Lq2/i;

    return-object v0
.end method

.method public n()Lio/flutter/plugin/platform/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/n;

    return-object v0
.end method

.method public o()Lj2/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public p()Lp2/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->b:Lp2/a;

    return-object v0
.end method

.method public q()Lq2/l;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->l:Lq2/l;

    return-object v0
.end method

.method public r()Lq2/m;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->n:Lq2/m;

    return-object v0
.end method

.method public s()Lq2/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->o:Lq2/n;

    return-object v0
.end method

.method public t()Lq2/o;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->p:Lq2/o;

    return-object v0
.end method

.method public u()Lq2/p;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->q:Lq2/p;

    return-object v0
.end method
