.class Lcom/my/aviator/predictor/v8/eg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/SketchApplication;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/SketchApplication;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/eg;->a:Lcom/my/aviator/predictor/v8/SketchApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 5

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/eg;->a:Lcom/my/aviator/predictor/v8/SketchApplication;

    invoke-virtual {v1}, Lcom/my/aviator/predictor/v8/SketchApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/aviator/predictor/v8/DebugActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x8000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "error"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/eg;->a:Lcom/my/aviator/predictor/v8/SketchApplication;

    invoke-virtual {v1}, Lcom/my/aviator/predictor/v8/SketchApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x2b67

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/eg;->a:Lcom/my/aviator/predictor/v8/SketchApplication;

    const-string v2, "alarm"

    invoke-virtual {v1, v2}, Lcom/my/aviator/predictor/v8/SketchApplication;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    const/4 v2, 0x2

    const-wide/16 v3, 0x3e8

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    invoke-static {p2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/eh;->a(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/eg;->a:Lcom/my/aviator/predictor/v8/SketchApplication;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/SketchApplication;->-$$Nest$fgetb(Lcom/my/aviator/predictor/v8/SketchApplication;)Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
