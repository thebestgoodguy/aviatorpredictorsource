.class Lcom/my/newproject2/PasswordActivity$1;
.super Ljava/util/TimerTask;
.source "PasswordActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/PasswordActivity;->initializeLogic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/my/newproject2/PasswordActivity;


# direct methods
.method constructor <init>(Lcom/my/newproject2/PasswordActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/PasswordActivity$1;->this$0:Lcom/my/newproject2/PasswordActivity;

    .line 69
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/PasswordActivity$1;)Lcom/my/newproject2/PasswordActivity;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/my/newproject2/PasswordActivity$1;->this$0:Lcom/my/newproject2/PasswordActivity;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/my/newproject2/PasswordActivity$1;->this$0:Lcom/my/newproject2/PasswordActivity;

    new-instance v1, Lcom/my/newproject2/PasswordActivity$1$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/PasswordActivity$1$1;-><init>(Lcom/my/newproject2/PasswordActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/my/newproject2/PasswordActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 79
    return-void
.end method
