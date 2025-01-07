.class Lb1/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;
.implements Lr1/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr1/b<",
        "TT;>;",
        "Lr1/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final c:Lr1/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/a$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lr1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lr1/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile b:Lr1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lb1/a0;->a:Lb1/a0;

    sput-object v0, Lb1/c0;->c:Lr1/a$a;

    sget-object v0, Lb1/b0;->a:Lb1/b0;

    sput-object v0, Lb1/c0;->d:Lr1/b;

    return-void
.end method

.method private constructor <init>(Lr1/a$a;Lr1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/a$a<",
            "TT;>;",
            "Lr1/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/c0;->a:Lr1/a$a;

    iput-object p2, p0, Lb1/c0;->b:Lr1/b;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lb1/c0;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lr1/b;)V
    .locals 0

    invoke-static {p0}, Lb1/c0;->f(Lr1/b;)V

    return-void
.end method

.method public static synthetic d(Lr1/a$a;Lr1/a$a;Lr1/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lb1/c0;->h(Lr1/a$a;Lr1/a$a;Lr1/b;)V

    return-void
.end method

.method static e()Lb1/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lb1/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lb1/c0;

    sget-object v1, Lb1/c0;->c:Lr1/a$a;

    sget-object v2, Lb1/c0;->d:Lr1/b;

    invoke-direct {v0, v1, v2}, Lb1/c0;-><init>(Lr1/a$a;Lr1/b;)V

    return-object v0
.end method

.method private static synthetic f(Lr1/b;)V
    .locals 0

    return-void
.end method

.method private static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static synthetic h(Lr1/a$a;Lr1/a$a;Lr1/b;)V
    .locals 0

    invoke-interface {p0, p2}, Lr1/a$a;->a(Lr1/b;)V

    invoke-interface {p1, p2}, Lr1/a$a;->a(Lr1/b;)V

    return-void
.end method

.method static i(Lr1/b;)Lb1/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr1/b<",
            "TT;>;)",
            "Lb1/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lb1/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lb1/c0;-><init>(Lr1/a$a;Lr1/b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lr1/a$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/a$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb1/c0;->b:Lr1/b;

    sget-object v1, Lb1/c0;->d:Lr1/b;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Lr1/a$a;->a(Lr1/b;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lb1/c0;->b:Lr1/b;

    if-eq v2, v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lb1/c0;->a:Lr1/a$a;

    new-instance v3, Lb1/z;

    invoke-direct {v3, v1, p1}, Lb1/z;-><init>(Lr1/a$a;Lr1/a$a;)V

    iput-object v3, p0, Lb1/c0;->a:Lr1/a$a;

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Lr1/a$a;->a(Lr1/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lb1/c0;->b:Lr1/b;

    invoke-interface {v0}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method j(Lr1/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb1/c0;->b:Lr1/b;

    sget-object v1, Lb1/c0;->d:Lr1/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb1/c0;->a:Lr1/a$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lb1/c0;->a:Lr1/a$a;

    iput-object p1, p0, Lb1/c0;->b:Lr1/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lr1/a$a;->a(Lr1/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
