.class public final Ly2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj2/a;
.implements Lk2/a;


# instance fields
.field private a:Ly2/a;

.field private b:Ly2/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lj2/a$b;)V
    .locals 3

    new-instance v0, Ly2/b;

    invoke-virtual {p1}, Lj2/a$b;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly2/b;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v0, p0, Ly2/c;->b:Ly2/b;

    new-instance v1, Ly2/a;

    invoke-direct {v1, v0}, Ly2/a;-><init>(Ly2/b;)V

    iput-object v1, p0, Ly2/c;->a:Ly2/a;

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ly2/a;->f(Lr2/b;)V

    return-void
.end method

.method public d(Lj2/a$b;)V
    .locals 1

    iget-object p1, p0, Ly2/c;->a:Ly2/a;

    if-nez p1, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Ly2/a;->g()V

    const/4 p1, 0x0

    iput-object p1, p0, Ly2/c;->a:Ly2/a;

    iput-object p1, p0, Ly2/c;->b:Ly2/b;

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Ly2/c;->a:Ly2/a;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Ly2/c;->b:Ly2/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly2/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public g(Lk2/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly2/c;->i(Lk2/c;)V

    return-void
.end method

.method public i(Lk2/c;)V
    .locals 1

    iget-object v0, p0, Ly2/c;->a:Ly2/a;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Ly2/c;->b:Ly2/b;

    invoke-interface {p1}, Lk2/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly2/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public k()V
    .locals 0

    invoke-virtual {p0}, Ly2/c;->f()V

    return-void
.end method
