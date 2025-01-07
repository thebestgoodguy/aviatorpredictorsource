.class public final synthetic Lp1/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Ljava/util/concurrent/Callable;

.field public final synthetic f:Ljava/util/concurrent/Executor;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/d;->e:Ljava/util/concurrent/Callable;

    iput-object p2, p0, Lp1/d;->f:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lp1/d;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp1/d;->e:Ljava/util/concurrent/Callable;

    iget-object v1, p0, Lp1/d;->f:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lp1/d;->g:Lo0/i;

    invoke-static {v0, v1, v2}, Lp1/g;->c(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lo0/i;)V

    return-void
.end method
