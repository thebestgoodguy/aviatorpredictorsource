.class final Lo0/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lo0/u;


# direct methods
.method constructor <init>(Lo0/u;)V
    .locals 0

    iput-object p1, p0, Lo0/t;->e:Lo0/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lo0/t;->e:Lo0/u;

    invoke-static {v0}, Lo0/u;->c(Lo0/u;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/t;->e:Lo0/u;

    invoke-static {v1}, Lo0/u;->b(Lo0/u;)Lo0/c;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lo0/u;->b(Lo0/u;)Lo0/c;

    move-result-object v1

    invoke-interface {v1}, Lo0/c;->b()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
