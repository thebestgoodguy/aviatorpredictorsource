.class Lcom/my/newproject2/ChooseActivity$1;
.super Ljava/lang/Object;
.source "ChooseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/ChooseActivity;->initialize(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/my/newproject2/ChooseActivity;


# direct methods
.method constructor <init>(Lcom/my/newproject2/ChooseActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/ChooseActivity$1;)Lcom/my/newproject2/ChooseActivity;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 64
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    const-string v1, "Signal Loading"

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    const-string v1, "Please wait..."

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 65
    iget-object v0, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    new-instance v1, Lcom/my/newproject2/ChooseActivity$1$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/ChooseActivity$1$1;-><init>(Lcom/my/newproject2/ChooseActivity$1;)V

    invoke-static {v0, v1}, Lcom/my/newproject2/ChooseActivity;->access$1(Lcom/my/newproject2/ChooseActivity;Ljava/util/TimerTask;)V

    .line 77
    iget-object v0, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    invoke-static {v0}, Lcom/my/newproject2/ChooseActivity;->access$2(Lcom/my/newproject2/ChooseActivity;)Ljava/util/Timer;

    move-result-object v0

    iget-object v1, p0, Lcom/my/newproject2/ChooseActivity$1;->this$0:Lcom/my/newproject2/ChooseActivity;

    invoke-static {v1}, Lcom/my/newproject2/ChooseActivity;->access$3(Lcom/my/newproject2/ChooseActivity;)Ljava/util/TimerTask;

    move-result-object v1

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 78
    return-void
.end method
