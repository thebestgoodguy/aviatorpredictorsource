.class Lcom/my/newproject2/HoopActivity$1$1;
.super Ljava/util/TimerTask;
.source "HoopActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/HoopActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/my/newproject2/HoopActivity$1;


# direct methods
.method constructor <init>(Lcom/my/newproject2/HoopActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/HoopActivity$1$1;->this$1:Lcom/my/newproject2/HoopActivity$1;

    .line 84
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/HoopActivity$1$1;)Lcom/my/newproject2/HoopActivity$1;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/my/newproject2/HoopActivity$1$1;->this$1:Lcom/my/newproject2/HoopActivity$1;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/my/newproject2/HoopActivity$1$1;->this$1:Lcom/my/newproject2/HoopActivity$1;

    invoke-static {v0}, Lcom/my/newproject2/HoopActivity$1;->access$0(Lcom/my/newproject2/HoopActivity$1;)Lcom/my/newproject2/HoopActivity;

    move-result-object v0

    new-instance v1, Lcom/my/newproject2/HoopActivity$1$1$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/HoopActivity$1$1$1;-><init>(Lcom/my/newproject2/HoopActivity$1$1;)V

    invoke-virtual {v0, v1}, Lcom/my/newproject2/HoopActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 94
    return-void
.end method
