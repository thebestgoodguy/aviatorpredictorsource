.class Lcom/my/aviator/predictor/v8/cq;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/GoogleActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/GoogleActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cq;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/cq;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cq;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    new-instance v1, Lcom/my/aviator/predictor/v8/cr;

    invoke-direct {v1, p0}, Lcom/my/aviator/predictor/v8/cr;-><init>(Lcom/my/aviator/predictor/v8/cq;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
