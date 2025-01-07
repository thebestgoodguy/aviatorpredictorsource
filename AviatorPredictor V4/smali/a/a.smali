.class public La/a;
.super La/c;
.source ""


# static fields
.field private static volatile c:La/a;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:La/c;

.field private b:La/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a$a;

    invoke-direct {v0}, La/a$a;-><init>()V

    sput-object v0, La/a;->d:Ljava/util/concurrent/Executor;

    new-instance v0, La/a$b;

    invoke-direct {v0}, La/a$b;-><init>()V

    sput-object v0, La/a;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/c;-><init>()V

    new-instance v0, La/b;

    invoke-direct {v0}, La/b;-><init>()V

    iput-object v0, p0, La/a;->b:La/c;

    iput-object v0, p0, La/a;->a:La/c;

    return-void
.end method

.method public static d()La/a;
    .locals 2

    sget-object v0, La/a;->c:La/a;

    if-eqz v0, :cond_0

    sget-object v0, La/a;->c:La/a;

    return-object v0

    :cond_0
    const-class v0, La/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a;->c:La/a;

    if-nez v1, :cond_1

    new-instance v1, La/a;

    invoke-direct {v1}, La/a;-><init>()V

    sput-object v1, La/a;->c:La/a;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, La/a;->c:La/a;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, La/a;->a:La/c;

    invoke-virtual {v0, p1}, La/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, La/a;->a:La/c;

    invoke-virtual {v0}, La/c;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, La/a;->a:La/c;

    invoke-virtual {v0, p1}, La/c;->c(Ljava/lang/Runnable;)V

    return-void
.end method
