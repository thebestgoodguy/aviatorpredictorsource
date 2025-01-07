.class public final Lp1/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;

.field public static final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    sput-object v0, Lp1/p;->a:Ljava/util/concurrent/Executor;

    sget-object v0, Landroidx/window/layout/d;->e:Landroidx/window/layout/d;

    sput-object v0, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Lp1/a0;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Lp1/a0;-><init>(ILjava/util/concurrent/Executor;)V

    sput-object v0, Lp1/p;->c:Ljava/util/concurrent/Executor;

    return-void
.end method
