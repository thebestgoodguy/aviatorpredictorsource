.class Lcom/my/aviator/predictor/v8/bz;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/AviatorActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/bz;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/bz;)Lcom/my/aviator/predictor/v8/AviatorActivity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/bz;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/bz;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    new-instance v1, Lcom/my/aviator/predictor/v8/ca;

    invoke-direct {v1, p0}, Lcom/my/aviator/predictor/v8/ca;-><init>(Lcom/my/aviator/predictor/v8/bz;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
