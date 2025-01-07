.class final Lo0/q;
.super Ljava/lang/Object;
.source ""

# interfaces
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
        "Lo0/b0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lo0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/a<",
            "TTResult;TTContinuationResult;>;"
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
            "TTResult;TTContinuationResult;>;",
            "Lo0/f0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/q;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo0/q;->b:Lo0/a;

    iput-object p3, p0, Lo0/q;->c:Lo0/f0;

    return-void
.end method

.method static bridge synthetic b(Lo0/q;)Lo0/a;
    .locals 0

    iget-object p0, p0, Lo0/q;->b:Lo0/a;

    return-object p0
.end method

.method static bridge synthetic c(Lo0/q;)Lo0/f0;
    .locals 0

    iget-object p0, p0, Lo0/q;->c:Lo0/f0;

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

    iget-object v0, p0, Lo0/q;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lo0/p;

    invoke-direct {v1, p0, p1}, Lo0/p;-><init>(Lo0/q;Lo0/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
