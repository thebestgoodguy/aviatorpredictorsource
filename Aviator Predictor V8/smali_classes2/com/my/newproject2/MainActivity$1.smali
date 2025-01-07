.class Lcom/my/newproject2/MainActivity$1;
.super Ljava/util/TimerTask;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/my/newproject2/MainActivity;->initializeLogic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/my/newproject2/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/newproject2/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/my/newproject2/MainActivity$1;->this$0:Lcom/my/newproject2/MainActivity;

    .line 76
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/MainActivity$1;)Lcom/my/newproject2/MainActivity;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/my/newproject2/MainActivity$1;->this$0:Lcom/my/newproject2/MainActivity;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/my/newproject2/MainActivity$1;->this$0:Lcom/my/newproject2/MainActivity;

    new-instance v1, Lcom/my/newproject2/MainActivity$1$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/MainActivity$1$1;-><init>(Lcom/my/newproject2/MainActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/my/newproject2/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 86
    return-void
.end method
