.class public abstract Li1/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/j$a;
    }
.end annotation


# instance fields
.field private a:Lk1/z0;

.field private b:Lk1/f0;

.field private c:Li1/b1;

.field private d:Lo1/n0;

.field private e:Li1/p;

.field private f:Lo1/k;

.field private g:Lk1/k;

.field private h:Lk1/z3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Li1/j$a;)Lo1/k;
.end method

.method protected abstract b(Li1/j$a;)Li1/p;
.end method

.method protected abstract c(Li1/j$a;)Lk1/z3;
.end method

.method protected abstract d(Li1/j$a;)Lk1/k;
.end method

.method protected abstract e(Li1/j$a;)Lk1/f0;
.end method

.method protected abstract f(Li1/j$a;)Lk1/z0;
.end method

.method protected abstract g(Li1/j$a;)Lo1/n0;
.end method

.method protected abstract h(Li1/j$a;)Li1/b1;
.end method

.method protected i()Lo1/k;
    .locals 3

    iget-object v0, p0, Li1/j;->f:Lo1/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectivityMonitor not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/k;

    return-object v0
.end method

.method public j()Li1/p;
    .locals 3

    iget-object v0, p0, Li1/j;->e:Li1/p;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eventManager not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/p;

    return-object v0
.end method

.method public k()Lk1/z3;
    .locals 1

    iget-object v0, p0, Li1/j;->h:Lk1/z3;

    return-object v0
.end method

.method public l()Lk1/k;
    .locals 1

    iget-object v0, p0, Li1/j;->g:Lk1/k;

    return-object v0
.end method

.method public m()Lk1/f0;
    .locals 3

    iget-object v0, p0, Li1/j;->b:Lk1/f0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localStore not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/f0;

    return-object v0
.end method

.method public n()Lk1/z0;
    .locals 3

    iget-object v0, p0, Li1/j;->a:Lk1/z0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "persistence not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/z0;

    return-object v0
.end method

.method public o()Lo1/n0;
    .locals 3

    iget-object v0, p0, Li1/j;->d:Lo1/n0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remoteStore not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/n0;

    return-object v0
.end method

.method public p()Li1/b1;
    .locals 3

    iget-object v0, p0, Li1/j;->c:Li1/b1;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncEngine not initialized yet"

    invoke-static {v0, v2, v1}, Lp1/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/b1;

    return-object v0
.end method

.method public q(Li1/j$a;)V
    .locals 1

    invoke-virtual {p0, p1}, Li1/j;->f(Li1/j$a;)Lk1/z0;

    move-result-object v0

    iput-object v0, p0, Li1/j;->a:Lk1/z0;

    invoke-virtual {v0}, Lk1/z0;->m()V

    invoke-virtual {p0, p1}, Li1/j;->e(Li1/j$a;)Lk1/f0;

    move-result-object v0

    iput-object v0, p0, Li1/j;->b:Lk1/f0;

    invoke-virtual {p0, p1}, Li1/j;->a(Li1/j$a;)Lo1/k;

    move-result-object v0

    iput-object v0, p0, Li1/j;->f:Lo1/k;

    invoke-virtual {p0, p1}, Li1/j;->g(Li1/j$a;)Lo1/n0;

    move-result-object v0

    iput-object v0, p0, Li1/j;->d:Lo1/n0;

    invoke-virtual {p0, p1}, Li1/j;->h(Li1/j$a;)Li1/b1;

    move-result-object v0

    iput-object v0, p0, Li1/j;->c:Li1/b1;

    invoke-virtual {p0, p1}, Li1/j;->b(Li1/j$a;)Li1/p;

    move-result-object v0

    iput-object v0, p0, Li1/j;->e:Li1/p;

    iget-object v0, p0, Li1/j;->b:Lk1/f0;

    invoke-virtual {v0}, Lk1/f0;->j0()V

    iget-object v0, p0, Li1/j;->d:Lo1/n0;

    invoke-virtual {v0}, Lo1/n0;->O()V

    invoke-virtual {p0, p1}, Li1/j;->c(Li1/j$a;)Lk1/z3;

    move-result-object v0

    iput-object v0, p0, Li1/j;->h:Lk1/z3;

    invoke-virtual {p0, p1}, Li1/j;->d(Li1/j$a;)Lk1/k;

    move-result-object p1

    iput-object p1, p0, Li1/j;->g:Lk1/k;

    return-void
.end method
