.class Lcom/my/aviator/predictor/v8/di;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dh;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dh;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/di;->a:Lcom/my/aviator/predictor/v8/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/di;->a:Lcom/my/aviator/predictor/v8/dh;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dh;->a(Lcom/my/aviator/predictor/v8/dh;)Lcom/my/aviator/predictor/v8/dg;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetC(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/di;->a:Lcom/my/aviator/predictor/v8/dh;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dh;->a(Lcom/my/aviator/predictor/v8/dh;)Lcom/my/aviator/predictor/v8/dg;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/my/aviator/predictor/v8/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/di;->a:Lcom/my/aviator/predictor/v8/dh;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dh;->a(Lcom/my/aviator/predictor/v8/dh;)Lcom/my/aviator/predictor/v8/dg;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/di;->a:Lcom/my/aviator/predictor/v8/dh;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dh;->a(Lcom/my/aviator/predictor/v8/dh;)Lcom/my/aviator/predictor/v8/dg;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetC(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
