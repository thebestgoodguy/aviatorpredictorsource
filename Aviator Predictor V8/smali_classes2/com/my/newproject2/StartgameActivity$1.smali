.class Lcom/my/newproject2/StartgameActivity$1;
.super Ljava/lang/Object;
.source "StartgameActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/StartgameActivity;->initialize(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/my/newproject2/StartgameActivity;


# direct methods
.method constructor <init>(Lcom/my/newproject2/StartgameActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 70
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-static {v0}, Lcom/my/newproject2/StartgameActivity;->access$0(Lcom/my/newproject2/StartgameActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#331Cheat#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-static {v0}, Lcom/my/newproject2/StartgameActivity;->access$1(Lcom/my/newproject2/StartgameActivity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-virtual {v1}, Lcom/my/newproject2/StartgameActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/newproject2/StarActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 72
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    iget-object v1, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-static {v1}, Lcom/my/newproject2/StartgameActivity;->access$1(Lcom/my/newproject2/StartgameActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/my/newproject2/StartgameActivity;->startActivity(Landroid/content/Intent;)V

    .line 73
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-virtual {v0}, Lcom/my/newproject2/StartgameActivity;->finish()V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-static {v0}, Lcom/my/newproject2/StartgameActivity;->access$0(Lcom/my/newproject2/StartgameActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#331Cheat#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity$1;->this$0:Lcom/my/newproject2/StartgameActivity;

    invoke-virtual {v0}, Lcom/my/newproject2/StartgameActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "INCORRECT ID"

    invoke-static {v0, v1}, Lcom/my/newproject2/SketchwareUtil;->showMessage(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    :cond_1
    return-void
.end method
