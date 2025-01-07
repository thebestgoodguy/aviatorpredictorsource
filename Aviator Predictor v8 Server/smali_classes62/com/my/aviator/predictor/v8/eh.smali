.class public Lcom/my/aviator/predictor/v8/eh;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/lang/Thread;

.field private static volatile b:Z


# direct methods
.method static bridge synthetic -$$Nest$sfgetb()Z
    .locals 1

    sget-boolean v0, Lcom/my/aviator/predictor/v8/eh;->b:Z

    return v0
.end method

.method static bridge synthetic -$$Nest$sfputb(Z)V
    .locals 0

    sput-boolean p0, Lcom/my/aviator/predictor/v8/eh;->b:Z

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/my/aviator/predictor/v8/ei;

    invoke-direct {v0}, Lcom/my/aviator/predictor/v8/ei;-><init>()V

    sput-object v0, Lcom/my/aviator/predictor/v8/eh;->a:Ljava/lang/Thread;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/my/aviator/predictor/v8/eh;->b:Z

    return-void
.end method

.method public static a()V
    .locals 2

    sget-boolean v0, Lcom/my/aviator/predictor/v8/eh;->b:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/my/aviator/predictor/v8/eh;->a:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Logger already running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/my/aviator/predictor/v8/SketchApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.sketchware.remod.ACTION_NEW_DEBUG_LOG"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "log"

    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "packageName"

    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
