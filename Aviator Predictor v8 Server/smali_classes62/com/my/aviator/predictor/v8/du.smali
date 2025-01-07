.class Lcom/my/aviator/predictor/v8/du;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dr;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dr;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/du;->a:Lcom/my/aviator/predictor/v8/dr;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/du;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/du;)Lcom/my/aviator/predictor/v8/dr;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/du;->a:Lcom/my/aviator/predictor/v8/dr;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/du;->a:Lcom/my/aviator/predictor/v8/dr;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v0

    new-instance v1, Lcom/my/aviator/predictor/v8/dv;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/du;->b:Landroid/view/View;

    invoke-direct {v1, p0, v2}, Lcom/my/aviator/predictor/v8/dv;-><init>(Lcom/my/aviator/predictor/v8/du;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
