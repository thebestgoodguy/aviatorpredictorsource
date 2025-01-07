.class Lcom/my/aviator/predictor/v8/cr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/cq;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/cq;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cq;->a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeth(Lcom/my/aviator/predictor/v8/GoogleActivity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/cq;->a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cq;->a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/cq;->a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeth(Lcom/my/aviator/predictor/v8/GoogleActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cr;->a:Lcom/my/aviator/predictor/v8/cq;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cq;->a(Lcom/my/aviator/predictor/v8/cq;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->finish()V

    return-void
.end method
