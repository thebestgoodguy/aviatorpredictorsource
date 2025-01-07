.class final Lo0/u;
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

.field private c:Lo0/c;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lo0/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/u;->b:Ljava/lang/Object;

    iput-object p1, p0, Lo0/u;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo0/u;->c:Lo0/c;

    return-void
.end method

.method static bridge synthetic b(Lo0/u;)Lo0/c;
    .locals 0

    iget-object p0, p0, Lo0/u;->c:Lo0/c;

    return-object p0
.end method

.method static bridge synthetic c(Lo0/u;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lo0/u;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/h<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lo0/h;->n()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lo0/u;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lo0/u;->c:Lo0/c;

    if-nez v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo0/u;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lo0/t;

    invoke-direct {v0, p0}, Lo0/t;-><init>(Lo0/u;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method
