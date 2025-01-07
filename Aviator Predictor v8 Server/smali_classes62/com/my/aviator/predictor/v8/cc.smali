.class Lcom/my/aviator/predictor/v8/cc;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/cb;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/cb;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cc;->a:Lcom/my/aviator/predictor/v8/cb;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/cc;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/cc;)Lcom/my/aviator/predictor/v8/cb;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/cc;->a:Lcom/my/aviator/predictor/v8/cb;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cc;->a:Lcom/my/aviator/predictor/v8/cb;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cb;->a(Lcom/my/aviator/predictor/v8/cb;)Lcom/my/aviator/predictor/v8/AviatorActivity;

    move-result-object v0

    new-instance v1, Lcom/my/aviator/predictor/v8/cd;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cc;->b:Landroid/view/View;

    invoke-direct {v1, p0, v2}, Lcom/my/aviator/predictor/v8/cd;-><init>(Lcom/my/aviator/predictor/v8/cc;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
