.class final Lo0/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/f;
.implements Lo0/e;
.implements Lo0/c;
.implements Lo0/b0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo0/f<",
        "TTContinuationResult;>;",
        "Lo0/e;",
        "Lo0/c;",
        "Lo0/b0;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lo0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/a<",
            "TTResult;",
            "Lo0/h<",
            "TTContinuationResult;>;>;"
        }
    .end annotation
.end field

.field private final c:Lo0/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/f0<",
            "TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lo0/a;Lo0/f0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lo0/a<",
            "TTResult;",
            "Lo0/h<",
            "TTContinuationResult;>;>;",
            "Lo0/f0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/s;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo0/s;->b:Lo0/a;

    iput-object p3, p0, Lo0/s;->c:Lo0/f0;

    return-void
.end method

.method static bridge synthetic e(Lo0/s;)Lo0/a;
    .locals 0

    iget-object p0, p0, Lo0/s;->b:Lo0/a;

    return-object p0
.end method

.method static bridge synthetic f(Lo0/s;)Lo0/f0;
    .locals 0

    iget-object p0, p0, Lo0/s;->c:Lo0/f0;

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

    iget-object v0, p0, Lo0/s;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lo0/r;

    invoke-direct {v1, p0, p1}, Lo0/r;-><init>(Lo0/s;Lo0/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lo0/s;->c:Lo0/f0;

    invoke-virtual {v0}, Lo0/f0;->s()Z

    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lo0/s;->c:Lo0/f0;

    invoke-virtual {v0, p1}, Lo0/f0;->q(Ljava/lang/Exception;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lo0/s;->c:Lo0/f0;

    invoke-virtual {v0, p1}, Lo0/f0;->r(Ljava/lang/Object;)V

    return-void
.end method
