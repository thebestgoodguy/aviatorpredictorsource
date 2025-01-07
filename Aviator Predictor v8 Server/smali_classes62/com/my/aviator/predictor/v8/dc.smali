.class Lcom/my/aviator/predictor/v8/dc;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/db;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/db;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dc;->a:Lcom/my/aviator/predictor/v8/db;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/dc;->a:Lcom/my/aviator/predictor/v8/db;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dc;->a:Lcom/my/aviator/predictor/v8/db;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    new-instance v1, Lcom/my/aviator/predictor/v8/dd;

    invoke-direct {v1, p0}, Lcom/my/aviator/predictor/v8/dd;-><init>(Lcom/my/aviator/predictor/v8/dc;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
