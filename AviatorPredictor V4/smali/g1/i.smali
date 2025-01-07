.class public final Lg1/i;
.super Lg1/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg1/a<",
        "Lg1/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:La1/a;

.field private b:La1/b;

.field private c:Lp1/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/u<",
            "Lg1/j;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>(Lr1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/a<",
            "La1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg1/a;-><init>()V

    new-instance v0, Lg1/f;

    invoke-direct {v0, p0}, Lg1/f;-><init>(Lg1/i;)V

    iput-object v0, p0, Lg1/i;->a:La1/a;

    new-instance v0, Lg1/h;

    invoke-direct {v0, p0}, Lg1/h;-><init>(Lg1/i;)V

    invoke-interface {p1, v0}, Lr1/a;->a(Lr1/a$a;)V

    return-void
.end method

.method public static synthetic e(Lg1/i;ILo0/h;)Lo0/h;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg1/i;->i(ILo0/h;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg1/i;Lr1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg1/i;->k(Lr1/b;)V

    return-void
.end method

.method public static synthetic g(Lg1/i;Ls1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg1/i;->j(Ls1/b;)V

    return-void
.end method

.method private declared-synchronized h()Lg1/j;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg1/i;->b:La1/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, La1/b;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lg1/j;

    invoke-direct {v1, v0}, Lg1/j;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lg1/j;->b:Lg1/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private synthetic i(ILo0/h;)Lo0/h;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lg1/i;->d:I

    if-eq p1, v0, :cond_0

    const-string p1, "FirebaseAuthCredentialsProvider"

    const-string p2, "getToken aborted due to token change"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg1/i;->a()Lo0/h;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/b0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic j(Ls1/b;)V
    .locals 0

    invoke-direct {p0}, Lg1/i;->l()V

    return-void
.end method

.method private synthetic k(Lr1/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/b;

    iput-object p1, p0, Lg1/i;->b:La1/b;

    invoke-direct {p0}, Lg1/i;->l()V

    iget-object p1, p0, Lg1/i;->b:La1/b;

    iget-object v0, p0, Lg1/i;->a:La1/a;

    invoke-interface {p1, v0}, La1/b;->h(La1/a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private declared-synchronized l()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lg1/i;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg1/i;->d:I

    iget-object v0, p0, Lg1/i;->c:Lp1/u;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lg1/i;->h()Lg1/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lp1/u;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a()Lo0/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg1/i;->b:La1/b;

    if-nez v0, :cond_0

    new-instance v0, Lx0/b;

    const-string v1, "auth is not available"

    invoke-direct {v0, v1}, Lx0/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lg1/i;->e:Z

    invoke-interface {v0, v1}, La1/b;->g(Z)Lo0/h;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lg1/i;->e:Z

    iget v1, p0, Lg1/i;->d:I

    sget-object v2, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lg1/g;

    invoke-direct {v3, p0, v1}, Lg1/g;-><init>(Lg1/i;I)V

    invoke-virtual {v0, v2, v3}, Lo0/h;->j(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lg1/i;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lg1/i;->c:Lp1/u;

    iget-object v0, p0, Lg1/i;->b:La1/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg1/i;->a:La1/a;

    invoke-interface {v0, v1}, La1/b;->f(La1/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(Lp1/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/u<",
            "Lg1/j;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lg1/i;->c:Lp1/u;

    invoke-direct {p0}, Lg1/i;->h()Lg1/j;

    move-result-object v0

    invoke-interface {p1, v0}, Lp1/u;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
