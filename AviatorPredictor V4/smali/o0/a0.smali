.class final Lo0/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/b0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo0/b0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lo0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/f<",
            "-TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lo0/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/f<",
            "-TTResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/a0;->b:Ljava/lang/Object;

    iput-object p1, p0, Lo0/a0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo0/a0;->c:Lo0/f;

    return-void
.end method

.method static bridge synthetic b(Lo0/a0;)Lo0/f;
    .locals 0

    iget-object p0, p0, Lo0/a0;->c:Lo0/f;

    return-object p0
.end method

.method static bridge synthetic c(Lo0/a0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lo0/a0;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/h<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo0/a0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/a0;->c:Lo0/f;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lo0/a0;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lo0/z;

    invoke-direct {v1, p0, p1}, Lo0/z;-><init>(Lo0/a0;Lo0/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
