.class Lcom/my/newproject2/LoadingActivity$1$1;
.super Ljava/lang/Object;
.source "LoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/LoadingActivity$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/my/newproject2/LoadingActivity$1;


# direct methods
.method constructor <init>(Lcom/my/newproject2/LoadingActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/LoadingActivity$1$1;->this$1:Lcom/my/newproject2/LoadingActivity$1;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 82
    iget-object v0, p0, Lcom/my/newproject2/LoadingActivity$1$1;->this$1:Lcom/my/newproject2/LoadingActivity$1;

    invoke-static {v0}, Lcom/my/newproject2/LoadingActivity$1;->access$0(Lcom/my/newproject2/LoadingActivity$1;)Lcom/my/newproject2/LoadingActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/newproject2/LoadingActivity;->access$0(Lcom/my/newproject2/LoadingActivity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/newproject2/LoadingActivity$1$1;->this$1:Lcom/my/newproject2/LoadingActivity$1;

    invoke-static {v1}, Lcom/my/newproject2/LoadingActivity$1;->access$0(Lcom/my/newproject2/LoadingActivity$1;)Lcom/my/newproject2/LoadingActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/my/newproject2/LoadingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/newproject2/NiceActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 83
    iget-object v0, p0, Lcom/my/newproject2/LoadingActivity$1$1;->this$1:Lcom/my/newproject2/LoadingActivity$1;

    invoke-static {v0}, Lcom/my/newproject2/LoadingActivity$1;->access$0(Lcom/my/newproject2/LoadingActivity$1;)Lcom/my/newproject2/LoadingActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/my/newproject2/LoadingActivity$1$1;->this$1:Lcom/my/newproject2/LoadingActivity$1;

    invoke-static {v1}, Lcom/my/newproject2/LoadingActivity$1;->access$0(Lcom/my/newproject2/LoadingActivity$1;)Lcom/my/newproject2/LoadingActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/my/newproject2/LoadingActivity;->access$0(Lcom/my/newproject2/LoadingActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/my/newproject2/LoadingActivity;->startActivity(Landroid/content/Intent;)V

    .line 84
    return-void
.end method
