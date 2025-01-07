.class Lcom/my/newproject2/NiceActivity$1;
.super Ljava/util/TimerTask;
.source "NiceActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/NiceActivity;->initializeLogic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/my/newproject2/NiceActivity;


# direct methods
.method constructor <init>(Lcom/my/newproject2/NiceActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/NiceActivity$1;->this$0:Lcom/my/newproject2/NiceActivity;

    .line 67
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/NiceActivity$1;)Lcom/my/newproject2/NiceActivity;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/my/newproject2/NiceActivity$1;->this$0:Lcom/my/newproject2/NiceActivity;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/my/newproject2/NiceActivity$1;->this$0:Lcom/my/newproject2/NiceActivity;

    new-instance v1, Lcom/my/newproject2/NiceActivity$1$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/NiceActivity$1$1;-><init>(Lcom/my/newproject2/NiceActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/my/newproject2/NiceActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 77
    return-void
.end method
