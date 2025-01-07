.class Lcom/my/aviator/predictor/v8/dh;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dg;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dg;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dh;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/dh;)Lcom/my/aviator/predictor/v8/dg;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/dh;->a:Lcom/my/aviator/predictor/v8/dg;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dh;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v0

    new-instance v1, Lcom/my/aviator/predictor/v8/di;

    invoke-direct {v1, p0}, Lcom/my/aviator/predictor/v8/di;-><init>(Lcom/my/aviator/predictor/v8/dh;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
