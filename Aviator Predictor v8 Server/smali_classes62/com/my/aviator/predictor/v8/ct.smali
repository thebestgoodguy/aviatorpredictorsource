.class Lcom/my/aviator/predictor/v8/ct;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/cs;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/cs;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/ct;->a:Lcom/my/aviator/predictor/v8/cs;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/ct;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/ct;)Lcom/my/aviator/predictor/v8/cs;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/ct;->a:Lcom/my/aviator/predictor/v8/cs;

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/ct;->a:Lcom/my/aviator/predictor/v8/cs;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v0

    new-instance v1, Lcom/my/aviator/predictor/v8/cu;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/ct;->b:Landroid/view/View;

    invoke-direct {v1, p0, v2}, Lcom/my/aviator/predictor/v8/cu;-><init>(Lcom/my/aviator/predictor/v8/ct;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
