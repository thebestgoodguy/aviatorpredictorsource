.class final Lo0/y;
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

.field private c:Lo0/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lo0/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/y;->b:Ljava/lang/Object;

    iput-object p1, p0, Lo0/y;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo0/y;->c:Lo0/e;

    return-void
.end method

.method static bridge synthetic b(Lo0/y;)Lo0/e;
    .locals 0

    iget-object p0, p0, Lo0/y;->c:Lo0/e;

    return-object p0
.end method

.method static bridge synthetic c(Lo0/y;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lo0/y;->b:Ljava/lang/Object;

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

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo0/h;->n()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo0/y;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/y;->c:Lo0/e;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lo0/y;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lo0/x;

    invoke-direct {v1, p0, p1}, Lo0/x;-><init>(Lo0/y;Lo0/h;)V

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
