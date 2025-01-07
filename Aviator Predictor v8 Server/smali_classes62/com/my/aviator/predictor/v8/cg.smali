.class Lcom/my/aviator/predictor/v8/cg;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/AviatorActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cg;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cg;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgett(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cg;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-virtual {v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/my/aviator/predictor/v8/QoidalarActivity;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cg;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgett(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
