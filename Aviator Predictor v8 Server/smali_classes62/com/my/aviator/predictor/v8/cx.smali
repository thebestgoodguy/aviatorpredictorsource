.class Lcom/my/aviator/predictor/v8/cx;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/IbooActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/IbooActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cx;->a:Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cx;->a:Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->-$$Nest$fgetj(Lcom/my/aviator/predictor/v8/IbooActivity;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cx;->a:Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-virtual {v0}, Lcom/my/aviator/predictor/v8/IbooActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cx;->a:Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->-$$Nest$fgetj(Lcom/my/aviator/predictor/v8/IbooActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/my/aviator/predictor/v8/IbooActivity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cx;->a:Lcom/my/aviator/predictor/v8/IbooActivity;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->finish()V

    return-void
.end method
